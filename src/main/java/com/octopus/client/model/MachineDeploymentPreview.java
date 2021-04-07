// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MachineStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * MachineDeploymentPreview
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineDeploymentPreview {
  public static final String SERIALIZED_NAME_HAS_LATEST_CALAMARI =
      "HasLatestCalamari";
  @SerializedName(SERIALIZED_NAME_HAS_LATEST_CALAMARI)
  private Boolean hasLatestCalamari;

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "HealthStatus";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  private MachineStatus healthStatus;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public MachineDeploymentPreview hasLatestCalamari(Boolean hasLatestCalamari) {

    this.hasLatestCalamari = hasLatestCalamari;
    return this;
  }

  /**
   * Get hasLatestCalamari
   * @return hasLatestCalamari
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasLatestCalamari() {
    return hasLatestCalamari;
  }

  public void setHasLatestCalamari(Boolean hasLatestCalamari) {
    this.hasLatestCalamari = hasLatestCalamari;
  }

  public MachineDeploymentPreview healthStatus(MachineStatus healthStatus) {

    this.healthStatus = healthStatus;
    return this;
  }

  /**
   * Get healthStatus
   * @return healthStatus
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineStatus getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(MachineStatus healthStatus) {
    this.healthStatus = healthStatus;
  }

  public MachineDeploymentPreview id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public MachineDeploymentPreview name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineDeploymentPreview machineDeploymentPreview =
        (MachineDeploymentPreview)o;
    return Objects.equals(this.hasLatestCalamari,
                          machineDeploymentPreview.hasLatestCalamari) &&
        Objects.equals(this.healthStatus,
                       machineDeploymentPreview.healthStatus) &&
        Objects.equals(this.id, machineDeploymentPreview.id) &&
        Objects.equals(this.name, machineDeploymentPreview.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasLatestCalamari, healthStatus, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineDeploymentPreview {\n");
    sb.append("    hasLatestCalamari: ")
        .append(toIndentedString(hasLatestCalamari))
        .append("\n");
    sb.append("    healthStatus: ")
        .append(toIndentedString(healthStatus))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
