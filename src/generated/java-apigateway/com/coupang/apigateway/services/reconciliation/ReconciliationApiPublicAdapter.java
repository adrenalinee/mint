package com.coupang.apigateway.services.reconciliation;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.reconciliation.model.ReconciliationDto;
import java.util.*;
import com.coupang.apigateway.services.reconciliation.model.ReconciledItemDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.914+09:00")
@org.springframework.stereotype.Component
public class ReconciliationApiPublicAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ReconciliationApiPublicAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("reconciliation");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getReconciledMainImage
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/mainimage/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa</a>
     */
    public <T> ResponseEntity<T> getApiPublicV1ReconciliationMainimageItemIdForResponseEntity(String itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getApiPublicV1ReconciliationMainimageItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/public/v1/reconciliation/mainimage/{itemId}"
            .replaceAll("\\{" + "itemId" + "\\}", itemId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57bd71c0978ed54782a261fa", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReconciledMainImage
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/mainimage/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReconciliationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa</a>
     */
    public <T> T getApiPublicV1ReconciliationMainimageItemId(String itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiPublicV1ReconciliationMainimageItemIdForResponseEntity(itemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReconciledMainImage
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/mainimage/{itemId}
     * @param itemId itemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReconciliationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa</a>
     */
    public ReconciliationDto getApiPublicV1ReconciliationMainimageItemId(String itemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReconciliationDto> localVarReturnType = new ParameterizedTypeReference<ReconciliationDto>() {};
        return this.getApiPublicV1ReconciliationMainimageItemId(itemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReconciledMainImage
     * API : reconciliation GET /api/public/v1/reconciliation/mainimage/{itemId}
     * Notes : 
     * @param itemId itemId(required)
     * @return ReconciliationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261fa</a>
     */
    public ReconciliationDto getApiPublicV1ReconciliationMainimageItemId(String itemId) throws ApiException {
        return this.getApiPublicV1ReconciliationMainimageItemId(itemId, null);
    }
    /**
     * Summary : getReconciledMainImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/mainimagelist
     * @param itemIdLists itemIdLists (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff</a>
     */
    public <T> ResponseEntity<T> postApiPublicV1ReconciliationMainimagelistForResponseEntity(List<String> itemIdLists, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = itemIdLists;
        
        // verify the required parameter 'itemIdLists' is set
        if (itemIdLists == null) {
            throw new ApiException(400, "Missing the required parameter 'itemIdLists' when calling postApiPublicV1ReconciliationMainimagelist");
        }
        
        // create path and map variables
        String localVarPath = "/api/public/v1/reconciliation/mainimagelist";

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

        return apiClient.invokeAPIForResponseEntity("57bd71c0978ed54782a261ff", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReconciledMainImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/mainimagelist
     * @param itemIdLists itemIdLists (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ReconciliationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff</a>
     */
    public <T> T postApiPublicV1ReconciliationMainimagelist(List<String> itemIdLists, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiPublicV1ReconciliationMainimagelistForResponseEntity(itemIdLists, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReconciledMainImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/mainimagelist
     * @param itemIdLists itemIdLists (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ReconciliationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff</a>
     */
    public Map<String, ReconciliationDto> postApiPublicV1ReconciliationMainimagelist(List<String> itemIdLists, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, ReconciliationDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, ReconciliationDto>>() {};
        return this.postApiPublicV1ReconciliationMainimagelist(itemIdLists, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReconciledMainImageList
     * API : reconciliation POST /api/public/v1/reconciliation/mainimagelist
     * Notes : 
     * @param itemIdLists itemIdLists(required)
     * @return Map<String, ReconciliationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff">http://api-forge.coupang.net/details?specId=57bd71c0978ed54782a261ff</a>
     */
    public Map<String, ReconciliationDto> postApiPublicV1ReconciliationMainimagelist(List<String> itemIdLists) throws ApiException {
        return this.postApiPublicV1ReconciliationMainimagelist(itemIdLists, null);
    }
    /**
     * Summary : getReconciledItem
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/reconcileditem/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b</a>
     */
    public <T> ResponseEntity<T> getApiPublicV1ReconciliationReconcileditemItemIdForResponseEntity(String itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getApiPublicV1ReconciliationReconcileditemItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/public/v1/reconciliation/reconcileditem/{itemId}"
            .replaceAll("\\{" + "itemId" + "\\}", itemId.toString());

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

        return apiClient.invokeAPIForResponseEntity("584a4693b4c3af4c1e09e03b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReconciledItem
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/reconcileditem/{itemId}
     * @param itemId itemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ReconciledItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b</a>
     */
    public <T> T getApiPublicV1ReconciliationReconcileditemItemId(String itemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiPublicV1ReconciliationReconcileditemItemIdForResponseEntity(itemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReconciledItem
     * Notes : 
     * API : reconciliation GET /api/public/v1/reconciliation/reconcileditem/{itemId}
     * @param itemId itemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ReconciledItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b</a>
     */
    public ReconciledItemDto getApiPublicV1ReconciliationReconcileditemItemId(String itemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ReconciledItemDto> localVarReturnType = new ParameterizedTypeReference<ReconciledItemDto>() {};
        return this.getApiPublicV1ReconciliationReconcileditemItemId(itemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReconciledItem
     * API : reconciliation GET /api/public/v1/reconciliation/reconcileditem/{itemId}
     * Notes : 
     * @param itemId itemId(required)
     * @return ReconciledItemDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e03b</a>
     */
    public ReconciledItemDto getApiPublicV1ReconciliationReconcileditemItemId(String itemId) throws ApiException {
        return this.getApiPublicV1ReconciliationReconcileditemItemId(itemId, null);
    }
    /**
     * Summary : getReconciledMainImageAndAlternateImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/reconcileditemlist
     * @param itemIdLists itemIdLists (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045</a>
     */
    public <T> ResponseEntity<T> postApiPublicV1ReconciliationReconcileditemlistForResponseEntity(List<String> itemIdLists, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = itemIdLists;
        
        // verify the required parameter 'itemIdLists' is set
        if (itemIdLists == null) {
            throw new ApiException(400, "Missing the required parameter 'itemIdLists' when calling postApiPublicV1ReconciliationReconcileditemlist");
        }
        
        // create path and map variables
        String localVarPath = "/api/public/v1/reconciliation/reconcileditemlist";

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

        return apiClient.invokeAPIForResponseEntity("584a4693b4c3af4c1e09e045", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getReconciledMainImageAndAlternateImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/reconcileditemlist
     * @param itemIdLists itemIdLists (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ReconciledItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045</a>
     */
    public <T> T postApiPublicV1ReconciliationReconcileditemlist(List<String> itemIdLists, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiPublicV1ReconciliationReconcileditemlistForResponseEntity(itemIdLists, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getReconciledMainImageAndAlternateImageList
     * Notes : 
     * API : reconciliation POST /api/public/v1/reconciliation/reconcileditemlist
     * @param itemIdLists itemIdLists (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, ReconciledItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045</a>
     */
    public Map<String, ReconciledItemDto> postApiPublicV1ReconciliationReconcileditemlist(List<String> itemIdLists, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, ReconciledItemDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, ReconciledItemDto>>() {};
        return this.postApiPublicV1ReconciliationReconcileditemlist(itemIdLists, localVarReturnType, customHeader);
    }

    /**
     * Summary : getReconciledMainImageAndAlternateImageList
     * API : reconciliation POST /api/public/v1/reconciliation/reconcileditemlist
     * Notes : 
     * @param itemIdLists itemIdLists(required)
     * @return Map<String, ReconciledItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045">http://api-forge.coupang.net/details?specId=584a4693b4c3af4c1e09e045</a>
     */
    public Map<String, ReconciledItemDto> postApiPublicV1ReconciliationReconcileditemlist(List<String> itemIdLists) throws ApiException {
        return this.postApiPublicV1ReconciliationReconcileditemlist(itemIdLists, null);
    }
}
