// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MachineDeploymentPreview;
import com.octopus.client.model.ReferenceDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * DeploymentTemplateStep
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentTemplateStep {
  public static final String SERIALIZED_NAME_ACTION_ID = "ActionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID) private String actionId;

  public static final String SERIALIZED_NAME_ACTION_NAME = "ActionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME) private String actionName;

  public static final String SERIALIZED_NAME_ACTION_NUMBER = "ActionNumber";
  @SerializedName(SERIALIZED_NAME_ACTION_NUMBER) private String actionNumber;

  public static final String SERIALIZED_NAME_CAN_BE_SKIPPED = "CanBeSkipped";
  @SerializedName(SERIALIZED_NAME_CAN_BE_SKIPPED) private Boolean canBeSkipped;

  public static final String SERIALIZED_NAME_EXCLUDED_MACHINES =
      "ExcludedMachines";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_MACHINES)
  private List<ReferenceDataItem> excludedMachines = null;

  public static final String SERIALIZED_NAME_HAS_NO_APPLICABLE_MACHINES =
      "HasNoApplicableMachines";
  @SerializedName(SERIALIZED_NAME_HAS_NO_APPLICABLE_MACHINES)
  private Boolean hasNoApplicableMachines;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

  public static final String SERIALIZED_NAME_MACHINE_NAMES = "MachineNames";
  @SerializedName(SERIALIZED_NAME_MACHINE_NAMES)
  private List<String> machineNames = null;

  public static final String SERIALIZED_NAME_MACHINES = "Machines";
  @SerializedName(SERIALIZED_NAME_MACHINES)
  private List<MachineDeploymentPreview> machines = null;

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES) private List<String> roles = null;

  public static final String SERIALIZED_NAME_UNAVAILABLE_MACHINES =
      "UnavailableMachines";
  @SerializedName(SERIALIZED_NAME_UNAVAILABLE_MACHINES)
  private List<ReferenceDataItem> unavailableMachines = null;

  public DeploymentTemplateStep actionId(String actionId) {

    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) { this.actionId = actionId; }

  public DeploymentTemplateStep actionName(String actionName) {

    this.actionName = actionName;
    return this;
  }

  /**
   * Get actionName
   * @return actionName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) { this.actionName = actionName; }

  public DeploymentTemplateStep actionNumber(String actionNumber) {

    this.actionNumber = actionNumber;
    return this;
  }

  /**
   * Get actionNumber
   * @return actionNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionNumber() {
    return actionNumber;
  }

  public void setActionNumber(String actionNumber) {
    this.actionNumber = actionNumber;
  }

  public DeploymentTemplateStep canBeSkipped(Boolean canBeSkipped) {

    this.canBeSkipped = canBeSkipped;
    return this;
  }

  /**
   * Get canBeSkipped
   * @return canBeSkipped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBeSkipped() {
    return canBeSkipped;
  }

  public void setCanBeSkipped(Boolean canBeSkipped) {
    this.canBeSkipped = canBeSkipped;
  }

  public DeploymentTemplateStep
  excludedMachines(List<ReferenceDataItem> excludedMachines) {

    this.excludedMachines = excludedMachines;
    return this;
  }

  public DeploymentTemplateStep
  addExcludedMachinesItem(ReferenceDataItem excludedMachinesItem) {
    if (this.excludedMachines == null) {
      this.excludedMachines = new ArrayList<ReferenceDataItem>();
    }
    this.excludedMachines.add(excludedMachinesItem);
    return this;
  }

  /**
   * Get excludedMachines
   * @return excludedMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getExcludedMachines() {
    return excludedMachines;
  }

  public void setExcludedMachines(List<ReferenceDataItem> excludedMachines) {
    this.excludedMachines = excludedMachines;
  }

  public DeploymentTemplateStep
  hasNoApplicableMachines(Boolean hasNoApplicableMachines) {

    this.hasNoApplicableMachines = hasNoApplicableMachines;
    return this;
  }

  /**
   * Get hasNoApplicableMachines
   * @return hasNoApplicableMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasNoApplicableMachines() {
    return hasNoApplicableMachines;
  }

  public void setHasNoApplicableMachines(Boolean hasNoApplicableMachines) {
    this.hasNoApplicableMachines = hasNoApplicableMachines;
  }

  public DeploymentTemplateStep isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public DeploymentTemplateStep machineNames(List<String> machineNames) {

    this.machineNames = machineNames;
    return this;
  }

  public DeploymentTemplateStep addMachineNamesItem(String machineNamesItem) {
    if (this.machineNames == null) {
      this.machineNames = new ArrayList<String>();
    }
    this.machineNames.add(machineNamesItem);
    return this;
  }

  /**
   * Get machineNames
   * @return machineNames
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMachineNames() {
    return machineNames;
  }

  public void setMachineNames(List<String> machineNames) {
    this.machineNames = machineNames;
  }

  public DeploymentTemplateStep
  machines(List<MachineDeploymentPreview> machines) {

    this.machines = machines;
    return this;
  }

  public DeploymentTemplateStep
  addMachinesItem(MachineDeploymentPreview machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<MachineDeploymentPreview>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * Get machines
   * @return machines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MachineDeploymentPreview> getMachines() {
    return machines;
  }

  public void setMachines(List<MachineDeploymentPreview> machines) {
    this.machines = machines;
  }

  public DeploymentTemplateStep roles(List<String> roles) {

    this.roles = roles;
    return this;
  }

  public DeploymentTemplateStep addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) { this.roles = roles; }

  public DeploymentTemplateStep
  unavailableMachines(List<ReferenceDataItem> unavailableMachines) {

    this.unavailableMachines = unavailableMachines;
    return this;
  }

  public DeploymentTemplateStep
  addUnavailableMachinesItem(ReferenceDataItem unavailableMachinesItem) {
    if (this.unavailableMachines == null) {
      this.unavailableMachines = new ArrayList<ReferenceDataItem>();
    }
    this.unavailableMachines.add(unavailableMachinesItem);
    return this;
  }

  /**
   * Get unavailableMachines
   * @return unavailableMachines
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getUnavailableMachines() {
    return unavailableMachines;
  }

  public void
  setUnavailableMachines(List<ReferenceDataItem> unavailableMachines) {
    this.unavailableMachines = unavailableMachines;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTemplateStep deploymentTemplateStep = (DeploymentTemplateStep)o;
    return Objects.equals(this.actionId, deploymentTemplateStep.actionId) &&
        Objects.equals(this.actionName, deploymentTemplateStep.actionName) &&
        Objects.equals(this.actionNumber,
                       deploymentTemplateStep.actionNumber) &&
        Objects.equals(this.canBeSkipped,
                       deploymentTemplateStep.canBeSkipped) &&
        Objects.equals(this.excludedMachines,
                       deploymentTemplateStep.excludedMachines) &&
        Objects.equals(this.hasNoApplicableMachines,
                       deploymentTemplateStep.hasNoApplicableMachines) &&
        Objects.equals(this.isDisabled, deploymentTemplateStep.isDisabled) &&
        Objects.equals(this.machineNames,
                       deploymentTemplateStep.machineNames) &&
        Objects.equals(this.machines, deploymentTemplateStep.machines) &&
        Objects.equals(this.roles, deploymentTemplateStep.roles) &&
        Objects.equals(this.unavailableMachines,
                       deploymentTemplateStep.unavailableMachines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionName, actionNumber, canBeSkipped,
                        excludedMachines, hasNoApplicableMachines, isDisabled,
                        machineNames, machines, roles, unavailableMachines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTemplateStep {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionName: ")
        .append(toIndentedString(actionName))
        .append("\n");
    sb.append("    actionNumber: ")
        .append(toIndentedString(actionNumber))
        .append("\n");
    sb.append("    canBeSkipped: ")
        .append(toIndentedString(canBeSkipped))
        .append("\n");
    sb.append("    excludedMachines: ")
        .append(toIndentedString(excludedMachines))
        .append("\n");
    sb.append("    hasNoApplicableMachines: ")
        .append(toIndentedString(hasNoApplicableMachines))
        .append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    machineNames: ")
        .append(toIndentedString(machineNames))
        .append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    unavailableMachines: ")
        .append(toIndentedString(unavailableMachines))
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
