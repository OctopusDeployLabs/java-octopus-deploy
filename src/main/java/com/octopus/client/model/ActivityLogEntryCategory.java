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
 * Gets or Sets ActivityLogEntryCategory
 */
@JsonAdapter(ActivityLogEntryCategory.Adapter.class)
public enum ActivityLogEntryCategory {

  TRACE("Trace"),

  VERBOSE("Verbose"),

  INFO("Info"),

  WAIT("Wait"),

  HIGHLIGHT("Highlight"),

  GAP("Gap"),

  ALERT("Alert"),

  WARNING("Warning"),

  ERROR("Error"),

  FATAL("Fatal"),

  PLANNED("Planned"),

  UPDATED("Updated"),

  FINISHED("Finished"),

  ABANDONED("Abandoned");

  private String value;

  ActivityLogEntryCategory(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityLogEntryCategory fromValue(String value) {
    for (ActivityLogEntryCategory b : ActivityLogEntryCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityLogEntryCategory> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final ActivityLogEntryCategory enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityLogEntryCategory read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return ActivityLogEntryCategory.fromValue(value);
    }
  }
}
