package com.coupang.apigateway.services.search_features;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.210+09:00")
@org.springframework.stereotype.Component
public class SearchfeaturesApiHotkeywordAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchfeaturesApiHotkeywordAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_features");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : hotkeyword
     * Notes : 
     * API : search_features GET /api/hotkeyword
     * @param uid uid (optional)
     * @param pcid pcid (optional)
     * @param channel channel (optional)
     * @param version version (optional)
     * @param rows rows (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33</a>
     */
    public <T> ResponseEntity<T> getApiHotkeywordForResponseEntity(String uid, String pcid, String channel, String version, Integer rows, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/hotkeyword";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uid", uid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rows", rows));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58ff48d0098117577a770b33", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : hotkeyword
     * Notes : 
     * API : search_features GET /api/hotkeyword
     * @param uid uid (optional)
     * @param pcid pcid (optional)
     * @param channel channel (optional)
     * @param version version (optional)
     * @param rows rows (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<Map<String, Object>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33</a>
     */
    public <T> T getApiHotkeyword(String uid, String pcid, String channel, String version, Integer rows, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiHotkeywordForResponseEntity(uid, pcid, channel, version, rows, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : hotkeyword
     * Notes : 
     * API : search_features GET /api/hotkeyword
     * @param uid uid (optional)
     * @param pcid pcid (optional)
     * @param channel channel (optional)
     * @param version version (optional)
     * @param rows rows (optional, default to 10)
     * @param customHeader customHeaderMap (nullable)
     * @return List<Map<String, Object>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33</a>
     */
    public List<Map<String, Object>> getApiHotkeyword(String uid, String pcid, String channel, String version, Integer rows, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<Map<String, Object>>> localVarReturnType = new ParameterizedTypeReference<List<Map<String, Object>>>() {};
        return this.getApiHotkeyword(uid, pcid, channel, version, rows, localVarReturnType, customHeader);
    }

    /**
     * Summary : hotkeyword
     * API : search_features GET /api/hotkeyword
     * Notes : 
     * @param uid uid(optional)
     * @param pcid pcid(optional)
     * @param channel channel(optional)
     * @param version version(optional)
     * @param rows rows(optional, default to 10)
     * @return List<Map<String, Object>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b33</a>
     */
    public List<Map<String, Object>> getApiHotkeyword(String uid, String pcid, String channel, String version, Integer rows) throws ApiException {
        return this.getApiHotkeyword(uid, pcid, channel, version, rows, null);
    }
}
