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
import org.threeten.bp.OffsetDateTime;

/**
 * X509Certificate
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class X509Certificate {
  public static final String SERIALIZED_NAME_ISSUER_DISTINGUISHED_NAME =
      "IssuerDistinguishedName";
  @SerializedName(SERIALIZED_NAME_ISSUER_DISTINGUISHED_NAME)
  private String issuerDistinguishedName;

  public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER) private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE) private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER) private String serialNumber;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME =
      "SignatureAlgorithmName";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME)
  private String signatureAlgorithmName;

  public static final String SERIALIZED_NAME_SUBJECT_DISTINGUISHED_NAME =
      "SubjectDistinguishedName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_DISTINGUISHED_NAME)
  private String subjectDistinguishedName;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT) private String thumbprint;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public X509Certificate
  issuerDistinguishedName(String issuerDistinguishedName) {

    this.issuerDistinguishedName = issuerDistinguishedName;
    return this;
  }

  /**
   * Get issuerDistinguishedName
   * @return issuerDistinguishedName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerDistinguishedName() {
    return issuerDistinguishedName;
  }

  public void setIssuerDistinguishedName(String issuerDistinguishedName) {
    this.issuerDistinguishedName = issuerDistinguishedName;
  }

  public X509Certificate notAfter(OffsetDateTime notAfter) {

    this.notAfter = notAfter;
    return this;
  }

  /**
   * Get notAfter
   * @return notAfter
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(OffsetDateTime notAfter) { this.notAfter = notAfter; }

  public X509Certificate notBefore(OffsetDateTime notBefore) {

    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }

  public X509Certificate serialNumber(String serialNumber) {

    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public X509Certificate signatureAlgorithmName(String signatureAlgorithmName) {

    this.signatureAlgorithmName = signatureAlgorithmName;
    return this;
  }

  /**
   * Get signatureAlgorithmName
   * @return signatureAlgorithmName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignatureAlgorithmName() {
    return signatureAlgorithmName;
  }

  public void setSignatureAlgorithmName(String signatureAlgorithmName) {
    this.signatureAlgorithmName = signatureAlgorithmName;
  }

  public X509Certificate
  subjectDistinguishedName(String subjectDistinguishedName) {

    this.subjectDistinguishedName = subjectDistinguishedName;
    return this;
  }

  /**
   * Get subjectDistinguishedName
   * @return subjectDistinguishedName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectDistinguishedName() {
    return subjectDistinguishedName;
  }

  public void setSubjectDistinguishedName(String subjectDistinguishedName) {
    this.subjectDistinguishedName = subjectDistinguishedName;
  }

  public X509Certificate thumbprint(String thumbprint) {

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

  public X509Certificate version(Integer version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    X509Certificate x509Certificate = (X509Certificate)o;
    return Objects.equals(this.issuerDistinguishedName,
                          x509Certificate.issuerDistinguishedName) &&
        Objects.equals(this.notAfter, x509Certificate.notAfter) &&
        Objects.equals(this.notBefore, x509Certificate.notBefore) &&
        Objects.equals(this.serialNumber, x509Certificate.serialNumber) &&
        Objects.equals(this.signatureAlgorithmName,
                       x509Certificate.signatureAlgorithmName) &&
        Objects.equals(this.subjectDistinguishedName,
                       x509Certificate.subjectDistinguishedName) &&
        Objects.equals(this.thumbprint, x509Certificate.thumbprint) &&
        Objects.equals(this.version, x509Certificate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerDistinguishedName, notAfter, notBefore,
                        serialNumber, signatureAlgorithmName,
                        subjectDistinguishedName, thumbprint, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class X509Certificate {\n");
    sb.append("    issuerDistinguishedName: ")
        .append(toIndentedString(issuerDistinguishedName))
        .append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ")
        .append(toIndentedString(notBefore))
        .append("\n");
    sb.append("    serialNumber: ")
        .append(toIndentedString(serialNumber))
        .append("\n");
    sb.append("    signatureAlgorithmName: ")
        .append(toIndentedString(signatureAlgorithmName))
        .append("\n");
    sb.append("    subjectDistinguishedName: ")
        .append(toIndentedString(subjectDistinguishedName))
        .append("\n");
    sb.append("    thumbprint: ")
        .append(toIndentedString(thumbprint))
        .append("\n");
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
