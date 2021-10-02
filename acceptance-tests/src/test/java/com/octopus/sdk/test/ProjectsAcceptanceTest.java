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
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ProjectsAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void returnsAProjectApiForAKnownSpace() {
    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    assertThat(projectApi).isNotNull();
  }

  @Test
  public void canCreateProjectWithinASpaceQueryForItAndDeleteIt() throws IOException {
    final ProjectApi projectApi = ProjectApi.create(client, spaceHome);
    final ProjectResourceWithLinks projectToCreate =
        new ProjectResourceWithLinks("Test Project", "Lifecycles-1", "ProjectGroups-42");
    final ProjectResource createdProject = projectApi.create(projectToCreate);
    assertThat(createdProject).isNotNull();
  }
}
