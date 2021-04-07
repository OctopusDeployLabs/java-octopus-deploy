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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * TeamResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TeamResource {
  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "CanBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED) private Boolean canBeDeleted;

  public static final String SERIALIZED_NAME_CAN_BE_RENAMED = "CanBeRenamed";
  @SerializedName(SERIALIZED_NAME_CAN_BE_RENAMED) private Boolean canBeRenamed;

  public static final String SERIALIZED_NAME_CAN_CHANGE_MEMBERS =
      "CanChangeMembers";
  @SerializedName(SERIALIZED_NAME_CAN_CHANGE_MEMBERS)
  private Boolean canChangeMembers;

  public static final String SERIALIZED_NAME_CAN_CHANGE_ROLES =
      "CanChangeRoles";
  @SerializedName(SERIALIZED_NAME_CAN_CHANGE_ROLES)
  private Boolean canChangeRoles;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS =
      "ExternalSecurityGroups";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS)
  private List<NamedReferenceItem> externalSecurityGroups = null;

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

  public static final String SERIALIZED_NAME_MEMBER_USER_IDS = "MemberUserIds";
  @SerializedName(SERIALIZED_NAME_MEMBER_USER_IDS)
  private Set<String> memberUserIds = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public TeamResource canBeDeleted(Boolean canBeDeleted) {

    this.canBeDeleted = canBeDeleted;
    return this;
  }

  /**
   * Get canBeDeleted
   * @return canBeDeleted
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBeDeleted() {
    return canBeDeleted;
  }

  public void setCanBeDeleted(Boolean canBeDeleted) {
    this.canBeDeleted = canBeDeleted;
  }

  public TeamResource canBeRenamed(Boolean canBeRenamed) {

    this.canBeRenamed = canBeRenamed;
    return this;
  }

  /**
   * Get canBeRenamed
   * @return canBeRenamed
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBeRenamed() {
    return canBeRenamed;
  }

  public void setCanBeRenamed(Boolean canBeRenamed) {
    this.canBeRenamed = canBeRenamed;
  }

  public TeamResource canChangeMembers(Boolean canChangeMembers) {

    this.canChangeMembers = canChangeMembers;
    return this;
  }

  /**
   * Get canChangeMembers
   * @return canChangeMembers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanChangeMembers() {
    return canChangeMembers;
  }

  public void setCanChangeMembers(Boolean canChangeMembers) {
    this.canChangeMembers = canChangeMembers;
  }

  public TeamResource canChangeRoles(Boolean canChangeRoles) {

    this.canChangeRoles = canChangeRoles;
    return this;
  }

  /**
   * Get canChangeRoles
   * @return canChangeRoles
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanChangeRoles() {
    return canChangeRoles;
  }

  public void setCanChangeRoles(Boolean canChangeRoles) {
    this.canChangeRoles = canChangeRoles;
  }

  public TeamResource description(String description) {

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

  public TeamResource
  externalSecurityGroups(List<NamedReferenceItem> externalSecurityGroups) {

    this.externalSecurityGroups = externalSecurityGroups;
    return this;
  }

  public TeamResource
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

  public TeamResource id(String id) {

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

  public TeamResource lastModifiedBy(String lastModifiedBy) {

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

  public TeamResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public TeamResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public TeamResource putLinksItem(String key, String linksItem) {
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

  public TeamResource memberUserIds(Set<String> memberUserIds) {

    this.memberUserIds = memberUserIds;
    return this;
  }

  public TeamResource addMemberUserIdsItem(String memberUserIdsItem) {
    if (this.memberUserIds == null) {
      this.memberUserIds = new LinkedHashSet<String>();
    }
    this.memberUserIds.add(memberUserIdsItem);
    return this;
  }

  /**
   * Get memberUserIds
   * @return memberUserIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getMemberUserIds() {
    return memberUserIds;
  }

  public void setMemberUserIds(Set<String> memberUserIds) {
    this.memberUserIds = memberUserIds;
  }

  public TeamResource name(String name) {

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

  public TeamResource spaceId(String spaceId) {

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
    TeamResource teamResource = (TeamResource)o;
    return Objects.equals(this.canBeDeleted, teamResource.canBeDeleted) &&
        Objects.equals(this.canBeRenamed, teamResource.canBeRenamed) &&
        Objects.equals(this.canChangeMembers, teamResource.canChangeMembers) &&
        Objects.equals(this.canChangeRoles, teamResource.canChangeRoles) &&
        Objects.equals(this.description, teamResource.description) &&
        Objects.equals(this.externalSecurityGroups,
                       teamResource.externalSecurityGroups) &&
        Objects.equals(this.id, teamResource.id) &&
        Objects.equals(this.lastModifiedBy, teamResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, teamResource.lastModifiedOn) &&
        Objects.equals(this.links, teamResource.links) &&
        Objects.equals(this.memberUserIds, teamResource.memberUserIds) &&
        Objects.equals(this.name, teamResource.name) &&
        Objects.equals(this.spaceId, teamResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canBeDeleted, canBeRenamed, canChangeMembers,
                        canChangeRoles, description, externalSecurityGroups, id,
                        lastModifiedBy, lastModifiedOn, links, memberUserIds,
                        name, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamResource {\n");
    sb.append("    canBeDeleted: ")
        .append(toIndentedString(canBeDeleted))
        .append("\n");
    sb.append("    canBeRenamed: ")
        .append(toIndentedString(canBeRenamed))
        .append("\n");
    sb.append("    canChangeMembers: ")
        .append(toIndentedString(canChangeMembers))
        .append("\n");
    sb.append("    canChangeRoles: ")
        .append(toIndentedString(canChangeRoles))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    externalSecurityGroups: ")
        .append(toIndentedString(externalSecurityGroups))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    memberUserIds: ")
        .append(toIndentedString(memberUserIds))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
