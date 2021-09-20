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

package com.octopus.sdk.operations.executerunbook;

import com.octopus.sdk.model.commands.ExecuteRunbookCommandModel;

import java.util.Optional;

public class ExecuteRunbookCommandContext {

  private final Optional<String> spaceName;
  private final ExecuteRunbookCommandModel model;

  public ExecuteRunbookCommandContext(
      final Optional<String> spaceName, final ExecuteRunbookCommandModel model) {
    this.spaceName = spaceName;
    this.model = model;
  }

  public Optional<String> getSpaceName() {
    return spaceName;
  }

  public ExecuteRunbookCommandModel getModel() {
    return model;
  }
}
