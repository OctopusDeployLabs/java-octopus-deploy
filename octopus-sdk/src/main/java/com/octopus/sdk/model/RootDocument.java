/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model;

import com.octopus.sdk.model.spaces.SpaceHome;

import java.util.Map;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

public class RootDocument extends SpaceHome {

  @SerializedName("Application")
  private final String application;

  @SerializedName("Version")
  private final String version;

  @SerializedName("ApiVersion")
  private final String apiVersion;

  @SerializedName("InstallationId")
  private final String installationId;

  @SerializedName("HasLongTermSupport")
  private final boolean hasLongTermSupport;

  public RootDocument(
      final String application,
      final String version,
      final String apiVersion,
      final String installationId,
      final boolean hasLongTermSupport,
      final Map<String, String> links) {
    super(links);
    this.application = application;
    this.version = version;
    this.apiVersion = apiVersion;
    this.installationId = installationId;
    this.hasLongTermSupport = hasLongTermSupport;
  }

  public String getApplicationLink() {
    return application;
  }

  public String getVersionLink() {
    return version;
  }

  public Optional<String> getApiVersionLink() {
    return Optional.ofNullable(apiVersion);
  }

  public String getInstallationIdLink() {
    return installationId;
  }

  public boolean isHasLongTermSupportLink() {
    return hasLongTermSupport;
  }

  public String getAuthenticationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Authentication"));
  }

  public String getAzureDevOpsConnectivityCheckLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("AzureDevOpsConnectivityCheck"));
  }

  public String getAzureEnvironmentsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("AzureEnvironments"));
  }

  public String getCertificateConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CertificateConfiguration"));
  }

  public String getCloudTemplateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CloudTemplate"));
  }

  public String getCommunityActionTemplatesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CommunityActionTemplates"));
  }

  public String getConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Configuration"));
  }

  public String getCurrentLicenseLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CurrentLicense"));
  }

  public String getCurrentLicenseStatusLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CurrentLicenseStatus"));
  }

  public String getCurrentUserLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("CurrentUser"));
  }

  public String getDynamicExtensionsFeaturesMetadataLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DynamicExtensionsFeaturesMetadata"));
  }

  public String getDynamicExtensionsFeaturesValuesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DynamicExtensionsFeaturesValues"));
  }

  public String getDynamicExtensionsScriptsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DynamicExtensionsScripts"));
  }

  public String getEventAgentsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EventAgents"));
  }

  public String getEventCategoriesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EventCategories"));
  }

  public String getEventDocumentTypesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EventDocumentTypes"));
  }

  public String getEventGroupsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EventGroups"));
  }

  public String getEventsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Events"));
  }

  public String getExtensionStatsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExtensionStats"));
  }

  public String getExternalSecurityGroupProvidersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExternalSecurityGroupProviders"));
  }

  public String getExternalUserSearchLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExternalUserSearch"));
  }

  public String getFeaturesConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("FeaturesConfiguration"));
  }

  public String getInvitationsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Invitations"));
  }

  public String getIssueTrackersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("IssueTrackers"));
  }

  public String getJiraConnectAppCredentialsTestLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("JiraConnectAppCredentialsTest"));
  }

  public String getJiraCredentialsTestLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("JiraCredentialsTest"));
  }

  public String getLoginInitiatedLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("LoginInitiated"));
  }

  public String getMaintenanceConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MaintenanceConfiguration"));
  }

  public String getMigrationsImportLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MigrationsImport"));
  }

  public String getMigrationsPartialExportLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MigrationsPartialExport"));
  }

  public String getOctopusServerClusterSummaryLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("OctopusServerClusterSummary"));
  }

  public String getOctopusServerNodesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("OctopusServerNodes"));
  }

  public String getPerformanceConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PerformanceConfiguration"));
  }

  public String getPermissionDescriptionsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PermissionDescriptions"));
  }

  public String getRegisterLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Register"));
  }

  public String getSchedulerLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Scheduler"));
  }

  public String getScopedUserRolesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ScopedUserRoles"));
  }

  public String getServerConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ServerConfiguration"));
  }

  public String getServerConfigurationSettingsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ServerConfigurationSettings"));
  }

  public String getServerHealthStatusLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ServerHealthStatus"));
  }

  public String getServerStatusLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ServerStatus"));
  }

  public String getSignInLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SignIn"));
  }

  public String getSignOutLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SignOut"));
  }

  public String getSmtpConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SmtpConfiguration"));
  }

  public String getSmtpIsConfiguredLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SmtpIsConfigured"));
  }

  public String getSpaceHomeLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SpaceHome"));
  }

  public String getSpacesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Spaces"));
  }

  public String getTasksLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Tasks"));
  }

  public String getTaskTypesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TaskTypes"));
  }

  public String getTeamMembershipLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TeamMembership"));
  }

  public String getTeamMembershipPreviewTeamLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TeamMembershipPreviewTeam"));
  }

  public String getTeamsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Teams"));
  }

  public String getTimezonesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Timezones"));
  }

  public String getUpgradeConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("UpgradeConfiguration"));
  }

  public String getUserAuthenticationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("UserAuthentication"));
  }

  public String getUserIdentityMetadataLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("UserIdentityMetadata"));
  }

  public String getUserRolesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("UserRoles"));
  }

  public String getUsersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Users"));
  }

  public String getVersionControlClearCacheLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VersionControlClearCache"));
  }

  public String getWebLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Web"));
  }

  public String getWorkerToolsLatestImagesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerToolsLatestImages"));
  }

  public String getExecutionsCreateApiDeploymentCreateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExecutionsCreateApiDeploymentCreate"));
  }

  public String getExecutionsCreateApiReleasesCreateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ReleasesCreateApiReleaseCreate"));
  }

  public String getExecutionsCreateApiRunbookRunCreateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExecutionsCreateApiRunbookRunCreate"));
  }
}
