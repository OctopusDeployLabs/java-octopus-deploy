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

package com.octopus.sdk.repository.space;

import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.api.EnvironmentsApi;
import com.octopus.sdk.api.PackagesApi;
import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.ProjectGroupsApi;
import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewResource;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import com.octopus.sdk.repository.project.ProjectRepository;
import com.octopus.sdk.repository.projectgroup.ProjectGroup;
import com.octopus.sdk.repository.projectgroup.ProjectGroupRepository;
import com.octopus.sdk.repository.release.ReleaseRepository;

public class Space {
  private final OctopusClient client;
  private final SpaceHome spaceHome;
  private final SpaceOverviewWithLinks spaceOverviewResource;

  public Space(final OctopusClient client, final SpaceHome spaceHome,
      final SpaceOverviewWithLinks spaceOverviewResource) {
    this.client = client;
    this.spaceHome = spaceHome;
    this.spaceOverviewResource = spaceOverviewResource;
  }

  public ProjectRepository projects() {
    return new ProjectRepository(client, ProjectApi.create(client, spaceHome));
  }

  public ReleaseRepository releases() {
    return new ReleaseRepository(client, ReleaseApi.create(client, spaceHome));
  }

  public EnvironmentsApi environments() {
    return EnvironmentsApi.create(client, spaceHome);
  }

  public PackagesApi packages() {
    return PackagesApi.create(client, spaceHome);
  }

  public ProjectGroupRepository projectGroups() {
    return new ProjectGroupRepository(client, ProjectGroupsApi.create(client, spaceHome));
  }

  public BuildInformationApi buildInformation() {
    return BuildInformationApi.create(client, spaceHome);
  }

  public SpaceOverviewWithLinks getProperties() { return spaceOverviewResource; }

}
