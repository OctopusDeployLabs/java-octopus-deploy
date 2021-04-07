

# DeploymentActionResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionType** | **String** |  |  [optional]
**canBeUsedForProjectVersioning** | **Boolean** |  |  [optional]
**channels** | **Set&lt;String&gt;** |  |  [optional] [readonly]
**condition** | **DeploymentActionCondition** |  |  [optional]
**container** | [**DeploymentActionContainerResource**](DeploymentActionContainerResource.md) |  |  [optional]
**environments** | **Set&lt;String&gt;** |  |  [optional] [readonly]
**excludedEnvironments** | **Set&lt;String&gt;** |  |  [optional] [readonly]
**id** | **String** |  |  [optional]
**isDisabled** | **Boolean** |  |  [optional]
**isRequired** | **Boolean** |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedOn** | **OffsetDateTime** |  |  [optional]
**links** | **Map&lt;String, String&gt;** |  |  [optional]
**name** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**packages** | [**List&lt;PackageReference&gt;**](PackageReference.md) |  |  [optional]
**properties** | [**Map&lt;String, PropertyValueResource&gt;**](PropertyValueResource.md) |  |  [optional] [readonly]
**tenantTags** | **Set&lt;String&gt;** |  |  [optional] [readonly]
**workerPoolId** | **String** |  |  [optional]
**workerPoolVariable** | **String** |  |  [optional]



