// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentActionResource;
import com.octopus.client.model.DeploymentStepCondition;
import com.octopus.client.model.DeploymentStepPackageRequirement;
import com.octopus.client.model.DeploymentStepStartTrigger;
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
 * DeploymentStepResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentStepResource {
  public static final String SERIALIZED_NAME_ACTIONS = "Actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<DeploymentActionResource> actions = null;

  public static final String SERIALIZED_NAME_CONDITION = "Condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private DeploymentStepCondition condition;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PACKAGE_REQUIREMENT =
      "PackageRequirement";
  @SerializedName(SERIALIZED_NAME_PACKAGE_REQUIREMENT)
  private DeploymentStepPackageRequirement packageRequirement;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PropertyValueResource> properties = null;

  public static final String SERIALIZED_NAME_START_TRIGGER = "StartTrigger";
  @SerializedName(SERIALIZED_NAME_START_TRIGGER)
  private DeploymentStepStartTrigger startTrigger;

  /**
   * Get actions
   * @return actions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentActionResource> getActions() {
    return actions;
  }

  public DeploymentStepResource condition(DeploymentStepCondition condition) {

    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentStepCondition getCondition() {
    return condition;
  }

  public void setCondition(DeploymentStepCondition condition) {
    this.condition = condition;
  }

  public DeploymentStepResource id(String id) {

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

  public DeploymentStepResource name(String name) {

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

  public DeploymentStepResource
  packageRequirement(DeploymentStepPackageRequirement packageRequirement) {

    this.packageRequirement = packageRequirement;
    return this;
  }

  /**
   * Get packageRequirement
   * @return packageRequirement
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentStepPackageRequirement getPackageRequirement() {
    return packageRequirement;
  }

  public void
  setPackageRequirement(DeploymentStepPackageRequirement packageRequirement) {
    this.packageRequirement = packageRequirement;
  }

  /**
   * Get properties
   * @return properties
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, PropertyValueResource> getProperties() {
    return properties;
  }

  public DeploymentStepResource
  startTrigger(DeploymentStepStartTrigger startTrigger) {

    this.startTrigger = startTrigger;
    return this;
  }

  /**
   * Get startTrigger
   * @return startTrigger
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentStepStartTrigger getStartTrigger() {
    return startTrigger;
  }

  public void setStartTrigger(DeploymentStepStartTrigger startTrigger) {
    this.startTrigger = startTrigger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentStepResource deploymentStepResource = (DeploymentStepResource)o;
    return Objects.equals(this.actions, deploymentStepResource.actions) &&
        Objects.equals(this.condition, deploymentStepResource.condition) &&
        Objects.equals(this.id, deploymentStepResource.id) &&
        Objects.equals(this.name, deploymentStepResource.name) &&
        Objects.equals(this.packageRequirement,
                       deploymentStepResource.packageRequirement) &&
        Objects.equals(this.properties, deploymentStepResource.properties) &&
        Objects.equals(this.startTrigger, deploymentStepResource.startTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, id, name, packageRequirement,
                        properties, startTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentStepResource {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ")
        .append(toIndentedString(condition))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageRequirement: ")
        .append(toIndentedString(packageRequirement))
        .append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
        .append("\n");
    sb.append("    startTrigger: ")
        .append(toIndentedString(startTrigger))
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
