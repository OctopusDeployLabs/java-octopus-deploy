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

package com.octopus.sdk.repository.release;

import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.release.ReleaseResourceWithLinks;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ReleaseRepository {

  private final OctopusClient client;
  private final ReleaseApi api;

  public ReleaseRepository(final OctopusClient client, final ReleaseApi api) {
    this.client = client;
    this.api = api;
  }

  public Release create(final ReleaseResourceWithLinks resource) throws IOException {
    final ReleaseResourceWithLinks response = api.create(resource);
    return new Release(client, response);
  }

  public Release getById(final String id) throws IOException {
    final ReleaseResourceWithLinks resource =
        api.getById(id)
            .orElseThrow(
                () -> new IllegalArgumentException("Cannot find a release with an id of " + id));
    return new Release(client, resource);
  }

  public List<Release> getAll() throws IOException {
    return api.getAll().stream()
        .map(resource -> new Release(client, resource))
        .collect(Collectors.toList());
  }

  public void removeById(final String id) throws IOException {
    api.delete(id);
  }
}
