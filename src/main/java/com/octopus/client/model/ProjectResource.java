// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionTemplateParameterResource;
import com.octopus.client.model.AutoDeployReleaseOverrideResource;
import com.octopus.client.model.DeploymentConnectivityPolicy;
import com.octopus.client.model.ExtensionSettingsValues;
import com.octopus.client.model.GuidedFailureMode;
import com.octopus.client.model.PersistenceSettingsResource;
import com.octopus.client.model.ReleaseCreationStrategyResource;
import com.octopus.client.model.TenantedDeploymentMode;
import com.octopus.client.model.VersioningStrategyResource;
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
 * ProjectResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProjectResource {
  public static final String SERIALIZED_NAME_AUTO_CREATE_RELEASE =
      "AutoCreateRelease";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_RELEASE)
  private Boolean autoCreateRelease;

  public static final String SERIALIZED_NAME_AUTO_DEPLOY_RELEASE_OVERRIDES =
      "AutoDeployReleaseOverrides";
  @SerializedName(SERIALIZED_NAME_AUTO_DEPLOY_RELEASE_OVERRIDES)
  private Set<AutoDeployReleaseOverrideResource> autoDeployReleaseOverrides =
      null;

  public static final String SERIALIZED_NAME_CLONED_FROM_PROJECT_ID =
      "ClonedFromProjectId";
  @SerializedName(SERIALIZED_NAME_CLONED_FROM_PROJECT_ID)
  private String clonedFromProjectId;

  public static final String SERIALIZED_NAME_DEFAULT_GUIDED_FAILURE_MODE =
      "DefaultGuidedFailureMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GUIDED_FAILURE_MODE)
  private GuidedFailureMode defaultGuidedFailureMode;

  public static final String
      SERIALIZED_NAME_DEFAULT_TO_SKIP_IF_ALREADY_INSTALLED =
          "DefaultToSkipIfAlreadyInstalled";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TO_SKIP_IF_ALREADY_INSTALLED)
  private Boolean defaultToSkipIfAlreadyInstalled;

  public static final String SERIALIZED_NAME_DEPLOYMENT_CHANGES_TEMPLATE =
      "DeploymentChangesTemplate";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_CHANGES_TEMPLATE)
  private String deploymentChangesTemplate;

  public static final String SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID =
      "DeploymentProcessId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID)
  private String deploymentProcessId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_DISCRETE_CHANNEL_RELEASE =
      "DiscreteChannelRelease";
  @SerializedName(SERIALIZED_NAME_DISCRETE_CHANNEL_RELEASE)
  private Boolean discreteChannelRelease;

  public static final String SERIALIZED_NAME_EXTENSION_SETTINGS =
      "ExtensionSettings";
  @SerializedName(SERIALIZED_NAME_EXTENSION_SETTINGS)
  private List<ExtensionSettingsValues> extensionSettings = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_INCLUDED_LIBRARY_VARIABLE_SET_IDS =
      "IncludedLibraryVariableSetIds";
  @SerializedName(SERIALIZED_NAME_INCLUDED_LIBRARY_VARIABLE_SET_IDS)
  private List<String> includedLibraryVariableSetIds = null;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

  public static final String SERIALIZED_NAME_IS_VERSION_CONTROLLED =
      "IsVersionControlled";
  @SerializedName(SERIALIZED_NAME_IS_VERSION_CONTROLLED)
  private Boolean isVersionControlled;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LIFECYCLE_ID = "LifecycleId";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_ID) private String lifecycleId;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PERSISTENCE_SETTINGS =
      "PersistenceSettings";
  @SerializedName(SERIALIZED_NAME_PERSISTENCE_SETTINGS)
  private PersistenceSettingsResource persistenceSettings;

  public static final String SERIALIZED_NAME_PROJECT_CONNECTIVITY_POLICY =
      "ProjectConnectivityPolicy";
  @SerializedName(SERIALIZED_NAME_PROJECT_CONNECTIVITY_POLICY)
  private DeploymentConnectivityPolicy projectConnectivityPolicy;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_ID =
      "ProjectGroupId";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_ID)
  private String projectGroupId;

  public static final String SERIALIZED_NAME_RELEASE_CREATION_STRATEGY =
      "ReleaseCreationStrategy";
  @SerializedName(SERIALIZED_NAME_RELEASE_CREATION_STRATEGY)
  private ReleaseCreationStrategyResource releaseCreationStrategy;

  public static final String SERIALIZED_NAME_RELEASE_NOTES_TEMPLATE =
      "ReleaseNotesTemplate";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES_TEMPLATE)
  private String releaseNotesTemplate;

  public static final String SERIALIZED_NAME_SLUG = "Slug";
  @SerializedName(SERIALIZED_NAME_SLUG) private String slug;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TEMPLATES = "Templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<ActionTemplateParameterResource> templates = null;

  public static final String SERIALIZED_NAME_TENANTED_DEPLOYMENT_MODE =
      "TenantedDeploymentMode";
  @SerializedName(SERIALIZED_NAME_TENANTED_DEPLOYMENT_MODE)
  private TenantedDeploymentMode tenantedDeploymentMode;

  public static final String SERIALIZED_NAME_VARIABLE_SET_ID = "VariableSetId";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SET_ID) private String variableSetId;

  public static final String SERIALIZED_NAME_VERSIONING_STRATEGY =
      "VersioningStrategy";
  @SerializedName(SERIALIZED_NAME_VERSIONING_STRATEGY)
  private VersioningStrategyResource versioningStrategy;

  public ProjectResource autoCreateRelease(Boolean autoCreateRelease) {

    this.autoCreateRelease = autoCreateRelease;
    return this;
  }

  /**
   * Get autoCreateRelease
   * @return autoCreateRelease
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoCreateRelease() {
    return autoCreateRelease;
  }

  public void setAutoCreateRelease(Boolean autoCreateRelease) {
    this.autoCreateRelease = autoCreateRelease;
  }

  /**
   * Get autoDeployReleaseOverrides
   * @return autoDeployReleaseOverrides
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<AutoDeployReleaseOverrideResource>
  getAutoDeployReleaseOverrides() {
    return autoDeployReleaseOverrides;
  }

  public ProjectResource clonedFromProjectId(String clonedFromProjectId) {

    this.clonedFromProjectId = clonedFromProjectId;
    return this;
  }

  /**
   * Get clonedFromProjectId
   * @return clonedFromProjectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClonedFromProjectId() {
    return clonedFromProjectId;
  }

  public void setClonedFromProjectId(String clonedFromProjectId) {
    this.clonedFromProjectId = clonedFromProjectId;
  }

  public ProjectResource
  defaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {

    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
    return this;
  }

  /**
   * Get defaultGuidedFailureMode
   * @return defaultGuidedFailureMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GuidedFailureMode getDefaultGuidedFailureMode() {
    return defaultGuidedFailureMode;
  }

  public void
  setDefaultGuidedFailureMode(GuidedFailureMode defaultGuidedFailureMode) {
    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
  }

  public ProjectResource
  defaultToSkipIfAlreadyInstalled(Boolean defaultToSkipIfAlreadyInstalled) {

    this.defaultToSkipIfAlreadyInstalled = defaultToSkipIfAlreadyInstalled;
    return this;
  }

  /**
   * Get defaultToSkipIfAlreadyInstalled
   * @return defaultToSkipIfAlreadyInstalled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultToSkipIfAlreadyInstalled() {
    return defaultToSkipIfAlreadyInstalled;
  }

  public void
  setDefaultToSkipIfAlreadyInstalled(Boolean defaultToSkipIfAlreadyInstalled) {
    this.defaultToSkipIfAlreadyInstalled = defaultToSkipIfAlreadyInstalled;
  }

  public ProjectResource
  deploymentChangesTemplate(String deploymentChangesTemplate) {

    this.deploymentChangesTemplate = deploymentChangesTemplate;
    return this;
  }

  /**
   * Get deploymentChangesTemplate
   * @return deploymentChangesTemplate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentChangesTemplate() {
    return deploymentChangesTemplate;
  }

  public void setDeploymentChangesTemplate(String deploymentChangesTemplate) {
    this.deploymentChangesTemplate = deploymentChangesTemplate;
  }

  public ProjectResource deploymentProcessId(String deploymentProcessId) {

    this.deploymentProcessId = deploymentProcessId;
    return this;
  }

  /**
   * Get deploymentProcessId
   * @return deploymentProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public void setDeploymentProcessId(String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public ProjectResource description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectResource
  discreteChannelRelease(Boolean discreteChannelRelease) {

    this.discreteChannelRelease = discreteChannelRelease;
    return this;
  }

  /**
   * Get discreteChannelRelease
   * @return discreteChannelRelease
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDiscreteChannelRelease() {
    return discreteChannelRelease;
  }

  public void setDiscreteChannelRelease(Boolean discreteChannelRelease) {
    this.discreteChannelRelease = discreteChannelRelease;
  }

  /**
   * Get extensionSettings
   * @return extensionSettings
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtensionSettingsValues> getExtensionSettings() {
    return extensionSettings;
  }

  public ProjectResource id(String id) {

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

  public ProjectResource
  includedLibraryVariableSetIds(List<String> includedLibraryVariableSetIds) {

    this.includedLibraryVariableSetIds = includedLibraryVariableSetIds;
    return this;
  }

  public ProjectResource addIncludedLibraryVariableSetIdsItem(
      String includedLibraryVariableSetIdsItem) {
    if (this.includedLibraryVariableSetIds == null) {
      this.includedLibraryVariableSetIds = new ArrayList<String>();
    }
    this.includedLibraryVariableSetIds.add(includedLibraryVariableSetIdsItem);
    return this;
  }

  /**
   * Get includedLibraryVariableSetIds
   * @return includedLibraryVariableSetIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncludedLibraryVariableSetIds() {
    return includedLibraryVariableSetIds;
  }

  public void
  setIncludedLibraryVariableSetIds(List<String> includedLibraryVariableSetIds) {
    this.includedLibraryVariableSetIds = includedLibraryVariableSetIds;
  }

  public ProjectResource isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public ProjectResource isVersionControlled(Boolean isVersionControlled) {

    this.isVersionControlled = isVersionControlled;
    return this;
  }

  /**
   * Get isVersionControlled
   * @return isVersionControlled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVersionControlled() {
    return isVersionControlled;
  }

  public void setIsVersionControlled(Boolean isVersionControlled) {
    this.isVersionControlled = isVersionControlled;
  }

  public ProjectResource lastModifiedBy(String lastModifiedBy) {

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

  public ProjectResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ProjectResource lifecycleId(String lifecycleId) {

    this.lifecycleId = lifecycleId;
    return this;
  }

  /**
   * Get lifecycleId
   * @return lifecycleId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLifecycleId() {
    return lifecycleId;
  }

  public void setLifecycleId(String lifecycleId) {
    this.lifecycleId = lifecycleId;
  }

  public ProjectResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ProjectResource putLinksItem(String key, String linksItem) {
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

  public ProjectResource name(String name) {

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

  public ProjectResource
  persistenceSettings(PersistenceSettingsResource persistenceSettings) {

    this.persistenceSettings = persistenceSettings;
    return this;
  }

  /**
   * Get persistenceSettings
   * @return persistenceSettings
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersistenceSettingsResource getPersistenceSettings() {
    return persistenceSettings;
  }

  public void
  setPersistenceSettings(PersistenceSettingsResource persistenceSettings) {
    this.persistenceSettings = persistenceSettings;
  }

  public ProjectResource projectConnectivityPolicy(
      DeploymentConnectivityPolicy projectConnectivityPolicy) {

    this.projectConnectivityPolicy = projectConnectivityPolicy;
    return this;
  }

  /**
   * Get projectConnectivityPolicy
   * @return projectConnectivityPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentConnectivityPolicy getProjectConnectivityPolicy() {
    return projectConnectivityPolicy;
  }

  public void setProjectConnectivityPolicy(
      DeploymentConnectivityPolicy projectConnectivityPolicy) {
    this.projectConnectivityPolicy = projectConnectivityPolicy;
  }

  public ProjectResource projectGroupId(String projectGroupId) {

    this.projectGroupId = projectGroupId;
    return this;
  }

  /**
   * Get projectGroupId
   * @return projectGroupId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectGroupId() {
    return projectGroupId;
  }

  public void setProjectGroupId(String projectGroupId) {
    this.projectGroupId = projectGroupId;
  }

  public ProjectResource releaseCreationStrategy(
      ReleaseCreationStrategyResource releaseCreationStrategy) {

    this.releaseCreationStrategy = releaseCreationStrategy;
    return this;
  }

  /**
   * Get releaseCreationStrategy
   * @return releaseCreationStrategy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReleaseCreationStrategyResource getReleaseCreationStrategy() {
    return releaseCreationStrategy;
  }

  public void setReleaseCreationStrategy(
      ReleaseCreationStrategyResource releaseCreationStrategy) {
    this.releaseCreationStrategy = releaseCreationStrategy;
  }

  public ProjectResource releaseNotesTemplate(String releaseNotesTemplate) {

    this.releaseNotesTemplate = releaseNotesTemplate;
    return this;
  }

  /**
   * Get releaseNotesTemplate
   * @return releaseNotesTemplate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseNotesTemplate() {
    return releaseNotesTemplate;
  }

  public void setReleaseNotesTemplate(String releaseNotesTemplate) {
    this.releaseNotesTemplate = releaseNotesTemplate;
  }

  public ProjectResource slug(String slug) {

    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) { this.slug = slug; }

  public ProjectResource spaceId(String spaceId) {

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

  public ProjectResource
  templates(List<ActionTemplateParameterResource> templates) {

    this.templates = templates;
    return this;
  }

  public ProjectResource
  addTemplatesItem(ActionTemplateParameterResource templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<ActionTemplateParameterResource>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActionTemplateParameterResource> getTemplates() {
    return templates;
  }

  public void setTemplates(List<ActionTemplateParameterResource> templates) {
    this.templates = templates;
  }

  public ProjectResource
  tenantedDeploymentMode(TenantedDeploymentMode tenantedDeploymentMode) {

    this.tenantedDeploymentMode = tenantedDeploymentMode;
    return this;
  }

  /**
   * Get tenantedDeploymentMode
   * @return tenantedDeploymentMode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getTenantedDeploymentMode() {
    return tenantedDeploymentMode;
  }

  public void
  setTenantedDeploymentMode(TenantedDeploymentMode tenantedDeploymentMode) {
    this.tenantedDeploymentMode = tenantedDeploymentMode;
  }

  public ProjectResource variableSetId(String variableSetId) {

    this.variableSetId = variableSetId;
    return this;
  }

  /**
   * Get variableSetId
   * @return variableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariableSetId() {
    return variableSetId;
  }

  public void setVariableSetId(String variableSetId) {
    this.variableSetId = variableSetId;
  }

  public ProjectResource
  versioningStrategy(VersioningStrategyResource versioningStrategy) {

    this.versioningStrategy = versioningStrategy;
    return this;
  }

  /**
   * Get versioningStrategy
   * @return versioningStrategy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersioningStrategyResource getVersioningStrategy() {
    return versioningStrategy;
  }

  public void
  setVersioningStrategy(VersioningStrategyResource versioningStrategy) {
    this.versioningStrategy = versioningStrategy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectResource projectResource = (ProjectResource)o;
    return Objects.equals(this.autoCreateRelease,
                          projectResource.autoCreateRelease) &&
        Objects.equals(this.autoDeployReleaseOverrides,
                       projectResource.autoDeployReleaseOverrides) &&
        Objects.equals(this.clonedFromProjectId,
                       projectResource.clonedFromProjectId) &&
        Objects.equals(this.defaultGuidedFailureMode,
                       projectResource.defaultGuidedFailureMode) &&
        Objects.equals(this.defaultToSkipIfAlreadyInstalled,
                       projectResource.defaultToSkipIfAlreadyInstalled) &&
        Objects.equals(this.deploymentChangesTemplate,
                       projectResource.deploymentChangesTemplate) &&
        Objects.equals(this.deploymentProcessId,
                       projectResource.deploymentProcessId) &&
        Objects.equals(this.description, projectResource.description) &&
        Objects.equals(this.discreteChannelRelease,
                       projectResource.discreteChannelRelease) &&
        Objects.equals(this.extensionSettings,
                       projectResource.extensionSettings) &&
        Objects.equals(this.id, projectResource.id) &&
        Objects.equals(this.includedLibraryVariableSetIds,
                       projectResource.includedLibraryVariableSetIds) &&
        Objects.equals(this.isDisabled, projectResource.isDisabled) &&
        Objects.equals(this.isVersionControlled,
                       projectResource.isVersionControlled) &&
        Objects.equals(this.lastModifiedBy, projectResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, projectResource.lastModifiedOn) &&
        Objects.equals(this.lifecycleId, projectResource.lifecycleId) &&
        Objects.equals(this.links, projectResource.links) &&
        Objects.equals(this.name, projectResource.name) &&
        Objects.equals(this.persistenceSettings,
                       projectResource.persistenceSettings) &&
        Objects.equals(this.projectConnectivityPolicy,
                       projectResource.projectConnectivityPolicy) &&
        Objects.equals(this.projectGroupId, projectResource.projectGroupId) &&
        Objects.equals(this.releaseCreationStrategy,
                       projectResource.releaseCreationStrategy) &&
        Objects.equals(this.releaseNotesTemplate,
                       projectResource.releaseNotesTemplate) &&
        Objects.equals(this.slug, projectResource.slug) &&
        Objects.equals(this.spaceId, projectResource.spaceId) &&
        Objects.equals(this.templates, projectResource.templates) &&
        Objects.equals(this.tenantedDeploymentMode,
                       projectResource.tenantedDeploymentMode) &&
        Objects.equals(this.variableSetId, projectResource.variableSetId) &&
        Objects.equals(this.versioningStrategy,
                       projectResource.versioningStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCreateRelease, autoDeployReleaseOverrides, clonedFromProjectId,
        defaultGuidedFailureMode, defaultToSkipIfAlreadyInstalled,
        deploymentChangesTemplate, deploymentProcessId, description,
        discreteChannelRelease, extensionSettings, id,
        includedLibraryVariableSetIds, isDisabled, isVersionControlled,
        lastModifiedBy, lastModifiedOn, lifecycleId, links, name,
        persistenceSettings, projectConnectivityPolicy, projectGroupId,
        releaseCreationStrategy, releaseNotesTemplate, slug, spaceId, templates,
        tenantedDeploymentMode, variableSetId, versioningStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectResource {\n");
    sb.append("    autoCreateRelease: ")
        .append(toIndentedString(autoCreateRelease))
        .append("\n");
    sb.append("    autoDeployReleaseOverrides: ")
        .append(toIndentedString(autoDeployReleaseOverrides))
        .append("\n");
    sb.append("    clonedFromProjectId: ")
        .append(toIndentedString(clonedFromProjectId))
        .append("\n");
    sb.append("    defaultGuidedFailureMode: ")
        .append(toIndentedString(defaultGuidedFailureMode))
        .append("\n");
    sb.append("    defaultToSkipIfAlreadyInstalled: ")
        .append(toIndentedString(defaultToSkipIfAlreadyInstalled))
        .append("\n");
    sb.append("    deploymentChangesTemplate: ")
        .append(toIndentedString(deploymentChangesTemplate))
        .append("\n");
    sb.append("    deploymentProcessId: ")
        .append(toIndentedString(deploymentProcessId))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    discreteChannelRelease: ")
        .append(toIndentedString(discreteChannelRelease))
        .append("\n");
    sb.append("    extensionSettings: ")
        .append(toIndentedString(extensionSettings))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includedLibraryVariableSetIds: ")
        .append(toIndentedString(includedLibraryVariableSetIds))
        .append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    isVersionControlled: ")
        .append(toIndentedString(isVersionControlled))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    lifecycleId: ")
        .append(toIndentedString(lifecycleId))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    persistenceSettings: ")
        .append(toIndentedString(persistenceSettings))
        .append("\n");
    sb.append("    projectConnectivityPolicy: ")
        .append(toIndentedString(projectConnectivityPolicy))
        .append("\n");
    sb.append("    projectGroupId: ")
        .append(toIndentedString(projectGroupId))
        .append("\n");
    sb.append("    releaseCreationStrategy: ")
        .append(toIndentedString(releaseCreationStrategy))
        .append("\n");
    sb.append("    releaseNotesTemplate: ")
        .append(toIndentedString(releaseNotesTemplate))
        .append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    templates: ")
        .append(toIndentedString(templates))
        .append("\n");
    sb.append("    tenantedDeploymentMode: ")
        .append(toIndentedString(tenantedDeploymentMode))
        .append("\n");
    sb.append("    variableSetId: ")
        .append(toIndentedString(variableSetId))
        .append("\n");
    sb.append("    versioningStrategy: ")
        .append(toIndentedString(versioningStrategy))
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
