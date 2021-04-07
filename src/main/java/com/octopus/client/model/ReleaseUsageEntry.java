// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * ReleaseUsageEntry
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseUsageEntry {
  public static final String SERIALIZED_NAME_RELEASE_ID = "ReleaseId";
  @SerializedName(SERIALIZED_NAME_RELEASE_ID) private String releaseId;

  public static final String SERIALIZED_NAME_RELEASE_VERSION = "ReleaseVersion";
  @SerializedName(SERIALIZED_NAME_RELEASE_VERSION)
  private String releaseVersion;

  public ReleaseUsageEntry releaseId(String releaseId) {

    this.releaseId = releaseId;
    return this;
  }

  /**
   * Get releaseId
   * @return releaseId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) { this.releaseId = releaseId; }

  public ReleaseUsageEntry releaseVersion(String releaseVersion) {

    this.releaseVersion = releaseVersion;
    return this;
  }

  /**
   * Get releaseVersion
   * @return releaseVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseVersion() {
    return releaseVersion;
  }

  public void setReleaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseUsageEntry releaseUsageEntry = (ReleaseUsageEntry)o;
    return Objects.equals(this.releaseId, releaseUsageEntry.releaseId) &&
        Objects.equals(this.releaseVersion, releaseUsageEntry.releaseVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseId, releaseVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseUsageEntry {\n");
    sb.append("    releaseId: ")
        .append(toIndentedString(releaseId))
        .append("\n");
    sb.append("    releaseVersion: ")
        .append(toIndentedString(releaseVersion))
        .append("\n");
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
