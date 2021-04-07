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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * NumericReportSeries
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class NumericReportSeries {
  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA) private List<Double> data = null;

  public static final String SERIALIZED_NAME_LABEL = "Label";
  @SerializedName(SERIALIZED_NAME_LABEL) private String label;

  public NumericReportSeries data(List<Double> data) {

    this.data = data;
    return this;
  }

  public NumericReportSeries addDataItem(Double dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<Double>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getData() {
    return data;
  }

  public void setData(List<Double> data) { this.data = data; }

  public NumericReportSeries label(String label) {

    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) { this.label = label; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumericReportSeries numericReportSeries = (NumericReportSeries)o;
    return Objects.equals(this.data, numericReportSeries.data) &&
        Objects.equals(this.label, numericReportSeries.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericReportSeries {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
