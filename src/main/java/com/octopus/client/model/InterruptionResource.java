// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Form;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * InterruptionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class InterruptionResource {
  public static final String SERIALIZED_NAME_CAN_TAKE_RESPONSIBILITY =
      "CanTakeResponsibility";
  @SerializedName(SERIALIZED_NAME_CAN_TAKE_RESPONSIBILITY)
  private Boolean canTakeResponsibility;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "CorrelationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID) private String correlationId;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_FORM = "Form";
  @SerializedName(SERIALIZED_NAME_FORM) private Form form;

  public static final String SERIALIZED_NAME_HAS_RESPONSIBILITY =
      "HasResponsibility";
  @SerializedName(SERIALIZED_NAME_HAS_RESPONSIBILITY)
  private Boolean hasResponsibility;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_LINKED_TO_OTHER_INTERRUPTION =
      "IsLinkedToOtherInterruption";
  @SerializedName(SERIALIZED_NAME_IS_LINKED_TO_OTHER_INTERRUPTION)
  private Boolean isLinkedToOtherInterruption;

  public static final String SERIALIZED_NAME_IS_PENDING = "IsPending";
  @SerializedName(SERIALIZED_NAME_IS_PENDING) private Boolean isPending;

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

  public static final String SERIALIZED_NAME_RELATED_DOCUMENT_IDS =
      "RelatedDocumentIds";
  @SerializedName(SERIALIZED_NAME_RELATED_DOCUMENT_IDS)
  private Set<String> relatedDocumentIds = null;

  public static final String SERIALIZED_NAME_RESPONSIBLE_TEAM_IDS =
      "ResponsibleTeamIds";
  @SerializedName(SERIALIZED_NAME_RESPONSIBLE_TEAM_IDS)
  private Set<String> responsibleTeamIds = null;

  public static final String SERIALIZED_NAME_RESPONSIBLE_USER_ID =
      "ResponsibleUserId";
  @SerializedName(SERIALIZED_NAME_RESPONSIBLE_USER_ID)
  private String responsibleUserId;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE) private String title;

  public InterruptionResource
  canTakeResponsibility(Boolean canTakeResponsibility) {

    this.canTakeResponsibility = canTakeResponsibility;
    return this;
  }

  /**
   * Get canTakeResponsibility
   * @return canTakeResponsibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanTakeResponsibility() {
    return canTakeResponsibility;
  }

  public void setCanTakeResponsibility(Boolean canTakeResponsibility) {
    this.canTakeResponsibility = canTakeResponsibility;
  }

  public InterruptionResource correlationId(String correlationId) {

    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public InterruptionResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public InterruptionResource form(Form form) {

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

  public InterruptionResource hasResponsibility(Boolean hasResponsibility) {

    this.hasResponsibility = hasResponsibility;
    return this;
  }

  /**
   * Get hasResponsibility
   * @return hasResponsibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasResponsibility() {
    return hasResponsibility;
  }

  public void setHasResponsibility(Boolean hasResponsibility) {
    this.hasResponsibility = hasResponsibility;
  }

  public InterruptionResource id(String id) {

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

  public InterruptionResource
  isLinkedToOtherInterruption(Boolean isLinkedToOtherInterruption) {

    this.isLinkedToOtherInterruption = isLinkedToOtherInterruption;
    return this;
  }

  /**
   * Get isLinkedToOtherInterruption
   * @return isLinkedToOtherInterruption
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsLinkedToOtherInterruption() {
    return isLinkedToOtherInterruption;
  }

  public void
  setIsLinkedToOtherInterruption(Boolean isLinkedToOtherInterruption) {
    this.isLinkedToOtherInterruption = isLinkedToOtherInterruption;
  }

  public InterruptionResource isPending(Boolean isPending) {

    this.isPending = isPending;
    return this;
  }

  /**
   * Get isPending
   * @return isPending
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPending() {
    return isPending;
  }

  public void setIsPending(Boolean isPending) { this.isPending = isPending; }

  public InterruptionResource lastModifiedBy(String lastModifiedBy) {

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

  public InterruptionResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public InterruptionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public InterruptionResource putLinksItem(String key, String linksItem) {
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

  public InterruptionResource
  relatedDocumentIds(Set<String> relatedDocumentIds) {

    this.relatedDocumentIds = relatedDocumentIds;
    return this;
  }

  public InterruptionResource
  addRelatedDocumentIdsItem(String relatedDocumentIdsItem) {
    if (this.relatedDocumentIds == null) {
      this.relatedDocumentIds = new LinkedHashSet<String>();
    }
    this.relatedDocumentIds.add(relatedDocumentIdsItem);
    return this;
  }

  /**
   * Get relatedDocumentIds
   * @return relatedDocumentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getRelatedDocumentIds() {
    return relatedDocumentIds;
  }

  public void setRelatedDocumentIds(Set<String> relatedDocumentIds) {
    this.relatedDocumentIds = relatedDocumentIds;
  }

  public InterruptionResource
  responsibleTeamIds(Set<String> responsibleTeamIds) {

    this.responsibleTeamIds = responsibleTeamIds;
    return this;
  }

  public InterruptionResource
  addResponsibleTeamIdsItem(String responsibleTeamIdsItem) {
    if (this.responsibleTeamIds == null) {
      this.responsibleTeamIds = new LinkedHashSet<String>();
    }
    this.responsibleTeamIds.add(responsibleTeamIdsItem);
    return this;
  }

  /**
   * Get responsibleTeamIds
   * @return responsibleTeamIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getResponsibleTeamIds() {
    return responsibleTeamIds;
  }

  public void setResponsibleTeamIds(Set<String> responsibleTeamIds) {
    this.responsibleTeamIds = responsibleTeamIds;
  }

  public InterruptionResource responsibleUserId(String responsibleUserId) {

    this.responsibleUserId = responsibleUserId;
    return this;
  }

  /**
   * Get responsibleUserId
   * @return responsibleUserId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResponsibleUserId() {
    return responsibleUserId;
  }

  public void setResponsibleUserId(String responsibleUserId) {
    this.responsibleUserId = responsibleUserId;
  }

  public InterruptionResource spaceId(String spaceId) {

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

  public InterruptionResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) { this.taskId = taskId; }

  public InterruptionResource title(String title) {

    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) { this.title = title; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterruptionResource interruptionResource = (InterruptionResource)o;
    return Objects.equals(this.canTakeResponsibility,
                          interruptionResource.canTakeResponsibility) &&
        Objects.equals(this.correlationId,
                       interruptionResource.correlationId) &&
        Objects.equals(this.created, interruptionResource.created) &&
        Objects.equals(this.form, interruptionResource.form) &&
        Objects.equals(this.hasResponsibility,
                       interruptionResource.hasResponsibility) &&
        Objects.equals(this.id, interruptionResource.id) &&
        Objects.equals(this.isLinkedToOtherInterruption,
                       interruptionResource.isLinkedToOtherInterruption) &&
        Objects.equals(this.isPending, interruptionResource.isPending) &&
        Objects.equals(this.lastModifiedBy,
                       interruptionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       interruptionResource.lastModifiedOn) &&
        Objects.equals(this.links, interruptionResource.links) &&
        Objects.equals(this.relatedDocumentIds,
                       interruptionResource.relatedDocumentIds) &&
        Objects.equals(this.responsibleTeamIds,
                       interruptionResource.responsibleTeamIds) &&
        Objects.equals(this.responsibleUserId,
                       interruptionResource.responsibleUserId) &&
        Objects.equals(this.spaceId, interruptionResource.spaceId) &&
        Objects.equals(this.taskId, interruptionResource.taskId) &&
        Objects.equals(this.title, interruptionResource.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canTakeResponsibility, correlationId, created, form,
                        hasResponsibility, id, isLinkedToOtherInterruption,
                        isPending, lastModifiedBy, lastModifiedOn, links,
                        relatedDocumentIds, responsibleTeamIds,
                        responsibleUserId, spaceId, taskId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterruptionResource {\n");
    sb.append("    canTakeResponsibility: ")
        .append(toIndentedString(canTakeResponsibility))
        .append("\n");
    sb.append("    correlationId: ")
        .append(toIndentedString(correlationId))
        .append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    hasResponsibility: ")
        .append(toIndentedString(hasResponsibility))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isLinkedToOtherInterruption: ")
        .append(toIndentedString(isLinkedToOtherInterruption))
        .append("\n");
    sb.append("    isPending: ")
        .append(toIndentedString(isPending))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    relatedDocumentIds: ")
        .append(toIndentedString(relatedDocumentIds))
        .append("\n");
    sb.append("    responsibleTeamIds: ")
        .append(toIndentedString(responsibleTeamIds))
        .append("\n");
    sb.append("    responsibleUserId: ")
        .append(toIndentedString(responsibleUserId))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
