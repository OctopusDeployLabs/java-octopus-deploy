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
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.packages.PackagePaginationedCollection;
import com.octopus.sdk.model.packages.PackageResourceWithLinks;
import com.octopus.sdk.model.spaces.SpaceHome;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

public class PackagesApi
    extends BaseResourceApi<
        PackageResourceWithLinks, PackageResourceWithLinks, PackagePaginationedCollection> {

  private final String creationPath;

  protected PackagesApi(
      final OctopusClient client, final String rootPath, final String creationPath) {
    super(client, rootPath, PackageResourceWithLinks.class, PackagePaginationedCollection.class);
    this.creationPath = creationPath;
  }

  public static PackagesApi uploadPackage(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(
        spaceHome, "Cannot create a Packages API in a space with a 'null' space");
    return new PackagesApi(client, spaceHome.getPackagesLink(), spaceHome.getPackageUploadLink());
  }

  public PackageFromBuiltInFeedResource uploadPackage(
      final File fileToUpload, final OverwriteMode overwriteMode) throws IOException {
    final Map<String, List<String>> queryParams = new HashMap<>();
    queryParams.put("overwriteMode", Lists.newArrayList(overwriteMode.toString()));
    final RequestEndpoint endpoint = new RequestEndpoint(creationPath, queryParams);

    return client.postStream(endpoint, fileToUpload, PackageFromBuiltInFeedResource.class);
  }

  @Override
  public PackageResourceWithLinks create(final PackageResourceWithLinks input) {
    throw new UnsupportedOperationException(
        "Packages cannot be created via this interface, it must be conducted via "
            + "the PackageUpload capability");
  }

  @Override
  public PackageResourceWithLinks update(final PackageResourceWithLinks input) {
    throw new UnsupportedOperationException(
        "Packages cannot be updated via this interface, it must be conducted via");
  }
}
