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

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class ExecuteRunbookCommandParameters extends BaseCommandParameters {

  @SerializedName("runbookIdOrName")
  private String runbookName;

  @SerializedName("snapshot")
  private String snapshot;

  public ExecuteRunbookCommandParameters(
      final String projectIdOrName, final List<String> environmentNames, final String runbookName) {
    super(projectIdOrName, environmentNames);
    Preconditions.checkNotNull(runbookName, "runbookName cannot be null");
    this.runbookName = runbookName;
  }

  public void setRunbookName(final String runbookName) {
    Preconditions.checkNotNull(runbookName, "runbookName cannot be null");
    this.runbookName = runbookName;
  }

  public void setSnapshot(final String snapshot) {
    this.snapshot = snapshot;
  }
}
