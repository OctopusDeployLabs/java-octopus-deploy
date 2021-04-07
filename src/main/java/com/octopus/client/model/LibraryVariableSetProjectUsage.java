// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LibraryVariableSetReleaseUsageEntry;
import com.octopus.client.model.LibraryVariableSetRunbookSnapshotUsageEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * LibraryVariableSetProjectUsage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LibraryVariableSetProjectUsage {
  public static final String
      SERIALIZED_NAME_IS_CURRENTLY_BEING_USED_IN_PROJECT =
          "IsCurrentlyBeingUsedInProject";
  @SerializedName(SERIALIZED_NAME_IS_CURRENTLY_BEING_USED_IN_PROJECT)
  private Boolean isCurrentlyBeingUsedInProject;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "ProjectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG) private String projectSlug;

  public static final String SERIALIZED_NAME_RELEASES = "Releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<LibraryVariableSetReleaseUsageEntry> releases = null;

  public static final String SERIALIZED_NAME_RUNBOOK_SNAPSHOTS =
      "RunbookSnapshots";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_SNAPSHOTS)
  private List<LibraryVariableSetRunbookSnapshotUsageEntry> runbookSnapshots =
      null;

  public LibraryVariableSetProjectUsage
  isCurrentlyBeingUsedInProject(Boolean isCurrentlyBeingUsedInProject) {

    this.isCurrentlyBeingUsedInProject = isCurrentlyBeingUsedInProject;
    return this;
  }

  /**
   * Get isCurrentlyBeingUsedInProject
   * @return isCurrentlyBeingUsedInProject
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCurrentlyBeingUsedInProject() {
    return isCurrentlyBeingUsedInProject;
  }

  public void
  setIsCurrentlyBeingUsedInProject(Boolean isCurrentlyBeingUsedInProject) {
    this.isCurrentlyBeingUsedInProject = isCurrentlyBeingUsedInProject;
  }

  public LibraryVariableSetProjectUsage projectId(String projectId) {

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

  public LibraryVariableSetProjectUsage projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public LibraryVariableSetProjectUsage projectSlug(String projectSlug) {

    this.projectSlug = projectSlug;
    return this;
  }

  /**
   * Get projectSlug
   * @return projectSlug
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }

  public LibraryVariableSetProjectUsage
  releases(List<LibraryVariableSetReleaseUsageEntry> releases) {

    this.releases = releases;
    return this;
  }

  public LibraryVariableSetProjectUsage
  addReleasesItem(LibraryVariableSetReleaseUsageEntry releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<LibraryVariableSetReleaseUsageEntry>();
    }
    this.releases.add(releasesItem);
    return this;
  }

  /**
   * Get releases
   * @return releases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LibraryVariableSetReleaseUsageEntry> getReleases() {
    return releases;
  }

  public void setReleases(List<LibraryVariableSetReleaseUsageEntry> releases) {
    this.releases = releases;
  }

  public LibraryVariableSetProjectUsage runbookSnapshots(
      List<LibraryVariableSetRunbookSnapshotUsageEntry> runbookSnapshots) {

    this.runbookSnapshots = runbookSnapshots;
    return this;
  }

  public LibraryVariableSetProjectUsage addRunbookSnapshotsItem(
      LibraryVariableSetRunbookSnapshotUsageEntry runbookSnapshotsItem) {
    if (this.runbookSnapshots == null) {
      this.runbookSnapshots =
          new ArrayList<LibraryVariableSetRunbookSnapshotUsageEntry>();
    }
    this.runbookSnapshots.add(runbookSnapshotsItem);
    return this;
  }

  /**
   * Get runbookSnapshots
   * @return runbookSnapshots
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LibraryVariableSetRunbookSnapshotUsageEntry>
  getRunbookSnapshots() {
    return runbookSnapshots;
  }

  public void setRunbookSnapshots(
      List<LibraryVariableSetRunbookSnapshotUsageEntry> runbookSnapshots) {
    this.runbookSnapshots = runbookSnapshots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVariableSetProjectUsage libraryVariableSetProjectUsage =
        (LibraryVariableSetProjectUsage)o;
    return Objects.equals(
               this.isCurrentlyBeingUsedInProject,
               libraryVariableSetProjectUsage.isCurrentlyBeingUsedInProject) &&
        Objects.equals(this.projectId,
                       libraryVariableSetProjectUsage.projectId) &&
        Objects.equals(this.projectName,
                       libraryVariableSetProjectUsage.projectName) &&
        Objects.equals(this.projectSlug,
                       libraryVariableSetProjectUsage.projectSlug) &&
        Objects.equals(this.releases,
                       libraryVariableSetProjectUsage.releases) &&
        Objects.equals(this.runbookSnapshots,
                       libraryVariableSetProjectUsage.runbookSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCurrentlyBeingUsedInProject, projectId, projectName,
                        projectSlug, releases, runbookSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVariableSetProjectUsage {\n");
    sb.append("    isCurrentlyBeingUsedInProject: ")
        .append(toIndentedString(isCurrentlyBeingUsedInProject))
        .append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    projectSlug: ")
        .append(toIndentedString(projectSlug))
        .append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("    runbookSnapshots: ")
        .append(toIndentedString(runbookSnapshots))
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
