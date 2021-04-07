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
 * Gets or Sets DeploymentActionCondition
 */
@JsonAdapter(DeploymentActionCondition.Adapter.class)
public enum DeploymentActionCondition {

  SUCCESS("Success"),

  VARIABLE("Variable");

  private String value;

  DeploymentActionCondition(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeploymentActionCondition fromValue(String value) {
    for (DeploymentActionCondition b : DeploymentActionCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeploymentActionCondition> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final DeploymentActionCondition enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeploymentActionCondition read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return DeploymentActionCondition.fromValue(value);
    }
  }
}
