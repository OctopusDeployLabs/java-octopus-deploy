// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PhaseResource;
import com.octopus.client.model.RetentionPeriod;
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
 * LifecycleResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LifecycleResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PHASES = "Phases";
  @SerializedName(SERIALIZED_NAME_PHASES)
  private List<PhaseResource> phases = null;

  public static final String SERIALIZED_NAME_RELEASE_RETENTION_POLICY =
      "ReleaseRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_RELEASE_RETENTION_POLICY)
  private RetentionPeriod releaseRetentionPolicy;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TENTACLE_RETENTION_POLICY =
      "TentacleRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_TENTACLE_RETENTION_POLICY)
  private RetentionPeriod tentacleRetentionPolicy;

  public LifecycleResource description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LifecycleResource id(String id) {

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

  public LifecycleResource lastModifiedBy(String lastModifiedBy) {

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

  public LifecycleResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public LifecycleResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LifecycleResource putLinksItem(String key, String linksItem) {
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

  public LifecycleResource name(String name) {

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

  /**
   * Get phases
   * @return phases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PhaseResource> getPhases() {
    return phases;
  }

  public LifecycleResource
  releaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {

    this.releaseRetentionPolicy = releaseRetentionPolicy;
    return this;
  }

  /**
   * Get releaseRetentionPolicy
   * @return releaseRetentionPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getReleaseRetentionPolicy() {
    return releaseRetentionPolicy;
  }

  public void
  setReleaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {
    this.releaseRetentionPolicy = releaseRetentionPolicy;
  }

  public LifecycleResource spaceId(String spaceId) {

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

  public LifecycleResource
  tentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {

    this.tentacleRetentionPolicy = tentacleRetentionPolicy;
    return this;
  }

  /**
   * Get tentacleRetentionPolicy
   * @return tentacleRetentionPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getTentacleRetentionPolicy() {
    return tentacleRetentionPolicy;
  }

  public void
  setTentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {
    this.tentacleRetentionPolicy = tentacleRetentionPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleResource lifecycleResource = (LifecycleResource)o;
    return Objects.equals(this.description, lifecycleResource.description) &&
        Objects.equals(this.id, lifecycleResource.id) &&
        Objects.equals(this.lastModifiedBy, lifecycleResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, lifecycleResource.lastModifiedOn) &&
        Objects.equals(this.links, lifecycleResource.links) &&
        Objects.equals(this.name, lifecycleResource.name) &&
        Objects.equals(this.phases, lifecycleResource.phases) &&
        Objects.equals(this.releaseRetentionPolicy,
                       lifecycleResource.releaseRetentionPolicy) &&
        Objects.equals(this.spaceId, lifecycleResource.spaceId) &&
        Objects.equals(this.tentacleRetentionPolicy,
                       lifecycleResource.tentacleRetentionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, lastModifiedBy, lastModifiedOn, links,
                        name, phases, releaseRetentionPolicy, spaceId,
                        tentacleRetentionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
    sb.append("    releaseRetentionPolicy: ")
        .append(toIndentedString(releaseRetentionPolicy))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tentacleRetentionPolicy: ")
        .append(toIndentedString(tentacleRetentionPolicy))
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
