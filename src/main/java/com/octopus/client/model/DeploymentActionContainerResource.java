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
import java.util.Arrays;
import java.util.Objects;

/**
 * DeploymentActionContainerResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentActionContainerResource {
  public static final String SERIALIZED_NAME_FEED_ID = "FeedId";
  @SerializedName(SERIALIZED_NAME_FEED_ID) private String feedId;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE) private String image;

  public DeploymentActionContainerResource feedId(String feedId) {

    this.feedId = feedId;
    return this;
  }

  /**
   * Get feedId
   * @return feedId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) { this.feedId = feedId; }

  public DeploymentActionContainerResource image(String image) {

    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }

  public void setImage(String image) { this.image = image; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActionContainerResource deploymentActionContainerResource =
        (DeploymentActionContainerResource)o;
    return Objects.equals(this.feedId,
                          deploymentActionContainerResource.feedId) &&
        Objects.equals(this.image, deploymentActionContainerResource.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentActionContainerResource {\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
