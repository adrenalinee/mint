package com.coupang.apigateway.services.promotion_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
@org.springframework.stereotype.Component
public class PromotionapiApiDownloadcouponAdapter {

    private final ApiClient apiClient;

    @Autowired
    public PromotionapiApiDownloadcouponAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("promotion_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : promotion_api GET /api/download-coupon/v1/promotion/{promotionId}/vendoritems
     * @param promotionId promotionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d">http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d</a>
     */
    public <T> ResponseEntity<T> getApiDownloadCouponV1PromotionPromotionIdVendoritemsForResponseEntity(Long promotionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'promotionId' is set
        if (promotionId == null) {
            throw new ApiException(400, "Missing the required parameter 'promotionId' when calling getApiDownloadCouponV1PromotionPromotionIdVendoritems");
        }
        
        // create path and map variables
        String localVarPath = "/api/download-coupon/v1/promotion/{promotionId}/vendoritems"
            .replaceAll("\\{" + "promotionId" + "\\}", promotionId.toString());

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

        return apiClient.invokeAPIForResponseEntity("5892980121a24a88459a269d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : promotion_api GET /api/download-coupon/v1/promotion/{promotionId}/vendoritems
     * @param promotionId promotionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d">http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d</a>
     */
    public <T> T getApiDownloadCouponV1PromotionPromotionIdVendoritems(Long promotionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiDownloadCouponV1PromotionPromotionIdVendoritemsForResponseEntity(promotionId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : promotion_api GET /api/download-coupon/v1/promotion/{promotionId}/vendoritems
     * @param promotionId promotionId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d">http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d</a>
     */
    public List<String> getApiDownloadCouponV1PromotionPromotionIdVendoritems(Long promotionId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<String>> localVarReturnType = new ParameterizedTypeReference<List<String>>() {};
        return this.getApiDownloadCouponV1PromotionPromotionIdVendoritems(promotionId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getVendorItems
     * API : promotion_api GET /api/download-coupon/v1/promotion/{promotionId}/vendoritems
     * Notes : 
     * @param promotionId promotionId(required)
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d">http://api-forge.coupang.net/details?specId=5892980121a24a88459a269d</a>
     */
    public List<String> getApiDownloadCouponV1PromotionPromotionIdVendoritems(Long promotionId) throws ApiException {
        return this.getApiDownloadCouponV1PromotionPromotionIdVendoritems(promotionId, null);
    }
}
