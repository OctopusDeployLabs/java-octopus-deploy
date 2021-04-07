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
 * PackageNotesResult
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageNotesResult {
  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "DisplayMessage";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  private String displayMessage;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "FailureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON) private String failureReason;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES) private String notes;

  public static final String SERIALIZED_NAME_SUCCEEDED = "Succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED) private Boolean succeeded;

  /**
   * Get displayMessage
   * @return displayMessage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayMessage() {
    return displayMessage;
  }

  public PackageNotesResult failureReason(String failureReason) {

    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public PackageNotesResult notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) { this.notes = notes; }

  public PackageNotesResult succeeded(Boolean succeeded) {

    this.succeeded = succeeded;
    return this;
  }

  /**
   * Get succeeded
   * @return succeeded
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Boolean succeeded) { this.succeeded = succeeded; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageNotesResult packageNotesResult = (PackageNotesResult)o;
    return Objects.equals(this.displayMessage,
                          packageNotesResult.displayMessage) &&
        Objects.equals(this.failureReason, packageNotesResult.failureReason) &&
        Objects.equals(this.notes, packageNotesResult.notes) &&
        Objects.equals(this.succeeded, packageNotesResult.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayMessage, failureReason, notes, succeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageNotesResult {\n");
    sb.append("    displayMessage: ")
        .append(toIndentedString(displayMessage))
        .append("\n");
    sb.append("    failureReason: ")
        .append(toIndentedString(failureReason))
        .append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    succeeded: ")
        .append(toIndentedString(succeeded))
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
