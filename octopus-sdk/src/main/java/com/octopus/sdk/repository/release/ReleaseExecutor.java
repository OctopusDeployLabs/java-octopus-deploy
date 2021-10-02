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

package com.octopus.sdk.repository.release;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.release.ReleaseResourceWithLinks;
import com.octopus.sdk.repository.project.ProjectExecutor;

import java.io.IOException;

public class ReleaseExecutor {

  private final OctopusClient client;
  private final ReleaseResourceWithLinks resourceWithLinks;

  public ReleaseExecutor(
      final OctopusClient client, final ReleaseResourceWithLinks resourceWithLinks) {
    this.client = client;
    this.resourceWithLinks = resourceWithLinks;
  }

  public ReleaseResourceWithLinks getProperties() {
    return resourceWithLinks;
  }

  public ProjectExecutor getProject() throws IOException {
    final ProjectResourceWithLinks resource =
        client.get(
            RequestEndpoint.fromPath(resourceWithLinks.getProjectLink()),
            ProjectResourceWithLinks.class);
    return new ProjectExecutor(client, resource);
  }
}
