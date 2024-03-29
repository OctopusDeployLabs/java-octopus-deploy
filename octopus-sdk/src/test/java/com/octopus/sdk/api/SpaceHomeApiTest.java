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

import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.support.TestHelpers;

import org.junit.jupiter.api.Test;

class SpaceHomeApiTest extends BaseApiTest {

  @Test
  public void throwExceptionIfSpaceRequestedByServerDoesNotSupportSpaces() {
    final RootDocument rootDoc = TestHelpers.rootDocWithLinks(emptyMap());
    mockOctopusServer.clear(request().withPath("/api")); // remove existing expectation
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(rootDoc)));

    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);

    assertThatThrownBy(() -> spaceHomeApi.getByName("ArbitrarySpaceName"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("does not support spaces");
  }

  @Test
  public void getDefaultThrowsExceptionIfServerHasNoDefaultSpace() {
    final RootDocument rootDoc = TestHelpers.rootDocWithLinks(emptyMap());
    mockOctopusServer.clear(request().withPath("/api")); // remove existing expectation
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(rootDoc)));

    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);

    assertThatThrownBy(spaceHomeApi::getDefault)
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("no default space available");
  }

  @Test
  public void throwsExceptionIfGetSpaceByNameWithNullName() {
    mockOctopusServer.clear(request().withPath("/api")); // remove existing expectation
    mockOctopusServer
        .when(request().withPath("/api"))
        .respond(
            response().withStatusCode(200).withBody(gson.toJson(TestHelpers.defaultRootDoc())));
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    assertThatThrownBy(() -> spaceHomeApi.getByName(null))
        .isInstanceOf(NullPointerException.class)
        .hasMessageContaining("Cannot find space with a null name");
  }
}
