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
import com.octopus.sdk.http.ConnectData;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.net.URL;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Test;

public class ProjectsAcceptanceTest extends BaseAcceptanceTest {

  @Test
  public void returnsAProjectApiForAKnownSpace() throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClient(new ConnectData(new URL(serverURL), apiKey));
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName("ProjectTestSpace");
    toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));

    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);

    try {
      final SpaceHome spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);
      final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
      assertThat(projectApi).isNotNull();
    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }

  @Test
  public void canCreateProjectWithinASpaceQueryForItAndDeleteIt() throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClient(new ConnectData(new URL(serverURL), apiKey));
    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName("ProjectTestSpace");
    toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));
    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);

    final SpaceHome spaceHome =
        client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);
    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final ProjectResourceWithLinks projectToCreate = new ProjectResourceWithLinks();
    projectToCreate.setName("Test Project");
    projectToCreate.setLifecycleId("Lifecycles-1");
    projectToCreate.setProjectGroupId("ProjectGroups-42");
    final ProjectResource createdProject = projectApi.create(projectToCreate);
    try {
      assertThat(createdProject).isNotNull();
    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }
}
