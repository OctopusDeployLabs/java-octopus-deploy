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

public class CreateDeploymentCommandModelBuilder {
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

  public CreateDeploymentCommandModelBuilder withProjectName(final String projectName) {
    this.projectName = projectName;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withEnvironmentName(
      final List<String> environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withTenantName(final Optional<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withTenantTags(final List<String> tentantTags) {
    this.tentantTags = tentantTags;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withForcePackageDownload(
      final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withSpecificMachineNames(
      final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withExcludeMachineNames(
      final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withRunAt(final Optional<Instant> runAt) {
    this.runAt = runAt;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withNoRunAfter(final Optional<Instant> noRunAfter) {
    this.noRunAfter = noRunAfter;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withVariables(final Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withChannelName(final Optional<String> channelName) {
    this.channelName = channelName;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withForcePackageRedeployment(
      final boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  public CreateDeploymentCommandModelBuilder withUpdateVariableSnapshot(
      final boolean updateVariableSnapshot) {
    this.updateVariableSnapshot = updateVariableSnapshot;
    return this;
  }

  public CreateDeploymentCommandModel build() {
    return new CreateDeploymentCommandModel(
        projectName,
        environmentName,
        tenantName,
        tentantTags,
        forcePackageDownload,
        specificMachineNames,
        excludeMachineNames,
        skipStepNames,
        useGuidedFailure,
        runAt,
        noRunAfter,
        variables,
        releaseVersion,
        channelName,
        forcePackageRedeployment,
        updateVariableSnapshot);
  }
}
