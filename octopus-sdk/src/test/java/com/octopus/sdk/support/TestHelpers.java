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

package com.octopus.sdk.support;

import static java.util.Collections.singletonMap;

import com.octopus.sdk.model.RootDocument;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class TestHelpers {

  public static URL createLocalhostOctopusServerUrl(final int port) {
    try {
      return new URL(String.format("http://localhost:%d", port));
    } catch (MalformedURLException e) {
      throw new RuntimeException("Failed to construct a valid URL", e);
    }
  }

  public static RootDocument defaultRootDoc() {
    return new RootDocument(
        "OctopusDeploy",
        "2021.1",
        "3.1",
        "installationId",
        true,
        singletonMap("Spaces", "/api/spaces{/id}{?name,skip,ids,take,partialName}"));
  }

  public static RootDocument rootDocWithLinks(final Map<String, String> links) {
    return new RootDocument("OctopusDeploy", "2021.1", "3.1", "installationId", true, links);
  }
}
