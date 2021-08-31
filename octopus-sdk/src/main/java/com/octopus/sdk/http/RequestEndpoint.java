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
import java.util.StringJoiner;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
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

  public static RequestEndpoint fromPathWithQueryString(final String pathWithQuery) {
    final String errorString =
        String.format("Unable to construct a RequestEndpoint from '%s'", pathWithQuery);

    Preconditions.checkArgument(isValidPathAndQuery(pathWithQuery), errorString);

    try {
      final URI uri = new URI(pathWithQuery);
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
      throw new IllegalArgumentException(errorString, e);
    }
  }

  private static boolean isValidPathAndQuery(String pathWithQuery) {
    return pathWithQuery != null && pathWithQuery.contains("&") && pathWithQuery.contains("=");
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final RequestEndpoint that = (RequestEndpoint) o;
    return Objects.equal(path, that.path) && Objects.equal(queryParameters, that.queryParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(path, queryParameters);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", RequestEndpoint.class.getSimpleName() + "[", "]")
        .add("path='" + path + "'")
        .add("queryParameters=" + queryParameters)
        .toString();
  }
}
