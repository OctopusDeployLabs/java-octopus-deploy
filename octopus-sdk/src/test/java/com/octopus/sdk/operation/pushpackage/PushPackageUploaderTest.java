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

package com.octopus.sdk.operation.pushpackage;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.sdk.support.TestHelpers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PushPackageUploaderTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final String existingSpaceId = "TheSpace-Id";

  private Map<String, String> createSpaceHomeLinks() {
    final Map<String, String> result = new HashMap<>();
    result.put("Packages", "api/arbitrary-path");
    result.put("PackageUpload", "api/upload-path");
    return result;
  }

  @Test
  public void sendsFileToSpecificSpace() throws IOException {
    final SpaceHome spaceHome = new SpaceHome(createSpaceHomeLinks());
    when(mockClient.supportsSpaces()).thenReturn(true);
    when(mockClient.getRootDocument()).thenReturn(TestHelpers.defaultRootDoc());

    final SpaceOverviewWithLinks spaceOverview = new SpaceOverviewWithLinks("MySpace", Collections.emptySet());
    spaceOverview.setLinks(singletonMap("SpaceHome", "/api/" + existingSpaceId));

    when(mockClient.get(RequestEndpoint.fromPath("/api"), RootDocument.class)).thenReturn(TestHelpers.defaultRootDoc());
    when(mockClient.get(RequestEndpoint.fromPath("/api/spaces/" + existingSpaceId), SpaceOverviewWithLinks.class)).thenReturn(spaceOverview);
    when(mockClient.get(RequestEndpoint.fromPath("/api/" + existingSpaceId), SpaceHome.class)).thenReturn(spaceHome);


    final PushPackageUploader uploader = new PushPackageUploader(mockClient);

    final PushPackageUploaderContext context =
        new PushPackageUploaderContextBuilder()
            .withSpaceIdOrName(existingSpaceId)
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(Paths.get("theFile.1.1.1.zip").toFile())
            .build();

    uploader.execute(context);

    final ArgumentCaptor<RequestEndpoint> requestEndpointCaptor =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    final ArgumentCaptor<File> fileCaptor = ArgumentCaptor.forClass(File.class);

    verify(mockClient, times(1))
        .postStream(
            requestEndpointCaptor.capture(),
            fileCaptor.capture(),
            eq(PackageFromBuiltInFeedResource.class));

    //assertThat(requestEndpointCaptor.getValue().getPath()).isEqualTo(pushPackageLink);
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().keySet())
        .containsOnly("overwriteMode");
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().get("overwriteMode"))
        .containsExactly(OverwriteMode.OverwriteExisting.name());
    assertThat(fileCaptor.getValue()).isEqualTo(context.getFile());
  }

  @Test
  public void exceptionIsThrownIfUnableToFindAMatchingSpace() {
    final String spaceName = "theSpace";
    final PushPackageUploaderContext context =
        new PushPackageUploaderContextBuilder()
            .withSpaceIdOrName(spaceName)
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(Paths.get("theFile.1.1.1.zip").toFile())
            .build();

    final PushPackageUploader uploader = new PushPackageUploader(mockClient);
    assertThatThrownBy(() -> uploader.execute(context))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
