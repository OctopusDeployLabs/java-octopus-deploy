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

package com.octopus.sdk.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LinkHelpersTest {

  @Test
  public void strippingTemplatingLeavesJustPath() {
    final String input =
        "/api/Spaces-42/runbooks{/id}{?skip,take,ids,partialName,clone,projectIds}";

    final String output = LinkHelpers.getCleansedRawLink(input);

    assertThat(output).isEqualTo("/api/Spaces-42/runbooks");
  }

  @Test
  public void doesNotStringAnythingFromAPathOnlyInput() {
    final String input = "/api/Spaces-42/runbooks/Runbooks-1/runbookRunTemplate";

    final String output = LinkHelpers.getCleansedRawLink(input);

    assertThat(input).isEqualTo(output);
  }
}
