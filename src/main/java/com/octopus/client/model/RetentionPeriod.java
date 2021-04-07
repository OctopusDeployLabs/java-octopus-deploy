// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.RetentionUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * RetentionPeriod
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RetentionPeriod {
  public static final String SERIALIZED_NAME_QUANTITY_TO_KEEP =
      "QuantityToKeep";
  @SerializedName(SERIALIZED_NAME_QUANTITY_TO_KEEP)
  private Integer quantityToKeep;

  public static final String SERIALIZED_NAME_SHOULD_KEEP_FOREVER =
      "ShouldKeepForever";
  @SerializedName(SERIALIZED_NAME_SHOULD_KEEP_FOREVER)
  private Boolean shouldKeepForever;

  public static final String SERIALIZED_NAME_UNIT = "Unit";
  @SerializedName(SERIALIZED_NAME_UNIT) private RetentionUnit unit;

  public RetentionPeriod quantityToKeep(Integer quantityToKeep) {

    this.quantityToKeep = quantityToKeep;
    return this;
  }

  /**
   * Get quantityToKeep
   * @return quantityToKeep
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantityToKeep() {
    return quantityToKeep;
  }

  public void setQuantityToKeep(Integer quantityToKeep) {
    this.quantityToKeep = quantityToKeep;
  }

  /**
   * Get shouldKeepForever
   * @return shouldKeepForever
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShouldKeepForever() {
    return shouldKeepForever;
  }

  public RetentionPeriod unit(RetentionUnit unit) {

    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionUnit getUnit() {
    return unit;
  }

  public void setUnit(RetentionUnit unit) { this.unit = unit; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionPeriod retentionPeriod = (RetentionPeriod)o;
    return Objects.equals(this.quantityToKeep,
                          retentionPeriod.quantityToKeep) &&
        Objects.equals(this.shouldKeepForever,
                       retentionPeriod.shouldKeepForever) &&
        Objects.equals(this.unit, retentionPeriod.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityToKeep, shouldKeepForever, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionPeriod {\n");
    sb.append("    quantityToKeep: ")
        .append(toIndentedString(quantityToKeep))
        .append("\n");
    sb.append("    shouldKeepForever: ")
        .append(toIndentedString(shouldKeepForever))
        .append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
