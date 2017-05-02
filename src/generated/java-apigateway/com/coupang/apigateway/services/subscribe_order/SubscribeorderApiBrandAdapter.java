package com.coupang.apigateway.services.subscribe_order;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.subscribe_order.model.BrandsResponseDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.238+09:00")
@org.springframework.stereotype.Component
public class SubscribeorderApiBrandAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SubscribeorderApiBrandAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("subscribe_order");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : fetchBrandList
     * Notes : 
     * API : subscribe_order GET /api/brand/list
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d">http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d</a>
     */
    public <T> ResponseEntity<T> getApiBrandListForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/brand/list";

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

        return apiClient.invokeAPIForResponseEntity("57904fe6f9e8106653cf3d9d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : fetchBrandList
     * Notes : 
     * API : subscribe_order GET /api/brand/list
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d">http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d</a>
     */
    public <T> T getApiBrandList(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiBrandListForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : fetchBrandList
     * Notes : 
     * API : subscribe_order GET /api/brand/list
     * @param customHeader customHeaderMap (nullable)
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d">http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d</a>
     */
    public BrandsResponseDTO getApiBrandList(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandsResponseDTO> localVarReturnType = new ParameterizedTypeReference<BrandsResponseDTO>() {};
        return this.getApiBrandList(localVarReturnType, customHeader);
    }

    /**
     * Summary : fetchBrandList
     * API : subscribe_order GET /api/brand/list
     * Notes : 
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d">http://api-forge.coupang.net/details?specId=57904fe6f9e8106653cf3d9d</a>
     */
    public BrandsResponseDTO getApiBrandList() throws ApiException {
        return this.getApiBrandList(null);
    }
}
