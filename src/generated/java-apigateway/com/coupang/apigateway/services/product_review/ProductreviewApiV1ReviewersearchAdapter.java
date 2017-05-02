package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.ReviewerWithReviewsDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewContentsDto;

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
public class ProductreviewApiV1ReviewersearchAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1ReviewersearchAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/profile-with-reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerSearchReviewerProfileWithReviewsMForResponseEntity(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewer' is set
        if (reviewer == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewer' when calling getApiV1ReviewerSearchReviewerProfileWithReviewsM");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer-search/{reviewer}/profile-with-reviews/m"
            .replaceAll("\\{" + "reviewer" + "\\}", reviewer.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewerMemberId", reviewerMemberId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "myPage", myPage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetType", targetType));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586605193faf51e2d8fbd061", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/profile-with-reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061</a>
     */
    public <T> T getApiV1ReviewerSearchReviewerProfileWithReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerSearchReviewerProfileWithReviewsMForResponseEntity(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/profile-with-reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061</a>
     */
    public ReviewerWithReviewsDto getApiV1ReviewerSearchReviewerProfileWithReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerWithReviewsDto> localVarReturnType = new ParameterizedTypeReference<ReviewerWithReviewsDto>() {};
        return this.getApiV1ReviewerSearchReviewerProfileWithReviewsM(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewerWithReviews
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/profile-with-reviews/m
     * Notes : 
     * @param reviewer reviewer(required)
     * @param page (optional)
     * @param pageSize (optional)
     * @param sort (optional)
     * @param direction (optional)
     * @param q (optional)
     * @param reviewerMemberId (optional)
     * @param myPage (optional)
     * @param targetType (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd061</a>
     */
    public ReviewerWithReviewsDto getApiV1ReviewerSearchReviewerProfileWithReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId) throws ApiException {
        return this.getApiV1ReviewerSearchReviewerProfileWithReviewsM(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, null);
    }
    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerSearchReviewerReviewsMForResponseEntity(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewer' is set
        if (reviewer == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewer' when calling getApiV1ReviewerSearchReviewerReviewsM");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer-search/{reviewer}/reviews/m"
            .replaceAll("\\{" + "reviewer" + "\\}", reviewer.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reviewerMemberId", reviewerMemberId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "myPage", myPage));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetType", targetType));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586605193faf51e2d8fbd066", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066</a>
     */
    public <T> T getApiV1ReviewerSearchReviewerReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerSearchReviewerReviewsMForResponseEntity(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/reviews/m
     * @param reviewer reviewer (required)
     * @param page  (optional)
     * @param pageSize  (optional)
     * @param sort  (optional)
     * @param direction  (optional)
     * @param q  (optional)
     * @param reviewerMemberId  (optional)
     * @param myPage  (optional)
     * @param targetType  (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1ReviewerSearchReviewerReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto>() {};
        return this.getApiV1ReviewerSearchReviewerReviewsM(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviews
     * API : product_review GET /api/v1/reviewer-search/{reviewer}/reviews/m
     * Notes : 
     * @param reviewer reviewer(required)
     * @param page (optional)
     * @param pageSize (optional)
     * @param sort (optional)
     * @param direction (optional)
     * @param q (optional)
     * @param reviewerMemberId (optional)
     * @param myPage (optional)
     * @param targetType (optional)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd066</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1ReviewerSearchReviewerReviewsM(Long reviewer, Integer page, Integer pageSize, String sort, String direction, String q, Long reviewerMemberId, Boolean myPage, String targetType, String xMemberId) throws ApiException {
        return this.getApiV1ReviewerSearchReviewerReviewsM(reviewer, page, pageSize, sort, direction, q, reviewerMemberId, myPage, targetType, xMemberId, null);
    }
}
