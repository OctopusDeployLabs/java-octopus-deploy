// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionTemplateParameterResource;
import com.octopus.client.model.VariableSetContentType;
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
 * LibraryVariableSetResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LibraryVariableSetResource {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "ContentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private VariableSetContentType contentType;

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

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TEMPLATES = "Templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<ActionTemplateParameterResource> templates = null;

  public static final String SERIALIZED_NAME_VARIABLE_SET_ID = "VariableSetId";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SET_ID) private String variableSetId;

  public LibraryVariableSetResource
  contentType(VariableSetContentType contentType) {

    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariableSetContentType getContentType() {
    return contentType;
  }

  public void setContentType(VariableSetContentType contentType) {
    this.contentType = contentType;
  }

  public LibraryVariableSetResource description(String description) {

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

  public LibraryVariableSetResource id(String id) {

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

  public LibraryVariableSetResource lastModifiedBy(String lastModifiedBy) {

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

  public LibraryVariableSetResource
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

  public LibraryVariableSetResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LibraryVariableSetResource putLinksItem(String key, String linksItem) {
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

  public LibraryVariableSetResource name(String name) {

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

  public LibraryVariableSetResource spaceId(String spaceId) {

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

  public LibraryVariableSetResource
  templates(List<ActionTemplateParameterResource> templates) {

    this.templates = templates;
    return this;
  }

  public LibraryVariableSetResource
  addTemplatesItem(ActionTemplateParameterResource templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<ActionTemplateParameterResource>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActionTemplateParameterResource> getTemplates() {
    return templates;
  }

  public void setTemplates(List<ActionTemplateParameterResource> templates) {
    this.templates = templates;
  }

  public LibraryVariableSetResource variableSetId(String variableSetId) {

    this.variableSetId = variableSetId;
    return this;
  }

  /**
   * Get variableSetId
   * @return variableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariableSetId() {
    return variableSetId;
  }

  public void setVariableSetId(String variableSetId) {
    this.variableSetId = variableSetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVariableSetResource libraryVariableSetResource =
        (LibraryVariableSetResource)o;
    return Objects.equals(this.contentType,
                          libraryVariableSetResource.contentType) &&
        Objects.equals(this.description,
                       libraryVariableSetResource.description) &&
        Objects.equals(this.id, libraryVariableSetResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       libraryVariableSetResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       libraryVariableSetResource.lastModifiedOn) &&
        Objects.equals(this.links, libraryVariableSetResource.links) &&
        Objects.equals(this.name, libraryVariableSetResource.name) &&
        Objects.equals(this.spaceId, libraryVariableSetResource.spaceId) &&
        Objects.equals(this.templates, libraryVariableSetResource.templates) &&
        Objects.equals(this.variableSetId,
                       libraryVariableSetResource.variableSetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, description, id, lastModifiedBy,
                        lastModifiedOn, links, name, spaceId, templates,
                        variableSetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVariableSetResource {\n");
    sb.append("    contentType: ")
        .append(toIndentedString(contentType))
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
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    templates: ")
        .append(toIndentedString(templates))
        .append("\n");
    sb.append("    variableSetId: ")
        .append(toIndentedString(variableSetId))
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
