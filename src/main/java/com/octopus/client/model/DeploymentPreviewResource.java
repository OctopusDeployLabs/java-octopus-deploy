// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentTemplateStep;
import com.octopus.client.model.Form;
import com.octopus.client.model.ReleaseChanges;
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
 * DeploymentPreviewResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentPreviewResource {
  public static final String SERIALIZED_NAME_CHANGES = "Changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private List<ReleaseChanges> changes = null;

  public static final String SERIALIZED_NAME_CHANGES_MARKDOWN =
      "ChangesMarkdown";
  @SerializedName(SERIALIZED_NAME_CHANGES_MARKDOWN)
  private String changesMarkdown;

  public static final String SERIALIZED_NAME_FORM = "Form";
  @SerializedName(SERIALIZED_NAME_FORM) private Form form;

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

  public static final String SERIALIZED_NAME_STEPS_TO_EXECUTE =
      "StepsToExecute";
  @SerializedName(SERIALIZED_NAME_STEPS_TO_EXECUTE)
  private List<DeploymentTemplateStep> stepsToExecute = null;

  public static final String
      SERIALIZED_NAME_USE_GUIDED_FAILURE_MODE_BY_DEFAULT =
          "UseGuidedFailureModeByDefault";
  @SerializedName(SERIALIZED_NAME_USE_GUIDED_FAILURE_MODE_BY_DEFAULT)
  private Boolean useGuidedFailureModeByDefault;

  public DeploymentPreviewResource changes(List<ReleaseChanges> changes) {

    this.changes = changes;
    return this;
  }

  public DeploymentPreviewResource addChangesItem(ReleaseChanges changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<ReleaseChanges>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * Get changes
   * @return changes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleaseChanges> getChanges() {
    return changes;
  }

  public void setChanges(List<ReleaseChanges> changes) {
    this.changes = changes;
  }

  public DeploymentPreviewResource changesMarkdown(String changesMarkdown) {

    this.changesMarkdown = changesMarkdown;
    return this;
  }

  /**
   * Get changesMarkdown
   * @return changesMarkdown
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangesMarkdown() {
    return changesMarkdown;
  }

  public void setChangesMarkdown(String changesMarkdown) {
    this.changesMarkdown = changesMarkdown;
  }

  public DeploymentPreviewResource form(Form form) {

    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Form getForm() {
    return form;
  }

  public void setForm(Form form) { this.form = form; }

  public DeploymentPreviewResource id(String id) {

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

  public DeploymentPreviewResource lastModifiedBy(String lastModifiedBy) {

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

  public DeploymentPreviewResource
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

  public DeploymentPreviewResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentPreviewResource putLinksItem(String key, String linksItem) {
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

  public DeploymentPreviewResource
  stepsToExecute(List<DeploymentTemplateStep> stepsToExecute) {

    this.stepsToExecute = stepsToExecute;
    return this;
  }

  public DeploymentPreviewResource
  addStepsToExecuteItem(DeploymentTemplateStep stepsToExecuteItem) {
    if (this.stepsToExecute == null) {
      this.stepsToExecute = new ArrayList<DeploymentTemplateStep>();
    }
    this.stepsToExecute.add(stepsToExecuteItem);
    return this;
  }

  /**
   * Get stepsToExecute
   * @return stepsToExecute
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentTemplateStep> getStepsToExecute() {
    return stepsToExecute;
  }

  public void setStepsToExecute(List<DeploymentTemplateStep> stepsToExecute) {
    this.stepsToExecute = stepsToExecute;
  }

  public DeploymentPreviewResource
  useGuidedFailureModeByDefault(Boolean useGuidedFailureModeByDefault) {

    this.useGuidedFailureModeByDefault = useGuidedFailureModeByDefault;
    return this;
  }

  /**
   * Get useGuidedFailureModeByDefault
   * @return useGuidedFailureModeByDefault
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGuidedFailureModeByDefault() {
    return useGuidedFailureModeByDefault;
  }

  public void
  setUseGuidedFailureModeByDefault(Boolean useGuidedFailureModeByDefault) {
    this.useGuidedFailureModeByDefault = useGuidedFailureModeByDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentPreviewResource deploymentPreviewResource =
        (DeploymentPreviewResource)o;
    return Objects.equals(this.changes, deploymentPreviewResource.changes) &&
        Objects.equals(this.changesMarkdown,
                       deploymentPreviewResource.changesMarkdown) &&
        Objects.equals(this.form, deploymentPreviewResource.form) &&
        Objects.equals(this.id, deploymentPreviewResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentPreviewResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentPreviewResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentPreviewResource.links) &&
        Objects.equals(this.stepsToExecute,
                       deploymentPreviewResource.stepsToExecute) &&
        Objects.equals(this.useGuidedFailureModeByDefault,
                       deploymentPreviewResource.useGuidedFailureModeByDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, changesMarkdown, form, id, lastModifiedBy,
                        lastModifiedOn, links, stepsToExecute,
                        useGuidedFailureModeByDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentPreviewResource {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    changesMarkdown: ")
        .append(toIndentedString(changesMarkdown))
        .append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    stepsToExecute: ")
        .append(toIndentedString(stepsToExecute))
        .append("\n");
    sb.append("    useGuidedFailureModeByDefault: ")
        .append(toIndentedString(useGuidedFailureModeByDefault))
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
