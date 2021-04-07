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
 * ExtensionsInfoResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ExtensionsInfoResource {
  public static final String SERIALIZED_NAME_ASSEMBLY_NAME = "AssemblyName";
  @SerializedName(SERIALIZED_NAME_ASSEMBLY_NAME) private String assemblyName;

  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR) private String author;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_CUSTOM = "IsCustom";
  @SerializedName(SERIALIZED_NAME_IS_CUSTOM) private Boolean isCustom;

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

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public ExtensionsInfoResource assemblyName(String assemblyName) {

    this.assemblyName = assemblyName;
    return this;
  }

  /**
   * Get assemblyName
   * @return assemblyName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssemblyName() {
    return assemblyName;
  }

  public void setAssemblyName(String assemblyName) {
    this.assemblyName = assemblyName;
  }

  public ExtensionsInfoResource author(String author) {

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

  public ExtensionsInfoResource id(String id) {

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

  public ExtensionsInfoResource isCustom(Boolean isCustom) {

    this.isCustom = isCustom;
    return this;
  }

  /**
   * Get isCustom
   * @return isCustom
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCustom() {
    return isCustom;
  }

  public void setIsCustom(Boolean isCustom) { this.isCustom = isCustom; }

  public ExtensionsInfoResource lastModifiedBy(String lastModifiedBy) {

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

  public ExtensionsInfoResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ExtensionsInfoResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ExtensionsInfoResource putLinksItem(String key, String linksItem) {
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

  public ExtensionsInfoResource name(String name) {

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

  public ExtensionsInfoResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsInfoResource extensionsInfoResource = (ExtensionsInfoResource)o;
    return Objects.equals(this.assemblyName,
                          extensionsInfoResource.assemblyName) &&
        Objects.equals(this.author, extensionsInfoResource.author) &&
        Objects.equals(this.id, extensionsInfoResource.id) &&
        Objects.equals(this.isCustom, extensionsInfoResource.isCustom) &&
        Objects.equals(this.lastModifiedBy,
                       extensionsInfoResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       extensionsInfoResource.lastModifiedOn) &&
        Objects.equals(this.links, extensionsInfoResource.links) &&
        Objects.equals(this.name, extensionsInfoResource.name) &&
        Objects.equals(this.version, extensionsInfoResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assemblyName, author, id, isCustom, lastModifiedBy,
                        lastModifiedOn, links, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsInfoResource {\n");
    sb.append("    assemblyName: ")
        .append(toIndentedString(assemblyName))
        .append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
