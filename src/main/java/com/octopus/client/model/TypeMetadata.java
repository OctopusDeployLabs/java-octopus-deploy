// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PropertyMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TypeMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TypeMetadata {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<PropertyMetadata> properties = null;

  public TypeMetadata name(String name) {

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

  public TypeMetadata properties(List<PropertyMetadata> properties) {

    this.properties = properties;
    return this;
  }

  public TypeMetadata addPropertiesItem(PropertyMetadata propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<PropertyMetadata>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PropertyMetadata> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyMetadata> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeMetadata typeMetadata = (TypeMetadata)o;
    return Objects.equals(this.name, typeMetadata.name) &&
        Objects.equals(this.properties, typeMetadata.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
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
