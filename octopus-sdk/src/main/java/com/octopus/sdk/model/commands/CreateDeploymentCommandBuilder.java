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
import java.util.Optional;

public class CreateDeploymentCommandBuilder {
  private String projectName;
  private List<String> environmentName;
  private Optional<String> tenantName;
  private List<String> tentantTags;
  private boolean forcePackageDownload;
  private List<String> specificMachineNames;
  private List<String> excludeMachineNames;
  private List<String> skipStepNames;
  private boolean useGuidedFailure;
  private Optional<Instant> runAt;
  private Optional<Instant> noRunAfter;
  private Map<String, String> variables;
  private String releaseVersion;
  private Optional<String> channelName;
  private boolean forcePackageRedeployment;
  private boolean updateVariableSnapshot;

  public CreateDeploymentCommandBuilder withProjectName(final String projectName) {
    this.projectName = projectName;
    return this;
  }

  public CreateDeploymentCommandBuilder withEnvironmentName(final List<String> environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  public CreateDeploymentCommandBuilder withTenantName(final Optional<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public CreateDeploymentCommandBuilder withTenantTags(final List<String> tentantTags) {
    this.tentantTags = tentantTags;
    return this;
  }

  public CreateDeploymentCommandBuilder withForcePackageDownload(final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public CreateDeploymentCommandBuilder withSpecificMachineNames(final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }

  public CreateDeploymentCommandBuilder withExcludeMachineNames(final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
    return this;
  }

  public CreateDeploymentCommandBuilder withSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
    return this;
  }

  public CreateDeploymentCommandBuilder withUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public CreateDeploymentCommandBuilder withRunAt(final Optional<Instant> runAt) {
    this.runAt = runAt;
    return this;
  }

  public CreateDeploymentCommandBuilder withNoRunAfter(final Optional<Instant> noRunAfter) {
    this.noRunAfter = noRunAfter;
    return this;
  }

  public CreateDeploymentCommandBuilder withVariables(final Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public CreateDeploymentCommandBuilder withReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  public CreateDeploymentCommandBuilder withChannelName(final Optional<String> channelName) {
    this.channelName = channelName;
    return this;
  }

  public CreateDeploymentCommandBuilder withForcePackageRedeployment(final boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  public CreateDeploymentCommandBuilder withUpdateVariableSnapshot(final boolean updateVariableSnapshot) {
    this.updateVariableSnapshot = updateVariableSnapshot;
    return this;
  }

  public CreateDeploymentCommand build() {
    return new CreateDeploymentCommand(projectName, environmentName, tenantName, tentantTags, forcePackageDownload,
        specificMachineNames, excludeMachineNames, skipStepNames, useGuidedFailure, runAt, noRunAfter, variables,
        releaseVersion, channelName, forcePackageRedeployment, updateVariableSnapshot);
  }
}
