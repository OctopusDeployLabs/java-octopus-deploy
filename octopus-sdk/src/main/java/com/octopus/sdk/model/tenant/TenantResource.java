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

package com.octopus.sdk.model.tenant;

import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class TenantResource extends NamedResource {
  @SerializedName("ClonedFromTenantId")
  private String clonedFromTenantId;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("ProjectEnvironments")
  private Map<String, Set<String>> projectEnvironments = null;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("TenantTags")
  private Set<String> tenantTags = null;

  public TenantResource(final String name) {
    super(name);
  }

  public TenantResource clonedFromTenantId(String clonedFromTenantId) {

    this.clonedFromTenantId = clonedFromTenantId;
    return this;
  }

  public String getClonedFromTenantId() {
    return clonedFromTenantId;
  }

  public void setClonedFromTenantId(String clonedFromTenantId) {
    this.clonedFromTenantId = clonedFromTenantId;
  }

  public TenantResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public TenantResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public TenantResource projectEnvironments(Map<String, Set<String>> projectEnvironments) {

    this.projectEnvironments = projectEnvironments;
    return this;
  }

  public TenantResource putProjectEnvironmentsItem(
      final String key, Set<String> projectEnvironmentsItem) {
    if (this.projectEnvironments == null) {
      this.projectEnvironments = new HashMap<>();
    }
    this.projectEnvironments.put(key, projectEnvironmentsItem);
    return this;
  }

  public Map<String, Set<String>> getProjectEnvironments() {
    return projectEnvironments;
  }

  public void setProjectEnvironments(Map<String, Set<String>> projectEnvironments) {
    this.projectEnvironments = projectEnvironments;
  }

  public TenantResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public TenantResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public TenantResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(Set<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantResource tenantResource = (TenantResource) o;
    return Objects.equals(this.clonedFromTenantId, tenantResource.clonedFromTenantId)
        && Objects.equals(this.lastModifiedBy, tenantResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, tenantResource.lastModifiedOn)
        && Objects.equals(this.projectEnvironments, tenantResource.projectEnvironments)
        && Objects.equals(this.spaceId, tenantResource.spaceId)
        && Objects.equals(this.tenantTags, tenantResource.tenantTags)
        && Objects.equals(this.getId(), tenantResource.getId())
        && Objects.equals(this.getName(), tenantResource.getName())
        && Objects.equals(this.getLinks(), tenantResource.getLinks())
        && Objects.equals(this.getDescription(), tenantResource.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clonedFromTenantId,
        lastModifiedBy,
        lastModifiedOn,
        projectEnvironments,
        spaceId,
        tenantTags,
        getId(),
        getName(),
        getDescription(),
        getLinks());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantResource {\n");
    sb.append("    clonedFromTenantId: ").append(toIndentedString(clonedFromTenantId)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    projectEnvironments: ")
        .append(toIndentedString(projectEnvironments))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tenantTags: ").append(toIndentedString(tenantTags)).append("\n");
    sb.append("    id: ").append(toIndentedString(this.getId())).append("\n");
    sb.append("    name: ").append(toIndentedString(this.getName())).append("\n");
    sb.append("    description: ").append(toIndentedString(this.getDescription())).append("\n");
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
