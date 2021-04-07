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
 * ProjectedTeamReferenceDataItem
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProjectedTeamReferenceDataItem {
  public static final String SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS =
      "ExternalSecurityGroups";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SECURITY_GROUPS)
  private List<NamedReferenceItem> externalSecurityGroups = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DIRECTLY_ASSIGNED =
      "IsDirectlyAssigned";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTLY_ASSIGNED)
  private Boolean isDirectlyAssigned;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public ProjectedTeamReferenceDataItem
  externalSecurityGroups(List<NamedReferenceItem> externalSecurityGroups) {

    this.externalSecurityGroups = externalSecurityGroups;
    return this;
  }

  public ProjectedTeamReferenceDataItem
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

  public ProjectedTeamReferenceDataItem id(String id) {

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

  public ProjectedTeamReferenceDataItem
  isDirectlyAssigned(Boolean isDirectlyAssigned) {

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

  public ProjectedTeamReferenceDataItem name(String name) {

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

  public ProjectedTeamReferenceDataItem spaceId(String spaceId) {

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
    ProjectedTeamReferenceDataItem projectedTeamReferenceDataItem =
        (ProjectedTeamReferenceDataItem)o;
    return Objects.equals(
               this.externalSecurityGroups,
               projectedTeamReferenceDataItem.externalSecurityGroups) &&
        Objects.equals(this.id, projectedTeamReferenceDataItem.id) &&
        Objects.equals(this.isDirectlyAssigned,
                       projectedTeamReferenceDataItem.isDirectlyAssigned) &&
        Objects.equals(this.name, projectedTeamReferenceDataItem.name) &&
        Objects.equals(this.spaceId, projectedTeamReferenceDataItem.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSecurityGroups, id, isDirectlyAssigned, name,
                        spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectedTeamReferenceDataItem {\n");
    sb.append("    externalSecurityGroups: ")
        .append(toIndentedString(externalSecurityGroups))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDirectlyAssigned: ")
        .append(toIndentedString(isDirectlyAssigned))
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
