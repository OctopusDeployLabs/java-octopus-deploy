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

package com.octopus.sdk.operations.common;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.model.spaces.SpaceHome;

import java.io.IOException;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpaceHomeSelector {

  private static final Logger LOG = LogManager.getLogger();

  private final SpaceHomeApi spaceHomeApi;

  public SpaceHomeSelector(final SpaceHomeApi spaceHomeApi) {
    this.spaceHomeApi = spaceHomeApi;
  }

  public SpaceHome getSpaceHome(final Optional<String> spaceName) throws IOException {
    if (spaceName.isPresent()) {
      LOG.debug("Accessing space '{}'", spaceName);
      return spaceHomeApi.getByName(spaceName.get());
    } else {
      LOG.debug("Accessing default space");
      return spaceHomeApi.getDefault();
    }
  }
}
