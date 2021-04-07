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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * UserPermissionRestriction
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class UserPermissionRestriction {
  public static final String SERIALIZED_NAME_RESTRICTED_TO_ENVIRONMENT_IDS =
      "RestrictedToEnvironmentIds";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_TO_ENVIRONMENT_IDS)
  private Set<String> restrictedToEnvironmentIds = null;

  public static final String SERIALIZED_NAME_RESTRICTED_TO_PROJECT_GROUP_IDS =
      "RestrictedToProjectGroupIds";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_TO_PROJECT_GROUP_IDS)
  private Set<String> restrictedToProjectGroupIds = null;

  public static final String SERIALIZED_NAME_RESTRICTED_TO_PROJECT_IDS =
      "RestrictedToProjectIds";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_TO_PROJECT_IDS)
  private Set<String> restrictedToProjectIds = null;

  public static final String SERIALIZED_NAME_RESTRICTED_TO_TENANT_IDS =
      "RestrictedToTenantIds";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_TO_TENANT_IDS)
  private Set<String> restrictedToTenantIds = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public UserPermissionRestriction
  restrictedToEnvironmentIds(Set<String> restrictedToEnvironmentIds) {

    this.restrictedToEnvironmentIds = restrictedToEnvironmentIds;
    return this;
  }

  public UserPermissionRestriction
  addRestrictedToEnvironmentIdsItem(String restrictedToEnvironmentIdsItem) {
    if (this.restrictedToEnvironmentIds == null) {
      this.restrictedToEnvironmentIds = new LinkedHashSet<String>();
    }
    this.restrictedToEnvironmentIds.add(restrictedToEnvironmentIdsItem);
    return this;
  }

  /**
   * Get restrictedToEnvironmentIds
   * @return restrictedToEnvironmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRestrictedToEnvironmentIds() {
    return restrictedToEnvironmentIds;
  }

  public void
  setRestrictedToEnvironmentIds(Set<String> restrictedToEnvironmentIds) {
    this.restrictedToEnvironmentIds = restrictedToEnvironmentIds;
  }

  public UserPermissionRestriction
  restrictedToProjectGroupIds(Set<String> restrictedToProjectGroupIds) {

    this.restrictedToProjectGroupIds = restrictedToProjectGroupIds;
    return this;
  }

  public UserPermissionRestriction
  addRestrictedToProjectGroupIdsItem(String restrictedToProjectGroupIdsItem) {
    if (this.restrictedToProjectGroupIds == null) {
      this.restrictedToProjectGroupIds = new LinkedHashSet<String>();
    }
    this.restrictedToProjectGroupIds.add(restrictedToProjectGroupIdsItem);
    return this;
  }

  /**
   * Get restrictedToProjectGroupIds
   * @return restrictedToProjectGroupIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRestrictedToProjectGroupIds() {
    return restrictedToProjectGroupIds;
  }

  public void
  setRestrictedToProjectGroupIds(Set<String> restrictedToProjectGroupIds) {
    this.restrictedToProjectGroupIds = restrictedToProjectGroupIds;
  }

  public UserPermissionRestriction
  restrictedToProjectIds(Set<String> restrictedToProjectIds) {

    this.restrictedToProjectIds = restrictedToProjectIds;
    return this;
  }

  public UserPermissionRestriction
  addRestrictedToProjectIdsItem(String restrictedToProjectIdsItem) {
    if (this.restrictedToProjectIds == null) {
      this.restrictedToProjectIds = new LinkedHashSet<String>();
    }
    this.restrictedToProjectIds.add(restrictedToProjectIdsItem);
    return this;
  }

  /**
   * Get restrictedToProjectIds
   * @return restrictedToProjectIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRestrictedToProjectIds() {
    return restrictedToProjectIds;
  }

  public void setRestrictedToProjectIds(Set<String> restrictedToProjectIds) {
    this.restrictedToProjectIds = restrictedToProjectIds;
  }

  public UserPermissionRestriction
  restrictedToTenantIds(Set<String> restrictedToTenantIds) {

    this.restrictedToTenantIds = restrictedToTenantIds;
    return this;
  }

  public UserPermissionRestriction
  addRestrictedToTenantIdsItem(String restrictedToTenantIdsItem) {
    if (this.restrictedToTenantIds == null) {
      this.restrictedToTenantIds = new LinkedHashSet<String>();
    }
    this.restrictedToTenantIds.add(restrictedToTenantIdsItem);
    return this;
  }

  /**
   * Get restrictedToTenantIds
   * @return restrictedToTenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRestrictedToTenantIds() {
    return restrictedToTenantIds;
  }

  public void setRestrictedToTenantIds(Set<String> restrictedToTenantIds) {
    this.restrictedToTenantIds = restrictedToTenantIds;
  }

  public UserPermissionRestriction spaceId(String spaceId) {

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
    UserPermissionRestriction userPermissionRestriction =
        (UserPermissionRestriction)o;
    return Objects.equals(
               this.restrictedToEnvironmentIds,
               userPermissionRestriction.restrictedToEnvironmentIds) &&
        Objects.equals(this.restrictedToProjectGroupIds,
                       userPermissionRestriction.restrictedToProjectGroupIds) &&
        Objects.equals(this.restrictedToProjectIds,
                       userPermissionRestriction.restrictedToProjectIds) &&
        Objects.equals(this.restrictedToTenantIds,
                       userPermissionRestriction.restrictedToTenantIds) &&
        Objects.equals(this.spaceId, userPermissionRestriction.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictedToEnvironmentIds, restrictedToProjectGroupIds,
                        restrictedToProjectIds, restrictedToTenantIds, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermissionRestriction {\n");
    sb.append("    restrictedToEnvironmentIds: ")
        .append(toIndentedString(restrictedToEnvironmentIds))
        .append("\n");
    sb.append("    restrictedToProjectGroupIds: ")
        .append(toIndentedString(restrictedToProjectGroupIds))
        .append("\n");
    sb.append("    restrictedToProjectIds: ")
        .append(toIndentedString(restrictedToProjectIds))
        .append("\n");
    sb.append("    restrictedToTenantIds: ")
        .append(toIndentedString(restrictedToTenantIds))
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
