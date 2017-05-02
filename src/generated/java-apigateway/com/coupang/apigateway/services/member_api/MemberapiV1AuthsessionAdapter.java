package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.SessionInfoDto;
import com.coupang.apigateway.services.member_api.model.SessionMemberDto;

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
public class MemberapiV1AuthsessionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1AuthsessionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : updateSessionMember
     * Notes : 
     * API : member_api POST /v1/authSession/memberInfo/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0</a>
     */
    public <T> ResponseEntity<T> postV1AuthSessionMemberInfoMemberIdForResponseEntity(String memberId, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = sessionInfoDto;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling postV1AuthSessionMemberInfoMemberId");
        }
        
        // verify the required parameter 'sessionInfoDto' is set
        if (sessionInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionInfoDto' when calling postV1AuthSessionMemberInfoMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/authSession/memberInfo/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27ba0", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : updateSessionMember
     * Notes : 
     * API : member_api POST /v1/authSession/memberInfo/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SessionMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0</a>
     */
    public <T> T postV1AuthSessionMemberInfoMemberId(String memberId, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1AuthSessionMemberInfoMemberIdForResponseEntity(memberId, sessionInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : updateSessionMember
     * Notes : 
     * API : member_api POST /v1/authSession/memberInfo/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SessionMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0</a>
     */
    public SessionMemberDto postV1AuthSessionMemberInfoMemberId(String memberId, SessionInfoDto sessionInfoDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SessionMemberDto> localVarReturnType = new ParameterizedTypeReference<SessionMemberDto>() {};
        return this.postV1AuthSessionMemberInfoMemberId(memberId, sessionInfoDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : updateSessionMember
     * API : member_api POST /v1/authSession/memberInfo/{memberId}
     * Notes : 
     * @param memberId memberId(required)
     * @param sessionInfoDto sessionInfoDto(required)
     * @return SessionMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba0</a>
     */
    public SessionMemberDto postV1AuthSessionMemberInfoMemberId(String memberId, SessionInfoDto sessionInfoDto) throws ApiException {
        return this.postV1AuthSessionMemberInfoMemberId(memberId, sessionInfoDto, null);
    }
    /**
     * Summary : migration
     * Notes : 
     * API : member_api POST /v1/authSession/migration/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5</a>
     */
    public <T> ResponseEntity<T> postV1AuthSessionMigrationMemberIdForResponseEntity(String memberId, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = sessionInfoDto;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling postV1AuthSessionMigrationMemberId");
        }
        
        // verify the required parameter 'sessionInfoDto' is set
        if (sessionInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionInfoDto' when calling postV1AuthSessionMigrationMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/v1/authSession/migration/{memberId}"
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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27ba5", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : migration
     * Notes : 
     * API : member_api POST /v1/authSession/migration/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return SessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5</a>
     */
    public <T> T postV1AuthSessionMigrationMemberId(String memberId, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1AuthSessionMigrationMemberIdForResponseEntity(memberId, sessionInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : migration
     * Notes : 
     * API : member_api POST /v1/authSession/migration/{memberId}
     * @param memberId memberId (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return SessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5</a>
     */
    public SessionInfoDto postV1AuthSessionMigrationMemberId(String memberId, SessionInfoDto sessionInfoDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<SessionInfoDto> localVarReturnType = new ParameterizedTypeReference<SessionInfoDto>() {};
        return this.postV1AuthSessionMigrationMemberId(memberId, sessionInfoDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : migration
     * API : member_api POST /v1/authSession/migration/{memberId}
     * Notes : 
     * @param memberId memberId(required)
     * @param sessionInfoDto sessionInfoDto(required)
     * @return SessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27ba5</a>
     */
    public SessionInfoDto postV1AuthSessionMigrationMemberId(String memberId, SessionInfoDto sessionInfoDto) throws ApiException {
        return this.postV1AuthSessionMigrationMemberId(memberId, sessionInfoDto, null);
    }
    /**
     * Summary : expire
     * Notes : 
     * API : member_api PUT /v1/authSession/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa</a>
     */
    public <T> ResponseEntity<T> putV1AuthSessionSessionKeyTokenUpdateTokenForResponseEntity(String sessionKey, String updateToken, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = sessionInfoDto;
        
        // verify the required parameter 'sessionKey' is set
        if (sessionKey == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling putV1AuthSessionSessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'updateToken' is set
        if (updateToken == null) {
            throw new ApiException(400, "Missing the required parameter 'updateToken' when calling putV1AuthSessionSessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'sessionInfoDto' is set
        if (sessionInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionInfoDto' when calling putV1AuthSessionSessionKeyTokenUpdateToken");
        }
        
        // create path and map variables
        String localVarPath = "/v1/authSession/{sessionKey}/token/{updateToken}"
            .replaceAll("\\{" + "sessionKey" + "\\}", sessionKey.toString())
            .replaceAll("\\{" + "updateToken" + "\\}", updateToken.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6bf469130f2ceb27baa", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : expire
     * Notes : 
     * API : member_api PUT /v1/authSession/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa</a>
     */
    public <T> T putV1AuthSessionSessionKeyTokenUpdateToken(String sessionKey, String updateToken, SessionInfoDto sessionInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putV1AuthSessionSessionKeyTokenUpdateTokenForResponseEntity(sessionKey, updateToken, sessionInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : expire
     * Notes : 
     * API : member_api PUT /v1/authSession/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param sessionInfoDto sessionInfoDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa</a>
     */
    public void putV1AuthSessionSessionKeyTokenUpdateToken(String sessionKey, String updateToken, SessionInfoDto sessionInfoDto, Map<String, String> customHeader) throws ApiException {
        
        this.putV1AuthSessionSessionKeyTokenUpdateToken(sessionKey, updateToken, sessionInfoDto, null, customHeader);
    }

    /**
     * Summary : expire
     * API : member_api PUT /v1/authSession/{sessionKey}/token/{updateToken}
     * Notes : 
     * @param sessionKey sessionKey(required)
     * @param updateToken updateToken(required)
     * @param sessionInfoDto sessionInfoDto(required)
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa">http://api-forge.coupang.net/details?specId=57e8b6bf469130f2ceb27baa</a>
     */
    public void putV1AuthSessionSessionKeyTokenUpdateToken(String sessionKey, String updateToken, SessionInfoDto sessionInfoDto) throws ApiException {
        this.putV1AuthSessionSessionKeyTokenUpdateToken(sessionKey, updateToken, sessionInfoDto, null);
    }
}
