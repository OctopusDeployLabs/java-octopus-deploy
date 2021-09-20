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

public class CreateReleaseCommandModelBuilder {
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
  private String projectName1;
  private String packageVersion;
  private String gitCommit;
  private String gitRef;
  private String releaseVersion;
  private String channelName;
  private List<String> packages;
  private String packageFolder;
  private String releaseNotes;
  private String releaseNotesFile;
  private boolean ignoreExisting;
  private boolean ignoreChannelRules;
  private String packgePrerelease;
  private boolean whatIf;
  private List<String> deployToEnvironmentNames;

  public CreateReleaseCommandModelBuilder withProjectName(final String projectName) {
    this.projectName = projectName;
    return this;
  }

  public CreateReleaseCommandModelBuilder withEnvironmentName(final List<String> environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  public CreateReleaseCommandModelBuilder withTenantName(final Optional<String> tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  public CreateReleaseCommandModelBuilder withTenantTags(final List<String> tenantTags) {
    this.tenantTags = tenantTags;
    return this;
  }

  public CreateReleaseCommandModelBuilder withForcePackageDownload(
      final boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  public CreateReleaseCommandModelBuilder withSpecificMachineNames(
      final List<String> specificMachineNames) {
    this.specificMachineNames = specificMachineNames;
    return this;
  }

  public CreateReleaseCommandModelBuilder withExcludeMachineNames(
      final List<String> excludeMachineNames) {
    this.excludeMachineNames = excludeMachineNames;
    return this;
  }

  public CreateReleaseCommandModelBuilder withSkipStepNames(final List<String> skipStepNames) {
    this.skipStepNames = skipStepNames;
    return this;
  }

  public CreateReleaseCommandModelBuilder withUseGuidedFailure(final boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  public CreateReleaseCommandModelBuilder withRunAt(final Optional<Instant> runAt) {
    this.runAt = runAt;
    return this;
  }

  public CreateReleaseCommandModelBuilder withNoRunAfter(final Optional<Instant> noRunAfter) {
    this.noRunAfter = noRunAfter;
    return this;
  }

  public CreateReleaseCommandModelBuilder withVariables(final Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public CreateReleaseCommandModelBuilder withProjectName1(final String projectName1) {
    this.projectName1 = projectName1;
    return this;
  }

  public CreateReleaseCommandModelBuilder withPackageVersion(final String packageVersion) {
    this.packageVersion = packageVersion;
    return this;
  }

  public CreateReleaseCommandModelBuilder withGitCommit(final String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  public CreateReleaseCommandModelBuilder withGitRef(final String gitRef) {
    this.gitRef = gitRef;
    return this;
  }

  public CreateReleaseCommandModelBuilder withReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  public CreateReleaseCommandModelBuilder withChannelName(final String channelName) {
    this.channelName = channelName;
    return this;
  }

  public CreateReleaseCommandModelBuilder withPackages(final List<String> packages) {
    this.packages = packages;
    return this;
  }

  public CreateReleaseCommandModelBuilder withPackageFolder(final String packageFolder) {
    this.packageFolder = packageFolder;
    return this;
  }

  public CreateReleaseCommandModelBuilder withReleaseNotes(final String releaseNotes) {
    this.releaseNotes = releaseNotes;
    return this;
  }

  public CreateReleaseCommandModelBuilder withReleaseNotesFile(final String releaseNotesFile) {
    this.releaseNotesFile = releaseNotesFile;
    return this;
  }

  public CreateReleaseCommandModelBuilder withIgnoreExisting(final boolean ignoreExisting) {
    this.ignoreExisting = ignoreExisting;
    return this;
  }

  public CreateReleaseCommandModelBuilder withIgnoreChannelRules(final boolean ignoreChannelRules) {
    this.ignoreChannelRules = ignoreChannelRules;
    return this;
  }

  public CreateReleaseCommandModelBuilder withPackgePrerelease(final String packgePrerelease) {
    this.packgePrerelease = packgePrerelease;
    return this;
  }

  public CreateReleaseCommandModelBuilder withWhatIf(final boolean whatIf) {
    this.whatIf = whatIf;
    return this;
  }

  public CreateReleaseCommandModelBuilder withDeployToEnvironmentNames(
      final List<String> deployToEnvironmentNames) {
    this.deployToEnvironmentNames = deployToEnvironmentNames;
    return this;
  }

  public CreateReleaseCommandModel build() {
    return new CreateReleaseCommandModel(
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
        projectName1,
        packageVersion,
        gitCommit,
        gitRef,
        releaseVersion,
        channelName,
        packages,
        packageFolder,
        releaseNotes,
        releaseNotesFile,
        ignoreExisting,
        ignoreChannelRules,
        packgePrerelease,
        whatIf,
        deployToEnvironmentNames);
  }
}
