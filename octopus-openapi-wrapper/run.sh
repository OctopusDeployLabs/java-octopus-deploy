#!/bin/sh

openapi-generator-cli \
  generate --enable-post-process-file \
  -g java \
  -i spec/swagger.json \
  --skip-validate-spec \
  -p withSeparateModelsAndApi=true \
  -p apiPackage=com.octopus.client.api \
  -p modelPackage=com.octopus.client.model \
  -p groupId=com.octopus \
  -p developerName="Octopus Deploy" \
  -p developerOrganization="Octopus Deploy" \
  -p developerEmail=support@octopus.com \
  -p artifactId=octopus-deploy-java-client \
  -p developerOrganizationUrl=octopus.com \
  -p licenseName="Apache 2.0" \
  -p licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt \
  -p scmConnection=scm:git:git@github.com:OctopusDeployLabs/java-octopus-deploy.git \
  -p scmDeveloperConnection=scm:git:git@github.com:OctopusDeployLabs/java-octopus-deploy.git \
  -p scmUrl=https://github.com/OctopusDeployLabs/java-octopus-deploy \
  -p artifactUrl=https://github.com/OctopusDeployLabs/java-octopus-deploy \
  -p generateApiTests=false \
  -t templates
