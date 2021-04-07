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
 * Gets or Sets CalamariUpdateBehavior
 */
@JsonAdapter(CalamariUpdateBehavior.Adapter.class)
public enum CalamariUpdateBehavior {

  UPDATEONDEPLOYMENT("UpdateOnDeployment"),

  UPDATEONNEWMACHINE("UpdateOnNewMachine"),

  UPDATEALWAYS("UpdateAlways");

  private String value;

  CalamariUpdateBehavior(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CalamariUpdateBehavior fromValue(String value) {
    for (CalamariUpdateBehavior b : CalamariUpdateBehavior.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CalamariUpdateBehavior> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final CalamariUpdateBehavior enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CalamariUpdateBehavior read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return CalamariUpdateBehavior.fromValue(value);
    }
  }
}
