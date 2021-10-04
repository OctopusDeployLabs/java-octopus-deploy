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

package com.octopus.sdk.api;

import com.octopus.sdk.domain.Task;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.task.TaskPaginatedCollection;
import com.octopus.sdk.model.task.TaskResource;
import com.octopus.sdk.model.task.TaskResourceWithLinks;

import com.google.common.base.Preconditions;

public class TaskApi
    extends BaseNamedResourceApi<
        TaskResource, TaskResourceWithLinks, TaskPaginatedCollection, Task> {
  public TaskApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, TaskResourceWithLinks.class, TaskPaginatedCollection.class);
  }

  public static TaskApi create(final OctopusClient client) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    return new TaskApi(client, client.getRootDocument().getTasksLink());
  }

  @Override
  public Task createServerObject(final TaskResourceWithLinks resource) {
    return new Task(client, resource);
  }
}
