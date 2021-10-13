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

package com.octopus.sdk.model;

import java.util.Map;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.SerializedName;

public class BaseResource {

  @SerializedName("Id")
  private String id;

  @SerializedName("Links")
  private Map<String, String> links;

  public String getId() {
    return id;
  }

  public ImmutableMap<String, String> getLinks() {
    return ImmutableMap.copyOf(links);
  }

  @VisibleForTesting
  public void setLinks(final Map<String, String> links) {
    this.links = links;
  }

  protected String getCleansedLink(final String linkTag) {
    return LinkHelpers.getCleansedRawLink(getLinks().get(linkTag));
  }

  public String getSelfLink() {
    return getCleansedLink("Self");
  }
}
