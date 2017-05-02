package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.VendorItemPriceDto;
import com.coupang.apigateway.services.product_api.model.PriceDto;
import com.coupang.apigateway.services.product_api.model.VendorItemsPropertiesResponse;
import com.coupang.apigateway.services.product_api.model.VendorItemDTO;

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
public class ProductapiApiV1VendoritemsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1VendoritemsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getAll
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritemsPriceForResponseEntity(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getApiV1VendoritemsPrice");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritems/price";

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

        return apiClient.invokeAPIForResponseEntity("57a427ed00f952f2d5ecd6f1", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getAll
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1</a>
     */
    public <T> T getApiV1VendoritemsPrice(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritemsPriceForResponseEntity(ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getAll
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, VendorItemPriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1</a>
     */
    public Map<String, VendorItemPriceDto> getApiV1VendoritemsPrice(List<Long> ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, VendorItemPriceDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, VendorItemPriceDto>>() {};
        return this.getApiV1VendoritemsPrice(ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getAll
     * API : product_api GET /api/v1/vendoritems/price
     * Notes : 
     * @param ids ids(required)
     * @return Map<String, VendorItemPriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f1</a>
     */
    public Map<String, VendorItemPriceDto> getApiV1VendoritemsPrice(List<Long> ids) throws ApiException {
        return this.getApiV1VendoritemsPrice(ids, null);
    }
    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price/with/unitprice
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritemsPriceWithUnitpriceForResponseEntity(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getApiV1VendoritemsPriceWithUnitprice");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritems/price/with/unitprice";

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

        return apiClient.invokeAPIForResponseEntity("57a427ed00f952f2d5ecd6f6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price/with/unitprice
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6</a>
     */
    public <T> T getApiV1VendoritemsPriceWithUnitprice(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritemsPriceWithUnitpriceForResponseEntity(ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getAllWithUnitPrice
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/price/with/unitprice
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6</a>
     */
    public Map<Long, PriceDto> getApiV1VendoritemsPriceWithUnitprice(List<Long> ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, PriceDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, PriceDto>>() {};
        return this.getApiV1VendoritemsPriceWithUnitprice(ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getAllWithUnitPrice
     * API : product_api GET /api/v1/vendoritems/price/with/unitprice
     * Notes : 
     * @param ids ids(required)
     * @return Map<Long, PriceDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd6f6</a>
     */
    public Map<Long, PriceDto> getApiV1VendoritemsPriceWithUnitprice(List<Long> ids) throws ApiException {
        return this.getApiV1VendoritemsPriceWithUnitprice(ids, null);
    }
    /**
     * Summary : get
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/properties
     * @param vendorItemIds vendorItemIds (required)
     * @param propertyKeys propertyKeys (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf">http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritemsPropertiesForResponseEntity(List<Long> vendorItemIds, List<String> propertyKeys, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemIds' is set
        if (vendorItemIds == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemIds' when calling getApiV1VendoritemsProperties");
        }
        
        // verify the required parameter 'propertyKeys' is set
        if (propertyKeys == null) {
            throw new ApiException(400, "Missing the required parameter 'propertyKeys' when calling getApiV1VendoritemsProperties");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritems/properties";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "vendorItemIds", vendorItemIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("581a93910afce1108430d5bf", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/properties
     * @param vendorItemIds vendorItemIds (required)
     * @param propertyKeys propertyKeys (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemsPropertiesResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf">http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf</a>
     */
    public <T> T getApiV1VendoritemsProperties(List<Long> vendorItemIds, List<String> propertyKeys, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritemsPropertiesForResponseEntity(vendorItemIds, propertyKeys, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/properties
     * @param vendorItemIds vendorItemIds (required)
     * @param propertyKeys propertyKeys (required)
     * @param customHeader customHeaderMap (nullable)
     * @return VendorItemsPropertiesResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf">http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf</a>
     */
    public VendorItemsPropertiesResponse getApiV1VendoritemsProperties(List<Long> vendorItemIds, List<String> propertyKeys, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<VendorItemsPropertiesResponse> localVarReturnType = new ParameterizedTypeReference<VendorItemsPropertiesResponse>() {};
        return this.getApiV1VendoritemsProperties(vendorItemIds, propertyKeys, localVarReturnType, customHeader);
    }

    /**
     * Summary : get
     * API : product_api GET /api/v1/vendoritems/properties
     * Notes : 
     * @param vendorItemIds vendorItemIds(required)
     * @param propertyKeys propertyKeys(required)
     * @return VendorItemsPropertiesResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf">http://api-forge.coupang.net/details?specId=581a93910afce1108430d5bf</a>
     */
    public VendorItemsPropertiesResponse getApiV1VendoritemsProperties(List<Long> vendorItemIds, List<String> propertyKeys) throws ApiException {
        return this.getApiV1VendoritemsProperties(vendorItemIds, propertyKeys, null);
    }
    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritemids}
     * @param vendoritemids vendoritemids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritemsVendoritemidsForResponseEntity(String vendoritemids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendoritemids' is set
        if (vendoritemids == null) {
            throw new ApiException(400, "Missing the required parameter 'vendoritemids' when calling getApiV1VendoritemsVendoritemids");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritems/{vendoritemids}"
            .replaceAll("\\{" + "vendoritemids" + "\\}", vendoritemids.toString());

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

        return apiClient.invokeAPIForResponseEntity("57a427ed00f952f2d5ecd732", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritemids}
     * @param vendoritemids vendoritemids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732</a>
     */
    public <T> T getApiV1VendoritemsVendoritemids(String vendoritemids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritemsVendoritemidsForResponseEntity(vendoritemids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getVendorItems
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritemids}
     * @param vendoritemids vendoritemids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732</a>
     */
    public List<VendorItemDTO> getApiV1VendoritemsVendoritemids(String vendoritemids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<VendorItemDTO>> localVarReturnType = new ParameterizedTypeReference<List<VendorItemDTO>>() {};
        return this.getApiV1VendoritemsVendoritemids(vendoritemids, localVarReturnType, customHeader);
    }

    /**
     * Summary : getVendorItems
     * API : product_api GET /api/v1/vendoritems/{vendoritemids}
     * Notes : 
     * @param vendoritemids vendoritemids(required)
     * @return List<VendorItemDTO>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd732</a>
     */
    public List<VendorItemDTO> getApiV1VendoritemsVendoritemids(String vendoritemids) throws ApiException {
        return this.getApiV1VendoritemsVendoritemids(vendoritemids, null);
    }
    /**
     * Summary : findValidVendorItemIdsByPackageId
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritempackageid}/vendoritemids-valid
     * @param vendoritempackageid vendoritempackageid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746</a>
     */
    public <T> ResponseEntity<T> getApiV1VendoritemsVendoritempackageidVendoritemidsValidForResponseEntity(Long vendoritempackageid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendoritempackageid' is set
        if (vendoritempackageid == null) {
            throw new ApiException(400, "Missing the required parameter 'vendoritempackageid' when calling getApiV1VendoritemsVendoritempackageidVendoritemidsValid");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/vendoritems/{vendoritempackageid}/vendoritemids-valid"
            .replaceAll("\\{" + "vendoritempackageid" + "\\}", vendoritempackageid.toString());

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

        return apiClient.invokeAPIForResponseEntity("57a427ed00f952f2d5ecd746", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findValidVendorItemIdsByPackageId
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritempackageid}/vendoritemids-valid
     * @param vendoritempackageid vendoritempackageid (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<Long>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746</a>
     */
    public <T> T getApiV1VendoritemsVendoritempackageidVendoritemidsValid(Long vendoritempackageid, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1VendoritemsVendoritempackageidVendoritemidsValidForResponseEntity(vendoritempackageid, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findValidVendorItemIdsByPackageId
     * Notes : 
     * API : product_api GET /api/v1/vendoritems/{vendoritempackageid}/vendoritemids-valid
     * @param vendoritempackageid vendoritempackageid (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<Long>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746</a>
     */
    public List<Long> getApiV1VendoritemsVendoritempackageidVendoritemidsValid(Long vendoritempackageid, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<Long>> localVarReturnType = new ParameterizedTypeReference<List<Long>>() {};
        return this.getApiV1VendoritemsVendoritempackageidVendoritemidsValid(vendoritempackageid, localVarReturnType, customHeader);
    }

    /**
     * Summary : findValidVendorItemIdsByPackageId
     * API : product_api GET /api/v1/vendoritems/{vendoritempackageid}/vendoritemids-valid
     * Notes : 
     * @param vendoritempackageid vendoritempackageid(required)
     * @return List<Long>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746">http://api-forge.coupang.net/details?specId=57a427ed00f952f2d5ecd746</a>
     */
    public List<Long> getApiV1VendoritemsVendoritempackageidVendoritemidsValid(Long vendoritempackageid) throws ApiException {
        return this.getApiV1VendoritemsVendoritempackageidVendoritemidsValid(vendoritempackageid, null);
    }
}
