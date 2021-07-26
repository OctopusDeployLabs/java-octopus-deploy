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

import static org.assertj.core.api.Assertions.assertThat;

import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.Project;
import com.octopus.sdk.model.SpaceHome;
import com.octopus.sdk.model.SpaceOverview;

import java.io.IOException;
import java.net.URL;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

public class ProjectsTest extends BaseAcceptanceTest {

  @Test
  public void returnsAProjectApiForAKnownSpace() throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverview space =
        spacesOverviewApi.create(
            "ProjectTestSpace", Sets.newHashSet(users.getCurrentUser().getId()));
    try {
      final SpaceHome spaceHome =
          client.get(RequestEndpoint.fromPath(space.getSpaceHomeLink()), SpaceHome.class);
      final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
      assertThat(projectApi).isNotNull();
    } finally {
      space.setTaskQueueStopped(true);
      spacesOverviewApi.update(space);
      spacesOverviewApi.deleteSpace(space);
    }
  }

  @Test
  public void canCreateProjectWithinASpaceQueryForItAndDeleteIt() throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverview space =
        spacesOverviewApi.create(
            "ProjectTestSpace", Sets.newHashSet(users.getCurrentUser().getId()));

    final SpaceHome spaceHome =
        client.get(RequestEndpoint.fromPath(space.getSpaceHomeLink()), SpaceHome.class);
    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final Project projectToCreate = new Project();
    projectToCreate.setName("Test Project");
    projectToCreate.setLifecycleId("Lifecycles-1");
    projectToCreate.setProjectGroupId("ProjectGroups-42");
    final Project createdProject = projectApi.create(projectToCreate);
    try {
      assertThat(createdProject).isNotNull();
    } finally {
      space.setTaskQueueStopped(true);
      spacesOverviewApi.update(space);
      spacesOverviewApi.deleteSpace(space);
    }
  }
}
