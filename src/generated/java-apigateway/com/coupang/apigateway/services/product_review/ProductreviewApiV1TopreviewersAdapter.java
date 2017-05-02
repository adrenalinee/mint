package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.PagedResourcesOfTopReviewerDto;

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
public class ProductreviewApiV1TopreviewersAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1TopreviewersAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : page
     * Notes : 
     * API : product_review GET /api/v1/top-reviewers
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a">http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a</a>
     */
    public <T> ResponseEntity<T> getApiV1TopReviewersForResponseEntity(Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/top-reviewers";

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
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a64982e9a7c61e154a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : page
     * Notes : 
     * API : product_review GET /api/v1/top-reviewers
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfTopReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a">http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a</a>
     */
    public <T> T getApiV1TopReviewers(Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1TopReviewersForResponseEntity(page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : page
     * Notes : 
     * API : product_review GET /api/v1/top-reviewers
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfTopReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a">http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a</a>
     */
    public PagedResourcesOfTopReviewerDto getApiV1TopReviewers(Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfTopReviewerDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfTopReviewerDto>() {};
        return this.getApiV1TopReviewers(page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : page
     * API : product_review GET /api/v1/top-reviewers
     * Notes : 
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfTopReviewerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a">http://api-forge.coupang.net/details?specId=580dd2a64982e9a7c61e154a</a>
     */
    public PagedResourcesOfTopReviewerDto getApiV1TopReviewers(Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1TopReviewers(page, size, sort, null);
    }
}
