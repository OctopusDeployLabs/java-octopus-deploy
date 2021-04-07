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
import java.util.Objects;

/**
 * WorkItemLink
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class WorkItemLink {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINK_URL = "LinkUrl";
  @SerializedName(SERIALIZED_NAME_LINK_URL) private String linkUrl;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE) private String source;

  public WorkItemLink description(String description) {

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

  public WorkItemLink id(String id) {

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

  public WorkItemLink linkUrl(String linkUrl) {

    this.linkUrl = linkUrl;
    return this;
  }

  /**
   * Get linkUrl
   * @return linkUrl
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) { this.linkUrl = linkUrl; }

  public WorkItemLink source(String source) {

    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }

  public void setSource(String source) { this.source = source; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemLink workItemLink = (WorkItemLink)o;
    return Objects.equals(this.description, workItemLink.description) &&
        Objects.equals(this.id, workItemLink.id) &&
        Objects.equals(this.linkUrl, workItemLink.linkUrl) &&
        Objects.equals(this.source, workItemLink.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, linkUrl, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemLink {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
