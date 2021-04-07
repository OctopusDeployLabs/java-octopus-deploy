// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReleaseUsageEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ReleaseUsage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseUsage {
  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_RELEASES = "Releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<ReleaseUsageEntry> releases = null;

  public ReleaseUsage projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public ReleaseUsage projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ReleaseUsage releases(List<ReleaseUsageEntry> releases) {

    this.releases = releases;
    return this;
  }

  public ReleaseUsage addReleasesItem(ReleaseUsageEntry releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<ReleaseUsageEntry>();
    }
    this.releases.add(releasesItem);
    return this;
  }

  /**
   * Get releases
   * @return releases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleaseUsageEntry> getReleases() {
    return releases;
  }

  public void setReleases(List<ReleaseUsageEntry> releases) {
    this.releases = releases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseUsage releaseUsage = (ReleaseUsage)o;
    return Objects.equals(this.projectId, releaseUsage.projectId) &&
        Objects.equals(this.projectName, releaseUsage.projectName) &&
        Objects.equals(this.releases, releaseUsage.releases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, releases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseUsage {\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
