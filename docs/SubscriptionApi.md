# SubscriptionApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionApi.md#createSubscription) | **POST** /subscriptions | Create a SubscriptionResource
[**createSubscriptionSpaces**](SubscriptionApi.md#createSubscriptionSpaces) | **POST** /{baseSpaceId}/subscriptions | Create a SubscriptionResource
[**deleteSubscription**](SubscriptionApi.md#deleteSubscription) | **DELETE** /subscriptions/{id} | Delete a SubscriptionResource by ID
[**deleteSubscriptionSpaces**](SubscriptionApi.md#deleteSubscriptionSpaces) | **DELETE** /{baseSpaceId}/subscriptions/{id} | Delete a SubscriptionResource by ID
[**indexSubscriptions**](SubscriptionApi.md#indexSubscriptions) | **GET** /subscriptions | Get a list of SubscriptionResources
[**indexSubscriptionsSpaces**](SubscriptionApi.md#indexSubscriptionsSpaces) | **GET** /{baseSpaceId}/subscriptions | Get a list of SubscriptionResources
[**updateSubscription**](SubscriptionApi.md#updateSubscription) | **PUT** /subscriptions/{id} | Modify a SubscriptionResource by ID
[**updateSubscriptionSpaces**](SubscriptionApi.md#updateSubscriptionSpaces) | **PUT** /{baseSpaceId}/subscriptions/{id} | Modify a SubscriptionResource by ID


<a name="createSubscription"></a>
# **createSubscription**
> SubscriptionResource createSubscription(body)

Create a SubscriptionResource

Creates a new subscription

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    SubscriptionResource body = new SubscriptionResource(); // SubscriptionResource | The SubscriptionResource resource to create
    try {
      SubscriptionResource result = apiInstance.createSubscription(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createSubscription");
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
 **body** | [**SubscriptionResource**](SubscriptionResource.md)| The SubscriptionResource resource to create | [optional]

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | SubscriptionResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="createSubscriptionSpaces"></a>
# **createSubscriptionSpaces**
> SubscriptionResource createSubscriptionSpaces(baseSpaceId, body)

Create a SubscriptionResource

Creates a new subscription

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    SubscriptionResource body = new SubscriptionResource(); // SubscriptionResource | The SubscriptionResource resource to create
    try {
      SubscriptionResource result = apiInstance.createSubscriptionSpaces(baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#createSubscriptionSpaces");
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
 **body** | [**SubscriptionResource**](SubscriptionResource.md)| The SubscriptionResource resource to create | [optional]

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | SubscriptionResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="deleteSubscription"></a>
# **deleteSubscription**
> deleteSubscription(id)

Delete a SubscriptionResource by ID

Deletes an existing subscription.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String id = "id_example"; // String | ID of the SubscriptionResource to delete
    try {
      apiInstance.deleteSubscription(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscription");
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
 **id** | **String**| ID of the SubscriptionResource to delete |

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

<a name="deleteSubscriptionSpaces"></a>
# **deleteSubscriptionSpaces**
> deleteSubscriptionSpaces(baseSpaceId, id)

Delete a SubscriptionResource by ID

Deletes an existing subscription.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the SubscriptionResource to delete
    try {
      apiInstance.deleteSubscriptionSpaces(baseSpaceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#deleteSubscriptionSpaces");
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
 **id** | **String**| ID of the SubscriptionResource to delete |

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

<a name="indexSubscriptions"></a>
# **indexSubscriptions**
> SubscriptionResourceCollection indexSubscriptions(skip, take)

Get a list of SubscriptionResources

Lists all of the subscriptions in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      SubscriptionResourceCollection result = apiInstance.indexSubscriptions(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#indexSubscriptions");
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

[**SubscriptionResourceCollection**](SubscriptionResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_SubscriptionResource resource returned |  -  |

<a name="indexSubscriptionsSpaces"></a>
# **indexSubscriptionsSpaces**
> SubscriptionResourceCollection indexSubscriptionsSpaces(baseSpaceId, skip, take)

Get a list of SubscriptionResources

Lists all of the subscriptions in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      SubscriptionResourceCollection result = apiInstance.indexSubscriptionsSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#indexSubscriptionsSpaces");
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

[**SubscriptionResourceCollection**](SubscriptionResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_SubscriptionResource resource returned |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> SubscriptionResource updateSubscription(id, body)

Modify a SubscriptionResource by ID

Updates an existing subscription

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String id = "id_example"; // String | ID of the SubscriptionResource to modify
    SubscriptionResource body = new SubscriptionResource(); // SubscriptionResource | The SubscriptionResource resource to create
    try {
      SubscriptionResource result = apiInstance.updateSubscription(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscription");
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
 **id** | **String**| ID of the SubscriptionResource to modify |
 **body** | [**SubscriptionResource**](SubscriptionResource.md)| The SubscriptionResource resource to create | [optional]

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | SubscriptionResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

<a name="updateSubscriptionSpaces"></a>
# **updateSubscriptionSpaces**
> SubscriptionResource updateSubscriptionSpaces(baseSpaceId, id, body)

Modify a SubscriptionResource by ID

Updates an existing subscription

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the SubscriptionResource to modify
    SubscriptionResource body = new SubscriptionResource(); // SubscriptionResource | The SubscriptionResource resource to create
    try {
      SubscriptionResource result = apiInstance.updateSubscriptionSpaces(baseSpaceId, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#updateSubscriptionSpaces");
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
 **id** | **String**| ID of the SubscriptionResource to modify |
 **body** | [**SubscriptionResource**](SubscriptionResource.md)| The SubscriptionResource resource to create | [optional]

### Return type

[**SubscriptionResource**](SubscriptionResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | SubscriptionResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

