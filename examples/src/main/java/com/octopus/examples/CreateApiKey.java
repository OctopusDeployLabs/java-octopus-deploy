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

package com.octopus.examples;

import com.octopus.sdk.Repository;
import com.octopus.sdk.api.ApiKeyApi;
import com.octopus.sdk.domain.User;
import com.octopus.sdk.http.ConnectData;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.model.apikey.ApiKeyCreatedResource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Clock;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class CreateApiKey {

  static final String octopusServerUrl = "http://localhost:8065";
  // as read from your profile in your Octopus Deploy server
  static final String apiKey = System.getenv("OCTOPUS_SERVER_API_KEY");

  public static void main(final String... args) throws IOException {
    final OctopusClient client = createClient();
    final Repository repo = new Repository(client);

    final User theUser = repo.users().getCurrentUser();

    final ApiKeyApi apiKeyApi = ApiKeyApi.create(client, theUser.getProperties());
    final ApiKeyCreatedResource apiKey =
        apiKeyApi.addApiKey(
            "For Use In testing",
            OffsetDateTime.now(Clock.system(ZoneId.systemDefault())).plus(Duration.ofDays(365)));

    // Api keys should not be logged to output in production systems
    System.out.println("The Key is " + apiKey.getApiKey());
  }

  // Create an authenticated connection to your Octopus Deploy Server
  private static OctopusClient createClient() throws MalformedURLException {
    final Duration connectTimeout = Duration.ofSeconds(10L);
    final ConnectData connectData =
        new ConnectData(new URL(octopusServerUrl), apiKey, connectTimeout);
    final OctopusClient client = OctopusClientFactory.createClient(connectData);

    return client;
  }
}
