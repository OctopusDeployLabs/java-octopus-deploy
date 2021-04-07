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
 * PackageSignatureResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PackageSignatureResource {
  public static final String SERIALIZED_NAME_BASE_VERSION = "BaseVersion";
  @SerializedName(SERIALIZED_NAME_BASE_VERSION) private String baseVersion;

  public static final String SERIALIZED_NAME_SIGNATURE = "Signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE) private byte[] signature;

  public PackageSignatureResource baseVersion(String baseVersion) {

    this.baseVersion = baseVersion;
    return this;
  }

  /**
   * Get baseVersion
   * @return baseVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseVersion() {
    return baseVersion;
  }

  public void setBaseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
  }

  public PackageSignatureResource signature(byte[] signature) {

    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getSignature() {
    return signature;
  }

  public void setSignature(byte[] signature) { this.signature = signature; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageSignatureResource packageSignatureResource =
        (PackageSignatureResource)o;
    return Objects.equals(this.baseVersion,
                          packageSignatureResource.baseVersion) &&
        Arrays.equals(this.signature, packageSignatureResource.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVersion, Arrays.hashCode(signature));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageSignatureResource {\n");
    sb.append("    baseVersion: ")
        .append(toIndentedString(baseVersion))
        .append("\n");
    sb.append("    signature: ")
        .append(toIndentedString(signature))
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
