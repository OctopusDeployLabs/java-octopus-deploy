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

public class SpaceRepository {

  private final OctopusClient client;
  private final SpacesOverviewApi api;
  final SpaceHomeApi homeApi;

  public SpaceRepository(final OctopusClient client) {
    this.client = client;
    this.api = SpacesOverviewApi.create(client);
    this.homeApi = new SpaceHomeApi(client);
  }

  public Space create(final SpaceOverviewWithLinks resource) throws IOException {
    final SpaceOverviewWithLinks result =  api.create(resource);
    final SpaceHome spaceHome = homeApi.getBySpaceOverview(result);
    return new Space(client, spaceHome, result);
  }

  public Space getById(final String id) throws IOException {
    final SpaceOverviewWithLinks resource =
        api.getById(id)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a space with an ID of " + id));
    final SpaceHome spaceHome = homeApi.getBySpaceOverview(resource);
    return new Space(client, spaceHome, resource);
  }

  public Space getByName(final String name) throws IOException {
    final SpaceOverviewWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a space with a name of " + name));
    final SpaceHome spaceHome = homeApi.getByName(name);
    return new Space(client, spaceHome, resource);
  }

  public List<Space> getAll() throws IOException {
    return api.getAll().stream()
        .map(
            spaceOverview -> {
              try {
                final SpaceHome spaceHome = homeApi.getBySpaceOverview(spaceOverview);
                return new Space(client, spaceHome, spaceOverview);
              } catch (IOException e) {
                throw new RuntimeException("Failed to get spacehome");
              }
            })
        .collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    final SpaceOverviewWithLinks space = api.getById(id).orElseThrow(() -> new IllegalArgumentException("No space "
        + "with an id of '" + id + "' exists"));
    space.setTaskQueueStopped(true);
    api.update(space);
    api.delete(id);
  }

  public void removeByName(final String name) throws IOException {
    final SpaceOverviewWithLinks resource =
        api.getByName(name)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a space with a name of " + name));
    api.delete(resource.getId());
  }
}
