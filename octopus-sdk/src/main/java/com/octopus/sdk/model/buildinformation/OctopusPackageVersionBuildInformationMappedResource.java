// Octopus REST API v2021.2.4488

package com.octopus.sdk.model.buildinformation;

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.CommitDetails;
import com.octopus.openapi.model.WorkItemLink;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * OctopusPackageVersionBuildInformationMappedResource
 */
@SuppressWarnings("UnusedVariable")
public class OctopusPackageVersionBuildInformationMappedResource extends BaseResource {
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

  @SerializedName("Links")
  private Map<String, String> links = null;

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

  public OctopusPackageVersionBuildInformationMappedResource branch(String branch) {
    
    this.branch = branch;
    return this;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }


  public OctopusPackageVersionBuildInformationMappedResource buildEnvironment(String buildEnvironment) {
    
    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public void setBuildEnvironment(String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
  }


  public OctopusPackageVersionBuildInformationMappedResource buildNumber(String buildNumber) {
    
    this.buildNumber = buildNumber;
    return this;
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }


  public OctopusPackageVersionBuildInformationMappedResource buildUrl(String buildUrl) {
    
    this.buildUrl = buildUrl;
    return this;
  }

  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }


  public OctopusPackageVersionBuildInformationMappedResource commits(List<CommitDetails> commits) {
    
    this.commits = commits;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource addCommitsItem(CommitDetails commitsItem) {
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


  public OctopusPackageVersionBuildInformationMappedResource created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public OctopusPackageVersionBuildInformationMappedResource incompleteDataWarning(String incompleteDataWarning) {
    
    this.incompleteDataWarning = incompleteDataWarning;
    return this;
  }

  public String getIncompleteDataWarning() {
    return incompleteDataWarning;
  }

  public void setIncompleteDataWarning(String incompleteDataWarning) {
    this.incompleteDataWarning = incompleteDataWarning;
  }


  public OctopusPackageVersionBuildInformationMappedResource issueTrackerName(String issueTrackerName) {
    
    this.issueTrackerName = issueTrackerName;
    return this;
  }

  public String getIssueTrackerName() {
    return issueTrackerName;
  }

  public void setIssueTrackerName(String issueTrackerName) {
    this.issueTrackerName = issueTrackerName;
  }


  public OctopusPackageVersionBuildInformationMappedResource lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public OctopusPackageVersionBuildInformationMappedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {
    
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }


  public OctopusPackageVersionBuildInformationMappedResource links(Map<String, String> links) {
    
    this.links = links;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource putLinksItem(final String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  public OctopusPackageVersionBuildInformationMappedResource packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public OctopusPackageVersionBuildInformationMappedResource vcsCommitNumber(String vcsCommitNumber) {
    
    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  public String getVcsCommitNumber() {
    return vcsCommitNumber;
  }

  public void setVcsCommitNumber(String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
  }


  public OctopusPackageVersionBuildInformationMappedResource vcsCommitUrl(String vcsCommitUrl) {
    
    this.vcsCommitUrl = vcsCommitUrl;
    return this;
  }

  public String getVcsCommitUrl() {
    return vcsCommitUrl;
  }

  public void setVcsCommitUrl(String vcsCommitUrl) {
    this.vcsCommitUrl = vcsCommitUrl;
  }


  public OctopusPackageVersionBuildInformationMappedResource vcsRoot(String vcsRoot) {
    
    this.vcsRoot = vcsRoot;
    return this;
  }

  public String getVcsRoot() {
    return vcsRoot;
  }

  public void setVcsRoot(String vcsRoot) {
    this.vcsRoot = vcsRoot;
  }


  public OctopusPackageVersionBuildInformationMappedResource vcsType(String vcsType) {
    
    this.vcsType = vcsType;
    return this;
  }

  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }


  public OctopusPackageVersionBuildInformationMappedResource version(String version) {
    
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public OctopusPackageVersionBuildInformationMappedResource workItems(List<WorkItemLink> workItems) {
    
    this.workItems = workItems;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource addWorkItemsItem(WorkItemLink workItemsItem) {
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
    OctopusPackageVersionBuildInformationMappedResource octopusPackageVersionBuildInformationMappedResource = (OctopusPackageVersionBuildInformationMappedResource) o;
    return Objects.equals(this.branch, octopusPackageVersionBuildInformationMappedResource.branch) &&
        Objects.equals(this.buildEnvironment, octopusPackageVersionBuildInformationMappedResource.buildEnvironment) &&
        Objects.equals(this.buildNumber, octopusPackageVersionBuildInformationMappedResource.buildNumber) &&
        Objects.equals(this.buildUrl, octopusPackageVersionBuildInformationMappedResource.buildUrl) &&
        Objects.equals(this.commits, octopusPackageVersionBuildInformationMappedResource.commits) &&
        Objects.equals(this.created, octopusPackageVersionBuildInformationMappedResource.created) &&
        Objects.equals(this.incompleteDataWarning, octopusPackageVersionBuildInformationMappedResource.incompleteDataWarning) &&
        Objects.equals(this.issueTrackerName, octopusPackageVersionBuildInformationMappedResource.issueTrackerName) &&
        Objects.equals(this.lastModifiedBy, octopusPackageVersionBuildInformationMappedResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, octopusPackageVersionBuildInformationMappedResource.lastModifiedOn) &&
        Objects.equals(this.links, octopusPackageVersionBuildInformationMappedResource.links) &&
        Objects.equals(this.packageId, octopusPackageVersionBuildInformationMappedResource.packageId) &&
        Objects.equals(this.vcsCommitNumber, octopusPackageVersionBuildInformationMappedResource.vcsCommitNumber) &&
        Objects.equals(this.vcsCommitUrl, octopusPackageVersionBuildInformationMappedResource.vcsCommitUrl) &&
        Objects.equals(this.vcsRoot, octopusPackageVersionBuildInformationMappedResource.vcsRoot) &&
        Objects.equals(this.vcsType, octopusPackageVersionBuildInformationMappedResource.vcsType) &&
        Objects.equals(this.version, octopusPackageVersionBuildInformationMappedResource.version) &&
        Objects.equals(this.workItems, octopusPackageVersionBuildInformationMappedResource.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, buildEnvironment, buildNumber, buildUrl, commits, created, incompleteDataWarning, issueTrackerName, lastModifiedBy, lastModifiedOn, links, packageId, vcsCommitNumber, vcsCommitUrl, vcsRoot, vcsType, version, workItems);
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
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

