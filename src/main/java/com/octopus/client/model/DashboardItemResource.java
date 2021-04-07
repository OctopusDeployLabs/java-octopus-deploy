// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.TaskState;
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
 * DashboardItemResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DashboardItemResource {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID) private String channelId;

  public static final String SERIALIZED_NAME_COMPLETED_TIME = "CompletedTime";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TIME)
  private OffsetDateTime completedTime;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "DeploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID) private String deploymentId;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION) private String duration;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "EnvironmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID) private String environmentId;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE) private String errorMessage;

  public static final String SERIALIZED_NAME_HAS_PENDING_INTERRUPTIONS =
      "HasPendingInterruptions";
  @SerializedName(SERIALIZED_NAME_HAS_PENDING_INTERRUPTIONS)
  private Boolean hasPendingInterruptions;

  public static final String SERIALIZED_NAME_HAS_WARNINGS_OR_ERRORS =
      "HasWarningsOrErrors";
  @SerializedName(SERIALIZED_NAME_HAS_WARNINGS_OR_ERRORS)
  private Boolean hasWarningsOrErrors;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_COMPLETED = "IsCompleted";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETED) private Boolean isCompleted;

  public static final String SERIALIZED_NAME_IS_CURRENT = "IsCurrent";
  @SerializedName(SERIALIZED_NAME_IS_CURRENT) private Boolean isCurrent;

  public static final String SERIALIZED_NAME_IS_PREVIOUS = "IsPrevious";
  @SerializedName(SERIALIZED_NAME_IS_PREVIOUS) private Boolean isPrevious;

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

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_QUEUE_TIME = "QueueTime";
  @SerializedName(SERIALIZED_NAME_QUEUE_TIME) private OffsetDateTime queueTime;

  public static final String SERIALIZED_NAME_RELEASE_ID = "ReleaseId";
  @SerializedName(SERIALIZED_NAME_RELEASE_ID) private String releaseId;

  public static final String SERIALIZED_NAME_RELEASE_VERSION = "ReleaseVersion";
  @SerializedName(SERIALIZED_NAME_RELEASE_VERSION)
  private String releaseVersion;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME) private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE) private TaskState state;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  public DashboardItemResource channelId(String channelId) {

    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) { this.channelId = channelId; }

  public DashboardItemResource completedTime(OffsetDateTime completedTime) {

    this.completedTime = completedTime;
    return this;
  }

  /**
   * Get completedTime
   * @return completedTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public DashboardItemResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public DashboardItemResource deploymentId(String deploymentId) {

    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public DashboardItemResource duration(String duration) {

    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) { this.duration = duration; }

  public DashboardItemResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  /**
   * Get environmentId
   * @return environmentId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public DashboardItemResource errorMessage(String errorMessage) {

    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DashboardItemResource
  hasPendingInterruptions(Boolean hasPendingInterruptions) {

    this.hasPendingInterruptions = hasPendingInterruptions;
    return this;
  }

  /**
   * Get hasPendingInterruptions
   * @return hasPendingInterruptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasPendingInterruptions() {
    return hasPendingInterruptions;
  }

  public void setHasPendingInterruptions(Boolean hasPendingInterruptions) {
    this.hasPendingInterruptions = hasPendingInterruptions;
  }

  public DashboardItemResource
  hasWarningsOrErrors(Boolean hasWarningsOrErrors) {

    this.hasWarningsOrErrors = hasWarningsOrErrors;
    return this;
  }

  /**
   * Get hasWarningsOrErrors
   * @return hasWarningsOrErrors
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasWarningsOrErrors() {
    return hasWarningsOrErrors;
  }

  public void setHasWarningsOrErrors(Boolean hasWarningsOrErrors) {
    this.hasWarningsOrErrors = hasWarningsOrErrors;
  }

  public DashboardItemResource id(String id) {

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

  public DashboardItemResource isCompleted(Boolean isCompleted) {

    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Get isCompleted
   * @return isCompleted
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public DashboardItemResource isCurrent(Boolean isCurrent) {

    this.isCurrent = isCurrent;
    return this;
  }

  /**
   * Get isCurrent
   * @return isCurrent
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(Boolean isCurrent) { this.isCurrent = isCurrent; }

  public DashboardItemResource isPrevious(Boolean isPrevious) {

    this.isPrevious = isPrevious;
    return this;
  }

  /**
   * Get isPrevious
   * @return isPrevious
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrevious() {
    return isPrevious;
  }

  public void setIsPrevious(Boolean isPrevious) {
    this.isPrevious = isPrevious;
  }

  public DashboardItemResource lastModifiedBy(String lastModifiedBy) {

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

  public DashboardItemResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public DashboardItemResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DashboardItemResource putLinksItem(String key, String linksItem) {
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

  public DashboardItemResource projectId(String projectId) {

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

  public DashboardItemResource queueTime(OffsetDateTime queueTime) {

    this.queueTime = queueTime;
    return this;
  }

  /**
   * Get queueTime
   * @return queueTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(OffsetDateTime queueTime) {
    this.queueTime = queueTime;
  }

  public DashboardItemResource releaseId(String releaseId) {

    this.releaseId = releaseId;
    return this;
  }

  /**
   * Get releaseId
   * @return releaseId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) { this.releaseId = releaseId; }

  public DashboardItemResource releaseVersion(String releaseVersion) {

    this.releaseVersion = releaseVersion;
    return this;
  }

  /**
   * Get releaseVersion
   * @return releaseVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseVersion() {
    return releaseVersion;
  }

  public void setReleaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
  }

  public DashboardItemResource startTime(OffsetDateTime startTime) {

    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public DashboardItemResource state(TaskState state) {

    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) { this.state = state; }

  public DashboardItemResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) { this.taskId = taskId; }

  public DashboardItemResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) { this.tenantId = tenantId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardItemResource dashboardItemResource = (DashboardItemResource)o;
    return Objects.equals(this.channelId, dashboardItemResource.channelId) &&
        Objects.equals(this.completedTime,
                       dashboardItemResource.completedTime) &&
        Objects.equals(this.created, dashboardItemResource.created) &&
        Objects.equals(this.deploymentId, dashboardItemResource.deploymentId) &&
        Objects.equals(this.duration, dashboardItemResource.duration) &&
        Objects.equals(this.environmentId,
                       dashboardItemResource.environmentId) &&
        Objects.equals(this.errorMessage, dashboardItemResource.errorMessage) &&
        Objects.equals(this.hasPendingInterruptions,
                       dashboardItemResource.hasPendingInterruptions) &&
        Objects.equals(this.hasWarningsOrErrors,
                       dashboardItemResource.hasWarningsOrErrors) &&
        Objects.equals(this.id, dashboardItemResource.id) &&
        Objects.equals(this.isCompleted, dashboardItemResource.isCompleted) &&
        Objects.equals(this.isCurrent, dashboardItemResource.isCurrent) &&
        Objects.equals(this.isPrevious, dashboardItemResource.isPrevious) &&
        Objects.equals(this.lastModifiedBy,
                       dashboardItemResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       dashboardItemResource.lastModifiedOn) &&
        Objects.equals(this.links, dashboardItemResource.links) &&
        Objects.equals(this.projectId, dashboardItemResource.projectId) &&
        Objects.equals(this.queueTime, dashboardItemResource.queueTime) &&
        Objects.equals(this.releaseId, dashboardItemResource.releaseId) &&
        Objects.equals(this.releaseVersion,
                       dashboardItemResource.releaseVersion) &&
        Objects.equals(this.startTime, dashboardItemResource.startTime) &&
        Objects.equals(this.state, dashboardItemResource.state) &&
        Objects.equals(this.taskId, dashboardItemResource.taskId) &&
        Objects.equals(this.tenantId, dashboardItemResource.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, completedTime, created, deploymentId,
                        duration, environmentId, errorMessage,
                        hasPendingInterruptions, hasWarningsOrErrors, id,
                        isCompleted, isCurrent, isPrevious, lastModifiedBy,
                        lastModifiedOn, links, projectId, queueTime, releaseId,
                        releaseVersion, startTime, state, taskId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardItemResource {\n");
    sb.append("    channelId: ")
        .append(toIndentedString(channelId))
        .append("\n");
    sb.append("    completedTime: ")
        .append(toIndentedString(completedTime))
        .append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deploymentId: ")
        .append(toIndentedString(deploymentId))
        .append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    environmentId: ")
        .append(toIndentedString(environmentId))
        .append("\n");
    sb.append("    errorMessage: ")
        .append(toIndentedString(errorMessage))
        .append("\n");
    sb.append("    hasPendingInterruptions: ")
        .append(toIndentedString(hasPendingInterruptions))
        .append("\n");
    sb.append("    hasWarningsOrErrors: ")
        .append(toIndentedString(hasWarningsOrErrors))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCompleted: ")
        .append(toIndentedString(isCompleted))
        .append("\n");
    sb.append("    isCurrent: ")
        .append(toIndentedString(isCurrent))
        .append("\n");
    sb.append("    isPrevious: ")
        .append(toIndentedString(isPrevious))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    queueTime: ")
        .append(toIndentedString(queueTime))
        .append("\n");
    sb.append("    releaseId: ")
        .append(toIndentedString(releaseId))
        .append("\n");
    sb.append("    releaseVersion: ")
        .append(toIndentedString(releaseVersion))
        .append("\n");
    sb.append("    startTime: ")
        .append(toIndentedString(startTime))
        .append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
