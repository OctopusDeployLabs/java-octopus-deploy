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

import com.octopus.openapi.model.SpaceResource;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.SpaceOverview;
import com.octopus.sdk.model.SpaceOverviewPaginatedCollection;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;
import com.google.gson.JsonSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpacesOverviewApi extends BaseApi<SpaceOverview, SpaceOverviewPaginatedCollection> {

  private static final Logger LOG = LogManager.getLogger();

  private final String rootPath;

  protected SpacesOverviewApi(final OctopusClient client, final String rootPath) {
    super(client);
    this.rootPath = rootPath;
  }

  public static SpacesOverviewApi create(final OctopusClient client) {
    if (!client.supportsSpaces()) {
      final String error =
          String.format(
              "Octopus Server at %s does not support spaces. Upgrade your Octopus Server "
                  + " to 2019.1+, or remove space querying requirement",
              client.getServerUrl());
      throw new IllegalArgumentException(error);
    }
    return new SpacesOverviewApi(client, client.getRootDocument().getSpacesLink());
  }

  @Override
  public List<SpaceOverview> getByPartialName(final String partialName) throws IOException {
    Preconditions.checkNotNull(partialName, "Cannot search for a space with a null partial name");
    return getByQuery(singletonMap("partialName", singletonList(partialName)));
  }

  @Override
  public Optional<SpaceOverview> getByName(final String completeName) throws IOException {
    Preconditions.checkNotNull(completeName, "Cannot search for a space with a null name");

    final List<SpaceOverview> spaces = getByPartialName(completeName);

    final List<SpaceOverview> matchingSpaces =
        spaces.stream()
            .filter(sr -> sr.getName().equals(completeName))
            .collect(Collectors.toList());

    if (matchingSpaces.size() == 0) {
      return Optional.empty();
    } else if (matchingSpaces.size() == 1) {
      return Optional.of(matchingSpaces.get(0));
    } else {
      throw new IllegalStateException(
          "Octopus Server reports more than 1 space with an identical name");
    }
  }

  public SpaceOverview update(final SpaceOverview alteredSpace) throws IOException {
    return client.put(
        RequestEndpoint.fromPath(alteredSpace.getSelfLink()), alteredSpace, SpaceOverview.class);
  }

  @Override
  public Optional<SpaceOverview> getById(final String id) throws IOException {
    Preconditions.checkNotNull(id, "Cannot provide a space with a null id");
    final String spacePath = String.format("%s/%s", rootPath, id);
    try {
      final SpaceOverview overview =
          client.get(RequestEndpoint.fromPath(spacePath), SpaceOverview.class);
      return Optional.of(overview);
    } catch (final HttpException e) {
      LOG.error(
          "Failed to retrieve a space with an Id of {} (http {}:{})",
          id,
          e.getStatusCode(),
          e.getMessage());
      return Optional.empty();
    } catch (final JsonSyntaxException e) {
      final String error = String.format("Failed to deserialize returned resource for space %s on Octopus Server %s",
              id, client.getServerUrl());
      throw new RuntimeException(error, e);
    }
  }

  public SpaceOverview createSpace(final String spaceName, final Set<String> managerUserIds)
      throws IOException {
    final SpaceResource spaceResource = new SpaceResource();
    spaceResource.setName(spaceName);
    spaceResource.setSpaceManagersTeamMembers(managerUserIds);

    return client.post(RequestEndpoint.fromPath(rootPath), spaceResource, SpaceOverview.class);
  }

  public List<SpaceOverview> getByQuery(final Map<String, List<String>> queryParams)
      throws IOException {
    final RequestEndpoint endpoint = new RequestEndpoint(rootPath, queryParams);
    final SpaceOverviewPaginatedCollection spacesPage =
        client.get(endpoint, SpaceOverviewPaginatedCollection.class);
    return getItemsFromPages(spacesPage, SpaceOverviewPaginatedCollection.class);
  }

  public void deleteSpace(final SpaceOverview space) throws IOException {
    // does this need to do more - i.e. SHOULD it take a space-Id, then find the right path for said
    // space?
    client.delete(RequestEndpoint.fromPath(space.getSelfLink()));
  }
}
