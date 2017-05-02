package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import java.util.*;
import com.coupang.apigateway.services.product_api.model.VendorItemPackageDTO;

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
public class ProductapiApiV2VendoritempackagesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV2VendoritempackagesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Inquery a vendorItemPackage by VendorItemPackageId
     * Notes : Inquery a vendorItemPackage by VendorItemPackageId
     * API : product_api POST /api/v2/vendoritempackages
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af</a>
     */
    public <T> ResponseEntity<T> postApiV2VendoritempackagesForResponseEntity(List<Long> vendorItemPackageIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = vendorItemPackageIds;
        
        // verify the required parameter 'vendorItemPackageIds' is set
        if (vendorItemPackageIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageIds' when calling postApiV2Vendoritempackages");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/vendoritempackages";

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

        return apiClient.invokeAPIForResponseEntity("57a427ee00f952f2d5ecd7af", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Inquery a vendorItemPackage by VendorItemPackageId
     * Notes : Inquery a vendorItemPackage by VendorItemPackageId
     * API : product_api POST /api/v2/vendoritempackages
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, VendorItemPackageDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af</a>
     */
    public <T> T postApiV2Vendoritempackages(List<Long> vendorItemPackageIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2VendoritempackagesForResponseEntity(vendorItemPackageIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Inquery a vendorItemPackage by VendorItemPackageId
     * Notes : Inquery a vendorItemPackage by VendorItemPackageId
     * API : product_api POST /api/v2/vendoritempackages
     * @param vendorItemPackageIds vendorItemPackageIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, VendorItemPackageDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af</a>
     */
    public Map<Long, VendorItemPackageDTO> postApiV2Vendoritempackages(List<Long> vendorItemPackageIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, VendorItemPackageDTO>> localVarReturnType = new ParameterizedTypeReference<Map<Long, VendorItemPackageDTO>>() {};
        return this.postApiV2Vendoritempackages(vendorItemPackageIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : Inquery a vendorItemPackage by VendorItemPackageId
     * API : product_api POST /api/v2/vendoritempackages
     * Notes : Inquery a vendorItemPackage by VendorItemPackageId
     * @param vendorItemPackageIds vendorItemPackageIds(required)
     * @return Map<Long, VendorItemPackageDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af">http://api-forge.coupang.net/details?specId=57a427ee00f952f2d5ecd7af</a>
     */
    public Map<Long, VendorItemPackageDTO> postApiV2Vendoritempackages(List<Long> vendorItemPackageIds) throws ApiException {
        return this.postApiV2Vendoritempackages(vendorItemPackageIds, null);
    }
}
