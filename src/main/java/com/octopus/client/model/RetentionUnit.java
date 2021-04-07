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
 * Gets or Sets RetentionUnit
 */
@JsonAdapter(RetentionUnit.Adapter.class)
public enum RetentionUnit {

  DAYS("Days"),

  ITEMS("Items");

  private String value;

  RetentionUnit(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RetentionUnit fromValue(String value) {
    for (RetentionUnit b : RetentionUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RetentionUnit> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final RetentionUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RetentionUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RetentionUnit.fromValue(value);
    }
  }
}
