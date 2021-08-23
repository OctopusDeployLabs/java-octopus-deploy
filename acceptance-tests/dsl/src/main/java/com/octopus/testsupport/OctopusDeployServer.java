/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.testsupport;

import com.octopus.sdk.api.LicenseApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.users.User;
import okhttp3.OkHttpClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.utility.DockerImageName;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;

public class OctopusDeployServer {

  private static final Logger LOG = LogManager.getLogger();
  private static final String OCTOPUS_SERVER_LICENSE_TEXT_ENV_VAR = "OCTOPUS_LICENSE";

  public static final String OCTOPUS_SERVER_IMAGE =
      "docker.packages.octopushq.com/octopusdeploy/octopusdeploy";
  public static final String MS_SQL_IMAGE = "mcr.microsoft.com/mssql/server";
  public static final String MS_SQL_CONTAINER_NETWORK_ALIAS = "sql-server";

  public static final String SA_PASSWORD = "Password01!";
  public static final int MS_SQL_PORT = 1433;

  public static final int OCTOPUS_SERVER_DEPLOY_PORT = 8080;
  public static final String OCTOPUS_SERVER_USERNAME = "admin";
  public static final String OCTOPUS_DEPLOY_SERVER_PASSWORD = "Password01!";

  private final GenericContainer<?> msSqlContainer;
  private final GenericContainer<?> octopusDeployServerContainer;
  private final String apiKey;

  public OctopusDeployServer(
      final GenericContainer<?> msSqlContainer,
      final GenericContainer<?> octopusDeployServerContainer,
      final String apiKey) {
    this.msSqlContainer = msSqlContainer;
    this.octopusDeployServerContainer = octopusDeployServerContainer;
    this.apiKey = apiKey;
  }

  public void tearDown() {
    if (msSqlContainer.isRunning()) {
      msSqlContainer.stop();
    }

    if (octopusDeployServerContainer.isRunning()) {
      octopusDeployServerContainer.stop();
    }
  }

  public String getOctopusUrl() {
    return generateOctopusServerUrl(octopusDeployServerContainer);
  }

  public String getApiKey() {
    return apiKey;
  }

  public static OctopusDeployServer createOctopusServer() throws IOException, InterruptedException {

    LOG.info("Starting containers");
    final Instant containerStartTime = Instant.now();
    final Network network = Network.newNetwork();
    final GenericContainer<?> msSqlContainer =
        new GenericContainer<>(DockerImageName.parse(MS_SQL_IMAGE))
            .withExposedPorts(1433)
            .withNetworkAliases(MS_SQL_CONTAINER_NETWORK_ALIAS)
            .withNetwork(network)
            .withEnv("SA_PASSWORD", SA_PASSWORD)
            .withEnv("MSSQL_TCP_PORT", Integer.toString(MS_SQL_PORT))
            .withEnv("ACCEPT_EULA", "Y")
            .withEnv("MSSQL_PID", "Developer");
            //.waitingFor(
            //    Wait.forLogMessage(".*SQL Server is now ready for client connections.*", 1));
    LOG.info("MS Sql container: launching");
    msSqlContainer.start();
    LOG.info("MS Sql container: startup complete");

    final StringBuilder connectionStringBuilder = new StringBuilder();
    connectionStringBuilder
        .append("Server=")
        .append(msSqlContainer.getNetworkAliases().get(0))
        .append(",")
        .append(MS_SQL_PORT)
        .append(";")
        .append("Database=OctopusDeploy;")
        .append("User=sa;")
        .append("Password=")
        .append(SA_PASSWORD);

    final GenericContainer<?> octopusDeployServerContainer =
        new GenericContainer<>(DockerImageName.parse(OCTOPUS_SERVER_IMAGE))
            .withExposedPorts(OCTOPUS_SERVER_DEPLOY_PORT)
            .withNetwork(network)
            .withNetworkAliases("OCTOPUS_SERVER")
            .withEnv("ACCEPT_EULA", "Y")
            .withEnv("ADMIN_USERNAME", "admin")
            .withEnv("ADMIN_PASSWORD", OCTOPUS_DEPLOY_SERVER_PASSWORD)
            .withEnv("ADMIN_EMAIL", "octopusJavaSdkTest@octopus.com")
            .withEnv("DB_CONNECTION_STRING", connectionStringBuilder.toString())
            .withStartupTimeout(Duration.ofMinutes(2));
            //.waitingFor(Wait.forLogMessage(".*Web server is ready to process requests.*", 1));

    try {
      LOG.info("Octopus Server container: launching");
      octopusDeployServerContainer.start();
      LOG.info("Octopus Server container: started");

      final String octopusServerUrlString = generateOctopusServerUrl(octopusDeployServerContainer);
      LOG.info("Launching Octopus Server on {}}", octopusServerUrlString);

      final OkHttpClient httpClient = new OkHttpClient();
      final URL octopusServerUrl = new URL(octopusServerUrlString);
      final Instant startTime = Instant.now();
      RootDocument rootDoc = null;
      LOG.info("Waiting for rootDoc to be available");
      while(Duration.between(Instant.now(), startTime).compareTo(Duration.ofSeconds(30)) <= 0) {
        try {
          rootDoc = OctopusClientFactory.fetchRootDocument(httpClient, octopusServerUrl);
          break;
        } catch (final Throwable t) {
          LOG.info("Failed to connect - waiting 1 second ({})", t.toString());
          Thread.sleep(1000);
        }
      }

      if(rootDoc == null) {
        throw new RuntimeException("OctopusServer failed to come up in time");
      }

      LOG.info("Rootdoc retrieved, adding API Key");
      final OctopusClient client = new OctopusClient(new URL(octopusServerUrlString), rootDoc);
      client.login(OCTOPUS_SERVER_USERNAME, OCTOPUS_DEPLOY_SERVER_PASSWORD);
      final String apiKey = createApiKeyForCurrentUser(client);
      LOG.info("API Key = {}", apiKey);
      LOG.info("Installing License");
      installLicense(client);

      final Duration timeToStart = Duration.between(containerStartTime, Instant.now());
      System.out.println("Time to startup Containers = " + timeToStart.getSeconds());

      LOG.info("Completed container startup");
      return new OctopusDeployServer(msSqlContainer, octopusDeployServerContainer, apiKey);
    } catch (final Exception e) {
      msSqlContainer.stop();
      octopusDeployServerContainer.stop();
      throw e;
    }
  }

  private static String generateOctopusServerUrl(final GenericContainer<?> octopusServerContainer) {
    final String OCTOPUS_SERVER_URL_TEMPLATE = "http://%s:%d";
    return String.format(
        OCTOPUS_SERVER_URL_TEMPLATE,
        octopusServerContainer.getHost(),
        octopusServerContainer.getFirstMappedPort());
  }

  public static String createApiKeyForCurrentUser(final OctopusClient client) throws IOException {
    final UsersApi users = UsersApi.create(client);
    final User currentUser = users.getCurrentUser();
    return users.createApiKeyForUser(
        currentUser, "For Testing", Instant.now().plus(Duration.ofDays(1)));
  }

  public static void installLicense(final OctopusClient client) throws IOException {

    final String licenseText = System.getenv(OCTOPUS_SERVER_LICENSE_TEXT_ENV_VAR);
    if (licenseText == null) {
      throw new IllegalStateException(
          OCTOPUS_SERVER_LICENSE_TEXT_ENV_VAR
              + " env var was not set, therefore license "
              + "cannot be added to the Octopus server, which prevents tests being executed");
    }
    final LicenseApi licenseApi = new LicenseApi(client);
    licenseApi.insertLicense(licenseText);
  }
}
