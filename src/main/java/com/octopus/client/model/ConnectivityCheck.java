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
 * ConnectivityCheck
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ConnectivityCheck {
  public static final String SERIALIZED_NAME_DEPENDS_ON_PROPERTY_NAMES =
      "DependsOnPropertyNames";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON_PROPERTY_NAMES)
  private List<String> dependsOnPropertyNames = null;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE) private String title;

  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL) private String url;

  public ConnectivityCheck
  dependsOnPropertyNames(List<String> dependsOnPropertyNames) {

    this.dependsOnPropertyNames = dependsOnPropertyNames;
    return this;
  }

  public ConnectivityCheck
  addDependsOnPropertyNamesItem(String dependsOnPropertyNamesItem) {
    if (this.dependsOnPropertyNames == null) {
      this.dependsOnPropertyNames = new ArrayList<String>();
    }
    this.dependsOnPropertyNames.add(dependsOnPropertyNamesItem);
    return this;
  }

  /**
   * Get dependsOnPropertyNames
   * @return dependsOnPropertyNames
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDependsOnPropertyNames() {
    return dependsOnPropertyNames;
  }

  public void setDependsOnPropertyNames(List<String> dependsOnPropertyNames) {
    this.dependsOnPropertyNames = dependsOnPropertyNames;
  }

  public ConnectivityCheck title(String title) {

    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) { this.title = title; }

  public ConnectivityCheck url(String url) {

    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) { this.url = url; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectivityCheck connectivityCheck = (ConnectivityCheck)o;
    return Objects.equals(this.dependsOnPropertyNames,
                          connectivityCheck.dependsOnPropertyNames) &&
        Objects.equals(this.title, connectivityCheck.title) &&
        Objects.equals(this.url, connectivityCheck.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependsOnPropertyNames, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectivityCheck {\n");
    sb.append("    dependsOnPropertyNames: ")
        .append(toIndentedString(dependsOnPropertyNames))
        .append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
