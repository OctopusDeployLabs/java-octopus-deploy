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

package com.octopus.sdk.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.octopus.sdk.api.BuildInformationApi;
import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.buildinformation.BuildInformationResource;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformation;
import com.octopus.sdk.model.buildinformation.OctopusPackageVersionBuildInformationMappedResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuildInformationAcceptanceTest extends BaseAcceptanceTest {

  private SpacesOverviewApi spacesOverviewApi;
  private OctopusClient client;
  private SpaceOverviewWithLinks createdSpace;
  private SpaceHome spaceHome;

  private static final String initialBuildUrl = "http://localhost/myBuildUrl";

  @BeforeEach
  public void localSetup() throws IOException {

    SpaceOverviewWithLinks toCreate = null;
    try {
      client = OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);
      spacesOverviewApi = SpacesOverviewApi.create(client);
      final UsersApi users = UsersApi.create(client);

      toCreate = new SpaceOverviewWithLinks();
      toCreate.setName("ProjectTestSpace");
      toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));

      createdSpace = spacesOverviewApi.create(toCreate);
      spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);
    } catch (final Exception e) {
      deleteSpaceValidly(spacesOverviewApi, toCreate);
      spacesOverviewApi = null;
    }
  }

  @AfterEach
  public void cleanup() throws IOException {
    deleteSpaceValidly(spacesOverviewApi, createdSpace);
    spacesOverviewApi = null;
  }

  @Test
  public void canCreatBuildInformationOnServer() throws IOException {
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final BuildInformationResource buildInfo = createValidBuildInformation();

    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withPackageId("packageId");
    resource.withVersion("1.0");
    resource.withBuildInformation(buildInfo);

    final OctopusPackageVersionBuildInformationMappedResource response =
        buildInfoApi.create(resource, OverwriteMode.FailIfExists);
    assertThat(response).isNotNull();
    assertThat(response.getPackageId()).isEqualTo(resource.getPackageId());
    assertThat(response.getVersion()).isEqualTo(resource.getVersion());
    assertThat(response.getBuildEnvironment())
        .isEqualTo(resource.getBuildInformation().getBuildEnvironment());
    assertThat(response.getBuildNumber())
        .isEqualTo(resource.getBuildInformation().getBuildNumber());
    assertThat(response.getBuildUrl()).isEqualTo(resource.getBuildInformation().getBuildUrl());
    assertThat(response.getBranch()).isEqualTo(resource.getBuildInformation().getBranch());
    assertThat(response.getVcsType()).isEqualTo(resource.getBuildInformation().getVcsType());
    assertThat(response.getVcsCommitNumber())
        .isEqualTo(resource.getBuildInformation().getVcsCommitNumber());
    assertThat(response.getCommits()).containsAll(resource.getBuildInformation().getCommits());
  }

  @Test
  public void canOverwriteBuildInformationOnServer() throws IOException {
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final BuildInformationResource buildInfo = createValidBuildInformation();

    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withPackageId("packageId");
    resource.withVersion("1.0");
    resource.withBuildInformation(buildInfo);

    buildInfoApi.create(resource, OverwriteMode.FailIfExists);

    buildInfo.buildUrl("differentURL");

    final OctopusPackageVersionBuildInformationMappedResource response =
        buildInfoApi.create(resource, OverwriteMode.OverwriteExisting);
    assertThat(response.getBuildUrl()).isEqualTo("differentURL");
  }

  @Test
  public void willNotOverwriteServerContentIfIgnoreIsSet() throws IOException {
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final BuildInformationResource buildInfo = createValidBuildInformation();

    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withPackageId("packageId");
    resource.withVersion("1.0");
    resource.withBuildInformation(buildInfo);

    buildInfoApi.create(resource, OverwriteMode.FailIfExists);

    buildInfo.buildUrl("differentURL");

    final OctopusPackageVersionBuildInformationMappedResource response =
        buildInfoApi.create(resource, OverwriteMode.IgnoreIfExists);
    assertThat(response.getBuildUrl()).isEqualTo(initialBuildUrl);
  }

  @Test
  public void willFailIfOverWriteModeIsFailAndBuildInfoAlreadyExists() throws IOException {
    final BuildInformationApi buildInfoApi = BuildInformationApi.create(client, spaceHome);
    final BuildInformationResource buildInfo = createValidBuildInformation();

    final OctopusPackageVersionBuildInformation resource =
        new OctopusPackageVersionBuildInformation();
    resource.withPackageId("packageId");
    resource.withVersion("1.0");
    resource.withBuildInformation(buildInfo);

    buildInfoApi.create(resource, OverwriteMode.FailIfExists);

    buildInfo.buildUrl("differentURL");

    assertThatThrownBy(() -> buildInfoApi.create(resource, OverwriteMode.FailIfExists))
        .isInstanceOf(HttpException.class);
  }

  private BuildInformationResource createValidBuildInformation() {
    final BuildInformationResource buildInfo = new BuildInformationResource();
    buildInfo
        .buildEnvironment("TeamCity")
        .buildNumber("12345")
        .buildUrl(initialBuildUrl)
        .branch("ArbitraryBranch")
        .vcsType("git")
        .vcsRoot("https://github.com/OctopusDeploy/Octopus-TeamCity.git")
        .vcsCommitNumber("12345")
        .commits(Collections.emptyList());
    return buildInfo;
  }
}
