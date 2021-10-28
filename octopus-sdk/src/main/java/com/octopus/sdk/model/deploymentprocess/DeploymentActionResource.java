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

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptySet;

import com.octopus.openapi.model.DeploymentActionCondition;
import com.octopus.openapi.model.DeploymentActionContainerResource;
import com.octopus.openapi.model.PropertyValueResource;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** DeploymentActionResource */
@SuppressWarnings({"UnusedVariable", "FieldCanBeFinal"})
public class DeploymentActionResource extends NamedResource {

  @SerializedName("ActionType")
  private String actionType;

  @SerializedName("CanBeUsedForProjectVersioning")
  private Boolean canBeUsedForProjectVersioning;

  @SerializedName("Channels")
  private Set<String> channels = emptySet();

  @SerializedName("Condition")
  private DeploymentActionCondition condition;

  @SerializedName("Container")
  private DeploymentActionContainerResource container;

  @SerializedName("Environments")
  private Set<String> environments = emptySet();

  @SerializedName("ExcludedEnvironments")
  private Set<String> excludedEnvironments = emptySet();

  @SerializedName("IsDisabled")
  private Boolean isDisabled;

  @SerializedName("IsRequired")
  private Boolean isRequired;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("Notes")
  private String notes;

  @SerializedName("Packages")
  private List<PackageReference> packages = emptyList();

  @SerializedName("Properties")
  private Map<String, PropertyValueResource> properties = emptyMap();

  @SerializedName("TenantTags")
  private Set<String> tenantTags = emptySet();

  @SerializedName("WorkerPoolId")
  private String workerPoolId;

  @SerializedName("WorkerPoolVariable")
  private String workerPoolVariable;

  public DeploymentActionResource(final String name) {
    super(name);
  }

  public DeploymentActionResource actionType(String actionType) {

    this.actionType = actionType;
    return this;
  }

  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public DeploymentActionResource canBeUsedForProjectVersioning(
      Boolean canBeUsedForProjectVersioning) {

    this.canBeUsedForProjectVersioning = canBeUsedForProjectVersioning;
    return this;
  }

  public Boolean getCanBeUsedForProjectVersioning() {
    return canBeUsedForProjectVersioning;
  }

  public void setCanBeUsedForProjectVersioning(Boolean canBeUsedForProjectVersioning) {
    this.canBeUsedForProjectVersioning = canBeUsedForProjectVersioning;
  }

  public Set<String> getChannels() {
    return channels;
  }

  public DeploymentActionResource condition(DeploymentActionCondition condition) {

    this.condition = condition;
    return this;
  }

  public DeploymentActionCondition getCondition() {
    return condition;
  }

  public void setCondition(DeploymentActionCondition condition) {
    this.condition = condition;
  }

  public DeploymentActionResource container(DeploymentActionContainerResource container) {

    this.container = container;
    return this;
  }

  public DeploymentActionContainerResource getContainer() {
    return container;
  }

  public void setContainer(DeploymentActionContainerResource container) {
    this.container = container;
  }

  public Set<String> getEnvironments() {
    return environments;
  }

  public Set<String> getExcludedEnvironments() {
    return excludedEnvironments;
  }

  public DeploymentActionResource isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public DeploymentActionResource isRequired(Boolean isRequired) {

    this.isRequired = isRequired;
    return this;
  }

  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public DeploymentActionResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public DeploymentActionResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public DeploymentActionResource notes(String notes) {

    this.notes = notes;
    return this;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DeploymentActionResource packages(List<PackageReference> packages) {

    this.packages = packages;
    return this;
  }

  public DeploymentActionResource addPackagesItem(PackageReference packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  public List<PackageReference> getPackages() {
    return packages;
  }

  public void setPackages(List<PackageReference> packages) {
    this.packages = packages;
  }

  public Map<String, PropertyValueResource> getProperties() {
    return properties;
  }

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public DeploymentActionResource workerPoolId(String workerPoolId) {

    this.workerPoolId = workerPoolId;
    return this;
  }

  public String getWorkerPoolId() {
    return workerPoolId;
  }

  public void setWorkerPoolId(String workerPoolId) {
    this.workerPoolId = workerPoolId;
  }

  public DeploymentActionResource workerPoolVariable(String workerPoolVariable) {

    this.workerPoolVariable = workerPoolVariable;
    return this;
  }

  public String getWorkerPoolVariable() {
    return workerPoolVariable;
  }

  public void setWorkerPoolVariable(String workerPoolVariable) {
    this.workerPoolVariable = workerPoolVariable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActionResource deploymentActionResource = (DeploymentActionResource) o;
    return Objects.equals(this.actionType, deploymentActionResource.actionType)
        && Objects.equals(
            this.canBeUsedForProjectVersioning,
            deploymentActionResource.canBeUsedForProjectVersioning)
        && Objects.equals(this.channels, deploymentActionResource.channels)
        && Objects.equals(this.condition, deploymentActionResource.condition)
        && Objects.equals(this.container, deploymentActionResource.container)
        && Objects.equals(this.environments, deploymentActionResource.environments)
        && Objects.equals(this.excludedEnvironments, deploymentActionResource.excludedEnvironments)
        && Objects.equals(this.getId(), deploymentActionResource.getId())
        && Objects.equals(this.isDisabled, deploymentActionResource.isDisabled)
        && Objects.equals(this.isRequired, deploymentActionResource.isRequired)
        && Objects.equals(this.lastModifiedBy, deploymentActionResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, deploymentActionResource.lastModifiedOn)
        && Objects.equals(this.getLinks(), deploymentActionResource.getLinks())
        && Objects.equals(this.getName(), deploymentActionResource.getName())
        && Objects.equals(this.notes, deploymentActionResource.notes)
        && Objects.equals(this.packages, deploymentActionResource.packages)
        && Objects.equals(this.properties, deploymentActionResource.properties)
        && Objects.equals(this.tenantTags, deploymentActionResource.tenantTags)
        && Objects.equals(this.workerPoolId, deploymentActionResource.workerPoolId)
        && Objects.equals(this.workerPoolVariable, deploymentActionResource.workerPoolVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType,
        canBeUsedForProjectVersioning,
        channels,
        condition,
        container,
        environments,
        excludedEnvironments,
        getId(),
        isDisabled,
        isRequired,
        lastModifiedBy,
        lastModifiedOn,
        getLinks(),
        getName(),
        notes,
        packages,
        properties,
        tenantTags,
        workerPoolId,
        workerPoolVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentActionResource {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    canBeUsedForProjectVersioning: ")
        .append(toIndentedString(canBeUsedForProjectVersioning))
        .append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    excludedEnvironments: ")
        .append(toIndentedString(excludedEnvironments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    tenantTags: ").append(toIndentedString(tenantTags)).append("\n");
    sb.append("    workerPoolId: ").append(toIndentedString(workerPoolId)).append("\n");
    sb.append("    workerPoolVariable: ").append(toIndentedString(workerPoolVariable)).append("\n");
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
