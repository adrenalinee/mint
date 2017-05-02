package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.ReviewRecommendProductDto;

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
public class ProductreviewApiV1RecommendproductAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1RecommendproductAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getReviewRecommendItems
     * Notes : 
     * API : product_review GET /api/v1/recommendProduct/displayCategory/reviews
     * @param linkCode  (optional)
     * @param displayDevice  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5</a>
     */
    public <T> ResponseEntity<T> getApiV1RecommendProductDisplayCategoryReviewsForResponseEntity(String linkCode, String displayDevice, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/recommendProduct/displayCategory/reviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "linkCode", linkCode));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "displayDevice", displayDevice));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a44982e9a7c61e14a5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewRecommendItems
     * Notes : 
     * API : product_review GET /api/v1/recommendProduct/displayCategory/reviews
     * @param linkCode  (optional)
     * @param displayDevice  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ReviewRecommendProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5</a>
     */
    public <T> T getApiV1RecommendProductDisplayCategoryReviews(String linkCode, String displayDevice, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1RecommendProductDisplayCategoryReviewsForResponseEntity(linkCode, displayDevice, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewRecommendItems
     * Notes : 
     * API : product_review GET /api/v1/recommendProduct/displayCategory/reviews
     * @param linkCode  (optional)
     * @param displayDevice  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ReviewRecommendProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5</a>
     */
    public List<ReviewRecommendProductDto> getApiV1RecommendProductDisplayCategoryReviews(String linkCode, String displayDevice, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ReviewRecommendProductDto>> localVarReturnType = new ParameterizedTypeReference<List<ReviewRecommendProductDto>>() {};
        return this.getApiV1RecommendProductDisplayCategoryReviews(linkCode, displayDevice, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewRecommendItems
     * API : product_review GET /api/v1/recommendProduct/displayCategory/reviews
     * Notes : 
     * @param linkCode (optional)
     * @param displayDevice (optional)
     * @return List<ReviewRecommendProductDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e14a5</a>
     */
    public List<ReviewRecommendProductDto> getApiV1RecommendProductDisplayCategoryReviews(String linkCode, String displayDevice) throws ApiException {
        return this.getApiV1RecommendProductDisplayCategoryReviews(linkCode, displayDevice, null);
    }
}
