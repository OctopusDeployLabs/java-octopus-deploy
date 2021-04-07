// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.EnvironmentResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * EnvironmentSummaryResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EnvironmentSummaryResource {
  public static final String SERIALIZED_NAME_ENVIRONMENT = "Environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private EnvironmentResource environment;

  public static final String SERIALIZED_NAME_MACHINE_ENDPOINT_SUMMARIES =
      "MachineEndpointSummaries";
  @SerializedName(SERIALIZED_NAME_MACHINE_ENDPOINT_SUMMARIES)
  private Map<String, Integer> machineEndpointSummaries = null;

  public static final String SERIALIZED_NAME_MACHINE_HEALTH_STATUS_SUMMARIES =
      "MachineHealthStatusSummaries";
  @SerializedName(SERIALIZED_NAME_MACHINE_HEALTH_STATUS_SUMMARIES)
  private Map<String, Integer> machineHealthStatusSummaries = null;

  public static final String SERIALIZED_NAME_MACHINE_IDS_FOR_CALAMARI_UPGRADE =
      "MachineIdsForCalamariUpgrade";
  @SerializedName(SERIALIZED_NAME_MACHINE_IDS_FOR_CALAMARI_UPGRADE)
  private List<String> machineIdsForCalamariUpgrade = null;

  public static final String SERIALIZED_NAME_MACHINE_IDS_FOR_TENTACLE_UPGRADE =
      "MachineIdsForTentacleUpgrade";
  @SerializedName(SERIALIZED_NAME_MACHINE_IDS_FOR_TENTACLE_UPGRADE)
  private List<String> machineIdsForTentacleUpgrade = null;

  public static final String SERIALIZED_NAME_MACHINE_TENANT_SUMMARIES =
      "MachineTenantSummaries";
  @SerializedName(SERIALIZED_NAME_MACHINE_TENANT_SUMMARIES)
  private Map<String, Integer> machineTenantSummaries = null;

  public static final String SERIALIZED_NAME_MACHINE_TENANT_TAG_SUMMARIES =
      "MachineTenantTagSummaries";
  @SerializedName(SERIALIZED_NAME_MACHINE_TENANT_TAG_SUMMARIES)
  private Map<String, Integer> machineTenantTagSummaries = null;

  public static final String SERIALIZED_NAME_TENTACLE_UPGRADES_REQUIRED =
      "TentacleUpgradesRequired";
  @SerializedName(SERIALIZED_NAME_TENTACLE_UPGRADES_REQUIRED)
  private Boolean tentacleUpgradesRequired;

  public static final String SERIALIZED_NAME_TOTAL_DISABLED_MACHINES =
      "TotalDisabledMachines";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISABLED_MACHINES)
  private Integer totalDisabledMachines;

  public static final String SERIALIZED_NAME_TOTAL_MACHINES = "TotalMachines";
  @SerializedName(SERIALIZED_NAME_TOTAL_MACHINES) private Integer totalMachines;

  public EnvironmentSummaryResource
  environment(EnvironmentResource environment) {

    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnvironmentResource getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentResource environment) {
    this.environment = environment;
  }

  public EnvironmentSummaryResource
  machineEndpointSummaries(Map<String, Integer> machineEndpointSummaries) {

    this.machineEndpointSummaries = machineEndpointSummaries;
    return this;
  }

  public EnvironmentSummaryResource
  putMachineEndpointSummariesItem(String key,
                                  Integer machineEndpointSummariesItem) {
    if (this.machineEndpointSummaries == null) {
      this.machineEndpointSummaries = new HashMap<String, Integer>();
    }
    this.machineEndpointSummaries.put(key, machineEndpointSummariesItem);
    return this;
  }

  /**
   * Get machineEndpointSummaries
   * @return machineEndpointSummaries
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getMachineEndpointSummaries() {
    return machineEndpointSummaries;
  }

  public void
  setMachineEndpointSummaries(Map<String, Integer> machineEndpointSummaries) {
    this.machineEndpointSummaries = machineEndpointSummaries;
  }

  public EnvironmentSummaryResource machineHealthStatusSummaries(
      Map<String, Integer> machineHealthStatusSummaries) {

    this.machineHealthStatusSummaries = machineHealthStatusSummaries;
    return this;
  }

  public EnvironmentSummaryResource putMachineHealthStatusSummariesItem(
      String key, Integer machineHealthStatusSummariesItem) {
    if (this.machineHealthStatusSummaries == null) {
      this.machineHealthStatusSummaries = new HashMap<String, Integer>();
    }
    this.machineHealthStatusSummaries.put(key,
                                          machineHealthStatusSummariesItem);
    return this;
  }

  /**
   * Get machineHealthStatusSummaries
   * @return machineHealthStatusSummaries
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getMachineHealthStatusSummaries() {
    return machineHealthStatusSummaries;
  }

  public void setMachineHealthStatusSummaries(
      Map<String, Integer> machineHealthStatusSummaries) {
    this.machineHealthStatusSummaries = machineHealthStatusSummaries;
  }

  public EnvironmentSummaryResource
  machineIdsForCalamariUpgrade(List<String> machineIdsForCalamariUpgrade) {

    this.machineIdsForCalamariUpgrade = machineIdsForCalamariUpgrade;
    return this;
  }

  public EnvironmentSummaryResource
  addMachineIdsForCalamariUpgradeItem(String machineIdsForCalamariUpgradeItem) {
    if (this.machineIdsForCalamariUpgrade == null) {
      this.machineIdsForCalamariUpgrade = new ArrayList<String>();
    }
    this.machineIdsForCalamariUpgrade.add(machineIdsForCalamariUpgradeItem);
    return this;
  }

  /**
   * Get machineIdsForCalamariUpgrade
   * @return machineIdsForCalamariUpgrade
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMachineIdsForCalamariUpgrade() {
    return machineIdsForCalamariUpgrade;
  }

  public void
  setMachineIdsForCalamariUpgrade(List<String> machineIdsForCalamariUpgrade) {
    this.machineIdsForCalamariUpgrade = machineIdsForCalamariUpgrade;
  }

  public EnvironmentSummaryResource
  machineIdsForTentacleUpgrade(List<String> machineIdsForTentacleUpgrade) {

    this.machineIdsForTentacleUpgrade = machineIdsForTentacleUpgrade;
    return this;
  }

  public EnvironmentSummaryResource
  addMachineIdsForTentacleUpgradeItem(String machineIdsForTentacleUpgradeItem) {
    if (this.machineIdsForTentacleUpgrade == null) {
      this.machineIdsForTentacleUpgrade = new ArrayList<String>();
    }
    this.machineIdsForTentacleUpgrade.add(machineIdsForTentacleUpgradeItem);
    return this;
  }

  /**
   * Get machineIdsForTentacleUpgrade
   * @return machineIdsForTentacleUpgrade
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMachineIdsForTentacleUpgrade() {
    return machineIdsForTentacleUpgrade;
  }

  public void
  setMachineIdsForTentacleUpgrade(List<String> machineIdsForTentacleUpgrade) {
    this.machineIdsForTentacleUpgrade = machineIdsForTentacleUpgrade;
  }

  public EnvironmentSummaryResource
  machineTenantSummaries(Map<String, Integer> machineTenantSummaries) {

    this.machineTenantSummaries = machineTenantSummaries;
    return this;
  }

  public EnvironmentSummaryResource
  putMachineTenantSummariesItem(String key,
                                Integer machineTenantSummariesItem) {
    if (this.machineTenantSummaries == null) {
      this.machineTenantSummaries = new HashMap<String, Integer>();
    }
    this.machineTenantSummaries.put(key, machineTenantSummariesItem);
    return this;
  }

  /**
   * Get machineTenantSummaries
   * @return machineTenantSummaries
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getMachineTenantSummaries() {
    return machineTenantSummaries;
  }

  public void
  setMachineTenantSummaries(Map<String, Integer> machineTenantSummaries) {
    this.machineTenantSummaries = machineTenantSummaries;
  }

  public EnvironmentSummaryResource
  machineTenantTagSummaries(Map<String, Integer> machineTenantTagSummaries) {

    this.machineTenantTagSummaries = machineTenantTagSummaries;
    return this;
  }

  public EnvironmentSummaryResource
  putMachineTenantTagSummariesItem(String key,
                                   Integer machineTenantTagSummariesItem) {
    if (this.machineTenantTagSummaries == null) {
      this.machineTenantTagSummaries = new HashMap<String, Integer>();
    }
    this.machineTenantTagSummaries.put(key, machineTenantTagSummariesItem);
    return this;
  }

  /**
   * Get machineTenantTagSummaries
   * @return machineTenantTagSummaries
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getMachineTenantTagSummaries() {
    return machineTenantTagSummaries;
  }

  public void
  setMachineTenantTagSummaries(Map<String, Integer> machineTenantTagSummaries) {
    this.machineTenantTagSummaries = machineTenantTagSummaries;
  }

  public EnvironmentSummaryResource
  tentacleUpgradesRequired(Boolean tentacleUpgradesRequired) {

    this.tentacleUpgradesRequired = tentacleUpgradesRequired;
    return this;
  }

  /**
   * Get tentacleUpgradesRequired
   * @return tentacleUpgradesRequired
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTentacleUpgradesRequired() {
    return tentacleUpgradesRequired;
  }

  public void setTentacleUpgradesRequired(Boolean tentacleUpgradesRequired) {
    this.tentacleUpgradesRequired = tentacleUpgradesRequired;
  }

  public EnvironmentSummaryResource
  totalDisabledMachines(Integer totalDisabledMachines) {

    this.totalDisabledMachines = totalDisabledMachines;
    return this;
  }

  /**
   * Get totalDisabledMachines
   * @return totalDisabledMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalDisabledMachines() {
    return totalDisabledMachines;
  }

  public void setTotalDisabledMachines(Integer totalDisabledMachines) {
    this.totalDisabledMachines = totalDisabledMachines;
  }

  public EnvironmentSummaryResource totalMachines(Integer totalMachines) {

    this.totalMachines = totalMachines;
    return this;
  }

  /**
   * Get totalMachines
   * @return totalMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalMachines() {
    return totalMachines;
  }

  public void setTotalMachines(Integer totalMachines) {
    this.totalMachines = totalMachines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentSummaryResource environmentSummaryResource =
        (EnvironmentSummaryResource)o;
    return Objects.equals(this.environment,
                          environmentSummaryResource.environment) &&
        Objects.equals(this.machineEndpointSummaries,
                       environmentSummaryResource.machineEndpointSummaries) &&
        Objects.equals(
            this.machineHealthStatusSummaries,
            environmentSummaryResource.machineHealthStatusSummaries) &&
        Objects.equals(
            this.machineIdsForCalamariUpgrade,
            environmentSummaryResource.machineIdsForCalamariUpgrade) &&
        Objects.equals(
            this.machineIdsForTentacleUpgrade,
            environmentSummaryResource.machineIdsForTentacleUpgrade) &&
        Objects.equals(this.machineTenantSummaries,
                       environmentSummaryResource.machineTenantSummaries) &&
        Objects.equals(this.machineTenantTagSummaries,
                       environmentSummaryResource.machineTenantTagSummaries) &&
        Objects.equals(this.tentacleUpgradesRequired,
                       environmentSummaryResource.tentacleUpgradesRequired) &&
        Objects.equals(this.totalDisabledMachines,
                       environmentSummaryResource.totalDisabledMachines) &&
        Objects.equals(this.totalMachines,
                       environmentSummaryResource.totalMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        environment, machineEndpointSummaries, machineHealthStatusSummaries,
        machineIdsForCalamariUpgrade, machineIdsForTentacleUpgrade,
        machineTenantSummaries, machineTenantTagSummaries,
        tentacleUpgradesRequired, totalDisabledMachines, totalMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentSummaryResource {\n");
    sb.append("    environment: ")
        .append(toIndentedString(environment))
        .append("\n");
    sb.append("    machineEndpointSummaries: ")
        .append(toIndentedString(machineEndpointSummaries))
        .append("\n");
    sb.append("    machineHealthStatusSummaries: ")
        .append(toIndentedString(machineHealthStatusSummaries))
        .append("\n");
    sb.append("    machineIdsForCalamariUpgrade: ")
        .append(toIndentedString(machineIdsForCalamariUpgrade))
        .append("\n");
    sb.append("    machineIdsForTentacleUpgrade: ")
        .append(toIndentedString(machineIdsForTentacleUpgrade))
        .append("\n");
    sb.append("    machineTenantSummaries: ")
        .append(toIndentedString(machineTenantSummaries))
        .append("\n");
    sb.append("    machineTenantTagSummaries: ")
        .append(toIndentedString(machineTenantTagSummaries))
        .append("\n");
    sb.append("    tentacleUpgradesRequired: ")
        .append(toIndentedString(tentacleUpgradesRequired))
        .append("\n");
    sb.append("    totalDisabledMachines: ")
        .append(toIndentedString(totalDisabledMachines))
        .append("\n");
    sb.append("    totalMachines: ")
        .append(toIndentedString(totalMachines))
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
