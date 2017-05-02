package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewDto;
import java.util.Date;
import com.coupang.apigateway.services.product_review.model.MyCoupangPropertyDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfWritableReviewDto;
import com.coupang.apigateway.services.product_review.model.WritableReviewDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewTemplateDto;
import com.coupang.apigateway.services.product_review.model.RequestResultOfProductReviewTemplateDto;
import com.coupang.apigateway.services.product_review.model.RatingSummaryTotalDto;
import com.coupang.apigateway.services.product_review.model.ReviewCategoryDto;
import com.coupang.apigateway.services.product_review.model.ReviewTemplateDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewListDto;
import com.coupang.apigateway.services.product_review.model.SurveySummaryDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewAddFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewGuideDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewContentsDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewModifyFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewHelpfulFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewHelpfulCountDto;
import com.coupang.apigateway.services.product_review.model.ReviewHelpfulDto;
import com.coupang.apigateway.services.product_review.model.ProductReviewVideoFormDto;

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
public class ProductreviewApiV1MobileAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1MobileAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getBestReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/bestreviews
     * @param targetDate (format: date-time)  (optional)
     * @param locale  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileBestreviewsForResponseEntity(String targetDate, String locale, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/bestreviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetDate", targetDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a34982e9a7c61e1388", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getBestReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/bestreviews
     * @param targetDate (format: date-time)  (optional)
     * @param locale  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388</a>
     */
    public <T> T getApiV1MobileBestreviews(String targetDate, String locale, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileBestreviewsForResponseEntity(targetDate, locale, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getBestReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/bestreviews
     * @param targetDate (format: date-time)  (optional)
     * @param locale  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileBestreviews(String targetDate, String locale, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewDto>() {};
        return this.getApiV1MobileBestreviews(targetDate, locale, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getBestReviews
     * API : product_review GET /api/v1/mobile/bestreviews
     * Notes : 
     * @param targetDate (format: date-time) (optional)
     * @param locale (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1388</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileBestreviews(String targetDate, String locale, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileBestreviews(targetDate, locale, xMemberId, page, size, sort, null);
    }
    /**
     * Summary : myReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileMycoupangReviewsForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileMycoupangReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/reviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd018", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : myReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018</a>
     */
    public <T> T getApiV1MobileMycoupangReviews(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileMycoupangReviewsForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : myReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileMycoupangReviews(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewDto>() {};
        return this.getApiV1MobileMycoupangReviews(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : myReviewList
     * API : product_review GET /api/v1/mobile/mycoupang/reviews
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd018</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileMycoupangReviews(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileMycoupangReviews(xMemberId, page, size, sort, null);
    }
    /**
     * Summary : getVisited
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileMycoupangReviewsVisitedForResponseEntity(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileMycoupangReviewsVisited");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/reviews/visited";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd01d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getVisited
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d</a>
     */
    public <T> T getApiV1MobileMycoupangReviewsVisited(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileMycoupangReviewsVisitedForResponseEntity(xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getVisited
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d</a>
     */
    public MyCoupangPropertyDto getApiV1MobileMycoupangReviewsVisited(String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MyCoupangPropertyDto> localVarReturnType = new ParameterizedTypeReference<MyCoupangPropertyDto>() {};
        return this.getApiV1MobileMycoupangReviewsVisited(xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getVisited
     * API : product_review GET /api/v1/mobile/mycoupang/reviews/visited
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd01d</a>
     */
    public MyCoupangPropertyDto getApiV1MobileMycoupangReviewsVisited(String xMemberId) throws ApiException {
        return this.getApiV1MobileMycoupangReviewsVisited(xMemberId, null);
    }
    /**
     * Summary : setVisited
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileMycoupangReviewsVisitedForResponseEntity(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileMycoupangReviewsVisited");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/reviews/visited";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd022", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : setVisited
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022</a>
     */
    public <T> T postApiV1MobileMycoupangReviewsVisited(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileMycoupangReviewsVisitedForResponseEntity(xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : setVisited
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/reviews/visited
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022</a>
     */
    public MyCoupangPropertyDto postApiV1MobileMycoupangReviewsVisited(String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MyCoupangPropertyDto> localVarReturnType = new ParameterizedTypeReference<MyCoupangPropertyDto>() {};
        return this.postApiV1MobileMycoupangReviewsVisited(xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : setVisited
     * API : product_review POST /api/v1/mobile/mycoupang/reviews/visited
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return MyCoupangPropertyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd022</a>
     */
    public MyCoupangPropertyDto postApiV1MobileMycoupangReviewsVisited(String xMemberId) throws ApiException {
        return this.postApiV1MobileMycoupangReviewsVisited(xMemberId, null);
    }
    /**
     * Summary : writeEnableReviewOrderListWithCondition
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableEnableReviews/condition
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param orderId  (optional)
     * @param vendorItemId  (optional)
     * @param productId  (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileMycoupangWritableEnableReviewsConditionForResponseEntity(String xMemberId, Long orderId, Long vendorItemId, Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileMycoupangWritableEnableReviewsCondition");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/writableEnableReviews/condition";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorItemId", vendorItemId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd02c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : writeEnableReviewOrderListWithCondition
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableEnableReviews/condition
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param orderId  (optional)
     * @param vendorItemId  (optional)
     * @param productId  (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c</a>
     */
    public <T> T getApiV1MobileMycoupangWritableEnableReviewsCondition(String xMemberId, Long orderId, Long vendorItemId, Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileMycoupangWritableEnableReviewsConditionForResponseEntity(xMemberId, orderId, vendorItemId, productId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : writeEnableReviewOrderListWithCondition
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableEnableReviews/condition
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param orderId  (optional)
     * @param vendorItemId  (optional)
     * @param productId  (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWritableEnableReviewsCondition(String xMemberId, Long orderId, Long vendorItemId, Long productId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfWritableReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfWritableReviewDto>() {};
        return this.getApiV1MobileMycoupangWritableEnableReviewsCondition(xMemberId, orderId, vendorItemId, productId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : writeEnableReviewOrderListWithCondition
     * API : product_review GET /api/v1/mobile/mycoupang/writableEnableReviews/condition
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param orderId (optional)
     * @param vendorItemId (optional)
     * @param productId (optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd02c</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWritableEnableReviewsCondition(String xMemberId, Long orderId, Long vendorItemId, Long productId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileMycoupangWritableEnableReviewsCondition(xMemberId, orderId, vendorItemId, productId, page, size, sort, null);
    }
    /**
     * Summary : setWritableLaterReview
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/writableLaterReview/{completedOrderVendorItemId}
     * @param completedOrderVendorItemId completedOrderVendorItemId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemIdForResponseEntity(Long completedOrderVendorItemId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'completedOrderVendorItemId' is set
        if (completedOrderVendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'completedOrderVendorItemId' when calling postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/writableLaterReview/{completedOrderVendorItemId}"
            .replaceAll("\\{" + "completedOrderVendorItemId" + "\\}", completedOrderVendorItemId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd036", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : setWritableLaterReview
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/writableLaterReview/{completedOrderVendorItemId}
     * @param completedOrderVendorItemId completedOrderVendorItemId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036</a>
     */
    public <T> T postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId(Long completedOrderVendorItemId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemIdForResponseEntity(completedOrderVendorItemId, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : setWritableLaterReview
     * Notes : 
     * API : product_review POST /api/v1/mobile/mycoupang/writableLaterReview/{completedOrderVendorItemId}
     * @param completedOrderVendorItemId completedOrderVendorItemId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036</a>
     */
    public WritableReviewDto postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId(Long completedOrderVendorItemId, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WritableReviewDto> localVarReturnType = new ParameterizedTypeReference<WritableReviewDto>() {};
        return this.postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId(completedOrderVendorItemId, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : setWritableLaterReview
     * API : product_review POST /api/v1/mobile/mycoupang/writableLaterReview/{completedOrderVendorItemId}
     * Notes : 
     * @param completedOrderVendorItemId completedOrderVendorItemId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return WritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd036</a>
     */
    public WritableReviewDto postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId(Long completedOrderVendorItemId, String xMemberId) throws ApiException {
        return this.postApiV1MobileMycoupangWritableLaterReviewCompletedOrderVendorItemId(completedOrderVendorItemId, xMemberId, null);
    }
    /**
     * Summary : writableLaterReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableLaterReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileMycoupangWritableLaterReviewsForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileMycoupangWritableLaterReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/writableLaterReviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd03b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : writableLaterReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableLaterReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b</a>
     */
    public <T> T getApiV1MobileMycoupangWritableLaterReviews(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileMycoupangWritableLaterReviewsForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : writableLaterReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writableLaterReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWritableLaterReviews(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfWritableReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfWritableReviewDto>() {};
        return this.getApiV1MobileMycoupangWritableLaterReviews(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : writableLaterReviews
     * API : product_review GET /api/v1/mobile/mycoupang/writableLaterReviews
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd03b</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWritableLaterReviews(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileMycoupangWritableLaterReviews(xMemberId, page, size, sort, null);
    }
    /**
     * Summary : writeEnableReviewOrderList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writeEnableReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644">http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileMycoupangWriteEnableReviewsForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileMycoupangWriteEnableReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/mycoupang/writeEnableReviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f9d5555e9588056d82f644", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : writeEnableReviewOrderList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writeEnableReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644">http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644</a>
     */
    public <T> T getApiV1MobileMycoupangWriteEnableReviews(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileMycoupangWriteEnableReviewsForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : writeEnableReviewOrderList
     * Notes : 
     * API : product_review GET /api/v1/mobile/mycoupang/writeEnableReviews
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644">http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWriteEnableReviews(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfWritableReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfWritableReviewDto>() {};
        return this.getApiV1MobileMycoupangWriteEnableReviews(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : writeEnableReviewOrderList
     * API : product_review GET /api/v1/mobile/mycoupang/writeEnableReviews
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfWritableReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644">http://api-forge.coupang.net/details?specId=58f9d5555e9588056d82f644</a>
     */
    public PagedResourcesOfWritableReviewDto getApiV1MobileMycoupangWriteEnableReviews(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileMycoupangWriteEnableReviews(xMemberId, page, size, sort, null);
    }
    /**
     * Summary : getProductReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdProductReviewTemplateForResponseEntity(Long productId, String userAgentType, String locale, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdProductReviewTemplate");
        }
        
        // verify the required parameter 'userAgentType' is set
        if (userAgentType == null) {
            throw new ApiException(400, "Missing the required parameter 'userAgentType' when calling getApiV1MobileProductsProductIdProductReviewTemplate");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException(400, "Missing the required parameter 'locale' when calling getApiV1MobileProductsProductIdProductReviewTemplate");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileProductsProductIdProductReviewTemplate");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/productReviewTemplate"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userAgentType", userAgentType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd04a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a</a>
     */
    public <T> T getApiV1MobileProductsProductIdProductReviewTemplate(Long productId, String userAgentType, String locale, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdProductReviewTemplateForResponseEntity(productId, userAgentType, locale, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a</a>
     */
    public ProductReviewTemplateDto getApiV1MobileProductsProductIdProductReviewTemplate(Long productId, String userAgentType, String locale, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewTemplateDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewTemplateDto>() {};
        return this.getApiV1MobileProductsProductIdProductReviewTemplate(productId, userAgentType, locale, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductReviewTemplate
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplate
     * Notes : 
     * @param productId productId(required)
     * @param userAgentType userAgentType(required)
     * @param locale locale(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return ProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04a</a>
     */
    public ProductReviewTemplateDto getApiV1MobileProductsProductIdProductReviewTemplate(Long productId, String userAgentType, String locale, String xMemberId) throws ApiException {
        return this.getApiV1MobileProductsProductIdProductReviewTemplate(productId, userAgentType, locale, xMemberId, null);
    }
    /**
     * Summary : getProductReviewTemplateResult
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplateResult
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdProductReviewTemplateResultForResponseEntity(Long productId, String userAgentType, String locale, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdProductReviewTemplateResult");
        }
        
        // verify the required parameter 'userAgentType' is set
        if (userAgentType == null) {
            throw new ApiException(400, "Missing the required parameter 'userAgentType' when calling getApiV1MobileProductsProductIdProductReviewTemplateResult");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException(400, "Missing the required parameter 'locale' when calling getApiV1MobileProductsProductIdProductReviewTemplateResult");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MobileProductsProductIdProductReviewTemplateResult");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/productReviewTemplateResult"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userAgentType", userAgentType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866006d3faf51e2d8fbd04f", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getProductReviewTemplateResult
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplateResult
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return RequestResultOfProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f</a>
     */
    public <T> T getApiV1MobileProductsProductIdProductReviewTemplateResult(Long productId, String userAgentType, String locale, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdProductReviewTemplateResultForResponseEntity(productId, userAgentType, locale, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getProductReviewTemplateResult
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplateResult
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return RequestResultOfProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f</a>
     */
    public RequestResultOfProductReviewTemplateDto getApiV1MobileProductsProductIdProductReviewTemplateResult(Long productId, String userAgentType, String locale, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<RequestResultOfProductReviewTemplateDto> localVarReturnType = new ParameterizedTypeReference<RequestResultOfProductReviewTemplateDto>() {};
        return this.getApiV1MobileProductsProductIdProductReviewTemplateResult(productId, userAgentType, locale, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getProductReviewTemplateResult
     * API : product_review GET /api/v1/mobile/products/{productId}/productReviewTemplateResult
     * Notes : 
     * @param productId productId(required)
     * @param userAgentType userAgentType(required)
     * @param locale locale(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return RequestResultOfProductReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f">http://api-forge.coupang.net/details?specId=5866006d3faf51e2d8fbd04f</a>
     */
    public RequestResultOfProductReviewTemplateDto getApiV1MobileProductsProductIdProductReviewTemplateResult(Long productId, String userAgentType, String locale, String xMemberId) throws ApiException {
        return this.getApiV1MobileProductsProductIdProductReviewTemplateResult(productId, userAgentType, locale, xMemberId, null);
    }
    /**
     * Summary : getRatingSummaries
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/ratingSummary
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdRatingSummaryForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdRatingSummary");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/ratingSummary"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a34982e9a7c61e13fb", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getRatingSummaries
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/ratingSummary
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return RatingSummaryTotalDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb</a>
     */
    public <T> T getApiV1MobileProductsProductIdRatingSummary(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdRatingSummaryForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getRatingSummaries
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/ratingSummary
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return RatingSummaryTotalDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb</a>
     */
    public RatingSummaryTotalDto getApiV1MobileProductsProductIdRatingSummary(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<RatingSummaryTotalDto> localVarReturnType = new ParameterizedTypeReference<RatingSummaryTotalDto>() {};
        return this.getApiV1MobileProductsProductIdRatingSummary(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getRatingSummaries
     * API : product_review GET /api/v1/mobile/products/{productId}/ratingSummary
     * Notes : 
     * @param productId productId(required)
     * @return RatingSummaryTotalDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e13fb</a>
     */
    public RatingSummaryTotalDto getApiV1MobileProductsProductIdRatingSummary(Long productId) throws ApiException {
        return this.getApiV1MobileProductsProductIdRatingSummary(productId, null);
    }
    /**
     * Summary : getReviewCategory
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewCategory
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratingSummary ratingSummary (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdReviewCategoryForResponseEntity(Long productId, String xUserAgent, Boolean ratingSummary, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdReviewCategory");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileProductsProductIdReviewCategory");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/reviewCategory"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ratingSummary", ratingSummary));
        if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866015dc131e1a998554837", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewCategory
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewCategory
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratingSummary ratingSummary (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewCategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837</a>
     */
    public <T> T getApiV1MobileProductsProductIdReviewCategory(Long productId, String xUserAgent, Boolean ratingSummary, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdReviewCategoryForResponseEntity(productId, xUserAgent, ratingSummary, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewCategory
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewCategory
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratingSummary ratingSummary (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewCategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837</a>
     */
    public ReviewCategoryDto getApiV1MobileProductsProductIdReviewCategory(Long productId, String xUserAgent, Boolean ratingSummary, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewCategoryDto> localVarReturnType = new ParameterizedTypeReference<ReviewCategoryDto>() {};
        return this.getApiV1MobileProductsProductIdReviewCategory(productId, xUserAgent, ratingSummary, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewCategory
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewCategory
     * Notes : 
     * @param productId productId(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param ratingSummary ratingSummary(optional)
     * @return ReviewCategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554837</a>
     */
    public ReviewCategoryDto getApiV1MobileProductsProductIdReviewCategory(Long productId, String xUserAgent, Boolean ratingSummary) throws ApiException {
        return this.getApiV1MobileProductsProductIdReviewCategory(productId, xUserAgent, ratingSummary, null);
    }
    /**
     * Summary : getReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdReviewTemplateForResponseEntity(Long productId, String userAgentType, String locale, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdReviewTemplate");
        }
        
        // verify the required parameter 'userAgentType' is set
        if (userAgentType == null) {
            throw new ApiException(400, "Missing the required parameter 'userAgentType' when calling getApiV1MobileProductsProductIdReviewTemplate");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException(400, "Missing the required parameter 'locale' when calling getApiV1MobileProductsProductIdReviewTemplate");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/reviewTemplate"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userAgentType", userAgentType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a34982e9a7c61e1405", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405</a>
     */
    public <T> T getApiV1MobileProductsProductIdReviewTemplate(Long productId, String userAgentType, String locale, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdReviewTemplateForResponseEntity(productId, userAgentType, locale, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewTemplate
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewTemplate
     * @param productId productId (required)
     * @param userAgentType userAgentType (required)
     * @param locale locale (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405</a>
     */
    public ReviewTemplateDto getApiV1MobileProductsProductIdReviewTemplate(Long productId, String userAgentType, String locale, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewTemplateDto> localVarReturnType = new ParameterizedTypeReference<ReviewTemplateDto>() {};
        return this.getApiV1MobileProductsProductIdReviewTemplate(productId, userAgentType, locale, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewTemplate
     * API : product_review GET /api/v1/mobile/products/{productId}/reviewTemplate
     * Notes : 
     * @param productId productId(required)
     * @param userAgentType userAgentType(required)
     * @param locale locale(required)
     * @return ReviewTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405">http://api-forge.coupang.net/details?specId=580dd2a34982e9a7c61e1405</a>
     */
    public ReviewTemplateDto getApiV1MobileProductsProductIdReviewTemplate(Long productId, String userAgentType, String locale) throws ApiException {
        return this.getApiV1MobileProductsProductIdReviewTemplate(productId, userAgentType, locale, null);
    }
    /**
     * Summary : getReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviews
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdReviewsForResponseEntity(Long productId, String xUserAgent, List<Integer> ratings, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdReviews");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileProductsProductIdReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/reviews"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ratings", ratings));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorId", vendorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rating", rating));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ratingSummary", ratingSummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "surveySummary", surveySummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adult", adult));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adventurerReview", adventurerReview));
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

        return apiClient.invokeAPIForResponseEntity("5866015dc131e1a99855483c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviews
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c</a>
     */
    public <T> T getApiV1MobileProductsProductIdReviews(Long productId, String xUserAgent, List<Integer> ratings, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdReviewsForResponseEntity(productId, xUserAgent, ratings, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewList
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/reviews
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c</a>
     */
    public ProductReviewListDto getApiV1MobileProductsProductIdReviews(Long productId, String xUserAgent, List<Integer> ratings, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewListDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewListDto>() {};
        return this.getApiV1MobileProductsProductIdReviews(productId, xUserAgent, ratings, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewList
     * API : product_review GET /api/v1/mobile/products/{productId}/reviews
     * Notes : 
     * @param productId productId(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param ratings (optional)
     * @param vendorId (optional)
     * @param locale (optional)
     * @param rating (optional)
     * @param sortBy (optional)
     * @param ratingSummary (optional)
     * @param surveySummary (optional)
     * @param adult (optional)
     * @param adventurerReview (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return ProductReviewListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855483c</a>
     */
    public ProductReviewListDto getApiV1MobileProductsProductIdReviews(Long productId, String xUserAgent, List<Integer> ratings, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileProductsProductIdReviews(productId, xUserAgent, ratings, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, null);
    }
    /**
     * Summary : getSurveySummary
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/surveySummary
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileProductsProductIdSurveySummaryForResponseEntity(Long productId, String xUserAgent, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1MobileProductsProductIdSurveySummary");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileProductsProductIdSurveySummary");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/products/{productId}/surveySummary"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866015dc131e1a998554846", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getSurveySummary
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/surveySummary
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SurveySummaryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846</a>
     */
    public <T> T getApiV1MobileProductsProductIdSurveySummary(Long productId, String xUserAgent, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileProductsProductIdSurveySummaryForResponseEntity(productId, xUserAgent, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getSurveySummary
     * Notes : 
     * API : product_review GET /api/v1/mobile/products/{productId}/surveySummary
     * @param productId productId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SurveySummaryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846</a>
     */
    public SurveySummaryDto getApiV1MobileProductsProductIdSurveySummary(Long productId, String xUserAgent, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SurveySummaryDto> localVarReturnType = new ParameterizedTypeReference<SurveySummaryDto>() {};
        return this.getApiV1MobileProductsProductIdSurveySummary(productId, xUserAgent, localVarReturnType, customHeader);
    }

    /**
     * Summary : getSurveySummary
     * API : product_review GET /api/v1/mobile/products/{productId}/surveySummary
     * Notes : 
     * @param productId productId(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @return SurveySummaryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846">http://api-forge.coupang.net/details?specId=5866015dc131e1a998554846</a>
     */
    public SurveySummaryDto getApiV1MobileProductsProductIdSurveySummary(Long productId, String xUserAgent) throws ApiException {
        return this.getApiV1MobileProductsProductIdSurveySummary(productId, xUserAgent, null);
    }
    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileReviewsForResponseEntity(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ratings", ratings));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorId", vendorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rating", rating));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ratingSummary", ratingSummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "surveySummary", surveySummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adult", adult));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adventurerReview", adventurerReview));
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

        return apiClient.invokeAPIForResponseEntity("5866015dc131e1a99855484b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b</a>
     */
    public <T> T getApiV1MobileReviews(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileReviewsForResponseEntity(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileReviews(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewDto>() {};
        return this.getApiV1MobileReviews(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviews
     * API : product_review GET /api/v1/mobile/reviews
     * Notes : 
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param ratings (optional)
     * @param productId (optional)
     * @param vendorId (optional)
     * @param locale (optional)
     * @param rating (optional)
     * @param sortBy (optional)
     * @param ratingSummary (optional)
     * @param surveySummary (optional)
     * @param adult (optional)
     * @param adventurerReview (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b">http://api-forge.coupang.net/details?specId=5866015dc131e1a99855484b</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1MobileReviews(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileReviews(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, null);
    }
    /**
     * Summary : addCompletedOrderOnly
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/completedOrderOnly
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a">http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsCompletedOrderOnlyForResponseEntity(ProductReviewAddFormDto reviewFormDto, String xMemberId, String xMemberType, String xMemberPcid, String xMemberIp, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = reviewFormDto;
        
        // verify the required parameter 'reviewFormDto' is set
        if (reviewFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewFormDto' when calling postApiV1MobileReviewsCompletedOrderOnly");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileReviewsCompletedOrderOnly");
        }
        
        // verify the required parameter 'xMemberType' is set
        if (xMemberType == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberType' when calling postApiV1MobileReviewsCompletedOrderOnly");
        }
        
        // verify the required parameter 'xMemberPcid' is set
        if (xMemberPcid == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberPcid' when calling postApiV1MobileReviewsCompletedOrderOnly");
        }
        
        // verify the required parameter 'xMemberIp' is set
        if (xMemberIp == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberIp' when calling postApiV1MobileReviewsCompletedOrderOnly");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/completedOrderOnly";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }if (xMemberPcid != null) {
          localVarHeaderParams.put("X-MemberPcid", apiClient.parameterToString(xMemberPcid));
        }if (xMemberIp != null) {
          localVarHeaderParams.put("X-MemberIp", apiClient.parameterToString(xMemberIp));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5866015ec131e1a99855485a", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : addCompletedOrderOnly
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/completedOrderOnly
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a">http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a</a>
     */
    public <T> T postApiV1MobileReviewsCompletedOrderOnly(ProductReviewAddFormDto reviewFormDto, String xMemberId, String xMemberType, String xMemberPcid, String xMemberIp, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsCompletedOrderOnlyForResponseEntity(reviewFormDto, xMemberId, xMemberType, xMemberPcid, xMemberIp, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : addCompletedOrderOnly
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/completedOrderOnly
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a">http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a</a>
     */
    public ProductReviewDto postApiV1MobileReviewsCompletedOrderOnly(ProductReviewAddFormDto reviewFormDto, String xMemberId, String xMemberType, String xMemberPcid, String xMemberIp, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewDto>() {};
        return this.postApiV1MobileReviewsCompletedOrderOnly(reviewFormDto, xMemberId, xMemberType, xMemberPcid, xMemberIp, localVarReturnType, customHeader);
    }

    /**
     * Summary : addCompletedOrderOnly
     * API : product_review POST /api/v1/mobile/reviews/completedOrderOnly
     * Notes : 
     * @param reviewFormDto reviewFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(required)
     * @param xMemberPcid PCID(required)
     * @param xMemberIp IP(required)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a">http://api-forge.coupang.net/details?specId=5866015ec131e1a99855485a</a>
     */
    public ProductReviewDto postApiV1MobileReviewsCompletedOrderOnly(ProductReviewAddFormDto reviewFormDto, String xMemberId, String xMemberType, String xMemberPcid, String xMemberIp) throws ApiException {
        return this.postApiV1MobileReviewsCompletedOrderOnly(reviewFormDto, xMemberId, xMemberType, xMemberPcid, xMemberIp, null);
    }
    /**
     * Summary : guideLine
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/guideLine
     * @param reviewFormDto reviewFormDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsGuideLineForResponseEntity(ProductReviewAddFormDto reviewFormDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = reviewFormDto;
        
        // verify the required parameter 'reviewFormDto' is set
        if (reviewFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewFormDto' when calling postApiV1MobileReviewsGuideLine");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/guideLine";

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

        return apiClient.invokeAPIForResponseEntity("580dd2a44982e9a7c61e142d", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : guideLine
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/guideLine
     * @param reviewFormDto reviewFormDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewGuideDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d</a>
     */
    public <T> T postApiV1MobileReviewsGuideLine(ProductReviewAddFormDto reviewFormDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsGuideLineForResponseEntity(reviewFormDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : guideLine
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/guideLine
     * @param reviewFormDto reviewFormDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewGuideDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d</a>
     */
    public ReviewGuideDto postApiV1MobileReviewsGuideLine(ProductReviewAddFormDto reviewFormDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewGuideDto> localVarReturnType = new ParameterizedTypeReference<ReviewGuideDto>() {};
        return this.postApiV1MobileReviewsGuideLine(reviewFormDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : guideLine
     * API : product_review POST /api/v1/mobile/reviews/guideLine
     * Notes : 
     * @param reviewFormDto reviewFormDto(required)
     * @return ReviewGuideDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e142d</a>
     */
    public ReviewGuideDto postApiV1MobileReviewsGuideLine(ProductReviewAddFormDto reviewFormDto) throws ApiException {
        return this.postApiV1MobileReviewsGuideLine(reviewFormDto, null);
    }
    /**
     * Summary : getReviewsWithoutComments
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/withoutComments
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileReviewsWithoutCommentsForResponseEntity(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileReviewsWithoutComments");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/withoutComments";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ratings", ratings));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vendorId", vendorId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "rating", rating));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ratingSummary", ratingSummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "surveySummary", surveySummary));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adult", adult));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adventurerReview", adventurerReview));
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

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c4178", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewsWithoutComments
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/withoutComments
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178</a>
     */
    public <T> T getApiV1MobileReviewsWithoutComments(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileReviewsWithoutCommentsForResponseEntity(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewsWithoutComments
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/withoutComments
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param ratings  (optional)
     * @param productId  (optional)
     * @param vendorId  (optional)
     * @param locale  (optional)
     * @param rating  (optional)
     * @param sortBy  (optional)
     * @param ratingSummary  (optional)
     * @param surveySummary  (optional)
     * @param adult  (optional)
     * @param adventurerReview  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1MobileReviewsWithoutComments(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto>() {};
        return this.getApiV1MobileReviewsWithoutComments(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewsWithoutComments
     * API : product_review GET /api/v1/mobile/reviews/withoutComments
     * Notes : 
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param ratings (optional)
     * @param productId (optional)
     * @param vendorId (optional)
     * @param locale (optional)
     * @param rating (optional)
     * @param sortBy (optional)
     * @param ratingSummary (optional)
     * @param surveySummary (optional)
     * @param adult (optional)
     * @param adventurerReview (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4178</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1MobileReviewsWithoutComments(String xUserAgent, List<Integer> ratings, Long productId, String vendorId, String locale, Integer rating, String sortBy, Boolean ratingSummary, Boolean surveySummary, Boolean adult, Boolean adventurerReview, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MobileReviewsWithoutComments(xUserAgent, ratings, productId, vendorId, locale, rating, sortBy, ratingSummary, surveySummary, adult, adventurerReview, xMemberId, page, size, sort, null);
    }
    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d">http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileReviewsReviewIdForResponseEntity(Long reviewId, String xUserAgent, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling getApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling getApiV1MobileReviewsReviewId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c417d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d">http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d</a>
     */
    public <T> T getApiV1MobileReviewsReviewId(Long reviewId, String xUserAgent, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileReviewsReviewIdForResponseEntity(reviewId, xUserAgent, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d">http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d</a>
     */
    public ProductReviewDto getApiV1MobileReviewsReviewId(Long reviewId, String xUserAgent, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewDto>() {};
        return this.getApiV1MobileReviewsReviewId(reviewId, xUserAgent, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : get
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}
     * Notes : 
     * @param reviewId reviewId(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d">http://api-forge.coupang.net/details?specId=586603a25594daa0989c417d</a>
     */
    public ProductReviewDto getApiV1MobileReviewsReviewId(Long reviewId, String xUserAgent, String xMemberId) throws ApiException {
        return this.getApiV1MobileReviewsReviewId(reviewId, xUserAgent, xMemberId, null);
    }
    /**
     * Summary : modify
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsReviewIdForResponseEntity(Long reviewId, ProductReviewModifyFormDto reviewFormDto, String xMemberId, String xMemberPcid, String xMemberIp, String xUserAgent, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = reviewFormDto;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling postApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'reviewFormDto' is set
        if (reviewFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewFormDto' when calling postApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xMemberPcid' is set
        if (xMemberPcid == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberPcid' when calling postApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xMemberIp' is set
        if (xMemberIp == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberIp' when calling postApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling postApiV1MobileReviewsReviewId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xMemberPcid != null) {
          localVarHeaderParams.put("X-MemberPcid", apiClient.parameterToString(xMemberPcid));
        }if (xMemberIp != null) {
          localVarHeaderParams.put("X-MemberIp", apiClient.parameterToString(xMemberIp));
        }if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c4182", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : modify
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182</a>
     */
    public <T> T postApiV1MobileReviewsReviewId(Long reviewId, ProductReviewModifyFormDto reviewFormDto, String xMemberId, String xMemberPcid, String xMemberIp, String xUserAgent, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsReviewIdForResponseEntity(reviewId, reviewFormDto, xMemberId, xMemberPcid, xMemberIp, xUserAgent, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : modify
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param reviewFormDto reviewFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberPcid PCID (required)
     * @param xMemberIp IP (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182</a>
     */
    public ProductReviewDto postApiV1MobileReviewsReviewId(Long reviewId, ProductReviewModifyFormDto reviewFormDto, String xMemberId, String xMemberPcid, String xMemberIp, String xUserAgent, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewDto>() {};
        return this.postApiV1MobileReviewsReviewId(reviewId, reviewFormDto, xMemberId, xMemberPcid, xMemberIp, xUserAgent, localVarReturnType, customHeader);
    }

    /**
     * Summary : modify
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}
     * Notes : 
     * @param reviewId reviewId(required)
     * @param reviewFormDto reviewFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param xMemberPcid PCID(required)
     * @param xMemberIp IP(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4182</a>
     */
    public ProductReviewDto postApiV1MobileReviewsReviewId(Long reviewId, ProductReviewModifyFormDto reviewFormDto, String xMemberId, String xMemberPcid, String xMemberIp, String xUserAgent) throws ApiException {
        return this.postApiV1MobileReviewsReviewId(reviewId, reviewFormDto, xMemberId, xMemberPcid, xMemberIp, xUserAgent, null);
    }
    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187</a>
     */
    public <T> ResponseEntity<T> deleteApiV1MobileReviewsReviewIdForResponseEntity(Long reviewId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling deleteApiV1MobileReviewsReviewId");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling deleteApiV1MobileReviewsReviewId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c4187", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187</a>
     */
    public <T> T deleteApiV1MobileReviewsReviewId(Long reviewId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.deleteApiV1MobileReviewsReviewIdForResponseEntity(reviewId, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187</a>
     */
    public void deleteApiV1MobileReviewsReviewId(Long reviewId, String xMemberId, Map<String, String> customHeader) throws ApiException {
        
        this.deleteApiV1MobileReviewsReviewId(reviewId, xMemberId, null, customHeader);
    }

    /**
     * Summary : delete
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}
     * Notes : 
     * @param reviewId reviewId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4187</a>
     */
    public void deleteApiV1MobileReviewsReviewId(Long reviewId, String xMemberId) throws ApiException {
        this.deleteApiV1MobileReviewsReviewId(reviewId, xMemberId, null);
    }
    /**
     * Summary : add
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsReviewIdHelpfulForResponseEntity(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = reviewHelpfulFormDto;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling postApiV1MobileReviewsReviewIdHelpful");
        }
        
        // verify the required parameter 'reviewHelpfulFormDto' is set
        if (reviewHelpfulFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewHelpfulFormDto' when calling postApiV1MobileReviewsReviewIdHelpful");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileReviewsReviewIdHelpful");
        }
        
        // verify the required parameter 'xMemberType' is set
        if (xMemberType == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberType' when calling postApiV1MobileReviewsReviewIdHelpful");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}/helpful"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c4194", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : add
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194</a>
     */
    public <T> T postApiV1MobileReviewsReviewIdHelpful(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsReviewIdHelpfulForResponseEntity(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : add
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194</a>
     */
    public void postApiV1MobileReviewsReviewIdHelpful(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, Map<String, String> customHeader) throws ApiException {
        
        this.postApiV1MobileReviewsReviewIdHelpful(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, null, customHeader);
    }

    /**
     * Summary : add
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful
     * Notes : 
     * @param reviewId reviewId(required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(required)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4194</a>
     */
    public void postApiV1MobileReviewsReviewIdHelpful(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType) throws ApiException {
        this.postApiV1MobileReviewsReviewIdHelpful(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, null);
    }
    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199</a>
     */
    public <T> ResponseEntity<T> deleteApiV1MobileReviewsReviewIdHelpfulForResponseEntity(Long reviewId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling deleteApiV1MobileReviewsReviewIdHelpful");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling deleteApiV1MobileReviewsReviewIdHelpful");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}/helpful"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c4199", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199</a>
     */
    public <T> T deleteApiV1MobileReviewsReviewIdHelpful(Long reviewId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.deleteApiV1MobileReviewsReviewIdHelpfulForResponseEntity(reviewId, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : delete
     * Notes : 
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}/helpful
     * @param reviewId reviewId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199</a>
     */
    public void deleteApiV1MobileReviewsReviewIdHelpful(Long reviewId, String xMemberId, Map<String, String> customHeader) throws ApiException {
        
        this.deleteApiV1MobileReviewsReviewIdHelpful(reviewId, xMemberId, null, customHeader);
    }

    /**
     * Summary : delete
     * API : product_review DELETE /api/v1/mobile/reviews/{reviewId}/helpful
     * Notes : 
     * @param reviewId reviewId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199">http://api-forge.coupang.net/details?specId=586603a25594daa0989c4199</a>
     */
    public void deleteApiV1MobileReviewsReviewIdHelpful(Long reviewId, String xMemberId) throws ApiException {
        this.deleteApiV1MobileReviewsReviewIdHelpful(reviewId, xMemberId, null);
    }
    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}/helpful/count
     * @param reviewId reviewId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a</a>
     */
    public <T> ResponseEntity<T> getApiV1MobileReviewsReviewIdHelpfulCountForResponseEntity(Long reviewId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling getApiV1MobileReviewsReviewIdHelpfulCount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}/helpful/count"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a44982e9a7c61e145a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}/helpful/count
     * @param reviewId reviewId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHelpfulCountDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a</a>
     */
    public <T> T getApiV1MobileReviewsReviewIdHelpfulCount(Long reviewId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MobileReviewsReviewIdHelpfulCountForResponseEntity(reviewId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}/helpful/count
     * @param reviewId reviewId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHelpfulCountDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a</a>
     */
    public ReviewHelpfulCountDto getApiV1MobileReviewsReviewIdHelpfulCount(Long reviewId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewHelpfulCountDto> localVarReturnType = new ParameterizedTypeReference<ReviewHelpfulCountDto>() {};
        return this.getApiV1MobileReviewsReviewIdHelpfulCount(reviewId, localVarReturnType, customHeader);
    }

    /**
     * Summary : count
     * API : product_review GET /api/v1/mobile/reviews/{reviewId}/helpful/count
     * Notes : 
     * @param reviewId reviewId(required)
     * @return ReviewHelpfulCountDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a">http://api-forge.coupang.net/details?specId=580dd2a44982e9a7c61e145a</a>
     */
    public ReviewHelpfulCountDto getApiV1MobileReviewsReviewIdHelpfulCount(Long reviewId) throws ApiException {
        return this.getApiV1MobileReviewsReviewIdHelpfulCount(reviewId, null);
    }
    /**
     * Summary : addReturnDto
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful/returnDto
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e">http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsReviewIdHelpfulReturnDtoForResponseEntity(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = reviewHelpfulFormDto;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling postApiV1MobileReviewsReviewIdHelpfulReturnDto");
        }
        
        // verify the required parameter 'reviewHelpfulFormDto' is set
        if (reviewHelpfulFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewHelpfulFormDto' when calling postApiV1MobileReviewsReviewIdHelpfulReturnDto");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileReviewsReviewIdHelpfulReturnDto");
        }
        
        // verify the required parameter 'xMemberType' is set
        if (xMemberType == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberType' when calling postApiV1MobileReviewsReviewIdHelpfulReturnDto");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}/helpful/returnDto"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c419e", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : addReturnDto
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful/returnDto
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHelpfulDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e">http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e</a>
     */
    public <T> T postApiV1MobileReviewsReviewIdHelpfulReturnDto(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsReviewIdHelpfulReturnDtoForResponseEntity(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : addReturnDto
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful/returnDto
     * @param reviewId reviewId (required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHelpfulDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e">http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e</a>
     */
    public ReviewHelpfulDto postApiV1MobileReviewsReviewIdHelpfulReturnDto(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewHelpfulDto> localVarReturnType = new ParameterizedTypeReference<ReviewHelpfulDto>() {};
        return this.postApiV1MobileReviewsReviewIdHelpfulReturnDto(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, localVarReturnType, customHeader);
    }

    /**
     * Summary : addReturnDto
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/helpful/returnDto
     * Notes : 
     * @param reviewId reviewId(required)
     * @param reviewHelpfulFormDto reviewHelpfulFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(required)
     * @return ReviewHelpfulDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e">http://api-forge.coupang.net/details?specId=586603a25594daa0989c419e</a>
     */
    public ReviewHelpfulDto postApiV1MobileReviewsReviewIdHelpfulReturnDto(Long reviewId, ReviewHelpfulFormDto reviewHelpfulFormDto, String xMemberId, String xMemberType) throws ApiException {
        return this.postApiV1MobileReviewsReviewIdHelpfulReturnDto(reviewId, reviewHelpfulFormDto, xMemberId, xMemberType, null);
    }
    /**
     * Summary : updateVideoAttachments
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/video
     * @param reviewId reviewId (required)
     * @param videoFormDto videoFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2">http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2</a>
     */
    public <T> ResponseEntity<T> postApiV1MobileReviewsReviewIdVideoForResponseEntity(Long reviewId, ProductReviewVideoFormDto videoFormDto, String xMemberId, String xUserAgent, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = videoFormDto;
        
        // verify the required parameter 'reviewId' is set
        if (reviewId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewId' when calling postApiV1MobileReviewsReviewIdVideo");
        }
        
        // verify the required parameter 'videoFormDto' is set
        if (videoFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'videoFormDto' when calling postApiV1MobileReviewsReviewIdVideo");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1MobileReviewsReviewIdVideo");
        }
        
        // verify the required parameter 'xUserAgent' is set
        if (xUserAgent == null) {
            throw new ApiException(400, "Missing the required parameter 'xUserAgent' when calling postApiV1MobileReviewsReviewIdVideo");
        }
        
        // verify the required parameter 'xMemberType' is set
        if (xMemberType == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberType' when calling postApiV1MobileReviewsReviewIdVideo");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/mobile/reviews/{reviewId}/video"
            .replaceAll("\\{" + "reviewId" + "\\}", reviewId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xUserAgent != null) {
          localVarHeaderParams.put("X-UserAgent", apiClient.parameterToString(xUserAgent));
        }if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5900751fd036687f10abdce2", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : updateVideoAttachments
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/video
     * @param reviewId reviewId (required)
     * @param videoFormDto videoFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2">http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2</a>
     */
    public <T> T postApiV1MobileReviewsReviewIdVideo(Long reviewId, ProductReviewVideoFormDto videoFormDto, String xMemberId, String xUserAgent, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MobileReviewsReviewIdVideoForResponseEntity(reviewId, videoFormDto, xMemberId, xUserAgent, xMemberType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : updateVideoAttachments
     * Notes : 
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/video
     * @param reviewId reviewId (required)
     * @param videoFormDto videoFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39; (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2">http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2</a>
     */
    public ProductReviewDto postApiV1MobileReviewsReviewIdVideo(Long reviewId, ProductReviewVideoFormDto videoFormDto, String xMemberId, String xUserAgent, String xMemberType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductReviewDto> localVarReturnType = new ParameterizedTypeReference<ProductReviewDto>() {};
        return this.postApiV1MobileReviewsReviewIdVideo(reviewId, videoFormDto, xMemberId, xUserAgent, xMemberType, localVarReturnType, customHeader);
    }

    /**
     * Summary : updateVideoAttachments
     * API : product_review POST /api/v1/mobile/reviews/{reviewId}/video
     * Notes : 
     * @param reviewId reviewId(required)
     * @param videoFormDto videoFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param xUserAgent If PC then &#39;WEB&#39;, if Android app then &#39;ANDROID&#39;, if iOS app then &#39;IOS&#39;, if Android mobile web then &#39;W_ANDROID&#39; if iOS mobile web then &#39;W_IOS, if etc then &#39;W_ETC&#39;(required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(required)
     * @return ProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2">http://api-forge.coupang.net/details?specId=5900751fd036687f10abdce2</a>
     */
    public ProductReviewDto postApiV1MobileReviewsReviewIdVideo(Long reviewId, ProductReviewVideoFormDto videoFormDto, String xMemberId, String xUserAgent, String xMemberType) throws ApiException {
        return this.postApiV1MobileReviewsReviewIdVideo(reviewId, videoFormDto, xMemberId, xUserAgent, xMemberType, null);
    }
}
