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

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.spaces.SpaceOverviewPaginatedCollection;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyMap;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class OctopusBuildInformationUploaderTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final Map<String, String> rootDocLinks = new HashMap<>();
  final RootDocument rootDoc =
      new RootDocument(
          "OctopusDeploy",
          "2021.1.7608",
          "3.0.0",
          "140fb147-7111-41bb-a0d9-b3839f68858e",
          true,
          rootDocLinks);

  @BeforeEach
  public void setup() {
    rootDocLinks.put("BuildInformation", "/api/arbitrary-path");
    rootDocLinks.put("Spaces", "/api/spaces");
  }

  @Test
  public void buildInformationIsPostedToCorrectEndpointWithQueryParams()
      throws IOException, URISyntaxException {
    final OctopusBuildInformationBuilder buildInformationBuilder =
        new OctopusBuildInformationBuilder()
            .withBuildEnvironment("Environment")
            .withTeamCityServerUrl(new URL("http://teamcityServer"))
            .withSpaceName("")
            .withPackageIds(singletonList("myPackage.app"))
            .withPackageVersion("1.0")
            .withOverwriteMode(OverwriteMode.OverwriteExisting);

    when(mockClient.defaultSpaceAvailable()).thenReturn(true);

    final OctopusBuildInformationUploader uploader =
        new OctopusBuildInformationUploader(mockClient);

    assertThat(uploader.upload(buildInformationBuilder.build())).isTrue();
    final ArgumentCaptor<RequestEndpoint> argCaptor =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient, times(1))
        .post(
            argCaptor.capture(),
            any(),
            eq(OctopusPackageVersionBuildInformationMappedResource.class));
    assertThat(argCaptor.getAllValues()).hasSize(1);
    assertThat(argCaptor.getValue().getPath()).isEqualTo("/api/arbitrary-path");
    assertThat(argCaptor.getValue().getQueryParameters().keySet()).containsExactly("overwriteMode");
    assertThat(argCaptor.getValue().getQueryParameters().values())
        .containsExactly(singletonList(OverwriteMode.OverwriteExisting.toString()));
  }

  @Test
  public void exceptionIsThrownIfSpaceNotSpecifiedAndDefaultSpaceNotSupported()
      throws MalformedURLException, URISyntaxException {
    final OctopusBuildInformationBuilder buildInformationBuilder =
        new OctopusBuildInformationBuilder()
            .withBuildEnvironment("Environment")
            .withTeamCityServerUrl(new URL("http://teamcityServer"))
            .withSpaceName("")
            .withPackageIds(singletonList("myPackage.app"))
            .withPackageVersion("1.0")
            .withOverwriteMode(OverwriteMode.OverwriteExisting);

    when(mockClient.defaultSpaceAvailable()).thenReturn(false);
    when(mockClient.getRootDocument()).thenReturn(rootDoc);

    final OctopusBuildInformationUploader uploader = new OctopusBuildInformationUploader(mockClient);

    assertThatThrownBy(() -> uploader.upload(buildInformationBuilder.build())).isInstanceOf(
        IllegalArgumentException.class);
  }

  @Test
  public void exceptionIsThrownIfSpaceDoesNotExist() throws IOException {
    final String nonexistentSpace = "NonExistentSpace";
    final SpaceOverviewWithLinks theSpace = new SpaceOverviewWithLinks();
    final Map<String, List<String>> queryParams = new HashMap<>();
    queryParams.put("partialName", singletonList(nonexistentSpace));
    theSpace.setName("Space Name");
    when(mockClient.getServerUrl()).thenReturn(new URL("http://mockedTestServer.com"));
    when(mockClient.supportsSpaces()).thenReturn(true);
    when(mockClient.getRootDocument()).thenReturn(rootDoc);
    when(mockClient.get(eq(new RequestEndpoint("/api/spaces", queryParams)), any()))
        .thenReturn(
            new SpaceOverviewPaginatedCollection(emptyMap(), 1, 1, 1, 0, singletonList(theSpace)));

    final OctopusBuildInformationBuilder buildInformationBuilder =
        new OctopusBuildInformationBuilder()
            .withBuildEnvironment("Environment")
            .withTeamCityServerUrl(new URL("http://teamcityServer"))
            .withSpaceName(nonexistentSpace)
            .withPackageIds(singletonList("myPackage.app"))
            .withPackageVersion("1.0")
            .withOverwriteMode(OverwriteMode.OverwriteExisting);

    final OctopusBuildInformationUploader uploader = new OctopusBuildInformationUploader(mockClient);
    assertThatThrownBy(() -> uploader.upload(buildInformationBuilder.build())).isInstanceOf(IllegalArgumentException.class);
  }
}
