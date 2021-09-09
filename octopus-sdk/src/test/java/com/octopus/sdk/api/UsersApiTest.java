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

package com.octopus.sdk.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.support.TestHelpers;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

import java.net.URL;

import static com.octopus.sdk.support.TestHelpers.defaultRootDoc;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

class UsersApiTest {

  private URL serverUrl;
  private OctopusClient client;
  private final Gson gson = new GsonBuilder().create();
  private ClientAndServer mockOctopusServer;

  @BeforeEach
  public void setup() {
    mockOctopusServer = new ClientAndServer();
    serverUrl = TestHelpers.createLocalhostOctopusServerUrl(mockOctopusServer.getPort());
    client = new OctopusClient(new OkHttpClient(), serverUrl);
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(defaultRootDoc())));
  }

  @Test
  public void canQueryForUsers() {

  }

  @Test
  public void canReturnCurrentUser() {

  }

}
