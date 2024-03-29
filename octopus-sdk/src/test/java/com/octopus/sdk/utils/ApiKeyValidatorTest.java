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

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class ApiKeyValidatorTest {

  @Test
  public void keyNotStartingWithAPIDashFails() {
    assertThatThrownBy(() -> ApiKeyValidator.validate("BLAH-1234567890ABCDEFGHIJKLMNOPQRS"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("supplied key has an incorrect prefix");
  }

  @Test
  public void keyWhichIsTooLongFails() {
    assertThatThrownBy(() -> ApiKeyValidator.validate("API-1234567890ABCDEFGHIJKLMNOPQRSTUVW"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("supplied key has invalid length");
  }

  @Test
  public void keyWhichIsTooShortFails() {
    assertThatThrownBy(() -> ApiKeyValidator.validate("API-1234567890ABCDEFGHIJKLMN"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("supplied key has invalid length");
  }

  @Test
  public void keyContainingNoAlphaNumericCharactersFails() {
    assertThatThrownBy(() -> ApiKeyValidator.validate("API-1234567890ABCDEFGHIJKLM-0"))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessageContaining("supplied key contains invalid characters");
  }

  @Test
  public void validKeyDoesNotThrow() {
    ApiKeyValidator.validate("API-1234567890ABCDEFGHIJKLMNO");
  }
}
