// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ChangeDetails;
import com.octopus.client.model.EventReference;
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
 * EventResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EventResource {
  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY) private String category;

  public static final String SERIALIZED_NAME_CHANGE_DETAILS = "ChangeDetails";
  @SerializedName(SERIALIZED_NAME_CHANGE_DETAILS)
  private ChangeDetails changeDetails;

  public static final String SERIALIZED_NAME_COMMENTS = "Comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS) private String comments;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS) private String details;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IDENTITY_ESTABLISHED_WITH =
      "IdentityEstablishedWith";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ESTABLISHED_WITH)
  private String identityEstablishedWith;

  public static final String SERIALIZED_NAME_IS_SERVICE = "IsService";
  @SerializedName(SERIALIZED_NAME_IS_SERVICE) private Boolean isService;

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

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE) private String message;

  public static final String SERIALIZED_NAME_MESSAGE_HTML = "MessageHtml";
  @SerializedName(SERIALIZED_NAME_MESSAGE_HTML) private String messageHtml;

  public static final String SERIALIZED_NAME_MESSAGE_REFERENCES =
      "MessageReferences";
  @SerializedName(SERIALIZED_NAME_MESSAGE_REFERENCES)
  private List<EventReference> messageReferences = null;

  public static final String SERIALIZED_NAME_OCCURRED = "Occurred";
  @SerializedName(SERIALIZED_NAME_OCCURRED) private OffsetDateTime occurred;

  public static final String SERIALIZED_NAME_RELATED_DOCUMENT_IDS =
      "RelatedDocumentIds";
  @SerializedName(SERIALIZED_NAME_RELATED_DOCUMENT_IDS)
  private Set<String> relatedDocumentIds = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_USER_AGENT = "UserAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT) private String userAgent;

  public static final String SERIALIZED_NAME_USER_ID = "UserId";
  @SerializedName(SERIALIZED_NAME_USER_ID) private String userId;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME) private String username;

  public EventResource category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) { this.category = category; }

  public EventResource changeDetails(ChangeDetails changeDetails) {

    this.changeDetails = changeDetails;
    return this;
  }

  /**
   * Get changeDetails
   * @return changeDetails
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChangeDetails getChangeDetails() {
    return changeDetails;
  }

  public void setChangeDetails(ChangeDetails changeDetails) {
    this.changeDetails = changeDetails;
  }

  public EventResource comments(String comments) {

    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) { this.comments = comments; }

  public EventResource details(String details) {

    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) { this.details = details; }

  public EventResource id(String id) {

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

  public EventResource identityEstablishedWith(String identityEstablishedWith) {

    this.identityEstablishedWith = identityEstablishedWith;
    return this;
  }

  /**
   * Get identityEstablishedWith
   * @return identityEstablishedWith
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentityEstablishedWith() {
    return identityEstablishedWith;
  }

  public void setIdentityEstablishedWith(String identityEstablishedWith) {
    this.identityEstablishedWith = identityEstablishedWith;
  }

  public EventResource isService(Boolean isService) {

    this.isService = isService;
    return this;
  }

  /**
   * Get isService
   * @return isService
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsService() {
    return isService;
  }

  public void setIsService(Boolean isService) { this.isService = isService; }

  public EventResource lastModifiedBy(String lastModifiedBy) {

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

  public EventResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public EventResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public EventResource putLinksItem(String key, String linksItem) {
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

  public EventResource message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) { this.message = message; }

  public EventResource messageHtml(String messageHtml) {

    this.messageHtml = messageHtml;
    return this;
  }

  /**
   * Get messageHtml
   * @return messageHtml
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageHtml() {
    return messageHtml;
  }

  public void setMessageHtml(String messageHtml) {
    this.messageHtml = messageHtml;
  }

  public EventResource
  messageReferences(List<EventReference> messageReferences) {

    this.messageReferences = messageReferences;
    return this;
  }

  public EventResource
  addMessageReferencesItem(EventReference messageReferencesItem) {
    if (this.messageReferences == null) {
      this.messageReferences = new ArrayList<EventReference>();
    }
    this.messageReferences.add(messageReferencesItem);
    return this;
  }

  /**
   * Get messageReferences
   * @return messageReferences
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EventReference> getMessageReferences() {
    return messageReferences;
  }

  public void setMessageReferences(List<EventReference> messageReferences) {
    this.messageReferences = messageReferences;
  }

  public EventResource occurred(OffsetDateTime occurred) {

    this.occurred = occurred;
    return this;
  }

  /**
   * Get occurred
   * @return occurred
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getOccurred() {
    return occurred;
  }

  public void setOccurred(OffsetDateTime occurred) { this.occurred = occurred; }

  public EventResource relatedDocumentIds(Set<String> relatedDocumentIds) {

    this.relatedDocumentIds = relatedDocumentIds;
    return this;
  }

  public EventResource
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

  public EventResource spaceId(String spaceId) {

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

  public EventResource userAgent(String userAgent) {

    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) { this.userAgent = userAgent; }

  public EventResource userId(String userId) {

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) { this.userId = userId; }

  public EventResource username(String username) {

    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) { this.username = username; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResource eventResource = (EventResource)o;
    return Objects.equals(this.category, eventResource.category) &&
        Objects.equals(this.changeDetails, eventResource.changeDetails) &&
        Objects.equals(this.comments, eventResource.comments) &&
        Objects.equals(this.details, eventResource.details) &&
        Objects.equals(this.id, eventResource.id) &&
        Objects.equals(this.identityEstablishedWith,
                       eventResource.identityEstablishedWith) &&
        Objects.equals(this.isService, eventResource.isService) &&
        Objects.equals(this.lastModifiedBy, eventResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, eventResource.lastModifiedOn) &&
        Objects.equals(this.links, eventResource.links) &&
        Objects.equals(this.message, eventResource.message) &&
        Objects.equals(this.messageHtml, eventResource.messageHtml) &&
        Objects.equals(this.messageReferences,
                       eventResource.messageReferences) &&
        Objects.equals(this.occurred, eventResource.occurred) &&
        Objects.equals(this.relatedDocumentIds,
                       eventResource.relatedDocumentIds) &&
        Objects.equals(this.spaceId, eventResource.spaceId) &&
        Objects.equals(this.userAgent, eventResource.userAgent) &&
        Objects.equals(this.userId, eventResource.userId) &&
        Objects.equals(this.username, eventResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, changeDetails, comments, details, id,
                        identityEstablishedWith, isService, lastModifiedBy,
                        lastModifiedOn, links, message, messageHtml,
                        messageReferences, occurred, relatedDocumentIds,
                        spaceId, userAgent, userId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResource {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    changeDetails: ")
        .append(toIndentedString(changeDetails))
        .append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityEstablishedWith: ")
        .append(toIndentedString(identityEstablishedWith))
        .append("\n");
    sb.append("    isService: ")
        .append(toIndentedString(isService))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageHtml: ")
        .append(toIndentedString(messageHtml))
        .append("\n");
    sb.append("    messageReferences: ")
        .append(toIndentedString(messageReferences))
        .append("\n");
    sb.append("    occurred: ").append(toIndentedString(occurred)).append("\n");
    sb.append("    relatedDocumentIds: ")
        .append(toIndentedString(relatedDocumentIds))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    userAgent: ")
        .append(toIndentedString(userAgent))
        .append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
