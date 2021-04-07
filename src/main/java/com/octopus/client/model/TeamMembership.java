// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.NamedReferenceItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TeamMembership
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TeamMembership {
  public static final String SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS =
      "ExternalSecurityGroups";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS)
  private List<NamedReferenceItem> externalSecurityGroups = null;

  public static final String SERIALIZED_NAME_IS_DIRECTLY_ASSIGNED =
      "IsDirectlyAssigned";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTLY_ASSIGNED)
  private Boolean isDirectlyAssigned;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TEAM_ID = "TeamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID) private String teamId;

  public static final String SERIALIZED_NAME_TEAM_NAME = "TeamName";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME) private String teamName;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID) private String userId;

  public TeamMembership
  externalSecurityGroups(List<NamedReferenceItem> externalSecurityGroups) {

    this.externalSecurityGroups = externalSecurityGroups;
    return this;
  }

  public TeamMembership
  addExternalSecurityGroupsItem(NamedReferenceItem externalSecurityGroupsItem) {
    if (this.externalSecurityGroups == null) {
      this.externalSecurityGroups = new ArrayList<NamedReferenceItem>();
    }
    this.externalSecurityGroups.add(externalSecurityGroupsItem);
    return this;
  }

  /**
   * Get externalSecurityGroups
   * @return externalSecurityGroups
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NamedReferenceItem> getExternalSecurityGroups() {
    return externalSecurityGroups;
  }

  public void
  setExternalSecurityGroups(List<NamedReferenceItem> externalSecurityGroups) {
    this.externalSecurityGroups = externalSecurityGroups;
  }

  public TeamMembership isDirectlyAssigned(Boolean isDirectlyAssigned) {

    this.isDirectlyAssigned = isDirectlyAssigned;
    return this;
  }

  /**
   * Get isDirectlyAssigned
   * @return isDirectlyAssigned
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDirectlyAssigned() {
    return isDirectlyAssigned;
  }

  public void setIsDirectlyAssigned(Boolean isDirectlyAssigned) {
    this.isDirectlyAssigned = isDirectlyAssigned;
  }

  public TeamMembership spaceId(String spaceId) {

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

  public TeamMembership teamId(String teamId) {

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

  public TeamMembership teamName(String teamName) {

    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) { this.teamName = teamName; }

  public TeamMembership userId(String userId) {

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) { this.userId = userId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMembership teamMembership = (TeamMembership)o;
    return Objects.equals(this.externalSecurityGroups,
                          teamMembership.externalSecurityGroups) &&
        Objects.equals(this.isDirectlyAssigned,
                       teamMembership.isDirectlyAssigned) &&
        Objects.equals(this.spaceId, teamMembership.spaceId) &&
        Objects.equals(this.teamId, teamMembership.teamId) &&
        Objects.equals(this.teamName, teamMembership.teamName) &&
        Objects.equals(this.userId, teamMembership.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSecurityGroups, isDirectlyAssigned, spaceId,
                        teamId, teamName, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMembership {\n");
    sb.append("    externalSecurityGroups: ")
        .append(toIndentedString(externalSecurityGroups))
        .append("\n");
    sb.append("    isDirectlyAssigned: ")
        .append(toIndentedString(isDirectlyAssigned))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
