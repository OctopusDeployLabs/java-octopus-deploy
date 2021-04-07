// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ProcessType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * ProcessReferenceDataItem
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProcessReferenceDataItem {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROCESS_TYPE = "ProcessType";
  @SerializedName(SERIALIZED_NAME_PROCESS_TYPE) private ProcessType processType;

  public ProcessReferenceDataItem id(String id) {

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

  public ProcessReferenceDataItem name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public ProcessReferenceDataItem processType(ProcessType processType) {

    this.processType = processType;
    return this;
  }

  /**
   * Get processType
   * @return processType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessType getProcessType() {
    return processType;
  }

  public void setProcessType(ProcessType processType) {
    this.processType = processType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessReferenceDataItem processReferenceDataItem =
        (ProcessReferenceDataItem)o;
    return Objects.equals(this.id, processReferenceDataItem.id) &&
        Objects.equals(this.name, processReferenceDataItem.name) &&
        Objects.equals(this.processType, processReferenceDataItem.processType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, processType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessReferenceDataItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processType: ")
        .append(toIndentedString(processType))
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
