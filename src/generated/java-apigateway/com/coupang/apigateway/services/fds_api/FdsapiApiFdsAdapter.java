package com.coupang.apigateway.services.fds_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.fds_api.model.FraudDetectorRequestOfPurchaseRequestDTO;
import com.coupang.apigateway.services.fds_api.model.PurchaseResponseDTOWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
@org.springframework.stereotype.Component
public class FdsapiApiFdsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public FdsapiApiFdsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("fds_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : purchaseValidation
     * Notes : 
     * API : fds_api POST /api/fds/v1/purchaseValidation
     * @param fraudDetectorRequest fraudDetectorRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55">http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55</a>
     */
    public <T> ResponseEntity<T> postApiFdsV1PurchaseValidationForResponseEntity(FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = fraudDetectorRequest;
        
        // verify the required parameter 'fraudDetectorRequest' is set
        if (fraudDetectorRequest == null) {
            throw new ApiException(400, "Missing the required parameter 'fraudDetectorRequest' when calling postApiFdsV1PurchaseValidation");
        }
        
        // create path and map variables
        String localVarPath = "/api/fds/v1/purchaseValidation";

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

        return apiClient.invokeAPIForResponseEntity("57ec74850b3b294253024b55", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : purchaseValidation
     * Notes : 
     * API : fds_api POST /api/fds/v1/purchaseValidation
     * @param fraudDetectorRequest fraudDetectorRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PurchaseResponseDTOWrapper
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55">http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55</a>
     */
    public <T> T postApiFdsV1PurchaseValidation(FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiFdsV1PurchaseValidationForResponseEntity(fraudDetectorRequest, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : purchaseValidation
     * Notes : 
     * API : fds_api POST /api/fds/v1/purchaseValidation
     * @param fraudDetectorRequest fraudDetectorRequest (required)
     * @param customHeader customHeaderMap (nullable)
     * @return PurchaseResponseDTOWrapper
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55">http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55</a>
     */
    public PurchaseResponseDTOWrapper postApiFdsV1PurchaseValidation(FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequest, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PurchaseResponseDTOWrapper> localVarReturnType = new ParameterizedTypeReference<PurchaseResponseDTOWrapper>() {};
        return this.postApiFdsV1PurchaseValidation(fraudDetectorRequest, localVarReturnType, customHeader);
    }

    /**
     * Summary : purchaseValidation
     * API : fds_api POST /api/fds/v1/purchaseValidation
     * Notes : 
     * @param fraudDetectorRequest fraudDetectorRequest(required)
     * @return PurchaseResponseDTOWrapper
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55">http://api-forge.coupang.net/details?specId=57ec74850b3b294253024b55</a>
     */
    public PurchaseResponseDTOWrapper postApiFdsV1PurchaseValidation(FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequest) throws ApiException {
        return this.postApiFdsV1PurchaseValidation(fraudDetectorRequest, null);
    }
}
