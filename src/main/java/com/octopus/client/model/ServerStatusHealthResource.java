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
 * ServerStatusHealthResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ServerStatusHealthResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_COMPLIANT_WITH_LICENSE =
      "IsCompliantWithLicense";
  @SerializedName(SERIALIZED_NAME_IS_COMPLIANT_WITH_LICENSE)
  private Boolean isCompliantWithLicense;

  public static final String SERIALIZED_NAME_IS_ENTIRE_CLUSTER_DRAINING_TASKS =
      "IsEntireClusterDrainingTasks";
  @SerializedName(SERIALIZED_NAME_IS_ENTIRE_CLUSTER_DRAINING_TASKS)
  private Boolean isEntireClusterDrainingTasks;

  public static final String SERIALIZED_NAME_IS_ENTIRE_CLUSTER_READ_ONLY =
      "IsEntireClusterReadOnly";
  @SerializedName(SERIALIZED_NAME_IS_ENTIRE_CLUSTER_READ_ONLY)
  private Boolean isEntireClusterReadOnly;

  public static final String SERIALIZED_NAME_IS_OPERATING_NORMALLY =
      "IsOperatingNormally";
  @SerializedName(SERIALIZED_NAME_IS_OPERATING_NORMALLY)
  private Boolean isOperatingNormally;

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

  public ServerStatusHealthResource description(String description) {

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

  public ServerStatusHealthResource id(String id) {

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

  public ServerStatusHealthResource
  isCompliantWithLicense(Boolean isCompliantWithLicense) {

    this.isCompliantWithLicense = isCompliantWithLicense;
    return this;
  }

  /**
   * Get isCompliantWithLicense
   * @return isCompliantWithLicense
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCompliantWithLicense() {
    return isCompliantWithLicense;
  }

  public void setIsCompliantWithLicense(Boolean isCompliantWithLicense) {
    this.isCompliantWithLicense = isCompliantWithLicense;
  }

  public ServerStatusHealthResource
  isEntireClusterDrainingTasks(Boolean isEntireClusterDrainingTasks) {

    this.isEntireClusterDrainingTasks = isEntireClusterDrainingTasks;
    return this;
  }

  /**
   * Get isEntireClusterDrainingTasks
   * @return isEntireClusterDrainingTasks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEntireClusterDrainingTasks() {
    return isEntireClusterDrainingTasks;
  }

  public void
  setIsEntireClusterDrainingTasks(Boolean isEntireClusterDrainingTasks) {
    this.isEntireClusterDrainingTasks = isEntireClusterDrainingTasks;
  }

  public ServerStatusHealthResource
  isEntireClusterReadOnly(Boolean isEntireClusterReadOnly) {

    this.isEntireClusterReadOnly = isEntireClusterReadOnly;
    return this;
  }

  /**
   * Get isEntireClusterReadOnly
   * @return isEntireClusterReadOnly
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEntireClusterReadOnly() {
    return isEntireClusterReadOnly;
  }

  public void setIsEntireClusterReadOnly(Boolean isEntireClusterReadOnly) {
    this.isEntireClusterReadOnly = isEntireClusterReadOnly;
  }

  /**
   * Get isOperatingNormally
   * @return isOperatingNormally
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOperatingNormally() {
    return isOperatingNormally;
  }

  public ServerStatusHealthResource lastModifiedBy(String lastModifiedBy) {

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

  public ServerStatusHealthResource
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

  public ServerStatusHealthResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ServerStatusHealthResource putLinksItem(String key, String linksItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerStatusHealthResource serverStatusHealthResource =
        (ServerStatusHealthResource)o;
    return Objects.equals(this.description,
                          serverStatusHealthResource.description) &&
        Objects.equals(this.id, serverStatusHealthResource.id) &&
        Objects.equals(this.isCompliantWithLicense,
                       serverStatusHealthResource.isCompliantWithLicense) &&
        Objects.equals(
            this.isEntireClusterDrainingTasks,
            serverStatusHealthResource.isEntireClusterDrainingTasks) &&
        Objects.equals(this.isEntireClusterReadOnly,
                       serverStatusHealthResource.isEntireClusterReadOnly) &&
        Objects.equals(this.isOperatingNormally,
                       serverStatusHealthResource.isOperatingNormally) &&
        Objects.equals(this.lastModifiedBy,
                       serverStatusHealthResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       serverStatusHealthResource.lastModifiedOn) &&
        Objects.equals(this.links, serverStatusHealthResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isCompliantWithLicense,
                        isEntireClusterDrainingTasks, isEntireClusterReadOnly,
                        isOperatingNormally, lastModifiedBy, lastModifiedOn,
                        links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerStatusHealthResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCompliantWithLicense: ")
        .append(toIndentedString(isCompliantWithLicense))
        .append("\n");
    sb.append("    isEntireClusterDrainingTasks: ")
        .append(toIndentedString(isEntireClusterDrainingTasks))
        .append("\n");
    sb.append("    isEntireClusterReadOnly: ")
        .append(toIndentedString(isEntireClusterReadOnly))
        .append("\n");
    sb.append("    isOperatingNormally: ")
        .append(toIndentedString(isOperatingNormally))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
