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

package com.octopus.sdk.http;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.AbstractMap;

import org.junit.jupiter.api.Test;

class RequestEndpointTest {

  @Test
  public void encodedPathDecodesIntoCorrectPathAndQueryItems() {
    final String input = "/api/path?keyOne=1&keyTwo=9";
    final RequestEndpoint endPoint = RequestEndpoint.fromPathWithQueryString(input);
    assertThat(endPoint.getPath()).isEqualTo("/api/path");
    assertThat(endPoint.getQueryParameters())
        .contains(
            new AbstractMap.SimpleEntry<>("keyOne", singletonList("1")),
            new AbstractMap.SimpleEntry<>("keyTwo", singletonList("9")));
  }

  @Test
  public void invalidPathWithQueryThrowsIllegalArgumentException() {
    final String input = "/api/inva?=&>lid"; // contains required and invalid chars
    assertThatThrownBy(() -> RequestEndpoint.fromPathWithQueryString(input))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Unable to construct a RequestEndpoint from '" + input + "'");
  }

  @Test
  public void nullPathWithQueryThrowsIllegalArgumentException() {
    assertThatThrownBy(() -> RequestEndpoint.fromPathWithQueryString(null))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Unable to construct a RequestEndpoint from 'null'");
  }

  @Test
  public void emptyPathWithQueryThrowsIllegalArgumentException() {
    assertThatThrownBy(() -> RequestEndpoint.fromPathWithQueryString(""))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Unable to construct a RequestEndpoint from ''");
  }

  @Test
  public void validPathWithNoQueryThrowsIllegalArgumentException() {
    final String input = "/api/invalid";
    assertThatThrownBy(() -> RequestEndpoint.fromPathWithQueryString(input))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Unable to construct a RequestEndpoint from '" + input + "'");
  }
}
