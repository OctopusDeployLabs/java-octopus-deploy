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
 * TaskResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TaskResource {
  public static final String SERIALIZED_NAME_ARGUMENTS = "Arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Map<String, Object> arguments = null;

  public static final String SERIALIZED_NAME_CAN_RERUN = "CanRerun";
  @SerializedName(SERIALIZED_NAME_CAN_RERUN) private Boolean canRerun;

  public static final String SERIALIZED_NAME_COMPLETED = "Completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED) private String completed;

  public static final String SERIALIZED_NAME_COMPLETED_TIME = "CompletedTime";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TIME)
  private OffsetDateTime completedTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_DURATION = "Duration";
  @SerializedName(SERIALIZED_NAME_DURATION) private String duration;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE) private String errorMessage;

  public static final String SERIALIZED_NAME_FINISHED_SUCCESSFULLY =
      "FinishedSuccessfully";
  @SerializedName(SERIALIZED_NAME_FINISHED_SUCCESSFULLY)
  private Boolean finishedSuccessfully;

  public static final String SERIALIZED_NAME_HAS_BEEN_PICKED_UP_BY_PROCESSOR =
      "HasBeenPickedUpByProcessor";
  @SerializedName(SERIALIZED_NAME_HAS_BEEN_PICKED_UP_BY_PROCESSOR)
  private Boolean hasBeenPickedUpByProcessor;

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

  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME =
      "LastUpdatedTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private OffsetDateTime lastUpdatedTime;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_QUEUE_TIME = "QueueTime";
  @SerializedName(SERIALIZED_NAME_QUEUE_TIME) private OffsetDateTime queueTime;

  public static final String SERIALIZED_NAME_QUEUE_TIME_EXPIRY =
      "QueueTimeExpiry";
  @SerializedName(SERIALIZED_NAME_QUEUE_TIME_EXPIRY)
  private OffsetDateTime queueTimeExpiry;

  public static final String SERIALIZED_NAME_SERVER_NODE = "ServerNode";
  @SerializedName(SERIALIZED_NAME_SERVER_NODE) private String serverNode;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME) private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE) private TaskState state;

  public TaskResource arguments(Map<String, Object> arguments) {

    this.arguments = arguments;
    return this;
  }

  public TaskResource putArgumentsItem(String key, Object argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<String, Object>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getArguments() {
    return arguments;
  }

  public void setArguments(Map<String, Object> arguments) {
    this.arguments = arguments;
  }

  public TaskResource canRerun(Boolean canRerun) {

    this.canRerun = canRerun;
    return this;
  }

  /**
   * Get canRerun
   * @return canRerun
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanRerun() {
    return canRerun;
  }

  public void setCanRerun(Boolean canRerun) { this.canRerun = canRerun; }

  public TaskResource completed(String completed) {

    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompleted() {
    return completed;
  }

  public void setCompleted(String completed) { this.completed = completed; }

  public TaskResource completedTime(OffsetDateTime completedTime) {

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

  public TaskResource description(String description) {

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

  public TaskResource duration(String duration) {

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

  public TaskResource errorMessage(String errorMessage) {

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

  /**
   * Get finishedSuccessfully
   * @return finishedSuccessfully
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFinishedSuccessfully() {
    return finishedSuccessfully;
  }

  public TaskResource
  hasBeenPickedUpByProcessor(Boolean hasBeenPickedUpByProcessor) {

    this.hasBeenPickedUpByProcessor = hasBeenPickedUpByProcessor;
    return this;
  }

  /**
   * Get hasBeenPickedUpByProcessor
   * @return hasBeenPickedUpByProcessor
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasBeenPickedUpByProcessor() {
    return hasBeenPickedUpByProcessor;
  }

  public void
  setHasBeenPickedUpByProcessor(Boolean hasBeenPickedUpByProcessor) {
    this.hasBeenPickedUpByProcessor = hasBeenPickedUpByProcessor;
  }

  public TaskResource hasPendingInterruptions(Boolean hasPendingInterruptions) {

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

  public TaskResource hasWarningsOrErrors(Boolean hasWarningsOrErrors) {

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

  public TaskResource id(String id) {

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

  /**
   * Get isCompleted
   * @return isCompleted
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCompleted() {
    return isCompleted;
  }

  public TaskResource lastModifiedBy(String lastModifiedBy) {

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

  public TaskResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public TaskResource lastUpdatedTime(OffsetDateTime lastUpdatedTime) {

    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  /**
   * Get lastUpdatedTime
   * @return lastUpdatedTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public TaskResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public TaskResource putLinksItem(String key, String linksItem) {
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

  public TaskResource name(String name) {

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

  public TaskResource queueTime(OffsetDateTime queueTime) {

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

  public TaskResource queueTimeExpiry(OffsetDateTime queueTimeExpiry) {

    this.queueTimeExpiry = queueTimeExpiry;
    return this;
  }

  /**
   * Get queueTimeExpiry
   * @return queueTimeExpiry
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getQueueTimeExpiry() {
    return queueTimeExpiry;
  }

  public void setQueueTimeExpiry(OffsetDateTime queueTimeExpiry) {
    this.queueTimeExpiry = queueTimeExpiry;
  }

  public TaskResource serverNode(String serverNode) {

    this.serverNode = serverNode;
    return this;
  }

  /**
   * Get serverNode
   * @return serverNode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerNode() {
    return serverNode;
  }

  public void setServerNode(String serverNode) { this.serverNode = serverNode; }

  public TaskResource spaceId(String spaceId) {

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

  public TaskResource startTime(OffsetDateTime startTime) {

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

  public TaskResource state(TaskState state) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResource taskResource = (TaskResource)o;
    return Objects.equals(this.arguments, taskResource.arguments) &&
        Objects.equals(this.canRerun, taskResource.canRerun) &&
        Objects.equals(this.completed, taskResource.completed) &&
        Objects.equals(this.completedTime, taskResource.completedTime) &&
        Objects.equals(this.description, taskResource.description) &&
        Objects.equals(this.duration, taskResource.duration) &&
        Objects.equals(this.errorMessage, taskResource.errorMessage) &&
        Objects.equals(this.finishedSuccessfully,
                       taskResource.finishedSuccessfully) &&
        Objects.equals(this.hasBeenPickedUpByProcessor,
                       taskResource.hasBeenPickedUpByProcessor) &&
        Objects.equals(this.hasPendingInterruptions,
                       taskResource.hasPendingInterruptions) &&
        Objects.equals(this.hasWarningsOrErrors,
                       taskResource.hasWarningsOrErrors) &&
        Objects.equals(this.id, taskResource.id) &&
        Objects.equals(this.isCompleted, taskResource.isCompleted) &&
        Objects.equals(this.lastModifiedBy, taskResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, taskResource.lastModifiedOn) &&
        Objects.equals(this.lastUpdatedTime, taskResource.lastUpdatedTime) &&
        Objects.equals(this.links, taskResource.links) &&
        Objects.equals(this.name, taskResource.name) &&
        Objects.equals(this.queueTime, taskResource.queueTime) &&
        Objects.equals(this.queueTimeExpiry, taskResource.queueTimeExpiry) &&
        Objects.equals(this.serverNode, taskResource.serverNode) &&
        Objects.equals(this.spaceId, taskResource.spaceId) &&
        Objects.equals(this.startTime, taskResource.startTime) &&
        Objects.equals(this.state, taskResource.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arguments, canRerun, completed, completedTime, description, duration,
        errorMessage, finishedSuccessfully, hasBeenPickedUpByProcessor,
        hasPendingInterruptions, hasWarningsOrErrors, id, isCompleted,
        lastModifiedBy, lastModifiedOn, lastUpdatedTime, links, name, queueTime,
        queueTimeExpiry, serverNode, spaceId, startTime, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResource {\n");
    sb.append("    arguments: ")
        .append(toIndentedString(arguments))
        .append("\n");
    sb.append("    canRerun: ").append(toIndentedString(canRerun)).append("\n");
    sb.append("    completed: ")
        .append(toIndentedString(completed))
        .append("\n");
    sb.append("    completedTime: ")
        .append(toIndentedString(completedTime))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errorMessage: ")
        .append(toIndentedString(errorMessage))
        .append("\n");
    sb.append("    finishedSuccessfully: ")
        .append(toIndentedString(finishedSuccessfully))
        .append("\n");
    sb.append("    hasBeenPickedUpByProcessor: ")
        .append(toIndentedString(hasBeenPickedUpByProcessor))
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
    sb.append("    lastUpdatedTime: ")
        .append(toIndentedString(lastUpdatedTime))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queueTime: ")
        .append(toIndentedString(queueTime))
        .append("\n");
    sb.append("    queueTimeExpiry: ")
        .append(toIndentedString(queueTimeExpiry))
        .append("\n");
    sb.append("    serverNode: ")
        .append(toIndentedString(serverNode))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    startTime: ")
        .append(toIndentedString(startTime))
        .append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
