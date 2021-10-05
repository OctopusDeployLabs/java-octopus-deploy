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

import com.octopus.sdk.domain.Space;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.model.spaces.SpaceOverviewResource;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.io.UncheckedIOException;

public class SpaceApi
    extends BaseResourceApi<
        SpaceOverviewResource, SpaceOverviewWithLinks, SpaceOverviewPaginatedCollection, Space> {

  private final SpaceHomeApi homeApi;

  public SpaceApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, SpaceOverviewWithLinks.class, SpaceOverviewPaginatedCollection.class);
    homeApi = new SpaceHomeApi(client);
  }

  @Override
  public Space createServerObject(final SpaceOverviewWithLinks resource) {
    try {
      final SpaceHome spaceHome = homeApi.getBySpaceOverview(resource);
      return new Space(client, spaceHome, resource);
    } catch (final IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
