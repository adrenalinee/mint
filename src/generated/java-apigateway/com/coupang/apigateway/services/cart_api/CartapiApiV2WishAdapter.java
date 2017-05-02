package com.coupang.apigateway.services.cart_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.cart_api.model.WishBrandStatusResponse;
import com.coupang.apigateway.services.cart_api.model.WishBrandResponseDTO;
import com.coupang.apigateway.services.cart_api.model.WishItemCheckSDPResponse;
import java.util.*;
import com.coupang.apigateway.services.cart_api.model.WishBrandDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
@org.springframework.stereotype.Component
public class CartapiApiV2WishAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CartapiApiV2WishAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("cart_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getStatus
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/status
     * @param memberSrl memberSrl (required)
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076">http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlBrandStatusForResponseEntity(Long memberSrl, List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlBrandStatus");
        }
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getApiV2WishMemberSrlBrandStatus");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/brand/status"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "ids", ids));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5892de09dd65fc87b3386076", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getStatus
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/status
     * @param memberSrl memberSrl (required)
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandStatusResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076">http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076</a>
     */
    public <T> T getApiV2WishMemberSrlBrandStatus(Long memberSrl, List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlBrandStatusForResponseEntity(memberSrl, ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getStatus
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/status
     * @param memberSrl memberSrl (required)
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandStatusResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076">http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076</a>
     */
    public WishBrandStatusResponse getApiV2WishMemberSrlBrandStatus(Long memberSrl, List<Long> ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandStatusResponse> localVarReturnType = new ParameterizedTypeReference<WishBrandStatusResponse>() {};
        return this.getApiV2WishMemberSrlBrandStatus(memberSrl, ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getStatus
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/status
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param ids ids(required)
     * @return WishBrandStatusResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076">http://api-forge.coupang.net/details?specId=5892de09dd65fc87b3386076</a>
     */
    public WishBrandStatusResponse getApiV2WishMemberSrlBrandStatus(Long memberSrl, List<Long> ids) throws ApiException {
        return this.getApiV2WishMemberSrlBrandStatus(memberSrl, ids, null);
    }
    /**
     * Summary : getTotalCount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/totalcount
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlBrandTotalcountForResponseEntity(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlBrandTotalcount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/brand/totalcount"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d6b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getTotalCount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/totalcount
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b</a>
     */
    public <T> T getApiV2WishMemberSrlBrandTotalcount(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlBrandTotalcountForResponseEntity(memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getTotalCount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/totalcount
     * @param memberSrl memberSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlBrandTotalcount(Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.getApiV2WishMemberSrlBrandTotalcount(memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : getTotalCount
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/totalcount
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d6b</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlBrandTotalcount(Long memberSrl) throws ApiException {
        return this.getApiV2WishMemberSrlBrandTotalcount(memberSrl, null);
    }
    /**
     * Summary : getWishTotalcount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/wishTotalcount
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlBrandWishTotalcountForResponseEntity(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlBrandWishTotalcount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/brand/wishTotalcount"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d70", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getWishTotalcount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/wishTotalcount
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70</a>
     */
    public <T> T getApiV2WishMemberSrlBrandWishTotalcount(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlBrandWishTotalcountForResponseEntity(memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getWishTotalcount
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/wishTotalcount
     * @param memberSrl memberSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlBrandWishTotalcount(Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.getApiV2WishMemberSrlBrandWishTotalcount(memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : getWishTotalcount
     * API : cart_api GET /api/v2/wish/{memberSrl}/brand/wishTotalcount
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d70</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlBrandWishTotalcount(Long memberSrl) throws ApiException {
        return this.getApiV2WishMemberSrlBrandWishTotalcount(memberSrl, null);
    }
    /**
     * Summary : checkBrand
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/brand/{brandId}
     * @param memberSrl memberSrl (required)
     * @param brandId brandId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlCheckBrandBrandIdForResponseEntity(Long memberSrl, Long brandId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlCheckBrandBrandId");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new ApiException(400, "Missing the required parameter 'brandId' when calling getApiV2WishMemberSrlCheckBrandBrandId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/check/brand/{brandId}"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString())
            .replaceAll("\\{" + "brandId" + "\\}", brandId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d75", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : checkBrand
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/brand/{brandId}
     * @param memberSrl memberSrl (required)
     * @param brandId brandId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75</a>
     */
    public <T> T getApiV2WishMemberSrlCheckBrandBrandId(Long memberSrl, Long brandId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlCheckBrandBrandIdForResponseEntity(memberSrl, brandId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : checkBrand
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/brand/{brandId}
     * @param memberSrl memberSrl (required)
     * @param brandId brandId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlCheckBrandBrandId(Long memberSrl, Long brandId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.getApiV2WishMemberSrlCheckBrandBrandId(memberSrl, brandId, localVarReturnType, customHeader);
    }

    /**
     * Summary : checkBrand
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/brand/{brandId}
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param brandId brandId(required)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d75</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlCheckBrandBrandId(Long memberSrl, Long brandId) throws ApiException {
        return this.getApiV2WishMemberSrlCheckBrandBrandId(memberSrl, brandId, null);
    }
    /**
     * Summary : checkItemForSDP
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/sdp/{productId}/{itemId}/{vendorItemId}
     * @param memberSrl memberSrl (required)
     * @param productId productId (required)
     * @param itemId itemId (required)
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemIdForResponseEntity(Long memberSrl, Long productId, Long itemId, Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId");
        }
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId");
        }
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId");
        }
        
        // verify the required parameter 'vendorItemId' is set
        if (vendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemId' when calling getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/check/sdp/{productId}/{itemId}/{vendorItemId}"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString())
            .replaceAll("\\{" + "productId" + "\\}", productId.toString())
            .replaceAll("\\{" + "itemId" + "\\}", itemId.toString())
            .replaceAll("\\{" + "vendorItemId" + "\\}", vendorItemId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d8e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : checkItemForSDP
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/sdp/{productId}/{itemId}/{vendorItemId}
     * @param memberSrl memberSrl (required)
     * @param productId productId (required)
     * @param itemId itemId (required)
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishItemCheckSDPResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e</a>
     */
    public <T> T getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId(Long memberSrl, Long productId, Long itemId, Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemIdForResponseEntity(memberSrl, productId, itemId, vendorItemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : checkItemForSDP
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/sdp/{productId}/{itemId}/{vendorItemId}
     * @param memberSrl memberSrl (required)
     * @param productId productId (required)
     * @param itemId itemId (required)
     * @param vendorItemId vendorItemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishItemCheckSDPResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e</a>
     */
    public WishItemCheckSDPResponse getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId(Long memberSrl, Long productId, Long itemId, Long vendorItemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishItemCheckSDPResponse> localVarReturnType = new ParameterizedTypeReference<WishItemCheckSDPResponse>() {};
        return this.getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId(memberSrl, productId, itemId, vendorItemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : checkItemForSDP
     * API : cart_api GET /api/v2/wish/{memberSrl}/check/sdp/{productId}/{itemId}/{vendorItemId}
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param productId productId(required)
     * @param itemId itemId(required)
     * @param vendorItemId vendorItemId(required)
     * @return WishItemCheckSDPResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d8e</a>
     */
    public WishItemCheckSDPResponse getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId(Long memberSrl, Long productId, Long itemId, Long vendorItemId) throws ApiException {
        return this.getApiV2WishMemberSrlCheckSdpProductIdItemIdVendorItemId(memberSrl, productId, itemId, vendorItemId, null);
    }
    /**
     * Summary : updateDeletedStateWishBrand
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/delete/brand
     * @param memberSrl memberSrl (required)
     * @param brandIdList brandIdList (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93</a>
     */
    public <T> ResponseEntity<T> postApiV2WishMemberSrlDeleteBrandForResponseEntity(Long memberSrl, List<Long> brandIdList, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = brandIdList;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling postApiV2WishMemberSrlDeleteBrand");
        }
        
        // verify the required parameter 'brandIdList' is set
        if (brandIdList == null) {
            throw new ApiException(400, "Missing the required parameter 'brandIdList' when calling postApiV2WishMemberSrlDeleteBrand");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/delete/brand"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d93", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : updateDeletedStateWishBrand
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/delete/brand
     * @param memberSrl memberSrl (required)
     * @param brandIdList brandIdList (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93</a>
     */
    public <T> T postApiV2WishMemberSrlDeleteBrand(Long memberSrl, List<Long> brandIdList, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2WishMemberSrlDeleteBrandForResponseEntity(memberSrl, brandIdList, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : updateDeletedStateWishBrand
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/delete/brand
     * @param memberSrl memberSrl (required)
     * @param brandIdList brandIdList (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93</a>
     */
    public WishBrandResponseDTO postApiV2WishMemberSrlDeleteBrand(Long memberSrl, List<Long> brandIdList, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.postApiV2WishMemberSrlDeleteBrand(memberSrl, brandIdList, localVarReturnType, customHeader);
    }

    /**
     * Summary : updateDeletedStateWishBrand
     * API : cart_api POST /api/v2/wish/{memberSrl}/delete/brand
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param brandIdList brandIdList(required)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d93</a>
     */
    public WishBrandResponseDTO postApiV2WishMemberSrlDeleteBrand(Long memberSrl, List<Long> brandIdList) throws ApiException {
        return this.postApiV2WishMemberSrlDeleteBrand(memberSrl, brandIdList, null);
    }
    /**
     * Summary : getBrands
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/get/brands
     * @param memberSrl memberSrl (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of recods per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0">http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0</a>
     */
    public <T> ResponseEntity<T> getApiV2WishMemberSrlGetBrandsForResponseEntity(Long memberSrl, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2WishMemberSrlGetBrands");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/get/brands"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c68eba9c2ccc90d7e32db0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getBrands
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/get/brands
     * @param memberSrl memberSrl (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of recods per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0">http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0</a>
     */
    public <T> T getApiV2WishMemberSrlGetBrands(Long memberSrl, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2WishMemberSrlGetBrandsForResponseEntity(memberSrl, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getBrands
     * Notes : 
     * API : cart_api GET /api/v2/wish/{memberSrl}/get/brands
     * @param memberSrl memberSrl (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of recods per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0">http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlGetBrands(Long memberSrl, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.getApiV2WishMemberSrlGetBrands(memberSrl, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getBrands
     * API : cart_api GET /api/v2/wish/{memberSrl}/get/brands
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of recods per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0">http://api-forge.coupang.net/details?specId=57c68eba9c2ccc90d7e32db0</a>
     */
    public WishBrandResponseDTO getApiV2WishMemberSrlGetBrands(Long memberSrl, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV2WishMemberSrlGetBrands(memberSrl, page, size, sort, null);
    }
    /**
     * Summary : save
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/register/brand
     * @param memberSrl memberSrl (required)
     * @param wishBrandDTO wishBrandDTO (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7</a>
     */
    public <T> ResponseEntity<T> postApiV2WishMemberSrlRegisterBrandForResponseEntity(Long memberSrl, WishBrandDTO wishBrandDTO, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = wishBrandDTO;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling postApiV2WishMemberSrlRegisterBrand");
        }
        
        // verify the required parameter 'wishBrandDTO' is set
        if (wishBrandDTO == null) {
            throw new ApiException(400, "Missing the required parameter 'wishBrandDTO' when calling postApiV2WishMemberSrlRegisterBrand");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/wish/{memberSrl}/register/brand"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2da7", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : save
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/register/brand
     * @param memberSrl memberSrl (required)
     * @param wishBrandDTO wishBrandDTO (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7</a>
     */
    public <T> T postApiV2WishMemberSrlRegisterBrand(Long memberSrl, WishBrandDTO wishBrandDTO, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2WishMemberSrlRegisterBrandForResponseEntity(memberSrl, wishBrandDTO, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : save
     * Notes : 
     * API : cart_api POST /api/v2/wish/{memberSrl}/register/brand
     * @param memberSrl memberSrl (required)
     * @param wishBrandDTO wishBrandDTO (required)
     * @param customHeader customHeaderMap (nullable)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7</a>
     */
    public WishBrandResponseDTO postApiV2WishMemberSrlRegisterBrand(Long memberSrl, WishBrandDTO wishBrandDTO, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<WishBrandResponseDTO> localVarReturnType = new ParameterizedTypeReference<WishBrandResponseDTO>() {};
        return this.postApiV2WishMemberSrlRegisterBrand(memberSrl, wishBrandDTO, localVarReturnType, customHeader);
    }

    /**
     * Summary : save
     * API : cart_api POST /api/v2/wish/{memberSrl}/register/brand
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @param wishBrandDTO wishBrandDTO(required)
     * @return WishBrandResponseDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2da7</a>
     */
    public WishBrandResponseDTO postApiV2WishMemberSrlRegisterBrand(Long memberSrl, WishBrandDTO wishBrandDTO) throws ApiException {
        return this.postApiV2WishMemberSrlRegisterBrand(memberSrl, wishBrandDTO, null);
    }
}
