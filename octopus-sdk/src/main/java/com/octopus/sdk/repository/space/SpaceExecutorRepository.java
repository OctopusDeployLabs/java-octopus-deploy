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

package com.octopus.sdk.repository.space;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SpaceExecutorRepository {

  private final OctopusClient client;
  private final SpacesOverviewApi api;
  final SpaceHomeApi homeApi;

  public SpaceExecutorRepository(final OctopusClient client) {
    this.client = client;
    this.api = SpacesOverviewApi.create(client);
    this.homeApi =  new SpaceHomeApi(client);
  }

  public SpaceHomeExecutor getById(final String id) throws IOException {
    final SpaceOverviewWithLinks resource = api.getById(id);
    final SpaceHome spaceHome = homeApi.getBySpaceOverview(resource);
    return new SpaceHomeExecutor(client, spaceHome);
  }

  public SpaceHomeExecutor getByName(final String name) throws IOException {
    final SpaceHome spaceHome = homeApi.getByName(name);
    return new SpaceHomeExecutor(client, spaceHome);
  }

  public List<SpaceHomeExecutor> getAll() throws IOException {
    return api.getAll().stream().map(spaceOverview -> {
      try {
        final SpaceHome spaceHome = homeApi.getBySpaceOverview(spaceOverview);
        return new SpaceHomeExecutor(client, spaceHome);
      } catch (IOException e) {
        throw new RuntimeException("Failed to get spacehome");
      }
    }).collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    api.delete(id);
  }

  public void removeByName(final String name) throws IOException {
    final SpaceOverviewWithLinks resource = api.getByName(name);
    api.delete(resource.getId());
  }
}
