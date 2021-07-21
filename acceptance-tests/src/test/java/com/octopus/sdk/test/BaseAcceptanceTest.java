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

import com.octopus.sdk.dsl.OctopusDeployServer;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.Optional;

public class BaseAcceptanceTest {

  private static final String USE_EXISTING_ENV_VAR_NAME = "OCTOPUS_SDK_AT_USE_EXISTING_SERVER";

  //Adjust these values if running a pre-running octopus server.
  private static final boolean DEFAULT_USE_EXISTING_SERVER = true;
  protected static String serverURL = "http://localhost:8065";
  protected static String apiKey = "API-D62EQ9I4EVET1E2LJUBKEHLNBYWMO3";


  protected static OctopusDeployServer server;
  protected static final OkHttpClient httpClient = new OkHttpClient();

  @BeforeAll
  public static void setup() throws IOException {
    final boolean useExistingServer =
        Optional.ofNullable(System.getenv(USE_EXISTING_ENV_VAR_NAME)).map(Boolean::parseBoolean).orElse(DEFAULT_USE_EXISTING_SERVER);

    if (!useExistingServer) {
      server = OctopusDeployServer.createOctopusServer();
      serverURL = server.getOctopusUrl();
      apiKey = server.getApiKey();
    }
  }

  @AfterAll
  public static void tearDown() {
    if (server != null) {
      server.tearDown();
    }
  }
}
