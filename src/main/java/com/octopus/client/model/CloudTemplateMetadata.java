// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * CloudTemplateMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CloudTemplateMetadata {
  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA) private Metadata metadata;

  public static final String SERIALIZED_NAME_VALUES = "Values";
  @SerializedName(SERIALIZED_NAME_VALUES) private Object values;

  public CloudTemplateMetadata metadata(Metadata metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) { this.metadata = metadata; }

  public CloudTemplateMetadata values(Object values) {

    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValues() {
    return values;
  }

  public void setValues(Object values) { this.values = values; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudTemplateMetadata cloudTemplateMetadata = (CloudTemplateMetadata)o;
    return Objects.equals(this.metadata, cloudTemplateMetadata.metadata) &&
        Objects.equals(this.values, cloudTemplateMetadata.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudTemplateMetadata {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
