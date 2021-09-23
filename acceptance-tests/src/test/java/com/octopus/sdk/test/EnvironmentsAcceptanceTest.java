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

import com.octopus.sdk.api.EnvironmentsApi;
import com.octopus.sdk.model.environments.EnvironmentResource;
import com.octopus.sdk.model.environments.EnvironmentResourceWithLinks;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class EnvironmentsAcceptanceTest extends SpaceScopedAcceptanceTest {

  @Test
  public void canCreateANewEnvironment() throws IOException {
    final EnvironmentsApi environmentsApi = EnvironmentsApi.create(client, spaceHome);

    final EnvironmentResourceWithLinks environmentToCreate = new EnvironmentResourceWithLinks();
    environmentToCreate.setName("NewEnv");
    final EnvironmentResourceWithLinks createdEnvironment =
        environmentsApi.create(environmentToCreate);

    assertThat(createdEnvironment).isNotNull();

    final Optional<EnvironmentResourceWithLinks> foundEnvironment =
        environmentsApi.getById(createdEnvironment.getId());

    assertThat(foundEnvironment).isNotEmpty();

    // This cannot work due to the behaviour of OctopusServer
    // assertThat(foundEnvironment.get()).usingRecursiveComparison().isEqualTo(createdEnvironment);
    assertThat(foundEnvironment.get())
        .extracting(EnvironmentResource::getName, EnvironmentResource::getId)
        .containsExactly(createdEnvironment.getName(), createdEnvironment.getId());
  }

  @Test
  public void canQueryForAllEnvironments() throws IOException {}
}
