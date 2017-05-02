package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.BasisMemberDTO;
import com.coupang.apigateway.services.member_api.model.FullMemberDTO;

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
public class MemberapiV1MembersAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1MembersAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/basis/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22</a>
     */
    public <T> ResponseEntity<T> getV1MembersDtoTypeBasisMemberIdForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getV1MembersDtoTypeBasisMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/members/dtoType/basis/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27c22", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/basis/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BasisMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22</a>
     */
    public <T> T getV1MembersDtoTypeBasisMemberId(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1MembersDtoTypeBasisMemberIdForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/basis/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BasisMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22</a>
     */
    public BasisMemberDTO getV1MembersDtoTypeBasisMemberId(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BasisMemberDTO> localVarReturnType = new ParameterizedTypeReference<BasisMemberDTO>() {};
        return this.getV1MembersDtoTypeBasisMemberId(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * API : member_api GET /v1/members/dtoType/basis/{memberId}
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * @param memberId 회원 아이디(required)
     * @return BasisMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c22</a>
     */
    public BasisMemberDTO getV1MembersDtoTypeBasisMemberId(String memberId) throws ApiException {
        return this.getV1MembersDtoTypeBasisMemberId(memberId, null);
    }
    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/full/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27</a>
     */
    public <T> ResponseEntity<T> getV1MembersDtoTypeFullMemberIdForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getV1MembersDtoTypeFullMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/members/dtoType/full/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27c27", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/full/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return FullMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27</a>
     */
    public <T> T getV1MembersDtoTypeFullMemberId(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1MembersDtoTypeFullMemberIdForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * API : member_api GET /v1/members/dtoType/full/{memberId}
     * @param memberId 회원 아이디 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return FullMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27</a>
     */
    public FullMemberDTO getV1MembersDtoTypeFullMemberId(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<FullMemberDTO> localVarReturnType = new ParameterizedTypeReference<FullMemberDTO>() {};
        return this.getV1MembersDtoTypeFullMemberId(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : memberId 에 해당하는 회원정보 조회
     * API : member_api GET /v1/members/dtoType/full/{memberId}
     * Notes : memberId 에 해당하는 회원정보 조회정회원일 경우 BasisMemberDTO.memberType=REGULAR, 구독회원일 경우 SUBSCRIBE, 탈퇴회원일 경우 SECESSION, 장기미이용회원일 경우 DORMANT 탈퇴회원일 경우도 NULL 을 반환하지 않지만 발급된적 없는 회원번호를 넘길 경우 NULL 반환(ex: memberId 가 음수일 경우, 100억 이상일 경우)
     * @param memberId 회원 아이디(required)
     * @return FullMemberDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27c27</a>
     */
    public FullMemberDTO getV1MembersDtoTypeFullMemberId(String memberId) throws ApiException {
        return this.getV1MembersDtoTypeFullMemberId(memberId, null);
    }
    /**
     * Summary : email 에 해당하는 회원 아이디 조회
     * Notes : email 에 해당하는 회원 아이디 조회
     * API : member_api GET /v1/members/email/{email}/
     * @param email 회원 이메일 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c</a>
     */
    public <T> ResponseEntity<T> getV1MembersEmailEmailForResponseEntity(String email, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException(400, "Missing the required parameter 'email' when calling getV1MembersEmailEmail");
        }
        
        // create path and map variables
        String localVarPath = "/v1/members/email/{email}/"
            .replaceAll("\\{" + "email" + "\\}", email.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c2c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : email 에 해당하는 회원 아이디 조회
     * Notes : email 에 해당하는 회원 아이디 조회
     * API : member_api GET /v1/members/email/{email}/
     * @param email 회원 이메일 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c</a>
     */
    public <T> T getV1MembersEmailEmail(String email, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1MembersEmailEmailForResponseEntity(email, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : email 에 해당하는 회원 아이디 조회
     * Notes : email 에 해당하는 회원 아이디 조회
     * API : member_api GET /v1/members/email/{email}/
     * @param email 회원 이메일 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c</a>
     */
    public String getV1MembersEmailEmail(String email, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return this.getV1MembersEmailEmail(email, localVarReturnType, customHeader);
    }

    /**
     * Summary : email 에 해당하는 회원 아이디 조회
     * API : member_api GET /v1/members/email/{email}/
     * Notes : email 에 해당하는 회원 아이디 조회
     * @param email 회원 이메일(required)
     * @return String
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c2c</a>
     */
    public String getV1MembersEmailEmail(String email) throws ApiException {
        return this.getV1MembersEmailEmail(email, null);
    }
}
