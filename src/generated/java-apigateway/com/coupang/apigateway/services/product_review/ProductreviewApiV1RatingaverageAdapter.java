package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.RatingAverageWithProductInfoDto;
import com.coupang.apigateway.services.product_review.model.SimpleRatingAverageDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
@org.springframework.stereotype.Component
public class ProductreviewApiV1RatingaverageAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1RatingaverageAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getRatingAverageWithProductInfo
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/productwithinfo
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b</a>
     */
    public <T> ResponseEntity<T> getApiV1RatingaverageProductwithinfoForResponseEntity(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productIds' is set
        if (productIds == null) {
            throw new ApiException(400, "Missing the required parameter 'productIds' when calling getApiV1RatingaverageProductwithinfo");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/ratingaverage/productwithinfo";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "productIds", productIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a44982e9a7c61e149b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getRatingAverageWithProductInfo
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/productwithinfo
     * @param productIds productIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<RatingAverageWithProductInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b</a>
     */
    public <T> T getApiV1RatingaverageProductwithinfo(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1RatingaverageProductwithinfoForResponseEntity(productIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getRatingAverageWithProductInfo
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/productwithinfo
     * @param productIds productIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<RatingAverageWithProductInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b</a>
     */
    public List<RatingAverageWithProductInfoDto> getApiV1RatingaverageProductwithinfo(List<Long> productIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<RatingAverageWithProductInfoDto>> localVarReturnType = new ParameterizedTypeReference<List<RatingAverageWithProductInfoDto>>() {};
        return this.getApiV1RatingaverageProductwithinfo(productIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : getRatingAverageWithProductInfo
     * API : product_review GET /api/v1/ratingaverage/productwithinfo
     * Notes : 
     * @param productIds productIds(required)
     * @return List<RatingAverageWithProductInfoDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e149b</a>
     */
    public List<RatingAverageWithProductInfoDto> getApiV1RatingaverageProductwithinfo(List<Long> productIds) throws ApiException {
        return this.getApiV1RatingaverageProductwithinfo(productIds, null);
    }
    /**
     * Summary : getSimpleRatingAverage
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/simple
     * @param productIds  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0</a>
     */
    public <T> ResponseEntity<T> getApiV1RatingaverageSimpleForResponseEntity(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/ratingaverage/simple";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "productIds", productIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a44982e9a7c61e14a0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getSimpleRatingAverage
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/simple
     * @param productIds  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<SimpleRatingAverageDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0</a>
     */
    public <T> T getApiV1RatingaverageSimple(List<Long> productIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1RatingaverageSimpleForResponseEntity(productIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getSimpleRatingAverage
     * Notes : 
     * API : product_review GET /api/v1/ratingaverage/simple
     * @param productIds  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<SimpleRatingAverageDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0</a>
     */
    public List<SimpleRatingAverageDto> getApiV1RatingaverageSimple(List<Long> productIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<SimpleRatingAverageDto>> localVarReturnType = new ParameterizedTypeReference<List<SimpleRatingAverageDto>>() {};
        return this.getApiV1RatingaverageSimple(productIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : getSimpleRatingAverage
     * API : product_review GET /api/v1/ratingaverage/simple
     * Notes : 
     * @param productIds (optional)
     * @return List<SimpleRatingAverageDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a0</a>
     */
    public List<SimpleRatingAverageDto> getApiV1RatingaverageSimple(List<Long> productIds) throws ApiException {
        return this.getApiV1RatingaverageSimple(productIds, null);
    }
}
