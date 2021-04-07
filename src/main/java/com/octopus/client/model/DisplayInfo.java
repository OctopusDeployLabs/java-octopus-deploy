// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ConnectivityCheck;
import com.octopus.client.model.ListApiMetadata;
import com.octopus.client.model.OptionsMetadata;
import com.octopus.client.model.PropertyApplicability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * DisplayInfo
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DisplayInfo {
  public static final String SERIALIZED_NAME_CONNECTIVITY_CHECK =
      "ConnectivityCheck";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_CHECK)
  private ConnectivityCheck connectivityCheck;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_LABEL = "Label";
  @SerializedName(SERIALIZED_NAME_LABEL) private String label;

  public static final String SERIALIZED_NAME_LIST_API = "ListApi";
  @SerializedName(SERIALIZED_NAME_LIST_API) private ListApiMetadata listApi;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS) private OptionsMetadata options;

  public static final String SERIALIZED_NAME_PROPERTY_APPLICABILITY =
      "PropertyApplicability";
  @SerializedName(SERIALIZED_NAME_PROPERTY_APPLICABILITY)
  private PropertyApplicability propertyApplicability;

  public static final String SERIALIZED_NAME_READ_ONLY = "ReadOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY) private Boolean readOnly;

  public static final String SERIALIZED_NAME_REQUIRED = "Required";
  @SerializedName(SERIALIZED_NAME_REQUIRED) private Boolean required;

  public static final String SERIALIZED_NAME_SHOW_COPY_TO_CLIPBOARD =
      "ShowCopyToClipboard";
  @SerializedName(SERIALIZED_NAME_SHOW_COPY_TO_CLIPBOARD)
  private Boolean showCopyToClipboard;

  public DisplayInfo connectivityCheck(ConnectivityCheck connectivityCheck) {

    this.connectivityCheck = connectivityCheck;
    return this;
  }

  /**
   * Get connectivityCheck
   * @return connectivityCheck
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectivityCheck getConnectivityCheck() {
    return connectivityCheck;
  }

  public void setConnectivityCheck(ConnectivityCheck connectivityCheck) {
    this.connectivityCheck = connectivityCheck;
  }

  public DisplayInfo description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DisplayInfo label(String label) {

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

  public DisplayInfo listApi(ListApiMetadata listApi) {

    this.listApi = listApi;
    return this;
  }

  /**
   * Get listApi
   * @return listApi
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListApiMetadata getListApi() {
    return listApi;
  }

  public void setListApi(ListApiMetadata listApi) { this.listApi = listApi; }

  public DisplayInfo options(OptionsMetadata options) {

    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OptionsMetadata getOptions() {
    return options;
  }

  public void setOptions(OptionsMetadata options) { this.options = options; }

  public DisplayInfo
  propertyApplicability(PropertyApplicability propertyApplicability) {

    this.propertyApplicability = propertyApplicability;
    return this;
  }

  /**
   * Get propertyApplicability
   * @return propertyApplicability
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PropertyApplicability getPropertyApplicability() {
    return propertyApplicability;
  }

  public void
  setPropertyApplicability(PropertyApplicability propertyApplicability) {
    this.propertyApplicability = propertyApplicability;
  }

  public DisplayInfo readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) { this.readOnly = readOnly; }

  public DisplayInfo required(Boolean required) {

    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) { this.required = required; }

  public DisplayInfo showCopyToClipboard(Boolean showCopyToClipboard) {

    this.showCopyToClipboard = showCopyToClipboard;
    return this;
  }

  /**
   * Get showCopyToClipboard
   * @return showCopyToClipboard
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowCopyToClipboard() {
    return showCopyToClipboard;
  }

  public void setShowCopyToClipboard(Boolean showCopyToClipboard) {
    this.showCopyToClipboard = showCopyToClipboard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayInfo displayInfo = (DisplayInfo)o;
    return Objects.equals(this.connectivityCheck,
                          displayInfo.connectivityCheck) &&
        Objects.equals(this.description, displayInfo.description) &&
        Objects.equals(this.label, displayInfo.label) &&
        Objects.equals(this.listApi, displayInfo.listApi) &&
        Objects.equals(this.options, displayInfo.options) &&
        Objects.equals(this.propertyApplicability,
                       displayInfo.propertyApplicability) &&
        Objects.equals(this.readOnly, displayInfo.readOnly) &&
        Objects.equals(this.required, displayInfo.required) &&
        Objects.equals(this.showCopyToClipboard,
                       displayInfo.showCopyToClipboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityCheck, description, label, listApi, options,
                        propertyApplicability, readOnly, required,
                        showCopyToClipboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayInfo {\n");
    sb.append("    connectivityCheck: ")
        .append(toIndentedString(connectivityCheck))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    listApi: ").append(toIndentedString(listApi)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    propertyApplicability: ")
        .append(toIndentedString(propertyApplicability))
        .append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    showCopyToClipboard: ")
        .append(toIndentedString(showCopyToClipboard))
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
