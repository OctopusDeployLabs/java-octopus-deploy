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

import com.octopus.sdk.api.OverwriteMode;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public class BuildInformationUploaderContext {
  private final String buildEnvironment;
  private final String branch;
  private final String buildNumber;
  private final URL buildUrl;
  private final String vcsType;
  private final String vcsRoot;
  private final String vcsCommitNumber;

  private final List<Commit> commits;

  private final Optional<String> spaceName;
  private final List<String> packageIds;
  private final String packageVersion;

  private final OverwriteMode overwriteMode;

  public BuildInformationUploaderContext(
      final String buildEnvironment,
      final String branch,
      final String buildNumber,
      final URL buildUrl,
      final String vcsType,
      final String vcsRoot,
      final String vcsCommitNumber,
      final List<Commit> commits,
      final Optional<String> spaceName,
      final List<String> packageIds,
      final String packageVersion,
      final OverwriteMode overwriteMode) {
    this.buildEnvironment = buildEnvironment;
    this.branch = branch;
    this.buildNumber = buildNumber;
    this.buildUrl = buildUrl;
    this.vcsType = vcsType;
    this.vcsRoot = vcsRoot;
    this.vcsCommitNumber = vcsCommitNumber;
    this.commits = commits;
    this.spaceName = spaceName;
    this.packageIds = packageIds;
    this.packageVersion = packageVersion;
    this.overwriteMode = overwriteMode;
  }

  public String getBuildEnvironment() {
    return buildEnvironment;
  }

  public String getBranch() {
    return branch;
  }

  public String getBuildNumber() {
    return buildNumber;
  }

  public URL getBuildUrl() {
    return buildUrl;
  }

  public String getVcsType() {
    return vcsType;
  }

  public String getVcsRoot() {
    return vcsRoot;
  }

  public String getVcsCommitNumber() {
    return vcsCommitNumber;
  }

  public List<Commit> getCommits() {
    return commits;
  }

  public Optional<String> getSpaceName() {
    return spaceName;
  }

  public List<String> getPackageIds() {
    return packageIds;
  }

  public String getPackageVersion() {
    return packageVersion;
  }

  public OverwriteMode getOverwriteMode() {
    return overwriteMode;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", BuildInformationUploaderContext.class.getSimpleName() + "[", "]")
        .add("buildEnvironment='" + buildEnvironment + "'")
        .add("branch='" + branch + "'")
        .add("buildNumber='" + buildNumber + "'")
        .add("buildUrl=" + buildUrl)
        .add("vcsType='" + vcsType + "'")
        .add("vcsRoot='" + vcsRoot + "'")
        .add("vcsCommitNumber='" + vcsCommitNumber + "'")
        .add("commits=" + commits)
        .add("spaceName='" + spaceName + "'")
        .add("packageIds=" + packageIds)
        .add("packageVersion='" + packageVersion + "'")
        .add("overwriteMode=" + overwriteMode)
        .toString();
  }
}
