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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * MissingVariableResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MissingVariableResource {
  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "EnvironmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID) private String environmentId;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID =
      "LibraryVariableSetId";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID)
  private String libraryVariableSetId;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_VARIABLE_TEMPLATE_ID =
      "VariableTemplateId";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TEMPLATE_ID)
  private String variableTemplateId;

  public static final String SERIALIZED_NAME_VARIABLE_TEMPLATE_NAME =
      "VariableTemplateName";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TEMPLATE_NAME)
  private String variableTemplateName;

  public MissingVariableResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  /**
   * Get environmentId
   * @return environmentId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public MissingVariableResource
  libraryVariableSetId(String libraryVariableSetId) {

    this.libraryVariableSetId = libraryVariableSetId;
    return this;
  }

  /**
   * Get libraryVariableSetId
   * @return libraryVariableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLibraryVariableSetId() {
    return libraryVariableSetId;
  }

  public void setLibraryVariableSetId(String libraryVariableSetId) {
    this.libraryVariableSetId = libraryVariableSetId;
  }

  public MissingVariableResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public MissingVariableResource putLinksItem(String key, String linksItem) {
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

  public MissingVariableResource projectId(String projectId) {

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

  public MissingVariableResource variableTemplateId(String variableTemplateId) {

    this.variableTemplateId = variableTemplateId;
    return this;
  }

  /**
   * Get variableTemplateId
   * @return variableTemplateId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariableTemplateId() {
    return variableTemplateId;
  }

  public void setVariableTemplateId(String variableTemplateId) {
    this.variableTemplateId = variableTemplateId;
  }

  public MissingVariableResource
  variableTemplateName(String variableTemplateName) {

    this.variableTemplateName = variableTemplateName;
    return this;
  }

  /**
   * Get variableTemplateName
   * @return variableTemplateName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariableTemplateName() {
    return variableTemplateName;
  }

  public void setVariableTemplateName(String variableTemplateName) {
    this.variableTemplateName = variableTemplateName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingVariableResource missingVariableResource =
        (MissingVariableResource)o;
    return Objects.equals(this.environmentId,
                          missingVariableResource.environmentId) &&
        Objects.equals(this.libraryVariableSetId,
                       missingVariableResource.libraryVariableSetId) &&
        Objects.equals(this.links, missingVariableResource.links) &&
        Objects.equals(this.projectId, missingVariableResource.projectId) &&
        Objects.equals(this.variableTemplateId,
                       missingVariableResource.variableTemplateId) &&
        Objects.equals(this.variableTemplateName,
                       missingVariableResource.variableTemplateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, libraryVariableSetId, links, projectId,
                        variableTemplateId, variableTemplateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingVariableResource {\n");
    sb.append("    environmentId: ")
        .append(toIndentedString(environmentId))
        .append("\n");
    sb.append("    libraryVariableSetId: ")
        .append(toIndentedString(libraryVariableSetId))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    variableTemplateId: ")
        .append(toIndentedString(variableTemplateId))
        .append("\n");
    sb.append("    variableTemplateName: ")
        .append(toIndentedString(variableTemplateName))
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
