// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ExtensionSettingsValues;
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
 * EnvironmentResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EnvironmentResource {
  public static final String SERIALIZED_NAME_ALLOW_DYNAMIC_INFRASTRUCTURE =
      "AllowDynamicInfrastructure";
  @SerializedName(SERIALIZED_NAME_ALLOW_DYNAMIC_INFRASTRUCTURE)
  private Boolean allowDynamicInfrastructure;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_EXTENSION_SETTINGS =
      "ExtensionSettings";
  @SerializedName(SERIALIZED_NAME_EXTENSION_SETTINGS)
  private List<ExtensionSettingsValues> extensionSettings = null;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER) private Integer sortOrder;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_USE_GUIDED_FAILURE =
      "UseGuidedFailure";
  @SerializedName(SERIALIZED_NAME_USE_GUIDED_FAILURE)
  private Boolean useGuidedFailure;

  public EnvironmentResource
  allowDynamicInfrastructure(Boolean allowDynamicInfrastructure) {

    this.allowDynamicInfrastructure = allowDynamicInfrastructure;
    return this;
  }

  /**
   * Get allowDynamicInfrastructure
   * @return allowDynamicInfrastructure
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowDynamicInfrastructure() {
    return allowDynamicInfrastructure;
  }

  public void
  setAllowDynamicInfrastructure(Boolean allowDynamicInfrastructure) {
    this.allowDynamicInfrastructure = allowDynamicInfrastructure;
  }

  public EnvironmentResource description(String description) {

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

  /**
   * Get extensionSettings
   * @return extensionSettings
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtensionSettingsValues> getExtensionSettings() {
    return extensionSettings;
  }

  public EnvironmentResource id(String id) {

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

  public EnvironmentResource lastModifiedBy(String lastModifiedBy) {

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

  public EnvironmentResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public EnvironmentResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public EnvironmentResource putLinksItem(String key, String linksItem) {
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

  public EnvironmentResource name(String name) {

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

  public EnvironmentResource sortOrder(Integer sortOrder) {

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

  public EnvironmentResource spaceId(String spaceId) {

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

  public EnvironmentResource useGuidedFailure(Boolean useGuidedFailure) {

    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  /**
   * Get useGuidedFailure
   * @return useGuidedFailure
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGuidedFailure() {
    return useGuidedFailure;
  }

  public void setUseGuidedFailure(Boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentResource environmentResource = (EnvironmentResource)o;
    return Objects.equals(this.allowDynamicInfrastructure,
                          environmentResource.allowDynamicInfrastructure) &&
        Objects.equals(this.description, environmentResource.description) &&
        Objects.equals(this.extensionSettings,
                       environmentResource.extensionSettings) &&
        Objects.equals(this.id, environmentResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       environmentResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       environmentResource.lastModifiedOn) &&
        Objects.equals(this.links, environmentResource.links) &&
        Objects.equals(this.name, environmentResource.name) &&
        Objects.equals(this.sortOrder, environmentResource.sortOrder) &&
        Objects.equals(this.spaceId, environmentResource.spaceId) &&
        Objects.equals(this.useGuidedFailure,
                       environmentResource.useGuidedFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDynamicInfrastructure, description,
                        extensionSettings, id, lastModifiedBy, lastModifiedOn,
                        links, name, sortOrder, spaceId, useGuidedFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentResource {\n");
    sb.append("    allowDynamicInfrastructure: ")
        .append(toIndentedString(allowDynamicInfrastructure))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    extensionSettings: ")
        .append(toIndentedString(extensionSettings))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    useGuidedFailure: ")
        .append(toIndentedString(useGuidedFailure))
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
