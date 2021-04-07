// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.EnvironmentSummaryResource;
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
 * EnvironmentsSummaryResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EnvironmentsSummaryResource {
  public static final String SERIALIZED_NAME_ENVIRONMENT_SUMMARIES =
      "EnvironmentSummaries";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_SUMMARIES)
  private List<EnvironmentSummaryResource> environmentSummaries = null;

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

  public EnvironmentsSummaryResource
  environmentSummaries(List<EnvironmentSummaryResource> environmentSummaries) {

    this.environmentSummaries = environmentSummaries;
    return this;
  }

  public EnvironmentsSummaryResource addEnvironmentSummariesItem(
      EnvironmentSummaryResource environmentSummariesItem) {
    if (this.environmentSummaries == null) {
      this.environmentSummaries = new ArrayList<EnvironmentSummaryResource>();
    }
    this.environmentSummaries.add(environmentSummariesItem);
    return this;
  }

  /**
   * Get environmentSummaries
   * @return environmentSummaries
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnvironmentSummaryResource> getEnvironmentSummaries() {
    return environmentSummaries;
  }

  public void setEnvironmentSummaries(
      List<EnvironmentSummaryResource> environmentSummaries) {
    this.environmentSummaries = environmentSummaries;
  }

  public EnvironmentsSummaryResource
  machineEndpointSummaries(Map<String, Integer> machineEndpointSummaries) {

    this.machineEndpointSummaries = machineEndpointSummaries;
    return this;
  }

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource machineHealthStatusSummaries(
      Map<String, Integer> machineHealthStatusSummaries) {

    this.machineHealthStatusSummaries = machineHealthStatusSummaries;
    return this;
  }

  public EnvironmentsSummaryResource putMachineHealthStatusSummariesItem(
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

  public EnvironmentsSummaryResource
  machineIdsForCalamariUpgrade(List<String> machineIdsForCalamariUpgrade) {

    this.machineIdsForCalamariUpgrade = machineIdsForCalamariUpgrade;
    return this;
  }

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource
  machineTenantSummaries(Map<String, Integer> machineTenantSummaries) {

    this.machineTenantSummaries = machineTenantSummaries;
    return this;
  }

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource
  machineTenantTagSummaries(Map<String, Integer> machineTenantTagSummaries) {

    this.machineTenantTagSummaries = machineTenantTagSummaries;
    return this;
  }

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource
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

  public EnvironmentsSummaryResource totalMachines(Integer totalMachines) {

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
    EnvironmentsSummaryResource environmentsSummaryResource =
        (EnvironmentsSummaryResource)o;
    return Objects.equals(this.environmentSummaries,
                          environmentsSummaryResource.environmentSummaries) &&
        Objects.equals(this.machineEndpointSummaries,
                       environmentsSummaryResource.machineEndpointSummaries) &&
        Objects.equals(
            this.machineHealthStatusSummaries,
            environmentsSummaryResource.machineHealthStatusSummaries) &&
        Objects.equals(
            this.machineIdsForCalamariUpgrade,
            environmentsSummaryResource.machineIdsForCalamariUpgrade) &&
        Objects.equals(this.machineTenantSummaries,
                       environmentsSummaryResource.machineTenantSummaries) &&
        Objects.equals(this.machineTenantTagSummaries,
                       environmentsSummaryResource.machineTenantTagSummaries) &&
        Objects.equals(this.tentacleUpgradesRequired,
                       environmentsSummaryResource.tentacleUpgradesRequired) &&
        Objects.equals(this.totalDisabledMachines,
                       environmentsSummaryResource.totalDisabledMachines) &&
        Objects.equals(this.totalMachines,
                       environmentsSummaryResource.totalMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentSummaries, machineEndpointSummaries,
                        machineHealthStatusSummaries,
                        machineIdsForCalamariUpgrade, machineTenantSummaries,
                        machineTenantTagSummaries, tentacleUpgradesRequired,
                        totalDisabledMachines, totalMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentsSummaryResource {\n");
    sb.append("    environmentSummaries: ")
        .append(toIndentedString(environmentSummaries))
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
