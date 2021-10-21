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

package com.octopus.sdk.operation.buildinformation;

import com.octopus.openapi.model.CommitDetails;
import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.operation.SpaceScopedOperation;

import java.io.IOException;
import java.net.URL;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;

public class BuildInformationUploader
    extends SpaceScopedOperation<BuildInformationUploaderContext, String> {

  public BuildInformationUploader(final OctopusClient client) {
    super(client);
  }

  @Override
  public String performOperation(
      final SpaceHome spaceHome, final BuildInformationUploaderContext context) throws IOException {
    Preconditions.checkNotNull(context, "Attempted to upload build information with null context.");

    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final OctopusPackageVersionBuildInformationMappedResource result =
        uploadToSpace(context, buildInfoApi);

    return result.getId();
  }

  private OctopusPackageVersionBuildInformationMappedResource uploadToSpace(
      final BuildInformationUploaderContext context, final BuildInformationApi buildInfoApi)
      throws IOException {
    final BuildInformationResource buildInfo = createFrom(context);
    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withVersion(context.getPackageVersion());
    resource.withPackageId(context.getPackageId());
    resource.withBuildInformation(buildInfo);
    return buildInfoApi.create(resource, context.getOverwriteMode());
  }

  private BuildInformationResource createFrom(final BuildInformationUploaderContext context) {
    final BuildInformationResource resource = new BuildInformationResource();
    resource
        .buildNumber(context.getBuildNumber())
        .buildUrl(context.getBuildUrl().map(URL::toString).orElse(null))
        .buildEnvironment(context.getBuildEnvironment())
        .branch(context.getBranch().orElse(null))
        .vcsRoot(context.getVcsRoot().orElse(null))
        .vcsCommitNumber(context.getVcsCommitNumber().orElse(null))
        .vcsType(context.getVcsType().orElse(null))
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
