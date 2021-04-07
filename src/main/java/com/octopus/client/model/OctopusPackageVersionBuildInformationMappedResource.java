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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * OctopusPackageVersionBuildInformationMappedResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class OctopusPackageVersionBuildInformationMappedResource {
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

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_INCOMPLETE_DATA_WARNING =
      "IncompleteDataWarning";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE_DATA_WARNING)
  private String incompleteDataWarning;

  public static final String SERIALIZED_NAME_ISSUE_TRACKER_NAME =
      "IssueTrackerName";
  @SerializedName(SERIALIZED_NAME_ISSUE_TRACKER_NAME)
  private String issueTrackerName;

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

  public OctopusPackageVersionBuildInformationMappedResource
  branch(String branch) {

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

  public OctopusPackageVersionBuildInformationMappedResource
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

  public OctopusPackageVersionBuildInformationMappedResource
  buildNumber(String buildNumber) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  buildUrl(String buildUrl) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  commits(List<CommitDetails> commits) {

    this.commits = commits;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource
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

  public OctopusPackageVersionBuildInformationMappedResource
  created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public OctopusPackageVersionBuildInformationMappedResource id(String id) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  incompleteDataWarning(String incompleteDataWarning) {

    this.incompleteDataWarning = incompleteDataWarning;
    return this;
  }

  /**
   * Get incompleteDataWarning
   * @return incompleteDataWarning
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncompleteDataWarning() {
    return incompleteDataWarning;
  }

  public void setIncompleteDataWarning(String incompleteDataWarning) {
    this.incompleteDataWarning = incompleteDataWarning;
  }

  public OctopusPackageVersionBuildInformationMappedResource
  issueTrackerName(String issueTrackerName) {

    this.issueTrackerName = issueTrackerName;
    return this;
  }

  /**
   * Get issueTrackerName
   * @return issueTrackerName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssueTrackerName() {
    return issueTrackerName;
  }

  public void setIssueTrackerName(String issueTrackerName) {
    this.issueTrackerName = issueTrackerName;
  }

  public OctopusPackageVersionBuildInformationMappedResource
  lastModifiedBy(String lastModifiedBy) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource
  putLinksItem(String key, String linksItem) {
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

  public OctopusPackageVersionBuildInformationMappedResource
  packageId(String packageId) {

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

  public OctopusPackageVersionBuildInformationMappedResource
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

  public OctopusPackageVersionBuildInformationMappedResource
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

  public OctopusPackageVersionBuildInformationMappedResource
  vcsRoot(String vcsRoot) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  vcsType(String vcsType) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  version(String version) {

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

  public OctopusPackageVersionBuildInformationMappedResource
  workItems(List<WorkItemLink> workItems) {

    this.workItems = workItems;
    return this;
  }

  public OctopusPackageVersionBuildInformationMappedResource
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
    OctopusPackageVersionBuildInformationMappedResource
        octopusPackageVersionBuildInformationMappedResource =
            (OctopusPackageVersionBuildInformationMappedResource)o;
    return Objects.equals(
               this.branch,
               octopusPackageVersionBuildInformationMappedResource.branch) &&
        Objects.equals(this.buildEnvironment,
                       octopusPackageVersionBuildInformationMappedResource
                           .buildEnvironment) &&
        Objects.equals(
            this.buildNumber,
            octopusPackageVersionBuildInformationMappedResource.buildNumber) &&
        Objects.equals(
            this.buildUrl,
            octopusPackageVersionBuildInformationMappedResource.buildUrl) &&
        Objects.equals(
            this.commits,
            octopusPackageVersionBuildInformationMappedResource.commits) &&
        Objects.equals(
            this.created,
            octopusPackageVersionBuildInformationMappedResource.created) &&
        Objects.equals(
            this.id, octopusPackageVersionBuildInformationMappedResource.id) &&
        Objects.equals(this.incompleteDataWarning,
                       octopusPackageVersionBuildInformationMappedResource
                           .incompleteDataWarning) &&
        Objects.equals(this.issueTrackerName,
                       octopusPackageVersionBuildInformationMappedResource
                           .issueTrackerName) &&
        Objects.equals(this.lastModifiedBy,
                       octopusPackageVersionBuildInformationMappedResource
                           .lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       octopusPackageVersionBuildInformationMappedResource
                           .lastModifiedOn) &&
        Objects.equals(
            this.links,
            octopusPackageVersionBuildInformationMappedResource.links) &&
        Objects.equals(
            this.packageId,
            octopusPackageVersionBuildInformationMappedResource.packageId) &&
        Objects.equals(this.vcsCommitNumber,
                       octopusPackageVersionBuildInformationMappedResource
                           .vcsCommitNumber) &&
        Objects.equals(
            this.vcsCommitUrl,
            octopusPackageVersionBuildInformationMappedResource.vcsCommitUrl) &&
        Objects.equals(
            this.vcsRoot,
            octopusPackageVersionBuildInformationMappedResource.vcsRoot) &&
        Objects.equals(
            this.vcsType,
            octopusPackageVersionBuildInformationMappedResource.vcsType) &&
        Objects.equals(
            this.version,
            octopusPackageVersionBuildInformationMappedResource.version) &&
        Objects.equals(
            this.workItems,
            octopusPackageVersionBuildInformationMappedResource.workItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, buildEnvironment, buildNumber, buildUrl,
                        commits, created, id, incompleteDataWarning,
                        issueTrackerName, lastModifiedBy, lastModifiedOn, links,
                        packageId, vcsCommitNumber, vcsCommitUrl, vcsRoot,
                        vcsType, version, workItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OctopusPackageVersionBuildInformationMappedResource {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildEnvironment: ")
        .append(toIndentedString(buildEnvironment))
        .append("\n");
    sb.append("    buildNumber: ")
        .append(toIndentedString(buildNumber))
        .append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incompleteDataWarning: ")
        .append(toIndentedString(incompleteDataWarning))
        .append("\n");
    sb.append("    issueTrackerName: ")
        .append(toIndentedString(issueTrackerName))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
