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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * OctopusServerNodeResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class OctopusServerNodeResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_IN_MAINTENANCE_MODE =
      "IsInMaintenanceMode";
  @SerializedName(SERIALIZED_NAME_IS_IN_MAINTENANCE_MODE)
  private Boolean isInMaintenanceMode;

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

  public static final String SERIALIZED_NAME_MAX_CONCURRENT_TASKS =
      "MaxConcurrentTasks";
  @SerializedName(SERIALIZED_NAME_MAX_CONCURRENT_TASKS)
  private Integer maxConcurrentTasks;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public OctopusServerNodeResource id(String id) {

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

  public OctopusServerNodeResource
  isInMaintenanceMode(Boolean isInMaintenanceMode) {

    this.isInMaintenanceMode = isInMaintenanceMode;
    return this;
  }

  /**
   * Get isInMaintenanceMode
   * @return isInMaintenanceMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInMaintenanceMode() {
    return isInMaintenanceMode;
  }

  public void setIsInMaintenanceMode(Boolean isInMaintenanceMode) {
    this.isInMaintenanceMode = isInMaintenanceMode;
  }

  public OctopusServerNodeResource lastModifiedBy(String lastModifiedBy) {

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

  public OctopusServerNodeResource
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

  public OctopusServerNodeResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public OctopusServerNodeResource putLinksItem(String key, String linksItem) {
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

  public OctopusServerNodeResource
  maxConcurrentTasks(Integer maxConcurrentTasks) {

    this.maxConcurrentTasks = maxConcurrentTasks;
    return this;
  }

  /**
   * Get maxConcurrentTasks
   * @return maxConcurrentTasks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxConcurrentTasks() {
    return maxConcurrentTasks;
  }

  public void setMaxConcurrentTasks(Integer maxConcurrentTasks) {
    this.maxConcurrentTasks = maxConcurrentTasks;
  }

  public OctopusServerNodeResource name(String name) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OctopusServerNodeResource octopusServerNodeResource =
        (OctopusServerNodeResource)o;
    return Objects.equals(this.id, octopusServerNodeResource.id) &&
        Objects.equals(this.isInMaintenanceMode,
                       octopusServerNodeResource.isInMaintenanceMode) &&
        Objects.equals(this.lastModifiedBy,
                       octopusServerNodeResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       octopusServerNodeResource.lastModifiedOn) &&
        Objects.equals(this.links, octopusServerNodeResource.links) &&
        Objects.equals(this.maxConcurrentTasks,
                       octopusServerNodeResource.maxConcurrentTasks) &&
        Objects.equals(this.name, octopusServerNodeResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isInMaintenanceMode, lastModifiedBy, lastModifiedOn,
                        links, maxConcurrentTasks, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OctopusServerNodeResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isInMaintenanceMode: ")
        .append(toIndentedString(isInMaintenanceMode))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    maxConcurrentTasks: ")
        .append(toIndentedString(maxConcurrentTasks))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
