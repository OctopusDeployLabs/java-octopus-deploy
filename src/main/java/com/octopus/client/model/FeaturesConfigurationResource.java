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
 * FeaturesConfigurationResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class FeaturesConfigurationResource {
  public static final String SERIALIZED_NAME_HELP_SIDEBAR_SUPPORT_LINK =
      "HelpSidebarSupportLink";
  @SerializedName(SERIALIZED_NAME_HELP_SIDEBAR_SUPPORT_LINK)
  private String helpSidebarSupportLink;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_ACTION_CONTAINERS_ENABLED =
      "IsActionContainersEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ACTION_CONTAINERS_ENABLED)
  private Boolean isActionContainersEnabled;

  public static final String SERIALIZED_NAME_IS_AZURE_ZIP_DEPLOY_ENABLED =
      "IsAzureZipDeployEnabled";
  @SerializedName(SERIALIZED_NAME_IS_AZURE_ZIP_DEPLOY_ENABLED)
  private Boolean isAzureZipDeployEnabled;

  public static final String SERIALIZED_NAME_IS_BUILT_IN_WORKER_ENABLED =
      "IsBuiltInWorkerEnabled";
  @SerializedName(SERIALIZED_NAME_IS_BUILT_IN_WORKER_ENABLED)
  private Boolean isBuiltInWorkerEnabled;

  public static final String
      SERIALIZED_NAME_IS_COMMUNITY_ACTION_TEMPLATES_ENABLED =
          "IsCommunityActionTemplatesEnabled";
  @SerializedName(SERIALIZED_NAME_IS_COMMUNITY_ACTION_TEMPLATES_ENABLED)
  private Boolean isCommunityActionTemplatesEnabled;

  public static final String SERIALIZED_NAME_IS_CONFIGURATION_AS_CODE_ENABLED =
      "IsConfigurationAsCodeEnabled";
  @SerializedName(SERIALIZED_NAME_IS_CONFIGURATION_AS_CODE_ENABLED)
  private Boolean isConfigurationAsCodeEnabled;

  public static final String SERIALIZED_NAME_IS_HELP_SIDEBAR_ENABLED =
      "IsHelpSidebarEnabled";
  @SerializedName(SERIALIZED_NAME_IS_HELP_SIDEBAR_ENABLED)
  private Boolean isHelpSidebarEnabled;

  public static final String SERIALIZED_NAME_IS_KUBERNETES_ENABLED =
      "IsKubernetesEnabled";
  @SerializedName(SERIALIZED_NAME_IS_KUBERNETES_ENABLED)
  private Boolean isKubernetesEnabled;

  public static final String SERIALIZED_NAME_IS_STEP_UI_FRAMEWORK_ENABLED =
      "IsStepUiFrameworkEnabled";
  @SerializedName(SERIALIZED_NAME_IS_STEP_UI_FRAMEWORK_ENABLED)
  private Boolean isStepUiFrameworkEnabled;

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

  public FeaturesConfigurationResource
  helpSidebarSupportLink(String helpSidebarSupportLink) {

    this.helpSidebarSupportLink = helpSidebarSupportLink;
    return this;
  }

  /**
   * Get helpSidebarSupportLink
   * @return helpSidebarSupportLink
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpSidebarSupportLink() {
    return helpSidebarSupportLink;
  }

  public void setHelpSidebarSupportLink(String helpSidebarSupportLink) {
    this.helpSidebarSupportLink = helpSidebarSupportLink;
  }

  public FeaturesConfigurationResource id(String id) {

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

  public FeaturesConfigurationResource
  isActionContainersEnabled(Boolean isActionContainersEnabled) {

    this.isActionContainersEnabled = isActionContainersEnabled;
    return this;
  }

  /**
   * Get isActionContainersEnabled
   * @return isActionContainersEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActionContainersEnabled() {
    return isActionContainersEnabled;
  }

  public void setIsActionContainersEnabled(Boolean isActionContainersEnabled) {
    this.isActionContainersEnabled = isActionContainersEnabled;
  }

  public FeaturesConfigurationResource
  isAzureZipDeployEnabled(Boolean isAzureZipDeployEnabled) {

    this.isAzureZipDeployEnabled = isAzureZipDeployEnabled;
    return this;
  }

  /**
   * Get isAzureZipDeployEnabled
   * @return isAzureZipDeployEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAzureZipDeployEnabled() {
    return isAzureZipDeployEnabled;
  }

  public void setIsAzureZipDeployEnabled(Boolean isAzureZipDeployEnabled) {
    this.isAzureZipDeployEnabled = isAzureZipDeployEnabled;
  }

  public FeaturesConfigurationResource
  isBuiltInWorkerEnabled(Boolean isBuiltInWorkerEnabled) {

    this.isBuiltInWorkerEnabled = isBuiltInWorkerEnabled;
    return this;
  }

  /**
   * Get isBuiltInWorkerEnabled
   * @return isBuiltInWorkerEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBuiltInWorkerEnabled() {
    return isBuiltInWorkerEnabled;
  }

  public void setIsBuiltInWorkerEnabled(Boolean isBuiltInWorkerEnabled) {
    this.isBuiltInWorkerEnabled = isBuiltInWorkerEnabled;
  }

  public FeaturesConfigurationResource
  isCommunityActionTemplatesEnabled(Boolean isCommunityActionTemplatesEnabled) {

    this.isCommunityActionTemplatesEnabled = isCommunityActionTemplatesEnabled;
    return this;
  }

  /**
   * Get isCommunityActionTemplatesEnabled
   * @return isCommunityActionTemplatesEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCommunityActionTemplatesEnabled() {
    return isCommunityActionTemplatesEnabled;
  }

  public void setIsCommunityActionTemplatesEnabled(
      Boolean isCommunityActionTemplatesEnabled) {
    this.isCommunityActionTemplatesEnabled = isCommunityActionTemplatesEnabled;
  }

  public FeaturesConfigurationResource
  isConfigurationAsCodeEnabled(Boolean isConfigurationAsCodeEnabled) {

    this.isConfigurationAsCodeEnabled = isConfigurationAsCodeEnabled;
    return this;
  }

  /**
   * Get isConfigurationAsCodeEnabled
   * @return isConfigurationAsCodeEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsConfigurationAsCodeEnabled() {
    return isConfigurationAsCodeEnabled;
  }

  public void
  setIsConfigurationAsCodeEnabled(Boolean isConfigurationAsCodeEnabled) {
    this.isConfigurationAsCodeEnabled = isConfigurationAsCodeEnabled;
  }

  public FeaturesConfigurationResource
  isHelpSidebarEnabled(Boolean isHelpSidebarEnabled) {

    this.isHelpSidebarEnabled = isHelpSidebarEnabled;
    return this;
  }

  /**
   * Get isHelpSidebarEnabled
   * @return isHelpSidebarEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsHelpSidebarEnabled() {
    return isHelpSidebarEnabled;
  }

  public void setIsHelpSidebarEnabled(Boolean isHelpSidebarEnabled) {
    this.isHelpSidebarEnabled = isHelpSidebarEnabled;
  }

  public FeaturesConfigurationResource
  isKubernetesEnabled(Boolean isKubernetesEnabled) {

    this.isKubernetesEnabled = isKubernetesEnabled;
    return this;
  }

  /**
   * Get isKubernetesEnabled
   * @return isKubernetesEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsKubernetesEnabled() {
    return isKubernetesEnabled;
  }

  public void setIsKubernetesEnabled(Boolean isKubernetesEnabled) {
    this.isKubernetesEnabled = isKubernetesEnabled;
  }

  public FeaturesConfigurationResource
  isStepUiFrameworkEnabled(Boolean isStepUiFrameworkEnabled) {

    this.isStepUiFrameworkEnabled = isStepUiFrameworkEnabled;
    return this;
  }

  /**
   * Get isStepUiFrameworkEnabled
   * @return isStepUiFrameworkEnabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsStepUiFrameworkEnabled() {
    return isStepUiFrameworkEnabled;
  }

  public void setIsStepUiFrameworkEnabled(Boolean isStepUiFrameworkEnabled) {
    this.isStepUiFrameworkEnabled = isStepUiFrameworkEnabled;
  }

  public FeaturesConfigurationResource lastModifiedBy(String lastModifiedBy) {

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

  public FeaturesConfigurationResource
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

  public FeaturesConfigurationResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public FeaturesConfigurationResource putLinksItem(String key,
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesConfigurationResource featuresConfigurationResource =
        (FeaturesConfigurationResource)o;
    return Objects.equals(
               this.helpSidebarSupportLink,
               featuresConfigurationResource.helpSidebarSupportLink) &&
        Objects.equals(this.id, featuresConfigurationResource.id) &&
        Objects.equals(
            this.isActionContainersEnabled,
            featuresConfigurationResource.isActionContainersEnabled) &&
        Objects.equals(this.isAzureZipDeployEnabled,
                       featuresConfigurationResource.isAzureZipDeployEnabled) &&
        Objects.equals(this.isBuiltInWorkerEnabled,
                       featuresConfigurationResource.isBuiltInWorkerEnabled) &&
        Objects.equals(
            this.isCommunityActionTemplatesEnabled,
            featuresConfigurationResource.isCommunityActionTemplatesEnabled) &&
        Objects.equals(
            this.isConfigurationAsCodeEnabled,
            featuresConfigurationResource.isConfigurationAsCodeEnabled) &&
        Objects.equals(this.isHelpSidebarEnabled,
                       featuresConfigurationResource.isHelpSidebarEnabled) &&
        Objects.equals(this.isKubernetesEnabled,
                       featuresConfigurationResource.isKubernetesEnabled) &&
        Objects.equals(
            this.isStepUiFrameworkEnabled,
            featuresConfigurationResource.isStepUiFrameworkEnabled) &&
        Objects.equals(this.lastModifiedBy,
                       featuresConfigurationResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       featuresConfigurationResource.lastModifiedOn) &&
        Objects.equals(this.links, featuresConfigurationResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helpSidebarSupportLink, id, isActionContainersEnabled,
                        isAzureZipDeployEnabled, isBuiltInWorkerEnabled,
                        isCommunityActionTemplatesEnabled,
                        isConfigurationAsCodeEnabled, isHelpSidebarEnabled,
                        isKubernetesEnabled, isStepUiFrameworkEnabled,
                        lastModifiedBy, lastModifiedOn, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesConfigurationResource {\n");
    sb.append("    helpSidebarSupportLink: ")
        .append(toIndentedString(helpSidebarSupportLink))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActionContainersEnabled: ")
        .append(toIndentedString(isActionContainersEnabled))
        .append("\n");
    sb.append("    isAzureZipDeployEnabled: ")
        .append(toIndentedString(isAzureZipDeployEnabled))
        .append("\n");
    sb.append("    isBuiltInWorkerEnabled: ")
        .append(toIndentedString(isBuiltInWorkerEnabled))
        .append("\n");
    sb.append("    isCommunityActionTemplatesEnabled: ")
        .append(toIndentedString(isCommunityActionTemplatesEnabled))
        .append("\n");
    sb.append("    isConfigurationAsCodeEnabled: ")
        .append(toIndentedString(isConfigurationAsCodeEnabled))
        .append("\n");
    sb.append("    isHelpSidebarEnabled: ")
        .append(toIndentedString(isHelpSidebarEnabled))
        .append("\n");
    sb.append("    isKubernetesEnabled: ")
        .append(toIndentedString(isKubernetesEnabled))
        .append("\n");
    sb.append("    isStepUiFrameworkEnabled: ")
        .append(toIndentedString(isStepUiFrameworkEnabled))
        .append("\n");
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
