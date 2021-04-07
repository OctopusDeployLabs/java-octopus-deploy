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
 * Gets or Sets MachineStatus
 */
@JsonAdapter(MachineStatus.Adapter.class)
public enum MachineStatus {

  HEALTHY("Healthy"),

  HASWARNINGS("HasWarnings"),

  UNHEALTHY("Unhealthy"),

  UNAVAILABLE("Unavailable");

  private String value;

  MachineStatus(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MachineStatus fromValue(String value) {
    for (MachineStatus b : MachineStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MachineStatus> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final MachineStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MachineStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MachineStatus.fromValue(value);
    }
  }
}
