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

import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.space.SpaceHome;

import java.io.IOException;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.RequestDefinition;

class BuildInformationApiTest extends BaseApiTest {

  @Test
  public void updatingBuildInformationThrowsUnsupportedException() {
    final SpaceHome spaceHome =
        new SpaceHome(singletonMap("BuildInformation", "api/arbitrary-path"));

    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    assertThatThrownBy(() -> buildInfoApi.update(null))
        .isInstanceOf(UnsupportedOperationException.class);
  }

  @Test
  public void creatingBuildInformationViaStandardCreateApiThrowsUnsupportedException() {
    final SpaceHome spaceHome =
        new SpaceHome(singletonMap("BuildInformation", "api/arbitrary-path"));

    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    assertThatThrownBy(() -> buildInfoApi.create(null))
        .isInstanceOf(UnsupportedOperationException.class);
  }

  @ParameterizedTest
  @EnumSource(OverwriteMode.class)
  public void creatingNewBuildInformationHitsCorrectEndpoint(final OverwriteMode mode)
      throws IOException {
    final SpaceHome spaceHome =
        new SpaceHome(
            singletonMap(
                "BuildInformation",
                "/api/Spaces-1/build-information{/id}{?packageId,filter,latest,skip,take,overwriteMode}"));
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);

    final BuildInformationResource buildInfo = createValidBuildInformation();
    final OctopusPackageVersionBuildInformation resourceToSend =
        new OctopusPackageVersionBuildInformation();
    resourceToSend.withBuildInformation(buildInfo);
    resourceToSend.withPackageId("mypackage.com");
    resourceToSend.withVersion("1.0");

    mockOctopusServer
        .when(request())
        .respond(response().withStatusCode(200).withBody(gson.toJson(buildResponse(buildInfo))));

    final OctopusPackageVersionBuildInformationMappedResource response =
        buildInfoApi.create(resourceToSend, mode);

    // check that the mockServer received a request with appropriateQueryParams etc.
    final RequestDefinition[] requestsReceivedAtServer =
        mockOctopusServer.retrieveRecordedRequests(request());
    assertThat(requestsReceivedAtServer.length).isEqualTo(1);
    assertThat(requestsReceivedAtServer[0]).isInstanceOf(HttpRequest.class);
    final HttpRequest request = (HttpRequest) requestsReceivedAtServer[0];
    assertThat(request.getPath().toString()).isEqualTo("/api/Spaces-1/build-information");
    assertThat(request.getQueryStringParameters().getValues("OverwriteMode"))
        .containsExactly(mode.toString());

    final OctopusPackageVersionBuildInformation capturedRequestBody =
        gson.fromJson(request.getBodyAsString(), OctopusPackageVersionBuildInformation.class);
    assertThat(capturedRequestBody).usingRecursiveComparison().isEqualTo(resourceToSend);
    assertThat(request.getMethod().toString()).isEqualTo("POST");

    assertThat(response).usingRecursiveComparison().isEqualTo(buildResponse(buildInfo));
  }

  private BuildInformationResource createValidBuildInformation() {
    final BuildInformationResource buildInfo = new BuildInformationResource();
    buildInfo
        .buildEnvironment("TeamCity")
        .buildNumber("12345")
        .buildUrl("http://teamcity:8111/buildURL")
        .branch("ArbitraryBranch")
        .vcsType("git")
        .vcsRoot("https://github.com/OctopusDeploy/Octopus-TeamCity.git")
        .vcsCommitNumber("12345")
        .commits(Collections.emptyList());
    return buildInfo;
  }

  private OctopusPackageVersionBuildInformationMappedResource buildResponse(
      final BuildInformationResource buildInfo) {
    final OctopusPackageVersionBuildInformationMappedResource result =
        new OctopusPackageVersionBuildInformationMappedResource();
    result
        .buildEnvironment(buildInfo.getBuildEnvironment())
        .buildNumber(buildInfo.getBuildNumber())
        .buildUrl(buildInfo.getBuildUrl())
        .branch(buildInfo.getBranch())
        .vcsType(buildInfo.getVcsType())
        .vcsRoot(buildInfo.getVcsRoot())
        .vcsCommitNumber(buildInfo.getVcsCommitNumber())
        .commits(buildInfo.getCommits())
        .packageId("ResponsePackageId")
        .version("1.0");

    return result;
  }
}
