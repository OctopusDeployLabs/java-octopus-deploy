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

package com.octopus.sdk.exceptions;

public class OctopusRequestException extends RuntimeException {

  private final int statusCode;

  public OctopusRequestException(final int statusCode, final String message) {
    super(message);
    this.statusCode = statusCode;
  }

  protected OctopusRequestException(final int statusCode) {
    super();
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return statusCode;
  }
}
