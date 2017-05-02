package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.CouponFilterTypeDto;
import com.coupang.apigateway.services.product_api.model.PagedObjectDtoOfRentalCarDto;
import com.coupang.apigateway.services.product_api.model.CouponConditionDto;
import com.coupang.apigateway.services.product_api.model.RentalCarDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
@org.springframework.stereotype.Component
public class ProductapiApiV1RentalcarAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1RentalcarAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 검색 필터를 조회
     * Notes : 검색 필터를 조회
     * API : product_api GET /api/v1/rentalcar/filters
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d">http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d</a>
     */
    public <T> ResponseEntity<T> getApiV1RentalcarFiltersForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/rentalcar/filters";

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

        return apiClient.invokeAPIForResponseEntity("5846246d186af774f880be2d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 검색 필터를 조회
     * Notes : 검색 필터를 조회
     * API : product_api GET /api/v1/rentalcar/filters
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<CouponFilterTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d">http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d</a>
     */
    public <T> T getApiV1RentalcarFilters(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1RentalcarFiltersForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 검색 필터를 조회
     * Notes : 검색 필터를 조회
     * API : product_api GET /api/v1/rentalcar/filters
     * @param customHeader customHeaderMap (nullable)
     * @return List<CouponFilterTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d">http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d</a>
     */
    public List<CouponFilterTypeDto> getApiV1RentalcarFilters(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<CouponFilterTypeDto>> localVarReturnType = new ParameterizedTypeReference<List<CouponFilterTypeDto>>() {};
        return this.getApiV1RentalcarFilters(localVarReturnType, customHeader);
    }

    /**
     * Summary : 검색 필터를 조회
     * API : product_api GET /api/v1/rentalcar/filters
     * Notes : 검색 필터를 조회
     * @return List<CouponFilterTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d">http://api-forge.coupang.net/details?specId=5846246d186af774f880be2d</a>
     */
    public List<CouponFilterTypeDto> getApiV1RentalcarFilters() throws ApiException {
        return this.getApiV1RentalcarFilters(null);
    }
    /**
     * Summary : condition으로 item 목록을 조회
     * Notes : condition으로 item 목록을 조회
     * API : product_api POST /api/v1/rentalcar/item-list
     * @param condition condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401</a>
     */
    public <T> ResponseEntity<T> postApiV1RentalcarItemListForResponseEntity(CouponConditionDto condition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = condition;
        
        // verify the required parameter 'condition' is set
        if (condition == null) {
            throw new ApiException(400, "Missing the required parameter 'condition' when calling postApiV1RentalcarItemList");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/rentalcar/item-list";

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

        return apiClient.invokeAPIForResponseEntity("58e1cb59a582a4ca84645401", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : condition으로 item 목록을 조회
     * Notes : condition으로 item 목록을 조회
     * API : product_api POST /api/v1/rentalcar/item-list
     * @param condition condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PagedObjectDtoOfRentalCarDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401</a>
     */
    public <T> T postApiV1RentalcarItemList(CouponConditionDto condition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1RentalcarItemListForResponseEntity(condition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : condition으로 item 목록을 조회
     * Notes : condition으로 item 목록을 조회
     * API : product_api POST /api/v1/rentalcar/item-list
     * @param condition condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return PagedObjectDtoOfRentalCarDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401</a>
     */
    public PagedObjectDtoOfRentalCarDto postApiV1RentalcarItemList(CouponConditionDto condition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PagedObjectDtoOfRentalCarDto> localVarReturnType = new ParameterizedTypeReference<PagedObjectDtoOfRentalCarDto>() {};
        return this.postApiV1RentalcarItemList(condition, localVarReturnType, customHeader);
    }

    /**
     * Summary : condition으로 item 목록을 조회
     * API : product_api POST /api/v1/rentalcar/item-list
     * Notes : condition으로 item 목록을 조회
     * @param condition condition(required)
     * @return PagedObjectDtoOfRentalCarDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca84645401</a>
     */
    public PagedObjectDtoOfRentalCarDto postApiV1RentalcarItemList(CouponConditionDto condition) throws ApiException {
        return this.postApiV1RentalcarItemList(condition, null);
    }
    /**
     * Summary : condition으로 item별 vendorItem 목록을 조회
     * Notes : condition으로 vendorItem 목록을 조회
     * API : product_api POST /api/v1/rentalcar/vendor-item-list
     * @param condition condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc</a>
     */
    public <T> ResponseEntity<T> postApiV1RentalcarVendorItemListForResponseEntity(CouponConditionDto condition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = condition;
        
        // verify the required parameter 'condition' is set
        if (condition == null) {
            throw new ApiException(400, "Missing the required parameter 'condition' when calling postApiV1RentalcarVendorItemList");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/rentalcar/vendor-item-list";

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

        return apiClient.invokeAPIForResponseEntity("58e1cb59a582a4ca846453fc", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : condition으로 item별 vendorItem 목록을 조회
     * Notes : condition으로 vendorItem 목록을 조회
     * API : product_api POST /api/v1/rentalcar/vendor-item-list
     * @param condition condition (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<RentalCarDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc</a>
     */
    public <T> T postApiV1RentalcarVendorItemList(CouponConditionDto condition, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1RentalcarVendorItemListForResponseEntity(condition, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : condition으로 item별 vendorItem 목록을 조회
     * Notes : condition으로 vendorItem 목록을 조회
     * API : product_api POST /api/v1/rentalcar/vendor-item-list
     * @param condition condition (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<RentalCarDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc</a>
     */
    public List<RentalCarDto> postApiV1RentalcarVendorItemList(CouponConditionDto condition, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<RentalCarDto>> localVarReturnType = new ParameterizedTypeReference<List<RentalCarDto>>() {};
        return this.postApiV1RentalcarVendorItemList(condition, localVarReturnType, customHeader);
    }

    /**
     * Summary : condition으로 item별 vendorItem 목록을 조회
     * API : product_api POST /api/v1/rentalcar/vendor-item-list
     * Notes : condition으로 vendorItem 목록을 조회
     * @param condition condition(required)
     * @return List<RentalCarDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc">http://api-forge.coupang.net/details?specId=58e1cb59a582a4ca846453fc</a>
     */
    public List<RentalCarDto> postApiV1RentalcarVendorItemList(CouponConditionDto condition) throws ApiException {
        return this.postApiV1RentalcarVendorItemList(condition, null);
    }
}
