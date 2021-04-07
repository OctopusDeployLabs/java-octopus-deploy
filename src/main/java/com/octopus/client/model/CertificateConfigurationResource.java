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
 * CertificateConfigurationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CertificateConfigurationResource {
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

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM =
      "SignatureAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM)
  private String signatureAlgorithm;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT) private String thumbprint;

  public CertificateConfigurationResource id(String id) {

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

  public CertificateConfigurationResource
  lastModifiedBy(String lastModifiedBy) {

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

  public CertificateConfigurationResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public CertificateConfigurationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public CertificateConfigurationResource putLinksItem(String key,
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

  public CertificateConfigurationResource name(String name) {

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

  public CertificateConfigurationResource
  signatureAlgorithm(String signatureAlgorithm) {

    this.signatureAlgorithm = signatureAlgorithm;
    return this;
  }

  /**
   * Get signatureAlgorithm
   * @return signatureAlgorithm
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  public void setSignatureAlgorithm(String signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  public CertificateConfigurationResource thumbprint(String thumbprint) {

    this.thumbprint = thumbprint;
    return this;
  }

  /**
   * Get thumbprint
   * @return thumbprint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbprint() {
    return thumbprint;
  }

  public void setThumbprint(String thumbprint) { this.thumbprint = thumbprint; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateConfigurationResource certificateConfigurationResource =
        (CertificateConfigurationResource)o;
    return Objects.equals(this.id, certificateConfigurationResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       certificateConfigurationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       certificateConfigurationResource.lastModifiedOn) &&
        Objects.equals(this.links, certificateConfigurationResource.links) &&
        Objects.equals(this.name, certificateConfigurationResource.name) &&
        Objects.equals(this.signatureAlgorithm,
                       certificateConfigurationResource.signatureAlgorithm) &&
        Objects.equals(this.thumbprint,
                       certificateConfigurationResource.thumbprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifiedBy, lastModifiedOn, links, name,
                        signatureAlgorithm, thumbprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateConfigurationResource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signatureAlgorithm: ")
        .append(toIndentedString(signatureAlgorithm))
        .append("\n");
    sb.append("    thumbprint: ")
        .append(toIndentedString(thumbprint))
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
