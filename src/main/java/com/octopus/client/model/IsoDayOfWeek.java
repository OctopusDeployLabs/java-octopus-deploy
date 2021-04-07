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
 * Gets or Sets IsoDayOfWeek
 */
@JsonAdapter(IsoDayOfWeek.Adapter.class)
public enum IsoDayOfWeek {

  NONE("None"),

  MONDAY("Monday"),

  TUESDAY("Tuesday"),

  WEDNESDAY("Wednesday"),

  THURSDAY("Thursday"),

  FRIDAY("Friday"),

  SATURDAY("Saturday"),

  SUNDAY("Sunday");

  private String value;

  IsoDayOfWeek(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IsoDayOfWeek fromValue(String value) {
    for (IsoDayOfWeek b : IsoDayOfWeek.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IsoDayOfWeek> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final IsoDayOfWeek enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IsoDayOfWeek read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IsoDayOfWeek.fromValue(value);
    }
  }
}
