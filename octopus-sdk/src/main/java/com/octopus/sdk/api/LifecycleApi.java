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

import com.octopus.sdk.domain.Lifecycle;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.lifecycle.LifecyclePaginatedCollection;
import com.octopus.sdk.model.lifecycle.LifecycleResource;
import com.octopus.sdk.model.lifecycle.LifecycleResourceWithLinks;
import com.octopus.sdk.model.space.SpaceHome;

import com.google.common.base.Preconditions;

public class LifecycleApi
    extends BaseNamedResourceApi<
        LifecycleResource, LifecycleResourceWithLinks, LifecyclePaginatedCollection, Lifecycle> {

  public LifecycleApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, LifecycleResourceWithLinks.class, LifecyclePaginatedCollection.class);
  }

  public static LifecycleApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(
        spaceHome, "Cannot create a lifecycle in a space with a 'null' space");
    return new LifecycleApi(client, spaceHome.getLifecyclesLink());
  }

  @Override
  public Lifecycle createServerObject(final LifecycleResourceWithLinks resource) {
    return new Lifecycle(client, resource);
  }
}
