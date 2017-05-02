package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.VendorItemPackageContentDto;

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
public class ProductapiApiV2VendoritempackageAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV2VendoritempackageAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * Notes : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * API : product_api GET /api/v2/vendoritempackage/{vendorItemPackageId}/contents
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param locale locale (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4">http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4</a>
     */
    public <T> ResponseEntity<T> getApiV2VendoritempackageVendorItemPackageIdContentsForResponseEntity(Long vendorItemPackageId, String locale, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV2VendoritempackageVendorItemPackageIdContents");
        }
        
        // verify the required parameter 'locale' is set
        if (locale == null) {
            throw new ApiException(400, "Missing the required parameter 'locale' when calling getApiV2VendoritempackageVendorItemPackageIdContents");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/vendoritempackage/{vendorItemPackageId}/contents"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58edae5fbf43cbf61fc7d5b4", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * Notes : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * API : product_api GET /api/v2/vendoritempackage/{vendorItemPackageId}/contents
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param locale locale (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemPackageContentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4">http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4</a>
     */
    public <T> T getApiV2VendoritempackageVendorItemPackageIdContents(Long vendorItemPackageId, String locale, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2VendoritempackageVendorItemPackageIdContentsForResponseEntity(vendorItemPackageId, locale, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * Notes : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * API : product_api GET /api/v2/vendoritempackage/{vendorItemPackageId}/contents
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param locale locale (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemPackageContentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4">http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4</a>
     */
    public List<VendorItemPackageContentDto> getApiV2VendoritempackageVendorItemPackageIdContents(Long vendorItemPackageId, String locale, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<VendorItemPackageContentDto>> localVarReturnType = new ParameterizedTypeReference<List<VendorItemPackageContentDto>>() {};
        return this.getApiV2VendoritempackageVendorItemPackageIdContents(vendorItemPackageId, locale, localVarReturnType, customHeader);
    }

    /**
     * Summary : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * API : product_api GET /api/v2/vendoritempackage/{vendorItemPackageId}/contents
     * Notes : vendorItemPackageId와 Locale로 이미지 텍스트분리 컨텐츠의 객체를 얻는다.
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @param locale locale(required)
     * @return List<VendorItemPackageContentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4">http://api-forge.coupang.net/details?specId=58edae5fbf43cbf61fc7d5b4</a>
     */
    public List<VendorItemPackageContentDto> getApiV2VendoritempackageVendorItemPackageIdContents(Long vendorItemPackageId, String locale) throws ApiException {
        return this.getApiV2VendoritempackageVendorItemPackageIdContents(vendorItemPackageId, locale, null);
    }
}
