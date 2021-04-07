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
 * LibraryVariableSetRunbookSnapshotUsageEntry
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LibraryVariableSetRunbookSnapshotUsageEntry {
  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID) private String snapshotId;

  public static final String SERIALIZED_NAME_SNAPSHOT_NAME = "SnapshotName";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NAME) private String snapshotName;

  public LibraryVariableSetRunbookSnapshotUsageEntry
  snapshotId(String snapshotId) {

    this.snapshotId = snapshotId;
    return this;
  }

  /**
   * Get snapshotId
   * @return snapshotId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) { this.snapshotId = snapshotId; }

  public LibraryVariableSetRunbookSnapshotUsageEntry
  snapshotName(String snapshotName) {

    this.snapshotName = snapshotName;
    return this;
  }

  /**
   * Get snapshotName
   * @return snapshotName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapshotName() {
    return snapshotName;
  }

  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVariableSetRunbookSnapshotUsageEntry
        libraryVariableSetRunbookSnapshotUsageEntry =
            (LibraryVariableSetRunbookSnapshotUsageEntry)o;
    return Objects.equals(
               this.snapshotId,
               libraryVariableSetRunbookSnapshotUsageEntry.snapshotId) &&
        Objects.equals(
            this.snapshotName,
            libraryVariableSetRunbookSnapshotUsageEntry.snapshotName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotId, snapshotName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVariableSetRunbookSnapshotUsageEntry {\n");
    sb.append("    snapshotId: ")
        .append(toIndentedString(snapshotId))
        .append("\n");
    sb.append("    snapshotName: ")
        .append(toIndentedString(snapshotName))
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
