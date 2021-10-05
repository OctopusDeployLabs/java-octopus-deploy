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

package com.octopus.sdk.operations;

import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.domain.Project;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.Optional;

public class SampleOperations {

  private final OctopusClient client;

  public SampleOperations(final OctopusClient client) {
    this.client = client;
  }

  final Project getProjectInSpace(final Optional<String> spaceName, final String projectName)
      throws IOException {
    final SpaceHome spaceHome = determineSpaceHome(spaceName);

    final ProjectApi projectApi = new ProjectApi(client, spaceHome.getProjectsLink());
    final Optional<Project> project = projectApi.getByName(projectName);
    if (!project.isPresent()) {
      final String errorMsg =
          String.format(
              "Unable to find a project with name '%s' on server '%s'",
              projectName, client.getServerUrl());
      throw new IllegalArgumentException(errorMsg);
    }
    return project.get();
  }

  final SpaceHome determineSpaceHome(final Optional<String> spaceName) throws IOException {
    if (!spaceName.isPresent()) {
      if (client.defaultSpaceAvailable()) {
        return client.getRootDocument();
      }
      final String error =
          String.format(
              "Requested space name was not defined, but Octopus Server at %s has no "
                  + "default space available.",
              client.getServerUrl());
      throw new IllegalArgumentException(error);
    }

    final SpacesOverviewApi spacesApi = SpacesOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> containingSpace = spacesApi.getByName(spaceName.get());
    if (!containingSpace.isPresent()) {
      final String error =
          String.format(
              "Unable to find a space with name '%s' on server '%s'",
              spaceName.get(), client.getServerUrl());
      throw new IllegalArgumentException(error);
    }
    final String spaceHomeLink = containingSpace.get().getSpaceHomeLink();
    return client.get(RequestEndpoint.fromPath(spaceHomeLink), SpaceHome.class);
  }
}
