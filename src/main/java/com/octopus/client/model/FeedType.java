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
 * Gets or Sets FeedType
 */
@JsonAdapter(FeedType.Adapter.class)
public enum FeedType {

  NONE("None"),

  NUGET("NuGet"),

  DOCKER("Docker"),

  MAVEN("Maven"),

  OCTOPUSPROJECT("OctopusProject"),

  GITHUB("GitHub"),

  HELM("Helm"),

  AWSELASTICCONTAINERREGISTRY("AwsElasticContainerRegistry"),

  BUILTIN("BuiltIn");

  private String value;

  FeedType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedType fromValue(String value) {
    for (FeedType b : FeedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FeedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeedType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FeedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FeedType.fromValue(value);
    }
  }
}
