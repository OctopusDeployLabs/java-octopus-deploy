// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LibraryVariableSetUsageEntry;
import com.octopus.client.model.ProjectVariableSetUsage;
import com.octopus.client.model.ReleaseUsage;
import com.octopus.client.model.RunbookSnapshotUsage;
import com.octopus.client.model.RunbookStepUsage;
import com.octopus.client.model.StepUsage;
import com.octopus.client.model.TargetUsageEntry;
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
 * AccountUsageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AccountUsageResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT_PROCESSES =
      "DeploymentProcesses";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROCESSES)
  private List<StepUsage> deploymentProcesses = null;

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

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SETS =
      "LibraryVariableSets";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SETS)
  private List<LibraryVariableSetUsageEntry> libraryVariableSets = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_VARIABLE_SETS =
      "ProjectVariableSets";
  @SerializedName(SERIALIZED_NAME_PROJECT_VARIABLE_SETS)
  private List<ProjectVariableSetUsage> projectVariableSets = null;

  public static final String SERIALIZED_NAME_RELEASES = "Releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<ReleaseUsage> releases = null;

  public static final String SERIALIZED_NAME_RUNBOOK_PROCESSES =
      "RunbookProcesses";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_PROCESSES)
  private List<RunbookStepUsage> runbookProcesses = null;

  public static final String SERIALIZED_NAME_RUNBOOK_SNAPSHOTS =
      "RunbookSnapshots";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_SNAPSHOTS)
  private List<RunbookSnapshotUsage> runbookSnapshots = null;

  public static final String SERIALIZED_NAME_TARGETS = "Targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private List<TargetUsageEntry> targets = null;

  public AccountUsageResource
  deploymentProcesses(List<StepUsage> deploymentProcesses) {

    this.deploymentProcesses = deploymentProcesses;
    return this;
  }

  public AccountUsageResource
  addDeploymentProcessesItem(StepUsage deploymentProcessesItem) {
    if (this.deploymentProcesses == null) {
      this.deploymentProcesses = new ArrayList<StepUsage>();
    }
    this.deploymentProcesses.add(deploymentProcessesItem);
    return this;
  }

  /**
   * Get deploymentProcesses
   * @return deploymentProcesses
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StepUsage> getDeploymentProcesses() {
    return deploymentProcesses;
  }

  public void setDeploymentProcesses(List<StepUsage> deploymentProcesses) {
    this.deploymentProcesses = deploymentProcesses;
  }

  public AccountUsageResource id(String id) {

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

  public AccountUsageResource lastModifiedBy(String lastModifiedBy) {

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

  public AccountUsageResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public AccountUsageResource
  libraryVariableSets(List<LibraryVariableSetUsageEntry> libraryVariableSets) {

    this.libraryVariableSets = libraryVariableSets;
    return this;
  }

  public AccountUsageResource addLibraryVariableSetsItem(
      LibraryVariableSetUsageEntry libraryVariableSetsItem) {
    if (this.libraryVariableSets == null) {
      this.libraryVariableSets = new ArrayList<LibraryVariableSetUsageEntry>();
    }
    this.libraryVariableSets.add(libraryVariableSetsItem);
    return this;
  }

  /**
   * Get libraryVariableSets
   * @return libraryVariableSets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LibraryVariableSetUsageEntry> getLibraryVariableSets() {
    return libraryVariableSets;
  }

  public void setLibraryVariableSets(
      List<LibraryVariableSetUsageEntry> libraryVariableSets) {
    this.libraryVariableSets = libraryVariableSets;
  }

  public AccountUsageResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public AccountUsageResource putLinksItem(String key, String linksItem) {
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

  public AccountUsageResource
  projectVariableSets(List<ProjectVariableSetUsage> projectVariableSets) {

    this.projectVariableSets = projectVariableSets;
    return this;
  }

  public AccountUsageResource
  addProjectVariableSetsItem(ProjectVariableSetUsage projectVariableSetsItem) {
    if (this.projectVariableSets == null) {
      this.projectVariableSets = new ArrayList<ProjectVariableSetUsage>();
    }
    this.projectVariableSets.add(projectVariableSetsItem);
    return this;
  }

  /**
   * Get projectVariableSets
   * @return projectVariableSets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProjectVariableSetUsage> getProjectVariableSets() {
    return projectVariableSets;
  }

  public void
  setProjectVariableSets(List<ProjectVariableSetUsage> projectVariableSets) {
    this.projectVariableSets = projectVariableSets;
  }

  public AccountUsageResource releases(List<ReleaseUsage> releases) {

    this.releases = releases;
    return this;
  }

  public AccountUsageResource addReleasesItem(ReleaseUsage releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<ReleaseUsage>();
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

  public List<ReleaseUsage> getReleases() {
    return releases;
  }

  public void setReleases(List<ReleaseUsage> releases) {
    this.releases = releases;
  }

  public AccountUsageResource
  runbookProcesses(List<RunbookStepUsage> runbookProcesses) {

    this.runbookProcesses = runbookProcesses;
    return this;
  }

  public AccountUsageResource
  addRunbookProcessesItem(RunbookStepUsage runbookProcessesItem) {
    if (this.runbookProcesses == null) {
      this.runbookProcesses = new ArrayList<RunbookStepUsage>();
    }
    this.runbookProcesses.add(runbookProcessesItem);
    return this;
  }

  /**
   * Get runbookProcesses
   * @return runbookProcesses
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RunbookStepUsage> getRunbookProcesses() {
    return runbookProcesses;
  }

  public void setRunbookProcesses(List<RunbookStepUsage> runbookProcesses) {
    this.runbookProcesses = runbookProcesses;
  }

  public AccountUsageResource
  runbookSnapshots(List<RunbookSnapshotUsage> runbookSnapshots) {

    this.runbookSnapshots = runbookSnapshots;
    return this;
  }

  public AccountUsageResource
  addRunbookSnapshotsItem(RunbookSnapshotUsage runbookSnapshotsItem) {
    if (this.runbookSnapshots == null) {
      this.runbookSnapshots = new ArrayList<RunbookSnapshotUsage>();
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

  public List<RunbookSnapshotUsage> getRunbookSnapshots() {
    return runbookSnapshots;
  }

  public void setRunbookSnapshots(List<RunbookSnapshotUsage> runbookSnapshots) {
    this.runbookSnapshots = runbookSnapshots;
  }

  public AccountUsageResource targets(List<TargetUsageEntry> targets) {

    this.targets = targets;
    return this;
  }

  public AccountUsageResource addTargetsItem(TargetUsageEntry targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetUsageEntry>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TargetUsageEntry> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetUsageEntry> targets) {
    this.targets = targets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUsageResource accountUsageResource = (AccountUsageResource)o;
    return Objects.equals(this.deploymentProcesses,
                          accountUsageResource.deploymentProcesses) &&
        Objects.equals(this.id, accountUsageResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       accountUsageResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       accountUsageResource.lastModifiedOn) &&
        Objects.equals(this.libraryVariableSets,
                       accountUsageResource.libraryVariableSets) &&
        Objects.equals(this.links, accountUsageResource.links) &&
        Objects.equals(this.projectVariableSets,
                       accountUsageResource.projectVariableSets) &&
        Objects.equals(this.releases, accountUsageResource.releases) &&
        Objects.equals(this.runbookProcesses,
                       accountUsageResource.runbookProcesses) &&
        Objects.equals(this.runbookSnapshots,
                       accountUsageResource.runbookSnapshots) &&
        Objects.equals(this.targets, accountUsageResource.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentProcesses, id, lastModifiedBy, lastModifiedOn,
                        libraryVariableSets, links, projectVariableSets,
                        releases, runbookProcesses, runbookSnapshots, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUsageResource {\n");
    sb.append("    deploymentProcesses: ")
        .append(toIndentedString(deploymentProcesses))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    libraryVariableSets: ")
        .append(toIndentedString(libraryVariableSets))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectVariableSets: ")
        .append(toIndentedString(projectVariableSets))
        .append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("    runbookProcesses: ")
        .append(toIndentedString(runbookProcesses))
        .append("\n");
    sb.append("    runbookSnapshots: ")
        .append(toIndentedString(runbookSnapshots))
        .append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
