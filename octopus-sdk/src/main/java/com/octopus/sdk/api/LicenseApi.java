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

package com.octopus.sdk.api;

import com.octopus.openapi.model.LicenseResource;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.RootDocument;

import java.io.IOException;

public class LicenseApi {

  private final OctopusClient client;

  public LicenseApi(final OctopusClient client) {
    this.client = client;
  }

  public boolean insertLicense(final String licenseText) throws IOException {
    final RootDocument rootDoc = client.getRootDocument();
    final String licenceLink = rootDoc.getCurrentLicenseLink();

    final LicenseResource input = new LicenseResource();
    input.setLicenseText(licenseText);
    final LicenseResource result =
        client.put(RequestEndpoint.fromPath(licenceLink), input, LicenseResource.class);

    return result.getLicenseText().equals(licenseText);
  }
}
