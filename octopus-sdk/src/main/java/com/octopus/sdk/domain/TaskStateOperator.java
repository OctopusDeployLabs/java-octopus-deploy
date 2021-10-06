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
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.task.TaskState;

import java.io.IOException;

public class TaskStateOperator {

  private final OctopusClient client;
  private final String path;

  public TaskStateOperator(final OctopusClient client, final String path) {
    this.client = client;
    this.path = path;
  }

  public TaskState get() throws IOException {
    final String stringValue = client.get(RequestEndpoint.fromPath(path), String.class);
    return TaskState.fromValue(stringValue);
  }

  public void set(final TaskState value) throws IOException {
    client.put(RequestEndpoint.fromPath(path), value, void.class);
    // not sure if this is meant to return anything
  }
}
