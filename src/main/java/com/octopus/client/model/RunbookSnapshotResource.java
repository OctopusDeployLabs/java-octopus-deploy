// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.SelectedPackage;
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
 * RunbookSnapshotResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookSnapshotResource {
  public static final String SERIALIZED_NAME_ASSEMBLED = "Assembled";
  @SerializedName(SERIALIZED_NAME_ASSEMBLED) private OffsetDateTime assembled;

  public static final String SERIALIZED_NAME_FROZEN_PROJECT_VARIABLE_SET_ID =
      "FrozenProjectVariableSetId";
  @SerializedName(SERIALIZED_NAME_FROZEN_PROJECT_VARIABLE_SET_ID)
  private String frozenProjectVariableSetId;

  public static final String SERIALIZED_NAME_FROZEN_RUNBOOK_PROCESS_ID =
      "FrozenRunbookProcessId";
  @SerializedName(SERIALIZED_NAME_FROZEN_RUNBOOK_PROCESS_ID)
  private String frozenRunbookProcessId;

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

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_SNAPSHOT_IDS =
      "LibraryVariableSetSnapshotIds";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_SNAPSHOT_IDS)
  private List<String> libraryVariableSetSnapshotIds = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES) private String notes;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_VARIABLE_SET_SNAPSHOT_ID =
      "ProjectVariableSetSnapshotId";
  @SerializedName(SERIALIZED_NAME_PROJECT_VARIABLE_SET_SNAPSHOT_ID)
  private String projectVariableSetSnapshotId;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_SELECTED_PACKAGES =
      "SelectedPackages";
  @SerializedName(SERIALIZED_NAME_SELECTED_PACKAGES)
  private List<SelectedPackage> selectedPackages = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public RunbookSnapshotResource assembled(OffsetDateTime assembled) {

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

  public RunbookSnapshotResource
  frozenProjectVariableSetId(String frozenProjectVariableSetId) {

    this.frozenProjectVariableSetId = frozenProjectVariableSetId;
    return this;
  }

  /**
   * Get frozenProjectVariableSetId
   * @return frozenProjectVariableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrozenProjectVariableSetId() {
    return frozenProjectVariableSetId;
  }

  public void setFrozenProjectVariableSetId(String frozenProjectVariableSetId) {
    this.frozenProjectVariableSetId = frozenProjectVariableSetId;
  }

  public RunbookSnapshotResource
  frozenRunbookProcessId(String frozenRunbookProcessId) {

    this.frozenRunbookProcessId = frozenRunbookProcessId;
    return this;
  }

  /**
   * Get frozenRunbookProcessId
   * @return frozenRunbookProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFrozenRunbookProcessId() {
    return frozenRunbookProcessId;
  }

  public void setFrozenRunbookProcessId(String frozenRunbookProcessId) {
    this.frozenRunbookProcessId = frozenRunbookProcessId;
  }

  public RunbookSnapshotResource id(String id) {

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

  public RunbookSnapshotResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbookSnapshotResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public RunbookSnapshotResource
  libraryVariableSetSnapshotIds(List<String> libraryVariableSetSnapshotIds) {

    this.libraryVariableSetSnapshotIds = libraryVariableSetSnapshotIds;
    return this;
  }

  public RunbookSnapshotResource addLibraryVariableSetSnapshotIdsItem(
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

  public RunbookSnapshotResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbookSnapshotResource putLinksItem(String key, String linksItem) {
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

  public RunbookSnapshotResource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public RunbookSnapshotResource notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) { this.notes = notes; }

  public RunbookSnapshotResource projectId(String projectId) {

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

  public RunbookSnapshotResource
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

  public RunbookSnapshotResource runbookId(String runbookId) {

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

  public RunbookSnapshotResource
  selectedPackages(List<SelectedPackage> selectedPackages) {

    this.selectedPackages = selectedPackages;
    return this;
  }

  public RunbookSnapshotResource
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

  public RunbookSnapshotResource spaceId(String spaceId) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbookSnapshotResource runbookSnapshotResource =
        (RunbookSnapshotResource)o;
    return Objects.equals(this.assembled, runbookSnapshotResource.assembled) &&
        Objects.equals(this.frozenProjectVariableSetId,
                       runbookSnapshotResource.frozenProjectVariableSetId) &&
        Objects.equals(this.frozenRunbookProcessId,
                       runbookSnapshotResource.frozenRunbookProcessId) &&
        Objects.equals(this.id, runbookSnapshotResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       runbookSnapshotResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       runbookSnapshotResource.lastModifiedOn) &&
        Objects.equals(this.libraryVariableSetSnapshotIds,
                       runbookSnapshotResource.libraryVariableSetSnapshotIds) &&
        Objects.equals(this.links, runbookSnapshotResource.links) &&
        Objects.equals(this.name, runbookSnapshotResource.name) &&
        Objects.equals(this.notes, runbookSnapshotResource.notes) &&
        Objects.equals(this.projectId, runbookSnapshotResource.projectId) &&
        Objects.equals(this.projectVariableSetSnapshotId,
                       runbookSnapshotResource.projectVariableSetSnapshotId) &&
        Objects.equals(this.runbookId, runbookSnapshotResource.runbookId) &&
        Objects.equals(this.selectedPackages,
                       runbookSnapshotResource.selectedPackages) &&
        Objects.equals(this.spaceId, runbookSnapshotResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assembled, frozenProjectVariableSetId,
                        frozenRunbookProcessId, id, lastModifiedBy,
                        lastModifiedOn, libraryVariableSetSnapshotIds, links,
                        name, notes, projectId, projectVariableSetSnapshotId,
                        runbookId, selectedPackages, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookSnapshotResource {\n");
    sb.append("    assembled: ")
        .append(toIndentedString(assembled))
        .append("\n");
    sb.append("    frozenProjectVariableSetId: ")
        .append(toIndentedString(frozenProjectVariableSetId))
        .append("\n");
    sb.append("    frozenRunbookProcessId: ")
        .append(toIndentedString(frozenRunbookProcessId))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectVariableSetSnapshotId: ")
        .append(toIndentedString(projectVariableSetSnapshotId))
        .append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    selectedPackages: ")
        .append(toIndentedString(selectedPackages))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
