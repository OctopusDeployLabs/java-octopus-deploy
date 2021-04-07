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
 * Gets or Sets ActivityStatus
 */
@JsonAdapter(ActivityStatus.Adapter.class)
public enum ActivityStatus {

  PENDING("Pending"),

  RUNNING("Running"),

  SUCCESS("Success"),

  FAILED("Failed"),

  SKIPPED("Skipped"),

  SUCCESSWITHWARNING("SuccessWithWarning"),

  CANCELED("Canceled");

  private String value;

  ActivityStatus(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityStatus fromValue(String value) {
    for (ActivityStatus b : ActivityStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityStatus> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final ActivityStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityStatus.fromValue(value);
    }
  }
}
