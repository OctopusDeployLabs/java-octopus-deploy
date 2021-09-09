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
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.users.UserResourcePaginatedCollection;
import com.octopus.sdk.model.users.UserResourceWithLinks;

import java.io.IOException;

public class UsersApi
    extends BaseResourceApi<
        UserResourceWithLinks, UserResourceWithLinks, UserResourcePaginatedCollection> {

  private final String currentUserPath;

  public UsersApi(final OctopusClient client, final String rootPath, final String currentUserPath) {
    super(client, rootPath, UserResourceWithLinks.class, UserResourcePaginatedCollection.class);
    this.currentUserPath = currentUserPath;
  }

  public static UsersApi create(final OctopusClient client) throws IOException {
    final RootDocument rootDoc = client.getRootDocument();
    return new UsersApi(client, rootDoc.getUsersLink(), rootDoc.getCurrentUserLink());
  }

  public UserResourceWithLinks getCurrentUser() throws IOException {
    return client.get(RequestEndpoint.fromPath(currentUserPath), UserResourceWithLinks.class);
  }
}
