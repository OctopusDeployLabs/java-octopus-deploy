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

package com.octopus.sdk.repository.project;

import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.repository.release.ReleaseExecutorRepository;

public class ProjectExecutor {

  private final OctopusClient client;
  private final ProjectResourceWithLinks resourceWithLinks;

  public ProjectExecutor(final OctopusClient client,
      final ProjectResourceWithLinks resourceWithLinks) {
    this.client = client;
    this.resourceWithLinks = resourceWithLinks;
  }

  public String getChannels() {
    throw new UnsupportedOperationException();
  }

  public String getConvertToVcs() {
    throw new UnsupportedOperationException();
  }

  public String getDeploymentProcess() {
    throw new UnsupportedOperationException();
  }

  public String getDeploymentSettings() {
    throw new UnsupportedOperationException();
  }

  public String getLogo() {
    throw new UnsupportedOperationException();
  }

  public String getMetadata() {
    throw new UnsupportedOperationException();
  }

  public String getOrderChannels() {
    throw new UnsupportedOperationException();
  }

  public String getProgression() {
    throw new UnsupportedOperationException();
  }

  public ReleaseExecutorRepository getReleases() {
    final ReleaseApi api = new ReleaseApi(client, resourceWithLinks.getReleasesLink());
    return new ReleaseExecutorRepository(client, api);
  }

  public String getRunbookSnapshots() {
    throw new UnsupportedOperationException();
  }

  public String getRunbookTaskRunDashboardItemsTemplate() {
    throw new UnsupportedOperationException();
  }

  public String getRunbooks() {
    throw new UnsupportedOperationException();
  }

  public String getScheduledTriggers() {
    throw new UnsupportedOperationException();
  }

  public String getSummary() {
    throw new UnsupportedOperationException();
  }

  public String getTriggers() {
    throw new UnsupportedOperationException();
  }

  public String getVariables() {
    throw new UnsupportedOperationException();
  }

  public String getVersionControlCompatibilityReport() {
    throw new UnsupportedOperationException();
  }

  public String getVersionControlSettingsConnectionTest() {
    throw new UnsupportedOperationException();
  }

  public String getWeb() {
    throw new UnsupportedOperationException();
  }

  public ProjectResourceWithLinks getProperties() {
    return resourceWithLinks;
  }
}
