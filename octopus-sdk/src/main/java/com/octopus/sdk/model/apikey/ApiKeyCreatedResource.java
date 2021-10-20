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

package com.octopus.sdk.model.apikey;

import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class ApiKeyCreatedResource extends BaseResource {
  @SerializedName("ApiKey")
  private String apiKey;

  @SerializedName("Created")
  private OffsetDateTime created;

  @SerializedName("Expires")
  private OffsetDateTime expires;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("Purpose")
  private String purpose;

  @SerializedName("UserId")
  private String userId;

  public ApiKeyCreatedResource apiKey(String apiKey) {

    this.apiKey = apiKey;
    return this;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ApiKeyCreatedResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ApiKeyCreatedResource expires(OffsetDateTime expires) {

    this.expires = expires;
    return this;
  }

  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public ApiKeyCreatedResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ApiKeyCreatedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public ApiKeyCreatedResource purpose(String purpose) {

    this.purpose = purpose;
    return this;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public ApiKeyCreatedResource userId(String userId) {

    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreatedResource apiKeyCreatedResource = (ApiKeyCreatedResource) o;
    return Objects.equals(this.apiKey, apiKeyCreatedResource.apiKey)
        && Objects.equals(this.created, apiKeyCreatedResource.created)
        && Objects.equals(this.expires, apiKeyCreatedResource.expires)
        && Objects.equals(this.getId(), apiKeyCreatedResource.getId())
        && Objects.equals(this.lastModifiedBy, apiKeyCreatedResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, apiKeyCreatedResource.lastModifiedOn)
        && Objects.equals(this.getLinks(), apiKeyCreatedResource.getLinks())
        && Objects.equals(this.purpose, apiKeyCreatedResource.purpose)
        && Objects.equals(this.userId, apiKeyCreatedResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiKey,
        created,
        expires,
        getId(),
        lastModifiedBy,
        lastModifiedOn,
        getLinks(),
        purpose,
        userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreatedResource {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
