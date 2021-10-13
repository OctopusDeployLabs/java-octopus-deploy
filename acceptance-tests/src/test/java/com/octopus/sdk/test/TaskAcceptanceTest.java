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

package com.octopus.sdk.test;

import com.octopus.sdk.domain.Runbook;
import com.octopus.sdk.model.runbook.RunbookParameters;
import com.octopus.sdk.model.runbook.RunbookRunResource;
import com.octopus.sdk.model.task.TaskState;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TaskAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  @Disabled("This can only be run with a pre-configured OctopusDeploy")
  public void canQueryForTasks() throws IOException {
    final Optional<Runbook> runbooks =
        repo.spaces()
            .getByName("My Space")
            .get()
            .projects()
            .getByName("MySpacesProject")
            .get()
            .runBooks()
            .getByName("TheRunbook");
    final RunbookParameters params = new RunbookParameters();
    params.setEnvironmentIds(Collections.singletonList("Environments-1"));
    final List<RunbookRunResource> result = runbooks.get().executeRunbook(params);
    final RunbookRunResource theTaskResult = result.get(0);
    while (true) {
      final TaskState answer =
          repo.tasks().getById(theTaskResult.getTaskId()).get().getProperties().getState();
      if (answer == TaskState.SUCCESS) {
        break;
      }
    }
  }
}
