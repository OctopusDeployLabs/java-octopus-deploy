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

package com.octopus.sdk.domain;

import com.google.common.reflect.TypeToken;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.runbook.RunbookParameters;
import com.octopus.sdk.model.runbook.RunbookResourceWithLinks;
import com.octopus.sdk.model.runbook.RunbookRunResource;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runbook {

  private final OctopusClient client;
  private final RunbookResourceWithLinks properties;

  public Runbook(final OctopusClient client, final RunbookResourceWithLinks properties) {
    this.client = client;
    this.properties = properties;
  }

  public RunbookResourceWithLinks getProperties() {
    return properties;
  }

  public List<RunbookRunResource> executeRunbook(final RunbookParameters parameters) throws IOException {
    final RunbookRunResource[] result = client.post(
        RequestEndpoint.fromPath(properties.getCreateRunbookRunLink()),
        parameters,
        RunbookRunResource[].class);

    return Arrays.asList(result);
  }
}
