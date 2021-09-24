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
import com.octopus.sdk.api.ProjectGroupsApi;
import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateReleaseCommandParameters;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.projectgroup.ProjectGroupResourceWithLinks;
import com.octopus.sdk.model.release.ReleaseResourceWithLinks;
import com.octopus.sdk.operations.ExecutionsCreateApi;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CreateReleaseAcceptanceTest extends SpaceScopedAcceptanceTest {
  private final String projectName = "TheProject";

  @BeforeEach
  public void createDeploymentAcceptanceTestSetup() throws IOException {
    final ProjectGroupsApi projectGroupsApi = ProjectGroupsApi.create(client, spaceHome);
    final ProjectGroupResourceWithLinks projectGroup =
        projectGroupsApi.getAll().stream()
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No Project Groups exist on server"));

    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final ProjectResource projectToCreate = new ProjectResource();
    projectToCreate.setName(projectName);
    projectToCreate.setLifecycleId("Lifecycles-1");
    projectToCreate.setProjectGroupId(projectGroup.getId());
    projectApi.create(projectToCreate);
  }

  @Test
  @Disabled
  public void createdReleaseCanBeQueried() throws IOException {
    final String releaseVersion = "1.0.0";
    final CreateReleaseCommandParameters parameters =
        new CreateReleaseCommandParameters(projectName, releaseVersion);
    final CommandBody<CreateReleaseCommandParameters> body =
        new CommandBody<>(createdSpace.getName(), parameters);

    final String createdReleaseId = ExecutionsCreateApi.createRelease(client, body);

    final ReleaseApi releaseApi = ReleaseApi.create(client, spaceHome);
    final Optional<ReleaseResourceWithLinks> release = releaseApi.getById(createdReleaseId);

    assertThat(release).isNotEmpty();
  }
}
