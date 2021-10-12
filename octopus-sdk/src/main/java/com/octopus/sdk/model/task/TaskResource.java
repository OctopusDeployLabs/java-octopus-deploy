/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.task;

import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** TaskResource */
@SuppressWarnings("UnusedVariable")
public class TaskResource extends NamedResource {

  @SerializedName("Arguments")
  private Map<String, Object> arguments = null;

  @SerializedName("CanRerun")
  private Boolean canRerun;

  @SerializedName("Completed")
  private String completed;

  @SerializedName("CompletedTime")
  private OffsetDateTime completedTime;

  @SerializedName("Duration")
  private String duration;

  @SerializedName("ErrorMessage")
  private String errorMessage;

  @SerializedName("FinishedSuccessfully")
  private Boolean finishedSuccessfully;

  @SerializedName("HasBeenPickedUpByProcessor")
  private Boolean hasBeenPickedUpByProcessor;

  @SerializedName("HasPendingInterruptions")
  private Boolean hasPendingInterruptions;

  @SerializedName("HasWarningsOrErrors")
  private Boolean hasWarningsOrErrors;

  @SerializedName("IsCompleted")
  private Boolean isCompleted;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LastUpdatedTime")
  private OffsetDateTime lastUpdatedTime;

  @SerializedName("QueueTime")
  private OffsetDateTime queueTime;

  @SerializedName("QueueTimeExpiry")
  private OffsetDateTime queueTimeExpiry;

  @SerializedName("ServerNode")
  private String serverNode;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("StartTime")
  private OffsetDateTime startTime;

  @SerializedName("State")
  private TaskState state;

  public TaskResource(final String name) {
    super(name);
  }

  public TaskResource arguments(Map<String, Object> arguments) {

    this.arguments = arguments;
    return this;
  }

  public TaskResource putArgumentsItem(final String key, Object argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new HashMap<>();
    }
    this.arguments.put(key, argumentsItem);
    return this;
  }

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

  public Boolean getCanRerun() {
    return canRerun;
  }

  public void setCanRerun(Boolean canRerun) {
    this.canRerun = canRerun;
  }

  public TaskResource completed(String completed) {

    this.completed = completed;
    return this;
  }

  public String getCompleted() {
    return completed;
  }

  public void setCompleted(String completed) {
    this.completed = completed;
  }

  public TaskResource completedTime(OffsetDateTime completedTime) {

    this.completedTime = completedTime;
    return this;
  }

  public OffsetDateTime getCompletedTime() {
    return completedTime;
  }

  public void setCompletedTime(OffsetDateTime completedTime) {
    this.completedTime = completedTime;
  }

  public TaskResource duration(String duration) {

    this.duration = duration;
    return this;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public TaskResource errorMessage(String errorMessage) {

    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Boolean getFinishedSuccessfully() {
    return finishedSuccessfully;
  }

  public TaskResource hasBeenPickedUpByProcessor(Boolean hasBeenPickedUpByProcessor) {

    this.hasBeenPickedUpByProcessor = hasBeenPickedUpByProcessor;
    return this;
  }

  public Boolean getHasBeenPickedUpByProcessor() {
    return hasBeenPickedUpByProcessor;
  }

  public void setHasBeenPickedUpByProcessor(Boolean hasBeenPickedUpByProcessor) {
    this.hasBeenPickedUpByProcessor = hasBeenPickedUpByProcessor;
  }

  public TaskResource hasPendingInterruptions(Boolean hasPendingInterruptions) {

    this.hasPendingInterruptions = hasPendingInterruptions;
    return this;
  }

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

  public Boolean getHasWarningsOrErrors() {
    return hasWarningsOrErrors;
  }

  public void setHasWarningsOrErrors(Boolean hasWarningsOrErrors) {
    this.hasWarningsOrErrors = hasWarningsOrErrors;
  }

  public Boolean getIsCompleted() {
    return isCompleted;
  }

  public TaskResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

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

  public OffsetDateTime getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public TaskResource queueTime(OffsetDateTime queueTime) {

    this.queueTime = queueTime;
    return this;
  }

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

  public String getServerNode() {
    return serverNode;
  }

  public void setServerNode(String serverNode) {
    this.serverNode = serverNode;
  }

  public TaskResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public TaskResource startTime(OffsetDateTime startTime) {

    this.startTime = startTime;
    return this;
  }

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

  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResource taskResource = (TaskResource) o;
    return Objects.equals(this.arguments, taskResource.arguments)
        && Objects.equals(this.canRerun, taskResource.canRerun)
        && Objects.equals(this.completed, taskResource.completed)
        && Objects.equals(this.completedTime, taskResource.completedTime)
        && Objects.equals(this.duration, taskResource.duration)
        && Objects.equals(this.errorMessage, taskResource.errorMessage)
        && Objects.equals(this.finishedSuccessfully, taskResource.finishedSuccessfully)
        && Objects.equals(this.hasBeenPickedUpByProcessor, taskResource.hasBeenPickedUpByProcessor)
        && Objects.equals(this.hasPendingInterruptions, taskResource.hasPendingInterruptions)
        && Objects.equals(this.hasWarningsOrErrors, taskResource.hasWarningsOrErrors)
        && Objects.equals(this.isCompleted, taskResource.isCompleted)
        && Objects.equals(this.lastModifiedBy, taskResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, taskResource.lastModifiedOn)
        && Objects.equals(this.lastUpdatedTime, taskResource.lastUpdatedTime)
        && Objects.equals(this.queueTime, taskResource.queueTime)
        && Objects.equals(this.queueTimeExpiry, taskResource.queueTimeExpiry)
        && Objects.equals(this.serverNode, taskResource.serverNode)
        && Objects.equals(this.spaceId, taskResource.spaceId)
        && Objects.equals(this.startTime, taskResource.startTime)
        && Objects.equals(this.state, taskResource.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arguments,
        canRerun,
        completed,
        completedTime,
        duration,
        errorMessage,
        finishedSuccessfully,
        hasBeenPickedUpByProcessor,
        hasPendingInterruptions,
        hasWarningsOrErrors,
        isCompleted,
        lastModifiedBy,
        lastModifiedOn,
        lastUpdatedTime,
        queueTime,
        queueTimeExpiry,
        serverNode,
        spaceId,
        startTime,
        state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResource {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    canRerun: ").append(toIndentedString(canRerun)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    queueTimeExpiry: ").append(toIndentedString(queueTimeExpiry)).append("\n");
    sb.append("    serverNode: ").append(toIndentedString(serverNode)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
