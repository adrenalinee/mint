package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.VendorItemPackageInfoDto;

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
public class RssV1VendoritempackageinfoAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssV1VendoritempackageinfoAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findInfoByIds
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-or-package-ids
     * @param packageIds packageIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226</a>
     */
    public <T> ResponseEntity<T> getV1VendoritempackageInfoCoupangOrPackageIdsForResponseEntity(List<Long> packageIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'packageIds' is set
        if (packageIds == null) {
            throw new ApiException(400, "Missing the required parameter 'packageIds' when calling getV1VendoritempackageInfoCoupangOrPackageIds");
        }
        
        // create path and map variables
        String localVarPath = "/v1/vendoritempackage-info/coupang-or-package-ids";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "packageIds", packageIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34685d35bb43c2694a226", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findInfoByIds
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-or-package-ids
     * @param packageIds packageIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPackageInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226</a>
     */
    public <T> T getV1VendoritempackageInfoCoupangOrPackageIds(List<Long> packageIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1VendoritempackageInfoCoupangOrPackageIdsForResponseEntity(packageIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findInfoByIds
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-or-package-ids
     * @param packageIds packageIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPackageInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226</a>
     */
    public Map<String, VendorItemPackageInfoDto> getV1VendoritempackageInfoCoupangOrPackageIds(List<Long> packageIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, VendorItemPackageInfoDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, VendorItemPackageInfoDto>>() {};
        return this.getV1VendoritempackageInfoCoupangOrPackageIds(packageIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : findInfoByIds
     * API : rss GET /v1/vendoritempackage-info/coupang-or-package-ids
     * Notes : 
     * @param packageIds packageIds(required)
     * @return Map<String, VendorItemPackageInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a226</a>
     */
    public Map<String, VendorItemPackageInfoDto> getV1VendoritempackageInfoCoupangOrPackageIds(List<Long> packageIds) throws ApiException {
        return this.getV1VendoritempackageInfoCoupangOrPackageIds(packageIds, null);
    }
    /**
     * Summary : findByCoupangSrl
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-srl/{coupangSrl}
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b</a>
     */
    public <T> ResponseEntity<T> getV1VendoritempackageInfoCoupangSrlCoupangSrlForResponseEntity(Long coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrl' is set
        if (coupangSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrl' when calling getV1VendoritempackageInfoCoupangSrlCoupangSrl");
        }
        
        // create path and map variables
        String localVarPath = "/v1/vendoritempackage-info/coupang-srl/{coupangSrl}"
            .replaceAll("\\{" + "coupangSrl" + "\\}", coupangSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e34685d35bb43c2694a22b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findByCoupangSrl
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-srl/{coupangSrl}
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b</a>
     */
    public <T> T getV1VendoritempackageInfoCoupangSrlCoupangSrl(Long coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1VendoritempackageInfoCoupangSrlCoupangSrlForResponseEntity(coupangSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findByCoupangSrl
     * Notes : 
     * API : rss GET /v1/vendoritempackage-info/coupang-srl/{coupangSrl}
     * @param coupangSrl coupangSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b</a>
     */
    public VendorItemPackageInfoDto getV1VendoritempackageInfoCoupangSrlCoupangSrl(Long coupangSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorItemPackageInfoDto> localVarReturnType = new ParameterizedTypeReference<VendorItemPackageInfoDto>() {};
        return this.getV1VendoritempackageInfoCoupangSrlCoupangSrl(coupangSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : findByCoupangSrl
     * API : rss GET /v1/vendoritempackage-info/coupang-srl/{coupangSrl}
     * Notes : 
     * @param coupangSrl coupangSrl(required)
     * @return VendorItemPackageInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b">http://api-forge.coupang.net/details?specId=57e34685d35bb43c2694a22b</a>
     */
    public VendorItemPackageInfoDto getV1VendoritempackageInfoCoupangSrlCoupangSrl(Long coupangSrl) throws ApiException {
        return this.getV1VendoritempackageInfoCoupangSrlCoupangSrl(coupangSrl, null);
    }
}
