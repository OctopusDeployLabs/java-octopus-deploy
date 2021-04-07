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
import org.threeten.bp.OffsetDateTime;

/**
 * ActivityLogElement
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActivityLogElement {
  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY) private String category;

  public static final String SERIALIZED_NAME_DETAIL = "Detail";
  @SerializedName(SERIALIZED_NAME_DETAIL) private String detail;

  public static final String SERIALIZED_NAME_MESSAGE_TEXT = "MessageText";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEXT) private String messageText;

  public static final String SERIALIZED_NAME_OCCURRED_AT = "OccurredAt";
  @SerializedName(SERIALIZED_NAME_OCCURRED_AT)
  private OffsetDateTime occurredAt;

  public ActivityLogElement category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) { this.category = category; }

  public ActivityLogElement detail(String detail) {

    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) { this.detail = detail; }

  public ActivityLogElement messageText(String messageText) {

    this.messageText = messageText;
    return this;
  }

  /**
   * Get messageText
   * @return messageText
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public ActivityLogElement occurredAt(OffsetDateTime occurredAt) {

    this.occurredAt = occurredAt;
    return this;
  }

  /**
   * Get occurredAt
   * @return occurredAt
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLogElement activityLogElement = (ActivityLogElement)o;
    return Objects.equals(this.category, activityLogElement.category) &&
        Objects.equals(this.detail, activityLogElement.detail) &&
        Objects.equals(this.messageText, activityLogElement.messageText) &&
        Objects.equals(this.occurredAt, activityLogElement.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, detail, messageText, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLogElement {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    messageText: ")
        .append(toIndentedString(messageText))
        .append("\n");
    sb.append("    occurredAt: ")
        .append(toIndentedString(occurredAt))
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
