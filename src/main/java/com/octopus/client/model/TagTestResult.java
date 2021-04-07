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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TagTestResult
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TagTestResult {
  public static final String SERIALIZED_NAME_IS_MATCHED = "IsMatched";
  @SerializedName(SERIALIZED_NAME_IS_MATCHED) private Boolean isMatched;

  public static final String SERIALIZED_NAME_MISSING_TAGS = "MissingTags";
  @SerializedName(SERIALIZED_NAME_MISSING_TAGS)
  private List<String> missingTags = null;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON) private String reason;

  public TagTestResult isMatched(Boolean isMatched) {

    this.isMatched = isMatched;
    return this;
  }

  /**
   * Get isMatched
   * @return isMatched
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMatched() {
    return isMatched;
  }

  public void setIsMatched(Boolean isMatched) { this.isMatched = isMatched; }

  public TagTestResult missingTags(List<String> missingTags) {

    this.missingTags = missingTags;
    return this;
  }

  public TagTestResult addMissingTagsItem(String missingTagsItem) {
    if (this.missingTags == null) {
      this.missingTags = new ArrayList<String>();
    }
    this.missingTags.add(missingTagsItem);
    return this;
  }

  /**
   * Get missingTags
   * @return missingTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMissingTags() {
    return missingTags;
  }

  public void setMissingTags(List<String> missingTags) {
    this.missingTags = missingTags;
  }

  public TagTestResult reason(String reason) {

    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) { this.reason = reason; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagTestResult tagTestResult = (TagTestResult)o;
    return Objects.equals(this.isMatched, tagTestResult.isMatched) &&
        Objects.equals(this.missingTags, tagTestResult.missingTags) &&
        Objects.equals(this.reason, tagTestResult.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMatched, missingTags, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagTestResult {\n");
    sb.append("    isMatched: ")
        .append(toIndentedString(isMatched))
        .append("\n");
    sb.append("    missingTags: ")
        .append(toIndentedString(missingTags))
        .append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
