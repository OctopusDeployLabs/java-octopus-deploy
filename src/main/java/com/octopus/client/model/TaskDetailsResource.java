// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActivityLogTreeNode;
import com.octopus.client.model.TaskProgress;
import com.octopus.client.model.TaskResource;
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
 * TaskDetailsResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TaskDetailsResource {
  public static final String SERIALIZED_NAME_ACTIVITY_LOGS = "ActivityLogs";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_LOGS)
  private List<ActivityLogTreeNode> activityLogs = null;

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

  public static final String SERIALIZED_NAME_PHYSICAL_LOG_SIZE =
      "PhysicalLogSize";
  @SerializedName(SERIALIZED_NAME_PHYSICAL_LOG_SIZE)
  private Long physicalLogSize;

  public static final String SERIALIZED_NAME_PROGRESS = "Progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS) private TaskProgress progress;

  public static final String SERIALIZED_NAME_TASK = "Task";
  @SerializedName(SERIALIZED_NAME_TASK) private TaskResource task;

  public TaskDetailsResource
  activityLogs(List<ActivityLogTreeNode> activityLogs) {

    this.activityLogs = activityLogs;
    return this;
  }

  public TaskDetailsResource
  addActivityLogsItem(ActivityLogTreeNode activityLogsItem) {
    if (this.activityLogs == null) {
      this.activityLogs = new ArrayList<ActivityLogTreeNode>();
    }
    this.activityLogs.add(activityLogsItem);
    return this;
  }

  /**
   * Get activityLogs
   * @return activityLogs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActivityLogTreeNode> getActivityLogs() {
    return activityLogs;
  }

  public void setActivityLogs(List<ActivityLogTreeNode> activityLogs) {
    this.activityLogs = activityLogs;
  }

  public TaskDetailsResource id(String id) {

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

  public TaskDetailsResource lastModifiedBy(String lastModifiedBy) {

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

  public TaskDetailsResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public TaskDetailsResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public TaskDetailsResource putLinksItem(String key, String linksItem) {
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

  public TaskDetailsResource physicalLogSize(Long physicalLogSize) {

    this.physicalLogSize = physicalLogSize;
    return this;
  }

  /**
   * Get physicalLogSize
   * @return physicalLogSize
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPhysicalLogSize() {
    return physicalLogSize;
  }

  public void setPhysicalLogSize(Long physicalLogSize) {
    this.physicalLogSize = physicalLogSize;
  }

  public TaskDetailsResource progress(TaskProgress progress) {

    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskProgress getProgress() {
    return progress;
  }

  public void setProgress(TaskProgress progress) { this.progress = progress; }

  public TaskDetailsResource task(TaskResource task) {

    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskResource getTask() {
    return task;
  }

  public void setTask(TaskResource task) { this.task = task; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDetailsResource taskDetailsResource = (TaskDetailsResource)o;
    return Objects.equals(this.activityLogs,
                          taskDetailsResource.activityLogs) &&
        Objects.equals(this.id, taskDetailsResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       taskDetailsResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       taskDetailsResource.lastModifiedOn) &&
        Objects.equals(this.links, taskDetailsResource.links) &&
        Objects.equals(this.physicalLogSize,
                       taskDetailsResource.physicalLogSize) &&
        Objects.equals(this.progress, taskDetailsResource.progress) &&
        Objects.equals(this.task, taskDetailsResource.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityLogs, id, lastModifiedBy, lastModifiedOn, links,
                        physicalLogSize, progress, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDetailsResource {\n");
    sb.append("    activityLogs: ")
        .append(toIndentedString(activityLogs))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    physicalLogSize: ")
        .append(toIndentedString(physicalLogSize))
        .append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
