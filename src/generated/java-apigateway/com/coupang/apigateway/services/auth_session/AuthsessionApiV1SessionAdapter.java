package com.coupang.apigateway.services.auth_session;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.auth_session.model.RestError;
import com.coupang.apigateway.services.auth_session.model.MemberSessionInfoDto;

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
public class AuthsessionApiV1SessionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public AuthsessionApiV1SessionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("auth_session");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findAndExtendExpireTime
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255">http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255</a>
     */
    public <T> ResponseEntity<T> getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenForResponseEntity(String sessionKey, String updateToken, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionKey' is set
        if (sessionKey == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'updateToken' is set
        if (updateToken == null) {
            throw new ApiException(400, "Missing the required parameter 'updateToken' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'clientInfo' is set
        if (clientInfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientInfo' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/"
            .replaceAll("\\{" + "sessionKey" + "\\}", sessionKey.toString())
            .replaceAll("\\{" + "updateToken" + "\\}", updateToken.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (clientInfo != null) {
          localVarHeaderParams.put("clientInfo", apiClient.parameterToString(clientInfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57be5226978ed54782a26255", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findAndExtendExpireTime
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255">http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255</a>
     */
    public <T> T getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken(String sessionKey, String updateToken, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenForResponseEntity(sessionKey, updateToken, clientInfo, pcid, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findAndExtendExpireTime
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255">http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken(String sessionKey, String updateToken, String clientInfo, String pcid, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MemberSessionInfoDto> localVarReturnType = new ParameterizedTypeReference<MemberSessionInfoDto>() {};
        return this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken(sessionKey, updateToken, clientInfo, pcid, localVarReturnType, customHeader);
    }

    /**
     * Summary : findAndExtendExpireTime
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/
     * Notes : 
     * @param sessionKey sessionKey(required)
     * @param updateToken updateToken(required)
     * @param clientInfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255">http://api-forge.coupang.net/details?specId=57be5226978ed54782a26255</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken(String sessionKey, String updateToken, String clientInfo, String pcid) throws ApiException {
        return this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateToken(sessionKey, updateToken, clientInfo, pcid, null);
    }
    /**
     * Summary : findAndExtendExpireTimePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/persistupdatetoken/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e</a>
     */
    public <T> ResponseEntity<T> getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetokenForResponseEntity(String sessionKey, String updateToken, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionKey' is set
        if (sessionKey == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken");
        }
        
        // verify the required parameter 'updateToken' is set
        if (updateToken == null) {
            throw new ApiException(400, "Missing the required parameter 'updateToken' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken");
        }
        
        // verify the required parameter 'clientInfo' is set
        if (clientInfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientInfo' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/persistupdatetoken/"
            .replaceAll("\\{" + "sessionKey" + "\\}", sessionKey.toString())
            .replaceAll("\\{" + "updateToken" + "\\}", updateToken.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (clientInfo != null) {
          localVarHeaderParams.put("clientInfo", apiClient.parameterToString(clientInfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e0c453d35bb43c26949e5e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findAndExtendExpireTimePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/persistupdatetoken/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e</a>
     */
    public <T> T getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken(String sessionKey, String updateToken, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetokenForResponseEntity(sessionKey, updateToken, clientInfo, pcid, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findAndExtendExpireTimePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/persistupdatetoken/
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken(String sessionKey, String updateToken, String clientInfo, String pcid, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MemberSessionInfoDto> localVarReturnType = new ParameterizedTypeReference<MemberSessionInfoDto>() {};
        return this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken(sessionKey, updateToken, clientInfo, pcid, localVarReturnType, customHeader);
    }

    /**
     * Summary : findAndExtendExpireTimePersistUpdateToken
     * API : auth_session GET /api/v1/session/member/refresh/{sessionKey}/token/{updateToken}/persistupdatetoken/
     * Notes : 
     * @param sessionKey sessionKey(required)
     * @param updateToken updateToken(required)
     * @param clientInfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e">http://api-forge.coupang.net/details?specId=57e0c453d35bb43c26949e5e</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken(String sessionKey, String updateToken, String clientInfo, String pcid) throws ApiException {
        return this.getApiV1SessionMemberRefreshSessionKeyTokenUpdateTokenPersistupdatetoken(sessionKey, updateToken, clientInfo, pcid, null);
    }
    /**
     * Summary : findAlreadySavedSessionInfo
     * Notes : 
     * API : auth_session GET /api/v1/session/member/{memberId}/uuid/{uuid}/mobileOsType/{mobileOsType}/
     * @param memberId memberId (required)
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264">http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264</a>
     */
    public <T> ResponseEntity<T> getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String memberId, String uuid, String mobileOsType, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'clientInfo' is set
        if (clientInfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientInfo' when calling getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/session/member/{memberId}/uuid/{uuid}/mobileOsType/{mobileOsType}/"
            .replaceAll("\\{" + "memberId" + "\\}", memberId.toString())
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (clientInfo != null) {
          localVarHeaderParams.put("clientInfo", apiClient.parameterToString(clientInfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57be5227978ed54782a26264", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findAlreadySavedSessionInfo
     * Notes : 
     * API : auth_session GET /api/v1/session/member/{memberId}/uuid/{uuid}/mobileOsType/{mobileOsType}/
     * @param memberId memberId (required)
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264">http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264</a>
     */
    public <T> T getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType(String memberId, String uuid, String mobileOsType, String clientInfo, String pcid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(memberId, uuid, mobileOsType, clientInfo, pcid, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findAlreadySavedSessionInfo
     * Notes : 
     * API : auth_session GET /api/v1/session/member/{memberId}/uuid/{uuid}/mobileOsType/{mobileOsType}/
     * @param memberId memberId (required)
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType (required)
     * @param clientInfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264">http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType(String memberId, String uuid, String mobileOsType, String clientInfo, String pcid, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MemberSessionInfoDto> localVarReturnType = new ParameterizedTypeReference<MemberSessionInfoDto>() {};
        return this.getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType(memberId, uuid, mobileOsType, clientInfo, pcid, localVarReturnType, customHeader);
    }

    /**
     * Summary : findAlreadySavedSessionInfo
     * API : auth_session GET /api/v1/session/member/{memberId}/uuid/{uuid}/mobileOsType/{mobileOsType}/
     * Notes : 
     * @param memberId memberId(required)
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(required)
     * @param clientInfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @return MemberSessionInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264">http://api-forge.coupang.net/details?specId=57be5227978ed54782a26264</a>
     */
    public MemberSessionInfoDto getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType(String memberId, String uuid, String mobileOsType, String clientInfo, String pcid) throws ApiException {
        return this.getApiV1SessionMemberMemberIdUuidUuidMobileOsTypeMobileOsType(memberId, uuid, mobileOsType, clientInfo, pcid, null);
    }
}
