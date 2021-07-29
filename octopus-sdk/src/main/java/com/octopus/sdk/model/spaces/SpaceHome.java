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

package com.octopus.sdk.model.spaces;

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.octopus.sdk.model.LinkHelpers;

// This is used to decode a space-home resource as received from OctopusServer
public class SpaceHome {

  @SerializedName("Links")
  private final Map<String, String> links;

  public SpaceHome(final Map<String, String> links) {
    this.links = links;
  }

  protected Map<String, String> getLinks() {
    return links;
  }

  // Returns true if the linkset is populated with expected links.
  public boolean isValid() {
    // accounts is arbitrarily selected
    return (getAccountsLink() != null);
  }

  public String getAccountsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Accounts"));
  }

  public String getActionTemplateLogoLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ActionTemplateLogo"));
  }

  public String getActionTemplateVersionedLogoLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ActionTemplateVersionedLogo"));
  }

  public String getActionTemplatesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ActionTemplates"));
  }

  public String getActionTemplatesCategoriesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ActionTemplatesCategories"));
  }

  public String getActionTemplatesSearchLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ActionTemplatesSearch"));
  }

  public String getArtifactsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Artifacts"));
  }

  public String getBuildInformationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("BuildInformation"));
  }

  public String getBuildInformationBulkLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("BuildInformationBulk"));
  }

  public String getBuiltInFeedStatsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("BuiltInFeedStats"));
  }

  public String getCertificatesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Certificates"));
  }

  public String getChannelsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Channels"));
  }

  public String getDashboardLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Dashboard"));
  }

  public String getDashboardConfigurationLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DashboardConfiguration"));
  }

  public String getDashboardDynamicLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DashboardDynamic"));
  }

  public String getDeploymentProcessesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DeploymentProcesses"));
  }

  public String getDeploymentsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Deployments"));
  }

  public String getDiscoverMachineLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DiscoverMachine"));
  }

  public String getDiscoverWorkerLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DiscoverWorker"));
  }

  public String getEnvironmentSortOrderLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EnvironmentSortOrder"));
  }

  public String getEnvironmentsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Environments"));
  }

  public String getEnvironmentsSummaryLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("EnvironmentsSummary"));
  }

  public String getExportProjectsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ExportProjects"));
  }

  public String getFeedsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Feeds"));
  }

  public String getImportProjectsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ImportProjects"));
  }

  public String getInterruptionsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Interruptions"));
  }

  public String getLibraryVariablesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("LibraryVariables"));
  }

  public String getLifecyclesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Lifecycles"));
  }

  public String getMachineOperatingSystemsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MachineOperatingSystems"));
  }

  public String getMachinePoliciesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MachinePolicies"));
  }

  public String getMachinePolicyTemplateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MachinePolicyTemplate"));
  }

  public String getMachineRolesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MachineRoles"));
  }

  public String getMachineShellsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("MachineShells"));
  }

  public String getMachinesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Machines"));
  }

  public String getPackageDeltaSignatureLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackageDeltaSignature"));
  }

  public String getPackageDeltaUploadLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackageDeltaUpload"));
  }

  public String getPackageMetadataLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackageMetadata"));
  }

  public String getPackageNotesListLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackageNotesList"));
  }

  public String getPackageUploadLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackageUpload"));
  }

  public String getPackagesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Packages"));
  }

  public String getPackagesBulkLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("PackagesBulk"));
  }

  public String getProjectGroupsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectGroups"));
  }

  public String getProjectImportFilesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectImportFiles"));
  }

  public String getProjectImportPreviewLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectImportPreview"));
  }

  public String getProjectPulseLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectPulse"));
  }

  public String getProjectTriggersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectTriggers"));
  }

  public String getProjectsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Projects"));
  }

  public String getProjectsExperimentalSummariesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ProjectsExperimentalSummaries"));
  }

  public String getProxiesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Proxies"));
  }

  public String getReleasesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Releases"));
  }

  public String getReportingDeploymentsCountedByWeekLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Reporting\\/DeploymentsCountedByWeek"));
  }

  public String getRunbookProcessesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("RunbookProcesses"));
  }

  public String getRunbookRunsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("RunbookRuns"));
  }

  public String getRunbookSnapshotsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("RunbookSnapshots"));
  }

  public String getRunbooksLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Runbooks"));
  }

  public String getScheduledProjectTriggersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ScheduledProjectTriggers"));
  }

  public String getSelfLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Self"));
  }

  public String getSpaceSearchLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("SpaceSearch"));
  }

  public String getSubscriptionsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Subscriptions"));
  }

  public String getTagSetSortOrderLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TagSetSortOrder"));
  }

  public String getTagSetsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TagSets"));
  }

  public String getTenantTagTestLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TenantTagTest"));
  }

  public String getTenantVariablesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TenantVariables"));
  }

  public String getTenantsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Tenants"));
  }

  public String getTenantsMissingVariablesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TenantsMissingVariables"));
  }

  public String getTenantsStatusLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("TenantsStatus"));
  }

  public String getUserOnboardingLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("UserOnboarding"));
  }

  public String getVariableNamesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VariableNames"));
  }

  public String getVariablePreviewLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VariablePreview"));
  }

  public String getVariablesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Variables"));
  }

  public String getVersionRuleTestLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VersionRuleTest"));
  }

  public String getWorkerOperatingSystemsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerOperatingSystems"));
  }

  public String getWorkerPoolsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerPools"));
  }

  public String getWorkerPoolsDynamicWorkerTypesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerPoolsDynamicWorkerTypes"));
  }

  public String getWorkerPoolsSortOrderLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerPoolsSortOrder"));
  }

  public String getWorkerPoolsSummaryLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerPoolsSummary"));
  }

  public String getWorkerPoolsSupportedTypesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerPoolsSupportedTypes"));
  }

  public String getWorkerShellsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("WorkerShells"));
  }

  public String getWorkersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Workers"));
  }
}
