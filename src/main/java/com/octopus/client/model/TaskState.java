// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * Gets or Sets TaskState
 */
@JsonAdapter(TaskState.Adapter.class)
public enum TaskState {

  QUEUED("Queued"),

  EXECUTING("Executing"),

  FAILED("Failed"),

  CANCELED("Canceled"),

  TIMEDOUT("TimedOut"),

  SUCCESS("Success"),

  CANCELLING("Cancelling");

  private String value;

  TaskState(String value) { this.value = value; }

  public String getValue() { return value; }

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
    public void write(final JsonWriter jsonWriter, final TaskState enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskState.fromValue(value);
    }
  }
}
