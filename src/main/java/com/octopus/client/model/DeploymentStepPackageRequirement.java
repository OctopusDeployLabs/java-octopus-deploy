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
 * Gets or Sets DeploymentStepPackageRequirement
 */
@JsonAdapter(DeploymentStepPackageRequirement.Adapter.class)
public enum DeploymentStepPackageRequirement {

  LETOCTOPUSDECIDE("LetOctopusDecide"),

  BEFOREPACKAGEACQUISITION("BeforePackageAcquisition"),

  AFTERPACKAGEACQUISITION("AfterPackageAcquisition");

  private String value;

  DeploymentStepPackageRequirement(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeploymentStepPackageRequirement fromValue(String value) {
    for (DeploymentStepPackageRequirement b :
         DeploymentStepPackageRequirement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter
      extends TypeAdapter<DeploymentStepPackageRequirement> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final DeploymentStepPackageRequirement enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeploymentStepPackageRequirement read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return DeploymentStepPackageRequirement.fromValue(value);
    }
  }
}
