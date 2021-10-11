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

import com.octopus.sdk.domain.TagSet;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.tagset.TagSetPaginatedCollection;
import com.octopus.sdk.model.tagset.TagSetResource;
import com.octopus.sdk.model.tagset.TagSetResourceWithLinks;

import com.google.common.base.Preconditions;

public class TagSetApi
    extends BaseNamedResourceApi<
        TagSetResource, TagSetResourceWithLinks, TagSetPaginatedCollection, TagSet> {

  public TagSetApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, TagSetResourceWithLinks.class, TagSetPaginatedCollection.class);
  }

  public static TagSetApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(spaceHome, "Cannot create a TagSetApi in a 'null' space");
    return new TagSetApi(client, spaceHome.getTagSetsLink());
  }

  @Override
  public TagSet createServerObject(final TagSetResourceWithLinks resource) {
    return new TagSet(client, resource);
  }
}
