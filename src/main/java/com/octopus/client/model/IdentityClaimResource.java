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
 * IdentityClaimResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class IdentityClaimResource {
  public static final String SERIALIZED_NAME_IS_IDENTIFYING_CLAIM =
      "IsIdentifyingClaim";
  @SerializedName(SERIALIZED_NAME_IS_IDENTIFYING_CLAIM)
  private Boolean isIdentifyingClaim;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE) private String value;

  public IdentityClaimResource isIdentifyingClaim(Boolean isIdentifyingClaim) {

    this.isIdentifyingClaim = isIdentifyingClaim;
    return this;
  }

  /**
   * Get isIdentifyingClaim
   * @return isIdentifyingClaim
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsIdentifyingClaim() {
    return isIdentifyingClaim;
  }

  public void setIsIdentifyingClaim(Boolean isIdentifyingClaim) {
    this.isIdentifyingClaim = isIdentifyingClaim;
  }

  public IdentityClaimResource value(String value) {

    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }

  public void setValue(String value) { this.value = value; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityClaimResource identityClaimResource = (IdentityClaimResource)o;
    return Objects.equals(this.isIdentifyingClaim,
                          identityClaimResource.isIdentifyingClaim) &&
        Objects.equals(this.value, identityClaimResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isIdentifyingClaim, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityClaimResource {\n");
    sb.append("    isIdentifyingClaim: ")
        .append(toIndentedString(isIdentifyingClaim))
        .append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
