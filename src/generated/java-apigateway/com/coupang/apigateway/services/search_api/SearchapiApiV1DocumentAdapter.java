package com.coupang.apigateway.services.search_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.search_api.model.SearchResult;
import com.coupang.apigateway.services.search_api.model.DocumentCondition;

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
public class SearchapiApiV1DocumentAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchapiApiV1DocumentAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Document Query Api.(for searching documents based on document id)
     * Notes : 
     * API : search_api POST /api/v1/document
     * @param documentCondition Document Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca</a>
     */
    public <T> ResponseEntity<T> postApiV1DocumentForResponseEntity(DocumentCondition documentCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = documentCondition;
        
        // verify the required parameter 'documentCondition' is set
        if (documentCondition == null) {
            throw new ApiException(400, "Missing the required parameter 'documentCondition' when calling postApiV1Document");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/document";

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

        return apiClient.invokeAPIForResponseEntity("5871a30691bc7acc213852ca", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Document Query Api.(for searching documents based on document id)
     * Notes : 
     * API : search_api POST /api/v1/document
     * @param documentCondition Document Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca</a>
     */
    public <T> T postApiV1Document(DocumentCondition documentCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1DocumentForResponseEntity(documentCondition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Document Query Api.(for searching documents based on document id)
     * Notes : 
     * API : search_api POST /api/v1/document
     * @param documentCondition Document Condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca</a>
     */
    public SearchResult postApiV1Document(DocumentCondition documentCondition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SearchResult> localVarReturnType = new ParameterizedTypeReference<SearchResult>() {};
        return this.postApiV1Document(documentCondition, localVarReturnType, customHeader);
    }

    /**
     * Summary : Document Query Api.(for searching documents based on document id)
     * API : search_api POST /api/v1/document
     * Notes : 
     * @param documentCondition Document Condition(required)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852ca</a>
     */
    public SearchResult postApiV1Document(DocumentCondition documentCondition) throws ApiException {
        return this.postApiV1Document(documentCondition, null);
    }
}
