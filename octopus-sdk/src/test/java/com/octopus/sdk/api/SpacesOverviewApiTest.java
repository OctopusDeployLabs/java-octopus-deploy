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
import static com.octopus.sdk.support.TestHelpers.rootDocWithLinks;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.SpaceOverview;
import com.octopus.sdk.model.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.support.TestHelpers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;

class SpacesOverviewApiTest {

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
  public void canDecodeAnEmptyResponseWhenSearchingByPartialNameMatch() throws IOException {
    final String SPACE_NAME = "ArbitraryName";
    final SpaceOverviewPaginatedCollection returnedObject =
        new SpaceOverviewPaginatedCollection(emptyMap(), 0, 30, 1, 0, emptyList());
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedObject)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final List<SpaceOverview> matchedSpaces = spacesOverviewApi.getByPartialName(SPACE_NAME);
    assertThat(matchedSpaces).isNotNull();
    assertThat(matchedSpaces).isEmpty();
  }

  @Test
  public void exactMatchNameReturnsASingleItem() throws IOException {
    final String SPACE_NAME = "ArbitraryName";
    final SpaceOverview toReturn = new SpaceOverview();
    toReturn.setName(SPACE_NAME);

    final SpaceOverviewPaginatedCollection returnedCollection =
        new SpaceOverviewPaginatedCollection(emptyMap(), 1, 30, 1, 0, singletonList(toReturn));
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedCollection)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverview> matchedSpace = spacesOverviewApi.getByName(SPACE_NAME);
    assertThat(matchedSpace).isNotEmpty();
    assertThat(matchedSpace.get().getName()).isEqualTo(SPACE_NAME);
  }

  @Test
  public void noMatchingSpacesWithNameReturnsOptionalEmpty() throws IOException {
    final SpaceOverviewPaginatedCollection returnedObject =
        new SpaceOverviewPaginatedCollection(emptyMap(), 0, 30, 1, 0, emptyList());
    mockOctopusServer
        .when(request().withPath("/api/spaces"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedObject)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverview> matchedSpace = spacesOverviewApi.getByName("NotCorrectName");
    assertThat(matchedSpace).isEmpty();
  }

  @Test
  public void canFindSpaceContainingWhoseNameContainsASpace() throws IOException {
    final String SPACE_NAME = "Arbitrary Name With Spaces";
    final SpaceOverview toReturn = new SpaceOverview();
    toReturn.setName(SPACE_NAME);

    final SpaceOverviewPaginatedCollection returnedCollection =
        new SpaceOverviewPaginatedCollection(emptyMap(), 1, 30, 1, 0, singletonList(toReturn));
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedCollection)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverview> matchedSpace = spacesOverviewApi.getByName(SPACE_NAME);
    assertThat(matchedSpace).isNotEmpty();
    assertThat(matchedSpace.get().getName()).isEqualTo(SPACE_NAME);
  }

  @Test
  public void requestSpaceWhenOctopusDoesntSupportSpacesThrowsIllegalStateException() {
    // Create OctopusClient _without_ the 'spaces' hypermedia link
    client = new OctopusClient(serverURL, rootDocWithLinks(emptyMap()));
    assertThatThrownBy(() -> SpacesOverviewApi.create(client))
        .isInstanceOf(IllegalArgumentException.class);
  }
}