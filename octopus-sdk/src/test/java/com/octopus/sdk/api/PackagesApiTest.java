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

package com.octopus.sdk.api;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.packages.PackageResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class PackagesApiTest {

  private final OctopusClient client = mock(OctopusClient.class);

  private Map<String, String> createSpaceHomeLinks() {
    final Map<String, String> result = new HashMap<>();
    result.put("Packages", "api/arbitrary-path");
    result.put("PackageUpload", "api/upload-path");
    return result;
  }

  @Test
  public void standardCreateFunctionThrowsUnsupportedException() {
    final SpaceHome spaceHome = new SpaceHome(createSpaceHomeLinks());
    final PackagesApi api = PackagesApi.create(client, spaceHome);

    assertThatThrownBy(() -> api.create(new PackageResourceWithLinks()))
        .isInstanceOf(UnsupportedOperationException.class);
  }

  @Test
  public void standardUpdateFunctionThrowsUnsupportedException() {
    final SpaceHome spaceHome = new SpaceHome(createSpaceHomeLinks());
    final PackagesApi api = PackagesApi.create(client, spaceHome);

    assertThatThrownBy(() -> api.update(new PackageResourceWithLinks()))
        .isInstanceOf(UnsupportedOperationException.class);
  }
}
