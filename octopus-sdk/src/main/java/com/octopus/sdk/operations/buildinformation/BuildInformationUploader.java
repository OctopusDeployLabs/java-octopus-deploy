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
import com.octopus.sdk.operations.common.BaseUploader;
import com.octopus.sdk.operations.common.SpaceHomeSelector;

import java.io.IOException;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;

public class BuildInformationUploader extends BaseUploader {

  public BuildInformationUploader(
      final OctopusClient client, final SpaceHomeSelector spaceHomeSelector) {
    super(client, spaceHomeSelector);
  }

  public static BuildInformationUploader create(final OctopusClient client) {
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHomeSelector spaceHomeSelector = new SpaceHomeSelector(spaceHomeApi);
    return new BuildInformationUploader(client, spaceHomeSelector);
  }

  public boolean upload(final BuildInformationUploaderContext context) throws IOException {
    Preconditions.checkNotNull(context, "Attempted to upload build information with null context.");

    final SpaceHome spaceHome = spaceHomeSelector.getSpaceHome(context.getSpaceName());
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    uploadToSpace(context, buildInfoApi);

    return true;
  }

  private void uploadToSpace(
      final BuildInformationUploaderContext context, final BuildInformationApi buildInfoApi)
      throws IOException {
    final BuildInformationResource buildInfo = createFrom(context);
    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withVersion(context.getPackageVersion());
    resource.withPackageId(context.getPackageId());
    resource.withBuildInformation(buildInfo);
    buildInfoApi.create(resource, context.getOverwriteMode());
  }

  private BuildInformationResource createFrom(final BuildInformationUploaderContext context) {
    final BuildInformationResource resource = new BuildInformationResource();
    resource
        .buildNumber(context.getBuildNumber())
        .buildUrl(context.getBuildUrl().toString())
        .buildEnvironment(context.getBuildEnvironment())
        .branch(context.getBranch())
        .vcsRoot(context.getVcsRoot())
        .vcsCommitNumber(context.getVcsCommitNumber())
        .vcsType(context.getVcsType())
        .commits(
            context.getCommits().stream()
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
