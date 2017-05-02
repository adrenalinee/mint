package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.VendorItemPackageLegacyDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
@org.springframework.stereotype.Component
public class RssDealAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssDealAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findWithAdditionalInfos
     * Notes : 
     * API : rss POST /deal/withinfos
     * @param coupangSrl coupangSrl (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037</a>
     */
    public <T> ResponseEntity<T> postDealWithinfosForResponseEntity(Long coupangSrl, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrl' is set
        if (coupangSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrl' when calling postDealWithinfos");
        }
        
        // verify the required parameter 'with' is set
        if (with == null) {
            throw new ApiException(400, "Missing the required parameter 'with' when calling postDealWithinfos");
        }
        
        // create path and map variables
        String localVarPath = "/deal/withinfos";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "coupangSrl", coupangSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "with", with));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34682d35bb43c2694a037", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findWithAdditionalInfos
     * Notes : 
     * API : rss POST /deal/withinfos
     * @param coupangSrl coupangSrl (required)
     * @param with with (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037</a>
     */
    public <T> T postDealWithinfos(Long coupangSrl, List<String> with, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postDealWithinfosForResponseEntity(coupangSrl, with, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findWithAdditionalInfos
     * Notes : 
     * API : rss POST /deal/withinfos
     * @param coupangSrl coupangSrl (required)
     * @param with with (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037</a>
     */
    public VendorItemPackageLegacyDTO postDealWithinfos(Long coupangSrl, List<String> with, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorItemPackageLegacyDTO> localVarReturnType = new ParameterizedTypeReference<VendorItemPackageLegacyDTO>() {};
        return this.postDealWithinfos(coupangSrl, with, localVarReturnType, customHeader);
    }

    /**
     * Summary : findWithAdditionalInfos
     * API : rss POST /deal/withinfos
     * Notes : 
     * @param coupangSrl coupangSrl(required)
     * @param with with(required)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a037</a>
     */
    public VendorItemPackageLegacyDTO postDealWithinfos(Long coupangSrl, List<String> with) throws ApiException {
        return this.postDealWithinfos(coupangSrl, with, null);
    }
    /**
     * Summary : findById
     * Notes : 
     * API : rss GET /deal/{id}
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c</a>
     */
    public <T> ResponseEntity<T> getDealIdForResponseEntity(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getDealId");
        }
        
        // create path and map variables
        String localVarPath = "/deal/{id}"
            .replaceAll("\\{" + "id" + "\\}", id.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e34682d35bb43c2694a03c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findById
     * Notes : 
     * API : rss GET /deal/{id}
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c</a>
     */
    public <T> T getDealId(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getDealIdForResponseEntity(id, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findById
     * Notes : 
     * API : rss GET /deal/{id}
     * @param id id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c</a>
     */
    public VendorItemPackageLegacyDTO getDealId(Long id, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorItemPackageLegacyDTO> localVarReturnType = new ParameterizedTypeReference<VendorItemPackageLegacyDTO>() {};
        return this.getDealId(id, localVarReturnType, customHeader);
    }

    /**
     * Summary : findById
     * API : rss GET /deal/{id}
     * Notes : 
     * @param id id(required)
     * @return VendorItemPackageLegacyDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a03c</a>
     */
    public VendorItemPackageLegacyDTO getDealId(Long id) throws ApiException {
        return this.getDealId(id, null);
    }
    /**
     * Summary : findCoupangSrl
     * Notes : 
     * API : rss GET /deal/{id}/coupangsrl
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046</a>
     */
    public <T> ResponseEntity<T> getDealIdCoupangsrlForResponseEntity(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getDealIdCoupangsrl");
        }
        
        // create path and map variables
        String localVarPath = "/deal/{id}/coupangsrl"
            .replaceAll("\\{" + "id" + "\\}", id.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e34682d35bb43c2694a046", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findCoupangSrl
     * Notes : 
     * API : rss GET /deal/{id}/coupangsrl
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046</a>
     */
    public <T> T getDealIdCoupangsrl(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getDealIdCoupangsrlForResponseEntity(id, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findCoupangSrl
     * Notes : 
     * API : rss GET /deal/{id}/coupangsrl
     * @param id id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046</a>
     */
    public Long getDealIdCoupangsrl(Long id, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return this.getDealIdCoupangsrl(id, localVarReturnType, customHeader);
    }

    /**
     * Summary : findCoupangSrl
     * API : rss GET /deal/{id}/coupangsrl
     * Notes : 
     * @param id id(required)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a046</a>
     */
    public Long getDealIdCoupangsrl(Long id) throws ApiException {
        return this.getDealIdCoupangsrl(id, null);
    }
    /**
     * Summary : findVendorItemPackageId
     * Notes : 
     * API : rss GET /deal/{id}/id
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b</a>
     */
    public <T> ResponseEntity<T> getDealIdIdForResponseEntity(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getDealIdId");
        }
        
        // create path and map variables
        String localVarPath = "/deal/{id}/id"
            .replaceAll("\\{" + "id" + "\\}", id.toString());

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

        return apiClient.invokeAPIForResponseEntity("57e34682d35bb43c2694a04b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findVendorItemPackageId
     * Notes : 
     * API : rss GET /deal/{id}/id
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b</a>
     */
    public <T> T getDealIdId(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getDealIdIdForResponseEntity(id, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findVendorItemPackageId
     * Notes : 
     * API : rss GET /deal/{id}/id
     * @param id id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b</a>
     */
    public Long getDealIdId(Long id, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return this.getDealIdId(id, localVarReturnType, customHeader);
    }

    /**
     * Summary : findVendorItemPackageId
     * API : rss GET /deal/{id}/id
     * Notes : 
     * @param id id(required)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b">http://api-forge.coupang.net/details?specId=57e34682d35bb43c2694a04b</a>
     */
    public Long getDealIdId(Long id) throws ApiException {
        return this.getDealIdId(id, null);
    }
}
