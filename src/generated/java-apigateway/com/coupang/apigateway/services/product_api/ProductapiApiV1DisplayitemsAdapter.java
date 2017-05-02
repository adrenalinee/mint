package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.DisplayItem;

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
public class ProductapiApiV1DisplayitemsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1DisplayitemsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Inquery a displayItem by VendorItemPackageId
     * Notes : Inquery a displayItem by VendorItemPackageId
     * API : product_api POST /api/v1/displayitems
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param decorator decorator (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de</a>
     */
    public <T> ResponseEntity<T> postApiV1DisplayitemsForResponseEntity(List<Long> vendorItemPackageIds, List<String> decorator, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageIds' is set
        if (vendorItemPackageIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageIds' when calling postApiV1Displayitems");
        }
        
        // verify the required parameter 'decorator' is set
        if (decorator == null) {
            throw new ApiException(400, "Missing the required parameter 'decorator' when calling postApiV1Displayitems");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displayitems";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vendorItemPackageIds", vendorItemPackageIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "decorator", decorator));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57a427ea00f952f2d5ecd4de", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Inquery a displayItem by VendorItemPackageId
     * Notes : Inquery a displayItem by VendorItemPackageId
     * API : product_api POST /api/v1/displayitems
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param decorator decorator (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de</a>
     */
    public <T> T postApiV1Displayitems(List<Long> vendorItemPackageIds, List<String> decorator, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1DisplayitemsForResponseEntity(vendorItemPackageIds, decorator, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Inquery a displayItem by VendorItemPackageId
     * Notes : Inquery a displayItem by VendorItemPackageId
     * API : product_api POST /api/v1/displayitems
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param decorator decorator (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de</a>
     */
    public Map<Long, DisplayItem> postApiV1Displayitems(List<Long> vendorItemPackageIds, List<String> decorator, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, DisplayItem>> localVarReturnType = new ParameterizedTypeReference<Map<Long, DisplayItem>>() {};
        return this.postApiV1Displayitems(vendorItemPackageIds, decorator, localVarReturnType, customHeader);
    }

    /**
     * Summary : Inquery a displayItem by VendorItemPackageId
     * API : product_api POST /api/v1/displayitems
     * Notes : Inquery a displayItem by VendorItemPackageId
     * @param vendorItemPackageIds vendorItemPackageIds(required)
     * @param decorator decorator(required)
     * @return Map<Long, DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4de</a>
     */
    public Map<Long, DisplayItem> postApiV1Displayitems(List<Long> vendorItemPackageIds, List<String> decorator) throws ApiException {
        return this.postApiV1Displayitems(vendorItemPackageIds, decorator, null);
    }
}
