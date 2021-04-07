// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.VariablePromptOptions;
import com.octopus.client.model.VariableResourceScope;
import com.octopus.client.model.VariableType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * VariableResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariableResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_EDITABLE = "IsEditable";
  @SerializedName(SERIALIZED_NAME_IS_EDITABLE) private Boolean isEditable;

  public static final String SERIALIZED_NAME_IS_SENSITIVE = "IsSensitive";
  @SerializedName(SERIALIZED_NAME_IS_SENSITIVE) private Boolean isSensitive;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROMPT = "Prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT) private VariablePromptOptions prompt;

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE) private VariableResourceScope scope;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private VariableType type;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE) private String value;

  public VariableResource description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VariableResource id(String id) {

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

  public VariableResource isEditable(Boolean isEditable) {

    this.isEditable = isEditable;
    return this;
  }

  /**
   * Get isEditable
   * @return isEditable
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public VariableResource isSensitive(Boolean isSensitive) {

    this.isSensitive = isSensitive;
    return this;
  }

  /**
   * Get isSensitive
   * @return isSensitive
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSensitive() {
    return isSensitive;
  }

  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public VariableResource name(String name) {

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

  public VariableResource prompt(VariablePromptOptions prompt) {

    this.prompt = prompt;
    return this;
  }

  /**
   * Get prompt
   * @return prompt
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariablePromptOptions getPrompt() {
    return prompt;
  }

  public void setPrompt(VariablePromptOptions prompt) { this.prompt = prompt; }

  public VariableResource scope(VariableResourceScope scope) {

    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariableResourceScope getScope() {
    return scope;
  }

  public void setScope(VariableResourceScope scope) { this.scope = scope; }

  public VariableResource type(VariableType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariableType getType() {
    return type;
  }

  public void setType(VariableType type) { this.type = type; }

  public VariableResource value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }

  public void setValue(String value) { this.value = value; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableResource variableResource = (VariableResource)o;
    return Objects.equals(this.description, variableResource.description) &&
        Objects.equals(this.id, variableResource.id) &&
        Objects.equals(this.isEditable, variableResource.isEditable) &&
        Objects.equals(this.isSensitive, variableResource.isSensitive) &&
        Objects.equals(this.name, variableResource.name) &&
        Objects.equals(this.prompt, variableResource.prompt) &&
        Objects.equals(this.scope, variableResource.scope) &&
        Objects.equals(this.type, variableResource.type) &&
        Objects.equals(this.value, variableResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isEditable, isSensitive, name, prompt,
                        scope, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEditable: ")
        .append(toIndentedString(isEditable))
        .append("\n");
    sb.append("    isSensitive: ")
        .append(toIndentedString(isSensitive))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
