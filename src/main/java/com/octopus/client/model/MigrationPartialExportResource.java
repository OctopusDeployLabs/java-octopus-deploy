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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * MigrationPartialExportResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MigrationPartialExportResource {
  public static final String SERIALIZED_NAME_DESTINATION_API_KEY =
      "DestinationApiKey";
  @SerializedName(SERIALIZED_NAME_DESTINATION_API_KEY)
  private String destinationApiKey;

  public static final String SERIALIZED_NAME_DESTINATION_PACKAGE_FEED =
      "DestinationPackageFeed";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PACKAGE_FEED)
  private String destinationPackageFeed;

  public static final String SERIALIZED_NAME_DESTINATION_PACKAGE_FEED_SPACE_ID =
      "DestinationPackageFeedSpaceId";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PACKAGE_FEED_SPACE_ID)
  private String destinationPackageFeedSpaceId;

  public static final String SERIALIZED_NAME_ENCRYPT_PACKAGE = "EncryptPackage";
  @SerializedName(SERIALIZED_NAME_ENCRYPT_PACKAGE)
  private Boolean encryptPackage;

  public static final String SERIALIZED_NAME_FAILURE_CALLBACK_URI =
      "FailureCallbackUri";
  @SerializedName(SERIALIZED_NAME_FAILURE_CALLBACK_URI)
  private String failureCallbackUri;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IGNORE_CERTIFICATES =
      "IgnoreCertificates";
  @SerializedName(SERIALIZED_NAME_IGNORE_CERTIFICATES)
  private Boolean ignoreCertificates;

  public static final String SERIALIZED_NAME_IGNORE_DEPLOYMENTS =
      "IgnoreDeployments";
  @SerializedName(SERIALIZED_NAME_IGNORE_DEPLOYMENTS)
  private Boolean ignoreDeployments;

  public static final String SERIALIZED_NAME_IGNORE_MACHINES = "IgnoreMachines";
  @SerializedName(SERIALIZED_NAME_IGNORE_MACHINES)
  private Boolean ignoreMachines;

  public static final String SERIALIZED_NAME_IGNORE_TENANTS = "IgnoreTenants";
  @SerializedName(SERIALIZED_NAME_IGNORE_TENANTS) private Boolean ignoreTenants;

  public static final String SERIALIZED_NAME_INCLUDE_TASK_LOGS =
      "IncludeTaskLogs";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TASK_LOGS)
  private Boolean includeTaskLogs;

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

  public static final String SERIALIZED_NAME_PACKAGE_VERSION = "PackageVersion";
  @SerializedName(SERIALIZED_NAME_PACKAGE_VERSION)
  private String packageVersion;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD) private String password;

  public static final String SERIALIZED_NAME_PROJECTS = "Projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<String> projects = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_SUCCESS_CALLBACK_URI =
      "SuccessCallbackUri";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CALLBACK_URI)
  private String successCallbackUri;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public MigrationPartialExportResource
  destinationApiKey(String destinationApiKey) {

    this.destinationApiKey = destinationApiKey;
    return this;
  }

  /**
   * Get destinationApiKey
   * @return destinationApiKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationApiKey() {
    return destinationApiKey;
  }

  public void setDestinationApiKey(String destinationApiKey) {
    this.destinationApiKey = destinationApiKey;
  }

  public MigrationPartialExportResource
  destinationPackageFeed(String destinationPackageFeed) {

    this.destinationPackageFeed = destinationPackageFeed;
    return this;
  }

  /**
   * Get destinationPackageFeed
   * @return destinationPackageFeed
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationPackageFeed() {
    return destinationPackageFeed;
  }

  public void setDestinationPackageFeed(String destinationPackageFeed) {
    this.destinationPackageFeed = destinationPackageFeed;
  }

  public MigrationPartialExportResource
  destinationPackageFeedSpaceId(String destinationPackageFeedSpaceId) {

    this.destinationPackageFeedSpaceId = destinationPackageFeedSpaceId;
    return this;
  }

  /**
   * Get destinationPackageFeedSpaceId
   * @return destinationPackageFeedSpaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationPackageFeedSpaceId() {
    return destinationPackageFeedSpaceId;
  }

  public void
  setDestinationPackageFeedSpaceId(String destinationPackageFeedSpaceId) {
    this.destinationPackageFeedSpaceId = destinationPackageFeedSpaceId;
  }

  public MigrationPartialExportResource encryptPackage(Boolean encryptPackage) {

    this.encryptPackage = encryptPackage;
    return this;
  }

  /**
   * Get encryptPackage
   * @return encryptPackage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEncryptPackage() {
    return encryptPackage;
  }

  public void setEncryptPackage(Boolean encryptPackage) {
    this.encryptPackage = encryptPackage;
  }

  public MigrationPartialExportResource
  failureCallbackUri(String failureCallbackUri) {

    this.failureCallbackUri = failureCallbackUri;
    return this;
  }

  /**
   * Get failureCallbackUri
   * @return failureCallbackUri
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailureCallbackUri() {
    return failureCallbackUri;
  }

  public void setFailureCallbackUri(String failureCallbackUri) {
    this.failureCallbackUri = failureCallbackUri;
  }

  public MigrationPartialExportResource id(String id) {

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

  public MigrationPartialExportResource
  ignoreCertificates(Boolean ignoreCertificates) {

    this.ignoreCertificates = ignoreCertificates;
    return this;
  }

  /**
   * Get ignoreCertificates
   * @return ignoreCertificates
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreCertificates() {
    return ignoreCertificates;
  }

  public void setIgnoreCertificates(Boolean ignoreCertificates) {
    this.ignoreCertificates = ignoreCertificates;
  }

  public MigrationPartialExportResource
  ignoreDeployments(Boolean ignoreDeployments) {

    this.ignoreDeployments = ignoreDeployments;
    return this;
  }

  /**
   * Get ignoreDeployments
   * @return ignoreDeployments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreDeployments() {
    return ignoreDeployments;
  }

  public void setIgnoreDeployments(Boolean ignoreDeployments) {
    this.ignoreDeployments = ignoreDeployments;
  }

  public MigrationPartialExportResource ignoreMachines(Boolean ignoreMachines) {

    this.ignoreMachines = ignoreMachines;
    return this;
  }

  /**
   * Get ignoreMachines
   * @return ignoreMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreMachines() {
    return ignoreMachines;
  }

  public void setIgnoreMachines(Boolean ignoreMachines) {
    this.ignoreMachines = ignoreMachines;
  }

  public MigrationPartialExportResource ignoreTenants(Boolean ignoreTenants) {

    this.ignoreTenants = ignoreTenants;
    return this;
  }

  /**
   * Get ignoreTenants
   * @return ignoreTenants
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreTenants() {
    return ignoreTenants;
  }

  public void setIgnoreTenants(Boolean ignoreTenants) {
    this.ignoreTenants = ignoreTenants;
  }

  public MigrationPartialExportResource
  includeTaskLogs(Boolean includeTaskLogs) {

    this.includeTaskLogs = includeTaskLogs;
    return this;
  }

  /**
   * Get includeTaskLogs
   * @return includeTaskLogs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeTaskLogs() {
    return includeTaskLogs;
  }

  public void setIncludeTaskLogs(Boolean includeTaskLogs) {
    this.includeTaskLogs = includeTaskLogs;
  }

  public MigrationPartialExportResource lastModifiedBy(String lastModifiedBy) {

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

  public MigrationPartialExportResource
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

  public MigrationPartialExportResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MigrationPartialExportResource putLinksItem(String key,
                                                     String linksItem) {
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

  public MigrationPartialExportResource packageId(String packageId) {

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

  public MigrationPartialExportResource packageVersion(String packageVersion) {

    this.packageVersion = packageVersion;
    return this;
  }

  /**
   * Get packageVersion
   * @return packageVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageVersion() {
    return packageVersion;
  }

  public void setPackageVersion(String packageVersion) {
    this.packageVersion = packageVersion;
  }

  public MigrationPartialExportResource password(String password) {

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) { this.password = password; }

  public MigrationPartialExportResource projects(List<String> projects) {

    this.projects = projects;
    return this;
  }

  public MigrationPartialExportResource addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<String>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProjects() {
    return projects;
  }

  public void setProjects(List<String> projects) { this.projects = projects; }

  public MigrationPartialExportResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  public MigrationPartialExportResource
  successCallbackUri(String successCallbackUri) {

    this.successCallbackUri = successCallbackUri;
    return this;
  }

  /**
   * Get successCallbackUri
   * @return successCallbackUri
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuccessCallbackUri() {
    return successCallbackUri;
  }

  public void setSuccessCallbackUri(String successCallbackUri) {
    this.successCallbackUri = successCallbackUri;
  }

  public MigrationPartialExportResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) { this.taskId = taskId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationPartialExportResource migrationPartialExportResource =
        (MigrationPartialExportResource)o;
    return Objects.equals(this.destinationApiKey,
                          migrationPartialExportResource.destinationApiKey) &&
        Objects.equals(this.destinationPackageFeed,
                       migrationPartialExportResource.destinationPackageFeed) &&
        Objects.equals(
            this.destinationPackageFeedSpaceId,
            migrationPartialExportResource.destinationPackageFeedSpaceId) &&
        Objects.equals(this.encryptPackage,
                       migrationPartialExportResource.encryptPackage) &&
        Objects.equals(this.failureCallbackUri,
                       migrationPartialExportResource.failureCallbackUri) &&
        Objects.equals(this.id, migrationPartialExportResource.id) &&
        Objects.equals(this.ignoreCertificates,
                       migrationPartialExportResource.ignoreCertificates) &&
        Objects.equals(this.ignoreDeployments,
                       migrationPartialExportResource.ignoreDeployments) &&
        Objects.equals(this.ignoreMachines,
                       migrationPartialExportResource.ignoreMachines) &&
        Objects.equals(this.ignoreTenants,
                       migrationPartialExportResource.ignoreTenants) &&
        Objects.equals(this.includeTaskLogs,
                       migrationPartialExportResource.includeTaskLogs) &&
        Objects.equals(this.lastModifiedBy,
                       migrationPartialExportResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       migrationPartialExportResource.lastModifiedOn) &&
        Objects.equals(this.links, migrationPartialExportResource.links) &&
        Objects.equals(this.packageId,
                       migrationPartialExportResource.packageId) &&
        Objects.equals(this.packageVersion,
                       migrationPartialExportResource.packageVersion) &&
        Objects.equals(this.password,
                       migrationPartialExportResource.password) &&
        Objects.equals(this.projects,
                       migrationPartialExportResource.projects) &&
        Objects.equals(this.spaceId, migrationPartialExportResource.spaceId) &&
        Objects.equals(this.successCallbackUri,
                       migrationPartialExportResource.successCallbackUri) &&
        Objects.equals(this.taskId, migrationPartialExportResource.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationApiKey, destinationPackageFeed,
                        destinationPackageFeedSpaceId, encryptPackage,
                        failureCallbackUri, id, ignoreCertificates,
                        ignoreDeployments, ignoreMachines, ignoreTenants,
                        includeTaskLogs, lastModifiedBy, lastModifiedOn, links,
                        packageId, packageVersion, password, projects, spaceId,
                        successCallbackUri, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationPartialExportResource {\n");
    sb.append("    destinationApiKey: ")
        .append(toIndentedString(destinationApiKey))
        .append("\n");
    sb.append("    destinationPackageFeed: ")
        .append(toIndentedString(destinationPackageFeed))
        .append("\n");
    sb.append("    destinationPackageFeedSpaceId: ")
        .append(toIndentedString(destinationPackageFeedSpaceId))
        .append("\n");
    sb.append("    encryptPackage: ")
        .append(toIndentedString(encryptPackage))
        .append("\n");
    sb.append("    failureCallbackUri: ")
        .append(toIndentedString(failureCallbackUri))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreCertificates: ")
        .append(toIndentedString(ignoreCertificates))
        .append("\n");
    sb.append("    ignoreDeployments: ")
        .append(toIndentedString(ignoreDeployments))
        .append("\n");
    sb.append("    ignoreMachines: ")
        .append(toIndentedString(ignoreMachines))
        .append("\n");
    sb.append("    ignoreTenants: ")
        .append(toIndentedString(ignoreTenants))
        .append("\n");
    sb.append("    includeTaskLogs: ")
        .append(toIndentedString(includeTaskLogs))
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
    sb.append("    packageVersion: ")
        .append(toIndentedString(packageVersion))
        .append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    successCallbackUri: ")
        .append(toIndentedString(successCallbackUri))
        .append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
