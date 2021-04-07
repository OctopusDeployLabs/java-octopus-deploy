// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * Gets or Sets Permission
 */
@JsonAdapter(Permission.Adapter.class)
public enum Permission {

  ADMINISTERSYSTEM("AdministerSystem"),

  PROJECTEDIT("ProjectEdit"),

  PROJECTVIEW("ProjectView"),

  PROJECTCREATE("ProjectCreate"),

  PROJECTDELETE("ProjectDelete"),

  PROCESSVIEW("ProcessView"),

  PROCESSEDIT("ProcessEdit"),

  VARIABLEEDIT("VariableEdit"),

  VARIABLEEDITUNSCOPED("VariableEditUnscoped"),

  VARIABLEVIEW("VariableView"),

  VARIABLEVIEWUNSCOPED("VariableViewUnscoped"),

  RELEASECREATE("ReleaseCreate"),

  RELEASEVIEW("ReleaseView"),

  RELEASEEDIT("ReleaseEdit"),

  RELEASEDELETE("ReleaseDelete"),

  DEFECTREPORT("DefectReport"),

  DEFECTRESOLVE("DefectResolve"),

  DEPLOYMENTCREATE("DeploymentCreate"),

  DEPLOYMENTDELETE("DeploymentDelete"),

  DEPLOYMENTVIEW("DeploymentView"),

  ENVIRONMENTVIEW("EnvironmentView"),

  ENVIRONMENTCREATE("EnvironmentCreate"),

  ENVIRONMENTEDIT("EnvironmentEdit"),

  ENVIRONMENTDELETE("EnvironmentDelete"),

  MACHINECREATE("MachineCreate"),

  MACHINEEDIT("MachineEdit"),

  MACHINEVIEW("MachineView"),

  MACHINEDELETE("MachineDelete"),

  ARTIFACTVIEW("ArtifactView"),

  ARTIFACTCREATE("ArtifactCreate"),

  ARTIFACTEDIT("ArtifactEdit"),

  ARTIFACTDELETE("ArtifactDelete"),

  FEEDVIEW("FeedView"),

  EVENTVIEW("EventView"),

  LIBRARYVARIABLESETVIEW("LibraryVariableSetView"),

  LIBRARYVARIABLESETCREATE("LibraryVariableSetCreate"),

  LIBRARYVARIABLESETEDIT("LibraryVariableSetEdit"),

  LIBRARYVARIABLESETDELETE("LibraryVariableSetDelete"),

  PROJECTGROUPVIEW("ProjectGroupView"),

  PROJECTGROUPCREATE("ProjectGroupCreate"),

  PROJECTGROUPEDIT("ProjectGroupEdit"),

  PROJECTGROUPDELETE("ProjectGroupDelete"),

  TEAMCREATE("TeamCreate"),

  TEAMVIEW("TeamView"),

  TEAMEDIT("TeamEdit"),

  TEAMDELETE("TeamDelete"),

  USERVIEW("UserView"),

  USERINVITE("UserInvite"),

  USERROLEVIEW("UserRoleView"),

  USERROLEEDIT("UserRoleEdit"),

  TASKVIEW("TaskView"),

  TASKCREATE("TaskCreate"),

  TASKCANCEL("TaskCancel"),

  TASKEDIT("TaskEdit"),

  INTERRUPTIONVIEW("InterruptionView"),

  INTERRUPTIONSUBMIT("InterruptionSubmit"),

  INTERRUPTIONVIEWSUBMITRESPONSIBLE("InterruptionViewSubmitResponsible"),

  BUILTINFEEDPUSH("BuiltInFeedPush"),

  BUILTINFEEDADMINISTER("BuiltInFeedAdminister"),

  BUILTINFEEDDOWNLOAD("BuiltInFeedDownload"),

  ACTIONTEMPLATEVIEW("ActionTemplateView"),

  ACTIONTEMPLATECREATE("ActionTemplateCreate"),

  ACTIONTEMPLATEEDIT("ActionTemplateEdit"),

  ACTIONTEMPLATEDELETE("ActionTemplateDelete"),

  LIFECYCLECREATE("LifecycleCreate"),

  LIFECYCLEVIEW("LifecycleView"),

  LIFECYCLEEDIT("LifecycleEdit"),

  LIFECYCLEDELETE("LifecycleDelete"),

  ACCOUNTVIEW("AccountView"),

  ACCOUNTEDIT("AccountEdit"),

  ACCOUNTCREATE("AccountCreate"),

  ACCOUNTDELETE("AccountDelete"),

  TENANTCREATE("TenantCreate"),

  TENANTEDIT("TenantEdit"),

  TENANTVIEW("TenantView"),

  TENANTDELETE("TenantDelete"),

  TAGSETCREATE("TagSetCreate"),

  TAGSETEDIT("TagSetEdit"),

  TAGSETDELETE("TagSetDelete"),

  MACHINEPOLICYCREATE("MachinePolicyCreate"),

  MACHINEPOLICYVIEW("MachinePolicyView"),

  MACHINEPOLICYEDIT("MachinePolicyEdit"),

  MACHINEPOLICYDELETE("MachinePolicyDelete"),

  PROXYCREATE("ProxyCreate"),

  PROXYVIEW("ProxyView"),

  PROXYEDIT("ProxyEdit"),

  PROXYDELETE("ProxyDelete"),

  SUBSCRIPTIONCREATE("SubscriptionCreate"),

  SUBSCRIPTIONVIEW("SubscriptionView"),

  SUBSCRIPTIONEDIT("SubscriptionEdit"),

  SUBSCRIPTIONDELETE("SubscriptionDelete"),

  TRIGGERCREATE("TriggerCreate"),

  TRIGGERVIEW("TriggerView"),

  TRIGGEREDIT("TriggerEdit"),

  TRIGGERDELETE("TriggerDelete"),

  CERTIFICATEVIEW("CertificateView"),

  CERTIFICATECREATE("CertificateCreate"),

  CERTIFICATEEDIT("CertificateEdit"),

  CERTIFICATEDELETE("CertificateDelete"),

  CERTIFICATEEXPORTPRIVATEKEY("CertificateExportPrivateKey"),

  USEREDIT("UserEdit"),

  CONFIGURESERVER("ConfigureServer"),

  FEEDEDIT("FeedEdit"),

  WORKERVIEW("WorkerView"),

  WORKEREDIT("WorkerEdit"),

  SPACEEDIT("SpaceEdit"),

  SPACEVIEW("SpaceView"),

  SPACEDELETE("SpaceDelete"),

  SPACECREATE("SpaceCreate"),

  BUILDINFORMATIONPUSH("BuildInformationPush"),

  BUILDINFORMATIONADMINISTER("BuildInformationAdminister"),

  RUNBOOKVIEW("RunbookView"),

  RUNBOOKEDIT("RunbookEdit"),

  RUNBOOKRUNVIEW("RunbookRunView"),

  RUNBOOKRUNDELETE("RunbookRunDelete"),

  RUNBOOKRUNCREATE("RunbookRunCreate");

  private String value;

  Permission(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Permission fromValue(String value) {
    for (Permission b : Permission.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Permission> {
    @Override
    public void write(final JsonWriter jsonWriter, final Permission enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Permission read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Permission.fromValue(value);
    }
  }
}
