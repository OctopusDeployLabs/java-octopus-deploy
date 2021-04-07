// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.EventNotificationSubscription;
import com.octopus.client.model.SubscriptionType;
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
 * SubscriptionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class SubscriptionResource {
  public static final String SERIALIZED_NAME_EVENT_NOTIFICATION_SUBSCRIPTION =
      "EventNotificationSubscription";
  @SerializedName(SERIALIZED_NAME_EVENT_NOTIFICATION_SUBSCRIPTION)
  private EventNotificationSubscription eventNotificationSubscription;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

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

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private SubscriptionType type;

  public SubscriptionResource eventNotificationSubscription(
      EventNotificationSubscription eventNotificationSubscription) {

    this.eventNotificationSubscription = eventNotificationSubscription;
    return this;
  }

  /**
   * Get eventNotificationSubscription
   * @return eventNotificationSubscription
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationSubscription getEventNotificationSubscription() {
    return eventNotificationSubscription;
  }

  public void setEventNotificationSubscription(
      EventNotificationSubscription eventNotificationSubscription) {
    this.eventNotificationSubscription = eventNotificationSubscription;
  }

  public SubscriptionResource id(String id) {

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

  public SubscriptionResource isDisabled(Boolean isDisabled) {

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

  public SubscriptionResource lastModifiedBy(String lastModifiedBy) {

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

  public SubscriptionResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public SubscriptionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public SubscriptionResource putLinksItem(String key, String linksItem) {
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

  public SubscriptionResource name(String name) {

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

  public SubscriptionResource spaceId(String spaceId) {

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

  public SubscriptionResource type(SubscriptionType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriptionType getType() {
    return type;
  }

  public void setType(SubscriptionType type) { this.type = type; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResource subscriptionResource = (SubscriptionResource)o;
    return Objects.equals(this.eventNotificationSubscription,
                          subscriptionResource.eventNotificationSubscription) &&
        Objects.equals(this.id, subscriptionResource.id) &&
        Objects.equals(this.isDisabled, subscriptionResource.isDisabled) &&
        Objects.equals(this.lastModifiedBy,
                       subscriptionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       subscriptionResource.lastModifiedOn) &&
        Objects.equals(this.links, subscriptionResource.links) &&
        Objects.equals(this.name, subscriptionResource.name) &&
        Objects.equals(this.spaceId, subscriptionResource.spaceId) &&
        Objects.equals(this.type, subscriptionResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventNotificationSubscription, id, isDisabled,
                        lastModifiedBy, lastModifiedOn, links, name, spaceId,
                        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResource {\n");
    sb.append("    eventNotificationSubscription: ")
        .append(toIndentedString(eventNotificationSubscription))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
