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

import com.octopus.sdk.api.ApiKeyApi;
import com.octopus.sdk.api.LicenseApi;
import com.octopus.sdk.api.UserApi;
import com.octopus.sdk.http.InMemoryCookieJar;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.user.UserResourceWithLinks;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;

import okhttp3.OkHttpClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

public class DockerisedOctopusDeployServer implements OctopusDeployServer {

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

  public DockerisedOctopusDeployServer(
      final GenericContainer<?> msSqlContainer,
      final GenericContainer<?> octopusDeployServerContainer,
      final String apiKey) {
    this.msSqlContainer = msSqlContainer;
    this.octopusDeployServerContainer = octopusDeployServerContainer;
    this.apiKey = apiKey;
  }

  @Override
  public void close() {
    if (msSqlContainer.isRunning()) {
      msSqlContainer.stop();
    }

    if (octopusDeployServerContainer.isRunning()) {
      octopusDeployServerContainer.stop();
    }
  }

  @Override
  public String getOctopusUrl() {
    return generateOctopusServerUrl(octopusDeployServerContainer);
  }

  @Override
  public String getApiKey() {
    return apiKey;
  }

  @Override
  public int getPort() {
    return octopusDeployServerContainer.getFirstMappedPort();
  }

  public static DockerisedOctopusDeployServer createOctopusServer() throws IOException {

    final Network network = Network.newNetwork();
    final GenericContainer<?> msSqlContainer =
        new GenericContainer<>(DockerImageName.parse(MS_SQL_IMAGE))
            .withExposedPorts(1433)
            .withNetworkAliases(MS_SQL_CONTAINER_NETWORK_ALIAS)
            .withNetwork(network)
            .withEnv("SA_PASSWORD", SA_PASSWORD)
            .withEnv("MSSQL_TCP_PORT", Integer.toString(MS_SQL_PORT))
            .withEnv("ACCEPT_EULA", "Y")
            .withEnv("MSSQL_PID", "Developer")
            .waitingFor(
                Wait.forLogMessage(".*SQL Server is now ready for client connections.*", 1));
    msSqlContainer.start();

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
            .withStartupTimeout(Duration.ofMinutes(5))
            .waitingFor(Wait.forLogMessage(".*Web server is ready to process requests.*", 1));

    try {
      octopusDeployServerContainer.start();

      final String octopusServerUrlString = generateOctopusServerUrl(octopusDeployServerContainer);
      LOG.info("Launching Octopus Server on {}}", octopusServerUrlString);

      final OkHttpClient httpClient =
          new OkHttpClient.Builder().cookieJar(new InMemoryCookieJar()).build();
      final OctopusClient client = new OctopusClient(httpClient, new URL(octopusServerUrlString));
      client.login(OCTOPUS_SERVER_USERNAME, OCTOPUS_DEPLOY_SERVER_PASSWORD);
      final String apiKey = createApiKeyForCurrentUser(client);
      installLicense(client);

      return new DockerisedOctopusDeployServer(
          msSqlContainer, octopusDeployServerContainer, apiKey);
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
    final UserApi users = UserApi.create(client);
    final UserResourceWithLinks currentUserResource = users.getCurrentUser();
    final ApiKeyApi apiKeyApi = ApiKeyApi.create(client, currentUserResource);
    return apiKeyApi
        .createApiKeyForUser("For Testing", Instant.now().plus(Duration.ofDays(1)))
        .getApiKey();
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
