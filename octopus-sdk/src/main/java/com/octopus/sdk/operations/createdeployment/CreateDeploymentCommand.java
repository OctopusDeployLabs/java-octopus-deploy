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

package com.octopus.sdk.operations.createdeployment;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.model.deployments.DeploymentResource;

import java.io.IOException;

import com.google.common.base.Preconditions;

public class CreateDeploymentCommand {

  private final OctopusClient client;

  public CreateDeploymentCommand(final OctopusClient client) {
    Preconditions.checkNotNull(
        client, "Attempted to create a deployment with a null octopusClient.");
    this.client = client;
  }

  public DeploymentResource execute(final CommandBody<CreateDeploymentCommandParameters> payload)
      throws IOException {
    Preconditions.checkNotNull(payload, "Attempted to create a deployment with null payload.");

    final String createDeploymentPath =
        client.getRootDocument().getExecutionsCreateApiDeploymentCreateLink();

    return client.post(
        RequestEndpoint.fromPath(createDeploymentPath), payload, DeploymentResource.class);
  }
}
