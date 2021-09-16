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

import com.google.common.base.Preconditions;
import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.deployments.DeploymentResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.common.BaseUploader;
import com.octopus.sdk.operations.common.SpaceHomeSelector;

import java.io.IOException;

public class CreateDeploymentCommand extends BaseUploader {

  public CreateDeploymentCommand(
      final OctopusClient client, final SpaceHomeSelector spaceHomeSelector)  {
    super(client, spaceHomeSelector);
  }

  public static CreateDeploymentCommand create(final OctopusClient client) {
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHomeSelector spaceHomeSelector = new SpaceHomeSelector(spaceHomeApi);
    return new CreateDeploymentCommand(client, spaceHomeSelector);
  }

  public DeploymentResource execute(final CreateDeploymentContext context) throws IOException {
    Preconditions.checkNotNull(context, "Attempted to create a deployment with null context.");

    final SpaceHome spaceHome = spaceHomeSelector.getSpaceHome(context.getSpaceName());

    //final String createDeploymentPath = spaceHome.getCreateDeploymentLink();
    final String createDeploymentPath = "spaceHome.getCreateDeploymentLink()";

    final DeploymentResource result = client.post(
        RequestEndpoint.fromPath(createDeploymentPath),
        context.getModel(),
        DeploymentResource.class);

    return result;
  }

}
