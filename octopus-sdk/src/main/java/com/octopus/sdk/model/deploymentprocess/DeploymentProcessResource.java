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


package com.octopus.sdk.model.deploymentprocess;

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.DeploymentStepResource;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * DeploymentProcessResource
 */
@SuppressWarnings("UnusedVariable")
public class DeploymentProcessResource extends BaseResource {

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LastSnapshotId")
  private String lastSnapshotId;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("Steps")
  private List<DeploymentStepResource> steps = new ArrayList<>();

  @SerializedName("Version")
  private Integer version;

  public DeploymentProcessResource lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public DeploymentProcessResource lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }


  public DeploymentProcessResource lastSnapshotId(String lastSnapshotId) {
    
    this.lastSnapshotId = lastSnapshotId;
    return this;
  }

  public String getLastSnapshotId() {
    return lastSnapshotId;
  }

  public void setLastSnapshotId(String lastSnapshotId) {
    this.lastSnapshotId = lastSnapshotId;
  }


  public DeploymentProcessResource projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public DeploymentProcessResource spaceId(String spaceId) {
    
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }


  public DeploymentProcessResource steps(List<DeploymentStepResource> steps) {
    
    this.steps = steps;
    return this;
  }

  public DeploymentProcessResource addStepsItem(DeploymentStepResource stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

  public List<DeploymentStepResource> getSteps() {
    return steps;
  }

  public void setSteps(List<DeploymentStepResource> steps) {
    this.steps = steps;
  }


  public DeploymentProcessResource version(Integer version) {
    
    this.version = version;
    return this;
  }

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentProcessResource deploymentProcessResource = (DeploymentProcessResource) o;
    return Objects.equals(this.getId(), deploymentProcessResource.getId()) &&
        Objects.equals(this.lastModifiedBy, deploymentProcessResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, deploymentProcessResource.lastModifiedOn) &&
        Objects.equals(this.lastSnapshotId, deploymentProcessResource.lastSnapshotId) &&
        Objects.equals(this.getLinks(), deploymentProcessResource.getLinks()) &&
        Objects.equals(this.projectId, deploymentProcessResource.projectId) &&
        Objects.equals(this.spaceId, deploymentProcessResource.spaceId) &&
        Objects.equals(this.steps, deploymentProcessResource.steps) &&
        Objects.equals(this.version, deploymentProcessResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), lastModifiedBy, lastModifiedOn, lastSnapshotId, getLinks(), projectId, spaceId, steps,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentProcessResource {\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lastSnapshotId: ").append(toIndentedString(lastSnapshotId)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

