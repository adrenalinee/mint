package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.DeliveryDetailsDTO;

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
public class MemberapiV1DeliverydetailAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1DeliverydetailAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliverydetail/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0</a>
     */
    public <T> ResponseEntity<T> getV1DeliverydetailMemberIdMainForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getV1DeliverydetailMemberIdMain");
        }
        
        // create path and map variables
        String localVarPath = "/v1/deliverydetail/{memberId}/main"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27bf0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliverydetail/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailsDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0</a>
     */
    public <T> T getV1DeliverydetailMemberIdMain(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1DeliverydetailMemberIdMainForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * Notes : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliverydetail/{memberId}/main
     * @param memberId 회원 아이디 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailsDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0</a>
     */
    public DeliveryDetailsDTO getV1DeliverydetailMemberIdMain(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DeliveryDetailsDTO> localVarReturnType = new ParameterizedTypeReference<DeliveryDetailsDTO>() {};
        return this.getV1DeliverydetailMemberIdMain(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 회원의 메인 배송지 정보를 조회
     * API : member_api GET /v1/deliverydetail/{memberId}/main
     * Notes : 회원의 메인 배송지 정보를 조회
     * @param memberId 회원 아이디(required)
     * @return DeliveryDetailsDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27bf0</a>
     */
    public DeliveryDetailsDTO getV1DeliverydetailMemberIdMain(String memberId) throws ApiException {
        return this.getV1DeliverydetailMemberIdMain(memberId, null);
    }
}
