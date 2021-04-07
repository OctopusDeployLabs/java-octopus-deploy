// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentConnectivityPolicy;
import com.octopus.client.model.GuidedFailureMode;
import com.octopus.client.model.RunbookEnvironmentScope;
import com.octopus.client.model.RunbookRetentionPeriod;
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
 * RunbookResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookResource {
  public static final String SERIALIZED_NAME_CONNECTIVITY_POLICY =
      "ConnectivityPolicy";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_POLICY)
  private DeploymentConnectivityPolicy connectivityPolicy;

  public static final String SERIALIZED_NAME_DEFAULT_GUIDED_FAILURE_MODE =
      "DefaultGuidedFailureMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GUIDED_FAILURE_MODE)
  private GuidedFailureMode defaultGuidedFailureMode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private Set<String> environments = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_SCOPE =
      "EnvironmentScope";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_SCOPE)
  private RunbookEnvironmentScope environmentScope;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

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

  public static final String SERIALIZED_NAME_MULTI_TENANCY_MODE =
      "MultiTenancyMode";
  @SerializedName(SERIALIZED_NAME_MULTI_TENANCY_MODE)
  private TenantedDeploymentMode multiTenancyMode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PUBLISHED_RUNBOOK_SNAPSHOT_ID =
      "PublishedRunbookSnapshotId";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_RUNBOOK_SNAPSHOT_ID)
  private String publishedRunbookSnapshotId;

  public static final String SERIALIZED_NAME_RUNBOOK_PROCESS_ID =
      "RunbookProcessId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_PROCESS_ID)
  private String runbookProcessId;

  public static final String SERIALIZED_NAME_RUN_RETENTION_POLICY =
      "RunRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_RUN_RETENTION_POLICY)
  private RunbookRetentionPeriod runRetentionPolicy;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public RunbookResource
  connectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {

    this.connectivityPolicy = connectivityPolicy;
    return this;
  }

  /**
   * Get connectivityPolicy
   * @return connectivityPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentConnectivityPolicy getConnectivityPolicy() {
    return connectivityPolicy;
  }

  public void
  setConnectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {
    this.connectivityPolicy = connectivityPolicy;
  }

  public RunbookResource
  defaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {

    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
    return this;
  }

  /**
   * Get defaultGuidedFailureMode
   * @return defaultGuidedFailureMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GuidedFailureMode getDefaultGuidedFailureMode() {
    return defaultGuidedFailureMode;
  }

  public void
  setDefaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {
    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
  }

  public RunbookResource description(String description) {

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

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironments() {
    return environments;
  }

  public RunbookResource
  environmentScope(RunbookEnvironmentScope environmentScope) {

    this.environmentScope = environmentScope;
    return this;
  }

  /**
   * Get environmentScope
   * @return environmentScope
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunbookEnvironmentScope getEnvironmentScope() {
    return environmentScope;
  }

  public void setEnvironmentScope(RunbookEnvironmentScope environmentScope) {
    this.environmentScope = environmentScope;
  }

  public RunbookResource id(String id) {

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

  public RunbookResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbookResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public RunbookResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbookResource putLinksItem(String key, String linksItem) {
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

  public RunbookResource
  multiTenancyMode(TenantedDeploymentMode multiTenancyMode) {

    this.multiTenancyMode = multiTenancyMode;
    return this;
  }

  /**
   * Get multiTenancyMode
   * @return multiTenancyMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getMultiTenancyMode() {
    return multiTenancyMode;
  }

  public void setMultiTenancyMode(TenantedDeploymentMode multiTenancyMode) {
    this.multiTenancyMode = multiTenancyMode;
  }

  public RunbookResource name(String name) {

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

  public RunbookResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public RunbookResource
  publishedRunbookSnapshotId(String publishedRunbookSnapshotId) {

    this.publishedRunbookSnapshotId = publishedRunbookSnapshotId;
    return this;
  }

  /**
   * Get publishedRunbookSnapshotId
   * @return publishedRunbookSnapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublishedRunbookSnapshotId() {
    return publishedRunbookSnapshotId;
  }

  public void setPublishedRunbookSnapshotId(String publishedRunbookSnapshotId) {
    this.publishedRunbookSnapshotId = publishedRunbookSnapshotId;
  }

  public RunbookResource runbookProcessId(String runbookProcessId) {

    this.runbookProcessId = runbookProcessId;
    return this;
  }

  /**
   * Get runbookProcessId
   * @return runbookProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookProcessId() {
    return runbookProcessId;
  }

  public void setRunbookProcessId(String runbookProcessId) {
    this.runbookProcessId = runbookProcessId;
  }

  public RunbookResource
  runRetentionPolicy(RunbookRetentionPeriod runRetentionPolicy) {

    this.runRetentionPolicy = runRetentionPolicy;
    return this;
  }

  /**
   * Get runRetentionPolicy
   * @return runRetentionPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RunbookRetentionPeriod getRunRetentionPolicy() {
    return runRetentionPolicy;
  }

  public void setRunRetentionPolicy(RunbookRetentionPeriod runRetentionPolicy) {
    this.runRetentionPolicy = runRetentionPolicy;
  }

  public RunbookResource spaceId(String spaceId) {

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
    RunbookResource runbookResource = (RunbookResource)o;
    return Objects.equals(this.connectivityPolicy,
                          runbookResource.connectivityPolicy) &&
        Objects.equals(this.defaultGuidedFailureMode,
                       runbookResource.defaultGuidedFailureMode) &&
        Objects.equals(this.description, runbookResource.description) &&
        Objects.equals(this.environments, runbookResource.environments) &&
        Objects.equals(this.environmentScope,
                       runbookResource.environmentScope) &&
        Objects.equals(this.id, runbookResource.id) &&
        Objects.equals(this.lastModifiedBy, runbookResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, runbookResource.lastModifiedOn) &&
        Objects.equals(this.links, runbookResource.links) &&
        Objects.equals(this.multiTenancyMode,
                       runbookResource.multiTenancyMode) &&
        Objects.equals(this.name, runbookResource.name) &&
        Objects.equals(this.projectId, runbookResource.projectId) &&
        Objects.equals(this.publishedRunbookSnapshotId,
                       runbookResource.publishedRunbookSnapshotId) &&
        Objects.equals(this.runbookProcessId,
                       runbookResource.runbookProcessId) &&
        Objects.equals(this.runRetentionPolicy,
                       runbookResource.runRetentionPolicy) &&
        Objects.equals(this.spaceId, runbookResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityPolicy, defaultGuidedFailureMode,
                        description, environments, environmentScope, id,
                        lastModifiedBy, lastModifiedOn, links, multiTenancyMode,
                        name, projectId, publishedRunbookSnapshotId,
                        runbookProcessId, runRetentionPolicy, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookResource {\n");
    sb.append("    connectivityPolicy: ")
        .append(toIndentedString(connectivityPolicy))
        .append("\n");
    sb.append("    defaultGuidedFailureMode: ")
        .append(toIndentedString(defaultGuidedFailureMode))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    environmentScope: ")
        .append(toIndentedString(environmentScope))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    multiTenancyMode: ")
        .append(toIndentedString(multiTenancyMode))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    publishedRunbookSnapshotId: ")
        .append(toIndentedString(publishedRunbookSnapshotId))
        .append("\n");
    sb.append("    runbookProcessId: ")
        .append(toIndentedString(runbookProcessId))
        .append("\n");
    sb.append("    runRetentionPolicy: ")
        .append(toIndentedString(runRetentionPolicy))
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
