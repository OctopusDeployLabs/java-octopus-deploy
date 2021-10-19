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

import static com.octopus.sdk.http.RequestEndpoint.queryMapFromString;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.exceptions.OctopusRequestException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.sdk.support.TestHelpers;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class BuildInformationUploaderTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final SpaceHome mockSpaceHome = mock(SpaceHome.class);
  private final String existingSpaceId = "TheSpace-Id";
  private final String buildInfoLink = "api/build-information";

  private Map<String, String> createSpaceHomeLinks() {
    final Map<String, String> result = new HashMap<>();
    result.put("BuildInformation", buildInfoLink);
    return result;
  }

  @BeforeEach
  public void setup() throws IOException {
    // Setup Client to appear that a single space exists:
    final SpaceHome spaceHome = new SpaceHome(createSpaceHomeLinks());
    when(mockClient.supportsSpaces()).thenReturn(true);
    when(mockClient.getRootDocument()).thenReturn(TestHelpers.defaultRootDoc());

    final SpaceOverviewWithLinks spaceOverview =
        new SpaceOverviewWithLinks("MySpace", Collections.emptySet());
    spaceOverview.setLinks(singletonMap("SpaceHome", "/api/" + existingSpaceId));

    when(mockClient.get(RequestEndpoint.fromPath("/api"), RootDocument.class))
        .thenReturn(TestHelpers.defaultRootDoc());
    when(mockClient.get(
            RequestEndpoint.fromPath("/api/spaces/" + existingSpaceId),
            SpaceOverviewWithLinks.class))
        .thenReturn(spaceOverview);
    when(mockClient.get(RequestEndpoint.fromPath("/api/" + existingSpaceId), SpaceHome.class))
        .thenReturn(spaceHome);
  }

  @Test
  public void buildInformationIsPostedToCorrectEndpointWithQueryParams() throws IOException {
    final Commit commit = new Commit("12345", "SomeWorkPerformed");
    final BuildInformationUploaderContext context =
        new BuildInformationUploaderContextBuilder()
            .withBuildEnvironment("Environment")
            .withBuildUrl(new URL("http://buildServer.com/5"))
            .withBuildNumber("16")
            .withSpaceIdOrName(existingSpaceId)
            .withPackageId("myPackage.app")
            .withPackageVersion("1.0")
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withCommits(singletonList(commit))
            .withVcsCommitNumber("12345")
            .withVcsType("git")
            .withVcsRoot("vcsRoot")
            .build();

    final OctopusPackageVersionBuildInformationMappedResource response =
        mock(OctopusPackageVersionBuildInformationMappedResource.class);
    when(response.getId()).thenReturn("ObjectId");
    when(mockClient.post(any(), any(), any())).thenReturn(response);

    final BuildInformationUploader uploader = new BuildInformationUploader(mockClient);

    final String result = uploader.execute(context);
    assertThat(result).isEqualTo(response.getId());

    final ArgumentCaptor<RequestEndpoint> requestEndpointCaptor =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    final ArgumentCaptor<OctopusPackageVersionBuildInformation> buildInfoCaptor =
        ArgumentCaptor.forClass(OctopusPackageVersionBuildInformation.class);
    verify(mockClient, times(1))
        .post(
            requestEndpointCaptor.capture(),
            buildInfoCaptor.capture(),
            eq(OctopusPackageVersionBuildInformationMappedResource.class));
    assertThat(requestEndpointCaptor.getValue().getPath()).isEqualTo(buildInfoLink);
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().keySet())
        .containsExactly("overwriteMode");
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().values())
        .containsExactly(singletonList(OverwriteMode.OverwriteExisting.toString()));

    final BuildInformationResource transmittedBuildInfo =
        buildInfoCaptor.getValue().getBuildInformation();
    assertThat(buildInfoCaptor.getValue().getVersion()).isEqualTo(context.getPackageVersion());
    assertThat(buildInfoCaptor.getValue().getPackageId()).isEqualTo(context.getPackageId());
    assertThat(transmittedBuildInfo.getBuildEnvironment()).isEqualTo(context.getBuildEnvironment());
    assertThat(transmittedBuildInfo.getVcsRoot()).isEqualTo(context.getVcsRoot().get());
    assertThat(transmittedBuildInfo.getVcsType()).isEqualTo(context.getVcsType().get());
    assertThat(transmittedBuildInfo.getBuildUrl())
        .isEqualTo(context.getBuildUrl().get().toString());
    assertThat(transmittedBuildInfo.getCommits()).hasSize(1);
  }

  @Test
  public void exceptionIsThrownIfUnableToFindAMatchingSpace() throws IOException {
    when(mockClient.get(eq(RequestEndpoint.fromPath("/api/spaces/NonexistentSpace")), any()))
        .thenThrow(new OctopusRequestException(404, "No Resource"));

    // return NO spaces matching the supplied name
    when(mockClient.get(
            eq(
                new RequestEndpoint(
                    "/api/spaces", queryMapFromString("partialName=NonexistentSpace"))),
            any()))
        .thenReturn(new SpaceOverviewPaginatedCollection(emptyMap(), 0, 30, 1, 1, emptyList()));

    final BuildInformationUploaderContextBuilder buildInformationUploaderContextBuilder =
        new BuildInformationUploaderContextBuilder()
            .withBuildEnvironment("Environment")
            .withBuildUrl(new URL("http://teamcityServer/buildid"))
            .withBuildNumber("16")
            .withSpaceIdOrName("NonexistentSpace")
            .withPackageId("myPackage.app")
            .withPackageVersion("1.0")
            .withCommits(Collections.emptyList())
            .withOverwriteMode(OverwriteMode.OverwriteExisting);

    final BuildInformationUploader uploader = new BuildInformationUploader(mockClient);

    assertThatThrownBy(() -> uploader.execute(buildInformationUploaderContextBuilder.build()))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageStartingWith("No spaces exist with an Id or Name of");
  }

  @Test
  public void missingBuildUrlPostsNullUrlToServer() throws IOException {
    final String buildInfoLink = "/api/buildInfoLink";
    when(mockSpaceHome.getBuildInformationLink()).thenReturn(buildInfoLink);

    final BuildInformationUploaderContext context =
        new BuildInformationUploaderContextBuilder()
            .withBuildEnvironment("Environment")
            .withBuildUrl(null)
            .withBuildNumber("16")
            .withSpaceIdOrName("TheSpace-Id")
            .withPackageId("myPackage.app")
            .withPackageVersion("1.0")
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withCommits(emptyList())
            .withVcsCommitNumber("12345")
            .withVcsType("git")
            .withVcsRoot("vcsRoot")
            .build();

    final OctopusPackageVersionBuildInformationMappedResource response =
        mock(OctopusPackageVersionBuildInformationMappedResource.class);
    when(response.getId()).thenReturn("ObjectId");
    when(mockClient.post(any(), any(), any())).thenReturn(response);

    final BuildInformationUploader uploader = new BuildInformationUploader(mockClient);

    uploader.execute(context);

    final ArgumentCaptor<OctopusPackageVersionBuildInformation> buildInfoCaptor =
        ArgumentCaptor.forClass(OctopusPackageVersionBuildInformation.class);
    verify(mockClient, times(1))
        .post(
            any(),
            buildInfoCaptor.capture(),
            eq(OctopusPackageVersionBuildInformationMappedResource.class));

    assertThat(buildInfoCaptor.getValue().getBuildInformation().getBuildUrl()).isNull();
  }
}
