// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Permission;
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
 * UserRoleResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class UserRoleResource {
  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "CanBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED) private Boolean canBeDeleted;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_GRANTED_SPACE_PERMISSIONS =
      "GrantedSpacePermissions";
  @SerializedName(SERIALIZED_NAME_GRANTED_SPACE_PERMISSIONS)
  private List<Permission> grantedSpacePermissions = null;

  public static final String SERIALIZED_NAME_GRANTED_SYSTEM_PERMISSIONS =
      "GrantedSystemPermissions";
  @SerializedName(SERIALIZED_NAME_GRANTED_SYSTEM_PERMISSIONS)
  private List<Permission> grantedSystemPermissions = null;

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

  public static final String SERIALIZED_NAME_SPACE_PERMISSION_DESCRIPTIONS =
      "SpacePermissionDescriptions";
  @SerializedName(SERIALIZED_NAME_SPACE_PERMISSION_DESCRIPTIONS)
  private List<String> spacePermissionDescriptions = null;

  public static final String SERIALIZED_NAME_SUPPORTED_RESTRICTIONS =
      "SupportedRestrictions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_RESTRICTIONS)
  private List<String> supportedRestrictions = null;

  public static final String SERIALIZED_NAME_SYSTEM_PERMISSION_DESCRIPTIONS =
      "SystemPermissionDescriptions";
  @SerializedName(SERIALIZED_NAME_SYSTEM_PERMISSION_DESCRIPTIONS)
  private List<String> systemPermissionDescriptions = null;

  public UserRoleResource canBeDeleted(Boolean canBeDeleted) {

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

  public UserRoleResource description(String description) {

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

  public UserRoleResource
  grantedSpacePermissions(List<Permission> grantedSpacePermissions) {

    this.grantedSpacePermissions = grantedSpacePermissions;
    return this;
  }

  public UserRoleResource
  addGrantedSpacePermissionsItem(Permission grantedSpacePermissionsItem) {
    if (this.grantedSpacePermissions == null) {
      this.grantedSpacePermissions = new ArrayList<Permission>();
    }
    this.grantedSpacePermissions.add(grantedSpacePermissionsItem);
    return this;
  }

  /**
   * Get grantedSpacePermissions
   * @return grantedSpacePermissions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Permission> getGrantedSpacePermissions() {
    return grantedSpacePermissions;
  }

  public void
  setGrantedSpacePermissions(List<Permission> grantedSpacePermissions) {
    this.grantedSpacePermissions = grantedSpacePermissions;
  }

  public UserRoleResource
  grantedSystemPermissions(List<Permission> grantedSystemPermissions) {

    this.grantedSystemPermissions = grantedSystemPermissions;
    return this;
  }

  public UserRoleResource
  addGrantedSystemPermissionsItem(Permission grantedSystemPermissionsItem) {
    if (this.grantedSystemPermissions == null) {
      this.grantedSystemPermissions = new ArrayList<Permission>();
    }
    this.grantedSystemPermissions.add(grantedSystemPermissionsItem);
    return this;
  }

  /**
   * Get grantedSystemPermissions
   * @return grantedSystemPermissions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Permission> getGrantedSystemPermissions() {
    return grantedSystemPermissions;
  }

  public void
  setGrantedSystemPermissions(List<Permission> grantedSystemPermissions) {
    this.grantedSystemPermissions = grantedSystemPermissions;
  }

  public UserRoleResource id(String id) {

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

  public UserRoleResource lastModifiedBy(String lastModifiedBy) {

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

  public UserRoleResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public UserRoleResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public UserRoleResource putLinksItem(String key, String linksItem) {
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

  public UserRoleResource name(String name) {

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

  public UserRoleResource
  spacePermissionDescriptions(List<String> spacePermissionDescriptions) {

    this.spacePermissionDescriptions = spacePermissionDescriptions;
    return this;
  }

  public UserRoleResource
  addSpacePermissionDescriptionsItem(String spacePermissionDescriptionsItem) {
    if (this.spacePermissionDescriptions == null) {
      this.spacePermissionDescriptions = new ArrayList<String>();
    }
    this.spacePermissionDescriptions.add(spacePermissionDescriptionsItem);
    return this;
  }

  /**
   * Get spacePermissionDescriptions
   * @return spacePermissionDescriptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSpacePermissionDescriptions() {
    return spacePermissionDescriptions;
  }

  public void
  setSpacePermissionDescriptions(List<String> spacePermissionDescriptions) {
    this.spacePermissionDescriptions = spacePermissionDescriptions;
  }

  public UserRoleResource
  supportedRestrictions(List<String> supportedRestrictions) {

    this.supportedRestrictions = supportedRestrictions;
    return this;
  }

  public UserRoleResource
  addSupportedRestrictionsItem(String supportedRestrictionsItem) {
    if (this.supportedRestrictions == null) {
      this.supportedRestrictions = new ArrayList<String>();
    }
    this.supportedRestrictions.add(supportedRestrictionsItem);
    return this;
  }

  /**
   * Get supportedRestrictions
   * @return supportedRestrictions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupportedRestrictions() {
    return supportedRestrictions;
  }

  public void setSupportedRestrictions(List<String> supportedRestrictions) {
    this.supportedRestrictions = supportedRestrictions;
  }

  public UserRoleResource
  systemPermissionDescriptions(List<String> systemPermissionDescriptions) {

    this.systemPermissionDescriptions = systemPermissionDescriptions;
    return this;
  }

  public UserRoleResource
  addSystemPermissionDescriptionsItem(String systemPermissionDescriptionsItem) {
    if (this.systemPermissionDescriptions == null) {
      this.systemPermissionDescriptions = new ArrayList<String>();
    }
    this.systemPermissionDescriptions.add(systemPermissionDescriptionsItem);
    return this;
  }

  /**
   * Get systemPermissionDescriptions
   * @return systemPermissionDescriptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSystemPermissionDescriptions() {
    return systemPermissionDescriptions;
  }

  public void
  setSystemPermissionDescriptions(List<String> systemPermissionDescriptions) {
    this.systemPermissionDescriptions = systemPermissionDescriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleResource userRoleResource = (UserRoleResource)o;
    return Objects.equals(this.canBeDeleted, userRoleResource.canBeDeleted) &&
        Objects.equals(this.description, userRoleResource.description) &&
        Objects.equals(this.grantedSpacePermissions,
                       userRoleResource.grantedSpacePermissions) &&
        Objects.equals(this.grantedSystemPermissions,
                       userRoleResource.grantedSystemPermissions) &&
        Objects.equals(this.id, userRoleResource.id) &&
        Objects.equals(this.lastModifiedBy, userRoleResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, userRoleResource.lastModifiedOn) &&
        Objects.equals(this.links, userRoleResource.links) &&
        Objects.equals(this.name, userRoleResource.name) &&
        Objects.equals(this.spacePermissionDescriptions,
                       userRoleResource.spacePermissionDescriptions) &&
        Objects.equals(this.supportedRestrictions,
                       userRoleResource.supportedRestrictions) &&
        Objects.equals(this.systemPermissionDescriptions,
                       userRoleResource.systemPermissionDescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canBeDeleted, description, grantedSpacePermissions,
                        grantedSystemPermissions, id, lastModifiedBy,
                        lastModifiedOn, links, name,
                        spacePermissionDescriptions, supportedRestrictions,
                        systemPermissionDescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleResource {\n");
    sb.append("    canBeDeleted: ")
        .append(toIndentedString(canBeDeleted))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    grantedSpacePermissions: ")
        .append(toIndentedString(grantedSpacePermissions))
        .append("\n");
    sb.append("    grantedSystemPermissions: ")
        .append(toIndentedString(grantedSystemPermissions))
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
    sb.append("    spacePermissionDescriptions: ")
        .append(toIndentedString(spacePermissionDescriptions))
        .append("\n");
    sb.append("    supportedRestrictions: ")
        .append(toIndentedString(supportedRestrictions))
        .append("\n");
    sb.append("    systemPermissionDescriptions: ")
        .append(toIndentedString(systemPermissionDescriptions))
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
