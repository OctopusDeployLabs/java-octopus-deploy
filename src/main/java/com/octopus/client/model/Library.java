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
 * Library
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Library {
  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID =
      "LibraryVariableSetId";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID)
  private String libraryVariableSetId;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_NAME =
      "LibraryVariableSetName";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_NAME)
  private String libraryVariableSetName;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_TEMPLATES = "Templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<ActionTemplateParameterResource> templates = null;

  public static final String SERIALIZED_NAME_VARIABLES = "Variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, PropertyValueResource> variables = null;

  public Library libraryVariableSetId(String libraryVariableSetId) {

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

  public Library libraryVariableSetName(String libraryVariableSetName) {

    this.libraryVariableSetName = libraryVariableSetName;
    return this;
  }

  /**
   * Get libraryVariableSetName
   * @return libraryVariableSetName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLibraryVariableSetName() {
    return libraryVariableSetName;
  }

  public void setLibraryVariableSetName(String libraryVariableSetName) {
    this.libraryVariableSetName = libraryVariableSetName;
  }

  public Library links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public Library putLinksItem(String key, String linksItem) {
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

  public Library templates(List<ActionTemplateParameterResource> templates) {

    this.templates = templates;
    return this;
  }

  public Library
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

  public Library variables(Map<String, PropertyValueResource> variables) {

    this.variables = variables;
    return this;
  }

  public Library putVariablesItem(String key,
                                  PropertyValueResource variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, PropertyValueResource>();
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

  public Map<String, PropertyValueResource> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, PropertyValueResource> variables) {
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
    Library library = (Library)o;
    return Objects.equals(this.libraryVariableSetId,
                          library.libraryVariableSetId) &&
        Objects.equals(this.libraryVariableSetName,
                       library.libraryVariableSetName) &&
        Objects.equals(this.links, library.links) &&
        Objects.equals(this.templates, library.templates) &&
        Objects.equals(this.variables, library.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryVariableSetId, libraryVariableSetName, links,
                        templates, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Library {\n");
    sb.append("    libraryVariableSetId: ")
        .append(toIndentedString(libraryVariableSetId))
        .append("\n");
    sb.append("    libraryVariableSetName: ")
        .append(toIndentedString(libraryVariableSetName))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
