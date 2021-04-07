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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * WorkerPoolSupportedTypesResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkerPoolSupportedTypesResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_SUPPORTED_POOL_TYPES =
      "SupportedPoolTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_POOL_TYPES)
  private List<WorkerPoolType> supportedPoolTypes = null;

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public WorkerPoolSupportedTypesResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public WorkerPoolSupportedTypesResource putLinksItem(String key,
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

  public WorkerPoolSupportedTypesResource
  supportedPoolTypes(List<WorkerPoolType> supportedPoolTypes) {

    this.supportedPoolTypes = supportedPoolTypes;
    return this;
  }

  public WorkerPoolSupportedTypesResource
  addSupportedPoolTypesItem(WorkerPoolType supportedPoolTypesItem) {
    if (this.supportedPoolTypes == null) {
      this.supportedPoolTypes = new ArrayList<WorkerPoolType>();
    }
    this.supportedPoolTypes.add(supportedPoolTypesItem);
    return this;
  }

  /**
   * Get supportedPoolTypes
   * @return supportedPoolTypes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkerPoolType> getSupportedPoolTypes() {
    return supportedPoolTypes;
  }

  public void setSupportedPoolTypes(List<WorkerPoolType> supportedPoolTypes) {
    this.supportedPoolTypes = supportedPoolTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPoolSupportedTypesResource workerPoolSupportedTypesResource =
        (WorkerPoolSupportedTypesResource)o;
    return Objects.equals(this.id, workerPoolSupportedTypesResource.id) &&
        Objects.equals(this.links, workerPoolSupportedTypesResource.links) &&
        Objects.equals(this.supportedPoolTypes,
                       workerPoolSupportedTypesResource.supportedPoolTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, supportedPoolTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPoolSupportedTypesResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    supportedPoolTypes: ")
        .append(toIndentedString(supportedPoolTypes))
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
