package com.coupang.apigateway.services.search_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.search_api.model.KeywordCondition;
import com.coupang.apigateway.services.search_api.model.Metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
@org.springframework.stereotype.Component
public class SearchapiApiV1MetadataAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchapiApiV1MetadataAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Search Keyword Metadata Api
     * Notes : 
     * API : search_api POST /api/v1/metadata
     * @param keywordCondition Keyword Metadata Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f">http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f</a>
     */
    public <T> ResponseEntity<T> postApiV1MetadataForResponseEntity(KeywordCondition keywordCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = keywordCondition;
        
        // verify the required parameter 'keywordCondition' is set
        if (keywordCondition == null) {
            throw new ApiException(400, "Missing the required parameter 'keywordCondition' when calling postApiV1Metadata");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/metadata";

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

        return apiClient.invokeAPIForResponseEntity("5874ce3bb4863465f6646a1f", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Search Keyword Metadata Api
     * Notes : 
     * API : search_api POST /api/v1/metadata
     * @param keywordCondition Keyword Metadata Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Metadata
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f">http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f</a>
     */
    public <T> T postApiV1Metadata(KeywordCondition keywordCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MetadataForResponseEntity(keywordCondition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Search Keyword Metadata Api
     * Notes : 
     * API : search_api POST /api/v1/metadata
     * @param keywordCondition Keyword Metadata Condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Metadata
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f">http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f</a>
     */
    public Metadata postApiV1Metadata(KeywordCondition keywordCondition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Metadata> localVarReturnType = new ParameterizedTypeReference<Metadata>() {};
        return this.postApiV1Metadata(keywordCondition, localVarReturnType, customHeader);
    }

    /**
     * Summary : Search Keyword Metadata Api
     * API : search_api POST /api/v1/metadata
     * Notes : 
     * @param keywordCondition Keyword Metadata Condition(required)
     * @return Metadata
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f">http://api-forge.coupang.net/details?specId=5874ce3bb4863465f6646a1f</a>
     */
    public Metadata postApiV1Metadata(KeywordCondition keywordCondition) throws ApiException {
        return this.postApiV1Metadata(keywordCondition, null);
    }
}
