// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.AuthenticationProviderElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * AuthenticationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AuthenticationResource {
  public static final String
      SERIALIZED_NAME_ANY_AUTHENTICATION_PROVIDERS_SUPPORT_PASSWORD_MANAGEMENT =
          "AnyAuthenticationProvidersSupportPasswordManagement";
  @SerializedName(
      SERIALIZED_NAME_ANY_AUTHENTICATION_PROVIDERS_SUPPORT_PASSWORD_MANAGEMENT)
  private Boolean anyAuthenticationProvidersSupportPasswordManagement;

  public static final String SERIALIZED_NAME_AUTHENTICATION_PROVIDERS =
      "AuthenticationProviders";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_PROVIDERS)
  private List<AuthenticationProviderElement> authenticationProviders = null;

  public static final String SERIALIZED_NAME_AUTO_LOGIN_ENABLED =
      "AutoLoginEnabled";
  @SerializedName(SERIALIZED_NAME_AUTO_LOGIN_ENABLED)
  private Boolean autoLoginEnabled;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public AuthenticationResource
  anyAuthenticationProvidersSupportPasswordManagement(
      Boolean anyAuthenticationProvidersSupportPasswordManagement) {

    this.anyAuthenticationProvidersSupportPasswordManagement =
        anyAuthenticationProvidersSupportPasswordManagement;
    return this;
  }

  /**
   * Get anyAuthenticationProvidersSupportPasswordManagement
   * @return anyAuthenticationProvidersSupportPasswordManagement
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAnyAuthenticationProvidersSupportPasswordManagement() {
    return anyAuthenticationProvidersSupportPasswordManagement;
  }

  public void setAnyAuthenticationProvidersSupportPasswordManagement(
      Boolean anyAuthenticationProvidersSupportPasswordManagement) {
    this.anyAuthenticationProvidersSupportPasswordManagement =
        anyAuthenticationProvidersSupportPasswordManagement;
  }

  public AuthenticationResource authenticationProviders(
      List<AuthenticationProviderElement> authenticationProviders) {

    this.authenticationProviders = authenticationProviders;
    return this;
  }

  public AuthenticationResource addAuthenticationProvidersItem(
      AuthenticationProviderElement authenticationProvidersItem) {
    if (this.authenticationProviders == null) {
      this.authenticationProviders =
          new ArrayList<AuthenticationProviderElement>();
    }
    this.authenticationProviders.add(authenticationProvidersItem);
    return this;
  }

  /**
   * Get authenticationProviders
   * @return authenticationProviders
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AuthenticationProviderElement> getAuthenticationProviders() {
    return authenticationProviders;
  }

  public void setAuthenticationProviders(
      List<AuthenticationProviderElement> authenticationProviders) {
    this.authenticationProviders = authenticationProviders;
  }

  public AuthenticationResource autoLoginEnabled(Boolean autoLoginEnabled) {

    this.autoLoginEnabled = autoLoginEnabled;
    return this;
  }

  /**
   * Get autoLoginEnabled
   * @return autoLoginEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoLoginEnabled() {
    return autoLoginEnabled;
  }

  public void setAutoLoginEnabled(Boolean autoLoginEnabled) {
    this.autoLoginEnabled = autoLoginEnabled;
  }

  public AuthenticationResource id(String id) {

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

  public AuthenticationResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public AuthenticationResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public AuthenticationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public AuthenticationResource putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResource authenticationResource = (AuthenticationResource)o;
    return Objects.equals(
               this.anyAuthenticationProvidersSupportPasswordManagement,
               authenticationResource
                   .anyAuthenticationProvidersSupportPasswordManagement) &&
        Objects.equals(this.authenticationProviders,
                       authenticationResource.authenticationProviders) &&
        Objects.equals(this.autoLoginEnabled,
                       authenticationResource.autoLoginEnabled) &&
        Objects.equals(this.id, authenticationResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       authenticationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       authenticationResource.lastModifiedOn) &&
        Objects.equals(this.links, authenticationResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyAuthenticationProvidersSupportPasswordManagement,
                        authenticationProviders, autoLoginEnabled, id,
                        lastModifiedBy, lastModifiedOn, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResource {\n");
    sb.append("    anyAuthenticationProvidersSupportPasswordManagement: ")
        .append(toIndentedString(
            anyAuthenticationProvidersSupportPasswordManagement))
        .append("\n");
    sb.append("    authenticationProviders: ")
        .append(toIndentedString(authenticationProviders))
        .append("\n");
    sb.append("    autoLoginEnabled: ")
        .append(toIndentedString(autoLoginEnabled))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
