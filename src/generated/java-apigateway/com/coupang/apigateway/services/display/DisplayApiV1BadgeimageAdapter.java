package com.coupang.apigateway.services.display;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import java.util.Map;
import com.coupang.apigateway.services.display.model.BadgeImage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
@org.springframework.stereotype.Component
public class DisplayApiV1BadgeimageAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DisplayApiV1BadgeimageAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("display");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/badgeimage/getbadgeimages/{badgeImageOs}/{badgeImageDomain}
     * @param badgeImageDomain badgeImageDomain (required)
     * @param badgeImageOs badgeImageOs (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3">http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3</a>
     */
    public <T> ResponseEntity<T> getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomainForResponseEntity(String badgeImageDomain, String badgeImageOs, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'badgeImageDomain' is set
        if (badgeImageDomain == null) {
            throw new ApiException(400, "Missing the required parameter 'badgeImageDomain' when calling getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain");
        }
        
        // verify the required parameter 'badgeImageOs' is set
        if (badgeImageOs == null) {
            throw new ApiException(400, "Missing the required parameter 'badgeImageOs' when calling getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/badgeimage/getbadgeimages/{badgeImageOs}/{badgeImageDomain}"
            .replaceAll("\\{" + "badgeImageDomain" + "\\}", badgeImageDomain.toString())
            .replaceAll("\\{" + "badgeImageOs" + "\\}", badgeImageOs.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58d1e3ca6eb51666325389e3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/badgeimage/getbadgeimages/{badgeImageOs}/{badgeImageDomain}
     * @param badgeImageDomain badgeImageDomain (required)
     * @param badgeImageOs badgeImageOs (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, BadgeImage>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3">http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3</a>
     */
    public <T> T getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain(String badgeImageDomain, String badgeImageOs, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomainForResponseEntity(badgeImageDomain, badgeImageOs, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/badgeimage/getbadgeimages/{badgeImageOs}/{badgeImageDomain}
     * @param badgeImageDomain badgeImageDomain (required)
     * @param badgeImageOs badgeImageOs (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, Map<String, BadgeImage>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3">http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3</a>
     */
    public Map<String, Map<String, BadgeImage>> getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain(String badgeImageDomain, String badgeImageOs, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, Map<String, BadgeImage>>> localVarReturnType = new ParameterizedTypeReference<Map<String, Map<String, BadgeImage>>>() {};
        return this.getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain(badgeImageDomain, badgeImageOs, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * API : display GET /api/v1/badgeimage/getbadgeimages/{badgeImageOs}/{badgeImageDomain}
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * @param badgeImageDomain badgeImageDomain(required)
     * @param badgeImageOs badgeImageOs(required)
     * @param baseDateTime baseDateTime(optional)
     * @return Map<String, Map<String, BadgeImage>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3">http://api-forge.coupang.net/details?specId=58d1e3ca6eb51666325389e3</a>
     */
    public Map<String, Map<String, BadgeImage>> getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain(String badgeImageDomain, String badgeImageOs, String baseDateTime) throws ApiException {
        return this.getApiV1BadgeimageGetbadgeimagesBadgeImageOsBadgeImageDomain(badgeImageDomain, badgeImageOs, baseDateTime, null);
    }
}
