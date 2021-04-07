// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LicenseMessageDisposition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * LicenseMessageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LicenseMessageResource {
  public static final String SERIALIZED_NAME_DISPOSITION = "Disposition";
  @SerializedName(SERIALIZED_NAME_DISPOSITION)
  private LicenseMessageDisposition disposition;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE) private String message;

  public LicenseMessageResource
  disposition(LicenseMessageDisposition disposition) {

    this.disposition = disposition;
    return this;
  }

  /**
   * Get disposition
   * @return disposition
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LicenseMessageDisposition getDisposition() {
    return disposition;
  }

  public void setDisposition(LicenseMessageDisposition disposition) {
    this.disposition = disposition;
  }

  public LicenseMessageResource message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) { this.message = message; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseMessageResource licenseMessageResource = (LicenseMessageResource)o;
    return Objects.equals(this.disposition,
                          licenseMessageResource.disposition) &&
        Objects.equals(this.message, licenseMessageResource.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disposition, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseMessageResource {\n");
    sb.append("    disposition: ")
        .append(toIndentedString(disposition))
        .append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
