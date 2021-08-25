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

package com.octopus.sdk.test;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceOverviewResource;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;

public class SpacesOverviewAcceptanceTest extends BaseAcceptanceTest {

  @Test
  public void throwsHttpExceptionIndicatingNotAuthorisedIfIncorrectApiKey()
      throws MalformedURLException {
    final OctopusClient client = new OctopusClient(httpClient, new URL(serverURL), "BadyKey");
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Throwable thrown = catchThrowable(() -> spacesOverviewApi.getByName("Arbitrary"));
    assertThat(thrown).isInstanceOf(HttpException.class);
    final HttpException httpException = (HttpException) thrown;
    assertThat(httpException.getStatusCode()).isEqualTo(401);
  }

  @Test
  public void returnsOptionalEmptyIfNoSpaceWithRequestedNameIsSelected() throws IOException {
    final OctopusClient client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> requestedSpace =
        spacesOverviewApi.getByName("NonExistentSpace");

    assertThat(requestedSpace).isEmpty();
  }

  @Test
  public void aSpaceCanBeCreatedAndReturnedByNameAndThenDeleted() throws IOException {
    final String spaceName = "TheTestSpace";
    final OctopusClient client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    assertThat(spacesOverviewApi.getByName(spaceName)).isEmpty();

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName(spaceName);
    toCreate.setSpaceManagersTeamMembers(Sets.newLinkedHashSet(users.getCurrentUser().getId()));

    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);

    try {
      assertThat(createdSpace).isNotNull();
      assertThat(createdSpace.getName()).isEqualTo(spaceName);
      assertThat(createdSpace.getSpaceManagersTeamMembers())
          .containsExactly(users.getCurrentUser().getId());

      createdSpace.setTaskQueueStopped(true);
      final SpaceOverviewResource modifiedSpace = spacesOverviewApi.update(createdSpace);
      assertThat(modifiedSpace.getTaskQueueStopped()).isTrue();

    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }

  @Test
  public void correctlyReturnsAllResultsRegardlessOfPaginationSize() throws IOException {
    final OctopusClient client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final List<SpaceOverviewWithLinks> spacesCreated = Lists.newArrayList();
    try {
      for (int i = 0; i < 10; i++) {
        final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
        toCreate.setName(String.format("Space%d", i));
        toCreate.setSpaceManagersTeamMembers(Sets.newLinkedHashSet(users.getCurrentUser().getId()));

        spacesCreated.add(spacesOverviewApi.create(toCreate));
      }

      final List<String> createdSpaceNames =
          spacesCreated.stream().map(SpaceOverviewResource::getName).collect(Collectors.toList());

      // ensure all 10 spaces are reported, regardless of pagesize.
      for (int pageSize = 1; pageSize < 4; pageSize++) {
        final Map<String, List<String>> queryParams = new HashMap<>();
        queryParams.put("take", singletonList(Integer.toString(pageSize)));
        final List<SpaceOverviewWithLinks> spaces = spacesOverviewApi.getByQuery(queryParams);
        final List<String> spaceNamesFound =
            spaces.stream().map(SpaceOverviewResource::getName).collect(Collectors.toList());
        assertThat(spaceNamesFound).containsAll(createdSpaceNames);
      }
    } finally {
      for (SpaceOverviewWithLinks space : spacesCreated) {
        try {
          deleteSpaceValidly(spacesOverviewApi, space);
        } catch (final Exception e) {
          System.out.println("Failed to delete a space" + e);
        }
      }
    }
  }

  @Test
  public void createSpaceWithEmptyName() throws IOException {
    final String spaceName = "NotEmpty";
    final OctopusClient client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    assertThat(spacesOverviewApi.getByName(spaceName)).isEmpty();

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName(spaceName);
    toCreate.setSpaceManagersTeamMembers(Sets.newLinkedHashSet(users.getCurrentUser().getId()));

    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);

    createdSpace.setName("");
    spacesOverviewApi.update(createdSpace);
  }
}
