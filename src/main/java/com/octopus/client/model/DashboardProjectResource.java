// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.TenantedDeploymentMode;
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
 * DashboardProjectResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DashboardProjectResource {
  public static final String SERIALIZED_NAME_CAN_PERFORM_UNTENANTED_DEPLOYMENT =
      "CanPerformUntenantedDeployment";
  @SerializedName(SERIALIZED_NAME_CAN_PERFORM_UNTENANTED_DEPLOYMENT)
  private Boolean canPerformUntenantedDeployment;

  public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "EnvironmentIds";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
  private Set<String> environmentIds = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

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

  public static final String SERIALIZED_NAME_PROJECT_GROUP_ID =
      "ProjectGroupId";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_ID)
  private String projectGroupId;

  public static final String SERIALIZED_NAME_SLUG = "Slug";
  @SerializedName(SERIALIZED_NAME_SLUG) private String slug;

  public static final String SERIALIZED_NAME_TENANTED_DEPLOYMENT_MODE =
      "TenantedDeploymentMode";
  @SerializedName(SERIALIZED_NAME_TENANTED_DEPLOYMENT_MODE)
  private TenantedDeploymentMode tenantedDeploymentMode;

  public DashboardProjectResource
  canPerformUntenantedDeployment(Boolean canPerformUntenantedDeployment) {

    this.canPerformUntenantedDeployment = canPerformUntenantedDeployment;
    return this;
  }

  /**
   * Get canPerformUntenantedDeployment
   * @return canPerformUntenantedDeployment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanPerformUntenantedDeployment() {
    return canPerformUntenantedDeployment;
  }

  public void
  setCanPerformUntenantedDeployment(Boolean canPerformUntenantedDeployment) {
    this.canPerformUntenantedDeployment = canPerformUntenantedDeployment;
  }

  public DashboardProjectResource environmentIds(Set<String> environmentIds) {

    this.environmentIds = environmentIds;
    return this;
  }

  public DashboardProjectResource
  addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<String>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public DashboardProjectResource id(String id) {

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

  public DashboardProjectResource isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public DashboardProjectResource lastModifiedBy(String lastModifiedBy) {

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

  public DashboardProjectResource
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

  public DashboardProjectResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DashboardProjectResource putLinksItem(String key, String linksItem) {
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

  public DashboardProjectResource name(String name) {

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

  public DashboardProjectResource projectGroupId(String projectGroupId) {

    this.projectGroupId = projectGroupId;
    return this;
  }

  /**
   * Get projectGroupId
   * @return projectGroupId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectGroupId() {
    return projectGroupId;
  }

  public void setProjectGroupId(String projectGroupId) {
    this.projectGroupId = projectGroupId;
  }

  public DashboardProjectResource slug(String slug) {

    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) { this.slug = slug; }

  public DashboardProjectResource
  tenantedDeploymentMode(TenantedDeploymentMode tenantedDeploymentMode) {

    this.tenantedDeploymentMode = tenantedDeploymentMode;
    return this;
  }

  /**
   * Get tenantedDeploymentMode
   * @return tenantedDeploymentMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getTenantedDeploymentMode() {
    return tenantedDeploymentMode;
  }

  public void
  setTenantedDeploymentMode(TenantedDeploymentMode tenantedDeploymentMode) {
    this.tenantedDeploymentMode = tenantedDeploymentMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardProjectResource dashboardProjectResource =
        (DashboardProjectResource)o;
    return Objects.equals(
               this.canPerformUntenantedDeployment,
               dashboardProjectResource.canPerformUntenantedDeployment) &&
        Objects.equals(this.environmentIds,
                       dashboardProjectResource.environmentIds) &&
        Objects.equals(this.id, dashboardProjectResource.id) &&
        Objects.equals(this.isDisabled, dashboardProjectResource.isDisabled) &&
        Objects.equals(this.lastModifiedBy,
                       dashboardProjectResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       dashboardProjectResource.lastModifiedOn) &&
        Objects.equals(this.links, dashboardProjectResource.links) &&
        Objects.equals(this.name, dashboardProjectResource.name) &&
        Objects.equals(this.projectGroupId,
                       dashboardProjectResource.projectGroupId) &&
        Objects.equals(this.slug, dashboardProjectResource.slug) &&
        Objects.equals(this.tenantedDeploymentMode,
                       dashboardProjectResource.tenantedDeploymentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPerformUntenantedDeployment, environmentIds, id,
                        isDisabled, lastModifiedBy, lastModifiedOn, links, name,
                        projectGroupId, slug, tenantedDeploymentMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardProjectResource {\n");
    sb.append("    canPerformUntenantedDeployment: ")
        .append(toIndentedString(canPerformUntenantedDeployment))
        .append("\n");
    sb.append("    environmentIds: ")
        .append(toIndentedString(environmentIds))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectGroupId: ")
        .append(toIndentedString(projectGroupId))
        .append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tenantedDeploymentMode: ")
        .append(toIndentedString(tenantedDeploymentMode))
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
