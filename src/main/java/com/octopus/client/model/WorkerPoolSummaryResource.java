// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.WorkerPoolResource;
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
 * WorkerPoolSummaryResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkerPoolSummaryResource {
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

  public static final String SERIALIZED_NAME_WORKER_POOL = "WorkerPool";
  @SerializedName(SERIALIZED_NAME_WORKER_POOL)
  private WorkerPoolResource workerPool;

  public WorkerPoolSummaryResource
  machineEndpointSummaries(Map<String, Integer> machineEndpointSummaries) {

    this.machineEndpointSummaries = machineEndpointSummaries;
    return this;
  }

  public WorkerPoolSummaryResource
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

  public WorkerPoolSummaryResource machineHealthStatusSummaries(
      Map<String, Integer> machineHealthStatusSummaries) {

    this.machineHealthStatusSummaries = machineHealthStatusSummaries;
    return this;
  }

  public WorkerPoolSummaryResource putMachineHealthStatusSummariesItem(
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

  public WorkerPoolSummaryResource
  machineIdsForCalamariUpgrade(List<String> machineIdsForCalamariUpgrade) {

    this.machineIdsForCalamariUpgrade = machineIdsForCalamariUpgrade;
    return this;
  }

  public WorkerPoolSummaryResource
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

  public WorkerPoolSummaryResource
  machineIdsForTentacleUpgrade(List<String> machineIdsForTentacleUpgrade) {

    this.machineIdsForTentacleUpgrade = machineIdsForTentacleUpgrade;
    return this;
  }

  public WorkerPoolSummaryResource
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

  public WorkerPoolSummaryResource
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

  public WorkerPoolSummaryResource
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

  public WorkerPoolSummaryResource totalMachines(Integer totalMachines) {

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

  public WorkerPoolSummaryResource workerPool(WorkerPoolResource workerPool) {

    this.workerPool = workerPool;
    return this;
  }

  /**
   * Get workerPool
   * @return workerPool
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkerPoolResource getWorkerPool() {
    return workerPool;
  }

  public void setWorkerPool(WorkerPoolResource workerPool) {
    this.workerPool = workerPool;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPoolSummaryResource workerPoolSummaryResource =
        (WorkerPoolSummaryResource)o;
    return Objects.equals(this.machineEndpointSummaries,
                          workerPoolSummaryResource.machineEndpointSummaries) &&
        Objects.equals(
            this.machineHealthStatusSummaries,
            workerPoolSummaryResource.machineHealthStatusSummaries) &&
        Objects.equals(
            this.machineIdsForCalamariUpgrade,
            workerPoolSummaryResource.machineIdsForCalamariUpgrade) &&
        Objects.equals(
            this.machineIdsForTentacleUpgrade,
            workerPoolSummaryResource.machineIdsForTentacleUpgrade) &&
        Objects.equals(this.tentacleUpgradesRequired,
                       workerPoolSummaryResource.tentacleUpgradesRequired) &&
        Objects.equals(this.totalDisabledMachines,
                       workerPoolSummaryResource.totalDisabledMachines) &&
        Objects.equals(this.totalMachines,
                       workerPoolSummaryResource.totalMachines) &&
        Objects.equals(this.workerPool, workerPoolSummaryResource.workerPool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machineEndpointSummaries, machineHealthStatusSummaries,
                        machineIdsForCalamariUpgrade,
                        machineIdsForTentacleUpgrade, tentacleUpgradesRequired,
                        totalDisabledMachines, totalMachines, workerPool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPoolSummaryResource {\n");
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
    sb.append("    tentacleUpgradesRequired: ")
        .append(toIndentedString(tentacleUpgradesRequired))
        .append("\n");
    sb.append("    totalDisabledMachines: ")
        .append(toIndentedString(totalDisabledMachines))
        .append("\n");
    sb.append("    totalMachines: ")
        .append(toIndentedString(totalMachines))
        .append("\n");
    sb.append("    workerPool: ")
        .append(toIndentedString(workerPool))
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
