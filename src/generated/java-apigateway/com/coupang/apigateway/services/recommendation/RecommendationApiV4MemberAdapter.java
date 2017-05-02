package com.coupang.apigateway.services.recommendation;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.recommendation.model.CategoryListDto;
import com.coupang.apigateway.services.recommendation.model.ProductListDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
@org.springframework.stereotype.Component
public class RecommendationApiV4MemberAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RecommendationApiV4MemberAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("recommendation");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getPreferredCategoryList
     * Notes : 
     * API : recommendation GET /api/v4/member/preferred-list/category
     * @param pcid pcid (required)
     * @param bundle bundle (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b</a>
     */
    public <T> ResponseEntity<T> getApiV4MemberPreferredListCategoryForResponseEntity(String pcid, String bundle, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV4MemberPreferredListCategory");
        }
        
        // verify the required parameter 'bundle' is set
        if (bundle == null) {
            throw new ApiException(400, "Missing the required parameter 'bundle' when calling getApiV4MemberPreferredListCategory");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4MemberPreferredListCategory");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4MemberPreferredListCategory");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/member/preferred-list/category";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberSrl", memberSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundle", bundle));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("587edb90dd65fc87b338588b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getPreferredCategoryList
     * Notes : 
     * API : recommendation GET /api/v4/member/preferred-list/category
     * @param pcid pcid (required)
     * @param bundle bundle (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return CategoryListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b</a>
     */
    public <T> T getApiV4MemberPreferredListCategory(String pcid, String bundle, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4MemberPreferredListCategoryForResponseEntity(pcid, bundle, platform, eventLabel, memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getPreferredCategoryList
     * Notes : 
     * API : recommendation GET /api/v4/member/preferred-list/category
     * @param pcid pcid (required)
     * @param bundle bundle (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param customHeader customHeaderMap (nullable)
     * @return CategoryListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b</a>
     */
    public CategoryListDto getApiV4MemberPreferredListCategory(String pcid, String bundle, String platform, String eventLabel, Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<CategoryListDto> localVarReturnType = new ParameterizedTypeReference<CategoryListDto>() {};
        return this.getApiV4MemberPreferredListCategory(pcid, bundle, platform, eventLabel, memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : getPreferredCategoryList
     * API : recommendation GET /api/v4/member/preferred-list/category
     * Notes : 
     * @param pcid pcid(required)
     * @param bundle bundle(required)
     * @param platform param platform(required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method.(required)
     * @param memberSrl memberSrl(optional, default to -1)
     * @return CategoryListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338588b</a>
     */
    public CategoryListDto getApiV4MemberPreferredListCategory(String pcid, String bundle, String platform, String eventLabel, Long memberSrl) throws ApiException {
        return this.getApiV4MemberPreferredListCategory(pcid, bundle, platform, eventLabel, memberSrl, null);
    }
    /**
     * Summary : getRecentProductsToList
     * Notes : 
     * API : recommendation GET /api/v4/member/recently-view-list/product
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param cartSessionId cartSessionId (optional, default to -1)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886</a>
     */
    public <T> ResponseEntity<T> getApiV4MemberRecentlyViewListProductForResponseEntity(String pcid, Integer maxCount, String platform, String eventLabel, String cartSessionId, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV4MemberRecentlyViewListProduct");
        }
        
        // verify the required parameter 'maxCount' is set
        if (maxCount == null) {
            throw new ApiException(400, "Missing the required parameter 'maxCount' when calling getApiV4MemberRecentlyViewListProduct");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4MemberRecentlyViewListProduct");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4MemberRecentlyViewListProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/member/recently-view-list/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cartSessionId", cartSessionId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberSrl", memberSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCount", maxCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("587edb90dd65fc87b3385886", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getRecentProductsToList
     * Notes : 
     * API : recommendation GET /api/v4/member/recently-view-list/product
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param cartSessionId cartSessionId (optional, default to -1)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886</a>
     */
    public <T> T getApiV4MemberRecentlyViewListProduct(String pcid, Integer maxCount, String platform, String eventLabel, String cartSessionId, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4MemberRecentlyViewListProductForResponseEntity(pcid, maxCount, platform, eventLabel, cartSessionId, memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getRecentProductsToList
     * Notes : 
     * API : recommendation GET /api/v4/member/recently-view-list/product
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param cartSessionId cartSessionId (optional, default to -1)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886</a>
     */
    public ProductListDto getApiV4MemberRecentlyViewListProduct(String pcid, Integer maxCount, String platform, String eventLabel, String cartSessionId, Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductListDto> localVarReturnType = new ParameterizedTypeReference<ProductListDto>() {};
        return this.getApiV4MemberRecentlyViewListProduct(pcid, maxCount, platform, eventLabel, cartSessionId, memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : getRecentProductsToList
     * API : recommendation GET /api/v4/member/recently-view-list/product
     * Notes : 
     * @param pcid pcid(required)
     * @param maxCount maxCount(required)
     * @param platform param platform(required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method.(required)
     * @param cartSessionId cartSessionId(optional, default to -1)
     * @param memberSrl memberSrl(optional, default to -1)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385886</a>
     */
    public ProductListDto getApiV4MemberRecentlyViewListProduct(String pcid, Integer maxCount, String platform, String eventLabel, String cartSessionId, Long memberSrl) throws ApiException {
        return this.getApiV4MemberRecentlyViewListProduct(pcid, maxCount, platform, eventLabel, cartSessionId, memberSrl, null);
    }
}
