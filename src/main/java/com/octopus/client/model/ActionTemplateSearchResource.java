// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ActionTemplateSearchResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionTemplateSearchResource {
  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR) private String author;

  public static final String SERIALIZED_NAME_CATEGORIES = "Categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY) private String category;

  public static final String SERIALIZED_NAME_COMMUNITY_ACTION_TEMPLATE_ID =
      "CommunityActionTemplateId";
  @SerializedName(SERIALIZED_NAME_COMMUNITY_ACTION_TEMPLATE_ID)
  private String communityActionTemplateId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_HAS_UPDATE = "HasUpdate";
  @SerializedName(SERIALIZED_NAME_HAS_UPDATE) private Boolean hasUpdate;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_BUILT_IN = "IsBuiltIn";
  @SerializedName(SERIALIZED_NAME_IS_BUILT_IN) private Boolean isBuiltIn;

  public static final String SERIALIZED_NAME_IS_INSTALLED = "IsInstalled";
  @SerializedName(SERIALIZED_NAME_IS_INSTALLED) private Boolean isInstalled;

  public static final String SERIALIZED_NAME_KEYWORDS = "Keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS) private String keywords;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE) private String type;

  public static final String SERIALIZED_NAME_WEBSITE = "Website";
  @SerializedName(SERIALIZED_NAME_WEBSITE) private String website;

  public ActionTemplateSearchResource author(String author) {

    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) { this.author = author; }

  public ActionTemplateSearchResource categories(List<String> categories) {

    this.categories = categories;
    return this;
  }

  public ActionTemplateSearchResource addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public ActionTemplateSearchResource category(String category) {

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

  public ActionTemplateSearchResource
  communityActionTemplateId(String communityActionTemplateId) {

    this.communityActionTemplateId = communityActionTemplateId;
    return this;
  }

  /**
   * Get communityActionTemplateId
   * @return communityActionTemplateId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommunityActionTemplateId() {
    return communityActionTemplateId;
  }

  public void setCommunityActionTemplateId(String communityActionTemplateId) {
    this.communityActionTemplateId = communityActionTemplateId;
  }

  public ActionTemplateSearchResource description(String description) {

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

  public ActionTemplateSearchResource hasUpdate(Boolean hasUpdate) {

    this.hasUpdate = hasUpdate;
    return this;
  }

  /**
   * Get hasUpdate
   * @return hasUpdate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasUpdate() {
    return hasUpdate;
  }

  public void setHasUpdate(Boolean hasUpdate) { this.hasUpdate = hasUpdate; }

  public ActionTemplateSearchResource id(String id) {

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

  public ActionTemplateSearchResource isBuiltIn(Boolean isBuiltIn) {

    this.isBuiltIn = isBuiltIn;
    return this;
  }

  /**
   * Get isBuiltIn
   * @return isBuiltIn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }

  public void setIsBuiltIn(Boolean isBuiltIn) { this.isBuiltIn = isBuiltIn; }

  public ActionTemplateSearchResource isInstalled(Boolean isInstalled) {

    this.isInstalled = isInstalled;
    return this;
  }

  /**
   * Get isInstalled
   * @return isInstalled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInstalled() {
    return isInstalled;
  }

  public void setIsInstalled(Boolean isInstalled) {
    this.isInstalled = isInstalled;
  }

  public ActionTemplateSearchResource keywords(String keywords) {

    this.keywords = keywords;
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) { this.keywords = keywords; }

  public ActionTemplateSearchResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ActionTemplateSearchResource putLinksItem(String key,
                                                   String linksItem) {
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

  public ActionTemplateSearchResource name(String name) {

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

  public ActionTemplateSearchResource type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }

  public void setType(String type) { this.type = type; }

  public ActionTemplateSearchResource website(String website) {

    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) { this.website = website; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionTemplateSearchResource actionTemplateSearchResource =
        (ActionTemplateSearchResource)o;
    return Objects.equals(this.author, actionTemplateSearchResource.author) &&
        Objects.equals(this.categories,
                       actionTemplateSearchResource.categories) &&
        Objects.equals(this.category, actionTemplateSearchResource.category) &&
        Objects.equals(
            this.communityActionTemplateId,
            actionTemplateSearchResource.communityActionTemplateId) &&
        Objects.equals(this.description,
                       actionTemplateSearchResource.description) &&
        Objects.equals(this.hasUpdate,
                       actionTemplateSearchResource.hasUpdate) &&
        Objects.equals(this.id, actionTemplateSearchResource.id) &&
        Objects.equals(this.isBuiltIn,
                       actionTemplateSearchResource.isBuiltIn) &&
        Objects.equals(this.isInstalled,
                       actionTemplateSearchResource.isInstalled) &&
        Objects.equals(this.keywords, actionTemplateSearchResource.keywords) &&
        Objects.equals(this.links, actionTemplateSearchResource.links) &&
        Objects.equals(this.name, actionTemplateSearchResource.name) &&
        Objects.equals(this.type, actionTemplateSearchResource.type) &&
        Objects.equals(this.website, actionTemplateSearchResource.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, categories, category, communityActionTemplateId,
                        description, hasUpdate, id, isBuiltIn, isInstalled,
                        keywords, links, name, type, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionTemplateSearchResource {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    categories: ")
        .append(toIndentedString(categories))
        .append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    communityActionTemplateId: ")
        .append(toIndentedString(communityActionTemplateId))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    hasUpdate: ")
        .append(toIndentedString(hasUpdate))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBuiltIn: ")
        .append(toIndentedString(isBuiltIn))
        .append("\n");
    sb.append("    isInstalled: ")
        .append(toIndentedString(isInstalled))
        .append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
