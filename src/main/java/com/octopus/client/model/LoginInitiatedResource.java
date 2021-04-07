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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * LoginInitiatedResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LoginInitiatedResource {
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

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "ProviderName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME) private String providerName;

  public static final String SERIALIZED_NAME_WAS_LOGIN_INITIATED =
      "WasLoginInitiated";
  @SerializedName(SERIALIZED_NAME_WAS_LOGIN_INITIATED)
  private Boolean wasLoginInitiated;

  public LoginInitiatedResource id(String id) {

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

  public LoginInitiatedResource lastModifiedBy(String lastModifiedBy) {

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

  public LoginInitiatedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public LoginInitiatedResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LoginInitiatedResource putLinksItem(String key, String linksItem) {
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

  public LoginInitiatedResource providerName(String providerName) {

    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   * @return providerName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public LoginInitiatedResource wasLoginInitiated(Boolean wasLoginInitiated) {

    this.wasLoginInitiated = wasLoginInitiated;
    return this;
  }

  /**
   * Get wasLoginInitiated
   * @return wasLoginInitiated
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWasLoginInitiated() {
    return wasLoginInitiated;
  }

  public void setWasLoginInitiated(Boolean wasLoginInitiated) {
    this.wasLoginInitiated = wasLoginInitiated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInitiatedResource loginInitiatedResource = (LoginInitiatedResource)o;
    return Objects.equals(this.id, loginInitiatedResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       loginInitiatedResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       loginInitiatedResource.lastModifiedOn) &&
        Objects.equals(this.links, loginInitiatedResource.links) &&
        Objects.equals(this.providerName,
                       loginInitiatedResource.providerName) &&
        Objects.equals(this.wasLoginInitiated,
                       loginInitiatedResource.wasLoginInitiated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, links, providerName,
                        wasLoginInitiated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInitiatedResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    providerName: ")
        .append(toIndentedString(providerName))
        .append("\n");
    sb.append("    wasLoginInitiated: ")
        .append(toIndentedString(wasLoginInitiated))
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
