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

package com.octopus.sdk.model.task;

public class TaskResourceWithLinks extends TaskResource {

  public TaskResourceWithLinks(final String name) {
    super(name);
  }

  public String getCancelLink() {
    return getCleansedLink("Cancel");
  }

  public String getDetailsLink() {
    return getCleansedLink("Details");
  }

  public String getQueuedBehindLink() {
    return getCleansedLink("QueuedBehind");
  }

  public String getRawLink() {
    return getCleansedLink("Raw");
  }

  public String getRerunLink() {
    return getCleansedLink("Rerun");
  }

  public String getStateLink() {
    return getCleansedLink("State");
  }

  public String getWebLink() {
    return getCleansedLink("Web");
  }
}
