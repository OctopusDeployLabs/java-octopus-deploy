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
public class CreateDeploymentCommandModel extends BaseCommandModel {

  @SerializedName("releaseVersion")
  private String releaseVersion;

  @SerializedName("channelIdOrName")
  private Optional<String> channelName;

  @SerializedName("forcePackageRedeployment")
  private boolean forcePackageRedeployment;

  @SerializedName("updateVariableSnapshot")
  private boolean updateVariableSnapshot;

  public CreateDeploymentCommandModel(
      final String projectName,
      final List<String> environmentName,
      final Optional<String> tenantName,
      final List<String> tentantTags,
      final boolean forcePackageDownload,
      final List<String> specificMachineNames,
      final List<String> excludeMachineNames,
      final List<String> skipStepNames,
      final boolean useGuidedFailure,
      final Optional<Instant> runAt,
      final Optional<Instant> noRunAfter,
      final Map<String, String> variables,
      final String releaseVersion,
      final Optional<String> channelName,
      final boolean forcePackageRedeployment,
      final boolean updateVariableSnapshot) {
    super(
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
        variables);
    this.releaseVersion = releaseVersion;
    this.channelName = channelName;
    this.forcePackageRedeployment = forcePackageRedeployment;
    this.updateVariableSnapshot = updateVariableSnapshot;
  }

  public String getReleaseVersion() {
    return releaseVersion;
  }

  public Optional<String> getChannelName() {
    return channelName;
  }

  public boolean isForcePackageRedeployment() {
    return forcePackageRedeployment;
  }

  public boolean isUpdateVariableSnapshot() {
    return updateVariableSnapshot;
  }

  public CreateDeploymentCommandModel setReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  public CreateDeploymentCommandModel setChannelName(final Optional<String> channelName) {
    this.channelName = channelName;
    return this;
  }

  public CreateDeploymentCommandModel setForcePackageRedeployment(
      final boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  public CreateDeploymentCommandModel setUpdateVariableSnapshot(
      final boolean updateVariableSnapshot) {
    this.updateVariableSnapshot = updateVariableSnapshot;
    return this;
  }
}
