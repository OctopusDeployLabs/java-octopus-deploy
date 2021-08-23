/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.operations.buildinformation;

import com.octopus.openapi.model.CommitDetails;
import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.spaces.SpaceHome;

import java.io.IOException;
import java.util.stream.Collectors;

public class OctopusBuildInformationUploader {

  private final OctopusClient client;

  public OctopusBuildInformationUploader(final OctopusClient client) {
    this.client = client;
  }

  public boolean upload(final OctopusBuildInformation buildInformation) throws IOException {
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome = spaceHomeApi.getSpaceHome(buildInformation.getSpaceName());
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    uploadToSpace(buildInformation, buildInfoApi);

    return true;
  }

  private static BuildInformationResource createFrom(
      final OctopusBuildInformation buildInformation) {
    final BuildInformationResource resource = new BuildInformationResource();
    resource
        .buildNumber(buildInformation.getBuildNumber())
        .buildUrl(buildInformation.getBuildUrl().toString())
        .buildEnvironment(buildInformation.getBuildEnvironment())
        .branch(buildInformation.getBranch())
        .vcsRoot(buildInformation.getVcsRoot())
        .vcsCommitNumber(buildInformation.getVcsCommitNumber())
        .vcsType(buildInformation.getVcsType())
        .commits(
            buildInformation.getCommits().stream()
                .map(OctopusBuildInformationUploader::from)
                .collect(Collectors.toList()));

    return resource;
  }

  private static void uploadToSpace(
      final OctopusBuildInformation buildInformation, final BuildInformationApi buildInfoApi)
      throws IOException {
    final BuildInformationResource buildInfo = createFrom(buildInformation);
    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withVersion(buildInformation.getPackageVersion());
    resource.withBuildInformation(buildInfo);

    for (final String packageId : buildInformation.getPackageIds()) {
      resource.withPackageId(packageId);
      buildInfoApi.create(resource, buildInformation.getOverwriteMode());
    }
  }

  public static CommitDetails from(final Commit commit) {
    final CommitDetails result = new CommitDetails();
    result.comment(commit.Comment);
    result.id(commit.Id);

    return result;
  }
}
