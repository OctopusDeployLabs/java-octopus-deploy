// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ProcessReferenceDataItem;
import com.octopus.client.model.ReferenceDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * VariableScopeValues
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariableScopeValues {
  public static final String SERIALIZED_NAME_ACTIONS = "Actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<ReferenceDataItem> actions = null;

  public static final String SERIALIZED_NAME_CHANNELS = "Channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<ReferenceDataItem> channels = null;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<ReferenceDataItem> environments = null;

  public static final String SERIALIZED_NAME_MACHINES = "Machines";
  @SerializedName(SERIALIZED_NAME_MACHINES)
  private List<ReferenceDataItem> machines = null;

  public static final String SERIALIZED_NAME_PROCESSES = "Processes";
  @SerializedName(SERIALIZED_NAME_PROCESSES)
  private List<ProcessReferenceDataItem> processes = null;

  public static final String SERIALIZED_NAME_ROLES = "Roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<ReferenceDataItem> roles = null;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private List<ReferenceDataItem> tenantTags = null;

  public VariableScopeValues actions(List<ReferenceDataItem> actions) {

    this.actions = actions;
    return this;
  }

  public VariableScopeValues addActionsItem(ReferenceDataItem actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ReferenceDataItem>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getActions() {
    return actions;
  }

  public void setActions(List<ReferenceDataItem> actions) {
    this.actions = actions;
  }

  public VariableScopeValues channels(List<ReferenceDataItem> channels) {

    this.channels = channels;
    return this;
  }

  public VariableScopeValues addChannelsItem(ReferenceDataItem channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<ReferenceDataItem>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * Get channels
   * @return channels
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getChannels() {
    return channels;
  }

  public void setChannels(List<ReferenceDataItem> channels) {
    this.channels = channels;
  }

  public VariableScopeValues
  environments(List<ReferenceDataItem> environments) {

    this.environments = environments;
    return this;
  }

  public VariableScopeValues
  addEnvironmentsItem(ReferenceDataItem environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<ReferenceDataItem>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<ReferenceDataItem> environments) {
    this.environments = environments;
  }

  public VariableScopeValues machines(List<ReferenceDataItem> machines) {

    this.machines = machines;
    return this;
  }

  public VariableScopeValues addMachinesItem(ReferenceDataItem machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<ReferenceDataItem>();
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

  public List<ReferenceDataItem> getMachines() {
    return machines;
  }

  public void setMachines(List<ReferenceDataItem> machines) {
    this.machines = machines;
  }

  public VariableScopeValues
  processes(List<ProcessReferenceDataItem> processes) {

    this.processes = processes;
    return this;
  }

  public VariableScopeValues
  addProcessesItem(ProcessReferenceDataItem processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<ProcessReferenceDataItem>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Get processes
   * @return processes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProcessReferenceDataItem> getProcesses() {
    return processes;
  }

  public void setProcesses(List<ProcessReferenceDataItem> processes) {
    this.processes = processes;
  }

  public VariableScopeValues roles(List<ReferenceDataItem> roles) {

    this.roles = roles;
    return this;
  }

  public VariableScopeValues addRolesItem(ReferenceDataItem rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<ReferenceDataItem>();
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

  public List<ReferenceDataItem> getRoles() {
    return roles;
  }

  public void setRoles(List<ReferenceDataItem> roles) { this.roles = roles; }

  public VariableScopeValues tenantTags(List<ReferenceDataItem> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public VariableScopeValues
  addTenantTagsItem(ReferenceDataItem tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new ArrayList<ReferenceDataItem>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(List<ReferenceDataItem> tenantTags) {
    this.tenantTags = tenantTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableScopeValues variableScopeValues = (VariableScopeValues)o;
    return Objects.equals(this.actions, variableScopeValues.actions) &&
        Objects.equals(this.channels, variableScopeValues.channels) &&
        Objects.equals(this.environments, variableScopeValues.environments) &&
        Objects.equals(this.machines, variableScopeValues.machines) &&
        Objects.equals(this.processes, variableScopeValues.processes) &&
        Objects.equals(this.roles, variableScopeValues.roles) &&
        Objects.equals(this.tenantTags, variableScopeValues.tenantTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, channels, environments, machines, processes,
                        roles, tenantTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableScopeValues {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    processes: ")
        .append(toIndentedString(processes))
        .append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
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
