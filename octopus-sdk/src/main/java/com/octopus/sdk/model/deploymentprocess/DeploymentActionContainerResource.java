/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.deploymentprocess;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** DeploymentActionContainerResource */
@SuppressWarnings("UnusedVariable")
public class DeploymentActionContainerResource {
  @SerializedName("FeedId")
  private String feedId;

  @SerializedName("Image")
  private String image;

  public DeploymentActionContainerResource feedId(String feedId) {

    this.feedId = feedId;
    return this;
  }

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public DeploymentActionContainerResource image(String image) {

    this.image = image;
    return this;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActionContainerResource deploymentActionContainerResource =
        (DeploymentActionContainerResource) o;
    return Objects.equals(this.feedId, deploymentActionContainerResource.feedId)
        && Objects.equals(this.image, deploymentActionContainerResource.image);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
