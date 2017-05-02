package com.coupang.apigateway.services.identity_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.identity_api.model.DeliveryDetailsSignificantDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
@org.springframework.stereotype.Component
public class IdentityapiApiV1DeliverydetailAdapter {

    private final ApiClient apiClient;

    @Autowired
    public IdentityapiApiV1DeliverydetailAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("identity_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 주요배송지 조회
     * Notes : 사용자의 주요배송지(기본배송지, 최근배송지)를 조회한다. 결과에는 배송요청사항이 포함되어있다.
     * API : identity_api GET /api/v1/deliverydetail/{memberId}/significant
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf">http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf</a>
     */
    public <T> ResponseEntity<T> getApiV1DeliverydetailMemberIdSignificantForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiV1DeliverydetailMemberIdSignificant");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/deliverydetail/{memberId}/significant"
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

        return apiClient.invokeAPIForResponseEntity("58cb863e3a7d515329769bdf", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 주요배송지 조회
     * Notes : 사용자의 주요배송지(기본배송지, 최근배송지)를 조회한다. 결과에는 배송요청사항이 포함되어있다.
     * API : identity_api GET /api/v1/deliverydetail/{memberId}/significant
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailsSignificantDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf">http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf</a>
     */
    public <T> T getApiV1DeliverydetailMemberIdSignificant(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DeliverydetailMemberIdSignificantForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 주요배송지 조회
     * Notes : 사용자의 주요배송지(기본배송지, 최근배송지)를 조회한다. 결과에는 배송요청사항이 포함되어있다.
     * API : identity_api GET /api/v1/deliverydetail/{memberId}/significant
     * @param memberId 회원 아이디 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDetailsSignificantDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf">http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf</a>
     */
    public DeliveryDetailsSignificantDTO getApiV1DeliverydetailMemberIdSignificant(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DeliveryDetailsSignificantDTO> localVarReturnType = new ParameterizedTypeReference<DeliveryDetailsSignificantDTO>() {};
        return this.getApiV1DeliverydetailMemberIdSignificant(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 주요배송지 조회
     * API : identity_api GET /api/v1/deliverydetail/{memberId}/significant
     * Notes : 사용자의 주요배송지(기본배송지, 최근배송지)를 조회한다. 결과에는 배송요청사항이 포함되어있다.
     * @param memberId 회원 아이디(required)
     * @return DeliveryDetailsSignificantDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf">http://api-forge.coupang.net/details?specId=58cb863e3a7d515329769bdf</a>
     */
    public DeliveryDetailsSignificantDTO getApiV1DeliverydetailMemberIdSignificant(String memberId) throws ApiException {
        return this.getApiV1DeliverydetailMemberIdSignificant(memberId, null);
    }
}
