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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class RunbookParameters {

  @SerializedName("SpecificMachineIds")
  private List<String> specificMachineIds;

  @SerializedName("ExcludedMachineIds")
  private List<String> excludedMachineIds;

  @SerializedName("TenantIds")
  private List<String> tenantIds;

  @SerializedName("TenantTagNames")
  private List<String> tenantTagNames;

  @SerializedName("SkipActions")
  private List<String> skipActions;

  @SerializedName("EnvironmentIds")
  private List<String> environmentIds;

  @SerializedName("FormValues")
  private Map<String, String> formValues;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("RunbookSnapshotNameOrId")
  private String runbookSnapshotNameOrId;

  @SerializedName("DeploymentEnvironmentId")
  private String deploymentEnvironmentId;

  public List<String> getSpecificMachineIds() {
    return specificMachineIds;
  }

  public List<String> getExcludedMachineIds() {
    return excludedMachineIds;
  }

  public List<String> getTenantIds() {
    return tenantIds;
  }

  public List<String> getTenantTagNames() {
    return tenantTagNames;
  }

  public List<String> getSkipActions() {
    return skipActions;
  }

  public List<String> getEnvironmentIds() {
    return environmentIds;
  }

  public Map<String, String> getFormValues() {
    return formValues;
  }

  public String getProjectId() {
    return projectId;
  }

  public String getRunbookSnapshotNameOrId() {
    return runbookSnapshotNameOrId;
  }

  public String getDeploymentEnvironmentId() {
    return deploymentEnvironmentId;
  }

  public void setSpecificMachineIds(final List<String> specificMachineIds) {
    this.specificMachineIds = specificMachineIds;
  }

  public void setExcludedMachineIds(final List<String> excludedMachineIds) {
    this.excludedMachineIds = excludedMachineIds;
  }

  public void setTenantIds(final List<String> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public void setTenantTagNames(final List<String> tenantTagNames) {
    this.tenantTagNames = tenantTagNames;
  }

  public void setSkipActions(final List<String> skipActions) {
    this.skipActions = skipActions;
  }

  public void setEnvironmentIds(final List<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public void setFormValues(final Map<String, String> formValues) {
    this.formValues = formValues;
  }

  public void setProjectId(final String projectId) {
    this.projectId = projectId;
  }

  public void setRunbookSnapshotNameOrId(final String runbookSnapshotNameOrId) {
    this.runbookSnapshotNameOrId = runbookSnapshotNameOrId;
  }

  public void setDeploymentEnvironmentId(final String deploymentEnvironmentId) {
    this.deploymentEnvironmentId = deploymentEnvironmentId;
  }
}
