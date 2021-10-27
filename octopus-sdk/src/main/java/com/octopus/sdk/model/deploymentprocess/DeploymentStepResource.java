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

import com.octopus.sdk.model.NamedResource;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** DeploymentStepResource */
@SuppressWarnings({"UnusedVariable", "FieldCanBeFinal"})
public class DeploymentStepResource extends NamedResource {
  @SerializedName("Actions")
  private List<DeploymentActionResource> actions = null;

  @SerializedName("Condition")
  private DeploymentStepCondition condition;

  @SerializedName("PackageRequirement")
  private DeploymentStepPackageRequirement packageRequirement;

  @SerializedName("Properties")
  private Map<String, PropertyValueResource> properties = null;

  @SerializedName("StartTrigger")
  private DeploymentStepStartTrigger startTrigger;

  public DeploymentStepResource(final String name) {
    super(name);
  }

  public List<DeploymentActionResource> getActions() {
    return actions;
  }

  public DeploymentStepResource condition(DeploymentStepCondition condition) {

    this.condition = condition;
    return this;
  }

  public DeploymentStepCondition getCondition() {
    return condition;
  }

  public void setCondition(DeploymentStepCondition condition) {
    this.condition = condition;
  }

  public DeploymentStepResource packageRequirement(
      DeploymentStepPackageRequirement packageRequirement) {

    this.packageRequirement = packageRequirement;
    return this;
  }

  public DeploymentStepPackageRequirement getPackageRequirement() {
    return packageRequirement;
  }

  public void setPackageRequirement(DeploymentStepPackageRequirement packageRequirement) {
    this.packageRequirement = packageRequirement;
  }

  public Map<String, PropertyValueResource> getProperties() {
    return properties;
  }

  public DeploymentStepResource startTrigger(DeploymentStepStartTrigger startTrigger) {

    this.startTrigger = startTrigger;
    return this;
  }

  public DeploymentStepStartTrigger getStartTrigger() {
    return startTrigger;
  }

  public void setStartTrigger(DeploymentStepStartTrigger startTrigger) {
    this.startTrigger = startTrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentStepResource deploymentStepResource = (DeploymentStepResource) o;
    return Objects.equals(this.actions, deploymentStepResource.actions)
        && Objects.equals(this.condition, deploymentStepResource.condition)
        && Objects.equals(this.getId(), deploymentStepResource.getId())
        && Objects.equals(this.getName(), deploymentStepResource.getName())
        && Objects.equals(this.packageRequirement, deploymentStepResource.packageRequirement)
        && Objects.equals(this.properties, deploymentStepResource.properties)
        && Objects.equals(this.startTrigger, deploymentStepResource.startTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actions, condition, getId(), getName(), packageRequirement, properties, startTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentStepResource {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    packageRequirement: ").append(toIndentedString(packageRequirement)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    startTrigger: ").append(toIndentedString(startTrigger)).append("\n");
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
