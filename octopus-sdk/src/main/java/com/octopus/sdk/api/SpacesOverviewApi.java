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
import com.octopus.sdk.model.spaces.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.model.spaces.SpaceOverviewResource;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

public class SpacesOverviewApi
    extends BaseNamedResourceApi<
        SpaceOverviewResource,
        SpaceOverviewWithLinks,
        SpaceOverviewPaginatedCollection,
        SpaceOverviewWithLinks> {

  protected SpacesOverviewApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, SpaceOverviewWithLinks.class, SpaceOverviewPaginatedCollection.class);
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
  public SpaceOverviewWithLinks createServerObject(final SpaceOverviewWithLinks resource) {
    return resource;
  }
}
