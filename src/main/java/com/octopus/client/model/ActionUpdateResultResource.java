// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionUpdateOutcome;
import com.octopus.client.model.ActionUpdateRemovedPackageUsage;
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
 * ActionUpdateResultResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionUpdateResultResource {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String
      SERIALIZED_NAME_MANUAL_MERGE_REQUIRED_REASONS_BY_PROPERTY_NAME =
          "ManualMergeRequiredReasonsByPropertyName";
  @SerializedName(
      SERIALIZED_NAME_MANUAL_MERGE_REQUIRED_REASONS_BY_PROPERTY_NAME)
  private Map<String, List<String>> manualMergeRequiredReasonsByPropertyName =
      null;

  public static final String
      SERIALIZED_NAME_NAMES_OF_NEW_PARAMETERS_MISSING_DEFAULT_VALUE =
          "NamesOfNewParametersMissingDefaultValue";
  @SerializedName(SERIALIZED_NAME_NAMES_OF_NEW_PARAMETERS_MISSING_DEFAULT_VALUE)
  private List<String> namesOfNewParametersMissingDefaultValue = null;

  public static final String SERIALIZED_NAME_OUTCOME = "Outcome";
  @SerializedName(SERIALIZED_NAME_OUTCOME) private ActionUpdateOutcome outcome;

  public static final String SERIALIZED_NAME_REMOVED_PACKAGE_USAGES =
      "RemovedPackageUsages";
  @SerializedName(SERIALIZED_NAME_REMOVED_PACKAGE_USAGES)
  private List<ActionUpdateRemovedPackageUsage> removedPackageUsages = null;

  public ActionUpdateResultResource id(String id) {

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

  public ActionUpdateResultResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ActionUpdateResultResource putLinksItem(String key, String linksItem) {
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

  public ActionUpdateResultResource manualMergeRequiredReasonsByPropertyName(
      Map<String, List<String>> manualMergeRequiredReasonsByPropertyName) {

    this.manualMergeRequiredReasonsByPropertyName =
        manualMergeRequiredReasonsByPropertyName;
    return this;
  }

  public ActionUpdateResultResource
  putManualMergeRequiredReasonsByPropertyNameItem(
      String key, List<String> manualMergeRequiredReasonsByPropertyNameItem) {
    if (this.manualMergeRequiredReasonsByPropertyName == null) {
      this.manualMergeRequiredReasonsByPropertyName =
          new HashMap<String, List<String>>();
    }
    this.manualMergeRequiredReasonsByPropertyName.put(
        key, manualMergeRequiredReasonsByPropertyNameItem);
    return this;
  }

  /**
   * Get manualMergeRequiredReasonsByPropertyName
   * @return manualMergeRequiredReasonsByPropertyName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>>
  getManualMergeRequiredReasonsByPropertyName() {
    return manualMergeRequiredReasonsByPropertyName;
  }

  public void setManualMergeRequiredReasonsByPropertyName(
      Map<String, List<String>> manualMergeRequiredReasonsByPropertyName) {
    this.manualMergeRequiredReasonsByPropertyName =
        manualMergeRequiredReasonsByPropertyName;
  }

  public ActionUpdateResultResource namesOfNewParametersMissingDefaultValue(
      List<String> namesOfNewParametersMissingDefaultValue) {

    this.namesOfNewParametersMissingDefaultValue =
        namesOfNewParametersMissingDefaultValue;
    return this;
  }

  public ActionUpdateResultResource
  addNamesOfNewParametersMissingDefaultValueItem(
      String namesOfNewParametersMissingDefaultValueItem) {
    if (this.namesOfNewParametersMissingDefaultValue == null) {
      this.namesOfNewParametersMissingDefaultValue = new ArrayList<String>();
    }
    this.namesOfNewParametersMissingDefaultValue.add(
        namesOfNewParametersMissingDefaultValueItem);
    return this;
  }

  /**
   * Get namesOfNewParametersMissingDefaultValue
   * @return namesOfNewParametersMissingDefaultValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNamesOfNewParametersMissingDefaultValue() {
    return namesOfNewParametersMissingDefaultValue;
  }

  public void setNamesOfNewParametersMissingDefaultValue(
      List<String> namesOfNewParametersMissingDefaultValue) {
    this.namesOfNewParametersMissingDefaultValue =
        namesOfNewParametersMissingDefaultValue;
  }

  public ActionUpdateResultResource outcome(ActionUpdateOutcome outcome) {

    this.outcome = outcome;
    return this;
  }

  /**
   * Get outcome
   * @return outcome
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActionUpdateOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(ActionUpdateOutcome outcome) {
    this.outcome = outcome;
  }

  public ActionUpdateResultResource removedPackageUsages(
      List<ActionUpdateRemovedPackageUsage> removedPackageUsages) {

    this.removedPackageUsages = removedPackageUsages;
    return this;
  }

  public ActionUpdateResultResource addRemovedPackageUsagesItem(
      ActionUpdateRemovedPackageUsage removedPackageUsagesItem) {
    if (this.removedPackageUsages == null) {
      this.removedPackageUsages =
          new ArrayList<ActionUpdateRemovedPackageUsage>();
    }
    this.removedPackageUsages.add(removedPackageUsagesItem);
    return this;
  }

  /**
   * Get removedPackageUsages
   * @return removedPackageUsages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActionUpdateRemovedPackageUsage> getRemovedPackageUsages() {
    return removedPackageUsages;
  }

  public void setRemovedPackageUsages(
      List<ActionUpdateRemovedPackageUsage> removedPackageUsages) {
    this.removedPackageUsages = removedPackageUsages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionUpdateResultResource actionUpdateResultResource =
        (ActionUpdateResultResource)o;
    return Objects.equals(this.id, actionUpdateResultResource.id) &&
        Objects.equals(this.links, actionUpdateResultResource.links) &&
        Objects.equals(this.manualMergeRequiredReasonsByPropertyName,
                       actionUpdateResultResource
                           .manualMergeRequiredReasonsByPropertyName) &&
        Objects.equals(this.namesOfNewParametersMissingDefaultValue,
                       actionUpdateResultResource
                           .namesOfNewParametersMissingDefaultValue) &&
        Objects.equals(this.outcome, actionUpdateResultResource.outcome) &&
        Objects.equals(this.removedPackageUsages,
                       actionUpdateResultResource.removedPackageUsages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, manualMergeRequiredReasonsByPropertyName,
                        namesOfNewParametersMissingDefaultValue, outcome,
                        removedPackageUsages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionUpdateResultResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    manualMergeRequiredReasonsByPropertyName: ")
        .append(toIndentedString(manualMergeRequiredReasonsByPropertyName))
        .append("\n");
    sb.append("    namesOfNewParametersMissingDefaultValue: ")
        .append(toIndentedString(namesOfNewParametersMissingDefaultValue))
        .append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    removedPackageUsages: ")
        .append(toIndentedString(removedPackageUsages))
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
