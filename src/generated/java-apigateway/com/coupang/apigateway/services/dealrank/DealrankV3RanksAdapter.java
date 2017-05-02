package com.coupang.apigateway.services.dealrank;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.dealrank.model.InlineResponse200;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.606+09:00")
@org.springframework.stereotype.Component
public class DealrankV3RanksAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DealrankV3RanksAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("dealrank");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 
     * Notes : Get trending brands ranking
     * API : dealrank GET /v3/ranks/brand/sections/trending/categories/{categoryId}
     * @param categoryId categoryId (external category id) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to web)
     * @param limit item number limit (optional, default to 50)
     * @param index start index number for paging (optional, default to 0)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05">http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05</a>
     */
    public <T> ResponseEntity<T> getV3RanksBrandSectionsTrendingCategoriesCategoryIdForResponseEntity(String categoryId, String agent, BigDecimal limit, BigDecimal index, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getV3RanksBrandSectionsTrendingCategoriesCategoryId");
        }
        
        // create path and map variables
        String localVarPath = "/v3/ranks/brand/sections/trending/categories/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", categoryId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent", agent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "index", index));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57f2e920b8ce444b53210c05", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 
     * Notes : Get trending brands ranking
     * API : dealrank GET /v3/ranks/brand/sections/trending/categories/{categoryId}
     * @param categoryId categoryId (external category id) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to web)
     * @param limit item number limit (optional, default to 50)
     * @param index start index number for paging (optional, default to 0)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse200
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05">http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05</a>
     */
    public <T> T getV3RanksBrandSectionsTrendingCategoriesCategoryId(String categoryId, String agent, BigDecimal limit, BigDecimal index, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV3RanksBrandSectionsTrendingCategoriesCategoryIdForResponseEntity(categoryId, agent, limit, index, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 
     * Notes : Get trending brands ranking
     * API : dealrank GET /v3/ranks/brand/sections/trending/categories/{categoryId}
     * @param categoryId categoryId (external category id) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to web)
     * @param limit item number limit (optional, default to 50)
     * @param index start index number for paging (optional, default to 0)
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse200
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05">http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05</a>
     */
    public InlineResponse200 getV3RanksBrandSectionsTrendingCategoriesCategoryId(String categoryId, String agent, BigDecimal limit, BigDecimal index, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<InlineResponse200> localVarReturnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return this.getV3RanksBrandSectionsTrendingCategoriesCategoryId(categoryId, agent, limit, index, localVarReturnType, customHeader);
    }

    /**
     * Summary : 
     * API : dealrank GET /v3/ranks/brand/sections/trending/categories/{categoryId}
     * Notes : Get trending brands ranking
     * @param categoryId categoryId (external category id)(required)
     * @param agent agentId (Android | iOS | WEB | mobile)(optional, default to web)
     * @param limit item number limit(optional, default to 50)
     * @param index start index number for paging(optional, default to 0)
     * @return InlineResponse200
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05">http://api-forge.coupang.net/details?specId=57f2e920b8ce444b53210c05</a>
     */
    public InlineResponse200 getV3RanksBrandSectionsTrendingCategoriesCategoryId(String categoryId, String agent, BigDecimal limit, BigDecimal index) throws ApiException {
        return this.getV3RanksBrandSectionsTrendingCategoriesCategoryId(categoryId, agent, limit, index, null);
    }
}
