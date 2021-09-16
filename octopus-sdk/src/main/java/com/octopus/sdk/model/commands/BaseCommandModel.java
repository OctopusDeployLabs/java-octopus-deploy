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

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("UnusedVariable")
public class BaseCommandModel {

  @SerializedName("projectName")
  private String projectName;

  @SerializedName("environmentIdsOrNames")
  private List<String> environmentName;

  @SerializedName("tenantIdsOrNames")
  private Optional<String> tenantName;

  @SerializedName("tenantTags")
  private List<String> tenantTags;

  @SerializedName("forcePackageDownload")
  private boolean forcePackageDownload;

  @SerializedName("specificMachineNames")
  private List<String> specificMachineNames;

  @SerializedName("excludeMachineNames")
  private final List<String> excludeMachineNames;

  @SerializedName("skipStepNames")
  private final List<String> skipStepNames;

  @SerializedName("useGuidedFailure")
  private final boolean useGuidedFailure;

  @SerializedName("runAt")
  private final Optional<Instant> runAt;

  @SerializedName("noRunAfter")
  private final Optional<Instant> noRunAfter;

  @SerializedName("variables")
  private final Map<String, String> variables;


  public BaseCommandModel(final String projectName, final List<String> environmentName, final Optional<String> tenantName,
      final List<String> tenantTags, final boolean forcePackageDownload, final List<String> specificMachineNames,
      final List<String> excludeMachineNames, final List<String> skipStepNames, final boolean useGuidedFailure,
      final Optional<Instant> runAt, final Optional<Instant> noRunAfter, final Map<String, String> variables) {
    this.projectName = projectName;
    this.environmentName = environmentName;
    this.tenantName = tenantName;
    this.tenantTags = tenantTags;
    this.forcePackageDownload = forcePackageDownload;
    this.specificMachineNames = specificMachineNames;
    this.excludeMachineNames = excludeMachineNames;
    this.skipStepNames = skipStepNames;
    this.useGuidedFailure = useGuidedFailure;
    this.runAt = runAt;
    this.noRunAfter = noRunAfter;
    this.variables = variables;
  }

  public String getProjectName() {
    return projectName;
  }

  public List<String> getEnvironmentName() {
    return environmentName;
  }

  public Optional<String> getTenantName() {
    return tenantName;
  }

  public List<String> getTenantTags() {
    return tenantTags;
  }

  public boolean isForcePackageDownload() {
    return forcePackageDownload;
  }

  public List<String> getSpecificMachineNames() {
    return specificMachineNames;
  }

  public List<String> getExcludeMachineNames() {
    return excludeMachineNames;
  }

  public List<String> getSkipStepNames() {
    return skipStepNames;
  }

  public boolean isUseGuidedFailure() {
    return useGuidedFailure;
  }

  public Optional<Instant> getRunAt() {
    return runAt;
  }

  public Optional<Instant> getNoRunAfter() {
    return noRunAfter;
  }

  public Map<String, String> getVariables() {
    return variables;
  }

  public BaseCommandModel setProjectName(final String projectName) {
    this.projectName = projectName;
    return this;
  }

  public BaseCommandModel setEnvironmentName(final List<String> environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  public BaseCommandModel setTenantName(final Optional<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public BaseCommandModel setTenantTags(final List<String> tenantTags) {
    this.tenantTags = tenantTags;
    return this;
  }

  public BaseCommandModel setForcePackageDownload(final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public BaseCommandModel setSpecificMachineNames(final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }
}
