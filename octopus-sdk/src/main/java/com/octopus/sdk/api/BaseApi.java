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

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.PaginatedCollection;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

public abstract class BaseApi<T, U extends PaginatedCollection<T>> {

  protected final OctopusClient client;

  public BaseApi(final OctopusClient client) {
    this.client = client;
  }

  protected List<T> getItemsFromPages(final U collection, final Class<U> type) throws IOException {
    final List<T> result = Lists.newArrayList(collection.getItems());
    U localCollection = collection;

    while (localCollection.getPageNext() != null) {
      localCollection =
          client.get(RequestEndpoint.fromPathAndQueryString(localCollection.getPageNext()), type);
      result.addAll(localCollection.getItems());
    }

    return result;
  }

  public abstract List<T> getByPartialName(final String partialName) throws IOException;

  public abstract Optional<T> getByName(final String name) throws IOException;

  public abstract Optional<T> getById(final String id) throws IOException;
}
