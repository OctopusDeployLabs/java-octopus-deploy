// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * ProjectGroupResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProjectGroupResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "EnvironmentIds";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
  private Set<String> environmentIds = null;

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

  public static final String SERIALIZED_NAME_RETENTION_POLICY_ID =
      "RetentionPolicyId";
  @SerializedName(SERIALIZED_NAME_RETENTION_POLICY_ID)
  private String retentionPolicyId;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public ProjectGroupResource description(String description) {

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

  public ProjectGroupResource environmentIds(Set<String> environmentIds) {

    this.environmentIds = environmentIds;
    return this;
  }

  public ProjectGroupResource addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<String>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public ProjectGroupResource id(String id) {

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

  public ProjectGroupResource lastModifiedBy(String lastModifiedBy) {

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

  public ProjectGroupResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ProjectGroupResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ProjectGroupResource putLinksItem(String key, String linksItem) {
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

  public ProjectGroupResource name(String name) {

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

  public ProjectGroupResource retentionPolicyId(String retentionPolicyId) {

    this.retentionPolicyId = retentionPolicyId;
    return this;
  }

  /**
   * Get retentionPolicyId
   * @return retentionPolicyId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRetentionPolicyId() {
    return retentionPolicyId;
  }

  public void setRetentionPolicyId(String retentionPolicyId) {
    this.retentionPolicyId = retentionPolicyId;
  }

  public ProjectGroupResource spaceId(String spaceId) {

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
    ProjectGroupResource projectGroupResource = (ProjectGroupResource)o;
    return Objects.equals(this.description, projectGroupResource.description) &&
        Objects.equals(this.environmentIds,
                       projectGroupResource.environmentIds) &&
        Objects.equals(this.id, projectGroupResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       projectGroupResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       projectGroupResource.lastModifiedOn) &&
        Objects.equals(this.links, projectGroupResource.links) &&
        Objects.equals(this.name, projectGroupResource.name) &&
        Objects.equals(this.retentionPolicyId,
                       projectGroupResource.retentionPolicyId) &&
        Objects.equals(this.spaceId, projectGroupResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, environmentIds, id, lastModifiedBy,
                        lastModifiedOn, links, name, retentionPolicyId,
                        spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectGroupResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    environmentIds: ")
        .append(toIndentedString(environmentIds))
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
    sb.append("    retentionPolicyId: ")
        .append(toIndentedString(retentionPolicyId))
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
