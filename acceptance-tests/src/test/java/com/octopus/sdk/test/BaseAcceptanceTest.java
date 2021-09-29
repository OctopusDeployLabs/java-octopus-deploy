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

package com.octopus.sdk.test;

import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import com.octopus.testsupport.OctopusDeployServer;

import java.io.IOException;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ServerResourceExtension.class)
public class BaseAcceptanceTest {

  protected static OctopusDeployServer server;
  protected static final OkHttpClient httpClient = new OkHttpClient();

  @BeforeAll
  public static void setup(ServerResourceExtension.ServerResource serverResource) {
    server = serverResource.getServer();
  }

  protected void deleteSpaceValidly(
      final SpacesOverviewApi spacesOverviewApi, final SpaceOverviewWithLinks space)
      throws IOException {
    if ((spacesOverviewApi != null) && (space != null)) {
      space.setTaskQueueStopped(true);
      spacesOverviewApi.update(space);
      spacesOverviewApi.delete(space);
    }
  }
}
