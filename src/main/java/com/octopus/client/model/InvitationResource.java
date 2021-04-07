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
 * InvitationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class InvitationResource {
  public static final String SERIALIZED_NAME_ADD_TO_TEAM_IDS = "AddToTeamIds";
  @SerializedName(SERIALIZED_NAME_ADD_TO_TEAM_IDS)
  private Set<String> addToTeamIds = new LinkedHashSet<String>();

  public static final String SERIALIZED_NAME_EXPIRES = "Expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES) private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_INVITATION_CODE = "InvitationCode";
  @SerializedName(SERIALIZED_NAME_INVITATION_CODE)
  private String invitationCode;

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

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public InvitationResource addToTeamIds(Set<String> addToTeamIds) {

    this.addToTeamIds = addToTeamIds;
    return this;
  }

  public InvitationResource addAddToTeamIdsItem(String addToTeamIdsItem) {
    this.addToTeamIds.add(addToTeamIdsItem);
    return this;
  }

  /**
   * Get addToTeamIds
   * @return addToTeamIds
   **/
  @ApiModelProperty(required = true, value = "")

  public Set<String> getAddToTeamIds() {
    return addToTeamIds;
  }

  public void setAddToTeamIds(Set<String> addToTeamIds) {
    this.addToTeamIds = addToTeamIds;
  }

  public InvitationResource expires(OffsetDateTime expires) {

    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) { this.expires = expires; }

  public InvitationResource id(String id) {

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

  public InvitationResource invitationCode(String invitationCode) {

    this.invitationCode = invitationCode;
    return this;
  }

  /**
   * Get invitationCode
   * @return invitationCode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInvitationCode() {
    return invitationCode;
  }

  public void setInvitationCode(String invitationCode) {
    this.invitationCode = invitationCode;
  }

  public InvitationResource lastModifiedBy(String lastModifiedBy) {

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

  public InvitationResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public InvitationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public InvitationResource putLinksItem(String key, String linksItem) {
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

  public InvitationResource spaceId(String spaceId) {

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
    InvitationResource invitationResource = (InvitationResource)o;
    return Objects.equals(this.addToTeamIds, invitationResource.addToTeamIds) &&
        Objects.equals(this.expires, invitationResource.expires) &&
        Objects.equals(this.id, invitationResource.id) &&
        Objects.equals(this.invitationCode,
                       invitationResource.invitationCode) &&
        Objects.equals(this.lastModifiedBy,
                       invitationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       invitationResource.lastModifiedOn) &&
        Objects.equals(this.links, invitationResource.links) &&
        Objects.equals(this.spaceId, invitationResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addToTeamIds, expires, id, invitationCode,
                        lastModifiedBy, lastModifiedOn, links, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationResource {\n");
    sb.append("    addToTeamIds: ")
        .append(toIndentedString(addToTeamIds))
        .append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitationCode: ")
        .append(toIndentedString(invitationCode))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
