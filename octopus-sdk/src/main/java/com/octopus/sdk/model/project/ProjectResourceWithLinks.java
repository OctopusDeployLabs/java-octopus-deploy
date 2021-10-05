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

package com.octopus.sdk.model.project;

public class ProjectResourceWithLinks extends ProjectResource {

  public ProjectResourceWithLinks(
      final String name, final String lifecycleId, final String projectgroupId) {
    super(name, lifecycleId, projectgroupId);
  }

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
