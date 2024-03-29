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

import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.domain.ProjectGroup;
import com.octopus.sdk.domain.Release;
import com.octopus.sdk.model.commands.CreateReleaseCommandBody;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CreateReleaseAcceptanceTest extends SpaceScopedAcceptanceTest {
  private final String projectName = "TheProject";

  @BeforeEach
  public void createReleaseTestSetup() throws IOException {
    final ProjectGroup projectGroup =
        createdSpace.projectGroups().getAll().stream()
            .findFirst()
            .orElseThrow(() -> new RuntimeException("No Project Groups exist on server"));

    projectGroup
        .projects()
        .create(
            new ProjectResourceWithLinks(
                projectName, "Lifecycles-1", projectGroup.getProperties().getId()));
  }

  @Test
  @Disabled
  public void createdReleaseCanBeQueried() throws IOException {
    final String releaseVersion = "1.0.0";
    final CreateReleaseCommandBody body =
        new CreateReleaseCommandBody(
            createdSpace.getProperties().getName(), projectName, releaseVersion);

    final String createdReleaseId = createdSpace.executionsApi().createRelease(body);

    final ReleaseApi releaseApi = ReleaseApi.create(client, spaceHome);
    final Optional<Release> release = releaseApi.getById(createdReleaseId);

    assertThat(release).isNotEmpty();
  }
}
