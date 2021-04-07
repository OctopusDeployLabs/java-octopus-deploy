// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentStepResource;
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
 * RunbookProcessResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookProcessResource {
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

  public static final String SERIALIZED_NAME_LAST_SNAPSHOT_ID =
      "LastSnapshotId";
  @SerializedName(SERIALIZED_NAME_LAST_SNAPSHOT_ID)
  private String lastSnapshotId;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_STEPS = "Steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<DeploymentStepResource> steps = null;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public RunbookProcessResource id(String id) {

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

  public RunbookProcessResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbookProcessResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public RunbookProcessResource lastSnapshotId(String lastSnapshotId) {

    this.lastSnapshotId = lastSnapshotId;
    return this;
  }

  /**
   * Get lastSnapshotId
   * @return lastSnapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastSnapshotId() {
    return lastSnapshotId;
  }

  public void setLastSnapshotId(String lastSnapshotId) {
    this.lastSnapshotId = lastSnapshotId;
  }

  public RunbookProcessResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbookProcessResource putLinksItem(String key, String linksItem) {
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

  public RunbookProcessResource projectId(String projectId) {

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

  public RunbookProcessResource runbookId(String runbookId) {

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

  public RunbookProcessResource spaceId(String spaceId) {

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

  /**
   * Get steps
   * @return steps
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentStepResource> getSteps() {
    return steps;
  }

  public RunbookProcessResource version(Integer version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(required = true, value = "")

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbookProcessResource runbookProcessResource = (RunbookProcessResource)o;
    return Objects.equals(this.id, runbookProcessResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       runbookProcessResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       runbookProcessResource.lastModifiedOn) &&
        Objects.equals(this.lastSnapshotId,
                       runbookProcessResource.lastSnapshotId) &&
        Objects.equals(this.links, runbookProcessResource.links) &&
        Objects.equals(this.projectId, runbookProcessResource.projectId) &&
        Objects.equals(this.runbookId, runbookProcessResource.runbookId) &&
        Objects.equals(this.spaceId, runbookProcessResource.spaceId) &&
        Objects.equals(this.steps, runbookProcessResource.steps) &&
        Objects.equals(this.version, runbookProcessResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, lastSnapshotId,
                        links, projectId, runbookId, spaceId, steps, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookProcessResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    lastSnapshotId: ")
        .append(toIndentedString(lastSnapshotId))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
