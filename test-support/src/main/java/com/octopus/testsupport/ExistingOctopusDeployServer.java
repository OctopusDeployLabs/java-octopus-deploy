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

public class ExistingOctopusDeployServer implements OctopusDeployServer {

  @Override
  public String getOctopusUrl() {
    final String serverUrl = System.getenv("OCTOPUS_SERVER_URL");
    if (serverUrl == null) {
      throw new RuntimeException("OCTOPUS_SERVER_URL env var has not been set");
    }
    return serverUrl;
  }

  @Override
  public String getApiKey() {
    final String apiKey = System.getenv("OCTOPUS_SERVER_API_KEY");
    if(apiKey == null) {
      throw new RuntimeException("OCTOPUS_SERVER_API_KEY env var has not been set");
    }
    return apiKey;
  }

  @Override
  public void close() {
  }

  @Override
  public int getPort() {
    return 8065;
  }
}
