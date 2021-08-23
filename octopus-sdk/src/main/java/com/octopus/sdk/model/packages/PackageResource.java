// Octopus REST API v2021.2.4488

package com.octopus.sdk.model.packages;

import com.octopus.openapi.model.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** PackageResource */
@SuppressWarnings("UnusedVariable")
public class PackageResource extends BaseResource {
  @SerializedName("Description")
  private String description;

  @SerializedName("FeedId")
  private String feedId;

  @SerializedName("FileExtension")
  private String fileExtension;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("NuGetFeedId")
  private String nuGetFeedId;

  @SerializedName("NuGetPackageId")
  private String nuGetPackageId;

  @SerializedName("PackageId")
  private String packageId;

  @SerializedName("PackageVersionBuildInformation")
  private OctopusPackageVersionBuildInformationMappedResource packageVersionBuildInformation;

  @SerializedName("Published")
  private OffsetDateTime published;

  @SerializedName("ReleaseNotes")
  private String releaseNotes;

  @SerializedName("Summary")
  private String summary;

  @SerializedName("Title")
  private String title;

  @SerializedName("Version")
  private String version;

  public PackageResource description(String description) {

    this.description = description;
    return this;
  }

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

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public PackageResource fileExtension(String fileExtension) {

    this.fileExtension = fileExtension;
    return this;
  }

  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public PackageResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

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

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public PackageResource nuGetFeedId(String nuGetFeedId) {

    this.nuGetFeedId = nuGetFeedId;
    return this;
  }

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

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public PackageResource packageVersionBuildInformation(
      OctopusPackageVersionBuildInformationMappedResource packageVersionBuildInformation) {

    this.packageVersionBuildInformation = packageVersionBuildInformation;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource getPackageVersionBuildInformation() {
    return packageVersionBuildInformation;
  }

  public void setPackageVersionBuildInformation(
      OctopusPackageVersionBuildInformationMappedResource packageVersionBuildInformation) {
    this.packageVersionBuildInformation = packageVersionBuildInformation;
  }

  public PackageResource published(OffsetDateTime published) {

    this.published = published;
    return this;
  }

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

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public PackageResource title(String title) {

    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PackageResource version(String version) {

    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageResource packageResource = (PackageResource) o;
    return Objects.equals(this.description, packageResource.description)
        && Objects.equals(this.feedId, packageResource.feedId)
        && Objects.equals(this.fileExtension, packageResource.fileExtension)
        && Objects.equals(this.lastModifiedBy, packageResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, packageResource.lastModifiedOn)
        && Objects.equals(this.nuGetFeedId, packageResource.nuGetFeedId)
        && Objects.equals(this.nuGetPackageId, packageResource.nuGetPackageId)
        && Objects.equals(this.packageId, packageResource.packageId)
        && Objects.equals(
            this.packageVersionBuildInformation, packageResource.packageVersionBuildInformation)
        && Objects.equals(this.published, packageResource.published)
        && Objects.equals(this.releaseNotes, packageResource.releaseNotes)
        && Objects.equals(this.summary, packageResource.summary)
        && Objects.equals(this.title, packageResource.title)
        && Objects.equals(this.version, packageResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        feedId,
        fileExtension,
        lastModifiedBy,
        lastModifiedOn,
        nuGetFeedId,
        nuGetPackageId,
        packageId,
        packageVersionBuildInformation,
        published,
        releaseNotes,
        summary,
        title,
        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageResource {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    nuGetFeedId: ").append(toIndentedString(nuGetFeedId)).append("\n");
    sb.append("    nuGetPackageId: ").append(toIndentedString(nuGetPackageId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageVersionBuildInformation: ")
        .append(toIndentedString(packageVersionBuildInformation))
        .append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    releaseNotes: ").append(toIndentedString(releaseNotes)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
