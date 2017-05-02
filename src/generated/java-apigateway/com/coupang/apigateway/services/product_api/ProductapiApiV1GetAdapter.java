package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.VendorItemDTO;

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
public class ProductapiApiV1GetAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1GetAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findsWithAdditionalInfos
     * Notes : 
     * API : product_api POST /api/v1/get/vendoritems/withinfos
     * @param vendorItemIds vendorItemIds (required)
     * @param locale locale (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8</a>
     */
    public <T> ResponseEntity<T> postApiV1GetVendoritemsWithinfosForResponseEntity(List<Long> vendorItemIds, String locale, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemIds' is set
        if (vendorItemIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemIds' when calling postApiV1GetVendoritemsWithinfos");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException(400, "Missing the required parameter 'locale' when calling postApiV1GetVendoritemsWithinfos");
        }
        
        // verify the required parameter 'with' is set
        if (with == null) {
            throw new ApiException(400, "Missing the required parameter 'with' when calling postApiV1GetVendoritemsWithinfos");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/get/vendoritems/withinfos";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vendorItemIds", vendorItemIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "with", with));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57a427ea00f952f2d5ecd4e8", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findsWithAdditionalInfos
     * Notes : 
     * API : product_api POST /api/v1/get/vendoritems/withinfos
     * @param vendorItemIds vendorItemIds (required)
     * @param locale locale (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8</a>
     */
    public <T> T postApiV1GetVendoritemsWithinfos(List<Long> vendorItemIds, String locale, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1GetVendoritemsWithinfosForResponseEntity(vendorItemIds, locale, with, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findsWithAdditionalInfos
     * Notes : 
     * API : product_api POST /api/v1/get/vendoritems/withinfos
     * @param vendorItemIds vendorItemIds (required)
     * @param locale locale (required)
     * @param with with (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8</a>
     */
    public Map<Long, VendorItemDTO> postApiV1GetVendoritemsWithinfos(List<Long> vendorItemIds, String locale, List<String> with, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, VendorItemDTO>> localVarReturnType = new ParameterizedTypeReference<Map<Long, VendorItemDTO>>() {};
        return this.postApiV1GetVendoritemsWithinfos(vendorItemIds, locale, with, localVarReturnType, customHeader);
    }

    /**
     * Summary : findsWithAdditionalInfos
     * API : product_api POST /api/v1/get/vendoritems/withinfos
     * Notes : 
     * @param vendorItemIds vendorItemIds(required)
     * @param locale locale(required)
     * @param with with(required)
     * @return Map<Long, VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8">http://api-forge.coupang.net/details?specId=57a427ea00f952f2d5ecd4e8</a>
     */
    public Map<Long, VendorItemDTO> postApiV1GetVendoritemsWithinfos(List<Long> vendorItemIds, String locale, List<String> with) throws ApiException {
        return this.postApiV1GetVendoritemsWithinfos(vendorItemIds, locale, with, null);
    }
}
