package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.ReviewHomeTemplateDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
@org.springframework.stereotype.Component
public class ProductreviewApiV1ReviewhomeAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1ReviewhomeAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : reviewHomeTemplate
     * Notes : 
     * API : product_review GET /api/v1/reviewhome/template
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518</a>
     */
    public <T> ResponseEntity<T> getApiV1ReviewhomeTemplateForResponseEntity(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/reviewhome/template";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("580dd2a54982e9a7c61e1518", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : reviewHomeTemplate
     * Notes : 
     * API : product_review GET /api/v1/reviewhome/template
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHomeTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518</a>
     */
    public <T> T getApiV1ReviewhomeTemplate(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1ReviewhomeTemplateForResponseEntity(xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : reviewHomeTemplate
     * Notes : 
     * API : product_review GET /api/v1/reviewhome/template
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return ReviewHomeTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518</a>
     */
    public ReviewHomeTemplateDto getApiV1ReviewhomeTemplate(String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReviewHomeTemplateDto> localVarReturnType = new ParameterizedTypeReference<ReviewHomeTemplateDto>() {};
        return this.getApiV1ReviewhomeTemplate(xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : reviewHomeTemplate
     * API : product_review GET /api/v1/reviewhome/template
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(optional)
     * @return ReviewHomeTemplateDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518">http://api-forge.coupang.net/details?specId=580dd2a54982e9a7c61e1518</a>
     */
    public ReviewHomeTemplateDto getApiV1ReviewhomeTemplate(String xMemberId) throws ApiException {
        return this.getApiV1ReviewhomeTemplate(xMemberId, null);
    }
}
