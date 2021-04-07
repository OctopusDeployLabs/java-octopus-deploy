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
 * MaintenanceConfigurationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MaintenanceConfigurationResource {
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

  public MaintenanceConfigurationResource id(String id) {

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

  public MaintenanceConfigurationResource
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

  public MaintenanceConfigurationResource
  lastModifiedBy(String lastModifiedBy) {

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

  public MaintenanceConfigurationResource
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

  public MaintenanceConfigurationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MaintenanceConfigurationResource putLinksItem(String key,
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceConfigurationResource maintenanceConfigurationResource =
        (MaintenanceConfigurationResource)o;
    return Objects.equals(this.id, maintenanceConfigurationResource.id) &&
        Objects.equals(this.isInMaintenanceMode,
                       maintenanceConfigurationResource.isInMaintenanceMode) &&
        Objects.equals(this.lastModifiedBy,
                       maintenanceConfigurationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       maintenanceConfigurationResource.lastModifiedOn) &&
        Objects.equals(this.links, maintenanceConfigurationResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isInMaintenanceMode, lastModifiedBy, lastModifiedOn,
                        links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceConfigurationResource {\n");
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
