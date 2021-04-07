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
 * VariablePromptOptions
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariablePromptOptions {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_DISPLAY_SETTINGS =
      "DisplaySettings";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SETTINGS)
  private Map<String, String> displaySettings = null;

  public static final String SERIALIZED_NAME_LABEL = "Label";
  @SerializedName(SERIALIZED_NAME_LABEL) private String label;

  public static final String SERIALIZED_NAME_REQUIRED = "Required";
  @SerializedName(SERIALIZED_NAME_REQUIRED) private Boolean required;

  public VariablePromptOptions description(String description) {

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

  public VariablePromptOptions
  displaySettings(Map<String, String> displaySettings) {

    this.displaySettings = displaySettings;
    return this;
  }

  public VariablePromptOptions
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

  public VariablePromptOptions label(String label) {

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

  public VariablePromptOptions required(Boolean required) {

    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) { this.required = required; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariablePromptOptions variablePromptOptions = (VariablePromptOptions)o;
    return Objects.equals(this.description,
                          variablePromptOptions.description) &&
        Objects.equals(this.displaySettings,
                       variablePromptOptions.displaySettings) &&
        Objects.equals(this.label, variablePromptOptions.label) &&
        Objects.equals(this.required, variablePromptOptions.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displaySettings, label, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariablePromptOptions {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    displaySettings: ")
        .append(toIndentedString(displaySettings))
        .append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
