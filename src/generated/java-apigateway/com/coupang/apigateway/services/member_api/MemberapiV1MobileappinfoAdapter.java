package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.member_api.model.MemberApiException;
import com.coupang.apigateway.services.member_api.model.ModifyIsAllowPushDto;
import com.coupang.apigateway.services.member_api.model.MobileAppInfoDto;
import com.coupang.apigateway.services.member_api.model.ModifyMobileAppInfoDto;
import com.coupang.apigateway.services.member_api.model.MobileAppInfoSessionDto;
import com.coupang.apigateway.services.member_api.model.MobileAppLoginSessionDto;
import com.coupang.apigateway.services.member_api.model.MobileAppLogoutSessionDto;
import com.coupang.apigateway.services.member_api.model.MobileLoginDto;
import com.coupang.apigateway.services.member_api.model.MobileAppInfoMemberDto;

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
public class MemberapiV1MobileappinfoAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MemberapiV1MobileappinfoAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("member_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트
     * Notes : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트 한다.  authToken(null), autoLogin(N).
     * API : member_api PUT /v1/mobileAppInfo/logout/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c</a>
     */
    public <T> ResponseEntity<T> putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/logout/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c7c", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트
     * Notes : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트 한다.  authToken(null), autoLogin(N).
     * API : member_api PUT /v1/mobileAppInfo/logout/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c</a>
     */
    public <T> T putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트
     * Notes : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트 한다.  authToken(null), autoLogin(N).
     * API : member_api PUT /v1/mobileAppInfo/logout/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c</a>
     */
    public Integer putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return this.putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, localVarReturnType, customHeader);
    }

    /**
     * Summary : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트
     * API : member_api PUT /v1/mobileAppInfo/logout/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : uuid, mobileId를 키로 하여 일치하는 대상의 다음 값을 업데이트 한다.  authToken(null), autoLogin(N).
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c7c</a>
     */
    public Integer putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType) throws ApiException {
        return this.putV1MobileAppInfoLogoutUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, null);
    }
    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/modifyIsAllowPush/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyIsAllowPushDto 푸쉬 동의 여부 (Device 기준) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b</a>
     */
    public <T> ResponseEntity<T> putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, ModifyIsAllowPushDto modifyIsAllowPushDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = modifyIsAllowPushDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'modifyIsAllowPushDto' is set
        if (modifyIsAllowPushDto == null) {
            throw new ApiException(400, "Missing the required parameter 'modifyIsAllowPushDto' when calling putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/modifyIsAllowPush/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c8b", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/modifyIsAllowPush/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyIsAllowPushDto 푸쉬 동의 여부 (Device 기준) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b</a>
     */
    public <T> T putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyIsAllowPushDto modifyIsAllowPushDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, modifyIsAllowPushDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/modifyIsAllowPush/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyIsAllowPushDto 푸쉬 동의 여부 (Device 기준) (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b</a>
     */
    public Integer putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyIsAllowPushDto modifyIsAllowPushDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return this.putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, modifyIsAllowPushDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * API : member_api PUT /v1/mobileAppInfo/modifyIsAllowPush/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param modifyIsAllowPushDto 푸쉬 동의 여부 (Device 기준)(required)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c8b</a>
     */
    public Integer putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyIsAllowPushDto modifyIsAllowPushDto) throws ApiException {
        return this.putV1MobileAppInfoModifyIsAllowPushUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, modifyIsAllowPushDto, null);
    }
    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90</a>
     */
    public <T> ResponseEntity<T> getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c90", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90</a>
     */
    public <T> T getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90</a>
     */
    public MobileAppInfoDto getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileAppInfoDto> localVarReturnType = new ParameterizedTypeReference<MobileAppInfoDto>() {};
        return this.getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, localVarReturnType, customHeader);
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * @param uuid uuid(required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS)(required)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c90</a>
     */
    public MobileAppInfoDto getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType) throws ApiException {
        return this.getV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, null);
    }
    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyMobileAppInfoDto 변경할 값들의 집합 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a</a>
     */
    public <T> ResponseEntity<T> putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, ModifyMobileAppInfoDto modifyMobileAppInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = modifyMobileAppInfoDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'modifyMobileAppInfoDto' is set
        if (modifyMobileAppInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'modifyMobileAppInfoDto' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c9a", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyMobileAppInfoDto 변경할 값들의 집합 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a</a>
     */
    public <T> T putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyMobileAppInfoDto modifyMobileAppInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, modifyMobileAppInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param modifyMobileAppInfoDto 변경할 값들의 집합 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a</a>
     */
    public Integer putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyMobileAppInfoDto modifyMobileAppInfoDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Integer> localVarReturnType = new ParameterizedTypeReference<Integer>() {};
        return this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, modifyMobileAppInfoDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : 해당 uuid, mobileOsType 키로 하여 존재하는 경우 update 가 수행된다.
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param modifyMobileAppInfoDto 변경할 값들의 집합(required)
     * @return Integer
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9a</a>
     */
    public Integer putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ModifyMobileAppInfoDto modifyMobileAppInfoDto) throws ApiException {
        return this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, modifyMobileAppInfoDto, null);
    }
    /**
     * Summary : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert
     * Notes : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert 된다.\nsave 시, isAllowMarketingPush 은 isAllowPush 와 동일한 값으로 insert (dto 에 isAllowMarketingPush 값 넣어도 무시된다)
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppInfoDto mobileAppInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95</a>
     */
    public <T> ResponseEntity<T> postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, MobileAppInfoDto mobileAppInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = mobileAppInfoDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileAppInfoDto' is set
        if (mobileAppInfoDto == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileAppInfoDto' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c95", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert
     * Notes : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert 된다.\nsave 시, isAllowMarketingPush 은 isAllowPush 와 동일한 값으로 insert (dto 에 isAllowMarketingPush 값 넣어도 무시된다)
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppInfoDto mobileAppInfoDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95</a>
     */
    public <T> T postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, MobileAppInfoDto mobileAppInfoDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, mobileAppInfoDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert
     * Notes : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert 된다.\nsave 시, isAllowMarketingPush 은 isAllowPush 와 동일한 값으로 insert (dto 에 isAllowMarketingPush 값 넣어도 무시된다)
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppInfoDto mobileAppInfoDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95</a>
     */
    public Long postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, MobileAppInfoDto mobileAppInfoDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, mobileAppInfoDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : 해당 uuid, mobileOsType 을 키로 하여 존재하지 않는 경우 insert 된다.\nsave 시, isAllowMarketingPush 은 isAllowPush 와 동일한 값으로 insert (dto 에 isAllowMarketingPush 값 넣어도 무시된다)
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param mobileAppInfoDto mobileAppInfoDto(required)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c95</a>
     */
    public Long postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, MobileAppInfoDto mobileAppInfoDto) throws ApiException {
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, mobileAppInfoDto, null);
    }
    /**
     * Summary : mobile app 로그인을 처리한다.
     * Notes : mobile app 로그인을 처리한다.  로그인 처리가 성공하면 세션을 생성한다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLoginSessionDto Login에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f</a>
     */
    public <T> ResponseEntity<T> postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcessForResponseEntity(String uuid, String mobileOsType, MobileAppLoginSessionDto mobileAppLoginSessionDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = mobileAppLoginSessionDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess");
        }
        
        // verify the required parameter 'mobileAppLoginSessionDto' is set
        if (mobileAppLoginSessionDto == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileAppLoginSessionDto' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLoginProcess"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27c9f", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : mobile app 로그인을 처리한다.
     * Notes : mobile app 로그인을 처리한다.  로그인 처리가 성공하면 세션을 생성한다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLoginSessionDto Login에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoSessionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f</a>
     */
    public <T> T postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess(String uuid, String mobileOsType, MobileAppLoginSessionDto mobileAppLoginSessionDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcessForResponseEntity(uuid, mobileOsType, mobileAppLoginSessionDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : mobile app 로그인을 처리한다.
     * Notes : mobile app 로그인을 처리한다.  로그인 처리가 성공하면 세션을 생성한다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLoginSessionDto Login에 필요한 정보들. (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoSessionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f</a>
     */
    public MobileAppInfoSessionDto postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess(String uuid, String mobileOsType, MobileAppLoginSessionDto mobileAppLoginSessionDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileAppInfoSessionDto> localVarReturnType = new ParameterizedTypeReference<MobileAppInfoSessionDto>() {};
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess(uuid, mobileOsType, mobileAppLoginSessionDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : mobile app 로그인을 처리한다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLoginProcess
     * Notes : mobile app 로그인을 처리한다.  로그인 처리가 성공하면 세션을 생성한다.
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param mobileAppLoginSessionDto Login에 필요한 정보들.(required)
     * @return MobileAppInfoSessionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27c9f</a>
     */
    public MobileAppInfoSessionDto postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess(String uuid, String mobileOsType, MobileAppLoginSessionDto mobileAppLoginSessionDto) throws ApiException {
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLoginProcess(uuid, mobileOsType, mobileAppLoginSessionDto, null);
    }
    /**
     * Summary : mobile app 로그아웃
     * Notes : mobile app 로그아웃을 처리한다. 로그아웃 처리가 성공하면 세션을 만료시킨다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLogoutProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLogoutSessionDto Logout에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4</a>
     */
    public <T> ResponseEntity<T> putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcessForResponseEntity(String uuid, String mobileOsType, MobileAppLogoutSessionDto mobileAppLogoutSessionDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = mobileAppLogoutSessionDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess");
        }
        
        // verify the required parameter 'mobileAppLogoutSessionDto' is set
        if (mobileAppLogoutSessionDto == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileAppLogoutSessionDto' when calling putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLogoutProcess"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27ca4", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : mobile app 로그아웃
     * Notes : mobile app 로그아웃을 처리한다. 로그아웃 처리가 성공하면 세션을 만료시킨다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLogoutProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLogoutSessionDto Logout에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4</a>
     */
    public <T> T putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess(String uuid, String mobileOsType, MobileAppLogoutSessionDto mobileAppLogoutSessionDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcessForResponseEntity(uuid, mobileOsType, mobileAppLogoutSessionDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : mobile app 로그아웃
     * Notes : mobile app 로그아웃을 처리한다. 로그아웃 처리가 성공하면 세션을 만료시킨다.
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLogoutProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileAppLogoutSessionDto Logout에 필요한 정보들. (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4</a>
     */
    public MobileAppInfoDto putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess(String uuid, String mobileOsType, MobileAppLogoutSessionDto mobileAppLogoutSessionDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileAppInfoDto> localVarReturnType = new ParameterizedTypeReference<MobileAppInfoDto>() {};
        return this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess(uuid, mobileOsType, mobileAppLogoutSessionDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : mobile app 로그아웃
     * API : member_api PUT /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileAppLogoutProcess
     * Notes : mobile app 로그아웃을 처리한다. 로그아웃 처리가 성공하면 세션을 만료시킨다.
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param mobileAppLogoutSessionDto Logout에 필요한 정보들.(required)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca4</a>
     */
    public MobileAppInfoDto putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess(String uuid, String mobileOsType, MobileAppLogoutSessionDto mobileAppLogoutSessionDto) throws ApiException {
        return this.putV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileAppLogoutProcess(uuid, mobileOsType, mobileAppLogoutSessionDto, null);
    }
    /**
     * Summary : Login에 필요한 정보를 가지고 로그인
     * Notes : mobile에서  Login에 필요한 정보를 가지고 로그인을 시킨다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileLoginDto Login에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9</a>
     */
    public <T> ResponseEntity<T> postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcessForResponseEntity(String uuid, String mobileOsType, MobileLoginDto mobileLoginDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = mobileLoginDto;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess");
        }
        
        // verify the required parameter 'mobileLoginDto' is set
        if (mobileLoginDto == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileLoginDto' when calling postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileLoginProcess"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27ca9", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Login에 필요한 정보를 가지고 로그인
     * Notes : mobile에서  Login에 필요한 정보를 가지고 로그인을 시킨다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileLoginDto Login에 필요한 정보들. (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9</a>
     */
    public <T> T postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess(String uuid, String mobileOsType, MobileLoginDto mobileLoginDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcessForResponseEntity(uuid, mobileOsType, mobileLoginDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Login에 필요한 정보를 가지고 로그인
     * Notes : mobile에서  Login에 필요한 정보를 가지고 로그인을 시킨다.
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileLoginProcess
     * @param uuid uuid (required)
     * @param mobileOsType mobileOsType(Android, IOS) (required)
     * @param mobileLoginDto Login에 필요한 정보들. (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9</a>
     */
    public MobileAppInfoDto postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess(String uuid, String mobileOsType, MobileLoginDto mobileLoginDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileAppInfoDto> localVarReturnType = new ParameterizedTypeReference<MobileAppInfoDto>() {};
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess(uuid, mobileOsType, mobileLoginDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : Login에 필요한 정보를 가지고 로그인
     * API : member_api POST /v1/mobileAppInfo/uuid/{uuid}/mobileOsType/{mobileOsType}/mobileLoginProcess
     * Notes : mobile에서  Login에 필요한 정보를 가지고 로그인을 시킨다.
     * @param uuid uuid(required)
     * @param mobileOsType mobileOsType(Android, IOS)(required)
     * @param mobileLoginDto Login에 필요한 정보들.(required)
     * @return MobileAppInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27ca9</a>
     */
    public MobileAppInfoDto postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess(String uuid, String mobileOsType, MobileLoginDto mobileLoginDto) throws ApiException {
        return this.postV1MobileAppInfoUuidUuidMobileOsTypeMobileOsTypeMobileLoginProcess(uuid, mobileOsType, mobileLoginDto, null);
    }
    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/withMemberInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae</a>
     */
    public <T> ResponseEntity<T> getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // verify the required parameter 'mobileOsType' is set
        if (mobileOsType == null) {
            throw new ApiException(400, "Missing the required parameter 'mobileOsType' when calling getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType");
        }
        
        // create path and map variables
        String localVarPath = "/v1/mobileAppInfo/withMemberInfo/uuid/{uuid}/mobileOsType/{mobileOsType}"
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString())
            .replaceAll("\\{" + "mobileOsType" + "\\}", mobileOsType.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e8b6c0469130f2ceb27cae", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/withMemberInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae</a>
     */
    public <T> T getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsTypeForResponseEntity(uuid, mobileOsType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/withMemberInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * @param uuid uuid (required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS) (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileAppInfoMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae</a>
     */
    public MobileAppInfoMemberDto getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileAppInfoMemberDto> localVarReturnType = new ParameterizedTypeReference<MobileAppInfoMemberDto>() {};
        return this.getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, localVarReturnType, customHeader);
    }

    /**
     * Summary : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * API : member_api GET /v1/mobileAppInfo/withMemberInfo/uuid/{uuid}/mobileOsType/{mobileOsType}
     * Notes : uuid, mobileOsType 로 MobileAppInfo 를 조회
     * @param uuid uuid(required)
     * @param mobileOsType {@link MobileOsType}(Android, IOS)(required)
     * @return MobileAppInfoMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae">http://api-forge.coupang.net/details?specId=57e8b6c0469130f2ceb27cae</a>
     */
    public MobileAppInfoMemberDto getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType(String uuid, String mobileOsType) throws ApiException {
        return this.getV1MobileAppInfoWithMemberInfoUuidUuidMobileOsTypeMobileOsType(uuid, mobileOsType, null);
    }
}
