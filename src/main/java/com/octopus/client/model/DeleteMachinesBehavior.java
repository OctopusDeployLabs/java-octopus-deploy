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
 * Gets or Sets DeleteMachinesBehavior
 */
@JsonAdapter(DeleteMachinesBehavior.Adapter.class)
public enum DeleteMachinesBehavior {

  DONOTDELETE("DoNotDelete"),

  DELETEUNAVAILABLEMACHINES("DeleteUnavailableMachines");

  private String value;

  DeleteMachinesBehavior(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeleteMachinesBehavior fromValue(String value) {
    for (DeleteMachinesBehavior b : DeleteMachinesBehavior.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeleteMachinesBehavior> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final DeleteMachinesBehavior enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeleteMachinesBehavior read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return DeleteMachinesBehavior.fromValue(value);
    }
  }
}
