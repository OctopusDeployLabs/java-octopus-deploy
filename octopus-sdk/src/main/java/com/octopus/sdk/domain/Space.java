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

package com.octopus.sdk.domain;

import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.api.ChannelApi;
import com.octopus.sdk.api.EnvironmentApi;
import com.octopus.sdk.api.LifecycleApi;
import com.octopus.sdk.api.PackageApi;
import com.octopus.sdk.api.ProjectApi;
import com.octopus.sdk.api.ProjectGroupApi;
import com.octopus.sdk.api.ReleaseApi;
import com.octopus.sdk.api.TagSetApi;
import com.octopus.sdk.api.TenantApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.sdk.operation.ExecutionsCreateApi;

public class Space {
  private final OctopusClient client;
  private final SpaceHome spaceHome;
  private final SpaceOverviewWithLinks spaceOverviewResource;

  public Space(
      final OctopusClient client,
      final SpaceHome spaceHome,
      final SpaceOverviewWithLinks spaceOverviewResource) {
    this.client = client;
    this.spaceHome = spaceHome;
    this.spaceOverviewResource = spaceOverviewResource;
  }

  public ProjectApi projects() {
    return ProjectApi.create(client, spaceHome);
  }

  public ReleaseApi releases() {
    return ReleaseApi.create(client, spaceHome);
  }

  public EnvironmentApi environments() {
    return EnvironmentApi.create(client, spaceHome);
  }

  public PackageApi packages() {
    return PackageApi.create(client, spaceHome);
  }

  public ProjectGroupApi projectGroups() {
    return ProjectGroupApi.create(client, spaceHome);
  }

  public BuildInformationApi buildInformation() {
    return BuildInformationApi.create(client, spaceHome);
  }

  public LifecycleApi lifecycles() {
    return LifecycleApi.create(client, spaceHome);
  }

  public ChannelApi channels() {
    return ChannelApi.create(client, spaceHome);
  }

  public TenantApi tenants() {
    return TenantApi.create(client, spaceHome);
  }

  public TagSetApi tagSets() {
    return TagSetApi.create(client, spaceHome);
  }

  public SpaceOverviewWithLinks getProperties() {
    return spaceOverviewResource;
  }

  public SpaceHome getHome() {
    return spaceHome;
  }

  public ExecutionsCreateApi executionsApi() {
    return new ExecutionsCreateApi(client, spaceHome);
  }
}
