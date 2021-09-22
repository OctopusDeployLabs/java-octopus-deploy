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

import java.util.List;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class CreateDeploymentCommandParameters extends BaseCommandParameters {

  @SerializedName("releaseVersion")
  private String releaseVersion;

  @SerializedName("channelIdOrName")
  private String channelName;

  @SerializedName("forcePackageRedeployment")
  private boolean forcePackageRedeployment;

  @SerializedName("updateVariableSnapshot")
  private boolean updateVariableSnapshot;

  public CreateDeploymentCommandParameters(
      final String projectName, final List<String> environmentNames, final String releaseVersion) {
    super(projectName, environmentNames);
    this.releaseVersion = releaseVersion;
  }

  public CreateDeploymentCommandParameters withReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  public CreateDeploymentCommandParameters withChannelName(final String channelName) {
    this.channelName = channelName;
    return this;
  }

  public CreateDeploymentCommandParameters withForcePackageRedeployment(
      final boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  public CreateDeploymentCommandParameters withUpdateVariableSnapshot(
      final boolean updateVariableSnapshot) {
    this.updateVariableSnapshot = updateVariableSnapshot;
    return this;
  }
}
