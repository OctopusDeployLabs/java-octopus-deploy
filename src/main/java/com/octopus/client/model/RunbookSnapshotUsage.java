// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.RunbookSnapshotUsageEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * RunbookSnapshotUsage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookSnapshotUsage {
  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_RUNBOOK_NAME = "RunbookName";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_NAME) private String runbookName;

  public static final String SERIALIZED_NAME_SNAPSHOTS = "Snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<RunbookSnapshotUsageEntry> snapshots = null;

  public RunbookSnapshotUsage projectId(String projectId) {

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

  public RunbookSnapshotUsage projectName(String projectName) {

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

  public RunbookSnapshotUsage runbookId(String runbookId) {

    this.runbookId = runbookId;
    return this;
  }

  /**
   * Get runbookId
   * @return runbookId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookId() {
    return runbookId;
  }

  public void setRunbookId(String runbookId) { this.runbookId = runbookId; }

  public RunbookSnapshotUsage runbookName(String runbookName) {

    this.runbookName = runbookName;
    return this;
  }

  /**
   * Get runbookName
   * @return runbookName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookName() {
    return runbookName;
  }

  public void setRunbookName(String runbookName) {
    this.runbookName = runbookName;
  }

  public RunbookSnapshotUsage
  snapshots(List<RunbookSnapshotUsageEntry> snapshots) {

    this.snapshots = snapshots;
    return this;
  }

  public RunbookSnapshotUsage
  addSnapshotsItem(RunbookSnapshotUsageEntry snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<RunbookSnapshotUsageEntry>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

  /**
   * Get snapshots
   * @return snapshots
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RunbookSnapshotUsageEntry> getSnapshots() {
    return snapshots;
  }

  public void setSnapshots(List<RunbookSnapshotUsageEntry> snapshots) {
    this.snapshots = snapshots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbookSnapshotUsage runbookSnapshotUsage = (RunbookSnapshotUsage)o;
    return Objects.equals(this.projectId, runbookSnapshotUsage.projectId) &&
        Objects.equals(this.projectName, runbookSnapshotUsage.projectName) &&
        Objects.equals(this.runbookId, runbookSnapshotUsage.runbookId) &&
        Objects.equals(this.runbookName, runbookSnapshotUsage.runbookName) &&
        Objects.equals(this.snapshots, runbookSnapshotUsage.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, runbookId, runbookName,
                        snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookSnapshotUsage {\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    runbookName: ")
        .append(toIndentedString(runbookName))
        .append("\n");
    sb.append("    snapshots: ")
        .append(toIndentedString(snapshots))
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
