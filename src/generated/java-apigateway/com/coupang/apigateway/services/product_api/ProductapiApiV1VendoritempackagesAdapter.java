package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import java.util.*;
import com.coupang.apigateway.services.product_api.model.PlaceDto;

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
public class ProductapiApiV1VendoritempackagesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1VendoritempackagesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getPlaceDto
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackages/{ids}/places
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritempackagesIdsPlacesForResponseEntity(String ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getApiV1VendoritempackagesIdsPlaces");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritempackages/{ids}/places"
            .replaceAll("\\{" + "ids" + "\\}", ids.toString());

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

        return apiClient.invokeAPIForResponseEntity("57a427ec00f952f2d5ecd6d3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getPlaceDto
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackages/{ids}/places
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3</a>
     */
    public <T> T getApiV1VendoritempackagesIdsPlaces(String ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritempackagesIdsPlacesForResponseEntity(ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getPlaceDto
     * Notes : 
     * API : product_api GET /api/v1/vendoritempackages/{ids}/places
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3</a>
     */
    public Map<Long, List<PlaceDto>> getApiV1VendoritempackagesIdsPlaces(String ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, List<PlaceDto>>> localVarReturnType = new ParameterizedTypeReference<Map<Long, List<PlaceDto>>>() {};
        return this.getApiV1VendoritempackagesIdsPlaces(ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getPlaceDto
     * API : product_api GET /api/v1/vendoritempackages/{ids}/places
     * Notes : 
     * @param ids ids(required)
     * @return Map<Long, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3">http://api-forge.coupang.net/details?specId=57a427ec00f952f2d5ecd6d3</a>
     */
    public Map<Long, List<PlaceDto>> getApiV1VendoritempackagesIdsPlaces(String ids) throws ApiException {
        return this.getApiV1VendoritempackagesIdsPlaces(ids, null);
    }
}
