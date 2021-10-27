/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.deploymentprocess;

import com.octopus.sdk.model.SensitiveValue;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** PropertyValueResource */
@SuppressWarnings("UnusedVariable")
public class PropertyValueResource {
  @SerializedName("IsSensitive")
  private Boolean isSensitive;

  @SerializedName("SensitiveValue")
  private SensitiveValue sensitiveValue;

  @SerializedName("Value")
  private String value;

  public PropertyValueResource isSensitive(Boolean isSensitive) {

    this.isSensitive = isSensitive;
    return this;
  }

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

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyValueResource propertyValueResource = (PropertyValueResource) o;
    return Objects.equals(this.isSensitive, propertyValueResource.isSensitive)
        && Objects.equals(this.sensitiveValue, propertyValueResource.sensitiveValue)
        && Objects.equals(this.value, propertyValueResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSensitive, sensitiveValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyValueResource {\n");
    sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
    sb.append("    sensitiveValue: ").append(toIndentedString(sensitiveValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
