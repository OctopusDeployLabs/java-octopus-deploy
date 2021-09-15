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

package com.octopus.sdk.operations.createdeployment;

import java.util.Optional;

public class CreateDeploymentContext {

  private final String releaseVersion;
  private final Optional<String> channelName;
  private final boolean forcePackageRedeployment;
  private final boolean updateVariableSnapshot;

  public CreateDeploymentContext(final String releaseVersion, final Optional<String> channelName,
      final boolean forcePackageRedeployment,
      final boolean updateVariableSnapshot) {
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
}
