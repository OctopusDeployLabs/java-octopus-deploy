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

package com.octopus.sdk.operations.executerunbook;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.common.BaseUploader;
import com.octopus.sdk.operations.common.SpaceHomeSelector;

import java.io.IOException;

import com.google.common.base.Preconditions;

public class ExecuteRunbookCommand extends BaseUploader {

  public ExecuteRunbookCommand(
      final OctopusClient client, final SpaceHomeSelector spaceHomeSelector) {
    super(client, spaceHomeSelector);
  }

  public static ExecuteRunbookCommand create(final OctopusClient client) {
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHomeSelector spaceHomeSelector = new SpaceHomeSelector(spaceHomeApi);
    return new ExecuteRunbookCommand(client, spaceHomeSelector);
  }

  public String execute(final ExecuteRunbookCommandContext context) throws IOException {
    Preconditions.checkNotNull(context, "Attempted to execute a runbook with null context.");

    final SpaceHome spaceHome = spaceHomeSelector.getSpaceHome(context.getSpaceName());
    final String createReleasePath = spaceHome.getExecutionsCreateApiRunbookRunCreateLink();
    final String result =
        client.post(RequestEndpoint.fromPath(createReleasePath), context.getModel(), String.class);

    return result;
  }
}
