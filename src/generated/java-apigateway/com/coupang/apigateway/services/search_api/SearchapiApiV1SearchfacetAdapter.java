package com.coupang.apigateway.services.search_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.search_api.model.SearchFacetConditionV2;
import com.coupang.apigateway.services.search_api.model.Facets;

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
public class SearchapiApiV1SearchfacetAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SearchapiApiV1SearchfacetAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("search_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : General Faceting Api(With search keyword)
     * Notes : 
     * API : search_api POST /api/v1/searchfacet
     * @param facetCondition Faceting Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11">http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11</a>
     */
    public <T> ResponseEntity<T> postApiV1SearchfacetForResponseEntity(SearchFacetConditionV2 facetCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = facetCondition;
        
        // verify the required parameter 'facetCondition' is set
        if (facetCondition == null) {
            throw new ApiException(400, "Missing the required parameter 'facetCondition' when calling postApiV1Searchfacet");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/searchfacet";

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

        return apiClient.invokeAPIForResponseEntity("58e33612e03ab0dfc997dc11", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : General Faceting Api(With search keyword)
     * Notes : 
     * API : search_api POST /api/v1/searchfacet
     * @param facetCondition Faceting Condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Facets
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11">http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11</a>
     */
    public <T> T postApiV1Searchfacet(SearchFacetConditionV2 facetCondition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1SearchfacetForResponseEntity(facetCondition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : General Faceting Api(With search keyword)
     * Notes : 
     * API : search_api POST /api/v1/searchfacet
     * @param facetCondition Faceting Condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Facets
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11">http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11</a>
     */
    public Facets postApiV1Searchfacet(SearchFacetConditionV2 facetCondition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Facets> localVarReturnType = new ParameterizedTypeReference<Facets>() {};
        return this.postApiV1Searchfacet(facetCondition, localVarReturnType, customHeader);
    }

    /**
     * Summary : General Faceting Api(With search keyword)
     * API : search_api POST /api/v1/searchfacet
     * Notes : 
     * @param facetCondition Faceting Condition(required)
     * @return Facets
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11">http://api-forge.coupang.net/details?specId=58e33612e03ab0dfc997dc11</a>
     */
    public Facets postApiV1Searchfacet(SearchFacetConditionV2 facetCondition) throws ApiException {
        return this.postApiV1Searchfacet(facetCondition, null);
    }
}
