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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * DynamicExtensionsFeature
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DynamicExtensionsFeature {
  public static final String SERIALIZED_NAME_DEFAULT = "Default";
  @SerializedName(SERIALIZED_NAME_DEFAULT) private String _default;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY) private String key;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public DynamicExtensionsFeature _default(String _default) {

    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) { this._default = _default; }

  public DynamicExtensionsFeature description(String description) {

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

  public DynamicExtensionsFeature key(String key) {

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

  public DynamicExtensionsFeature name(String name) {

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

  public DynamicExtensionsFeature options(Map<String, String> options) {

    this.options = options;
    return this;
  }

  public DynamicExtensionsFeature putOptionsItem(String key,
                                                 String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicExtensionsFeature dynamicExtensionsFeature =
        (DynamicExtensionsFeature)o;
    return Objects.equals(this._default, dynamicExtensionsFeature._default) &&
        Objects.equals(this.description,
                       dynamicExtensionsFeature.description) &&
        Objects.equals(this.key, dynamicExtensionsFeature.key) &&
        Objects.equals(this.name, dynamicExtensionsFeature.name) &&
        Objects.equals(this.options, dynamicExtensionsFeature.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, description, key, name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicExtensionsFeature {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
