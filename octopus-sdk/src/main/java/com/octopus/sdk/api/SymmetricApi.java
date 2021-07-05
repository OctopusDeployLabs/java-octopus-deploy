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
import com.octopus.sdk.model.NamedResource;
import com.octopus.sdk.model.PaginatedCollection;

public class SymmetricApi<
        RESOURCE_TYPE extends NamedResource,
        PAGINATION_TYPE extends PaginatedCollection<RESOURCE_TYPE>>
    extends BaseNamedResourceApi<RESOURCE_TYPE, RESOURCE_TYPE, PAGINATION_TYPE> {

  public SymmetricApi(
      final OctopusClient client,
      final String rootPath,
      final Class<RESOURCE_TYPE> responseType,
      final Class<PAGINATION_TYPE> collectionType) {
    super(client, rootPath, responseType, collectionType);
  }
}
