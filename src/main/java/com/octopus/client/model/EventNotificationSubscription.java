// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.EmailPriority;
import com.octopus.client.model.EventNotificationSubscriptionFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * EventNotificationSubscription
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EventNotificationSubscription {
  public static final String SERIALIZED_NAME_EMAIL_DIGEST_LAST_PROCESSED =
      "EmailDigestLastProcessed";
  @SerializedName(SERIALIZED_NAME_EMAIL_DIGEST_LAST_PROCESSED)
  private OffsetDateTime emailDigestLastProcessed;

  public static final String
      SERIALIZED_NAME_EMAIL_DIGEST_LAST_PROCESSED_EVENT_AUTO_ID =
          "EmailDigestLastProcessedEventAutoId";
  @SerializedName(SERIALIZED_NAME_EMAIL_DIGEST_LAST_PROCESSED_EVENT_AUTO_ID)
  private Long emailDigestLastProcessedEventAutoId;

  public static final String SERIALIZED_NAME_EMAIL_FREQUENCY_PERIOD =
      "EmailFrequencyPeriod";
  @SerializedName(SERIALIZED_NAME_EMAIL_FREQUENCY_PERIOD)
  private String emailFrequencyPeriod;

  public static final String SERIALIZED_NAME_EMAIL_PRIORITY = "EmailPriority";
  @SerializedName(SERIALIZED_NAME_EMAIL_PRIORITY)
  private EmailPriority emailPriority;

  public static final String SERIALIZED_NAME_EMAIL_SHOW_DATES_IN_TIME_ZONE_ID =
      "EmailShowDatesInTimeZoneId";
  @SerializedName(SERIALIZED_NAME_EMAIL_SHOW_DATES_IN_TIME_ZONE_ID)
  private String emailShowDatesInTimeZoneId;

  public static final String SERIALIZED_NAME_EMAIL_TEAMS = "EmailTeams";
  @SerializedName(SERIALIZED_NAME_EMAIL_TEAMS)
  private Set<String> emailTeams = null;

  public static final String SERIALIZED_NAME_FILTER = "Filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventNotificationSubscriptionFilter filter;

  public static final String SERIALIZED_NAME_WEBHOOK_HEADER_KEY =
      "WebhookHeaderKey";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_HEADER_KEY)
  private String webhookHeaderKey;

  public static final String SERIALIZED_NAME_WEBHOOK_HEADER_VALUE =
      "WebhookHeaderValue";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_HEADER_VALUE)
  private String webhookHeaderValue;

  public static final String SERIALIZED_NAME_WEBHOOK_LAST_PROCESSED =
      "WebhookLastProcessed";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_LAST_PROCESSED)
  private OffsetDateTime webhookLastProcessed;

  public static final String
      SERIALIZED_NAME_WEBHOOK_LAST_PROCESSED_EVENT_AUTO_ID =
          "WebhookLastProcessedEventAutoId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_LAST_PROCESSED_EVENT_AUTO_ID)
  private Long webhookLastProcessedEventAutoId;

  public static final String SERIALIZED_NAME_WEBHOOK_TEAMS = "WebhookTeams";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TEAMS)
  private Set<String> webhookTeams = null;

  public static final String SERIALIZED_NAME_WEBHOOK_TIMEOUT = "WebhookTimeout";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TIMEOUT)
  private String webhookTimeout;

  public static final String SERIALIZED_NAME_WEBHOOK_U_R_I = "WebhookURI";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_U_R_I) private String webhookURI;

  public EventNotificationSubscription
  emailDigestLastProcessed(OffsetDateTime emailDigestLastProcessed) {

    this.emailDigestLastProcessed = emailDigestLastProcessed;
    return this;
  }

  /**
   * Get emailDigestLastProcessed
   * @return emailDigestLastProcessed
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEmailDigestLastProcessed() {
    return emailDigestLastProcessed;
  }

  public void
  setEmailDigestLastProcessed(OffsetDateTime emailDigestLastProcessed) {
    this.emailDigestLastProcessed = emailDigestLastProcessed;
  }

  public EventNotificationSubscription emailDigestLastProcessedEventAutoId(
      Long emailDigestLastProcessedEventAutoId) {

    this.emailDigestLastProcessedEventAutoId =
        emailDigestLastProcessedEventAutoId;
    return this;
  }

  /**
   * Get emailDigestLastProcessedEventAutoId
   * @return emailDigestLastProcessedEventAutoId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getEmailDigestLastProcessedEventAutoId() {
    return emailDigestLastProcessedEventAutoId;
  }

  public void setEmailDigestLastProcessedEventAutoId(
      Long emailDigestLastProcessedEventAutoId) {
    this.emailDigestLastProcessedEventAutoId =
        emailDigestLastProcessedEventAutoId;
  }

  public EventNotificationSubscription
  emailFrequencyPeriod(String emailFrequencyPeriod) {

    this.emailFrequencyPeriod = emailFrequencyPeriod;
    return this;
  }

  /**
   * Get emailFrequencyPeriod
   * @return emailFrequencyPeriod
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFrequencyPeriod() {
    return emailFrequencyPeriod;
  }

  public void setEmailFrequencyPeriod(String emailFrequencyPeriod) {
    this.emailFrequencyPeriod = emailFrequencyPeriod;
  }

  public EventNotificationSubscription
  emailPriority(EmailPriority emailPriority) {

    this.emailPriority = emailPriority;
    return this;
  }

  /**
   * Get emailPriority
   * @return emailPriority
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmailPriority getEmailPriority() {
    return emailPriority;
  }

  public void setEmailPriority(EmailPriority emailPriority) {
    this.emailPriority = emailPriority;
  }

  public EventNotificationSubscription
  emailShowDatesInTimeZoneId(String emailShowDatesInTimeZoneId) {

    this.emailShowDatesInTimeZoneId = emailShowDatesInTimeZoneId;
    return this;
  }

  /**
   * Get emailShowDatesInTimeZoneId
   * @return emailShowDatesInTimeZoneId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailShowDatesInTimeZoneId() {
    return emailShowDatesInTimeZoneId;
  }

  public void setEmailShowDatesInTimeZoneId(String emailShowDatesInTimeZoneId) {
    this.emailShowDatesInTimeZoneId = emailShowDatesInTimeZoneId;
  }

  public EventNotificationSubscription emailTeams(Set<String> emailTeams) {

    this.emailTeams = emailTeams;
    return this;
  }

  public EventNotificationSubscription
  addEmailTeamsItem(String emailTeamsItem) {
    if (this.emailTeams == null) {
      this.emailTeams = new LinkedHashSet<String>();
    }
    this.emailTeams.add(emailTeamsItem);
    return this;
  }

  /**
   * Get emailTeams
   * @return emailTeams
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEmailTeams() {
    return emailTeams;
  }

  public void setEmailTeams(Set<String> emailTeams) {
    this.emailTeams = emailTeams;
  }

  public EventNotificationSubscription
  filter(EventNotificationSubscriptionFilter filter) {

    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationSubscriptionFilter getFilter() {
    return filter;
  }

  public void setFilter(EventNotificationSubscriptionFilter filter) {
    this.filter = filter;
  }

  public EventNotificationSubscription
  webhookHeaderKey(String webhookHeaderKey) {

    this.webhookHeaderKey = webhookHeaderKey;
    return this;
  }

  /**
   * Get webhookHeaderKey
   * @return webhookHeaderKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookHeaderKey() {
    return webhookHeaderKey;
  }

  public void setWebhookHeaderKey(String webhookHeaderKey) {
    this.webhookHeaderKey = webhookHeaderKey;
  }

  public EventNotificationSubscription
  webhookHeaderValue(String webhookHeaderValue) {

    this.webhookHeaderValue = webhookHeaderValue;
    return this;
  }

  /**
   * Get webhookHeaderValue
   * @return webhookHeaderValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookHeaderValue() {
    return webhookHeaderValue;
  }

  public void setWebhookHeaderValue(String webhookHeaderValue) {
    this.webhookHeaderValue = webhookHeaderValue;
  }

  public EventNotificationSubscription
  webhookLastProcessed(OffsetDateTime webhookLastProcessed) {

    this.webhookLastProcessed = webhookLastProcessed;
    return this;
  }

  /**
   * Get webhookLastProcessed
   * @return webhookLastProcessed
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getWebhookLastProcessed() {
    return webhookLastProcessed;
  }

  public void setWebhookLastProcessed(OffsetDateTime webhookLastProcessed) {
    this.webhookLastProcessed = webhookLastProcessed;
  }

  public EventNotificationSubscription
  webhookLastProcessedEventAutoId(Long webhookLastProcessedEventAutoId) {

    this.webhookLastProcessedEventAutoId = webhookLastProcessedEventAutoId;
    return this;
  }

  /**
   * Get webhookLastProcessedEventAutoId
   * @return webhookLastProcessedEventAutoId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWebhookLastProcessedEventAutoId() {
    return webhookLastProcessedEventAutoId;
  }

  public void
  setWebhookLastProcessedEventAutoId(Long webhookLastProcessedEventAutoId) {
    this.webhookLastProcessedEventAutoId = webhookLastProcessedEventAutoId;
  }

  public EventNotificationSubscription webhookTeams(Set<String> webhookTeams) {

    this.webhookTeams = webhookTeams;
    return this;
  }

  public EventNotificationSubscription
  addWebhookTeamsItem(String webhookTeamsItem) {
    if (this.webhookTeams == null) {
      this.webhookTeams = new LinkedHashSet<String>();
    }
    this.webhookTeams.add(webhookTeamsItem);
    return this;
  }

  /**
   * Get webhookTeams
   * @return webhookTeams
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getWebhookTeams() {
    return webhookTeams;
  }

  public void setWebhookTeams(Set<String> webhookTeams) {
    this.webhookTeams = webhookTeams;
  }

  public EventNotificationSubscription webhookTimeout(String webhookTimeout) {

    this.webhookTimeout = webhookTimeout;
    return this;
  }

  /**
   * Get webhookTimeout
   * @return webhookTimeout
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookTimeout() {
    return webhookTimeout;
  }

  public void setWebhookTimeout(String webhookTimeout) {
    this.webhookTimeout = webhookTimeout;
  }

  public EventNotificationSubscription webhookURI(String webhookURI) {

    this.webhookURI = webhookURI;
    return this;
  }

  /**
   * Get webhookURI
   * @return webhookURI
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookURI() {
    return webhookURI;
  }

  public void setWebhookURI(String webhookURI) { this.webhookURI = webhookURI; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotificationSubscription eventNotificationSubscription =
        (EventNotificationSubscription)o;
    return Objects.equals(
               this.emailDigestLastProcessed,
               eventNotificationSubscription.emailDigestLastProcessed) &&
        Objects.equals(this.emailDigestLastProcessedEventAutoId,
                       eventNotificationSubscription
                           .emailDigestLastProcessedEventAutoId) &&
        Objects.equals(this.emailFrequencyPeriod,
                       eventNotificationSubscription.emailFrequencyPeriod) &&
        Objects.equals(this.emailPriority,
                       eventNotificationSubscription.emailPriority) &&
        Objects.equals(
            this.emailShowDatesInTimeZoneId,
            eventNotificationSubscription.emailShowDatesInTimeZoneId) &&
        Objects.equals(this.emailTeams,
                       eventNotificationSubscription.emailTeams) &&
        Objects.equals(this.filter, eventNotificationSubscription.filter) &&
        Objects.equals(this.webhookHeaderKey,
                       eventNotificationSubscription.webhookHeaderKey) &&
        Objects.equals(this.webhookHeaderValue,
                       eventNotificationSubscription.webhookHeaderValue) &&
        Objects.equals(this.webhookLastProcessed,
                       eventNotificationSubscription.webhookLastProcessed) &&
        Objects.equals(
            this.webhookLastProcessedEventAutoId,
            eventNotificationSubscription.webhookLastProcessedEventAutoId) &&
        Objects.equals(this.webhookTeams,
                       eventNotificationSubscription.webhookTeams) &&
        Objects.equals(this.webhookTimeout,
                       eventNotificationSubscription.webhookTimeout) &&
        Objects.equals(this.webhookURI,
                       eventNotificationSubscription.webhookURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        emailDigestLastProcessed, emailDigestLastProcessedEventAutoId,
        emailFrequencyPeriod, emailPriority, emailShowDatesInTimeZoneId,
        emailTeams, filter, webhookHeaderKey, webhookHeaderValue,
        webhookLastProcessed, webhookLastProcessedEventAutoId, webhookTeams,
        webhookTimeout, webhookURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotificationSubscription {\n");
    sb.append("    emailDigestLastProcessed: ")
        .append(toIndentedString(emailDigestLastProcessed))
        .append("\n");
    sb.append("    emailDigestLastProcessedEventAutoId: ")
        .append(toIndentedString(emailDigestLastProcessedEventAutoId))
        .append("\n");
    sb.append("    emailFrequencyPeriod: ")
        .append(toIndentedString(emailFrequencyPeriod))
        .append("\n");
    sb.append("    emailPriority: ")
        .append(toIndentedString(emailPriority))
        .append("\n");
    sb.append("    emailShowDatesInTimeZoneId: ")
        .append(toIndentedString(emailShowDatesInTimeZoneId))
        .append("\n");
    sb.append("    emailTeams: ")
        .append(toIndentedString(emailTeams))
        .append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    webhookHeaderKey: ")
        .append(toIndentedString(webhookHeaderKey))
        .append("\n");
    sb.append("    webhookHeaderValue: ")
        .append(toIndentedString(webhookHeaderValue))
        .append("\n");
    sb.append("    webhookLastProcessed: ")
        .append(toIndentedString(webhookLastProcessed))
        .append("\n");
    sb.append("    webhookLastProcessedEventAutoId: ")
        .append(toIndentedString(webhookLastProcessedEventAutoId))
        .append("\n");
    sb.append("    webhookTeams: ")
        .append(toIndentedString(webhookTeams))
        .append("\n");
    sb.append("    webhookTimeout: ")
        .append(toIndentedString(webhookTimeout))
        .append("\n");
    sb.append("    webhookURI: ")
        .append(toIndentedString(webhookURI))
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
