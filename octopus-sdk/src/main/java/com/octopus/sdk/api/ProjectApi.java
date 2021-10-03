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

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.project.ProjectPaginatedCollection;
import com.octopus.sdk.model.project.ProjectResource;
import com.octopus.sdk.model.project.ProjectResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;

import com.google.common.base.Preconditions;
import com.octopus.sdk.repository.project.Project;

public class ProjectApi
    extends BaseNamedResourceApi<
        ProjectResource, ProjectResourceWithLinks, ProjectPaginatedCollection, Project> {

  public ProjectApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, ProjectResourceWithLinks.class, ProjectPaginatedCollection.class);
  }

  public static ProjectApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(spaceHome, "Cannot create a project in a space with a 'null' space");
    return new ProjectApi(client, spaceHome.getProjectsLink());
  }

  public Project createServerObject(final ProjectResourceWithLinks resource) {
    return new Project(client, resource);
  }
}
