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
 * DynamicWorkerType
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DynamicWorkerType {
  public static final String SERIALIZED_NAME_DEPRECATION_DATE_UTC =
      "DeprecationDateUtc";
  @SerializedName(SERIALIZED_NAME_DEPRECATION_DATE_UTC)
  private OffsetDateTime deprecationDateUtc;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_END_OF_LIFE_DATE_UTC =
      "EndOfLifeDateUtc";
  @SerializedName(SERIALIZED_NAME_END_OF_LIFE_DATE_UTC)
  private OffsetDateTime endOfLifeDateUtc;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_START_DATE_UTC = "StartDateUtc";
  @SerializedName(SERIALIZED_NAME_START_DATE_UTC)
  private OffsetDateTime startDateUtc;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private String type;

  public DynamicWorkerType
  deprecationDateUtc(OffsetDateTime deprecationDateUtc) {

    this.deprecationDateUtc = deprecationDateUtc;
    return this;
  }

  /**
   * Get deprecationDateUtc
   * @return deprecationDateUtc
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeprecationDateUtc() {
    return deprecationDateUtc;
  }

  public void setDeprecationDateUtc(OffsetDateTime deprecationDateUtc) {
    this.deprecationDateUtc = deprecationDateUtc;
  }

  public DynamicWorkerType description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DynamicWorkerType endOfLifeDateUtc(OffsetDateTime endOfLifeDateUtc) {

    this.endOfLifeDateUtc = endOfLifeDateUtc;
    return this;
  }

  /**
   * Get endOfLifeDateUtc
   * @return endOfLifeDateUtc
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndOfLifeDateUtc() {
    return endOfLifeDateUtc;
  }

  public void setEndOfLifeDateUtc(OffsetDateTime endOfLifeDateUtc) {
    this.endOfLifeDateUtc = endOfLifeDateUtc;
  }

  public DynamicWorkerType id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public DynamicWorkerType startDateUtc(OffsetDateTime startDateUtc) {

    this.startDateUtc = startDateUtc;
    return this;
  }

  /**
   * Get startDateUtc
   * @return startDateUtc
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDateUtc() {
    return startDateUtc;
  }

  public void setStartDateUtc(OffsetDateTime startDateUtc) {
    this.startDateUtc = startDateUtc;
  }

  public DynamicWorkerType type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) { this.type = type; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicWorkerType dynamicWorkerType = (DynamicWorkerType)o;
    return Objects.equals(this.deprecationDateUtc,
                          dynamicWorkerType.deprecationDateUtc) &&
        Objects.equals(this.description, dynamicWorkerType.description) &&
        Objects.equals(this.endOfLifeDateUtc,
                       dynamicWorkerType.endOfLifeDateUtc) &&
        Objects.equals(this.id, dynamicWorkerType.id) &&
        Objects.equals(this.startDateUtc, dynamicWorkerType.startDateUtc) &&
        Objects.equals(this.type, dynamicWorkerType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecationDateUtc, description, endOfLifeDateUtc, id,
                        startDateUtc, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicWorkerType {\n");
    sb.append("    deprecationDateUtc: ")
        .append(toIndentedString(deprecationDateUtc))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    endOfLifeDateUtc: ")
        .append(toIndentedString(endOfLifeDateUtc))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDateUtc: ")
        .append(toIndentedString(startDateUtc))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
