

# CertificateResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **OffsetDateTime** |  |  [optional]
**certificateChain** | [**List&lt;X509Certificate&gt;**](X509Certificate.md) |  |  [optional]
**certificateData** | [**SensitiveValue**](SensitiveValue.md) |  |  [optional]
**certificateDataFormat** | **CertificateFormat** |  |  [optional]
**environmentIds** | **Set&lt;String&gt;** |  |  [optional]
**hasPrivateKey** | **Boolean** |  |  [optional]
**id** | **String** |  |  [optional]
**isExpired** | **Boolean** |  |  [optional]
**issuerCommonName** | **String** |  |  [optional]
**issuerDistinguishedName** | **String** |  |  [optional]
**issuerOrganization** | **String** |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedOn** | **OffsetDateTime** |  |  [optional]
**links** | **Map&lt;String, String&gt;** |  |  [optional]
**name** | **String** |  |  [optional]
**notAfter** | **OffsetDateTime** |  |  [optional]
**notBefore** | **OffsetDateTime** |  |  [optional]
**notes** | **String** |  |  [optional]
**password** | [**SensitiveValue**](SensitiveValue.md) |  |  [optional]
**replacedBy** | **String** |  |  [optional]
**selfSigned** | **Boolean** |  |  [optional]
**serialNumber** | **String** |  |  [optional]
**signatureAlgorithmName** | **String** |  |  [optional]
**spaceId** | **String** |  |  [optional]
**subjectAlternativeNames** | **List&lt;String&gt;** |  |  [optional]
**subjectCommonName** | **String** |  |  [optional]
**subjectDistinguishedName** | **String** |  |  [optional]
**subjectOrganization** | **String** |  |  [optional]
**tenantedDeploymentParticipation** | **TenantedDeploymentMode** |  |  [optional]
**tenantIds** | **Set&lt;String&gt;** |  |  [optional]
**tenantTags** | **Set&lt;String&gt;** |  |  [optional]
**thumbprint** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]



