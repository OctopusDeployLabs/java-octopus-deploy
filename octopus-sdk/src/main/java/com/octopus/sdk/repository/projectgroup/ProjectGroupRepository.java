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

package com.octopus.sdk.repository.projectgroup;

import com.octopus.sdk.api.ProjectGroupsApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.projectgroup.ProjectGroupResourceWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectGroupRepository {

  private final OctopusClient client;
  private final ProjectGroupsApi api;


  public ProjectGroupRepository(final OctopusClient client, final ProjectGroupsApi api) {
    this.client = client;
    this.api = api;
  }

  public ProjectGroup create(final ProjectGroupResourceWithLinks resource) throws IOException {
    final ProjectGroupResourceWithLinks response = api.create(resource);
    return new ProjectGroup(client, response);
  }

  public ProjectGroup getById(final String id) throws IOException {
    final ProjectGroupResourceWithLinks resource =
        api.getById(id)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a projectGroup with an ID of " + id));
    return new ProjectGroup(client, resource);
  }

  public ProjectGroup getByName(final String name) throws IOException {
    final ProjectGroupResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a projectGroup with a name of " + name));
    return new ProjectGroup(client, resource);
  }

  public List<ProjectGroup> getAll() throws IOException {
    return api.getAll().stream()
        .map(resource -> new ProjectGroup(client, resource))
        .collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    api.delete(id);
  }

  public void removeByName(final String name) throws IOException {
    final ProjectGroupResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with a name of " + name));
    api.delete(resource.getId());
  }

}
