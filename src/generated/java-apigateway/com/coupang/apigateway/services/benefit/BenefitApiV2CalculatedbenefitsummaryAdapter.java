package com.coupang.apigateway.services.benefit;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.benefit.model.IntegratedBenefitInfoDTO;
import com.coupang.apigateway.services.benefit.model.SummaryItemForm;
import java.util.*;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
@org.springframework.stereotype.Component
public class BenefitApiV2CalculatedbenefitsummaryAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BenefitApiV2CalculatedbenefitsummaryAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("benefit");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Returns calculated benefit summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-all
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6</a>
     */
    public <T> ResponseEntity<T> postApiV2CalculatedBenefitSummaryFindAllForResponseEntity(List<SummaryItemForm> forms, String agentType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = forms;
        
        // verify the required parameter 'forms' is set
        if (forms == null) {
            throw new ApiException(400, "Missing the required parameter 'forms' when calling postApiV2CalculatedBenefitSummaryFindAll");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/calculated-benefit-summary/find-all";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "agentType", agentType));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58dcb241ea7eac51bcc785d6", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Returns calculated benefit summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-all
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6</a>
     */
    public <T> T postApiV2CalculatedBenefitSummaryFindAll(List<SummaryItemForm> forms, String agentType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2CalculatedBenefitSummaryFindAllForResponseEntity(forms, agentType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Returns calculated benefit summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-all
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6</a>
     */
    public Map<String, Map<String, IntegratedBenefitInfoDTO>> postApiV2CalculatedBenefitSummaryFindAll(List<SummaryItemForm> forms, String agentType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, Map<String, IntegratedBenefitInfoDTO>>> localVarReturnType = new ParameterizedTypeReference<Map<String, Map<String, IntegratedBenefitInfoDTO>>>() {};
        return this.postApiV2CalculatedBenefitSummaryFindAll(forms, agentType, localVarReturnType, customHeader);
    }

    /**
     * Summary : Returns calculated benefit summary with price and quantity.
     * API : benefit POST /api/v2/calculated-benefit-summary/find-all
     * Notes : 
     * @param forms forms(required)
     * @param agentType agentType(optional, default to WEB)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d6</a>
     */
    public Map<String, Map<String, IntegratedBenefitInfoDTO>> postApiV2CalculatedBenefitSummaryFindAll(List<SummaryItemForm> forms, String agentType) throws ApiException {
        return this.postApiV2CalculatedBenefitSummaryFindAll(forms, agentType, null);
    }
    /**
     * Summary : Returns calculated benefit optimized summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-optimized
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1</a>
     */
    public <T> ResponseEntity<T> postApiV2CalculatedBenefitSummaryFindOptimizedForResponseEntity(List<SummaryItemForm> forms, String agentType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = forms;
        
        // verify the required parameter 'forms' is set
        if (forms == null) {
            throw new ApiException(400, "Missing the required parameter 'forms' when calling postApiV2CalculatedBenefitSummaryFindOptimized");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/calculated-benefit-summary/find-optimized";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "agentType", agentType));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58dcb241ea7eac51bcc785d1", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Returns calculated benefit optimized summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-optimized
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1</a>
     */
    public <T> T postApiV2CalculatedBenefitSummaryFindOptimized(List<SummaryItemForm> forms, String agentType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2CalculatedBenefitSummaryFindOptimizedForResponseEntity(forms, agentType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Returns calculated benefit optimized summary with price and quantity.
     * Notes : 
     * API : benefit POST /api/v2/calculated-benefit-summary/find-optimized
     * @param forms forms (required)
     * @param agentType agentType (optional, default to WEB)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1</a>
     */
    public Map<String, Map<String, IntegratedBenefitInfoDTO>> postApiV2CalculatedBenefitSummaryFindOptimized(List<SummaryItemForm> forms, String agentType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, Map<String, IntegratedBenefitInfoDTO>>> localVarReturnType = new ParameterizedTypeReference<Map<String, Map<String, IntegratedBenefitInfoDTO>>>() {};
        return this.postApiV2CalculatedBenefitSummaryFindOptimized(forms, agentType, localVarReturnType, customHeader);
    }

    /**
     * Summary : Returns calculated benefit optimized summary with price and quantity.
     * API : benefit POST /api/v2/calculated-benefit-summary/find-optimized
     * Notes : 
     * @param forms forms(required)
     * @param agentType agentType(optional, default to WEB)
     * @return Map<String, Map<String, IntegratedBenefitInfoDTO>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1">http://api-forge.coupang.net/details?specId=58dcb241ea7eac51bcc785d1</a>
     */
    public Map<String, Map<String, IntegratedBenefitInfoDTO>> postApiV2CalculatedBenefitSummaryFindOptimized(List<SummaryItemForm> forms, String agentType) throws ApiException {
        return this.postApiV2CalculatedBenefitSummaryFindOptimized(forms, agentType, null);
    }
}
