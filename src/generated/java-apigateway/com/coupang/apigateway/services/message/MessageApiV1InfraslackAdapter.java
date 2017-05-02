package com.coupang.apigateway.services.message;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.message.model.SlackDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.171+09:00")
@org.springframework.stereotype.Component
public class MessageApiV1InfraslackAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MessageApiV1InfraslackAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("message");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : sendSlack
     * Notes : 
     * API : message POST /api/v1/infra-slack/send
     * @param slackDto slackDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d">http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d</a>
     */
    public <T> ResponseEntity<T> postApiV1InfraSlackSendForResponseEntity(SlackDto slackDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = slackDto;
        
        // verify the required parameter 'slackDto' is set
        if (slackDto == null) {
            throw new ApiException(400, "Missing the required parameter 'slackDto' when calling postApiV1InfraSlackSend");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/infra-slack/send";

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

        return apiClient.invokeAPIForResponseEntity("57708364d2b11f67bd05dc0d", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : sendSlack
     * Notes : 
     * API : message POST /api/v1/infra-slack/send
     * @param slackDto slackDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d">http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d</a>
     */
    public <T> T postApiV1InfraSlackSend(SlackDto slackDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1InfraSlackSendForResponseEntity(slackDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : sendSlack
     * Notes : 
     * API : message POST /api/v1/infra-slack/send
     * @param slackDto slackDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d">http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d</a>
     */
    public String postApiV1InfraSlackSend(SlackDto slackDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return this.postApiV1InfraSlackSend(slackDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : sendSlack
     * API : message POST /api/v1/infra-slack/send
     * Notes : 
     * @param slackDto slackDto(required)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d">http://api-forge.coupang.net/details?specId=57708364d2b11f67bd05dc0d</a>
     */
    public String postApiV1InfraSlackSend(SlackDto slackDto) throws ApiException {
        return this.postApiV1InfraSlackSend(slackDto, null);
    }
}
