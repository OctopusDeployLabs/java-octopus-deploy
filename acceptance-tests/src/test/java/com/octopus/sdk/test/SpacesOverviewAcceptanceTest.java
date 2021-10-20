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
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.octopus.sdk.api.SpaceOverviewApi;
import com.octopus.sdk.api.UserApi;
import com.octopus.sdk.exceptions.OctopusServerException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceOverviewResource;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.testsupport.BaseOctopusServerEnabledTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;

public class SpacesOverviewAcceptanceTest extends BaseOctopusServerEnabledTest {

  @Test
  public void throwsHttpExceptionIndicatingNotAuthorisedIfIncorrectApiKey()
      throws MalformedURLException {
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), "BadKey");
    final Throwable thrown = catchThrowable(() -> SpaceOverviewApi.create(client));
    assertThat(thrown).isInstanceOf(OctopusServerException.class);
    final OctopusServerException octopusServerException = (OctopusServerException) thrown;
    assertThat(octopusServerException.getStatusCode()).isEqualTo(401);
  }

  @Test
  public void returnsOptionalEmptyIfNoSpaceWithRequestedNameIsSelected() throws IOException {
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> requestedSpace =
        spaceOverviewApi.getByName("NonExistentSpace");

    assertThat(requestedSpace).isEmpty();
  }

  @Test
  public void aSpaceCanBeCreatedAndReturnedByNameAndThenDeleted() throws IOException {
    final String spaceName = "TheTestSpace";
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final UserApi users = UserApi.create(client);

    assertThat(spaceOverviewApi.getByName(spaceName)).isEmpty();

    final SpaceOverviewWithLinks toCreate =
        new SpaceOverviewWithLinks(
            spaceName, Sets.newLinkedHashSet(users.getCurrentUser().getProperties().getId()));

    final SpaceOverviewWithLinks createdSpace = spaceOverviewApi.create(toCreate);

    try {
      assertThat(createdSpace).isNotNull();
      assertThat(createdSpace.getName()).isEqualTo(spaceName);
      assertThat(createdSpace.getSpaceManagersTeamMembers())
          .containsExactly(users.getCurrentUser().getProperties().getId());

      createdSpace.setTaskQueueStopped(true);
      final SpaceOverviewResource modifiedSpace = spaceOverviewApi.update(createdSpace);
      assertThat(modifiedSpace.getTaskQueueStopped()).isTrue();

    } finally {
      deleteSpaceValidly(spaceOverviewApi, createdSpace);
    }
  }

  @Test
  public void correctlyReturnsAllResultsRegardlessOfPaginationSize() throws IOException {
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final UserApi users = UserApi.create(client);

    final List<SpaceOverviewWithLinks> spacesCreated = Lists.newArrayList();
    try {
      final Set<String> spaceManagerTeam =
          Sets.newLinkedHashSet(users.getCurrentUser().getProperties().getId());
      for (int i = 0; i < 10; i++) {
        final SpaceOverviewWithLinks toCreate =
            new SpaceOverviewWithLinks(String.format("Space%d", i), spaceManagerTeam);
        spacesCreated.add(spaceOverviewApi.create(toCreate));
      }

      final List<String> createdSpaceNames =
          spacesCreated.stream().map(SpaceOverviewResource::getName).collect(Collectors.toList());

      // ensure all 10 spaces are reported, regardless of pagesize.
      for (int pageSize = 1; pageSize < 4; pageSize++) {
        final Map<String, List<String>> queryParams = new HashMap<>();
        queryParams.put("take", singletonList(Integer.toString(pageSize)));
        queryParams.put("partialName", singletonList("Space"));
        final List<SpaceOverviewWithLinks> spaces = spaceOverviewApi.getByQuery(queryParams);
        final List<String> spaceNamesFound =
            spaces.stream().map(SpaceOverviewResource::getName).collect(Collectors.toList());
        assertThat(spaceNamesFound).containsAll(createdSpaceNames);
      }
    } finally {
      for (SpaceOverviewWithLinks space : spacesCreated) {
        try {
          deleteSpaceValidly(spaceOverviewApi, space);
        } catch (final Exception e) {
          System.out.println("Failed to delete a space" + e);
        }
      }
    }
  }

  @Test
  public void createSpaceWithEmptyName() throws IOException {
    final String spaceName = "NotEmpty";
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final UserApi users = UserApi.create(client);

    assertThat(spaceOverviewApi.getByName(spaceName)).isEmpty();

    final SpaceOverviewWithLinks toCreate =
        new SpaceOverviewWithLinks(
            spaceName, Sets.newLinkedHashSet(users.getCurrentUser().getProperties().getId()));

    final SpaceOverviewWithLinks createdSpace = spaceOverviewApi.create(toCreate);
    try {
      createdSpace.setName("");
      assertThatThrownBy(() -> spaceOverviewApi.update(createdSpace))
          .isInstanceOf(OctopusServerException.class);
    } finally {
      createdSpace.setName(spaceName);
      deleteSpaceValidly(spaceOverviewApi, createdSpace);
    }
  }
}
