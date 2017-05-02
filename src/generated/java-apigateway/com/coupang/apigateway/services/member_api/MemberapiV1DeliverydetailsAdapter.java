package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.DeliveryDetailDTO;

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
public class MemberapiV1DeliverydetailsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1DeliverydetailsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliveryDetails/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7</a>
     */
    public <T> ResponseEntity<T> getV1DeliveryDetailsMemberIdMainForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getV1DeliveryDetailsMemberIdMain");
        }
        
        // create path and map variables
        String localVarPath = "/v1/deliveryDetails/{memberId}/main"
            .replaceAll("\\{" + "memberId" + "\\}", memberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27bd7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliveryDetails/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7</a>
     */
    public <T> T getV1DeliveryDetailsMemberIdMain(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1DeliveryDetailsMemberIdMainForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliveryDetails/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7</a>
     */
    public DeliveryDetailDTO getV1DeliveryDetailsMemberIdMain(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DeliveryDetailDTO> localVarReturnType = new ParameterizedTypeReference<DeliveryDetailDTO>() {};
        return this.getV1DeliveryDetailsMemberIdMain(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliveryDetails/{memberId}/main
     * Notes : 회원의 메인 배송지 정보를 조회
     * @param memberId 회원 아이디(required)
     * @return DeliveryDetailDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bd7</a>
     */
    public DeliveryDetailDTO getV1DeliveryDetailsMemberIdMain(String memberId) throws ApiException {
        return this.getV1DeliveryDetailsMemberIdMain(memberId, null);
    }
}
