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
 * RunbookSnapshotTemplateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookSnapshotTemplateResource {
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

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NEXT_NAME_INCREMENT =
      "NextNameIncrement";
  @SerializedName(SERIALIZED_NAME_NEXT_NAME_INCREMENT)
  private String nextNameIncrement;

  public static final String SERIALIZED_NAME_PACKAGES = "Packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<ReleaseTemplatePackage> packages = null;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_RUNBOOK_PROCESS_ID =
      "RunbookProcessId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_PROCESS_ID)
  private String runbookProcessId;

  public RunbookSnapshotTemplateResource id(String id) {

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

  public RunbookSnapshotTemplateResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbookSnapshotTemplateResource
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

  public RunbookSnapshotTemplateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbookSnapshotTemplateResource putLinksItem(String key,
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

  public RunbookSnapshotTemplateResource
  nextNameIncrement(String nextNameIncrement) {

    this.nextNameIncrement = nextNameIncrement;
    return this;
  }

  /**
   * Get nextNameIncrement
   * @return nextNameIncrement
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextNameIncrement() {
    return nextNameIncrement;
  }

  public void setNextNameIncrement(String nextNameIncrement) {
    this.nextNameIncrement = nextNameIncrement;
  }

  public RunbookSnapshotTemplateResource
  packages(List<ReleaseTemplatePackage> packages) {

    this.packages = packages;
    return this;
  }

  public RunbookSnapshotTemplateResource
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

  public RunbookSnapshotTemplateResource runbookId(String runbookId) {

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

  public RunbookSnapshotTemplateResource
  runbookProcessId(String runbookProcessId) {

    this.runbookProcessId = runbookProcessId;
    return this;
  }

  /**
   * Get runbookProcessId
   * @return runbookProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookProcessId() {
    return runbookProcessId;
  }

  public void setRunbookProcessId(String runbookProcessId) {
    this.runbookProcessId = runbookProcessId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbookSnapshotTemplateResource runbookSnapshotTemplateResource =
        (RunbookSnapshotTemplateResource)o;
    return Objects.equals(this.id, runbookSnapshotTemplateResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       runbookSnapshotTemplateResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       runbookSnapshotTemplateResource.lastModifiedOn) &&
        Objects.equals(this.links, runbookSnapshotTemplateResource.links) &&
        Objects.equals(this.nextNameIncrement,
                       runbookSnapshotTemplateResource.nextNameIncrement) &&
        Objects.equals(this.packages,
                       runbookSnapshotTemplateResource.packages) &&
        Objects.equals(this.runbookId,
                       runbookSnapshotTemplateResource.runbookId) &&
        Objects.equals(this.runbookProcessId,
                       runbookSnapshotTemplateResource.runbookProcessId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, links,
                        nextNameIncrement, packages, runbookId,
                        runbookProcessId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookSnapshotTemplateResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nextNameIncrement: ")
        .append(toIndentedString(nextNameIncrement))
        .append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    runbookProcessId: ")
        .append(toIndentedString(runbookProcessId))
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
