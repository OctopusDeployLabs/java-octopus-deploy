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

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class CreateReleaseCommandModel extends BaseCommandModel {

  @SerializedName("projectNameOrId")
  private final String projectName;

  @SerializedName("packageVersion")
  private final String packageVersion;

  @SerializedName("gitCommit")
  private final String gitCommit;

  @SerializedName("GitRef")
  private final String gitRef;

  @SerializedName("releaseVersion")
  private final String releaseVersion;

  @SerializedName("channelIdOrName")
  private final String channelName;

  @SerializedName("packages")
  private final List<String> packages;

  @SerializedName("packageFolder")
  private final String packageFolder;

  @SerializedName("releaseNodes")
  private final String releaseNotes;

  @SerializedName("releaseNotesFile")
  private final String releaseNotesFile;

  @SerializedName("ignoreExisting")
  private final boolean ignoreExisting;

  @SerializedName("ignoreChannelRules")
  private final boolean ignoreChannelRules;

  @SerializedName("packagePrerelease")
  private final String packgePrerelease;

  @SerializedName("whatIf")
  private final boolean whatIf;

  @SerializedName("deployToEnvironmentIdsOrNames")
  private final List<String> deployToEnvironmentNames;

  public CreateReleaseCommandModel(
      final String projectName,
      final List<String> environmentName,
      final Optional<String> tenantName,
      final List<String> tenantTags,
      final boolean forcePackageDownload,
      final List<String> specificMachineNames,
      final List<String> excludeMachineNames,
      final List<String> skipStepNames,
      final boolean useGuidedFailure,
      final Optional<Instant> runAt,
      final Optional<Instant> noRunAfter,
      final Map<String, String> variables,
      final String projectName1,
      final String packageVersion,
      final String gitCommit,
      final String gitRef,
      final String releaseVersion,
      final String channelName,
      final List<String> packages,
      final String packageFolder,
      final String releaseNotes,
      final String releaseNotesFile,
      final boolean ignoreExisting,
      final boolean ignoreChannelRules,
      final String packgePrerelease,
      final boolean whatIf,
      final List<String> deployToEnvironmentNames) {
    super(
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
        variables);
    this.projectName = projectName1;
    this.packageVersion = packageVersion;
    this.gitCommit = gitCommit;
    this.gitRef = gitRef;
    this.releaseVersion = releaseVersion;
    this.channelName = channelName;
    this.packages = packages;
    this.packageFolder = packageFolder;
    this.releaseNotes = releaseNotes;
    this.releaseNotesFile = releaseNotesFile;
    this.ignoreExisting = ignoreExisting;
    this.ignoreChannelRules = ignoreChannelRules;
    this.packgePrerelease = packgePrerelease;
    this.whatIf = whatIf;
    this.deployToEnvironmentNames = deployToEnvironmentNames;
  }
}
