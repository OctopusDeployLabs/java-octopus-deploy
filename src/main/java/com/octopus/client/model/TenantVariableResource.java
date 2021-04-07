// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Library;
import com.octopus.client.model.Project;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * TenantVariableResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TenantVariableResource {
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

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLES =
      "LibraryVariables";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLES)
  private Map<String, Library> libraryVariables = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_VARIABLES =
      "ProjectVariables";
  @SerializedName(SERIALIZED_NAME_PROJECT_VARIABLES)
  private Map<String, Project> projectVariables = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  public static final String SERIALIZED_NAME_TENANT_NAME = "TenantName";
  @SerializedName(SERIALIZED_NAME_TENANT_NAME) private String tenantName;

  public TenantVariableResource id(String id) {

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

  public TenantVariableResource lastModifiedBy(String lastModifiedBy) {

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

  public TenantVariableResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public TenantVariableResource
  libraryVariables(Map<String, Library> libraryVariables) {

    this.libraryVariables = libraryVariables;
    return this;
  }

  public TenantVariableResource
  putLibraryVariablesItem(String key, Library libraryVariablesItem) {
    if (this.libraryVariables == null) {
      this.libraryVariables = new HashMap<String, Library>();
    }
    this.libraryVariables.put(key, libraryVariablesItem);
    return this;
  }

  /**
   * Get libraryVariables
   * @return libraryVariables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Library> getLibraryVariables() {
    return libraryVariables;
  }

  public void setLibraryVariables(Map<String, Library> libraryVariables) {
    this.libraryVariables = libraryVariables;
  }

  public TenantVariableResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public TenantVariableResource putLinksItem(String key, String linksItem) {
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

  public TenantVariableResource
  projectVariables(Map<String, Project> projectVariables) {

    this.projectVariables = projectVariables;
    return this;
  }

  public TenantVariableResource
  putProjectVariablesItem(String key, Project projectVariablesItem) {
    if (this.projectVariables == null) {
      this.projectVariables = new HashMap<String, Project>();
    }
    this.projectVariables.put(key, projectVariablesItem);
    return this;
  }

  /**
   * Get projectVariables
   * @return projectVariables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Project> getProjectVariables() {
    return projectVariables;
  }

  public void setProjectVariables(Map<String, Project> projectVariables) {
    this.projectVariables = projectVariables;
  }

  public TenantVariableResource spaceId(String spaceId) {

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

  public TenantVariableResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) { this.tenantId = tenantId; }

  public TenantVariableResource tenantName(String tenantName) {

    this.tenantName = tenantName;
    return this;
  }

  /**
   * Get tenantName
   * @return tenantName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) { this.tenantName = tenantName; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantVariableResource tenantVariableResource = (TenantVariableResource)o;
    return Objects.equals(this.id, tenantVariableResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       tenantVariableResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       tenantVariableResource.lastModifiedOn) &&
        Objects.equals(this.libraryVariables,
                       tenantVariableResource.libraryVariables) &&
        Objects.equals(this.links, tenantVariableResource.links) &&
        Objects.equals(this.projectVariables,
                       tenantVariableResource.projectVariables) &&
        Objects.equals(this.spaceId, tenantVariableResource.spaceId) &&
        Objects.equals(this.tenantId, tenantVariableResource.tenantId) &&
        Objects.equals(this.tenantName, tenantVariableResource.tenantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, libraryVariables,
                        links, projectVariables, spaceId, tenantId, tenantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantVariableResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    libraryVariables: ")
        .append(toIndentedString(libraryVariables))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectVariables: ")
        .append(toIndentedString(projectVariables))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ")
        .append(toIndentedString(tenantName))
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
