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

package com.octopus.sdk.operation;

import static java.util.Collections.emptySet;
import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.CreateDeploymentCommandBody;
import com.octopus.sdk.model.commands.CreateReleaseCommandBody;
import com.octopus.sdk.model.commands.ExecuteRunbookCommandBody;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;
import com.octopus.sdk.operation.executionapi.CreateDeployment;
import com.octopus.sdk.operation.executionapi.CreateRelease;
import com.octopus.sdk.operation.executionapi.ExecuteRunbook;
import com.octopus.sdk.operation.executionapi.ExecutionsCreateApi;
import com.octopus.sdk.support.TestHelpers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class ExecutionsCreateApiTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private SpaceHome spaceHome;
  private final String spaceHomeLink = "/api/Spaces-1";
  private final String createReleaseLink = "/api/Space-1/createRelease";
  private final String createDeploymentLink = "/api/Space-1/createDeployment";
  private final String executeRunbookLink = "/api/Space-1/executeRunbook";
  private final String responseBody = "responseBody";

  private ExecutionsCreateApi executionsCreateApi;

  @BeforeEach
  public void setup() throws IOException {
    final Map<String, String> spaceHomeLinks = new HashMap<>();
    spaceHomeLinks.put("ExecutionsCreateApiReleaseCreate", createReleaseLink);
    spaceHomeLinks.put("ExecutionsCreateApiDeploymentCreate", createDeploymentLink);
    spaceHomeLinks.put("ExecutionsCreateApiRunbookRunCreate", executeRunbookLink);

    spaceHome = new SpaceHome(spaceHomeLinks);
    executionsCreateApi = new ExecutionsCreateApi(mockClient, spaceHome);


    // Setup a 'real' space home and overview
    final SpaceOverviewWithLinks spaceOverview = new SpaceOverviewWithLinks("TheSpace", emptySet());
    spaceOverview.setLinks(singletonMap("SpaceHome", spaceHomeLink));

    when(mockClient.get(eq(RequestEndpoint.fromPath("/api/spaces/TheSpace")), any())).thenReturn(
        spaceOverview);
    when(mockClient.get(eq(RequestEndpoint.fromPath(spaceHomeLink)), any())).thenReturn(spaceHome);

    when(mockClient.post(any(), any(), eq(String.class))).thenReturn(responseBody);
    when(mockClient.supportsSpaces()).thenReturn(true);
    when(mockClient.getRootDocument()).thenReturn(TestHelpers.defaultRootDoc());
  }

  @Test
  public void hitsReportedEndpointWhenCreatingDeployment() throws IOException {
    final CreateDeploymentCommandBody body =
        new CreateDeploymentCommandBody("TheSpace", "MyProject", singletonList("dev"), "1.0.0");

    final String deploymentId = executionsCreateApi.createDeployment(body);

    assertThat(deploymentId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(createDeploymentLink);
  }

  @Test
  public void hitsReportedEndpointWhenCreatingRelease() throws IOException {
    final CreateReleaseCommandBody body =
        new CreateReleaseCommandBody("TheSpace", "TheProject", "1.0.0");

    final String releaseId = executionsCreateApi.createRelease(body);

    assertThat(releaseId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(createReleaseLink);
  }

  @Test
  public void hitsCorrectEndpointWithDataWhenExecutingRunbook() throws IOException {
    final ExecuteRunbookCommandBody body =
        new ExecuteRunbookCommandBody(
            "TheSpace", "projectName", singletonList("TheEnvironment"), "runbookName");

    final String returnedRunbookId = executionsCreateApi.executeRunbook(body);

    assertThat(returnedRunbookId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(executeRunbookLink);
  }

  @Test
  public void createReleaseWrapperInvokesCorrectEndpointWithType() throws IOException {


    final CreateReleaseCommandBody body =
        new CreateReleaseCommandBody("TheSpace", "TheProject", "1.0.0");

    final CreateRelease createRelease = new CreateRelease(mockClient);
    final String releaseId = createRelease.execute(body);

    assertThat(releaseId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(createReleaseLink);
  }

  @Test
  public void createDeploymentWrapperInvokesCorrectEndpointWithType() throws IOException {
    final CreateDeploymentCommandBody body =
        new CreateDeploymentCommandBody("TheSpace", "MyProject", singletonList("dev"), "1.0.0");

    final CreateDeployment createDeployment = new CreateDeployment(mockClient);
    final String deploymentId = createDeployment.execute(body);

    assertThat(deploymentId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(createDeploymentLink);
  }

  @Test
  public void executeRunbookWrapperInvokesCorrectEndpointWithType() throws IOException {
    final ExecuteRunbookCommandBody body =
        new ExecuteRunbookCommandBody(
            "TheSpace", "projectName", singletonList("TheEnvironment"), "runbookName");

    final ExecuteRunbook executeRunbook = new ExecuteRunbook(mockClient);
    final String returnedRunbookId = executeRunbook.execute(body);

    assertThat(returnedRunbookId).isEqualTo(responseBody);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(body), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(executeRunbookLink);
  }
}
