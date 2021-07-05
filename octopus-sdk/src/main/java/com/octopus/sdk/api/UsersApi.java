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
import com.octopus.openapi.model.UserResourceCollection;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.users.User;

import java.io.IOException;
import java.time.Instant;

public class UsersApi {

  private final UserResourceCollection resources;
  private final OctopusClient client;

  public UsersApi(final OctopusClient client, final UserResourceCollection resources) {
    this.resources = resources;
    this.client = client;
  }

  public static UsersApi create(final OctopusClient client) throws IOException {
    final RootDocument rootDoc = client.getRootDocument();

    final String usersPath = rootDoc.getUsersLink();
    final UserResourceCollection resources =
        client.get(RequestEndpoint.fromPath(usersPath), UserResourceCollection.class);

    return new UsersApi(client, resources);
  }

  public User getCurrentUser() throws IOException {
    final RootDocument rootDoc = client.getRootDocument();
    return client.get(RequestEndpoint.fromPath(rootDoc.getCurrentUserLink()), User.class);
  }

  public String createApiKeyForUser(final User user, final String purpose, final Instant expiry)
      throws IOException {
    final ApiKeyCreatedResource keyCreationInputParams = new ApiKeyCreatedResource();
    keyCreationInputParams.setPurpose(purpose);
    // NOTE: Cannot set the expiry atm, as Gson inside of openApiGenerator is not configured to
    // serialise instants.
    // keyCreationInputParams.setExpires(OffsetDateTime.ofInstant(expiry, ZoneOffset.UTC));
    final ApiKeyCreatedResource keyCreated =
        client.post(
            RequestEndpoint.fromPath(user.getApiKeysLink()),
            keyCreationInputParams,
            ApiKeyCreatedResource.class);
    return keyCreated.getApiKey();
  }

  public User getUserByUserId(final String userId) throws IOException {
    final String specificUserPath = getPathForUser(userId);
    return client.get(RequestEndpoint.fromPath(specificUserPath), User.class);
  }

  private String getPathForUser(final String userId) {
    return String.format("%s/%s", resources.getLinks().get("Self"), userId);
  }
}
