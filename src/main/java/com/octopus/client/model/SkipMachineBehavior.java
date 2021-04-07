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
 * Gets or Sets SkipMachineBehavior
 */
@JsonAdapter(SkipMachineBehavior.Adapter.class)
public enum SkipMachineBehavior {

  NONE("None"),

  SKIPUNAVAILABLEMACHINES("SkipUnavailableMachines");

  private String value;

  SkipMachineBehavior(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SkipMachineBehavior fromValue(String value) {
    for (SkipMachineBehavior b : SkipMachineBehavior.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SkipMachineBehavior> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final SkipMachineBehavior enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SkipMachineBehavior read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return SkipMachineBehavior.fromValue(value);
    }
  }
}
