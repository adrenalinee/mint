package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.SellerReviewDto;
import com.coupang.apigateway.services.product_review.model.SellerReviewFormDto;

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
public class ProductreviewApiV1SellerreviewAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1SellerreviewAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : addSellerReview
     * Notes : 
     * API : product_review POST /api/v1/sellerreview
     * @param formDto formDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2</a>
     */
    public <T> ResponseEntity<T> postApiV1SellerreviewForResponseEntity(SellerReviewFormDto formDto, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = formDto;
        
        // verify the required parameter 'formDto' is set
        if (formDto == null) {
            throw new ApiException(400, "Missing the required parameter 'formDto' when calling postApiV1Sellerreview");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1Sellerreview");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/sellerreview";

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

        return apiClient.invokeAPIForResponseEntity("5866051a3faf51e2d8fbd0a2", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : addSellerReview
     * Notes : 
     * API : product_review POST /api/v1/sellerreview
     * @param formDto formDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SellerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2</a>
     */
    public <T> T postApiV1Sellerreview(SellerReviewFormDto formDto, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1SellerreviewForResponseEntity(formDto, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : addSellerReview
     * Notes : 
     * API : product_review POST /api/v1/sellerreview
     * @param formDto formDto (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SellerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2</a>
     */
    public SellerReviewDto postApiV1Sellerreview(SellerReviewFormDto formDto, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SellerReviewDto> localVarReturnType = new ParameterizedTypeReference<SellerReviewDto>() {};
        return this.postApiV1Sellerreview(formDto, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : addSellerReview
     * API : product_review POST /api/v1/sellerreview
     * Notes : 
     * @param formDto formDto(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return SellerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2">http://api-forge.coupang.net/details?specId=5866051a3faf51e2d8fbd0a2</a>
     */
    public SellerReviewDto postApiV1Sellerreview(SellerReviewFormDto formDto, String xMemberId) throws ApiException {
        return this.postApiV1Sellerreview(formDto, xMemberId, null);
    }
}
