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
 * ScopedUserRoleResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ScopedUserRoleResource {
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

  public static final String SERIALIZED_NAME_PROJECT_GROUP_IDS =
      "ProjectGroupIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_IDS)
  private Set<String> projectGroupIds = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "ProjectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private Set<String> projectIds = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TEAM_ID = "TeamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID) private String teamId;

  public static final String SERIALIZED_NAME_TENANT_IDS = "TenantIds";
  @SerializedName(SERIALIZED_NAME_TENANT_IDS)
  private Set<String> tenantIds = null;

  public static final String SERIALIZED_NAME_USER_ROLE_ID = "UserRoleId";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_ID) private String userRoleId;

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public ScopedUserRoleResource id(String id) {

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

  public ScopedUserRoleResource lastModifiedBy(String lastModifiedBy) {

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

  public ScopedUserRoleResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ScopedUserRoleResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ScopedUserRoleResource putLinksItem(String key, String linksItem) {
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

  /**
   * Get projectGroupIds
   * @return projectGroupIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getProjectGroupIds() {
    return projectGroupIds;
  }

  /**
   * Get projectIds
   * @return projectIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getProjectIds() {
    return projectIds;
  }

  public ScopedUserRoleResource spaceId(String spaceId) {

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

  public ScopedUserRoleResource teamId(String teamId) {

    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) { this.teamId = teamId; }

  /**
   * Get tenantIds
   * @return tenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantIds() {
    return tenantIds;
  }

  public ScopedUserRoleResource userRoleId(String userRoleId) {

    this.userRoleId = userRoleId;
    return this;
  }

  /**
   * Get userRoleId
   * @return userRoleId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserRoleId() {
    return userRoleId;
  }

  public void setUserRoleId(String userRoleId) { this.userRoleId = userRoleId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopedUserRoleResource scopedUserRoleResource = (ScopedUserRoleResource)o;
    return Objects.equals(this.environmentIds,
                          scopedUserRoleResource.environmentIds) &&
        Objects.equals(this.id, scopedUserRoleResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       scopedUserRoleResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       scopedUserRoleResource.lastModifiedOn) &&
        Objects.equals(this.links, scopedUserRoleResource.links) &&
        Objects.equals(this.projectGroupIds,
                       scopedUserRoleResource.projectGroupIds) &&
        Objects.equals(this.projectIds, scopedUserRoleResource.projectIds) &&
        Objects.equals(this.spaceId, scopedUserRoleResource.spaceId) &&
        Objects.equals(this.teamId, scopedUserRoleResource.teamId) &&
        Objects.equals(this.tenantIds, scopedUserRoleResource.tenantIds) &&
        Objects.equals(this.userRoleId, scopedUserRoleResource.userRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentIds, id, lastModifiedBy, lastModifiedOn,
                        links, projectGroupIds, projectIds, spaceId, teamId,
                        tenantIds, userRoleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopedUserRoleResource {\n");
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
    sb.append("    projectGroupIds: ")
        .append(toIndentedString(projectGroupIds))
        .append("\n");
    sb.append("    projectIds: ")
        .append(toIndentedString(projectIds))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    tenantIds: ")
        .append(toIndentedString(tenantIds))
        .append("\n");
    sb.append("    userRoleId: ")
        .append(toIndentedString(userRoleId))
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
