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

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.Project;
import com.octopus.sdk.model.ProjectPaginatedCollection;
import com.octopus.sdk.model.SpaceHome;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;

public class ProjectApi extends BaseApi<Project, ProjectPaginatedCollection> {

  private final String rootPath;

  public ProjectApi(final OctopusClient client, final String rootPath) {
    super(client);
    Preconditions.checkNotNull(rootPath, "ProjectApi attempted to be created with a null rootPath");
    this.rootPath = rootPath;
  }

  // BasePath is either the SpaceOverview.homelink, or otherwise the root of the server (if
  // pre-spaces installation)
  public static ProjectApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(spaceHome, "Cannot create a project in a space with a 'null' space");
    return new ProjectApi(client, spaceHome.getProjectsLink());
  }

  @Override
  public List<Project> getByPartialName(final String partialName) throws IOException {
    Preconditions.checkNotNull(partialName, "Cannot search for a project with a null partial name");
    return getByQuery(singletonMap("partialName", singletonList(partialName)));
  }

  @Override
  public Optional<Project> getByName(final String completeName) throws IOException {
    Preconditions.checkNotNull(completeName, "Cannot search for a project with a null name");
    final List<Project> resources = getByPartialName(completeName);

    final List<Project> matching =
        resources.stream()
            .filter(resource -> resource.getName().equals(completeName))
            .collect(Collectors.toList());

    if (matching.size() == 0) {
      return Optional.empty();
    } else if (matching.size() == 1) {
      return Optional.of(matching.get(0));
    } else {
      throw new IllegalStateException(
          "Octopus Server reports more than 1 space with an identical name");
    }
  }

  @Override
  public Optional<Project> getById(final String id) throws IOException {
    Preconditions.checkNotNull(id, "Cannot search for a project with a null id");
    final String path = String.format("%s/%s", rootPath, id);
    final Project result = client.get(RequestEndpoint.fromPath(path), Project.class);

    return Optional.of(result);
  }

  public Project create(final Project project) throws IOException {
    return client.post(RequestEndpoint.fromPath(rootPath), project, Project.class);
  }

  public void delete(final Project project) throws IOException {
    client.delete(RequestEndpoint.fromPath(project.getSelfLink()));
  }

  private List<Project> getByQuery(final Map<String, List<String>> queryParams) throws IOException {
    final RequestEndpoint endpoint = new RequestEndpoint(rootPath, queryParams);
    final ProjectPaginatedCollection projectsPage =
        client.get(endpoint, ProjectPaginatedCollection.class);
    return getItemsFromPages(projectsPage, ProjectPaginatedCollection.class);
  }
}
