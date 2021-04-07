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
 * OptionsMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class OptionsMetadata {
  public static final String SERIALIZED_NAME_SELECT_MODE = "SelectMode";
  @SerializedName(SERIALIZED_NAME_SELECT_MODE) private String selectMode;

  public static final String SERIALIZED_NAME_VALUES = "Values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, String> values = null;

  public OptionsMetadata selectMode(String selectMode) {

    this.selectMode = selectMode;
    return this;
  }

  /**
   * Get selectMode
   * @return selectMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSelectMode() {
    return selectMode;
  }

  public void setSelectMode(String selectMode) { this.selectMode = selectMode; }

  public OptionsMetadata values(Map<String, String> values) {

    this.values = values;
    return this;
  }

  public OptionsMetadata putValuesItem(String key, String valuesItem) {
    if (this.values == null) {
      this.values = new HashMap<String, String>();
    }
    this.values.put(key, valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getValues() {
    return values;
  }

  public void setValues(Map<String, String> values) { this.values = values; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsMetadata optionsMetadata = (OptionsMetadata)o;
    return Objects.equals(this.selectMode, optionsMetadata.selectMode) &&
        Objects.equals(this.values, optionsMetadata.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectMode, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsMetadata {\n");
    sb.append("    selectMode: ")
        .append(toIndentedString(selectMode))
        .append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
