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

package com.octopus.sdk.http;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class RequestEndpoint {

  private final String path;
  private final Map<String, List<String>> queryParameters;

  public RequestEndpoint(final String path, final Map<String, List<String>> queryParameters) {
    this.path = path;
    this.queryParameters = queryParameters;
  }

  public String getPath() {
    return path;
  }

  public Map<String, List<String>> getQueryParameters() {
    return queryParameters;
  }

  public static RequestEndpoint fromPath(final String path) {
    return new RequestEndpoint(path, Collections.emptyMap());
  }

  public static RequestEndpoint fromPathAndQueryString(final String pathAndQuery) {
    try {
      final URI uri = new URI(pathAndQuery);
      final Iterable<String> items = Splitter.on('&').split(uri.getQuery());
      final Map<String, List<String>> queryParams = new HashMap<>();
      for (final String item : items) {
        final List<String> splitItem = Splitter.on('=').splitToList(item);
        queryParams
            .computeIfAbsent(splitItem.get(0), v -> Lists.newArrayList())
            .add(splitItem.get(1));
      }
      return new RequestEndpoint(uri.getPath(), queryParams);
    } catch (final URISyntaxException e) {
      final String errorString =
          String.format("Unable to construct a RequestEnpoint from '%s'", pathAndQuery);
      throw new IllegalArgumentException(errorString, e);
    }
  }
}
