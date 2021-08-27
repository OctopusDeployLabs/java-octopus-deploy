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

public class BuildInformationUploader {

  private final OctopusClient client;

  public BuildInformationUploader(final OctopusClient client) {
    this.client = client;
  }

  public boolean upload(final BuildInformationUploaderContext buildInformationUploaderContext)
      throws IOException {
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome;
    if (buildInformationUploaderContext.getSpaceName().isPresent()) {
      spaceHome = spaceHomeApi.getByName(buildInformationUploaderContext.getSpaceName().get());
    } else {
      spaceHome = spaceHomeApi.getDefault();
    }

    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    uploadToSpace(buildInformationUploaderContext, buildInfoApi);

    return true;
  }

  private void uploadToSpace(
      final BuildInformationUploaderContext buildInformationUploaderContext,
      final BuildInformationApi buildInfoApi)
      throws IOException {
    final BuildInformationResource buildInfo = createFrom(buildInformationUploaderContext);
    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withVersion(buildInformationUploaderContext.getPackageVersion());
    resource.withBuildInformation(buildInfo);

    for (final String packageId : buildInformationUploaderContext.getPackageIds()) {
      resource.withPackageId(packageId);
      buildInfoApi.create(resource, buildInformationUploaderContext.getOverwriteMode());
    }
  }

  private BuildInformationResource createFrom(
      final BuildInformationUploaderContext buildInformationUploaderContext) {
    final BuildInformationResource resource = new BuildInformationResource();
    resource
        .buildNumber(buildInformationUploaderContext.getBuildNumber())
        .buildUrl(buildInformationUploaderContext.getBuildUrl().toString())
        .buildEnvironment(buildInformationUploaderContext.getBuildEnvironment())
        .branch(buildInformationUploaderContext.getBranch())
        .vcsRoot(buildInformationUploaderContext.getVcsRoot())
        .vcsCommitNumber(buildInformationUploaderContext.getVcsCommitNumber())
        .vcsType(buildInformationUploaderContext.getVcsType())
        .commits(
            buildInformationUploaderContext.getCommits().stream()
                .map(BuildInformationUploader::from)
                .collect(Collectors.toList()));

    return resource;
  }

  private static CommitDetails from(final Commit commit) {
    final CommitDetails result = new CommitDetails();
    result.comment(commit.Comment);
    result.id(commit.Id);

    return result;
  }
}
