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

import com.octopus.openapi.model.DeploymentConnectivityPolicy;
import com.octopus.openapi.model.GuidedFailureMode;
import com.octopus.openapi.model.RunbookEnvironmentScope;
import com.octopus.openapi.model.RunbookRetentionPeriod;
import com.octopus.openapi.model.TenantedDeploymentMode;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** RunbookResource */
@SuppressWarnings("UnusedVariable")
public class RunbookResource extends NamedResource {
  @SerializedName("ConnectivityPolicy")
  private DeploymentConnectivityPolicy connectivityPolicy;

  @SerializedName("DefaultGuidedFailureMode")
  private GuidedFailureMode defaultGuidedFailureMode;

  @SerializedName("Environments")
  private Set<String> environments;

  @SerializedName("EnvironmentScope")
  private RunbookEnvironmentScope environmentScope;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("MultiTenancyMode")
  private TenantedDeploymentMode multiTenancyMode;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("PublishedRunbookSnapshotId")
  private String publishedRunbookSnapshotId;

  @SerializedName("RunbookProcessId")
  private String runbookProcessId;

  @SerializedName("RunRetentionPolicy")
  private RunbookRetentionPeriod runRetentionPolicy;

  @SerializedName("SpaceId")
  private String spaceId;

  public RunbookResource(final String name) {
    super(name);
  }

  public RunbookResource connectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {

    this.connectivityPolicy = connectivityPolicy;
    return this;
  }

  public DeploymentConnectivityPolicy getConnectivityPolicy() {
    return connectivityPolicy;
  }

  public void setConnectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {
    this.connectivityPolicy = connectivityPolicy;
  }

  public RunbookResource defaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {

    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
    return this;
  }

  public GuidedFailureMode getDefaultGuidedFailureMode() {
    return defaultGuidedFailureMode;
  }

  public void setDefaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {
    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
  }

  public Set<String> getEnvironments() {
    return environments;
  }

  public RunbookResource environmentScope(RunbookEnvironmentScope environmentScope) {

    this.environmentScope = environmentScope;
    return this;
  }

  public RunbookEnvironmentScope getEnvironmentScope() {
    return environmentScope;
  }

  public void setEnvironmentScope(RunbookEnvironmentScope environmentScope) {
    this.environmentScope = environmentScope;
  }

  public RunbookResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public RunbookResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public RunbookResource multiTenancyMode(TenantedDeploymentMode multiTenancyMode) {

    this.multiTenancyMode = multiTenancyMode;
    return this;
  }

  public TenantedDeploymentMode getMultiTenancyMode() {
    return multiTenancyMode;
  }

  public void setMultiTenancyMode(TenantedDeploymentMode multiTenancyMode) {
    this.multiTenancyMode = multiTenancyMode;
  }

  public RunbookResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RunbookResource publishedRunbookSnapshotId(String publishedRunbookSnapshotId) {

    this.publishedRunbookSnapshotId = publishedRunbookSnapshotId;
    return this;
  }

  public String getPublishedRunbookSnapshotId() {
    return publishedRunbookSnapshotId;
  }

  public void setPublishedRunbookSnapshotId(String publishedRunbookSnapshotId) {
    this.publishedRunbookSnapshotId = publishedRunbookSnapshotId;
  }

  public RunbookResource runbookProcessId(String runbookProcessId) {

    this.runbookProcessId = runbookProcessId;
    return this;
  }

  public String getRunbookProcessId() {
    return runbookProcessId;
  }

  public void setRunbookProcessId(String runbookProcessId) {
    this.runbookProcessId = runbookProcessId;
  }

  public RunbookResource runRetentionPolicy(RunbookRetentionPeriod runRetentionPolicy) {

    this.runRetentionPolicy = runRetentionPolicy;
    return this;
  }

  public RunbookRetentionPeriod getRunRetentionPolicy() {
    return runRetentionPolicy;
  }

  public void setRunRetentionPolicy(RunbookRetentionPeriod runRetentionPolicy) {
    this.runRetentionPolicy = runRetentionPolicy;
  }

  public RunbookResource spaceId(String spaceId) {

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
    RunbookResource runbookResource = (RunbookResource) o;
    return Objects.equals(this.connectivityPolicy, runbookResource.connectivityPolicy)
        && Objects.equals(this.defaultGuidedFailureMode, runbookResource.defaultGuidedFailureMode)
        && Objects.equals(this.environments, runbookResource.environments)
        && Objects.equals(this.environmentScope, runbookResource.environmentScope)
        && Objects.equals(this.lastModifiedBy, runbookResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, runbookResource.lastModifiedOn)
        && Objects.equals(this.multiTenancyMode, runbookResource.multiTenancyMode)
        && Objects.equals(this.projectId, runbookResource.projectId)
        && Objects.equals(
            this.publishedRunbookSnapshotId, runbookResource.publishedRunbookSnapshotId)
        && Objects.equals(this.runbookProcessId, runbookResource.runbookProcessId)
        && Objects.equals(this.runRetentionPolicy, runbookResource.runRetentionPolicy)
        && Objects.equals(this.spaceId, runbookResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectivityPolicy,
        defaultGuidedFailureMode,
        environments,
        environmentScope,
        lastModifiedBy,
        lastModifiedOn,
        multiTenancyMode,
        projectId,
        publishedRunbookSnapshotId,
        runbookProcessId,
        runRetentionPolicy,
        spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookResource {\n");
    sb.append("    connectivityPolicy: ").append(toIndentedString(connectivityPolicy)).append("\n");
    sb.append("    defaultGuidedFailureMode: ")
        .append(toIndentedString(defaultGuidedFailureMode))
        .append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    environmentScope: ").append(toIndentedString(environmentScope)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    multiTenancyMode: ").append(toIndentedString(multiTenancyMode)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    publishedRunbookSnapshotId: ")
        .append(toIndentedString(publishedRunbookSnapshotId))
        .append("\n");
    sb.append("    runbookProcessId: ").append(toIndentedString(runbookProcessId)).append("\n");
    sb.append("    runRetentionPolicy: ").append(toIndentedString(runRetentionPolicy)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
