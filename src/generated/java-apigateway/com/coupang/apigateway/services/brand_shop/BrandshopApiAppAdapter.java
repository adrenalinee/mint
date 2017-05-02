package com.coupang.apigateway.services.brand_shop;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.brand_shop.model.BrandShopModuleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
@org.springframework.stereotype.Component
public class BrandshopApiAppAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BrandshopApiAppAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("brand_shop");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : returns brand shop banner module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/banner
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68">http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopBannerForResponseEntity(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopBanner");
        }
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiAppV1ModulesBrandShopBanner");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/banner";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("59016a808e5fd7a0c9ab9e68", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop banner module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/banner
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68">http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68</a>
     */
    public <T> T getApiAppV1ModulesBrandShopBanner(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopBannerForResponseEntity(modularApp, brandName, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop banner module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/banner
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68">http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopBanner(String modularApp, String brandName, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopBanner(modularApp, brandName, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop banner module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/banner
     * Notes : 
     * @param modularApp modular app client information(required)
     * @param brandName brandName(required)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68">http://api-forge.coupang.net/details?specId=59016a808e5fd7a0c9ab9e68</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopBanner(String modularApp, String brandName) throws ApiException {
        return this.getApiAppV1ModulesBrandShopBanner(modularApp, brandName, null);
    }
    /**
     * Summary : returns brand shop hot category module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/hot-category
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopHotCategoryForResponseEntity(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopHotCategory");
        }
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiAppV1ModulesBrandShopHotCategory");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/hot-category";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58db4aec0777d5b36a4d7582", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop hot category module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/hot-category
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582</a>
     */
    public <T> T getApiAppV1ModulesBrandShopHotCategory(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopHotCategoryForResponseEntity(modularApp, brandName, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop hot category module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/hot-category
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopHotCategory(String modularApp, String brandName, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopHotCategory(modularApp, brandName, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop hot category module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/hot-category
     * Notes : 
     * @param modularApp modular app client information(required)
     * @param brandName brandName(required)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7582</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopHotCategory(String modularApp, String brandName) throws ApiException {
        return this.getApiAppV1ModulesBrandShopHotCategory(modularApp, brandName, null);
    }
    /**
     * Summary : returns brand shop logo module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/logo
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopLogoForResponseEntity(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopLogo");
        }
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiAppV1ModulesBrandShopLogo");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/logo";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58db4aec0777d5b36a4d7587", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop logo module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/logo
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587</a>
     */
    public <T> T getApiAppV1ModulesBrandShopLogo(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopLogoForResponseEntity(modularApp, brandName, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop logo module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/logo
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopLogo(String modularApp, String brandName, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopLogo(modularApp, brandName, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop logo module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/logo
     * Notes : 
     * @param modularApp modular app client information(required)
     * @param brandName brandName(required)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d7587</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopLogo(String modularApp, String brandName) throws ApiException {
        return this.getApiAppV1ModulesBrandShopLogo(modularApp, brandName, null);
    }
    /**
     * Summary : returns brand shop product list module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list
     * @param modularApp modular app client information (required)
     * @param brandName  (required)
     * @param componentId  (optional)
     * @param keyword  (optional)
     * @param filter  (optional)
     * @param recentProductOnly  (optional)
     * @param nextPageKey  (optional)
     * @param pageUUID  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopProductListForResponseEntity(String modularApp, String brandName, String componentId, String keyword, String filter, Boolean recentProductOnly, String nextPageKey, String pageUUID, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopProductList");
        }
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiAppV1ModulesBrandShopProductList");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/product-list";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "componentId", componentId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "recentProductOnly", recentProductOnly));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nextPageKey", nextPageKey));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageUUID", pageUUID));
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58db4aec0777d5b36a4d758c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop product list module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list
     * @param modularApp modular app client information (required)
     * @param brandName  (required)
     * @param componentId  (optional)
     * @param keyword  (optional)
     * @param filter  (optional)
     * @param recentProductOnly  (optional)
     * @param nextPageKey  (optional)
     * @param pageUUID  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c</a>
     */
    public <T> T getApiAppV1ModulesBrandShopProductList(String modularApp, String brandName, String componentId, String keyword, String filter, Boolean recentProductOnly, String nextPageKey, String pageUUID, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopProductListForResponseEntity(modularApp, brandName, componentId, keyword, filter, recentProductOnly, nextPageKey, pageUUID, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop product list module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list
     * @param modularApp modular app client information (required)
     * @param brandName  (required)
     * @param componentId  (optional)
     * @param keyword  (optional)
     * @param filter  (optional)
     * @param recentProductOnly  (optional)
     * @param nextPageKey  (optional)
     * @param pageUUID  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopProductList(String modularApp, String brandName, String componentId, String keyword, String filter, Boolean recentProductOnly, String nextPageKey, String pageUUID, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopProductList(modularApp, brandName, componentId, keyword, filter, recentProductOnly, nextPageKey, pageUUID, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop product list module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list
     * Notes : 
     * @param modularApp modular app client information(required)
     * @param brandName (required)
     * @param componentId (optional)
     * @param keyword (optional)
     * @param filter (optional)
     * @param recentProductOnly (optional)
     * @param nextPageKey (optional)
     * @param pageUUID (optional)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c">http://api-forge.coupang.net/details?specId=58db4aec0777d5b36a4d758c</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopProductList(String modularApp, String brandName, String componentId, String keyword, String filter, Boolean recentProductOnly, String nextPageKey, String pageUUID) throws ApiException {
        return this.getApiAppV1ModulesBrandShopProductList(modularApp, brandName, componentId, keyword, filter, recentProductOnly, nextPageKey, pageUUID, null);
    }
    /**
     * Summary : returns brand shop product list title module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list-title
     * @param modularApp modular app client information (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopProductListTitleForResponseEntity(String modularApp, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopProductListTitle");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/product-list-title";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58db4aed0777d5b36a4d7591", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop product list title module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list-title
     * @param modularApp modular app client information (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591</a>
     */
    public <T> T getApiAppV1ModulesBrandShopProductListTitle(String modularApp, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopProductListTitleForResponseEntity(modularApp, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop product list title module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list-title
     * @param modularApp modular app client information (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopProductListTitle(String modularApp, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopProductListTitle(modularApp, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop product list title module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/product-list-title
     * Notes : 
     * @param modularApp modular app client information(required)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7591</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopProductListTitle(String modularApp) throws ApiException {
        return this.getApiAppV1ModulesBrandShopProductListTitle(modularApp, null);
    }
    /**
     * Summary : returns brand shop recent product module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/recent-product-list
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596</a>
     */
    public <T> ResponseEntity<T> getApiAppV1ModulesBrandShopRecentProductListForResponseEntity(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modularApp' is set
        if (modularApp == null) {
            throw new ApiException(400, "Missing the required parameter 'modularApp' when calling getApiAppV1ModulesBrandShopRecentProductList");
        }
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiAppV1ModulesBrandShopRecentProductList");
        }
        
        // create path and map variables
        String localVarPath = "/api/app/v1/modules/brand-shop/recent-product-list";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        if (modularApp != null) {
          localVarHeaderParams.put("modular-app", apiClient.parameterToString(modularApp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58db4aed0777d5b36a4d7596", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand shop recent product module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/recent-product-list
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596</a>
     */
    public <T> T getApiAppV1ModulesBrandShopRecentProductList(String modularApp, String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiAppV1ModulesBrandShopRecentProductListForResponseEntity(modularApp, brandName, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand shop recent product module
     * Notes : 
     * API : brand_shop GET /api/app/v1/modules/brand-shop/recent-product-list
     * @param modularApp modular app client information (required)
     * @param brandName brandName (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopRecentProductList(String modularApp, String brandName, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopModuleResponse> localVarReturnType = new ParameterizedTypeReference<BrandShopModuleResponse>() {};
        return this.getApiAppV1ModulesBrandShopRecentProductList(modularApp, brandName, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand shop recent product module
     * API : brand_shop GET /api/app/v1/modules/brand-shop/recent-product-list
     * Notes : 
     * @param modularApp modular app client information(required)
     * @param brandName brandName(required)
     * @return BrandShopModuleResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596">http://api-forge.coupang.net/details?specId=58db4aed0777d5b36a4d7596</a>
     */
    public BrandShopModuleResponse getApiAppV1ModulesBrandShopRecentProductList(String modularApp, String brandName) throws ApiException {
        return this.getApiAppV1ModulesBrandShopRecentProductList(modularApp, brandName, null);
    }
}
