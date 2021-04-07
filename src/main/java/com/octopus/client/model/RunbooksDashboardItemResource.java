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
 * RunbooksDashboardItemResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbooksDashboardItemResource {
  public static final String SERIALIZED_NAME_COMPLETED_TIME = "CompletedTime";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TIME)
  private OffsetDateTime completedTime;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

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

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_RUNBOOK_SNAPSHOT_ID =
      "RunbookSnapshotId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_SNAPSHOT_ID)
  private String runbookSnapshotId;

  public static final String SERIALIZED_NAME_RUNBOOK_SNAPSHOT_NAME =
      "RunbookSnapshotName";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_SNAPSHOT_NAME)
  private String runbookSnapshotName;

  public static final String SERIALIZED_NAME_RUNBOOK_SNAPSHOT_NOTES =
      "RunbookSnapshotNotes";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_SNAPSHOT_NOTES)
  private String runbookSnapshotNotes;

  public static final String SERIALIZED_NAME_RUN_BY = "RunBy";
  @SerializedName(SERIALIZED_NAME_RUN_BY) private String runBy;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME) private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE) private TaskState state;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  public RunbooksDashboardItemResource
  completedTime(OffsetDateTime completedTime) {

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

  public RunbooksDashboardItemResource created(OffsetDateTime created) {

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

  public RunbooksDashboardItemResource duration(String duration) {

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

  public RunbooksDashboardItemResource environmentId(String environmentId) {

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

  public RunbooksDashboardItemResource errorMessage(String errorMessage) {

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

  public RunbooksDashboardItemResource
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

  public RunbooksDashboardItemResource
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

  public RunbooksDashboardItemResource id(String id) {

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

  public RunbooksDashboardItemResource isCompleted(Boolean isCompleted) {

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

  public RunbooksDashboardItemResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbooksDashboardItemResource
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

  public RunbooksDashboardItemResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbooksDashboardItemResource putLinksItem(String key,
                                                    String linksItem) {
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

  public RunbooksDashboardItemResource projectId(String projectId) {

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

  public RunbooksDashboardItemResource queueTime(OffsetDateTime queueTime) {

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

  public RunbooksDashboardItemResource runbookId(String runbookId) {

    this.runbookId = runbookId;
    return this;
  }

  /**
   * Get runbookId
   * @return runbookId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookId() {
    return runbookId;
  }

  public void setRunbookId(String runbookId) { this.runbookId = runbookId; }

  public RunbooksDashboardItemResource
  runbookSnapshotId(String runbookSnapshotId) {

    this.runbookSnapshotId = runbookSnapshotId;
    return this;
  }

  /**
   * Get runbookSnapshotId
   * @return runbookSnapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookSnapshotId() {
    return runbookSnapshotId;
  }

  public void setRunbookSnapshotId(String runbookSnapshotId) {
    this.runbookSnapshotId = runbookSnapshotId;
  }

  public RunbooksDashboardItemResource
  runbookSnapshotName(String runbookSnapshotName) {

    this.runbookSnapshotName = runbookSnapshotName;
    return this;
  }

  /**
   * Get runbookSnapshotName
   * @return runbookSnapshotName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookSnapshotName() {
    return runbookSnapshotName;
  }

  public void setRunbookSnapshotName(String runbookSnapshotName) {
    this.runbookSnapshotName = runbookSnapshotName;
  }

  public RunbooksDashboardItemResource
  runbookSnapshotNotes(String runbookSnapshotNotes) {

    this.runbookSnapshotNotes = runbookSnapshotNotes;
    return this;
  }

  /**
   * Get runbookSnapshotNotes
   * @return runbookSnapshotNotes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookSnapshotNotes() {
    return runbookSnapshotNotes;
  }

  public void setRunbookSnapshotNotes(String runbookSnapshotNotes) {
    this.runbookSnapshotNotes = runbookSnapshotNotes;
  }

  public RunbooksDashboardItemResource runBy(String runBy) {

    this.runBy = runBy;
    return this;
  }

  /**
   * Get runBy
   * @return runBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunBy() {
    return runBy;
  }

  public void setRunBy(String runBy) { this.runBy = runBy; }

  public RunbooksDashboardItemResource startTime(OffsetDateTime startTime) {

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

  public RunbooksDashboardItemResource state(TaskState state) {

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

  public RunbooksDashboardItemResource taskId(String taskId) {

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

  public RunbooksDashboardItemResource tenantId(String tenantId) {

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
    RunbooksDashboardItemResource runbooksDashboardItemResource =
        (RunbooksDashboardItemResource)o;
    return Objects.equals(this.completedTime,
                          runbooksDashboardItemResource.completedTime) &&
        Objects.equals(this.created, runbooksDashboardItemResource.created) &&
        Objects.equals(this.duration, runbooksDashboardItemResource.duration) &&
        Objects.equals(this.environmentId,
                       runbooksDashboardItemResource.environmentId) &&
        Objects.equals(this.errorMessage,
                       runbooksDashboardItemResource.errorMessage) &&
        Objects.equals(this.hasPendingInterruptions,
                       runbooksDashboardItemResource.hasPendingInterruptions) &&
        Objects.equals(this.hasWarningsOrErrors,
                       runbooksDashboardItemResource.hasWarningsOrErrors) &&
        Objects.equals(this.id, runbooksDashboardItemResource.id) &&
        Objects.equals(this.isCompleted,
                       runbooksDashboardItemResource.isCompleted) &&
        Objects.equals(this.lastModifiedBy,
                       runbooksDashboardItemResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       runbooksDashboardItemResource.lastModifiedOn) &&
        Objects.equals(this.links, runbooksDashboardItemResource.links) &&
        Objects.equals(this.projectId,
                       runbooksDashboardItemResource.projectId) &&
        Objects.equals(this.queueTime,
                       runbooksDashboardItemResource.queueTime) &&
        Objects.equals(this.runbookId,
                       runbooksDashboardItemResource.runbookId) &&
        Objects.equals(this.runbookSnapshotId,
                       runbooksDashboardItemResource.runbookSnapshotId) &&
        Objects.equals(this.runbookSnapshotName,
                       runbooksDashboardItemResource.runbookSnapshotName) &&
        Objects.equals(this.runbookSnapshotNotes,
                       runbooksDashboardItemResource.runbookSnapshotNotes) &&
        Objects.equals(this.runBy, runbooksDashboardItemResource.runBy) &&
        Objects.equals(this.startTime,
                       runbooksDashboardItemResource.startTime) &&
        Objects.equals(this.state, runbooksDashboardItemResource.state) &&
        Objects.equals(this.taskId, runbooksDashboardItemResource.taskId) &&
        Objects.equals(this.tenantId, runbooksDashboardItemResource.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedTime, created, duration, environmentId, errorMessage,
        hasPendingInterruptions, hasWarningsOrErrors, id, isCompleted,
        lastModifiedBy, lastModifiedOn, links, projectId, queueTime, runbookId,
        runbookSnapshotId, runbookSnapshotName, runbookSnapshotNotes, runBy,
        startTime, state, taskId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbooksDashboardItemResource {\n");
    sb.append("    completedTime: ")
        .append(toIndentedString(completedTime))
        .append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    runbookSnapshotId: ")
        .append(toIndentedString(runbookSnapshotId))
        .append("\n");
    sb.append("    runbookSnapshotName: ")
        .append(toIndentedString(runbookSnapshotName))
        .append("\n");
    sb.append("    runbookSnapshotNotes: ")
        .append(toIndentedString(runbookSnapshotNotes))
        .append("\n");
    sb.append("    runBy: ").append(toIndentedString(runBy)).append("\n");
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
