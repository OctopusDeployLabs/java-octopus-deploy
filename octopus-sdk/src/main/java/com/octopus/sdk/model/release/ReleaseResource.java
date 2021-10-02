/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.release;

import com.octopus.openapi.model.ReleasePackageVersionBuildInformationResource;
import com.octopus.openapi.model.SelectedPackage;
import com.octopus.openapi.model.VersionControlReferenceResource;
import com.octopus.sdk.model.BaseResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class ReleaseResource extends BaseResource {
  @SerializedName("Assembled")
  private OffsetDateTime assembled;

  @SerializedName("BuildInformation")
  private List<ReleasePackageVersionBuildInformationResource> buildInformation = null;

  @SerializedName("ChannelId")
  private String channelId;

  @SerializedName("IgnoreChannelRules")
  private Boolean ignoreChannelRules;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LibraryVariableSetSnapshotIds")
  private List<String> libraryVariableSetSnapshotIds = null;

  @SerializedName("ProjectDeploymentProcessSnapshotId")
  private String projectDeploymentProcessSnapshotId;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("ProjectVariableSetSnapshotId")
  private String projectVariableSetSnapshotId;

  @SerializedName("ReleaseNotes")
  private String releaseNotes;

  @SerializedName("SelectedPackages")
  private List<SelectedPackage> selectedPackages = null;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("Version")
  private String version;

  @SerializedName("VersionControlReference")
  private VersionControlReferenceResource versionControlReference;

  public ReleaseResource(final String version, final String projectId) {
    this.version = version;
    this.projectId = projectId;
  }

  public ReleaseResource assembled(OffsetDateTime assembled) {

    this.assembled = assembled;
    return this;
  }

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
      this.buildInformation = new ArrayList<>();
    }
    this.buildInformation.add(buildInformationItem);
    return this;
  }

  public List<ReleasePackageVersionBuildInformationResource> getBuildInformation() {
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

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ReleaseResource ignoreChannelRules(Boolean ignoreChannelRules) {

    this.ignoreChannelRules = ignoreChannelRules;
    return this;
  }

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

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public ReleaseResource libraryVariableSetSnapshotIds(List<String> libraryVariableSetSnapshotIds) {

    this.libraryVariableSetSnapshotIds = libraryVariableSetSnapshotIds;
    return this;
  }

  public ReleaseResource addLibraryVariableSetSnapshotIdsItem(
      String libraryVariableSetSnapshotIdsItem) {
    if (this.libraryVariableSetSnapshotIds == null) {
      this.libraryVariableSetSnapshotIds = new ArrayList<>();
    }
    this.libraryVariableSetSnapshotIds.add(libraryVariableSetSnapshotIdsItem);
    return this;
  }

  public List<String> getLibraryVariableSetSnapshotIds() {
    return libraryVariableSetSnapshotIds;
  }

  public void setLibraryVariableSetSnapshotIds(List<String> libraryVariableSetSnapshotIds) {
    this.libraryVariableSetSnapshotIds = libraryVariableSetSnapshotIds;
  }

  public ReleaseResource projectDeploymentProcessSnapshotId(
      String projectDeploymentProcessSnapshotId) {

    this.projectDeploymentProcessSnapshotId = projectDeploymentProcessSnapshotId;
    return this;
  }

  public String getProjectDeploymentProcessSnapshotId() {
    return projectDeploymentProcessSnapshotId;
  }

  public void setProjectDeploymentProcessSnapshotId(String projectDeploymentProcessSnapshotId) {
    this.projectDeploymentProcessSnapshotId = projectDeploymentProcessSnapshotId;
  }

  public ReleaseResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ReleaseResource projectVariableSetSnapshotId(String projectVariableSetSnapshotId) {

    this.projectVariableSetSnapshotId = projectVariableSetSnapshotId;
    return this;
  }

  public String getProjectVariableSetSnapshotId() {
    return projectVariableSetSnapshotId;
  }

  public void setProjectVariableSetSnapshotId(String projectVariableSetSnapshotId) {
    this.projectVariableSetSnapshotId = projectVariableSetSnapshotId;
  }

  public ReleaseResource releaseNotes(String releaseNotes) {

    this.releaseNotes = releaseNotes;
    return this;
  }

  public String getReleaseNotes() {
    return releaseNotes;
  }

  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  public ReleaseResource selectedPackages(List<SelectedPackage> selectedPackages) {

    this.selectedPackages = selectedPackages;
    return this;
  }

  public ReleaseResource addSelectedPackagesItem(SelectedPackage selectedPackagesItem) {
    if (this.selectedPackages == null) {
      this.selectedPackages = new ArrayList<>();
    }
    this.selectedPackages.add(selectedPackagesItem);
    return this;
  }

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

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public ReleaseResource version(String version) {

    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ReleaseResource versionControlReference(
      VersionControlReferenceResource versionControlReference) {

    this.versionControlReference = versionControlReference;
    return this;
  }

  public VersionControlReferenceResource getVersionControlReference() {
    return versionControlReference;
  }

  public void setVersionControlReference(VersionControlReferenceResource versionControlReference) {
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
    ReleaseResource releaseResource = (ReleaseResource) o;
    return Objects.equals(this.assembled, releaseResource.assembled)
        && Objects.equals(this.buildInformation, releaseResource.buildInformation)
        && Objects.equals(this.channelId, releaseResource.channelId)
        && Objects.equals(this.ignoreChannelRules, releaseResource.ignoreChannelRules)
        && Objects.equals(this.lastModifiedBy, releaseResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, releaseResource.lastModifiedOn)
        && Objects.equals(
            this.libraryVariableSetSnapshotIds, releaseResource.libraryVariableSetSnapshotIds)
        && Objects.equals(
            this.projectDeploymentProcessSnapshotId,
            releaseResource.projectDeploymentProcessSnapshotId)
        && Objects.equals(this.projectId, releaseResource.projectId)
        && Objects.equals(
            this.projectVariableSetSnapshotId, releaseResource.projectVariableSetSnapshotId)
        && Objects.equals(this.releaseNotes, releaseResource.releaseNotes)
        && Objects.equals(this.selectedPackages, releaseResource.selectedPackages)
        && Objects.equals(this.spaceId, releaseResource.spaceId)
        && Objects.equals(this.version, releaseResource.version)
        && Objects.equals(this.versionControlReference, releaseResource.versionControlReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assembled,
        buildInformation,
        channelId,
        ignoreChannelRules,
        lastModifiedBy,
        lastModifiedOn,
        libraryVariableSetSnapshotIds,
        projectDeploymentProcessSnapshotId,
        projectId,
        projectVariableSetSnapshotId,
        releaseNotes,
        selectedPackages,
        spaceId,
        version,
        versionControlReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseResource {\n");
    sb.append("    assembled: ").append(toIndentedString(assembled)).append("\n");
    sb.append("    buildInformation: ").append(toIndentedString(buildInformation)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    ignoreChannelRules: ").append(toIndentedString(ignoreChannelRules)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    libraryVariableSetSnapshotIds: ")
        .append(toIndentedString(libraryVariableSetSnapshotIds))
        .append("\n");
    sb.append("    projectDeploymentProcessSnapshotId: ")
        .append(toIndentedString(projectDeploymentProcessSnapshotId))
        .append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectVariableSetSnapshotId: ")
        .append(toIndentedString(projectVariableSetSnapshotId))
        .append("\n");
    sb.append("    releaseNotes: ").append(toIndentedString(releaseNotes)).append("\n");
    sb.append("    selectedPackages: ").append(toIndentedString(selectedPackages)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionControlReference: ")
        .append(toIndentedString(versionControlReference))
        .append("\n");
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
