// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.SensitiveValue;
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
 * ProxyResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProxyResource {
  public static final String SERIALIZED_NAME_HOST = "Host";
  @SerializedName(SERIALIZED_NAME_HOST) private String host;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD) private SensitiveValue password;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT) private Integer port;

  public static final String SERIALIZED_NAME_PROXY_TYPE = "ProxyType";
  @SerializedName(SERIALIZED_NAME_PROXY_TYPE) private String proxyType;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME) private String username;

  public ProxyResource host(String host) {

    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }

  public void setHost(String host) { this.host = host; }

  public ProxyResource id(String id) {

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

  public ProxyResource lastModifiedBy(String lastModifiedBy) {

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

  public ProxyResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ProxyResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ProxyResource putLinksItem(String key, String linksItem) {
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

  public ProxyResource name(String name) {

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

  public ProxyResource password(SensitiveValue password) {

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SensitiveValue getPassword() {
    return password;
  }

  public void setPassword(SensitiveValue password) { this.password = password; }

  public ProxyResource port(Integer port) {

    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) { this.port = port; }

  public ProxyResource proxyType(String proxyType) {

    this.proxyType = proxyType;
    return this;
  }

  /**
   * Get proxyType
   * @return proxyType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) { this.proxyType = proxyType; }

  public ProxyResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  public ProxyResource username(String username) {

    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) { this.username = username; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxyResource proxyResource = (ProxyResource)o;
    return Objects.equals(this.host, proxyResource.host) &&
        Objects.equals(this.id, proxyResource.id) &&
        Objects.equals(this.lastModifiedBy, proxyResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, proxyResource.lastModifiedOn) &&
        Objects.equals(this.links, proxyResource.links) &&
        Objects.equals(this.name, proxyResource.name) &&
        Objects.equals(this.password, proxyResource.password) &&
        Objects.equals(this.port, proxyResource.port) &&
        Objects.equals(this.proxyType, proxyResource.proxyType) &&
        Objects.equals(this.spaceId, proxyResource.spaceId) &&
        Objects.equals(this.username, proxyResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, id, lastModifiedBy, lastModifiedOn, links, name,
                        password, port, proxyType, spaceId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxyResource {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    proxyType: ")
        .append(toIndentedString(proxyType))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
