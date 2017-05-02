package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.VendorItemQuantityDto;

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
public class ProductapiApiV2VendoritemsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV2VendoritemsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findsVendorItemQuantity
     * Notes : 
     * API : product_api GET /api/v2/vendoritems/quantity
     * @param vendorItemIds vendorItemIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc</a>
     */
    public <T> ResponseEntity<T> getApiV2VendoritemsQuantityForResponseEntity(List<Long> vendorItemIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemIds' is set
        if (vendorItemIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemIds' when calling getApiV2VendoritemsQuantity");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/vendoritems/quantity";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vendorItemIds", vendorItemIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57a427ee00f952f2d5ecd7dc", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findsVendorItemQuantity
     * Notes : 
     * API : product_api GET /api/v2/vendoritems/quantity
     * @param vendorItemIds vendorItemIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemQuantityDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc</a>
     */
    public <T> T getApiV2VendoritemsQuantity(List<Long> vendorItemIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2VendoritemsQuantityForResponseEntity(vendorItemIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findsVendorItemQuantity
     * Notes : 
     * API : product_api GET /api/v2/vendoritems/quantity
     * @param vendorItemIds vendorItemIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemQuantityDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc</a>
     */
    public Map<String, VendorItemQuantityDto> getApiV2VendoritemsQuantity(List<Long> vendorItemIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, VendorItemQuantityDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, VendorItemQuantityDto>>() {};
        return this.getApiV2VendoritemsQuantity(vendorItemIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : findsVendorItemQuantity
     * API : product_api GET /api/v2/vendoritems/quantity
     * Notes : 
     * @param vendorItemIds vendorItemIds(required)
     * @return Map<String, VendorItemQuantityDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7dc</a>
     */
    public Map<String, VendorItemQuantityDto> getApiV2VendoritemsQuantity(List<Long> vendorItemIds) throws ApiException {
        return this.getApiV2VendoritemsQuantity(vendorItemIds, null);
    }
}
