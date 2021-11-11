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

package com.octopus.sdk.model.runbook;

import com.octopus.sdk.model.NamedResource;
import com.octopus.sdk.model.common.RetentionPeriod;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** RunbookRunResource */
@SuppressWarnings("UnusedVariable")
public class RunbookRunResource extends NamedResource {
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

  @SerializedName("EnvironmentId")
  private String environmentId;

  @SerializedName("ExcludedMachineIds")
  private Set<String> excludedMachineIds = null;

  @SerializedName("FailureEncountered")
  private Boolean failureEncountered;

  @SerializedName("ForcePackageDownload")
  private Boolean forcePackageDownload;

  @SerializedName("FormValues")
  private Map<String, String> formValues = null;

  @SerializedName("FrozenRunbookProcessId")
  private String frozenRunbookProcessId;

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

  @SerializedName("RunbookId")
  private String runbookId;

  @SerializedName("RunbookSnapshotId")
  private String runbookSnapshotId;

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

  public RunbookRunResource(final String name) {
    super(name);
  }

  public RunbookRunResource comments(String comments) {

    this.comments = comments;
    return this;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public RunbookRunResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public RunbookRunResource deployedBy(String deployedBy) {

    this.deployedBy = deployedBy;
    return this;
  }

  public String getDeployedBy() {
    return deployedBy;
  }

  public void setDeployedBy(String deployedBy) {
    this.deployedBy = deployedBy;
  }

  public RunbookRunResource deployedById(String deployedById) {

    this.deployedById = deployedById;
    return this;
  }

  public String getDeployedById() {
    return deployedById;
  }

  public void setDeployedById(String deployedById) {
    this.deployedById = deployedById;
  }

  public RunbookRunResource deployedToMachineIds(Set<String> deployedToMachineIds) {

    this.deployedToMachineIds = deployedToMachineIds;
    return this;
  }

  public RunbookRunResource addDeployedToMachineIdsItem(String deployedToMachineIdsItem) {
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

  public RunbookRunResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public RunbookRunResource excludedMachineIds(Set<String> excludedMachineIds) {

    this.excludedMachineIds = excludedMachineIds;
    return this;
  }

  public RunbookRunResource addExcludedMachineIdsItem(String excludedMachineIdsItem) {
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

  public RunbookRunResource failureEncountered(Boolean failureEncountered) {

    this.failureEncountered = failureEncountered;
    return this;
  }

  public Boolean getFailureEncountered() {
    return failureEncountered;
  }

  public void setFailureEncountered(Boolean failureEncountered) {
    this.failureEncountered = failureEncountered;
  }

  public RunbookRunResource forcePackageDownload(Boolean forcePackageDownload) {

    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public Boolean getForcePackageDownload() {
    return forcePackageDownload;
  }

  public void setForcePackageDownload(Boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
  }

  public RunbookRunResource formValues(Map<String, String> formValues) {

    this.formValues = formValues;
    return this;
  }

  public RunbookRunResource putFormValuesItem(final String key, String formValuesItem) {
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

  public RunbookRunResource frozenRunbookProcessId(String frozenRunbookProcessId) {

    this.frozenRunbookProcessId = frozenRunbookProcessId;
    return this;
  }

  public String getFrozenRunbookProcessId() {
    return frozenRunbookProcessId;
  }

  public void setFrozenRunbookProcessId(String frozenRunbookProcessId) {
    this.frozenRunbookProcessId = frozenRunbookProcessId;
  }

  public RunbookRunResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public RunbookRunResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public RunbookRunResource manifestVariableSetId(String manifestVariableSetId) {

    this.manifestVariableSetId = manifestVariableSetId;
    return this;
  }

  public String getManifestVariableSetId() {
    return manifestVariableSetId;
  }

  public void setManifestVariableSetId(String manifestVariableSetId) {
    this.manifestVariableSetId = manifestVariableSetId;
  }

  public RunbookRunResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RunbookRunResource queueTime(OffsetDateTime queueTime) {

    this.queueTime = queueTime;
    return this;
  }

  public OffsetDateTime getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(OffsetDateTime queueTime) {
    this.queueTime = queueTime;
  }

  public RunbookRunResource queueTimeExpiry(OffsetDateTime queueTimeExpiry) {

    this.queueTimeExpiry = queueTimeExpiry;
    return this;
  }

  public OffsetDateTime getQueueTimeExpiry() {
    return queueTimeExpiry;
  }

  public void setQueueTimeExpiry(OffsetDateTime queueTimeExpiry) {
    this.queueTimeExpiry = queueTimeExpiry;
  }

  public RunbookRunResource runbookId(String runbookId) {

    this.runbookId = runbookId;
    return this;
  }

  public String getRunbookId() {
    return runbookId;
  }

  public void setRunbookId(String runbookId) {
    this.runbookId = runbookId;
  }

  public RunbookRunResource runbookSnapshotId(String runbookSnapshotId) {

    this.runbookSnapshotId = runbookSnapshotId;
    return this;
  }

  public String getRunbookSnapshotId() {
    return runbookSnapshotId;
  }

  public void setRunbookSnapshotId(String runbookSnapshotId) {
    this.runbookSnapshotId = runbookSnapshotId;
  }

  public RunbookRunResource skipActions(Set<String> skipActions) {

    this.skipActions = skipActions;
    return this;
  }

  public RunbookRunResource addSkipActionsItem(String skipActionsItem) {
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

  public RunbookRunResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public RunbookRunResource specificMachineIds(Set<String> specificMachineIds) {

    this.specificMachineIds = specificMachineIds;
    return this;
  }

  public RunbookRunResource addSpecificMachineIdsItem(String specificMachineIdsItem) {
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

  public RunbookRunResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public RunbookRunResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public RunbookRunResource tentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {

    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
    return this;
  }

  public RetentionPeriod getTentacleRetentionPeriod() {
    return tentacleRetentionPeriod;
  }

  public void setTentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {
    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
  }

  public RunbookRunResource useGuidedFailure(Boolean useGuidedFailure) {

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
    RunbookRunResource runbookRunResource = (RunbookRunResource) o;
    return Objects.equals(this.comments, runbookRunResource.comments)
        && Objects.equals(this.created, runbookRunResource.created)
        && Objects.equals(this.deployedBy, runbookRunResource.deployedBy)
        && Objects.equals(this.deployedById, runbookRunResource.deployedById)
        && Objects.equals(this.deployedToMachineIds, runbookRunResource.deployedToMachineIds)
        && Objects.equals(this.environmentId, runbookRunResource.environmentId)
        && Objects.equals(this.excludedMachineIds, runbookRunResource.excludedMachineIds)
        && Objects.equals(this.failureEncountered, runbookRunResource.failureEncountered)
        && Objects.equals(this.forcePackageDownload, runbookRunResource.forcePackageDownload)
        && Objects.equals(this.formValues, runbookRunResource.formValues)
        && Objects.equals(this.frozenRunbookProcessId, runbookRunResource.frozenRunbookProcessId)
        && Objects.equals(this.lastModifiedBy, runbookRunResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, runbookRunResource.lastModifiedOn)
        && Objects.equals(this.manifestVariableSetId, runbookRunResource.manifestVariableSetId)
        && Objects.equals(this.projectId, runbookRunResource.projectId)
        && Objects.equals(this.queueTime, runbookRunResource.queueTime)
        && Objects.equals(this.queueTimeExpiry, runbookRunResource.queueTimeExpiry)
        && Objects.equals(this.runbookId, runbookRunResource.runbookId)
        && Objects.equals(this.runbookSnapshotId, runbookRunResource.runbookSnapshotId)
        && Objects.equals(this.skipActions, runbookRunResource.skipActions)
        && Objects.equals(this.spaceId, runbookRunResource.spaceId)
        && Objects.equals(this.specificMachineIds, runbookRunResource.specificMachineIds)
        && Objects.equals(this.taskId, runbookRunResource.taskId)
        && Objects.equals(this.tenantId, runbookRunResource.tenantId)
        && Objects.equals(this.tentacleRetentionPeriod, runbookRunResource.tentacleRetentionPeriod)
        && Objects.equals(this.useGuidedFailure, runbookRunResource.useGuidedFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comments,
        created,
        deployedBy,
        deployedById,
        deployedToMachineIds,
        environmentId,
        excludedMachineIds,
        failureEncountered,
        forcePackageDownload,
        formValues,
        frozenRunbookProcessId,
        lastModifiedBy,
        lastModifiedOn,
        manifestVariableSetId,
        projectId,
        queueTime,
        queueTimeExpiry,
        runbookId,
        runbookSnapshotId,
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
    sb.append("class RunbookRunResource {\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deployedBy: ").append(toIndentedString(deployedBy)).append("\n");
    sb.append("    deployedById: ").append(toIndentedString(deployedById)).append("\n");
    sb.append("    deployedToMachineIds: ")
        .append(toIndentedString(deployedToMachineIds))
        .append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    excludedMachineIds: ").append(toIndentedString(excludedMachineIds)).append("\n");
    sb.append("    failureEncountered: ").append(toIndentedString(failureEncountered)).append("\n");
    sb.append("    forcePackageDownload: ")
        .append(toIndentedString(forcePackageDownload))
        .append("\n");
    sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
    sb.append("    frozenRunbookProcessId: ")
        .append(toIndentedString(frozenRunbookProcessId))
        .append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    manifestVariableSetId: ")
        .append(toIndentedString(manifestVariableSetId))
        .append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    queueTimeExpiry: ").append(toIndentedString(queueTimeExpiry)).append("\n");
    sb.append("    runbookId: ").append(toIndentedString(runbookId)).append("\n");
    sb.append("    runbookSnapshotId: ").append(toIndentedString(runbookSnapshotId)).append("\n");
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
