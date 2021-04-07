// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.CommitDetails;
import com.octopus.client.model.ReleasePackageVersionBuildInformation;
import com.octopus.client.model.WorkItemLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ReleaseChanges
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseChanges {
  public static final String SERIALIZED_NAME_BUILD_INFORMATION =
      "BuildInformation";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION)
  private List<ReleasePackageVersionBuildInformation> buildInformation = null;

  public static final String SERIALIZED_NAME_COMMITS = "Commits";
  @SerializedName(SERIALIZED_NAME_COMMITS)
  private List<CommitDetails> commits = null;

  public static final String SERIALIZED_NAME_RELEASE_NOTES = "ReleaseNotes";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES) private String releaseNotes;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public static final String SERIALIZED_NAME_WORK_ITEMS = "WorkItems";
  @SerializedName(SERIALIZED_NAME_WORK_ITEMS)
  private List<WorkItemLink> workItems = null;

  public ReleaseChanges buildInformation(
      List<ReleasePackageVersionBuildInformation> buildInformation) {

    this.buildInformation = buildInformation;
    return this;
  }

  public ReleaseChanges addBuildInformationItem(
      ReleasePackageVersionBuildInformation buildInformationItem) {
    if (this.buildInformation == null) {
      this.buildInformation =
          new ArrayList<ReleasePackageVersionBuildInformation>();
    }
    this.buildInformation.add(buildInformationItem);
    return this;
  }

  /**
   * Get buildInformation
   * @return buildInformation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleasePackageVersionBuildInformation> getBuildInformation() {
    return buildInformation;
  }

  public void setBuildInformation(
      List<ReleasePackageVersionBuildInformation> buildInformation) {
    this.buildInformation = buildInformation;
  }

  public ReleaseChanges commits(List<CommitDetails> commits) {

    this.commits = commits;
    return this;
  }

  public ReleaseChanges addCommitsItem(CommitDetails commitsItem) {
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

  public ReleaseChanges releaseNotes(String releaseNotes) {

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

  public ReleaseChanges version(String version) {

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

  public ReleaseChanges workItems(List<WorkItemLink> workItems) {

    this.workItems = workItems;
    return this;
  }

  public ReleaseChanges addWorkItemsItem(WorkItemLink workItemsItem) {
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
    ReleaseChanges releaseChanges = (ReleaseChanges)o;
    return Objects.equals(this.buildInformation,
                          releaseChanges.buildInformation) &&
        Objects.equals(this.commits, releaseChanges.commits) &&
        Objects.equals(this.releaseNotes, releaseChanges.releaseNotes) &&
        Objects.equals(this.version, releaseChanges.version) &&
        Objects.equals(this.workItems, releaseChanges.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildInformation, commits, releaseNotes, version,
                        workItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseChanges {\n");
    sb.append("    buildInformation: ")
        .append(toIndentedString(buildInformation))
        .append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    releaseNotes: ")
        .append(toIndentedString(releaseNotes))
        .append("\n");
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
