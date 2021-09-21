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

package com.octopus.sdk.operations;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CommandBody;
import com.octopus.sdk.model.commands.CreateDeploymentCommandParameters;
import com.octopus.sdk.support.TestHelpers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class ExecutionsCreateApiTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);

  @Test
  public void hitsReportedEndpointReceivedFromSpace() throws IOException {

    final Map<String, String> commandLinks = new HashMap<>();
    final String commandLink = "/api/createDeploymentLink";
    commandLinks.put("ExecutionsCreateApiDeploymentCreate", commandLink);

    final CreateDeploymentCommandParameters parameters =
        new CreateDeploymentCommandParameters("MyProject", singletonList("dev"), "1.0.0");
    final CommandBody<CreateDeploymentCommandParameters> body =
        new CommandBody<>("TheSpace", parameters);
    final String returnedDeploymentId = "DeploymentId";

    when(mockClient.post(any(), eq(body), eq(String.class))).thenReturn(returnedDeploymentId);
    when(mockClient.getRootDocument()).thenReturn(TestHelpers.rootDocWithLinks(commandLinks));

    final String deploymentId = ExecutionsCreateApi.createDeployment(mockClient, body);

    assertThat(deploymentId).isEqualTo(returnedDeploymentId);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(commandLink);
  }

  @Test
  public void hitsReportedEndpointWhenCreatingRelease() throws IOException {
    final Map<String, String> rootDocLinks = new HashMap<>();
    final String commandLink = "/api/createReleaseLink";
    rootDocLinks.put("ReleasesCreateApiReleaseCreate", commandLink);

    final CreateReleaseCommandParameters parameters =
        new CreateReleaseCommandParameters("TheProject", "1.0.0");
    final CommandBody<CreateReleaseCommandParameters> body =
        new CommandBody<>("theSpace", parameters);
    final String releaseIdToReturn = "releaseId";

    when(mockClient.post(any(), eq(body), eq(String.class))).thenReturn(releaseIdToReturn);
    when(mockClient.getRootDocument()).thenReturn(TestHelpers.rootDocWithLinks(rootDocLinks));

    final String releaseId = ExecutionsCreateApi.createRelease(mockClient, body);

    assertThat(releaseId).isEqualTo(releaseIdToReturn);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(commandLink);
  }
}
