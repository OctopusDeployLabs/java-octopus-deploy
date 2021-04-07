// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ProcessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * ActionTemplateUsageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionTemplateUsageResource {
  public static final String SERIALIZED_NAME_ACTION_ID = "ActionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID) private String actionId;

  public static final String SERIALIZED_NAME_ACTION_NAME = "ActionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME) private String actionName;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_ID =
      "ActionTemplateId";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_ID)
  private String actionTemplateId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID =
      "DeploymentProcessId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID)
  private String deploymentProcessId;

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

  public static final String SERIALIZED_NAME_PROCESS_ID = "ProcessId";
  @SerializedName(SERIALIZED_NAME_PROCESS_ID) private String processId;

  public static final String SERIALIZED_NAME_PROCESS_TYPE = "ProcessType";
  @SerializedName(SERIALIZED_NAME_PROCESS_TYPE) private ProcessType processType;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "ProjectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG) private String projectSlug;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_RUNBOOK_NAME = "RunbookName";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_NAME) private String runbookName;

  public static final String SERIALIZED_NAME_STEP_ID = "StepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID) private String stepId;

  public static final String SERIALIZED_NAME_STEP_NAME = "StepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME) private String stepName;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public ActionTemplateUsageResource actionId(String actionId) {

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

  public ActionTemplateUsageResource actionName(String actionName) {

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

  public ActionTemplateUsageResource actionTemplateId(String actionTemplateId) {

    this.actionTemplateId = actionTemplateId;
    return this;
  }

  /**
   * Get actionTemplateId
   * @return actionTemplateId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionTemplateId() {
    return actionTemplateId;
  }

  public void setActionTemplateId(String actionTemplateId) {
    this.actionTemplateId = actionTemplateId;
  }

  public ActionTemplateUsageResource
  deploymentProcessId(String deploymentProcessId) {

    this.deploymentProcessId = deploymentProcessId;
    return this;
  }

  /**
   * Get deploymentProcessId
   * @return deploymentProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public void setDeploymentProcessId(String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public ActionTemplateUsageResource id(String id) {

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

  public ActionTemplateUsageResource lastModifiedBy(String lastModifiedBy) {

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

  public ActionTemplateUsageResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ActionTemplateUsageResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ActionTemplateUsageResource putLinksItem(String key,
                                                  String linksItem) {
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

  public ActionTemplateUsageResource processId(String processId) {

    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) { this.processId = processId; }

  public ActionTemplateUsageResource processType(ProcessType processType) {

    this.processType = processType;
    return this;
  }

  /**
   * Get processType
   * @return processType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessType getProcessType() {
    return processType;
  }

  public void setProcessType(ProcessType processType) {
    this.processType = processType;
  }

  public ActionTemplateUsageResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public ActionTemplateUsageResource projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ActionTemplateUsageResource projectSlug(String projectSlug) {

    this.projectSlug = projectSlug;
    return this;
  }

  /**
   * Get projectSlug
   * @return projectSlug
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }

  public ActionTemplateUsageResource runbookId(String runbookId) {

    this.runbookId = runbookId;
    return this;
  }

  /**
   * Get runbookId
   * @return runbookId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookId() {
    return runbookId;
  }

  public void setRunbookId(String runbookId) { this.runbookId = runbookId; }

  public ActionTemplateUsageResource runbookName(String runbookName) {

    this.runbookName = runbookName;
    return this;
  }

  /**
   * Get runbookName
   * @return runbookName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookName() {
    return runbookName;
  }

  public void setRunbookName(String runbookName) {
    this.runbookName = runbookName;
  }

  public ActionTemplateUsageResource stepId(String stepId) {

    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId
   * @return stepId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) { this.stepId = stepId; }

  public ActionTemplateUsageResource stepName(String stepName) {

    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) { this.stepName = stepName; }

  public ActionTemplateUsageResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionTemplateUsageResource actionTemplateUsageResource =
        (ActionTemplateUsageResource)o;
    return Objects.equals(this.actionId,
                          actionTemplateUsageResource.actionId) &&
        Objects.equals(this.actionName,
                       actionTemplateUsageResource.actionName) &&
        Objects.equals(this.actionTemplateId,
                       actionTemplateUsageResource.actionTemplateId) &&
        Objects.equals(this.deploymentProcessId,
                       actionTemplateUsageResource.deploymentProcessId) &&
        Objects.equals(this.id, actionTemplateUsageResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       actionTemplateUsageResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       actionTemplateUsageResource.lastModifiedOn) &&
        Objects.equals(this.links, actionTemplateUsageResource.links) &&
        Objects.equals(this.processId, actionTemplateUsageResource.processId) &&
        Objects.equals(this.processType,
                       actionTemplateUsageResource.processType) &&
        Objects.equals(this.projectId, actionTemplateUsageResource.projectId) &&
        Objects.equals(this.projectName,
                       actionTemplateUsageResource.projectName) &&
        Objects.equals(this.projectSlug,
                       actionTemplateUsageResource.projectSlug) &&
        Objects.equals(this.runbookId, actionTemplateUsageResource.runbookId) &&
        Objects.equals(this.runbookName,
                       actionTemplateUsageResource.runbookName) &&
        Objects.equals(this.stepId, actionTemplateUsageResource.stepId) &&
        Objects.equals(this.stepName, actionTemplateUsageResource.stepName) &&
        Objects.equals(this.version, actionTemplateUsageResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, actionName, actionTemplateId,
                        deploymentProcessId, id, lastModifiedBy, lastModifiedOn,
                        links, processId, processType, projectId, projectName,
                        projectSlug, runbookId, runbookName, stepId, stepName,
                        version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionTemplateUsageResource {\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionName: ")
        .append(toIndentedString(actionName))
        .append("\n");
    sb.append("    actionTemplateId: ")
        .append(toIndentedString(actionTemplateId))
        .append("\n");
    sb.append("    deploymentProcessId: ")
        .append(toIndentedString(deploymentProcessId))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    processId: ")
        .append(toIndentedString(processId))
        .append("\n");
    sb.append("    processType: ")
        .append(toIndentedString(processType))
        .append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    projectSlug: ")
        .append(toIndentedString(projectSlug))
        .append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    runbookName: ")
        .append(toIndentedString(runbookName))
        .append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
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
