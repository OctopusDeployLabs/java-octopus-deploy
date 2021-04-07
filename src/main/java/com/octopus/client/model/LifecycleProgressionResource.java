// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PhaseProgressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * LifecycleProgressionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LifecycleProgressionResource {
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

  public static final String SERIALIZED_NAME_NEXT_DEPLOYMENTS =
      "NextDeployments";
  @SerializedName(SERIALIZED_NAME_NEXT_DEPLOYMENTS)
  private Set<String> nextDeployments = null;

  public static final String SERIALIZED_NAME_NEXT_DEPLOYMENTS_MINIMUM_REQUIRED =
      "NextDeploymentsMinimumRequired";
  @SerializedName(SERIALIZED_NAME_NEXT_DEPLOYMENTS_MINIMUM_REQUIRED)
  private Integer nextDeploymentsMinimumRequired;

  public static final String SERIALIZED_NAME_PHASES = "Phases";
  @SerializedName(SERIALIZED_NAME_PHASES)
  private List<PhaseProgressionResource> phases = null;

  public LifecycleProgressionResource id(String id) {

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

  public LifecycleProgressionResource lastModifiedBy(String lastModifiedBy) {

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

  public LifecycleProgressionResource
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

  public LifecycleProgressionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LifecycleProgressionResource putLinksItem(String key,
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

  public LifecycleProgressionResource
  nextDeployments(Set<String> nextDeployments) {

    this.nextDeployments = nextDeployments;
    return this;
  }

  public LifecycleProgressionResource
  addNextDeploymentsItem(String nextDeploymentsItem) {
    if (this.nextDeployments == null) {
      this.nextDeployments = new LinkedHashSet<String>();
    }
    this.nextDeployments.add(nextDeploymentsItem);
    return this;
  }

  /**
   * Get nextDeployments
   * @return nextDeployments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getNextDeployments() {
    return nextDeployments;
  }

  public void setNextDeployments(Set<String> nextDeployments) {
    this.nextDeployments = nextDeployments;
  }

  public LifecycleProgressionResource
  nextDeploymentsMinimumRequired(Integer nextDeploymentsMinimumRequired) {

    this.nextDeploymentsMinimumRequired = nextDeploymentsMinimumRequired;
    return this;
  }

  /**
   * Get nextDeploymentsMinimumRequired
   * @return nextDeploymentsMinimumRequired
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNextDeploymentsMinimumRequired() {
    return nextDeploymentsMinimumRequired;
  }

  public void
  setNextDeploymentsMinimumRequired(Integer nextDeploymentsMinimumRequired) {
    this.nextDeploymentsMinimumRequired = nextDeploymentsMinimumRequired;
  }

  public LifecycleProgressionResource
  phases(List<PhaseProgressionResource> phases) {

    this.phases = phases;
    return this;
  }

  public LifecycleProgressionResource
  addPhasesItem(PhaseProgressionResource phasesItem) {
    if (this.phases == null) {
      this.phases = new ArrayList<PhaseProgressionResource>();
    }
    this.phases.add(phasesItem);
    return this;
  }

  /**
   * Get phases
   * @return phases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PhaseProgressionResource> getPhases() {
    return phases;
  }

  public void setPhases(List<PhaseProgressionResource> phases) {
    this.phases = phases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleProgressionResource lifecycleProgressionResource =
        (LifecycleProgressionResource)o;
    return Objects.equals(this.id, lifecycleProgressionResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       lifecycleProgressionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       lifecycleProgressionResource.lastModifiedOn) &&
        Objects.equals(this.links, lifecycleProgressionResource.links) &&
        Objects.equals(this.nextDeployments,
                       lifecycleProgressionResource.nextDeployments) &&
        Objects.equals(
            this.nextDeploymentsMinimumRequired,
            lifecycleProgressionResource.nextDeploymentsMinimumRequired) &&
        Objects.equals(this.phases, lifecycleProgressionResource.phases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, links,
                        nextDeployments, nextDeploymentsMinimumRequired,
                        phases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleProgressionResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nextDeployments: ")
        .append(toIndentedString(nextDeployments))
        .append("\n");
    sb.append("    nextDeploymentsMinimumRequired: ")
        .append(toIndentedString(nextDeploymentsMinimumRequired))
        .append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
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
