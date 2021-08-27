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
package com.octopus.sdk.operations.buildinformation;

import static java.util.Collections.emptyList;

import com.octopus.sdk.api.OverwriteMode;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import com.google.common.base.Preconditions;

public class BuildInformationUploaderContextBuilder {

  private String buildEnvironment;
  private String vcsType;
  private String vcsRoot;
  private String vcsCommitNumber;
  private String branch;
  private List<Commit> commits = emptyList();
  private URL teamCityServerUrl;
  private String buildId;
  private String buildNumber;

  private Optional<String> spaceName = Optional.empty();
  private List<String> packageIds = emptyList();
  private String packageVersion;
  private OverwriteMode overwriteMode;

  public BuildInformationUploaderContextBuilder withBuildEnvironment(
      final String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsType(final String vcsType) {
    this.vcsType = vcsType;
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsRoot(final String vcsRoot) {
    this.vcsRoot = vcsRoot;
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsCommitNumber(final String vcsCommitNumber) {
    this.vcsCommitNumber = vcsCommitNumber;
    return this;
  }

  public BuildInformationUploaderContextBuilder withBranch(final String branch) {
    this.branch = branch;
    return this;
  }

  public BuildInformationUploaderContextBuilder withCommits(final List<Commit> commits) {
    this.commits = commits;
    return this;
  }

  public BuildInformationUploaderContextBuilder withBuildId(final String buildId) {
    this.buildId = buildId;
    return this;
  }

  public BuildInformationUploaderContextBuilder withBuildNumber(final String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  public BuildInformationUploaderContextBuilder withTeamCityServerUrl(final URL teamCityServerUrl) {
    this.teamCityServerUrl = teamCityServerUrl;
    return this;
  }

  public BuildInformationUploaderContextBuilder withSpaceName(final String spaceName) {
    this.spaceName = Optional.ofNullable(spaceName);
    return this;
  }

  public BuildInformationUploaderContextBuilder withPackageIds(final List<String> packageIds) {
    this.packageIds = packageIds;
    return this;
  }

  public BuildInformationUploaderContextBuilder withPackageVersion(final String packageVersion) {
    this.packageVersion = packageVersion;
    return this;
  }

  public BuildInformationUploaderContextBuilder withOverwriteMode(
      final OverwriteMode overwriteMode) {
    this.overwriteMode = overwriteMode;
    return this;
  }

  public BuildInformationUploaderContext build() throws MalformedURLException, URISyntaxException {
    Preconditions.checkNotNull(
        packageVersion, "packageVersion must be set on a build information object");
    Preconditions.checkNotNull(
        overwriteMode, "overwriteMode must be set on a build information object");

    return new BuildInformationUploaderContext(
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
