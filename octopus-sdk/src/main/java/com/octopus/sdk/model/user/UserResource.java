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

package com.octopus.sdk.model.user;

import com.octopus.openapi.model.IdentityResource;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings({"UnusedVariable", "FieldCanBeFinal"})
public class UserResource extends BaseResource {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final UserResource userResource = (UserResource) o;
    return Objects.equals(this.canPasswordBeEdited, userResource.canPasswordBeEdited)
        && Objects.equals(this.displayName, userResource.displayName)
        && Objects.equals(this.emailAddress, userResource.emailAddress)
        && Objects.equals(this.getId(), userResource.getId())
        && Objects.equals(this.identities, userResource.identities)
        && Objects.equals(this.isActive, userResource.isActive)
        && Objects.equals(this.isRequestor, userResource.isRequestor)
        && Objects.equals(this.isService, userResource.isService)
        && Objects.equals(this.lastModifiedBy, userResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, userResource.lastModifiedOn)
        && Objects.equals(this.getLinks(), userResource.getLinks())
        && Objects.equals(this.password, userResource.password)
        && Objects.equals(this.username, userResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canPasswordBeEdited,
        displayName,
        emailAddress,
        getId(),
        identities,
        isActive,
        isRequestor,
        isService,
        lastModifiedBy,
        lastModifiedOn,
        getLinks(),
        password,
        username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    sb.append("    canPasswordBeEdited: ")
        .append(toIndentedString(canPasswordBeEdited))
        .append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isRequestor: ").append(toIndentedString(isRequestor)).append("\n");
    sb.append("    isService: ").append(toIndentedString(isService)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
