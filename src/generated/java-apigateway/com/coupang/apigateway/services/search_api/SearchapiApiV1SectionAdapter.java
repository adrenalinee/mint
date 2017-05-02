package com.coupang.apigateway.services.search_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.search_api.model.SearchResult;
import com.coupang.apigateway.services.search_api.model.SectionConditionV1;

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
public class SearchapiApiV1SectionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchapiApiV1SectionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Section List Api(for 기획전)
     * Notes : 
     * API : search_api POST /api/v1/section
     * @param sectionCondition Section Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb</a>
     */
    public <T> ResponseEntity<T> postApiV1SectionForResponseEntity(SectionConditionV1 sectionCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = sectionCondition;
        
        // verify the required parameter 'sectionCondition' is set
        if (sectionCondition == null) {
            throw new ApiException(400, "Missing the required parameter 'sectionCondition' when calling postApiV1Section");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/section";

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

        return apiClient.invokeAPIForResponseEntity("5871a30691bc7acc213852bb", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Section List Api(for 기획전)
     * Notes : 
     * API : search_api POST /api/v1/section
     * @param sectionCondition Section Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb</a>
     */
    public <T> T postApiV1Section(SectionConditionV1 sectionCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1SectionForResponseEntity(sectionCondition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Section List Api(for 기획전)
     * Notes : 
     * API : search_api POST /api/v1/section
     * @param sectionCondition Section Condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb</a>
     */
    public SearchResult postApiV1Section(SectionConditionV1 sectionCondition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SearchResult> localVarReturnType = new ParameterizedTypeReference<SearchResult>() {};
        return this.postApiV1Section(sectionCondition, localVarReturnType, customHeader);
    }

    /**
     * Summary : Section List Api(for 기획전)
     * API : search_api POST /api/v1/section
     * Notes : 
     * @param sectionCondition Section Condition(required)
     * @return SearchResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb">http://api-forge.coupang.net/details?specId=5871a30691bc7acc213852bb</a>
     */
    public SearchResult postApiV1Section(SectionConditionV1 sectionCondition) throws ApiException {
        return this.postApiV1Section(sectionCondition, null);
    }
}
