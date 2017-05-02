package com.coupang.apigateway.services.benefit;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.benefit.model.DownloadDiscountCouponDTOv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
@org.springframework.stereotype.Component
public class BenefitApiDiscountcouponAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BenefitApiDiscountcouponAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("benefit");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Publish discountcoupon to member
     * Notes : 
     * API : benefit POST /api/discountcoupon/v2/download-sources/{sourceId}/discountcoupons
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba</a>
     */
    public <T> ResponseEntity<T> postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcouponsForResponseEntity(Long sourceId, String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sourceId' is set
        if (sourceId == null) {
            throw new ApiException(400, "Missing the required parameter 'sourceId' when calling postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons");
        }
        
        // create path and map variables
        String localVarPath = "/api/discountcoupon/v2/download-sources/{sourceId}/discountcoupons"
            .replaceAll("\\{" + "sourceId" + "\\}", sourceId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("583bea7c84126c2d0c653fba", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Publish discountcoupon to member
     * Notes : 
     * API : benefit POST /api/discountcoupon/v2/download-sources/{sourceId}/discountcoupons
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DownloadDiscountCouponDTOv2
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba</a>
     */
    public <T> T postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons(Long sourceId, String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcouponsForResponseEntity(sourceId, memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Publish discountcoupon to member
     * Notes : 
     * API : benefit POST /api/discountcoupon/v2/download-sources/{sourceId}/discountcoupons
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DownloadDiscountCouponDTOv2
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba</a>
     */
    public DownloadDiscountCouponDTOv2 postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons(Long sourceId, String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DownloadDiscountCouponDTOv2> localVarReturnType = new ParameterizedTypeReference<DownloadDiscountCouponDTOv2>() {};
        return this.postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons(sourceId, memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : Publish discountcoupon to member
     * API : benefit POST /api/discountcoupon/v2/download-sources/{sourceId}/discountcoupons
     * Notes : 
     * @param sourceId sourceId(required)
     * @param memberId memberId(required)
     * @return DownloadDiscountCouponDTOv2
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fba</a>
     */
    public DownloadDiscountCouponDTOv2 postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons(Long sourceId, String memberId) throws ApiException {
        return this.postApiDiscountcouponV2DownloadSourcesSourceIdDiscountcoupons(sourceId, memberId, null);
    }
    /**
     * Summary : Check discountcoupon is publishable
     * Notes : 
     * API : benefit GET /api/discountcoupon/v2/download-sources/{sourceId}/publishable
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf</a>
     */
    public <T> ResponseEntity<T> getApiDiscountcouponV2DownloadSourcesSourceIdPublishableForResponseEntity(Long sourceId, String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sourceId' is set
        if (sourceId == null) {
            throw new ApiException(400, "Missing the required parameter 'sourceId' when calling getApiDiscountcouponV2DownloadSourcesSourceIdPublishable");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiDiscountcouponV2DownloadSourcesSourceIdPublishable");
        }
        
        // create path and map variables
        String localVarPath = "/api/discountcoupon/v2/download-sources/{sourceId}/publishable"
            .replaceAll("\\{" + "sourceId" + "\\}", sourceId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("583bea7c84126c2d0c653fbf", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Check discountcoupon is publishable
     * Notes : 
     * API : benefit GET /api/discountcoupon/v2/download-sources/{sourceId}/publishable
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf</a>
     */
    public <T> T getApiDiscountcouponV2DownloadSourcesSourceIdPublishable(Long sourceId, String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiDiscountcouponV2DownloadSourcesSourceIdPublishableForResponseEntity(sourceId, memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Check discountcoupon is publishable
     * Notes : 
     * API : benefit GET /api/discountcoupon/v2/download-sources/{sourceId}/publishable
     * @param sourceId sourceId (required)
     * @param memberId memberId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf</a>
     */
    public Boolean getApiDiscountcouponV2DownloadSourcesSourceIdPublishable(Long sourceId, String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<Boolean>() {};
        return this.getApiDiscountcouponV2DownloadSourcesSourceIdPublishable(sourceId, memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : Check discountcoupon is publishable
     * API : benefit GET /api/discountcoupon/v2/download-sources/{sourceId}/publishable
     * Notes : 
     * @param sourceId sourceId(required)
     * @param memberId memberId(required)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf">http://api-forge.coupang.net/details?specId=583bea7c84126c2d0c653fbf</a>
     */
    public Boolean getApiDiscountcouponV2DownloadSourcesSourceIdPublishable(Long sourceId, String memberId) throws ApiException {
        return this.getApiDiscountcouponV2DownloadSourcesSourceIdPublishable(sourceId, memberId, null);
    }
}
