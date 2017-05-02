package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.ProductDetailVendorItemDto;

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
public class ProductapiApiV1ProductdetailAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1ProductdetailAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findVendorItem
     * Notes : 
     * API : product_api GET /api/v1/product-detail/vendor-items/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param infoTypes infoTypes (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a">http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a</a>
     */
    public <T> ResponseEntity<T> getApiV1ProductDetailVendorItemsVendorItemIdForResponseEntity(Long vendorItemId, List<String> infoTypes, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemId' is set
        if (vendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemId' when calling getApiV1ProductDetailVendorItemsVendorItemId");
        }
        
        // verify the required parameter 'infoTypes' is set
        if (infoTypes == null) {
            throw new ApiException(400, "Missing the required parameter 'infoTypes' when calling getApiV1ProductDetailVendorItemsVendorItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/product-detail/vendor-items/{vendorItemId}"
            .replaceAll("\\{" + "vendorItemId" + "\\}", vendorItemId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "infoTypes", infoTypes));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5846246c186af774f880be0a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findVendorItem
     * Notes : 
     * API : product_api GET /api/v1/product-detail/vendor-items/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param infoTypes infoTypes (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDetailVendorItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a">http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a</a>
     */
    public <T> T getApiV1ProductDetailVendorItemsVendorItemId(Long vendorItemId, List<String> infoTypes, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ProductDetailVendorItemsVendorItemIdForResponseEntity(vendorItemId, infoTypes, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findVendorItem
     * Notes : 
     * API : product_api GET /api/v1/product-detail/vendor-items/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param infoTypes infoTypes (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductDetailVendorItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a">http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a</a>
     */
    public ProductDetailVendorItemDto getApiV1ProductDetailVendorItemsVendorItemId(Long vendorItemId, List<String> infoTypes, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductDetailVendorItemDto> localVarReturnType = new ParameterizedTypeReference<ProductDetailVendorItemDto>() {};
        return this.getApiV1ProductDetailVendorItemsVendorItemId(vendorItemId, infoTypes, localVarReturnType, customHeader);
    }

    /**
     * Summary : findVendorItem
     * API : product_api GET /api/v1/product-detail/vendor-items/{vendorItemId}
     * Notes : 
     * @param vendorItemId vendorItemId(required)
     * @param infoTypes infoTypes(required)
     * @return ProductDetailVendorItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a">http://api-forge.coupang.net/details?specId=5846246c186af774f880be0a</a>
     */
    public ProductDetailVendorItemDto getApiV1ProductDetailVendorItemsVendorItemId(Long vendorItemId, List<String> infoTypes) throws ApiException {
        return this.getApiV1ProductDetailVendorItemsVendorItemId(vendorItemId, infoTypes, null);
    }
}
