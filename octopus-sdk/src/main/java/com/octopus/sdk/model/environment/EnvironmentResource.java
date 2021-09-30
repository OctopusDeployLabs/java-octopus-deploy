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

package com.octopus.sdk.model.environment;

import com.octopus.openapi.model.ExtensionSettingsValues;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** EnvironmentResource */
@SuppressWarnings("UnusedVariable")
public class EnvironmentResource extends NamedResource {
  @SerializedName("AllowDynamicInfrastructure")
  private Boolean allowDynamicInfrastructure;

  @SerializedName("ExtensionSettings")
  private List<ExtensionSettingsValues> extensionSettings;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("SortOrder")
  private Integer sortOrder;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("UseGuidedFailure")
  private Boolean useGuidedFailure;

  public EnvironmentResource allowDynamicInfrastructure(Boolean allowDynamicInfrastructure) {

    this.allowDynamicInfrastructure = allowDynamicInfrastructure;
    return this;
  }

  public Boolean getAllowDynamicInfrastructure() {
    return allowDynamicInfrastructure;
  }

  public void setAllowDynamicInfrastructure(Boolean allowDynamicInfrastructure) {
    this.allowDynamicInfrastructure = allowDynamicInfrastructure;
  }

  public List<ExtensionSettingsValues> getExtensionSettings() {
    return extensionSettings;
  }

  public EnvironmentResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public EnvironmentResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public EnvironmentResource sortOrder(Integer sortOrder) {

    this.sortOrder = sortOrder;
    return this;
  }

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public EnvironmentResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public EnvironmentResource useGuidedFailure(Boolean useGuidedFailure) {

    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public Boolean getUseGuidedFailure() {
    return useGuidedFailure;
  }

  public void setUseGuidedFailure(Boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentResource environmentResource = (EnvironmentResource) o;
    return Objects.equals(
            this.allowDynamicInfrastructure, environmentResource.allowDynamicInfrastructure)
        && Objects.equals(this.extensionSettings, environmentResource.extensionSettings)
        && Objects.equals(this.lastModifiedBy, environmentResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, environmentResource.lastModifiedOn)
        && Objects.equals(this.sortOrder, environmentResource.sortOrder)
        && Objects.equals(this.spaceId, environmentResource.spaceId)
        && Objects.equals(this.useGuidedFailure, environmentResource.useGuidedFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowDynamicInfrastructure,
        extensionSettings,
        lastModifiedBy,
        lastModifiedOn,
        sortOrder,
        spaceId,
        useGuidedFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentResource {\n");
    sb.append("    allowDynamicInfrastructure: ")
        .append(toIndentedString(allowDynamicInfrastructure))
        .append("\n");
    sb.append("    extensionSettings: ").append(toIndentedString(extensionSettings)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    useGuidedFailure: ").append(toIndentedString(useGuidedFailure)).append("\n");
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
