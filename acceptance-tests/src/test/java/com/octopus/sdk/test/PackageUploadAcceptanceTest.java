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

import com.octopus.sdk.api.OverwriteMode;
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

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.google.common.collect.Sets;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class PackageUploadAcceptanceTest extends BaseAcceptanceTest {

  private static OctopusClient client;
  private static UsersApi users;

  private SpacesOverviewApi spacesOverviewApi;
  private SpaceOverviewWithLinks containingSpace;
  private SpaceHome spaceHome;

  @AfterEach
  public void cleanup() {
    if (containingSpace != null) {
      try {
        deleteSpaceValidly(spacesOverviewApi, containingSpace);
      } catch (IOException e) {
        throw new RuntimeException("Failed to cleanup spaces - this must be performed manually", e);
      }
    }
  }

  @BeforeEach
  public void localSetup() {
    try {
      client = OctopusClientFactory.createClientAt(httpClient, new URL(serverURL), apiKey);
      spacesOverviewApi = SpacesOverviewApi.create(client);
      users = UsersApi.create(client);

      final SpaceOverviewWithLinks toCreate = new SpaceOverviewWithLinks();
      toCreate.setName("ProjectTestSpace");
      toCreate.setSpaceManagersTeamMembers(Sets.newHashSet(users.getCurrentUser().getId()));
      containingSpace = spacesOverviewApi.create(toCreate);
      spaceHome =
          client.get(RequestEndpoint.fromPath(containingSpace.getSpaceHomeLink()), SpaceHome.class);
    } catch (final Exception e) {
      throw new RuntimeException("Unable to construct required dependencies for test.", e);
    }
  }

  @Test
  public void fileCanBeUploadedAndResponseContainsExpectedSize(@TempDir final Path testDir)
      throws IOException {
    final Path packagePath =
        Files.writeString(
            testDir.resolve("package.1.2.3.zip"),
            "FileContent",
            StandardOpenOption.CREATE_NEW,
            StandardOpenOption.WRITE);

    final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

    final PackageFromBuiltInFeedResource result =
        packagesApi.uploadPackage(packagePath.toFile(), OverwriteMode.OverwriteExisting);

    assertThat(result.getPackageSizeBytes()).isEqualTo(packagePath.toFile().length());
    assertThat(result.getFileExtension())
        .isEqualTo("." + FilenameUtils.getExtension(packagePath.toString()));
  }

  @Test
  public void overwritingFaildFailsIfConfiuredToFail(@TempDir final Path testDir)
      throws IOException {
    final Path packagePath =
        Files.writeString(
            testDir.resolve("package.1.2.3.zip"),
            "FileContent",
            StandardOpenOption.CREATE_NEW,
            StandardOpenOption.WRITE);

    final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

    packagesApi.uploadPackage(packagePath.toFile(), OverwriteMode.OverwriteExisting);
    assertThatThrownBy(
            () -> packagesApi.uploadPackage(packagePath.toFile(), OverwriteMode.FailIfExists))
        .isInstanceOf(HttpException.class);
  }

  @Test
  public void canOverwriteAnExistingPackage(@TempDir final Path testDir) throws IOException {

    final String filename = "package.1.2.3.zip";

    final Path packagePath =
        Files.writeString(
            testDir.resolve(filename),
            "FileContent",
            StandardOpenOption.CREATE_NEW,
            StandardOpenOption.WRITE);

    final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

    final PackageFromBuiltInFeedResource initialResult =
        packagesApi.uploadPackage(packagePath.toFile(), OverwriteMode.OverwriteExisting);

    final Path newPackagePath =
        Files.writeString(
            testDir.resolve(filename),
            "DifferentContent",
            StandardOpenOption.CREATE,
            StandardOpenOption.WRITE);

    final PackageFromBuiltInFeedResource updateResult =
        packagesApi.uploadPackage(newPackagePath.toFile(), OverwriteMode.OverwriteExisting);

    assertThat(updateResult.getHash()).isNotEqualTo(initialResult.getHash());
  }
}
