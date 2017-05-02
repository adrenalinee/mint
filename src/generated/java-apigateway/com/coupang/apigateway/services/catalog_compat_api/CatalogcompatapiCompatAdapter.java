package com.coupang.apigateway.services.catalog_compat_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.catalog_compat_api.model.ItemBasicDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemAttributeDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ItemDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ProductAttributeTypeDtoWithCollapsible;
import com.coupang.apigateway.services.catalog_compat_api.model.ProductAttributeTypeDto;
import com.coupang.apigateway.services.catalog_compat_api.model.ProductDto;
import com.coupang.apigateway.services.catalog_compat_api.model.PriceDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
@org.springframework.stereotype.Component
public class CatalogcompatapiCompatAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CatalogcompatapiCompatAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("catalog_compat_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/ItemBasicDtos/byProductId/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9</a>
     */
    public <T> ResponseEntity<T> getCompatV1ItemItemBasicDtosByProductIdProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ItemItemBasicDtosByProductIdProductId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/item/ItemBasicDtos/byProductId/{productId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8e9", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/ItemBasicDtos/byProductId/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9</a>
     */
    public <T> T getCompatV1ItemItemBasicDtosByProductIdProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ItemItemBasicDtosByProductIdProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : request items by productId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/ItemBasicDtos/byProductId/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9</a>
     */
    public List<ItemBasicDto> getCompatV1ItemItemBasicDtosByProductIdProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ItemBasicDto>> localVarReturnType = new ParameterizedTypeReference<List<ItemBasicDto>>() {};
        return this.getCompatV1ItemItemBasicDtosByProductIdProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : request items by productId
     * API : catalog_compat_api GET /compat/v1/item/ItemBasicDtos/byProductId/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return List<ItemBasicDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8e9</a>
     */
    public List<ItemBasicDto> getCompatV1ItemItemBasicDtosByProductIdProductId(Long productId) throws ApiException {
        return this.getCompatV1ItemItemBasicDtosByProductIdProductId(productId, null);
    }
    /**
     * Summary : getItemAttributes
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/attributes/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df</a>
     */
    public <T> ResponseEntity<T> getCompatV1ItemAttributesItemIdForResponseEntity(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getCompatV1ItemAttributesItemId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/item/attributes/{itemId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8df", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getItemAttributes
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/attributes/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemAttributeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df</a>
     */
    public <T> T getCompatV1ItemAttributesItemId(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ItemAttributesItemIdForResponseEntity(itemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getItemAttributes
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/attributes/{itemId}
     * @param itemId itemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ItemAttributeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df</a>
     */
    public List<ItemAttributeDto> getCompatV1ItemAttributesItemId(Long itemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ItemAttributeDto>> localVarReturnType = new ParameterizedTypeReference<List<ItemAttributeDto>>() {};
        return this.getCompatV1ItemAttributesItemId(itemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getItemAttributes
     * API : catalog_compat_api GET /compat/v1/item/attributes/{itemId}
     * Notes : 
     * @param itemId itemId(required)
     * @return List<ItemAttributeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8df</a>
     */
    public List<ItemAttributeDto> getCompatV1ItemAttributesItemId(Long itemId) throws ApiException {
        return this.getCompatV1ItemAttributesItemId(itemId, null);
    }
    /**
     * Summary : request item by itemId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee</a>
     */
    public <T> ResponseEntity<T> getCompatV1ItemItemIdForResponseEntity(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getCompatV1ItemItemId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/item/{itemId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8ee", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : request item by itemId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee</a>
     */
    public <T> T getCompatV1ItemItemId(Long itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ItemItemIdForResponseEntity(itemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : request item by itemId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/item/{itemId}
     * @param itemId itemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee</a>
     */
    public ItemDto getCompatV1ItemItemId(Long itemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ItemDto> localVarReturnType = new ParameterizedTypeReference<ItemDto>() {};
        return this.getCompatV1ItemItemId(itemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : request item by itemId
     * API : catalog_compat_api GET /compat/v1/item/{itemId}
     * Notes : 
     * @param itemId itemId(required)
     * @return ItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8ee</a>
     */
    public ItemDto getCompatV1ItemItemId(Long itemId) throws ApiException {
        return this.getCompatV1ItemItemId(itemId, null);
    }
    /**
     * Summary : findProductAttributeTypesWithCollapsible
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/collapsible/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductAttributesCollapsibleProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ProductAttributesCollapsibleProductId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/product/attributes/collapsible/{productId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbbd9003634745ba8da", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findProductAttributeTypesWithCollapsible
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/collapsible/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductAttributeTypeDtoWithCollapsible>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da</a>
     */
    public <T> T getCompatV1ProductAttributesCollapsibleProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductAttributesCollapsibleProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findProductAttributeTypesWithCollapsible
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/collapsible/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductAttributeTypeDtoWithCollapsible>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da</a>
     */
    public List<ProductAttributeTypeDtoWithCollapsible> getCompatV1ProductAttributesCollapsibleProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ProductAttributeTypeDtoWithCollapsible>> localVarReturnType = new ParameterizedTypeReference<List<ProductAttributeTypeDtoWithCollapsible>>() {};
        return this.getCompatV1ProductAttributesCollapsibleProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findProductAttributeTypesWithCollapsible
     * API : catalog_compat_api GET /compat/v1/product/attributes/collapsible/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return List<ProductAttributeTypeDtoWithCollapsible>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8da</a>
     */
    public List<ProductAttributeTypeDtoWithCollapsible> getCompatV1ProductAttributesCollapsibleProductId(Long productId) throws ApiException {
        return this.getCompatV1ProductAttributesCollapsibleProductId(productId, null);
    }
    /**
     * Summary : productAttributeTypesByProductId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductAttributesProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ProductAttributesProductId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/product/attributes/{productId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbbd9003634745ba8d3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : productAttributeTypesByProductId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3</a>
     */
    public <T> T getCompatV1ProductAttributesProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductAttributesProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : productAttributeTypesByProductId
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/attributes/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3</a>
     */
    public List<ProductAttributeTypeDto> getCompatV1ProductAttributesProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ProductAttributeTypeDto>> localVarReturnType = new ParameterizedTypeReference<List<ProductAttributeTypeDto>>() {};
        return this.getCompatV1ProductAttributesProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : productAttributeTypesByProductId
     * API : catalog_compat_api GET /compat/v1/product/attributes/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return List<ProductAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3">http://api-forge.coupang.net/details?specId=58ec2fbbd9003634745ba8d3</a>
     */
    public List<ProductAttributeTypeDto> getCompatV1ProductAttributesProductId(Long productId) throws ApiException {
        return this.getCompatV1ProductAttributesProductId(productId, null);
    }
    /**
     * Summary : isAdultSold
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/isAdultSold/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11">http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductIsAdultSoldProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ProductIsAdultSoldProductId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/product/isAdultSold/{productId}"
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

        return apiClient.invokeAPIForResponseEntity("58ecc7a4c049542eab520f11", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : isAdultSold
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/isAdultSold/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11">http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11</a>
     */
    public <T> T getCompatV1ProductIsAdultSoldProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductIsAdultSoldProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : isAdultSold
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/isAdultSold/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11">http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11</a>
     */
    public Boolean getCompatV1ProductIsAdultSoldProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<Boolean>() {};
        return this.getCompatV1ProductIsAdultSoldProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : isAdultSold
     * API : catalog_compat_api GET /compat/v1/product/isAdultSold/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11">http://api-forge.coupang.net/details?specId=58ecc7a4c049542eab520f11</a>
     */
    public Boolean getCompatV1ProductIsAdultSoldProductId(Long productId) throws ApiException {
        return this.getCompatV1ProductIsAdultSoldProductId(productId, null);
    }
    /**
     * Summary : getProduct
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductProductIdForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ProductProductId");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/product/{productId}"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8f3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProduct
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3</a>
     */
    public <T> T getCompatV1ProductProductId(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductProductIdForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProduct
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3</a>
     */
    public ProductDto getCompatV1ProductProductId(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductDto> localVarReturnType = new ParameterizedTypeReference<ProductDto>() {};
        return this.getCompatV1ProductProductId(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProduct
     * API : catalog_compat_api GET /compat/v1/product/{productId}
     * Notes : 
     * @param productId productId(required)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f3</a>
     */
    public ProductDto getCompatV1ProductProductId(Long productId) throws ApiException {
        return this.getCompatV1ProductProductId(productId, null);
    }
    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}/all
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductProductIdAllForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getCompatV1ProductProductIdAll");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/product/{productId}/all"
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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8f8", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}/all
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8</a>
     */
    public <T> T getCompatV1ProductProductIdAll(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductProductIdAllForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductWithInvalid
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/product/{productId}/all
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8</a>
     */
    public ProductDto getCompatV1ProductProductIdAll(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductDto> localVarReturnType = new ParameterizedTypeReference<ProductDto>() {};
        return this.getCompatV1ProductProductIdAll(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductWithInvalid
     * API : catalog_compat_api GET /compat/v1/product/{productId}/all
     * Notes : 
     * @param productId productId(required)
     * @return ProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8f8</a>
     */
    public ProductDto getCompatV1ProductProductIdAll(Long productId) throws ApiException {
        return this.getCompatV1ProductProductIdAll(productId, null);
    }
    /**
     * Summary : getProductList
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/products/{productIds}
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd</a>
     */
    public <T> ResponseEntity<T> getCompatV1ProductsProductIdsForResponseEntity(String productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productIds' is set
        if (productIds == null) {
            throw new ApiException(400, "Missing the required parameter 'productIds' when calling getCompatV1ProductsProductIds");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/products/{productIds}"
            .replaceAll("\\{" + "productIds" + "\\}", productIds.toString());

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

        return apiClient.invokeAPIForResponseEntity("58ec2fbcd9003634745ba8fd", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductList
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/products/{productIds}
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd</a>
     */
    public <T> T getCompatV1ProductsProductIds(String productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1ProductsProductIdsForResponseEntity(productIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductList
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/products/{productIds}
     * @param productIds productIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd</a>
     */
    public List<ProductDto> getCompatV1ProductsProductIds(String productIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ProductDto>> localVarReturnType = new ParameterizedTypeReference<List<ProductDto>>() {};
        return this.getCompatV1ProductsProductIds(productIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductList
     * API : catalog_compat_api GET /compat/v1/products/{productIds}
     * Notes : 
     * @param productIds productIds(required)
     * @return List<ProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd">http://api-forge.coupang.net/details?specId=58ec2fbcd9003634745ba8fd</a>
     */
    public List<ProductDto> getCompatV1ProductsProductIds(String productIds) throws ApiException {
        return this.getCompatV1ProductsProductIds(productIds, null);
    }
    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/vendoritems/price/with/unitprice/{ids}
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505">http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505</a>
     */
    public <T> ResponseEntity<T> getCompatV1VendoritemsPriceWithUnitpriceIdsForResponseEntity(String ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getCompatV1VendoritemsPriceWithUnitpriceIds");
        }
        
        // create path and map variables
        String localVarPath = "/compat/v1/vendoritems/price/with/unitprice/{ids}"
            .replaceAll("\\{" + "ids" + "\\}", ids.toString());

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

        return apiClient.invokeAPIForResponseEntity("58fd90ad961146fc4ff67505", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/vendoritems/price/with/unitprice/{ids}
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505">http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505</a>
     */
    public <T> T getCompatV1VendoritemsPriceWithUnitpriceIds(String ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getCompatV1VendoritemsPriceWithUnitpriceIdsForResponseEntity(ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : catalog_compat_api GET /compat/v1/vendoritems/price/with/unitprice/{ids}
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505">http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505</a>
     */
    public Map<Long, PriceDto> getCompatV1VendoritemsPriceWithUnitpriceIds(String ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, PriceDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, PriceDto>>() {};
        return this.getCompatV1VendoritemsPriceWithUnitpriceIds(ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getAllWithUnitPrice
     * API : catalog_compat_api GET /compat/v1/vendoritems/price/with/unitprice/{ids}
     * Notes : 
     * @param ids ids(required)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505">http://api-forge.coupang.net/details?specId=58fd90ad961146fc4ff67505</a>
     */
    public Map<Long, PriceDto> getCompatV1VendoritemsPriceWithUnitpriceIds(String ids) throws ApiException {
        return this.getCompatV1VendoritemsPriceWithUnitpriceIds(ids, null);
    }
}
