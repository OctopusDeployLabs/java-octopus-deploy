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

package com.octopus.sdk.model.task;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/** Gets or Sets TaskState */
@JsonAdapter(TaskState.Adapter.class)
public enum TaskState {
  QUEUED("Queued"),

  EXECUTING("Executing"),

  FAILED("Failed"),

  CANCELED("Canceled"),

  TIMEDOUT("TimedOut"),

  SUCCESS("Success"),

  CANCELLING("Cancelling");

  private final String value;

  TaskState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskState fromValue(String value) {
    for (TaskState b : TaskState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TaskState> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskState.fromValue(value);
    }
  }
}
