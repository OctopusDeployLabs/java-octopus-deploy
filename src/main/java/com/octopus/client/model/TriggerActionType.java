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
 * Gets or Sets TriggerActionType
 */
@JsonAdapter(TriggerActionType.Adapter.class)
public enum TriggerActionType {

  AUTODEPLOY("AutoDeploy"),

  DEPLOYLATESTRELEASE("DeployLatestRelease"),

  DEPLOYNEWRELEASE("DeployNewRelease"),

  RUNRUNBOOK("RunRunbook");

  private String value;

  TriggerActionType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TriggerActionType fromValue(String value) {
    for (TriggerActionType b : TriggerActionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TriggerActionType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final TriggerActionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TriggerActionType read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return TriggerActionType.fromValue(value);
    }
  }
}
