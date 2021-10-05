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

package com.octopus.sdk.model.release;

public class ReleaseResourceWithLinks extends ReleaseResource {

  public ReleaseResourceWithLinks(final String version, final String projectId) {
    super(version, projectId);
  }

  public String getArtifactsLink() {
    return getCleansedLink("Artifacts");
  }

  public String getChannelLink() {
    return getCleansedLink("Channel");
  }

  public String getDefectsLink() {
    return getCleansedLink("Defects");
  }

  public String getDeploymentPreviewsLink() {
    return getCleansedLink("DeploymentPreviews");
  }

  public String getDeploymentTemplateLink() {
    return getCleansedLink("DeploymentTemplate");
  }

  public String getDeploymentsLink() {
    return getCleansedLink("Deployments");
  }

  public String getLifecycleLink() {
    return getCleansedLink("Lifecycle");
  }

  public String getProgressionLink() {
    return getCleansedLink("Progression");
  }

  public String getProjectLink() {
    return getCleansedLink("Project");
  }

  public String getProjectDeploymentProcessSnapshotLink() {
    return getCleansedLink("ProjectDeploymentProcessSnapshot");
  }

  public String getProjectVariableSnapshotLink() {
    return getCleansedLink("ProjectVariableSnapshot");
  }

  public String getReportDefectLink() {
    return getCleansedLink("ReportDefect");
  }

  public String getResolveDefectLink() {
    return getCleansedLink("ResolveDefect");
  }

  public String getSnapshotVariablesLink() {
    return getCleansedLink("SnapshotVariables");
  }

  public String getWebLink() {
    return getCleansedLink("Web");
  }
}
