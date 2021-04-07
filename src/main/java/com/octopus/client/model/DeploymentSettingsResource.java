// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentConnectivityPolicy;
import com.octopus.client.model.GuidedFailureMode;
import com.octopus.client.model.VersioningStrategyResource;
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
 * DeploymentSettingsResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentSettingsResource {
  public static final String SERIALIZED_NAME_CONNECTIVITY_POLICY =
      "ConnectivityPolicy";
  @SerializedName(SERIALIZED_NAME_CONNECTIVITY_POLICY)
  private DeploymentConnectivityPolicy connectivityPolicy;

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

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_RELEASE_NOTES_TEMPLATE =
      "ReleaseNotesTemplate";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES_TEMPLATE)
  private String releaseNotesTemplate;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_VERSIONING_STRATEGY =
      "VersioningStrategy";
  @SerializedName(SERIALIZED_NAME_VERSIONING_STRATEGY)
  private VersioningStrategyResource versioningStrategy;

  public DeploymentSettingsResource
  connectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {

    this.connectivityPolicy = connectivityPolicy;
    return this;
  }

  /**
   * Get connectivityPolicy
   * @return connectivityPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentConnectivityPolicy getConnectivityPolicy() {
    return connectivityPolicy;
  }

  public void
  setConnectivityPolicy(DeploymentConnectivityPolicy connectivityPolicy) {
    this.connectivityPolicy = connectivityPolicy;
  }

  public DeploymentSettingsResource
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

  public DeploymentSettingsResource
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

  public DeploymentSettingsResource
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

  public DeploymentSettingsResource id(String id) {

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

  public DeploymentSettingsResource lastModifiedBy(String lastModifiedBy) {

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

  public DeploymentSettingsResource
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

  public DeploymentSettingsResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentSettingsResource putLinksItem(String key, String linksItem) {
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

  public DeploymentSettingsResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public DeploymentSettingsResource
  releaseNotesTemplate(String releaseNotesTemplate) {

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

  public DeploymentSettingsResource spaceId(String spaceId) {

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

  public DeploymentSettingsResource
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
    DeploymentSettingsResource deploymentSettingsResource =
        (DeploymentSettingsResource)o;
    return Objects.equals(this.connectivityPolicy,
                          deploymentSettingsResource.connectivityPolicy) &&
        Objects.equals(this.defaultGuidedFailureMode,
                       deploymentSettingsResource.defaultGuidedFailureMode) &&
        Objects.equals(
            this.defaultToSkipIfAlreadyInstalled,
            deploymentSettingsResource.defaultToSkipIfAlreadyInstalled) &&
        Objects.equals(this.deploymentChangesTemplate,
                       deploymentSettingsResource.deploymentChangesTemplate) &&
        Objects.equals(this.id, deploymentSettingsResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentSettingsResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentSettingsResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentSettingsResource.links) &&
        Objects.equals(this.projectId, deploymentSettingsResource.projectId) &&
        Objects.equals(this.releaseNotesTemplate,
                       deploymentSettingsResource.releaseNotesTemplate) &&
        Objects.equals(this.spaceId, deploymentSettingsResource.spaceId) &&
        Objects.equals(this.versioningStrategy,
                       deploymentSettingsResource.versioningStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityPolicy, defaultGuidedFailureMode,
                        defaultToSkipIfAlreadyInstalled,
                        deploymentChangesTemplate, id, lastModifiedBy,
                        lastModifiedOn, links, projectId, releaseNotesTemplate,
                        spaceId, versioningStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentSettingsResource {\n");
    sb.append("    connectivityPolicy: ")
        .append(toIndentedString(connectivityPolicy))
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    releaseNotesTemplate: ")
        .append(toIndentedString(releaseNotesTemplate))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
