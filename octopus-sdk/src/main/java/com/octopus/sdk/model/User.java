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

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.IdentityResource;

import java.time.OffsetDateTime;
import java.util.List;

public class User extends BaseResource {

  @SerializedName("CanPasswordBeEdited")
  private Boolean canPasswordBeEdited;

  @SerializedName("DisplayName")
  private String displayName;

  @SerializedName("EmailAddress")
  private String emailAddress;

  @SerializedName("Identities")
  private List<IdentityResource> identities = null;

  @SerializedName("IsActive")
  private Boolean isActive;

  @SerializedName("IsRequestor")
  private Boolean isRequestor;

  @SerializedName("IsService")
  private Boolean isService;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("Password")
  private String password;

  @SerializedName("Username")
  private String username;

  public String getApiKeysLink() {
    return getCleansedLink("ApiKeys");
  }

  public String getAvatarLink() {
    return getCleansedLink("Avatar");
  }

  public String getPermissionsLink() {
    return getCleansedLink("Permissions");
  }

  public String getPermissionsConfigurationLink() {
    return getCleansedLink("PermissionsConfiguration");
  }

  public String getSelfLink() {
    return getCleansedLink("Self");
  }

  public String getSpacesLink() {
    return getCleansedLink("Spaces");
  }

  public String getTeamsLink() {
    return getCleansedLink("Teams");
  }
}
