package com.coupang.apigateway.services.wms_fulfillment;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentEachVIPddParamDto;
import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentEachVIPddDto;
import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentRangeQuantityPddParamDto;
import com.coupang.apigateway.services.wms_fulfillment.model.FulfillmentRangeQuantityPddDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
@org.springframework.stereotype.Component
public class WmsfulfillmentApiV2PddAdapter {

    private final ApiClient apiClient;

    @Autowired
    public WmsfulfillmentApiV2PddAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("wms_fulfillment");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : eachViPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/eachvi
     * @param fulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d</a>
     */
    public <T> ResponseEntity<T> postApiV2PddEachviForResponseEntity(FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = fulfillmentEachVIPddParamDto;
        
        // verify the required parameter 'fulfillmentEachVIPddParamDto' is set
        if (fulfillmentEachVIPddParamDto == null) {
            throw new ApiException(400, "Missing the required parameter 'fulfillmentEachVIPddParamDto' when calling postApiV2PddEachvi");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/pdd/eachvi";

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

        return apiClient.invokeAPIForResponseEntity("58a3f75f90668ca7d556683d", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : eachViPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/eachvi
     * @param fulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return FulfillmentEachVIPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d</a>
     */
    public <T> T postApiV2PddEachvi(FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2PddEachviForResponseEntity(fulfillmentEachVIPddParamDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : eachViPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/eachvi
     * @param fulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return FulfillmentEachVIPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d</a>
     */
    public FulfillmentEachVIPddDto postApiV2PddEachvi(FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<FulfillmentEachVIPddDto> localVarReturnType = new ParameterizedTypeReference<FulfillmentEachVIPddDto>() {};
        return this.postApiV2PddEachvi(fulfillmentEachVIPddParamDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : eachViPromiseDeliveryDate
     * API : wms_fulfillment POST /api/v2/pdd/eachvi
     * Notes : 
     * @param fulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto(required)
     * @return FulfillmentEachVIPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d556683d</a>
     */
    public FulfillmentEachVIPddDto postApiV2PddEachvi(FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto) throws ApiException {
        return this.postApiV2PddEachvi(fulfillmentEachVIPddParamDto, null);
    }
    /**
     * Summary : rangeQuantityPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/rangeQuantity
     * @param fulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842</a>
     */
    public <T> ResponseEntity<T> postApiV2PddRangeQuantityForResponseEntity(FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = fulfillmentRangeQuantityPddParamDto;
        
        // verify the required parameter 'fulfillmentRangeQuantityPddParamDto' is set
        if (fulfillmentRangeQuantityPddParamDto == null) {
            throw new ApiException(400, "Missing the required parameter 'fulfillmentRangeQuantityPddParamDto' when calling postApiV2PddRangeQuantity");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/pdd/rangeQuantity";

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

        return apiClient.invokeAPIForResponseEntity("58a3f75f90668ca7d5566842", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : rangeQuantityPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/rangeQuantity
     * @param fulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return FulfillmentRangeQuantityPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842</a>
     */
    public <T> T postApiV2PddRangeQuantity(FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2PddRangeQuantityForResponseEntity(fulfillmentRangeQuantityPddParamDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : rangeQuantityPromiseDeliveryDate
     * Notes : 
     * API : wms_fulfillment POST /api/v2/pdd/rangeQuantity
     * @param fulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return FulfillmentRangeQuantityPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842</a>
     */
    public FulfillmentRangeQuantityPddDto postApiV2PddRangeQuantity(FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<FulfillmentRangeQuantityPddDto> localVarReturnType = new ParameterizedTypeReference<FulfillmentRangeQuantityPddDto>() {};
        return this.postApiV2PddRangeQuantity(fulfillmentRangeQuantityPddParamDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : rangeQuantityPromiseDeliveryDate
     * API : wms_fulfillment POST /api/v2/pdd/rangeQuantity
     * Notes : 
     * @param fulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto(required)
     * @return FulfillmentRangeQuantityPddDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842">http://api-forge.coupang.net/details?specId=58a3f75f90668ca7d5566842</a>
     */
    public FulfillmentRangeQuantityPddDto postApiV2PddRangeQuantity(FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto) throws ApiException {
        return this.postApiV2PddRangeQuantity(fulfillmentRangeQuantityPddParamDto, null);
    }
}
