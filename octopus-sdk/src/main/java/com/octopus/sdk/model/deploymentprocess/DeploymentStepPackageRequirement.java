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

package com.octopus.sdk.model.deploymentprocess;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/** Gets or Sets DeploymentStepPackageRequirement */
@JsonAdapter(DeploymentStepPackageRequirement.Adapter.class)
public enum DeploymentStepPackageRequirement {
  LETOCTOPUSDECIDE("LetOctopusDecide"),

  BEFOREPACKAGEACQUISITION("BeforePackageAcquisition"),

  AFTERPACKAGEACQUISITION("AfterPackageAcquisition");

  private final String value;

  DeploymentStepPackageRequirement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeploymentStepPackageRequirement fromValue(String value) {
    for (DeploymentStepPackageRequirement b : DeploymentStepPackageRequirement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeploymentStepPackageRequirement> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final DeploymentStepPackageRequirement enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeploymentStepPackageRequirement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeploymentStepPackageRequirement.fromValue(value);
    }
  }
}
