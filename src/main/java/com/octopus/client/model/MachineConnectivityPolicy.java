// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MachineConnectivityBehavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * MachineConnectivityPolicy
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineConnectivityPolicy {
  public static final String SERIALIZED_NAME_MACHINE_CONNECTIVITY_BEHAVIOR =
      "MachineConnectivityBehavior";
  @SerializedName(SERIALIZED_NAME_MACHINE_CONNECTIVITY_BEHAVIOR)
  private MachineConnectivityBehavior machineConnectivityBehavior;

  public MachineConnectivityPolicy machineConnectivityBehavior(
      MachineConnectivityBehavior machineConnectivityBehavior) {

    this.machineConnectivityBehavior = machineConnectivityBehavior;
    return this;
  }

  /**
   * Get machineConnectivityBehavior
   * @return machineConnectivityBehavior
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineConnectivityBehavior getMachineConnectivityBehavior() {
    return machineConnectivityBehavior;
  }

  public void setMachineConnectivityBehavior(
      MachineConnectivityBehavior machineConnectivityBehavior) {
    this.machineConnectivityBehavior = machineConnectivityBehavior;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineConnectivityPolicy machineConnectivityPolicy =
        (MachineConnectivityPolicy)o;
    return Objects.equals(
        this.machineConnectivityBehavior,
        machineConnectivityPolicy.machineConnectivityBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineConnectivityBehavior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineConnectivityPolicy {\n");
    sb.append("    machineConnectivityBehavior: ")
        .append(toIndentedString(machineConnectivityBehavior))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
