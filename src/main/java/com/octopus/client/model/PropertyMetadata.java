// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DisplayInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * PropertyMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PropertyMetadata {
  public static final String SERIALIZED_NAME_DISPLAY_INFO = "DisplayInfo";
  @SerializedName(SERIALIZED_NAME_DISPLAY_INFO) private DisplayInfo displayInfo;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private String type;

  public PropertyMetadata displayInfo(DisplayInfo displayInfo) {

    this.displayInfo = displayInfo;
    return this;
  }

  /**
   * Get displayInfo
   * @return displayInfo
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisplayInfo getDisplayInfo() {
    return displayInfo;
  }

  public void setDisplayInfo(DisplayInfo displayInfo) {
    this.displayInfo = displayInfo;
  }

  public PropertyMetadata name(String name) {

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

  public PropertyMetadata type(String type) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMetadata propertyMetadata = (PropertyMetadata)o;
    return Objects.equals(this.displayInfo, propertyMetadata.displayInfo) &&
        Objects.equals(this.name, propertyMetadata.name) &&
        Objects.equals(this.type, propertyMetadata.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayInfo, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    sb.append("    displayInfo: ")
        .append(toIndentedString(displayInfo))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
