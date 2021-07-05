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

package com.octopus.sdk.model;

import com.octopus.openapi.model.UserResource;

public class User extends UserResource {

  public String getApiKeysLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("ApiKeys")));
  }

  public String getAvatarLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("Avatar")));
  }

  public String getPermissionsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("Permissions")));
  }

  public String getPermissionsConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("PermissionsConfiguration")));
  }

  public String getSelfLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("Self")));
  }

  public String getSpacesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("Spaces")));
  }

  public String getTeamsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get(("Teams")));
  }
}
