# LibraryVariableSetsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLibraryVariableSet**](LibraryVariableSetsApi.md#createLibraryVariableSet) | **POST** /libraryvariablesets | Create a LibraryVariableSetResource
[**createLibraryVariableSetSpaces**](LibraryVariableSetsApi.md#createLibraryVariableSetSpaces) | **POST** /{baseSpaceId}/libraryvariablesets | Create a LibraryVariableSetResource
[**deleteLibraryVariableSet**](LibraryVariableSetsApi.md#deleteLibraryVariableSet) | **DELETE** /libraryvariablesets/{id} | Delete a LibraryVariableSetResource by ID
[**deleteLibraryVariableSetSpaces**](LibraryVariableSetsApi.md#deleteLibraryVariableSetSpaces) | **DELETE** /{baseSpaceId}/libraryvariablesets/{id} | Delete a LibraryVariableSetResource by ID
[**getLibraryVariableSetById**](LibraryVariableSetsApi.md#getLibraryVariableSetById) | **GET** /libraryvariablesets/{id} | Get a Library Variable Set by ID
[**getLibraryVariableSetByIdSpaces**](LibraryVariableSetsApi.md#getLibraryVariableSetByIdSpaces) | **GET** /{baseSpaceId}/libraryvariablesets/{id} | Get a Library Variable Set by ID
[**getLibraryVariableSetUsageList**](LibraryVariableSetsApi.md#getLibraryVariableSetUsageList) | **GET** /libraryvariablesets/{id}/usages | 
[**getLibraryVariableSetUsageListSpaces**](LibraryVariableSetsApi.md#getLibraryVariableSetUsageListSpaces) | **GET** /{baseSpaceId}/libraryvariablesets/{id}/usages | 
[**indexLibraryVariableSets**](LibraryVariableSetsApi.md#indexLibraryVariableSets) | **GET** /libraryvariablesets | Get a list of LibraryVariableSetResources
[**indexLibraryVariableSetsSpaces**](LibraryVariableSetsApi.md#indexLibraryVariableSetsSpaces) | **GET** /{baseSpaceId}/libraryvariablesets | Get a list of LibraryVariableSetResources
[**listAllLibraryVariableSets**](LibraryVariableSetsApi.md#listAllLibraryVariableSets) | **GET** /libraryvariablesets/all | Get a list of LibraryVariableSetResources
[**listAllLibraryVariableSetsSpaces**](LibraryVariableSetsApi.md#listAllLibraryVariableSetsSpaces) | **GET** /{baseSpaceId}/libraryvariablesets/all | Get a list of LibraryVariableSetResources
[**updateLibraryVariableSet**](LibraryVariableSetsApi.md#updateLibraryVariableSet) | **PUT** /libraryvariablesets/{id} | Modify a LibraryVariableSetResource by ID
[**updateLibraryVariableSetSpaces**](LibraryVariableSetsApi.md#updateLibraryVariableSetSpaces) | **PUT** /{baseSpaceId}/libraryvariablesets/{id} | Modify a LibraryVariableSetResource by ID


<a name="createLibraryVariableSet"></a>
# **createLibraryVariableSet**
> LibraryVariableSetResource createLibraryVariableSet(body)

Create a LibraryVariableSetResource

Creates a new library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    LibraryVariableSetResource body = new LibraryVariableSetResource(); // LibraryVariableSetResource | The LibraryVariableSetResource resource to create
    try {
      LibraryVariableSetResource result = apiInstance.createLibraryVariableSet(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#createLibraryVariableSet");
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
 **body** | [**LibraryVariableSetResource**](LibraryVariableSetResource.md)| The LibraryVariableSetResource resource to create | [optional]

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | LibraryVariableSetResource Created |  -  |
**400** | Model validation failed.  No request body was supplied.  Variable template &#39;{variableTemplate.Name}&#39; does not have drop down options set. |  -  |

<a name="createLibraryVariableSetSpaces"></a>
# **createLibraryVariableSetSpaces**
> LibraryVariableSetResource createLibraryVariableSetSpaces(baseSpaceId, body)

Create a LibraryVariableSetResource

Creates a new library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    LibraryVariableSetResource body = new LibraryVariableSetResource(); // LibraryVariableSetResource | The LibraryVariableSetResource resource to create
    try {
      LibraryVariableSetResource result = apiInstance.createLibraryVariableSetSpaces(baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#createLibraryVariableSetSpaces");
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
 **body** | [**LibraryVariableSetResource**](LibraryVariableSetResource.md)| The LibraryVariableSetResource resource to create | [optional]

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | LibraryVariableSetResource Created |  -  |
**400** | Model validation failed.  No request body was supplied.  Variable template &#39;{variableTemplate.Name}&#39; does not have drop down options set. |  -  |

<a name="deleteLibraryVariableSet"></a>
# **deleteLibraryVariableSet**
> deleteLibraryVariableSet(id)

Delete a LibraryVariableSetResource by ID

Deletes an existing library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String id = "id_example"; // String | ID of the LibraryVariableSetResource to delete
    try {
      apiInstance.deleteLibraryVariableSet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#deleteLibraryVariableSet");
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
 **id** | **String**| ID of the LibraryVariableSetResource to delete |

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

<a name="deleteLibraryVariableSetSpaces"></a>
# **deleteLibraryVariableSetSpaces**
> deleteLibraryVariableSetSpaces(baseSpaceId, id)

Delete a LibraryVariableSetResource by ID

Deletes an existing library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the LibraryVariableSetResource to delete
    try {
      apiInstance.deleteLibraryVariableSetSpaces(baseSpaceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#deleteLibraryVariableSetSpaces");
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
 **id** | **String**| ID of the LibraryVariableSetResource to delete |

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

<a name="getLibraryVariableSetById"></a>
# **getLibraryVariableSetById**
> LibraryVariableSetResource getLibraryVariableSetById(id)

Get a Library Variable Set by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String id = "id_example"; // String | ID of the LibraryVariableSet to load
    try {
      LibraryVariableSetResource result = apiInstance.getLibraryVariableSetById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#getLibraryVariableSetById");
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
 **id** | **String**| ID of the LibraryVariableSet to load |

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

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

<a name="getLibraryVariableSetByIdSpaces"></a>
# **getLibraryVariableSetByIdSpaces**
> LibraryVariableSetResource getLibraryVariableSetByIdSpaces(id, baseSpaceId)

Get a Library Variable Set by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String id = "id_example"; // String | ID of the LibraryVariableSet to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      LibraryVariableSetResource result = apiInstance.getLibraryVariableSetByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#getLibraryVariableSetByIdSpaces");
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
 **id** | **String**| ID of the LibraryVariableSet to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

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

<a name="getLibraryVariableSetUsageList"></a>
# **getLibraryVariableSetUsageList**
> LibraryVariableSetUsageResource getLibraryVariableSetUsageList(id)



Lists projects and deployments which are using an library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      LibraryVariableSetUsageResource result = apiInstance.getLibraryVariableSetUsageList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#getLibraryVariableSetUsageList");
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

[**LibraryVariableSetUsageResource**](LibraryVariableSetUsageResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LibraryVariableSetUsageResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getLibraryVariableSetUsageListSpaces"></a>
# **getLibraryVariableSetUsageListSpaces**
> LibraryVariableSetUsageResource getLibraryVariableSetUsageListSpaces(baseSpaceId, id)



Lists projects and deployments which are using an library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      LibraryVariableSetUsageResource result = apiInstance.getLibraryVariableSetUsageListSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#getLibraryVariableSetUsageListSpaces");
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

[**LibraryVariableSetUsageResource**](LibraryVariableSetUsageResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LibraryVariableSetUsageResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexLibraryVariableSets"></a>
# **indexLibraryVariableSets**
> LibraryVariableSetResourceCollection indexLibraryVariableSets(skip, take)

Get a list of LibraryVariableSetResources

Lists all of the library variable sets in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      LibraryVariableSetResourceCollection result = apiInstance.indexLibraryVariableSets(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#indexLibraryVariableSets");
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
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items to take | [optional]

### Return type

[**LibraryVariableSetResourceCollection**](LibraryVariableSetResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_LibraryVariableSetResource resource returned |  -  |

<a name="indexLibraryVariableSetsSpaces"></a>
# **indexLibraryVariableSetsSpaces**
> LibraryVariableSetResourceCollection indexLibraryVariableSetsSpaces(baseSpaceId, skip, take)

Get a list of LibraryVariableSetResources

Lists all of the library variable sets in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      LibraryVariableSetResourceCollection result = apiInstance.indexLibraryVariableSetsSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#indexLibraryVariableSetsSpaces");
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
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items to take | [optional]

### Return type

[**LibraryVariableSetResourceCollection**](LibraryVariableSetResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_LibraryVariableSetResource resource returned |  -  |

<a name="listAllLibraryVariableSets"></a>
# **listAllLibraryVariableSets**
> List&lt;LibraryVariableSetResource&gt; listAllLibraryVariableSets()

Get a list of LibraryVariableSetResources

Lists all the library variable sets in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    try {
      List<LibraryVariableSetResource> result = apiInstance.listAllLibraryVariableSets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#listAllLibraryVariableSets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LibraryVariableSetResource&gt;**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Load all LibraryVariableSetResource |  -  |

<a name="listAllLibraryVariableSetsSpaces"></a>
# **listAllLibraryVariableSetsSpaces**
> List&lt;LibraryVariableSetResource&gt; listAllLibraryVariableSetsSpaces(baseSpaceId)

Get a list of LibraryVariableSetResources

Lists all the library variable sets in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      List<LibraryVariableSetResource> result = apiInstance.listAllLibraryVariableSetsSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#listAllLibraryVariableSetsSpaces");
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

### Return type

[**List&lt;LibraryVariableSetResource&gt;**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Load all LibraryVariableSetResource |  -  |

<a name="updateLibraryVariableSet"></a>
# **updateLibraryVariableSet**
> LibraryVariableSetResource updateLibraryVariableSet(id, body)

Modify a LibraryVariableSetResource by ID

Modifies an existing library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String id = "id_example"; // String | ID of the LibraryVariableSetResource to modify
    LibraryVariableSetResource body = new LibraryVariableSetResource(); // LibraryVariableSetResource | The LibraryVariableSetResource resource to create
    try {
      LibraryVariableSetResource result = apiInstance.updateLibraryVariableSet(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#updateLibraryVariableSet");
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
 **id** | **String**| ID of the LibraryVariableSetResource to modify |
 **body** | [**LibraryVariableSetResource**](LibraryVariableSetResource.md)| The LibraryVariableSetResource resource to create | [optional]

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LibraryVariableSetResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified.  Variable template &#39;{variableTemplate.Name}&#39; does not have drop down options set. |  -  |

<a name="updateLibraryVariableSetSpaces"></a>
# **updateLibraryVariableSetSpaces**
> LibraryVariableSetResource updateLibraryVariableSetSpaces(baseSpaceId, id, body)

Modify a LibraryVariableSetResource by ID

Modifies an existing library variable set.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.LibraryVariableSetsApi;

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

    LibraryVariableSetsApi apiInstance = new LibraryVariableSetsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the LibraryVariableSetResource to modify
    LibraryVariableSetResource body = new LibraryVariableSetResource(); // LibraryVariableSetResource | The LibraryVariableSetResource resource to create
    try {
      LibraryVariableSetResource result = apiInstance.updateLibraryVariableSetSpaces(baseSpaceId, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LibraryVariableSetsApi#updateLibraryVariableSetSpaces");
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
 **id** | **String**| ID of the LibraryVariableSetResource to modify |
 **body** | [**LibraryVariableSetResource**](LibraryVariableSetResource.md)| The LibraryVariableSetResource resource to create | [optional]

### Return type

[**LibraryVariableSetResource**](LibraryVariableSetResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | LibraryVariableSetResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified.  Variable template &#39;{variableTemplate.Name}&#39; does not have drop down options set. |  -  |

