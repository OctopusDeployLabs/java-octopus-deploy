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
 * EventNotificationSubscriptionFilter
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EventNotificationSubscriptionFilter {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPES = "DocumentTypes";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPES)
  private Set<String> documentTypes = null;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private Set<String> environments = null;

  public static final String SERIALIZED_NAME_EVENT_AGENTS = "EventAgents";
  @SerializedName(SERIALIZED_NAME_EVENT_AGENTS)
  private Set<String> eventAgents = null;

  public static final String SERIALIZED_NAME_EVENT_CATEGORIES =
      "EventCategories";
  @SerializedName(SERIALIZED_NAME_EVENT_CATEGORIES)
  private Set<String> eventCategories = null;

  public static final String SERIALIZED_NAME_EVENT_GROUPS = "EventGroups";
  @SerializedName(SERIALIZED_NAME_EVENT_GROUPS)
  private Set<String> eventGroups = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUPS = "ProjectGroups";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUPS)
  private Set<String> projectGroups = null;

  public static final String SERIALIZED_NAME_PROJECTS = "Projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS) private Set<String> projects = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS) private Set<String> tags = null;

  public static final String SERIALIZED_NAME_TENANTS = "Tenants";
  @SerializedName(SERIALIZED_NAME_TENANTS) private Set<String> tenants = null;

  public static final String SERIALIZED_NAME_USERS = "Users";
  @SerializedName(SERIALIZED_NAME_USERS) private Set<String> users = null;

  public EventNotificationSubscriptionFilter
  documentTypes(Set<String> documentTypes) {

    this.documentTypes = documentTypes;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addDocumentTypesItem(String documentTypesItem) {
    if (this.documentTypes == null) {
      this.documentTypes = new LinkedHashSet<String>();
    }
    this.documentTypes.add(documentTypesItem);
    return this;
  }

  /**
   * Get documentTypes
   * @return documentTypes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getDocumentTypes() {
    return documentTypes;
  }

  public void setDocumentTypes(Set<String> documentTypes) {
    this.documentTypes = documentTypes;
  }

  public EventNotificationSubscriptionFilter
  environments(Set<String> environments) {

    this.environments = environments;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new LinkedHashSet<String>();
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

  public Set<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(Set<String> environments) {
    this.environments = environments;
  }

  public EventNotificationSubscriptionFilter
  eventAgents(Set<String> eventAgents) {

    this.eventAgents = eventAgents;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addEventAgentsItem(String eventAgentsItem) {
    if (this.eventAgents == null) {
      this.eventAgents = new LinkedHashSet<String>();
    }
    this.eventAgents.add(eventAgentsItem);
    return this;
  }

  /**
   * Get eventAgents
   * @return eventAgents
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEventAgents() {
    return eventAgents;
  }

  public void setEventAgents(Set<String> eventAgents) {
    this.eventAgents = eventAgents;
  }

  public EventNotificationSubscriptionFilter
  eventCategories(Set<String> eventCategories) {

    this.eventCategories = eventCategories;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addEventCategoriesItem(String eventCategoriesItem) {
    if (this.eventCategories == null) {
      this.eventCategories = new LinkedHashSet<String>();
    }
    this.eventCategories.add(eventCategoriesItem);
    return this;
  }

  /**
   * Get eventCategories
   * @return eventCategories
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEventCategories() {
    return eventCategories;
  }

  public void setEventCategories(Set<String> eventCategories) {
    this.eventCategories = eventCategories;
  }

  public EventNotificationSubscriptionFilter
  eventGroups(Set<String> eventGroups) {

    this.eventGroups = eventGroups;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addEventGroupsItem(String eventGroupsItem) {
    if (this.eventGroups == null) {
      this.eventGroups = new LinkedHashSet<String>();
    }
    this.eventGroups.add(eventGroupsItem);
    return this;
  }

  /**
   * Get eventGroups
   * @return eventGroups
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEventGroups() {
    return eventGroups;
  }

  public void setEventGroups(Set<String> eventGroups) {
    this.eventGroups = eventGroups;
  }

  public EventNotificationSubscriptionFilter
  projectGroups(Set<String> projectGroups) {

    this.projectGroups = projectGroups;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addProjectGroupsItem(String projectGroupsItem) {
    if (this.projectGroups == null) {
      this.projectGroups = new LinkedHashSet<String>();
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

  public Set<String> getProjectGroups() {
    return projectGroups;
  }

  public void setProjectGroups(Set<String> projectGroups) {
    this.projectGroups = projectGroups;
  }

  public EventNotificationSubscriptionFilter projects(Set<String> projects) {

    this.projects = projects;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new LinkedHashSet<String>();
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

  public Set<String> getProjects() {
    return projects;
  }

  public void setProjects(Set<String> projects) { this.projects = projects; }

  public EventNotificationSubscriptionFilter tags(Set<String> tags) {

    this.tags = tags;
    return this;
  }

  public EventNotificationSubscriptionFilter addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new LinkedHashSet<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTags() {
    return tags;
  }

  public void setTags(Set<String> tags) { this.tags = tags; }

  public EventNotificationSubscriptionFilter tenants(Set<String> tenants) {

    this.tenants = tenants;
    return this;
  }

  public EventNotificationSubscriptionFilter
  addTenantsItem(String tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new LinkedHashSet<String>();
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

  public Set<String> getTenants() {
    return tenants;
  }

  public void setTenants(Set<String> tenants) { this.tenants = tenants; }

  public EventNotificationSubscriptionFilter users(Set<String> users) {

    this.users = users;
    return this;
  }

  public EventNotificationSubscriptionFilter addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new LinkedHashSet<String>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getUsers() {
    return users;
  }

  public void setUsers(Set<String> users) { this.users = users; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotificationSubscriptionFilter eventNotificationSubscriptionFilter =
        (EventNotificationSubscriptionFilter)o;
    return Objects.equals(this.documentTypes,
                          eventNotificationSubscriptionFilter.documentTypes) &&
        Objects.equals(this.environments,
                       eventNotificationSubscriptionFilter.environments) &&
        Objects.equals(this.eventAgents,
                       eventNotificationSubscriptionFilter.eventAgents) &&
        Objects.equals(this.eventCategories,
                       eventNotificationSubscriptionFilter.eventCategories) &&
        Objects.equals(this.eventGroups,
                       eventNotificationSubscriptionFilter.eventGroups) &&
        Objects.equals(this.projectGroups,
                       eventNotificationSubscriptionFilter.projectGroups) &&
        Objects.equals(this.projects,
                       eventNotificationSubscriptionFilter.projects) &&
        Objects.equals(this.tags, eventNotificationSubscriptionFilter.tags) &&
        Objects.equals(this.tenants,
                       eventNotificationSubscriptionFilter.tenants) &&
        Objects.equals(this.users, eventNotificationSubscriptionFilter.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypes, environments, eventAgents,
                        eventCategories, eventGroups, projectGroups, projects,
                        tags, tenants, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotificationSubscriptionFilter {\n");
    sb.append("    documentTypes: ")
        .append(toIndentedString(documentTypes))
        .append("\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    eventAgents: ")
        .append(toIndentedString(eventAgents))
        .append("\n");
    sb.append("    eventCategories: ")
        .append(toIndentedString(eventCategories))
        .append("\n");
    sb.append("    eventGroups: ")
        .append(toIndentedString(eventGroups))
        .append("\n");
    sb.append("    projectGroups: ")
        .append(toIndentedString(projectGroups))
        .append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
