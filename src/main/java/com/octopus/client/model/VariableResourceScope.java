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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * VariableResourceScope
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VariableResourceScope {
  public static final String SERIALIZED_NAME_PROJECT = "Project";
  @SerializedName(SERIALIZED_NAME_PROJECT) private List<String> project = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "Environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private List<String> environment = null;

  public static final String SERIALIZED_NAME_MACHINE = "Machine";
  @SerializedName(SERIALIZED_NAME_MACHINE) private List<String> machine = null;

  public static final String SERIALIZED_NAME_ROLE = "Role";
  @SerializedName(SERIALIZED_NAME_ROLE) private List<String> role = null;

  public static final String SERIALIZED_NAME_TARGET_ROLE = "TargetRole";
  @SerializedName(SERIALIZED_NAME_TARGET_ROLE)
  private List<String> targetRole = null;

  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION) private List<String> action = null;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER) private List<String> user = null;

  public static final String SERIALIZED_NAME_TRIGGER = "Trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER) private List<String> trigger = null;

  public static final String SERIALIZED_NAME_PARENT_DEPLOYMENT =
      "ParentDeployment";
  @SerializedName(SERIALIZED_NAME_PARENT_DEPLOYMENT)
  private List<String> parentDeployment = null;

  public static final String SERIALIZED_NAME_PRIVATE = "Private";
  @SerializedName(SERIALIZED_NAME_PRIVATE) private List<String> _private = null;

  public static final String SERIALIZED_NAME_CHANNEL = "Channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL) private List<String> channel = null;

  public static final String SERIALIZED_NAME_TENANT_TAG = "TenantTag";
  @SerializedName(SERIALIZED_NAME_TENANT_TAG)
  private List<String> tenantTag = null;

  public static final String SERIALIZED_NAME_TENANT = "Tenant";
  @SerializedName(SERIALIZED_NAME_TENANT) private List<String> tenant = null;

  public static final String SERIALIZED_NAME_PROCESS_OWNER = "ProcessOwner";
  @SerializedName(SERIALIZED_NAME_PROCESS_OWNER)
  private List<String> processOwner = null;

  public VariableResourceScope project(List<String> project) {

    this.project = project;
    return this;
  }

  public VariableResourceScope addProjectItem(String projectItem) {
    if (this.project == null) {
      this.project = new ArrayList<String>();
    }
    this.project.add(projectItem);
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProject() {
    return project;
  }

  public void setProject(List<String> project) { this.project = project; }

  public VariableResourceScope environment(List<String> environment) {

    this.environment = environment;
    return this;
  }

  public VariableResourceScope addEnvironmentItem(String environmentItem) {
    if (this.environment == null) {
      this.environment = new ArrayList<String>();
    }
    this.environment.add(environmentItem);
    return this;
  }

  /**
   * Get environment
   * @return environment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEnvironment() {
    return environment;
  }

  public void setEnvironment(List<String> environment) {
    this.environment = environment;
  }

  public VariableResourceScope machine(List<String> machine) {

    this.machine = machine;
    return this;
  }

  public VariableResourceScope addMachineItem(String machineItem) {
    if (this.machine == null) {
      this.machine = new ArrayList<String>();
    }
    this.machine.add(machineItem);
    return this;
  }

  /**
   * Get machine
   * @return machine
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMachine() {
    return machine;
  }

  public void setMachine(List<String> machine) { this.machine = machine; }

  public VariableResourceScope role(List<String> role) {

    this.role = role;
    return this;
  }

  public VariableResourceScope addRoleItem(String roleItem) {
    if (this.role == null) {
      this.role = new ArrayList<String>();
    }
    this.role.add(roleItem);
    return this;
  }

  /**
   * Get role
   * @return role
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) { this.role = role; }

  public VariableResourceScope targetRole(List<String> targetRole) {

    this.targetRole = targetRole;
    return this;
  }

  public VariableResourceScope addTargetRoleItem(String targetRoleItem) {
    if (this.targetRole == null) {
      this.targetRole = new ArrayList<String>();
    }
    this.targetRole.add(targetRoleItem);
    return this;
  }

  /**
   * Get targetRole
   * @return targetRole
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTargetRole() {
    return targetRole;
  }

  public void setTargetRole(List<String> targetRole) {
    this.targetRole = targetRole;
  }

  public VariableResourceScope action(List<String> action) {

    this.action = action;
    return this;
  }

  public VariableResourceScope addActionItem(String actionItem) {
    if (this.action == null) {
      this.action = new ArrayList<String>();
    }
    this.action.add(actionItem);
    return this;
  }

  /**
   * Get action
   * @return action
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAction() {
    return action;
  }

  public void setAction(List<String> action) { this.action = action; }

  public VariableResourceScope user(List<String> user) {

    this.user = user;
    return this;
  }

  public VariableResourceScope addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<String>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUser() {
    return user;
  }

  public void setUser(List<String> user) { this.user = user; }

  public VariableResourceScope trigger(List<String> trigger) {

    this.trigger = trigger;
    return this;
  }

  public VariableResourceScope addTriggerItem(String triggerItem) {
    if (this.trigger == null) {
      this.trigger = new ArrayList<String>();
    }
    this.trigger.add(triggerItem);
    return this;
  }

  /**
   * Get trigger
   * @return trigger
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTrigger() {
    return trigger;
  }

  public void setTrigger(List<String> trigger) { this.trigger = trigger; }

  public VariableResourceScope parentDeployment(List<String> parentDeployment) {

    this.parentDeployment = parentDeployment;
    return this;
  }

  public VariableResourceScope
  addParentDeploymentItem(String parentDeploymentItem) {
    if (this.parentDeployment == null) {
      this.parentDeployment = new ArrayList<String>();
    }
    this.parentDeployment.add(parentDeploymentItem);
    return this;
  }

  /**
   * Get parentDeployment
   * @return parentDeployment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getParentDeployment() {
    return parentDeployment;
  }

  public void setParentDeployment(List<String> parentDeployment) {
    this.parentDeployment = parentDeployment;
  }

  public VariableResourceScope _private(List<String> _private) {

    this._private = _private;
    return this;
  }

  public VariableResourceScope addPrivateItem(String _privateItem) {
    if (this._private == null) {
      this._private = new ArrayList<String>();
    }
    this._private.add(_privateItem);
    return this;
  }

  /**
   * Get _private
   * @return _private
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPrivate() {
    return _private;
  }

  public void setPrivate(List<String> _private) { this._private = _private; }

  public VariableResourceScope channel(List<String> channel) {

    this.channel = channel;
    return this;
  }

  public VariableResourceScope addChannelItem(String channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<String>();
    }
    this.channel.add(channelItem);
    return this;
  }

  /**
   * Get channel
   * @return channel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChannel() {
    return channel;
  }

  public void setChannel(List<String> channel) { this.channel = channel; }

  public VariableResourceScope tenantTag(List<String> tenantTag) {

    this.tenantTag = tenantTag;
    return this;
  }

  public VariableResourceScope addTenantTagItem(String tenantTagItem) {
    if (this.tenantTag == null) {
      this.tenantTag = new ArrayList<String>();
    }
    this.tenantTag.add(tenantTagItem);
    return this;
  }

  /**
   * Get tenantTag
   * @return tenantTag
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTenantTag() {
    return tenantTag;
  }

  public void setTenantTag(List<String> tenantTag) {
    this.tenantTag = tenantTag;
  }

  public VariableResourceScope tenant(List<String> tenant) {

    this.tenant = tenant;
    return this;
  }

  public VariableResourceScope addTenantItem(String tenantItem) {
    if (this.tenant == null) {
      this.tenant = new ArrayList<String>();
    }
    this.tenant.add(tenantItem);
    return this;
  }

  /**
   * Get tenant
   * @return tenant
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTenant() {
    return tenant;
  }

  public void setTenant(List<String> tenant) { this.tenant = tenant; }

  public VariableResourceScope processOwner(List<String> processOwner) {

    this.processOwner = processOwner;
    return this;
  }

  public VariableResourceScope addProcessOwnerItem(String processOwnerItem) {
    if (this.processOwner == null) {
      this.processOwner = new ArrayList<String>();
    }
    this.processOwner.add(processOwnerItem);
    return this;
  }

  /**
   * Get processOwner
   * @return processOwner
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getProcessOwner() {
    return processOwner;
  }

  public void setProcessOwner(List<String> processOwner) {
    this.processOwner = processOwner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableResourceScope variableResourceScope = (VariableResourceScope)o;
    return Objects.equals(this.project, variableResourceScope.project) &&
        Objects.equals(this.environment, variableResourceScope.environment) &&
        Objects.equals(this.machine, variableResourceScope.machine) &&
        Objects.equals(this.role, variableResourceScope.role) &&
        Objects.equals(this.targetRole, variableResourceScope.targetRole) &&
        Objects.equals(this.action, variableResourceScope.action) &&
        Objects.equals(this.user, variableResourceScope.user) &&
        Objects.equals(this.trigger, variableResourceScope.trigger) &&
        Objects.equals(this.parentDeployment,
                       variableResourceScope.parentDeployment) &&
        Objects.equals(this._private, variableResourceScope._private) &&
        Objects.equals(this.channel, variableResourceScope.channel) &&
        Objects.equals(this.tenantTag, variableResourceScope.tenantTag) &&
        Objects.equals(this.tenant, variableResourceScope.tenant) &&
        Objects.equals(this.processOwner, variableResourceScope.processOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, environment, machine, role, targetRole, action,
                        user, trigger, parentDeployment, _private, channel,
                        tenantTag, tenant, processOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableResourceScope {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    environment: ")
        .append(toIndentedString(environment))
        .append("\n");
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    targetRole: ")
        .append(toIndentedString(targetRole))
        .append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    parentDeployment: ")
        .append(toIndentedString(parentDeployment))
        .append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    tenantTag: ")
        .append(toIndentedString(tenantTag))
        .append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    processOwner: ")
        .append(toIndentedString(processOwner))
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
