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

import com.google.common.base.Preconditions;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.PackageVersionBuildInformationMappedResourcePaginatedCollection;
import com.octopus.sdk.model.spaces.SpaceHome;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.singletonList;

public class BuildInformationApi extends BaseResourceApi<OctopusPackageVersionBuildInformation,
    PackageVersionBuildInformationMappedResourcePaginatedCollection> {

  public BuildInformationApi(final OctopusClient client, final String rootPath) {
    super(client, rootPath, OctopusPackageVersionBuildInformation.class,
        PackageVersionBuildInformationMappedResourcePaginatedCollection.class);
  }

  public static BuildInformationApi create(final OctopusClient client, final SpaceHome spaceHome) {
    Preconditions.checkNotNull(client, "Supplied a null client");
    Preconditions.checkNotNull(spaceHome, "Cannot create a BuildInformationApi in a space with a 'null' space");
    return new BuildInformationApi(client, spaceHome.getBuildInformationLink());
  }

  @Override
  public OctopusPackageVersionBuildInformation create(
      final OctopusPackageVersionBuildInformation resourceToCreate) throws IOException {
    throw new UnsupportedOperationException("Build Information cannot be created without specifying an overwriteMode");
  }

  public OctopusPackageVersionBuildInformation create(
      final OctopusPackageVersionBuildInformation resource, final OverwriteMode overWriteMode) throws IOException {
    final Map<String, List<String>> queryParams = new HashMap<>();
    queryParams.put("overwriteMode", singletonList(overWriteMode.toString()));
    return client.post(new RequestEndpoint(rootPath, queryParams), resource,
        OctopusPackageVersionBuildInformation.class);
  }

  @Override
  public OctopusPackageVersionBuildInformation update(final OctopusPackageVersionBuildInformation resource) {
    throw new UnsupportedOperationException(
        "Build Information cannot be updated - it must be re-created with " + "overwriteMode=overwrite");
  }
}
