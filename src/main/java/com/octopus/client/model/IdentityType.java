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
 * Gets or Sets IdentityType
 */
@JsonAdapter(IdentityType.Adapter.class)
public enum IdentityType {

  GUEST("Guest"),

  USERNAMEPASSWORD("UsernamePassword"),

  ACTIVEDIRECTORY("ActiveDirectory"),

  OAUTH("OAuth");

  private String value;

  IdentityType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityType fromValue(String value) {
    for (IdentityType b : IdentityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IdentityType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final IdentityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityType.fromValue(value);
    }
  }
}
