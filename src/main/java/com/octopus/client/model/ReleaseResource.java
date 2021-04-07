// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReleasePackageVersionBuildInformationResource;
import com.octopus.client.model.SelectedPackage;
import com.octopus.client.model.VersionControlReferenceResource;
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
 * ReleaseResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseResource {
  public static final String SERIALIZED_NAME_ASSEMBLED = "Assembled";
  @SerializedName(SERIALIZED_NAME_ASSEMBLED) private OffsetDateTime assembled;

  public static final String SERIALIZED_NAME_BUILD_INFORMATION =
      "BuildInformation";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION)
  private List<ReleasePackageVersionBuildInformationResource> buildInformation =
      null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID) private String channelId;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IGNORE_CHANNEL_RULES =
      "IgnoreChannelRules";
  @SerializedName(SERIALIZED_NAME_IGNORE_CHANNEL_RULES)
  private Boolean ignoreChannelRules;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_SNAPSHOT_IDS =
      "LibraryVariableSetSnapshotIds";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_SNAPSHOT_IDS)
  private List<String> libraryVariableSetSnapshotIds = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String
      SERIALIZED_NAME_PROJECT_DEPLOYMENT_PROCESS_SNAPSHOT_ID =
          "ProjectDeploymentProcessSnapshotId";
  @SerializedName(SERIALIZED_NAME_PROJECT_DEPLOYMENT_PROCESS_SNAPSHOT_ID)
  private String projectDeploymentProcessSnapshotId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_VARIABLE_SET_SNAPSHOT_ID =
      "ProjectVariableSetSnapshotId";
  @SerializedName(SERIALIZED_NAME_PROJECT_VARIABLE_SET_SNAPSHOT_ID)
  private String projectVariableSetSnapshotId;

  public static final String SERIALIZED_NAME_RELEASE_NOTES = "ReleaseNotes";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES) private String releaseNotes;

  public static final String SERIALIZED_NAME_SELECTED_PACKAGES =
      "SelectedPackages";
  @SerializedName(SERIALIZED_NAME_SELECTED_PACKAGES)
  private List<SelectedPackage> selectedPackages = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public static final String SERIALIZED_NAME_VERSION_CONTROL_REFERENCE =
      "VersionControlReference";
  @SerializedName(SERIALIZED_NAME_VERSION_CONTROL_REFERENCE)
  private VersionControlReferenceResource versionControlReference;

  public ReleaseResource assembled(OffsetDateTime assembled) {

    this.assembled = assembled;
    return this;
  }

  /**
   * Get assembled
   * @return assembled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAssembled() {
    return assembled;
  }

  public void setAssembled(OffsetDateTime assembled) {
    this.assembled = assembled;
  }

  public ReleaseResource buildInformation(
      List<ReleasePackageVersionBuildInformationResource> buildInformation) {

    this.buildInformation = buildInformation;
    return this;
  }

  public ReleaseResource addBuildInformationItem(
      ReleasePackageVersionBuildInformationResource buildInformationItem) {
    if (this.buildInformation == null) {
      this.buildInformation =
          new ArrayList<ReleasePackageVersionBuildInformationResource>();
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

  public List<ReleasePackageVersionBuildInformationResource>
  getBuildInformation() {
    return buildInformation;
  }

  public void setBuildInformation(
      List<ReleasePackageVersionBuildInformationResource> buildInformation) {
    this.buildInformation = buildInformation;
  }

  public ReleaseResource channelId(String channelId) {

    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) { this.channelId = channelId; }

  public ReleaseResource id(String id) {

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

  public ReleaseResource ignoreChannelRules(Boolean ignoreChannelRules) {

    this.ignoreChannelRules = ignoreChannelRules;
    return this;
  }

  /**
   * Get ignoreChannelRules
   * @return ignoreChannelRules
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreChannelRules() {
    return ignoreChannelRules;
  }

  public void setIgnoreChannelRules(Boolean ignoreChannelRules) {
    this.ignoreChannelRules = ignoreChannelRules;
  }

  public ReleaseResource lastModifiedBy(String lastModifiedBy) {

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

  public ReleaseResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ReleaseResource
  libraryVariableSetSnapshotIds(List<String> libraryVariableSetSnapshotIds) {

    this.libraryVariableSetSnapshotIds = libraryVariableSetSnapshotIds;
    return this;
  }

  public ReleaseResource addLibraryVariableSetSnapshotIdsItem(
      String libraryVariableSetSnapshotIdsItem) {
    if (this.libraryVariableSetSnapshotIds == null) {
      this.libraryVariableSetSnapshotIds = new ArrayList<String>();
    }
    this.libraryVariableSetSnapshotIds.add(libraryVariableSetSnapshotIdsItem);
    return this;
  }

  /**
   * Get libraryVariableSetSnapshotIds
   * @return libraryVariableSetSnapshotIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLibraryVariableSetSnapshotIds() {
    return libraryVariableSetSnapshotIds;
  }

  public void
  setLibraryVariableSetSnapshotIds(List<String> libraryVariableSetSnapshotIds) {
    this.libraryVariableSetSnapshotIds = libraryVariableSetSnapshotIds;
  }

  public ReleaseResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ReleaseResource putLinksItem(String key, String linksItem) {
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

  public ReleaseResource projectDeploymentProcessSnapshotId(
      String projectDeploymentProcessSnapshotId) {

    this.projectDeploymentProcessSnapshotId =
        projectDeploymentProcessSnapshotId;
    return this;
  }

  /**
   * Get projectDeploymentProcessSnapshotId
   * @return projectDeploymentProcessSnapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectDeploymentProcessSnapshotId() {
    return projectDeploymentProcessSnapshotId;
  }

  public void setProjectDeploymentProcessSnapshotId(
      String projectDeploymentProcessSnapshotId) {
    this.projectDeploymentProcessSnapshotId =
        projectDeploymentProcessSnapshotId;
  }

  public ReleaseResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public ReleaseResource
  projectVariableSetSnapshotId(String projectVariableSetSnapshotId) {

    this.projectVariableSetSnapshotId = projectVariableSetSnapshotId;
    return this;
  }

  /**
   * Get projectVariableSetSnapshotId
   * @return projectVariableSetSnapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectVariableSetSnapshotId() {
    return projectVariableSetSnapshotId;
  }

  public void
  setProjectVariableSetSnapshotId(String projectVariableSetSnapshotId) {
    this.projectVariableSetSnapshotId = projectVariableSetSnapshotId;
  }

  public ReleaseResource releaseNotes(String releaseNotes) {

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

  public ReleaseResource
  selectedPackages(List<SelectedPackage> selectedPackages) {

    this.selectedPackages = selectedPackages;
    return this;
  }

  public ReleaseResource
  addSelectedPackagesItem(SelectedPackage selectedPackagesItem) {
    if (this.selectedPackages == null) {
      this.selectedPackages = new ArrayList<SelectedPackage>();
    }
    this.selectedPackages.add(selectedPackagesItem);
    return this;
  }

  /**
   * Get selectedPackages
   * @return selectedPackages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SelectedPackage> getSelectedPackages() {
    return selectedPackages;
  }

  public void setSelectedPackages(List<SelectedPackage> selectedPackages) {
    this.selectedPackages = selectedPackages;
  }

  public ReleaseResource spaceId(String spaceId) {

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

  public ReleaseResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  public ReleaseResource versionControlReference(
      VersionControlReferenceResource versionControlReference) {

    this.versionControlReference = versionControlReference;
    return this;
  }

  /**
   * Get versionControlReference
   * @return versionControlReference
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionControlReferenceResource getVersionControlReference() {
    return versionControlReference;
  }

  public void setVersionControlReference(
      VersionControlReferenceResource versionControlReference) {
    this.versionControlReference = versionControlReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseResource releaseResource = (ReleaseResource)o;
    return Objects.equals(this.assembled, releaseResource.assembled) &&
        Objects.equals(this.buildInformation,
                       releaseResource.buildInformation) &&
        Objects.equals(this.channelId, releaseResource.channelId) &&
        Objects.equals(this.id, releaseResource.id) &&
        Objects.equals(this.ignoreChannelRules,
                       releaseResource.ignoreChannelRules) &&
        Objects.equals(this.lastModifiedBy, releaseResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, releaseResource.lastModifiedOn) &&
        Objects.equals(this.libraryVariableSetSnapshotIds,
                       releaseResource.libraryVariableSetSnapshotIds) &&
        Objects.equals(this.links, releaseResource.links) &&
        Objects.equals(this.projectDeploymentProcessSnapshotId,
                       releaseResource.projectDeploymentProcessSnapshotId) &&
        Objects.equals(this.projectId, releaseResource.projectId) &&
        Objects.equals(this.projectVariableSetSnapshotId,
                       releaseResource.projectVariableSetSnapshotId) &&
        Objects.equals(this.releaseNotes, releaseResource.releaseNotes) &&
        Objects.equals(this.selectedPackages,
                       releaseResource.selectedPackages) &&
        Objects.equals(this.spaceId, releaseResource.spaceId) &&
        Objects.equals(this.version, releaseResource.version) &&
        Objects.equals(this.versionControlReference,
                       releaseResource.versionControlReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assembled, buildInformation, channelId, id, ignoreChannelRules,
        lastModifiedBy, lastModifiedOn, libraryVariableSetSnapshotIds, links,
        projectDeploymentProcessSnapshotId, projectId,
        projectVariableSetSnapshotId, releaseNotes, selectedPackages, spaceId,
        version, versionControlReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseResource {\n");
    sb.append("    assembled: ")
        .append(toIndentedString(assembled))
        .append("\n");
    sb.append("    buildInformation: ")
        .append(toIndentedString(buildInformation))
        .append("\n");
    sb.append("    channelId: ")
        .append(toIndentedString(channelId))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreChannelRules: ")
        .append(toIndentedString(ignoreChannelRules))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    libraryVariableSetSnapshotIds: ")
        .append(toIndentedString(libraryVariableSetSnapshotIds))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectDeploymentProcessSnapshotId: ")
        .append(toIndentedString(projectDeploymentProcessSnapshotId))
        .append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectVariableSetSnapshotId: ")
        .append(toIndentedString(projectVariableSetSnapshotId))
        .append("\n");
    sb.append("    releaseNotes: ")
        .append(toIndentedString(releaseNotes))
        .append("\n");
    sb.append("    selectedPackages: ")
        .append(toIndentedString(selectedPackages))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionControlReference: ")
        .append(toIndentedString(versionControlReference))
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
