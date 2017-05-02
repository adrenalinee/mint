package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.AdventurerStatusAndProductDto;
import com.coupang.apigateway.services.product_review.model.AdventurerProductPageDto;

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
public class ProductreviewApiV1MyadventurerAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1MyadventurerAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : statusAndProduct
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/product
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param adventurerProductId adventurerProductId (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8</a>
     */
    public <T> ResponseEntity<T> getApiV1MyadventurerProductForResponseEntity(String xMemberId, Long adventurerProductId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MyadventurerProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/myadventurer/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adventurerProductId", adventurerProductId));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c41a8", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : statusAndProduct
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/product
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param adventurerProductId adventurerProductId (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerStatusAndProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8</a>
     */
    public <T> T getApiV1MyadventurerProduct(String xMemberId, Long adventurerProductId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MyadventurerProductForResponseEntity(xMemberId, adventurerProductId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : statusAndProduct
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/product
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param adventurerProductId adventurerProductId (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerStatusAndProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8</a>
     */
    public AdventurerStatusAndProductDto getApiV1MyadventurerProduct(String xMemberId, Long adventurerProductId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AdventurerStatusAndProductDto> localVarReturnType = new ParameterizedTypeReference<AdventurerStatusAndProductDto>() {};
        return this.getApiV1MyadventurerProduct(xMemberId, adventurerProductId, localVarReturnType, customHeader);
    }

    /**
     * Summary : statusAndProduct
     * API : product_review GET /api/v1/myadventurer/product
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param adventurerProductId adventurerProductId(optional)
     * @return AdventurerStatusAndProductDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41a8</a>
     */
    public AdventurerStatusAndProductDto getApiV1MyadventurerProduct(String xMemberId, Long adventurerProductId) throws ApiException {
        return this.getApiV1MyadventurerProduct(xMemberId, adventurerProductId, null);
    }
    /**
     * Summary : productAllPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productAllPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad</a>
     */
    public <T> ResponseEntity<T> getApiV1MyadventurerProductAllPageForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MyadventurerProductAllPage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/myadventurer/productAllPage";

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

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c41ad", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : productAllPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productAllPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad</a>
     */
    public <T> T getApiV1MyadventurerProductAllPage(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MyadventurerProductAllPageForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : productAllPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productAllPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad</a>
     */
    public AdventurerProductPageDto getApiV1MyadventurerProductAllPage(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AdventurerProductPageDto> localVarReturnType = new ParameterizedTypeReference<AdventurerProductPageDto>() {};
        return this.getApiV1MyadventurerProductAllPage(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : productAllPage
     * API : product_review GET /api/v1/myadventurer/productAllPage
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41ad</a>
     */
    public AdventurerProductPageDto getApiV1MyadventurerProductAllPage(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MyadventurerProductAllPage(xMemberId, page, size, sort, null);
    }
    /**
     * Summary : productOnlyPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2</a>
     */
    public <T> ResponseEntity<T> getApiV1MyadventurerProductPageForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1MyadventurerProductPage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/myadventurer/productPage";

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

        return apiClient.invokeAPIForResponseEntity("586603a25594daa0989c41b2", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : productOnlyPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2</a>
     */
    public <T> T getApiV1MyadventurerProductPage(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MyadventurerProductPageForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : productOnlyPage
     * Notes : 
     * API : product_review GET /api/v1/myadventurer/productPage
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2</a>
     */
    public AdventurerProductPageDto getApiV1MyadventurerProductPage(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AdventurerProductPageDto> localVarReturnType = new ParameterizedTypeReference<AdventurerProductPageDto>() {};
        return this.getApiV1MyadventurerProductPage(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : productOnlyPage
     * API : product_review GET /api/v1/myadventurer/productPage
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return AdventurerProductPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2">http://api-forge.coupang.net/details?specId=586603a25594daa0989c41b2</a>
     */
    public AdventurerProductPageDto getApiV1MyadventurerProductPage(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1MyadventurerProductPage(xMemberId, page, size, sort, null);
    }
}
