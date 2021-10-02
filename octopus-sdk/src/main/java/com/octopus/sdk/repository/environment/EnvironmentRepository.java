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

package com.octopus.sdk.repository.environment;

import com.octopus.sdk.api.EnvironmentsApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.environments.EnvironmentResourceWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class EnvironmentRepository {

  private final OctopusClient client;
  private final EnvironmentsApi api;

  public EnvironmentRepository(final OctopusClient client, final EnvironmentsApi api) {
    this.client = client;
    this.api = api;
  }

  public Environment create(final EnvironmentResourceWithLinks resource) throws IOException {
    final EnvironmentResourceWithLinks response = api.create(resource);
    return new Environment(client, response);
  }

  public Environment getById(final String id) throws IOException {
    final EnvironmentResourceWithLinks resource =
        api.getById(id)
            .orElseThrow(
                () ->
                    new IllegalArgumentException("Cannot find a environment with an ID of " + id));
    return new Environment(client, resource);
  }

  public Environment getByName(final String name) throws IOException {
    final EnvironmentResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with a name of " + name));
    return new Environment(client, resource);
  }

  public List<Environment> getAll() throws IOException {
    return api.getAll().stream()
        .map(resource -> new Environment(client, resource))
        .collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    api.delete(id);
  }

  public void removeByName(final String name) throws IOException {
    final EnvironmentResourceWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a project with a name of " + name));
    api.delete(resource.getId());
  }
}
