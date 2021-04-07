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
 * DashboardConfigurationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DashboardConfigurationResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_INCLUDED_ENVIRONMENT_IDS =
      "IncludedEnvironmentIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_ENVIRONMENT_IDS)
  private Set<String> includedEnvironmentIds = null;

  public static final String SERIALIZED_NAME_INCLUDED_PROJECT_GROUP_IDS =
      "IncludedProjectGroupIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PROJECT_GROUP_IDS)
  private Set<String> includedProjectGroupIds = null;

  public static final String SERIALIZED_NAME_INCLUDED_PROJECT_IDS =
      "IncludedProjectIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PROJECT_IDS)
  private Set<String> includedProjectIds = null;

  public static final String SERIALIZED_NAME_INCLUDED_TENANT_IDS =
      "IncludedTenantIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_TENANT_IDS)
  private Set<String> includedTenantIds = null;

  public static final String SERIALIZED_NAME_INCLUDED_TENANT_TAGS =
      "IncludedTenantTags";
  @SerializedName(SERIALIZED_NAME_INCLUDED_TENANT_TAGS)
  private Set<String> includedTenantTags = null;

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

  public static final String SERIALIZED_NAME_PROJECT_LIMIT = "ProjectLimit";
  @SerializedName(SERIALIZED_NAME_PROJECT_LIMIT) private Integer projectLimit;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public DashboardConfigurationResource id(String id) {

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

  public DashboardConfigurationResource
  includedEnvironmentIds(Set<String> includedEnvironmentIds) {

    this.includedEnvironmentIds = includedEnvironmentIds;
    return this;
  }

  public DashboardConfigurationResource
  addIncludedEnvironmentIdsItem(String includedEnvironmentIdsItem) {
    if (this.includedEnvironmentIds == null) {
      this.includedEnvironmentIds = new LinkedHashSet<String>();
    }
    this.includedEnvironmentIds.add(includedEnvironmentIdsItem);
    return this;
  }

  /**
   * Get includedEnvironmentIds
   * @return includedEnvironmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncludedEnvironmentIds() {
    return includedEnvironmentIds;
  }

  public void setIncludedEnvironmentIds(Set<String> includedEnvironmentIds) {
    this.includedEnvironmentIds = includedEnvironmentIds;
  }

  public DashboardConfigurationResource
  includedProjectGroupIds(Set<String> includedProjectGroupIds) {

    this.includedProjectGroupIds = includedProjectGroupIds;
    return this;
  }

  public DashboardConfigurationResource
  addIncludedProjectGroupIdsItem(String includedProjectGroupIdsItem) {
    if (this.includedProjectGroupIds == null) {
      this.includedProjectGroupIds = new LinkedHashSet<String>();
    }
    this.includedProjectGroupIds.add(includedProjectGroupIdsItem);
    return this;
  }

  /**
   * Get includedProjectGroupIds
   * @return includedProjectGroupIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncludedProjectGroupIds() {
    return includedProjectGroupIds;
  }

  public void setIncludedProjectGroupIds(Set<String> includedProjectGroupIds) {
    this.includedProjectGroupIds = includedProjectGroupIds;
  }

  public DashboardConfigurationResource
  includedProjectIds(Set<String> includedProjectIds) {

    this.includedProjectIds = includedProjectIds;
    return this;
  }

  public DashboardConfigurationResource
  addIncludedProjectIdsItem(String includedProjectIdsItem) {
    if (this.includedProjectIds == null) {
      this.includedProjectIds = new LinkedHashSet<String>();
    }
    this.includedProjectIds.add(includedProjectIdsItem);
    return this;
  }

  /**
   * Get includedProjectIds
   * @return includedProjectIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncludedProjectIds() {
    return includedProjectIds;
  }

  public void setIncludedProjectIds(Set<String> includedProjectIds) {
    this.includedProjectIds = includedProjectIds;
  }

  public DashboardConfigurationResource
  includedTenantIds(Set<String> includedTenantIds) {

    this.includedTenantIds = includedTenantIds;
    return this;
  }

  public DashboardConfigurationResource
  addIncludedTenantIdsItem(String includedTenantIdsItem) {
    if (this.includedTenantIds == null) {
      this.includedTenantIds = new LinkedHashSet<String>();
    }
    this.includedTenantIds.add(includedTenantIdsItem);
    return this;
  }

  /**
   * Get includedTenantIds
   * @return includedTenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncludedTenantIds() {
    return includedTenantIds;
  }

  public void setIncludedTenantIds(Set<String> includedTenantIds) {
    this.includedTenantIds = includedTenantIds;
  }

  public DashboardConfigurationResource
  includedTenantTags(Set<String> includedTenantTags) {

    this.includedTenantTags = includedTenantTags;
    return this;
  }

  public DashboardConfigurationResource
  addIncludedTenantTagsItem(String includedTenantTagsItem) {
    if (this.includedTenantTags == null) {
      this.includedTenantTags = new LinkedHashSet<String>();
    }
    this.includedTenantTags.add(includedTenantTagsItem);
    return this;
  }

  /**
   * Get includedTenantTags
   * @return includedTenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncludedTenantTags() {
    return includedTenantTags;
  }

  public void setIncludedTenantTags(Set<String> includedTenantTags) {
    this.includedTenantTags = includedTenantTags;
  }

  public DashboardConfigurationResource lastModifiedBy(String lastModifiedBy) {

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

  public DashboardConfigurationResource
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

  public DashboardConfigurationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DashboardConfigurationResource putLinksItem(String key,
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

  public DashboardConfigurationResource projectLimit(Integer projectLimit) {

    this.projectLimit = projectLimit;
    return this;
  }

  /**
   * Get projectLimit
   * @return projectLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProjectLimit() {
    return projectLimit;
  }

  public void setProjectLimit(Integer projectLimit) {
    this.projectLimit = projectLimit;
  }

  public DashboardConfigurationResource spaceId(String spaceId) {

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
    DashboardConfigurationResource dashboardConfigurationResource =
        (DashboardConfigurationResource)o;
    return Objects.equals(this.id, dashboardConfigurationResource.id) &&
        Objects.equals(this.includedEnvironmentIds,
                       dashboardConfigurationResource.includedEnvironmentIds) &&
        Objects.equals(
            this.includedProjectGroupIds,
            dashboardConfigurationResource.includedProjectGroupIds) &&
        Objects.equals(this.includedProjectIds,
                       dashboardConfigurationResource.includedProjectIds) &&
        Objects.equals(this.includedTenantIds,
                       dashboardConfigurationResource.includedTenantIds) &&
        Objects.equals(this.includedTenantTags,
                       dashboardConfigurationResource.includedTenantTags) &&
        Objects.equals(this.lastModifiedBy,
                       dashboardConfigurationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       dashboardConfigurationResource.lastModifiedOn) &&
        Objects.equals(this.links, dashboardConfigurationResource.links) &&
        Objects.equals(this.projectLimit,
                       dashboardConfigurationResource.projectLimit) &&
        Objects.equals(this.spaceId, dashboardConfigurationResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, includedEnvironmentIds, includedProjectGroupIds,
                        includedProjectIds, includedTenantIds,
                        includedTenantTags, lastModifiedBy, lastModifiedOn,
                        links, projectLimit, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardConfigurationResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includedEnvironmentIds: ")
        .append(toIndentedString(includedEnvironmentIds))
        .append("\n");
    sb.append("    includedProjectGroupIds: ")
        .append(toIndentedString(includedProjectGroupIds))
        .append("\n");
    sb.append("    includedProjectIds: ")
        .append(toIndentedString(includedProjectIds))
        .append("\n");
    sb.append("    includedTenantIds: ")
        .append(toIndentedString(includedTenantIds))
        .append("\n");
    sb.append("    includedTenantTags: ")
        .append(toIndentedString(includedTenantTags))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectLimit: ")
        .append(toIndentedString(projectLimit))
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
