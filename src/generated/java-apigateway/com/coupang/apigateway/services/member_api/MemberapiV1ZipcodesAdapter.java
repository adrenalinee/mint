package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.ZipcodeDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
@org.springframework.stereotype.Component
public class MemberapiV1ZipcodesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1ZipcodesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 우편번호를 통해 우편번호정보(지번주소) 조회
     * Notes : 우편번호를 통해 우편번호정보(지번주소) 조회
     * API : member_api GET /v1/zipcodes/{zipcode}
     * @param zipcode zipcode 우편번호 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17">http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17</a>
     */
    public <T> ResponseEntity<T> getV1ZipcodesZipcodeForResponseEntity(String zipcode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'zipcode' is set
        if (zipcode == null) {
            throw new ApiException(400, "Missing the required parameter 'zipcode' when calling getV1ZipcodesZipcode");
        }
        
        // create path and map variables
        String localVarPath = "/v1/zipcodes/{zipcode}"
            .replaceAll("\\{" + "zipcode" + "\\}", zipcode.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c1469130f2ceb27d17", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 우편번호를 통해 우편번호정보(지번주소) 조회
     * Notes : 우편번호를 통해 우편번호정보(지번주소) 조회
     * API : member_api GET /v1/zipcodes/{zipcode}
     * @param zipcode zipcode 우편번호 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ZipcodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17">http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17</a>
     */
    public <T> T getV1ZipcodesZipcode(String zipcode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1ZipcodesZipcodeForResponseEntity(zipcode, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 우편번호를 통해 우편번호정보(지번주소) 조회
     * Notes : 우편번호를 통해 우편번호정보(지번주소) 조회
     * API : member_api GET /v1/zipcodes/{zipcode}
     * @param zipcode zipcode 우편번호 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ZipcodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17">http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17</a>
     */
    public ZipcodeDto getV1ZipcodesZipcode(String zipcode, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ZipcodeDto> localVarReturnType = new ParameterizedTypeReference<ZipcodeDto>() {};
        return this.getV1ZipcodesZipcode(zipcode, localVarReturnType, customHeader);
    }

    /**
     * Summary : 우편번호를 통해 우편번호정보(지번주소) 조회
     * API : member_api GET /v1/zipcodes/{zipcode}
     * Notes : 우편번호를 통해 우편번호정보(지번주소) 조회
     * @param zipcode zipcode 우편번호(required)
     * @return ZipcodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17">http://api-forge.coupang.net/details?specId=57e8b6c1469130f2ceb27d17</a>
     */
    public ZipcodeDto getV1ZipcodesZipcode(String zipcode) throws ApiException {
        return this.getV1ZipcodesZipcode(zipcode, null);
    }
}
