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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.domain.Project;
import com.octopus.sdk.domain.ProjectGroup;
import com.octopus.sdk.exceptions.OctopusRequestException;
import com.octopus.sdk.exceptions.OctopusServerException;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.projectgroup.ProjectGroupResource;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class ProjectsAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void returnsAProjectApiForAKnownSpace() {
    final ProjectApi projectRepository = createdSpace.projects();
    assertThat(projectRepository).isNotNull();
  }

  @Test
  public void canCreateProjectWithinASpaceQueryForItAndDeleteIt() throws IOException {
    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final ProjectResource projectToCreate =
        new ProjectResource("Test Project", "Lifecycles-1", "ProjectGroups-42");
    final Project createdProject = projectApi.create(projectToCreate);
    assertThat(createdProject).isNotNull();

    final Optional<Project> retrievedProject =
        projectApi.getById(createdProject.getProperties().getId());
    assertThat(retrievedProject).isNotEmpty();

    projectApi.delete(createdProject.getProperties().getId());
    assertThat(projectApi.getById(createdProject.getProperties().getId())).isEmpty();
  }

  @Test
  public void createProjectFromProjectGroup() throws IOException {
    final ProjectGroup theProjectGroup =
        createdSpace.projectGroups().create(new ProjectGroupResource("TheGroup"));

    final ProjectResource theProject =
        new ProjectResource("TheProject", "Lifecycle-1", theProjectGroup.getProperties().getId());

    // You are unable to create a project via the ProjectGroup, instead, it must be performed at the space level.
    assertThatThrownBy(() -> theProjectGroup.projects().create(theProject)).isInstanceOf(OctopusRequestException.class);
  }
}
