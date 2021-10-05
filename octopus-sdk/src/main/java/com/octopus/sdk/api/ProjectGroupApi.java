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

package com.octopus.sdk.api;

import com.octopus.sdk.domain.ProjectGroup;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.projectgroup.ProjectGroupPaginatedCollection;
import com.octopus.sdk.model.projectgroup.ProjectGroupResource;
import com.octopus.sdk.model.projectgroup.ProjectGroupResourceWithLinks;
import com.octopus.sdk.model.space.SpaceHome;

import com.google.common.base.Preconditions;

public class ProjectGroupApi
    extends BaseNamedResourceApi<
        ProjectGroupResource,
        ProjectGroupResourceWithLinks,
        ProjectGroupPaginatedCollection,
        ProjectGroup> {

  public ProjectGroupsApi(final OctopusClient client, final String rootPath) {
    super(
        client,
        rootPath,
        ProjectGroupResourceWithLinks.class,
        ProjectGroupPaginatedCollection.class);
  }

  public static ProjectGroupsApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(
        spaceHome, "Cannot create a ProjectGroupsApi in a space with a 'null' space");
    return new ProjectGroupsApi(client, spaceHome.getProjectGroupsLink());
  }

  @Override
  public ProjectGroup createServerObject(final ProjectGroupResourceWithLinks resource) {
    return new ProjectGroup(client, resource);
  }
}
