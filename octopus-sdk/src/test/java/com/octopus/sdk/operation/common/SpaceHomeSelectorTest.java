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

package com.octopus.sdk.operation.common;

import static java.util.Collections.emptyMap;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.model.space.SpaceHome;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpaceHomeSelectorTest {

  private final SpaceHomeApi mockSpaceHomeApi = mock(SpaceHomeApi.class);
  private final SpaceHome defaultSpaceHome = new SpaceHome(emptyMap());
  private final SpaceHome specificSpaceHome = new SpaceHome(emptyMap());

  @BeforeEach
  public void setup() throws IOException {
    when(mockSpaceHomeApi.getByName(any())).thenReturn(specificSpaceHome);
    when(mockSpaceHomeApi.getDefault()).thenReturn(defaultSpaceHome);
  }

  @Test
  public void attemptsToGetDefaultSpaceIfNoNameIsSpecified() throws IOException {
    final SpaceHomeSelector spaceHomeSelector = new SpaceHomeSelector(mockSpaceHomeApi);

    spaceHomeSelector.getSpaceHome(Optional.empty());
    verify(mockSpaceHomeApi, times(1)).getDefault();
    verify(mockSpaceHomeApi, never()).getByName(any());
  }

  @Test
  public void attemptsToGetSpaceNameByNameIfNameSpecified() throws IOException {
    final SpaceHomeSelector spaceHomeSelector = new SpaceHomeSelector(mockSpaceHomeApi);
    final String spaceName = "spaceName";
    spaceHomeSelector.getSpaceHome(Optional.of(spaceName));
    verify(mockSpaceHomeApi, never()).getDefault();
    verify(mockSpaceHomeApi, times(1)).getByName(eq(spaceName));
  }
}
