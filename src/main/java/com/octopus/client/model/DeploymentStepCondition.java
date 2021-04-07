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
 * Gets or Sets DeploymentStepCondition
 */
@JsonAdapter(DeploymentStepCondition.Adapter.class)
public enum DeploymentStepCondition {

  SUCCESS("Success"),

  FAILURE("Failure"),

  ALWAYS("Always"),

  VARIABLE("Variable");

  private String value;

  DeploymentStepCondition(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeploymentStepCondition fromValue(String value) {
    for (DeploymentStepCondition b : DeploymentStepCondition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeploymentStepCondition> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final DeploymentStepCondition enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeploymentStepCondition read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return DeploymentStepCondition.fromValue(value);
    }
  }
}
