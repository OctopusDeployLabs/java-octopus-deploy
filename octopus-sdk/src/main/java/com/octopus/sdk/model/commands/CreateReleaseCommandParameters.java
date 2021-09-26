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

package com.octopus.sdk.model.commands;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class CreateReleaseCommandParameters implements TParameters {

  @SerializedName("projectIdOrName")
  private String projectIdOrName;

  @SerializedName("packageVersion")
  private String packageVersion;

  @SerializedName("gitCommit")
  private String gitCommit;

  @SerializedName("gitRef")
  private String gitRef;

  @SerializedName("releaseVersion")
  private String releaseVersion;

  @SerializedName("channelIdOrName")
  private String channelIdOrName;

  @SerializedName("packages")
  private List<String> packages;

  @SerializedName("packageFolder")
  private String packageFolder;

  @SerializedName("releaseNodes")
  private String releaseNotes;

  @SerializedName("releaseNotesFile")
  private String releaseNotesFile;

  @SerializedName("ignoreExisting")
  private boolean ignoreExisting;

  @SerializedName("ignoreChannelRules")
  private boolean ignoreChannelRules;

  @SerializedName("packagePrerelease")
  private String packagePrerelease;

  @SerializedName("whatIf")
  private boolean whatIf;

  @SerializedName("deployToEnvironmentIdsOrNames")
  private List<String> deployToEnvironmentIdsOrNames;

  public CreateReleaseCommandParameters(final String projectIdOrName, final String packageVersion) {
    Preconditions.checkNotNull(projectIdOrName, "projectIdOrName cannot be null");
    Preconditions.checkNotNull(packageVersion, "packageVersion cannot be null");
    this.projectIdOrName = projectIdOrName;
    this.packageVersion = packageVersion;
  }

  public void setProjectIdOrName(final String projectIdOrName) {
    Preconditions.checkNotNull(projectIdOrName, "projectIdOrName cannot be null");
    this.projectIdOrName = projectIdOrName;
  }

  public void setPackageVersion(final String packageVersion) {
    Preconditions.checkNotNull(packageVersion, "packageVersion cannot be null");
    this.packageVersion = packageVersion;
  }

  public void setGitCommit(final String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public void setGitRef(final String gitRef) {
    this.gitRef = gitRef;
  }

  public void setReleaseVersion(final String releaseVersion) {
    this.releaseVersion = releaseVersion;
  }

  public void setChannelIdOrName(final String channelIdOrName) {
    this.channelIdOrName = channelIdOrName;
  }

  public void setPackages(final List<String> packages) {
    this.packages = packages;
  }

  public void setPackageFolder(final String packageFolder) {
    this.packageFolder = packageFolder;
  }

  public void setReleaseNotes(final String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  public void setReleaseNotesFile(final String releaseNotesFile) {
    this.releaseNotesFile = releaseNotesFile;
  }

  public void setIgnoreExisting(final boolean ignoreExisting) {
    this.ignoreExisting = ignoreExisting;
  }

  public void setIgnoreChannelRules(final boolean ignoreChannelRules) {
    this.ignoreChannelRules = ignoreChannelRules;
  }

  public void setPackagePrerelease(final String packagePrerelease) {
    this.packagePrerelease = packagePrerelease;
  }

  public void setWhatIf(final boolean whatIf) {
    this.whatIf = whatIf;
  }

  public void setDeployToEnvironmentIdsOrNames(final List<String> deployToEnvironmentIdsOrNames) {
    this.deployToEnvironmentIdsOrNames = deployToEnvironmentIdsOrNames;
  }
}
