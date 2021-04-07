// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.SensitiveValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * PropertyValueResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PropertyValueResource {
  public static final String SERIALIZED_NAME_IS_SENSITIVE = "IsSensitive";
  @SerializedName(SERIALIZED_NAME_IS_SENSITIVE) private Boolean isSensitive;

  public static final String SERIALIZED_NAME_SENSITIVE_VALUE = "SensitiveValue";
  @SerializedName(SERIALIZED_NAME_SENSITIVE_VALUE)
  private SensitiveValue sensitiveValue;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE) private String value;

  public PropertyValueResource isSensitive(Boolean isSensitive) {

    this.isSensitive = isSensitive;
    return this;
  }

  /**
   * Get isSensitive
   * @return isSensitive
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSensitive() {
    return isSensitive;
  }

  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public PropertyValueResource sensitiveValue(SensitiveValue sensitiveValue) {

    this.sensitiveValue = sensitiveValue;
    return this;
  }

  /**
   * Get sensitiveValue
   * @return sensitiveValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SensitiveValue getSensitiveValue() {
    return sensitiveValue;
  }

  public void setSensitiveValue(SensitiveValue sensitiveValue) {
    this.sensitiveValue = sensitiveValue;
  }

  public PropertyValueResource value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }

  public void setValue(String value) { this.value = value; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyValueResource propertyValueResource = (PropertyValueResource)o;
    return Objects.equals(this.isSensitive,
                          propertyValueResource.isSensitive) &&
        Objects.equals(this.sensitiveValue,
                       propertyValueResource.sensitiveValue) &&
        Objects.equals(this.value, propertyValueResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSensitive, sensitiveValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyValueResource {\n");
    sb.append("    isSensitive: ")
        .append(toIndentedString(isSensitive))
        .append("\n");
    sb.append("    sensitiveValue: ")
        .append(toIndentedString(sensitiveValue))
        .append("\n");
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
