package com.coupang.apigateway.services.auth_session;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.auth_session.model.RestError;
import com.coupang.apigateway.services.auth_session.model.AuthenticationResult;

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
public class AuthsessionApiV1AuthenticateAdapter {

    private final ApiClient apiClient;

    @Autowired
    public AuthsessionApiV1AuthenticateAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("auth_session");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : cookieOnlyAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/cpusr/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271">http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271</a>
     */
    public <T> ResponseEntity<T> getApiV1AuthenticateCpusrMemberIdForResponseEntity(String memberId, String cpusr, String loginip, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiV1AuthenticateCpusrMemberId");
        }
        
        // verify the required parameter 'cpusr' is set
        if (cpusr == null) {
            throw new ApiException(400, "Missing the required parameter 'cpusr' when calling getApiV1AuthenticateCpusrMemberId");
        }
        
        // verify the required parameter 'loginip' is set
        if (loginip == null) {
            throw new ApiException(400, "Missing the required parameter 'loginip' when calling getApiV1AuthenticateCpusrMemberId");
        }
        
        // verify the required parameter 'rememberme' is set
        if (rememberme == null) {
            throw new ApiException(400, "Missing the required parameter 'rememberme' when calling getApiV1AuthenticateCpusrMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/authenticate/cpusr/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", memberId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (cpusr != null) {
          localVarHeaderParams.put("cpusr", apiClient.parameterToString(cpusr));
        }if (loginip != null) {
          localVarHeaderParams.put("loginip", apiClient.parameterToString(loginip));
        }if (rememberme != null) {
          localVarHeaderParams.put("rememberme", apiClient.parameterToString(rememberme));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58ce02a772c46e4529619271", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : cookieOnlyAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/cpusr/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271">http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271</a>
     */
    public <T> T getApiV1AuthenticateCpusrMemberId(String memberId, String cpusr, String loginip, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AuthenticateCpusrMemberIdForResponseEntity(memberId, cpusr, loginip, rememberme, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : cookieOnlyAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/cpusr/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param rememberme rememberMe (required)
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271">http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271</a>
     */
    public AuthenticationResult getApiV1AuthenticateCpusrMemberId(String memberId, String cpusr, String loginip, String rememberme, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AuthenticationResult> localVarReturnType = new ParameterizedTypeReference<AuthenticationResult>() {};
        return this.getApiV1AuthenticateCpusrMemberId(memberId, cpusr, loginip, rememberme, localVarReturnType, customHeader);
    }

    /**
     * Summary : cookieOnlyAuthenticate
     * API : auth_session GET /api/v1/authenticate/cpusr/{memberId}
     * Notes : 
     * @param memberId memberId(required)
     * @param cpusr cpusr cookie value(required)
     * @param loginip clientIp(required)
     * @param rememberme rememberMe(required)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271">http://api-forge.coupang.net/details?specId=58ce02a772c46e4529619271</a>
     */
    public AuthenticationResult getApiV1AuthenticateCpusrMemberId(String memberId, String cpusr, String loginip, String rememberme) throws ApiException {
        return this.getApiV1AuthenticateCpusrMemberId(memberId, cpusr, loginip, rememberme, null);
    }
    /**
     * Summary : sessionAuthenticatePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/persist/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb</a>
     */
    public <T> ResponseEntity<T> getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateTokenForResponseEntity(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionKey' is set
        if (sessionKey == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'updateToken' is set
        if (updateToken == null) {
            throw new ApiException(400, "Missing the required parameter 'updateToken' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'cpusr' is set
        if (cpusr == null) {
            throw new ApiException(400, "Missing the required parameter 'cpusr' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'loginip' is set
        if (loginip == null) {
            throw new ApiException(400, "Missing the required parameter 'loginip' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'clientinfo' is set
        if (clientinfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientinfo' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'rememberme' is set
        if (rememberme == null) {
            throw new ApiException(400, "Missing the required parameter 'rememberme' when calling getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/authenticate/persist/sessionKey/{sessionKey}/token/{updateToken}"
            .replaceAll("\\{" + "sessionKey" + "\\}", sessionKey.toString())
            .replaceAll("\\{" + "updateToken" + "\\}", updateToken.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (cpusr != null) {
          localVarHeaderParams.put("cpusr", apiClient.parameterToString(cpusr));
        }if (loginip != null) {
          localVarHeaderParams.put("loginip", apiClient.parameterToString(loginip));
        }if (clientinfo != null) {
          localVarHeaderParams.put("clientinfo", apiClient.parameterToString(clientinfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }if (rememberme != null) {
          localVarHeaderParams.put("rememberme", apiClient.parameterToString(rememberme));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58cce5c0204e754c6cd53aeb", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : sessionAuthenticatePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/persist/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb</a>
     */
    public <T> T getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateTokenForResponseEntity(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : sessionAuthenticatePersistUpdateToken
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/persist/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb</a>
     */
    public AuthenticationResult getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AuthenticationResult> localVarReturnType = new ParameterizedTypeReference<AuthenticationResult>() {};
        return this.getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, localVarReturnType, customHeader);
    }

    /**
     * Summary : sessionAuthenticatePersistUpdateToken
     * API : auth_session GET /api/v1/authenticate/persist/sessionKey/{sessionKey}/token/{updateToken}
     * Notes : 
     * @param sessionKey sessionKey(required)
     * @param updateToken updateToken(required)
     * @param cpusr cpusr cookie value(required)
     * @param loginip clientIp(required)
     * @param clientinfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @param rememberme rememberMe(required)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53aeb</a>
     */
    public AuthenticationResult getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme) throws ApiException {
        return this.getApiV1AuthenticatePersistSessionKeySessionKeyTokenUpdateToken(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, null);
    }
    /**
     * Summary : sessionAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0</a>
     */
    public <T> ResponseEntity<T> getApiV1AuthenticateSessionKeySessionKeyTokenUpdateTokenForResponseEntity(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionKey' is set
        if (sessionKey == null) {
            throw new ApiException(400, "Missing the required parameter 'sessionKey' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'updateToken' is set
        if (updateToken == null) {
            throw new ApiException(400, "Missing the required parameter 'updateToken' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'cpusr' is set
        if (cpusr == null) {
            throw new ApiException(400, "Missing the required parameter 'cpusr' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'loginip' is set
        if (loginip == null) {
            throw new ApiException(400, "Missing the required parameter 'loginip' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'clientinfo' is set
        if (clientinfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientinfo' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // verify the required parameter 'rememberme' is set
        if (rememberme == null) {
            throw new ApiException(400, "Missing the required parameter 'rememberme' when calling getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/authenticate/sessionKey/{sessionKey}/token/{updateToken}"
            .replaceAll("\\{" + "sessionKey" + "\\}", sessionKey.toString())
            .replaceAll("\\{" + "updateToken" + "\\}", updateToken.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (cpusr != null) {
          localVarHeaderParams.put("cpusr", apiClient.parameterToString(cpusr));
        }if (loginip != null) {
          localVarHeaderParams.put("loginip", apiClient.parameterToString(loginip));
        }if (clientinfo != null) {
          localVarHeaderParams.put("clientinfo", apiClient.parameterToString(clientinfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }if (rememberme != null) {
          localVarHeaderParams.put("rememberme", apiClient.parameterToString(rememberme));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58cce5c0204e754c6cd53af0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : sessionAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0</a>
     */
    public <T> T getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AuthenticateSessionKeySessionKeyTokenUpdateTokenForResponseEntity(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : sessionAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/sessionKey/{sessionKey}/token/{updateToken}
     * @param sessionKey sessionKey (required)
     * @param updateToken updateToken (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0</a>
     */
    public AuthenticationResult getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AuthenticationResult> localVarReturnType = new ParameterizedTypeReference<AuthenticationResult>() {};
        return this.getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, localVarReturnType, customHeader);
    }

    /**
     * Summary : sessionAuthenticate
     * API : auth_session GET /api/v1/authenticate/sessionKey/{sessionKey}/token/{updateToken}
     * Notes : 
     * @param sessionKey sessionKey(required)
     * @param updateToken updateToken(required)
     * @param cpusr cpusr cookie value(required)
     * @param loginip clientIp(required)
     * @param clientinfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @param rememberme rememberMe(required)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0">http://api-forge.coupang.net/details?specId=58cce5c0204e754c6cd53af0</a>
     */
    public AuthenticationResult getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken(String sessionKey, String updateToken, String cpusr, String loginip, String clientinfo, String pcid, String rememberme) throws ApiException {
        return this.getApiV1AuthenticateSessionKeySessionKeyTokenUpdateToken(sessionKey, updateToken, cpusr, loginip, clientinfo, pcid, rememberme, null);
    }
    /**
     * Summary : cookieAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c">http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c</a>
     */
    public <T> ResponseEntity<T> getApiV1AuthenticateMemberIdForResponseEntity(String memberId, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiV1AuthenticateMemberId");
        }
        
        // verify the required parameter 'cpusr' is set
        if (cpusr == null) {
            throw new ApiException(400, "Missing the required parameter 'cpusr' when calling getApiV1AuthenticateMemberId");
        }
        
        // verify the required parameter 'loginip' is set
        if (loginip == null) {
            throw new ApiException(400, "Missing the required parameter 'loginip' when calling getApiV1AuthenticateMemberId");
        }
        
        // verify the required parameter 'clientinfo' is set
        if (clientinfo == null) {
            throw new ApiException(400, "Missing the required parameter 'clientinfo' when calling getApiV1AuthenticateMemberId");
        }
        
        // verify the required parameter 'pcid' is set
        if (pcid == null) {
            throw new ApiException(400, "Missing the required parameter 'pcid' when calling getApiV1AuthenticateMemberId");
        }
        
        // verify the required parameter 'rememberme' is set
        if (rememberme == null) {
            throw new ApiException(400, "Missing the required parameter 'rememberme' when calling getApiV1AuthenticateMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/authenticate/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", memberId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (cpusr != null) {
          localVarHeaderParams.put("cpusr", apiClient.parameterToString(cpusr));
        }if (loginip != null) {
          localVarHeaderParams.put("loginip", apiClient.parameterToString(loginip));
        }if (clientinfo != null) {
          localVarHeaderParams.put("clientinfo", apiClient.parameterToString(clientinfo));
        }if (pcid != null) {
          localVarHeaderParams.put("pcid", apiClient.parameterToString(pcid));
        }if (rememberme != null) {
          localVarHeaderParams.put("rememberme", apiClient.parameterToString(rememberme));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58ce02a772c46e452961926c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : cookieAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c">http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c</a>
     */
    public <T> T getApiV1AuthenticateMemberId(String memberId, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AuthenticateMemberIdForResponseEntity(memberId, cpusr, loginip, clientinfo, pcid, rememberme, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : cookieAuthenticate
     * Notes : 
     * API : auth_session GET /api/v1/authenticate/{memberId}
     * @param memberId memberId (required)
     * @param cpusr cpusr cookie value (required)
     * @param loginip clientIp (required)
     * @param clientinfo coupang-app header or user-agent (required)
     * @param pcid pcid (required)
     * @param rememberme rememberMe (required)
     * @param customHeader customHeaderMap (nullable)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c">http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c</a>
     */
    public AuthenticationResult getApiV1AuthenticateMemberId(String memberId, String cpusr, String loginip, String clientinfo, String pcid, String rememberme, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AuthenticationResult> localVarReturnType = new ParameterizedTypeReference<AuthenticationResult>() {};
        return this.getApiV1AuthenticateMemberId(memberId, cpusr, loginip, clientinfo, pcid, rememberme, localVarReturnType, customHeader);
    }

    /**
     * Summary : cookieAuthenticate
     * API : auth_session GET /api/v1/authenticate/{memberId}
     * Notes : 
     * @param memberId memberId(required)
     * @param cpusr cpusr cookie value(required)
     * @param loginip clientIp(required)
     * @param clientinfo coupang-app header or user-agent(required)
     * @param pcid pcid(required)
     * @param rememberme rememberMe(required)
     * @return AuthenticationResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c">http://api-forge.coupang.net/details?specId=58ce02a772c46e452961926c</a>
     */
    public AuthenticationResult getApiV1AuthenticateMemberId(String memberId, String cpusr, String loginip, String clientinfo, String pcid, String rememberme) throws ApiException {
        return this.getApiV1AuthenticateMemberId(memberId, cpusr, loginip, clientinfo, pcid, rememberme, null);
    }
}
