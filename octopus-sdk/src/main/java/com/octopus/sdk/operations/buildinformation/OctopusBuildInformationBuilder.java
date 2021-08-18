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
package com.octopus.sdk.operations.buildinformation;

import static java.util.Collections.emptyList;

import com.octopus.sdk.api.OverwriteMode;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.google.common.base.Preconditions;

public class OctopusBuildInformationBuilder {

  private String buildEnvironment;
  private String vcsType;
  private String vcsRoot;
  private String vcsCommitNumber;
  private String branch;
  private List<Commit> commits = emptyList();
  private URL teamCityServerUrl;
  private String buildId;
  private String buildNumber;

  private String spaceName;
  private List<String> packageIds = emptyList();
  private String packageVersion;
  private OverwriteMode overwriteMode;

  public OctopusBuildInformationBuilder withBuildEnvironment(final String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public OctopusBuildInformationBuilder withVcsType(final String vcsType) {
    this.vcsType = vcsType;
    return this;
  }

  public OctopusBuildInformationBuilder withVcsRoot(final String vcsRoot) {
    this.vcsRoot = vcsRoot;
    return this;
  }

  public OctopusBuildInformationBuilder withVcsCommitNumber(final String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  public OctopusBuildInformationBuilder withBranch(final String branch) {
    this.branch = branch;
    return this;
  }

  public OctopusBuildInformationBuilder withCommits(final List<Commit> commits) {
    this.commits = commits;
    return this;
  }

  public OctopusBuildInformationBuilder withBuildId(final String buildId) {
    this.buildId = buildId;
    return this;
  }

  public OctopusBuildInformationBuilder withBuildNumber(final String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  public OctopusBuildInformationBuilder withTeamCityServerUrl(final URL teamCityServerUrl) {
    this.teamCityServerUrl = teamCityServerUrl;
    return this;
  }

  public OctopusBuildInformationBuilder withSpaceName(final String spaceName) {
    this.spaceName = spaceName;
    return this;
  }

  public OctopusBuildInformationBuilder withPackageIds(final List<String> packageIds) {
    this.packageIds = packageIds;
    return this;
  }

  public OctopusBuildInformationBuilder withPackageVersion(final String packageVersion) {
    this.packageVersion = packageVersion;
    return this;
  }

  public OctopusBuildInformationBuilder withOverwriteMode(final OverwriteMode overwriteMode) {
    this.overwriteMode = overwriteMode;
    return this;
  }

  public OctopusBuildInformation build() throws MalformedURLException, URISyntaxException {
    Preconditions.checkNotNull(spaceName, "spaceName must be set (even if empty string).");
    Preconditions.checkNotNull(
        packageVersion, "packageVersion must be set on a build information object");
    Preconditions.checkNotNull(
        overwriteMode, "overwriteMode must be set on a build information object");

    return new OctopusBuildInformation(
        buildEnvironment,
        branch,
        buildNumber,
        new URL(teamCityServerUrl.toURI().resolve("/viewLog.html?buildId=" + buildId).toString()),
        vcsType,
        vcsRoot,
        vcsCommitNumber,
        commits,
        spaceName,
        packageIds,
        packageVersion,
        overwriteMode);
  }
}
