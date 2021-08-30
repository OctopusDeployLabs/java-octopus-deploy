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

package com.octopus.sdk.operations.pushpackage;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.RootDocument;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PushPackageUploaderTest {

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
  public void throwsExceptionIfRequestedSpaceDoesNotExist() {
    when(mockClient.defaultSpaceAvailable()).thenReturn(false);
    when(mockClient.getRootDocument()).thenReturn(rootDoc);

    final PushPackageUploader uploader = PushPackageUploader.create(mockClient);

    final PushPackageUploaderContext context =
        new PushPackageUploaderContextBuilder()
            .withSpaceName("ArbitrarySpace")
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(Paths.get("theFile.1.1.1.zip").toFile())
            .build();

    assertThatThrownBy(() -> uploader.upload(context)).isInstanceOf(IllegalArgumentException.class);
  }
}
