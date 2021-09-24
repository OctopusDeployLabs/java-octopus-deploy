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

package com.octopus.sdk.model.commands;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class BaseCommandParameters {

  @SerializedName("projectIdOrName")
  private String projectIdOrName;

  @SerializedName("environmentIdsOrNames")
  private List<String> environmentNames;

  @SerializedName("tenants")
  private List<String> tenantIdsOrNames;

  @SerializedName("tenantTags")
  private List<String> tenantTags;

  @SerializedName("forcePackageDownload")
  private boolean forcePackageDownload;

  @SerializedName("specificMachineNames")
  private List<String> specificMachineNames;

  @SerializedName("excludedMachineNames")
  private List<String> excludeMachineNames;

  @SerializedName("skipStepNames")
  private List<String> skipStepNames;

  @SerializedName("useGuidedFailure")
  private boolean useGuidedFailure;

  @SerializedName("runAt")
  private Instant runAt;

  @SerializedName("noRunAfter")
  private Instant noRunAfter;

  @SerializedName("variables")
  private Map<String, String> variables;

  public BaseCommandParameters(final String projectIdOrName, final List<String> environmentNames) {
    Preconditions.checkNotNull(projectIdOrName, "projectName cannot be null");
    Preconditions.checkNotNull(environmentNames, "environmentNames cannot be null");
    Preconditions.checkArgument(
        !environmentNames.isEmpty(), "environmentNames list cannot be empty");

    this.projectIdOrName = projectIdOrName;
    this.environmentNames = environmentNames;
  }

  public void setProjectIdOrName(final String projectIdOrName) {
    this.projectIdOrName = projectIdOrName;
  }

  public void setEnvironmentNames(final List<String> environmentNames) {
    this.environmentNames = environmentNames;
  }

  public void setTenantIdsOrNames(final List<String> tenantIdsOrNames) {
    this.tenantIdsOrNames = tenantIdsOrNames;
  }

  public void setTenantTags(final List<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  public void setForcePackageDownload(final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
  }

  public void setSpecificMachineNames(final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
  }

  public void setExcludeMachineNames(final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
  }

  public void setSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
  }

  public void setUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
  }

  public void setRunAt(final Instant runAt) {
    this.runAt = runAt;
  }

  public void setNoRunAfter(final Instant noRunAfter) {
    this.noRunAfter = noRunAfter;
  }

  public void setVariables(final Map<String, String> variables) {
    this.variables = variables;
  }
}
