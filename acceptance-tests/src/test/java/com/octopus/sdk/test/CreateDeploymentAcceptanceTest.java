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

import com.google.common.collect.Sets;
import com.octopus.openapi.model.Project;
import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.model.deployments.DeploymentResourceWithLinks;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import com.octopus.sdk.operations.ExecutionsCreateApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

import static java.util.Collections.singletonList;

public class CreateDeploymentAcceptanceTest extends BaseAcceptanceTest {
  private static final Logger LOG = LogManager.getLogger();

  private SpacesOverviewApi spacesOverviewApi;
  private OctopusClient client;
  private SpaceOverviewWithLinks createdSpace;
  private SpaceHome spaceHome;
  private final String spaceName = "CreateDeploymentTestSpace";
  private final String projectName = "The"

  @BeforeEach
  public void localSetup() throws IOException {

    SpaceOverviewWithLinks toCreate = null;
    try {
      client = new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
      spacesOverviewApi = SpacesOverviewApi.create(client);
      final UsersApi users = UsersApi.create(client);

      toCreate = new SpaceOverviewWithLinks();
      toCreate.setName(spaceName);
      toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));

      createdSpace = spacesOverviewApi.create(toCreate);
      spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);


      final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
      final ProjectResource projectToCreate = new ProjectResource();
      projectToCreate.setName(projectName);
      projectToCreate.setLifecycleId("Lifecycles-1");
      projectToCreate.setProjectGroupId("ProjectGroups-42");
      final ProjectResourceWithLinks projectCreated = projectApi.create(projectToCreate);


    } catch (final Exception e) {
      LOG.error(e);
      deleteSpaceValidly(spacesOverviewApi, toCreate);
      spacesOverviewApi = null;
      throw e;
    }
  }

  @AfterEach
  public void cleanup() throws IOException {
    deleteSpaceValidly(spacesOverviewApi, createdSpace);
    spacesOverviewApi = null;
  }

  @Test
  public void createDeployment() throws IOException {

    final CreateDeploymentCommandParameters params = new CreateDeploymentCommandParameters(projectName,
        singletonList("test"),
        "1.0.0");

    final DeploymentResourceWithLinks result = ExecutionsCreateApi.createDeployment(client, new CommandBody<>("Default",
        params));
  }

}
