// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DynamicWorkerType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * WorkerPoolDynamicWorkerTypesResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkerPoolDynamicWorkerTypesResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_WORKER_TYPES = "WorkerTypes";
  @SerializedName(SERIALIZED_NAME_WORKER_TYPES)
  private List<DynamicWorkerType> workerTypes = null;

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public WorkerPoolDynamicWorkerTypesResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public WorkerPoolDynamicWorkerTypesResource putLinksItem(String key,
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

  public WorkerPoolDynamicWorkerTypesResource
  workerTypes(List<DynamicWorkerType> workerTypes) {

    this.workerTypes = workerTypes;
    return this;
  }

  public WorkerPoolDynamicWorkerTypesResource
  addWorkerTypesItem(DynamicWorkerType workerTypesItem) {
    if (this.workerTypes == null) {
      this.workerTypes = new ArrayList<DynamicWorkerType>();
    }
    this.workerTypes.add(workerTypesItem);
    return this;
  }

  /**
   * Get workerTypes
   * @return workerTypes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DynamicWorkerType> getWorkerTypes() {
    return workerTypes;
  }

  public void setWorkerTypes(List<DynamicWorkerType> workerTypes) {
    this.workerTypes = workerTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPoolDynamicWorkerTypesResource workerPoolDynamicWorkerTypesResource =
        (WorkerPoolDynamicWorkerTypesResource)o;
    return Objects.equals(this.id, workerPoolDynamicWorkerTypesResource.id) &&
        Objects.equals(this.links,
                       workerPoolDynamicWorkerTypesResource.links) &&
        Objects.equals(this.workerTypes,
                       workerPoolDynamicWorkerTypesResource.workerTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, workerTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPoolDynamicWorkerTypesResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    workerTypes: ")
        .append(toIndentedString(workerTypes))
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
