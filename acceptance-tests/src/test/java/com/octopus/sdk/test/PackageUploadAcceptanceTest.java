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

import com.google.common.collect.Sets;
import com.octopus.sdk.api.PackagesApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.OctopusClientFactory;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PackageUploadAcceptanceTest extends BaseAcceptanceTest {

  @Test
  public void fileCanBeUploadedAndResponseContainsExpectedSize(@TempDir final Path testDir) throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName("ProjectTestSpace");
    toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));
    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);
    try {

      final SpaceHome spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);

      final Path packagePath = Files.writeString(testDir.resolve("package.1.2.3.zip"), "FileContent",
          StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);

      final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

      final PackageFromBuiltInFeedResource result = packagesApi.create(packagePath.toFile());

      assertThat(result.getPackageSizeBytes()).isEqualTo(packagePath.toFile().length());
      assertThat(result.getFileExtension()).isEqualTo("." + FilenameUtils.getExtension(packagePath.toString()));
    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }

  @Test
  public void creatingSameFileTwiceThrowsException(@TempDir final Path testDir) throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName("ProjectTestSpace");
    toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));
    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);
    try {

      final SpaceHome spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);

      final Path packagePath = Files.writeString(testDir.resolve("package.1.2.3.zip"), "FileContent",
          StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);

      final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

      packagesApi.create(packagePath.toFile());
      assertThatThrownBy(() -> packagesApi.create(packagePath.toFile())).isInstanceOf(HttpException.class);

    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }

  @Test
  public void canUpdateAGivenPackageWithANewOneWithSameNameAndGetNewHash(@TempDir final Path testDir)
      throws IOException {
    final OctopusClient client =
        OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);

    final SpacesOverviewApi spacesOverviewApi = SpacesOverviewApi.create(client);
    final UsersApi users = UsersApi.create(client);

    final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
    toCreate.setName("ProjectTestSpace");
    toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));
    final SpaceOverviewWithLinks createdSpace = spacesOverviewApi.create(toCreate);
    try {

      final SpaceHome spaceHome =
          client.get(RequestEndpoint.fromPath(createdSpace.getSpaceHomeLink()), SpaceHome.class);

      final String filename = "package.1.2.3.zip";

      final Path packagePath = Files.writeString(testDir.resolve(filename), "FileContent",
          StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);

      final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

      final PackageFromBuiltInFeedResource initialResult = packagesApi.create(packagePath.toFile());

      final Path newPackagePath = Files.writeString(testDir.resolve(filename), "DifferentContent",
          StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      final PackageFromBuiltInFeedResource updateResult = packagesApi.update(newPackagePath.toFile());

      assertThat(updateResult.getHash()).isNotEqualTo(initialResult.getHash());

    } finally {
      deleteSpaceValidly(spacesOverviewApi, createdSpace);
    }
  }
}
