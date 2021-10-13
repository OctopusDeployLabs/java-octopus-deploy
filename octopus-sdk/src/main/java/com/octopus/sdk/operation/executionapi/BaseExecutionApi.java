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

package com.octopus.sdk.operation.executionapi;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.SpaceOverviewApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;

import java.io.IOException;
import java.util.Optional;

public abstract class BaseExecutionApi<T extends CommandBody, U> {

  protected final OctopusClient client;

  public BaseExecutionApi(final OctopusClient client) {
    this.client = client;
  }

  protected U execute(final T payload) throws IOException {
    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final String spaceIdentifier = payload.getSpaceIdOrName();
    Optional<SpaceOverviewWithLinks> spaceOverview =
        spaceOverviewApi.getByIdOrName(spaceIdentifier);

    if (!spaceOverview.isPresent()) {
      throw new IllegalArgumentException(
          "No spaces exist with an Id or Name of '" + spaceIdentifier + "'");
    }

    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome = spaceHomeApi.getBySpaceOverview(spaceOverview.get());
    final ExecutionsCreateApi api = new ExecutionsCreateApi(client, spaceHome);
    return sendRequest(api, payload);
  }

  protected abstract U sendRequest(final ExecutionsCreateApi api, final T payload)
      throws IOException;
}
