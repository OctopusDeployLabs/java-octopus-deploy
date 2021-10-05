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

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.model.commands.CreateReleaseCommandParameters;
import com.octopus.sdk.model.commands.ExecuteRunbookCommandParameters;
import com.octopus.sdk.model.space.SpaceHome;

import java.io.IOException;

import com.google.common.base.Preconditions;

public class ExecutionsCreateApi {

  private final OctopusClient client;
  private final SpaceHome spaceHome;

  public ExecutionsCreateApi(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(
        spaceHome, "Cannot create an ExecutionsCreateApi in a null spaceHome");
    this.client = client;
    this.spaceHome = spaceHome;
  }

  public String createDeployment(final CommandBody<CreateDeploymentCommandParameters> payload)
      throws IOException {
    return client.post(
        RequestEndpoint.fromPath(spaceHome.getExecutionsCreateApiDeploymentCreateLink()),
        payload,
        String.class);
  }

  public String createRelease(final CommandBody<CreateReleaseCommandParameters> payload)
      throws IOException {
    return client.post(
        RequestEndpoint.fromPath(spaceHome.getExecutionsCreateApiReleasesCreateLink()),
        payload,
        String.class);
  }

  public String executeRunbook(final CommandBody<ExecuteRunbookCommandParameters> payload)
      throws IOException {
    return client.post(
        RequestEndpoint.fromPath(spaceHome.getExecutionsCreateApiRunbookRunCreateLink()),
        payload,
        String.class);
  }
}
