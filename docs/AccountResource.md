

# AccountResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  |  [optional] [readonly]
**description** | **String** |  |  [optional]
**environmentIds** | **Set&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedOn** | **OffsetDateTime** |  |  [optional]
**links** | **Map&lt;String, String&gt;** |  |  [optional]
**name** | **String** |  |  [optional]
**spaceId** | **String** |  |  [optional]
**tenantedDeploymentParticipation** | **TenantedDeploymentMode** |  |  [optional]
**tenantIds** | **Set&lt;String&gt;** |  |  [optional]
**tenantTags** | **Set&lt;String&gt;** |  |  [optional]



## Enum: AccountTypeEnum

Name | Value
---- | -----
AMAZONWEBSERVICESACCOUNT | &quot;AmazonWebServicesAccount&quot;
AZURESERVICEPRINCIPAL | &quot;AzureServicePrincipal&quot;
AZURESUBSCRIPTION | &quot;AzureSubscription&quot;
NONE | &quot;None&quot;
SSHKEYPAIR | &quot;SshKeyPair&quot;
TOKEN | &quot;Token&quot;
USERNAMEPASSWORD | &quot;UsernamePassword&quot;



