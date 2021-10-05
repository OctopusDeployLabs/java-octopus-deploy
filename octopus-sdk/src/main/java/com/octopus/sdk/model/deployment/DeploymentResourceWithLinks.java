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

package com.octopus.sdk.model.deployment;

public class DeploymentResourceWithLinks extends DeploymentResource {

  public DeploymentResourceWithLinks(final String name) {
    super(name);
  }

  public String getArtifactsLink() {
    return getCleansedLink("Artifacts");
  }

  public String getDeploymentProcessLink() {
    return getCleansedLink("DeploymentProcess");
  }

  public String getEnvironmentLink() {
    return getCleansedLink("Environment");
  }

  public String getInterruptionsLink() {
    return getCleansedLink("Interruptions");
  }

  public String getProjectLink() {
    return getCleansedLink("Project");
  }

  public String getReleaseLink() {
    return getCleansedLink("Release");
  }

  public String getTaskLink() {
    return getCleansedLink("Task");
  }

  public String getVariablesLink() {
    return getCleansedLink("Variables");
  }

  public String getWebLink() {
    return getCleansedLink("Web");
  }
}
