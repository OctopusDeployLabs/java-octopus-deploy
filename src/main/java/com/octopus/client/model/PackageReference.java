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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PackageReference
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageReference {
  public static final String SERIALIZED_NAME_ACQUISITION_LOCATION =
      "AcquisitionLocation";
  @SerializedName(SERIALIZED_NAME_ACQUISITION_LOCATION)
  private String acquisitionLocation;

  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = null;

  public PackageReference acquisitionLocation(String acquisitionLocation) {

    this.acquisitionLocation = acquisitionLocation;
    return this;
  }

  /**
   * Get acquisitionLocation
   * @return acquisitionLocation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAcquisitionLocation() {
    return acquisitionLocation;
  }

  public void setAcquisitionLocation(String acquisitionLocation) {
    this.acquisitionLocation = acquisitionLocation;
  }

  public PackageReference feedId(String feedId) {

    this.feedId = feedId;
    return this;
  }

  /**
   * Get feedId
   * @return feedId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) { this.feedId = feedId; }

  public PackageReference id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public PackageReference name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public PackageReference packageId(String packageId) {

    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * @return packageId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) { this.packageId = packageId; }

  public PackageReference properties(Map<String, String> properties) {

    this.properties = properties;
    return this;
  }

  public PackageReference putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageReference packageReference = (PackageReference)o;
    return Objects.equals(this.acquisitionLocation,
                          packageReference.acquisitionLocation) &&
        Objects.equals(this.feedId, packageReference.feedId) &&
        Objects.equals(this.id, packageReference.id) &&
        Objects.equals(this.name, packageReference.name) &&
        Objects.equals(this.packageId, packageReference.packageId) &&
        Objects.equals(this.properties, packageReference.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquisitionLocation, feedId, id, name, packageId,
                        properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageReference {\n");
    sb.append("    acquisitionLocation: ")
        .append(toIndentedString(acquisitionLocation))
        .append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
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
