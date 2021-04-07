// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * SpaceResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class SpaceResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT) private Boolean isDefault;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SPACE_MANAGERS_TEAM_MEMBERS =
      "SpaceManagersTeamMembers";
  @SerializedName(SERIALIZED_NAME_SPACE_MANAGERS_TEAM_MEMBERS)
  private Set<String> spaceManagersTeamMembers = null;

  public static final String SERIALIZED_NAME_SPACE_MANAGERS_TEAMS =
      "SpaceManagersTeams";
  @SerializedName(SERIALIZED_NAME_SPACE_MANAGERS_TEAMS)
  private Set<String> spaceManagersTeams = null;

  public static final String SERIALIZED_NAME_TASK_QUEUE_STOPPED =
      "TaskQueueStopped";
  @SerializedName(SERIALIZED_NAME_TASK_QUEUE_STOPPED)
  private Boolean taskQueueStopped;

  public SpaceResource description(String description) {

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

  public SpaceResource id(String id) {

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

  public SpaceResource isDefault(Boolean isDefault) {

    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) { this.isDefault = isDefault; }

  public SpaceResource lastModifiedBy(String lastModifiedBy) {

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

  public SpaceResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public SpaceResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public SpaceResource putLinksItem(String key, String linksItem) {
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

  public SpaceResource name(String name) {

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

  public SpaceResource
  spaceManagersTeamMembers(Set<String> spaceManagersTeamMembers) {

    this.spaceManagersTeamMembers = spaceManagersTeamMembers;
    return this;
  }

  public SpaceResource
  addSpaceManagersTeamMembersItem(String spaceManagersTeamMembersItem) {
    if (this.spaceManagersTeamMembers == null) {
      this.spaceManagersTeamMembers = new LinkedHashSet<String>();
    }
    this.spaceManagersTeamMembers.add(spaceManagersTeamMembersItem);
    return this;
  }

  /**
   * Get spaceManagersTeamMembers
   * @return spaceManagersTeamMembers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getSpaceManagersTeamMembers() {
    return spaceManagersTeamMembers;
  }

  public void
  setSpaceManagersTeamMembers(Set<String> spaceManagersTeamMembers) {
    this.spaceManagersTeamMembers = spaceManagersTeamMembers;
  }

  public SpaceResource spaceManagersTeams(Set<String> spaceManagersTeams) {

    this.spaceManagersTeams = spaceManagersTeams;
    return this;
  }

  public SpaceResource
  addSpaceManagersTeamsItem(String spaceManagersTeamsItem) {
    if (this.spaceManagersTeams == null) {
      this.spaceManagersTeams = new LinkedHashSet<String>();
    }
    this.spaceManagersTeams.add(spaceManagersTeamsItem);
    return this;
  }

  /**
   * Get spaceManagersTeams
   * @return spaceManagersTeams
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getSpaceManagersTeams() {
    return spaceManagersTeams;
  }

  public void setSpaceManagersTeams(Set<String> spaceManagersTeams) {
    this.spaceManagersTeams = spaceManagersTeams;
  }

  public SpaceResource taskQueueStopped(Boolean taskQueueStopped) {

    this.taskQueueStopped = taskQueueStopped;
    return this;
  }

  /**
   * Get taskQueueStopped
   * @return taskQueueStopped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTaskQueueStopped() {
    return taskQueueStopped;
  }

  public void setTaskQueueStopped(Boolean taskQueueStopped) {
    this.taskQueueStopped = taskQueueStopped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceResource spaceResource = (SpaceResource)o;
    return Objects.equals(this.description, spaceResource.description) &&
        Objects.equals(this.id, spaceResource.id) &&
        Objects.equals(this.isDefault, spaceResource.isDefault) &&
        Objects.equals(this.lastModifiedBy, spaceResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, spaceResource.lastModifiedOn) &&
        Objects.equals(this.links, spaceResource.links) &&
        Objects.equals(this.name, spaceResource.name) &&
        Objects.equals(this.spaceManagersTeamMembers,
                       spaceResource.spaceManagersTeamMembers) &&
        Objects.equals(this.spaceManagersTeams,
                       spaceResource.spaceManagersTeams) &&
        Objects.equals(this.taskQueueStopped, spaceResource.taskQueueStopped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, lastModifiedBy,
                        lastModifiedOn, links, name, spaceManagersTeamMembers,
                        spaceManagersTeams, taskQueueStopped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ")
        .append(toIndentedString(isDefault))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spaceManagersTeamMembers: ")
        .append(toIndentedString(spaceManagersTeamMembers))
        .append("\n");
    sb.append("    spaceManagersTeams: ")
        .append(toIndentedString(spaceManagersTeams))
        .append("\n");
    sb.append("    taskQueueStopped: ")
        .append(toIndentedString(taskQueueStopped))
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
