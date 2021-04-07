# CommunityActionTemplatesApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCommunityActionTemplateInstallation**](CommunityActionTemplatesApi.md#createCommunityActionTemplateInstallation) | **POST** /communityactiontemplates/{id}/installation | 
[**createCommunityActionTemplateInstallation1**](CommunityActionTemplatesApi.md#createCommunityActionTemplateInstallation1) | **POST** /communityactiontemplates/{id}/installation/{spaceId} | 
[**getActionTemplateBasedOnCommunityActionTemplate**](CommunityActionTemplatesApi.md#getActionTemplateBasedOnCommunityActionTemplate) | **GET** /communityactiontemplates/{id}/actiontemplate | 
[**getActionTemplateBasedOnCommunityActionTemplate1**](CommunityActionTemplatesApi.md#getActionTemplateBasedOnCommunityActionTemplate1) | **GET** /communityactiontemplates/{id}/actiontemplate/{spaceId} | 
[**getCommunityActionTemplateById**](CommunityActionTemplatesApi.md#getCommunityActionTemplateById) | **GET** /communityactiontemplates/{id} | Get a Community Action Template by ID
[**getCommunityActionTemplateLogo**](CommunityActionTemplatesApi.md#getCommunityActionTemplateLogo) | **GET** /communityactiontemplates/{id}/logo | 
[**indexCommunityActionTemplates**](CommunityActionTemplatesApi.md#indexCommunityActionTemplates) | **GET** /communityactiontemplates | Get a list of Community Action Templates
[**updateCommunityActionTemplateInstallationPut**](CommunityActionTemplatesApi.md#updateCommunityActionTemplateInstallationPut) | **PUT** /communityactiontemplates/{id}/installation | 
[**updateCommunityActionTemplateInstallationPut1**](CommunityActionTemplatesApi.md#updateCommunityActionTemplateInstallationPut1) | **PUT** /communityactiontemplates/{id}/installation/{spaceId} | 


<a name="createCommunityActionTemplateInstallation"></a>
# **createCommunityActionTemplateInstallation**
> ActionTemplateResource createCommunityActionTemplateInstallation(id)



Installs community step template.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      ActionTemplateResource result = apiInstance.createCommunityActionTemplateInstallation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#createCommunityActionTemplateInstallation");
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

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ActionTemplateResource resource returned |  -  |
**400** | Action Template already installed.  Action Template is invalid.  No id parameter was provided. |  -  |

<a name="createCommunityActionTemplateInstallation1"></a>
# **createCommunityActionTemplateInstallation1**
> ActionTemplateResource createCommunityActionTemplateInstallation1(id, spaceId)



Installs community step template.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    String spaceId = "spaceId_example"; // String | ID of the space
    try {
      ActionTemplateResource result = apiInstance.createCommunityActionTemplateInstallation1(id, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#createCommunityActionTemplateInstallation1");
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
 **spaceId** | **String**| ID of the space |

### Return type

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ActionTemplateResource resource returned |  -  |
**400** | Action Template already installed.  Action Template is invalid.  No id parameter was provided. |  -  |

<a name="getActionTemplateBasedOnCommunityActionTemplate"></a>
# **getActionTemplateBasedOnCommunityActionTemplate**
> ActionTemplateResource getActionTemplateBasedOnCommunityActionTemplate(id)



Gets installed version of the template.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      ActionTemplateResource result = apiInstance.getActionTemplateBasedOnCommunityActionTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#getActionTemplateBasedOnCommunityActionTemplate");
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

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActionTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getActionTemplateBasedOnCommunityActionTemplate1"></a>
# **getActionTemplateBasedOnCommunityActionTemplate1**
> ActionTemplateResource getActionTemplateBasedOnCommunityActionTemplate1(id, spaceId)



Gets installed version of the template.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    String spaceId = "spaceId_example"; // String | ID of the space
    try {
      ActionTemplateResource result = apiInstance.getActionTemplateBasedOnCommunityActionTemplate1(id, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#getActionTemplateBasedOnCommunityActionTemplate1");
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
 **spaceId** | **String**| ID of the space |

### Return type

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActionTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getCommunityActionTemplateById"></a>
# **getCommunityActionTemplateById**
> CommunityActionTemplateResource getCommunityActionTemplateById(id)

Get a Community Action Template by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the CommunityActionTemplate to load
    try {
      CommunityActionTemplateResource result = apiInstance.getCommunityActionTemplateById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#getCommunityActionTemplateById");
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
 **id** | **String**| ID of the CommunityActionTemplate to load |

### Return type

[**CommunityActionTemplateResource**](CommunityActionTemplateResource.md)

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

<a name="getCommunityActionTemplateLogo"></a>
# **getCommunityActionTemplateLogo**
> File getCommunityActionTemplateLogo(id)



Gets the logo associated with the community step template.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      File result = apiInstance.getCommunityActionTemplateLogo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#getCommunityActionTemplateLogo");
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

[**File**](File.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**304** | NotModified |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexCommunityActionTemplates"></a>
# **indexCommunityActionTemplates**
> CommunityActionTemplateResourceCollection indexCommunityActionTemplates(skip, take)

Get a list of Community Action Templates

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      CommunityActionTemplateResourceCollection result = apiInstance.indexCommunityActionTemplates(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#indexCommunityActionTemplates");
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

[**CommunityActionTemplateResourceCollection**](CommunityActionTemplateResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateCommunityActionTemplateInstallationPut"></a>
# **updateCommunityActionTemplateInstallationPut**
> ActionTemplateResource updateCommunityActionTemplateInstallationPut(id)



Updates installed community step template to the latest version.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      ActionTemplateResource result = apiInstance.updateCommunityActionTemplateInstallationPut(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#updateCommunityActionTemplateInstallationPut");
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

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActionTemplateResource resource returned |  -  |
**400** | Action template not valid.  Action template not yet installed.  No id parameter was provided. |  -  |

<a name="updateCommunityActionTemplateInstallationPut1"></a>
# **updateCommunityActionTemplateInstallationPut1**
> ActionTemplateResource updateCommunityActionTemplateInstallationPut1(id, spaceId)



Updates installed community step template to the latest version.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.CommunityActionTemplatesApi;

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

    CommunityActionTemplatesApi apiInstance = new CommunityActionTemplatesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    String spaceId = "spaceId_example"; // String | ID of the space
    try {
      ActionTemplateResource result = apiInstance.updateCommunityActionTemplateInstallationPut1(id, spaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommunityActionTemplatesApi#updateCommunityActionTemplateInstallationPut1");
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
 **spaceId** | **String**| ID of the space |

### Return type

[**ActionTemplateResource**](ActionTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ActionTemplateResource resource returned |  -  |
**400** | Action template not valid.  Action template not yet installed.  No id parameter was provided. |  -  |

