// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.OctopusPackageVersionBuildInformationMappedResource;
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
 * PackageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_FILE_EXTENSION = "FileExtension";
  @SerializedName(SERIALIZED_NAME_FILE_EXTENSION) private String fileExtension;

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

  public static final String SERIALIZED_NAME_NU_GET_FEED_ID = "NuGetFeedId";
  @SerializedName(SERIALIZED_NAME_NU_GET_FEED_ID) private String nuGetFeedId;

  public static final String SERIALIZED_NAME_NU_GET_PACKAGE_ID =
      "NuGetPackageId";
  @SerializedName(SERIALIZED_NAME_NU_GET_PACKAGE_ID)
  private String nuGetPackageId;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_PACKAGE_VERSION_BUILD_INFORMATION =
      "PackageVersionBuildInformation";
  @SerializedName(SERIALIZED_NAME_PACKAGE_VERSION_BUILD_INFORMATION)
  private OctopusPackageVersionBuildInformationMappedResource
      packageVersionBuildInformation;

  public static final String SERIALIZED_NAME_PUBLISHED = "Published";
  @SerializedName(SERIALIZED_NAME_PUBLISHED) private OffsetDateTime published;

  public static final String SERIALIZED_NAME_RELEASE_NOTES = "ReleaseNotes";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES) private String releaseNotes;

  public static final String SERIALIZED_NAME_SUMMARY = "Summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY) private String summary;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE) private String title;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public PackageResource description(String description) {

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

  public PackageResource feedId(String feedId) {

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

  public PackageResource fileExtension(String fileExtension) {

    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Get fileExtension
   * @return fileExtension
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public PackageResource id(String id) {

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

  public PackageResource lastModifiedBy(String lastModifiedBy) {

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

  public PackageResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public PackageResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public PackageResource putLinksItem(String key, String linksItem) {
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

  public PackageResource nuGetFeedId(String nuGetFeedId) {

    this.nuGetFeedId = nuGetFeedId;
    return this;
  }

  /**
   * Get nuGetFeedId
   * @return nuGetFeedId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNuGetFeedId() {
    return nuGetFeedId;
  }

  public void setNuGetFeedId(String nuGetFeedId) {
    this.nuGetFeedId = nuGetFeedId;
  }

  public PackageResource nuGetPackageId(String nuGetPackageId) {

    this.nuGetPackageId = nuGetPackageId;
    return this;
  }

  /**
   * Get nuGetPackageId
   * @return nuGetPackageId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNuGetPackageId() {
    return nuGetPackageId;
  }

  public void setNuGetPackageId(String nuGetPackageId) {
    this.nuGetPackageId = nuGetPackageId;
  }

  public PackageResource packageId(String packageId) {

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

  public PackageResource packageVersionBuildInformation(
      OctopusPackageVersionBuildInformationMappedResource
          packageVersionBuildInformation) {

    this.packageVersionBuildInformation = packageVersionBuildInformation;
    return this;
  }

  /**
   * Get packageVersionBuildInformation
   * @return packageVersionBuildInformation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OctopusPackageVersionBuildInformationMappedResource
  getPackageVersionBuildInformation() {
    return packageVersionBuildInformation;
  }

  public void setPackageVersionBuildInformation(
      OctopusPackageVersionBuildInformationMappedResource
          packageVersionBuildInformation) {
    this.packageVersionBuildInformation = packageVersionBuildInformation;
  }

  public PackageResource published(OffsetDateTime published) {

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

  public PackageResource releaseNotes(String releaseNotes) {

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

  public PackageResource summary(String summary) {

    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) { this.summary = summary; }

  public PackageResource title(String title) {

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

  public PackageResource version(String version) {

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
    PackageResource packageResource = (PackageResource)o;
    return Objects.equals(this.description, packageResource.description) &&
        Objects.equals(this.feedId, packageResource.feedId) &&
        Objects.equals(this.fileExtension, packageResource.fileExtension) &&
        Objects.equals(this.id, packageResource.id) &&
        Objects.equals(this.lastModifiedBy, packageResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, packageResource.lastModifiedOn) &&
        Objects.equals(this.links, packageResource.links) &&
        Objects.equals(this.nuGetFeedId, packageResource.nuGetFeedId) &&
        Objects.equals(this.nuGetPackageId, packageResource.nuGetPackageId) &&
        Objects.equals(this.packageId, packageResource.packageId) &&
        Objects.equals(this.packageVersionBuildInformation,
                       packageResource.packageVersionBuildInformation) &&
        Objects.equals(this.published, packageResource.published) &&
        Objects.equals(this.releaseNotes, packageResource.releaseNotes) &&
        Objects.equals(this.summary, packageResource.summary) &&
        Objects.equals(this.title, packageResource.title) &&
        Objects.equals(this.version, packageResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feedId, fileExtension, id, lastModifiedBy,
                        lastModifiedOn, links, nuGetFeedId, nuGetPackageId,
                        packageId, packageVersionBuildInformation, published,
                        releaseNotes, summary, title, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    fileExtension: ")
        .append(toIndentedString(fileExtension))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nuGetFeedId: ")
        .append(toIndentedString(nuGetFeedId))
        .append("\n");
    sb.append("    nuGetPackageId: ")
        .append(toIndentedString(nuGetPackageId))
        .append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    packageVersionBuildInformation: ")
        .append(toIndentedString(packageVersionBuildInformation))
        .append("\n");
    sb.append("    published: ")
        .append(toIndentedString(published))
        .append("\n");
    sb.append("    releaseNotes: ")
        .append(toIndentedString(releaseNotes))
        .append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
