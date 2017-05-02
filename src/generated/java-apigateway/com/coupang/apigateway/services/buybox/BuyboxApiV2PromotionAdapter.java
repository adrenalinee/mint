package com.coupang.apigateway.services.buybox;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.buybox.model.PromotionDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.784+09:00")
@org.springframework.stereotype.Component
public class BuyboxApiV2PromotionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BuyboxApiV2PromotionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("buybox");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findRecommendation
     * Notes : 
     * API : buybox GET /api/v2/promotion
     * @param itemIds  (optional)
     * @param channel  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38">http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38</a>
     */
    public <T> ResponseEntity<T> getApiV2PromotionForResponseEntity(List<Long> itemIds, String channel, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/promotion";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "itemIds", itemIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("587f0f3d47d2bf7f45142e38", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findRecommendation
     * Notes : 
     * API : buybox GET /api/v2/promotion
     * @param itemIds  (optional)
     * @param channel  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PromotionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38">http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38</a>
     */
    public <T> T getApiV2Promotion(List<Long> itemIds, String channel, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2PromotionForResponseEntity(itemIds, channel, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findRecommendation
     * Notes : 
     * API : buybox GET /api/v2/promotion
     * @param itemIds  (optional)
     * @param channel  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PromotionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38">http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38</a>
     */
    public Map<Long, PromotionDto> getApiV2Promotion(List<Long> itemIds, String channel, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, PromotionDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, PromotionDto>>() {};
        return this.getApiV2Promotion(itemIds, channel, localVarReturnType, customHeader);
    }

    /**
     * Summary : findRecommendation
     * API : buybox GET /api/v2/promotion
     * Notes : 
     * @param itemIds (optional)
     * @param channel (optional)
     * @return Map<Long, PromotionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38">http://api-forge.coupang.net/details?specId=587f0f3d47d2bf7f45142e38</a>
     */
    public Map<Long, PromotionDto> getApiV2Promotion(List<Long> itemIds, String channel) throws ApiException {
        return this.getApiV2Promotion(itemIds, channel, null);
    }
}
