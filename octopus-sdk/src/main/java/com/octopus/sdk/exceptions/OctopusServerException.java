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

import com.octopus.sdk.model.ErrorResponse;

public class OctopusServerException extends OctopusRequestException {
  private final ErrorResponse errorResponse;

  public OctopusServerException(final int statusCode, final ErrorResponse errorResponse) {
    super(statusCode);
    this.errorResponse = errorResponse;
  }

  @Override
  public String getMessage() {
    if (errorResponse.getErrors().isEmpty()) {
      return errorResponse.getErrorMessage();
    } else {
      return String.join("\n", errorResponse.getErrors());
    }
  }

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }
}
