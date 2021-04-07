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
 * ReleaseTemplatePackage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseTemplatePackage {
  public static final String SERIALIZED_NAME_ACTION_NAME = "ActionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME) private String actionName;

  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_FEED_NAME = "FeedName";
  @SerializedName(SERIALIZED_NAME_FEED_NAME) private String feedName;

  public static final String SERIALIZED_NAME_IS_RESOLVABLE = "IsResolvable";
  @SerializedName(SERIALIZED_NAME_IS_RESOLVABLE) private Boolean isResolvable;

  public static final String SERIALIZED_NAME_NU_GET_FEED_ID = "NuGetFeedId";
  @SerializedName(SERIALIZED_NAME_NU_GET_FEED_ID) private String nuGetFeedId;

  public static final String SERIALIZED_NAME_NU_GET_FEED_NAME = "NuGetFeedName";
  @SerializedName(SERIALIZED_NAME_NU_GET_FEED_NAME)
  private String nuGetFeedName;

  public static final String SERIALIZED_NAME_NU_GET_PACKAGE_ID =
      "NuGetPackageId";
  @SerializedName(SERIALIZED_NAME_NU_GET_PACKAGE_ID)
  private String nuGetPackageId;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_PACKAGE_REFERENCE_NAME =
      "PackageReferenceName";
  @SerializedName(SERIALIZED_NAME_PACKAGE_REFERENCE_NAME)
  private String packageReferenceName;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_STEP_NAME = "StepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME) private String stepName;

  public static final String SERIALIZED_NAME_VERSION_SELECTED_LAST_RELEASE =
      "VersionSelectedLastRelease";
  @SerializedName(SERIALIZED_NAME_VERSION_SELECTED_LAST_RELEASE)
  private String versionSelectedLastRelease;

  public ReleaseTemplatePackage actionName(String actionName) {

    this.actionName = actionName;
    return this;
  }

  /**
   * Get actionName
   * @return actionName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) { this.actionName = actionName; }

  public ReleaseTemplatePackage feedId(String feedId) {

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

  public ReleaseTemplatePackage feedName(String feedName) {

    this.feedName = feedName;
    return this;
  }

  /**
   * Get feedName
   * @return feedName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) { this.feedName = feedName; }

  public ReleaseTemplatePackage isResolvable(Boolean isResolvable) {

    this.isResolvable = isResolvable;
    return this;
  }

  /**
   * Get isResolvable
   * @return isResolvable
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsResolvable() {
    return isResolvable;
  }

  public void setIsResolvable(Boolean isResolvable) {
    this.isResolvable = isResolvable;
  }

  public ReleaseTemplatePackage nuGetFeedId(String nuGetFeedId) {

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

  public ReleaseTemplatePackage nuGetFeedName(String nuGetFeedName) {

    this.nuGetFeedName = nuGetFeedName;
    return this;
  }

  /**
   * Get nuGetFeedName
   * @return nuGetFeedName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNuGetFeedName() {
    return nuGetFeedName;
  }

  public void setNuGetFeedName(String nuGetFeedName) {
    this.nuGetFeedName = nuGetFeedName;
  }

  public ReleaseTemplatePackage nuGetPackageId(String nuGetPackageId) {

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

  public ReleaseTemplatePackage packageId(String packageId) {

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

  public ReleaseTemplatePackage
  packageReferenceName(String packageReferenceName) {

    this.packageReferenceName = packageReferenceName;
    return this;
  }

  /**
   * Get packageReferenceName
   * @return packageReferenceName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageReferenceName() {
    return packageReferenceName;
  }

  public void setPackageReferenceName(String packageReferenceName) {
    this.packageReferenceName = packageReferenceName;
  }

  public ReleaseTemplatePackage projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ReleaseTemplatePackage stepName(String stepName) {

    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) { this.stepName = stepName; }

  public ReleaseTemplatePackage
  versionSelectedLastRelease(String versionSelectedLastRelease) {

    this.versionSelectedLastRelease = versionSelectedLastRelease;
    return this;
  }

  /**
   * Get versionSelectedLastRelease
   * @return versionSelectedLastRelease
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionSelectedLastRelease() {
    return versionSelectedLastRelease;
  }

  public void setVersionSelectedLastRelease(String versionSelectedLastRelease) {
    this.versionSelectedLastRelease = versionSelectedLastRelease;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTemplatePackage releaseTemplatePackage = (ReleaseTemplatePackage)o;
    return Objects.equals(this.actionName, releaseTemplatePackage.actionName) &&
        Objects.equals(this.feedId, releaseTemplatePackage.feedId) &&
        Objects.equals(this.feedName, releaseTemplatePackage.feedName) &&
        Objects.equals(this.isResolvable,
                       releaseTemplatePackage.isResolvable) &&
        Objects.equals(this.nuGetFeedId, releaseTemplatePackage.nuGetFeedId) &&
        Objects.equals(this.nuGetFeedName,
                       releaseTemplatePackage.nuGetFeedName) &&
        Objects.equals(this.nuGetPackageId,
                       releaseTemplatePackage.nuGetPackageId) &&
        Objects.equals(this.packageId, releaseTemplatePackage.packageId) &&
        Objects.equals(this.packageReferenceName,
                       releaseTemplatePackage.packageReferenceName) &&
        Objects.equals(this.projectName, releaseTemplatePackage.projectName) &&
        Objects.equals(this.stepName, releaseTemplatePackage.stepName) &&
        Objects.equals(this.versionSelectedLastRelease,
                       releaseTemplatePackage.versionSelectedLastRelease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, feedId, feedName, isResolvable, nuGetFeedId,
                        nuGetFeedName, nuGetPackageId, packageId,
                        packageReferenceName, projectName, stepName,
                        versionSelectedLastRelease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTemplatePackage {\n");
    sb.append("    actionName: ")
        .append(toIndentedString(actionName))
        .append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    isResolvable: ")
        .append(toIndentedString(isResolvable))
        .append("\n");
    sb.append("    nuGetFeedId: ")
        .append(toIndentedString(nuGetFeedId))
        .append("\n");
    sb.append("    nuGetFeedName: ")
        .append(toIndentedString(nuGetFeedName))
        .append("\n");
    sb.append("    nuGetPackageId: ")
        .append(toIndentedString(nuGetPackageId))
        .append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    packageReferenceName: ")
        .append(toIndentedString(packageReferenceName))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    versionSelectedLastRelease: ")
        .append(toIndentedString(versionSelectedLastRelease))
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
