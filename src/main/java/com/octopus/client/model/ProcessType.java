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
 * Gets or Sets ProcessType
 */
@JsonAdapter(ProcessType.Adapter.class)
public enum ProcessType {

  DEPLOYMENT("Deployment"),

  RUNBOOK("Runbook");

  private String value;

  ProcessType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProcessType fromValue(String value) {
    for (ProcessType b : ProcessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProcessType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final ProcessType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProcessType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProcessType.fromValue(value);
    }
  }
}
