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
 * ListApiMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ListApiMetadata {
  public static final String SERIALIZED_NAME_API_ENDPOINT = "ApiEndpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT) private String apiEndpoint;

  public static final String SERIALIZED_NAME_SELECT_MODE = "SelectMode";
  @SerializedName(SERIALIZED_NAME_SELECT_MODE) private String selectMode;

  public ListApiMetadata apiEndpoint(String apiEndpoint) {

    this.apiEndpoint = apiEndpoint;
    return this;
  }

  /**
   * Get apiEndpoint
   * @return apiEndpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiEndpoint() {
    return apiEndpoint;
  }

  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }

  public ListApiMetadata selectMode(String selectMode) {

    this.selectMode = selectMode;
    return this;
  }

  /**
   * Get selectMode
   * @return selectMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSelectMode() {
    return selectMode;
  }

  public void setSelectMode(String selectMode) { this.selectMode = selectMode; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListApiMetadata listApiMetadata = (ListApiMetadata)o;
    return Objects.equals(this.apiEndpoint, listApiMetadata.apiEndpoint) &&
        Objects.equals(this.selectMode, listApiMetadata.selectMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiEndpoint, selectMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListApiMetadata {\n");
    sb.append("    apiEndpoint: ")
        .append(toIndentedString(apiEndpoint))
        .append("\n");
    sb.append("    selectMode: ")
        .append(toIndentedString(selectMode))
        .append("\n");
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
