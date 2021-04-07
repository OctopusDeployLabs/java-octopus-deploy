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
 * ChangeDetails
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ChangeDetails {
  public static final String SERIALIZED_NAME_DIFFERENCES = "Differences";
  @SerializedName(SERIALIZED_NAME_DIFFERENCES) private Object differences;

  public static final String SERIALIZED_NAME_DOCUMENT_CONTEXT =
      "DocumentContext";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CONTEXT)
  private Object documentContext;

  public ChangeDetails differences(Object differences) {

    this.differences = differences;
    return this;
  }

  /**
   * Get differences
   * @return differences
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDifferences() {
    return differences;
  }

  public void setDifferences(Object differences) {
    this.differences = differences;
  }

  public ChangeDetails documentContext(Object documentContext) {

    this.documentContext = documentContext;
    return this;
  }

  /**
   * Get documentContext
   * @return documentContext
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDocumentContext() {
    return documentContext;
  }

  public void setDocumentContext(Object documentContext) {
    this.documentContext = documentContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDetails changeDetails = (ChangeDetails)o;
    return Objects.equals(this.differences, changeDetails.differences) &&
        Objects.equals(this.documentContext, changeDetails.documentContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(differences, documentContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDetails {\n");
    sb.append("    differences: ")
        .append(toIndentedString(differences))
        .append("\n");
    sb.append("    documentContext: ")
        .append(toIndentedString(documentContext))
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
