// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReferenceDataItem;
import com.octopus.client.model.RunbooksDashboardItemResource;
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
 * RunbooksProgressionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbooksProgressionResource {
  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<ReferenceDataItem> environments = null;

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

  public static final String SERIALIZED_NAME_RUNBOOK_RUNS = "RunbookRuns";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUNS)
  private Map<String, List<RunbooksDashboardItemResource>> runbookRuns = null;

  public RunbooksProgressionResource
  environments(List<ReferenceDataItem> environments) {

    this.environments = environments;
    return this;
  }

  public RunbooksProgressionResource
  addEnvironmentsItem(ReferenceDataItem environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<ReferenceDataItem>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<ReferenceDataItem> environments) {
    this.environments = environments;
  }

  public RunbooksProgressionResource id(String id) {

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

  public RunbooksProgressionResource lastModifiedBy(String lastModifiedBy) {

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

  public RunbooksProgressionResource
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

  public RunbooksProgressionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RunbooksProgressionResource putLinksItem(String key,
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

  public RunbooksProgressionResource
  runbookRuns(Map<String, List<RunbooksDashboardItemResource>> runbookRuns) {

    this.runbookRuns = runbookRuns;
    return this;
  }

  public RunbooksProgressionResource
  putRunbookRunsItem(String key,
                     List<RunbooksDashboardItemResource> runbookRunsItem) {
    if (this.runbookRuns == null) {
      this.runbookRuns =
          new HashMap<String, List<RunbooksDashboardItemResource>>();
    }
    this.runbookRuns.put(key, runbookRunsItem);
    return this;
  }

  /**
   * Get runbookRuns
   * @return runbookRuns
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<RunbooksDashboardItemResource>> getRunbookRuns() {
    return runbookRuns;
  }

  public void
  setRunbookRuns(Map<String, List<RunbooksDashboardItemResource>> runbookRuns) {
    this.runbookRuns = runbookRuns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbooksProgressionResource runbooksProgressionResource =
        (RunbooksProgressionResource)o;
    return Objects.equals(this.environments,
                          runbooksProgressionResource.environments) &&
        Objects.equals(this.id, runbooksProgressionResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       runbooksProgressionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       runbooksProgressionResource.lastModifiedOn) &&
        Objects.equals(this.links, runbooksProgressionResource.links) &&
        Objects.equals(this.runbookRuns,
                       runbooksProgressionResource.runbookRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments, id, lastModifiedBy, lastModifiedOn, links,
                        runbookRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbooksProgressionResource {\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    runbookRuns: ")
        .append(toIndentedString(runbookRuns))
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
