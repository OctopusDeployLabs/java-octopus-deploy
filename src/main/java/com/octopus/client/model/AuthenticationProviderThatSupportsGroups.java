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
 * AuthenticationProviderThatSupportsGroups
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AuthenticationProviderThatSupportsGroups {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_ROLE_BASED = "IsRoleBased";
  @SerializedName(SERIALIZED_NAME_IS_ROLE_BASED) private Boolean isRoleBased;

  public static final String SERIALIZED_NAME_LOOKUP_URI = "LookupUri";
  @SerializedName(SERIALIZED_NAME_LOOKUP_URI) private String lookupUri;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SUPPORTS_GROUP_LOOKUP =
      "SupportsGroupLookup";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_GROUP_LOOKUP)
  private Boolean supportsGroupLookup;

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public AuthenticationProviderThatSupportsGroups
  isRoleBased(Boolean isRoleBased) {

    this.isRoleBased = isRoleBased;
    return this;
  }

  /**
   * Get isRoleBased
   * @return isRoleBased
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRoleBased() {
    return isRoleBased;
  }

  public void setIsRoleBased(Boolean isRoleBased) {
    this.isRoleBased = isRoleBased;
  }

  public AuthenticationProviderThatSupportsGroups lookupUri(String lookupUri) {

    this.lookupUri = lookupUri;
    return this;
  }

  /**
   * Get lookupUri
   * @return lookupUri
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLookupUri() {
    return lookupUri;
  }

  public void setLookupUri(String lookupUri) { this.lookupUri = lookupUri; }

  public AuthenticationProviderThatSupportsGroups name(String name) {

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

  public AuthenticationProviderThatSupportsGroups
  supportsGroupLookup(Boolean supportsGroupLookup) {

    this.supportsGroupLookup = supportsGroupLookup;
    return this;
  }

  /**
   * Get supportsGroupLookup
   * @return supportsGroupLookup
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSupportsGroupLookup() {
    return supportsGroupLookup;
  }

  public void setSupportsGroupLookup(Boolean supportsGroupLookup) {
    this.supportsGroupLookup = supportsGroupLookup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationProviderThatSupportsGroups
        authenticationProviderThatSupportsGroups =
            (AuthenticationProviderThatSupportsGroups)o;
    return Objects.equals(this.id,
                          authenticationProviderThatSupportsGroups.id) &&
        Objects.equals(this.isRoleBased,
                       authenticationProviderThatSupportsGroups.isRoleBased) &&
        Objects.equals(this.lookupUri,
                       authenticationProviderThatSupportsGroups.lookupUri) &&
        Objects.equals(this.name,
                       authenticationProviderThatSupportsGroups.name) &&
        Objects.equals(
            this.supportsGroupLookup,
            authenticationProviderThatSupportsGroups.supportsGroupLookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isRoleBased, lookupUri, name, supportsGroupLookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationProviderThatSupportsGroups {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRoleBased: ")
        .append(toIndentedString(isRoleBased))
        .append("\n");
    sb.append("    lookupUri: ")
        .append(toIndentedString(lookupUri))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportsGroupLookup: ")
        .append(toIndentedString(supportsGroupLookup))
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
