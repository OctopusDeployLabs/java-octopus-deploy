<#
.SYNOPSIS
    Generate resource with links get methods and outputs to console.
.DESCRIPTION
    Using an Octopus Deploy server instance on localhost and user input,
    automatically generates getters for the "typed" resource with links.

    This script retrieves the json field names from the API call and uses them
    to construct the relevant getters.
.PARAMETER Url
    The full URL to the desired resource (eg. "http://localhost:8065/api/tenants/Tenants-1").
.PARAMETER ApiKey
    A valid API key for the URL provided, if not provided the script attempts to find the API key
    as an environment variable called: OCTOPUS_SERVER_API_KEY.
#>
[CmdletBinding()]
param (
  [Parameter(Mandatory)]
  [ValidateNotNullOrEmpty()]
  [String]$Url,

  [ValidateNotNullOrEmpty()]
  [String]$ApiKey = $env:OCTOPUS_SERVER_API_KEY
)

try {
  $Response = Invoke-RestMethod -Method Get -Uri $Url -Headers @{"X-Octopus-ApiKey" = $ApiKey} -ContentType "application/json" -ErrorAction Stop
  $LinkNames = $Response.Links.psobject.Properties | Where-Object -Property name -NE "Self" | Select-Object -ExpandProperty name
} catch {
  Write-Warning $Error[0].Exception.Message
  Exit 1
}

Write-Output "--------------------------------------------------"

foreach($name in $LinkNames) {
Write-Output @"

public String get${name}Link() {
  return getCleansedLink("${name}");
}
"@
}

Write-Output "
--------------------------------------------------"
