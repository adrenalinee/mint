package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.ReviewerDto;
import com.coupang.apigateway.services.product_review.model.DisplayImageAddFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewerDisplayImageDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewContentsDto;
import com.coupang.apigateway.services.product_review.model.ReviewerWithReviewsDto;

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
public class ProductreviewApiV1ReviewerAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1ReviewerAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : resetDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/resetDisplayImage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a</a>
     */
    public <T> ResponseEntity<T> postApiV1ReviewerResetDisplayImageForResponseEntity(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1ReviewerResetDisplayImage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/resetDisplayImage";

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

        return apiClient.invokeAPIForResponseEntity("586605193faf51e2d8fbd07a", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : resetDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/resetDisplayImage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a</a>
     */
    public <T> T postApiV1ReviewerResetDisplayImage(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1ReviewerResetDisplayImageForResponseEntity(xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : resetDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/resetDisplayImage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a</a>
     */
    public ReviewerDto postApiV1ReviewerResetDisplayImage(String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerDto> localVarReturnType = new ParameterizedTypeReference<ReviewerDto>() {};
        return this.postApiV1ReviewerResetDisplayImage(xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : resetDisplayImage
     * API : product_review POST /api/v1/reviewer/resetDisplayImage
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07a</a>
     */
    public ReviewerDto postApiV1ReviewerResetDisplayImage(String xMemberId) throws ApiException {
        return this.postApiV1ReviewerResetDisplayImage(xMemberId, null);
    }
    /**
     * Summary : updateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updateDisplayImage
     * @param displayImageAddFormDto displayImageAddFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f</a>
     */
    public <T> ResponseEntity<T> postApiV1ReviewerUpdateDisplayImageForResponseEntity(DisplayImageAddFormDto displayImageAddFormDto, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = displayImageAddFormDto;
        
        // verify the required parameter 'displayImageAddFormDto' is set
        if (displayImageAddFormDto == null) {
            throw new ApiException(400, "Missing the required parameter 'displayImageAddFormDto' when calling postApiV1ReviewerUpdateDisplayImage");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1ReviewerUpdateDisplayImage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/updateDisplayImage";

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

        return apiClient.invokeAPIForResponseEntity("586605193faf51e2d8fbd07f", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : updateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updateDisplayImage
     * @param displayImageAddFormDto displayImageAddFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f</a>
     */
    public <T> T postApiV1ReviewerUpdateDisplayImage(DisplayImageAddFormDto displayImageAddFormDto, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1ReviewerUpdateDisplayImageForResponseEntity(displayImageAddFormDto, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : updateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updateDisplayImage
     * @param displayImageAddFormDto displayImageAddFormDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f</a>
     */
    public ReviewerDisplayImageDto postApiV1ReviewerUpdateDisplayImage(DisplayImageAddFormDto displayImageAddFormDto, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerDisplayImageDto> localVarReturnType = new ParameterizedTypeReference<ReviewerDisplayImageDto>() {};
        return this.postApiV1ReviewerUpdateDisplayImage(displayImageAddFormDto, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : updateDisplayImage
     * API : product_review POST /api/v1/reviewer/updateDisplayImage
     * Notes : 
     * @param displayImageAddFormDto displayImageAddFormDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd07f</a>
     */
    public ReviewerDisplayImageDto postApiV1ReviewerUpdateDisplayImage(DisplayImageAddFormDto displayImageAddFormDto, String xMemberId) throws ApiException {
        return this.postApiV1ReviewerUpdateDisplayImage(displayImageAddFormDto, xMemberId, null);
    }
    /**
     * Summary : updatePrivateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updatePrivateDisplayImage/{privateDisplayImage}
     * @param privateDisplayImage privateDisplayImage (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084</a>
     */
    public <T> ResponseEntity<T> postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImageForResponseEntity(Boolean privateDisplayImage, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'privateDisplayImage' is set
        if (privateDisplayImage == null) {
            throw new ApiException(400, "Missing the required parameter 'privateDisplayImage' when calling postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/updatePrivateDisplayImage/{privateDisplayImage}"
            .replaceAll("\\{" + "privateDisplayImage" + "\\}", privateDisplayImage.toString());

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

        return apiClient.invokeAPIForResponseEntity("586605193faf51e2d8fbd084", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : updatePrivateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updatePrivateDisplayImage/{privateDisplayImage}
     * @param privateDisplayImage privateDisplayImage (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084</a>
     */
    public <T> T postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage(Boolean privateDisplayImage, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImageForResponseEntity(privateDisplayImage, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : updatePrivateDisplayImage
     * Notes : 
     * API : product_review POST /api/v1/reviewer/updatePrivateDisplayImage/{privateDisplayImage}
     * @param privateDisplayImage privateDisplayImage (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084</a>
     */
    public ReviewerDisplayImageDto postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage(Boolean privateDisplayImage, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerDisplayImageDto> localVarReturnType = new ParameterizedTypeReference<ReviewerDisplayImageDto>() {};
        return this.postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage(privateDisplayImage, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : updatePrivateDisplayImage
     * API : product_review POST /api/v1/reviewer/updatePrivateDisplayImage/{privateDisplayImage}
     * Notes : 
     * @param privateDisplayImage privateDisplayImage(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return ReviewerDisplayImageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084">http://api-forge.coupang.net/details?specId=586605193faf51e2d8fbd084</a>
     */
    public ReviewerDisplayImageDto postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage(Boolean privateDisplayImage, String xMemberId) throws ApiException {
        return this.postApiV1ReviewerUpdatePrivateDisplayImagePrivateDisplayImage(privateDisplayImage, xMemberId, null);
    }
    /**
     * Summary : getReviewerProfile
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerReviewerMemberIdForResponseEntity(String reviewerMemberId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewerMemberId' is set
        if (reviewerMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewerMemberId' when calling getApiV1ReviewerReviewerMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/{reviewerMemberId}"
            .replaceAll("\\{" + "reviewerMemberId" + "\\}", reviewerMemberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a54982e9a7c61e1504", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewerProfile
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504</a>
     */
    public <T> T getApiV1ReviewerReviewerMemberId(String reviewerMemberId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerReviewerMemberIdForResponseEntity(reviewerMemberId, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewerProfile
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504</a>
     */
    public ReviewerDto getApiV1ReviewerReviewerMemberId(String reviewerMemberId, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerDto> localVarReturnType = new ParameterizedTypeReference<ReviewerDto>() {};
        return this.getApiV1ReviewerReviewerMemberId(reviewerMemberId, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewerProfile
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}
     * Notes : 
     * @param reviewerMemberId reviewerMemberId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1504</a>
     */
    public ReviewerDto getApiV1ReviewerReviewerMemberId(String reviewerMemberId, String xMemberId) throws ApiException {
        return this.getApiV1ReviewerReviewerMemberId(reviewerMemberId, xMemberId, null);
    }
    /**
     * Summary : getReviewerProfileWithBlindedReview
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/includedBlindedReview
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerReviewerMemberIdIncludedBlindedReviewForResponseEntity(String reviewerMemberId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewerMemberId' is set
        if (reviewerMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewerMemberId' when calling getApiV1ReviewerReviewerMemberIdIncludedBlindedReview");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/{reviewerMemberId}/includedBlindedReview"
            .replaceAll("\\{" + "reviewerMemberId" + "\\}", reviewerMemberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a54982e9a7c61e1509", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewerProfileWithBlindedReview
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/includedBlindedReview
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509</a>
     */
    public <T> T getApiV1ReviewerReviewerMemberIdIncludedBlindedReview(String reviewerMemberId, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerReviewerMemberIdIncludedBlindedReviewForResponseEntity(reviewerMemberId, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewerProfileWithBlindedReview
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/includedBlindedReview
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509</a>
     */
    public ReviewerDto getApiV1ReviewerReviewerMemberIdIncludedBlindedReview(String reviewerMemberId, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerDto> localVarReturnType = new ParameterizedTypeReference<ReviewerDto>() {};
        return this.getApiV1ReviewerReviewerMemberIdIncludedBlindedReview(reviewerMemberId, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewerProfileWithBlindedReview
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/includedBlindedReview
     * Notes : 
     * @param reviewerMemberId reviewerMemberId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return ReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1509</a>
     */
    public ReviewerDto getApiV1ReviewerReviewerMemberIdIncludedBlindedReview(String reviewerMemberId, String xMemberId) throws ApiException {
        return this.getApiV1ReviewerReviewerMemberIdIncludedBlindedReview(reviewerMemberId, xMemberId, null);
    }
    /**
     * Summary : getOnlyReviewerReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/onlyReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerReviewerMemberIdOnlyReviewContentsForResponseEntity(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewerMemberId' is set
        if (reviewerMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewerMemberId' when calling getApiV1ReviewerReviewerMemberIdOnlyReviewContents");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/{reviewerMemberId}/onlyReviewContents"
            .replaceAll("\\{" + "reviewerMemberId" + "\\}", reviewerMemberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a54982e9a7c61e150e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getOnlyReviewerReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/onlyReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e</a>
     */
    public <T> T getApiV1ReviewerReviewerMemberIdOnlyReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerReviewerMemberIdOnlyReviewContentsForResponseEntity(reviewerMemberId, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getOnlyReviewerReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/onlyReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1ReviewerReviewerMemberIdOnlyReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewContentsDto>() {};
        return this.getApiV1ReviewerReviewerMemberIdOnlyReviewContents(reviewerMemberId, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getOnlyReviewerReviews
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/onlyReviewContents
     * Notes : 
     * @param reviewerMemberId reviewerMemberId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewContentsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e150e</a>
     */
    public PagedResourcesOfProductReviewContentsDto getApiV1ReviewerReviewerMemberIdOnlyReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1ReviewerReviewerMemberIdOnlyReviewContents(reviewerMemberId, xMemberId, page, size, sort, null);
    }
    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/withReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewerReviewerMemberIdWithReviewContentsForResponseEntity(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'reviewerMemberId' is set
        if (reviewerMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'reviewerMemberId' when calling getApiV1ReviewerReviewerMemberIdWithReviewContents");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewer/{reviewerMemberId}/withReviewContents"
            .replaceAll("\\{" + "reviewerMemberId" + "\\}", reviewerMemberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a54982e9a7c61e1513", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/withReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513</a>
     */
    public <T> T getApiV1ReviewerReviewerMemberIdWithReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewerReviewerMemberIdWithReviewContentsForResponseEntity(reviewerMemberId, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReviewerWithReviews
     * Notes : 
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/withReviewContents
     * @param reviewerMemberId reviewerMemberId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513</a>
     */
    public ReviewerWithReviewsDto getApiV1ReviewerReviewerMemberIdWithReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewerWithReviewsDto> localVarReturnType = new ParameterizedTypeReference<ReviewerWithReviewsDto>() {};
        return this.getApiV1ReviewerReviewerMemberIdWithReviewContents(reviewerMemberId, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReviewerWithReviews
     * API : product_review GET /api/v1/reviewer/{reviewerMemberId}/withReviewContents
     * Notes : 
     * @param reviewerMemberId reviewerMemberId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return ReviewerWithReviewsDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1513</a>
     */
    public ReviewerWithReviewsDto getApiV1ReviewerReviewerMemberIdWithReviewContents(String reviewerMemberId, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1ReviewerReviewerMemberIdWithReviewContents(reviewerMemberId, xMemberId, page, size, sort, null);
    }
}
