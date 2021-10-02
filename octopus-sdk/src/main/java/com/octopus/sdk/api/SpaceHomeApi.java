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

package com.octopus.sdk.api;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.Optional;

import com.google.common.base.Preconditions;

public class SpaceHomeApi {

  private final OctopusClient client;

  public SpaceHomeApi(final OctopusClient client) {
    this.client = client;
  }

  public SpaceHome getDefault() {
    if (client.defaultSpaceAvailable()) {
      return client.getRootDocument();
    }
    final String error =
        String.format(
            "No space was defined, but Octopus Server at %s has no default space available. "
                + "Either enable a default space on Octopus server, or specify a specific space name",
            client.getServerUrl());
    throw new IllegalArgumentException(error);
  }

  public SpaceHome getByName(final String spaceName) throws IOException {
    Preconditions.checkNotNull(spaceName, "Cannot find space with a null name");

    final SpacesOverviewApi spacesApi = SpacesOverviewApi.create(client);
    final SpaceOverviewWithLinks containingSpace = spacesApi.getByName(spaceName);

    return getBySpaceOverview(containingSpace);
  }

  public SpaceHome getBySpaceOverview(final SpaceOverviewWithLinks spaceOverview)
      throws IOException {
    return client.get(RequestEndpoint.fromPath(spaceOverview.getSpaceHomeLink()), SpaceHome.class);
  }
}
