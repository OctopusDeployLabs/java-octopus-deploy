/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.project;

import com.octopus.openapi.model.ActionTemplateParameterResource;
import com.octopus.openapi.model.AutoDeployReleaseOverrideResource;
import com.octopus.openapi.model.DeploymentConnectivityPolicy;
import com.octopus.openapi.model.ExtensionSettingsValues;
import com.octopus.openapi.model.GuidedFailureMode;
import com.octopus.openapi.model.PersistenceSettingsResource;
import com.octopus.openapi.model.ReleaseCreationStrategyResource;
import com.octopus.openapi.model.TenantedDeploymentMode;
import com.octopus.openapi.model.VersioningStrategyResource;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class ProjectResource extends NamedResource {

  public ProjectResource(final String name, final String lifecycleId, final String projectGroupId) {
    super(name);
    this.lifecycleId = lifecycleId;
    this.projectGroupId = projectGroupId;
  }

  @SerializedName("AutoCreateRelease")
  private Boolean autoCreateRelease;

  @SerializedName("AutoDeployReleaseOverrides")
  private Set<AutoDeployReleaseOverrideResource> autoDeployReleaseOverrides = null;

  @SerializedName("ClonedFromProjectId")
  private String clonedFromProjectId;

  @SerializedName("DefaultGuidedFailureMode")
  private GuidedFailureMode defaultGuidedFailureMode;

  @SerializedName("DefaultToSkipIfAlreadyInstalled")
  private Boolean defaultToSkipIfAlreadyInstalled;

  @SerializedName("DeploymentChangesTemplate")
  private String deploymentChangesTemplate;

  @SerializedName("DeploymentProcessId")
  private String deploymentProcessId;

  @SerializedName("DiscreteChannelRelease")
  private Boolean discreteChannelRelease;

  @SerializedName("ExtensionSettings")
  private List<ExtensionSettingsValues> extensionSettings = null;

  @SerializedName("IncludedLibraryVariableSetIds")
  private List<String> includedLibraryVariableSetIds = null;

  @SerializedName("IsDisabled")
  private Boolean isDisabled;

  @SerializedName("IsVersionControlled")
  private Boolean isVersionControlled;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LifecycleId")
  private String lifecycleId;

  @SerializedName("PersistenceSettings")
  private PersistenceSettingsResource persistenceSettings;

  @SerializedName("ProjectConnectivityPolicy")
  private DeploymentConnectivityPolicy projectConnectivityPolicy;

  @SerializedName("ProjectGroupId")
  private String projectGroupId;

  @SerializedName("ReleaseCreationStrategy")
  private ReleaseCreationStrategyResource releaseCreationStrategy;

  @SerializedName("ReleaseNotesTemplate")
  private String releaseNotesTemplate;

  @SerializedName("Slug")
  private String slug;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("Templates")
  private List<ActionTemplateParameterResource> templates = null;

  @SerializedName("TenantedDeploymentMode")
  private TenantedDeploymentMode tenantedDeploymentMode;

  @SerializedName("VariableSetId")
  private String variableSetId;

  @SerializedName("VersioningStrategy")
  private VersioningStrategyResource versioningStrategy;

  public void setAutoCreateRelease(final Boolean autoCreateRelease) {
    this.autoCreateRelease = autoCreateRelease;
  }

  public void setAutoDeployReleaseOverrides(
      final Set<AutoDeployReleaseOverrideResource> autoDeployReleaseOverrides) {
    this.autoDeployReleaseOverrides = autoDeployReleaseOverrides;
  }

  public void setClonedFromProjectId(final String clonedFromProjectId) {
    this.clonedFromProjectId = clonedFromProjectId;
  }

  public void setDefaultGuidedFailureMode(final GuidedFailureMode defaultGuidedFailureMode) {
    this.defaultGuidedFailureMode = defaultGuidedFailureMode;
  }

  public void setDefaultToSkipIfAlreadyInstalled(final Boolean defaultToSkipIfAlreadyInstalled) {
    this.defaultToSkipIfAlreadyInstalled = defaultToSkipIfAlreadyInstalled;
  }

  public void setDeploymentChangesTemplate(final String deploymentChangesTemplate) {
    this.deploymentChangesTemplate = deploymentChangesTemplate;
  }

  public void setDeploymentProcessId(final String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public void setDiscreteChannelRelease(final Boolean discreteChannelRelease) {
    this.discreteChannelRelease = discreteChannelRelease;
  }

  public void setExtensionSettings(final List<ExtensionSettingsValues> extensionSettings) {
    this.extensionSettings = extensionSettings;
  }

  public void setIncludedLibraryVariableSetIds(final List<String> includedLibraryVariableSetIds) {
    this.includedLibraryVariableSetIds = includedLibraryVariableSetIds;
  }

  public void setDisabled(final Boolean disabled) {
    isDisabled = disabled;
  }

  public void setVersionControlled(final Boolean versionControlled) {
    isVersionControlled = versionControlled;
  }

  public void setLastModifiedBy(final String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public void setLastModifiedOn(final OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public void setLifecycleId(final String lifecycleId) {
    this.lifecycleId = lifecycleId;
  }

  public void setPersistenceSettings(final PersistenceSettingsResource persistenceSettings) {
    this.persistenceSettings = persistenceSettings;
  }

  public void setProjectConnectivityPolicy(
      final DeploymentConnectivityPolicy projectConnectivityPolicy) {
    this.projectConnectivityPolicy = projectConnectivityPolicy;
  }

  public void setProjectGroupId(final String projectGroupId) {
    this.projectGroupId = projectGroupId;
  }

  public void setReleaseCreationStrategy(
      final ReleaseCreationStrategyResource releaseCreationStrategy) {
    this.releaseCreationStrategy = releaseCreationStrategy;
  }

  public void setReleaseNotesTemplate(final String releaseNotesTemplate) {
    this.releaseNotesTemplate = releaseNotesTemplate;
  }

  public void setSlug(final String slug) {
    this.slug = slug;
  }

  public void setSpaceId(final String spaceId) {
    this.spaceId = spaceId;
  }

  public void setTemplates(final List<ActionTemplateParameterResource> templates) {
    this.templates = templates;
  }

  public void setTenantedDeploymentMode(final TenantedDeploymentMode tenantedDeploymentMode) {
    this.tenantedDeploymentMode = tenantedDeploymentMode;
  }

  public void setVariableSetId(final String variableSetId) {
    this.variableSetId = variableSetId;
  }

  public void setVersioningStrategy(final VersioningStrategyResource versioningStrategy) {
    this.versioningStrategy = versioningStrategy;
  }

  public Boolean getAutoCreateRelease() {
    return autoCreateRelease;
  }

  public Set<AutoDeployReleaseOverrideResource> getAutoDeployReleaseOverrides() {
    return autoDeployReleaseOverrides;
  }

  public String getClonedFromProjectId() {
    return clonedFromProjectId;
  }

  public GuidedFailureMode getDefaultGuidedFailureMode() {
    return defaultGuidedFailureMode;
  }

  public Boolean getDefaultToSkipIfAlreadyInstalled() {
    return defaultToSkipIfAlreadyInstalled;
  }

  public String getDeploymentChangesTemplate() {
    return deploymentChangesTemplate;
  }

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public Boolean getDiscreteChannelRelease() {
    return discreteChannelRelease;
  }

  public List<ExtensionSettingsValues> getExtensionSettings() {
    return extensionSettings;
  }

  public List<String> getIncludedLibraryVariableSetIds() {
    return includedLibraryVariableSetIds;
  }

  public Boolean getDisabled() {
    return isDisabled;
  }

  public Boolean getVersionControlled() {
    return isVersionControlled;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public String getLifecycleId() {
    return lifecycleId;
  }

  public PersistenceSettingsResource getPersistenceSettings() {
    return persistenceSettings;
  }

  public DeploymentConnectivityPolicy getProjectConnectivityPolicy() {
    return projectConnectivityPolicy;
  }

  public String getProjectGroupId() {
    return projectGroupId;
  }

  public ReleaseCreationStrategyResource getReleaseCreationStrategy() {
    return releaseCreationStrategy;
  }

  public String getReleaseNotesTemplate() {
    return releaseNotesTemplate;
  }

  public String getSlug() {
    return slug;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public List<ActionTemplateParameterResource> getTemplates() {
    return templates;
  }

  public TenantedDeploymentMode getTenantedDeploymentMode() {
    return tenantedDeploymentMode;
  }

  public String getVariableSetId() {
    return variableSetId;
  }

  public VersioningStrategyResource getVersioningStrategy() {
    return versioningStrategy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectResource projectResource = (ProjectResource) o;
    return Objects.equals(this.autoCreateRelease, projectResource.autoCreateRelease)
        && Objects.equals(
            this.autoDeployReleaseOverrides, projectResource.autoDeployReleaseOverrides)
        && Objects.equals(this.clonedFromProjectId, projectResource.clonedFromProjectId)
        && Objects.equals(this.defaultGuidedFailureMode, projectResource.defaultGuidedFailureMode)
        && Objects.equals(
            this.defaultToSkipIfAlreadyInstalled, projectResource.defaultToSkipIfAlreadyInstalled)
        && Objects.equals(this.deploymentChangesTemplate, projectResource.deploymentChangesTemplate)
        && Objects.equals(this.deploymentProcessId, projectResource.deploymentProcessId)
        && Objects.equals(this.getDescription(), projectResource.getDescription())
        && Objects.equals(this.discreteChannelRelease, projectResource.discreteChannelRelease)
        && Objects.equals(this.extensionSettings, projectResource.extensionSettings)
        && Objects.equals(this.getId(), projectResource.getId())
        && Objects.equals(
            this.includedLibraryVariableSetIds, projectResource.includedLibraryVariableSetIds)
        && Objects.equals(this.isDisabled, projectResource.isDisabled)
        && Objects.equals(this.isVersionControlled, projectResource.isVersionControlled)
        && Objects.equals(this.lastModifiedBy, projectResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, projectResource.lastModifiedOn)
        && Objects.equals(this.lifecycleId, projectResource.lifecycleId)
        && Objects.equals(this.getLinks(), projectResource.getLinks())
        && Objects.equals(this.getName(), projectResource.getName())
        && Objects.equals(this.persistenceSettings, projectResource.persistenceSettings)
        && Objects.equals(this.projectConnectivityPolicy, projectResource.projectConnectivityPolicy)
        && Objects.equals(this.projectGroupId, projectResource.projectGroupId)
        && Objects.equals(this.releaseCreationStrategy, projectResource.releaseCreationStrategy)
        && Objects.equals(this.releaseNotesTemplate, projectResource.releaseNotesTemplate)
        && Objects.equals(this.slug, projectResource.slug)
        && Objects.equals(this.spaceId, projectResource.spaceId)
        && Objects.equals(this.templates, projectResource.templates)
        && Objects.equals(this.tenantedDeploymentMode, projectResource.tenantedDeploymentMode)
        && Objects.equals(this.variableSetId, projectResource.variableSetId)
        && Objects.equals(this.versioningStrategy, projectResource.versioningStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoCreateRelease,
        autoDeployReleaseOverrides,
        clonedFromProjectId,
        defaultGuidedFailureMode,
        defaultToSkipIfAlreadyInstalled,
        deploymentChangesTemplate,
        deploymentProcessId,
        getDescription(),
        discreteChannelRelease,
        extensionSettings,
        getId(),
        includedLibraryVariableSetIds,
        isDisabled,
        isVersionControlled,
        lastModifiedBy,
        lastModifiedOn,
        lifecycleId,
        getLinks(),
        getName(),
        persistenceSettings,
        projectConnectivityPolicy,
        projectGroupId,
        releaseCreationStrategy,
        releaseNotesTemplate,
        slug,
        spaceId,
        templates,
        tenantedDeploymentMode,
        variableSetId,
        versioningStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectResource {\n");
    sb.append("    autoCreateRelease: ").append(toIndentedString(autoCreateRelease)).append("\n");
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
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    discreteChannelRelease: ")
        .append(toIndentedString(discreteChannelRelease))
        .append("\n");
    sb.append("    extensionSettings: ").append(toIndentedString(extensionSettings)).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    includedLibraryVariableSetIds: ")
        .append(toIndentedString(includedLibraryVariableSetIds))
        .append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isVersionControlled: ")
        .append(toIndentedString(isVersionControlled))
        .append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lifecycleId: ").append(toIndentedString(lifecycleId)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    persistenceSettings: ")
        .append(toIndentedString(persistenceSettings))
        .append("\n");
    sb.append("    projectConnectivityPolicy: ")
        .append(toIndentedString(projectConnectivityPolicy))
        .append("\n");
    sb.append("    projectGroupId: ").append(toIndentedString(projectGroupId)).append("\n");
    sb.append("    releaseCreationStrategy: ")
        .append(toIndentedString(releaseCreationStrategy))
        .append("\n");
    sb.append("    releaseNotesTemplate: ")
        .append(toIndentedString(releaseNotesTemplate))
        .append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    tenantedDeploymentMode: ")
        .append(toIndentedString(tenantedDeploymentMode))
        .append("\n");
    sb.append("    variableSetId: ").append(toIndentedString(variableSetId)).append("\n");
    sb.append("    versioningStrategy: ").append(toIndentedString(versioningStrategy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
