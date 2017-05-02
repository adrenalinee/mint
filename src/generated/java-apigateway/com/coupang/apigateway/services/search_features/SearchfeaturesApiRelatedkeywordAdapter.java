package com.coupang.apigateway.services.search_features;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.search_features.model.RelatedKeywordResponseDto;

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
public class SearchfeaturesApiRelatedkeywordAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchfeaturesApiRelatedkeywordAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_features");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getRelatedKeyword
     * Notes : 
     * API : search_features GET /api/relatedkeyword
     * @param query  (optional)
     * @param uid  (optional)
     * @param pcid  (optional)
     * @param channel  (optional)
     * @param version  (optional)
     * @param limit  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d</a>
     */
    public <T> ResponseEntity<T> getApiRelatedkeywordForResponseEntity(String query, String uid, String pcid, String channel, String version, Integer limit, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/relatedkeyword";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uid", uid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58ff48d0098117577a770b3d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getRelatedKeyword
     * Notes : 
     * API : search_features GET /api/relatedkeyword
     * @param query  (optional)
     * @param uid  (optional)
     * @param pcid  (optional)
     * @param channel  (optional)
     * @param version  (optional)
     * @param limit  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return RelatedKeywordResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d</a>
     */
    public <T> T getApiRelatedkeyword(String query, String uid, String pcid, String channel, String version, Integer limit, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiRelatedkeywordForResponseEntity(query, uid, pcid, channel, version, limit, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getRelatedKeyword
     * Notes : 
     * API : search_features GET /api/relatedkeyword
     * @param query  (optional)
     * @param uid  (optional)
     * @param pcid  (optional)
     * @param channel  (optional)
     * @param version  (optional)
     * @param limit  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return RelatedKeywordResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d</a>
     */
    public RelatedKeywordResponseDto getApiRelatedkeyword(String query, String uid, String pcid, String channel, String version, Integer limit, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<RelatedKeywordResponseDto> localVarReturnType = new ParameterizedTypeReference<RelatedKeywordResponseDto>() {};
        return this.getApiRelatedkeyword(query, uid, pcid, channel, version, limit, localVarReturnType, customHeader);
    }

    /**
     * Summary : getRelatedKeyword
     * API : search_features GET /api/relatedkeyword
     * Notes : 
     * @param query (optional)
     * @param uid (optional)
     * @param pcid (optional)
     * @param channel (optional)
     * @param version (optional)
     * @param limit (optional)
     * @return RelatedKeywordResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d">http://api-forge.coupang.net/details?specId=58ff48d0098117577a770b3d</a>
     */
    public RelatedKeywordResponseDto getApiRelatedkeyword(String query, String uid, String pcid, String channel, String version, Integer limit) throws ApiException {
        return this.getApiRelatedkeyword(query, uid, pcid, channel, version, limit, null);
    }
}
