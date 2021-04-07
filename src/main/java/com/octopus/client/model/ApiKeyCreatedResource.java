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
 * ApiKeyCreatedResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ApiKeyCreatedResource {
  public static final String SERIALIZED_NAME_API_KEY = "ApiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY) private String apiKey;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_EXPIRES = "Expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES) private OffsetDateTime expires;

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

  public static final String SERIALIZED_NAME_PURPOSE = "Purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE) private String purpose;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID) private String userId;

  public ApiKeyCreatedResource apiKey(String apiKey) {

    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) { this.apiKey = apiKey; }

  public ApiKeyCreatedResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public ApiKeyCreatedResource expires(OffsetDateTime expires) {

    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) { this.expires = expires; }

  public ApiKeyCreatedResource id(String id) {

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

  public ApiKeyCreatedResource lastModifiedBy(String lastModifiedBy) {

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

  public ApiKeyCreatedResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ApiKeyCreatedResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ApiKeyCreatedResource putLinksItem(String key, String linksItem) {
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

  public ApiKeyCreatedResource purpose(String purpose) {

    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) { this.purpose = purpose; }

  public ApiKeyCreatedResource userId(String userId) {

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) { this.userId = userId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreatedResource apiKeyCreatedResource = (ApiKeyCreatedResource)o;
    return Objects.equals(this.apiKey, apiKeyCreatedResource.apiKey) &&
        Objects.equals(this.created, apiKeyCreatedResource.created) &&
        Objects.equals(this.expires, apiKeyCreatedResource.expires) &&
        Objects.equals(this.id, apiKeyCreatedResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       apiKeyCreatedResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       apiKeyCreatedResource.lastModifiedOn) &&
        Objects.equals(this.links, apiKeyCreatedResource.links) &&
        Objects.equals(this.purpose, apiKeyCreatedResource.purpose) &&
        Objects.equals(this.userId, apiKeyCreatedResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, created, expires, id, lastModifiedBy,
                        lastModifiedOn, links, purpose, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreatedResource {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
