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

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.space.SpaceHome;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class BuildInformationUploaderTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final SpaceHome mockSpaceHome = mock(SpaceHome.class);

  @Test
  public void buildInformationIsPostedToCorrectEndpointWithQueryParams() throws IOException {
    final String buildInfoLink = "/api/buildInfoLink";
    when(mockSpaceHome.getBuildInformationLink()).thenReturn(buildInfoLink);

    final Commit commit = new Commit("12345", "SomeWorkPerformed");
    final BuildInformationUploaderContext context =
        new BuildInformationUploaderContextBuilder()
            .withBuildEnvironment("Environment")
            .withBuildUrl(new URL("http://buildServer.com/5"))
            .withBuildNumber("16")
            .withSpaceIdOrName(null)
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
    final String spaceName = "theSpace";
    final BuildInformationUploaderContextBuilder buildInformationUploaderContextBuilder =
        new BuildInformationUploaderContextBuilder()
            .withBuildEnvironment("Environment")
            .withBuildUrl(new URL("http://teamcityServer/buildid"))
            .withBuildNumber("16")
            .withSpaceIdOrName(spaceName)
            .withPackageId("myPackage.app")
            .withPackageVersion("1.0")
            .withCommits(Collections.emptyList())
            .withOverwriteMode(OverwriteMode.OverwriteExisting);

    final Exception spaceHomeException = new IllegalArgumentException("No space exists");

    final BuildInformationUploader uploader = new BuildInformationUploader(mockClient);

    assertThatThrownBy(() -> uploader.execute(buildInformationUploaderContextBuilder.build()))
        .isEqualTo(spaceHomeException);
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
            .withSpaceIdOrName(null)
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
