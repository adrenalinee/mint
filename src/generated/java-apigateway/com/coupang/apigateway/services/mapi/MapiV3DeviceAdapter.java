package com.coupang.apigateway.services.mapi;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.mapi.model.ResponseBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
@org.springframework.stereotype.Component
public class MapiV3DeviceAdapter {

    private final ApiClient apiClient;

    @Autowired
    public MapiV3DeviceAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("mapi");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : invalidateDevice
     * Notes : 
     * API : mapi GET /v3/device/invalidate/osType/{osType}/uuid/{uuid}
     * @param osType osType (required)
     * @param uuid uuid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4">http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4</a>
     */
    public <T> ResponseEntity<T> getV3DeviceInvalidateOsTypeOsTypeUuidUuidForResponseEntity(String osType, String uuid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'osType' is set
        if (osType == null) {
            throw new ApiException(400, "Missing the required parameter 'osType' when calling getV3DeviceInvalidateOsTypeOsTypeUuidUuid");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException(400, "Missing the required parameter 'uuid' when calling getV3DeviceInvalidateOsTypeOsTypeUuidUuid");
        }
        
        // create path and map variables
        String localVarPath = "/v3/device/invalidate/osType/{osType}/uuid/{uuid}"
            .replaceAll("\\{" + "osType" + "\\}", osType.toString())
            .replaceAll("\\{" + "uuid" + "\\}", uuid.toString());

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

        return apiClient.invokeAPIForResponseEntity("57f73ea961ac053358a332c4", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : invalidateDevice
     * Notes : 
     * API : mapi GET /v3/device/invalidate/osType/{osType}/uuid/{uuid}
     * @param osType osType (required)
     * @param uuid uuid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseBase
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4">http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4</a>
     */
    public <T> T getV3DeviceInvalidateOsTypeOsTypeUuidUuid(String osType, String uuid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV3DeviceInvalidateOsTypeOsTypeUuidUuidForResponseEntity(osType, uuid, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : invalidateDevice
     * Notes : 
     * API : mapi GET /v3/device/invalidate/osType/{osType}/uuid/{uuid}
     * @param osType osType (required)
     * @param uuid uuid (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseBase
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4">http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4</a>
     */
    public ResponseBase getV3DeviceInvalidateOsTypeOsTypeUuidUuid(String osType, String uuid, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ResponseBase> localVarReturnType = new ParameterizedTypeReference<ResponseBase>() {};
        return this.getV3DeviceInvalidateOsTypeOsTypeUuidUuid(osType, uuid, localVarReturnType, customHeader);
    }

    /**
     * Summary : invalidateDevice
     * API : mapi GET /v3/device/invalidate/osType/{osType}/uuid/{uuid}
     * Notes : 
     * @param osType osType(required)
     * @param uuid uuid(required)
     * @return ResponseBase
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4">http://api-forge.coupang.net/details?specId=57f73ea961ac053358a332c4</a>
     */
    public ResponseBase getV3DeviceInvalidateOsTypeOsTypeUuidUuid(String osType, String uuid) throws ApiException {
        return this.getV3DeviceInvalidateOsTypeOsTypeUuidUuid(osType, uuid, null);
    }
}
