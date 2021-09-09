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

import com.octopus.sdk.api.UsersApi;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserAcceptanceTest extends BaseAcceptanceTest {

  private OctopusClient client;

  @Test
  public void throwsExceptionWhenQueryingForCurrentUserWhenNotAuthenticated() throws IOException {
    // No Api key is provided - so unable to get current user
    client = new OctopusClient(httpClient, new URL(serverURL));
    assertThatThrownBy(() ->  UsersApi.create(client)).isInstanceOf(HttpException.class);
  }

  @Test
  public void canGetCurrentUserWhenAuthenticated() throws IOException {
    client = new OctopusClient(httpClient, new URL(serverURL), apiKey);
    final UsersApi usersApi = UsersApi.create(client);

    assertThat(usersApi.getCurrentUser()).isNotNull();
  }
}
