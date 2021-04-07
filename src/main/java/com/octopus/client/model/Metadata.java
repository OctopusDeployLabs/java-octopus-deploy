// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.TypeMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Metadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Metadata {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_TYPES = "Types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<TypeMetadata> types = null;

  public Metadata description(String description) {

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

  public Metadata types(List<TypeMetadata> types) {

    this.types = types;
    return this;
  }

  public Metadata addTypesItem(TypeMetadata typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypeMetadata>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TypeMetadata> getTypes() {
    return types;
  }

  public void setTypes(List<TypeMetadata> types) { this.types = types; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata)o;
    return Objects.equals(this.description, metadata.description) &&
        Objects.equals(this.types, metadata.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
