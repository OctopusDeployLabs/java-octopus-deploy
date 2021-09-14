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

package com.octopus.sdk.utils;

public class ApiKeyValidator {

  public static void validate(final String apiKeyValue) {
    final String VALIDITY_STATEMENT =
        "An API Key must be between 29 and 36 characters, and other than the 'API-' "
            + "prefix, must only contain (upper-case) alphanumeric characters: ";
    final String API_KEY_PREFIX = "API-";
    if (!apiKeyValue.startsWith(API_KEY_PREFIX)) {
      throw new IllegalArgumentException(
          VALIDITY_STATEMENT + " supplied key has an incorrect prefix");
    }

    int keyLength = apiKeyValue.length();
    if (keyLength < 29 || keyLength > 36) {
      throw new IllegalArgumentException(
          VALIDITY_STATEMENT + " supplied key has invalid length (" + keyLength + ")");
    }

    final String keyWithoutPrefix = apiKeyValue.substring(API_KEY_PREFIX.length());
    for (char c : keyWithoutPrefix.toCharArray()) {
      if (!Character.isDigit(c) && !Character.isUpperCase(c)) {
        throw new IllegalArgumentException(
            VALIDITY_STATEMENT + " supplied key contains invalid characters");
      }
    }
  }
}
