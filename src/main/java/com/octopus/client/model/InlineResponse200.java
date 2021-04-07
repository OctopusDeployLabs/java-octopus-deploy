// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PermissionDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * InlineResponse200
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class InlineResponse200 {
  public static final String SERIALIZED_NAME_ADMINISTER_SYSTEM =
      "AdministerSystem";
  @SerializedName(SERIALIZED_NAME_ADMINISTER_SYSTEM)
  private PermissionDescription administerSystem;

  public static final String SERIALIZED_NAME_PROJECT_EDIT = "ProjectEdit";
  @SerializedName(SERIALIZED_NAME_PROJECT_EDIT)
  private PermissionDescription projectEdit;

  public static final String SERIALIZED_NAME_PROJECT_VIEW = "ProjectView";
  @SerializedName(SERIALIZED_NAME_PROJECT_VIEW)
  private PermissionDescription projectView;

  public static final String SERIALIZED_NAME_PROJECT_CREATE = "ProjectCreate";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE)
  private PermissionDescription projectCreate;

  public static final String SERIALIZED_NAME_PROJECT_DELETE = "ProjectDelete";
  @SerializedName(SERIALIZED_NAME_PROJECT_DELETE)
  private PermissionDescription projectDelete;

  public static final String SERIALIZED_NAME_PROCESS_VIEW = "ProcessView";
  @SerializedName(SERIALIZED_NAME_PROCESS_VIEW)
  private PermissionDescription processView;

  public static final String SERIALIZED_NAME_PROCESS_EDIT = "ProcessEdit";
  @SerializedName(SERIALIZED_NAME_PROCESS_EDIT)
  private PermissionDescription processEdit;

  public static final String SERIALIZED_NAME_VARIABLE_EDIT = "VariableEdit";
  @SerializedName(SERIALIZED_NAME_VARIABLE_EDIT)
  private PermissionDescription variableEdit;

  public static final String SERIALIZED_NAME_VARIABLE_EDIT_UNSCOPED =
      "VariableEditUnscoped";
  @SerializedName(SERIALIZED_NAME_VARIABLE_EDIT_UNSCOPED)
  private PermissionDescription variableEditUnscoped;

  public static final String SERIALIZED_NAME_VARIABLE_VIEW = "VariableView";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VIEW)
  private PermissionDescription variableView;

  public static final String SERIALIZED_NAME_VARIABLE_VIEW_UNSCOPED =
      "VariableViewUnscoped";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VIEW_UNSCOPED)
  private PermissionDescription variableViewUnscoped;

  public static final String SERIALIZED_NAME_RELEASE_CREATE = "ReleaseCreate";
  @SerializedName(SERIALIZED_NAME_RELEASE_CREATE)
  private PermissionDescription releaseCreate;

  public static final String SERIALIZED_NAME_RELEASE_VIEW = "ReleaseView";
  @SerializedName(SERIALIZED_NAME_RELEASE_VIEW)
  private PermissionDescription releaseView;

  public static final String SERIALIZED_NAME_RELEASE_EDIT = "ReleaseEdit";
  @SerializedName(SERIALIZED_NAME_RELEASE_EDIT)
  private PermissionDescription releaseEdit;

  public static final String SERIALIZED_NAME_RELEASE_DELETE = "ReleaseDelete";
  @SerializedName(SERIALIZED_NAME_RELEASE_DELETE)
  private PermissionDescription releaseDelete;

  public static final String SERIALIZED_NAME_DEFECT_REPORT = "DefectReport";
  @SerializedName(SERIALIZED_NAME_DEFECT_REPORT)
  private PermissionDescription defectReport;

  public static final String SERIALIZED_NAME_DEFECT_RESOLVE = "DefectResolve";
  @SerializedName(SERIALIZED_NAME_DEFECT_RESOLVE)
  private PermissionDescription defectResolve;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CREATE =
      "DeploymentCreate";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CREATE)
  private PermissionDescription deploymentCreate;

  public static final String SERIALIZED_NAME_DEPLOYMENT_DELETE =
      "DeploymentDelete";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_DELETE)
  private PermissionDescription deploymentDelete;

  public static final String SERIALIZED_NAME_DEPLOYMENT_VIEW = "DeploymentView";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_VIEW)
  private PermissionDescription deploymentView;

  public static final String SERIALIZED_NAME_ENVIRONMENT_VIEW =
      "EnvironmentView";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_VIEW)
  private PermissionDescription environmentView;

  public static final String SERIALIZED_NAME_ENVIRONMENT_CREATE =
      "EnvironmentCreate";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_CREATE)
  private PermissionDescription environmentCreate;

  public static final String SERIALIZED_NAME_ENVIRONMENT_EDIT =
      "EnvironmentEdit";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_EDIT)
  private PermissionDescription environmentEdit;

  public static final String SERIALIZED_NAME_ENVIRONMENT_DELETE =
      "EnvironmentDelete";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_DELETE)
  private PermissionDescription environmentDelete;

  public static final String SERIALIZED_NAME_MACHINE_CREATE = "MachineCreate";
  @SerializedName(SERIALIZED_NAME_MACHINE_CREATE)
  private PermissionDescription machineCreate;

  public static final String SERIALIZED_NAME_MACHINE_EDIT = "MachineEdit";
  @SerializedName(SERIALIZED_NAME_MACHINE_EDIT)
  private PermissionDescription machineEdit;

  public static final String SERIALIZED_NAME_MACHINE_VIEW = "MachineView";
  @SerializedName(SERIALIZED_NAME_MACHINE_VIEW)
  private PermissionDescription machineView;

  public static final String SERIALIZED_NAME_MACHINE_DELETE = "MachineDelete";
  @SerializedName(SERIALIZED_NAME_MACHINE_DELETE)
  private PermissionDescription machineDelete;

  public static final String SERIALIZED_NAME_ARTIFACT_VIEW = "ArtifactView";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_VIEW)
  private PermissionDescription artifactView;

  public static final String SERIALIZED_NAME_ARTIFACT_CREATE = "ArtifactCreate";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_CREATE)
  private PermissionDescription artifactCreate;

  public static final String SERIALIZED_NAME_ARTIFACT_EDIT = "ArtifactEdit";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_EDIT)
  private PermissionDescription artifactEdit;

  public static final String SERIALIZED_NAME_ARTIFACT_DELETE = "ArtifactDelete";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_DELETE)
  private PermissionDescription artifactDelete;

  public static final String SERIALIZED_NAME_FEED_VIEW = "FeedView";
  @SerializedName(SERIALIZED_NAME_FEED_VIEW)
  private PermissionDescription feedView;

  public static final String SERIALIZED_NAME_EVENT_VIEW = "EventView";
  @SerializedName(SERIALIZED_NAME_EVENT_VIEW)
  private PermissionDescription eventView;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_VIEW =
      "LibraryVariableSetView";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_VIEW)
  private PermissionDescription libraryVariableSetView;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_CREATE =
      "LibraryVariableSetCreate";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_CREATE)
  private PermissionDescription libraryVariableSetCreate;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_EDIT =
      "LibraryVariableSetEdit";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_EDIT)
  private PermissionDescription libraryVariableSetEdit;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_DELETE =
      "LibraryVariableSetDelete";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_DELETE)
  private PermissionDescription libraryVariableSetDelete;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_VIEW =
      "ProjectGroupView";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_VIEW)
  private PermissionDescription projectGroupView;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_CREATE =
      "ProjectGroupCreate";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_CREATE)
  private PermissionDescription projectGroupCreate;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_EDIT =
      "ProjectGroupEdit";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_EDIT)
  private PermissionDescription projectGroupEdit;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_DELETE =
      "ProjectGroupDelete";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_DELETE)
  private PermissionDescription projectGroupDelete;

  public static final String SERIALIZED_NAME_TEAM_CREATE = "TeamCreate";
  @SerializedName(SERIALIZED_NAME_TEAM_CREATE)
  private PermissionDescription teamCreate;

  public static final String SERIALIZED_NAME_TEAM_VIEW = "TeamView";
  @SerializedName(SERIALIZED_NAME_TEAM_VIEW)
  private PermissionDescription teamView;

  public static final String SERIALIZED_NAME_TEAM_EDIT = "TeamEdit";
  @SerializedName(SERIALIZED_NAME_TEAM_EDIT)
  private PermissionDescription teamEdit;

  public static final String SERIALIZED_NAME_TEAM_DELETE = "TeamDelete";
  @SerializedName(SERIALIZED_NAME_TEAM_DELETE)
  private PermissionDescription teamDelete;

  public static final String SERIALIZED_NAME_USER_VIEW = "UserView";
  @SerializedName(SERIALIZED_NAME_USER_VIEW)
  private PermissionDescription userView;

  public static final String SERIALIZED_NAME_USER_INVITE = "UserInvite";
  @SerializedName(SERIALIZED_NAME_USER_INVITE)
  private PermissionDescription userInvite;

  public static final String SERIALIZED_NAME_USER_ROLE_VIEW = "UserRoleView";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_VIEW)
  private PermissionDescription userRoleView;

  public static final String SERIALIZED_NAME_USER_ROLE_EDIT = "UserRoleEdit";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_EDIT)
  private PermissionDescription userRoleEdit;

  public static final String SERIALIZED_NAME_TASK_VIEW = "TaskView";
  @SerializedName(SERIALIZED_NAME_TASK_VIEW)
  private PermissionDescription taskView;

  public static final String SERIALIZED_NAME_TASK_CREATE = "TaskCreate";
  @SerializedName(SERIALIZED_NAME_TASK_CREATE)
  private PermissionDescription taskCreate;

  public static final String SERIALIZED_NAME_TASK_CANCEL = "TaskCancel";
  @SerializedName(SERIALIZED_NAME_TASK_CANCEL)
  private PermissionDescription taskCancel;

  public static final String SERIALIZED_NAME_TASK_EDIT = "TaskEdit";
  @SerializedName(SERIALIZED_NAME_TASK_EDIT)
  private PermissionDescription taskEdit;

  public static final String SERIALIZED_NAME_INTERRUPTION_VIEW =
      "InterruptionView";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_VIEW)
  private PermissionDescription interruptionView;

  public static final String SERIALIZED_NAME_INTERRUPTION_SUBMIT =
      "InterruptionSubmit";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_SUBMIT)
  private PermissionDescription interruptionSubmit;

  public static final String
      SERIALIZED_NAME_INTERRUPTION_VIEW_SUBMIT_RESPONSIBLE =
          "InterruptionViewSubmitResponsible";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_VIEW_SUBMIT_RESPONSIBLE)
  private PermissionDescription interruptionViewSubmitResponsible;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_PUSH =
      "BuiltInFeedPush";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_PUSH)
  private PermissionDescription builtInFeedPush;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_ADMINISTER =
      "BuiltInFeedAdminister";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_ADMINISTER)
  private PermissionDescription builtInFeedAdminister;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_DOWNLOAD =
      "BuiltInFeedDownload";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_DOWNLOAD)
  private PermissionDescription builtInFeedDownload;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_VIEW =
      "ActionTemplateView";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_VIEW)
  private PermissionDescription actionTemplateView;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_CREATE =
      "ActionTemplateCreate";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_CREATE)
  private PermissionDescription actionTemplateCreate;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_EDIT =
      "ActionTemplateEdit";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_EDIT)
  private PermissionDescription actionTemplateEdit;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_DELETE =
      "ActionTemplateDelete";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_DELETE)
  private PermissionDescription actionTemplateDelete;

  public static final String SERIALIZED_NAME_LIFECYCLE_CREATE =
      "LifecycleCreate";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_CREATE)
  private PermissionDescription lifecycleCreate;

  public static final String SERIALIZED_NAME_LIFECYCLE_VIEW = "LifecycleView";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_VIEW)
  private PermissionDescription lifecycleView;

  public static final String SERIALIZED_NAME_LIFECYCLE_EDIT = "LifecycleEdit";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_EDIT)
  private PermissionDescription lifecycleEdit;

  public static final String SERIALIZED_NAME_LIFECYCLE_DELETE =
      "LifecycleDelete";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_DELETE)
  private PermissionDescription lifecycleDelete;

  public static final String SERIALIZED_NAME_ACCOUNT_VIEW = "AccountView";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VIEW)
  private PermissionDescription accountView;

  public static final String SERIALIZED_NAME_ACCOUNT_EDIT = "AccountEdit";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_EDIT)
  private PermissionDescription accountEdit;

  public static final String SERIALIZED_NAME_ACCOUNT_CREATE = "AccountCreate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CREATE)
  private PermissionDescription accountCreate;

  public static final String SERIALIZED_NAME_ACCOUNT_DELETE = "AccountDelete";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DELETE)
  private PermissionDescription accountDelete;

  public static final String SERIALIZED_NAME_TENANT_CREATE = "TenantCreate";
  @SerializedName(SERIALIZED_NAME_TENANT_CREATE)
  private PermissionDescription tenantCreate;

  public static final String SERIALIZED_NAME_TENANT_EDIT = "TenantEdit";
  @SerializedName(SERIALIZED_NAME_TENANT_EDIT)
  private PermissionDescription tenantEdit;

  public static final String SERIALIZED_NAME_TENANT_VIEW = "TenantView";
  @SerializedName(SERIALIZED_NAME_TENANT_VIEW)
  private PermissionDescription tenantView;

  public static final String SERIALIZED_NAME_TENANT_DELETE = "TenantDelete";
  @SerializedName(SERIALIZED_NAME_TENANT_DELETE)
  private PermissionDescription tenantDelete;

  public static final String SERIALIZED_NAME_TAG_SET_CREATE = "TagSetCreate";
  @SerializedName(SERIALIZED_NAME_TAG_SET_CREATE)
  private PermissionDescription tagSetCreate;

  public static final String SERIALIZED_NAME_TAG_SET_EDIT = "TagSetEdit";
  @SerializedName(SERIALIZED_NAME_TAG_SET_EDIT)
  private PermissionDescription tagSetEdit;

  public static final String SERIALIZED_NAME_TAG_SET_DELETE = "TagSetDelete";
  @SerializedName(SERIALIZED_NAME_TAG_SET_DELETE)
  private PermissionDescription tagSetDelete;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_CREATE =
      "MachinePolicyCreate";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_CREATE)
  private PermissionDescription machinePolicyCreate;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_VIEW =
      "MachinePolicyView";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_VIEW)
  private PermissionDescription machinePolicyView;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_EDIT =
      "MachinePolicyEdit";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_EDIT)
  private PermissionDescription machinePolicyEdit;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_DELETE =
      "MachinePolicyDelete";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_DELETE)
  private PermissionDescription machinePolicyDelete;

  public static final String SERIALIZED_NAME_PROXY_CREATE = "ProxyCreate";
  @SerializedName(SERIALIZED_NAME_PROXY_CREATE)
  private PermissionDescription proxyCreate;

  public static final String SERIALIZED_NAME_PROXY_VIEW = "ProxyView";
  @SerializedName(SERIALIZED_NAME_PROXY_VIEW)
  private PermissionDescription proxyView;

  public static final String SERIALIZED_NAME_PROXY_EDIT = "ProxyEdit";
  @SerializedName(SERIALIZED_NAME_PROXY_EDIT)
  private PermissionDescription proxyEdit;

  public static final String SERIALIZED_NAME_PROXY_DELETE = "ProxyDelete";
  @SerializedName(SERIALIZED_NAME_PROXY_DELETE)
  private PermissionDescription proxyDelete;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CREATE =
      "SubscriptionCreate";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CREATE)
  private PermissionDescription subscriptionCreate;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_VIEW =
      "SubscriptionView";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_VIEW)
  private PermissionDescription subscriptionView;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_EDIT =
      "SubscriptionEdit";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EDIT)
  private PermissionDescription subscriptionEdit;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_DELETE =
      "SubscriptionDelete";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_DELETE)
  private PermissionDescription subscriptionDelete;

  public static final String SERIALIZED_NAME_TRIGGER_CREATE = "TriggerCreate";
  @SerializedName(SERIALIZED_NAME_TRIGGER_CREATE)
  private PermissionDescription triggerCreate;

  public static final String SERIALIZED_NAME_TRIGGER_VIEW = "TriggerView";
  @SerializedName(SERIALIZED_NAME_TRIGGER_VIEW)
  private PermissionDescription triggerView;

  public static final String SERIALIZED_NAME_TRIGGER_EDIT = "TriggerEdit";
  @SerializedName(SERIALIZED_NAME_TRIGGER_EDIT)
  private PermissionDescription triggerEdit;

  public static final String SERIALIZED_NAME_TRIGGER_DELETE = "TriggerDelete";
  @SerializedName(SERIALIZED_NAME_TRIGGER_DELETE)
  private PermissionDescription triggerDelete;

  public static final String SERIALIZED_NAME_CERTIFICATE_VIEW =
      "CertificateView";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_VIEW)
  private PermissionDescription certificateView;

  public static final String SERIALIZED_NAME_CERTIFICATE_CREATE =
      "CertificateCreate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CREATE)
  private PermissionDescription certificateCreate;

  public static final String SERIALIZED_NAME_CERTIFICATE_EDIT =
      "CertificateEdit";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_EDIT)
  private PermissionDescription certificateEdit;

  public static final String SERIALIZED_NAME_CERTIFICATE_DELETE =
      "CertificateDelete";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DELETE)
  private PermissionDescription certificateDelete;

  public static final String SERIALIZED_NAME_CERTIFICATE_EXPORT_PRIVATE_KEY =
      "CertificateExportPrivateKey";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_EXPORT_PRIVATE_KEY)
  private PermissionDescription certificateExportPrivateKey;

  public static final String SERIALIZED_NAME_USER_EDIT = "UserEdit";
  @SerializedName(SERIALIZED_NAME_USER_EDIT)
  private PermissionDescription userEdit;

  public static final String SERIALIZED_NAME_CONFIGURE_SERVER =
      "ConfigureServer";
  @SerializedName(SERIALIZED_NAME_CONFIGURE_SERVER)
  private PermissionDescription configureServer;

  public static final String SERIALIZED_NAME_FEED_EDIT = "FeedEdit";
  @SerializedName(SERIALIZED_NAME_FEED_EDIT)
  private PermissionDescription feedEdit;

  public static final String SERIALIZED_NAME_WORKER_VIEW = "WorkerView";
  @SerializedName(SERIALIZED_NAME_WORKER_VIEW)
  private PermissionDescription workerView;

  public static final String SERIALIZED_NAME_WORKER_EDIT = "WorkerEdit";
  @SerializedName(SERIALIZED_NAME_WORKER_EDIT)
  private PermissionDescription workerEdit;

  public static final String SERIALIZED_NAME_SPACE_EDIT = "SpaceEdit";
  @SerializedName(SERIALIZED_NAME_SPACE_EDIT)
  private PermissionDescription spaceEdit;

  public static final String SERIALIZED_NAME_SPACE_VIEW = "SpaceView";
  @SerializedName(SERIALIZED_NAME_SPACE_VIEW)
  private PermissionDescription spaceView;

  public static final String SERIALIZED_NAME_SPACE_DELETE = "SpaceDelete";
  @SerializedName(SERIALIZED_NAME_SPACE_DELETE)
  private PermissionDescription spaceDelete;

  public static final String SERIALIZED_NAME_SPACE_CREATE = "SpaceCreate";
  @SerializedName(SERIALIZED_NAME_SPACE_CREATE)
  private PermissionDescription spaceCreate;

  public static final String SERIALIZED_NAME_BUILD_INFORMATION_PUSH =
      "BuildInformationPush";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION_PUSH)
  private PermissionDescription buildInformationPush;

  public static final String SERIALIZED_NAME_BUILD_INFORMATION_ADMINISTER =
      "BuildInformationAdminister";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION_ADMINISTER)
  private PermissionDescription buildInformationAdminister;

  public static final String SERIALIZED_NAME_RUNBOOK_VIEW = "RunbookView";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_VIEW)
  private PermissionDescription runbookView;

  public static final String SERIALIZED_NAME_RUNBOOK_EDIT = "RunbookEdit";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_EDIT)
  private PermissionDescription runbookEdit;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_VIEW =
      "RunbookRunView";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_VIEW)
  private PermissionDescription runbookRunView;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_DELETE =
      "RunbookRunDelete";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_DELETE)
  private PermissionDescription runbookRunDelete;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_CREATE =
      "RunbookRunCreate";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_CREATE)
  private PermissionDescription runbookRunCreate;

  public InlineResponse200
  administerSystem(PermissionDescription administerSystem) {

    this.administerSystem = administerSystem;
    return this;
  }

  /**
   * Get administerSystem
   * @return administerSystem
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getAdministerSystem() {
    return administerSystem;
  }

  public void setAdministerSystem(PermissionDescription administerSystem) {
    this.administerSystem = administerSystem;
  }

  public InlineResponse200 projectEdit(PermissionDescription projectEdit) {

    this.projectEdit = projectEdit;
    return this;
  }

  /**
   * Get projectEdit
   * @return projectEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectEdit() {
    return projectEdit;
  }

  public void setProjectEdit(PermissionDescription projectEdit) {
    this.projectEdit = projectEdit;
  }

  public InlineResponse200 projectView(PermissionDescription projectView) {

    this.projectView = projectView;
    return this;
  }

  /**
   * Get projectView
   * @return projectView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectView() {
    return projectView;
  }

  public void setProjectView(PermissionDescription projectView) {
    this.projectView = projectView;
  }

  public InlineResponse200 projectCreate(PermissionDescription projectCreate) {

    this.projectCreate = projectCreate;
    return this;
  }

  /**
   * Get projectCreate
   * @return projectCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectCreate() {
    return projectCreate;
  }

  public void setProjectCreate(PermissionDescription projectCreate) {
    this.projectCreate = projectCreate;
  }

  public InlineResponse200 projectDelete(PermissionDescription projectDelete) {

    this.projectDelete = projectDelete;
    return this;
  }

  /**
   * Get projectDelete
   * @return projectDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectDelete() {
    return projectDelete;
  }

  public void setProjectDelete(PermissionDescription projectDelete) {
    this.projectDelete = projectDelete;
  }

  public InlineResponse200 processView(PermissionDescription processView) {

    this.processView = processView;
    return this;
  }

  /**
   * Get processView
   * @return processView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProcessView() {
    return processView;
  }

  public void setProcessView(PermissionDescription processView) {
    this.processView = processView;
  }

  public InlineResponse200 processEdit(PermissionDescription processEdit) {

    this.processEdit = processEdit;
    return this;
  }

  /**
   * Get processEdit
   * @return processEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProcessEdit() {
    return processEdit;
  }

  public void setProcessEdit(PermissionDescription processEdit) {
    this.processEdit = processEdit;
  }

  public InlineResponse200 variableEdit(PermissionDescription variableEdit) {

    this.variableEdit = variableEdit;
    return this;
  }

  /**
   * Get variableEdit
   * @return variableEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getVariableEdit() {
    return variableEdit;
  }

  public void setVariableEdit(PermissionDescription variableEdit) {
    this.variableEdit = variableEdit;
  }

  public InlineResponse200
  variableEditUnscoped(PermissionDescription variableEditUnscoped) {

    this.variableEditUnscoped = variableEditUnscoped;
    return this;
  }

  /**
   * Get variableEditUnscoped
   * @return variableEditUnscoped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getVariableEditUnscoped() {
    return variableEditUnscoped;
  }

  public void
  setVariableEditUnscoped(PermissionDescription variableEditUnscoped) {
    this.variableEditUnscoped = variableEditUnscoped;
  }

  public InlineResponse200 variableView(PermissionDescription variableView) {

    this.variableView = variableView;
    return this;
  }

  /**
   * Get variableView
   * @return variableView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getVariableView() {
    return variableView;
  }

  public void setVariableView(PermissionDescription variableView) {
    this.variableView = variableView;
  }

  public InlineResponse200
  variableViewUnscoped(PermissionDescription variableViewUnscoped) {

    this.variableViewUnscoped = variableViewUnscoped;
    return this;
  }

  /**
   * Get variableViewUnscoped
   * @return variableViewUnscoped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getVariableViewUnscoped() {
    return variableViewUnscoped;
  }

  public void
  setVariableViewUnscoped(PermissionDescription variableViewUnscoped) {
    this.variableViewUnscoped = variableViewUnscoped;
  }

  public InlineResponse200 releaseCreate(PermissionDescription releaseCreate) {

    this.releaseCreate = releaseCreate;
    return this;
  }

  /**
   * Get releaseCreate
   * @return releaseCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getReleaseCreate() {
    return releaseCreate;
  }

  public void setReleaseCreate(PermissionDescription releaseCreate) {
    this.releaseCreate = releaseCreate;
  }

  public InlineResponse200 releaseView(PermissionDescription releaseView) {

    this.releaseView = releaseView;
    return this;
  }

  /**
   * Get releaseView
   * @return releaseView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getReleaseView() {
    return releaseView;
  }

  public void setReleaseView(PermissionDescription releaseView) {
    this.releaseView = releaseView;
  }

  public InlineResponse200 releaseEdit(PermissionDescription releaseEdit) {

    this.releaseEdit = releaseEdit;
    return this;
  }

  /**
   * Get releaseEdit
   * @return releaseEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getReleaseEdit() {
    return releaseEdit;
  }

  public void setReleaseEdit(PermissionDescription releaseEdit) {
    this.releaseEdit = releaseEdit;
  }

  public InlineResponse200 releaseDelete(PermissionDescription releaseDelete) {

    this.releaseDelete = releaseDelete;
    return this;
  }

  /**
   * Get releaseDelete
   * @return releaseDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getReleaseDelete() {
    return releaseDelete;
  }

  public void setReleaseDelete(PermissionDescription releaseDelete) {
    this.releaseDelete = releaseDelete;
  }

  public InlineResponse200 defectReport(PermissionDescription defectReport) {

    this.defectReport = defectReport;
    return this;
  }

  /**
   * Get defectReport
   * @return defectReport
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getDefectReport() {
    return defectReport;
  }

  public void setDefectReport(PermissionDescription defectReport) {
    this.defectReport = defectReport;
  }

  public InlineResponse200 defectResolve(PermissionDescription defectResolve) {

    this.defectResolve = defectResolve;
    return this;
  }

  /**
   * Get defectResolve
   * @return defectResolve
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getDefectResolve() {
    return defectResolve;
  }

  public void setDefectResolve(PermissionDescription defectResolve) {
    this.defectResolve = defectResolve;
  }

  public InlineResponse200
  deploymentCreate(PermissionDescription deploymentCreate) {

    this.deploymentCreate = deploymentCreate;
    return this;
  }

  /**
   * Get deploymentCreate
   * @return deploymentCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getDeploymentCreate() {
    return deploymentCreate;
  }

  public void setDeploymentCreate(PermissionDescription deploymentCreate) {
    this.deploymentCreate = deploymentCreate;
  }

  public InlineResponse200
  deploymentDelete(PermissionDescription deploymentDelete) {

    this.deploymentDelete = deploymentDelete;
    return this;
  }

  /**
   * Get deploymentDelete
   * @return deploymentDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getDeploymentDelete() {
    return deploymentDelete;
  }

  public void setDeploymentDelete(PermissionDescription deploymentDelete) {
    this.deploymentDelete = deploymentDelete;
  }

  public InlineResponse200
  deploymentView(PermissionDescription deploymentView) {

    this.deploymentView = deploymentView;
    return this;
  }

  /**
   * Get deploymentView
   * @return deploymentView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getDeploymentView() {
    return deploymentView;
  }

  public void setDeploymentView(PermissionDescription deploymentView) {
    this.deploymentView = deploymentView;
  }

  public InlineResponse200
  environmentView(PermissionDescription environmentView) {

    this.environmentView = environmentView;
    return this;
  }

  /**
   * Get environmentView
   * @return environmentView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getEnvironmentView() {
    return environmentView;
  }

  public void setEnvironmentView(PermissionDescription environmentView) {
    this.environmentView = environmentView;
  }

  public InlineResponse200
  environmentCreate(PermissionDescription environmentCreate) {

    this.environmentCreate = environmentCreate;
    return this;
  }

  /**
   * Get environmentCreate
   * @return environmentCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getEnvironmentCreate() {
    return environmentCreate;
  }

  public void setEnvironmentCreate(PermissionDescription environmentCreate) {
    this.environmentCreate = environmentCreate;
  }

  public InlineResponse200
  environmentEdit(PermissionDescription environmentEdit) {

    this.environmentEdit = environmentEdit;
    return this;
  }

  /**
   * Get environmentEdit
   * @return environmentEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getEnvironmentEdit() {
    return environmentEdit;
  }

  public void setEnvironmentEdit(PermissionDescription environmentEdit) {
    this.environmentEdit = environmentEdit;
  }

  public InlineResponse200
  environmentDelete(PermissionDescription environmentDelete) {

    this.environmentDelete = environmentDelete;
    return this;
  }

  /**
   * Get environmentDelete
   * @return environmentDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getEnvironmentDelete() {
    return environmentDelete;
  }

  public void setEnvironmentDelete(PermissionDescription environmentDelete) {
    this.environmentDelete = environmentDelete;
  }

  public InlineResponse200 machineCreate(PermissionDescription machineCreate) {

    this.machineCreate = machineCreate;
    return this;
  }

  /**
   * Get machineCreate
   * @return machineCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachineCreate() {
    return machineCreate;
  }

  public void setMachineCreate(PermissionDescription machineCreate) {
    this.machineCreate = machineCreate;
  }

  public InlineResponse200 machineEdit(PermissionDescription machineEdit) {

    this.machineEdit = machineEdit;
    return this;
  }

  /**
   * Get machineEdit
   * @return machineEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachineEdit() {
    return machineEdit;
  }

  public void setMachineEdit(PermissionDescription machineEdit) {
    this.machineEdit = machineEdit;
  }

  public InlineResponse200 machineView(PermissionDescription machineView) {

    this.machineView = machineView;
    return this;
  }

  /**
   * Get machineView
   * @return machineView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachineView() {
    return machineView;
  }

  public void setMachineView(PermissionDescription machineView) {
    this.machineView = machineView;
  }

  public InlineResponse200 machineDelete(PermissionDescription machineDelete) {

    this.machineDelete = machineDelete;
    return this;
  }

  /**
   * Get machineDelete
   * @return machineDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachineDelete() {
    return machineDelete;
  }

  public void setMachineDelete(PermissionDescription machineDelete) {
    this.machineDelete = machineDelete;
  }

  public InlineResponse200 artifactView(PermissionDescription artifactView) {

    this.artifactView = artifactView;
    return this;
  }

  /**
   * Get artifactView
   * @return artifactView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getArtifactView() {
    return artifactView;
  }

  public void setArtifactView(PermissionDescription artifactView) {
    this.artifactView = artifactView;
  }

  public InlineResponse200
  artifactCreate(PermissionDescription artifactCreate) {

    this.artifactCreate = artifactCreate;
    return this;
  }

  /**
   * Get artifactCreate
   * @return artifactCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getArtifactCreate() {
    return artifactCreate;
  }

  public void setArtifactCreate(PermissionDescription artifactCreate) {
    this.artifactCreate = artifactCreate;
  }

  public InlineResponse200 artifactEdit(PermissionDescription artifactEdit) {

    this.artifactEdit = artifactEdit;
    return this;
  }

  /**
   * Get artifactEdit
   * @return artifactEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getArtifactEdit() {
    return artifactEdit;
  }

  public void setArtifactEdit(PermissionDescription artifactEdit) {
    this.artifactEdit = artifactEdit;
  }

  public InlineResponse200
  artifactDelete(PermissionDescription artifactDelete) {

    this.artifactDelete = artifactDelete;
    return this;
  }

  /**
   * Get artifactDelete
   * @return artifactDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getArtifactDelete() {
    return artifactDelete;
  }

  public void setArtifactDelete(PermissionDescription artifactDelete) {
    this.artifactDelete = artifactDelete;
  }

  public InlineResponse200 feedView(PermissionDescription feedView) {

    this.feedView = feedView;
    return this;
  }

  /**
   * Get feedView
   * @return feedView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getFeedView() {
    return feedView;
  }

  public void setFeedView(PermissionDescription feedView) {
    this.feedView = feedView;
  }

  public InlineResponse200 eventView(PermissionDescription eventView) {

    this.eventView = eventView;
    return this;
  }

  /**
   * Get eventView
   * @return eventView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getEventView() {
    return eventView;
  }

  public void setEventView(PermissionDescription eventView) {
    this.eventView = eventView;
  }

  public InlineResponse200
  libraryVariableSetView(PermissionDescription libraryVariableSetView) {

    this.libraryVariableSetView = libraryVariableSetView;
    return this;
  }

  /**
   * Get libraryVariableSetView
   * @return libraryVariableSetView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLibraryVariableSetView() {
    return libraryVariableSetView;
  }

  public void
  setLibraryVariableSetView(PermissionDescription libraryVariableSetView) {
    this.libraryVariableSetView = libraryVariableSetView;
  }

  public InlineResponse200
  libraryVariableSetCreate(PermissionDescription libraryVariableSetCreate) {

    this.libraryVariableSetCreate = libraryVariableSetCreate;
    return this;
  }

  /**
   * Get libraryVariableSetCreate
   * @return libraryVariableSetCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLibraryVariableSetCreate() {
    return libraryVariableSetCreate;
  }

  public void
  setLibraryVariableSetCreate(PermissionDescription libraryVariableSetCreate) {
    this.libraryVariableSetCreate = libraryVariableSetCreate;
  }

  public InlineResponse200
  libraryVariableSetEdit(PermissionDescription libraryVariableSetEdit) {

    this.libraryVariableSetEdit = libraryVariableSetEdit;
    return this;
  }

  /**
   * Get libraryVariableSetEdit
   * @return libraryVariableSetEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLibraryVariableSetEdit() {
    return libraryVariableSetEdit;
  }

  public void
  setLibraryVariableSetEdit(PermissionDescription libraryVariableSetEdit) {
    this.libraryVariableSetEdit = libraryVariableSetEdit;
  }

  public InlineResponse200
  libraryVariableSetDelete(PermissionDescription libraryVariableSetDelete) {

    this.libraryVariableSetDelete = libraryVariableSetDelete;
    return this;
  }

  /**
   * Get libraryVariableSetDelete
   * @return libraryVariableSetDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLibraryVariableSetDelete() {
    return libraryVariableSetDelete;
  }

  public void
  setLibraryVariableSetDelete(PermissionDescription libraryVariableSetDelete) {
    this.libraryVariableSetDelete = libraryVariableSetDelete;
  }

  public InlineResponse200
  projectGroupView(PermissionDescription projectGroupView) {

    this.projectGroupView = projectGroupView;
    return this;
  }

  /**
   * Get projectGroupView
   * @return projectGroupView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectGroupView() {
    return projectGroupView;
  }

  public void setProjectGroupView(PermissionDescription projectGroupView) {
    this.projectGroupView = projectGroupView;
  }

  public InlineResponse200
  projectGroupCreate(PermissionDescription projectGroupCreate) {

    this.projectGroupCreate = projectGroupCreate;
    return this;
  }

  /**
   * Get projectGroupCreate
   * @return projectGroupCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectGroupCreate() {
    return projectGroupCreate;
  }

  public void setProjectGroupCreate(PermissionDescription projectGroupCreate) {
    this.projectGroupCreate = projectGroupCreate;
  }

  public InlineResponse200
  projectGroupEdit(PermissionDescription projectGroupEdit) {

    this.projectGroupEdit = projectGroupEdit;
    return this;
  }

  /**
   * Get projectGroupEdit
   * @return projectGroupEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectGroupEdit() {
    return projectGroupEdit;
  }

  public void setProjectGroupEdit(PermissionDescription projectGroupEdit) {
    this.projectGroupEdit = projectGroupEdit;
  }

  public InlineResponse200
  projectGroupDelete(PermissionDescription projectGroupDelete) {

    this.projectGroupDelete = projectGroupDelete;
    return this;
  }

  /**
   * Get projectGroupDelete
   * @return projectGroupDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProjectGroupDelete() {
    return projectGroupDelete;
  }

  public void setProjectGroupDelete(PermissionDescription projectGroupDelete) {
    this.projectGroupDelete = projectGroupDelete;
  }

  public InlineResponse200 teamCreate(PermissionDescription teamCreate) {

    this.teamCreate = teamCreate;
    return this;
  }

  /**
   * Get teamCreate
   * @return teamCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTeamCreate() {
    return teamCreate;
  }

  public void setTeamCreate(PermissionDescription teamCreate) {
    this.teamCreate = teamCreate;
  }

  public InlineResponse200 teamView(PermissionDescription teamView) {

    this.teamView = teamView;
    return this;
  }

  /**
   * Get teamView
   * @return teamView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTeamView() {
    return teamView;
  }

  public void setTeamView(PermissionDescription teamView) {
    this.teamView = teamView;
  }

  public InlineResponse200 teamEdit(PermissionDescription teamEdit) {

    this.teamEdit = teamEdit;
    return this;
  }

  /**
   * Get teamEdit
   * @return teamEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTeamEdit() {
    return teamEdit;
  }

  public void setTeamEdit(PermissionDescription teamEdit) {
    this.teamEdit = teamEdit;
  }

  public InlineResponse200 teamDelete(PermissionDescription teamDelete) {

    this.teamDelete = teamDelete;
    return this;
  }

  /**
   * Get teamDelete
   * @return teamDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTeamDelete() {
    return teamDelete;
  }

  public void setTeamDelete(PermissionDescription teamDelete) {
    this.teamDelete = teamDelete;
  }

  public InlineResponse200 userView(PermissionDescription userView) {

    this.userView = userView;
    return this;
  }

  /**
   * Get userView
   * @return userView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getUserView() {
    return userView;
  }

  public void setUserView(PermissionDescription userView) {
    this.userView = userView;
  }

  public InlineResponse200 userInvite(PermissionDescription userInvite) {

    this.userInvite = userInvite;
    return this;
  }

  /**
   * Get userInvite
   * @return userInvite
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getUserInvite() {
    return userInvite;
  }

  public void setUserInvite(PermissionDescription userInvite) {
    this.userInvite = userInvite;
  }

  public InlineResponse200 userRoleView(PermissionDescription userRoleView) {

    this.userRoleView = userRoleView;
    return this;
  }

  /**
   * Get userRoleView
   * @return userRoleView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getUserRoleView() {
    return userRoleView;
  }

  public void setUserRoleView(PermissionDescription userRoleView) {
    this.userRoleView = userRoleView;
  }

  public InlineResponse200 userRoleEdit(PermissionDescription userRoleEdit) {

    this.userRoleEdit = userRoleEdit;
    return this;
  }

  /**
   * Get userRoleEdit
   * @return userRoleEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getUserRoleEdit() {
    return userRoleEdit;
  }

  public void setUserRoleEdit(PermissionDescription userRoleEdit) {
    this.userRoleEdit = userRoleEdit;
  }

  public InlineResponse200 taskView(PermissionDescription taskView) {

    this.taskView = taskView;
    return this;
  }

  /**
   * Get taskView
   * @return taskView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTaskView() {
    return taskView;
  }

  public void setTaskView(PermissionDescription taskView) {
    this.taskView = taskView;
  }

  public InlineResponse200 taskCreate(PermissionDescription taskCreate) {

    this.taskCreate = taskCreate;
    return this;
  }

  /**
   * Get taskCreate
   * @return taskCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTaskCreate() {
    return taskCreate;
  }

  public void setTaskCreate(PermissionDescription taskCreate) {
    this.taskCreate = taskCreate;
  }

  public InlineResponse200 taskCancel(PermissionDescription taskCancel) {

    this.taskCancel = taskCancel;
    return this;
  }

  /**
   * Get taskCancel
   * @return taskCancel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTaskCancel() {
    return taskCancel;
  }

  public void setTaskCancel(PermissionDescription taskCancel) {
    this.taskCancel = taskCancel;
  }

  public InlineResponse200 taskEdit(PermissionDescription taskEdit) {

    this.taskEdit = taskEdit;
    return this;
  }

  /**
   * Get taskEdit
   * @return taskEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTaskEdit() {
    return taskEdit;
  }

  public void setTaskEdit(PermissionDescription taskEdit) {
    this.taskEdit = taskEdit;
  }

  public InlineResponse200
  interruptionView(PermissionDescription interruptionView) {

    this.interruptionView = interruptionView;
    return this;
  }

  /**
   * Get interruptionView
   * @return interruptionView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getInterruptionView() {
    return interruptionView;
  }

  public void setInterruptionView(PermissionDescription interruptionView) {
    this.interruptionView = interruptionView;
  }

  public InlineResponse200
  interruptionSubmit(PermissionDescription interruptionSubmit) {

    this.interruptionSubmit = interruptionSubmit;
    return this;
  }

  /**
   * Get interruptionSubmit
   * @return interruptionSubmit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getInterruptionSubmit() {
    return interruptionSubmit;
  }

  public void setInterruptionSubmit(PermissionDescription interruptionSubmit) {
    this.interruptionSubmit = interruptionSubmit;
  }

  public InlineResponse200 interruptionViewSubmitResponsible(
      PermissionDescription interruptionViewSubmitResponsible) {

    this.interruptionViewSubmitResponsible = interruptionViewSubmitResponsible;
    return this;
  }

  /**
   * Get interruptionViewSubmitResponsible
   * @return interruptionViewSubmitResponsible
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getInterruptionViewSubmitResponsible() {
    return interruptionViewSubmitResponsible;
  }

  public void setInterruptionViewSubmitResponsible(
      PermissionDescription interruptionViewSubmitResponsible) {
    this.interruptionViewSubmitResponsible = interruptionViewSubmitResponsible;
  }

  public InlineResponse200
  builtInFeedPush(PermissionDescription builtInFeedPush) {

    this.builtInFeedPush = builtInFeedPush;
    return this;
  }

  /**
   * Get builtInFeedPush
   * @return builtInFeedPush
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getBuiltInFeedPush() {
    return builtInFeedPush;
  }

  public void setBuiltInFeedPush(PermissionDescription builtInFeedPush) {
    this.builtInFeedPush = builtInFeedPush;
  }

  public InlineResponse200
  builtInFeedAdminister(PermissionDescription builtInFeedAdminister) {

    this.builtInFeedAdminister = builtInFeedAdminister;
    return this;
  }

  /**
   * Get builtInFeedAdminister
   * @return builtInFeedAdminister
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getBuiltInFeedAdminister() {
    return builtInFeedAdminister;
  }

  public void
  setBuiltInFeedAdminister(PermissionDescription builtInFeedAdminister) {
    this.builtInFeedAdminister = builtInFeedAdminister;
  }

  public InlineResponse200
  builtInFeedDownload(PermissionDescription builtInFeedDownload) {

    this.builtInFeedDownload = builtInFeedDownload;
    return this;
  }

  /**
   * Get builtInFeedDownload
   * @return builtInFeedDownload
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getBuiltInFeedDownload() {
    return builtInFeedDownload;
  }

  public void
  setBuiltInFeedDownload(PermissionDescription builtInFeedDownload) {
    this.builtInFeedDownload = builtInFeedDownload;
  }

  public InlineResponse200
  actionTemplateView(PermissionDescription actionTemplateView) {

    this.actionTemplateView = actionTemplateView;
    return this;
  }

  /**
   * Get actionTemplateView
   * @return actionTemplateView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getActionTemplateView() {
    return actionTemplateView;
  }

  public void setActionTemplateView(PermissionDescription actionTemplateView) {
    this.actionTemplateView = actionTemplateView;
  }

  public InlineResponse200
  actionTemplateCreate(PermissionDescription actionTemplateCreate) {

    this.actionTemplateCreate = actionTemplateCreate;
    return this;
  }

  /**
   * Get actionTemplateCreate
   * @return actionTemplateCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getActionTemplateCreate() {
    return actionTemplateCreate;
  }

  public void
  setActionTemplateCreate(PermissionDescription actionTemplateCreate) {
    this.actionTemplateCreate = actionTemplateCreate;
  }

  public InlineResponse200
  actionTemplateEdit(PermissionDescription actionTemplateEdit) {

    this.actionTemplateEdit = actionTemplateEdit;
    return this;
  }

  /**
   * Get actionTemplateEdit
   * @return actionTemplateEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getActionTemplateEdit() {
    return actionTemplateEdit;
  }

  public void setActionTemplateEdit(PermissionDescription actionTemplateEdit) {
    this.actionTemplateEdit = actionTemplateEdit;
  }

  public InlineResponse200
  actionTemplateDelete(PermissionDescription actionTemplateDelete) {

    this.actionTemplateDelete = actionTemplateDelete;
    return this;
  }

  /**
   * Get actionTemplateDelete
   * @return actionTemplateDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getActionTemplateDelete() {
    return actionTemplateDelete;
  }

  public void
  setActionTemplateDelete(PermissionDescription actionTemplateDelete) {
    this.actionTemplateDelete = actionTemplateDelete;
  }

  public InlineResponse200
  lifecycleCreate(PermissionDescription lifecycleCreate) {

    this.lifecycleCreate = lifecycleCreate;
    return this;
  }

  /**
   * Get lifecycleCreate
   * @return lifecycleCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLifecycleCreate() {
    return lifecycleCreate;
  }

  public void setLifecycleCreate(PermissionDescription lifecycleCreate) {
    this.lifecycleCreate = lifecycleCreate;
  }

  public InlineResponse200 lifecycleView(PermissionDescription lifecycleView) {

    this.lifecycleView = lifecycleView;
    return this;
  }

  /**
   * Get lifecycleView
   * @return lifecycleView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLifecycleView() {
    return lifecycleView;
  }

  public void setLifecycleView(PermissionDescription lifecycleView) {
    this.lifecycleView = lifecycleView;
  }

  public InlineResponse200 lifecycleEdit(PermissionDescription lifecycleEdit) {

    this.lifecycleEdit = lifecycleEdit;
    return this;
  }

  /**
   * Get lifecycleEdit
   * @return lifecycleEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLifecycleEdit() {
    return lifecycleEdit;
  }

  public void setLifecycleEdit(PermissionDescription lifecycleEdit) {
    this.lifecycleEdit = lifecycleEdit;
  }

  public InlineResponse200
  lifecycleDelete(PermissionDescription lifecycleDelete) {

    this.lifecycleDelete = lifecycleDelete;
    return this;
  }

  /**
   * Get lifecycleDelete
   * @return lifecycleDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getLifecycleDelete() {
    return lifecycleDelete;
  }

  public void setLifecycleDelete(PermissionDescription lifecycleDelete) {
    this.lifecycleDelete = lifecycleDelete;
  }

  public InlineResponse200 accountView(PermissionDescription accountView) {

    this.accountView = accountView;
    return this;
  }

  /**
   * Get accountView
   * @return accountView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getAccountView() {
    return accountView;
  }

  public void setAccountView(PermissionDescription accountView) {
    this.accountView = accountView;
  }

  public InlineResponse200 accountEdit(PermissionDescription accountEdit) {

    this.accountEdit = accountEdit;
    return this;
  }

  /**
   * Get accountEdit
   * @return accountEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getAccountEdit() {
    return accountEdit;
  }

  public void setAccountEdit(PermissionDescription accountEdit) {
    this.accountEdit = accountEdit;
  }

  public InlineResponse200 accountCreate(PermissionDescription accountCreate) {

    this.accountCreate = accountCreate;
    return this;
  }

  /**
   * Get accountCreate
   * @return accountCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getAccountCreate() {
    return accountCreate;
  }

  public void setAccountCreate(PermissionDescription accountCreate) {
    this.accountCreate = accountCreate;
  }

  public InlineResponse200 accountDelete(PermissionDescription accountDelete) {

    this.accountDelete = accountDelete;
    return this;
  }

  /**
   * Get accountDelete
   * @return accountDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getAccountDelete() {
    return accountDelete;
  }

  public void setAccountDelete(PermissionDescription accountDelete) {
    this.accountDelete = accountDelete;
  }

  public InlineResponse200 tenantCreate(PermissionDescription tenantCreate) {

    this.tenantCreate = tenantCreate;
    return this;
  }

  /**
   * Get tenantCreate
   * @return tenantCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTenantCreate() {
    return tenantCreate;
  }

  public void setTenantCreate(PermissionDescription tenantCreate) {
    this.tenantCreate = tenantCreate;
  }

  public InlineResponse200 tenantEdit(PermissionDescription tenantEdit) {

    this.tenantEdit = tenantEdit;
    return this;
  }

  /**
   * Get tenantEdit
   * @return tenantEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTenantEdit() {
    return tenantEdit;
  }

  public void setTenantEdit(PermissionDescription tenantEdit) {
    this.tenantEdit = tenantEdit;
  }

  public InlineResponse200 tenantView(PermissionDescription tenantView) {

    this.tenantView = tenantView;
    return this;
  }

  /**
   * Get tenantView
   * @return tenantView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTenantView() {
    return tenantView;
  }

  public void setTenantView(PermissionDescription tenantView) {
    this.tenantView = tenantView;
  }

  public InlineResponse200 tenantDelete(PermissionDescription tenantDelete) {

    this.tenantDelete = tenantDelete;
    return this;
  }

  /**
   * Get tenantDelete
   * @return tenantDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTenantDelete() {
    return tenantDelete;
  }

  public void setTenantDelete(PermissionDescription tenantDelete) {
    this.tenantDelete = tenantDelete;
  }

  public InlineResponse200 tagSetCreate(PermissionDescription tagSetCreate) {

    this.tagSetCreate = tagSetCreate;
    return this;
  }

  /**
   * Get tagSetCreate
   * @return tagSetCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTagSetCreate() {
    return tagSetCreate;
  }

  public void setTagSetCreate(PermissionDescription tagSetCreate) {
    this.tagSetCreate = tagSetCreate;
  }

  public InlineResponse200 tagSetEdit(PermissionDescription tagSetEdit) {

    this.tagSetEdit = tagSetEdit;
    return this;
  }

  /**
   * Get tagSetEdit
   * @return tagSetEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTagSetEdit() {
    return tagSetEdit;
  }

  public void setTagSetEdit(PermissionDescription tagSetEdit) {
    this.tagSetEdit = tagSetEdit;
  }

  public InlineResponse200 tagSetDelete(PermissionDescription tagSetDelete) {

    this.tagSetDelete = tagSetDelete;
    return this;
  }

  /**
   * Get tagSetDelete
   * @return tagSetDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTagSetDelete() {
    return tagSetDelete;
  }

  public void setTagSetDelete(PermissionDescription tagSetDelete) {
    this.tagSetDelete = tagSetDelete;
  }

  public InlineResponse200
  machinePolicyCreate(PermissionDescription machinePolicyCreate) {

    this.machinePolicyCreate = machinePolicyCreate;
    return this;
  }

  /**
   * Get machinePolicyCreate
   * @return machinePolicyCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachinePolicyCreate() {
    return machinePolicyCreate;
  }

  public void
  setMachinePolicyCreate(PermissionDescription machinePolicyCreate) {
    this.machinePolicyCreate = machinePolicyCreate;
  }

  public InlineResponse200
  machinePolicyView(PermissionDescription machinePolicyView) {

    this.machinePolicyView = machinePolicyView;
    return this;
  }

  /**
   * Get machinePolicyView
   * @return machinePolicyView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachinePolicyView() {
    return machinePolicyView;
  }

  public void setMachinePolicyView(PermissionDescription machinePolicyView) {
    this.machinePolicyView = machinePolicyView;
  }

  public InlineResponse200
  machinePolicyEdit(PermissionDescription machinePolicyEdit) {

    this.machinePolicyEdit = machinePolicyEdit;
    return this;
  }

  /**
   * Get machinePolicyEdit
   * @return machinePolicyEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachinePolicyEdit() {
    return machinePolicyEdit;
  }

  public void setMachinePolicyEdit(PermissionDescription machinePolicyEdit) {
    this.machinePolicyEdit = machinePolicyEdit;
  }

  public InlineResponse200
  machinePolicyDelete(PermissionDescription machinePolicyDelete) {

    this.machinePolicyDelete = machinePolicyDelete;
    return this;
  }

  /**
   * Get machinePolicyDelete
   * @return machinePolicyDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getMachinePolicyDelete() {
    return machinePolicyDelete;
  }

  public void
  setMachinePolicyDelete(PermissionDescription machinePolicyDelete) {
    this.machinePolicyDelete = machinePolicyDelete;
  }

  public InlineResponse200 proxyCreate(PermissionDescription proxyCreate) {

    this.proxyCreate = proxyCreate;
    return this;
  }

  /**
   * Get proxyCreate
   * @return proxyCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProxyCreate() {
    return proxyCreate;
  }

  public void setProxyCreate(PermissionDescription proxyCreate) {
    this.proxyCreate = proxyCreate;
  }

  public InlineResponse200 proxyView(PermissionDescription proxyView) {

    this.proxyView = proxyView;
    return this;
  }

  /**
   * Get proxyView
   * @return proxyView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProxyView() {
    return proxyView;
  }

  public void setProxyView(PermissionDescription proxyView) {
    this.proxyView = proxyView;
  }

  public InlineResponse200 proxyEdit(PermissionDescription proxyEdit) {

    this.proxyEdit = proxyEdit;
    return this;
  }

  /**
   * Get proxyEdit
   * @return proxyEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProxyEdit() {
    return proxyEdit;
  }

  public void setProxyEdit(PermissionDescription proxyEdit) {
    this.proxyEdit = proxyEdit;
  }

  public InlineResponse200 proxyDelete(PermissionDescription proxyDelete) {

    this.proxyDelete = proxyDelete;
    return this;
  }

  /**
   * Get proxyDelete
   * @return proxyDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getProxyDelete() {
    return proxyDelete;
  }

  public void setProxyDelete(PermissionDescription proxyDelete) {
    this.proxyDelete = proxyDelete;
  }

  public InlineResponse200
  subscriptionCreate(PermissionDescription subscriptionCreate) {

    this.subscriptionCreate = subscriptionCreate;
    return this;
  }

  /**
   * Get subscriptionCreate
   * @return subscriptionCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSubscriptionCreate() {
    return subscriptionCreate;
  }

  public void setSubscriptionCreate(PermissionDescription subscriptionCreate) {
    this.subscriptionCreate = subscriptionCreate;
  }

  public InlineResponse200
  subscriptionView(PermissionDescription subscriptionView) {

    this.subscriptionView = subscriptionView;
    return this;
  }

  /**
   * Get subscriptionView
   * @return subscriptionView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSubscriptionView() {
    return subscriptionView;
  }

  public void setSubscriptionView(PermissionDescription subscriptionView) {
    this.subscriptionView = subscriptionView;
  }

  public InlineResponse200
  subscriptionEdit(PermissionDescription subscriptionEdit) {

    this.subscriptionEdit = subscriptionEdit;
    return this;
  }

  /**
   * Get subscriptionEdit
   * @return subscriptionEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSubscriptionEdit() {
    return subscriptionEdit;
  }

  public void setSubscriptionEdit(PermissionDescription subscriptionEdit) {
    this.subscriptionEdit = subscriptionEdit;
  }

  public InlineResponse200
  subscriptionDelete(PermissionDescription subscriptionDelete) {

    this.subscriptionDelete = subscriptionDelete;
    return this;
  }

  /**
   * Get subscriptionDelete
   * @return subscriptionDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSubscriptionDelete() {
    return subscriptionDelete;
  }

  public void setSubscriptionDelete(PermissionDescription subscriptionDelete) {
    this.subscriptionDelete = subscriptionDelete;
  }

  public InlineResponse200 triggerCreate(PermissionDescription triggerCreate) {

    this.triggerCreate = triggerCreate;
    return this;
  }

  /**
   * Get triggerCreate
   * @return triggerCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTriggerCreate() {
    return triggerCreate;
  }

  public void setTriggerCreate(PermissionDescription triggerCreate) {
    this.triggerCreate = triggerCreate;
  }

  public InlineResponse200 triggerView(PermissionDescription triggerView) {

    this.triggerView = triggerView;
    return this;
  }

  /**
   * Get triggerView
   * @return triggerView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTriggerView() {
    return triggerView;
  }

  public void setTriggerView(PermissionDescription triggerView) {
    this.triggerView = triggerView;
  }

  public InlineResponse200 triggerEdit(PermissionDescription triggerEdit) {

    this.triggerEdit = triggerEdit;
    return this;
  }

  /**
   * Get triggerEdit
   * @return triggerEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTriggerEdit() {
    return triggerEdit;
  }

  public void setTriggerEdit(PermissionDescription triggerEdit) {
    this.triggerEdit = triggerEdit;
  }

  public InlineResponse200 triggerDelete(PermissionDescription triggerDelete) {

    this.triggerDelete = triggerDelete;
    return this;
  }

  /**
   * Get triggerDelete
   * @return triggerDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getTriggerDelete() {
    return triggerDelete;
  }

  public void setTriggerDelete(PermissionDescription triggerDelete) {
    this.triggerDelete = triggerDelete;
  }

  public InlineResponse200
  certificateView(PermissionDescription certificateView) {

    this.certificateView = certificateView;
    return this;
  }

  /**
   * Get certificateView
   * @return certificateView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getCertificateView() {
    return certificateView;
  }

  public void setCertificateView(PermissionDescription certificateView) {
    this.certificateView = certificateView;
  }

  public InlineResponse200
  certificateCreate(PermissionDescription certificateCreate) {

    this.certificateCreate = certificateCreate;
    return this;
  }

  /**
   * Get certificateCreate
   * @return certificateCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getCertificateCreate() {
    return certificateCreate;
  }

  public void setCertificateCreate(PermissionDescription certificateCreate) {
    this.certificateCreate = certificateCreate;
  }

  public InlineResponse200
  certificateEdit(PermissionDescription certificateEdit) {

    this.certificateEdit = certificateEdit;
    return this;
  }

  /**
   * Get certificateEdit
   * @return certificateEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getCertificateEdit() {
    return certificateEdit;
  }

  public void setCertificateEdit(PermissionDescription certificateEdit) {
    this.certificateEdit = certificateEdit;
  }

  public InlineResponse200
  certificateDelete(PermissionDescription certificateDelete) {

    this.certificateDelete = certificateDelete;
    return this;
  }

  /**
   * Get certificateDelete
   * @return certificateDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getCertificateDelete() {
    return certificateDelete;
  }

  public void setCertificateDelete(PermissionDescription certificateDelete) {
    this.certificateDelete = certificateDelete;
  }

  public InlineResponse200 certificateExportPrivateKey(
      PermissionDescription certificateExportPrivateKey) {

    this.certificateExportPrivateKey = certificateExportPrivateKey;
    return this;
  }

  /**
   * Get certificateExportPrivateKey
   * @return certificateExportPrivateKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getCertificateExportPrivateKey() {
    return certificateExportPrivateKey;
  }

  public void setCertificateExportPrivateKey(
      PermissionDescription certificateExportPrivateKey) {
    this.certificateExportPrivateKey = certificateExportPrivateKey;
  }

  public InlineResponse200 userEdit(PermissionDescription userEdit) {

    this.userEdit = userEdit;
    return this;
  }

  /**
   * Get userEdit
   * @return userEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getUserEdit() {
    return userEdit;
  }

  public void setUserEdit(PermissionDescription userEdit) {
    this.userEdit = userEdit;
  }

  public InlineResponse200
  configureServer(PermissionDescription configureServer) {

    this.configureServer = configureServer;
    return this;
  }

  /**
   * Get configureServer
   * @return configureServer
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getConfigureServer() {
    return configureServer;
  }

  public void setConfigureServer(PermissionDescription configureServer) {
    this.configureServer = configureServer;
  }

  public InlineResponse200 feedEdit(PermissionDescription feedEdit) {

    this.feedEdit = feedEdit;
    return this;
  }

  /**
   * Get feedEdit
   * @return feedEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getFeedEdit() {
    return feedEdit;
  }

  public void setFeedEdit(PermissionDescription feedEdit) {
    this.feedEdit = feedEdit;
  }

  public InlineResponse200 workerView(PermissionDescription workerView) {

    this.workerView = workerView;
    return this;
  }

  /**
   * Get workerView
   * @return workerView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getWorkerView() {
    return workerView;
  }

  public void setWorkerView(PermissionDescription workerView) {
    this.workerView = workerView;
  }

  public InlineResponse200 workerEdit(PermissionDescription workerEdit) {

    this.workerEdit = workerEdit;
    return this;
  }

  /**
   * Get workerEdit
   * @return workerEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getWorkerEdit() {
    return workerEdit;
  }

  public void setWorkerEdit(PermissionDescription workerEdit) {
    this.workerEdit = workerEdit;
  }

  public InlineResponse200 spaceEdit(PermissionDescription spaceEdit) {

    this.spaceEdit = spaceEdit;
    return this;
  }

  /**
   * Get spaceEdit
   * @return spaceEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSpaceEdit() {
    return spaceEdit;
  }

  public void setSpaceEdit(PermissionDescription spaceEdit) {
    this.spaceEdit = spaceEdit;
  }

  public InlineResponse200 spaceView(PermissionDescription spaceView) {

    this.spaceView = spaceView;
    return this;
  }

  /**
   * Get spaceView
   * @return spaceView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSpaceView() {
    return spaceView;
  }

  public void setSpaceView(PermissionDescription spaceView) {
    this.spaceView = spaceView;
  }

  public InlineResponse200 spaceDelete(PermissionDescription spaceDelete) {

    this.spaceDelete = spaceDelete;
    return this;
  }

  /**
   * Get spaceDelete
   * @return spaceDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSpaceDelete() {
    return spaceDelete;
  }

  public void setSpaceDelete(PermissionDescription spaceDelete) {
    this.spaceDelete = spaceDelete;
  }

  public InlineResponse200 spaceCreate(PermissionDescription spaceCreate) {

    this.spaceCreate = spaceCreate;
    return this;
  }

  /**
   * Get spaceCreate
   * @return spaceCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getSpaceCreate() {
    return spaceCreate;
  }

  public void setSpaceCreate(PermissionDescription spaceCreate) {
    this.spaceCreate = spaceCreate;
  }

  public InlineResponse200
  buildInformationPush(PermissionDescription buildInformationPush) {

    this.buildInformationPush = buildInformationPush;
    return this;
  }

  /**
   * Get buildInformationPush
   * @return buildInformationPush
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getBuildInformationPush() {
    return buildInformationPush;
  }

  public void
  setBuildInformationPush(PermissionDescription buildInformationPush) {
    this.buildInformationPush = buildInformationPush;
  }

  public InlineResponse200
  buildInformationAdminister(PermissionDescription buildInformationAdminister) {

    this.buildInformationAdminister = buildInformationAdminister;
    return this;
  }

  /**
   * Get buildInformationAdminister
   * @return buildInformationAdminister
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getBuildInformationAdminister() {
    return buildInformationAdminister;
  }

  public void setBuildInformationAdminister(
      PermissionDescription buildInformationAdminister) {
    this.buildInformationAdminister = buildInformationAdminister;
  }

  public InlineResponse200 runbookView(PermissionDescription runbookView) {

    this.runbookView = runbookView;
    return this;
  }

  /**
   * Get runbookView
   * @return runbookView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getRunbookView() {
    return runbookView;
  }

  public void setRunbookView(PermissionDescription runbookView) {
    this.runbookView = runbookView;
  }

  public InlineResponse200 runbookEdit(PermissionDescription runbookEdit) {

    this.runbookEdit = runbookEdit;
    return this;
  }

  /**
   * Get runbookEdit
   * @return runbookEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getRunbookEdit() {
    return runbookEdit;
  }

  public void setRunbookEdit(PermissionDescription runbookEdit) {
    this.runbookEdit = runbookEdit;
  }

  public InlineResponse200
  runbookRunView(PermissionDescription runbookRunView) {

    this.runbookRunView = runbookRunView;
    return this;
  }

  /**
   * Get runbookRunView
   * @return runbookRunView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getRunbookRunView() {
    return runbookRunView;
  }

  public void setRunbookRunView(PermissionDescription runbookRunView) {
    this.runbookRunView = runbookRunView;
  }

  public InlineResponse200
  runbookRunDelete(PermissionDescription runbookRunDelete) {

    this.runbookRunDelete = runbookRunDelete;
    return this;
  }

  /**
   * Get runbookRunDelete
   * @return runbookRunDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getRunbookRunDelete() {
    return runbookRunDelete;
  }

  public void setRunbookRunDelete(PermissionDescription runbookRunDelete) {
    this.runbookRunDelete = runbookRunDelete;
  }

  public InlineResponse200
  runbookRunCreate(PermissionDescription runbookRunCreate) {

    this.runbookRunCreate = runbookRunCreate;
    return this;
  }

  /**
   * Get runbookRunCreate
   * @return runbookRunCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionDescription getRunbookRunCreate() {
    return runbookRunCreate;
  }

  public void setRunbookRunCreate(PermissionDescription runbookRunCreate) {
    this.runbookRunCreate = runbookRunCreate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200)o;
    return Objects.equals(this.administerSystem,
                          inlineResponse200.administerSystem) &&
        Objects.equals(this.projectEdit, inlineResponse200.projectEdit) &&
        Objects.equals(this.projectView, inlineResponse200.projectView) &&
        Objects.equals(this.projectCreate, inlineResponse200.projectCreate) &&
        Objects.equals(this.projectDelete, inlineResponse200.projectDelete) &&
        Objects.equals(this.processView, inlineResponse200.processView) &&
        Objects.equals(this.processEdit, inlineResponse200.processEdit) &&
        Objects.equals(this.variableEdit, inlineResponse200.variableEdit) &&
        Objects.equals(this.variableEditUnscoped,
                       inlineResponse200.variableEditUnscoped) &&
        Objects.equals(this.variableView, inlineResponse200.variableView) &&
        Objects.equals(this.variableViewUnscoped,
                       inlineResponse200.variableViewUnscoped) &&
        Objects.equals(this.releaseCreate, inlineResponse200.releaseCreate) &&
        Objects.equals(this.releaseView, inlineResponse200.releaseView) &&
        Objects.equals(this.releaseEdit, inlineResponse200.releaseEdit) &&
        Objects.equals(this.releaseDelete, inlineResponse200.releaseDelete) &&
        Objects.equals(this.defectReport, inlineResponse200.defectReport) &&
        Objects.equals(this.defectResolve, inlineResponse200.defectResolve) &&
        Objects.equals(this.deploymentCreate,
                       inlineResponse200.deploymentCreate) &&
        Objects.equals(this.deploymentDelete,
                       inlineResponse200.deploymentDelete) &&
        Objects.equals(this.deploymentView, inlineResponse200.deploymentView) &&
        Objects.equals(this.environmentView,
                       inlineResponse200.environmentView) &&
        Objects.equals(this.environmentCreate,
                       inlineResponse200.environmentCreate) &&
        Objects.equals(this.environmentEdit,
                       inlineResponse200.environmentEdit) &&
        Objects.equals(this.environmentDelete,
                       inlineResponse200.environmentDelete) &&
        Objects.equals(this.machineCreate, inlineResponse200.machineCreate) &&
        Objects.equals(this.machineEdit, inlineResponse200.machineEdit) &&
        Objects.equals(this.machineView, inlineResponse200.machineView) &&
        Objects.equals(this.machineDelete, inlineResponse200.machineDelete) &&
        Objects.equals(this.artifactView, inlineResponse200.artifactView) &&
        Objects.equals(this.artifactCreate, inlineResponse200.artifactCreate) &&
        Objects.equals(this.artifactEdit, inlineResponse200.artifactEdit) &&
        Objects.equals(this.artifactDelete, inlineResponse200.artifactDelete) &&
        Objects.equals(this.feedView, inlineResponse200.feedView) &&
        Objects.equals(this.eventView, inlineResponse200.eventView) &&
        Objects.equals(this.libraryVariableSetView,
                       inlineResponse200.libraryVariableSetView) &&
        Objects.equals(this.libraryVariableSetCreate,
                       inlineResponse200.libraryVariableSetCreate) &&
        Objects.equals(this.libraryVariableSetEdit,
                       inlineResponse200.libraryVariableSetEdit) &&
        Objects.equals(this.libraryVariableSetDelete,
                       inlineResponse200.libraryVariableSetDelete) &&
        Objects.equals(this.projectGroupView,
                       inlineResponse200.projectGroupView) &&
        Objects.equals(this.projectGroupCreate,
                       inlineResponse200.projectGroupCreate) &&
        Objects.equals(this.projectGroupEdit,
                       inlineResponse200.projectGroupEdit) &&
        Objects.equals(this.projectGroupDelete,
                       inlineResponse200.projectGroupDelete) &&
        Objects.equals(this.teamCreate, inlineResponse200.teamCreate) &&
        Objects.equals(this.teamView, inlineResponse200.teamView) &&
        Objects.equals(this.teamEdit, inlineResponse200.teamEdit) &&
        Objects.equals(this.teamDelete, inlineResponse200.teamDelete) &&
        Objects.equals(this.userView, inlineResponse200.userView) &&
        Objects.equals(this.userInvite, inlineResponse200.userInvite) &&
        Objects.equals(this.userRoleView, inlineResponse200.userRoleView) &&
        Objects.equals(this.userRoleEdit, inlineResponse200.userRoleEdit) &&
        Objects.equals(this.taskView, inlineResponse200.taskView) &&
        Objects.equals(this.taskCreate, inlineResponse200.taskCreate) &&
        Objects.equals(this.taskCancel, inlineResponse200.taskCancel) &&
        Objects.equals(this.taskEdit, inlineResponse200.taskEdit) &&
        Objects.equals(this.interruptionView,
                       inlineResponse200.interruptionView) &&
        Objects.equals(this.interruptionSubmit,
                       inlineResponse200.interruptionSubmit) &&
        Objects.equals(this.interruptionViewSubmitResponsible,
                       inlineResponse200.interruptionViewSubmitResponsible) &&
        Objects.equals(this.builtInFeedPush,
                       inlineResponse200.builtInFeedPush) &&
        Objects.equals(this.builtInFeedAdminister,
                       inlineResponse200.builtInFeedAdminister) &&
        Objects.equals(this.builtInFeedDownload,
                       inlineResponse200.builtInFeedDownload) &&
        Objects.equals(this.actionTemplateView,
                       inlineResponse200.actionTemplateView) &&
        Objects.equals(this.actionTemplateCreate,
                       inlineResponse200.actionTemplateCreate) &&
        Objects.equals(this.actionTemplateEdit,
                       inlineResponse200.actionTemplateEdit) &&
        Objects.equals(this.actionTemplateDelete,
                       inlineResponse200.actionTemplateDelete) &&
        Objects.equals(this.lifecycleCreate,
                       inlineResponse200.lifecycleCreate) &&
        Objects.equals(this.lifecycleView, inlineResponse200.lifecycleView) &&
        Objects.equals(this.lifecycleEdit, inlineResponse200.lifecycleEdit) &&
        Objects.equals(this.lifecycleDelete,
                       inlineResponse200.lifecycleDelete) &&
        Objects.equals(this.accountView, inlineResponse200.accountView) &&
        Objects.equals(this.accountEdit, inlineResponse200.accountEdit) &&
        Objects.equals(this.accountCreate, inlineResponse200.accountCreate) &&
        Objects.equals(this.accountDelete, inlineResponse200.accountDelete) &&
        Objects.equals(this.tenantCreate, inlineResponse200.tenantCreate) &&
        Objects.equals(this.tenantEdit, inlineResponse200.tenantEdit) &&
        Objects.equals(this.tenantView, inlineResponse200.tenantView) &&
        Objects.equals(this.tenantDelete, inlineResponse200.tenantDelete) &&
        Objects.equals(this.tagSetCreate, inlineResponse200.tagSetCreate) &&
        Objects.equals(this.tagSetEdit, inlineResponse200.tagSetEdit) &&
        Objects.equals(this.tagSetDelete, inlineResponse200.tagSetDelete) &&
        Objects.equals(this.machinePolicyCreate,
                       inlineResponse200.machinePolicyCreate) &&
        Objects.equals(this.machinePolicyView,
                       inlineResponse200.machinePolicyView) &&
        Objects.equals(this.machinePolicyEdit,
                       inlineResponse200.machinePolicyEdit) &&
        Objects.equals(this.machinePolicyDelete,
                       inlineResponse200.machinePolicyDelete) &&
        Objects.equals(this.proxyCreate, inlineResponse200.proxyCreate) &&
        Objects.equals(this.proxyView, inlineResponse200.proxyView) &&
        Objects.equals(this.proxyEdit, inlineResponse200.proxyEdit) &&
        Objects.equals(this.proxyDelete, inlineResponse200.proxyDelete) &&
        Objects.equals(this.subscriptionCreate,
                       inlineResponse200.subscriptionCreate) &&
        Objects.equals(this.subscriptionView,
                       inlineResponse200.subscriptionView) &&
        Objects.equals(this.subscriptionEdit,
                       inlineResponse200.subscriptionEdit) &&
        Objects.equals(this.subscriptionDelete,
                       inlineResponse200.subscriptionDelete) &&
        Objects.equals(this.triggerCreate, inlineResponse200.triggerCreate) &&
        Objects.equals(this.triggerView, inlineResponse200.triggerView) &&
        Objects.equals(this.triggerEdit, inlineResponse200.triggerEdit) &&
        Objects.equals(this.triggerDelete, inlineResponse200.triggerDelete) &&
        Objects.equals(this.certificateView,
                       inlineResponse200.certificateView) &&
        Objects.equals(this.certificateCreate,
                       inlineResponse200.certificateCreate) &&
        Objects.equals(this.certificateEdit,
                       inlineResponse200.certificateEdit) &&
        Objects.equals(this.certificateDelete,
                       inlineResponse200.certificateDelete) &&
        Objects.equals(this.certificateExportPrivateKey,
                       inlineResponse200.certificateExportPrivateKey) &&
        Objects.equals(this.userEdit, inlineResponse200.userEdit) &&
        Objects.equals(this.configureServer,
                       inlineResponse200.configureServer) &&
        Objects.equals(this.feedEdit, inlineResponse200.feedEdit) &&
        Objects.equals(this.workerView, inlineResponse200.workerView) &&
        Objects.equals(this.workerEdit, inlineResponse200.workerEdit) &&
        Objects.equals(this.spaceEdit, inlineResponse200.spaceEdit) &&
        Objects.equals(this.spaceView, inlineResponse200.spaceView) &&
        Objects.equals(this.spaceDelete, inlineResponse200.spaceDelete) &&
        Objects.equals(this.spaceCreate, inlineResponse200.spaceCreate) &&
        Objects.equals(this.buildInformationPush,
                       inlineResponse200.buildInformationPush) &&
        Objects.equals(this.buildInformationAdminister,
                       inlineResponse200.buildInformationAdminister) &&
        Objects.equals(this.runbookView, inlineResponse200.runbookView) &&
        Objects.equals(this.runbookEdit, inlineResponse200.runbookEdit) &&
        Objects.equals(this.runbookRunView, inlineResponse200.runbookRunView) &&
        Objects.equals(this.runbookRunDelete,
                       inlineResponse200.runbookRunDelete) &&
        Objects.equals(this.runbookRunCreate,
                       inlineResponse200.runbookRunCreate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        administerSystem, projectEdit, projectView, projectCreate,
        projectDelete, processView, processEdit, variableEdit,
        variableEditUnscoped, variableView, variableViewUnscoped, releaseCreate,
        releaseView, releaseEdit, releaseDelete, defectReport, defectResolve,
        deploymentCreate, deploymentDelete, deploymentView, environmentView,
        environmentCreate, environmentEdit, environmentDelete, machineCreate,
        machineEdit, machineView, machineDelete, artifactView, artifactCreate,
        artifactEdit, artifactDelete, feedView, eventView,
        libraryVariableSetView, libraryVariableSetCreate,
        libraryVariableSetEdit, libraryVariableSetDelete, projectGroupView,
        projectGroupCreate, projectGroupEdit, projectGroupDelete, teamCreate,
        teamView, teamEdit, teamDelete, userView, userInvite, userRoleView,
        userRoleEdit, taskView, taskCreate, taskCancel, taskEdit,
        interruptionView, interruptionSubmit, interruptionViewSubmitResponsible,
        builtInFeedPush, builtInFeedAdminister, builtInFeedDownload,
        actionTemplateView, actionTemplateCreate, actionTemplateEdit,
        actionTemplateDelete, lifecycleCreate, lifecycleView, lifecycleEdit,
        lifecycleDelete, accountView, accountEdit, accountCreate, accountDelete,
        tenantCreate, tenantEdit, tenantView, tenantDelete, tagSetCreate,
        tagSetEdit, tagSetDelete, machinePolicyCreate, machinePolicyView,
        machinePolicyEdit, machinePolicyDelete, proxyCreate, proxyView,
        proxyEdit, proxyDelete, subscriptionCreate, subscriptionView,
        subscriptionEdit, subscriptionDelete, triggerCreate, triggerView,
        triggerEdit, triggerDelete, certificateView, certificateCreate,
        certificateEdit, certificateDelete, certificateExportPrivateKey,
        userEdit, configureServer, feedEdit, workerView, workerEdit, spaceEdit,
        spaceView, spaceDelete, spaceCreate, buildInformationPush,
        buildInformationAdminister, runbookView, runbookEdit, runbookRunView,
        runbookRunDelete, runbookRunCreate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    administerSystem: ")
        .append(toIndentedString(administerSystem))
        .append("\n");
    sb.append("    projectEdit: ")
        .append(toIndentedString(projectEdit))
        .append("\n");
    sb.append("    projectView: ")
        .append(toIndentedString(projectView))
        .append("\n");
    sb.append("    projectCreate: ")
        .append(toIndentedString(projectCreate))
        .append("\n");
    sb.append("    projectDelete: ")
        .append(toIndentedString(projectDelete))
        .append("\n");
    sb.append("    processView: ")
        .append(toIndentedString(processView))
        .append("\n");
    sb.append("    processEdit: ")
        .append(toIndentedString(processEdit))
        .append("\n");
    sb.append("    variableEdit: ")
        .append(toIndentedString(variableEdit))
        .append("\n");
    sb.append("    variableEditUnscoped: ")
        .append(toIndentedString(variableEditUnscoped))
        .append("\n");
    sb.append("    variableView: ")
        .append(toIndentedString(variableView))
        .append("\n");
    sb.append("    variableViewUnscoped: ")
        .append(toIndentedString(variableViewUnscoped))
        .append("\n");
    sb.append("    releaseCreate: ")
        .append(toIndentedString(releaseCreate))
        .append("\n");
    sb.append("    releaseView: ")
        .append(toIndentedString(releaseView))
        .append("\n");
    sb.append("    releaseEdit: ")
        .append(toIndentedString(releaseEdit))
        .append("\n");
    sb.append("    releaseDelete: ")
        .append(toIndentedString(releaseDelete))
        .append("\n");
    sb.append("    defectReport: ")
        .append(toIndentedString(defectReport))
        .append("\n");
    sb.append("    defectResolve: ")
        .append(toIndentedString(defectResolve))
        .append("\n");
    sb.append("    deploymentCreate: ")
        .append(toIndentedString(deploymentCreate))
        .append("\n");
    sb.append("    deploymentDelete: ")
        .append(toIndentedString(deploymentDelete))
        .append("\n");
    sb.append("    deploymentView: ")
        .append(toIndentedString(deploymentView))
        .append("\n");
    sb.append("    environmentView: ")
        .append(toIndentedString(environmentView))
        .append("\n");
    sb.append("    environmentCreate: ")
        .append(toIndentedString(environmentCreate))
        .append("\n");
    sb.append("    environmentEdit: ")
        .append(toIndentedString(environmentEdit))
        .append("\n");
    sb.append("    environmentDelete: ")
        .append(toIndentedString(environmentDelete))
        .append("\n");
    sb.append("    machineCreate: ")
        .append(toIndentedString(machineCreate))
        .append("\n");
    sb.append("    machineEdit: ")
        .append(toIndentedString(machineEdit))
        .append("\n");
    sb.append("    machineView: ")
        .append(toIndentedString(machineView))
        .append("\n");
    sb.append("    machineDelete: ")
        .append(toIndentedString(machineDelete))
        .append("\n");
    sb.append("    artifactView: ")
        .append(toIndentedString(artifactView))
        .append("\n");
    sb.append("    artifactCreate: ")
        .append(toIndentedString(artifactCreate))
        .append("\n");
    sb.append("    artifactEdit: ")
        .append(toIndentedString(artifactEdit))
        .append("\n");
    sb.append("    artifactDelete: ")
        .append(toIndentedString(artifactDelete))
        .append("\n");
    sb.append("    feedView: ").append(toIndentedString(feedView)).append("\n");
    sb.append("    eventView: ")
        .append(toIndentedString(eventView))
        .append("\n");
    sb.append("    libraryVariableSetView: ")
        .append(toIndentedString(libraryVariableSetView))
        .append("\n");
    sb.append("    libraryVariableSetCreate: ")
        .append(toIndentedString(libraryVariableSetCreate))
        .append("\n");
    sb.append("    libraryVariableSetEdit: ")
        .append(toIndentedString(libraryVariableSetEdit))
        .append("\n");
    sb.append("    libraryVariableSetDelete: ")
        .append(toIndentedString(libraryVariableSetDelete))
        .append("\n");
    sb.append("    projectGroupView: ")
        .append(toIndentedString(projectGroupView))
        .append("\n");
    sb.append("    projectGroupCreate: ")
        .append(toIndentedString(projectGroupCreate))
        .append("\n");
    sb.append("    projectGroupEdit: ")
        .append(toIndentedString(projectGroupEdit))
        .append("\n");
    sb.append("    projectGroupDelete: ")
        .append(toIndentedString(projectGroupDelete))
        .append("\n");
    sb.append("    teamCreate: ")
        .append(toIndentedString(teamCreate))
        .append("\n");
    sb.append("    teamView: ").append(toIndentedString(teamView)).append("\n");
    sb.append("    teamEdit: ").append(toIndentedString(teamEdit)).append("\n");
    sb.append("    teamDelete: ")
        .append(toIndentedString(teamDelete))
        .append("\n");
    sb.append("    userView: ").append(toIndentedString(userView)).append("\n");
    sb.append("    userInvite: ")
        .append(toIndentedString(userInvite))
        .append("\n");
    sb.append("    userRoleView: ")
        .append(toIndentedString(userRoleView))
        .append("\n");
    sb.append("    userRoleEdit: ")
        .append(toIndentedString(userRoleEdit))
        .append("\n");
    sb.append("    taskView: ").append(toIndentedString(taskView)).append("\n");
    sb.append("    taskCreate: ")
        .append(toIndentedString(taskCreate))
        .append("\n");
    sb.append("    taskCancel: ")
        .append(toIndentedString(taskCancel))
        .append("\n");
    sb.append("    taskEdit: ").append(toIndentedString(taskEdit)).append("\n");
    sb.append("    interruptionView: ")
        .append(toIndentedString(interruptionView))
        .append("\n");
    sb.append("    interruptionSubmit: ")
        .append(toIndentedString(interruptionSubmit))
        .append("\n");
    sb.append("    interruptionViewSubmitResponsible: ")
        .append(toIndentedString(interruptionViewSubmitResponsible))
        .append("\n");
    sb.append("    builtInFeedPush: ")
        .append(toIndentedString(builtInFeedPush))
        .append("\n");
    sb.append("    builtInFeedAdminister: ")
        .append(toIndentedString(builtInFeedAdminister))
        .append("\n");
    sb.append("    builtInFeedDownload: ")
        .append(toIndentedString(builtInFeedDownload))
        .append("\n");
    sb.append("    actionTemplateView: ")
        .append(toIndentedString(actionTemplateView))
        .append("\n");
    sb.append("    actionTemplateCreate: ")
        .append(toIndentedString(actionTemplateCreate))
        .append("\n");
    sb.append("    actionTemplateEdit: ")
        .append(toIndentedString(actionTemplateEdit))
        .append("\n");
    sb.append("    actionTemplateDelete: ")
        .append(toIndentedString(actionTemplateDelete))
        .append("\n");
    sb.append("    lifecycleCreate: ")
        .append(toIndentedString(lifecycleCreate))
        .append("\n");
    sb.append("    lifecycleView: ")
        .append(toIndentedString(lifecycleView))
        .append("\n");
    sb.append("    lifecycleEdit: ")
        .append(toIndentedString(lifecycleEdit))
        .append("\n");
    sb.append("    lifecycleDelete: ")
        .append(toIndentedString(lifecycleDelete))
        .append("\n");
    sb.append("    accountView: ")
        .append(toIndentedString(accountView))
        .append("\n");
    sb.append("    accountEdit: ")
        .append(toIndentedString(accountEdit))
        .append("\n");
    sb.append("    accountCreate: ")
        .append(toIndentedString(accountCreate))
        .append("\n");
    sb.append("    accountDelete: ")
        .append(toIndentedString(accountDelete))
        .append("\n");
    sb.append("    tenantCreate: ")
        .append(toIndentedString(tenantCreate))
        .append("\n");
    sb.append("    tenantEdit: ")
        .append(toIndentedString(tenantEdit))
        .append("\n");
    sb.append("    tenantView: ")
        .append(toIndentedString(tenantView))
        .append("\n");
    sb.append("    tenantDelete: ")
        .append(toIndentedString(tenantDelete))
        .append("\n");
    sb.append("    tagSetCreate: ")
        .append(toIndentedString(tagSetCreate))
        .append("\n");
    sb.append("    tagSetEdit: ")
        .append(toIndentedString(tagSetEdit))
        .append("\n");
    sb.append("    tagSetDelete: ")
        .append(toIndentedString(tagSetDelete))
        .append("\n");
    sb.append("    machinePolicyCreate: ")
        .append(toIndentedString(machinePolicyCreate))
        .append("\n");
    sb.append("    machinePolicyView: ")
        .append(toIndentedString(machinePolicyView))
        .append("\n");
    sb.append("    machinePolicyEdit: ")
        .append(toIndentedString(machinePolicyEdit))
        .append("\n");
    sb.append("    machinePolicyDelete: ")
        .append(toIndentedString(machinePolicyDelete))
        .append("\n");
    sb.append("    proxyCreate: ")
        .append(toIndentedString(proxyCreate))
        .append("\n");
    sb.append("    proxyView: ")
        .append(toIndentedString(proxyView))
        .append("\n");
    sb.append("    proxyEdit: ")
        .append(toIndentedString(proxyEdit))
        .append("\n");
    sb.append("    proxyDelete: ")
        .append(toIndentedString(proxyDelete))
        .append("\n");
    sb.append("    subscriptionCreate: ")
        .append(toIndentedString(subscriptionCreate))
        .append("\n");
    sb.append("    subscriptionView: ")
        .append(toIndentedString(subscriptionView))
        .append("\n");
    sb.append("    subscriptionEdit: ")
        .append(toIndentedString(subscriptionEdit))
        .append("\n");
    sb.append("    subscriptionDelete: ")
        .append(toIndentedString(subscriptionDelete))
        .append("\n");
    sb.append("    triggerCreate: ")
        .append(toIndentedString(triggerCreate))
        .append("\n");
    sb.append("    triggerView: ")
        .append(toIndentedString(triggerView))
        .append("\n");
    sb.append("    triggerEdit: ")
        .append(toIndentedString(triggerEdit))
        .append("\n");
    sb.append("    triggerDelete: ")
        .append(toIndentedString(triggerDelete))
        .append("\n");
    sb.append("    certificateView: ")
        .append(toIndentedString(certificateView))
        .append("\n");
    sb.append("    certificateCreate: ")
        .append(toIndentedString(certificateCreate))
        .append("\n");
    sb.append("    certificateEdit: ")
        .append(toIndentedString(certificateEdit))
        .append("\n");
    sb.append("    certificateDelete: ")
        .append(toIndentedString(certificateDelete))
        .append("\n");
    sb.append("    certificateExportPrivateKey: ")
        .append(toIndentedString(certificateExportPrivateKey))
        .append("\n");
    sb.append("    userEdit: ").append(toIndentedString(userEdit)).append("\n");
    sb.append("    configureServer: ")
        .append(toIndentedString(configureServer))
        .append("\n");
    sb.append("    feedEdit: ").append(toIndentedString(feedEdit)).append("\n");
    sb.append("    workerView: ")
        .append(toIndentedString(workerView))
        .append("\n");
    sb.append("    workerEdit: ")
        .append(toIndentedString(workerEdit))
        .append("\n");
    sb.append("    spaceEdit: ")
        .append(toIndentedString(spaceEdit))
        .append("\n");
    sb.append("    spaceView: ")
        .append(toIndentedString(spaceView))
        .append("\n");
    sb.append("    spaceDelete: ")
        .append(toIndentedString(spaceDelete))
        .append("\n");
    sb.append("    spaceCreate: ")
        .append(toIndentedString(spaceCreate))
        .append("\n");
    sb.append("    buildInformationPush: ")
        .append(toIndentedString(buildInformationPush))
        .append("\n");
    sb.append("    buildInformationAdminister: ")
        .append(toIndentedString(buildInformationAdminister))
        .append("\n");
    sb.append("    runbookView: ")
        .append(toIndentedString(runbookView))
        .append("\n");
    sb.append("    runbookEdit: ")
        .append(toIndentedString(runbookEdit))
        .append("\n");
    sb.append("    runbookRunView: ")
        .append(toIndentedString(runbookRunView))
        .append("\n");
    sb.append("    runbookRunDelete: ")
        .append(toIndentedString(runbookRunDelete))
        .append("\n");
    sb.append("    runbookRunCreate: ")
        .append(toIndentedString(runbookRunCreate))
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
