// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MachineCleanupPolicy;
import com.octopus.client.model.MachineConnectivityPolicy;
import com.octopus.client.model.MachineHealthCheckPolicy;
import com.octopus.client.model.MachineUpdatePolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * MachinePolicyResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachinePolicyResource {
  public static final String SERIALIZED_NAME_CONNECTION_CONNECT_TIMEOUT =
      "ConnectionConnectTimeout";
  @SerializedName(SERIALIZED_NAME_CONNECTION_CONNECT_TIMEOUT)
  private String connectionConnectTimeout;

  public static final String SERIALIZED_NAME_CONNECTION_RETRY_COUNT_LIMIT =
      "ConnectionRetryCountLimit";
  @SerializedName(SERIALIZED_NAME_CONNECTION_RETRY_COUNT_LIMIT)
  private Integer connectionRetryCountLimit;

  public static final String SERIALIZED_NAME_CONNECTION_RETRY_SLEEP_INTERVAL =
      "ConnectionRetrySleepInterval";
  @SerializedName(SERIALIZED_NAME_CONNECTION_RETRY_SLEEP_INTERVAL)
  private String connectionRetrySleepInterval;

  public static final String SERIALIZED_NAME_CONNECTION_RETRY_TIME_LIMIT =
      "ConnectionRetryTimeLimit";
  @SerializedName(SERIALIZED_NAME_CONNECTION_RETRY_TIME_LIMIT)
  private String connectionRetryTimeLimit;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT) private Boolean isDefault;

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

  public static final String SERIALIZED_NAME_MACHINE_CLEANUP_POLICY =
      "MachineCleanupPolicy";
  @SerializedName(SERIALIZED_NAME_MACHINE_CLEANUP_POLICY)
  private MachineCleanupPolicy machineCleanupPolicy;

  public static final String SERIALIZED_NAME_MACHINE_CONNECTIVITY_POLICY =
      "MachineConnectivityPolicy";
  @SerializedName(SERIALIZED_NAME_MACHINE_CONNECTIVITY_POLICY)
  private MachineConnectivityPolicy machineConnectivityPolicy;

  public static final String SERIALIZED_NAME_MACHINE_HEALTH_CHECK_POLICY =
      "MachineHealthCheckPolicy";
  @SerializedName(SERIALIZED_NAME_MACHINE_HEALTH_CHECK_POLICY)
  private MachineHealthCheckPolicy machineHealthCheckPolicy;

  public static final String SERIALIZED_NAME_MACHINE_UPDATE_POLICY =
      "MachineUpdatePolicy";
  @SerializedName(SERIALIZED_NAME_MACHINE_UPDATE_POLICY)
  private MachineUpdatePolicy machineUpdatePolicy;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String
      SERIALIZED_NAME_POLLING_REQUEST_MAXIMUM_MESSAGE_PROCESSING_TIMEOUT =
          "PollingRequestMaximumMessageProcessingTimeout";
  @SerializedName(
      SERIALIZED_NAME_POLLING_REQUEST_MAXIMUM_MESSAGE_PROCESSING_TIMEOUT)
  private String pollingRequestMaximumMessageProcessingTimeout;

  public static final String SERIALIZED_NAME_POLLING_REQUEST_QUEUE_TIMEOUT =
      "PollingRequestQueueTimeout";
  @SerializedName(SERIALIZED_NAME_POLLING_REQUEST_QUEUE_TIMEOUT)
  private String pollingRequestQueueTimeout;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public MachinePolicyResource
  connectionConnectTimeout(String connectionConnectTimeout) {

    this.connectionConnectTimeout = connectionConnectTimeout;
    return this;
  }

  /**
   * Get connectionConnectTimeout
   * @return connectionConnectTimeout
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionConnectTimeout() {
    return connectionConnectTimeout;
  }

  public void setConnectionConnectTimeout(String connectionConnectTimeout) {
    this.connectionConnectTimeout = connectionConnectTimeout;
  }

  public MachinePolicyResource
  connectionRetryCountLimit(Integer connectionRetryCountLimit) {

    this.connectionRetryCountLimit = connectionRetryCountLimit;
    return this;
  }

  /**
   * Get connectionRetryCountLimit
   * @return connectionRetryCountLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConnectionRetryCountLimit() {
    return connectionRetryCountLimit;
  }

  public void setConnectionRetryCountLimit(Integer connectionRetryCountLimit) {
    this.connectionRetryCountLimit = connectionRetryCountLimit;
  }

  public MachinePolicyResource
  connectionRetrySleepInterval(String connectionRetrySleepInterval) {

    this.connectionRetrySleepInterval = connectionRetrySleepInterval;
    return this;
  }

  /**
   * Get connectionRetrySleepInterval
   * @return connectionRetrySleepInterval
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionRetrySleepInterval() {
    return connectionRetrySleepInterval;
  }

  public void
  setConnectionRetrySleepInterval(String connectionRetrySleepInterval) {
    this.connectionRetrySleepInterval = connectionRetrySleepInterval;
  }

  public MachinePolicyResource
  connectionRetryTimeLimit(String connectionRetryTimeLimit) {

    this.connectionRetryTimeLimit = connectionRetryTimeLimit;
    return this;
  }

  /**
   * Get connectionRetryTimeLimit
   * @return connectionRetryTimeLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionRetryTimeLimit() {
    return connectionRetryTimeLimit;
  }

  public void setConnectionRetryTimeLimit(String connectionRetryTimeLimit) {
    this.connectionRetryTimeLimit = connectionRetryTimeLimit;
  }

  public MachinePolicyResource description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MachinePolicyResource id(String id) {

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

  public MachinePolicyResource isDefault(Boolean isDefault) {

    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) { this.isDefault = isDefault; }

  public MachinePolicyResource lastModifiedBy(String lastModifiedBy) {

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

  public MachinePolicyResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public MachinePolicyResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MachinePolicyResource putLinksItem(String key, String linksItem) {
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

  public MachinePolicyResource
  machineCleanupPolicy(MachineCleanupPolicy machineCleanupPolicy) {

    this.machineCleanupPolicy = machineCleanupPolicy;
    return this;
  }

  /**
   * Get machineCleanupPolicy
   * @return machineCleanupPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineCleanupPolicy getMachineCleanupPolicy() {
    return machineCleanupPolicy;
  }

  public void
  setMachineCleanupPolicy(MachineCleanupPolicy machineCleanupPolicy) {
    this.machineCleanupPolicy = machineCleanupPolicy;
  }

  public MachinePolicyResource machineConnectivityPolicy(
      MachineConnectivityPolicy machineConnectivityPolicy) {

    this.machineConnectivityPolicy = machineConnectivityPolicy;
    return this;
  }

  /**
   * Get machineConnectivityPolicy
   * @return machineConnectivityPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineConnectivityPolicy getMachineConnectivityPolicy() {
    return machineConnectivityPolicy;
  }

  public void setMachineConnectivityPolicy(
      MachineConnectivityPolicy machineConnectivityPolicy) {
    this.machineConnectivityPolicy = machineConnectivityPolicy;
  }

  public MachinePolicyResource
  machineHealthCheckPolicy(MachineHealthCheckPolicy machineHealthCheckPolicy) {

    this.machineHealthCheckPolicy = machineHealthCheckPolicy;
    return this;
  }

  /**
   * Get machineHealthCheckPolicy
   * @return machineHealthCheckPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineHealthCheckPolicy getMachineHealthCheckPolicy() {
    return machineHealthCheckPolicy;
  }

  public void setMachineHealthCheckPolicy(
      MachineHealthCheckPolicy machineHealthCheckPolicy) {
    this.machineHealthCheckPolicy = machineHealthCheckPolicy;
  }

  public MachinePolicyResource
  machineUpdatePolicy(MachineUpdatePolicy machineUpdatePolicy) {

    this.machineUpdatePolicy = machineUpdatePolicy;
    return this;
  }

  /**
   * Get machineUpdatePolicy
   * @return machineUpdatePolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineUpdatePolicy getMachineUpdatePolicy() {
    return machineUpdatePolicy;
  }

  public void setMachineUpdatePolicy(MachineUpdatePolicy machineUpdatePolicy) {
    this.machineUpdatePolicy = machineUpdatePolicy;
  }

  public MachinePolicyResource name(String name) {

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

  public MachinePolicyResource pollingRequestMaximumMessageProcessingTimeout(
      String pollingRequestMaximumMessageProcessingTimeout) {

    this.pollingRequestMaximumMessageProcessingTimeout =
        pollingRequestMaximumMessageProcessingTimeout;
    return this;
  }

  /**
   * Get pollingRequestMaximumMessageProcessingTimeout
   * @return pollingRequestMaximumMessageProcessingTimeout
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPollingRequestMaximumMessageProcessingTimeout() {
    return pollingRequestMaximumMessageProcessingTimeout;
  }

  public void setPollingRequestMaximumMessageProcessingTimeout(
      String pollingRequestMaximumMessageProcessingTimeout) {
    this.pollingRequestMaximumMessageProcessingTimeout =
        pollingRequestMaximumMessageProcessingTimeout;
  }

  public MachinePolicyResource
  pollingRequestQueueTimeout(String pollingRequestQueueTimeout) {

    this.pollingRequestQueueTimeout = pollingRequestQueueTimeout;
    return this;
  }

  /**
   * Get pollingRequestQueueTimeout
   * @return pollingRequestQueueTimeout
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPollingRequestQueueTimeout() {
    return pollingRequestQueueTimeout;
  }

  public void setPollingRequestQueueTimeout(String pollingRequestQueueTimeout) {
    this.pollingRequestQueueTimeout = pollingRequestQueueTimeout;
  }

  public MachinePolicyResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachinePolicyResource machinePolicyResource = (MachinePolicyResource)o;
    return Objects.equals(this.connectionConnectTimeout,
                          machinePolicyResource.connectionConnectTimeout) &&
        Objects.equals(this.connectionRetryCountLimit,
                       machinePolicyResource.connectionRetryCountLimit) &&
        Objects.equals(this.connectionRetrySleepInterval,
                       machinePolicyResource.connectionRetrySleepInterval) &&
        Objects.equals(this.connectionRetryTimeLimit,
                       machinePolicyResource.connectionRetryTimeLimit) &&
        Objects.equals(this.description, machinePolicyResource.description) &&
        Objects.equals(this.id, machinePolicyResource.id) &&
        Objects.equals(this.isDefault, machinePolicyResource.isDefault) &&
        Objects.equals(this.lastModifiedBy,
                       machinePolicyResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       machinePolicyResource.lastModifiedOn) &&
        Objects.equals(this.links, machinePolicyResource.links) &&
        Objects.equals(this.machineCleanupPolicy,
                       machinePolicyResource.machineCleanupPolicy) &&
        Objects.equals(this.machineConnectivityPolicy,
                       machinePolicyResource.machineConnectivityPolicy) &&
        Objects.equals(this.machineHealthCheckPolicy,
                       machinePolicyResource.machineHealthCheckPolicy) &&
        Objects.equals(this.machineUpdatePolicy,
                       machinePolicyResource.machineUpdatePolicy) &&
        Objects.equals(this.name, machinePolicyResource.name) &&
        Objects.equals(this.pollingRequestMaximumMessageProcessingTimeout,
                       machinePolicyResource
                           .pollingRequestMaximumMessageProcessingTimeout) &&
        Objects.equals(this.pollingRequestQueueTimeout,
                       machinePolicyResource.pollingRequestQueueTimeout) &&
        Objects.equals(this.spaceId, machinePolicyResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionConnectTimeout, connectionRetryCountLimit,
                        connectionRetrySleepInterval, connectionRetryTimeLimit,
                        description, id, isDefault, lastModifiedBy,
                        lastModifiedOn, links, machineCleanupPolicy,
                        machineConnectivityPolicy, machineHealthCheckPolicy,
                        machineUpdatePolicy, name,
                        pollingRequestMaximumMessageProcessingTimeout,
                        pollingRequestQueueTimeout, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachinePolicyResource {\n");
    sb.append("    connectionConnectTimeout: ")
        .append(toIndentedString(connectionConnectTimeout))
        .append("\n");
    sb.append("    connectionRetryCountLimit: ")
        .append(toIndentedString(connectionRetryCountLimit))
        .append("\n");
    sb.append("    connectionRetrySleepInterval: ")
        .append(toIndentedString(connectionRetrySleepInterval))
        .append("\n");
    sb.append("    connectionRetryTimeLimit: ")
        .append(toIndentedString(connectionRetryTimeLimit))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ")
        .append(toIndentedString(isDefault))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    machineCleanupPolicy: ")
        .append(toIndentedString(machineCleanupPolicy))
        .append("\n");
    sb.append("    machineConnectivityPolicy: ")
        .append(toIndentedString(machineConnectivityPolicy))
        .append("\n");
    sb.append("    machineHealthCheckPolicy: ")
        .append(toIndentedString(machineHealthCheckPolicy))
        .append("\n");
    sb.append("    machineUpdatePolicy: ")
        .append(toIndentedString(machineUpdatePolicy))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pollingRequestMaximumMessageProcessingTimeout: ")
        .append(toIndentedString(pollingRequestMaximumMessageProcessingTimeout))
        .append("\n");
    sb.append("    pollingRequestQueueTimeout: ")
        .append(toIndentedString(pollingRequestQueueTimeout))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
