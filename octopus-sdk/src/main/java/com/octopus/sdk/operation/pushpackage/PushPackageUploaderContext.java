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

package com.octopus.sdk.operation.pushpackage;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.model.commands.CommandBody;

import java.io.File;
import java.util.StringJoiner;

public class PushPackageUploaderContext extends CommandBody {

  private final File filename;
  private final OverwriteMode overwriteMode;

  public PushPackageUploaderContext(
      final String spaceIdOrName, final File filename, final OverwriteMode overwriteMode) {
    super(spaceIdOrName);
    this.filename = filename;
    this.overwriteMode = overwriteMode;
  }

  public File getFile() {
    return filename;
  }

  public OverwriteMode getOverwriteMode() {
    return overwriteMode;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", PushPackageUploaderContext.class.getSimpleName() + "[", "]")
        .add("spaceIdOrName=" + getSpaceIdOrName())
        .add("filename=" + filename)
        .add("overwriteMode=" + overwriteMode)
        .toString();
  }
}
