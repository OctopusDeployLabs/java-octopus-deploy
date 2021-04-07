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
 * Gets or Sets VariableSetContentType
 */
@JsonAdapter(VariableSetContentType.Adapter.class)
public enum VariableSetContentType {

  VARIABLES("Variables"),

  SCRIPTMODULE("ScriptModule");

  private String value;

  VariableSetContentType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VariableSetContentType fromValue(String value) {
    for (VariableSetContentType b : VariableSetContentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VariableSetContentType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final VariableSetContentType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VariableSetContentType read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return VariableSetContentType.fromValue(value);
    }
  }
}
