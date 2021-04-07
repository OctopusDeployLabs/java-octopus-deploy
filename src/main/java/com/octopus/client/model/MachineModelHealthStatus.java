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
 * Gets or Sets MachineModelHealthStatus
 */
@JsonAdapter(MachineModelHealthStatus.Adapter.class)
public enum MachineModelHealthStatus {

  HEALTHY("Healthy"),

  UNAVAILABLE("Unavailable"),

  UNKNOWN("Unknown"),

  HASWARNINGS("HasWarnings"),

  UNHEALTHY("Unhealthy");

  private String value;

  MachineModelHealthStatus(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MachineModelHealthStatus fromValue(String value) {
    for (MachineModelHealthStatus b : MachineModelHealthStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MachineModelHealthStatus> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final MachineModelHealthStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MachineModelHealthStatus read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return MachineModelHealthStatus.fromValue(value);
    }
  }
}
