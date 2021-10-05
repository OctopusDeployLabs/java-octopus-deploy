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

import com.google.common.base.Preconditions;
import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.model.commands.CreateReleaseCommandParameters;
import com.octopus.sdk.model.commands.ExecuteRunbookCommandParameters;
import com.octopus.sdk.model.space.SpaceHome;

import java.io.IOException;
import java.util.function.Function;

public class ExecutionsCreateApi {

  public static String createDeployment(
      final OctopusClient client, final CommandBody<CreateDeploymentCommandParameters> payload)
      throws IOException {
    return generalCase(client, payload, SpaceHome::getExecutionsCreateApiDeploymentCreateLink);
  }

  public static String createRelease(
      final OctopusClient client, final CommandBody<CreateReleaseCommandParameters> payload)
      throws IOException {

    return generalCase(client, payload, SpaceHome::getExecutionsCreateApiReleasesCreateLink);
  }

  public static String executeRunbook(
      final OctopusClient client, final CommandBody<ExecuteRunbookCommandParameters> payload)
      throws IOException {
    return generalCase(client, payload, SpaceHome::getExecutionsCreateApiRunbookRunCreateLink);
  }

  private static <T> String generalCase(final OctopusClient client, CommandBody<?> payload,
      final Function<SpaceHome, String> spaceHomePathSupplier) throws IOException {
    Preconditions.checkNotNull(
        client, "Attempted operation with a null octopusClient.");
    Preconditions.checkNotNull(payload, "Attempted operation with null payload.");

    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome = spaceHomeApi.getByName(payload.getSpaceName());

    return client.post(RequestEndpoint.fromPath(spaceHomePathSupplier.apply(spaceHome)), payload, String.class);
  }
}
