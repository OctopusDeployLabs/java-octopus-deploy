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

import com.octopus.sdk.domain.Runbook;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.runbook.RunbookPaginatedCollection;
import com.octopus.sdk.model.runbook.RunbookResource;
import com.octopus.sdk.model.runbook.RunbookResourceWithLinks;
import com.octopus.sdk.model.space.SpaceHome;

import com.google.common.base.Preconditions;

public class RunbookApi
    extends BaseNamedResourceApi<
        RunbookResource, RunbookResourceWithLinks, RunbookPaginatedCollection, Runbook> {

  public RunbookApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, RunbookResourceWithLinks.class, RunbookPaginatedCollection.class);
  }

  public static RunbookApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(
        spaceHome, "Cannot create a RunbookApi in a space with a 'null' space");
    return new RunbookApi(client, spaceHome.getRunbookRunsLink());
  }

  @Override
  public Runbook createServerObject(final RunbookResourceWithLinks resource) {
    return new Runbook(client, resource);
  }
}
