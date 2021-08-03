// Octopus REST API v2021.2.4488

package com.octopus.sdk.model.buildinformation;

import com.octopus.openapi.model.CommitDetails;
import com.octopus.openapi.model.WorkItemLink;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** PackageVersionBuildInformationMappedResource */
@SuppressWarnings("UnusedVariable")
public class BuildInformationResource extends BaseResource {
  @SerializedName("Branch")
  private String branch;

  @SerializedName("BuildEnvironment")
  private String buildEnvironment;

  @SerializedName("BuildNumber")
  private String buildNumber;

  @SerializedName("BuildUrl")
  private String buildUrl;

  @SerializedName("Commits")
  private List<CommitDetails> commits = null;

  @SerializedName("Created")
  private OffsetDateTime created;

  @SerializedName("IncompleteDataWarning")
  private String incompleteDataWarning;

  @SerializedName("IssueTrackerName")
  private String issueTrackerName;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("VcsCommitNumber")
  private String vcsCommitNumber;

  @SerializedName("VcsCommitUrl")
  private String vcsCommitUrl;

  @SerializedName("VcsRoot")
  private String vcsRoot;

  @SerializedName("VcsType")
  private String vcsType;

  @SerializedName("WorkItems")
  private List<WorkItemLink> workItems = null;

  public BuildInformationResource branch(String branch) {

    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public BuildInformationResource buildEnvironment(String buildEnvironment) {

    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public void setBuildEnvironment(String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
  }

  public BuildInformationResource buildNumber(String buildNumber) {

    this.buildNumber = buildNumber;
    return this;
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public BuildInformationResource buildUrl(String buildUrl) {

    this.buildUrl = buildUrl;
    return this;
  }

  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }

  public BuildInformationResource commits(List<CommitDetails> commits) {

    this.commits = commits;
    return this;
  }

  public BuildInformationResource addCommitsItem(CommitDetails commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<>();
    }
    this.commits.add(commitsItem);
    return this;
  }

  public List<CommitDetails> getCommits() {
    return commits;
  }

  public void setCommits(List<CommitDetails> commits) {
    this.commits = commits;
  }

  public BuildInformationResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public BuildInformationResource incompleteDataWarning(String incompleteDataWarning) {

    this.incompleteDataWarning = incompleteDataWarning;
    return this;
  }

  public String getIncompleteDataWarning() {
    return incompleteDataWarning;
  }

  public void setIncompleteDataWarning(String incompleteDataWarning) {
    this.incompleteDataWarning = incompleteDataWarning;
  }

  public BuildInformationResource issueTrackerName(String issueTrackerName) {

    this.issueTrackerName = issueTrackerName;
    return this;
  }

  public String getIssueTrackerName() {
    return issueTrackerName;
  }

  public void setIssueTrackerName(String issueTrackerName) {
    this.issueTrackerName = issueTrackerName;
  }

  public BuildInformationResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public BuildInformationResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public BuildInformationResource vcsCommitNumber(String vcsCommitNumber) {

    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  public String getVcsCommitNumber() {
    return vcsCommitNumber;
  }

  public void setVcsCommitNumber(String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
  }

  public BuildInformationResource vcsCommitUrl(String vcsCommitUrl) {

    this.vcsCommitUrl = vcsCommitUrl;
    return this;
  }

  public String getVcsCommitUrl() {
    return vcsCommitUrl;
  }

  public void setVcsCommitUrl(String vcsCommitUrl) {
    this.vcsCommitUrl = vcsCommitUrl;
  }

  public BuildInformationResource vcsRoot(String vcsRoot) {

    this.vcsRoot = vcsRoot;
    return this;
  }

  public String getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(String vcsRoot) {
    this.vcsRoot = vcsRoot;
  }

  public BuildInformationResource vcsType(String vcsType) {

    this.vcsType = vcsType;
    return this;
  }

  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }

  public BuildInformationResource workItems(List<WorkItemLink> workItems) {

    this.workItems = workItems;
    return this;
  }

  public BuildInformationResource addWorkItemsItem(WorkItemLink workItemsItem) {
    if (this.workItems == null) {
      this.workItems = new ArrayList<>();
    }
    this.workItems.add(workItemsItem);
    return this;
  }

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
    BuildInformationResource buildInformationResource = (BuildInformationResource) o;
    return Objects.equals(this.branch, buildInformationResource.branch)
        && Objects.equals(this.buildEnvironment, buildInformationResource.buildEnvironment)
        && Objects.equals(this.buildNumber, buildInformationResource.buildNumber)
        && Objects.equals(this.buildUrl, buildInformationResource.buildUrl)
        && Objects.equals(this.commits, buildInformationResource.commits)
        && Objects.equals(this.created, buildInformationResource.created)
        && Objects.equals(
            this.incompleteDataWarning, buildInformationResource.incompleteDataWarning)
        && Objects.equals(this.issueTrackerName, buildInformationResource.issueTrackerName)
        && Objects.equals(this.lastModifiedBy, buildInformationResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, buildInformationResource.lastModifiedOn)
        && Objects.equals(this.vcsCommitNumber, buildInformationResource.vcsCommitNumber)
        && Objects.equals(this.vcsCommitUrl, buildInformationResource.vcsCommitUrl)
        && Objects.equals(this.vcsRoot, buildInformationResource.vcsRoot)
        && Objects.equals(this.vcsType, buildInformationResource.vcsType)
        && Objects.equals(this.workItems, buildInformationResource.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branch,
        buildEnvironment,
        buildNumber,
        buildUrl,
        commits,
        created,
        incompleteDataWarning,
        issueTrackerName,
        lastModifiedBy,
        lastModifiedOn,
        vcsCommitNumber,
        vcsCommitUrl,
        vcsRoot,
        vcsType,
        workItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OctopusPackageVersionBuildInformationMappedResource {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildEnvironment: ").append(toIndentedString(buildEnvironment)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    incompleteDataWarning: ")
        .append(toIndentedString(incompleteDataWarning))
        .append("\n");
    sb.append("    issueTrackerName: ").append(toIndentedString(issueTrackerName)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    vcsCommitNumber: ").append(toIndentedString(vcsCommitNumber)).append("\n");
    sb.append("    vcsCommitUrl: ").append(toIndentedString(vcsCommitUrl)).append("\n");
    sb.append("    vcsRoot: ").append(toIndentedString(vcsRoot)).append("\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
    sb.append("    workItems: ").append(toIndentedString(workItems)).append("\n");
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
