<#
.SYNOPSIS
    Generate resource with links class code and output to console.
.DESCRIPTION
    Using an Octopus Deploy server instance on localhost and user input,
    automatically generates a Java class file code for a "typed" resource
    with links.

    This script retrieves the json field names from the API call and uses them
    to construct the relevant getters in the class file wrapped by the normal
    class code (eg. package, class name and syntax).
.PARAMETER ApiPath
    The URL path to the desired resource (eg. "api/tenants/Tenants-1").
.PARAMETER ResourceName
    The name of the resource class the generated links class extends
    (eg. TenantResource).
.PARAMETER PackageName
    The name of the package the generated class code will belong to.
#>
[CmdletBinding()]
param (
  [Parameter(Mandatory)]
  [ValidateNotNullOrEmpty()]
  [String]$ApiPath,

  [Parameter(Mandatory)]
  [ValidateNotNullOrEmpty()]
  [String]$ResourceName,

  [Parameter(Mandatory)]
  [ValidateNotNullOrEmpty()]
  [String]$PackageName
)

$API_KEY = "API-SR540XTIDMVIKXBLBAVBB7L2FQHYHL"
$API_HOST = "http://localhost:8065/"

$PackageName = $PackageName.ToLower()
try {
  $Response = Invoke-RestMethod -Method Get -Uri ($API_HOST + $ApiPath) -Headers @{"X-Octopus-ApiKey" = $API_KEY} -ContentType "application/json" -ErrorAction Stop
  $LinkNames = $Response.Links.psobject.Properties | Where-Object -Property name -NE "Self" | Select-Object -ExpandProperty name
} catch {
  Write-Warning $Error[0].Exception.Message
  Exit 1
}

$ClassFile = @"
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

package com.octopus.sdk.model.${PackageName};

public class ${ResourceName}WithLinks extends $ResourceName {

  public ${ResourceName}WithLinks(final String name) {
    super(name);
  }

 $(
  foreach($name in $LinkNames) {
@"
 public String get${name}Link() {
    return getCleansedLink("${name}");
  }`n

"@
  }
 )
}

"@

Write-Output $ClassFile
