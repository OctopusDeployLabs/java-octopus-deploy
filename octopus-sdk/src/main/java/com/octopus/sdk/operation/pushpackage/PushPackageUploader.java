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

package com.octopus.sdk.operation.pushpackage;

import com.octopus.sdk.api.PackageApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.packages.PackageFromBuiltInFeedResource;
import com.octopus.sdk.model.space.SpaceHome;
import com.octopus.sdk.operation.SpaceScopedOperation;

import java.io.IOException;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PushPackageUploader
    extends SpaceScopedOperation<PushPackageUploaderContext, PackageFromBuiltInFeedResource> {
  private static final Logger LOG = LogManager.getLogger();

  public PushPackageUploader(final OctopusClient client) {
    super(client);
  }

  @Override
  public PackageFromBuiltInFeedResource performOperation(
      final SpaceHome spaceHome, final PushPackageUploaderContext context) throws IOException {
    Preconditions.checkNotNull(context, "Attempted to upload a package with null context.");
    final PackageApi packageApi = PackageApi.create(client, spaceHome);

    LOG.debug("Uploading {}", context.getFile());
    final PackageFromBuiltInFeedResource result =
        packageApi.uploadPackage(context.getFile(), context.getOverwriteMode());
    LOG.debug("Upload of {} complete.", context.getFile());

    return result;
  }
}
