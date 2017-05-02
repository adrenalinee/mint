package com.coupang.apigateway.services.subscribe_order;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.subscribe_order.model.BrandsResponseDTO;
import com.coupang.apigateway.services.subscribe_order.model.FetchBrandListRequestDTO;

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
public class SubscribeorderApiBannerAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SubscribeorderApiBannerAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("subscribe_order");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : (summary) : retrieve sns banner list by request parameters
     * Notes : (notes) : Returns null of content if no record found
     * API : subscribe_order POST /api/banner/list
     * @param fetchBrandListRequestDTO fetchBrandListRequestDTO (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1">http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1</a>
     */
    public <T> ResponseEntity<T> postApiBannerListForResponseEntity(FetchBrandListRequestDTO fetchBrandListRequestDTO, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = fetchBrandListRequestDTO;
        
        // verify the required parameter 'fetchBrandListRequestDTO' is set
        if (fetchBrandListRequestDTO == null) {
            throw new ApiException(400, "Missing the required parameter 'fetchBrandListRequestDTO' when calling postApiBannerList");
        }
        
        // create path and map variables
        String localVarPath = "/api/banner/list";

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

        return apiClient.invokeAPIForResponseEntity("58be46f5f3f7be5202d8f0d1", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : (summary) : retrieve sns banner list by request parameters
     * Notes : (notes) : Returns null of content if no record found
     * API : subscribe_order POST /api/banner/list
     * @param fetchBrandListRequestDTO fetchBrandListRequestDTO (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1">http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1</a>
     */
    public <T> T postApiBannerList(FetchBrandListRequestDTO fetchBrandListRequestDTO, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiBannerListForResponseEntity(fetchBrandListRequestDTO, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : (summary) : retrieve sns banner list by request parameters
     * Notes : (notes) : Returns null of content if no record found
     * API : subscribe_order POST /api/banner/list
     * @param fetchBrandListRequestDTO fetchBrandListRequestDTO (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1">http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1</a>
     */
    public BrandsResponseDTO postApiBannerList(FetchBrandListRequestDTO fetchBrandListRequestDTO, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BrandsResponseDTO> localVarReturnType = new ParameterizedTypeReference<BrandsResponseDTO>() {};
        return this.postApiBannerList(fetchBrandListRequestDTO, localVarReturnType, customHeader);
    }

    /**
     * Summary : (summary) : retrieve sns banner list by request parameters
     * API : subscribe_order POST /api/banner/list
     * Notes : (notes) : Returns null of content if no record found
     * @param fetchBrandListRequestDTO fetchBrandListRequestDTO(required)
     * @return BrandsResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1">http://api-forge.coupang.net/details?specId=58be46f5f3f7be5202d8f0d1</a>
     */
    public BrandsResponseDTO postApiBannerList(FetchBrandListRequestDTO fetchBrandListRequestDTO) throws ApiException {
        return this.postApiBannerList(fetchBrandListRequestDTO, null);
    }
}
