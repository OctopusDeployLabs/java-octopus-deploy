// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReleaseTemplatePackage;
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
 * ReleaseTemplateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseTemplateResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID =
      "DeploymentProcessId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID)
  private String deploymentProcessId;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LAST_RELEASE_VERSION =
      "LastReleaseVersion";
  @SerializedName(SERIALIZED_NAME_LAST_RELEASE_VERSION)
  private String lastReleaseVersion;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NEXT_VERSION_INCREMENT =
      "NextVersionIncrement";
  @SerializedName(SERIALIZED_NAME_NEXT_VERSION_INCREMENT)
  private String nextVersionIncrement;

  public static final String SERIALIZED_NAME_PACKAGES = "Packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<ReleaseTemplatePackage> packages = null;

  public static final String SERIALIZED_NAME_VERSIONING_PACKAGE_REFERENCE_NAME =
      "VersioningPackageReferenceName";
  @SerializedName(SERIALIZED_NAME_VERSIONING_PACKAGE_REFERENCE_NAME)
  private String versioningPackageReferenceName;

  public static final String SERIALIZED_NAME_VERSIONING_PACKAGE_STEP_NAME =
      "VersioningPackageStepName";
  @SerializedName(SERIALIZED_NAME_VERSIONING_PACKAGE_STEP_NAME)
  private String versioningPackageStepName;

  public ReleaseTemplateResource
  deploymentProcessId(String deploymentProcessId) {

    this.deploymentProcessId = deploymentProcessId;
    return this;
  }

  /**
   * Get deploymentProcessId
   * @return deploymentProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public void setDeploymentProcessId(String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public ReleaseTemplateResource id(String id) {

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

  public ReleaseTemplateResource lastModifiedBy(String lastModifiedBy) {

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

  public ReleaseTemplateResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ReleaseTemplateResource lastReleaseVersion(String lastReleaseVersion) {

    this.lastReleaseVersion = lastReleaseVersion;
    return this;
  }

  /**
   * Get lastReleaseVersion
   * @return lastReleaseVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastReleaseVersion() {
    return lastReleaseVersion;
  }

  public void setLastReleaseVersion(String lastReleaseVersion) {
    this.lastReleaseVersion = lastReleaseVersion;
  }

  public ReleaseTemplateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ReleaseTemplateResource putLinksItem(String key, String linksItem) {
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

  public ReleaseTemplateResource
  nextVersionIncrement(String nextVersionIncrement) {

    this.nextVersionIncrement = nextVersionIncrement;
    return this;
  }

  /**
   * Get nextVersionIncrement
   * @return nextVersionIncrement
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextVersionIncrement() {
    return nextVersionIncrement;
  }

  public void setNextVersionIncrement(String nextVersionIncrement) {
    this.nextVersionIncrement = nextVersionIncrement;
  }

  public ReleaseTemplateResource
  packages(List<ReleaseTemplatePackage> packages) {

    this.packages = packages;
    return this;
  }

  public ReleaseTemplateResource
  addPackagesItem(ReleaseTemplatePackage packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<ReleaseTemplatePackage>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleaseTemplatePackage> getPackages() {
    return packages;
  }

  public void setPackages(List<ReleaseTemplatePackage> packages) {
    this.packages = packages;
  }

  public ReleaseTemplateResource
  versioningPackageReferenceName(String versioningPackageReferenceName) {

    this.versioningPackageReferenceName = versioningPackageReferenceName;
    return this;
  }

  /**
   * Get versioningPackageReferenceName
   * @return versioningPackageReferenceName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersioningPackageReferenceName() {
    return versioningPackageReferenceName;
  }

  public void
  setVersioningPackageReferenceName(String versioningPackageReferenceName) {
    this.versioningPackageReferenceName = versioningPackageReferenceName;
  }

  public ReleaseTemplateResource
  versioningPackageStepName(String versioningPackageStepName) {

    this.versioningPackageStepName = versioningPackageStepName;
    return this;
  }

  /**
   * Get versioningPackageStepName
   * @return versioningPackageStepName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersioningPackageStepName() {
    return versioningPackageStepName;
  }

  public void setVersioningPackageStepName(String versioningPackageStepName) {
    this.versioningPackageStepName = versioningPackageStepName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseTemplateResource releaseTemplateResource =
        (ReleaseTemplateResource)o;
    return Objects.equals(this.deploymentProcessId,
                          releaseTemplateResource.deploymentProcessId) &&
        Objects.equals(this.id, releaseTemplateResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       releaseTemplateResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       releaseTemplateResource.lastModifiedOn) &&
        Objects.equals(this.lastReleaseVersion,
                       releaseTemplateResource.lastReleaseVersion) &&
        Objects.equals(this.links, releaseTemplateResource.links) &&
        Objects.equals(this.nextVersionIncrement,
                       releaseTemplateResource.nextVersionIncrement) &&
        Objects.equals(this.packages, releaseTemplateResource.packages) &&
        Objects.equals(
            this.versioningPackageReferenceName,
            releaseTemplateResource.versioningPackageReferenceName) &&
        Objects.equals(this.versioningPackageStepName,
                       releaseTemplateResource.versioningPackageStepName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentProcessId, id, lastModifiedBy, lastModifiedOn,
                        lastReleaseVersion, links, nextVersionIncrement,
                        packages, versioningPackageReferenceName,
                        versioningPackageStepName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTemplateResource {\n");
    sb.append("    deploymentProcessId: ")
        .append(toIndentedString(deploymentProcessId))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    lastReleaseVersion: ")
        .append(toIndentedString(lastReleaseVersion))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nextVersionIncrement: ")
        .append(toIndentedString(nextVersionIncrement))
        .append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    versioningPackageReferenceName: ")
        .append(toIndentedString(versioningPackageReferenceName))
        .append("\n");
    sb.append("    versioningPackageStepName: ")
        .append(toIndentedString(versioningPackageStepName))
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
