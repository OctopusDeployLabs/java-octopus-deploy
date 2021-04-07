// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActivityLogEntry;
import com.octopus.client.model.ActivityStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * ActivityLogTreeNode
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActivityLogTreeNode {
  public static final String SERIALIZED_NAME_CHILDREN = "Children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ActivityLogTreeNode> children = null;

  public static final String SERIALIZED_NAME_ENDED = "Ended";
  @SerializedName(SERIALIZED_NAME_ENDED) private OffsetDateTime ended;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LOG_ELEMENTS = "LogElements";
  @SerializedName(SERIALIZED_NAME_LOG_ELEMENTS)
  private List<ActivityLogEntry> logElements = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROGRESS_MESSAGE =
      "ProgressMessage";
  @SerializedName(SERIALIZED_NAME_PROGRESS_MESSAGE)
  private String progressMessage;

  public static final String SERIALIZED_NAME_PROGRESS_PERCENTAGE =
      "ProgressPercentage";
  @SerializedName(SERIALIZED_NAME_PROGRESS_PERCENTAGE)
  private Integer progressPercentage;

  public static final String SERIALIZED_NAME_SHOW_AT_SUMMARY_LEVEL =
      "ShowAtSummaryLevel";
  @SerializedName(SERIALIZED_NAME_SHOW_AT_SUMMARY_LEVEL)
  private Boolean showAtSummaryLevel;

  public static final String SERIALIZED_NAME_STARTED = "Started";
  @SerializedName(SERIALIZED_NAME_STARTED) private OffsetDateTime started;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS) private ActivityStatus status;

  /**
   * Get children
   * @return children
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActivityLogTreeNode> getChildren() {
    return children;
  }

  public ActivityLogTreeNode ended(OffsetDateTime ended) {

    this.ended = ended;
    return this;
  }

  /**
   * Get ended
   * @return ended
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEnded() {
    return ended;
  }

  public void setEnded(OffsetDateTime ended) { this.ended = ended; }

  public ActivityLogTreeNode id(String id) {

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
   * Get logElements
   * @return logElements
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActivityLogEntry> getLogElements() {
    return logElements;
  }

  public ActivityLogTreeNode name(String name) {

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

  public ActivityLogTreeNode progressMessage(String progressMessage) {

    this.progressMessage = progressMessage;
    return this;
  }

  /**
   * Get progressMessage
   * @return progressMessage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProgressMessage() {
    return progressMessage;
  }

  public void setProgressMessage(String progressMessage) {
    this.progressMessage = progressMessage;
  }

  public ActivityLogTreeNode progressPercentage(Integer progressPercentage) {

    this.progressPercentage = progressPercentage;
    return this;
  }

  /**
   * Get progressPercentage
   * @return progressPercentage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  /**
   * Get showAtSummaryLevel
   * @return showAtSummaryLevel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowAtSummaryLevel() {
    return showAtSummaryLevel;
  }

  public ActivityLogTreeNode started(OffsetDateTime started) {

    this.started = started;
    return this;
  }

  /**
   * Get started
   * @return started
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) { this.started = started; }

  public ActivityLogTreeNode status(ActivityStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityStatus getStatus() {
    return status;
  }

  public void setStatus(ActivityStatus status) { this.status = status; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLogTreeNode activityLogTreeNode = (ActivityLogTreeNode)o;
    return Objects.equals(this.children, activityLogTreeNode.children) &&
        Objects.equals(this.ended, activityLogTreeNode.ended) &&
        Objects.equals(this.id, activityLogTreeNode.id) &&
        Objects.equals(this.logElements, activityLogTreeNode.logElements) &&
        Objects.equals(this.name, activityLogTreeNode.name) &&
        Objects.equals(this.progressMessage,
                       activityLogTreeNode.progressMessage) &&
        Objects.equals(this.progressPercentage,
                       activityLogTreeNode.progressPercentage) &&
        Objects.equals(this.showAtSummaryLevel,
                       activityLogTreeNode.showAtSummaryLevel) &&
        Objects.equals(this.started, activityLogTreeNode.started) &&
        Objects.equals(this.status, activityLogTreeNode.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, ended, id, logElements, name, progressMessage,
                        progressPercentage, showAtSummaryLevel, started,
                        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLogTreeNode {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logElements: ")
        .append(toIndentedString(logElements))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progressMessage: ")
        .append(toIndentedString(progressMessage))
        .append("\n");
    sb.append("    progressPercentage: ")
        .append(toIndentedString(progressPercentage))
        .append("\n");
    sb.append("    showAtSummaryLevel: ")
        .append(toIndentedString(showAtSummaryLevel))
        .append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
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
