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

import com.google.common.collect.Sets;
import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.buildinformation.PackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class BuildInformationAcceptanceTest extends BaseAcceptanceTest {

  private SpacesOverviewApi spacesOverviewApi;
  private OctopusClient client;
  private SpaceOverviewWithLinks createdSpace;
  private SpaceHome spaceHome;

  @Before
  public void localSetup() throws IOException {

    try {
      client = OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);
      final UsersApi users = UsersApi.create(client);

      final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
      toCreate.setName("ProjectTestSpace");
      toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));

      createdSpace = spacesOverviewApi.create(toCreate);
      spaceHome = client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);
    } catch(final Exception e) {
      createdSpace.setTaskQueueStopped(true);
      spacesOverviewApi.update(createdSpace);
      spacesOverviewApi.delete(createdSpace);
    }
  }

  @Test
  public void canCreatBuildInformationOnServer() throws IOException {
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final PackageVersionBuildInformationMappedResource resource = new PackageVersionBuildInformationMappedResource();




  }

  @Test
  public void canOverwriteBuildInformationOnServer() {

  }

  @Test
  public void willFailIfOverWriteModeIsFailAndBuildInfoAlreadyExists() {

  }
}
