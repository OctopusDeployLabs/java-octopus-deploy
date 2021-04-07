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
 * SensitiveValue
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class SensitiveValue {
  public static final String SERIALIZED_NAME_HAS_VALUE = "HasValue";
  @SerializedName(SERIALIZED_NAME_HAS_VALUE) private Boolean hasValue;

  public static final String SERIALIZED_NAME_HINT = "Hint";
  @SerializedName(SERIALIZED_NAME_HINT) private String hint;

  public static final String SERIALIZED_NAME_NEW_VALUE = "NewValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE) private String newValue;

  public SensitiveValue hasValue(Boolean hasValue) {

    this.hasValue = hasValue;
    return this;
  }

  /**
   * Get hasValue
   * @return hasValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasValue() {
    return hasValue;
  }

  public void setHasValue(Boolean hasValue) { this.hasValue = hasValue; }

  public SensitiveValue hint(String hint) {

    this.hint = hint;
    return this;
  }

  /**
   * Get hint
   * @return hint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHint() {
    return hint;
  }

  public void setHint(String hint) { this.hint = hint; }

  public SensitiveValue newValue(String newValue) {

    this.newValue = newValue;
    return this;
  }

  /**
   * Get newValue
   * @return newValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) { this.newValue = newValue; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveValue sensitiveValue = (SensitiveValue)o;
    return Objects.equals(this.hasValue, sensitiveValue.hasValue) &&
        Objects.equals(this.hint, sensitiveValue.hint) &&
        Objects.equals(this.newValue, sensitiveValue.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasValue, hint, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveValue {\n");
    sb.append("    hasValue: ").append(toIndentedString(hasValue)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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
