package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.VendorItemDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
@org.springframework.stereotype.Component
public class ProductapiApiV1VendoritempackageAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1VendoritempackageAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackage/{id}/vendoritems
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritempackageIdVendoritemsForResponseEntity(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getApiV1VendoritempackageIdVendoritems");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritempackage/{id}/vendoritems"
            .replaceAll("\\{" + "id" + "\\}", id.toString());

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

        return apiClient.invokeAPIForResponseEntity("57a427ec00f952f2d5ecd6a6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackage/{id}/vendoritems
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6</a>
     */
    public <T> T getApiV1VendoritempackageIdVendoritems(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritempackageIdVendoritemsForResponseEntity(id, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackage/{id}/vendoritems
     * @param id id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6</a>
     */
    public List<VendorItemDTO> getApiV1VendoritempackageIdVendoritems(Long id, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<VendorItemDTO>> localVarReturnType = new ParameterizedTypeReference<List<VendorItemDTO>>() {};
        return this.getApiV1VendoritempackageIdVendoritems(id, localVarReturnType, customHeader);
    }

    /**
     * Summary : getVendorItems
     * API : product_api GET /api/v1/vendoritempackage/{id}/vendoritems
     * Notes : 
     * @param id id(required)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6a6</a>
     */
    public List<VendorItemDTO> getApiV1VendoritempackageIdVendoritems(Long id) throws ApiException {
        return this.getApiV1VendoritempackageIdVendoritems(id, null);
    }
}
