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
public class ExecuteRunbookCommandModel extends BaseCommandModel {

  @SerializedName("runbookIdOrName")
  private final String runbookName;

  @SerializedName("snapshot")
  private final String snapshot;

  public ExecuteRunbookCommandModel(
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
      final String runbookName,
      final String snapshot) {
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
    this.runbookName = runbookName;
    this.snapshot = snapshot;
  }
}
