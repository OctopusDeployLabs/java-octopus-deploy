// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.TenantedDeploymentMode;
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
 * AccountResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AccountResource {
  /**
   * Gets or Sets accountType
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    AMAZONWEBSERVICESACCOUNT("AmazonWebServicesAccount"),

    AZURESERVICEPRINCIPAL("AzureServicePrincipal"),

    AZURESUBSCRIPTION("AzureSubscription"),

    NONE("None"),

    SSHKEYPAIR("SshKeyPair"),

    TOKEN("Token"),

    USERNAMEPASSWORD("UsernamePassword");

    private String value;

    AccountTypeEnum(String value) { this.value = value; }

    public String getValue() { return value; }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter,
                        final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader)
          throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "AccountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ENVIRONMENT_IDS = "EnvironmentIds";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_IDS)
  private Set<String> environmentIds = null;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION =
      "TenantedDeploymentParticipation";
  @SerializedName(SERIALIZED_NAME_TENANTED_DEPLOYMENT_PARTICIPATION)
  private TenantedDeploymentMode tenantedDeploymentParticipation;

  public static final String SERIALIZED_NAME_TENANT_IDS = "TenantIds";
  @SerializedName(SERIALIZED_NAME_TENANT_IDS)
  private Set<String> tenantIds = null;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private Set<String> tenantTags = null;

  /**
   * Get accountType
   * @return accountType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public AccountResource description(String description) {

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

  public AccountResource environmentIds(Set<String> environmentIds) {

    this.environmentIds = environmentIds;
    return this;
  }

  public AccountResource addEnvironmentIdsItem(String environmentIdsItem) {
    if (this.environmentIds == null) {
      this.environmentIds = new LinkedHashSet<String>();
    }
    this.environmentIds.add(environmentIdsItem);
    return this;
  }

  /**
   * Get environmentIds
   * @return environmentIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironmentIds() {
    return environmentIds;
  }

  public void setEnvironmentIds(Set<String> environmentIds) {
    this.environmentIds = environmentIds;
  }

  public AccountResource id(String id) {

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

  public AccountResource lastModifiedBy(String lastModifiedBy) {

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

  public AccountResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public AccountResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public AccountResource putLinksItem(String key, String linksItem) {
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

  public AccountResource name(String name) {

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

  public AccountResource spaceId(String spaceId) {

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

  public AccountResource tenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {

    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
    return this;
  }

  /**
   * Get tenantedDeploymentParticipation
   * @return tenantedDeploymentParticipation
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TenantedDeploymentMode getTenantedDeploymentParticipation() {
    return tenantedDeploymentParticipation;
  }

  public void setTenantedDeploymentParticipation(
      TenantedDeploymentMode tenantedDeploymentParticipation) {
    this.tenantedDeploymentParticipation = tenantedDeploymentParticipation;
  }

  public AccountResource tenantIds(Set<String> tenantIds) {

    this.tenantIds = tenantIds;
    return this;
  }

  public AccountResource addTenantIdsItem(String tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new LinkedHashSet<String>();
    }
    this.tenantIds.add(tenantIdsItem);
    return this;
  }

  /**
   * Get tenantIds
   * @return tenantIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantIds() {
    return tenantIds;
  }

  public void setTenantIds(Set<String> tenantIds) {
    this.tenantIds = tenantIds;
  }

  public AccountResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public AccountResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<String>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(Set<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResource accountResource = (AccountResource)o;
    return Objects.equals(this.accountType, accountResource.accountType) &&
        Objects.equals(this.description, accountResource.description) &&
        Objects.equals(this.environmentIds, accountResource.environmentIds) &&
        Objects.equals(this.id, accountResource.id) &&
        Objects.equals(this.lastModifiedBy, accountResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, accountResource.lastModifiedOn) &&
        Objects.equals(this.links, accountResource.links) &&
        Objects.equals(this.name, accountResource.name) &&
        Objects.equals(this.spaceId, accountResource.spaceId) &&
        Objects.equals(this.tenantedDeploymentParticipation,
                       accountResource.tenantedDeploymentParticipation) &&
        Objects.equals(this.tenantIds, accountResource.tenantIds) &&
        Objects.equals(this.tenantTags, accountResource.tenantTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, description, environmentIds, id,
                        lastModifiedBy, lastModifiedOn, links, name, spaceId,
                        tenantedDeploymentParticipation, tenantIds, tenantTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResource {\n");
    sb.append("    accountType: ")
        .append(toIndentedString(accountType))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    environmentIds: ")
        .append(toIndentedString(environmentIds))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tenantedDeploymentParticipation: ")
        .append(toIndentedString(tenantedDeploymentParticipation))
        .append("\n");
    sb.append("    tenantIds: ")
        .append(toIndentedString(tenantIds))
        .append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
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
