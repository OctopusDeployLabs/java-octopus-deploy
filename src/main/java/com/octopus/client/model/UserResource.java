// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.IdentityResource;
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
 * UserResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class UserResource {
  public static final String SERIALIZED_NAME_CAN_PASSWORD_BE_EDITED =
      "CanPasswordBeEdited";
  @SerializedName(SERIALIZED_NAME_CAN_PASSWORD_BE_EDITED)
  private Boolean canPasswordBeEdited;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME) private String displayName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "EmailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS) private String emailAddress;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IDENTITIES = "Identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private List<IdentityResource> identities = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE) private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_REQUESTOR = "IsRequestor";
  @SerializedName(SERIALIZED_NAME_IS_REQUESTOR) private Boolean isRequestor;

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

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD) private String password;

  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME) private String username;

  public UserResource canPasswordBeEdited(Boolean canPasswordBeEdited) {

    this.canPasswordBeEdited = canPasswordBeEdited;
    return this;
  }

  /**
   * Get canPasswordBeEdited
   * @return canPasswordBeEdited
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanPasswordBeEdited() {
    return canPasswordBeEdited;
  }

  public void setCanPasswordBeEdited(Boolean canPasswordBeEdited) {
    this.canPasswordBeEdited = canPasswordBeEdited;
  }

  public UserResource displayName(String displayName) {

    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserResource emailAddress(String emailAddress) {

    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserResource id(String id) {

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

  public UserResource identities(List<IdentityResource> identities) {

    this.identities = identities;
    return this;
  }

  public UserResource addIdentitiesItem(IdentityResource identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<IdentityResource>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

  /**
   * Get identities
   * @return identities
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IdentityResource> getIdentities() {
    return identities;
  }

  public void setIdentities(List<IdentityResource> identities) {
    this.identities = identities;
  }

  public UserResource isActive(Boolean isActive) {

    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) { this.isActive = isActive; }

  public UserResource isRequestor(Boolean isRequestor) {

    this.isRequestor = isRequestor;
    return this;
  }

  /**
   * Get isRequestor
   * @return isRequestor
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRequestor() {
    return isRequestor;
  }

  public void setIsRequestor(Boolean isRequestor) {
    this.isRequestor = isRequestor;
  }

  public UserResource isService(Boolean isService) {

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

  public UserResource lastModifiedBy(String lastModifiedBy) {

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

  public UserResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public UserResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public UserResource putLinksItem(String key, String linksItem) {
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

  public UserResource password(String password) {

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) { this.password = password; }

  public UserResource username(String username) {

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
    UserResource userResource = (UserResource)o;
    return Objects.equals(this.canPasswordBeEdited,
                          userResource.canPasswordBeEdited) &&
        Objects.equals(this.displayName, userResource.displayName) &&
        Objects.equals(this.emailAddress, userResource.emailAddress) &&
        Objects.equals(this.id, userResource.id) &&
        Objects.equals(this.identities, userResource.identities) &&
        Objects.equals(this.isActive, userResource.isActive) &&
        Objects.equals(this.isRequestor, userResource.isRequestor) &&
        Objects.equals(this.isService, userResource.isService) &&
        Objects.equals(this.lastModifiedBy, userResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, userResource.lastModifiedOn) &&
        Objects.equals(this.links, userResource.links) &&
        Objects.equals(this.password, userResource.password) &&
        Objects.equals(this.username, userResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPasswordBeEdited, displayName, emailAddress, id,
                        identities, isActive, isRequestor, isService,
                        lastModifiedBy, lastModifiedOn, links, password,
                        username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    sb.append("    canPasswordBeEdited: ")
        .append(toIndentedString(canPasswordBeEdited))
        .append("\n");
    sb.append("    displayName: ")
        .append(toIndentedString(displayName))
        .append("\n");
    sb.append("    emailAddress: ")
        .append(toIndentedString(emailAddress))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identities: ")
        .append(toIndentedString(identities))
        .append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isRequestor: ")
        .append(toIndentedString(isRequestor))
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
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
