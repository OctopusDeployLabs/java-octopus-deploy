// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActivityLogElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * MachineConnectionStatus
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineConnectionStatus {
  public static final String SERIALIZED_NAME_CURRENT_TENTACLE_VERSION =
      "CurrentTentacleVersion";
  @SerializedName(SERIALIZED_NAME_CURRENT_TENTACLE_VERSION)
  private String currentTentacleVersion;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_CHECKED = "LastChecked";
  @SerializedName(SERIALIZED_NAME_LAST_CHECKED)
  private OffsetDateTime lastChecked;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_LOGS = "Logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<ActivityLogElement> logs = null;

  public static final String SERIALIZED_NAME_MACHINE_ID = "MachineId";
  @SerializedName(SERIALIZED_NAME_MACHINE_ID) private String machineId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS) private String status;

  public MachineConnectionStatus
  currentTentacleVersion(String currentTentacleVersion) {

    this.currentTentacleVersion = currentTentacleVersion;
    return this;
  }

  /**
   * Get currentTentacleVersion
   * @return currentTentacleVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentTentacleVersion() {
    return currentTentacleVersion;
  }

  public void setCurrentTentacleVersion(String currentTentacleVersion) {
    this.currentTentacleVersion = currentTentacleVersion;
  }

  public MachineConnectionStatus id(String id) {

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

  public MachineConnectionStatus lastChecked(OffsetDateTime lastChecked) {

    this.lastChecked = lastChecked;
    return this;
  }

  /**
   * Get lastChecked
   * @return lastChecked
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastChecked() {
    return lastChecked;
  }

  public void setLastChecked(OffsetDateTime lastChecked) {
    this.lastChecked = lastChecked;
  }

  public MachineConnectionStatus lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public MachineConnectionStatus lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public MachineConnectionStatus links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MachineConnectionStatus putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  public MachineConnectionStatus logs(List<ActivityLogElement> logs) {

    this.logs = logs;
    return this;
  }

  public MachineConnectionStatus addLogsItem(ActivityLogElement logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<ActivityLogElement>();
    }
    this.logs.add(logsItem);
    return this;
  }

  /**
   * Get logs
   * @return logs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActivityLogElement> getLogs() {
    return logs;
  }

  public void setLogs(List<ActivityLogElement> logs) { this.logs = logs; }

  public MachineConnectionStatus machineId(String machineId) {

    this.machineId = machineId;
    return this;
  }

  /**
   * Get machineId
   * @return machineId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMachineId() {
    return machineId;
  }

  public void setMachineId(String machineId) { this.machineId = machineId; }

  public MachineConnectionStatus status(String status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) { this.status = status; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineConnectionStatus machineConnectionStatus =
        (MachineConnectionStatus)o;
    return Objects.equals(this.currentTentacleVersion,
                          machineConnectionStatus.currentTentacleVersion) &&
        Objects.equals(this.id, machineConnectionStatus.id) &&
        Objects.equals(this.lastChecked, machineConnectionStatus.lastChecked) &&
        Objects.equals(this.lastModifiedBy,
                       machineConnectionStatus.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       machineConnectionStatus.lastModifiedOn) &&
        Objects.equals(this.links, machineConnectionStatus.links) &&
        Objects.equals(this.logs, machineConnectionStatus.logs) &&
        Objects.equals(this.machineId, machineConnectionStatus.machineId) &&
        Objects.equals(this.status, machineConnectionStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTentacleVersion, id, lastChecked, lastModifiedBy,
                        lastModifiedOn, links, logs, machineId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineConnectionStatus {\n");
    sb.append("    currentTentacleVersion: ")
        .append(toIndentedString(currentTentacleVersion))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastChecked: ")
        .append(toIndentedString(lastChecked))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    machineId: ")
        .append(toIndentedString(machineId))
        .append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
