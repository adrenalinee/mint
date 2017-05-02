package com.coupang.apigateway.services.auth_session;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.auth_session.model.RestError;
import com.coupang.apigateway.services.auth_session.model.CookieInfoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
@org.springframework.stereotype.Component
public class AuthsessionApiV1CookiesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public AuthsessionApiV1CookiesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("auth_session");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : logCookieInfo
     * Notes : 
     * API : auth_session PUT /api/v1/cookies/
     * @param cookieInfoDto cookieInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59</a>
     */
    public <T> ResponseEntity<T> putApiV1CookiesForResponseEntity(CookieInfoDto cookieInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = cookieInfoDto;
        
        // verify the required parameter 'cookieInfoDto' is set
        if (cookieInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'cookieInfoDto' when calling putApiV1Cookies");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cookies/";

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

        return apiClient.invokeAPIForResponseEntity("57e0c453d35bb43c26949e59", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : logCookieInfo
     * Notes : 
     * API : auth_session PUT /api/v1/cookies/
     * @param cookieInfoDto cookieInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59</a>
     */
    public <T> T putApiV1Cookies(CookieInfoDto cookieInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putApiV1CookiesForResponseEntity(cookieInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : logCookieInfo
     * Notes : 
     * API : auth_session PUT /api/v1/cookies/
     * @param cookieInfoDto cookieInfoDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59</a>
     */
    public void putApiV1Cookies(CookieInfoDto cookieInfoDto, Map<String, String> customHeader) throws ApiException {
        
        this.putApiV1Cookies(cookieInfoDto, null, customHeader);
    }

    /**
     * Summary : logCookieInfo
     * API : auth_session PUT /api/v1/cookies/
     * Notes : 
     * @param cookieInfoDto cookieInfoDto(required)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e59</a>
     */
    public void putApiV1Cookies(CookieInfoDto cookieInfoDto) throws ApiException {
        this.putApiV1Cookies(cookieInfoDto, null);
    }
}
