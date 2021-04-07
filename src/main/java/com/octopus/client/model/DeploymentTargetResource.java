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
import com.octopus.client.model.TenantedDeploymentMode;
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
 * DeploymentTargetResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentTargetResource {
  public static final String SERIALIZED_NAME_ARCHITECTURE = "Architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE) private String architecture;

  public static final String SERIALIZED_NAME_ENDPOINT = "Endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT) private EndpointResource endpoint;

  public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "EnvironmentIds";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
  private Set<String> environmentIds = null;

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

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES) private Set<String> roles = null;

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

  public static final String SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION =
      "TenantedDeploymentParticipation";
  @SerializedName(SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION)
  private TenantedDeploymentMode tenantedDeploymentParticipation;

  public static final String SERIALIZED_NAME_TENANT_IDS = "TenantIds";
  @SerializedName(SERIALIZED_NAME_TENANT_IDS)
  private Set<String> tenantIds = null;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private Set<String> tenantTags = null;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT) private String thumbprint;

  public static final String SERIALIZED_NAME_URI = "Uri";
  @SerializedName(SERIALIZED_NAME_URI) private String uri;

  public DeploymentTargetResource architecture(String architecture) {

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

  public DeploymentTargetResource endpoint(EndpointResource endpoint) {

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

  public DeploymentTargetResource environmentIds(Set<String> environmentIds) {

    this.environmentIds = environmentIds;
    return this;
  }

  public DeploymentTargetResource
  addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<String>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public DeploymentTargetResource hasLatestCalamari(Boolean hasLatestCalamari) {

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

  public DeploymentTargetResource
  healthStatus(MachineModelHealthStatus healthStatus) {

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

  public DeploymentTargetResource id(String id) {

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

  public DeploymentTargetResource isDisabled(Boolean isDisabled) {

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

  public DeploymentTargetResource isInProcess(Boolean isInProcess) {

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

  public DeploymentTargetResource lastModifiedBy(String lastModifiedBy) {

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

  public DeploymentTargetResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public DeploymentTargetResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentTargetResource putLinksItem(String key, String linksItem) {
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

  public DeploymentTargetResource machinePolicyId(String machinePolicyId) {

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

  public DeploymentTargetResource name(String name) {

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

  public DeploymentTargetResource operatingSystem(String operatingSystem) {

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

  public DeploymentTargetResource roles(Set<String> roles) {

    this.roles = roles;
    return this;
  }

  public DeploymentTargetResource addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new LinkedHashSet<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRoles() {
    return roles;
  }

  public void setRoles(Set<String> roles) { this.roles = roles; }

  public DeploymentTargetResource shellName(String shellName) {

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

  public DeploymentTargetResource shellVersion(String shellVersion) {

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

  public DeploymentTargetResource spaceId(String spaceId) {

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

  public DeploymentTargetResource status(MachineModelStatus status) {

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

  public DeploymentTargetResource statusSummary(String statusSummary) {

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

  public DeploymentTargetResource tenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {

    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
    return this;
  }

  /**
   * Get tenantedDeploymentParticipation
   * @return tenantedDeploymentParticipation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getTenantedDeploymentParticipation() {
    return tenantedDeploymentParticipation;
  }

  public void setTenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {
    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
  }

  public DeploymentTargetResource tenantIds(Set<String> tenantIds) {

    this.tenantIds = tenantIds;
    return this;
  }

  public DeploymentTargetResource addTenantIdsItem(String tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new LinkedHashSet<String>();
    }
    this.tenantIds.add(tenantIdsItem);
    return this;
  }

  /**
   * Get tenantIds
   * @return tenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantIds() {
    return tenantIds;
  }

  public void setTenantIds(Set<String> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public DeploymentTargetResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public DeploymentTargetResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<String>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(Set<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  public DeploymentTargetResource thumbprint(String thumbprint) {

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

  public DeploymentTargetResource uri(String uri) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTargetResource deploymentTargetResource =
        (DeploymentTargetResource)o;
    return Objects.equals(this.architecture,
                          deploymentTargetResource.architecture) &&
        Objects.equals(this.endpoint, deploymentTargetResource.endpoint) &&
        Objects.equals(this.environmentIds,
                       deploymentTargetResource.environmentIds) &&
        Objects.equals(this.hasLatestCalamari,
                       deploymentTargetResource.hasLatestCalamari) &&
        Objects.equals(this.healthStatus,
                       deploymentTargetResource.healthStatus) &&
        Objects.equals(this.id, deploymentTargetResource.id) &&
        Objects.equals(this.isDisabled, deploymentTargetResource.isDisabled) &&
        Objects.equals(this.isInProcess,
                       deploymentTargetResource.isInProcess) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentTargetResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentTargetResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentTargetResource.links) &&
        Objects.equals(this.machinePolicyId,
                       deploymentTargetResource.machinePolicyId) &&
        Objects.equals(this.name, deploymentTargetResource.name) &&
        Objects.equals(this.operatingSystem,
                       deploymentTargetResource.operatingSystem) &&
        Objects.equals(this.roles, deploymentTargetResource.roles) &&
        Objects.equals(this.shellName, deploymentTargetResource.shellName) &&
        Objects.equals(this.shellVersion,
                       deploymentTargetResource.shellVersion) &&
        Objects.equals(this.spaceId, deploymentTargetResource.spaceId) &&
        Objects.equals(this.status, deploymentTargetResource.status) &&
        Objects.equals(this.statusSummary,
                       deploymentTargetResource.statusSummary) &&
        Objects.equals(
            this.tenantedDeploymentParticipation,
            deploymentTargetResource.tenantedDeploymentParticipation) &&
        Objects.equals(this.tenantIds, deploymentTargetResource.tenantIds) &&
        Objects.equals(this.tenantTags, deploymentTargetResource.tenantTags) &&
        Objects.equals(this.thumbprint, deploymentTargetResource.thumbprint) &&
        Objects.equals(this.uri, deploymentTargetResource.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        architecture, endpoint, environmentIds, hasLatestCalamari, healthStatus,
        id, isDisabled, isInProcess, lastModifiedBy, lastModifiedOn, links,
        machinePolicyId, name, operatingSystem, roles, shellName, shellVersion,
        spaceId, status, statusSummary, tenantedDeploymentParticipation,
        tenantIds, tenantTags, thumbprint, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTargetResource {\n");
    sb.append("    architecture: ")
        .append(toIndentedString(architecture))
        .append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    environmentIds: ")
        .append(toIndentedString(environmentIds))
        .append("\n");
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
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    sb.append("    tenantedDeploymentParticipation: ")
        .append(toIndentedString(tenantedDeploymentParticipation))
        .append("\n");
    sb.append("    tenantIds: ")
        .append(toIndentedString(tenantIds))
        .append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
        .append("\n");
    sb.append("    thumbprint: ")
        .append(toIndentedString(thumbprint))
        .append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
