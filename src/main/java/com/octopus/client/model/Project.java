// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionTemplateParameterResource;
import com.octopus.client.model.PropertyValueResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Project
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Project {
  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_TEMPLATES = "Templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<ActionTemplateParameterResource> templates = null;

  public static final String SERIALIZED_NAME_VARIABLES = "Variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, Map<String, PropertyValueResource>> variables = null;

  public Project links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public Project putLinksItem(String key, String linksItem) {
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

  public Project projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public Project projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public Project templates(List<ActionTemplateParameterResource> templates) {

    this.templates = templates;
    return this;
  }

  public Project
  addTemplatesItem(ActionTemplateParameterResource templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<ActionTemplateParameterResource>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActionTemplateParameterResource> getTemplates() {
    return templates;
  }

  public void setTemplates(List<ActionTemplateParameterResource> templates) {
    this.templates = templates;
  }

  public Project
  variables(Map<String, Map<String, PropertyValueResource>> variables) {

    this.variables = variables;
    return this;
  }

  public Project
  putVariablesItem(String key,
                   Map<String, PropertyValueResource> variablesItem) {
    if (this.variables == null) {
      this.variables =
          new HashMap<String, Map<String, PropertyValueResource>>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Map<String, PropertyValueResource>> getVariables() {
    return variables;
  }

  public void
  setVariables(Map<String, Map<String, PropertyValueResource>> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project)o;
    return Objects.equals(this.links, project.links) &&
        Objects.equals(this.projectId, project.projectId) &&
        Objects.equals(this.projectName, project.projectName) &&
        Objects.equals(this.templates, project.templates) &&
        Objects.equals(this.variables, project.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, projectId, projectName, templates, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    templates: ")
        .append(toIndentedString(templates))
        .append("\n");
    sb.append("    variables: ")
        .append(toIndentedString(variables))
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
