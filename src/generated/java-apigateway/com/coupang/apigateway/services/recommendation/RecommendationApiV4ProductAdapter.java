package com.coupang.apigateway.services.recommendation;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

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
public class RecommendationApiV4ProductAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RecommendationApiV4ProductAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("recommendation");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed-map/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872</a>
     */
    public <T> ResponseEntity<T> getApiV4ProductAlsoViewedMapProductForResponseEntity(List<String> typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'typedProductId' is set
        if (typedProductId == null) {
            throw new ApiException(400, "Missing the required parameter 'typedProductId' when calling getApiV4ProductAlsoViewedMapProduct");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV4ProductAlsoViewedMapProduct");
        }
        
        // verify the required parameter 'maxCount' is set
        if (maxCount == null) {
            throw new ApiException(400, "Missing the required parameter 'maxCount' when calling getApiV4ProductAlsoViewedMapProduct");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4ProductAlsoViewedMapProduct");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4ProductAlsoViewedMapProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/product/also-viewed-map/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "typedProductId", typedProductId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberSrl", memberSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCount", maxCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("587edb90dd65fc87b3385872", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed-map/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ProductListDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872</a>
     */
    public <T> T getApiV4ProductAlsoViewedMapProduct(List<String> typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4ProductAlsoViewedMapProductForResponseEntity(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed-map/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ProductListDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872</a>
     */
    public Map<String, ProductListDto> getApiV4ProductAlsoViewedMapProduct(List<String> typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, ProductListDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, ProductListDto>>() {};
        return this.getApiV4ProductAlsoViewedMapProduct(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : also-viewed product value
     * API : recommendation GET /api/v4/product/also-viewed-map/product
     * Notes : also-viewed product note
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d(required)
     * @param pcid pcid(required)
     * @param maxCount maxCount(required)
     * @param platform param platform(required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method.(required)
     * @param memberSrl memberSrl(optional, default to -1)
     * @return Map<String, ProductListDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b3385872</a>
     */
    public Map<String, ProductListDto> getApiV4ProductAlsoViewedMapProduct(List<String> typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl) throws ApiException {
        return this.getApiV4ProductAlsoViewedMapProduct(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, null);
    }
    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d</a>
     */
    public <T> ResponseEntity<T> getApiV4ProductAlsoViewedProductForResponseEntity(String typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'typedProductId' is set
        if (typedProductId == null) {
            throw new ApiException(400, "Missing the required parameter 'typedProductId' when calling getApiV4ProductAlsoViewedProduct");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV4ProductAlsoViewedProduct");
        }
        
        // verify the required parameter 'maxCount' is set
        if (maxCount == null) {
            throw new ApiException(400, "Missing the required parameter 'maxCount' when calling getApiV4ProductAlsoViewedProduct");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4ProductAlsoViewedProduct");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4ProductAlsoViewedProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/product/also-viewed/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "typedProductId", typedProductId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberSrl", memberSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCount", maxCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("587edb90dd65fc87b338586d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d</a>
     */
    public <T> T getApiV4ProductAlsoViewedProduct(String typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4ProductAlsoViewedProductForResponseEntity(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : also-viewed product value
     * Notes : also-viewed product note
     * API : recommendation GET /api/v4/product/also-viewed/product
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d (required)
     * @param pcid pcid (required)
     * @param maxCount maxCount (required)
     * @param platform platform (required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method. (required)
     * @param memberSrl memberSrl (optional, default to -1)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d</a>
     */
    public ProductListDto getApiV4ProductAlsoViewedProduct(String typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductListDto> localVarReturnType = new ParameterizedTypeReference<ProductListDto>() {};
        return this.getApiV4ProductAlsoViewedProduct(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : also-viewed product value
     * API : recommendation GET /api/v4/product/also-viewed/product
     * Notes : also-viewed product note
     * @param typedProductId productId with productType, productType + productId, Product-&gt;p, Deal-&gt;d(required)
     * @param pcid pcid(required)
     * @param maxCount maxCount(required)
     * @param platform platform(required)
     * @param eventLabel Event label value is defined Recommendation team, Because of recommendation log tracking is black list method.(required)
     * @param memberSrl memberSrl(optional, default to -1)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d">http://api-forge.coupang.net/details?specId=587edb90dd65fc87b338586d</a>
     */
    public ProductListDto getApiV4ProductAlsoViewedProduct(String typedProductId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl) throws ApiException {
        return this.getApiV4ProductAlsoViewedProduct(typedProductId, pcid, maxCount, platform, eventLabel, memberSrl, null);
    }
    /**
     * Summary : complete look product value
     * Notes : complete look product note
     * API : recommendation GET /api/v4/product/complete-look/product
     * @param productId param productId (required)
     * @param pcid param pcid (required)
     * @param maxCount param maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel param eventLabel (required)
     * @param memberSrl param memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4">http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4</a>
     */
    public <T> ResponseEntity<T> getApiV4ProductCompleteLookProductForResponseEntity(Long productId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV4ProductCompleteLookProduct");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV4ProductCompleteLookProduct");
        }
        
        // verify the required parameter 'maxCount' is set
        if (maxCount == null) {
            throw new ApiException(400, "Missing the required parameter 'maxCount' when calling getApiV4ProductCompleteLookProduct");
        }
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV4ProductCompleteLookProduct");
        }
        
        // verify the required parameter 'eventLabel' is set
        if (eventLabel == null) {
            throw new ApiException(400, "Missing the required parameter 'eventLabel' when calling getApiV4ProductCompleteLookProduct");
        }
        
        // create path and map variables
        String localVarPath = "/api/v4/product/complete-look/product";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pcid", pcid));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberSrl", memberSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCount", maxCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventLabel", eventLabel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("583d62212e53c2240c61eed4", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : complete look product value
     * Notes : complete look product note
     * API : recommendation GET /api/v4/product/complete-look/product
     * @param productId param productId (required)
     * @param pcid param pcid (required)
     * @param maxCount param maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel param eventLabel (required)
     * @param memberSrl param memberSrl (optional, default to -1)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4">http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4</a>
     */
    public <T> T getApiV4ProductCompleteLookProduct(Long productId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV4ProductCompleteLookProductForResponseEntity(productId, pcid, maxCount, platform, eventLabel, memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : complete look product value
     * Notes : complete look product note
     * API : recommendation GET /api/v4/product/complete-look/product
     * @param productId param productId (required)
     * @param pcid param pcid (required)
     * @param maxCount param maxCount (required)
     * @param platform param platform (required)
     * @param eventLabel param eventLabel (required)
     * @param memberSrl param memberSrl (optional, default to -1)
     * @param customHeader customHeaderMap (nullable)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4">http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4</a>
     */
    public ProductListDto getApiV4ProductCompleteLookProduct(Long productId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ProductListDto> localVarReturnType = new ParameterizedTypeReference<ProductListDto>() {};
        return this.getApiV4ProductCompleteLookProduct(productId, pcid, maxCount, platform, eventLabel, memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : complete look product value
     * API : recommendation GET /api/v4/product/complete-look/product
     * Notes : complete look product note
     * @param productId param productId(required)
     * @param pcid param pcid(required)
     * @param maxCount param maxCount(required)
     * @param platform param platform(required)
     * @param eventLabel param eventLabel(required)
     * @param memberSrl param memberSrl(optional, default to -1)
     * @return ProductListDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4">http://api-forge.coupang.net/details?specId=583d62212e53c2240c61eed4</a>
     */
    public ProductListDto getApiV4ProductCompleteLookProduct(Long productId, String pcid, Integer maxCount, String platform, String eventLabel, Long memberSrl) throws ApiException {
        return this.getApiV4ProductCompleteLookProduct(productId, pcid, maxCount, platform, eventLabel, memberSrl, null);
    }
}
