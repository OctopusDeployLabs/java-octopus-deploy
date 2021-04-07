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
 * CommitDetails
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CommitDetails {
  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT) private String comment;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINK_URL = "LinkUrl";
  @SerializedName(SERIALIZED_NAME_LINK_URL) private String linkUrl;

  public CommitDetails comment(String comment) {

    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) { this.comment = comment; }

  public CommitDetails id(String id) {

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

  public CommitDetails linkUrl(String linkUrl) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitDetails commitDetails = (CommitDetails)o;
    return Objects.equals(this.comment, commitDetails.comment) &&
        Objects.equals(this.id, commitDetails.id) &&
        Objects.equals(this.linkUrl, commitDetails.linkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, linkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitDetails {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
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
