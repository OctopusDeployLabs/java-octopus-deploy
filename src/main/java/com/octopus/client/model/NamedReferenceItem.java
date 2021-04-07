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
 * NamedReferenceItem
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class NamedReferenceItem {
  public static final String SERIALIZED_NAME_DISPLAY_ID_AND_NAME =
      "DisplayIdAndName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ID_AND_NAME)
  private Boolean displayIdAndName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME) private String displayName;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public NamedReferenceItem displayIdAndName(Boolean displayIdAndName) {

    this.displayIdAndName = displayIdAndName;
    return this;
  }

  /**
   * Get displayIdAndName
   * @return displayIdAndName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisplayIdAndName() {
    return displayIdAndName;
  }

  public void setDisplayIdAndName(Boolean displayIdAndName) {
    this.displayIdAndName = displayIdAndName;
  }

  public NamedReferenceItem displayName(String displayName) {

    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public NamedReferenceItem id(String id) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedReferenceItem namedReferenceItem = (NamedReferenceItem)o;
    return Objects.equals(this.displayIdAndName,
                          namedReferenceItem.displayIdAndName) &&
        Objects.equals(this.displayName, namedReferenceItem.displayName) &&
        Objects.equals(this.id, namedReferenceItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayIdAndName, displayName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedReferenceItem {\n");
    sb.append("    displayIdAndName: ")
        .append(toIndentedString(displayIdAndName))
        .append("\n");
    sb.append("    displayName: ")
        .append(toIndentedString(displayName))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
