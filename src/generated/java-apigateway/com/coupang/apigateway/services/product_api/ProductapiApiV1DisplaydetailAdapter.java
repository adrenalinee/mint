package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.OptionDimensionViewDto;
import com.coupang.apigateway.services.product_api.model.DisplayDetailDto;

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
public class ProductapiApiV1DisplaydetailAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1DisplaydetailAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findOptionDimensionFirst
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailVendoritemsVendorItemPackageIdForResponseEntity(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1DisplaydetailVendoritemsVendorItemPackageId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/vendoritems/{vendorItemPackageId}"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57a427e900f952f2d5ecd4ca", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findOptionDimensionFirst
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca</a>
     */
    public <T> T getApiV1DisplaydetailVendoritemsVendorItemPackageId(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailVendoritemsVendorItemPackageIdForResponseEntity(vendorItemPackageId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findOptionDimensionFirst
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailVendoritemsVendorItemPackageId(Long vendorItemPackageId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<OptionDimensionViewDto>> localVarReturnType = new ParameterizedTypeReference<List<OptionDimensionViewDto>>() {};
        return this.getApiV1DisplaydetailVendoritemsVendorItemPackageId(vendorItemPackageId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findOptionDimensionFirst
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4ca</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailVendoritemsVendorItemPackageId(Long vendorItemPackageId) throws ApiException {
        return this.getApiV1DisplaydetailVendoritemsVendorItemPackageId(vendorItemPackageId, null);
    }
    /**
     * Summary : findOptionDimensionSecond
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}/{vendorItemId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemIdForResponseEntity(Long vendorItemPackageId, Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId");
        }
        
        // verify the required parameter 'vendorItemId' is set
        if (vendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemId' when calling getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/vendoritems/{vendorItemPackageId}/{vendorItemId}"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString())
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

        return apiClient.invokeAPIForResponseEntity("57a427e900f952f2d5ecd4cf", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findOptionDimensionSecond
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}/{vendorItemId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf</a>
     */
    public <T> T getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId(Long vendorItemPackageId, Long vendorItemId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemIdForResponseEntity(vendorItemPackageId, vendorItemId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findOptionDimensionSecond
     * Notes : 
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}/{vendorItemId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId(Long vendorItemPackageId, Long vendorItemId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<OptionDimensionViewDto>> localVarReturnType = new ParameterizedTypeReference<List<OptionDimensionViewDto>>() {};
        return this.getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId(vendorItemPackageId, vendorItemId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findOptionDimensionSecond
     * API : product_api GET /api/v1/displaydetail/vendoritems/{vendorItemPackageId}/{vendorItemId}
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @param vendorItemId vendorItemId(required)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4cf</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId(Long vendorItemPackageId, Long vendorItemId) throws ApiException {
        return this.getApiV1DisplaydetailVendoritemsVendorItemPackageIdVendorItemId(vendorItemPackageId, vendorItemId, null);
    }
    /**
     * Summary : Inquery a displaydetail by VendorItemPackageId
     * Notes : Inquery a displaydetail by VendorItemPackageId
     * API : product_api GET /api/v1/displaydetail/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param decorator decorator (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailVendorItemPackageIdForResponseEntity(Long vendorItemPackageId, List<String> decorator, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1DisplaydetailVendorItemPackageId");
        }
        
        // verify the required parameter 'decorator' is set
        if (decorator == null) {
            throw new ApiException(400, "Missing the required parameter 'decorator' when calling getApiV1DisplaydetailVendorItemPackageId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/{vendorItemPackageId}"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "decorator", decorator));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57a427e900f952f2d5ecd4d4", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : Inquery a displaydetail by VendorItemPackageId
     * Notes : Inquery a displaydetail by VendorItemPackageId
     * API : product_api GET /api/v1/displaydetail/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param decorator decorator (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4</a>
     */
    public <T> T getApiV1DisplaydetailVendorItemPackageId(Long vendorItemPackageId, List<String> decorator, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailVendorItemPackageIdForResponseEntity(vendorItemPackageId, decorator, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : Inquery a displaydetail by VendorItemPackageId
     * Notes : Inquery a displaydetail by VendorItemPackageId
     * API : product_api GET /api/v1/displaydetail/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param decorator decorator (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4</a>
     */
    public DisplayDetailDto getApiV1DisplaydetailVendorItemPackageId(Long vendorItemPackageId, List<String> decorator, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayDetailDto> localVarReturnType = new ParameterizedTypeReference<DisplayDetailDto>() {};
        return this.getApiV1DisplaydetailVendorItemPackageId(vendorItemPackageId, decorator, localVarReturnType, customHeader);
    }

    /**
     * Summary : Inquery a displaydetail by VendorItemPackageId
     * API : product_api GET /api/v1/displaydetail/{vendorItemPackageId}
     * Notes : Inquery a displaydetail by VendorItemPackageId
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @param decorator decorator(required)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4">http://api-forge.coupang.net/details?specId=57a427e900f952f2d5ecd4d4</a>
     */
    public DisplayDetailDto getApiV1DisplaydetailVendorItemPackageId(Long vendorItemPackageId, List<String> decorator) throws ApiException {
        return this.getApiV1DisplaydetailVendorItemPackageId(vendorItemPackageId, decorator, null);
    }
}
