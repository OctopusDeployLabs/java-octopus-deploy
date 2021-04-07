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
 * Gets or Sets CertificateFormat
 */
@JsonAdapter(CertificateFormat.Adapter.class)
public enum CertificateFormat {

  PKCS12("Pkcs12"),

  DER("Der"),

  PEM("Pem"),

  UNKNOWN("Unknown");

  private String value;

  CertificateFormat(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CertificateFormat fromValue(String value) {
    for (CertificateFormat b : CertificateFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CertificateFormat> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final CertificateFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CertificateFormat read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return CertificateFormat.fromValue(value);
    }
  }
}
