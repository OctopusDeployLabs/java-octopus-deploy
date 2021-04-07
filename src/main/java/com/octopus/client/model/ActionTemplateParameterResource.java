// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PropertyValueResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ActionTemplateParameterResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionTemplateParameterResource {
  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "DefaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private PropertyValueResource defaultValue;

  public static final String SERIALIZED_NAME_DISPLAY_SETTINGS =
      "DisplaySettings";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SETTINGS)
  private Map<String, String> displaySettings = null;

  public static final String SERIALIZED_NAME_HELP_TEXT = "HelpText";
  @SerializedName(SERIALIZED_NAME_HELP_TEXT) private String helpText;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LABEL = "Label";
  @SerializedName(SERIALIZED_NAME_LABEL) private String label;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public ActionTemplateParameterResource
  defaultValue(PropertyValueResource defaultValue) {

    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertyValueResource getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(PropertyValueResource defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ActionTemplateParameterResource
  displaySettings(Map<String, String> displaySettings) {

    this.displaySettings = displaySettings;
    return this;
  }

  public ActionTemplateParameterResource
  putDisplaySettingsItem(String key, String displaySettingsItem) {
    if (this.displaySettings == null) {
      this.displaySettings = new HashMap<String, String>();
    }
    this.displaySettings.put(key, displaySettingsItem);
    return this;
  }

  /**
   * Get displaySettings
   * @return displaySettings
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(Map<String, String> displaySettings) {
    this.displaySettings = displaySettings;
  }

  public ActionTemplateParameterResource helpText(String helpText) {

    this.helpText = helpText;
    return this;
  }

  /**
   * Get helpText
   * @return helpText
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) { this.helpText = helpText; }

  public ActionTemplateParameterResource id(String id) {

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

  public ActionTemplateParameterResource label(String label) {

    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) { this.label = label; }

  public ActionTemplateParameterResource name(String name) {

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
    ActionTemplateParameterResource actionTemplateParameterResource =
        (ActionTemplateParameterResource)o;
    return Objects.equals(this.defaultValue,
                          actionTemplateParameterResource.defaultValue) &&
        Objects.equals(this.displaySettings,
                       actionTemplateParameterResource.displaySettings) &&
        Objects.equals(this.helpText,
                       actionTemplateParameterResource.helpText) &&
        Objects.equals(this.id, actionTemplateParameterResource.id) &&
        Objects.equals(this.label, actionTemplateParameterResource.label) &&
        Objects.equals(this.name, actionTemplateParameterResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, displaySettings, helpText, id, label,
                        name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionTemplateParameterResource {\n");
    sb.append("    defaultValue: ")
        .append(toIndentedString(defaultValue))
        .append("\n");
    sb.append("    displaySettings: ")
        .append(toIndentedString(displaySettings))
        .append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
