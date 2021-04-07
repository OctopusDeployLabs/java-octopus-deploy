// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Permission;
import com.octopus.client.model.ProjectedTeamReferenceDataItem;
import com.octopus.client.model.UserPermissionSetResourceSpacePermissions;
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
 * UserPermissionSetResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class UserPermissionSetResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_PERMISSIONS_COMPLETE =
      "IsPermissionsComplete";
  @SerializedName(SERIALIZED_NAME_IS_PERMISSIONS_COMPLETE)
  private Boolean isPermissionsComplete;

  public static final String SERIALIZED_NAME_IS_TEAMS_COMPLETE =
      "IsTeamsComplete";
  @SerializedName(SERIALIZED_NAME_IS_TEAMS_COMPLETE)
  private Boolean isTeamsComplete;

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

  public static final String SERIALIZED_NAME_SPACE_PERMISSIONS =
      "SpacePermissions";
  @SerializedName(SERIALIZED_NAME_SPACE_PERMISSIONS)
  private UserPermissionSetResourceSpacePermissions spacePermissions;

  public static final String SERIALIZED_NAME_SYSTEM_PERMISSIONS =
      "SystemPermissions";
  @SerializedName(SERIALIZED_NAME_SYSTEM_PERMISSIONS)
  private List<Permission> systemPermissions = null;

  public static final String SERIALIZED_NAME_TEAMS = "Teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<ProjectedTeamReferenceDataItem> teams = null;

  public UserPermissionSetResource id(String id) {

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

  public UserPermissionSetResource
  isPermissionsComplete(Boolean isPermissionsComplete) {

    this.isPermissionsComplete = isPermissionsComplete;
    return this;
  }

  /**
   * Get isPermissionsComplete
   * @return isPermissionsComplete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPermissionsComplete() {
    return isPermissionsComplete;
  }

  public void setIsPermissionsComplete(Boolean isPermissionsComplete) {
    this.isPermissionsComplete = isPermissionsComplete;
  }

  public UserPermissionSetResource isTeamsComplete(Boolean isTeamsComplete) {

    this.isTeamsComplete = isTeamsComplete;
    return this;
  }

  /**
   * Get isTeamsComplete
   * @return isTeamsComplete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsTeamsComplete() {
    return isTeamsComplete;
  }

  public void setIsTeamsComplete(Boolean isTeamsComplete) {
    this.isTeamsComplete = isTeamsComplete;
  }

  public UserPermissionSetResource lastModifiedBy(String lastModifiedBy) {

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

  public UserPermissionSetResource
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

  public UserPermissionSetResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public UserPermissionSetResource putLinksItem(String key, String linksItem) {
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

  public UserPermissionSetResource
  spacePermissions(UserPermissionSetResourceSpacePermissions spacePermissions) {

    this.spacePermissions = spacePermissions;
    return this;
  }

  /**
   * Get spacePermissions
   * @return spacePermissions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserPermissionSetResourceSpacePermissions getSpacePermissions() {
    return spacePermissions;
  }

  public void setSpacePermissions(
      UserPermissionSetResourceSpacePermissions spacePermissions) {
    this.spacePermissions = spacePermissions;
  }

  public UserPermissionSetResource
  systemPermissions(List<Permission> systemPermissions) {

    this.systemPermissions = systemPermissions;
    return this;
  }

  public UserPermissionSetResource
  addSystemPermissionsItem(Permission systemPermissionsItem) {
    if (this.systemPermissions == null) {
      this.systemPermissions = new ArrayList<Permission>();
    }
    this.systemPermissions.add(systemPermissionsItem);
    return this;
  }

  /**
   * Get systemPermissions
   * @return systemPermissions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Permission> getSystemPermissions() {
    return systemPermissions;
  }

  public void setSystemPermissions(List<Permission> systemPermissions) {
    this.systemPermissions = systemPermissions;
  }

  public UserPermissionSetResource
  teams(List<ProjectedTeamReferenceDataItem> teams) {

    this.teams = teams;
    return this;
  }

  public UserPermissionSetResource
  addTeamsItem(ProjectedTeamReferenceDataItem teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<ProjectedTeamReferenceDataItem>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProjectedTeamReferenceDataItem> getTeams() {
    return teams;
  }

  public void setTeams(List<ProjectedTeamReferenceDataItem> teams) {
    this.teams = teams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermissionSetResource userPermissionSetResource =
        (UserPermissionSetResource)o;
    return Objects.equals(this.id, userPermissionSetResource.id) &&
        Objects.equals(this.isPermissionsComplete,
                       userPermissionSetResource.isPermissionsComplete) &&
        Objects.equals(this.isTeamsComplete,
                       userPermissionSetResource.isTeamsComplete) &&
        Objects.equals(this.lastModifiedBy,
                       userPermissionSetResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       userPermissionSetResource.lastModifiedOn) &&
        Objects.equals(this.links, userPermissionSetResource.links) &&
        Objects.equals(this.spacePermissions,
                       userPermissionSetResource.spacePermissions) &&
        Objects.equals(this.systemPermissions,
                       userPermissionSetResource.systemPermissions) &&
        Objects.equals(this.teams, userPermissionSetResource.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isPermissionsComplete, isTeamsComplete,
                        lastModifiedBy, lastModifiedOn, links, spacePermissions,
                        systemPermissions, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissionSetResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPermissionsComplete: ")
        .append(toIndentedString(isPermissionsComplete))
        .append("\n");
    sb.append("    isTeamsComplete: ")
        .append(toIndentedString(isTeamsComplete))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    spacePermissions: ")
        .append(toIndentedString(spacePermissions))
        .append("\n");
    sb.append("    systemPermissions: ")
        .append(toIndentedString(systemPermissions))
        .append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
