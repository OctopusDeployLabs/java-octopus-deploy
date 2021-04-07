// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.UserPermissionRestriction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * UserPermissionSetResourceSpacePermissions
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class UserPermissionSetResourceSpacePermissions {
  public static final String SERIALIZED_NAME_ADMINISTER_SYSTEM =
      "AdministerSystem";
  @SerializedName(SERIALIZED_NAME_ADMINISTER_SYSTEM)
  private List<UserPermissionRestriction> administerSystem = null;

  public static final String SERIALIZED_NAME_PROJECT_EDIT = "ProjectEdit";
  @SerializedName(SERIALIZED_NAME_PROJECT_EDIT)
  private List<UserPermissionRestriction> projectEdit = null;

  public static final String SERIALIZED_NAME_PROJECT_VIEW = "ProjectView";
  @SerializedName(SERIALIZED_NAME_PROJECT_VIEW)
  private List<UserPermissionRestriction> projectView = null;

  public static final String SERIALIZED_NAME_PROJECT_CREATE = "ProjectCreate";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE)
  private List<UserPermissionRestriction> projectCreate = null;

  public static final String SERIALIZED_NAME_PROJECT_DELETE = "ProjectDelete";
  @SerializedName(SERIALIZED_NAME_PROJECT_DELETE)
  private List<UserPermissionRestriction> projectDelete = null;

  public static final String SERIALIZED_NAME_PROCESS_VIEW = "ProcessView";
  @SerializedName(SERIALIZED_NAME_PROCESS_VIEW)
  private List<UserPermissionRestriction> processView = null;

  public static final String SERIALIZED_NAME_PROCESS_EDIT = "ProcessEdit";
  @SerializedName(SERIALIZED_NAME_PROCESS_EDIT)
  private List<UserPermissionRestriction> processEdit = null;

  public static final String SERIALIZED_NAME_VARIABLE_EDIT = "VariableEdit";
  @SerializedName(SERIALIZED_NAME_VARIABLE_EDIT)
  private List<UserPermissionRestriction> variableEdit = null;

  public static final String SERIALIZED_NAME_VARIABLE_EDIT_UNSCOPED =
      "VariableEditUnscoped";
  @SerializedName(SERIALIZED_NAME_VARIABLE_EDIT_UNSCOPED)
  private List<UserPermissionRestriction> variableEditUnscoped = null;

  public static final String SERIALIZED_NAME_VARIABLE_VIEW = "VariableView";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VIEW)
  private List<UserPermissionRestriction> variableView = null;

  public static final String SERIALIZED_NAME_VARIABLE_VIEW_UNSCOPED =
      "VariableViewUnscoped";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VIEW_UNSCOPED)
  private List<UserPermissionRestriction> variableViewUnscoped = null;

  public static final String SERIALIZED_NAME_RELEASE_CREATE = "ReleaseCreate";
  @SerializedName(SERIALIZED_NAME_RELEASE_CREATE)
  private List<UserPermissionRestriction> releaseCreate = null;

  public static final String SERIALIZED_NAME_RELEASE_VIEW = "ReleaseView";
  @SerializedName(SERIALIZED_NAME_RELEASE_VIEW)
  private List<UserPermissionRestriction> releaseView = null;

  public static final String SERIALIZED_NAME_RELEASE_EDIT = "ReleaseEdit";
  @SerializedName(SERIALIZED_NAME_RELEASE_EDIT)
  private List<UserPermissionRestriction> releaseEdit = null;

  public static final String SERIALIZED_NAME_RELEASE_DELETE = "ReleaseDelete";
  @SerializedName(SERIALIZED_NAME_RELEASE_DELETE)
  private List<UserPermissionRestriction> releaseDelete = null;

  public static final String SERIALIZED_NAME_DEFECT_REPORT = "DefectReport";
  @SerializedName(SERIALIZED_NAME_DEFECT_REPORT)
  private List<UserPermissionRestriction> defectReport = null;

  public static final String SERIALIZED_NAME_DEFECT_RESOLVE = "DefectResolve";
  @SerializedName(SERIALIZED_NAME_DEFECT_RESOLVE)
  private List<UserPermissionRestriction> defectResolve = null;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CREATE =
      "DeploymentCreate";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CREATE)
  private List<UserPermissionRestriction> deploymentCreate = null;

  public static final String SERIALIZED_NAME_DEPLOYMENT_DELETE =
      "DeploymentDelete";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_DELETE)
  private List<UserPermissionRestriction> deploymentDelete = null;

  public static final String SERIALIZED_NAME_DEPLOYMENT_VIEW = "DeploymentView";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_VIEW)
  private List<UserPermissionRestriction> deploymentView = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_VIEW =
      "EnvironmentView";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_VIEW)
  private List<UserPermissionRestriction> environmentView = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_CREATE =
      "EnvironmentCreate";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_CREATE)
  private List<UserPermissionRestriction> environmentCreate = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_EDIT =
      "EnvironmentEdit";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_EDIT)
  private List<UserPermissionRestriction> environmentEdit = null;

  public static final String SERIALIZED_NAME_ENVIRONMENT_DELETE =
      "EnvironmentDelete";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_DELETE)
  private List<UserPermissionRestriction> environmentDelete = null;

  public static final String SERIALIZED_NAME_MACHINE_CREATE = "MachineCreate";
  @SerializedName(SERIALIZED_NAME_MACHINE_CREATE)
  private List<UserPermissionRestriction> machineCreate = null;

  public static final String SERIALIZED_NAME_MACHINE_EDIT = "MachineEdit";
  @SerializedName(SERIALIZED_NAME_MACHINE_EDIT)
  private List<UserPermissionRestriction> machineEdit = null;

  public static final String SERIALIZED_NAME_MACHINE_VIEW = "MachineView";
  @SerializedName(SERIALIZED_NAME_MACHINE_VIEW)
  private List<UserPermissionRestriction> machineView = null;

  public static final String SERIALIZED_NAME_MACHINE_DELETE = "MachineDelete";
  @SerializedName(SERIALIZED_NAME_MACHINE_DELETE)
  private List<UserPermissionRestriction> machineDelete = null;

  public static final String SERIALIZED_NAME_ARTIFACT_VIEW = "ArtifactView";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_VIEW)
  private List<UserPermissionRestriction> artifactView = null;

  public static final String SERIALIZED_NAME_ARTIFACT_CREATE = "ArtifactCreate";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_CREATE)
  private List<UserPermissionRestriction> artifactCreate = null;

  public static final String SERIALIZED_NAME_ARTIFACT_EDIT = "ArtifactEdit";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_EDIT)
  private List<UserPermissionRestriction> artifactEdit = null;

  public static final String SERIALIZED_NAME_ARTIFACT_DELETE = "ArtifactDelete";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_DELETE)
  private List<UserPermissionRestriction> artifactDelete = null;

  public static final String SERIALIZED_NAME_FEED_VIEW = "FeedView";
  @SerializedName(SERIALIZED_NAME_FEED_VIEW)
  private List<UserPermissionRestriction> feedView = null;

  public static final String SERIALIZED_NAME_EVENT_VIEW = "EventView";
  @SerializedName(SERIALIZED_NAME_EVENT_VIEW)
  private List<UserPermissionRestriction> eventView = null;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_VIEW =
      "LibraryVariableSetView";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_VIEW)
  private List<UserPermissionRestriction> libraryVariableSetView = null;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_CREATE =
      "LibraryVariableSetCreate";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_CREATE)
  private List<UserPermissionRestriction> libraryVariableSetCreate = null;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_EDIT =
      "LibraryVariableSetEdit";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_EDIT)
  private List<UserPermissionRestriction> libraryVariableSetEdit = null;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_DELETE =
      "LibraryVariableSetDelete";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_DELETE)
  private List<UserPermissionRestriction> libraryVariableSetDelete = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_VIEW =
      "ProjectGroupView";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_VIEW)
  private List<UserPermissionRestriction> projectGroupView = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_CREATE =
      "ProjectGroupCreate";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_CREATE)
  private List<UserPermissionRestriction> projectGroupCreate = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_EDIT =
      "ProjectGroupEdit";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_EDIT)
  private List<UserPermissionRestriction> projectGroupEdit = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_DELETE =
      "ProjectGroupDelete";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_DELETE)
  private List<UserPermissionRestriction> projectGroupDelete = null;

  public static final String SERIALIZED_NAME_TEAM_CREATE = "TeamCreate";
  @SerializedName(SERIALIZED_NAME_TEAM_CREATE)
  private List<UserPermissionRestriction> teamCreate = null;

  public static final String SERIALIZED_NAME_TEAM_VIEW = "TeamView";
  @SerializedName(SERIALIZED_NAME_TEAM_VIEW)
  private List<UserPermissionRestriction> teamView = null;

  public static final String SERIALIZED_NAME_TEAM_EDIT = "TeamEdit";
  @SerializedName(SERIALIZED_NAME_TEAM_EDIT)
  private List<UserPermissionRestriction> teamEdit = null;

  public static final String SERIALIZED_NAME_TEAM_DELETE = "TeamDelete";
  @SerializedName(SERIALIZED_NAME_TEAM_DELETE)
  private List<UserPermissionRestriction> teamDelete = null;

  public static final String SERIALIZED_NAME_USER_VIEW = "UserView";
  @SerializedName(SERIALIZED_NAME_USER_VIEW)
  private List<UserPermissionRestriction> userView = null;

  public static final String SERIALIZED_NAME_USER_INVITE = "UserInvite";
  @SerializedName(SERIALIZED_NAME_USER_INVITE)
  private List<UserPermissionRestriction> userInvite = null;

  public static final String SERIALIZED_NAME_USER_ROLE_VIEW = "UserRoleView";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_VIEW)
  private List<UserPermissionRestriction> userRoleView = null;

  public static final String SERIALIZED_NAME_USER_ROLE_EDIT = "UserRoleEdit";
  @SerializedName(SERIALIZED_NAME_USER_ROLE_EDIT)
  private List<UserPermissionRestriction> userRoleEdit = null;

  public static final String SERIALIZED_NAME_TASK_VIEW = "TaskView";
  @SerializedName(SERIALIZED_NAME_TASK_VIEW)
  private List<UserPermissionRestriction> taskView = null;

  public static final String SERIALIZED_NAME_TASK_CREATE = "TaskCreate";
  @SerializedName(SERIALIZED_NAME_TASK_CREATE)
  private List<UserPermissionRestriction> taskCreate = null;

  public static final String SERIALIZED_NAME_TASK_CANCEL = "TaskCancel";
  @SerializedName(SERIALIZED_NAME_TASK_CANCEL)
  private List<UserPermissionRestriction> taskCancel = null;

  public static final String SERIALIZED_NAME_TASK_EDIT = "TaskEdit";
  @SerializedName(SERIALIZED_NAME_TASK_EDIT)
  private List<UserPermissionRestriction> taskEdit = null;

  public static final String SERIALIZED_NAME_INTERRUPTION_VIEW =
      "InterruptionView";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_VIEW)
  private List<UserPermissionRestriction> interruptionView = null;

  public static final String SERIALIZED_NAME_INTERRUPTION_SUBMIT =
      "InterruptionSubmit";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_SUBMIT)
  private List<UserPermissionRestriction> interruptionSubmit = null;

  public static final String
      SERIALIZED_NAME_INTERRUPTION_VIEW_SUBMIT_RESPONSIBLE =
          "InterruptionViewSubmitResponsible";
  @SerializedName(SERIALIZED_NAME_INTERRUPTION_VIEW_SUBMIT_RESPONSIBLE)
  private List<UserPermissionRestriction> interruptionViewSubmitResponsible =
      null;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_PUSH =
      "BuiltInFeedPush";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_PUSH)
  private List<UserPermissionRestriction> builtInFeedPush = null;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_ADMINISTER =
      "BuiltInFeedAdminister";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_ADMINISTER)
  private List<UserPermissionRestriction> builtInFeedAdminister = null;

  public static final String SERIALIZED_NAME_BUILT_IN_FEED_DOWNLOAD =
      "BuiltInFeedDownload";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_FEED_DOWNLOAD)
  private List<UserPermissionRestriction> builtInFeedDownload = null;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_VIEW =
      "ActionTemplateView";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_VIEW)
  private List<UserPermissionRestriction> actionTemplateView = null;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_CREATE =
      "ActionTemplateCreate";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_CREATE)
  private List<UserPermissionRestriction> actionTemplateCreate = null;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_EDIT =
      "ActionTemplateEdit";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_EDIT)
  private List<UserPermissionRestriction> actionTemplateEdit = null;

  public static final String SERIALIZED_NAME_ACTION_TEMPLATE_DELETE =
      "ActionTemplateDelete";
  @SerializedName(SERIALIZED_NAME_ACTION_TEMPLATE_DELETE)
  private List<UserPermissionRestriction> actionTemplateDelete = null;

  public static final String SERIALIZED_NAME_LIFECYCLE_CREATE =
      "LifecycleCreate";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_CREATE)
  private List<UserPermissionRestriction> lifecycleCreate = null;

  public static final String SERIALIZED_NAME_LIFECYCLE_VIEW = "LifecycleView";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_VIEW)
  private List<UserPermissionRestriction> lifecycleView = null;

  public static final String SERIALIZED_NAME_LIFECYCLE_EDIT = "LifecycleEdit";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_EDIT)
  private List<UserPermissionRestriction> lifecycleEdit = null;

  public static final String SERIALIZED_NAME_LIFECYCLE_DELETE =
      "LifecycleDelete";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_DELETE)
  private List<UserPermissionRestriction> lifecycleDelete = null;

  public static final String SERIALIZED_NAME_ACCOUNT_VIEW = "AccountView";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_VIEW)
  private List<UserPermissionRestriction> accountView = null;

  public static final String SERIALIZED_NAME_ACCOUNT_EDIT = "AccountEdit";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_EDIT)
  private List<UserPermissionRestriction> accountEdit = null;

  public static final String SERIALIZED_NAME_ACCOUNT_CREATE = "AccountCreate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CREATE)
  private List<UserPermissionRestriction> accountCreate = null;

  public static final String SERIALIZED_NAME_ACCOUNT_DELETE = "AccountDelete";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DELETE)
  private List<UserPermissionRestriction> accountDelete = null;

  public static final String SERIALIZED_NAME_TENANT_CREATE = "TenantCreate";
  @SerializedName(SERIALIZED_NAME_TENANT_CREATE)
  private List<UserPermissionRestriction> tenantCreate = null;

  public static final String SERIALIZED_NAME_TENANT_EDIT = "TenantEdit";
  @SerializedName(SERIALIZED_NAME_TENANT_EDIT)
  private List<UserPermissionRestriction> tenantEdit = null;

  public static final String SERIALIZED_NAME_TENANT_VIEW = "TenantView";
  @SerializedName(SERIALIZED_NAME_TENANT_VIEW)
  private List<UserPermissionRestriction> tenantView = null;

  public static final String SERIALIZED_NAME_TENANT_DELETE = "TenantDelete";
  @SerializedName(SERIALIZED_NAME_TENANT_DELETE)
  private List<UserPermissionRestriction> tenantDelete = null;

  public static final String SERIALIZED_NAME_TAG_SET_CREATE = "TagSetCreate";
  @SerializedName(SERIALIZED_NAME_TAG_SET_CREATE)
  private List<UserPermissionRestriction> tagSetCreate = null;

  public static final String SERIALIZED_NAME_TAG_SET_EDIT = "TagSetEdit";
  @SerializedName(SERIALIZED_NAME_TAG_SET_EDIT)
  private List<UserPermissionRestriction> tagSetEdit = null;

  public static final String SERIALIZED_NAME_TAG_SET_DELETE = "TagSetDelete";
  @SerializedName(SERIALIZED_NAME_TAG_SET_DELETE)
  private List<UserPermissionRestriction> tagSetDelete = null;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_CREATE =
      "MachinePolicyCreate";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_CREATE)
  private List<UserPermissionRestriction> machinePolicyCreate = null;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_VIEW =
      "MachinePolicyView";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_VIEW)
  private List<UserPermissionRestriction> machinePolicyView = null;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_EDIT =
      "MachinePolicyEdit";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_EDIT)
  private List<UserPermissionRestriction> machinePolicyEdit = null;

  public static final String SERIALIZED_NAME_MACHINE_POLICY_DELETE =
      "MachinePolicyDelete";
  @SerializedName(SERIALIZED_NAME_MACHINE_POLICY_DELETE)
  private List<UserPermissionRestriction> machinePolicyDelete = null;

  public static final String SERIALIZED_NAME_PROXY_CREATE = "ProxyCreate";
  @SerializedName(SERIALIZED_NAME_PROXY_CREATE)
  private List<UserPermissionRestriction> proxyCreate = null;

  public static final String SERIALIZED_NAME_PROXY_VIEW = "ProxyView";
  @SerializedName(SERIALIZED_NAME_PROXY_VIEW)
  private List<UserPermissionRestriction> proxyView = null;

  public static final String SERIALIZED_NAME_PROXY_EDIT = "ProxyEdit";
  @SerializedName(SERIALIZED_NAME_PROXY_EDIT)
  private List<UserPermissionRestriction> proxyEdit = null;

  public static final String SERIALIZED_NAME_PROXY_DELETE = "ProxyDelete";
  @SerializedName(SERIALIZED_NAME_PROXY_DELETE)
  private List<UserPermissionRestriction> proxyDelete = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_CREATE =
      "SubscriptionCreate";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_CREATE)
  private List<UserPermissionRestriction> subscriptionCreate = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_VIEW =
      "SubscriptionView";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_VIEW)
  private List<UserPermissionRestriction> subscriptionView = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_EDIT =
      "SubscriptionEdit";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EDIT)
  private List<UserPermissionRestriction> subscriptionEdit = null;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_DELETE =
      "SubscriptionDelete";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_DELETE)
  private List<UserPermissionRestriction> subscriptionDelete = null;

  public static final String SERIALIZED_NAME_TRIGGER_CREATE = "TriggerCreate";
  @SerializedName(SERIALIZED_NAME_TRIGGER_CREATE)
  private List<UserPermissionRestriction> triggerCreate = null;

  public static final String SERIALIZED_NAME_TRIGGER_VIEW = "TriggerView";
  @SerializedName(SERIALIZED_NAME_TRIGGER_VIEW)
  private List<UserPermissionRestriction> triggerView = null;

  public static final String SERIALIZED_NAME_TRIGGER_EDIT = "TriggerEdit";
  @SerializedName(SERIALIZED_NAME_TRIGGER_EDIT)
  private List<UserPermissionRestriction> triggerEdit = null;

  public static final String SERIALIZED_NAME_TRIGGER_DELETE = "TriggerDelete";
  @SerializedName(SERIALIZED_NAME_TRIGGER_DELETE)
  private List<UserPermissionRestriction> triggerDelete = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_VIEW =
      "CertificateView";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_VIEW)
  private List<UserPermissionRestriction> certificateView = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_CREATE =
      "CertificateCreate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CREATE)
  private List<UserPermissionRestriction> certificateCreate = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_EDIT =
      "CertificateEdit";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_EDIT)
  private List<UserPermissionRestriction> certificateEdit = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_DELETE =
      "CertificateDelete";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DELETE)
  private List<UserPermissionRestriction> certificateDelete = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_EXPORT_PRIVATE_KEY =
      "CertificateExportPrivateKey";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_EXPORT_PRIVATE_KEY)
  private List<UserPermissionRestriction> certificateExportPrivateKey = null;

  public static final String SERIALIZED_NAME_USER_EDIT = "UserEdit";
  @SerializedName(SERIALIZED_NAME_USER_EDIT)
  private List<UserPermissionRestriction> userEdit = null;

  public static final String SERIALIZED_NAME_CONFIGURE_SERVER =
      "ConfigureServer";
  @SerializedName(SERIALIZED_NAME_CONFIGURE_SERVER)
  private List<UserPermissionRestriction> configureServer = null;

  public static final String SERIALIZED_NAME_FEED_EDIT = "FeedEdit";
  @SerializedName(SERIALIZED_NAME_FEED_EDIT)
  private List<UserPermissionRestriction> feedEdit = null;

  public static final String SERIALIZED_NAME_WORKER_VIEW = "WorkerView";
  @SerializedName(SERIALIZED_NAME_WORKER_VIEW)
  private List<UserPermissionRestriction> workerView = null;

  public static final String SERIALIZED_NAME_WORKER_EDIT = "WorkerEdit";
  @SerializedName(SERIALIZED_NAME_WORKER_EDIT)
  private List<UserPermissionRestriction> workerEdit = null;

  public static final String SERIALIZED_NAME_SPACE_EDIT = "SpaceEdit";
  @SerializedName(SERIALIZED_NAME_SPACE_EDIT)
  private List<UserPermissionRestriction> spaceEdit = null;

  public static final String SERIALIZED_NAME_SPACE_VIEW = "SpaceView";
  @SerializedName(SERIALIZED_NAME_SPACE_VIEW)
  private List<UserPermissionRestriction> spaceView = null;

  public static final String SERIALIZED_NAME_SPACE_DELETE = "SpaceDelete";
  @SerializedName(SERIALIZED_NAME_SPACE_DELETE)
  private List<UserPermissionRestriction> spaceDelete = null;

  public static final String SERIALIZED_NAME_SPACE_CREATE = "SpaceCreate";
  @SerializedName(SERIALIZED_NAME_SPACE_CREATE)
  private List<UserPermissionRestriction> spaceCreate = null;

  public static final String SERIALIZED_NAME_BUILD_INFORMATION_PUSH =
      "BuildInformationPush";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION_PUSH)
  private List<UserPermissionRestriction> buildInformationPush = null;

  public static final String SERIALIZED_NAME_BUILD_INFORMATION_ADMINISTER =
      "BuildInformationAdminister";
  @SerializedName(SERIALIZED_NAME_BUILD_INFORMATION_ADMINISTER)
  private List<UserPermissionRestriction> buildInformationAdminister = null;

  public static final String SERIALIZED_NAME_RUNBOOK_VIEW = "RunbookView";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_VIEW)
  private List<UserPermissionRestriction> runbookView = null;

  public static final String SERIALIZED_NAME_RUNBOOK_EDIT = "RunbookEdit";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_EDIT)
  private List<UserPermissionRestriction> runbookEdit = null;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_VIEW =
      "RunbookRunView";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_VIEW)
  private List<UserPermissionRestriction> runbookRunView = null;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_DELETE =
      "RunbookRunDelete";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_DELETE)
  private List<UserPermissionRestriction> runbookRunDelete = null;

  public static final String SERIALIZED_NAME_RUNBOOK_RUN_CREATE =
      "RunbookRunCreate";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_RUN_CREATE)
  private List<UserPermissionRestriction> runbookRunCreate = null;

  public UserPermissionSetResourceSpacePermissions
  administerSystem(List<UserPermissionRestriction> administerSystem) {

    this.administerSystem = administerSystem;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addAdministerSystemItem(UserPermissionRestriction administerSystemItem) {
    if (this.administerSystem == null) {
      this.administerSystem = new ArrayList<UserPermissionRestriction>();
    }
    this.administerSystem.add(administerSystemItem);
    return this;
  }

  /**
   * Get administerSystem
   * @return administerSystem
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getAdministerSystem() {
    return administerSystem;
  }

  public void
  setAdministerSystem(List<UserPermissionRestriction> administerSystem) {
    this.administerSystem = administerSystem;
  }

  public UserPermissionSetResourceSpacePermissions
  projectEdit(List<UserPermissionRestriction> projectEdit) {

    this.projectEdit = projectEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectEditItem(UserPermissionRestriction projectEditItem) {
    if (this.projectEdit == null) {
      this.projectEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.projectEdit.add(projectEditItem);
    return this;
  }

  /**
   * Get projectEdit
   * @return projectEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectEdit() {
    return projectEdit;
  }

  public void setProjectEdit(List<UserPermissionRestriction> projectEdit) {
    this.projectEdit = projectEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  projectView(List<UserPermissionRestriction> projectView) {

    this.projectView = projectView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectViewItem(UserPermissionRestriction projectViewItem) {
    if (this.projectView == null) {
      this.projectView = new ArrayList<UserPermissionRestriction>();
    }
    this.projectView.add(projectViewItem);
    return this;
  }

  /**
   * Get projectView
   * @return projectView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectView() {
    return projectView;
  }

  public void setProjectView(List<UserPermissionRestriction> projectView) {
    this.projectView = projectView;
  }

  public UserPermissionSetResourceSpacePermissions
  projectCreate(List<UserPermissionRestriction> projectCreate) {

    this.projectCreate = projectCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectCreateItem(UserPermissionRestriction projectCreateItem) {
    if (this.projectCreate == null) {
      this.projectCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.projectCreate.add(projectCreateItem);
    return this;
  }

  /**
   * Get projectCreate
   * @return projectCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectCreate() {
    return projectCreate;
  }

  public void setProjectCreate(List<UserPermissionRestriction> projectCreate) {
    this.projectCreate = projectCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  projectDelete(List<UserPermissionRestriction> projectDelete) {

    this.projectDelete = projectDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectDeleteItem(UserPermissionRestriction projectDeleteItem) {
    if (this.projectDelete == null) {
      this.projectDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.projectDelete.add(projectDeleteItem);
    return this;
  }

  /**
   * Get projectDelete
   * @return projectDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectDelete() {
    return projectDelete;
  }

  public void setProjectDelete(List<UserPermissionRestriction> projectDelete) {
    this.projectDelete = projectDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  processView(List<UserPermissionRestriction> processView) {

    this.processView = processView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProcessViewItem(UserPermissionRestriction processViewItem) {
    if (this.processView == null) {
      this.processView = new ArrayList<UserPermissionRestriction>();
    }
    this.processView.add(processViewItem);
    return this;
  }

  /**
   * Get processView
   * @return processView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProcessView() {
    return processView;
  }

  public void setProcessView(List<UserPermissionRestriction> processView) {
    this.processView = processView;
  }

  public UserPermissionSetResourceSpacePermissions
  processEdit(List<UserPermissionRestriction> processEdit) {

    this.processEdit = processEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProcessEditItem(UserPermissionRestriction processEditItem) {
    if (this.processEdit == null) {
      this.processEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.processEdit.add(processEditItem);
    return this;
  }

  /**
   * Get processEdit
   * @return processEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProcessEdit() {
    return processEdit;
  }

  public void setProcessEdit(List<UserPermissionRestriction> processEdit) {
    this.processEdit = processEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  variableEdit(List<UserPermissionRestriction> variableEdit) {

    this.variableEdit = variableEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addVariableEditItem(UserPermissionRestriction variableEditItem) {
    if (this.variableEdit == null) {
      this.variableEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.variableEdit.add(variableEditItem);
    return this;
  }

  /**
   * Get variableEdit
   * @return variableEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getVariableEdit() {
    return variableEdit;
  }

  public void setVariableEdit(List<UserPermissionRestriction> variableEdit) {
    this.variableEdit = variableEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  variableEditUnscoped(List<UserPermissionRestriction> variableEditUnscoped) {

    this.variableEditUnscoped = variableEditUnscoped;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addVariableEditUnscopedItem(
      UserPermissionRestriction variableEditUnscopedItem) {
    if (this.variableEditUnscoped == null) {
      this.variableEditUnscoped = new ArrayList<UserPermissionRestriction>();
    }
    this.variableEditUnscoped.add(variableEditUnscopedItem);
    return this;
  }

  /**
   * Get variableEditUnscoped
   * @return variableEditUnscoped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getVariableEditUnscoped() {
    return variableEditUnscoped;
  }

  public void setVariableEditUnscoped(
      List<UserPermissionRestriction> variableEditUnscoped) {
    this.variableEditUnscoped = variableEditUnscoped;
  }

  public UserPermissionSetResourceSpacePermissions
  variableView(List<UserPermissionRestriction> variableView) {

    this.variableView = variableView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addVariableViewItem(UserPermissionRestriction variableViewItem) {
    if (this.variableView == null) {
      this.variableView = new ArrayList<UserPermissionRestriction>();
    }
    this.variableView.add(variableViewItem);
    return this;
  }

  /**
   * Get variableView
   * @return variableView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getVariableView() {
    return variableView;
  }

  public void setVariableView(List<UserPermissionRestriction> variableView) {
    this.variableView = variableView;
  }

  public UserPermissionSetResourceSpacePermissions
  variableViewUnscoped(List<UserPermissionRestriction> variableViewUnscoped) {

    this.variableViewUnscoped = variableViewUnscoped;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addVariableViewUnscopedItem(
      UserPermissionRestriction variableViewUnscopedItem) {
    if (this.variableViewUnscoped == null) {
      this.variableViewUnscoped = new ArrayList<UserPermissionRestriction>();
    }
    this.variableViewUnscoped.add(variableViewUnscopedItem);
    return this;
  }

  /**
   * Get variableViewUnscoped
   * @return variableViewUnscoped
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getVariableViewUnscoped() {
    return variableViewUnscoped;
  }

  public void setVariableViewUnscoped(
      List<UserPermissionRestriction> variableViewUnscoped) {
    this.variableViewUnscoped = variableViewUnscoped;
  }

  public UserPermissionSetResourceSpacePermissions
  releaseCreate(List<UserPermissionRestriction> releaseCreate) {

    this.releaseCreate = releaseCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addReleaseCreateItem(UserPermissionRestriction releaseCreateItem) {
    if (this.releaseCreate == null) {
      this.releaseCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.releaseCreate.add(releaseCreateItem);
    return this;
  }

  /**
   * Get releaseCreate
   * @return releaseCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getReleaseCreate() {
    return releaseCreate;
  }

  public void setReleaseCreate(List<UserPermissionRestriction> releaseCreate) {
    this.releaseCreate = releaseCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  releaseView(List<UserPermissionRestriction> releaseView) {

    this.releaseView = releaseView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addReleaseViewItem(UserPermissionRestriction releaseViewItem) {
    if (this.releaseView == null) {
      this.releaseView = new ArrayList<UserPermissionRestriction>();
    }
    this.releaseView.add(releaseViewItem);
    return this;
  }

  /**
   * Get releaseView
   * @return releaseView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getReleaseView() {
    return releaseView;
  }

  public void setReleaseView(List<UserPermissionRestriction> releaseView) {
    this.releaseView = releaseView;
  }

  public UserPermissionSetResourceSpacePermissions
  releaseEdit(List<UserPermissionRestriction> releaseEdit) {

    this.releaseEdit = releaseEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addReleaseEditItem(UserPermissionRestriction releaseEditItem) {
    if (this.releaseEdit == null) {
      this.releaseEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.releaseEdit.add(releaseEditItem);
    return this;
  }

  /**
   * Get releaseEdit
   * @return releaseEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getReleaseEdit() {
    return releaseEdit;
  }

  public void setReleaseEdit(List<UserPermissionRestriction> releaseEdit) {
    this.releaseEdit = releaseEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  releaseDelete(List<UserPermissionRestriction> releaseDelete) {

    this.releaseDelete = releaseDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addReleaseDeleteItem(UserPermissionRestriction releaseDeleteItem) {
    if (this.releaseDelete == null) {
      this.releaseDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.releaseDelete.add(releaseDeleteItem);
    return this;
  }

  /**
   * Get releaseDelete
   * @return releaseDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getReleaseDelete() {
    return releaseDelete;
  }

  public void setReleaseDelete(List<UserPermissionRestriction> releaseDelete) {
    this.releaseDelete = releaseDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  defectReport(List<UserPermissionRestriction> defectReport) {

    this.defectReport = defectReport;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addDefectReportItem(UserPermissionRestriction defectReportItem) {
    if (this.defectReport == null) {
      this.defectReport = new ArrayList<UserPermissionRestriction>();
    }
    this.defectReport.add(defectReportItem);
    return this;
  }

  /**
   * Get defectReport
   * @return defectReport
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getDefectReport() {
    return defectReport;
  }

  public void setDefectReport(List<UserPermissionRestriction> defectReport) {
    this.defectReport = defectReport;
  }

  public UserPermissionSetResourceSpacePermissions
  defectResolve(List<UserPermissionRestriction> defectResolve) {

    this.defectResolve = defectResolve;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addDefectResolveItem(UserPermissionRestriction defectResolveItem) {
    if (this.defectResolve == null) {
      this.defectResolve = new ArrayList<UserPermissionRestriction>();
    }
    this.defectResolve.add(defectResolveItem);
    return this;
  }

  /**
   * Get defectResolve
   * @return defectResolve
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getDefectResolve() {
    return defectResolve;
  }

  public void setDefectResolve(List<UserPermissionRestriction> defectResolve) {
    this.defectResolve = defectResolve;
  }

  public UserPermissionSetResourceSpacePermissions
  deploymentCreate(List<UserPermissionRestriction> deploymentCreate) {

    this.deploymentCreate = deploymentCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addDeploymentCreateItem(UserPermissionRestriction deploymentCreateItem) {
    if (this.deploymentCreate == null) {
      this.deploymentCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.deploymentCreate.add(deploymentCreateItem);
    return this;
  }

  /**
   * Get deploymentCreate
   * @return deploymentCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getDeploymentCreate() {
    return deploymentCreate;
  }

  public void
  setDeploymentCreate(List<UserPermissionRestriction> deploymentCreate) {
    this.deploymentCreate = deploymentCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  deploymentDelete(List<UserPermissionRestriction> deploymentDelete) {

    this.deploymentDelete = deploymentDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addDeploymentDeleteItem(UserPermissionRestriction deploymentDeleteItem) {
    if (this.deploymentDelete == null) {
      this.deploymentDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.deploymentDelete.add(deploymentDeleteItem);
    return this;
  }

  /**
   * Get deploymentDelete
   * @return deploymentDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getDeploymentDelete() {
    return deploymentDelete;
  }

  public void
  setDeploymentDelete(List<UserPermissionRestriction> deploymentDelete) {
    this.deploymentDelete = deploymentDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  deploymentView(List<UserPermissionRestriction> deploymentView) {

    this.deploymentView = deploymentView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addDeploymentViewItem(UserPermissionRestriction deploymentViewItem) {
    if (this.deploymentView == null) {
      this.deploymentView = new ArrayList<UserPermissionRestriction>();
    }
    this.deploymentView.add(deploymentViewItem);
    return this;
  }

  /**
   * Get deploymentView
   * @return deploymentView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getDeploymentView() {
    return deploymentView;
  }

  public void
  setDeploymentView(List<UserPermissionRestriction> deploymentView) {
    this.deploymentView = deploymentView;
  }

  public UserPermissionSetResourceSpacePermissions
  environmentView(List<UserPermissionRestriction> environmentView) {

    this.environmentView = environmentView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addEnvironmentViewItem(UserPermissionRestriction environmentViewItem) {
    if (this.environmentView == null) {
      this.environmentView = new ArrayList<UserPermissionRestriction>();
    }
    this.environmentView.add(environmentViewItem);
    return this;
  }

  /**
   * Get environmentView
   * @return environmentView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getEnvironmentView() {
    return environmentView;
  }

  public void
  setEnvironmentView(List<UserPermissionRestriction> environmentView) {
    this.environmentView = environmentView;
  }

  public UserPermissionSetResourceSpacePermissions
  environmentCreate(List<UserPermissionRestriction> environmentCreate) {

    this.environmentCreate = environmentCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addEnvironmentCreateItem(UserPermissionRestriction environmentCreateItem) {
    if (this.environmentCreate == null) {
      this.environmentCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.environmentCreate.add(environmentCreateItem);
    return this;
  }

  /**
   * Get environmentCreate
   * @return environmentCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getEnvironmentCreate() {
    return environmentCreate;
  }

  public void
  setEnvironmentCreate(List<UserPermissionRestriction> environmentCreate) {
    this.environmentCreate = environmentCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  environmentEdit(List<UserPermissionRestriction> environmentEdit) {

    this.environmentEdit = environmentEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addEnvironmentEditItem(UserPermissionRestriction environmentEditItem) {
    if (this.environmentEdit == null) {
      this.environmentEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.environmentEdit.add(environmentEditItem);
    return this;
  }

  /**
   * Get environmentEdit
   * @return environmentEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getEnvironmentEdit() {
    return environmentEdit;
  }

  public void
  setEnvironmentEdit(List<UserPermissionRestriction> environmentEdit) {
    this.environmentEdit = environmentEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  environmentDelete(List<UserPermissionRestriction> environmentDelete) {

    this.environmentDelete = environmentDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addEnvironmentDeleteItem(UserPermissionRestriction environmentDeleteItem) {
    if (this.environmentDelete == null) {
      this.environmentDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.environmentDelete.add(environmentDeleteItem);
    return this;
  }

  /**
   * Get environmentDelete
   * @return environmentDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getEnvironmentDelete() {
    return environmentDelete;
  }

  public void
  setEnvironmentDelete(List<UserPermissionRestriction> environmentDelete) {
    this.environmentDelete = environmentDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  machineCreate(List<UserPermissionRestriction> machineCreate) {

    this.machineCreate = machineCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachineCreateItem(UserPermissionRestriction machineCreateItem) {
    if (this.machineCreate == null) {
      this.machineCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.machineCreate.add(machineCreateItem);
    return this;
  }

  /**
   * Get machineCreate
   * @return machineCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachineCreate() {
    return machineCreate;
  }

  public void setMachineCreate(List<UserPermissionRestriction> machineCreate) {
    this.machineCreate = machineCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  machineEdit(List<UserPermissionRestriction> machineEdit) {

    this.machineEdit = machineEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachineEditItem(UserPermissionRestriction machineEditItem) {
    if (this.machineEdit == null) {
      this.machineEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.machineEdit.add(machineEditItem);
    return this;
  }

  /**
   * Get machineEdit
   * @return machineEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachineEdit() {
    return machineEdit;
  }

  public void setMachineEdit(List<UserPermissionRestriction> machineEdit) {
    this.machineEdit = machineEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  machineView(List<UserPermissionRestriction> machineView) {

    this.machineView = machineView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachineViewItem(UserPermissionRestriction machineViewItem) {
    if (this.machineView == null) {
      this.machineView = new ArrayList<UserPermissionRestriction>();
    }
    this.machineView.add(machineViewItem);
    return this;
  }

  /**
   * Get machineView
   * @return machineView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachineView() {
    return machineView;
  }

  public void setMachineView(List<UserPermissionRestriction> machineView) {
    this.machineView = machineView;
  }

  public UserPermissionSetResourceSpacePermissions
  machineDelete(List<UserPermissionRestriction> machineDelete) {

    this.machineDelete = machineDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachineDeleteItem(UserPermissionRestriction machineDeleteItem) {
    if (this.machineDelete == null) {
      this.machineDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.machineDelete.add(machineDeleteItem);
    return this;
  }

  /**
   * Get machineDelete
   * @return machineDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachineDelete() {
    return machineDelete;
  }

  public void setMachineDelete(List<UserPermissionRestriction> machineDelete) {
    this.machineDelete = machineDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  artifactView(List<UserPermissionRestriction> artifactView) {

    this.artifactView = artifactView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addArtifactViewItem(UserPermissionRestriction artifactViewItem) {
    if (this.artifactView == null) {
      this.artifactView = new ArrayList<UserPermissionRestriction>();
    }
    this.artifactView.add(artifactViewItem);
    return this;
  }

  /**
   * Get artifactView
   * @return artifactView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getArtifactView() {
    return artifactView;
  }

  public void setArtifactView(List<UserPermissionRestriction> artifactView) {
    this.artifactView = artifactView;
  }

  public UserPermissionSetResourceSpacePermissions
  artifactCreate(List<UserPermissionRestriction> artifactCreate) {

    this.artifactCreate = artifactCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addArtifactCreateItem(UserPermissionRestriction artifactCreateItem) {
    if (this.artifactCreate == null) {
      this.artifactCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.artifactCreate.add(artifactCreateItem);
    return this;
  }

  /**
   * Get artifactCreate
   * @return artifactCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getArtifactCreate() {
    return artifactCreate;
  }

  public void
  setArtifactCreate(List<UserPermissionRestriction> artifactCreate) {
    this.artifactCreate = artifactCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  artifactEdit(List<UserPermissionRestriction> artifactEdit) {

    this.artifactEdit = artifactEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addArtifactEditItem(UserPermissionRestriction artifactEditItem) {
    if (this.artifactEdit == null) {
      this.artifactEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.artifactEdit.add(artifactEditItem);
    return this;
  }

  /**
   * Get artifactEdit
   * @return artifactEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getArtifactEdit() {
    return artifactEdit;
  }

  public void setArtifactEdit(List<UserPermissionRestriction> artifactEdit) {
    this.artifactEdit = artifactEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  artifactDelete(List<UserPermissionRestriction> artifactDelete) {

    this.artifactDelete = artifactDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addArtifactDeleteItem(UserPermissionRestriction artifactDeleteItem) {
    if (this.artifactDelete == null) {
      this.artifactDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.artifactDelete.add(artifactDeleteItem);
    return this;
  }

  /**
   * Get artifactDelete
   * @return artifactDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getArtifactDelete() {
    return artifactDelete;
  }

  public void
  setArtifactDelete(List<UserPermissionRestriction> artifactDelete) {
    this.artifactDelete = artifactDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  feedView(List<UserPermissionRestriction> feedView) {

    this.feedView = feedView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addFeedViewItem(UserPermissionRestriction feedViewItem) {
    if (this.feedView == null) {
      this.feedView = new ArrayList<UserPermissionRestriction>();
    }
    this.feedView.add(feedViewItem);
    return this;
  }

  /**
   * Get feedView
   * @return feedView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getFeedView() {
    return feedView;
  }

  public void setFeedView(List<UserPermissionRestriction> feedView) {
    this.feedView = feedView;
  }

  public UserPermissionSetResourceSpacePermissions
  eventView(List<UserPermissionRestriction> eventView) {

    this.eventView = eventView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addEventViewItem(UserPermissionRestriction eventViewItem) {
    if (this.eventView == null) {
      this.eventView = new ArrayList<UserPermissionRestriction>();
    }
    this.eventView.add(eventViewItem);
    return this;
  }

  /**
   * Get eventView
   * @return eventView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getEventView() {
    return eventView;
  }

  public void setEventView(List<UserPermissionRestriction> eventView) {
    this.eventView = eventView;
  }

  public UserPermissionSetResourceSpacePermissions libraryVariableSetView(
      List<UserPermissionRestriction> libraryVariableSetView) {

    this.libraryVariableSetView = libraryVariableSetView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLibraryVariableSetViewItem(
      UserPermissionRestriction libraryVariableSetViewItem) {
    if (this.libraryVariableSetView == null) {
      this.libraryVariableSetView = new ArrayList<UserPermissionRestriction>();
    }
    this.libraryVariableSetView.add(libraryVariableSetViewItem);
    return this;
  }

  /**
   * Get libraryVariableSetView
   * @return libraryVariableSetView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLibraryVariableSetView() {
    return libraryVariableSetView;
  }

  public void setLibraryVariableSetView(
      List<UserPermissionRestriction> libraryVariableSetView) {
    this.libraryVariableSetView = libraryVariableSetView;
  }

  public UserPermissionSetResourceSpacePermissions libraryVariableSetCreate(
      List<UserPermissionRestriction> libraryVariableSetCreate) {

    this.libraryVariableSetCreate = libraryVariableSetCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLibraryVariableSetCreateItem(
      UserPermissionRestriction libraryVariableSetCreateItem) {
    if (this.libraryVariableSetCreate == null) {
      this.libraryVariableSetCreate =
          new ArrayList<UserPermissionRestriction>();
    }
    this.libraryVariableSetCreate.add(libraryVariableSetCreateItem);
    return this;
  }

  /**
   * Get libraryVariableSetCreate
   * @return libraryVariableSetCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLibraryVariableSetCreate() {
    return libraryVariableSetCreate;
  }

  public void setLibraryVariableSetCreate(
      List<UserPermissionRestriction> libraryVariableSetCreate) {
    this.libraryVariableSetCreate = libraryVariableSetCreate;
  }

  public UserPermissionSetResourceSpacePermissions libraryVariableSetEdit(
      List<UserPermissionRestriction> libraryVariableSetEdit) {

    this.libraryVariableSetEdit = libraryVariableSetEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLibraryVariableSetEditItem(
      UserPermissionRestriction libraryVariableSetEditItem) {
    if (this.libraryVariableSetEdit == null) {
      this.libraryVariableSetEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.libraryVariableSetEdit.add(libraryVariableSetEditItem);
    return this;
  }

  /**
   * Get libraryVariableSetEdit
   * @return libraryVariableSetEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLibraryVariableSetEdit() {
    return libraryVariableSetEdit;
  }

  public void setLibraryVariableSetEdit(
      List<UserPermissionRestriction> libraryVariableSetEdit) {
    this.libraryVariableSetEdit = libraryVariableSetEdit;
  }

  public UserPermissionSetResourceSpacePermissions libraryVariableSetDelete(
      List<UserPermissionRestriction> libraryVariableSetDelete) {

    this.libraryVariableSetDelete = libraryVariableSetDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLibraryVariableSetDeleteItem(
      UserPermissionRestriction libraryVariableSetDeleteItem) {
    if (this.libraryVariableSetDelete == null) {
      this.libraryVariableSetDelete =
          new ArrayList<UserPermissionRestriction>();
    }
    this.libraryVariableSetDelete.add(libraryVariableSetDeleteItem);
    return this;
  }

  /**
   * Get libraryVariableSetDelete
   * @return libraryVariableSetDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLibraryVariableSetDelete() {
    return libraryVariableSetDelete;
  }

  public void setLibraryVariableSetDelete(
      List<UserPermissionRestriction> libraryVariableSetDelete) {
    this.libraryVariableSetDelete = libraryVariableSetDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  projectGroupView(List<UserPermissionRestriction> projectGroupView) {

    this.projectGroupView = projectGroupView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectGroupViewItem(UserPermissionRestriction projectGroupViewItem) {
    if (this.projectGroupView == null) {
      this.projectGroupView = new ArrayList<UserPermissionRestriction>();
    }
    this.projectGroupView.add(projectGroupViewItem);
    return this;
  }

  /**
   * Get projectGroupView
   * @return projectGroupView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectGroupView() {
    return projectGroupView;
  }

  public void
  setProjectGroupView(List<UserPermissionRestriction> projectGroupView) {
    this.projectGroupView = projectGroupView;
  }

  public UserPermissionSetResourceSpacePermissions
  projectGroupCreate(List<UserPermissionRestriction> projectGroupCreate) {

    this.projectGroupCreate = projectGroupCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectGroupCreateItem(UserPermissionRestriction projectGroupCreateItem) {
    if (this.projectGroupCreate == null) {
      this.projectGroupCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.projectGroupCreate.add(projectGroupCreateItem);
    return this;
  }

  /**
   * Get projectGroupCreate
   * @return projectGroupCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectGroupCreate() {
    return projectGroupCreate;
  }

  public void
  setProjectGroupCreate(List<UserPermissionRestriction> projectGroupCreate) {
    this.projectGroupCreate = projectGroupCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  projectGroupEdit(List<UserPermissionRestriction> projectGroupEdit) {

    this.projectGroupEdit = projectGroupEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectGroupEditItem(UserPermissionRestriction projectGroupEditItem) {
    if (this.projectGroupEdit == null) {
      this.projectGroupEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.projectGroupEdit.add(projectGroupEditItem);
    return this;
  }

  /**
   * Get projectGroupEdit
   * @return projectGroupEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectGroupEdit() {
    return projectGroupEdit;
  }

  public void
  setProjectGroupEdit(List<UserPermissionRestriction> projectGroupEdit) {
    this.projectGroupEdit = projectGroupEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  projectGroupDelete(List<UserPermissionRestriction> projectGroupDelete) {

    this.projectGroupDelete = projectGroupDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProjectGroupDeleteItem(UserPermissionRestriction projectGroupDeleteItem) {
    if (this.projectGroupDelete == null) {
      this.projectGroupDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.projectGroupDelete.add(projectGroupDeleteItem);
    return this;
  }

  /**
   * Get projectGroupDelete
   * @return projectGroupDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProjectGroupDelete() {
    return projectGroupDelete;
  }

  public void
  setProjectGroupDelete(List<UserPermissionRestriction> projectGroupDelete) {
    this.projectGroupDelete = projectGroupDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  teamCreate(List<UserPermissionRestriction> teamCreate) {

    this.teamCreate = teamCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTeamCreateItem(UserPermissionRestriction teamCreateItem) {
    if (this.teamCreate == null) {
      this.teamCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.teamCreate.add(teamCreateItem);
    return this;
  }

  /**
   * Get teamCreate
   * @return teamCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTeamCreate() {
    return teamCreate;
  }

  public void setTeamCreate(List<UserPermissionRestriction> teamCreate) {
    this.teamCreate = teamCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  teamView(List<UserPermissionRestriction> teamView) {

    this.teamView = teamView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTeamViewItem(UserPermissionRestriction teamViewItem) {
    if (this.teamView == null) {
      this.teamView = new ArrayList<UserPermissionRestriction>();
    }
    this.teamView.add(teamViewItem);
    return this;
  }

  /**
   * Get teamView
   * @return teamView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTeamView() {
    return teamView;
  }

  public void setTeamView(List<UserPermissionRestriction> teamView) {
    this.teamView = teamView;
  }

  public UserPermissionSetResourceSpacePermissions
  teamEdit(List<UserPermissionRestriction> teamEdit) {

    this.teamEdit = teamEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTeamEditItem(UserPermissionRestriction teamEditItem) {
    if (this.teamEdit == null) {
      this.teamEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.teamEdit.add(teamEditItem);
    return this;
  }

  /**
   * Get teamEdit
   * @return teamEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTeamEdit() {
    return teamEdit;
  }

  public void setTeamEdit(List<UserPermissionRestriction> teamEdit) {
    this.teamEdit = teamEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  teamDelete(List<UserPermissionRestriction> teamDelete) {

    this.teamDelete = teamDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTeamDeleteItem(UserPermissionRestriction teamDeleteItem) {
    if (this.teamDelete == null) {
      this.teamDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.teamDelete.add(teamDeleteItem);
    return this;
  }

  /**
   * Get teamDelete
   * @return teamDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTeamDelete() {
    return teamDelete;
  }

  public void setTeamDelete(List<UserPermissionRestriction> teamDelete) {
    this.teamDelete = teamDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  userView(List<UserPermissionRestriction> userView) {

    this.userView = userView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addUserViewItem(UserPermissionRestriction userViewItem) {
    if (this.userView == null) {
      this.userView = new ArrayList<UserPermissionRestriction>();
    }
    this.userView.add(userViewItem);
    return this;
  }

  /**
   * Get userView
   * @return userView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getUserView() {
    return userView;
  }

  public void setUserView(List<UserPermissionRestriction> userView) {
    this.userView = userView;
  }

  public UserPermissionSetResourceSpacePermissions
  userInvite(List<UserPermissionRestriction> userInvite) {

    this.userInvite = userInvite;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addUserInviteItem(UserPermissionRestriction userInviteItem) {
    if (this.userInvite == null) {
      this.userInvite = new ArrayList<UserPermissionRestriction>();
    }
    this.userInvite.add(userInviteItem);
    return this;
  }

  /**
   * Get userInvite
   * @return userInvite
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getUserInvite() {
    return userInvite;
  }

  public void setUserInvite(List<UserPermissionRestriction> userInvite) {
    this.userInvite = userInvite;
  }

  public UserPermissionSetResourceSpacePermissions
  userRoleView(List<UserPermissionRestriction> userRoleView) {

    this.userRoleView = userRoleView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addUserRoleViewItem(UserPermissionRestriction userRoleViewItem) {
    if (this.userRoleView == null) {
      this.userRoleView = new ArrayList<UserPermissionRestriction>();
    }
    this.userRoleView.add(userRoleViewItem);
    return this;
  }

  /**
   * Get userRoleView
   * @return userRoleView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getUserRoleView() {
    return userRoleView;
  }

  public void setUserRoleView(List<UserPermissionRestriction> userRoleView) {
    this.userRoleView = userRoleView;
  }

  public UserPermissionSetResourceSpacePermissions
  userRoleEdit(List<UserPermissionRestriction> userRoleEdit) {

    this.userRoleEdit = userRoleEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addUserRoleEditItem(UserPermissionRestriction userRoleEditItem) {
    if (this.userRoleEdit == null) {
      this.userRoleEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.userRoleEdit.add(userRoleEditItem);
    return this;
  }

  /**
   * Get userRoleEdit
   * @return userRoleEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getUserRoleEdit() {
    return userRoleEdit;
  }

  public void setUserRoleEdit(List<UserPermissionRestriction> userRoleEdit) {
    this.userRoleEdit = userRoleEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  taskView(List<UserPermissionRestriction> taskView) {

    this.taskView = taskView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTaskViewItem(UserPermissionRestriction taskViewItem) {
    if (this.taskView == null) {
      this.taskView = new ArrayList<UserPermissionRestriction>();
    }
    this.taskView.add(taskViewItem);
    return this;
  }

  /**
   * Get taskView
   * @return taskView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTaskView() {
    return taskView;
  }

  public void setTaskView(List<UserPermissionRestriction> taskView) {
    this.taskView = taskView;
  }

  public UserPermissionSetResourceSpacePermissions
  taskCreate(List<UserPermissionRestriction> taskCreate) {

    this.taskCreate = taskCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTaskCreateItem(UserPermissionRestriction taskCreateItem) {
    if (this.taskCreate == null) {
      this.taskCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.taskCreate.add(taskCreateItem);
    return this;
  }

  /**
   * Get taskCreate
   * @return taskCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTaskCreate() {
    return taskCreate;
  }

  public void setTaskCreate(List<UserPermissionRestriction> taskCreate) {
    this.taskCreate = taskCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  taskCancel(List<UserPermissionRestriction> taskCancel) {

    this.taskCancel = taskCancel;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTaskCancelItem(UserPermissionRestriction taskCancelItem) {
    if (this.taskCancel == null) {
      this.taskCancel = new ArrayList<UserPermissionRestriction>();
    }
    this.taskCancel.add(taskCancelItem);
    return this;
  }

  /**
   * Get taskCancel
   * @return taskCancel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTaskCancel() {
    return taskCancel;
  }

  public void setTaskCancel(List<UserPermissionRestriction> taskCancel) {
    this.taskCancel = taskCancel;
  }

  public UserPermissionSetResourceSpacePermissions
  taskEdit(List<UserPermissionRestriction> taskEdit) {

    this.taskEdit = taskEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTaskEditItem(UserPermissionRestriction taskEditItem) {
    if (this.taskEdit == null) {
      this.taskEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.taskEdit.add(taskEditItem);
    return this;
  }

  /**
   * Get taskEdit
   * @return taskEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTaskEdit() {
    return taskEdit;
  }

  public void setTaskEdit(List<UserPermissionRestriction> taskEdit) {
    this.taskEdit = taskEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  interruptionView(List<UserPermissionRestriction> interruptionView) {

    this.interruptionView = interruptionView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addInterruptionViewItem(UserPermissionRestriction interruptionViewItem) {
    if (this.interruptionView == null) {
      this.interruptionView = new ArrayList<UserPermissionRestriction>();
    }
    this.interruptionView.add(interruptionViewItem);
    return this;
  }

  /**
   * Get interruptionView
   * @return interruptionView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getInterruptionView() {
    return interruptionView;
  }

  public void
  setInterruptionView(List<UserPermissionRestriction> interruptionView) {
    this.interruptionView = interruptionView;
  }

  public UserPermissionSetResourceSpacePermissions
  interruptionSubmit(List<UserPermissionRestriction> interruptionSubmit) {

    this.interruptionSubmit = interruptionSubmit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addInterruptionSubmitItem(UserPermissionRestriction interruptionSubmitItem) {
    if (this.interruptionSubmit == null) {
      this.interruptionSubmit = new ArrayList<UserPermissionRestriction>();
    }
    this.interruptionSubmit.add(interruptionSubmitItem);
    return this;
  }

  /**
   * Get interruptionSubmit
   * @return interruptionSubmit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getInterruptionSubmit() {
    return interruptionSubmit;
  }

  public void
  setInterruptionSubmit(List<UserPermissionRestriction> interruptionSubmit) {
    this.interruptionSubmit = interruptionSubmit;
  }

  public UserPermissionSetResourceSpacePermissions
  interruptionViewSubmitResponsible(
      List<UserPermissionRestriction> interruptionViewSubmitResponsible) {

    this.interruptionViewSubmitResponsible = interruptionViewSubmitResponsible;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addInterruptionViewSubmitResponsibleItem(
      UserPermissionRestriction interruptionViewSubmitResponsibleItem) {
    if (this.interruptionViewSubmitResponsible == null) {
      this.interruptionViewSubmitResponsible =
          new ArrayList<UserPermissionRestriction>();
    }
    this.interruptionViewSubmitResponsible.add(
        interruptionViewSubmitResponsibleItem);
    return this;
  }

  /**
   * Get interruptionViewSubmitResponsible
   * @return interruptionViewSubmitResponsible
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction>
  getInterruptionViewSubmitResponsible() {
    return interruptionViewSubmitResponsible;
  }

  public void setInterruptionViewSubmitResponsible(
      List<UserPermissionRestriction> interruptionViewSubmitResponsible) {
    this.interruptionViewSubmitResponsible = interruptionViewSubmitResponsible;
  }

  public UserPermissionSetResourceSpacePermissions
  builtInFeedPush(List<UserPermissionRestriction> builtInFeedPush) {

    this.builtInFeedPush = builtInFeedPush;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addBuiltInFeedPushItem(UserPermissionRestriction builtInFeedPushItem) {
    if (this.builtInFeedPush == null) {
      this.builtInFeedPush = new ArrayList<UserPermissionRestriction>();
    }
    this.builtInFeedPush.add(builtInFeedPushItem);
    return this;
  }

  /**
   * Get builtInFeedPush
   * @return builtInFeedPush
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getBuiltInFeedPush() {
    return builtInFeedPush;
  }

  public void
  setBuiltInFeedPush(List<UserPermissionRestriction> builtInFeedPush) {
    this.builtInFeedPush = builtInFeedPush;
  }

  public UserPermissionSetResourceSpacePermissions
  builtInFeedAdminister(List<UserPermissionRestriction> builtInFeedAdminister) {

    this.builtInFeedAdminister = builtInFeedAdminister;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addBuiltInFeedAdministerItem(
      UserPermissionRestriction builtInFeedAdministerItem) {
    if (this.builtInFeedAdminister == null) {
      this.builtInFeedAdminister = new ArrayList<UserPermissionRestriction>();
    }
    this.builtInFeedAdminister.add(builtInFeedAdministerItem);
    return this;
  }

  /**
   * Get builtInFeedAdminister
   * @return builtInFeedAdminister
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getBuiltInFeedAdminister() {
    return builtInFeedAdminister;
  }

  public void setBuiltInFeedAdminister(
      List<UserPermissionRestriction> builtInFeedAdminister) {
    this.builtInFeedAdminister = builtInFeedAdminister;
  }

  public UserPermissionSetResourceSpacePermissions
  builtInFeedDownload(List<UserPermissionRestriction> builtInFeedDownload) {

    this.builtInFeedDownload = builtInFeedDownload;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addBuiltInFeedDownloadItem(
      UserPermissionRestriction builtInFeedDownloadItem) {
    if (this.builtInFeedDownload == null) {
      this.builtInFeedDownload = new ArrayList<UserPermissionRestriction>();
    }
    this.builtInFeedDownload.add(builtInFeedDownloadItem);
    return this;
  }

  /**
   * Get builtInFeedDownload
   * @return builtInFeedDownload
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getBuiltInFeedDownload() {
    return builtInFeedDownload;
  }

  public void
  setBuiltInFeedDownload(List<UserPermissionRestriction> builtInFeedDownload) {
    this.builtInFeedDownload = builtInFeedDownload;
  }

  public UserPermissionSetResourceSpacePermissions
  actionTemplateView(List<UserPermissionRestriction> actionTemplateView) {

    this.actionTemplateView = actionTemplateView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addActionTemplateViewItem(UserPermissionRestriction actionTemplateViewItem) {
    if (this.actionTemplateView == null) {
      this.actionTemplateView = new ArrayList<UserPermissionRestriction>();
    }
    this.actionTemplateView.add(actionTemplateViewItem);
    return this;
  }

  /**
   * Get actionTemplateView
   * @return actionTemplateView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getActionTemplateView() {
    return actionTemplateView;
  }

  public void
  setActionTemplateView(List<UserPermissionRestriction> actionTemplateView) {
    this.actionTemplateView = actionTemplateView;
  }

  public UserPermissionSetResourceSpacePermissions
  actionTemplateCreate(List<UserPermissionRestriction> actionTemplateCreate) {

    this.actionTemplateCreate = actionTemplateCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addActionTemplateCreateItem(
      UserPermissionRestriction actionTemplateCreateItem) {
    if (this.actionTemplateCreate == null) {
      this.actionTemplateCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.actionTemplateCreate.add(actionTemplateCreateItem);
    return this;
  }

  /**
   * Get actionTemplateCreate
   * @return actionTemplateCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getActionTemplateCreate() {
    return actionTemplateCreate;
  }

  public void setActionTemplateCreate(
      List<UserPermissionRestriction> actionTemplateCreate) {
    this.actionTemplateCreate = actionTemplateCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  actionTemplateEdit(List<UserPermissionRestriction> actionTemplateEdit) {

    this.actionTemplateEdit = actionTemplateEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addActionTemplateEditItem(UserPermissionRestriction actionTemplateEditItem) {
    if (this.actionTemplateEdit == null) {
      this.actionTemplateEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.actionTemplateEdit.add(actionTemplateEditItem);
    return this;
  }

  /**
   * Get actionTemplateEdit
   * @return actionTemplateEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getActionTemplateEdit() {
    return actionTemplateEdit;
  }

  public void
  setActionTemplateEdit(List<UserPermissionRestriction> actionTemplateEdit) {
    this.actionTemplateEdit = actionTemplateEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  actionTemplateDelete(List<UserPermissionRestriction> actionTemplateDelete) {

    this.actionTemplateDelete = actionTemplateDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addActionTemplateDeleteItem(
      UserPermissionRestriction actionTemplateDeleteItem) {
    if (this.actionTemplateDelete == null) {
      this.actionTemplateDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.actionTemplateDelete.add(actionTemplateDeleteItem);
    return this;
  }

  /**
   * Get actionTemplateDelete
   * @return actionTemplateDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getActionTemplateDelete() {
    return actionTemplateDelete;
  }

  public void setActionTemplateDelete(
      List<UserPermissionRestriction> actionTemplateDelete) {
    this.actionTemplateDelete = actionTemplateDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  lifecycleCreate(List<UserPermissionRestriction> lifecycleCreate) {

    this.lifecycleCreate = lifecycleCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLifecycleCreateItem(UserPermissionRestriction lifecycleCreateItem) {
    if (this.lifecycleCreate == null) {
      this.lifecycleCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.lifecycleCreate.add(lifecycleCreateItem);
    return this;
  }

  /**
   * Get lifecycleCreate
   * @return lifecycleCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLifecycleCreate() {
    return lifecycleCreate;
  }

  public void
  setLifecycleCreate(List<UserPermissionRestriction> lifecycleCreate) {
    this.lifecycleCreate = lifecycleCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  lifecycleView(List<UserPermissionRestriction> lifecycleView) {

    this.lifecycleView = lifecycleView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLifecycleViewItem(UserPermissionRestriction lifecycleViewItem) {
    if (this.lifecycleView == null) {
      this.lifecycleView = new ArrayList<UserPermissionRestriction>();
    }
    this.lifecycleView.add(lifecycleViewItem);
    return this;
  }

  /**
   * Get lifecycleView
   * @return lifecycleView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLifecycleView() {
    return lifecycleView;
  }

  public void setLifecycleView(List<UserPermissionRestriction> lifecycleView) {
    this.lifecycleView = lifecycleView;
  }

  public UserPermissionSetResourceSpacePermissions
  lifecycleEdit(List<UserPermissionRestriction> lifecycleEdit) {

    this.lifecycleEdit = lifecycleEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLifecycleEditItem(UserPermissionRestriction lifecycleEditItem) {
    if (this.lifecycleEdit == null) {
      this.lifecycleEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.lifecycleEdit.add(lifecycleEditItem);
    return this;
  }

  /**
   * Get lifecycleEdit
   * @return lifecycleEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLifecycleEdit() {
    return lifecycleEdit;
  }

  public void setLifecycleEdit(List<UserPermissionRestriction> lifecycleEdit) {
    this.lifecycleEdit = lifecycleEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  lifecycleDelete(List<UserPermissionRestriction> lifecycleDelete) {

    this.lifecycleDelete = lifecycleDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addLifecycleDeleteItem(UserPermissionRestriction lifecycleDeleteItem) {
    if (this.lifecycleDelete == null) {
      this.lifecycleDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.lifecycleDelete.add(lifecycleDeleteItem);
    return this;
  }

  /**
   * Get lifecycleDelete
   * @return lifecycleDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getLifecycleDelete() {
    return lifecycleDelete;
  }

  public void
  setLifecycleDelete(List<UserPermissionRestriction> lifecycleDelete) {
    this.lifecycleDelete = lifecycleDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  accountView(List<UserPermissionRestriction> accountView) {

    this.accountView = accountView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addAccountViewItem(UserPermissionRestriction accountViewItem) {
    if (this.accountView == null) {
      this.accountView = new ArrayList<UserPermissionRestriction>();
    }
    this.accountView.add(accountViewItem);
    return this;
  }

  /**
   * Get accountView
   * @return accountView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getAccountView() {
    return accountView;
  }

  public void setAccountView(List<UserPermissionRestriction> accountView) {
    this.accountView = accountView;
  }

  public UserPermissionSetResourceSpacePermissions
  accountEdit(List<UserPermissionRestriction> accountEdit) {

    this.accountEdit = accountEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addAccountEditItem(UserPermissionRestriction accountEditItem) {
    if (this.accountEdit == null) {
      this.accountEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.accountEdit.add(accountEditItem);
    return this;
  }

  /**
   * Get accountEdit
   * @return accountEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getAccountEdit() {
    return accountEdit;
  }

  public void setAccountEdit(List<UserPermissionRestriction> accountEdit) {
    this.accountEdit = accountEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  accountCreate(List<UserPermissionRestriction> accountCreate) {

    this.accountCreate = accountCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addAccountCreateItem(UserPermissionRestriction accountCreateItem) {
    if (this.accountCreate == null) {
      this.accountCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.accountCreate.add(accountCreateItem);
    return this;
  }

  /**
   * Get accountCreate
   * @return accountCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getAccountCreate() {
    return accountCreate;
  }

  public void setAccountCreate(List<UserPermissionRestriction> accountCreate) {
    this.accountCreate = accountCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  accountDelete(List<UserPermissionRestriction> accountDelete) {

    this.accountDelete = accountDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addAccountDeleteItem(UserPermissionRestriction accountDeleteItem) {
    if (this.accountDelete == null) {
      this.accountDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.accountDelete.add(accountDeleteItem);
    return this;
  }

  /**
   * Get accountDelete
   * @return accountDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getAccountDelete() {
    return accountDelete;
  }

  public void setAccountDelete(List<UserPermissionRestriction> accountDelete) {
    this.accountDelete = accountDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  tenantCreate(List<UserPermissionRestriction> tenantCreate) {

    this.tenantCreate = tenantCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTenantCreateItem(UserPermissionRestriction tenantCreateItem) {
    if (this.tenantCreate == null) {
      this.tenantCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.tenantCreate.add(tenantCreateItem);
    return this;
  }

  /**
   * Get tenantCreate
   * @return tenantCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTenantCreate() {
    return tenantCreate;
  }

  public void setTenantCreate(List<UserPermissionRestriction> tenantCreate) {
    this.tenantCreate = tenantCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  tenantEdit(List<UserPermissionRestriction> tenantEdit) {

    this.tenantEdit = tenantEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTenantEditItem(UserPermissionRestriction tenantEditItem) {
    if (this.tenantEdit == null) {
      this.tenantEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.tenantEdit.add(tenantEditItem);
    return this;
  }

  /**
   * Get tenantEdit
   * @return tenantEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTenantEdit() {
    return tenantEdit;
  }

  public void setTenantEdit(List<UserPermissionRestriction> tenantEdit) {
    this.tenantEdit = tenantEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  tenantView(List<UserPermissionRestriction> tenantView) {

    this.tenantView = tenantView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTenantViewItem(UserPermissionRestriction tenantViewItem) {
    if (this.tenantView == null) {
      this.tenantView = new ArrayList<UserPermissionRestriction>();
    }
    this.tenantView.add(tenantViewItem);
    return this;
  }

  /**
   * Get tenantView
   * @return tenantView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTenantView() {
    return tenantView;
  }

  public void setTenantView(List<UserPermissionRestriction> tenantView) {
    this.tenantView = tenantView;
  }

  public UserPermissionSetResourceSpacePermissions
  tenantDelete(List<UserPermissionRestriction> tenantDelete) {

    this.tenantDelete = tenantDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTenantDeleteItem(UserPermissionRestriction tenantDeleteItem) {
    if (this.tenantDelete == null) {
      this.tenantDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.tenantDelete.add(tenantDeleteItem);
    return this;
  }

  /**
   * Get tenantDelete
   * @return tenantDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTenantDelete() {
    return tenantDelete;
  }

  public void setTenantDelete(List<UserPermissionRestriction> tenantDelete) {
    this.tenantDelete = tenantDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  tagSetCreate(List<UserPermissionRestriction> tagSetCreate) {

    this.tagSetCreate = tagSetCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTagSetCreateItem(UserPermissionRestriction tagSetCreateItem) {
    if (this.tagSetCreate == null) {
      this.tagSetCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.tagSetCreate.add(tagSetCreateItem);
    return this;
  }

  /**
   * Get tagSetCreate
   * @return tagSetCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTagSetCreate() {
    return tagSetCreate;
  }

  public void setTagSetCreate(List<UserPermissionRestriction> tagSetCreate) {
    this.tagSetCreate = tagSetCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  tagSetEdit(List<UserPermissionRestriction> tagSetEdit) {

    this.tagSetEdit = tagSetEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTagSetEditItem(UserPermissionRestriction tagSetEditItem) {
    if (this.tagSetEdit == null) {
      this.tagSetEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.tagSetEdit.add(tagSetEditItem);
    return this;
  }

  /**
   * Get tagSetEdit
   * @return tagSetEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTagSetEdit() {
    return tagSetEdit;
  }

  public void setTagSetEdit(List<UserPermissionRestriction> tagSetEdit) {
    this.tagSetEdit = tagSetEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  tagSetDelete(List<UserPermissionRestriction> tagSetDelete) {

    this.tagSetDelete = tagSetDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTagSetDeleteItem(UserPermissionRestriction tagSetDeleteItem) {
    if (this.tagSetDelete == null) {
      this.tagSetDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.tagSetDelete.add(tagSetDeleteItem);
    return this;
  }

  /**
   * Get tagSetDelete
   * @return tagSetDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTagSetDelete() {
    return tagSetDelete;
  }

  public void setTagSetDelete(List<UserPermissionRestriction> tagSetDelete) {
    this.tagSetDelete = tagSetDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  machinePolicyCreate(List<UserPermissionRestriction> machinePolicyCreate) {

    this.machinePolicyCreate = machinePolicyCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addMachinePolicyCreateItem(
      UserPermissionRestriction machinePolicyCreateItem) {
    if (this.machinePolicyCreate == null) {
      this.machinePolicyCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.machinePolicyCreate.add(machinePolicyCreateItem);
    return this;
  }

  /**
   * Get machinePolicyCreate
   * @return machinePolicyCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachinePolicyCreate() {
    return machinePolicyCreate;
  }

  public void
  setMachinePolicyCreate(List<UserPermissionRestriction> machinePolicyCreate) {
    this.machinePolicyCreate = machinePolicyCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  machinePolicyView(List<UserPermissionRestriction> machinePolicyView) {

    this.machinePolicyView = machinePolicyView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachinePolicyViewItem(UserPermissionRestriction machinePolicyViewItem) {
    if (this.machinePolicyView == null) {
      this.machinePolicyView = new ArrayList<UserPermissionRestriction>();
    }
    this.machinePolicyView.add(machinePolicyViewItem);
    return this;
  }

  /**
   * Get machinePolicyView
   * @return machinePolicyView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachinePolicyView() {
    return machinePolicyView;
  }

  public void
  setMachinePolicyView(List<UserPermissionRestriction> machinePolicyView) {
    this.machinePolicyView = machinePolicyView;
  }

  public UserPermissionSetResourceSpacePermissions
  machinePolicyEdit(List<UserPermissionRestriction> machinePolicyEdit) {

    this.machinePolicyEdit = machinePolicyEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addMachinePolicyEditItem(UserPermissionRestriction machinePolicyEditItem) {
    if (this.machinePolicyEdit == null) {
      this.machinePolicyEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.machinePolicyEdit.add(machinePolicyEditItem);
    return this;
  }

  /**
   * Get machinePolicyEdit
   * @return machinePolicyEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachinePolicyEdit() {
    return machinePolicyEdit;
  }

  public void
  setMachinePolicyEdit(List<UserPermissionRestriction> machinePolicyEdit) {
    this.machinePolicyEdit = machinePolicyEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  machinePolicyDelete(List<UserPermissionRestriction> machinePolicyDelete) {

    this.machinePolicyDelete = machinePolicyDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addMachinePolicyDeleteItem(
      UserPermissionRestriction machinePolicyDeleteItem) {
    if (this.machinePolicyDelete == null) {
      this.machinePolicyDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.machinePolicyDelete.add(machinePolicyDeleteItem);
    return this;
  }

  /**
   * Get machinePolicyDelete
   * @return machinePolicyDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getMachinePolicyDelete() {
    return machinePolicyDelete;
  }

  public void
  setMachinePolicyDelete(List<UserPermissionRestriction> machinePolicyDelete) {
    this.machinePolicyDelete = machinePolicyDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  proxyCreate(List<UserPermissionRestriction> proxyCreate) {

    this.proxyCreate = proxyCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProxyCreateItem(UserPermissionRestriction proxyCreateItem) {
    if (this.proxyCreate == null) {
      this.proxyCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.proxyCreate.add(proxyCreateItem);
    return this;
  }

  /**
   * Get proxyCreate
   * @return proxyCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProxyCreate() {
    return proxyCreate;
  }

  public void setProxyCreate(List<UserPermissionRestriction> proxyCreate) {
    this.proxyCreate = proxyCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  proxyView(List<UserPermissionRestriction> proxyView) {

    this.proxyView = proxyView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProxyViewItem(UserPermissionRestriction proxyViewItem) {
    if (this.proxyView == null) {
      this.proxyView = new ArrayList<UserPermissionRestriction>();
    }
    this.proxyView.add(proxyViewItem);
    return this;
  }

  /**
   * Get proxyView
   * @return proxyView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProxyView() {
    return proxyView;
  }

  public void setProxyView(List<UserPermissionRestriction> proxyView) {
    this.proxyView = proxyView;
  }

  public UserPermissionSetResourceSpacePermissions
  proxyEdit(List<UserPermissionRestriction> proxyEdit) {

    this.proxyEdit = proxyEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProxyEditItem(UserPermissionRestriction proxyEditItem) {
    if (this.proxyEdit == null) {
      this.proxyEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.proxyEdit.add(proxyEditItem);
    return this;
  }

  /**
   * Get proxyEdit
   * @return proxyEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProxyEdit() {
    return proxyEdit;
  }

  public void setProxyEdit(List<UserPermissionRestriction> proxyEdit) {
    this.proxyEdit = proxyEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  proxyDelete(List<UserPermissionRestriction> proxyDelete) {

    this.proxyDelete = proxyDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addProxyDeleteItem(UserPermissionRestriction proxyDeleteItem) {
    if (this.proxyDelete == null) {
      this.proxyDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.proxyDelete.add(proxyDeleteItem);
    return this;
  }

  /**
   * Get proxyDelete
   * @return proxyDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getProxyDelete() {
    return proxyDelete;
  }

  public void setProxyDelete(List<UserPermissionRestriction> proxyDelete) {
    this.proxyDelete = proxyDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  subscriptionCreate(List<UserPermissionRestriction> subscriptionCreate) {

    this.subscriptionCreate = subscriptionCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSubscriptionCreateItem(UserPermissionRestriction subscriptionCreateItem) {
    if (this.subscriptionCreate == null) {
      this.subscriptionCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.subscriptionCreate.add(subscriptionCreateItem);
    return this;
  }

  /**
   * Get subscriptionCreate
   * @return subscriptionCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSubscriptionCreate() {
    return subscriptionCreate;
  }

  public void
  setSubscriptionCreate(List<UserPermissionRestriction> subscriptionCreate) {
    this.subscriptionCreate = subscriptionCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  subscriptionView(List<UserPermissionRestriction> subscriptionView) {

    this.subscriptionView = subscriptionView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSubscriptionViewItem(UserPermissionRestriction subscriptionViewItem) {
    if (this.subscriptionView == null) {
      this.subscriptionView = new ArrayList<UserPermissionRestriction>();
    }
    this.subscriptionView.add(subscriptionViewItem);
    return this;
  }

  /**
   * Get subscriptionView
   * @return subscriptionView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSubscriptionView() {
    return subscriptionView;
  }

  public void
  setSubscriptionView(List<UserPermissionRestriction> subscriptionView) {
    this.subscriptionView = subscriptionView;
  }

  public UserPermissionSetResourceSpacePermissions
  subscriptionEdit(List<UserPermissionRestriction> subscriptionEdit) {

    this.subscriptionEdit = subscriptionEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSubscriptionEditItem(UserPermissionRestriction subscriptionEditItem) {
    if (this.subscriptionEdit == null) {
      this.subscriptionEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.subscriptionEdit.add(subscriptionEditItem);
    return this;
  }

  /**
   * Get subscriptionEdit
   * @return subscriptionEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSubscriptionEdit() {
    return subscriptionEdit;
  }

  public void
  setSubscriptionEdit(List<UserPermissionRestriction> subscriptionEdit) {
    this.subscriptionEdit = subscriptionEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  subscriptionDelete(List<UserPermissionRestriction> subscriptionDelete) {

    this.subscriptionDelete = subscriptionDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSubscriptionDeleteItem(UserPermissionRestriction subscriptionDeleteItem) {
    if (this.subscriptionDelete == null) {
      this.subscriptionDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.subscriptionDelete.add(subscriptionDeleteItem);
    return this;
  }

  /**
   * Get subscriptionDelete
   * @return subscriptionDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSubscriptionDelete() {
    return subscriptionDelete;
  }

  public void
  setSubscriptionDelete(List<UserPermissionRestriction> subscriptionDelete) {
    this.subscriptionDelete = subscriptionDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  triggerCreate(List<UserPermissionRestriction> triggerCreate) {

    this.triggerCreate = triggerCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTriggerCreateItem(UserPermissionRestriction triggerCreateItem) {
    if (this.triggerCreate == null) {
      this.triggerCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.triggerCreate.add(triggerCreateItem);
    return this;
  }

  /**
   * Get triggerCreate
   * @return triggerCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTriggerCreate() {
    return triggerCreate;
  }

  public void setTriggerCreate(List<UserPermissionRestriction> triggerCreate) {
    this.triggerCreate = triggerCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  triggerView(List<UserPermissionRestriction> triggerView) {

    this.triggerView = triggerView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTriggerViewItem(UserPermissionRestriction triggerViewItem) {
    if (this.triggerView == null) {
      this.triggerView = new ArrayList<UserPermissionRestriction>();
    }
    this.triggerView.add(triggerViewItem);
    return this;
  }

  /**
   * Get triggerView
   * @return triggerView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTriggerView() {
    return triggerView;
  }

  public void setTriggerView(List<UserPermissionRestriction> triggerView) {
    this.triggerView = triggerView;
  }

  public UserPermissionSetResourceSpacePermissions
  triggerEdit(List<UserPermissionRestriction> triggerEdit) {

    this.triggerEdit = triggerEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTriggerEditItem(UserPermissionRestriction triggerEditItem) {
    if (this.triggerEdit == null) {
      this.triggerEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.triggerEdit.add(triggerEditItem);
    return this;
  }

  /**
   * Get triggerEdit
   * @return triggerEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTriggerEdit() {
    return triggerEdit;
  }

  public void setTriggerEdit(List<UserPermissionRestriction> triggerEdit) {
    this.triggerEdit = triggerEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  triggerDelete(List<UserPermissionRestriction> triggerDelete) {

    this.triggerDelete = triggerDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addTriggerDeleteItem(UserPermissionRestriction triggerDeleteItem) {
    if (this.triggerDelete == null) {
      this.triggerDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.triggerDelete.add(triggerDeleteItem);
    return this;
  }

  /**
   * Get triggerDelete
   * @return triggerDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getTriggerDelete() {
    return triggerDelete;
  }

  public void setTriggerDelete(List<UserPermissionRestriction> triggerDelete) {
    this.triggerDelete = triggerDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  certificateView(List<UserPermissionRestriction> certificateView) {

    this.certificateView = certificateView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addCertificateViewItem(UserPermissionRestriction certificateViewItem) {
    if (this.certificateView == null) {
      this.certificateView = new ArrayList<UserPermissionRestriction>();
    }
    this.certificateView.add(certificateViewItem);
    return this;
  }

  /**
   * Get certificateView
   * @return certificateView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getCertificateView() {
    return certificateView;
  }

  public void
  setCertificateView(List<UserPermissionRestriction> certificateView) {
    this.certificateView = certificateView;
  }

  public UserPermissionSetResourceSpacePermissions
  certificateCreate(List<UserPermissionRestriction> certificateCreate) {

    this.certificateCreate = certificateCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addCertificateCreateItem(UserPermissionRestriction certificateCreateItem) {
    if (this.certificateCreate == null) {
      this.certificateCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.certificateCreate.add(certificateCreateItem);
    return this;
  }

  /**
   * Get certificateCreate
   * @return certificateCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getCertificateCreate() {
    return certificateCreate;
  }

  public void
  setCertificateCreate(List<UserPermissionRestriction> certificateCreate) {
    this.certificateCreate = certificateCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  certificateEdit(List<UserPermissionRestriction> certificateEdit) {

    this.certificateEdit = certificateEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addCertificateEditItem(UserPermissionRestriction certificateEditItem) {
    if (this.certificateEdit == null) {
      this.certificateEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.certificateEdit.add(certificateEditItem);
    return this;
  }

  /**
   * Get certificateEdit
   * @return certificateEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getCertificateEdit() {
    return certificateEdit;
  }

  public void
  setCertificateEdit(List<UserPermissionRestriction> certificateEdit) {
    this.certificateEdit = certificateEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  certificateDelete(List<UserPermissionRestriction> certificateDelete) {

    this.certificateDelete = certificateDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addCertificateDeleteItem(UserPermissionRestriction certificateDeleteItem) {
    if (this.certificateDelete == null) {
      this.certificateDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.certificateDelete.add(certificateDeleteItem);
    return this;
  }

  /**
   * Get certificateDelete
   * @return certificateDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getCertificateDelete() {
    return certificateDelete;
  }

  public void
  setCertificateDelete(List<UserPermissionRestriction> certificateDelete) {
    this.certificateDelete = certificateDelete;
  }

  public UserPermissionSetResourceSpacePermissions certificateExportPrivateKey(
      List<UserPermissionRestriction> certificateExportPrivateKey) {

    this.certificateExportPrivateKey = certificateExportPrivateKey;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addCertificateExportPrivateKeyItem(
      UserPermissionRestriction certificateExportPrivateKeyItem) {
    if (this.certificateExportPrivateKey == null) {
      this.certificateExportPrivateKey =
          new ArrayList<UserPermissionRestriction>();
    }
    this.certificateExportPrivateKey.add(certificateExportPrivateKeyItem);
    return this;
  }

  /**
   * Get certificateExportPrivateKey
   * @return certificateExportPrivateKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getCertificateExportPrivateKey() {
    return certificateExportPrivateKey;
  }

  public void setCertificateExportPrivateKey(
      List<UserPermissionRestriction> certificateExportPrivateKey) {
    this.certificateExportPrivateKey = certificateExportPrivateKey;
  }

  public UserPermissionSetResourceSpacePermissions
  userEdit(List<UserPermissionRestriction> userEdit) {

    this.userEdit = userEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addUserEditItem(UserPermissionRestriction userEditItem) {
    if (this.userEdit == null) {
      this.userEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.userEdit.add(userEditItem);
    return this;
  }

  /**
   * Get userEdit
   * @return userEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getUserEdit() {
    return userEdit;
  }

  public void setUserEdit(List<UserPermissionRestriction> userEdit) {
    this.userEdit = userEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  configureServer(List<UserPermissionRestriction> configureServer) {

    this.configureServer = configureServer;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addConfigureServerItem(UserPermissionRestriction configureServerItem) {
    if (this.configureServer == null) {
      this.configureServer = new ArrayList<UserPermissionRestriction>();
    }
    this.configureServer.add(configureServerItem);
    return this;
  }

  /**
   * Get configureServer
   * @return configureServer
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getConfigureServer() {
    return configureServer;
  }

  public void
  setConfigureServer(List<UserPermissionRestriction> configureServer) {
    this.configureServer = configureServer;
  }

  public UserPermissionSetResourceSpacePermissions
  feedEdit(List<UserPermissionRestriction> feedEdit) {

    this.feedEdit = feedEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addFeedEditItem(UserPermissionRestriction feedEditItem) {
    if (this.feedEdit == null) {
      this.feedEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.feedEdit.add(feedEditItem);
    return this;
  }

  /**
   * Get feedEdit
   * @return feedEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getFeedEdit() {
    return feedEdit;
  }

  public void setFeedEdit(List<UserPermissionRestriction> feedEdit) {
    this.feedEdit = feedEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  workerView(List<UserPermissionRestriction> workerView) {

    this.workerView = workerView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addWorkerViewItem(UserPermissionRestriction workerViewItem) {
    if (this.workerView == null) {
      this.workerView = new ArrayList<UserPermissionRestriction>();
    }
    this.workerView.add(workerViewItem);
    return this;
  }

  /**
   * Get workerView
   * @return workerView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getWorkerView() {
    return workerView;
  }

  public void setWorkerView(List<UserPermissionRestriction> workerView) {
    this.workerView = workerView;
  }

  public UserPermissionSetResourceSpacePermissions
  workerEdit(List<UserPermissionRestriction> workerEdit) {

    this.workerEdit = workerEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addWorkerEditItem(UserPermissionRestriction workerEditItem) {
    if (this.workerEdit == null) {
      this.workerEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.workerEdit.add(workerEditItem);
    return this;
  }

  /**
   * Get workerEdit
   * @return workerEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getWorkerEdit() {
    return workerEdit;
  }

  public void setWorkerEdit(List<UserPermissionRestriction> workerEdit) {
    this.workerEdit = workerEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  spaceEdit(List<UserPermissionRestriction> spaceEdit) {

    this.spaceEdit = spaceEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSpaceEditItem(UserPermissionRestriction spaceEditItem) {
    if (this.spaceEdit == null) {
      this.spaceEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.spaceEdit.add(spaceEditItem);
    return this;
  }

  /**
   * Get spaceEdit
   * @return spaceEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSpaceEdit() {
    return spaceEdit;
  }

  public void setSpaceEdit(List<UserPermissionRestriction> spaceEdit) {
    this.spaceEdit = spaceEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  spaceView(List<UserPermissionRestriction> spaceView) {

    this.spaceView = spaceView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSpaceViewItem(UserPermissionRestriction spaceViewItem) {
    if (this.spaceView == null) {
      this.spaceView = new ArrayList<UserPermissionRestriction>();
    }
    this.spaceView.add(spaceViewItem);
    return this;
  }

  /**
   * Get spaceView
   * @return spaceView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSpaceView() {
    return spaceView;
  }

  public void setSpaceView(List<UserPermissionRestriction> spaceView) {
    this.spaceView = spaceView;
  }

  public UserPermissionSetResourceSpacePermissions
  spaceDelete(List<UserPermissionRestriction> spaceDelete) {

    this.spaceDelete = spaceDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSpaceDeleteItem(UserPermissionRestriction spaceDeleteItem) {
    if (this.spaceDelete == null) {
      this.spaceDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.spaceDelete.add(spaceDeleteItem);
    return this;
  }

  /**
   * Get spaceDelete
   * @return spaceDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSpaceDelete() {
    return spaceDelete;
  }

  public void setSpaceDelete(List<UserPermissionRestriction> spaceDelete) {
    this.spaceDelete = spaceDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  spaceCreate(List<UserPermissionRestriction> spaceCreate) {

    this.spaceCreate = spaceCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addSpaceCreateItem(UserPermissionRestriction spaceCreateItem) {
    if (this.spaceCreate == null) {
      this.spaceCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.spaceCreate.add(spaceCreateItem);
    return this;
  }

  /**
   * Get spaceCreate
   * @return spaceCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getSpaceCreate() {
    return spaceCreate;
  }

  public void setSpaceCreate(List<UserPermissionRestriction> spaceCreate) {
    this.spaceCreate = spaceCreate;
  }

  public UserPermissionSetResourceSpacePermissions
  buildInformationPush(List<UserPermissionRestriction> buildInformationPush) {

    this.buildInformationPush = buildInformationPush;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions addBuildInformationPushItem(
      UserPermissionRestriction buildInformationPushItem) {
    if (this.buildInformationPush == null) {
      this.buildInformationPush = new ArrayList<UserPermissionRestriction>();
    }
    this.buildInformationPush.add(buildInformationPushItem);
    return this;
  }

  /**
   * Get buildInformationPush
   * @return buildInformationPush
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getBuildInformationPush() {
    return buildInformationPush;
  }

  public void setBuildInformationPush(
      List<UserPermissionRestriction> buildInformationPush) {
    this.buildInformationPush = buildInformationPush;
  }

  public UserPermissionSetResourceSpacePermissions buildInformationAdminister(
      List<UserPermissionRestriction> buildInformationAdminister) {

    this.buildInformationAdminister = buildInformationAdminister;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addBuildInformationAdministerItem(
      UserPermissionRestriction buildInformationAdministerItem) {
    if (this.buildInformationAdminister == null) {
      this.buildInformationAdminister =
          new ArrayList<UserPermissionRestriction>();
    }
    this.buildInformationAdminister.add(buildInformationAdministerItem);
    return this;
  }

  /**
   * Get buildInformationAdminister
   * @return buildInformationAdminister
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getBuildInformationAdminister() {
    return buildInformationAdminister;
  }

  public void setBuildInformationAdminister(
      List<UserPermissionRestriction> buildInformationAdminister) {
    this.buildInformationAdminister = buildInformationAdminister;
  }

  public UserPermissionSetResourceSpacePermissions
  runbookView(List<UserPermissionRestriction> runbookView) {

    this.runbookView = runbookView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addRunbookViewItem(UserPermissionRestriction runbookViewItem) {
    if (this.runbookView == null) {
      this.runbookView = new ArrayList<UserPermissionRestriction>();
    }
    this.runbookView.add(runbookViewItem);
    return this;
  }

  /**
   * Get runbookView
   * @return runbookView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getRunbookView() {
    return runbookView;
  }

  public void setRunbookView(List<UserPermissionRestriction> runbookView) {
    this.runbookView = runbookView;
  }

  public UserPermissionSetResourceSpacePermissions
  runbookEdit(List<UserPermissionRestriction> runbookEdit) {

    this.runbookEdit = runbookEdit;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addRunbookEditItem(UserPermissionRestriction runbookEditItem) {
    if (this.runbookEdit == null) {
      this.runbookEdit = new ArrayList<UserPermissionRestriction>();
    }
    this.runbookEdit.add(runbookEditItem);
    return this;
  }

  /**
   * Get runbookEdit
   * @return runbookEdit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getRunbookEdit() {
    return runbookEdit;
  }

  public void setRunbookEdit(List<UserPermissionRestriction> runbookEdit) {
    this.runbookEdit = runbookEdit;
  }

  public UserPermissionSetResourceSpacePermissions
  runbookRunView(List<UserPermissionRestriction> runbookRunView) {

    this.runbookRunView = runbookRunView;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addRunbookRunViewItem(UserPermissionRestriction runbookRunViewItem) {
    if (this.runbookRunView == null) {
      this.runbookRunView = new ArrayList<UserPermissionRestriction>();
    }
    this.runbookRunView.add(runbookRunViewItem);
    return this;
  }

  /**
   * Get runbookRunView
   * @return runbookRunView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getRunbookRunView() {
    return runbookRunView;
  }

  public void
  setRunbookRunView(List<UserPermissionRestriction> runbookRunView) {
    this.runbookRunView = runbookRunView;
  }

  public UserPermissionSetResourceSpacePermissions
  runbookRunDelete(List<UserPermissionRestriction> runbookRunDelete) {

    this.runbookRunDelete = runbookRunDelete;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addRunbookRunDeleteItem(UserPermissionRestriction runbookRunDeleteItem) {
    if (this.runbookRunDelete == null) {
      this.runbookRunDelete = new ArrayList<UserPermissionRestriction>();
    }
    this.runbookRunDelete.add(runbookRunDeleteItem);
    return this;
  }

  /**
   * Get runbookRunDelete
   * @return runbookRunDelete
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getRunbookRunDelete() {
    return runbookRunDelete;
  }

  public void
  setRunbookRunDelete(List<UserPermissionRestriction> runbookRunDelete) {
    this.runbookRunDelete = runbookRunDelete;
  }

  public UserPermissionSetResourceSpacePermissions
  runbookRunCreate(List<UserPermissionRestriction> runbookRunCreate) {

    this.runbookRunCreate = runbookRunCreate;
    return this;
  }

  public UserPermissionSetResourceSpacePermissions
  addRunbookRunCreateItem(UserPermissionRestriction runbookRunCreateItem) {
    if (this.runbookRunCreate == null) {
      this.runbookRunCreate = new ArrayList<UserPermissionRestriction>();
    }
    this.runbookRunCreate.add(runbookRunCreateItem);
    return this;
  }

  /**
   * Get runbookRunCreate
   * @return runbookRunCreate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserPermissionRestriction> getRunbookRunCreate() {
    return runbookRunCreate;
  }

  public void
  setRunbookRunCreate(List<UserPermissionRestriction> runbookRunCreate) {
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
    UserPermissionSetResourceSpacePermissions
        userPermissionSetResourceSpacePermissions =
            (UserPermissionSetResourceSpacePermissions)o;
    return Objects.equals(
               this.administerSystem,
               userPermissionSetResourceSpacePermissions.administerSystem) &&
        Objects.equals(this.projectEdit,
                       userPermissionSetResourceSpacePermissions.projectEdit) &&
        Objects.equals(this.projectView,
                       userPermissionSetResourceSpacePermissions.projectView) &&
        Objects.equals(
            this.projectCreate,
            userPermissionSetResourceSpacePermissions.projectCreate) &&
        Objects.equals(
            this.projectDelete,
            userPermissionSetResourceSpacePermissions.projectDelete) &&
        Objects.equals(this.processView,
                       userPermissionSetResourceSpacePermissions.processView) &&
        Objects.equals(this.processEdit,
                       userPermissionSetResourceSpacePermissions.processEdit) &&
        Objects.equals(
            this.variableEdit,
            userPermissionSetResourceSpacePermissions.variableEdit) &&
        Objects.equals(
            this.variableEditUnscoped,
            userPermissionSetResourceSpacePermissions.variableEditUnscoped) &&
        Objects.equals(
            this.variableView,
            userPermissionSetResourceSpacePermissions.variableView) &&
        Objects.equals(
            this.variableViewUnscoped,
            userPermissionSetResourceSpacePermissions.variableViewUnscoped) &&
        Objects.equals(
            this.releaseCreate,
            userPermissionSetResourceSpacePermissions.releaseCreate) &&
        Objects.equals(this.releaseView,
                       userPermissionSetResourceSpacePermissions.releaseView) &&
        Objects.equals(this.releaseEdit,
                       userPermissionSetResourceSpacePermissions.releaseEdit) &&
        Objects.equals(
            this.releaseDelete,
            userPermissionSetResourceSpacePermissions.releaseDelete) &&
        Objects.equals(
            this.defectReport,
            userPermissionSetResourceSpacePermissions.defectReport) &&
        Objects.equals(
            this.defectResolve,
            userPermissionSetResourceSpacePermissions.defectResolve) &&
        Objects.equals(
            this.deploymentCreate,
            userPermissionSetResourceSpacePermissions.deploymentCreate) &&
        Objects.equals(
            this.deploymentDelete,
            userPermissionSetResourceSpacePermissions.deploymentDelete) &&
        Objects.equals(
            this.deploymentView,
            userPermissionSetResourceSpacePermissions.deploymentView) &&
        Objects.equals(
            this.environmentView,
            userPermissionSetResourceSpacePermissions.environmentView) &&
        Objects.equals(
            this.environmentCreate,
            userPermissionSetResourceSpacePermissions.environmentCreate) &&
        Objects.equals(
            this.environmentEdit,
            userPermissionSetResourceSpacePermissions.environmentEdit) &&
        Objects.equals(
            this.environmentDelete,
            userPermissionSetResourceSpacePermissions.environmentDelete) &&
        Objects.equals(
            this.machineCreate,
            userPermissionSetResourceSpacePermissions.machineCreate) &&
        Objects.equals(this.machineEdit,
                       userPermissionSetResourceSpacePermissions.machineEdit) &&
        Objects.equals(this.machineView,
                       userPermissionSetResourceSpacePermissions.machineView) &&
        Objects.equals(
            this.machineDelete,
            userPermissionSetResourceSpacePermissions.machineDelete) &&
        Objects.equals(
            this.artifactView,
            userPermissionSetResourceSpacePermissions.artifactView) &&
        Objects.equals(
            this.artifactCreate,
            userPermissionSetResourceSpacePermissions.artifactCreate) &&
        Objects.equals(
            this.artifactEdit,
            userPermissionSetResourceSpacePermissions.artifactEdit) &&
        Objects.equals(
            this.artifactDelete,
            userPermissionSetResourceSpacePermissions.artifactDelete) &&
        Objects.equals(this.feedView,
                       userPermissionSetResourceSpacePermissions.feedView) &&
        Objects.equals(this.eventView,
                       userPermissionSetResourceSpacePermissions.eventView) &&
        Objects.equals(
            this.libraryVariableSetView,
            userPermissionSetResourceSpacePermissions.libraryVariableSetView) &&
        Objects.equals(this.libraryVariableSetCreate,
                       userPermissionSetResourceSpacePermissions
                           .libraryVariableSetCreate) &&
        Objects.equals(
            this.libraryVariableSetEdit,
            userPermissionSetResourceSpacePermissions.libraryVariableSetEdit) &&
        Objects.equals(this.libraryVariableSetDelete,
                       userPermissionSetResourceSpacePermissions
                           .libraryVariableSetDelete) &&
        Objects.equals(
            this.projectGroupView,
            userPermissionSetResourceSpacePermissions.projectGroupView) &&
        Objects.equals(
            this.projectGroupCreate,
            userPermissionSetResourceSpacePermissions.projectGroupCreate) &&
        Objects.equals(
            this.projectGroupEdit,
            userPermissionSetResourceSpacePermissions.projectGroupEdit) &&
        Objects.equals(
            this.projectGroupDelete,
            userPermissionSetResourceSpacePermissions.projectGroupDelete) &&
        Objects.equals(this.teamCreate,
                       userPermissionSetResourceSpacePermissions.teamCreate) &&
        Objects.equals(this.teamView,
                       userPermissionSetResourceSpacePermissions.teamView) &&
        Objects.equals(this.teamEdit,
                       userPermissionSetResourceSpacePermissions.teamEdit) &&
        Objects.equals(this.teamDelete,
                       userPermissionSetResourceSpacePermissions.teamDelete) &&
        Objects.equals(this.userView,
                       userPermissionSetResourceSpacePermissions.userView) &&
        Objects.equals(this.userInvite,
                       userPermissionSetResourceSpacePermissions.userInvite) &&
        Objects.equals(
            this.userRoleView,
            userPermissionSetResourceSpacePermissions.userRoleView) &&
        Objects.equals(
            this.userRoleEdit,
            userPermissionSetResourceSpacePermissions.userRoleEdit) &&
        Objects.equals(this.taskView,
                       userPermissionSetResourceSpacePermissions.taskView) &&
        Objects.equals(this.taskCreate,
                       userPermissionSetResourceSpacePermissions.taskCreate) &&
        Objects.equals(this.taskCancel,
                       userPermissionSetResourceSpacePermissions.taskCancel) &&
        Objects.equals(this.taskEdit,
                       userPermissionSetResourceSpacePermissions.taskEdit) &&
        Objects.equals(
            this.interruptionView,
            userPermissionSetResourceSpacePermissions.interruptionView) &&
        Objects.equals(
            this.interruptionSubmit,
            userPermissionSetResourceSpacePermissions.interruptionSubmit) &&
        Objects.equals(this.interruptionViewSubmitResponsible,
                       userPermissionSetResourceSpacePermissions
                           .interruptionViewSubmitResponsible) &&
        Objects.equals(
            this.builtInFeedPush,
            userPermissionSetResourceSpacePermissions.builtInFeedPush) &&
        Objects.equals(
            this.builtInFeedAdminister,
            userPermissionSetResourceSpacePermissions.builtInFeedAdminister) &&
        Objects.equals(
            this.builtInFeedDownload,
            userPermissionSetResourceSpacePermissions.builtInFeedDownload) &&
        Objects.equals(
            this.actionTemplateView,
            userPermissionSetResourceSpacePermissions.actionTemplateView) &&
        Objects.equals(
            this.actionTemplateCreate,
            userPermissionSetResourceSpacePermissions.actionTemplateCreate) &&
        Objects.equals(
            this.actionTemplateEdit,
            userPermissionSetResourceSpacePermissions.actionTemplateEdit) &&
        Objects.equals(
            this.actionTemplateDelete,
            userPermissionSetResourceSpacePermissions.actionTemplateDelete) &&
        Objects.equals(
            this.lifecycleCreate,
            userPermissionSetResourceSpacePermissions.lifecycleCreate) &&
        Objects.equals(
            this.lifecycleView,
            userPermissionSetResourceSpacePermissions.lifecycleView) &&
        Objects.equals(
            this.lifecycleEdit,
            userPermissionSetResourceSpacePermissions.lifecycleEdit) &&
        Objects.equals(
            this.lifecycleDelete,
            userPermissionSetResourceSpacePermissions.lifecycleDelete) &&
        Objects.equals(this.accountView,
                       userPermissionSetResourceSpacePermissions.accountView) &&
        Objects.equals(this.accountEdit,
                       userPermissionSetResourceSpacePermissions.accountEdit) &&
        Objects.equals(
            this.accountCreate,
            userPermissionSetResourceSpacePermissions.accountCreate) &&
        Objects.equals(
            this.accountDelete,
            userPermissionSetResourceSpacePermissions.accountDelete) &&
        Objects.equals(
            this.tenantCreate,
            userPermissionSetResourceSpacePermissions.tenantCreate) &&
        Objects.equals(this.tenantEdit,
                       userPermissionSetResourceSpacePermissions.tenantEdit) &&
        Objects.equals(this.tenantView,
                       userPermissionSetResourceSpacePermissions.tenantView) &&
        Objects.equals(
            this.tenantDelete,
            userPermissionSetResourceSpacePermissions.tenantDelete) &&
        Objects.equals(
            this.tagSetCreate,
            userPermissionSetResourceSpacePermissions.tagSetCreate) &&
        Objects.equals(this.tagSetEdit,
                       userPermissionSetResourceSpacePermissions.tagSetEdit) &&
        Objects.equals(
            this.tagSetDelete,
            userPermissionSetResourceSpacePermissions.tagSetDelete) &&
        Objects.equals(
            this.machinePolicyCreate,
            userPermissionSetResourceSpacePermissions.machinePolicyCreate) &&
        Objects.equals(
            this.machinePolicyView,
            userPermissionSetResourceSpacePermissions.machinePolicyView) &&
        Objects.equals(
            this.machinePolicyEdit,
            userPermissionSetResourceSpacePermissions.machinePolicyEdit) &&
        Objects.equals(
            this.machinePolicyDelete,
            userPermissionSetResourceSpacePermissions.machinePolicyDelete) &&
        Objects.equals(this.proxyCreate,
                       userPermissionSetResourceSpacePermissions.proxyCreate) &&
        Objects.equals(this.proxyView,
                       userPermissionSetResourceSpacePermissions.proxyView) &&
        Objects.equals(this.proxyEdit,
                       userPermissionSetResourceSpacePermissions.proxyEdit) &&
        Objects.equals(this.proxyDelete,
                       userPermissionSetResourceSpacePermissions.proxyDelete) &&
        Objects.equals(
            this.subscriptionCreate,
            userPermissionSetResourceSpacePermissions.subscriptionCreate) &&
        Objects.equals(
            this.subscriptionView,
            userPermissionSetResourceSpacePermissions.subscriptionView) &&
        Objects.equals(
            this.subscriptionEdit,
            userPermissionSetResourceSpacePermissions.subscriptionEdit) &&
        Objects.equals(
            this.subscriptionDelete,
            userPermissionSetResourceSpacePermissions.subscriptionDelete) &&
        Objects.equals(
            this.triggerCreate,
            userPermissionSetResourceSpacePermissions.triggerCreate) &&
        Objects.equals(this.triggerView,
                       userPermissionSetResourceSpacePermissions.triggerView) &&
        Objects.equals(this.triggerEdit,
                       userPermissionSetResourceSpacePermissions.triggerEdit) &&
        Objects.equals(
            this.triggerDelete,
            userPermissionSetResourceSpacePermissions.triggerDelete) &&
        Objects.equals(
            this.certificateView,
            userPermissionSetResourceSpacePermissions.certificateView) &&
        Objects.equals(
            this.certificateCreate,
            userPermissionSetResourceSpacePermissions.certificateCreate) &&
        Objects.equals(
            this.certificateEdit,
            userPermissionSetResourceSpacePermissions.certificateEdit) &&
        Objects.equals(
            this.certificateDelete,
            userPermissionSetResourceSpacePermissions.certificateDelete) &&
        Objects.equals(this.certificateExportPrivateKey,
                       userPermissionSetResourceSpacePermissions
                           .certificateExportPrivateKey) &&
        Objects.equals(this.userEdit,
                       userPermissionSetResourceSpacePermissions.userEdit) &&
        Objects.equals(
            this.configureServer,
            userPermissionSetResourceSpacePermissions.configureServer) &&
        Objects.equals(this.feedEdit,
                       userPermissionSetResourceSpacePermissions.feedEdit) &&
        Objects.equals(this.workerView,
                       userPermissionSetResourceSpacePermissions.workerView) &&
        Objects.equals(this.workerEdit,
                       userPermissionSetResourceSpacePermissions.workerEdit) &&
        Objects.equals(this.spaceEdit,
                       userPermissionSetResourceSpacePermissions.spaceEdit) &&
        Objects.equals(this.spaceView,
                       userPermissionSetResourceSpacePermissions.spaceView) &&
        Objects.equals(this.spaceDelete,
                       userPermissionSetResourceSpacePermissions.spaceDelete) &&
        Objects.equals(this.spaceCreate,
                       userPermissionSetResourceSpacePermissions.spaceCreate) &&
        Objects.equals(
            this.buildInformationPush,
            userPermissionSetResourceSpacePermissions.buildInformationPush) &&
        Objects.equals(this.buildInformationAdminister,
                       userPermissionSetResourceSpacePermissions
                           .buildInformationAdminister) &&
        Objects.equals(this.runbookView,
                       userPermissionSetResourceSpacePermissions.runbookView) &&
        Objects.equals(this.runbookEdit,
                       userPermissionSetResourceSpacePermissions.runbookEdit) &&
        Objects.equals(
            this.runbookRunView,
            userPermissionSetResourceSpacePermissions.runbookRunView) &&
        Objects.equals(
            this.runbookRunDelete,
            userPermissionSetResourceSpacePermissions.runbookRunDelete) &&
        Objects.equals(
            this.runbookRunCreate,
            userPermissionSetResourceSpacePermissions.runbookRunCreate);
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
    sb.append("class UserPermissionSetResourceSpacePermissions {\n");
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
