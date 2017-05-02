package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.VendorItemInfoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
@org.springframework.stereotype.Component
public class RssV1VendoriteminfoAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssV1VendoriteminfoAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findsByCoupangSrls
     * Notes : 
     * API : rss POST /v1/vendoritem-info/option-srls
     * @param optionSrls optionSrls (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db</a>
     */
    public <T> ResponseEntity<T> postV1VendoritemInfoOptionSrlsForResponseEntity(List<Long> optionSrls, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'optionSrls' is set
        if (optionSrls == null) {
            throw new ApiException(400, "Missing the required parameter 'optionSrls' when calling postV1VendoritemInfoOptionSrls");
        }
        
        // create path and map variables
        String localVarPath = "/v1/vendoritem-info/option-srls";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "optionSrls", optionSrls));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34685d35bb43c2694a1db", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findsByCoupangSrls
     * Notes : 
     * API : rss POST /v1/vendoritem-info/option-srls
     * @param optionSrls optionSrls (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db</a>
     */
    public <T> T postV1VendoritemInfoOptionSrls(List<Long> optionSrls, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1VendoritemInfoOptionSrlsForResponseEntity(optionSrls, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findsByCoupangSrls
     * Notes : 
     * API : rss POST /v1/vendoritem-info/option-srls
     * @param optionSrls optionSrls (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db</a>
     */
    public Map<String, VendorItemInfoDto> postV1VendoritemInfoOptionSrls(List<Long> optionSrls, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, VendorItemInfoDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, VendorItemInfoDto>>() {};
        return this.postV1VendoritemInfoOptionSrls(optionSrls, localVarReturnType, customHeader);
    }

    /**
     * Summary : findsByCoupangSrls
     * API : rss POST /v1/vendoritem-info/option-srls
     * Notes : 
     * @param optionSrls optionSrls(required)
     * @return Map<String, VendorItemInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1db</a>
     */
    public Map<String, VendorItemInfoDto> postV1VendoritemInfoOptionSrls(List<Long> optionSrls) throws ApiException {
        return this.postV1VendoritemInfoOptionSrls(optionSrls, null);
    }
    /**
     * Summary : findVendorItemInfosByVendorItemId
     * Notes : 
     * API : rss GET /v1/vendoritem-info/vendor-item-id/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5</a>
     */
    public <T> ResponseEntity<T> getV1VendoritemInfoVendorItemIdVendorItemIdForResponseEntity(Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemId' is set
        if (vendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemId' when calling getV1VendoritemInfoVendorItemIdVendorItemId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/vendoritem-info/vendor-item-id/{vendorItemId}"
            .replaceAll("\\{" + "vendorItemId" + "\\}", vendorItemId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e34685d35bb43c2694a1e5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findVendorItemInfosByVendorItemId
     * Notes : 
     * API : rss GET /v1/vendoritem-info/vendor-item-id/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5</a>
     */
    public <T> T getV1VendoritemInfoVendorItemIdVendorItemId(Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1VendoritemInfoVendorItemIdVendorItemIdForResponseEntity(vendorItemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findVendorItemInfosByVendorItemId
     * Notes : 
     * API : rss GET /v1/vendoritem-info/vendor-item-id/{vendorItemId}
     * @param vendorItemId vendorItemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5</a>
     */
    public VendorItemInfoDto getV1VendoritemInfoVendorItemIdVendorItemId(Long vendorItemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorItemInfoDto> localVarReturnType = new ParameterizedTypeReference<VendorItemInfoDto>() {};
        return this.getV1VendoritemInfoVendorItemIdVendorItemId(vendorItemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findVendorItemInfosByVendorItemId
     * API : rss GET /v1/vendoritem-info/vendor-item-id/{vendorItemId}
     * Notes : 
     * @param vendorItemId vendorItemId(required)
     * @return VendorItemInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a1e5</a>
     */
    public VendorItemInfoDto getV1VendoritemInfoVendorItemIdVendorItemId(Long vendorItemId) throws ApiException {
        return this.getV1VendoritemInfoVendorItemIdVendorItemId(vendorItemId, null);
    }
}
