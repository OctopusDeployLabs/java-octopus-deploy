// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MachineScriptPolicyRunType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * MachineScriptPolicy
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineScriptPolicy {
  public static final String SERIALIZED_NAME_RUN_TYPE = "RunType";
  @SerializedName(SERIALIZED_NAME_RUN_TYPE)
  private MachineScriptPolicyRunType runType;

  public static final String SERIALIZED_NAME_SCRIPT_BODY = "ScriptBody";
  @SerializedName(SERIALIZED_NAME_SCRIPT_BODY) private String scriptBody;

  public MachineScriptPolicy runType(MachineScriptPolicyRunType runType) {

    this.runType = runType;
    return this;
  }

  /**
   * Get runType
   * @return runType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineScriptPolicyRunType getRunType() {
    return runType;
  }

  public void setRunType(MachineScriptPolicyRunType runType) {
    this.runType = runType;
  }

  public MachineScriptPolicy scriptBody(String scriptBody) {

    this.scriptBody = scriptBody;
    return this;
  }

  /**
   * Get scriptBody
   * @return scriptBody
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScriptBody() {
    return scriptBody;
  }

  public void setScriptBody(String scriptBody) { this.scriptBody = scriptBody; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineScriptPolicy machineScriptPolicy = (MachineScriptPolicy)o;
    return Objects.equals(this.runType, machineScriptPolicy.runType) &&
        Objects.equals(this.scriptBody, machineScriptPolicy.scriptBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runType, scriptBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineScriptPolicy {\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    scriptBody: ")
        .append(toIndentedString(scriptBody))
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
