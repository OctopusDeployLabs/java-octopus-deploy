/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.operations.pushpackage;

import java.io.File;
import java.util.List;

import com.google.common.base.Preconditions;
import octopus.teamcity.common.OverwriteMode;

public class PushPackageParametersBuilder {
  private String spaceName;
  private List<File> filesToUpload;
  private OverwriteMode overwriteMode;

  public PushPackageParametersBuilder withSpaceName(final String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

  public PushPackageParametersBuilder withFilesToUpload(final List<File> filesToUpload) {
    this.filesToUpload = filesToUpload;
    return this;
  }

  public PushPackageParametersBuilder withOverwriteMode(final OverwriteMode overwriteMode) {
    this.overwriteMode = overwriteMode;
    return this;
  }

  public octopus.teamcity.agent.pushpackage.PushPackageParameters build() {
    Preconditions.checkNotNull(
        spaceName, "SpaceName must be specified when pushing packages to Octopus Server");
    Preconditions.checkNotNull(
        filesToUpload, "The list of files to be pushed to Octopus Server must be specified");
    Preconditions.checkNotNull(
        overwriteMode,
        "overwriteMode must be specified when pushing packages to Octopus " + "Server");
    Preconditions.checkArgument(!filesToUpload.isEmpty(), "Cannot upload an empty file list.");

    return new octopus.teamcity.agent.pushpackage.PushPackageParameters(
        spaceName, filesToUpload, overwriteMode);
  }
}
