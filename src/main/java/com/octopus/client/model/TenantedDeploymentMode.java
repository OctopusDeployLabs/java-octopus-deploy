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
 * Gets or Sets TenantedDeploymentMode
 */
@JsonAdapter(TenantedDeploymentMode.Adapter.class)
public enum TenantedDeploymentMode {

  UNTENANTED("Untenanted"),

  TENANTEDORUNTENANTED("TenantedOrUntenanted"),

  TENANTED("Tenanted");

  private String value;

  TenantedDeploymentMode(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TenantedDeploymentMode fromValue(String value) {
    for (TenantedDeploymentMode b : TenantedDeploymentMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TenantedDeploymentMode> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final TenantedDeploymentMode enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TenantedDeploymentMode read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return TenantedDeploymentMode.fromValue(value);
    }
  }
}
