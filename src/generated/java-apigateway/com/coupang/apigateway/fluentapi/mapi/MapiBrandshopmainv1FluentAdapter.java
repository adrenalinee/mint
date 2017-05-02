package com.coupang.apigateway.fluentapi.mapi;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.fluentapi.mapi.model.BrandShopMainV1Response;
import com.coupang.apigateway.fluentapi.mapi.model.BrandShopMainV1Request;

import java.util.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.fluentapi.FluentApiCodegen", date = "2017-05-02T13:05:23.237+09:00")
@org.springframework.stereotype.Component
public class MapiBrandshopmainv1FluentAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MapiBrandshopmainv1FluentAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("mapi");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 
     * Notes : fluent api for brand shop main modules
     * API : mapi POST /v2/apis/types/FLUENT_API/5901a2db4955d6c6cc6c8925
     * @param body  (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/fluent-apis/5901a2db4955d6c6cc6c8925">http://api-forge.coupang.net/fluent-apis/?specId=5901a2db4955d6c6cc6c8925</a>
     */
    public <T> ResponseEntity<T> invokeForResponseEntity(BrandShopMainV1Request body, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling postV2ApisTypesFLUENTAPI5901a2db4955d6c6cc6c8925");
        }
        
        // create path and map variables
        String localVarPath = "/v2/apis/types/FLUENT_API/5901a2db4955d6c6cc6c8925";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        final String specId = "5901a2db4955d6c6cc6c8925";
        final String relativePath = "5901a2db4955d6c6cc6c8925";

        return apiClient.invokeAPIForResponseEntity(specId, relativePath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 
     * Notes : fluent api for brand shop main modules
     * API : mapi POST /v2/apis/types/FLUENT_API/5901a2db4955d6c6cc6c8925
     * @param body  (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopMainV1Response
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/fluent-apis/5901a2db4955d6c6cc6c8925">http://api-forge.coupang.net/fluent-apis/?specId=5901a2db4955d6c6cc6c8925</a>
     */
    public <T> T invoke(BrandShopMainV1Request body, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.invokeForResponseEntity(body, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 
     * Notes : fluent api for brand shop main modules
     * API : mapi POST /v2/apis/types/FLUENT_API/5901a2db4955d6c6cc6c8925
     * @param body  (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandShopMainV1Response
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/fluent-apis/5901a2db4955d6c6cc6c8925">http://api-forge.coupang.net/fluent-apis/?specId=5901a2db4955d6c6cc6c8925</a>
     */
    public BrandShopMainV1Response invoke(BrandShopMainV1Request body, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandShopMainV1Response> localVarReturnType = new ParameterizedTypeReference<BrandShopMainV1Response>() {};
        return this.invoke(body, localVarReturnType, customHeader);
    }

    /**
     * Summary : 
     * API : mapi POST /v2/apis/types/FLUENT_API/5901a2db4955d6c6cc6c8925
     * Notes : fluent api for brand shop main modules
     * @param body  (required)
     * @return BrandShopMainV1Response
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/fluent-apis/5901a2db4955d6c6cc6c8925">http://api-forge.coupang.net/fluent-apis/?specId=5901a2db4955d6c6cc6c8925</a>
     */
    public BrandShopMainV1Response invoke(BrandShopMainV1Request body) throws ApiException {
        return this.invoke(body, null);
    }
    
}
