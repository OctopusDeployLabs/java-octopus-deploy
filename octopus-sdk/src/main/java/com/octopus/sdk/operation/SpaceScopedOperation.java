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

package com.octopus.sdk.operation;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.SpaceOverviewApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.Optional;

public abstract class SpaceScopedOperation<T extends CommandBody, U> {

  protected final OctopusClient client;

  public SpaceScopedOperation(final OctopusClient client) {
    this.client = client;
  }

  public U execute(final T payload) throws IOException {
    final SpaceHome spaceHome = getSpaceHome(payload.getSpaceIdOrName());

    return performOperation(spaceHome, payload);
  }

  protected abstract U performOperation(final SpaceHome spaceHOme, final T payload)
      throws IOException;

  protected SpaceHome getSpaceHome(final String spaceIdOrName) throws IOException {
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final Optional<SpaceOverviewWithLinks> spaceOverview =
        spaceOverviewApi.getByIdOrName(spaceIdOrName);

    if (!spaceOverview.isPresent()) {
      throw new IllegalArgumentException(
          "No spaces exist with an Id or Name of '" + spaceIdOrName + "'");
    }

    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    return spaceHomeApi.getBySpaceOverview(spaceOverview.get());
  }
}
