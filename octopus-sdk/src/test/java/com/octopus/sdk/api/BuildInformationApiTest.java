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

import static com.octopus.sdk.support.TestHelpers.defaultRootDoc;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.support.TestHelpers;

import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

class BuildInformationApiTest {

  private URL serverURL;
  private OctopusClient client;
  private final Gson gson = new GsonBuilder().create();

  private ClientAndServer mockOctopusServer;

  @BeforeEach
  public void setup() {
    mockOctopusServer = new ClientAndServer();
    serverURL = TestHelpers.createLocalhostOctopusServerUrl(mockOctopusServer.getPort());
    client = new OctopusClient(serverURL, defaultRootDoc());
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(response().withStatusCode(200).withBody("NOT YET " + "POPULATED"));
  }

  @Test
  public void updatingBuildInformationThrowsUnsupportedException() {
    final SpaceHome spaceHome =
        new SpaceHome(
            Map.of(
                "BuildInformation",
                "/api/Spaces-1/build-information{/id}{?packageId,filter,latest,skip,take,overwriteMode}"));

    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    assertThatThrownBy(() -> buildInfoApi.update(null))
        .isInstanceOf(UnsupportedOperationException.class);
  }
}
