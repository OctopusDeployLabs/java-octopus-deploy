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

import static com.octopus.sdk.support.TestHelpers.rootDocWithLinks;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.spaces.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

class SpacesOverviewApiTest extends BaseApiTest {

  @Test
  public void canDecodeAnEmptyResponseWhenSearchingByPartialNameMatch() throws IOException {
    final String SPACE_NAME = "ArbitraryName";
    final SpaceOverviewPaginatedCollection returnedObject =
        new SpaceOverviewPaginatedCollection(emptyMap(), 0, 30, 1, 0, emptyList());
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedObject)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final List<SpaceOverviewWithLinks> matchedSpaces =
        spacesOverviewApi.getByPartialName(SPACE_NAME);
    assertThat(matchedSpaces).isNotNull();
    assertThat(matchedSpaces).isEmpty();
  }

  @Test
  public void exactMatchNameReturnsASingleItem() throws IOException {
    final String SPACE_NAME = "ArbitraryName";
    final SpaceOverviewWithLinks toReturn = new SpaceOverviewWithLinks();
    toReturn.setName(SPACE_NAME);

    final SpaceOverviewPaginatedCollection returnedCollection =
        new SpaceOverviewPaginatedCollection(emptyMap(), 1, 30, 1, 0, singletonList(toReturn));
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedCollection)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> matchedSpace = spacesOverviewApi.getByName(SPACE_NAME);
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
    final Optional<SpaceOverviewWithLinks> matchedSpace =
        spacesOverviewApi.getByName("NotCorrectName");
    assertThat(matchedSpace).isEmpty();
  }

  @Test
  public void canFindSpaceContainingWhoseNameContainsASpace() throws IOException {
    final String SPACE_NAME = "Arbitrary Name With Spaces";
    final SpaceOverviewWithLinks toReturn = new SpaceOverviewWithLinks();
    toReturn.setName(SPACE_NAME);

    final SpaceOverviewPaginatedCollection returnedCollection =
        new SpaceOverviewPaginatedCollection(emptyMap(), 1, 30, 1, 0, singletonList(toReturn));
    mockOctopusServer
        .when(request().withPath("/api/spaces").withQueryStringParameter("partialName", SPACE_NAME))
        .respond(response().withStatusCode(200).withBody(gson.toJson(returnedCollection)));

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> matchedSpace = spacesOverviewApi.getByName(SPACE_NAME);
    assertThat(matchedSpace).isNotEmpty();
    assertThat(matchedSpace.get().getName()).isEqualTo(SPACE_NAME);
  }

  @Test
  public void requestSpaceWhenOctopusDoesntSupportSpacesThrowsIllegalStateException() {
    client = new OctopusClient(new OkHttpClient(), client.getServerUrl());

    final RootDocument rootDoc = rootDocWithLinks(emptyMap());
    mockOctopusServer.clear(request().withPath("/api")); // remove existing expectation
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(rootDoc)));

    assertThatThrownBy(() -> SpacesOverviewApi.create(client))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
