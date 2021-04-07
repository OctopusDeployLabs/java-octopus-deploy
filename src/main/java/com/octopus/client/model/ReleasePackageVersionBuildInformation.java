// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.CommitDetails;
import com.octopus.client.model.WorkItemLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ReleasePackageVersionBuildInformation
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleasePackageVersionBuildInformation {
  public static final String SERIALIZED_NAME_BRANCH = "Branch";
  @SerializedName(SERIALIZED_NAME_BRANCH) private String branch;

  public static final String SERIALIZED_NAME_BUILD_ENVIRONMENT =
      "BuildEnvironment";
  @SerializedName(SERIALIZED_NAME_BUILD_ENVIRONMENT)
  private String buildEnvironment;

  public static final String SERIALIZED_NAME_BUILD_NUMBER = "BuildNumber";
  @SerializedName(SERIALIZED_NAME_BUILD_NUMBER) private String buildNumber;

  public static final String SERIALIZED_NAME_BUILD_URL = "BuildUrl";
  @SerializedName(SERIALIZED_NAME_BUILD_URL) private String buildUrl;

  public static final String SERIALIZED_NAME_COMMITS = "Commits";
  @SerializedName(SERIALIZED_NAME_COMMITS)
  private List<CommitDetails> commits = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_VCS_COMMIT_NUMBER =
      "VcsCommitNumber";
  @SerializedName(SERIALIZED_NAME_VCS_COMMIT_NUMBER)
  private String vcsCommitNumber;

  public static final String SERIALIZED_NAME_VCS_COMMIT_URL = "VcsCommitUrl";
  @SerializedName(SERIALIZED_NAME_VCS_COMMIT_URL) private String vcsCommitUrl;

  public static final String SERIALIZED_NAME_VCS_ROOT = "VcsRoot";
  @SerializedName(SERIALIZED_NAME_VCS_ROOT) private String vcsRoot;

  public static final String SERIALIZED_NAME_VCS_TYPE = "VcsType";
  @SerializedName(SERIALIZED_NAME_VCS_TYPE) private String vcsType;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public static final String SERIALIZED_NAME_WORK_ITEMS = "WorkItems";
  @SerializedName(SERIALIZED_NAME_WORK_ITEMS)
  private List<WorkItemLink> workItems = null;

  public ReleasePackageVersionBuildInformation branch(String branch) {

    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) { this.branch = branch; }

  public ReleasePackageVersionBuildInformation
  buildEnvironment(String buildEnvironment) {

    this.buildEnvironment = buildEnvironment;
    return this;
  }

  /**
   * Get buildEnvironment
   * @return buildEnvironment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public void setBuildEnvironment(String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
  }

  public ReleasePackageVersionBuildInformation buildNumber(String buildNumber) {

    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * Get buildNumber
   * @return buildNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public ReleasePackageVersionBuildInformation buildUrl(String buildUrl) {

    this.buildUrl = buildUrl;
    return this;
  }

  /**
   * Get buildUrl
   * @return buildUrl
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) { this.buildUrl = buildUrl; }

  public ReleasePackageVersionBuildInformation
  commits(List<CommitDetails> commits) {

    this.commits = commits;
    return this;
  }

  public ReleasePackageVersionBuildInformation
  addCommitsItem(CommitDetails commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<CommitDetails>();
    }
    this.commits.add(commitsItem);
    return this;
  }

  /**
   * Get commits
   * @return commits
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommitDetails> getCommits() {
    return commits;
  }

  public void setCommits(List<CommitDetails> commits) {
    this.commits = commits;
  }

  public ReleasePackageVersionBuildInformation packageId(String packageId) {

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

  public ReleasePackageVersionBuildInformation
  vcsCommitNumber(String vcsCommitNumber) {

    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  /**
   * Get vcsCommitNumber
   * @return vcsCommitNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVcsCommitNumber() {
    return vcsCommitNumber;
  }

  public void setVcsCommitNumber(String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
  }

  public ReleasePackageVersionBuildInformation
  vcsCommitUrl(String vcsCommitUrl) {

    this.vcsCommitUrl = vcsCommitUrl;
    return this;
  }

  /**
   * Get vcsCommitUrl
   * @return vcsCommitUrl
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVcsCommitUrl() {
    return vcsCommitUrl;
  }

  public void setVcsCommitUrl(String vcsCommitUrl) {
    this.vcsCommitUrl = vcsCommitUrl;
  }

  public ReleasePackageVersionBuildInformation vcsRoot(String vcsRoot) {

    this.vcsRoot = vcsRoot;
    return this;
  }

  /**
   * Get vcsRoot
   * @return vcsRoot
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(String vcsRoot) { this.vcsRoot = vcsRoot; }

  public ReleasePackageVersionBuildInformation vcsType(String vcsType) {

    this.vcsType = vcsType;
    return this;
  }

  /**
   * Get vcsType
   * @return vcsType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) { this.vcsType = vcsType; }

  public ReleasePackageVersionBuildInformation version(String version) {

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

  public ReleasePackageVersionBuildInformation
  workItems(List<WorkItemLink> workItems) {

    this.workItems = workItems;
    return this;
  }

  public ReleasePackageVersionBuildInformation
  addWorkItemsItem(WorkItemLink workItemsItem) {
    if (this.workItems == null) {
      this.workItems = new ArrayList<WorkItemLink>();
    }
    this.workItems.add(workItemsItem);
    return this;
  }

  /**
   * Get workItems
   * @return workItems
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkItemLink> getWorkItems() {
    return workItems;
  }

  public void setWorkItems(List<WorkItemLink> workItems) {
    this.workItems = workItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleasePackageVersionBuildInformation
        releasePackageVersionBuildInformation =
            (ReleasePackageVersionBuildInformation)o;
    return Objects.equals(this.branch,
                          releasePackageVersionBuildInformation.branch) &&
        Objects.equals(
            this.buildEnvironment,
            releasePackageVersionBuildInformation.buildEnvironment) &&
        Objects.equals(this.buildNumber,
                       releasePackageVersionBuildInformation.buildNumber) &&
        Objects.equals(this.buildUrl,
                       releasePackageVersionBuildInformation.buildUrl) &&
        Objects.equals(this.commits,
                       releasePackageVersionBuildInformation.commits) &&
        Objects.equals(this.packageId,
                       releasePackageVersionBuildInformation.packageId) &&
        Objects.equals(this.vcsCommitNumber,
                       releasePackageVersionBuildInformation.vcsCommitNumber) &&
        Objects.equals(this.vcsCommitUrl,
                       releasePackageVersionBuildInformation.vcsCommitUrl) &&
        Objects.equals(this.vcsRoot,
                       releasePackageVersionBuildInformation.vcsRoot) &&
        Objects.equals(this.vcsType,
                       releasePackageVersionBuildInformation.vcsType) &&
        Objects.equals(this.version,
                       releasePackageVersionBuildInformation.version) &&
        Objects.equals(this.workItems,
                       releasePackageVersionBuildInformation.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, buildEnvironment, buildNumber, buildUrl,
                        commits, packageId, vcsCommitNumber, vcsCommitUrl,
                        vcsRoot, vcsType, version, workItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleasePackageVersionBuildInformation {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildEnvironment: ")
        .append(toIndentedString(buildEnvironment))
        .append("\n");
    sb.append("    buildNumber: ")
        .append(toIndentedString(buildNumber))
        .append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    vcsCommitNumber: ")
        .append(toIndentedString(vcsCommitNumber))
        .append("\n");
    sb.append("    vcsCommitUrl: ")
        .append(toIndentedString(vcsCommitUrl))
        .append("\n");
    sb.append("    vcsRoot: ").append(toIndentedString(vcsRoot)).append("\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workItems: ")
        .append(toIndentedString(workItems))
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
