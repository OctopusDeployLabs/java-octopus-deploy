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

import com.octopus.openapi.model.ProjectResource;

// Trying to work out if this is worth doing.
public class Project extends ProjectResource {

  public String getChannelsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Channels"));
  }

  public String getConvertToVcsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ConvertToVcs"));
  }

  public String getDeploymentProcessLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DeploymentProcess"));
  }

  public String getDeploymentSettingsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("DeploymentSettings"));
  }

  public String getLogoLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Logo"));
  }

  public String getMetadataLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Metadata"));
  }

  public String getOrderChannelsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("OrderChannels"));
  }

  public String getProgressionLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Progression"));
  }

  public String getReleasesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Releases"));
  }

  public String getRunbookSnapshotsLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("RunbookSnapshots"));
  }

  public String getRunbookTaskRunDashboardItemsTemplateLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("RunbookTaskRunDashboardItemsTemplate"));
  }

  public String getRunbooksLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Runbooks"));
  }

  public String getScheduledTriggersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("ScheduledTriggers"));
  }

  public String getSelfLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Self"));
  }

  public String getSummaryLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Summary"));
  }

  public String getTriggersLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Triggers"));
  }

  public String getVariablesLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Variables"));
  }

  public String getVersionControlCompatibilityReportLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VersionControlCompatibilityReport"));
  }

  public String getVersionControlSettingsConnectionTestLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("VersionControlSettingsConnectionTest"));
  }

  public String getWebLink() {
    return LinkHelpers.getCleansedRawLink(getLinks().get("Web"));
  }
}
