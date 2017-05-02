package com.coupang.apigateway.services.api_manager;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.api_manager.model.RegressionTestDo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.146+09:00")
@org.springframework.stereotype.Component
public class ApimanagerApiRegressionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ApimanagerApiRegressionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("api_manager");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 
     * Notes : 
     * API : api_manager GET /api/regression/2/query
     * @param arg1 arg1 (required)
     * @param arg2 arg2 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f">http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f</a>
     */
    public <T> ResponseEntity<T> getApiRegression2QueryForResponseEntity(String arg1, String arg2, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'arg1' is set
        if (arg1 == null) {
            throw new ApiException(400, "Missing the required parameter 'arg1' when calling getApiRegression2Query");
        }
        
        // verify the required parameter 'arg2' is set
        if (arg2 == null) {
            throw new ApiException(400, "Missing the required parameter 'arg2' when calling getApiRegression2Query");
        }
        
        // create path and map variables
        String localVarPath = "/api/regression/2/query";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "arg1", arg1));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "arg2", arg2));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5758c6a23086cabe72b2b96f", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 
     * Notes : 
     * API : api_manager GET /api/regression/2/query
     * @param arg1 arg1 (required)
     * @param arg2 arg2 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return RegressionTestDo
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f">http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f</a>
     */
    public <T> T getApiRegression2Query(String arg1, String arg2, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiRegression2QueryForResponseEntity(arg1, arg2, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 
     * Notes : 
     * API : api_manager GET /api/regression/2/query
     * @param arg1 arg1 (required)
     * @param arg2 arg2 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return RegressionTestDo
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f">http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f</a>
     */
    public RegressionTestDo getApiRegression2Query(String arg1, String arg2, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<RegressionTestDo> localVarReturnType = new ParameterizedTypeReference<RegressionTestDo>() {};
        return this.getApiRegression2Query(arg1, arg2, localVarReturnType, customHeader);
    }

    /**
     * Summary : 
     * API : api_manager GET /api/regression/2/query
     * Notes : 
     * @param arg1 arg1(required)
     * @param arg2 arg2(required)
     * @return RegressionTestDo
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f">http://api-forge.coupang.net/details?specId=5758c6a23086cabe72b2b96f</a>
     */
    public RegressionTestDo getApiRegression2Query(String arg1, String arg2) throws ApiException {
        return this.getApiRegression2Query(arg1, arg2, null);
    }
}
