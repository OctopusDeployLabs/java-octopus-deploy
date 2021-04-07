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
 * Gets or Sets MachineModelStatus
 */
@JsonAdapter(MachineModelStatus.Adapter.class)
public enum MachineModelStatus {

  ONLINE("Online"),

  OFFLINE("Offline"),

  UNKNOWN("Unknown"),

  NEEDSUPGRADE("NeedsUpgrade"),

  CALAMARINEEDSUPGRADE("CalamariNeedsUpgrade"),

  DISABLED("Disabled");

  private String value;

  MachineModelStatus(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MachineModelStatus fromValue(String value) {
    for (MachineModelStatus b : MachineModelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MachineModelStatus> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final MachineModelStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MachineModelStatus read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return MachineModelStatus.fromValue(value);
    }
  }
}
