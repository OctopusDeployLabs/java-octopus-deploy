// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LicenseLimitStatusResource;
import com.octopus.client.model.LicenseMessageResource;
import com.octopus.client.model.PermissionsMode;
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
 * LicenseStatusResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LicenseStatusResource {
  public static final String SERIALIZED_NAME_COMPLIANCE_SUMMARY =
      "ComplianceSummary";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_SUMMARY)
  private String complianceSummary;

  public static final String SERIALIZED_NAME_DAYS_TO_EFFECTIVE_EXPIRY_DATE =
      "DaysToEffectiveExpiryDate";
  @SerializedName(SERIALIZED_NAME_DAYS_TO_EFFECTIVE_EXPIRY_DATE)
  private Integer daysToEffectiveExpiryDate;

  public static final String SERIALIZED_NAME_DOES_EXPIRY_BLOCK_KEY_ACTIVITIES =
      "DoesExpiryBlockKeyActivities";
  @SerializedName(SERIALIZED_NAME_DOES_EXPIRY_BLOCK_KEY_ACTIVITIES)
  private Boolean doesExpiryBlockKeyActivities;

  public static final String SERIALIZED_NAME_EFFECTIVE_CLUSTER_TASK_LIMIT =
      "EffectiveClusterTaskLimit";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_CLUSTER_TASK_LIMIT)
  private Integer effectiveClusterTaskLimit;

  public static final String SERIALIZED_NAME_EFFECTIVE_EXPIRY_DATE =
      "EffectiveExpiryDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_EXPIRY_DATE)
  private org.threeten.bp.LocalDate effectiveExpiryDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_NODE_TASK_LIMIT =
      "EffectiveNodeTaskLimit";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_NODE_TASK_LIMIT)
  private Integer effectiveNodeTaskLimit;

  public static final String SERIALIZED_NAME_HOSTING_ENVIRONMENT =
      "HostingEnvironment";
  @SerializedName(SERIALIZED_NAME_HOSTING_ENVIRONMENT)
  private String hostingEnvironment;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String
      SERIALIZED_NAME_IS_CLUSTER_TASK_LIMIT_CONTROLLED_BY_LICENSE =
          "IsClusterTaskLimitControlledByLicense";
  @SerializedName(SERIALIZED_NAME_IS_CLUSTER_TASK_LIMIT_CONTROLLED_BY_LICENSE)
  private Boolean isClusterTaskLimitControlledByLicense;

  public static final String SERIALIZED_NAME_IS_COMPLIANT = "IsCompliant";
  @SerializedName(SERIALIZED_NAME_IS_COMPLIANT) private Boolean isCompliant;

  public static final String
      SERIALIZED_NAME_IS_NODE_TASK_LIMIT_CONTROLLED_BY_LICENSE =
          "IsNodeTaskLimitControlledByLicense";
  @SerializedName(SERIALIZED_NAME_IS_NODE_TASK_LIMIT_CONTROLLED_BY_LICENSE)
  private Boolean isNodeTaskLimitControlledByLicense;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LIMITS = "Limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LicenseLimitStatusResource> limits = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_MESSAGES = "Messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<LicenseMessageResource> messages = null;

  public static final String SERIALIZED_NAME_PERMISSIONS_MODE =
      "PermissionsMode";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_MODE)
  private PermissionsMode permissionsMode;

  public LicenseStatusResource complianceSummary(String complianceSummary) {

    this.complianceSummary = complianceSummary;
    return this;
  }

  /**
   * Get complianceSummary
   * @return complianceSummary
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComplianceSummary() {
    return complianceSummary;
  }

  public void setComplianceSummary(String complianceSummary) {
    this.complianceSummary = complianceSummary;
  }

  public LicenseStatusResource
  daysToEffectiveExpiryDate(Integer daysToEffectiveExpiryDate) {

    this.daysToEffectiveExpiryDate = daysToEffectiveExpiryDate;
    return this;
  }

  /**
   * Get daysToEffectiveExpiryDate
   * @return daysToEffectiveExpiryDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDaysToEffectiveExpiryDate() {
    return daysToEffectiveExpiryDate;
  }

  public void setDaysToEffectiveExpiryDate(Integer daysToEffectiveExpiryDate) {
    this.daysToEffectiveExpiryDate = daysToEffectiveExpiryDate;
  }

  public LicenseStatusResource
  doesExpiryBlockKeyActivities(Boolean doesExpiryBlockKeyActivities) {

    this.doesExpiryBlockKeyActivities = doesExpiryBlockKeyActivities;
    return this;
  }

  /**
   * Get doesExpiryBlockKeyActivities
   * @return doesExpiryBlockKeyActivities
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDoesExpiryBlockKeyActivities() {
    return doesExpiryBlockKeyActivities;
  }

  public void
  setDoesExpiryBlockKeyActivities(Boolean doesExpiryBlockKeyActivities) {
    this.doesExpiryBlockKeyActivities = doesExpiryBlockKeyActivities;
  }

  public LicenseStatusResource
  effectiveClusterTaskLimit(Integer effectiveClusterTaskLimit) {

    this.effectiveClusterTaskLimit = effectiveClusterTaskLimit;
    return this;
  }

  /**
   * Get effectiveClusterTaskLimit
   * @return effectiveClusterTaskLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEffectiveClusterTaskLimit() {
    return effectiveClusterTaskLimit;
  }

  public void setEffectiveClusterTaskLimit(Integer effectiveClusterTaskLimit) {
    this.effectiveClusterTaskLimit = effectiveClusterTaskLimit;
  }

  public LicenseStatusResource
  effectiveExpiryDate(org.threeten.bp.LocalDate effectiveExpiryDate) {

    this.effectiveExpiryDate = effectiveExpiryDate;
    return this;
  }

  /**
   * Get effectiveExpiryDate
   * @return effectiveExpiryDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.threeten.bp.LocalDate getEffectiveExpiryDate() {
    return effectiveExpiryDate;
  }

  public void
  setEffectiveExpiryDate(org.threeten.bp.LocalDate effectiveExpiryDate) {
    this.effectiveExpiryDate = effectiveExpiryDate;
  }

  public LicenseStatusResource
  effectiveNodeTaskLimit(Integer effectiveNodeTaskLimit) {

    this.effectiveNodeTaskLimit = effectiveNodeTaskLimit;
    return this;
  }

  /**
   * Get effectiveNodeTaskLimit
   * @return effectiveNodeTaskLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEffectiveNodeTaskLimit() {
    return effectiveNodeTaskLimit;
  }

  public void setEffectiveNodeTaskLimit(Integer effectiveNodeTaskLimit) {
    this.effectiveNodeTaskLimit = effectiveNodeTaskLimit;
  }

  public LicenseStatusResource hostingEnvironment(String hostingEnvironment) {

    this.hostingEnvironment = hostingEnvironment;
    return this;
  }

  /**
   * Get hostingEnvironment
   * @return hostingEnvironment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostingEnvironment() {
    return hostingEnvironment;
  }

  public void setHostingEnvironment(String hostingEnvironment) {
    this.hostingEnvironment = hostingEnvironment;
  }

  public LicenseStatusResource id(String id) {

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

  public LicenseStatusResource isClusterTaskLimitControlledByLicense(
      Boolean isClusterTaskLimitControlledByLicense) {

    this.isClusterTaskLimitControlledByLicense =
        isClusterTaskLimitControlledByLicense;
    return this;
  }

  /**
   * Get isClusterTaskLimitControlledByLicense
   * @return isClusterTaskLimitControlledByLicense
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsClusterTaskLimitControlledByLicense() {
    return isClusterTaskLimitControlledByLicense;
  }

  public void setIsClusterTaskLimitControlledByLicense(
      Boolean isClusterTaskLimitControlledByLicense) {
    this.isClusterTaskLimitControlledByLicense =
        isClusterTaskLimitControlledByLicense;
  }

  public LicenseStatusResource isCompliant(Boolean isCompliant) {

    this.isCompliant = isCompliant;
    return this;
  }

  /**
   * Get isCompliant
   * @return isCompliant
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCompliant() {
    return isCompliant;
  }

  public void setIsCompliant(Boolean isCompliant) {
    this.isCompliant = isCompliant;
  }

  public LicenseStatusResource isNodeTaskLimitControlledByLicense(
      Boolean isNodeTaskLimitControlledByLicense) {

    this.isNodeTaskLimitControlledByLicense =
        isNodeTaskLimitControlledByLicense;
    return this;
  }

  /**
   * Get isNodeTaskLimitControlledByLicense
   * @return isNodeTaskLimitControlledByLicense
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNodeTaskLimitControlledByLicense() {
    return isNodeTaskLimitControlledByLicense;
  }

  public void setIsNodeTaskLimitControlledByLicense(
      Boolean isNodeTaskLimitControlledByLicense) {
    this.isNodeTaskLimitControlledByLicense =
        isNodeTaskLimitControlledByLicense;
  }

  public LicenseStatusResource lastModifiedBy(String lastModifiedBy) {

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

  public LicenseStatusResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public LicenseStatusResource limits(List<LicenseLimitStatusResource> limits) {

    this.limits = limits;
    return this;
  }

  public LicenseStatusResource
  addLimitsItem(LicenseLimitStatusResource limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LicenseLimitStatusResource>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * @return limits
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LicenseLimitStatusResource> getLimits() {
    return limits;
  }

  public void setLimits(List<LicenseLimitStatusResource> limits) {
    this.limits = limits;
  }

  public LicenseStatusResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LicenseStatusResource putLinksItem(String key, String linksItem) {
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

  public LicenseStatusResource messages(List<LicenseMessageResource> messages) {

    this.messages = messages;
    return this;
  }

  public LicenseStatusResource
  addMessagesItem(LicenseMessageResource messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<LicenseMessageResource>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LicenseMessageResource> getMessages() {
    return messages;
  }

  public void setMessages(List<LicenseMessageResource> messages) {
    this.messages = messages;
  }

  public LicenseStatusResource
  permissionsMode(PermissionsMode permissionsMode) {

    this.permissionsMode = permissionsMode;
    return this;
  }

  /**
   * Get permissionsMode
   * @return permissionsMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionsMode getPermissionsMode() {
    return permissionsMode;
  }

  public void setPermissionsMode(PermissionsMode permissionsMode) {
    this.permissionsMode = permissionsMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseStatusResource licenseStatusResource = (LicenseStatusResource)o;
    return Objects.equals(this.complianceSummary,
                          licenseStatusResource.complianceSummary) &&
        Objects.equals(this.daysToEffectiveExpiryDate,
                       licenseStatusResource.daysToEffectiveExpiryDate) &&
        Objects.equals(this.doesExpiryBlockKeyActivities,
                       licenseStatusResource.doesExpiryBlockKeyActivities) &&
        Objects.equals(this.effectiveClusterTaskLimit,
                       licenseStatusResource.effectiveClusterTaskLimit) &&
        Objects.equals(this.effectiveExpiryDate,
                       licenseStatusResource.effectiveExpiryDate) &&
        Objects.equals(this.effectiveNodeTaskLimit,
                       licenseStatusResource.effectiveNodeTaskLimit) &&
        Objects.equals(this.hostingEnvironment,
                       licenseStatusResource.hostingEnvironment) &&
        Objects.equals(this.id, licenseStatusResource.id) &&
        Objects.equals(
            this.isClusterTaskLimitControlledByLicense,
            licenseStatusResource.isClusterTaskLimitControlledByLicense) &&
        Objects.equals(this.isCompliant, licenseStatusResource.isCompliant) &&
        Objects.equals(
            this.isNodeTaskLimitControlledByLicense,
            licenseStatusResource.isNodeTaskLimitControlledByLicense) &&
        Objects.equals(this.lastModifiedBy,
                       licenseStatusResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       licenseStatusResource.lastModifiedOn) &&
        Objects.equals(this.limits, licenseStatusResource.limits) &&
        Objects.equals(this.links, licenseStatusResource.links) &&
        Objects.equals(this.messages, licenseStatusResource.messages) &&
        Objects.equals(this.permissionsMode,
                       licenseStatusResource.permissionsMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        complianceSummary, daysToEffectiveExpiryDate,
        doesExpiryBlockKeyActivities, effectiveClusterTaskLimit,
        effectiveExpiryDate, effectiveNodeTaskLimit, hostingEnvironment, id,
        isClusterTaskLimitControlledByLicense, isCompliant,
        isNodeTaskLimitControlledByLicense, lastModifiedBy, lastModifiedOn,
        limits, links, messages, permissionsMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseStatusResource {\n");
    sb.append("    complianceSummary: ")
        .append(toIndentedString(complianceSummary))
        .append("\n");
    sb.append("    daysToEffectiveExpiryDate: ")
        .append(toIndentedString(daysToEffectiveExpiryDate))
        .append("\n");
    sb.append("    doesExpiryBlockKeyActivities: ")
        .append(toIndentedString(doesExpiryBlockKeyActivities))
        .append("\n");
    sb.append("    effectiveClusterTaskLimit: ")
        .append(toIndentedString(effectiveClusterTaskLimit))
        .append("\n");
    sb.append("    effectiveExpiryDate: ")
        .append(toIndentedString(effectiveExpiryDate))
        .append("\n");
    sb.append("    effectiveNodeTaskLimit: ")
        .append(toIndentedString(effectiveNodeTaskLimit))
        .append("\n");
    sb.append("    hostingEnvironment: ")
        .append(toIndentedString(hostingEnvironment))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isClusterTaskLimitControlledByLicense: ")
        .append(toIndentedString(isClusterTaskLimitControlledByLicense))
        .append("\n");
    sb.append("    isCompliant: ")
        .append(toIndentedString(isCompliant))
        .append("\n");
    sb.append("    isNodeTaskLimitControlledByLicense: ")
        .append(toIndentedString(isNodeTaskLimitControlledByLicense))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    permissionsMode: ")
        .append(toIndentedString(permissionsMode))
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
