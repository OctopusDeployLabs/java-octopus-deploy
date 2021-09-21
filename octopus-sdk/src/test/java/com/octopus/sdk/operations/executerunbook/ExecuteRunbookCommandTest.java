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

package com.octopus.sdk.operations.executerunbook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.commands.ExecuteRunbookCommandModel;
import com.octopus.sdk.model.commands.ExecuteRunbookCommandModelBuilder;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.common.SpaceHomeSelector;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class ExecuteRunbookCommandTest {

  private final OctopusClient mockClient = mock(OctopusClient.class);
  private final SpaceHomeSelector mockSpaceHomeSelector = mock(SpaceHomeSelector.class);

  @Test
  public void exceptionIsThrownIfAttemptToCreateWithNullClient() {
    assertThatThrownBy(() -> ExecuteRunbookCommand.create(null))
        .isInstanceOf(NullPointerException.class);
  }

  @Test
  public void exceptionIsThrownIfAttemptingToCreateRunbookRunWithNullContext() {
    final ExecuteRunbookCommand command =
        new ExecuteRunbookCommand(mockClient, mockSpaceHomeSelector);
    assertThatThrownBy(() -> command.execute(null)).isInstanceOf(NullPointerException.class);
  }

  @Test
  public void hitsReportedEndpointReceivedFromSpace() throws IOException {
    final Map<String, String> spaceHomeLinks = new HashMap<>();
    final String commandLink = "/api/runbookRunCreate";
    spaceHomeLinks.put("ExecutionsCreateApiRunbookRunCreate", commandLink);
    final ExecuteRunbookCommandModel model = new ExecuteRunbookCommandModelBuilder().build();
    final ExecuteRunbookCommandContext context =
        new ExecuteRunbookCommandContext(Optional.empty(), model);
    final String runbookId = "TheRunbookId";

    final SpaceHome spaceHome = new SpaceHome(spaceHomeLinks);
    when(mockSpaceHomeSelector.getSpaceHome(context.getSpaceName())).thenReturn(spaceHome);
    when(mockClient.post(any(), eq(model), eq(String.class))).thenReturn(runbookId);

    final ExecuteRunbookCommand command =
        new ExecuteRunbookCommand(mockClient, mockSpaceHomeSelector);
    final String returnedRunbookId = command.execute(context);

    assertThat(runbookId).isEqualTo(returnedRunbookId);
    final ArgumentCaptor<RequestEndpoint> requestedEndpoint =
        ArgumentCaptor.forClass(RequestEndpoint.class);
    verify(mockClient).post(requestedEndpoint.capture(), eq(model), eq(String.class));

    assertThat(requestedEndpoint.getValue().getPath()).isEqualTo(commandLink);
  }
}
