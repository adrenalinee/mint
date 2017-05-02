package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.PagedResourcesOfInteractionHistoryDto;
import com.coupang.apigateway.services.product_review.model.InteractionHistoryDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
@org.springframework.stereotype.Component
public class ProductreviewApiV1HistoriesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1HistoriesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : list
     * Notes : 
     * API : product_review GET /api/v1/histories
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d">http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d</a>
     */
    public <T> ResponseEntity<T> getApiV1HistoriesForResponseEntity(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1Histories");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/histories";

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
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f86fc0ccf5ea61fd1aa72d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : list
     * Notes : 
     * API : product_review GET /api/v1/histories
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfInteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d">http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d</a>
     */
    public <T> T getApiV1Histories(String xMemberId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1HistoriesForResponseEntity(xMemberId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : list
     * Notes : 
     * API : product_review GET /api/v1/histories
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfInteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d">http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d</a>
     */
    public PagedResourcesOfInteractionHistoryDto getApiV1Histories(String xMemberId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfInteractionHistoryDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfInteractionHistoryDto>() {};
        return this.getApiV1Histories(xMemberId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : list
     * API : product_review GET /api/v1/histories
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfInteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d">http://api-forge.coupang.net/details?specId=58f86fc0ccf5ea61fd1aa72d</a>
     */
    public PagedResourcesOfInteractionHistoryDto getApiV1Histories(String xMemberId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1Histories(xMemberId, page, size, sort, null);
    }
    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/histories/count
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00</a>
     */
    public <T> ResponseEntity<T> getApiV1HistoriesCountForResponseEntity(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling getApiV1HistoriesCount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/histories/count";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f7299949c31ab326ddca00", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/histories/count
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00</a>
     */
    public <T> T getApiV1HistoriesCount(String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1HistoriesCountForResponseEntity(xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : count
     * Notes : 
     * API : product_review GET /api/v1/histories/count
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00</a>
     */
    public Long getApiV1HistoriesCount(String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return this.getApiV1HistoriesCount(xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : count
     * API : product_review GET /api/v1/histories/count
     * Notes : 
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return Long
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca00</a>
     */
    public Long getApiV1HistoriesCount(String xMemberId) throws ApiException {
        return this.getApiV1HistoriesCount(xMemberId, null);
    }
    /**
     * Summary : checkHistory
     * Notes : 
     * API : product_review POST /api/v1/histories/{interactionHistoryId}
     * @param interactionHistoryId interactionHistoryId (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05</a>
     */
    public <T> ResponseEntity<T> postApiV1HistoriesInteractionHistoryIdForResponseEntity(Long interactionHistoryId, String xMemberType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'interactionHistoryId' is set
        if (interactionHistoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'interactionHistoryId' when calling postApiV1HistoriesInteractionHistoryId");
        }
        
        // verify the required parameter 'xMemberType' is set
        if (xMemberType == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberType' when calling postApiV1HistoriesInteractionHistoryId");
        }
        
        // verify the required parameter 'xMemberId' is set
        if (xMemberId == null) {
            throw new ApiException(400, "Missing the required parameter 'xMemberId' when calling postApiV1HistoriesInteractionHistoryId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/histories/{interactionHistoryId}"
            .replaceAll("\\{" + "interactionHistoryId" + "\\}", interactionHistoryId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        if (xMemberType != null) {
          localVarHeaderParams.put("X-MemberType", apiClient.parameterToString(xMemberType));
        }if (xMemberId != null) {
          localVarHeaderParams.put("X-MemberId", apiClient.parameterToString(xMemberId));
        }
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f7299949c31ab326ddca05", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : checkHistory
     * Notes : 
     * API : product_review POST /api/v1/histories/{interactionHistoryId}
     * @param interactionHistoryId interactionHistoryId (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return InteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05</a>
     */
    public <T> T postApiV1HistoriesInteractionHistoryId(Long interactionHistoryId, String xMemberType, String xMemberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1HistoriesInteractionHistoryIdForResponseEntity(interactionHistoryId, xMemberType, xMemberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : checkHistory
     * Notes : 
     * API : product_review POST /api/v1/histories/{interactionHistoryId}
     * @param interactionHistoryId interactionHistoryId (required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39; (required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null (required)
     * @param customHeader customHeaderMap (nullable)
     * @return InteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05</a>
     */
    public InteractionHistoryDto postApiV1HistoriesInteractionHistoryId(Long interactionHistoryId, String xMemberType, String xMemberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<InteractionHistoryDto> localVarReturnType = new ParameterizedTypeReference<InteractionHistoryDto>() {};
        return this.postApiV1HistoriesInteractionHistoryId(interactionHistoryId, xMemberType, xMemberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : checkHistory
     * API : product_review POST /api/v1/histories/{interactionHistoryId}
     * Notes : 
     * @param interactionHistoryId interactionHistoryId(required)
     * @param xMemberType If customer then &#39;USER&#39;, if vendor then &#39;VENDOR, if coupang employee then &#39;COUPANG_MANAGER&#39;(required)
     * @param xMemberId If customer then memberSrl, if vendor or coupang employee then Login ID, if not login then null(required)
     * @return InteractionHistoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05">http://api-forge.coupang.net/details?specId=58f7299949c31ab326ddca05</a>
     */
    public InteractionHistoryDto postApiV1HistoriesInteractionHistoryId(Long interactionHistoryId, String xMemberType, String xMemberId) throws ApiException {
        return this.postApiV1HistoriesInteractionHistoryId(interactionHistoryId, xMemberType, xMemberId, null);
    }
}
