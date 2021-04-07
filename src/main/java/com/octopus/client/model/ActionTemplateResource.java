// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionTemplateParameterResource;
import com.octopus.client.model.PackageReference;
import com.octopus.client.model.PropertyValueResource;
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
 * ActionTemplateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionTemplateResource {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "ActionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE) private String actionType;

  public static final String SERIALIZED_NAME_COMMUNITY_ACTION_TEMPLATE_ID =
      "CommunityActionTemplateId";
  @SerializedName(SERIALIZED_NAME_COMMUNITY_ACTION_TEMPLATE_ID)
  private String communityActionTemplateId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

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

  public static final String SERIALIZED_NAME_PACKAGES = "Packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<PackageReference> packages = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "Parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ActionTemplateParameterResource> parameters = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PropertyValueResource> properties = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public ActionTemplateResource actionType(String actionType) {

    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   **/
  @ApiModelProperty(required = true, value = "")

  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) { this.actionType = actionType; }

  public ActionTemplateResource
  communityActionTemplateId(String communityActionTemplateId) {

    this.communityActionTemplateId = communityActionTemplateId;
    return this;
  }

  /**
   * Get communityActionTemplateId
   * @return communityActionTemplateId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommunityActionTemplateId() {
    return communityActionTemplateId;
  }

  public void setCommunityActionTemplateId(String communityActionTemplateId) {
    this.communityActionTemplateId = communityActionTemplateId;
  }

  public ActionTemplateResource description(String description) {

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

  public ActionTemplateResource id(String id) {

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

  public ActionTemplateResource lastModifiedBy(String lastModifiedBy) {

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

  public ActionTemplateResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ActionTemplateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ActionTemplateResource putLinksItem(String key, String linksItem) {
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

  public ActionTemplateResource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public ActionTemplateResource packages(List<PackageReference> packages) {

    this.packages = packages;
    return this;
  }

  public ActionTemplateResource addPackagesItem(PackageReference packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<PackageReference>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PackageReference> getPackages() {
    return packages;
  }

  public void setPackages(List<PackageReference> packages) {
    this.packages = packages;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActionTemplateParameterResource> getParameters() {
    return parameters;
  }

  /**
   * Get properties
   * @return properties
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, PropertyValueResource> getProperties() {
    return properties;
  }

  public ActionTemplateResource spaceId(String spaceId) {

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

  public ActionTemplateResource version(Integer version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionTemplateResource actionTemplateResource = (ActionTemplateResource)o;
    return Objects.equals(this.actionType, actionTemplateResource.actionType) &&
        Objects.equals(this.communityActionTemplateId,
                       actionTemplateResource.communityActionTemplateId) &&
        Objects.equals(this.description, actionTemplateResource.description) &&
        Objects.equals(this.id, actionTemplateResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       actionTemplateResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       actionTemplateResource.lastModifiedOn) &&
        Objects.equals(this.links, actionTemplateResource.links) &&
        Objects.equals(this.name, actionTemplateResource.name) &&
        Objects.equals(this.packages, actionTemplateResource.packages) &&
        Objects.equals(this.parameters, actionTemplateResource.parameters) &&
        Objects.equals(this.properties, actionTemplateResource.properties) &&
        Objects.equals(this.spaceId, actionTemplateResource.spaceId) &&
        Objects.equals(this.version, actionTemplateResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, communityActionTemplateId, description, id,
                        lastModifiedBy, lastModifiedOn, links, name, packages,
                        parameters, properties, spaceId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionTemplateResource {\n");
    sb.append("    actionType: ")
        .append(toIndentedString(actionType))
        .append("\n");
    sb.append("    communityActionTemplateId: ")
        .append(toIndentedString(communityActionTemplateId))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
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
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    parameters: ")
        .append(toIndentedString(parameters))
        .append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
