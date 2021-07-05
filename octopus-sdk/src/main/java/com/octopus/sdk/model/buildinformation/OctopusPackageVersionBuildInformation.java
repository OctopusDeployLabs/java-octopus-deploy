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

package com.octopus.sdk.model.buildinformation;

import com.octopus.sdk.model.BaseResource;

import com.google.gson.annotations.SerializedName;

public class OctopusPackageVersionBuildInformation extends BaseResource {

  @SerializedName("PackageId")
  private String packageId = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("OctopusBuildInformation")
  private BuildInformationResource buildInformation = null;

  public OctopusPackageVersionBuildInformation() {}

  public OctopusPackageVersionBuildInformation withPackageId(final String packageId) {
    this.packageId = packageId;
    return this;
  }

  public OctopusPackageVersionBuildInformation withVersion(final String version) {
    this.version = version;
    return this;
  }

  public OctopusPackageVersionBuildInformation withBuildInformation(
      final BuildInformationResource buildInformation) {
    this.buildInformation = buildInformation;
    return this;
  }

  public String getPackageId() {
    return packageId;
  }

  public String getVersion() {
    return version;
  }

  public BuildInformationResource getBuildInformation() {
    return buildInformation;
  }
}
