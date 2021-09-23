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


package com.octopus.sdk.model.projectgroup;

import com.google.gson.annotations.SerializedName;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * ProjectGroupResource
 */
@SuppressWarnings("UnusedVariable")
public class ProjectGroupResource extends NamedResource {
  @SerializedName("EnvironmentIds")
  private Set<String> environmentIds;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("RetentionPolicyId")
  private String retentionPolicyId;

  @SerializedName("SpaceId")
  private String spaceId;

  public ProjectGroupResource environmentIds(Set<String> environmentIds) {
    
    this.environmentIds = environmentIds;
    return this;
  }

  public ProjectGroupResource addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }


  public ProjectGroupResource lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public ProjectGroupResource lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public ProjectGroupResource retentionPolicyId(String retentionPolicyId) {
    
    this.retentionPolicyId = retentionPolicyId;
    return this;
  }

  public String getRetentionPolicyId() {
    return retentionPolicyId;
  }

  public void setRetentionPolicyId(String retentionPolicyId) {
    this.retentionPolicyId = retentionPolicyId;
  }


  public ProjectGroupResource spaceId(String spaceId) {
    
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectGroupResource projectGroupResource = (ProjectGroupResource) o;
    return Objects.equals(this.environmentIds, projectGroupResource.environmentIds) &&
        Objects.equals(this.lastModifiedBy, projectGroupResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, projectGroupResource.lastModifiedOn) &&
        Objects.equals(this.retentionPolicyId, projectGroupResource.retentionPolicyId) &&
        Objects.equals(this.spaceId, projectGroupResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentIds, lastModifiedBy, lastModifiedOn, retentionPolicyId, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectGroupResource {\n");
    sb.append("    environmentIds: ").append(toIndentedString(environmentIds)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    retentionPolicyId: ").append(toIndentedString(retentionPolicyId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

