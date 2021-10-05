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

import com.octopus.sdk.Repository;
import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.domain.Space;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewResource;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.testsupport.BaseOctopusServerEnabledTest;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class SpaceScopedAcceptanceTest extends BaseOctopusServerEnabledTest {

  private static final Logger LOG = LogManager.getLogger();

  protected OctopusClient client;
  protected Repository repo;
  protected Space createdSpace;
  protected SpaceHome spaceHome;

  @BeforeEach
  public void localSetup(final TestInfo testInfo) throws IOException {
    client = new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    repo = new Repository(client);
    final UsersApi users = UsersApi.create(client);

    final String spaceName =
        testInfo
            .getDisplayName()
            .substring(
                testInfo.getDisplayName().length() - 22, testInfo.getDisplayName().length() - 2);
    LOG.info("Test operating in space {}", spaceName);
    final Set<String> spaceManagers = Sets.newHashSet(users.getCurrentUser().getId());
    createdSpace = repo.spaces().create(new SpaceOverviewWithLinks(spaceName, spaceManagers));
    spaceHome = new SpaceHomeApi(client).getBySpaceOverview(createdSpace.getProperties());
  }

  @AfterEach
  public void cleanup() throws IOException {
    if (repo != null && createdSpace != null) {
      final SpaceOverviewResource resource = createdSpace.getProperties();
      resource.setTaskQueueStopped(true);
      repo.spaces().update(resource);
      repo.spaces().delete(resource);
    }
    createdSpace = null;
  }
}
