// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.NumericReportSeries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * NumericReportData
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class NumericReportData {
  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS) private List<String> labels = null;

  public static final String SERIALIZED_NAME_SERIES = "Series";
  @SerializedName(SERIALIZED_NAME_SERIES)
  private List<NumericReportSeries> series = null;

  public NumericReportData labels(List<String> labels) {

    this.labels = labels;
    return this;
  }

  public NumericReportData addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) { this.labels = labels; }

  public NumericReportData series(List<NumericReportSeries> series) {

    this.series = series;
    return this;
  }

  public NumericReportData addSeriesItem(NumericReportSeries seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<NumericReportSeries>();
    }
    this.series.add(seriesItem);
    return this;
  }

  /**
   * Get series
   * @return series
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NumericReportSeries> getSeries() {
    return series;
  }

  public void setSeries(List<NumericReportSeries> series) {
    this.series = series;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumericReportData numericReportData = (NumericReportData)o;
    return Objects.equals(this.labels, numericReportData.labels) &&
        Objects.equals(this.series, numericReportData.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericReportData {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
