/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.operations.pushpackage;

import com.octopus.sdk.api.PackagesApi;
import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.operations.ResourceUploader;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PushPackageUploader extends ResourceUploader {
  private static final Logger LOG = LogManager.getLogger();

  private final PushPackageParameters parameters;

  public PushPackageUploader(final OctopusClient client, final PushPackageParameters parameters) {
    super(client);
    this.parameters = parameters;
  }

  @Override
  public boolean upload() throws IOException {
    LOG.debug("Uploading packages to {}", parameters.getSpaceName());
    final SpaceHomeApi spaceHomeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome = spaceHomeApi.getSpaceHome(parameters.getSpaceName());
    final PackagesApi packagesApi = PackagesApi.create(client, spaceHome);

    parameters
        .getPackageFilenames()
        .forEach(
            f -> {
              try {
                LOG.debug("Uploading {}", f.getName());
                packagesApi.uploadPackage(f, parameters.getOverwriteMode());
              } catch (IOException e) {
                LOG.error("Failed to upload {}", f.getName());
                LOG.error(e);
              }
            });

    return true;
  }
}
