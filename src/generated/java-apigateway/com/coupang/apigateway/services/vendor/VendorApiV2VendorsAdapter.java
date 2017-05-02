package com.coupang.apigateway.services.vendor;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.vendor.model.VendorResponseOfListOfVendorDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.860+09:00")
@org.springframework.stereotype.Component
public class VendorApiV2VendorsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public VendorApiV2VendorsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("vendor");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findByVendorIds
     * Notes : 
     * API : vendor GET /api/v2/vendors/find-by-vendor-ids
     * @param vendorIds vendorIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2">http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2</a>
     */
    public <T> ResponseEntity<T> getApiV2VendorsFindByVendorIdsForResponseEntity(List<String> vendorIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorIds' is set
        if (vendorIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorIds' when calling getApiV2VendorsFindByVendorIds");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/vendors/find-by-vendor-ids";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vendorIds", vendorIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57a8160e8abc3cfbd583e9f2", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findByVendorIds
     * Notes : 
     * API : vendor GET /api/v2/vendors/find-by-vendor-ids
     * @param vendorIds vendorIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorResponseOfListOfVendorDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2">http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2</a>
     */
    public <T> T getApiV2VendorsFindByVendorIds(List<String> vendorIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2VendorsFindByVendorIdsForResponseEntity(vendorIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findByVendorIds
     * Notes : 
     * API : vendor GET /api/v2/vendors/find-by-vendor-ids
     * @param vendorIds vendorIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorResponseOfListOfVendorDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2">http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2</a>
     */
    public VendorResponseOfListOfVendorDto getApiV2VendorsFindByVendorIds(List<String> vendorIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorResponseOfListOfVendorDto> localVarReturnType = new ParameterizedTypeReference<VendorResponseOfListOfVendorDto>() {};
        return this.getApiV2VendorsFindByVendorIds(vendorIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : findByVendorIds
     * API : vendor GET /api/v2/vendors/find-by-vendor-ids
     * Notes : 
     * @param vendorIds vendorIds(required)
     * @return VendorResponseOfListOfVendorDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2">http://api-forge.coupang.net/details?specId=57a8160e8abc3cfbd583e9f2</a>
     */
    public VendorResponseOfListOfVendorDto getApiV2VendorsFindByVendorIds(List<String> vendorIds) throws ApiException {
        return this.getApiV2VendorsFindByVendorIds(vendorIds, null);
    }
}
