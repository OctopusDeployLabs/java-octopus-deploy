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

package com.octopus.sdk.repository.project;

import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectExecutorRepository {

  private final OctopusClient client;
  private final ProjectApi api;

  public ProjectExecutorRepository(final OctopusClient client, final ProjectApi api) {
    this.client = client;
    this.api = api;
  }

  public ProjectExecutor create(final ProjectResourceWithLinks resource) throws IOException {
    final ProjectResourceWithLinks response = api.create(resource);
    return new ProjectExecutor(client, response);
  }

  public ProjectExecutor getById(final String id) throws IOException {
    final ProjectResourceWithLinks resource =
        api.getById(id)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with an ID of " + id));
    return new ProjectExecutor(client, resource);
  }

  public ProjectExecutor getByName(final String name) throws IOException {
    final ProjectResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with a name of " + name));
    return new ProjectExecutor(client, resource);
  }

  public List<ProjectExecutor> getAll() throws IOException {
    return api.getAll().stream()
        .map(resource -> new ProjectExecutor(client, resource))
        .collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    api.delete(id);
  }

  public void removeByName(final String name) throws IOException {
    final ProjectResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with a name of " + name));
    api.delete(resource.getId());
  }
}
