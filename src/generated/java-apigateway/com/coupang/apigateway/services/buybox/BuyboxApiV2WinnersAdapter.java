package com.coupang.apigateway.services.buybox;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.buybox.model.WinnerDto;

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
public class BuyboxApiV2WinnersAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BuyboxApiV2WinnersAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("buybox");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Find winners open API
     * Notes : To find winners by given predicate
     * API : buybox GET /api/v2/winners
     * @param productIds  (optional)
     * @param itemIds  (optional)
     * @param packageTypes  (optional)
     * @param page  (optional)
     * @param size  (optional)
     * @param channel  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58637860c131e1a998554767">http://api-forge.coupang.net/details?specId=58637860c131e1a998554767</a>
     */
    public <T> ResponseEntity<T> getApiV2WinnersForResponseEntity(List<Long> productIds, List<Long> itemIds, List<String> packageTypes, Integer page, Integer size, String channel, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/winners";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "productIds", productIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "itemIds", itemIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "packageTypes", packageTypes));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58637860c131e1a998554767", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Find winners open API
     * Notes : To find winners by given predicate
     * API : buybox GET /api/v2/winners
     * @param productIds  (optional)
     * @param itemIds  (optional)
     * @param packageTypes  (optional)
     * @param page  (optional)
     * @param size  (optional)
     * @param channel  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, WinnerDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58637860c131e1a998554767">http://api-forge.coupang.net/details?specId=58637860c131e1a998554767</a>
     */
    public <T> T getApiV2Winners(List<Long> productIds, List<Long> itemIds, List<String> packageTypes, Integer page, Integer size, String channel, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WinnersForResponseEntity(productIds, itemIds, packageTypes, page, size, channel, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Find winners open API
     * Notes : To find winners by given predicate
     * API : buybox GET /api/v2/winners
     * @param productIds  (optional)
     * @param itemIds  (optional)
     * @param packageTypes  (optional)
     * @param page  (optional)
     * @param size  (optional)
     * @param channel  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, WinnerDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58637860c131e1a998554767">http://api-forge.coupang.net/details?specId=58637860c131e1a998554767</a>
     */
    public Map<Long, WinnerDto> getApiV2Winners(List<Long> productIds, List<Long> itemIds, List<String> packageTypes, Integer page, Integer size, String channel, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, WinnerDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, WinnerDto>>() {};
        return this.getApiV2Winners(productIds, itemIds, packageTypes, page, size, channel, localVarReturnType, customHeader);
    }

    /**
     * Summary : Find winners open API
     * API : buybox GET /api/v2/winners
     * Notes : To find winners by given predicate
     * @param productIds (optional)
     * @param itemIds (optional)
     * @param packageTypes (optional)
     * @param page (optional)
     * @param size (optional)
     * @param channel (optional)
     * @return Map<Long, WinnerDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58637860c131e1a998554767">http://api-forge.coupang.net/details?specId=58637860c131e1a998554767</a>
     */
    public Map<Long, WinnerDto> getApiV2Winners(List<Long> productIds, List<Long> itemIds, List<String> packageTypes, Integer page, Integer size, String channel) throws ApiException {
        return this.getApiV2Winners(productIds, itemIds, packageTypes, page, size, channel, null);
    }
}
