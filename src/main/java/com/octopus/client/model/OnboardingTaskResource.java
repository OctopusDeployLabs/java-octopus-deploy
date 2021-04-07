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
import java.util.Objects;

/**
 * OnboardingTaskResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class OnboardingTaskResource {
  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY) private String category;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "IsComplete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE) private Boolean isComplete;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED) private Boolean isEnabled;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SORT_ORDER = "SortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER) private Integer sortOrder;

  public OnboardingTaskResource category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) { this.category = category; }

  public OnboardingTaskResource isComplete(Boolean isComplete) {

    this.isComplete = isComplete;
    return this;
  }

  /**
   * Get isComplete
   * @return isComplete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsComplete() {
    return isComplete;
  }

  public void setIsComplete(Boolean isComplete) {
    this.isComplete = isComplete;
  }

  public OnboardingTaskResource isEnabled(Boolean isEnabled) {

    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }

  public OnboardingTaskResource name(String name) {

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

  public OnboardingTaskResource sortOrder(Integer sortOrder) {

    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) { this.sortOrder = sortOrder; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnboardingTaskResource onboardingTaskResource = (OnboardingTaskResource)o;
    return Objects.equals(this.category, onboardingTaskResource.category) &&
        Objects.equals(this.isComplete, onboardingTaskResource.isComplete) &&
        Objects.equals(this.isEnabled, onboardingTaskResource.isEnabled) &&
        Objects.equals(this.name, onboardingTaskResource.name) &&
        Objects.equals(this.sortOrder, onboardingTaskResource.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, isComplete, isEnabled, name, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTaskResource {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isComplete: ")
        .append(toIndentedString(isComplete))
        .append("\n");
    sb.append("    isEnabled: ")
        .append(toIndentedString(isEnabled))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortOrder: ")
        .append(toIndentedString(sortOrder))
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
