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

package com.octopus.sdk.model.runbook;

public class RunbookResourceWithLinks extends RunbookResource {

  public RunbookResourceWithLinks(final String name) {
    super(name);
  }

  public String getCreateRunbookRunLink() {
    return getCleansedLink("CreateRunbookRun");
  }

  public String getProgressionLink() {
    return getCleansedLink("Progression");
  }

  public String getProjectLink() {
    return getCleansedLink("Project");
  }

  public String getRunbookEnvironmentsLink() {
    return getCleansedLink("RunbookEnvironments");
  }

  public String getRunbookProcessesLink() {
    return getCleansedLink("RunbookProcesses");
  }

  public String getRunbookRunPreviewLink() {
    return getCleansedLink("RunbookRunPreview");
  }

  public String getRunbookRunTemplateLink() {
    return getCleansedLink("RunbookRunTemplate");
  }

  public String getRunbookRunTenantPreviewLink() {
    return getCleansedLink("RunbookRunTenantPreview");
  }

  public String getRunbookSnapshotTemplateLink() {
    return getCleansedLink("RunbookSnapshotTemplate");
  }

  public String getRunbookSnapshotsLink() {
    return getCleansedLink("RunbookSnapshots");
  }

  public String getTaskRunDashboardItemsTemplateLink() {
    return getCleansedLink("TaskRunDashboardItemsTemplate");
  }

  public String getTemplateLink() {
    return getCleansedLink("Template");
  }
}
