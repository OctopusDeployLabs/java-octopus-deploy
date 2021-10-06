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

package com.octopus.sdk.domain;

import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.channel.ChannelResourceWithLinks;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;

import java.io.IOException;

public class Channel {

  private final OctopusClient client;
  private final ChannelResourceWithLinks properties;

  public Channel(final OctopusClient client, final ChannelResourceWithLinks properties) {
    this.client = client;
    this.properties = properties;
  }

  public ChannelResourceWithLinks getProperties() {
    return properties;
  }

  public Project project() throws IOException {
    final ProjectResourceWithLinks resource =
        client.get(
            RequestEndpoint.fromPath(properties.getProjectLink()), ProjectResourceWithLinks.class);
    return new Project(client, resource);
  }

  public ReleaseApi releases() {
    return new ReleaseApi(client, properties.getReleasesLink());
  }
}
