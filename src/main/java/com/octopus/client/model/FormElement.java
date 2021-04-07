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
 * FormElement
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class FormElement {
  public static final String SERIALIZED_NAME_CONTROL = "Control";
  @SerializedName(SERIALIZED_NAME_CONTROL) private Object control;

  public static final String SERIALIZED_NAME_IS_VALUE_REQUIRED =
      "IsValueRequired";
  @SerializedName(SERIALIZED_NAME_IS_VALUE_REQUIRED)
  private Boolean isValueRequired;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public FormElement control(Object control) {

    this.control = control;
    return this;
  }

  /**
   * Get control
   * @return control
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getControl() {
    return control;
  }

  public void setControl(Object control) { this.control = control; }

  public FormElement isValueRequired(Boolean isValueRequired) {

    this.isValueRequired = isValueRequired;
    return this;
  }

  /**
   * Get isValueRequired
   * @return isValueRequired
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsValueRequired() {
    return isValueRequired;
  }

  public void setIsValueRequired(Boolean isValueRequired) {
    this.isValueRequired = isValueRequired;
  }

  public FormElement name(String name) {

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
    FormElement formElement = (FormElement)o;
    return Objects.equals(this.control, formElement.control) &&
        Objects.equals(this.isValueRequired, formElement.isValueRequired) &&
        Objects.equals(this.name, formElement.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(control, isValueRequired, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormElement {\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    isValueRequired: ")
        .append(toIndentedString(isValueRequired))
        .append("\n");
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
