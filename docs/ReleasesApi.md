# ReleasesApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDefectReported**](ReleasesApi.md#createDefectReported) | **POST** /releases/{id}/defects | 
[**createDefectReportedSpaces**](ReleasesApi.md#createDefectReportedSpaces) | **POST** /{baseSpaceId}/releases/{id}/defects | 
[**createDefectResolved**](ReleasesApi.md#createDefectResolved) | **POST** /releases/{id}/defects/resolve | 
[**createDefectResolvedSpaces**](ReleasesApi.md#createDefectResolvedSpaces) | **POST** /{baseSpaceId}/releases/{id}/defects/resolve | 
[**createDeploymentPreviewCollection**](ReleasesApi.md#createDeploymentPreviewCollection) | **POST** /releases/{id}/deployments/previews | 
[**createDeploymentPreviewCollectionSpaces**](ReleasesApi.md#createDeploymentPreviewCollectionSpaces) | **POST** /{baseSpaceId}/releases/{id}/deployments/previews | 
[**createRelease**](ReleasesApi.md#createRelease) | **POST** /releases | Create a ReleaseResource
[**createReleaseSnapshotVariables**](ReleasesApi.md#createReleaseSnapshotVariables) | **POST** /releases/{id}/snapshot-variables | 
[**createReleaseSnapshotVariablesSpaces**](ReleasesApi.md#createReleaseSnapshotVariablesSpaces) | **POST** /{baseSpaceId}/releases/{id}/snapshot-variables | 
[**createReleaseSpaces**](ReleasesApi.md#createReleaseSpaces) | **POST** /{baseSpaceId}/releases | Create a ReleaseResource
[**deleteRelease**](ReleasesApi.md#deleteRelease) | **DELETE** /releases/{id} | Delete a ReleaseResource by ID
[**deleteReleaseSpaces**](ReleasesApi.md#deleteReleaseSpaces) | **DELETE** /{baseSpaceId}/releases/{id} | Delete a ReleaseResource by ID
[**getDeploymentPreview**](ReleasesApi.md#getDeploymentPreview) | **GET** /releases/{id}/deployments/preview/{environment} | 
[**getDeploymentPreview1**](ReleasesApi.md#getDeploymentPreview1) | **GET** /releases/{id}/deployments/preview/{environment}/{tenant} | 
[**getDeploymentPreviewSpaces**](ReleasesApi.md#getDeploymentPreviewSpaces) | **GET** /{baseSpaceId}/releases/{id}/deployments/preview/{environment} | 
[**getDeploymentPreviewSpaces1**](ReleasesApi.md#getDeploymentPreviewSpaces1) | **GET** /{baseSpaceId}/releases/{id}/deployments/preview/{environment}/{tenant} | 
[**getDeploymentTemplate**](ReleasesApi.md#getDeploymentTemplate) | **GET** /releases/{id}/deployments/template | 
[**getDeploymentTemplateSpaces**](ReleasesApi.md#getDeploymentTemplateSpaces) | **GET** /{baseSpaceId}/releases/{id}/deployments/template | 
[**getListDefects**](ReleasesApi.md#getListDefects) | **GET** /releases/{id}/defects | 
[**getListDefectsSpaces**](ReleasesApi.md#getListDefectsSpaces) | **GET** /{baseSpaceId}/releases/{id}/defects | 
[**getReleaseById**](ReleasesApi.md#getReleaseById) | **GET** /releases/{id} | Get a Release by ID
[**getReleaseByIdSpaces**](ReleasesApi.md#getReleaseByIdSpaces) | **GET** /{baseSpaceId}/releases/{id} | Get a Release by ID
[**getReleaseByProjectAndVersion**](ReleasesApi.md#getReleaseByProjectAndVersion) | **GET** /projects/{id}/releases/{version} | 
[**getReleaseByProjectAndVersionSpaces**](ReleasesApi.md#getReleaseByProjectAndVersionSpaces) | **GET** /{baseSpaceId}/projects/{id}/releases/{version} | 
[**getReleaseLifecycleProgression**](ReleasesApi.md#getReleaseLifecycleProgression) | **GET** /releases/{id}/progression | 
[**getReleaseLifecycleProgressionSpaces**](ReleasesApi.md#getReleaseLifecycleProgressionSpaces) | **GET** /{baseSpaceId}/releases/{id}/progression | 
[**indexProjectReleases**](ReleasesApi.md#indexProjectReleases) | **GET** /projects/{id}/releases | Get a list of ReleaseResources for the given ProjectResource
[**indexProjectReleasesSpaces**](ReleasesApi.md#indexProjectReleasesSpaces) | **GET** /{baseSpaceId}/projects/{id}/releases | Get a list of ReleaseResources for the given ProjectResource
[**indexReleaseDeployments**](ReleasesApi.md#indexReleaseDeployments) | **GET** /releases/{id}/deployments | Lists all of the Deployments that belong to the given Release
[**indexReleaseDeploymentsSpaces**](ReleasesApi.md#indexReleaseDeploymentsSpaces) | **GET** /{baseSpaceId}/releases/{id}/deployments | Lists all of the Deployments that belong to the given Release
[**indexReleases**](ReleasesApi.md#indexReleases) | **GET** /releases | Get a list of Releases
[**indexReleasesSpaces**](ReleasesApi.md#indexReleasesSpaces) | **GET** /{baseSpaceId}/releases | Get a list of Releases
[**updateRelease**](ReleasesApi.md#updateRelease) | **PUT** /releases/{id} | Modify a ReleaseResource by ID
[**updateReleaseSpaces**](ReleasesApi.md#updateReleaseSpaces) | **PUT** /{baseSpaceId}/releases/{id} | Modify a ReleaseResource by ID


<a name="createDefectReported"></a>
# **createDefectReported**
> DefectResource createDefectReported(id)



Record defect in a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      DefectResource result = apiInstance.createDefectReported(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDefectReported");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**DefectResource**](DefectResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DefectResource resource returned |  -  |
**400** | An unresolved defect already exists for this release.  No id parameter was provided.  No request body was supplied.  You must provide a description. |  -  |

<a name="createDefectReportedSpaces"></a>
# **createDefectReportedSpaces**
> DefectResource createDefectReportedSpaces(baseSpaceId, id)



Record defect in a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      DefectResource result = apiInstance.createDefectReportedSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDefectReportedSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**DefectResource**](DefectResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DefectResource resource returned |  -  |
**400** | An unresolved defect already exists for this release.  No id parameter was provided.  No request body was supplied.  You must provide a description. |  -  |

<a name="createDefectResolved"></a>
# **createDefectResolved**
> DefectResource createDefectResolved(id)



Update or resolve defect in a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      DefectResource result = apiInstance.createDefectResolved(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDefectResolved");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**DefectResource**](DefectResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DefectResource resource returned |  -  |
**400** | Defect has already been resolved.  Index refers to an invalid defect.  No id parameter was provided. |  -  |

<a name="createDefectResolvedSpaces"></a>
# **createDefectResolvedSpaces**
> DefectResource createDefectResolvedSpaces(baseSpaceId, id)



Update or resolve defect in a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      DefectResource result = apiInstance.createDefectResolvedSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDefectResolvedSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**DefectResource**](DefectResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DefectResource resource returned |  -  |
**400** | Defect has already been resolved.  Index refers to an invalid defect.  No id parameter was provided. |  -  |

<a name="createDeploymentPreviewCollection"></a>
# **createDeploymentPreviewCollection**
> List&lt;DeploymentPreviewResource&gt; createDeploymentPreviewCollection(id)



Returns an array of documents that describes what steps will/won&#39;t be run during deployments to a given set of environments and tenants.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      List<DeploymentPreviewResource> result = apiInstance.createDeploymentPreviewCollection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDeploymentPreviewCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**List&lt;DeploymentPreviewResource&gt;**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource[] resource returned |  -  |
**400** | No id parameter was provided.  No request body was supplied. |  -  |

<a name="createDeploymentPreviewCollectionSpaces"></a>
# **createDeploymentPreviewCollectionSpaces**
> List&lt;DeploymentPreviewResource&gt; createDeploymentPreviewCollectionSpaces(baseSpaceId, id)



Returns an array of documents that describes what steps will/won&#39;t be run during deployments to a given set of environments and tenants.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      List<DeploymentPreviewResource> result = apiInstance.createDeploymentPreviewCollectionSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createDeploymentPreviewCollectionSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**List&lt;DeploymentPreviewResource&gt;**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource[] resource returned |  -  |
**400** | No id parameter was provided.  No request body was supplied. |  -  |

<a name="createRelease"></a>
# **createRelease**
> ReleaseResource createRelease(ignoreChannelRules, body)

Create a ReleaseResource

Creates a new release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    Boolean ignoreChannelRules = true; // Boolean | Ignore channel rules.
    ReleaseResource body = new ReleaseResource(); // ReleaseResource | The ReleaseResource resource to create
    try {
      ReleaseResource result = apiInstance.createRelease(ignoreChannelRules, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoreChannelRules** | **Boolean**| Ignore channel rules. | [optional]
 **body** | [**ReleaseResource**](ReleaseResource.md)| The ReleaseResource resource to create | [optional]

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ReleaseResource Created |  -  |
**400** | A channelId must be provided for a release when more than one exists for that project and no default channel has been specified.  A version must be specified for every included package.  Creating a release for a version controlled process requires GitRef to be set on VersionControlReference  Model validation failed.  No project ID was specified.  No request body was supplied.  Release &#39;{release.Version}&#39; already exists for this project. Please use a different version, or look at using a mask to auto-increment the number.  The channel {channel.Name} specified for this release belongs to the project {channel.ProjectId}. It does not belong to the same project as the release.  The project is disabled, so releases cannot be created  The release number &#39;{release.Version}&#39; does not appear to be a valid version number. The version must consist of between 1 and 4 number only parts before the optional pre-release part. e.g. 2, 2.1, 2.4.0.23, 2.4-beta and 1-beta.2  The requested package versions for the following steps violate the channel version rules: {0}. Please specify a different package version, channel or provide the &#x60;ignoreChannelRules&#x60; parameter to override this check.  Unexpected VersionControlReference provided. Please remove this value or enable version control on this project |  -  |

<a name="createReleaseSnapshotVariables"></a>
# **createReleaseSnapshotVariables**
> ReleaseResource createReleaseSnapshotVariables(id)



Refresh the variable snapshots associated with the release. The project&#39;s deployment process must not have changed since the release was created.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      ReleaseResource result = apiInstance.createReleaseSnapshotVariables(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createReleaseSnapshotVariables");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="createReleaseSnapshotVariablesSpaces"></a>
# **createReleaseSnapshotVariablesSpaces**
> ReleaseResource createReleaseSnapshotVariablesSpaces(baseSpaceId, id)



Refresh the variable snapshots associated with the release. The project&#39;s deployment process must not have changed since the release was created.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      ReleaseResource result = apiInstance.createReleaseSnapshotVariablesSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createReleaseSnapshotVariablesSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="createReleaseSpaces"></a>
# **createReleaseSpaces**
> ReleaseResource createReleaseSpaces(baseSpaceId, ignoreChannelRules, body)

Create a ReleaseResource

Creates a new release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Boolean ignoreChannelRules = true; // Boolean | Ignore channel rules.
    ReleaseResource body = new ReleaseResource(); // ReleaseResource | The ReleaseResource resource to create
    try {
      ReleaseResource result = apiInstance.createReleaseSpaces(baseSpaceId, ignoreChannelRules, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#createReleaseSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **ignoreChannelRules** | **Boolean**| Ignore channel rules. | [optional]
 **body** | [**ReleaseResource**](ReleaseResource.md)| The ReleaseResource resource to create | [optional]

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ReleaseResource Created |  -  |
**400** | A channelId must be provided for a release when more than one exists for that project and no default channel has been specified.  A version must be specified for every included package.  Creating a release for a version controlled process requires GitRef to be set on VersionControlReference  Model validation failed.  No project ID was specified.  No request body was supplied.  Release &#39;{release.Version}&#39; already exists for this project. Please use a different version, or look at using a mask to auto-increment the number.  The channel {channel.Name} specified for this release belongs to the project {channel.ProjectId}. It does not belong to the same project as the release.  The project is disabled, so releases cannot be created  The release number &#39;{release.Version}&#39; does not appear to be a valid version number. The version must consist of between 1 and 4 number only parts before the optional pre-release part. e.g. 2, 2.1, 2.4.0.23, 2.4-beta and 1-beta.2  The requested package versions for the following steps violate the channel version rules: {0}. Please specify a different package version, channel or provide the &#x60;ignoreChannelRules&#x60; parameter to override this check.  Unexpected VersionControlReference provided. Please remove this value or enable version control on this project |  -  |

<a name="deleteRelease"></a>
# **deleteRelease**
> deleteRelease(id)

Delete a ReleaseResource by ID

Deletes an existing release, along with all of the deployments, tasks and other associated resources belonging to the release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the ReleaseResource to delete
    try {
      apiInstance.deleteRelease(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#deleteRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the ReleaseResource to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | BadRequest  No id parameter was provided.  This resource is read-only and cannot be deleted. |  -  |

<a name="deleteReleaseSpaces"></a>
# **deleteReleaseSpaces**
> deleteReleaseSpaces(baseSpaceId, id)

Delete a ReleaseResource by ID

Deletes an existing release, along with all of the deployments, tasks and other associated resources belonging to the release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the ReleaseResource to delete
    try {
      apiInstance.deleteReleaseSpaces(baseSpaceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#deleteReleaseSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the ReleaseResource to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | BadRequest  No id parameter was provided.  This resource is read-only and cannot be deleted. |  -  |

<a name="getDeploymentPreview"></a>
# **getDeploymentPreview**
> DeploymentPreviewResource getDeploymentPreview(environment, id)



Gets a document that describes what steps will/won&#39;t be run during a deployment to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    try {
      DeploymentPreviewResource result = apiInstance.getDeploymentPreview(environment, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |

### Return type

[**DeploymentPreviewResource**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getDeploymentPreview1"></a>
# **getDeploymentPreview1**
> DeploymentPreviewResource getDeploymentPreview1(environment, id, tenant)



Gets a document that describes what steps will/won&#39;t be run during a deployment to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    String tenant = "tenant_example"; // String | ID of the tenant
    try {
      DeploymentPreviewResource result = apiInstance.getDeploymentPreview1(environment, id, tenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentPreview1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |
 **tenant** | **String**| ID of the tenant |

### Return type

[**DeploymentPreviewResource**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getDeploymentPreviewSpaces"></a>
# **getDeploymentPreviewSpaces**
> DeploymentPreviewResource getDeploymentPreviewSpaces(baseSpaceId, environment, id)



Gets a document that describes what steps will/won&#39;t be run during a deployment to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    try {
      DeploymentPreviewResource result = apiInstance.getDeploymentPreviewSpaces(baseSpaceId, environment, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentPreviewSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |

### Return type

[**DeploymentPreviewResource**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getDeploymentPreviewSpaces1"></a>
# **getDeploymentPreviewSpaces1**
> DeploymentPreviewResource getDeploymentPreviewSpaces1(baseSpaceId, environment, id, tenant)



Gets a document that describes what steps will/won&#39;t be run during a deployment to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    String tenant = "tenant_example"; // String | ID of the tenant
    try {
      DeploymentPreviewResource result = apiInstance.getDeploymentPreviewSpaces1(baseSpaceId, environment, id, tenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentPreviewSpaces1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |
 **tenant** | **String**| ID of the tenant |

### Return type

[**DeploymentPreviewResource**](DeploymentPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getDeploymentTemplate"></a>
# **getDeploymentTemplate**
> DeploymentTemplateResource getDeploymentTemplate(id)



Gets all of the information necessary for creating or editing a deployment for this release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      DeploymentTemplateResource result = apiInstance.getDeploymentTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**DeploymentTemplateResource**](DeploymentTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |
**500** | A lifecycle has not been assigned to this project. |  -  |

<a name="getDeploymentTemplateSpaces"></a>
# **getDeploymentTemplateSpaces**
> DeploymentTemplateResource getDeploymentTemplateSpaces(baseSpaceId, id)



Gets all of the information necessary for creating or editing a deployment for this release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      DeploymentTemplateResource result = apiInstance.getDeploymentTemplateSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getDeploymentTemplateSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**DeploymentTemplateResource**](DeploymentTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | DeploymentTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |
**500** | A lifecycle has not been assigned to this project. |  -  |

<a name="getListDefects"></a>
# **getListDefects**
> DefectResourceCollection getListDefects(id)



Gets all defects for a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the defect
    try {
      DefectResourceCollection result = apiInstance.getListDefects(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getListDefects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the defect |

### Return type

[**DefectResourceCollection**](DefectResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_DefectResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getListDefectsSpaces"></a>
# **getListDefectsSpaces**
> DefectResourceCollection getListDefectsSpaces(baseSpaceId, id)



Gets all defects for a release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the defect
    try {
      DefectResourceCollection result = apiInstance.getListDefectsSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getListDefectsSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the defect |

### Return type

[**DefectResourceCollection**](DefectResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_DefectResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getReleaseById"></a>
# **getReleaseById**
> ReleaseResource getReleaseById(id)

Get a Release by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the Release to load
    try {
      ReleaseResource result = apiInstance.getReleaseById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Release to load |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getReleaseByIdSpaces"></a>
# **getReleaseByIdSpaces**
> ReleaseResource getReleaseByIdSpaces(id, baseSpaceId)

Get a Release by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the Release to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      ReleaseResource result = apiInstance.getReleaseByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseByIdSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Release to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getReleaseByProjectAndVersion"></a>
# **getReleaseByProjectAndVersion**
> ReleaseResource getReleaseByProjectAndVersion(id, version)



Gets a single release by project ID and version number.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    String version = "version_example"; // String | Release version number
    try {
      ReleaseResource result = apiInstance.getReleaseByProjectAndVersion(id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseByProjectAndVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |
 **version** | **String**| Release version number |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource resource returned |  -  |
**400** | No id parameter was provided.  No version parameter was provided. |  -  |

<a name="getReleaseByProjectAndVersionSpaces"></a>
# **getReleaseByProjectAndVersionSpaces**
> ReleaseResource getReleaseByProjectAndVersionSpaces(baseSpaceId, id, version)



Gets a single release by project ID and version number.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    String version = "version_example"; // String | Release version number
    try {
      ReleaseResource result = apiInstance.getReleaseByProjectAndVersionSpaces(baseSpaceId, id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseByProjectAndVersionSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |
 **version** | **String**| Release version number |

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource resource returned |  -  |
**400** | No id parameter was provided.  No version parameter was provided. |  -  |

<a name="getReleaseLifecycleProgression"></a>
# **getReleaseLifecycleProgression**
> LifecycleProgressionResource getReleaseLifecycleProgression(id)



Gets all of the information necessary for creating or editing a deployment for this release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      LifecycleProgressionResource result = apiInstance.getReleaseLifecycleProgression(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseLifecycleProgression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the resource |

### Return type

[**LifecycleProgressionResource**](LifecycleProgressionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LifecycleProgressionResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getReleaseLifecycleProgressionSpaces"></a>
# **getReleaseLifecycleProgressionSpaces**
> LifecycleProgressionResource getReleaseLifecycleProgressionSpaces(baseSpaceId, id)



Gets all of the information necessary for creating or editing a deployment for this release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      LifecycleProgressionResource result = apiInstance.getReleaseLifecycleProgressionSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#getReleaseLifecycleProgressionSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the resource |

### Return type

[**LifecycleProgressionResource**](LifecycleProgressionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LifecycleProgressionResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexProjectReleases"></a>
# **indexProjectReleases**
> ReleaseResourceCollection indexProjectReleases(id, skip, take)

Get a list of ReleaseResources for the given ProjectResource

Lists all of the releases that belong to the given project. Releases will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the Project
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      ReleaseResourceCollection result = apiInstance.indexProjectReleases(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexProjectReleases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Project |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**ReleaseResourceCollection**](ReleaseResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_ReleaseResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexProjectReleasesSpaces"></a>
# **indexProjectReleasesSpaces**
> ReleaseResourceCollection indexProjectReleasesSpaces(baseSpaceId, id, skip, take)

Get a list of ReleaseResources for the given ProjectResource

Lists all of the releases that belong to the given project. Releases will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the Project
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      ReleaseResourceCollection result = apiInstance.indexProjectReleasesSpaces(baseSpaceId, id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexProjectReleasesSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the Project |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**ReleaseResourceCollection**](ReleaseResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_ReleaseResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexReleaseDeployments"></a>
# **indexReleaseDeployments**
> DeploymentResourceCollection indexReleaseDeployments(id, skip, take)

Lists all of the Deployments that belong to the given Release

Deployments will be ordered from most recent to least recent

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the Release to load
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      DeploymentResourceCollection result = apiInstance.indexReleaseDeployments(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexReleaseDeployments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Release to load |
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**DeploymentResourceCollection**](DeploymentResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="indexReleaseDeploymentsSpaces"></a>
# **indexReleaseDeploymentsSpaces**
> DeploymentResourceCollection indexReleaseDeploymentsSpaces(id, baseSpaceId, skip, take)

Lists all of the Deployments that belong to the given Release

Deployments will be ordered from most recent to least recent

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the Release to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      DeploymentResourceCollection result = apiInstance.indexReleaseDeploymentsSpaces(id, baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexReleaseDeploymentsSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Release to load |
 **baseSpaceId** | **String**| ID of the space |
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**DeploymentResourceCollection**](DeploymentResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="indexReleases"></a>
# **indexReleases**
> ReleaseResourceCollection indexReleases(skip, take)

Get a list of Releases

Lists all of the Releases in the supplied Octopus Deploy Space, from all projects. The results will be sorted from most recent to least recent release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      ReleaseResourceCollection result = apiInstance.indexReleases(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexReleases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**ReleaseResourceCollection**](ReleaseResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="indexReleasesSpaces"></a>
# **indexReleasesSpaces**
> ReleaseResourceCollection indexReleasesSpaces(baseSpaceId, skip, take)

Get a list of Releases

Lists all of the Releases in the supplied Octopus Deploy Space, from all projects. The results will be sorted from most recent to least recent release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      ReleaseResourceCollection result = apiInstance.indexReleasesSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#indexReleasesSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**ReleaseResourceCollection**](ReleaseResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateRelease"></a>
# **updateRelease**
> ReleaseResource updateRelease(id, ignoreChannelRules, body)

Modify a ReleaseResource by ID

Updates an existing release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String id = "id_example"; // String | ID of the ReleaseResource to modify
    Boolean ignoreChannelRules = true; // Boolean | Ignore channel rules.
    ReleaseResource body = new ReleaseResource(); // ReleaseResource | The ReleaseResource resource to create
    try {
      ReleaseResource result = apiInstance.updateRelease(id, ignoreChannelRules, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#updateRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the ReleaseResource to modify |
 **ignoreChannelRules** | **Boolean**| Ignore channel rules. | [optional]
 **body** | [**ReleaseResource**](ReleaseResource.md)| The ReleaseResource resource to create | [optional]

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource Modified |  -  |
**400** | A version must be specified for every included package.  Model validation failed.  No id parameter was provided.  No request body was supplied.  Release &#39;{release.Version}&#39; already exists for this project. Please use a different version, or look at using a mask to auto-increment the number.  The channel {channel.Name} specified for this release belongs to the project {channel.ProjectId}. It does not belong to the same project as the release.  The release &#x60;{0}&#x60; currently contains deployments with step(s) {1} that would be skipped due to the updated channel. Please select a different channel or delete and recreate this release.  The release number &#39;{release.Version}&#39; does not appear to be a valid version number. The version must consist of between 1 and 4 number only parts before the optional pre-release part. e.g. 2, 2.1, 2.4.0.23, 2.4-beta and 1-beta.2  The requested package versions for the following steps violate the channel version rules: {0}. Please specify a different package version, channel or provide the &#x60;ignoreChannelRules&#x60; parameter to override this check.  This resource is read-only and cannot be modified. |  -  |

<a name="updateReleaseSpaces"></a>
# **updateReleaseSpaces**
> ReleaseResource updateReleaseSpaces(baseSpaceId, id, ignoreChannelRules, body)

Modify a ReleaseResource by ID

Updates an existing release.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ReleasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    ReleasesApi apiInstance = new ReleasesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the ReleaseResource to modify
    Boolean ignoreChannelRules = true; // Boolean | Ignore channel rules.
    ReleaseResource body = new ReleaseResource(); // ReleaseResource | The ReleaseResource resource to create
    try {
      ReleaseResource result = apiInstance.updateReleaseSpaces(baseSpaceId, id, ignoreChannelRules, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReleasesApi#updateReleaseSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baseSpaceId** | **String**| ID of the space |
 **id** | **String**| ID of the ReleaseResource to modify |
 **ignoreChannelRules** | **Boolean**| Ignore channel rules. | [optional]
 **body** | [**ReleaseResource**](ReleaseResource.md)| The ReleaseResource resource to create | [optional]

### Return type

[**ReleaseResource**](ReleaseResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ReleaseResource Modified |  -  |
**400** | A version must be specified for every included package.  Model validation failed.  No id parameter was provided.  No request body was supplied.  Release &#39;{release.Version}&#39; already exists for this project. Please use a different version, or look at using a mask to auto-increment the number.  The channel {channel.Name} specified for this release belongs to the project {channel.ProjectId}. It does not belong to the same project as the release.  The release &#x60;{0}&#x60; currently contains deployments with step(s) {1} that would be skipped due to the updated channel. Please select a different channel or delete and recreate this release.  The release number &#39;{release.Version}&#39; does not appear to be a valid version number. The version must consist of between 1 and 4 number only parts before the optional pre-release part. e.g. 2, 2.1, 2.4.0.23, 2.4-beta and 1-beta.2  The requested package versions for the following steps violate the channel version rules: {0}. Please specify a different package version, channel or provide the &#x60;ignoreChannelRules&#x60; parameter to override this check.  This resource is read-only and cannot be modified. |  -  |

