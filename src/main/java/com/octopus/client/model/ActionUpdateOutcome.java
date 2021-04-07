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
 * Gets or Sets ActionUpdateOutcome
 */
@JsonAdapter(ActionUpdateOutcome.Adapter.class)
public enum ActionUpdateOutcome {

  SUCCESS("Success"),

  MANUALMERGEREQUIRED("ManualMergeRequired"),

  DEFAULTPARAMTERVALUEMISSING("DefaultParamterValueMissing"),

  REMOVEDPACKAGEINUSE("RemovedPackageInUse");

  private String value;

  ActionUpdateOutcome(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActionUpdateOutcome fromValue(String value) {
    for (ActionUpdateOutcome b : ActionUpdateOutcome.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActionUpdateOutcome> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final ActionUpdateOutcome enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActionUpdateOutcome read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return ActionUpdateOutcome.fromValue(value);
    }
  }
}
