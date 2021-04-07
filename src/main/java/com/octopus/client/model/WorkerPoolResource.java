// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.WorkerPoolType;
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
 * WorkerPoolResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkerPoolResource {
  public static final String SERIALIZED_NAME_CAN_ADD_WORKERS = "CanAddWorkers";
  @SerializedName(SERIALIZED_NAME_CAN_ADD_WORKERS)
  private Boolean canAddWorkers;

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

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER) private Integer sortOrder;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_WORKER_POOL_TYPE =
      "WorkerPoolType";
  @SerializedName(SERIALIZED_NAME_WORKER_POOL_TYPE)
  private WorkerPoolType workerPoolType;

  public WorkerPoolResource canAddWorkers(Boolean canAddWorkers) {

    this.canAddWorkers = canAddWorkers;
    return this;
  }

  /**
   * Get canAddWorkers
   * @return canAddWorkers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanAddWorkers() {
    return canAddWorkers;
  }

  public void setCanAddWorkers(Boolean canAddWorkers) {
    this.canAddWorkers = canAddWorkers;
  }

  public WorkerPoolResource description(String description) {

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

  public WorkerPoolResource id(String id) {

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

  public WorkerPoolResource isDefault(Boolean isDefault) {

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

  public WorkerPoolResource lastModifiedBy(String lastModifiedBy) {

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

  public WorkerPoolResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public WorkerPoolResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public WorkerPoolResource putLinksItem(String key, String linksItem) {
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

  public WorkerPoolResource name(String name) {

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

  public WorkerPoolResource sortOrder(Integer sortOrder) {

    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) { this.sortOrder = sortOrder; }

  public WorkerPoolResource spaceId(String spaceId) {

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

  public WorkerPoolResource workerPoolType(WorkerPoolType workerPoolType) {

    this.workerPoolType = workerPoolType;
    return this;
  }

  /**
   * Get workerPoolType
   * @return workerPoolType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkerPoolType getWorkerPoolType() {
    return workerPoolType;
  }

  public void setWorkerPoolType(WorkerPoolType workerPoolType) {
    this.workerPoolType = workerPoolType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPoolResource workerPoolResource = (WorkerPoolResource)o;
    return Objects.equals(this.canAddWorkers,
                          workerPoolResource.canAddWorkers) &&
        Objects.equals(this.description, workerPoolResource.description) &&
        Objects.equals(this.id, workerPoolResource.id) &&
        Objects.equals(this.isDefault, workerPoolResource.isDefault) &&
        Objects.equals(this.lastModifiedBy,
                       workerPoolResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       workerPoolResource.lastModifiedOn) &&
        Objects.equals(this.links, workerPoolResource.links) &&
        Objects.equals(this.name, workerPoolResource.name) &&
        Objects.equals(this.sortOrder, workerPoolResource.sortOrder) &&
        Objects.equals(this.spaceId, workerPoolResource.spaceId) &&
        Objects.equals(this.workerPoolType, workerPoolResource.workerPoolType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAddWorkers, description, id, isDefault,
                        lastModifiedBy, lastModifiedOn, links, name, sortOrder,
                        spaceId, workerPoolType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPoolResource {\n");
    sb.append("    canAddWorkers: ")
        .append(toIndentedString(canAddWorkers))
        .append("\n");
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
    sb.append("    sortOrder: ")
        .append(toIndentedString(sortOrder))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    workerPoolType: ")
        .append(toIndentedString(workerPoolType))
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
