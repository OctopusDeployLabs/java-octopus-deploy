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

package com.octopus.testsupport;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OctopusDeployServerFactory {

  private static final Logger LOG = LogManager.getLogger();
  private static final String USE_EXISTING_ENV_VAR_NAME = "OCTOPUS_SDK_AT_USE_EXISTING_SERVER";

  // Adjust these values if using a pre-running octopus server.
  private static final boolean DEFAULT_USE_EXISTING_SERVER = false;
  protected static String serverURL = "http://localhost:8065";
  protected static String apiKey = "API-D62EQ9I4EVET1E2LJUBKEHLNBYWMO3";

  public static OctopusDeployServer create() {
    final boolean useExistingServer =
        Optional.ofNullable(System.getenv(USE_EXISTING_ENV_VAR_NAME))
            .map(Boolean::parseBoolean)
            .orElse(DEFAULT_USE_EXISTING_SERVER);

    LOG.debug("Using an existing server = {}", useExistingServer);
    if (useExistingServer) {
      return new ExistingOctopusDeployServer();
    }

    try {
      final DockerisedOctopusDeployServer server =
          DockerisedOctopusDeployServer.createOctopusServer();
      serverURL = server.getOctopusUrl();
      apiKey = server.getApiKey();
      return server;
    } catch (final IOException e) {
      LOG.error("Failed to create dockerised Octopus Deploy server", e);
      throw new UncheckedIOException(e);
    }
  }
}
