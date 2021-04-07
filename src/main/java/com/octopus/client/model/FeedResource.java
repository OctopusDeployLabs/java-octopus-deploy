// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.FeedType;
import com.octopus.client.model.PackageAcquisitionLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * FeedResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class FeedResource {
  public static final String SERIALIZED_NAME_FEED_TYPE = "FeedType";
  @SerializedName(SERIALIZED_NAME_FEED_TYPE) private FeedType feedType;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String
      SERIALIZED_NAME_PACKAGE_ACQUISITION_LOCATION_OPTIONS =
          "PackageAcquisitionLocationOptions";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ACQUISITION_LOCATION_OPTIONS)
  private List<PackageAcquisitionLocation> packageAcquisitionLocationOptions =
      null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public FeedResource feedType(FeedType feedType) {

    this.feedType = feedType;
    return this;
  }

  /**
   * Get feedType
   * @return feedType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeedType getFeedType() {
    return feedType;
  }

  public void setFeedType(FeedType feedType) { this.feedType = feedType; }

  public FeedResource id(String id) {

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

  public FeedResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public FeedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public FeedResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public FeedResource putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  public FeedResource name(String name) {

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

  public FeedResource packageAcquisitionLocationOptions(
      List<PackageAcquisitionLocation> packageAcquisitionLocationOptions) {

    this.packageAcquisitionLocationOptions = packageAcquisitionLocationOptions;
    return this;
  }

  public FeedResource addPackageAcquisitionLocationOptionsItem(
      PackageAcquisitionLocation packageAcquisitionLocationOptionsItem) {
    if (this.packageAcquisitionLocationOptions == null) {
      this.packageAcquisitionLocationOptions =
          new ArrayList<PackageAcquisitionLocation>();
    }
    this.packageAcquisitionLocationOptions.add(
        packageAcquisitionLocationOptionsItem);
    return this;
  }

  /**
   * Get packageAcquisitionLocationOptions
   * @return packageAcquisitionLocationOptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PackageAcquisitionLocation>
  getPackageAcquisitionLocationOptions() {
    return packageAcquisitionLocationOptions;
  }

  public void setPackageAcquisitionLocationOptions(
      List<PackageAcquisitionLocation> packageAcquisitionLocationOptions) {
    this.packageAcquisitionLocationOptions = packageAcquisitionLocationOptions;
  }

  public FeedResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedResource feedResource = (FeedResource)o;
    return Objects.equals(this.feedType, feedResource.feedType) &&
        Objects.equals(this.id, feedResource.id) &&
        Objects.equals(this.lastModifiedBy, feedResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, feedResource.lastModifiedOn) &&
        Objects.equals(this.links, feedResource.links) &&
        Objects.equals(this.name, feedResource.name) &&
        Objects.equals(this.packageAcquisitionLocationOptions,
                       feedResource.packageAcquisitionLocationOptions) &&
        Objects.equals(this.spaceId, feedResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedType, id, lastModifiedBy, lastModifiedOn, links,
                        name, packageAcquisitionLocationOptions, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedResource {\n");
    sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageAcquisitionLocationOptions: ")
        .append(toIndentedString(packageAcquisitionLocationOptions))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
