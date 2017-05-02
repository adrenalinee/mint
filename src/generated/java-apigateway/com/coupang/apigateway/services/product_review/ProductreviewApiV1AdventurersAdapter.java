package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.AdventurerProductPageViewDto;
import com.coupang.apigateway.services.product_review.model.AdventurerViewBannerDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewDto;

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
public class ProductreviewApiV1AdventurersAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1AdventurersAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : adventurerGroup
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324</a>
     */
    public <T> ResponseEntity<T> getApiV1AdventurersViewForResponseEntity(Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/adventurers/view";

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

        return apiClient.invokeAPIForResponseEntity("580dd2a24982e9a7c61e1324", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : adventurerGroup
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageViewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324</a>
     */
    public <T> T getApiV1AdventurersView(Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AdventurersViewForResponseEntity(page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : adventurerGroup
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerProductPageViewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324</a>
     */
    public AdventurerProductPageViewDto getApiV1AdventurersView(Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AdventurerProductPageViewDto> localVarReturnType = new ParameterizedTypeReference<AdventurerProductPageViewDto>() {};
        return this.getApiV1AdventurersView(page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : adventurerGroup
     * API : product_review GET /api/v1/adventurers/view
     * Notes : 
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return AdventurerProductPageViewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1324</a>
     */
    public AdventurerProductPageViewDto getApiV1AdventurersView(Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1AdventurersView(page, size, sort, null);
    }
    /**
     * Summary : adventurerViewBannerDto
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/banner
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329</a>
     */
    public <T> ResponseEntity<T> getApiV1AdventurersViewBannerForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/adventurers/view/banner";

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

        return apiClient.invokeAPIForResponseEntity("580dd2a24982e9a7c61e1329", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : adventurerViewBannerDto
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/banner
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerViewBannerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329</a>
     */
    public <T> T getApiV1AdventurersViewBanner(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AdventurersViewBannerForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : adventurerViewBannerDto
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/banner
     * @param customHeader customHeaderMap (nullable)
     * @return AdventurerViewBannerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329</a>
     */
    public AdventurerViewBannerDto getApiV1AdventurersViewBanner(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AdventurerViewBannerDto> localVarReturnType = new ParameterizedTypeReference<AdventurerViewBannerDto>() {};
        return this.getApiV1AdventurersViewBanner(localVarReturnType, customHeader);
    }

    /**
     * Summary : adventurerViewBannerDto
     * API : product_review GET /api/v1/adventurers/view/banner
     * Notes : 
     * @return AdventurerViewBannerDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1329</a>
     */
    public AdventurerViewBannerDto getApiV1AdventurersViewBanner() throws ApiException {
        return this.getApiV1AdventurersViewBanner(null);
    }
    /**
     * Summary : adventurerProductReviews
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/products/{adventurerProductId}/reviews
     * @param adventurerProductId adventurerProductId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e</a>
     */
    public <T> ResponseEntity<T> getApiV1AdventurersViewProductsAdventurerProductIdReviewsForResponseEntity(Long adventurerProductId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'adventurerProductId' is set
        if (adventurerProductId == null) {
            throw new ApiException(400, "Missing the required parameter 'adventurerProductId' when calling getApiV1AdventurersViewProductsAdventurerProductIdReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/adventurers/view/products/{adventurerProductId}/reviews"
            .replaceAll("\\{" + "adventurerProductId" + "\\}", adventurerProductId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a24982e9a7c61e132e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : adventurerProductReviews
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/products/{adventurerProductId}/reviews
     * @param adventurerProductId adventurerProductId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e</a>
     */
    public <T> T getApiV1AdventurersViewProductsAdventurerProductIdReviews(Long adventurerProductId, String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AdventurersViewProductsAdventurerProductIdReviewsForResponseEntity(adventurerProductId, xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : adventurerProductReviews
     * Notes : 
     * API : product_review GET /api/v1/adventurers/view/products/{adventurerProductId}/reviews
     * @param adventurerProductId adventurerProductId (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1AdventurersViewProductsAdventurerProductIdReviews(Long adventurerProductId, String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfProductReviewDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfProductReviewDto>() {};
        return this.getApiV1AdventurersViewProductsAdventurerProductIdReviews(adventurerProductId, xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : adventurerProductReviews
     * API : product_review GET /api/v1/adventurers/view/products/{adventurerProductId}/reviews
     * Notes : 
     * @param adventurerProductId adventurerProductId(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfProductReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e132e</a>
     */
    public PagedResourcesOfProductReviewDto getApiV1AdventurersViewProductsAdventurerProductIdReviews(Long adventurerProductId, String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1AdventurersViewProductsAdventurerProductIdReviews(adventurerProductId, xMemberId, page, size, sort, null);
    }
}
