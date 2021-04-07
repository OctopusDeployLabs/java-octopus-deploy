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
 * TaskProgress
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TaskProgress {
  public static final String SERIALIZED_NAME_ESTIMATED_TIME_REMAINING =
      "EstimatedTimeRemaining";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TIME_REMAINING)
  private String estimatedTimeRemaining;

  public static final String SERIALIZED_NAME_PROGRESS_PERCENTAGE =
      "ProgressPercentage";
  @SerializedName(SERIALIZED_NAME_PROGRESS_PERCENTAGE)
  private Integer progressPercentage;

  public TaskProgress estimatedTimeRemaining(String estimatedTimeRemaining) {

    this.estimatedTimeRemaining = estimatedTimeRemaining;
    return this;
  }

  /**
   * Get estimatedTimeRemaining
   * @return estimatedTimeRemaining
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEstimatedTimeRemaining() {
    return estimatedTimeRemaining;
  }

  public void setEstimatedTimeRemaining(String estimatedTimeRemaining) {
    this.estimatedTimeRemaining = estimatedTimeRemaining;
  }

  public TaskProgress progressPercentage(Integer progressPercentage) {

    this.progressPercentage = progressPercentage;
    return this;
  }

  /**
   * Get progressPercentage
   * @return progressPercentage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskProgress taskProgress = (TaskProgress)o;
    return Objects.equals(this.estimatedTimeRemaining,
                          taskProgress.estimatedTimeRemaining) &&
        Objects.equals(this.progressPercentage,
                       taskProgress.progressPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedTimeRemaining, progressPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskProgress {\n");
    sb.append("    estimatedTimeRemaining: ")
        .append(toIndentedString(estimatedTimeRemaining))
        .append("\n");
    sb.append("    progressPercentage: ")
        .append(toIndentedString(progressPercentage))
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
