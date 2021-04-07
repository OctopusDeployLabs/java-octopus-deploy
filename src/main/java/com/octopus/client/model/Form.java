// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.FormElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Form
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Form {
  public static final String SERIALIZED_NAME_ELEMENTS = "Elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<FormElement> elements = null;

  public static final String SERIALIZED_NAME_VALUES = "Values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Map<String, String> values = null;

  public Form elements(List<FormElement> elements) {

    this.elements = elements;
    return this;
  }

  public Form addElementsItem(FormElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<FormElement>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * Get elements
   * @return elements
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FormElement> getElements() {
    return elements;
  }

  public void setElements(List<FormElement> elements) {
    this.elements = elements;
  }

  public Form values(Map<String, String> values) {

    this.values = values;
    return this;
  }

  public Form putValuesItem(String key, String valuesItem) {
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
    Form form = (Form)o;
    return Objects.equals(this.elements, form.elements) &&
        Objects.equals(this.values, form.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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
