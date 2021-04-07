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
 * EventReference
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EventReference {
  public static final String SERIALIZED_NAME_LENGTH = "Length";
  @SerializedName(SERIALIZED_NAME_LENGTH) private Integer length;

  public static final String SERIALIZED_NAME_REFERENCED_DOCUMENT_ID =
      "ReferencedDocumentId";
  @SerializedName(SERIALIZED_NAME_REFERENCED_DOCUMENT_ID)
  private String referencedDocumentId;

  public static final String SERIALIZED_NAME_START_INDEX = "StartIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX) private Integer startIndex;

  public EventReference length(Integer length) {

    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) { this.length = length; }

  public EventReference referencedDocumentId(String referencedDocumentId) {

    this.referencedDocumentId = referencedDocumentId;
    return this;
  }

  /**
   * Get referencedDocumentId
   * @return referencedDocumentId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferencedDocumentId() {
    return referencedDocumentId;
  }

  public void setReferencedDocumentId(String referencedDocumentId) {
    this.referencedDocumentId = referencedDocumentId;
  }

  public EventReference startIndex(Integer startIndex) {

    this.startIndex = startIndex;
    return this;
  }

  /**
   * Get startIndex
   * @return startIndex
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventReference eventReference = (EventReference)o;
    return Objects.equals(this.length, eventReference.length) &&
        Objects.equals(this.referencedDocumentId,
                       eventReference.referencedDocumentId) &&
        Objects.equals(this.startIndex, eventReference.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, referencedDocumentId, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventReference {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    referencedDocumentId: ")
        .append(toIndentedString(referencedDocumentId))
        .append("\n");
    sb.append("    startIndex: ")
        .append(toIndentedString(startIndex))
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
