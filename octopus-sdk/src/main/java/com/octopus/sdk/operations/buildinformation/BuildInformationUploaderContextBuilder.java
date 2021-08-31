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

import java.net.URL;
import java.util.List;
import java.util.Optional;

import com.google.common.base.Preconditions;

public class BuildInformationUploaderContextBuilder {
  private String buildEnvironment;
  private String buildNumber;
  private Optional<String> spaceName = Optional.empty();

  private Optional<URL> buildUrl = Optional.empty();
  private Optional<String> branch = Optional.empty();
  private Optional<String> vcsType = Optional.empty();
  private Optional<String> vcsRoot = Optional.empty();
  private Optional<String> vcsCommitNumber = Optional.empty();

  private List<Commit> commits;
  private String packageId;
  private String packageVersion;
  private OverwriteMode overwriteMode;

  public BuildInformationUploaderContextBuilder withBuildEnvironment(
      final String buildEnvironment) {
    this.buildEnvironment = buildEnvironment;
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsType(final String vcsType) {
    this.vcsType = Optional.ofNullable(vcsType);
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsRoot(final String vcsRoot) {
    this.vcsRoot = Optional.ofNullable(vcsRoot);
    return this;
  }

  public BuildInformationUploaderContextBuilder withVcsCommitNumber(final String vcsCommitNumber) {
    this.vcsCommitNumber = Optional.ofNullable(vcsCommitNumber);
    return this;
  }

  public BuildInformationUploaderContextBuilder withBranch(final String branch) {
    this.branch = Optional.ofNullable(branch);
    return this;
  }

  public BuildInformationUploaderContextBuilder withCommits(final List<Commit> commits) {
    this.commits = commits;
    return this;
  }

  public BuildInformationUploaderContextBuilder withBuildNumber(final String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  public BuildInformationUploaderContextBuilder withBuildUrl(final URL buildUrl) {
    this.buildUrl = Optional.ofNullable(buildUrl);
    return this;
  }

  public BuildInformationUploaderContextBuilder withSpaceName(final String spaceName) {
    this.spaceName = Optional.ofNullable(spaceName);
    return this;
  }

  public BuildInformationUploaderContextBuilder withPackageId(final String packageId) {
    this.packageId = packageId;
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

  public BuildInformationUploaderContext build() {
    Preconditions.checkNotNull(
        packageVersion, "packageVersion must be set on a build information object");
    Preconditions.checkNotNull(
        overwriteMode, "overwriteMode must be set on a build information object");
    Preconditions.checkNotNull(buildUrl, "buildUrl must be set on a build information object");

    // The "extra bit on the URL needs to be moved out of here.
    return new BuildInformationUploaderContext(
        buildEnvironment,
        branch,
        buildNumber,
        buildUrl,
        vcsType,
        vcsRoot,
        vcsCommitNumber,
        commits,
        spaceName,
        packageId,
        packageVersion,
        overwriteMode);
  }
}
