package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.AttachmentGalleryDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfVideoAttachmentDto;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfAttachmentDto;

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
public class ProductreviewApiV1AttachmentsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiV1AttachmentsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getAttachmentGallery
     * Notes : 
     * API : product_review GET /api/v1/attachments/gallery/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e</a>
     */
    public <T> ResponseEntity<T> getApiV1AttachmentsGalleryProductIdForResponseEntity(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1AttachmentsGalleryProductId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/attachments/gallery/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58f70afbcf2a061c142b112e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getAttachmentGallery
     * Notes : 
     * API : product_review GET /api/v1/attachments/gallery/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AttachmentGalleryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e</a>
     */
    public <T> T getApiV1AttachmentsGalleryProductId(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttachmentsGalleryProductIdForResponseEntity(productId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getAttachmentGallery
     * Notes : 
     * API : product_review GET /api/v1/attachments/gallery/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return AttachmentGalleryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e</a>
     */
    public AttachmentGalleryDto getApiV1AttachmentsGalleryProductId(Long productId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AttachmentGalleryDto> localVarReturnType = new ParameterizedTypeReference<AttachmentGalleryDto>() {};
        return this.getApiV1AttachmentsGalleryProductId(productId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getAttachmentGallery
     * API : product_review GET /api/v1/attachments/gallery/{productId}
     * Notes : 
     * @param productId productId(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return AttachmentGalleryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b112e</a>
     */
    public AttachmentGalleryDto getApiV1AttachmentsGalleryProductId(Long productId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1AttachmentsGalleryProductId(productId, page, size, sort, null);
    }
    /**
     * Summary : getVideoAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/video/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133</a>
     */
    public <T> ResponseEntity<T> getApiV1AttachmentsVideoProductIdForResponseEntity(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1AttachmentsVideoProductId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/attachments/video/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58f70afbcf2a061c142b1133", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getVideoAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/video/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfVideoAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133</a>
     */
    public <T> T getApiV1AttachmentsVideoProductId(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttachmentsVideoProductIdForResponseEntity(productId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getVideoAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/video/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfVideoAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133</a>
     */
    public PagedResourcesOfVideoAttachmentDto getApiV1AttachmentsVideoProductId(Long productId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfVideoAttachmentDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfVideoAttachmentDto>() {};
        return this.getApiV1AttachmentsVideoProductId(productId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getVideoAttachmentsByProductId
     * API : product_review GET /api/v1/attachments/video/{productId}
     * Notes : 
     * @param productId productId(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfVideoAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133">http://api-forge.coupang.net/details?specId=58f70afbcf2a061c142b1133</a>
     */
    public PagedResourcesOfVideoAttachmentDto getApiV1AttachmentsVideoProductId(Long productId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1AttachmentsVideoProductId(productId, page, size, sort, null);
    }
    /**
     * Summary : getAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333</a>
     */
    public <T> ResponseEntity<T> getApiV1AttachmentsProductIdForResponseEntity(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1AttachmentsProductId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/attachments/{productId}"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("580dd2a24982e9a7c61e1333", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333</a>
     */
    public <T> T getApiV1AttachmentsProductId(Long productId, Integer page, Integer size, List<String> sort, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttachmentsProductIdForResponseEntity(productId, page, size, sort, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getAttachmentsByProductId
     * Notes : 
     * API : product_review GET /api/v1/attachments/{productId}
     * @param productId productId (required)
     * @param page Results page you want to retrieve (0..N) (optional)
     * @param size Number of records per page (optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedResourcesOfAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333</a>
     */
    public PagedResourcesOfAttachmentDto getApiV1AttachmentsProductId(Long productId, Integer page, Integer size, List<String> sort, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedResourcesOfAttachmentDto> localVarReturnType = new ParameterizedTypeReference<PagedResourcesOfAttachmentDto>() {};
        return this.getApiV1AttachmentsProductId(productId, page, size, sort, localVarReturnType, customHeader);
    }

    /**
     * Summary : getAttachmentsByProductId
     * API : product_review GET /api/v1/attachments/{productId}
     * Notes : 
     * @param productId productId(required)
     * @param page Results page you want to retrieve (0..N)(optional)
     * @param size Number of records per page(optional)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.(optional)
     * @return PagedResourcesOfAttachmentDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333">http://api-forge.coupang.net/details?specId=580dd2a24982e9a7c61e1333</a>
     */
    public PagedResourcesOfAttachmentDto getApiV1AttachmentsProductId(Long productId, Integer page, Integer size, List<String> sort) throws ApiException {
        return this.getApiV1AttachmentsProductId(productId, page, size, sort, null);
    }
}
