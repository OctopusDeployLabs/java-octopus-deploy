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
import com.octopus.sdk.model.SensitiveValue;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** ApiKeyResource */
@SuppressWarnings("UnusedVariable")
public class ApiKeyResource extends BaseResource {
  @SerializedName("ApiKey")
  private SensitiveValue apiKey;

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

  public ApiKeyResource apiKey(SensitiveValue apiKey) {

    this.apiKey = apiKey;
    return this;
  }

  public SensitiveValue getApiKey() {
    return apiKey;
  }

  public void setApiKey(SensitiveValue apiKey) {
    this.apiKey = apiKey;
  }

  public ApiKeyResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public ApiKeyResource expires(OffsetDateTime expires) {

    this.expires = expires;
    return this;
  }

  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }

  public ApiKeyResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ApiKeyResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public ApiKeyResource purpose(String purpose) {

    this.purpose = purpose;
    return this;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public ApiKeyResource userId(String userId) {

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
    ApiKeyResource apiKeyResource = (ApiKeyResource) o;
    return Objects.equals(this.apiKey, apiKeyResource.apiKey)
        && Objects.equals(this.created, apiKeyResource.created)
        && Objects.equals(this.expires, apiKeyResource.expires)
        && Objects.equals(this.lastModifiedBy, apiKeyResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, apiKeyResource.lastModifiedOn)
        && Objects.equals(this.purpose, apiKeyResource.purpose)
        && Objects.equals(this.userId, apiKeyResource.userId)
        && Objects.equals(this.getId(), apiKeyResource.getId())
        && Objects.equals(this.getLinks(), apiKeyResource.getLinks());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiKey,
        created,
        expires,
        lastModifiedBy,
        lastModifiedOn,
        purpose,
        userId,
        getId(),
        getLinks());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyResource {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(this.getId())).append("\n");
    sb.append("    links: ").append(toIndentedString(this.getLinks())).append("\n");
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
