// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DashboardEnvironmentResource;
import com.octopus.client.model.DashboardItemResource;
import com.octopus.client.model.DashboardProjectGroupResource;
import com.octopus.client.model.DashboardProjectResource;
import com.octopus.client.model.DashboardTenantResource;
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
 * DashboardResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DashboardResource {
  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<DashboardEnvironmentResource> environments = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_FILTERED = "IsFiltered";
  @SerializedName(SERIALIZED_NAME_IS_FILTERED) private Boolean isFiltered;

  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<DashboardItemResource> items = null;

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

  public static final String SERIALIZED_NAME_PREVIOUS_ITEMS = "PreviousItems";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ITEMS)
  private List<DashboardItemResource> previousItems = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUPS = "ProjectGroups";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUPS)
  private List<DashboardProjectGroupResource> projectGroups = null;

  public static final String SERIALIZED_NAME_PROJECT_LIMIT = "ProjectLimit";
  @SerializedName(SERIALIZED_NAME_PROJECT_LIMIT) private Integer projectLimit;

  public static final String SERIALIZED_NAME_PROJECTS = "Projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<DashboardProjectResource> projects = null;

  public static final String SERIALIZED_NAME_TENANTS = "Tenants";
  @SerializedName(SERIALIZED_NAME_TENANTS)
  private List<DashboardTenantResource> tenants = null;

  public DashboardResource
  environments(List<DashboardEnvironmentResource> environments) {

    this.environments = environments;
    return this;
  }

  public DashboardResource
  addEnvironmentsItem(DashboardEnvironmentResource environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<DashboardEnvironmentResource>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardEnvironmentResource> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<DashboardEnvironmentResource> environments) {
    this.environments = environments;
  }

  public DashboardResource id(String id) {

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

  public DashboardResource isFiltered(Boolean isFiltered) {

    this.isFiltered = isFiltered;
    return this;
  }

  /**
   * Get isFiltered
   * @return isFiltered
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsFiltered() {
    return isFiltered;
  }

  public void setIsFiltered(Boolean isFiltered) {
    this.isFiltered = isFiltered;
  }

  public DashboardResource items(List<DashboardItemResource> items) {

    this.items = items;
    return this;
  }

  public DashboardResource addItemsItem(DashboardItemResource itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<DashboardItemResource>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardItemResource> getItems() {
    return items;
  }

  public void setItems(List<DashboardItemResource> items) {
    this.items = items;
  }

  public DashboardResource lastModifiedBy(String lastModifiedBy) {

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

  public DashboardResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public DashboardResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DashboardResource putLinksItem(String key, String linksItem) {
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

  public DashboardResource
  previousItems(List<DashboardItemResource> previousItems) {

    this.previousItems = previousItems;
    return this;
  }

  public DashboardResource
  addPreviousItemsItem(DashboardItemResource previousItemsItem) {
    if (this.previousItems == null) {
      this.previousItems = new ArrayList<DashboardItemResource>();
    }
    this.previousItems.add(previousItemsItem);
    return this;
  }

  /**
   * Get previousItems
   * @return previousItems
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardItemResource> getPreviousItems() {
    return previousItems;
  }

  public void setPreviousItems(List<DashboardItemResource> previousItems) {
    this.previousItems = previousItems;
  }

  public DashboardResource
  projectGroups(List<DashboardProjectGroupResource> projectGroups) {

    this.projectGroups = projectGroups;
    return this;
  }

  public DashboardResource
  addProjectGroupsItem(DashboardProjectGroupResource projectGroupsItem) {
    if (this.projectGroups == null) {
      this.projectGroups = new ArrayList<DashboardProjectGroupResource>();
    }
    this.projectGroups.add(projectGroupsItem);
    return this;
  }

  /**
   * Get projectGroups
   * @return projectGroups
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardProjectGroupResource> getProjectGroups() {
    return projectGroups;
  }

  public void
  setProjectGroups(List<DashboardProjectGroupResource> projectGroups) {
    this.projectGroups = projectGroups;
  }

  public DashboardResource projectLimit(Integer projectLimit) {

    this.projectLimit = projectLimit;
    return this;
  }

  /**
   * Get projectLimit
   * @return projectLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProjectLimit() {
    return projectLimit;
  }

  public void setProjectLimit(Integer projectLimit) {
    this.projectLimit = projectLimit;
  }

  public DashboardResource projects(List<DashboardProjectResource> projects) {

    this.projects = projects;
    return this;
  }

  public DashboardResource
  addProjectsItem(DashboardProjectResource projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<DashboardProjectResource>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardProjectResource> getProjects() {
    return projects;
  }

  public void setProjects(List<DashboardProjectResource> projects) {
    this.projects = projects;
  }

  public DashboardResource tenants(List<DashboardTenantResource> tenants) {

    this.tenants = tenants;
    return this;
  }

  public DashboardResource addTenantsItem(DashboardTenantResource tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<DashboardTenantResource>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

  /**
   * Get tenants
   * @return tenants
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DashboardTenantResource> getTenants() {
    return tenants;
  }

  public void setTenants(List<DashboardTenantResource> tenants) {
    this.tenants = tenants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardResource dashboardResource = (DashboardResource)o;
    return Objects.equals(this.environments, dashboardResource.environments) &&
        Objects.equals(this.id, dashboardResource.id) &&
        Objects.equals(this.isFiltered, dashboardResource.isFiltered) &&
        Objects.equals(this.items, dashboardResource.items) &&
        Objects.equals(this.lastModifiedBy, dashboardResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, dashboardResource.lastModifiedOn) &&
        Objects.equals(this.links, dashboardResource.links) &&
        Objects.equals(this.previousItems, dashboardResource.previousItems) &&
        Objects.equals(this.projectGroups, dashboardResource.projectGroups) &&
        Objects.equals(this.projectLimit, dashboardResource.projectLimit) &&
        Objects.equals(this.projects, dashboardResource.projects) &&
        Objects.equals(this.tenants, dashboardResource.tenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environments, id, isFiltered, items, lastModifiedBy,
                        lastModifiedOn, links, previousItems, projectGroups,
                        projectLimit, projects, tenants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardResource {\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFiltered: ")
        .append(toIndentedString(isFiltered))
        .append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    previousItems: ")
        .append(toIndentedString(previousItems))
        .append("\n");
    sb.append("    projectGroups: ")
        .append(toIndentedString(projectGroups))
        .append("\n");
    sb.append("    projectLimit: ")
        .append(toIndentedString(projectLimit))
        .append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
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
