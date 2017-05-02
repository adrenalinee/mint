package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import java.util.*;
import com.coupang.apigateway.services.rss.model.PlaceDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
@org.springframework.stereotype.Component
public class RssApiV1DisplaydetailsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssApiV1DisplaydetailsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findPlaces
     * Notes : 
     * API : rss GET /api/v1/displaydetails/places.pang
     * @param coupangSrls coupangSrls (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailsPlacesPangForResponseEntity(List<Long> coupangSrls, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrls' is set
        if (coupangSrls == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrls' when calling getApiV1DisplaydetailsPlacesPang");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetails/places.pang";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "coupangSrls", coupangSrls));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34680d35bb43c26949f29", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findPlaces
     * Notes : 
     * API : rss GET /api/v1/displaydetails/places.pang
     * @param coupangSrls coupangSrls (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29</a>
     */
    public <T> T getApiV1DisplaydetailsPlacesPang(List<Long> coupangSrls, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailsPlacesPangForResponseEntity(coupangSrls, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findPlaces
     * Notes : 
     * API : rss GET /api/v1/displaydetails/places.pang
     * @param coupangSrls coupangSrls (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29</a>
     */
    public Map<String, List<PlaceDto>> getApiV1DisplaydetailsPlacesPang(List<Long> coupangSrls, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, List<PlaceDto>>> localVarReturnType = new ParameterizedTypeReference<Map<String, List<PlaceDto>>>() {};
        return this.getApiV1DisplaydetailsPlacesPang(coupangSrls, localVarReturnType, customHeader);
    }

    /**
     * Summary : findPlaces
     * API : rss GET /api/v1/displaydetails/places.pang
     * Notes : 
     * @param coupangSrls coupangSrls(required)
     * @return Map<String, List<PlaceDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f29</a>
     */
    public Map<String, List<PlaceDto>> getApiV1DisplaydetailsPlacesPang(List<Long> coupangSrls) throws ApiException {
        return this.getApiV1DisplaydetailsPlacesPang(coupangSrls, null);
    }
}
