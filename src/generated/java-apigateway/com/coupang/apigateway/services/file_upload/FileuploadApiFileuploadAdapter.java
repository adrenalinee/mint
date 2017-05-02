package com.coupang.apigateway.services.file_upload;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.file_upload.model.TokenDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.278+09:00")
@org.springframework.stereotype.Component
public class FileuploadApiFileuploadAdapter {

    private final ApiClient apiClient;

    @Autowired
    public FileuploadApiFileuploadAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("file_upload");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : create
     * Notes : 
     * API : file_upload GET /api/fileupload/v1/token/create
     * @param serviceInfo serviceInfo (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param isSingleFile isSingleFile (optional)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7">http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7</a>
     */
    public <T> ResponseEntity<T> getApiFileuploadV1TokenCreateForResponseEntity(String serviceInfo, String xMemberId, String isSingleFile, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceInfo' is set
        if (serviceInfo == null) {
            throw new ApiException(400, "Missing the required parameter 'serviceInfo' when calling getApiFileuploadV1TokenCreate");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiFileuploadV1TokenCreate");
        }
        
        // create path and map variables
        String localVarPath = "/api/fileupload/v1/token/create";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceInfo", serviceInfo));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "isSingleFile", isSingleFile));
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57cd1cfc3ac97f27571459a7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : create
     * Notes : 
     * API : file_upload GET /api/fileupload/v1/token/create
     * @param serviceInfo serviceInfo (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param isSingleFile isSingleFile (optional)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return TokenDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7">http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7</a>
     */
    public <T> T getApiFileuploadV1TokenCreate(String serviceInfo, String xMemberId, String isSingleFile, String xMemberType, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiFileuploadV1TokenCreateForResponseEntity(serviceInfo, xMemberId, isSingleFile, xMemberType, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : create
     * Notes : 
     * API : file_upload GET /api/fileupload/v1/token/create
     * @param serviceInfo serviceInfo (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param isSingleFile isSingleFile (optional)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return TokenDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7">http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7</a>
     */
    public TokenDto getApiFileuploadV1TokenCreate(String serviceInfo, String xMemberId, String isSingleFile, String xMemberType, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<TokenDto> localVarReturnType = new ParameterizedTypeReference<TokenDto>() {};
        return this.getApiFileuploadV1TokenCreate(serviceInfo, xMemberId, isSingleFile, xMemberType, localVarReturnType, customHeader);
    }

    /**
     * Summary : create
     * API : file_upload GET /api/fileupload/v1/token/create
     * Notes : 
     * @param serviceInfo serviceInfo(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param isSingleFile isSingleFile(optional)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(optional)
     * @return TokenDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7">http://api-forge.coupang.net/details?specId=57cd1cfc3ac97f27571459a7</a>
     */
    public TokenDto getApiFileuploadV1TokenCreate(String serviceInfo, String xMemberId, String isSingleFile, String xMemberType) throws ApiException {
        return this.getApiFileuploadV1TokenCreate(serviceInfo, xMemberId, isSingleFile, xMemberType, null);
    }
}
