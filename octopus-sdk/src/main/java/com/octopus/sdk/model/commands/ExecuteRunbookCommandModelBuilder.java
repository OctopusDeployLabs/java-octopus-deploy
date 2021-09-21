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

public class ExecuteRunbookCommandModelBuilder {
  private String projectName;
  private List<String> environmentName;
  private Optional<String> tenantName;
  private List<String> tenantTags;
  private boolean forcePackageDownload;
  private List<String> specificMachineNames;
  private List<String> excludeMachineNames;
  private List<String> skipStepNames;
  private boolean useGuidedFailure;
  private Optional<Instant> runAt;
  private Optional<Instant> noRunAfter;
  private Map<String, String> variables;
  private String runbookName;
  private String snapshot;

  public ExecuteRunbookCommandModelBuilder withProjectName(final String projectName) {
    this.projectName = projectName;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withEnvironmentName(final List<String> environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withTenantName(final Optional<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withTenantTags(final List<String> tenantTags) {
    this.tenantTags = tenantTags;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withForcePackageDownload(
      final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withSpecificMachineNames(
      final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withExcludeMachineNames(
      final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withRunAt(final Optional<Instant> runAt) {
    this.runAt = runAt;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withNoRunAfter(final Optional<Instant> noRunAfter) {
    this.noRunAfter = noRunAfter;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withVariables(final Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withRunbookName(final String runbookName) {
    this.runbookName = runbookName;
    return this;
  }

  public ExecuteRunbookCommandModelBuilder withSnapshot(final String snapshot) {
    this.snapshot = snapshot;
    return this;
  }

  public ExecuteRunbookCommandModel build() {
    return new ExecuteRunbookCommandModel(
        projectName,
        environmentName,
        tenantName,
        tenantTags,
        forcePackageDownload,
        specificMachineNames,
        excludeMachineNames,
        skipStepNames,
        useGuidedFailure,
        runAt,
        noRunAfter,
        variables,
        runbookName,
        snapshot);
  }
}
