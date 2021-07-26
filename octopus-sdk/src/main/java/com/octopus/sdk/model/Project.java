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

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.ActionTemplateParameterResource;
import com.octopus.openapi.model.AutoDeployReleaseOverrideResource;
import com.octopus.openapi.model.DeploymentConnectivityPolicy;
import com.octopus.openapi.model.ExtensionSettingsValues;
import com.octopus.openapi.model.GuidedFailureMode;
import com.octopus.openapi.model.PersistenceSettingsResource;
import com.octopus.openapi.model.ReleaseCreationStrategyResource;
import com.octopus.openapi.model.TenantedDeploymentMode;
import com.octopus.openapi.model.VersioningStrategyResource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Set;

// Trying to work out if this is worth doing.
public class Project extends NamedResource {

  @SerializedName("AutoCreateRelease")
  private Boolean autoCreateRelease;

  @SerializedName("AutoDeployReleaseOverrides")
  private Set<AutoDeployReleaseOverrideResource> autoDeployReleaseOverrides = null;

  @SerializedName("ClonedFromProjectId")
  private String clonedFromProjectId;

  @SerializedName("DefaultGuidedFailureMode")
  private GuidedFailureMode defaultGuidedFailureMode;

  @SerializedName("DefaultToSkipIfAlreadyInstalled")
  private Boolean defaultToSkipIfAlreadyInstalled;

  @SerializedName("DeploymentChangesTemplate")
  private String deploymentChangesTemplate;

  @SerializedName("DeploymentProcessId")
  private String deploymentProcessId;


  @SerializedName("DiscreteChannelRelease")
  private Boolean discreteChannelRelease;

  @SerializedName("ExtensionSettings")
  private List<ExtensionSettingsValues> extensionSettings = null;

  @SerializedName("IncludedLibraryVariableSetIds")
  private List<String> includedLibraryVariableSetIds = null;

  @SerializedName("IsDisabled")
  private Boolean isDisabled;

  @SerializedName("IsVersionControlled")
  private Boolean isVersionControlled;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LifecycleId")
  private String lifecycleId;

  @SerializedName("PersistenceSettings")
  private PersistenceSettingsResource persistenceSettings;

  @SerializedName("ProjectConnectivityPolicy")
  private DeploymentConnectivityPolicy projectConnectivityPolicy;

  @SerializedName("ProjectGroupId")
  private String projectGroupId;

  @SerializedName("ReleaseCreationStrategy")
  private ReleaseCreationStrategyResource releaseCreationStrategy;

  @SerializedName("ReleaseNotesTemplate")
  private String releaseNotesTemplate;

  @SerializedName("Slug")
  private String slug;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("Templates")
  private List<ActionTemplateParameterResource> templates = null;

  @SerializedName("TenantedDeploymentMode")
  private TenantedDeploymentMode tenantedDeploymentMode;

  @SerializedName("VariableSetId")
  private String variableSetId;

  @SerializedName("VersioningStrategy")
  private VersioningStrategyResource versioningStrategy;

  public String getChannelsLink() {
    return getCleansedLink("Channels");
  }

  public String getConvertToVcsLink() {
    return getCleansedLink("ConvertToVcs");
  }

  public String getDeploymentProcessLink() {
    return getCleansedLink("DeploymentProcess");
  }

  public String getDeploymentSettingsLink() {
    return getCleansedLink("DeploymentSettings");
  }

  public String getLogoLink() {
    return getCleansedLink("Logo");
  }

  public String getMetadataLink() {
    return getCleansedLink("Metadata");
  }

  public String getOrderChannelsLink() {
    return getCleansedLink("OrderChannels");
  }

  public String getProgressionLink() {
    return getCleansedLink("Progression");
  }

  public String getReleasesLink() {
    return getCleansedLink("Releases");
  }

  public String getRunbookSnapshotsLink() {
    return getCleansedLink("RunbookSnapshots");
  }

  public String getRunbookTaskRunDashboardItemsTemplateLink() {
    return getCleansedLink("RunbookTaskRunDashboardItemsTemplate");
  }

  public String getRunbooksLink() {
    return getCleansedLink("Runbooks");
  }

  public String getScheduledTriggersLink() {
    return getCleansedLink("ScheduledTriggers");
  }

  public String getSelfLink() {
    return getCleansedLink("Self");
  }

  public String getSummaryLink() {
    return getCleansedLink("Summary");
  }

  public String getTriggersLink() {
    return getCleansedLink("Triggers");
  }

  public String getVariablesLink() {
    return getCleansedLink("Variables");
  }

  public String getVersionControlCompatibilityReportLink() {
    return getCleansedLink("VersionControlCompatibilityReport");
  }

  public String getVersionControlSettingsConnectionTestLink() {
    return getCleansedLink("VersionControlSettingsConnectionTest");
  }

  public String getWebLink() {
    return getCleansedLink("Web");
  }
}
