package com.coupang.apigateway.services.recommendation;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.recommendation.model.ProductListDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
@org.springframework.stereotype.Component
public class RecommendationApiV4CategoryAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RecommendationApiV4CategoryAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("recommendation");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getHomeRankC3ForCache
     * Notes : 
     * API : recommendation GET /api/v4/category/home-rank-c3-for-cache/product
     * @param segmentId segmentId (required)
     * @param segmentRank segmentRank (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param maxCount maxCount (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142">http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142</a>
     */
    public <T> ResponseEntity<T> getApiV4CategoryHomeRankC3ForCacheProductForResponseEntity(Long segmentId, String segmentRank, String platform, String eventLabel, Integer maxCount, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new ApiException(400, "Missing the required parameter 'segmentId' when calling getApiV4CategoryHomeRankC3ForCacheProduct");
        }
        
        // verify the required parameter 'segmentRank' is set
        if (segmentRank == null) {
            throw new ApiException(400, "Missing the required parameter 'segmentRank' when calling getApiV4CategoryHomeRankC3ForCacheProduct");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4CategoryHomeRankC3ForCacheProduct");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4CategoryHomeRankC3ForCacheProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/category/home-rank-c3-for-cache/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "segmentId", segmentId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "segmentRank", segmentRank));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCount", maxCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58a2649fd52df5b0d5d85142", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getHomeRankC3ForCache
     * Notes : 
     * API : recommendation GET /api/v4/category/home-rank-c3-for-cache/product
     * @param segmentId segmentId (required)
     * @param segmentRank segmentRank (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param maxCount maxCount (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142">http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142</a>
     */
    public <T> T getApiV4CategoryHomeRankC3ForCacheProduct(Long segmentId, String segmentRank, String platform, String eventLabel, Integer maxCount, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4CategoryHomeRankC3ForCacheProductForResponseEntity(segmentId, segmentRank, platform, eventLabel, maxCount, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getHomeRankC3ForCache
     * Notes : 
     * API : recommendation GET /api/v4/category/home-rank-c3-for-cache/product
     * @param segmentId segmentId (required)
     * @param segmentRank segmentRank (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param maxCount maxCount (optional, default to 10)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142">http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142</a>
     */
    public ProductListDto getApiV4CategoryHomeRankC3ForCacheProduct(Long segmentId, String segmentRank, String platform, String eventLabel, Integer maxCount, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductListDto> localVarReturnType = new ParameterizedTypeReference<ProductListDto>() {};
        return this.getApiV4CategoryHomeRankC3ForCacheProduct(segmentId, segmentRank, platform, eventLabel, maxCount, localVarReturnType, customHeader);
    }

    /**
     * Summary : getHomeRankC3ForCache
     * API : recommendation GET /api/v4/category/home-rank-c3-for-cache/product
     * Notes : 
     * @param segmentId segmentId(required)
     * @param segmentRank segmentRank(required)
     * @param platform platform(required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method.(required)
     * @param maxCount maxCount(optional, default to 10)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142">http://api-forge.coupang.net/details?specId=58a2649fd52df5b0d5d85142</a>
     */
    public ProductListDto getApiV4CategoryHomeRankC3ForCacheProduct(Long segmentId, String segmentRank, String platform, String eventLabel, Integer maxCount) throws ApiException {
        return this.getApiV4CategoryHomeRankC3ForCacheProduct(segmentId, segmentRank, platform, eventLabel, maxCount, null);
    }
}
