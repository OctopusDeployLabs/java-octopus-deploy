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
 * Gets or Sets PropertyApplicabilityMode
 */
@JsonAdapter(PropertyApplicabilityMode.Adapter.class)
public enum PropertyApplicabilityMode {

  APPLICABLEIFHASANYVALUE("ApplicableIfHasAnyValue"),

  APPLICABLEIFHASNOVALUE("ApplicableIfHasNoValue"),

  APPLICABLEIFSPECIFICVALUE("ApplicableIfSpecificValue"),

  APPLICABLEIFNOTSPECIFICVALUE("ApplicableIfNotSpecificValue");

  private String value;

  PropertyApplicabilityMode(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PropertyApplicabilityMode fromValue(String value) {
    for (PropertyApplicabilityMode b : PropertyApplicabilityMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PropertyApplicabilityMode> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final PropertyApplicabilityMode enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PropertyApplicabilityMode read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return PropertyApplicabilityMode.fromValue(value);
    }
  }
}
