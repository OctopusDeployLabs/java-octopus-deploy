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
 * Gets or Sets EmailPriority
 */
@JsonAdapter(EmailPriority.Adapter.class)
public enum EmailPriority {

  NORMAL("Normal"),

  LOW("Low"),

  HIGH("High");

  private String value;

  EmailPriority(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmailPriority fromValue(String value) {
    for (EmailPriority b : EmailPriority.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EmailPriority> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final EmailPriority enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmailPriority read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EmailPriority.fromValue(value);
    }
  }
}
