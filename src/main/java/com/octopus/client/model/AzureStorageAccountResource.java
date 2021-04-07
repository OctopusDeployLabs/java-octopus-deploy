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
 * AzureStorageAccountResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AzureStorageAccountResource {
  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION) private String location;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public AzureStorageAccountResource location(String location) {

    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) { this.location = location; }

  public AzureStorageAccountResource name(String name) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureStorageAccountResource azureStorageAccountResource =
        (AzureStorageAccountResource)o;
    return Objects.equals(this.location,
                          azureStorageAccountResource.location) &&
        Objects.equals(this.name, azureStorageAccountResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureStorageAccountResource {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
