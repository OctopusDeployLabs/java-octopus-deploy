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
 * TagResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TagResource {
  public static final String SERIALIZED_NAME_CANONICAL_TAG_NAME =
      "CanonicalTagName";
  @SerializedName(SERIALIZED_NAME_CANONICAL_TAG_NAME)
  private String canonicalTagName;

  public static final String SERIALIZED_NAME_COLOR = "Color";
  @SerializedName(SERIALIZED_NAME_COLOR) private String color;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER) private Integer sortOrder;

  public TagResource canonicalTagName(String canonicalTagName) {

    this.canonicalTagName = canonicalTagName;
    return this;
  }

  /**
   * Get canonicalTagName
   * @return canonicalTagName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCanonicalTagName() {
    return canonicalTagName;
  }

  public void setCanonicalTagName(String canonicalTagName) {
    this.canonicalTagName = canonicalTagName;
  }

  public TagResource color(String color) {

    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColor() {
    return color;
  }

  public void setColor(String color) { this.color = color; }

  public TagResource description(String description) {

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

  public TagResource id(String id) {

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

  public TagResource name(String name) {

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

  public TagResource sortOrder(Integer sortOrder) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResource tagResource = (TagResource)o;
    return Objects.equals(this.canonicalTagName,
                          tagResource.canonicalTagName) &&
        Objects.equals(this.color, tagResource.color) &&
        Objects.equals(this.description, tagResource.description) &&
        Objects.equals(this.id, tagResource.id) &&
        Objects.equals(this.name, tagResource.name) &&
        Objects.equals(this.sortOrder, tagResource.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalTagName, color, description, id, name,
                        sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResource {\n");
    sb.append("    canonicalTagName: ")
        .append(toIndentedString(canonicalTagName))
        .append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ")
        .append(toIndentedString(sortOrder))
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
