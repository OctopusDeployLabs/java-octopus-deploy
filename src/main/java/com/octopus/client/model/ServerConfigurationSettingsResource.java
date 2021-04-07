// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ServerConfigurationValueResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ServerConfigurationSettingsResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ServerConfigurationSettingsResource {
  public static final String SERIALIZED_NAME_CONFIGURATION_SET =
      "ConfigurationSet";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_SET)
  private String configurationSet;

  public static final String SERIALIZED_NAME_CONFIGURATION_VALUES =
      "ConfigurationValues";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_VALUES)
  private List<ServerConfigurationValueResource> configurationValues = null;

  public ServerConfigurationSettingsResource
  configurationSet(String configurationSet) {

    this.configurationSet = configurationSet;
    return this;
  }

  /**
   * Get configurationSet
   * @return configurationSet
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConfigurationSet() {
    return configurationSet;
  }

  public void setConfigurationSet(String configurationSet) {
    this.configurationSet = configurationSet;
  }

  public ServerConfigurationSettingsResource configurationValues(
      List<ServerConfigurationValueResource> configurationValues) {

    this.configurationValues = configurationValues;
    return this;
  }

  public ServerConfigurationSettingsResource addConfigurationValuesItem(
      ServerConfigurationValueResource configurationValuesItem) {
    if (this.configurationValues == null) {
      this.configurationValues =
          new ArrayList<ServerConfigurationValueResource>();
    }
    this.configurationValues.add(configurationValuesItem);
    return this;
  }

  /**
   * Get configurationValues
   * @return configurationValues
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServerConfigurationValueResource> getConfigurationValues() {
    return configurationValues;
  }

  public void setConfigurationValues(
      List<ServerConfigurationValueResource> configurationValues) {
    this.configurationValues = configurationValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfigurationSettingsResource serverConfigurationSettingsResource =
        (ServerConfigurationSettingsResource)o;
    return Objects.equals(
               this.configurationSet,
               serverConfigurationSettingsResource.configurationSet) &&
        Objects.equals(this.configurationValues,
                       serverConfigurationSettingsResource.configurationValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationSet, configurationValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerConfigurationSettingsResource {\n");
    sb.append("    configurationSet: ")
        .append(toIndentedString(configurationSet))
        .append("\n");
    sb.append("    configurationValues: ")
        .append(toIndentedString(configurationValues))
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
