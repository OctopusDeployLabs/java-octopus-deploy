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

import com.octopus.sdk.api.OverwriteMode;

import java.io.File;
import java.util.List;

public class PushPackageParameters {

  private final String spaceName;
  private final List<File> packageFilenames;
  private final OverwriteMode overwriteMode;

  public PushPackageParameters(
      final String spaceName,
      final List<File> packageFilenames,
      final OverwriteMode overwriteMode) {
    this.spaceName = spaceName;
    this.packageFilenames = packageFilenames;
    this.overwriteMode = overwriteMode;
  }

  public String getSpaceName() {
    return spaceName;
  }

  public List<File> getPackageFilenames() {
    return packageFilenames;
  }

  public OverwriteMode getOverwriteMode() {
    return overwriteMode;
  }
}
