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

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.NamedResource;
import com.octopus.sdk.model.PaginatedCollection;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;

public abstract class BaseNamedResourceApi<
        CREATE_TYPE extends NamedResource,
        RESPONSE_TYPE extends NamedResource,
        PAGINATION_TYPE extends PaginatedCollection<RESPONSE_TYPE>>
    extends BaseResourceApi<CREATE_TYPE, RESPONSE_TYPE, PAGINATION_TYPE> {

  public BaseNamedResourceApi(
      final OctopusClient client,
      final String rootPath,
      final Class<RESPONSE_TYPE> resourceType,
      final Class<PAGINATION_TYPE> collectionType) {
    super(client, rootPath, resourceType, collectionType);
  }

  public List<RESPONSE_TYPE> getByPartialName(final String partialName) throws IOException {
    Preconditions.checkNotNull(partialName, "Cannot search for a project with a null partial name");
    return getByQuery(singletonMap("partialName", singletonList(partialName)));
  }

  public Optional<RESPONSE_TYPE> getByName(final String completeName) throws IOException {
    Preconditions.checkNotNull(completeName, "Cannot search for a space with a null name");

    final List<RESPONSE_TYPE> partialNameMatch = getByPartialName(completeName);

    final List<RESPONSE_TYPE> exactNameMatch =
        partialNameMatch.stream()
            .filter(sr -> sr.getName().equals(completeName))
            .collect(Collectors.toList());

    if (exactNameMatch.size() == 0) {
      return Optional.empty();
    } else if (exactNameMatch.size() == 1) {
      return Optional.of(exactNameMatch.get(0));
    } else {
      throw new IllegalStateException(
          "Octopus Server reports more than 1 space with an identical name");
    }
  }
}
