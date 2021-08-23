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

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.api.PackagesApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;
import com.octopus.sdk.operations.pushpackage.PushPackageUploader;
import com.octopus.sdk.operations.pushpackage.PushPackageUploaderContext;
import com.octopus.sdk.operations.pushpackage.PushPackageUploaderContextBuilder;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class PushPackageUploaderAcceptanceTest extends BaseAcceptanceTest {

  private SpacesOverviewApi spacesOverviewApi;
  private OctopusClient client;
  private SpaceOverviewWithLinks createdSpace;
  private SpaceHome spaceHome;

  @BeforeEach
  public void localSetup() throws IOException {

    SpaceOverviewWithLinks toCreate = null;
    try {
      client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
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
  public void ensureOnePackageCanBeUploaded(@TempDir Path tempDir) throws IOException {
    final Path packageFile = tempDir.resolve("test.1.0.0.zip");
    Files.write(
        packageFile,
        "ArbitraryContent".getBytes(StandardCharsets.UTF_8),
        StandardOpenOption.CREATE);

    final PushPackageUploader uploader = PushPackageUploader.create(client);

    final PushPackageUploaderContext parameters =
        new PushPackageUploaderContextBuilder()
            .withSpaceName(createdSpace.getName())
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(packageFile.toFile())
            .build();

    final PackageFromBuiltInFeedResource result = uploader.upload(parameters);
    try {
      assertThat(result).isNotNull();
    } finally {
      final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);
      packagesApi.delete(result.getId());
    }
  }
}
