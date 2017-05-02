package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.VendorItemPackageLegacyDTO;

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
public class RssDealsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssDealsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findWithInfos
     * Notes : 
     * API : rss POST /deals/withinfos
     * @param coupangSrls coupangSrls (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5">http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5</a>
     */
    public <T> ResponseEntity<T> postDealsWithinfosForResponseEntity(List<Long> coupangSrls, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrls' is set
        if (coupangSrls == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrls' when calling postDealsWithinfos");
        }
        
        // verify the required parameter 'with' is set
        if (with == null) {
            throw new ApiException(400, "Missing the required parameter 'with' when calling postDealsWithinfos");
        }
        
        // create path and map variables
        String localVarPath = "/deals/withinfos";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "coupangSrls", coupangSrls));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "with", with));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34683d35bb43c2694a0a5", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findWithInfos
     * Notes : 
     * API : rss POST /deals/withinfos
     * @param coupangSrls coupangSrls (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPackageLegacyDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5">http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5</a>
     */
    public <T> T postDealsWithinfos(List<Long> coupangSrls, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postDealsWithinfosForResponseEntity(coupangSrls, with, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findWithInfos
     * Notes : 
     * API : rss POST /deals/withinfos
     * @param coupangSrls coupangSrls (required)
     * @param with with (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPackageLegacyDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5">http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5</a>
     */
    public Map<String, VendorItemPackageLegacyDTO> postDealsWithinfos(List<Long> coupangSrls, List<String> with, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, VendorItemPackageLegacyDTO>> localVarReturnType = new ParameterizedTypeReference<Map<String, VendorItemPackageLegacyDTO>>() {};
        return this.postDealsWithinfos(coupangSrls, with, localVarReturnType, customHeader);
    }

    /**
     * Summary : findWithInfos
     * API : rss POST /deals/withinfos
     * Notes : 
     * @param coupangSrls coupangSrls(required)
     * @param with with(required)
     * @return Map<String, VendorItemPackageLegacyDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5">http://api-forge.coupang.net/details?specId=57e34683d35bb43c2694a0a5</a>
     */
    public Map<String, VendorItemPackageLegacyDTO> postDealsWithinfos(List<Long> coupangSrls, List<String> with) throws ApiException {
        return this.postDealsWithinfos(coupangSrls, with, null);
    }
}
