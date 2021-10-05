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

package com.octopus.sdk.domain;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.task.TaskResourceWithLinks;

public class Task {

  @SuppressWarnings("UnusedVariable")
  private final OctopusClient client;

  private final TaskResourceWithLinks properties;

  public Task(final OctopusClient client, final TaskResourceWithLinks properties) {
    this.client = client;
    this.properties = properties;
  }

  public TaskResourceWithLinks getProperties() {
    return properties;
  }

  public TaskStateOperator getTaskState() {
    return new TaskStateOperator(client, properties.getStateLink());
  }
}