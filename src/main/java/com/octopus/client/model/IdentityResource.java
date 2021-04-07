// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.IdentityClaimResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * IdentityResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class IdentityResource {
  public static final String SERIALIZED_NAME_CLAIMS = "Claims";
  @SerializedName(SERIALIZED_NAME_CLAIMS)
  private Map<String, IdentityClaimResource> claims = null;

  public static final String SERIALIZED_NAME_IDENTITY_PROVIDER_NAME =
      "IdentityProviderName";
  @SerializedName(SERIALIZED_NAME_IDENTITY_PROVIDER_NAME)
  private String identityProviderName;

  /**
   * Get claims
   * @return claims
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, IdentityClaimResource> getClaims() {
    return claims;
  }

  public IdentityResource identityProviderName(String identityProviderName) {

    this.identityProviderName = identityProviderName;
    return this;
  }

  /**
   * Get identityProviderName
   * @return identityProviderName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentityProviderName() {
    return identityProviderName;
  }

  public void setIdentityProviderName(String identityProviderName) {
    this.identityProviderName = identityProviderName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityResource identityResource = (IdentityResource)o;
    return Objects.equals(this.claims, identityResource.claims) &&
        Objects.equals(this.identityProviderName,
                       identityResource.identityProviderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claims, identityProviderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityResource {\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("    identityProviderName: ")
        .append(toIndentedString(identityProviderName))
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
