// Octopus REST API v2021.2.4488

package com.octopus.sdk.model.buildinformation;

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.CommitDetails;
import com.octopus.openapi.model.WorkItemLink;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PackageVersionBuildInformationMappedResource
 */
@SuppressWarnings("UnusedVariable")
public class PackageVersionBuildInformationMappedResource extends BaseResource {
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

  @SerializedName("PackageId")
  private String packageId;

  @SerializedName("VcsCommitNumber")
  private String vcsCommitNumber;

  @SerializedName("VcsCommitUrl")
  private String vcsCommitUrl;

  @SerializedName("VcsRoot")
  private String vcsRoot;

  @SerializedName("VcsType")
  private String vcsType;

  @SerializedName("Version")
  private String version;

  @SerializedName("WorkItems")
  private List<WorkItemLink> workItems = null;



  public PackageVersionBuildInformationMappedResource branch(String branch) {
    
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }


  public PackageVersionBuildInformationMappedResource buildEnvironment(String buildEnvironment) {
    
    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public void setBuildEnvironment(String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
  }


  public PackageVersionBuildInformationMappedResource buildNumber(String buildNumber) {
    
    this.buildNumber = buildNumber;
    return this;
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }


  public PackageVersionBuildInformationMappedResource buildUrl(String buildUrl) {
    
    this.buildUrl = buildUrl;
    return this;
  }

  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }


  public PackageVersionBuildInformationMappedResource commits(List<CommitDetails> commits) {
    
    this.commits = commits;
    return this;
  }

  public PackageVersionBuildInformationMappedResource addCommitsItem(CommitDetails commitsItem) {
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


  public PackageVersionBuildInformationMappedResource created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PackageVersionBuildInformationMappedResource incompleteDataWarning(String incompleteDataWarning) {
    
    this.incompleteDataWarning = incompleteDataWarning;
    return this;
  }

  public String getIncompleteDataWarning() {
    return incompleteDataWarning;
  }

  public void setIncompleteDataWarning(String incompleteDataWarning) {
    this.incompleteDataWarning = incompleteDataWarning;
  }


  public PackageVersionBuildInformationMappedResource issueTrackerName(String issueTrackerName) {
    
    this.issueTrackerName = issueTrackerName;
    return this;
  }

  public String getIssueTrackerName() {
    return issueTrackerName;
  }

  public void setIssueTrackerName(String issueTrackerName) {
    this.issueTrackerName = issueTrackerName;
  }


  public PackageVersionBuildInformationMappedResource lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public PackageVersionBuildInformationMappedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public PackageVersionBuildInformationMappedResource packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public PackageVersionBuildInformationMappedResource vcsCommitNumber(String vcsCommitNumber) {
    
    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  public String getVcsCommitNumber() {
    return vcsCommitNumber;
  }

  public void setVcsCommitNumber(String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
  }


  public PackageVersionBuildInformationMappedResource vcsCommitUrl(String vcsCommitUrl) {
    
    this.vcsCommitUrl = vcsCommitUrl;
    return this;
  }

  public String getVcsCommitUrl() {
    return vcsCommitUrl;
  }

  public void setVcsCommitUrl(String vcsCommitUrl) {
    this.vcsCommitUrl = vcsCommitUrl;
  }


  public PackageVersionBuildInformationMappedResource vcsRoot(String vcsRoot) {
    
    this.vcsRoot = vcsRoot;
    return this;
  }

  public String getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(String vcsRoot) {
    this.vcsRoot = vcsRoot;
  }


  public PackageVersionBuildInformationMappedResource vcsType(String vcsType) {
    
    this.vcsType = vcsType;
    return this;
  }

  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }


  public PackageVersionBuildInformationMappedResource version(String version) {
    
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public PackageVersionBuildInformationMappedResource workItems(List<WorkItemLink> workItems) {
    
    this.workItems = workItems;
    return this;
  }

  public PackageVersionBuildInformationMappedResource addWorkItemsItem(WorkItemLink workItemsItem) {
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
    PackageVersionBuildInformationMappedResource packageVersionBuildInformationMappedResource = (PackageVersionBuildInformationMappedResource) o;
    return Objects.equals(this.branch, packageVersionBuildInformationMappedResource.branch) &&
        Objects.equals(this.buildEnvironment, packageVersionBuildInformationMappedResource.buildEnvironment) &&
        Objects.equals(this.buildNumber, packageVersionBuildInformationMappedResource.buildNumber) &&
        Objects.equals(this.buildUrl, packageVersionBuildInformationMappedResource.buildUrl) &&
        Objects.equals(this.commits, packageVersionBuildInformationMappedResource.commits) &&
        Objects.equals(this.created, packageVersionBuildInformationMappedResource.created) &&
        Objects.equals(this.incompleteDataWarning, packageVersionBuildInformationMappedResource.incompleteDataWarning) &&
        Objects.equals(this.issueTrackerName, packageVersionBuildInformationMappedResource.issueTrackerName) &&
        Objects.equals(this.lastModifiedBy, packageVersionBuildInformationMappedResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, packageVersionBuildInformationMappedResource.lastModifiedOn) &&
        Objects.equals(this.packageId, packageVersionBuildInformationMappedResource.packageId) &&
        Objects.equals(this.vcsCommitNumber, packageVersionBuildInformationMappedResource.vcsCommitNumber) &&
        Objects.equals(this.vcsCommitUrl, packageVersionBuildInformationMappedResource.vcsCommitUrl) &&
        Objects.equals(this.vcsRoot, packageVersionBuildInformationMappedResource.vcsRoot) &&
        Objects.equals(this.vcsType, packageVersionBuildInformationMappedResource.vcsType) &&
        Objects.equals(this.version, packageVersionBuildInformationMappedResource.version) &&
        Objects.equals(this.workItems, packageVersionBuildInformationMappedResource.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, buildEnvironment, buildNumber, buildUrl, commits, created, incompleteDataWarning, issueTrackerName, lastModifiedBy, lastModifiedOn, packageId, vcsCommitNumber, vcsCommitUrl, vcsRoot, vcsType, version, workItems);
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
    sb.append("    incompleteDataWarning: ").append(toIndentedString(incompleteDataWarning)).append("\n");
    sb.append("    issueTrackerName: ").append(toIndentedString(issueTrackerName)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    vcsCommitNumber: ").append(toIndentedString(vcsCommitNumber)).append("\n");
    sb.append("    vcsCommitUrl: ").append(toIndentedString(vcsCommitUrl)).append("\n");
    sb.append("    vcsRoot: ").append(toIndentedString(vcsRoot)).append("\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    workItems: ").append(toIndentedString(workItems)).append("\n");
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

