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
 * ServerConfigurationValueResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ServerConfigurationValueResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY) private String key;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE) private Object value;

  public ServerConfigurationValueResource description(String description) {

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

  public ServerConfigurationValueResource key(String key) {

    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }

  public void setKey(String key) { this.key = key; }

  public ServerConfigurationValueResource value(Object value) {

    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) { this.value = value; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfigurationValueResource serverConfigurationValueResource =
        (ServerConfigurationValueResource)o;
    return Objects.equals(this.description,
                          serverConfigurationValueResource.description) &&
        Objects.equals(this.key, serverConfigurationValueResource.key) &&
        Objects.equals(this.value, serverConfigurationValueResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConfigurationValueResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
