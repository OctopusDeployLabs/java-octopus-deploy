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

import com.octopus.sdk.domain.Lifecycle;
import com.octopus.sdk.domain.Project;
import com.octopus.sdk.domain.ProjectGroup;
import com.octopus.sdk.model.channel.ChannelResource;
import com.octopus.sdk.model.lifecycle.LifecycleResource;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.projectgroup.ProjectGroupResource;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ChannelAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void canCreateNewChannel() throws IOException {
    final Lifecycle lifecycle =
        createdSpace.lifecycles().create(new LifecycleResource("MyLifecycle"));
    final ProjectGroup projectGroup =
        createdSpace.projectGroups().create(new ProjectGroupResource("MyProjectGroup"));
    final Project project =
        createdSpace
            .projects()
            .create(
                new ProjectResource(
                    "myProject",
                    lifecycle.getProperties().getId(),
                    projectGroup.getProperties().getId()));

    createdSpace
        .channels()
        .create(new ChannelResource("myChannel", project.getProperties().getId()));
  }
}
