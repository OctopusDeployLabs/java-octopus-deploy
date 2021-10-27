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

package com.octopus.sdk.model.common;

import com.octopus.openapi.model.RetentionUnit;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** RetentionPeriod */
@SuppressWarnings("UnusedVariable")
public class RetentionPeriod {
  @SerializedName("QuantityToKeep")
  private Integer quantityToKeep;

  @SerializedName("ShouldKeepForever")
  private Boolean shouldKeepForever;

  @SerializedName("Unit")
  private RetentionUnit unit;

  public RetentionPeriod quantityToKeep(Integer quantityToKeep) {

    this.quantityToKeep = quantityToKeep;
    return this;
  }

  public Integer getQuantityToKeep() {
    return quantityToKeep;
  }

  public void setQuantityToKeep(Integer quantityToKeep) {
    this.quantityToKeep = quantityToKeep;
  }

  public Boolean getShouldKeepForever() {
    return shouldKeepForever;
  }

  public RetentionPeriod unit(RetentionUnit unit) {

    this.unit = unit;
    return this;
  }

  public RetentionUnit getUnit() {
    return unit;
  }

  public void setUnit(RetentionUnit unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPeriod retentionPeriod = (RetentionPeriod) o;
    return Objects.equals(this.quantityToKeep, retentionPeriod.quantityToKeep)
        && Objects.equals(this.shouldKeepForever, retentionPeriod.shouldKeepForever)
        && Objects.equals(this.unit, retentionPeriod.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityToKeep, shouldKeepForever, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPeriod {\n");
    sb.append("    quantityToKeep: ").append(toIndentedString(quantityToKeep)).append("\n");
    sb.append("    shouldKeepForever: ").append(toIndentedString(shouldKeepForever)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
