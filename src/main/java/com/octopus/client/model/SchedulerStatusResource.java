// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ScheduledTaskStatusResource;
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
 * SchedulerStatusResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class SchedulerStatusResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_RUNNING = "IsRunning";
  @SerializedName(SERIALIZED_NAME_IS_RUNNING) private Boolean isRunning;

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

  public static final String SERIALIZED_NAME_TASK_STATUS = "TaskStatus";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  private List<ScheduledTaskStatusResource> taskStatus = null;

  public SchedulerStatusResource id(String id) {

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

  public SchedulerStatusResource isRunning(Boolean isRunning) {

    this.isRunning = isRunning;
    return this;
  }

  /**
   * Get isRunning
   * @return isRunning
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRunning() {
    return isRunning;
  }

  public void setIsRunning(Boolean isRunning) { this.isRunning = isRunning; }

  public SchedulerStatusResource lastModifiedBy(String lastModifiedBy) {

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

  public SchedulerStatusResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public SchedulerStatusResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public SchedulerStatusResource putLinksItem(String key, String linksItem) {
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

  public SchedulerStatusResource
  taskStatus(List<ScheduledTaskStatusResource> taskStatus) {

    this.taskStatus = taskStatus;
    return this;
  }

  public SchedulerStatusResource
  addTaskStatusItem(ScheduledTaskStatusResource taskStatusItem) {
    if (this.taskStatus == null) {
      this.taskStatus = new ArrayList<ScheduledTaskStatusResource>();
    }
    this.taskStatus.add(taskStatusItem);
    return this;
  }

  /**
   * Get taskStatus
   * @return taskStatus
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ScheduledTaskStatusResource> getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(List<ScheduledTaskStatusResource> taskStatus) {
    this.taskStatus = taskStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulerStatusResource schedulerStatusResource =
        (SchedulerStatusResource)o;
    return Objects.equals(this.id, schedulerStatusResource.id) &&
        Objects.equals(this.isRunning, schedulerStatusResource.isRunning) &&
        Objects.equals(this.lastModifiedBy,
                       schedulerStatusResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       schedulerStatusResource.lastModifiedOn) &&
        Objects.equals(this.links, schedulerStatusResource.links) &&
        Objects.equals(this.taskStatus, schedulerStatusResource.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isRunning, lastModifiedBy, lastModifiedOn, links,
                        taskStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulerStatusResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRunning: ")
        .append(toIndentedString(isRunning))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    taskStatus: ")
        .append(toIndentedString(taskStatus))
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
