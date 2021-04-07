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
import org.threeten.bp.OffsetDateTime;

/**
 * PackageVersionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageVersionResource {
  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_PUBLISHED = "Published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED) private OffsetDateTime published;

  public static final String SERIALIZED_NAME_RELEASE_NOTES = "ReleaseNotes";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES) private String releaseNotes;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "SizeBytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES) private Long sizeBytes;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE) private String title;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public PackageVersionResource feedId(String feedId) {

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

  public PackageVersionResource id(String id) {

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

  public PackageVersionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public PackageVersionResource putLinksItem(String key, String linksItem) {
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

  public PackageVersionResource packageId(String packageId) {

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

  public PackageVersionResource published(OffsetDateTime published) {

    this.published = published;
    return this;
  }

  /**
   * Get published
   * @return published
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPublished() {
    return published;
  }

  public void setPublished(OffsetDateTime published) {
    this.published = published;
  }

  public PackageVersionResource releaseNotes(String releaseNotes) {

    this.releaseNotes = releaseNotes;
    return this;
  }

  /**
   * Get releaseNotes
   * @return releaseNotes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseNotes() {
    return releaseNotes;
  }

  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  public PackageVersionResource sizeBytes(Long sizeBytes) {

    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Get sizeBytes
   * @return sizeBytes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) { this.sizeBytes = sizeBytes; }

  public PackageVersionResource title(String title) {

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

  public PackageVersionResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageVersionResource packageVersionResource = (PackageVersionResource)o;
    return Objects.equals(this.feedId, packageVersionResource.feedId) &&
        Objects.equals(this.id, packageVersionResource.id) &&
        Objects.equals(this.links, packageVersionResource.links) &&
        Objects.equals(this.packageId, packageVersionResource.packageId) &&
        Objects.equals(this.published, packageVersionResource.published) &&
        Objects.equals(this.releaseNotes,
                       packageVersionResource.releaseNotes) &&
        Objects.equals(this.sizeBytes, packageVersionResource.sizeBytes) &&
        Objects.equals(this.title, packageVersionResource.title) &&
        Objects.equals(this.version, packageVersionResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, id, links, packageId, published, releaseNotes,
                        sizeBytes, title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageVersionResource {\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    published: ")
        .append(toIndentedString(published))
        .append("\n");
    sb.append("    releaseNotes: ")
        .append(toIndentedString(releaseNotes))
        .append("\n");
    sb.append("    sizeBytes: ")
        .append(toIndentedString(sizeBytes))
        .append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
