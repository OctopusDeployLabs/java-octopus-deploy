// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PropertyApplicabilityMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * PropertyApplicability
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PropertyApplicability {
  public static final String SERIALIZED_NAME_DEPENDS_ON_PROPERTY_NAME =
      "DependsOnPropertyName";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON_PROPERTY_NAME)
  private String dependsOnPropertyName;

  public static final String SERIALIZED_NAME_DEPENDS_ON_PROPERTY_VALUE =
      "DependsOnPropertyValue";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON_PROPERTY_VALUE)
  private Object dependsOnPropertyValue;

  public static final String SERIALIZED_NAME_MODE = "Mode";
  @SerializedName(SERIALIZED_NAME_MODE) private PropertyApplicabilityMode mode;

  public PropertyApplicability
  dependsOnPropertyName(String dependsOnPropertyName) {

    this.dependsOnPropertyName = dependsOnPropertyName;
    return this;
  }

  /**
   * Get dependsOnPropertyName
   * @return dependsOnPropertyName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDependsOnPropertyName() {
    return dependsOnPropertyName;
  }

  public void setDependsOnPropertyName(String dependsOnPropertyName) {
    this.dependsOnPropertyName = dependsOnPropertyName;
  }

  public PropertyApplicability
  dependsOnPropertyValue(Object dependsOnPropertyValue) {

    this.dependsOnPropertyValue = dependsOnPropertyValue;
    return this;
  }

  /**
   * Get dependsOnPropertyValue
   * @return dependsOnPropertyValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDependsOnPropertyValue() {
    return dependsOnPropertyValue;
  }

  public void setDependsOnPropertyValue(Object dependsOnPropertyValue) {
    this.dependsOnPropertyValue = dependsOnPropertyValue;
  }

  public PropertyApplicability mode(PropertyApplicabilityMode mode) {

    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertyApplicabilityMode getMode() {
    return mode;
  }

  public void setMode(PropertyApplicabilityMode mode) { this.mode = mode; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyApplicability propertyApplicability = (PropertyApplicability)o;
    return Objects.equals(this.dependsOnPropertyName,
                          propertyApplicability.dependsOnPropertyName) &&
        Objects.equals(this.dependsOnPropertyValue,
                       propertyApplicability.dependsOnPropertyValue) &&
        Objects.equals(this.mode, propertyApplicability.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependsOnPropertyName, dependsOnPropertyValue, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyApplicability {\n");
    sb.append("    dependsOnPropertyName: ")
        .append(toIndentedString(dependsOnPropertyName))
        .append("\n");
    sb.append("    dependsOnPropertyValue: ")
        .append(toIndentedString(dependsOnPropertyValue))
        .append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
