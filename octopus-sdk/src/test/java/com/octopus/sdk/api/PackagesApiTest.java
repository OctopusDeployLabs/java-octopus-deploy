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
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.packages.PackageResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.support.TestHelpers;

import java.net.URL;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

class PackagesApiTest {

  private URL serverURL;
  private OctopusClient client;
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
  public void standardCreateFunctionThrowsUnsupportedException() {
    final SpaceHome spaceHome =
        new SpaceHome(
            new HashMap<String, String>() {
              {
                put("Packages", "api/arbitrary-path");
                put("PackageUPload", "api/upload-path");
              }
            });
    final PackagesApi api = PackagesApi.create(client, spaceHome);

    assertThatThrownBy(() -> api.create(new PackageResourceWithLinks()))
        .isInstanceOf(UnsupportedOperationException.class);
  }

  @Test
  public void standardUpdateFunctionThrowsUnsupportedException() {
    final SpaceHome spaceHome =
        new SpaceHome(
            new HashMap<String, String>() {
              {
                put("Packages", "api/arbitrary-path");
                put("PackageUPload", "api/upload-path");
              }
            });
    final PackagesApi api = PackagesApi.create(client, spaceHome);

    assertThatThrownBy(() -> api.update(new PackageResourceWithLinks()))
        .isInstanceOf(UnsupportedOperationException.class);
  }
}
