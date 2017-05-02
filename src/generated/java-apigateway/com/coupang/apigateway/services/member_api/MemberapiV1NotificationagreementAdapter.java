package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.NotificationAgreementDto;

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
public class MemberapiV1NotificationagreementAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1NotificationagreementAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : memberId 에 수신동의타입에 대해 동의 설정
     * Notes : memberId 에 수신동의타입에 대해 동의 설정 , 기존 동의 여부 (있을 경우 변경, 없을 경우 추가)
     * API : member_api POST /v1/notificationAgreement/changeAgreement/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param notificationAgreementDto notificationAgreementDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3</a>
     */
    public <T> ResponseEntity<T> postV1NotificationAgreementChangeAgreementMemberIdForResponseEntity(String memberId, NotificationAgreementDto notificationAgreementDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = notificationAgreementDto;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling postV1NotificationAgreementChangeAgreementMemberId");
        }
        
        // verify the required parameter 'notificationAgreementDto' is set
        if (notificationAgreementDto == null) {
            throw new ApiException(400, "Missing the required parameter 'notificationAgreementDto' when calling postV1NotificationAgreementChangeAgreementMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/notificationAgreement/changeAgreement/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27cb3", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : memberId 에 수신동의타입에 대해 동의 설정
     * Notes : memberId 에 수신동의타입에 대해 동의 설정 , 기존 동의 여부 (있을 경우 변경, 없을 경우 추가)
     * API : member_api POST /v1/notificationAgreement/changeAgreement/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param notificationAgreementDto notificationAgreementDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return NotificationAgreementDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3</a>
     */
    public <T> T postV1NotificationAgreementChangeAgreementMemberId(String memberId, NotificationAgreementDto notificationAgreementDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1NotificationAgreementChangeAgreementMemberIdForResponseEntity(memberId, notificationAgreementDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : memberId 에 수신동의타입에 대해 동의 설정
     * Notes : memberId 에 수신동의타입에 대해 동의 설정 , 기존 동의 여부 (있을 경우 변경, 없을 경우 추가)
     * API : member_api POST /v1/notificationAgreement/changeAgreement/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param notificationAgreementDto notificationAgreementDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return NotificationAgreementDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3</a>
     */
    public NotificationAgreementDto postV1NotificationAgreementChangeAgreementMemberId(String memberId, NotificationAgreementDto notificationAgreementDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<NotificationAgreementDto> localVarReturnType = new ParameterizedTypeReference<NotificationAgreementDto>() {};
        return this.postV1NotificationAgreementChangeAgreementMemberId(memberId, notificationAgreementDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : memberId 에 수신동의타입에 대해 동의 설정
     * API : member_api POST /v1/notificationAgreement/changeAgreement/{memberId}
     * Notes : memberId 에 수신동의타입에 대해 동의 설정 , 기존 동의 여부 (있을 경우 변경, 없을 경우 추가)
     * @param memberId 회원 아이디(required)
     * @param notificationAgreementDto notificationAgreementDto(required)
     * @return NotificationAgreementDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb3</a>
     */
    public NotificationAgreementDto postV1NotificationAgreementChangeAgreementMemberId(String memberId, NotificationAgreementDto notificationAgreementDto) throws ApiException {
        return this.postV1NotificationAgreementChangeAgreementMemberId(memberId, notificationAgreementDto, null);
    }
    /**
     * Summary : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * Notes : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * API : member_api GET /v1/notificationAgreement/findBy/{memberId}
     * @param memberId 회원 아이디 (회원 아이디가 정회원이 아닌 경우 emptyList 반환함) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8</a>
     */
    public <T> ResponseEntity<T> getV1NotificationAgreementFindByMemberIdForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getV1NotificationAgreementFindByMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/notificationAgreement/findBy/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27cb8", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * Notes : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * API : member_api GET /v1/notificationAgreement/findBy/{memberId}
     * @param memberId 회원 아이디 (회원 아이디가 정회원이 아닌 경우 emptyList 반환함) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<NotificationAgreementDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8</a>
     */
    public <T> T getV1NotificationAgreementFindByMemberId(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1NotificationAgreementFindByMemberIdForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * Notes : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * API : member_api GET /v1/notificationAgreement/findBy/{memberId}
     * @param memberId 회원 아이디 (회원 아이디가 정회원이 아닌 경우 emptyList 반환함) (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<NotificationAgreementDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8</a>
     */
    public List<NotificationAgreementDto> getV1NotificationAgreementFindByMemberId(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<NotificationAgreementDto>> localVarReturnType = new ParameterizedTypeReference<List<NotificationAgreementDto>>() {};
        return this.getV1NotificationAgreementFindByMemberId(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * API : member_api GET /v1/notificationAgreement/findBy/{memberId}
     * Notes : memberId 에 해당하는 모든 수신동의설정 리스트 조회
     * @param memberId 회원 아이디 (회원 아이디가 정회원이 아닌 경우 emptyList 반환함)(required)
     * @return List<NotificationAgreementDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cb8</a>
     */
    public List<NotificationAgreementDto> getV1NotificationAgreementFindByMemberId(String memberId) throws ApiException {
        return this.getV1NotificationAgreementFindByMemberId(memberId, null);
    }
}
