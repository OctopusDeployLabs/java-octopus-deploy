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

  @SerializedName("projectNameOrId")
  private String projectName;

  @SerializedName("environmentIdsOrNames")
  private List<String> environmentNames;

  @SerializedName("tenantIdsOrNames")
  private String tenantName;

  @SerializedName("tenantTags")
  private List<String> tenantTags;

  @SerializedName("forcePackageDownload")
  private boolean forcePackageDownload;

  @SerializedName("specificMachineNames")
  private List<String> specificMachineNames;

  @SerializedName("excludeMachineNames")
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

  public BaseCommandParameters(final String projectName, final List<String> environmentNames) {
    Preconditions.checkNotNull(projectName, "projectName cannot be null");
    Preconditions.checkNotNull(environmentNames, "environmentNames cannot be null");
    Preconditions.checkArgument(
        !environmentNames.isEmpty(), "environmentNames list cannot be empty");

    this.projectName = projectName;
    this.environmentNames = environmentNames;
  }

  public BaseCommandParameters withProjectName(final String projectName) {
    Preconditions.checkNotNull(projectName, "projectName cannot be null");
    this.projectName = projectName;
    return this;
  }

  public BaseCommandParameters withEnvironmentName(final List<String> environmentName) {
    Preconditions.checkNotNull(environmentNames, "environmentNames cannot be null");
    Preconditions.checkArgument(
        !environmentNames.isEmpty(), "environmentNames list cannot be empty");
    this.environmentNames = environmentName;
    return this;
  }

  public BaseCommandParameters withTenantName(final String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public BaseCommandParameters withTenantTags(final List<String> tenantTags) {
    this.tenantTags = tenantTags;
    return this;
  }

  public BaseCommandParameters withForcePackageDownload(final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public BaseCommandParameters withSpecificMachineNames(final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }

  public BaseCommandParameters withExcludeMachineNames(final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
    return this;
  }

  public BaseCommandParameters withSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
    return this;
  }

  public BaseCommandParameters withUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public BaseCommandParameters withRunAt(final Instant runAt) {
    this.runAt = runAt;
    return this;
  }

  public BaseCommandParameters withNoRunAfter(final Instant noRunAfter) {
    this.noRunAfter = noRunAfter;
    return this;
  }

  public BaseCommandParameters withVariables(final Map<String, String> variables) {
    this.variables = variables;
    return this;
  }
}
