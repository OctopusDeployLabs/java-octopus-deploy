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

import com.octopus.sdk.api.DeploymentsApi;
import com.octopus.sdk.api.EnvironmentsApi;
import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.ProjectGroupsApi;
import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.model.deployments.DeploymentResourceWithLinks;
import com.octopus.sdk.model.environments.EnvironmentResourceWithLinks;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.projectgroup.ProjectGroupResourceWithLinks;
import com.octopus.sdk.model.release.ReleaseResourceWithLinks;
import com.octopus.sdk.operations.ExecutionsCreateApi;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CreateDeploymentAcceptanceTest extends SpaceScopedAcceptanceTest {

  private final String projectName = "TheProject";
  private final String envName = "TheEnvironment";
  private final String releaseVersion = "1.0.0";

  @BeforeEach
  public void createDeploymentAcceptanceTestSetup() throws IOException {
    final ProjectGroupsApi projectGroupsApi = ProjectGroupsApi.create(client, spaceHome);
    final ProjectGroupResourceWithLinks projectGroup =
        projectGroupsApi.getAll().stream()
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No Project Groups exist on server"));

    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final ProjectResource projectToCreate =
        new ProjectResource(projectName, "Lifecycles-1", projectGroup.getId());
    final ProjectResourceWithLinks projectCreated = projectApi.create(projectToCreate);

    final EnvironmentsApi environmentApi = EnvironmentsApi.create(client, spaceHome);
    final EnvironmentResourceWithLinks envToCreate = new EnvironmentResourceWithLinks(envName);
    environmentApi.create(envToCreate);

    final ReleaseApi releaseApi = ReleaseApi.create(client, spaceHome);
    final ReleaseResourceWithLinks release = new ReleaseResourceWithLinks();
    release.setVersion(releaseVersion);
    release.setProjectId(projectCreated.getId());

    releaseApi.create(release);
  }

  @Test
  @Disabled
  public void createDeployment() throws IOException {
    final CreateDeploymentCommandParameters params =
        new CreateDeploymentCommandParameters(projectName, singletonList(envName), releaseVersion);

    final String deploymentId =
        ExecutionsCreateApi.createDeployment(
            client, new CommandBody<>(createdSpace.getName(), params));

    final DeploymentsApi deploymentsApi = DeploymentsApi.create(client, spaceHome);
    final Optional<DeploymentResourceWithLinks> deployment = deploymentsApi.getById(deploymentId);

    assertThat(deployment).isNotEmpty();
  }
}
