// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.CertificateFormat;
import com.octopus.client.model.SensitiveValue;
import com.octopus.client.model.TenantedDeploymentMode;
import com.octopus.client.model.X509Certificate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * CertificateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CertificateResource {
  public static final String SERIALIZED_NAME_ARCHIVED = "Archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED) private OffsetDateTime archived;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN =
      "CertificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private List<X509Certificate> certificateChain = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_DATA =
      "CertificateData";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA)
  private SensitiveValue certificateData;

  public static final String SERIALIZED_NAME_CERTIFICATE_DATA_FORMAT =
      "CertificateDataFormat";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA_FORMAT)
  private CertificateFormat certificateDataFormat;

  public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "EnvironmentIds";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
  private Set<String> environmentIds = null;

  public static final String SERIALIZED_NAME_HAS_PRIVATE_KEY = "HasPrivateKey";
  @SerializedName(SERIALIZED_NAME_HAS_PRIVATE_KEY)
  private Boolean hasPrivateKey;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_EXPIRED = "IsExpired";
  @SerializedName(SERIALIZED_NAME_IS_EXPIRED) private Boolean isExpired;

  public static final String SERIALIZED_NAME_ISSUER_COMMON_NAME =
      "IssuerCommonName";
  @SerializedName(SERIALIZED_NAME_ISSUER_COMMON_NAME)
  private String issuerCommonName;

  public static final String SERIALIZED_NAME_ISSUER_DISTINGUISHED_NAME =
      "IssuerDistinguishedName";
  @SerializedName(SERIALIZED_NAME_ISSUER_DISTINGUISHED_NAME)
  private String issuerDistinguishedName;

  public static final String SERIALIZED_NAME_ISSUER_ORGANIZATION =
      "IssuerOrganization";
  @SerializedName(SERIALIZED_NAME_ISSUER_ORGANIZATION)
  private String issuerOrganization;

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

  public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER) private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE) private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES) private String notes;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD) private SensitiveValue password;

  public static final String SERIALIZED_NAME_REPLACED_BY = "ReplacedBy";
  @SerializedName(SERIALIZED_NAME_REPLACED_BY) private String replacedBy;

  public static final String SERIALIZED_NAME_SELF_SIGNED = "SelfSigned";
  @SerializedName(SERIALIZED_NAME_SELF_SIGNED) private Boolean selfSigned;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER) private String serialNumber;

  public static final String SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME =
      "SignatureAlgorithmName";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_ALGORITHM_NAME)
  private String signatureAlgorithmName;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES =
      "SubjectAlternativeNames";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ALTERNATIVE_NAMES)
  private List<String> subjectAlternativeNames = null;

  public static final String SERIALIZED_NAME_SUBJECT_COMMON_NAME =
      "SubjectCommonName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_COMMON_NAME)
  private String subjectCommonName;

  public static final String SERIALIZED_NAME_SUBJECT_DISTINGUISHED_NAME =
      "SubjectDistinguishedName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_DISTINGUISHED_NAME)
  private String subjectDistinguishedName;

  public static final String SERIALIZED_NAME_SUBJECT_ORGANIZATION =
      "SubjectOrganization";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ORGANIZATION)
  private String subjectOrganization;

  public static final String SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION =
      "TenantedDeploymentParticipation";
  @SerializedName(SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION)
  private TenantedDeploymentMode tenantedDeploymentParticipation;

  public static final String SERIALIZED_NAME_TENANT_IDS = "TenantIds";
  @SerializedName(SERIALIZED_NAME_TENANT_IDS)
  private Set<String> tenantIds = null;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private Set<String> tenantTags = null;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT) private String thumbprint;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private Integer version;

  public CertificateResource archived(OffsetDateTime archived) {

    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getArchived() {
    return archived;
  }

  public void setArchived(OffsetDateTime archived) { this.archived = archived; }

  public CertificateResource
  certificateChain(List<X509Certificate> certificateChain) {

    this.certificateChain = certificateChain;
    return this;
  }

  public CertificateResource
  addCertificateChainItem(X509Certificate certificateChainItem) {
    if (this.certificateChain == null) {
      this.certificateChain = new ArrayList<X509Certificate>();
    }
    this.certificateChain.add(certificateChainItem);
    return this;
  }

  /**
   * Get certificateChain
   * @return certificateChain
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<X509Certificate> getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(List<X509Certificate> certificateChain) {
    this.certificateChain = certificateChain;
  }

  public CertificateResource certificateData(SensitiveValue certificateData) {

    this.certificateData = certificateData;
    return this;
  }

  /**
   * Get certificateData
   * @return certificateData
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SensitiveValue getCertificateData() {
    return certificateData;
  }

  public void setCertificateData(SensitiveValue certificateData) {
    this.certificateData = certificateData;
  }

  public CertificateResource
  certificateDataFormat(CertificateFormat certificateDataFormat) {

    this.certificateDataFormat = certificateDataFormat;
    return this;
  }

  /**
   * Get certificateDataFormat
   * @return certificateDataFormat
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateFormat getCertificateDataFormat() {
    return certificateDataFormat;
  }

  public void
  setCertificateDataFormat(CertificateFormat certificateDataFormat) {
    this.certificateDataFormat = certificateDataFormat;
  }

  public CertificateResource environmentIds(Set<String> environmentIds) {

    this.environmentIds = environmentIds;
    return this;
  }

  public CertificateResource addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<String>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public CertificateResource hasPrivateKey(Boolean hasPrivateKey) {

    this.hasPrivateKey = hasPrivateKey;
    return this;
  }

  /**
   * Get hasPrivateKey
   * @return hasPrivateKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasPrivateKey() {
    return hasPrivateKey;
  }

  public void setHasPrivateKey(Boolean hasPrivateKey) {
    this.hasPrivateKey = hasPrivateKey;
  }

  public CertificateResource id(String id) {

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

  public CertificateResource isExpired(Boolean isExpired) {

    this.isExpired = isExpired;
    return this;
  }

  /**
   * Get isExpired
   * @return isExpired
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Boolean isExpired) { this.isExpired = isExpired; }

  public CertificateResource issuerCommonName(String issuerCommonName) {

    this.issuerCommonName = issuerCommonName;
    return this;
  }

  /**
   * Get issuerCommonName
   * @return issuerCommonName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerCommonName() {
    return issuerCommonName;
  }

  public void setIssuerCommonName(String issuerCommonName) {
    this.issuerCommonName = issuerCommonName;
  }

  public CertificateResource
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

  public CertificateResource issuerOrganization(String issuerOrganization) {

    this.issuerOrganization = issuerOrganization;
    return this;
  }

  /**
   * Get issuerOrganization
   * @return issuerOrganization
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerOrganization() {
    return issuerOrganization;
  }

  public void setIssuerOrganization(String issuerOrganization) {
    this.issuerOrganization = issuerOrganization;
  }

  public CertificateResource lastModifiedBy(String lastModifiedBy) {

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

  public CertificateResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public CertificateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public CertificateResource putLinksItem(String key, String linksItem) {
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

  public CertificateResource name(String name) {

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

  public CertificateResource notAfter(OffsetDateTime notAfter) {

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

  public CertificateResource notBefore(OffsetDateTime notBefore) {

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

  public CertificateResource notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) { this.notes = notes; }

  public CertificateResource password(SensitiveValue password) {

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

  public CertificateResource replacedBy(String replacedBy) {

    this.replacedBy = replacedBy;
    return this;
  }

  /**
   * Get replacedBy
   * @return replacedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReplacedBy() {
    return replacedBy;
  }

  public void setReplacedBy(String replacedBy) { this.replacedBy = replacedBy; }

  public CertificateResource selfSigned(Boolean selfSigned) {

    this.selfSigned = selfSigned;
    return this;
  }

  /**
   * Get selfSigned
   * @return selfSigned
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSelfSigned() {
    return selfSigned;
  }

  public void setSelfSigned(Boolean selfSigned) {
    this.selfSigned = selfSigned;
  }

  public CertificateResource serialNumber(String serialNumber) {

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

  public CertificateResource
  signatureAlgorithmName(String signatureAlgorithmName) {

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

  public CertificateResource spaceId(String spaceId) {

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

  public CertificateResource
  subjectAlternativeNames(List<String> subjectAlternativeNames) {

    this.subjectAlternativeNames = subjectAlternativeNames;
    return this;
  }

  public CertificateResource
  addSubjectAlternativeNamesItem(String subjectAlternativeNamesItem) {
    if (this.subjectAlternativeNames == null) {
      this.subjectAlternativeNames = new ArrayList<String>();
    }
    this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
    return this;
  }

  /**
   * Get subjectAlternativeNames
   * @return subjectAlternativeNames
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubjectAlternativeNames() {
    return subjectAlternativeNames;
  }

  public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
  }

  public CertificateResource subjectCommonName(String subjectCommonName) {

    this.subjectCommonName = subjectCommonName;
    return this;
  }

  /**
   * Get subjectCommonName
   * @return subjectCommonName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectCommonName() {
    return subjectCommonName;
  }

  public void setSubjectCommonName(String subjectCommonName) {
    this.subjectCommonName = subjectCommonName;
  }

  public CertificateResource
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

  public CertificateResource subjectOrganization(String subjectOrganization) {

    this.subjectOrganization = subjectOrganization;
    return this;
  }

  /**
   * Get subjectOrganization
   * @return subjectOrganization
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectOrganization() {
    return subjectOrganization;
  }

  public void setSubjectOrganization(String subjectOrganization) {
    this.subjectOrganization = subjectOrganization;
  }

  public CertificateResource tenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {

    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
    return this;
  }

  /**
   * Get tenantedDeploymentParticipation
   * @return tenantedDeploymentParticipation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getTenantedDeploymentParticipation() {
    return tenantedDeploymentParticipation;
  }

  public void setTenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {
    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
  }

  public CertificateResource tenantIds(Set<String> tenantIds) {

    this.tenantIds = tenantIds;
    return this;
  }

  public CertificateResource addTenantIdsItem(String tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new LinkedHashSet<String>();
    }
    this.tenantIds.add(tenantIdsItem);
    return this;
  }

  /**
   * Get tenantIds
   * @return tenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantIds() {
    return tenantIds;
  }

  public void setTenantIds(Set<String> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public CertificateResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public CertificateResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<String>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(Set<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  public CertificateResource thumbprint(String thumbprint) {

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

  public CertificateResource version(Integer version) {

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
    CertificateResource certificateResource = (CertificateResource)o;
    return Objects.equals(this.archived, certificateResource.archived) &&
        Objects.equals(this.certificateChain,
                       certificateResource.certificateChain) &&
        Objects.equals(this.certificateData,
                       certificateResource.certificateData) &&
        Objects.equals(this.certificateDataFormat,
                       certificateResource.certificateDataFormat) &&
        Objects.equals(this.environmentIds,
                       certificateResource.environmentIds) &&
        Objects.equals(this.hasPrivateKey, certificateResource.hasPrivateKey) &&
        Objects.equals(this.id, certificateResource.id) &&
        Objects.equals(this.isExpired, certificateResource.isExpired) &&
        Objects.equals(this.issuerCommonName,
                       certificateResource.issuerCommonName) &&
        Objects.equals(this.issuerDistinguishedName,
                       certificateResource.issuerDistinguishedName) &&
        Objects.equals(this.issuerOrganization,
                       certificateResource.issuerOrganization) &&
        Objects.equals(this.lastModifiedBy,
                       certificateResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       certificateResource.lastModifiedOn) &&
        Objects.equals(this.links, certificateResource.links) &&
        Objects.equals(this.name, certificateResource.name) &&
        Objects.equals(this.notAfter, certificateResource.notAfter) &&
        Objects.equals(this.notBefore, certificateResource.notBefore) &&
        Objects.equals(this.notes, certificateResource.notes) &&
        Objects.equals(this.password, certificateResource.password) &&
        Objects.equals(this.replacedBy, certificateResource.replacedBy) &&
        Objects.equals(this.selfSigned, certificateResource.selfSigned) &&
        Objects.equals(this.serialNumber, certificateResource.serialNumber) &&
        Objects.equals(this.signatureAlgorithmName,
                       certificateResource.signatureAlgorithmName) &&
        Objects.equals(this.spaceId, certificateResource.spaceId) &&
        Objects.equals(this.subjectAlternativeNames,
                       certificateResource.subjectAlternativeNames) &&
        Objects.equals(this.subjectCommonName,
                       certificateResource.subjectCommonName) &&
        Objects.equals(this.subjectDistinguishedName,
                       certificateResource.subjectDistinguishedName) &&
        Objects.equals(this.subjectOrganization,
                       certificateResource.subjectOrganization) &&
        Objects.equals(this.tenantedDeploymentParticipation,
                       certificateResource.tenantedDeploymentParticipation) &&
        Objects.equals(this.tenantIds, certificateResource.tenantIds) &&
        Objects.equals(this.tenantTags, certificateResource.tenantTags) &&
        Objects.equals(this.thumbprint, certificateResource.thumbprint) &&
        Objects.equals(this.version, certificateResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archived, certificateChain, certificateData, certificateDataFormat,
        environmentIds, hasPrivateKey, id, isExpired, issuerCommonName,
        issuerDistinguishedName, issuerOrganization, lastModifiedBy,
        lastModifiedOn, links, name, notAfter, notBefore, notes, password,
        replacedBy, selfSigned, serialNumber, signatureAlgorithmName, spaceId,
        subjectAlternativeNames, subjectCommonName, subjectDistinguishedName,
        subjectOrganization, tenantedDeploymentParticipation, tenantIds,
        tenantTags, thumbprint, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateResource {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    certificateChain: ")
        .append(toIndentedString(certificateChain))
        .append("\n");
    sb.append("    certificateData: ")
        .append(toIndentedString(certificateData))
        .append("\n");
    sb.append("    certificateDataFormat: ")
        .append(toIndentedString(certificateDataFormat))
        .append("\n");
    sb.append("    environmentIds: ")
        .append(toIndentedString(environmentIds))
        .append("\n");
    sb.append("    hasPrivateKey: ")
        .append(toIndentedString(hasPrivateKey))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isExpired: ")
        .append(toIndentedString(isExpired))
        .append("\n");
    sb.append("    issuerCommonName: ")
        .append(toIndentedString(issuerCommonName))
        .append("\n");
    sb.append("    issuerDistinguishedName: ")
        .append(toIndentedString(issuerDistinguishedName))
        .append("\n");
    sb.append("    issuerOrganization: ")
        .append(toIndentedString(issuerOrganization))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ")
        .append(toIndentedString(notBefore))
        .append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    replacedBy: ")
        .append(toIndentedString(replacedBy))
        .append("\n");
    sb.append("    selfSigned: ")
        .append(toIndentedString(selfSigned))
        .append("\n");
    sb.append("    serialNumber: ")
        .append(toIndentedString(serialNumber))
        .append("\n");
    sb.append("    signatureAlgorithmName: ")
        .append(toIndentedString(signatureAlgorithmName))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    subjectAlternativeNames: ")
        .append(toIndentedString(subjectAlternativeNames))
        .append("\n");
    sb.append("    subjectCommonName: ")
        .append(toIndentedString(subjectCommonName))
        .append("\n");
    sb.append("    subjectDistinguishedName: ")
        .append(toIndentedString(subjectDistinguishedName))
        .append("\n");
    sb.append("    subjectOrganization: ")
        .append(toIndentedString(subjectOrganization))
        .append("\n");
    sb.append("    tenantedDeploymentParticipation: ")
        .append(toIndentedString(tenantedDeploymentParticipation))
        .append("\n");
    sb.append("    tenantIds: ")
        .append(toIndentedString(tenantIds))
        .append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
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
