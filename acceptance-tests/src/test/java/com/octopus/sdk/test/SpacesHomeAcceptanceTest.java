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

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.SpaceOverviewApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.testsupport.BaseOctopusServerEnabledTest;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class SpacesHomeAcceptanceTest extends BaseOctopusServerEnabledTest {

  @Test
  public void throwsExceptionIfRequestSpaceDoesNotExist() throws IOException {
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    assertThatThrownBy(() -> spaceHomeApi.getByName("NonExistentSpace"))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void throwsExceptionIfNoDefaultSpaceExistsAndNoNameSpecified() throws IOException {
    final OctopusClient client =
        new OctopusClient(httpClient, new URL(server.getOctopusUrl()), server.getApiKey());

    final SpaceOverviewApi spaceOverviewApi = SpaceOverviewApi.create(client);
    final List<SpaceOverviewWithLinks> spaces = spaceOverviewApi.getAll();
    // Ensure no defaultSpaces exist
    final Optional<SpaceOverviewWithLinks> alteredSpace =
        spaces.stream().filter(SpaceOverviewWithLinks::getDefault).findFirst();

    if (alteredSpace.isPresent()) {
      alteredSpace.get().setDefault(false);
      spaceOverviewApi.update(alteredSpace.get());
    }

    try {
      final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
      assertThatThrownBy(() -> spaceHomeApi.getDefault())
          .isInstanceOf(IllegalArgumentException.class);
    } finally {
      if (alteredSpace.isPresent()) {
        alteredSpace.get().setDefault(true);
        spaceOverviewApi.update(alteredSpace.get());
      }
    }
  }
}
