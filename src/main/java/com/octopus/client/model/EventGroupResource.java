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
 * EventGroupResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class EventGroupResource {
  public static final String SERIALIZED_NAME_EVENT_CATEGORIES =
      "EventCategories";
  @SerializedName(SERIALIZED_NAME_EVENT_CATEGORIES)
  private List<String> eventCategories = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public EventGroupResource eventCategories(List<String> eventCategories) {

    this.eventCategories = eventCategories;
    return this;
  }

  public EventGroupResource addEventCategoriesItem(String eventCategoriesItem) {
    if (this.eventCategories == null) {
      this.eventCategories = new ArrayList<String>();
    }
    this.eventCategories.add(eventCategoriesItem);
    return this;
  }

  /**
   * Get eventCategories
   * @return eventCategories
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEventCategories() {
    return eventCategories;
  }

  public void setEventCategories(List<String> eventCategories) {
    this.eventCategories = eventCategories;
  }

  public EventGroupResource id(String id) {

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

  public EventGroupResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public EventGroupResource putLinksItem(String key, String linksItem) {
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

  public EventGroupResource name(String name) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventGroupResource eventGroupResource = (EventGroupResource)o;
    return Objects.equals(this.eventCategories,
                          eventGroupResource.eventCategories) &&
        Objects.equals(this.id, eventGroupResource.id) &&
        Objects.equals(this.links, eventGroupResource.links) &&
        Objects.equals(this.name, eventGroupResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCategories, id, links, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventGroupResource {\n");
    sb.append("    eventCategories: ")
        .append(toIndentedString(eventCategories))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
