// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.VariableResource;
import com.octopus.client.model.VariableScopeValues;
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
 * VariableSetResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariableSetResource {
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

  public static final String SERIALIZED_NAME_OWNER_ID = "OwnerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID) private String ownerId;

  public static final String SERIALIZED_NAME_SCOPE_VALUES = "ScopeValues";
  @SerializedName(SERIALIZED_NAME_SCOPE_VALUES)
  private VariableScopeValues scopeValues;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_VARIABLES = "Variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<VariableResource> variables = null;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public VariableSetResource id(String id) {

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

  public VariableSetResource lastModifiedBy(String lastModifiedBy) {

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

  public VariableSetResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public VariableSetResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public VariableSetResource putLinksItem(String key, String linksItem) {
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

  public VariableSetResource ownerId(String ownerId) {

    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) { this.ownerId = ownerId; }

  public VariableSetResource scopeValues(VariableScopeValues scopeValues) {

    this.scopeValues = scopeValues;
    return this;
  }

  /**
   * Get scopeValues
   * @return scopeValues
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariableScopeValues getScopeValues() {
    return scopeValues;
  }

  public void setScopeValues(VariableScopeValues scopeValues) {
    this.scopeValues = scopeValues;
  }

  public VariableSetResource spaceId(String spaceId) {

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

  public VariableSetResource variables(List<VariableResource> variables) {

    this.variables = variables;
    return this;
  }

  public VariableSetResource addVariablesItem(VariableResource variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<VariableResource>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VariableResource> getVariables() {
    return variables;
  }

  public void setVariables(List<VariableResource> variables) {
    this.variables = variables;
  }

  public VariableSetResource version(Integer version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableSetResource variableSetResource = (VariableSetResource)o;
    return Objects.equals(this.id, variableSetResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       variableSetResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       variableSetResource.lastModifiedOn) &&
        Objects.equals(this.links, variableSetResource.links) &&
        Objects.equals(this.ownerId, variableSetResource.ownerId) &&
        Objects.equals(this.scopeValues, variableSetResource.scopeValues) &&
        Objects.equals(this.spaceId, variableSetResource.spaceId) &&
        Objects.equals(this.variables, variableSetResource.variables) &&
        Objects.equals(this.version, variableSetResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, links, ownerId,
                        scopeValues, spaceId, variables, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableSetResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    scopeValues: ")
        .append(toIndentedString(scopeValues))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    variables: ")
        .append(toIndentedString(variables))
        .append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
