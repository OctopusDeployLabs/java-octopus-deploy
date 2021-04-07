// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.IdentityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * AuthenticationProviderElement
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AuthenticationProviderElement {
  public static final String SERIALIZED_NAME_CS_S_LINKS = "CSSLinks";
  @SerializedName(SERIALIZED_NAME_CS_S_LINKS)
  private List<String> csSLinks = null;

  public static final String SERIALIZED_NAME_FORMS_LOGIN_ENABLED =
      "FormsLoginEnabled";
  @SerializedName(SERIALIZED_NAME_FORMS_LOGIN_ENABLED)
  private Boolean formsLoginEnabled;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "IdentityType";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private IdentityType identityType;

  public static final String SERIALIZED_NAME_JAVASCRIPT_LINKS =
      "JavascriptLinks";
  @SerializedName(SERIALIZED_NAME_JAVASCRIPT_LINKS)
  private List<String> javascriptLinks = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public AuthenticationProviderElement csSLinks(List<String> csSLinks) {

    this.csSLinks = csSLinks;
    return this;
  }

  public AuthenticationProviderElement addCsSLinksItem(String csSLinksItem) {
    if (this.csSLinks == null) {
      this.csSLinks = new ArrayList<String>();
    }
    this.csSLinks.add(csSLinksItem);
    return this;
  }

  /**
   * Get csSLinks
   * @return csSLinks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCsSLinks() {
    return csSLinks;
  }

  public void setCsSLinks(List<String> csSLinks) { this.csSLinks = csSLinks; }

  public AuthenticationProviderElement
  formsLoginEnabled(Boolean formsLoginEnabled) {

    this.formsLoginEnabled = formsLoginEnabled;
    return this;
  }

  /**
   * Get formsLoginEnabled
   * @return formsLoginEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFormsLoginEnabled() {
    return formsLoginEnabled;
  }

  public void setFormsLoginEnabled(Boolean formsLoginEnabled) {
    this.formsLoginEnabled = formsLoginEnabled;
  }

  public AuthenticationProviderElement identityType(IdentityType identityType) {

    this.identityType = identityType;
    return this;
  }

  /**
   * Get identityType
   * @return identityType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityType getIdentityType() {
    return identityType;
  }

  public void setIdentityType(IdentityType identityType) {
    this.identityType = identityType;
  }

  public AuthenticationProviderElement
  javascriptLinks(List<String> javascriptLinks) {

    this.javascriptLinks = javascriptLinks;
    return this;
  }

  public AuthenticationProviderElement
  addJavascriptLinksItem(String javascriptLinksItem) {
    if (this.javascriptLinks == null) {
      this.javascriptLinks = new ArrayList<String>();
    }
    this.javascriptLinks.add(javascriptLinksItem);
    return this;
  }

  /**
   * Get javascriptLinks
   * @return javascriptLinks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getJavascriptLinks() {
    return javascriptLinks;
  }

  public void setJavascriptLinks(List<String> javascriptLinks) {
    this.javascriptLinks = javascriptLinks;
  }

  public AuthenticationProviderElement links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public AuthenticationProviderElement putLinksItem(String key,
                                                    String linksItem) {
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

  public AuthenticationProviderElement name(String name) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationProviderElement authenticationProviderElement =
        (AuthenticationProviderElement)o;
    return Objects.equals(this.csSLinks,
                          authenticationProviderElement.csSLinks) &&
        Objects.equals(this.formsLoginEnabled,
                       authenticationProviderElement.formsLoginEnabled) &&
        Objects.equals(this.identityType,
                       authenticationProviderElement.identityType) &&
        Objects.equals(this.javascriptLinks,
                       authenticationProviderElement.javascriptLinks) &&
        Objects.equals(this.links, authenticationProviderElement.links) &&
        Objects.equals(this.name, authenticationProviderElement.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csSLinks, formsLoginEnabled, identityType,
                        javascriptLinks, links, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationProviderElement {\n");
    sb.append("    csSLinks: ").append(toIndentedString(csSLinks)).append("\n");
    sb.append("    formsLoginEnabled: ")
        .append(toIndentedString(formsLoginEnabled))
        .append("\n");
    sb.append("    identityType: ")
        .append(toIndentedString(identityType))
        .append("\n");
    sb.append("    javascriptLinks: ")
        .append(toIndentedString(javascriptLinks))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
