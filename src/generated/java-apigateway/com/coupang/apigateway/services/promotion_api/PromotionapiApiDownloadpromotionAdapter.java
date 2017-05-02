package com.coupang.apigateway.services.promotion_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.promotion_api.model.DownloadPromotionDTO;
import com.coupang.apigateway.services.promotion_api.model.PageResponseOfDownloadPromotionPromotionalItemDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
@org.springframework.stereotype.Component
public class PromotionapiApiDownloadpromotionAdapter {

    private final ApiClient apiClient;

    @Autowired
    public PromotionapiApiDownloadpromotionAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("promotion_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : Get a download promotion
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a</a>
     */
    public <T> ResponseEntity<T> getApiDownloadPromotionV1PromotionsIdForResponseEntity(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getApiDownloadPromotionV1PromotionsId");
        }
        
        // create path and map variables
        String localVarPath = "/api/download-promotion/v1/promotions/{id}"
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

        return apiClient.invokeAPIForResponseEntity("58d32913ddcd4e863916bb4a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Get a download promotion
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}
     * @param id id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DownloadPromotionDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a</a>
     */
    public <T> T getApiDownloadPromotionV1PromotionsId(Long id, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiDownloadPromotionV1PromotionsIdForResponseEntity(id, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Get a download promotion
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}
     * @param id id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DownloadPromotionDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a</a>
     */
    public DownloadPromotionDTO getApiDownloadPromotionV1PromotionsId(Long id, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DownloadPromotionDTO> localVarReturnType = new ParameterizedTypeReference<DownloadPromotionDTO>() {};
        return this.getApiDownloadPromotionV1PromotionsId(id, localVarReturnType, customHeader);
    }

    /**
     * Summary : Get a download promotion
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}
     * Notes : 
     * @param id id(required)
     * @return DownloadPromotionDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4a</a>
     */
    public DownloadPromotionDTO getApiDownloadPromotionV1PromotionsId(Long id) throws ApiException {
        return this.getApiDownloadPromotionV1PromotionsId(id, null);
    }
    /**
     * Summary : getPromotionalItems
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}/promotional-items
     * @param id id (required)
     * @param page page (optional)
     * @param size size (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f</a>
     */
    public <T> ResponseEntity<T> getApiDownloadPromotionV1PromotionsIdPromotionalItemsForResponseEntity(Long id, Integer page, Integer size, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getApiDownloadPromotionV1PromotionsIdPromotionalItems");
        }
        
        // create path and map variables
        String localVarPath = "/api/download-promotion/v1/promotions/{id}/promotional-items"
            .replaceAll("\\{" + "id" + "\\}", id.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58d32913ddcd4e863916bb4f", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getPromotionalItems
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}/promotional-items
     * @param id id (required)
     * @param page page (optional)
     * @param size size (optional, default to 10)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PageResponseOfDownloadPromotionPromotionalItemDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f</a>
     */
    public <T> T getApiDownloadPromotionV1PromotionsIdPromotionalItems(Long id, Integer page, Integer size, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiDownloadPromotionV1PromotionsIdPromotionalItemsForResponseEntity(id, page, size, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getPromotionalItems
     * Notes : 
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}/promotional-items
     * @param id id (required)
     * @param page page (optional)
     * @param size size (optional, default to 10)
     * @param customHeader customHeaderMap (nullable)
     * @return PageResponseOfDownloadPromotionPromotionalItemDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f</a>
     */
    public PageResponseOfDownloadPromotionPromotionalItemDTO getApiDownloadPromotionV1PromotionsIdPromotionalItems(Long id, Integer page, Integer size, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PageResponseOfDownloadPromotionPromotionalItemDTO> localVarReturnType = new ParameterizedTypeReference<PageResponseOfDownloadPromotionPromotionalItemDTO>() {};
        return this.getApiDownloadPromotionV1PromotionsIdPromotionalItems(id, page, size, localVarReturnType, customHeader);
    }

    /**
     * Summary : getPromotionalItems
     * API : promotion_api GET /api/download-promotion/v1/promotions/{id}/promotional-items
     * Notes : 
     * @param id id(required)
     * @param page page(optional)
     * @param size size(optional, default to 10)
     * @return PageResponseOfDownloadPromotionPromotionalItemDTO
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f">http://api-forge.coupang.net/details?specId=58d32913ddcd4e863916bb4f</a>
     */
    public PageResponseOfDownloadPromotionPromotionalItemDTO getApiDownloadPromotionV1PromotionsIdPromotionalItems(Long id, Integer page, Integer size) throws ApiException {
        return this.getApiDownloadPromotionV1PromotionsIdPromotionalItems(id, page, size, null);
    }
}
