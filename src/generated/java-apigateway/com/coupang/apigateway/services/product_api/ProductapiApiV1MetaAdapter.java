package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.CategoryDto;
import com.coupang.apigateway.services.product_api.model.UnitPriceRawData;
import java.util.*;
import com.coupang.apigateway.services.product_api.model.PriceInformationDto;

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
public class ProductapiApiV1MetaAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1MetaAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getCategory
     * Notes : 
     * API : product_api GET /api/v1/meta/category/{categoryId}
     * @param categoryId categoryId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e">http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e</a>
     */
    public <T> ResponseEntity<T> getApiV1MetaCategoryCategoryIdForResponseEntity(Long categoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getApiV1MetaCategoryCategoryId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/meta/category/{categoryId}"
            .replaceAll("\\{" + "categoryId" + "\\}", categoryId.toString());

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

        return apiClient.invokeAPIForResponseEntity("5846246b186af774f880bd6e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getCategory
     * Notes : 
     * API : product_api GET /api/v1/meta/category/{categoryId}
     * @param categoryId categoryId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return CategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e">http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e</a>
     */
    public <T> T getApiV1MetaCategoryCategoryId(Long categoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1MetaCategoryCategoryIdForResponseEntity(categoryId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getCategory
     * Notes : 
     * API : product_api GET /api/v1/meta/category/{categoryId}
     * @param categoryId categoryId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return CategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e">http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e</a>
     */
    public CategoryDto getApiV1MetaCategoryCategoryId(Long categoryId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<CategoryDto> localVarReturnType = new ParameterizedTypeReference<CategoryDto>() {};
        return this.getApiV1MetaCategoryCategoryId(categoryId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getCategory
     * API : product_api GET /api/v1/meta/category/{categoryId}
     * Notes : 
     * @param categoryId categoryId(required)
     * @return CategoryDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e">http://api-forge.coupang.net/details?specId=5846246b186af774f880bd6e</a>
     */
    public CategoryDto getApiV1MetaCategoryCategoryId(Long categoryId) throws ApiException {
        return this.getApiV1MetaCategoryCategoryId(categoryId, null);
    }
    /**
     * Summary : getUnitPriceInfo
     * Notes : 
     * API : product_api POST /api/v1/meta/unitprice/getunitpriceinfo
     * @param rawData rawData (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3">http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3</a>
     */
    public <T> ResponseEntity<T> postApiV1MetaUnitpriceGetunitpriceinfoForResponseEntity(List<UnitPriceRawData> rawData, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = rawData;
        
        // verify the required parameter 'rawData' is set
        if (rawData == null) {
            throw new ApiException(400, "Missing the required parameter 'rawData' when calling postApiV1MetaUnitpriceGetunitpriceinfo");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/meta/unitprice/getunitpriceinfo";

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

        return apiClient.invokeAPIForResponseEntity("58ad38952d769eff7785eda3", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getUnitPriceInfo
     * Notes : 
     * API : product_api POST /api/v1/meta/unitprice/getunitpriceinfo
     * @param rawData rawData (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<PriceInformationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3">http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3</a>
     */
    public <T> T postApiV1MetaUnitpriceGetunitpriceinfo(List<UnitPriceRawData> rawData, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MetaUnitpriceGetunitpriceinfoForResponseEntity(rawData, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getUnitPriceInfo
     * Notes : 
     * API : product_api POST /api/v1/meta/unitprice/getunitpriceinfo
     * @param rawData rawData (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<PriceInformationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3">http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3</a>
     */
    public List<PriceInformationDto> postApiV1MetaUnitpriceGetunitpriceinfo(List<UnitPriceRawData> rawData, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<PriceInformationDto>> localVarReturnType = new ParameterizedTypeReference<List<PriceInformationDto>>() {};
        return this.postApiV1MetaUnitpriceGetunitpriceinfo(rawData, localVarReturnType, customHeader);
    }

    /**
     * Summary : getUnitPriceInfo
     * API : product_api POST /api/v1/meta/unitprice/getunitpriceinfo
     * Notes : 
     * @param rawData rawData(required)
     * @return List<PriceInformationDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3">http://api-forge.coupang.net/details?specId=58ad38952d769eff7785eda3</a>
     */
    public List<PriceInformationDto> postApiV1MetaUnitpriceGetunitpriceinfo(List<UnitPriceRawData> rawData) throws ApiException {
        return this.postApiV1MetaUnitpriceGetunitpriceinfo(rawData, null);
    }
}
