// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.EndpointResource;
import com.octopus.client.model.MachineModelHealthStatus;
import com.octopus.client.model.MachineModelStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * WorkerResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkerResource {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE) private String architecture;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT) private EndpointResource endpoint;

  public static final String SERIALIZED_NAME_HAS_LATEST_CALAMARI =
      "HasLatestCalamari";
  @SerializedName(SERIALIZED_NAME_HAS_LATEST_CALAMARI)
  private Boolean hasLatestCalamari;

  public static final String SERIALIZED_NAME_HEALTH_STATUS = "HealthStatus";
  @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
  private MachineModelHealthStatus healthStatus;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

  public static final String SERIALIZED_NAME_IS_IN_PROCESS = "IsInProcess";
  @SerializedName(SERIALIZED_NAME_IS_IN_PROCESS) private Boolean isInProcess;

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

  public static final String SERIALIZED_NAME_MACHINE_POLICY_ID =
      "MachinePolicyId";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_ID)
  private String machinePolicyId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEM =
      "OperatingSystem";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEM)
  private String operatingSystem;

  public static final String SERIALIZED_NAME_SHELL_NAME = "ShellName";
  @SerializedName(SERIALIZED_NAME_SHELL_NAME) private String shellName;

  public static final String SERIALIZED_NAME_SHELL_VERSION = "ShellVersion";
  @SerializedName(SERIALIZED_NAME_SHELL_VERSION) private String shellVersion;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS) private MachineModelStatus status;

  public static final String SERIALIZED_NAME_STATUS_SUMMARY = "StatusSummary";
  @SerializedName(SERIALIZED_NAME_STATUS_SUMMARY) private String statusSummary;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT) private String thumbprint;

  public static final String SERIALIZED_NAME_URI = "Uri";
  @SerializedName(SERIALIZED_NAME_URI) private String uri;

  public static final String SERIALIZED_NAME_WORKER_POOL_IDS = "WorkerPoolIds";
  @SerializedName(SERIALIZED_NAME_WORKER_POOL_IDS)
  private Set<String> workerPoolIds = null;

  public WorkerResource architecture(String architecture) {

    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public WorkerResource endpoint(EndpointResource endpoint) {

    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EndpointResource getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(EndpointResource endpoint) {
    this.endpoint = endpoint;
  }

  public WorkerResource hasLatestCalamari(Boolean hasLatestCalamari) {

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

  public WorkerResource healthStatus(MachineModelHealthStatus healthStatus) {

    this.healthStatus = healthStatus;
    return this;
  }

  /**
   * Get healthStatus
   * @return healthStatus
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineModelHealthStatus getHealthStatus() {
    return healthStatus;
  }

  public void setHealthStatus(MachineModelHealthStatus healthStatus) {
    this.healthStatus = healthStatus;
  }

  public WorkerResource id(String id) {

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

  public WorkerResource isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public WorkerResource isInProcess(Boolean isInProcess) {

    this.isInProcess = isInProcess;
    return this;
  }

  /**
   * Get isInProcess
   * @return isInProcess
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInProcess() {
    return isInProcess;
  }

  public void setIsInProcess(Boolean isInProcess) {
    this.isInProcess = isInProcess;
  }

  public WorkerResource lastModifiedBy(String lastModifiedBy) {

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

  public WorkerResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public WorkerResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public WorkerResource putLinksItem(String key, String linksItem) {
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

  public WorkerResource machinePolicyId(String machinePolicyId) {

    this.machinePolicyId = machinePolicyId;
    return this;
  }

  /**
   * Get machinePolicyId
   * @return machinePolicyId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMachinePolicyId() {
    return machinePolicyId;
  }

  public void setMachinePolicyId(String machinePolicyId) {
    this.machinePolicyId = machinePolicyId;
  }

  public WorkerResource name(String name) {

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

  public WorkerResource operatingSystem(String operatingSystem) {

    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Get operatingSystem
   * @return operatingSystem
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public WorkerResource shellName(String shellName) {

    this.shellName = shellName;
    return this;
  }

  /**
   * Get shellName
   * @return shellName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShellName() {
    return shellName;
  }

  public void setShellName(String shellName) { this.shellName = shellName; }

  public WorkerResource shellVersion(String shellVersion) {

    this.shellVersion = shellVersion;
    return this;
  }

  /**
   * Get shellVersion
   * @return shellVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShellVersion() {
    return shellVersion;
  }

  public void setShellVersion(String shellVersion) {
    this.shellVersion = shellVersion;
  }

  public WorkerResource spaceId(String spaceId) {

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

  public WorkerResource status(MachineModelStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineModelStatus getStatus() {
    return status;
  }

  public void setStatus(MachineModelStatus status) { this.status = status; }

  public WorkerResource statusSummary(String statusSummary) {

    this.statusSummary = statusSummary;
    return this;
  }

  /**
   * Get statusSummary
   * @return statusSummary
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusSummary() {
    return statusSummary;
  }

  public void setStatusSummary(String statusSummary) {
    this.statusSummary = statusSummary;
  }

  public WorkerResource thumbprint(String thumbprint) {

    this.thumbprint = thumbprint;
    return this;
  }

  /**
   * Get thumbprint
   * @return thumbprint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) { this.thumbprint = thumbprint; }

  public WorkerResource uri(String uri) {

    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) { this.uri = uri; }

  public WorkerResource workerPoolIds(Set<String> workerPoolIds) {

    this.workerPoolIds = workerPoolIds;
    return this;
  }

  public WorkerResource addWorkerPoolIdsItem(String workerPoolIdsItem) {
    if (this.workerPoolIds == null) {
      this.workerPoolIds = new LinkedHashSet<String>();
    }
    this.workerPoolIds.add(workerPoolIdsItem);
    return this;
  }

  /**
   * Get workerPoolIds
   * @return workerPoolIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getWorkerPoolIds() {
    return workerPoolIds;
  }

  public void setWorkerPoolIds(Set<String> workerPoolIds) {
    this.workerPoolIds = workerPoolIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerResource workerResource = (WorkerResource)o;
    return Objects.equals(this.architecture, workerResource.architecture) &&
        Objects.equals(this.endpoint, workerResource.endpoint) &&
        Objects.equals(this.hasLatestCalamari,
                       workerResource.hasLatestCalamari) &&
        Objects.equals(this.healthStatus, workerResource.healthStatus) &&
        Objects.equals(this.id, workerResource.id) &&
        Objects.equals(this.isDisabled, workerResource.isDisabled) &&
        Objects.equals(this.isInProcess, workerResource.isInProcess) &&
        Objects.equals(this.lastModifiedBy, workerResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, workerResource.lastModifiedOn) &&
        Objects.equals(this.links, workerResource.links) &&
        Objects.equals(this.machinePolicyId, workerResource.machinePolicyId) &&
        Objects.equals(this.name, workerResource.name) &&
        Objects.equals(this.operatingSystem, workerResource.operatingSystem) &&
        Objects.equals(this.shellName, workerResource.shellName) &&
        Objects.equals(this.shellVersion, workerResource.shellVersion) &&
        Objects.equals(this.spaceId, workerResource.spaceId) &&
        Objects.equals(this.status, workerResource.status) &&
        Objects.equals(this.statusSummary, workerResource.statusSummary) &&
        Objects.equals(this.thumbprint, workerResource.thumbprint) &&
        Objects.equals(this.uri, workerResource.uri) &&
        Objects.equals(this.workerPoolIds, workerResource.workerPoolIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, endpoint, hasLatestCalamari, healthStatus,
                        id, isDisabled, isInProcess, lastModifiedBy,
                        lastModifiedOn, links, machinePolicyId, name,
                        operatingSystem, shellName, shellVersion, spaceId,
                        status, statusSummary, thumbprint, uri, workerPoolIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerResource {\n");
    sb.append("    architecture: ")
        .append(toIndentedString(architecture))
        .append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    hasLatestCalamari: ")
        .append(toIndentedString(hasLatestCalamari))
        .append("\n");
    sb.append("    healthStatus: ")
        .append(toIndentedString(healthStatus))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    isInProcess: ")
        .append(toIndentedString(isInProcess))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    machinePolicyId: ")
        .append(toIndentedString(machinePolicyId))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operatingSystem: ")
        .append(toIndentedString(operatingSystem))
        .append("\n");
    sb.append("    shellName: ")
        .append(toIndentedString(shellName))
        .append("\n");
    sb.append("    shellVersion: ")
        .append(toIndentedString(shellVersion))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusSummary: ")
        .append(toIndentedString(statusSummary))
        .append("\n");
    sb.append("    thumbprint: ")
        .append(toIndentedString(thumbprint))
        .append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    workerPoolIds: ")
        .append(toIndentedString(workerPoolIds))
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
