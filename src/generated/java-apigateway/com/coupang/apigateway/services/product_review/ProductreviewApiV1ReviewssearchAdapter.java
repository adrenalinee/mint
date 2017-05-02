package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.ReviewSmartFilterDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewListDto;

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
public class ProductreviewApiV1ReviewssearchAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1ReviewssearchAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getSmartfilters
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/smart-filters
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewsSearchSmartFiltersForResponseEntity(Long productId, String xUserAgent, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1ReviewsSearchSmartFilters");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1ReviewsSearchSmartFilters");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviews-search/smart-filters";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866051a3faf51e2d8fbd0a7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getSmartfilters
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/smart-filters
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<ReviewSmartFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7</a>
     */
    public <T> T getApiV1ReviewsSearchSmartFilters(Long productId, String xUserAgent, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewsSearchSmartFiltersForResponseEntity(productId, xUserAgent, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getSmartfilters
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/smart-filters
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<ReviewSmartFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7</a>
     */
    public List<ReviewSmartFilterDto> getApiV1ReviewsSearchSmartFilters(Long productId, String xUserAgent, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<ReviewSmartFilterDto>> localVarReturnType = new ParameterizedTypeReference<List<ReviewSmartFilterDto>>() {};
        return this.getApiV1ReviewsSearchSmartFilters(productId, xUserAgent, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getSmartfilters
     * API : product_review GET /api/v1/reviews-search/smart-filters
     * Notes : 
     * @param productId productId(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return List<ReviewSmartFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a7</a>
     */
    public List<ReviewSmartFilterDto> getApiV1ReviewsSearchSmartFilters(Long productId, String xUserAgent, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1ReviewsSearchSmartFilters(productId, xUserAgent, page, size, sort, null);
    }
    /**
     * Summary : getProductReviewListDto
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/summary-reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param direction  (optional)
     * @param q  (optional)
     * @param productId  (optional)
     * @param memberId  (optional)
     * @param reviewCategoryId  (optional)
     * @param targetType  (optional)
     * @param pageSize pageSize (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b">http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewsSearchSummaryReviewsForResponseEntity(String xUserAgent, String direction, String q, Long productId, Long memberId, Long reviewCategoryId, String targetType, Integer pageSize, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1ReviewsSearchSummaryReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviews-search/summary-reviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewCategoryId", reviewCategoryId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetType", targetType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f71dd7cf2a061c142b126b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductReviewListDto
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/summary-reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param direction  (optional)
     * @param q  (optional)
     * @param productId  (optional)
     * @param memberId  (optional)
     * @param reviewCategoryId  (optional)
     * @param targetType  (optional)
     * @param pageSize pageSize (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b">http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b</a>
     */
    public <T> T getApiV1ReviewsSearchSummaryReviews(String xUserAgent, String direction, String q, Long productId, Long memberId, Long reviewCategoryId, String targetType, Integer pageSize, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewsSearchSummaryReviewsForResponseEntity(xUserAgent, direction, q, productId, memberId, reviewCategoryId, targetType, pageSize, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductReviewListDto
     * Notes : 
     * API : product_review GET /api/v1/reviews-search/summary-reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param direction  (optional)
     * @param q  (optional)
     * @param productId  (optional)
     * @param memberId  (optional)
     * @param reviewCategoryId  (optional)
     * @param targetType  (optional)
     * @param pageSize pageSize (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b">http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b</a>
     */
    public ProductReviewListDto getApiV1ReviewsSearchSummaryReviews(String xUserAgent, String direction, String q, Long productId, Long memberId, Long reviewCategoryId, String targetType, Integer pageSize, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewListDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewListDto>() {};
        return this.getApiV1ReviewsSearchSummaryReviews(xUserAgent, direction, q, productId, memberId, reviewCategoryId, targetType, pageSize, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductReviewListDto
     * API : product_review GET /api/v1/reviews-search/summary-reviews
     * Notes : 
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param direction (optional)
     * @param q (optional)
     * @param productId (optional)
     * @param memberId (optional)
     * @param reviewCategoryId (optional)
     * @param targetType (optional)
     * @param pageSize pageSize(optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b">http://api-forge.coupang.net/details?specId=58f71dd7cf2a061c142b126b</a>
     */
    public ProductReviewListDto getApiV1ReviewsSearchSummaryReviews(String xUserAgent, String direction, String q, Long productId, Long memberId, Long reviewCategoryId, String targetType, Integer pageSize, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1ReviewsSearchSummaryReviews(xUserAgent, direction, q, productId, memberId, reviewCategoryId, targetType, pageSize, xMemberId, page, size, sort, null);
    }
}
