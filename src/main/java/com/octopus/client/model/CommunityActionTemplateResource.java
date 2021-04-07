// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionTemplateParameterResource;
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

/**
 * CommunityActionTemplateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CommunityActionTemplateResource {
  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR) private String author;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_HISTORY_URL = "HistoryUrl";
  @SerializedName(SERIALIZED_NAME_HISTORY_URL) private String historyUrl;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PARAMETERS = "Parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ActionTemplateParameterResource> parameters = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PropertyValueResource> properties = null;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private String type;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public static final String SERIALIZED_NAME_WEBSITE = "Website";
  @SerializedName(SERIALIZED_NAME_WEBSITE) private String website;

  public CommunityActionTemplateResource author(String author) {

    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) { this.author = author; }

  public CommunityActionTemplateResource description(String description) {

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

  public CommunityActionTemplateResource historyUrl(String historyUrl) {

    this.historyUrl = historyUrl;
    return this;
  }

  /**
   * Get historyUrl
   * @return historyUrl
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHistoryUrl() {
    return historyUrl;
  }

  public void setHistoryUrl(String historyUrl) { this.historyUrl = historyUrl; }

  public CommunityActionTemplateResource id(String id) {

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

  public CommunityActionTemplateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public CommunityActionTemplateResource putLinksItem(String key,
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

  public CommunityActionTemplateResource name(String name) {

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

  public CommunityActionTemplateResource type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) { this.type = type; }

  public CommunityActionTemplateResource version(Integer version) {

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

  public CommunityActionTemplateResource website(String website) {

    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) { this.website = website; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunityActionTemplateResource communityActionTemplateResource =
        (CommunityActionTemplateResource)o;
    return Objects.equals(this.author,
                          communityActionTemplateResource.author) &&
        Objects.equals(this.description,
                       communityActionTemplateResource.description) &&
        Objects.equals(this.historyUrl,
                       communityActionTemplateResource.historyUrl) &&
        Objects.equals(this.id, communityActionTemplateResource.id) &&
        Objects.equals(this.links, communityActionTemplateResource.links) &&
        Objects.equals(this.name, communityActionTemplateResource.name) &&
        Objects.equals(this.parameters,
                       communityActionTemplateResource.parameters) &&
        Objects.equals(this.properties,
                       communityActionTemplateResource.properties) &&
        Objects.equals(this.type, communityActionTemplateResource.type) &&
        Objects.equals(this.version, communityActionTemplateResource.version) &&
        Objects.equals(this.website, communityActionTemplateResource.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, description, historyUrl, id, links, name,
                        parameters, properties, type, version, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunityActionTemplateResource {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    historyUrl: ")
        .append(toIndentedString(historyUrl))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ")
        .append(toIndentedString(parameters))
        .append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
