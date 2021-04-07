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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * RootResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RootResource {
  public static final String SERIALIZED_NAME_API_VERSION = "ApiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION) private String apiVersion;

  public static final String SERIALIZED_NAME_APPLICATION = "Application";
  @SerializedName(SERIALIZED_NAME_APPLICATION) private String application;

  public static final String SERIALIZED_NAME_HAS_LONG_TERM_SUPPORT =
      "HasLongTermSupport";
  @SerializedName(SERIALIZED_NAME_HAS_LONG_TERM_SUPPORT)
  private Boolean hasLongTermSupport;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_INSTALLATION_ID = "InstallationId";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ID) private UUID installationId;

  public static final String SERIALIZED_NAME_IS_EARLY_ACCESS_PROGRAM =
      "IsEarlyAccessProgram";
  @SerializedName(SERIALIZED_NAME_IS_EARLY_ACCESS_PROGRAM)
  private Boolean isEarlyAccessProgram = false;

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

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public RootResource apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Get apiVersion
   * @return apiVersion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) { this.apiVersion = apiVersion; }

  public RootResource application(String application) {

    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  /**
   * Get hasLongTermSupport
   * @return hasLongTermSupport
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasLongTermSupport() {
    return hasLongTermSupport;
  }

  public RootResource id(String id) {

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

  public RootResource installationId(UUID installationId) {

    this.installationId = installationId;
    return this;
  }

  /**
   * Get installationId
   * @return installationId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getInstallationId() {
    return installationId;
  }

  public void setInstallationId(UUID installationId) {
    this.installationId = installationId;
  }

  public RootResource isEarlyAccessProgram(Boolean isEarlyAccessProgram) {

    this.isEarlyAccessProgram = isEarlyAccessProgram;
    return this;
  }

  /**
   * Get isEarlyAccessProgram
   * @return isEarlyAccessProgram
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsEarlyAccessProgram() {
    return isEarlyAccessProgram;
  }

  public void setIsEarlyAccessProgram(Boolean isEarlyAccessProgram) {
    this.isEarlyAccessProgram = isEarlyAccessProgram;
  }

  public RootResource lastModifiedBy(String lastModifiedBy) {

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

  public RootResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public RootResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public RootResource putLinksItem(String key, String linksItem) {
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

  public RootResource version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootResource rootResource = (RootResource)o;
    return Objects.equals(this.apiVersion, rootResource.apiVersion) &&
        Objects.equals(this.application, rootResource.application) &&
        Objects.equals(this.hasLongTermSupport,
                       rootResource.hasLongTermSupport) &&
        Objects.equals(this.id, rootResource.id) &&
        Objects.equals(this.installationId, rootResource.installationId) &&
        Objects.equals(this.isEarlyAccessProgram,
                       rootResource.isEarlyAccessProgram) &&
        Objects.equals(this.lastModifiedBy, rootResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, rootResource.lastModifiedOn) &&
        Objects.equals(this.links, rootResource.links) &&
        Objects.equals(this.version, rootResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, application, hasLongTermSupport, id,
                        installationId, isEarlyAccessProgram, lastModifiedBy,
                        lastModifiedOn, links, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootResource {\n");
    sb.append("    apiVersion: ")
        .append(toIndentedString(apiVersion))
        .append("\n");
    sb.append("    application: ")
        .append(toIndentedString(application))
        .append("\n");
    sb.append("    hasLongTermSupport: ")
        .append(toIndentedString(hasLongTermSupport))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationId: ")
        .append(toIndentedString(installationId))
        .append("\n");
    sb.append("    isEarlyAccessProgram: ")
        .append(toIndentedString(isEarlyAccessProgram))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
