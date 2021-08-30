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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.api.OverwriteMode;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Optional;

import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.buildinformation.BuildInformationUploader;
import com.octopus.sdk.operations.buildinformation.BuildInformationUploaderContextBuilder;
import com.octopus.sdk.operations.common.SpaceHomeSelector;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class PushPackageUploaderTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final SpaceHome mockSpaceHome = mock(SpaceHome.class);
  private final SpaceHomeSelector mockSpaceHomeSelector = mock(SpaceHomeSelector.class);

  @Test
  public void sendsFileToDefaultSpace() throws IOException {
    final String pushPackageLink = "/api/pushPackages";
    when(mockSpaceHome.getPackageUploadLink()).thenReturn(pushPackageLink);
    when(mockSpaceHomeSelector.getSpaceHome(Optional.empty())).thenReturn(mockSpaceHome);

    final PushPackageUploader uploader = new PushPackageUploader(mockClient, mockSpaceHomeSelector);

    final PushPackageUploaderContext context =
        new PushPackageUploaderContextBuilder()
            .withSpaceName(null)
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(Paths.get("theFile.1.1.1.zip").toFile())
            .build();

    uploader.upload(context);
    verify(mockSpaceHomeSelector, times(1)).getSpaceHome(context.getSpaceName());

    final ArgumentCaptor<RequestEndpoint> requestEndpointCaptor = ArgumentCaptor.forClass(RequestEndpoint.class);
    final ArgumentCaptor<File> fileCaptor = ArgumentCaptor.forClass(File.class);

    verify(mockClient, times(1)).postStream(requestEndpointCaptor.capture(), fileCaptor.capture(), eq(
        PackageFromBuiltInFeedResource.class));

    assertThat(requestEndpointCaptor.getValue().getPath()).isEqualTo(pushPackageLink);
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().keySet()).containsOnly("overwriteMode");
    assertThat(requestEndpointCaptor.getValue().getQueryParameters().get("overwriteMode")).containsExactly(
        OverwriteMode.OverwriteExisting.name());
    assertThat(fileCaptor.getValue()).isEqualTo(context.getFile());
  }

  @Test
  public void exceptionIsThrownIfUnableToFindAMatchingSpace() throws IOException {
    final String spaceName = "theSpace";
    final PushPackageUploaderContext context =
        new PushPackageUploaderContextBuilder()
            .withSpaceName(spaceName)
            .withOverwriteMode(OverwriteMode.OverwriteExisting)
            .withFileToUpload(Paths.get("theFile.1.1.1.zip").toFile())
            .build();

    final Exception spaceHomeException = new IllegalArgumentException("No space exists");
    when(mockSpaceHomeSelector.getSpaceHome(any())).thenThrow(spaceHomeException);

    final PushPackageUploader uploader = new PushPackageUploader(mockClient, mockSpaceHomeSelector);

    assertThatThrownBy(() -> uploader.upload(context))
        .isEqualTo(spaceHomeException);
    verify(mockSpaceHomeSelector, times(1)).getSpaceHome(Optional.of(spaceName));
  }
}
