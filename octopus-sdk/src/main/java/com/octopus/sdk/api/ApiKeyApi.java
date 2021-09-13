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

import com.octopus.openapi.model.ApiKeyCreatedResource;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.apikey.ApiKeyPaginatedCollection;
import com.octopus.sdk.model.apikey.ApiKeyResource;
import com.octopus.sdk.model.users.UserResourceWithLinks;

import java.io.IOException;
import java.time.Instant;

import com.google.common.base.Preconditions;

public class ApiKeyApi
    extends BaseResourceApi<ApiKeyResource, ApiKeyResource, ApiKeyPaginatedCollection> {

  public ApiKeyApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, ApiKeyResource.class, ApiKeyPaginatedCollection.class);
  }

  public static ApiKeyApi create(final OctopusClient client, final UserResourceWithLinks user) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(user, "Cannot create a ApiKey for a 'null' User.");
    return new ApiKeyApi(client, user.getApiKeysLink());
  }

  @Override
  public ApiKeyResource create(final ApiKeyResource resourceToCreate) throws IOException {
    throw new UnsupportedOperationException(
        "ApiKeys cannot be created via this interface, it must be conducted via 'addKey' function.");
  }

  public ApiKeyCreatedResource createApiKeyForUser(final String purpose, final Instant expiry)
      throws IOException {
    final ApiKeyCreatedResource keyCreationInputParams = new ApiKeyCreatedResource();
    keyCreationInputParams.setPurpose(purpose);
    // NOTE: Cannot set the expiry atm, as Gson inside of openApiGenerator is not configured to
    // serialise instants.
    // keyCreationInputParams.setExpires(OffsetDateTime.ofInstant(expiry, ZoneOffset.UTC));
    return client.post(
        RequestEndpoint.fromPath(rootPath), keyCreationInputParams, ApiKeyCreatedResource.class);
  }
}
