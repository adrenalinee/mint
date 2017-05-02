package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.ItemBasicDto;
import com.coupang.apigateway.services.product_api.model.ItemDto;
import com.coupang.apigateway.services.product_api.model.ProductDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
@org.springframework.stereotype.Component
public class ProductapiApiV1CoreAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1CoreAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : product_api GET /api/v1/core/item/basic/by-productid/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462466186af774f880bab6">http://api-forge.coupang.net/details?specId=58462466186af774f880bab6</a>
     */
    public <T> ResponseEntity<T> getApiV1CoreItemBasicByProductidProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1CoreItemBasicByProductidProductId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/core/item/basic/by-productid/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58462466186af774f880bab6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : product_api GET /api/v1/core/item/basic/by-productid/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462466186af774f880bab6">http://api-forge.coupang.net/details?specId=58462466186af774f880bab6</a>
     */
    public <T> T getApiV1CoreItemBasicByProductidProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CoreItemBasicByProductidProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : product_api GET /api/v1/core/item/basic/by-productid/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462466186af774f880bab6">http://api-forge.coupang.net/details?specId=58462466186af774f880bab6</a>
     */
    public List<ItemBasicDto> getApiV1CoreItemBasicByProductidProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ItemBasicDto>> localVarReturnType = new ParameterizedTypeReference<List<ItemBasicDto>>() {};
        return this.getApiV1CoreItemBasicByProductidProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : request items by productId
     * API : product_api GET /api/v1/core/item/basic/by-productid/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462466186af774f880bab6">http://api-forge.coupang.net/details?specId=58462466186af774f880bab6</a>
     */
    public List<ItemBasicDto> getApiV1CoreItemBasicByProductidProductId(Long productId) throws ApiException {
        return this.getApiV1CoreItemBasicByProductidProductId(productId, null);
    }
    /**
     * Summary : request item by itemId
     * Notes : 
     * API : product_api GET /api/v1/core/item/by_itemid/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462467186af774f880bacf">http://api-forge.coupang.net/details?specId=58462467186af774f880bacf</a>
     */
    public <T> ResponseEntity<T> getApiV1CoreItemByItemidItemIdForResponseEntity(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getApiV1CoreItemByItemidItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/core/item/by_itemid/{itemId}"
            .replaceAll("\\{" + "itemId" + "\\}", itemId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58462467186af774f880bacf", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : request item by itemId
     * Notes : 
     * API : product_api GET /api/v1/core/item/by_itemid/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462467186af774f880bacf">http://api-forge.coupang.net/details?specId=58462467186af774f880bacf</a>
     */
    public <T> T getApiV1CoreItemByItemidItemId(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CoreItemByItemidItemIdForResponseEntity(itemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : request item by itemId
     * Notes : 
     * API : product_api GET /api/v1/core/item/by_itemid/{itemId}
     * @param itemId itemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462467186af774f880bacf">http://api-forge.coupang.net/details?specId=58462467186af774f880bacf</a>
     */
    public ItemDto getApiV1CoreItemByItemidItemId(Long itemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ItemDto> localVarReturnType = new ParameterizedTypeReference<ItemDto>() {};
        return this.getApiV1CoreItemByItemidItemId(itemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : request item by itemId
     * API : product_api GET /api/v1/core/item/by_itemid/{itemId}
     * Notes : 
     * @param itemId itemId(required)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462467186af774f880bacf">http://api-forge.coupang.net/details?specId=58462467186af774f880bacf</a>
     */
    public ItemDto getApiV1CoreItemByItemidItemId(Long itemId) throws ApiException {
        return this.getApiV1CoreItemByItemidItemId(itemId, null);
    }
    /**
     * Summary : getProductList
     * Notes : 
     * API : product_api GET /api/v1/core/product/list
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb51">http://api-forge.coupang.net/details?specId=58462468186af774f880bb51</a>
     */
    public <T> ResponseEntity<T> getApiV1CoreProductListForResponseEntity(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productIds' is set
        if (productIds == null) {
            throw new ApiException(400, "Missing the required parameter 'productIds' when calling getApiV1CoreProductList");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/core/product/list";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "productIds", productIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58462468186af774f880bb51", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductList
     * Notes : 
     * API : product_api GET /api/v1/core/product/list
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb51">http://api-forge.coupang.net/details?specId=58462468186af774f880bb51</a>
     */
    public <T> T getApiV1CoreProductList(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CoreProductListForResponseEntity(productIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductList
     * Notes : 
     * API : product_api GET /api/v1/core/product/list
     * @param productIds productIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb51">http://api-forge.coupang.net/details?specId=58462468186af774f880bb51</a>
     */
    public List<ProductDto> getApiV1CoreProductList(List<Long> productIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ProductDto>> localVarReturnType = new ParameterizedTypeReference<List<ProductDto>>() {};
        return this.getApiV1CoreProductList(productIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductList
     * API : product_api GET /api/v1/core/product/list
     * Notes : 
     * @param productIds productIds(required)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb51">http://api-forge.coupang.net/details?specId=58462468186af774f880bb51</a>
     */
    public List<ProductDto> getApiV1CoreProductList(List<Long> productIds) throws ApiException {
        return this.getApiV1CoreProductList(productIds, null);
    }
    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : product_api GET /api/v1/core/product/{productId}/all
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a">http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a</a>
     */
    public <T> ResponseEntity<T> getApiV1CoreProductProductIdAllForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1CoreProductProductIdAll");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/core/product/{productId}/all"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58462468186af774f880bb6a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : product_api GET /api/v1/core/product/{productId}/all
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a">http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a</a>
     */
    public <T> T getApiV1CoreProductProductIdAll(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CoreProductProductIdAllForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : product_api GET /api/v1/core/product/{productId}/all
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a">http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a</a>
     */
    public ProductDto getApiV1CoreProductProductIdAll(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductDto> localVarReturnType = new ParameterizedTypeReference<ProductDto>() {};
        return this.getApiV1CoreProductProductIdAll(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductWithInvalid
     * API : product_api GET /api/v1/core/product/{productId}/all
     * Notes : 
     * @param productId productId(required)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a">http://api-forge.coupang.net/details?specId=58462468186af774f880bb6a</a>
     */
    public ProductDto getApiV1CoreProductProductIdAll(Long productId) throws ApiException {
        return this.getApiV1CoreProductProductIdAll(productId, null);
    }
}
