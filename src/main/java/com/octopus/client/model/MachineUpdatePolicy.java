// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.CalamariUpdateBehavior;
import com.octopus.client.model.TentacleUpdateBehavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * MachineUpdatePolicy
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineUpdatePolicy {
  public static final String SERIALIZED_NAME_CALAMARI_UPDATE_BEHAVIOR =
      "CalamariUpdateBehavior";
  @SerializedName(SERIALIZED_NAME_CALAMARI_UPDATE_BEHAVIOR)
  private CalamariUpdateBehavior calamariUpdateBehavior;

  public static final String SERIALIZED_NAME_TENTACLE_UPDATE_ACCOUNT_ID =
      "TentacleUpdateAccountId";
  @SerializedName(SERIALIZED_NAME_TENTACLE_UPDATE_ACCOUNT_ID)
  private String tentacleUpdateAccountId;

  public static final String SERIALIZED_NAME_TENTACLE_UPDATE_BEHAVIOR =
      "TentacleUpdateBehavior";
  @SerializedName(SERIALIZED_NAME_TENTACLE_UPDATE_BEHAVIOR)
  private TentacleUpdateBehavior tentacleUpdateBehavior;

  public MachineUpdatePolicy
  calamariUpdateBehavior(CalamariUpdateBehavior calamariUpdateBehavior) {

    this.calamariUpdateBehavior = calamariUpdateBehavior;
    return this;
  }

  /**
   * Get calamariUpdateBehavior
   * @return calamariUpdateBehavior
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CalamariUpdateBehavior getCalamariUpdateBehavior() {
    return calamariUpdateBehavior;
  }

  public void
  setCalamariUpdateBehavior(CalamariUpdateBehavior calamariUpdateBehavior) {
    this.calamariUpdateBehavior = calamariUpdateBehavior;
  }

  public MachineUpdatePolicy
  tentacleUpdateAccountId(String tentacleUpdateAccountId) {

    this.tentacleUpdateAccountId = tentacleUpdateAccountId;
    return this;
  }

  /**
   * Get tentacleUpdateAccountId
   * @return tentacleUpdateAccountId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTentacleUpdateAccountId() {
    return tentacleUpdateAccountId;
  }

  public void setTentacleUpdateAccountId(String tentacleUpdateAccountId) {
    this.tentacleUpdateAccountId = tentacleUpdateAccountId;
  }

  public MachineUpdatePolicy
  tentacleUpdateBehavior(TentacleUpdateBehavior tentacleUpdateBehavior) {

    this.tentacleUpdateBehavior = tentacleUpdateBehavior;
    return this;
  }

  /**
   * Get tentacleUpdateBehavior
   * @return tentacleUpdateBehavior
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TentacleUpdateBehavior getTentacleUpdateBehavior() {
    return tentacleUpdateBehavior;
  }

  public void
  setTentacleUpdateBehavior(TentacleUpdateBehavior tentacleUpdateBehavior) {
    this.tentacleUpdateBehavior = tentacleUpdateBehavior;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineUpdatePolicy machineUpdatePolicy = (MachineUpdatePolicy)o;
    return Objects.equals(this.calamariUpdateBehavior,
                          machineUpdatePolicy.calamariUpdateBehavior) &&
        Objects.equals(this.tentacleUpdateAccountId,
                       machineUpdatePolicy.tentacleUpdateAccountId) &&
        Objects.equals(this.tentacleUpdateBehavior,
                       machineUpdatePolicy.tentacleUpdateBehavior);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calamariUpdateBehavior, tentacleUpdateAccountId,
                        tentacleUpdateBehavior);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineUpdatePolicy {\n");
    sb.append("    calamariUpdateBehavior: ")
        .append(toIndentedString(calamariUpdateBehavior))
        .append("\n");
    sb.append("    tentacleUpdateAccountId: ")
        .append(toIndentedString(tentacleUpdateAccountId))
        .append("\n");
    sb.append("    tentacleUpdateBehavior: ")
        .append(toIndentedString(tentacleUpdateBehavior))
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
