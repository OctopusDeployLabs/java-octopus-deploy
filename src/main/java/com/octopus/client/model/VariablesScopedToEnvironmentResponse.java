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
 * VariablesScopedToEnvironmentResponse
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariablesScopedToEnvironmentResponse {
  public static final String
      SERIALIZED_NAME_HAS_UNAUTHORIZED_LIBRARY_VARIABLE_SET_VARIABLES =
          "HasUnauthorizedLibraryVariableSetVariables";
  @SerializedName(
      SERIALIZED_NAME_HAS_UNAUTHORIZED_LIBRARY_VARIABLE_SET_VARIABLES)
  private Boolean hasUnauthorizedLibraryVariableSetVariables;

  public static final String
      SERIALIZED_NAME_HAS_UNAUTHORIZED_PROJECT_VARIABLES =
          "HasUnauthorizedProjectVariables";
  @SerializedName(SERIALIZED_NAME_HAS_UNAUTHORIZED_PROJECT_VARIABLES)
  private Boolean hasUnauthorizedProjectVariables;

  public static final String SERIALIZED_NAME_VARIABLE_MAP = "VariableMap";
  @SerializedName(SERIALIZED_NAME_VARIABLE_MAP)
  private Map<String, Map<String, Integer>> variableMap = null;

  public VariablesScopedToEnvironmentResponse
  hasUnauthorizedLibraryVariableSetVariables(
      Boolean hasUnauthorizedLibraryVariableSetVariables) {

    this.hasUnauthorizedLibraryVariableSetVariables =
        hasUnauthorizedLibraryVariableSetVariables;
    return this;
  }

  /**
   * Get hasUnauthorizedLibraryVariableSetVariables
   * @return hasUnauthorizedLibraryVariableSetVariables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasUnauthorizedLibraryVariableSetVariables() {
    return hasUnauthorizedLibraryVariableSetVariables;
  }

  public void setHasUnauthorizedLibraryVariableSetVariables(
      Boolean hasUnauthorizedLibraryVariableSetVariables) {
    this.hasUnauthorizedLibraryVariableSetVariables =
        hasUnauthorizedLibraryVariableSetVariables;
  }

  public VariablesScopedToEnvironmentResponse
  hasUnauthorizedProjectVariables(Boolean hasUnauthorizedProjectVariables) {

    this.hasUnauthorizedProjectVariables = hasUnauthorizedProjectVariables;
    return this;
  }

  /**
   * Get hasUnauthorizedProjectVariables
   * @return hasUnauthorizedProjectVariables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasUnauthorizedProjectVariables() {
    return hasUnauthorizedProjectVariables;
  }

  public void
  setHasUnauthorizedProjectVariables(Boolean hasUnauthorizedProjectVariables) {
    this.hasUnauthorizedProjectVariables = hasUnauthorizedProjectVariables;
  }

  public VariablesScopedToEnvironmentResponse
  variableMap(Map<String, Map<String, Integer>> variableMap) {

    this.variableMap = variableMap;
    return this;
  }

  public VariablesScopedToEnvironmentResponse
  putVariableMapItem(String key, Map<String, Integer> variableMapItem) {
    if (this.variableMap == null) {
      this.variableMap = new HashMap<String, Map<String, Integer>>();
    }
    this.variableMap.put(key, variableMapItem);
    return this;
  }

  /**
   * Get variableMap
   * @return variableMap
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Map<String, Integer>> getVariableMap() {
    return variableMap;
  }

  public void setVariableMap(Map<String, Map<String, Integer>> variableMap) {
    this.variableMap = variableMap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariablesScopedToEnvironmentResponse variablesScopedToEnvironmentResponse =
        (VariablesScopedToEnvironmentResponse)o;
    return Objects.equals(this.hasUnauthorizedLibraryVariableSetVariables,
                          variablesScopedToEnvironmentResponse
                              .hasUnauthorizedLibraryVariableSetVariables) &&
        Objects.equals(this.hasUnauthorizedProjectVariables,
                       variablesScopedToEnvironmentResponse
                           .hasUnauthorizedProjectVariables) &&
        Objects.equals(this.variableMap,
                       variablesScopedToEnvironmentResponse.variableMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasUnauthorizedLibraryVariableSetVariables,
                        hasUnauthorizedProjectVariables, variableMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariablesScopedToEnvironmentResponse {\n");
    sb.append("    hasUnauthorizedLibraryVariableSetVariables: ")
        .append(toIndentedString(hasUnauthorizedLibraryVariableSetVariables))
        .append("\n");
    sb.append("    hasUnauthorizedProjectVariables: ")
        .append(toIndentedString(hasUnauthorizedProjectVariables))
        .append("\n");
    sb.append("    variableMap: ")
        .append(toIndentedString(variableMap))
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
