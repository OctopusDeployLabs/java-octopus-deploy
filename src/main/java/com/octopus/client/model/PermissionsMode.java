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
 * Gets or Sets PermissionsMode
 */
@JsonAdapter(PermissionsMode.Adapter.class)
public enum PermissionsMode {

  UNSPECIFIED("Unspecified"),

  RESTRICTED("Restricted"),

  FULL("Full");

  private String value;

  PermissionsMode(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PermissionsMode fromValue(String value) {
    for (PermissionsMode b : PermissionsMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PermissionsMode> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final PermissionsMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PermissionsMode read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return PermissionsMode.fromValue(value);
    }
  }
}
