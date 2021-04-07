// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PackageNotesResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * PackageNote
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageNote {
  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES) private PackageNotesResult notes;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "PackageId";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID) private String packageId;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public PackageNote feedId(String feedId) {

    this.feedId = feedId;
    return this;
  }

  /**
   * Get feedId
   * @return feedId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) { this.feedId = feedId; }

  public PackageNote notes(PackageNotesResult notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PackageNotesResult getNotes() {
    return notes;
  }

  public void setNotes(PackageNotesResult notes) { this.notes = notes; }

  public PackageNote packageId(String packageId) {

    this.packageId = packageId;
    return this;
  }

  /**
   * Get packageId
   * @return packageId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) { this.packageId = packageId; }

  public PackageNote version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageNote packageNote = (PackageNote)o;
    return Objects.equals(this.feedId, packageNote.feedId) &&
        Objects.equals(this.notes, packageNote.notes) &&
        Objects.equals(this.packageId, packageNote.packageId) &&
        Objects.equals(this.version, packageNote.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, notes, packageId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageNote {\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    packageId: ")
        .append(toIndentedString(packageId))
        .append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
