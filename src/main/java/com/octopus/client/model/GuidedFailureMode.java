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
 * Gets or Sets GuidedFailureMode
 */
@JsonAdapter(GuidedFailureMode.Adapter.class)
public enum GuidedFailureMode {

  ENVIRONMENTDEFAULT("EnvironmentDefault"),

  OFF("Off"),

  ON("On");

  private String value;

  GuidedFailureMode(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GuidedFailureMode fromValue(String value) {
    for (GuidedFailureMode b : GuidedFailureMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GuidedFailureMode> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final GuidedFailureMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GuidedFailureMode read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return GuidedFailureMode.fromValue(value);
    }
  }
}
