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

import com.octopus.sdk.api.DeploymentApi;
import com.octopus.sdk.domain.Deployment;
import com.octopus.sdk.domain.Project;
import com.octopus.sdk.domain.ProjectGroup;
import com.octopus.sdk.model.commands.CreateDeploymentCommandBody;
import com.octopus.sdk.model.environment.EnvironmentResourceWithLinks;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.release.ReleaseResourceWithLinks;

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
    final ProjectGroup projectGroup =
        createdSpace.projectGroups().getAll().stream()
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No Project Groups exist on server"));

    final ProjectResourceWithLinks projectToCreate =
        new ProjectResourceWithLinks(
            projectName, "Lifecycles-1", projectGroup.getProperties().getId());
    final Project projectCreated = projectGroup.projects().create(projectToCreate);

    createdSpace.environments().create(new EnvironmentResourceWithLinks(envName));

    createdSpace
        .releases()
        .create(
            new ReleaseResourceWithLinks(releaseVersion, projectCreated.getProperties().getId()));
  }

  @Test
  @Disabled
  public void createDeployment() throws IOException {
    final CreateDeploymentCommandBody body =
        new CreateDeploymentCommandBody(
            createdSpace.getProperties().getName(),
            projectName,
            singletonList(envName),
            releaseVersion);

    final String deploymentId = createdSpace.executionsApi().createDeployment(body);

    final DeploymentApi deploymentApi = DeploymentApi.create(client, spaceHome);
    final Optional<Deployment> deployment = deploymentApi.getById(deploymentId);

    assertThat(deployment).isNotEmpty();
  }
}
