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

package com.octopus.sdk.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** SensitiveValue */
@SuppressWarnings("UnusedVariable")
public class SensitiveValue {
  @SerializedName("HasValue")
  private Boolean hasValue;

  @SerializedName("Hint")
  private String hint;

  @SerializedName("NewValue")
  private String newValue;

  public SensitiveValue hasValue(Boolean hasValue) {

    this.hasValue = hasValue;
    return this;
  }

  public Boolean getHasValue() {
    return hasValue;
  }

  public void setHasValue(Boolean hasValue) {
    this.hasValue = hasValue;
  }

  public SensitiveValue hint(String hint) {

    this.hint = hint;
    return this;
  }

  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }

  public SensitiveValue newValue(String newValue) {

    this.newValue = newValue;
    return this;
  }

  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveValue sensitiveValue = (SensitiveValue) o;
    return Objects.equals(this.hasValue, sensitiveValue.hasValue)
        && Objects.equals(this.hint, sensitiveValue.hint)
        && Objects.equals(this.newValue, sensitiveValue.newValue);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
