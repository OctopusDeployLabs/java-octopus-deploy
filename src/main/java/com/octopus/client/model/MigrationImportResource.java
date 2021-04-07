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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * MigrationImportResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MigrationImportResource {
  public static final String SERIALIZED_NAME_DELETE_PACKAGE_ON_COMPLETION =
      "DeletePackageOnCompletion";
  @SerializedName(SERIALIZED_NAME_DELETE_PACKAGE_ON_COMPLETION)
  private Boolean deletePackageOnCompletion;

  public static final String SERIALIZED_NAME_FAILURE_CALLBACK_URI =
      "FailureCallbackUri";
  @SerializedName(SERIALIZED_NAME_FAILURE_CALLBACK_URI)
  private String failureCallbackUri;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DRY_RUN = "IsDryRun";
  @SerializedName(SERIALIZED_NAME_IS_DRY_RUN) private Boolean isDryRun;

  public static final String SERIALIZED_NAME_IS_ENCRYPTED_PACKAGE =
      "IsEncryptedPackage";
  @SerializedName(SERIALIZED_NAME_IS_ENCRYPTED_PACKAGE)
  private Boolean isEncryptedPackage;

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

  public static final String SERIALIZED_NAME_OVERWRITE_EXISTING =
      "OverwriteExisting";
  @SerializedName(SERIALIZED_NAME_OVERWRITE_EXISTING)
  private Boolean overwriteExisting;

  public static final String SERIALIZED_NAME_PACKAGE_FEED_SPACE_ID =
      "PackageFeedSpaceId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_FEED_SPACE_ID)
  private String packageFeedSpaceId;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_PACKAGE_VERSION = "PackageVersion";
  @SerializedName(SERIALIZED_NAME_PACKAGE_VERSION)
  private String packageVersion;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD) private String password;

  public static final String SERIALIZED_NAME_SUCCESS_CALLBACK_URI =
      "SuccessCallbackUri";
  @SerializedName(SERIALIZED_NAME_SUCCESS_CALLBACK_URI)
  private String successCallbackUri;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public MigrationImportResource
  deletePackageOnCompletion(Boolean deletePackageOnCompletion) {

    this.deletePackageOnCompletion = deletePackageOnCompletion;
    return this;
  }

  /**
   * Get deletePackageOnCompletion
   * @return deletePackageOnCompletion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeletePackageOnCompletion() {
    return deletePackageOnCompletion;
  }

  public void setDeletePackageOnCompletion(Boolean deletePackageOnCompletion) {
    this.deletePackageOnCompletion = deletePackageOnCompletion;
  }

  public MigrationImportResource failureCallbackUri(String failureCallbackUri) {

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

  public MigrationImportResource id(String id) {

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

  public MigrationImportResource isDryRun(Boolean isDryRun) {

    this.isDryRun = isDryRun;
    return this;
  }

  /**
   * Get isDryRun
   * @return isDryRun
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDryRun() {
    return isDryRun;
  }

  public void setIsDryRun(Boolean isDryRun) { this.isDryRun = isDryRun; }

  public MigrationImportResource
  isEncryptedPackage(Boolean isEncryptedPackage) {

    this.isEncryptedPackage = isEncryptedPackage;
    return this;
  }

  /**
   * Get isEncryptedPackage
   * @return isEncryptedPackage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEncryptedPackage() {
    return isEncryptedPackage;
  }

  public void setIsEncryptedPackage(Boolean isEncryptedPackage) {
    this.isEncryptedPackage = isEncryptedPackage;
  }

  public MigrationImportResource lastModifiedBy(String lastModifiedBy) {

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

  public MigrationImportResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public MigrationImportResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MigrationImportResource putLinksItem(String key, String linksItem) {
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

  public MigrationImportResource overwriteExisting(Boolean overwriteExisting) {

    this.overwriteExisting = overwriteExisting;
    return this;
  }

  /**
   * Get overwriteExisting
   * @return overwriteExisting
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }

  public void setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
  }

  public MigrationImportResource packageFeedSpaceId(String packageFeedSpaceId) {

    this.packageFeedSpaceId = packageFeedSpaceId;
    return this;
  }

  /**
   * Get packageFeedSpaceId
   * @return packageFeedSpaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageFeedSpaceId() {
    return packageFeedSpaceId;
  }

  public void setPackageFeedSpaceId(String packageFeedSpaceId) {
    this.packageFeedSpaceId = packageFeedSpaceId;
  }

  public MigrationImportResource packageId(String packageId) {

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

  public MigrationImportResource packageVersion(String packageVersion) {

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

  public MigrationImportResource password(String password) {

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

  public MigrationImportResource successCallbackUri(String successCallbackUri) {

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

  public MigrationImportResource taskId(String taskId) {

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
    MigrationImportResource migrationImportResource =
        (MigrationImportResource)o;
    return Objects.equals(this.deletePackageOnCompletion,
                          migrationImportResource.deletePackageOnCompletion) &&
        Objects.equals(this.failureCallbackUri,
                       migrationImportResource.failureCallbackUri) &&
        Objects.equals(this.id, migrationImportResource.id) &&
        Objects.equals(this.isDryRun, migrationImportResource.isDryRun) &&
        Objects.equals(this.isEncryptedPackage,
                       migrationImportResource.isEncryptedPackage) &&
        Objects.equals(this.lastModifiedBy,
                       migrationImportResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       migrationImportResource.lastModifiedOn) &&
        Objects.equals(this.links, migrationImportResource.links) &&
        Objects.equals(this.overwriteExisting,
                       migrationImportResource.overwriteExisting) &&
        Objects.equals(this.packageFeedSpaceId,
                       migrationImportResource.packageFeedSpaceId) &&
        Objects.equals(this.packageId, migrationImportResource.packageId) &&
        Objects.equals(this.packageVersion,
                       migrationImportResource.packageVersion) &&
        Objects.equals(this.password, migrationImportResource.password) &&
        Objects.equals(this.successCallbackUri,
                       migrationImportResource.successCallbackUri) &&
        Objects.equals(this.taskId, migrationImportResource.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePackageOnCompletion, failureCallbackUri, id,
                        isDryRun, isEncryptedPackage, lastModifiedBy,
                        lastModifiedOn, links, overwriteExisting,
                        packageFeedSpaceId, packageId, packageVersion, password,
                        successCallbackUri, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationImportResource {\n");
    sb.append("    deletePackageOnCompletion: ")
        .append(toIndentedString(deletePackageOnCompletion))
        .append("\n");
    sb.append("    failureCallbackUri: ")
        .append(toIndentedString(failureCallbackUri))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDryRun: ").append(toIndentedString(isDryRun)).append("\n");
    sb.append("    isEncryptedPackage: ")
        .append(toIndentedString(isEncryptedPackage))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    overwriteExisting: ")
        .append(toIndentedString(overwriteExisting))
        .append("\n");
    sb.append("    packageFeedSpaceId: ")
        .append(toIndentedString(packageFeedSpaceId))
        .append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    packageVersion: ")
        .append(toIndentedString(packageVersion))
        .append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
