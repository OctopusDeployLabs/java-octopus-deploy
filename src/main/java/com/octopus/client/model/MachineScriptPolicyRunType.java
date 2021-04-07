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
 * Gets or Sets MachineScriptPolicyRunType
 */
@JsonAdapter(MachineScriptPolicyRunType.Adapter.class)
public enum MachineScriptPolicyRunType {

  INHERITFROMDEFAULT("InheritFromDefault"),

  INLINE("Inline"),

  ONLYCONNECTIVITY("OnlyConnectivity");

  private String value;

  MachineScriptPolicyRunType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MachineScriptPolicyRunType fromValue(String value) {
    for (MachineScriptPolicyRunType b : MachineScriptPolicyRunType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MachineScriptPolicyRunType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final MachineScriptPolicyRunType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MachineScriptPolicyRunType read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return MachineScriptPolicyRunType.fromValue(value);
    }
  }
}
