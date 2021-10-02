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

package com.octopus.sdk.model.deployments;

import com.octopus.openapi.model.ReleaseChangesResource;
import com.octopus.openapi.model.RetentionPeriod;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** DeploymentResource */
@SuppressWarnings("UnusedVariable")
public class DeploymentResource extends NamedResource {

  @SerializedName("Changes")
  private List<ReleaseChangesResource> changes = null;

  @SerializedName("ChangesMarkdown")
  private String changesMarkdown;

  @SerializedName("ChannelId")
  private String channelId;

  @SerializedName("Comments")
  private String comments;

  @SerializedName("Created")
  private OffsetDateTime created;

  @SerializedName("DeployedBy")
  private String deployedBy;

  @SerializedName("DeployedById")
  private String deployedById;

  @SerializedName("DeployedToMachineIds")
  private Set<String> deployedToMachineIds = null;

  @SerializedName("DeploymentProcessId")
  private String deploymentProcessId;

  @SerializedName("EnvironmentId")
  private String environmentId;

  @SerializedName("ExcludedMachineIds")
  private Set<String> excludedMachineIds = null;

  @SerializedName("FailureEncountered")
  private Boolean failureEncountered;

  @SerializedName("ForcePackageDownload")
  private Boolean forcePackageDownload;

  @SerializedName("ForcePackageRedeployment")
  private Boolean forcePackageRedeployment;

  @SerializedName("FormValues")
  private Map<String, String> formValues = null;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("ManifestVariableSetId")
  private String manifestVariableSetId;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("QueueTime")
  private OffsetDateTime queueTime;

  @SerializedName("QueueTimeExpiry")
  private OffsetDateTime queueTimeExpiry;

  @SerializedName("ReleaseId")
  private String releaseId;

  @SerializedName("SkipActions")
  private Set<String> skipActions = null;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("SpecificMachineIds")
  private Set<String> specificMachineIds = null;

  @SerializedName("TaskId")
  private String taskId;

  @SerializedName("TenantId")
  private String tenantId;

  @SerializedName("TentacleRetentionPeriod")
  private RetentionPeriod tentacleRetentionPeriod;

  @SerializedName("UseGuidedFailure")
  private Boolean useGuidedFailure;

  public DeploymentResource(final String name) {
    super(name);
  }

  public DeploymentResource changes(List<ReleaseChangesResource> changes) {

    this.changes = changes;
    return this;
  }

  public DeploymentResource addChangesItem(ReleaseChangesResource changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  public List<ReleaseChangesResource> getChanges() {
    return changes;
  }

  public void setChanges(List<ReleaseChangesResource> changes) {
    this.changes = changes;
  }

  public DeploymentResource changesMarkdown(String changesMarkdown) {

    this.changesMarkdown = changesMarkdown;
    return this;
  }

  public String getChangesMarkdown() {
    return changesMarkdown;
  }

  public void setChangesMarkdown(String changesMarkdown) {
    this.changesMarkdown = changesMarkdown;
  }

  public DeploymentResource channelId(String channelId) {

    this.channelId = channelId;
    return this;
  }

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public DeploymentResource comments(String comments) {

    this.comments = comments;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public DeploymentResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DeploymentResource deployedBy(String deployedBy) {

    this.deployedBy = deployedBy;
    return this;
  }

  public String getDeployedBy() {
    return deployedBy;
  }

  public void setDeployedBy(String deployedBy) {
    this.deployedBy = deployedBy;
  }

  public DeploymentResource deployedById(String deployedById) {

    this.deployedById = deployedById;
    return this;
  }

  public String getDeployedById() {
    return deployedById;
  }

  public void setDeployedById(String deployedById) {
    this.deployedById = deployedById;
  }

  public DeploymentResource deployedToMachineIds(Set<String> deployedToMachineIds) {

    this.deployedToMachineIds = deployedToMachineIds;
    return this;
  }

  public DeploymentResource addDeployedToMachineIdsItem(String deployedToMachineIdsItem) {
    if (this.deployedToMachineIds == null) {
      this.deployedToMachineIds = new LinkedHashSet<>();
    }
    this.deployedToMachineIds.add(deployedToMachineIdsItem);
    return this;
  }

  public Set<String> getDeployedToMachineIds() {
    return deployedToMachineIds;
  }

  public void setDeployedToMachineIds(Set<String> deployedToMachineIds) {
    this.deployedToMachineIds = deployedToMachineIds;
  }

  public DeploymentResource deploymentProcessId(String deploymentProcessId) {

    this.deploymentProcessId = deploymentProcessId;
    return this;
  }

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public void setDeploymentProcessId(String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public DeploymentResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public DeploymentResource excludedMachineIds(Set<String> excludedMachineIds) {

    this.excludedMachineIds = excludedMachineIds;
    return this;
  }

  public DeploymentResource addExcludedMachineIdsItem(String excludedMachineIdsItem) {
    if (this.excludedMachineIds == null) {
      this.excludedMachineIds = new LinkedHashSet<>();
    }
    this.excludedMachineIds.add(excludedMachineIdsItem);
    return this;
  }

  public Set<String> getExcludedMachineIds() {
    return excludedMachineIds;
  }

  public void setExcludedMachineIds(Set<String> excludedMachineIds) {
    this.excludedMachineIds = excludedMachineIds;
  }

  public DeploymentResource failureEncountered(Boolean failureEncountered) {

    this.failureEncountered = failureEncountered;
    return this;
  }

  public Boolean getFailureEncountered() {
    return failureEncountered;
  }

  public void setFailureEncountered(Boolean failureEncountered) {
    this.failureEncountered = failureEncountered;
  }

  public DeploymentResource forcePackageDownload(Boolean forcePackageDownload) {

    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public Boolean getForcePackageDownload() {
    return forcePackageDownload;
  }

  public void setForcePackageDownload(Boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
  }

  public DeploymentResource forcePackageRedeployment(Boolean forcePackageRedeployment) {

    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  public Boolean getForcePackageRedeployment() {
    return forcePackageRedeployment;
  }

  public void setForcePackageRedeployment(Boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
  }

  public DeploymentResource formValues(Map<String, String> formValues) {

    this.formValues = formValues;
    return this;
  }

  public DeploymentResource putFormValuesItem(final String key, String formValuesItem) {
    if (this.formValues == null) {
      this.formValues = new HashMap<>();
    }
    this.formValues.put(key, formValuesItem);
    return this;
  }

  public Map<String, String> getFormValues() {
    return formValues;
  }

  public void setFormValues(Map<String, String> formValues) {
    this.formValues = formValues;
  }

  public DeploymentResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public DeploymentResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public DeploymentResource manifestVariableSetId(String manifestVariableSetId) {

    this.manifestVariableSetId = manifestVariableSetId;
    return this;
  }

  public String getManifestVariableSetId() {
    return manifestVariableSetId;
  }

  public void setManifestVariableSetId(String manifestVariableSetId) {
    this.manifestVariableSetId = manifestVariableSetId;
  }

  public DeploymentResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public DeploymentResource queueTime(OffsetDateTime queueTime) {

    this.queueTime = queueTime;
    return this;
  }

  public OffsetDateTime getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(OffsetDateTime queueTime) {
    this.queueTime = queueTime;
  }

  public DeploymentResource queueTimeExpiry(OffsetDateTime queueTimeExpiry) {

    this.queueTimeExpiry = queueTimeExpiry;
    return this;
  }

  public OffsetDateTime getQueueTimeExpiry() {
    return queueTimeExpiry;
  }

  public void setQueueTimeExpiry(OffsetDateTime queueTimeExpiry) {
    this.queueTimeExpiry = queueTimeExpiry;
  }

  public DeploymentResource releaseId(String releaseId) {

    this.releaseId = releaseId;
    return this;
  }

  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) {
    this.releaseId = releaseId;
  }

  public DeploymentResource skipActions(Set<String> skipActions) {

    this.skipActions = skipActions;
    return this;
  }

  public DeploymentResource addSkipActionsItem(String skipActionsItem) {
    if (this.skipActions == null) {
      this.skipActions = new LinkedHashSet<>();
    }
    this.skipActions.add(skipActionsItem);
    return this;
  }

  public Set<String> getSkipActions() {
    return skipActions;
  }

  public void setSkipActions(Set<String> skipActions) {
    this.skipActions = skipActions;
  }

  public DeploymentResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public DeploymentResource specificMachineIds(Set<String> specificMachineIds) {

    this.specificMachineIds = specificMachineIds;
    return this;
  }

  public DeploymentResource addSpecificMachineIdsItem(String specificMachineIdsItem) {
    if (this.specificMachineIds == null) {
      this.specificMachineIds = new LinkedHashSet<>();
    }
    this.specificMachineIds.add(specificMachineIdsItem);
    return this;
  }

  public Set<String> getSpecificMachineIds() {
    return specificMachineIds;
  }

  public void setSpecificMachineIds(Set<String> specificMachineIds) {
    this.specificMachineIds = specificMachineIds;
  }

  public DeploymentResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public DeploymentResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public DeploymentResource tentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {

    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
    return this;
  }

  public RetentionPeriod getTentacleRetentionPeriod() {
    return tentacleRetentionPeriod;
  }

  public void setTentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {
    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
  }

  public DeploymentResource useGuidedFailure(Boolean useGuidedFailure) {

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
    DeploymentResource deploymentResource = (DeploymentResource) o;
    return Objects.equals(this.changes, deploymentResource.changes)
        && Objects.equals(this.changesMarkdown, deploymentResource.changesMarkdown)
        && Objects.equals(this.channelId, deploymentResource.channelId)
        && Objects.equals(this.comments, deploymentResource.comments)
        && Objects.equals(this.created, deploymentResource.created)
        && Objects.equals(this.deployedBy, deploymentResource.deployedBy)
        && Objects.equals(this.deployedById, deploymentResource.deployedById)
        && Objects.equals(this.deployedToMachineIds, deploymentResource.deployedToMachineIds)
        && Objects.equals(this.deploymentProcessId, deploymentResource.deploymentProcessId)
        && Objects.equals(this.environmentId, deploymentResource.environmentId)
        && Objects.equals(this.excludedMachineIds, deploymentResource.excludedMachineIds)
        && Objects.equals(this.failureEncountered, deploymentResource.failureEncountered)
        && Objects.equals(this.forcePackageDownload, deploymentResource.forcePackageDownload)
        && Objects.equals(
            this.forcePackageRedeployment, deploymentResource.forcePackageRedeployment)
        && Objects.equals(this.formValues, deploymentResource.formValues)
        && Objects.equals(this.lastModifiedBy, deploymentResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, deploymentResource.lastModifiedOn)
        && Objects.equals(this.manifestVariableSetId, deploymentResource.manifestVariableSetId)
        && Objects.equals(this.projectId, deploymentResource.projectId)
        && Objects.equals(this.queueTime, deploymentResource.queueTime)
        && Objects.equals(this.queueTimeExpiry, deploymentResource.queueTimeExpiry)
        && Objects.equals(this.releaseId, deploymentResource.releaseId)
        && Objects.equals(this.skipActions, deploymentResource.skipActions)
        && Objects.equals(this.spaceId, deploymentResource.spaceId)
        && Objects.equals(this.specificMachineIds, deploymentResource.specificMachineIds)
        && Objects.equals(this.taskId, deploymentResource.taskId)
        && Objects.equals(this.tenantId, deploymentResource.tenantId)
        && Objects.equals(this.tentacleRetentionPeriod, deploymentResource.tentacleRetentionPeriod)
        && Objects.equals(this.useGuidedFailure, deploymentResource.useGuidedFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changes,
        changesMarkdown,
        channelId,
        comments,
        created,
        deployedBy,
        deployedById,
        deployedToMachineIds,
        deploymentProcessId,
        environmentId,
        excludedMachineIds,
        failureEncountered,
        forcePackageDownload,
        forcePackageRedeployment,
        formValues,
        lastModifiedBy,
        lastModifiedOn,
        manifestVariableSetId,
        projectId,
        queueTime,
        queueTimeExpiry,
        releaseId,
        skipActions,
        spaceId,
        specificMachineIds,
        taskId,
        tenantId,
        tentacleRetentionPeriod,
        useGuidedFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResource {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    changesMarkdown: ").append(toIndentedString(changesMarkdown)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deployedBy: ").append(toIndentedString(deployedBy)).append("\n");
    sb.append("    deployedById: ").append(toIndentedString(deployedById)).append("\n");
    sb.append("    deployedToMachineIds: ")
        .append(toIndentedString(deployedToMachineIds))
        .append("\n");
    sb.append("    deploymentProcessId: ")
        .append(toIndentedString(deploymentProcessId))
        .append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    excludedMachineIds: ").append(toIndentedString(excludedMachineIds)).append("\n");
    sb.append("    failureEncountered: ").append(toIndentedString(failureEncountered)).append("\n");
    sb.append("    forcePackageDownload: ")
        .append(toIndentedString(forcePackageDownload))
        .append("\n");
    sb.append("    forcePackageRedeployment: ")
        .append(toIndentedString(forcePackageRedeployment))
        .append("\n");
    sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    manifestVariableSetId: ")
        .append(toIndentedString(manifestVariableSetId))
        .append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    queueTimeExpiry: ").append(toIndentedString(queueTimeExpiry)).append("\n");
    sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
    sb.append("    skipActions: ").append(toIndentedString(skipActions)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    specificMachineIds: ").append(toIndentedString(specificMachineIds)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tentacleRetentionPeriod: ")
        .append(toIndentedString(tentacleRetentionPeriod))
        .append("\n");
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
