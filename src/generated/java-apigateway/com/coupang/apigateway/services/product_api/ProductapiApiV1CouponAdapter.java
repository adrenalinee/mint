package com.coupang.apigateway.services.product_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_api.model.BasicInfoDto;
import com.coupang.apigateway.services.product_api.model.OptionTreeWrapperDtoOfOptionAdvertisedTourDto;
import com.coupang.apigateway.services.product_api.model.OptionRangeDto;

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
public class ProductapiApiV1CouponAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductapiApiV1CouponAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getBasicInfo
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5">http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5</a>
     */
    public <T> ResponseEntity<T> getApiV1CouponDdpVendorItemPackageIdForResponseEntity(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1CouponDdpVendorItemPackageId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/coupon/ddp/{vendorItemPackageId}"
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

        return apiClient.invokeAPIForResponseEntity("5832a2a992d14c264b2a9dc5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getBasicInfo
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BasicInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5">http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5</a>
     */
    public <T> T getApiV1CouponDdpVendorItemPackageId(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CouponDdpVendorItemPackageIdForResponseEntity(vendorItemPackageId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getBasicInfo
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BasicInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5">http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5</a>
     */
    public BasicInfoDto getApiV1CouponDdpVendorItemPackageId(Long vendorItemPackageId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BasicInfoDto> localVarReturnType = new ParameterizedTypeReference<BasicInfoDto>() {};
        return this.getApiV1CouponDdpVendorItemPackageId(vendorItemPackageId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getBasicInfo
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @return BasicInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5">http://api-forge.coupang.net/details?specId=5832a2a992d14c264b2a9dc5</a>
     */
    public BasicInfoDto getApiV1CouponDdpVendorItemPackageId(Long vendorItemPackageId) throws ApiException {
        return this.getApiV1CouponDdpVendorItemPackageId(vendorItemPackageId, null);
    }
    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63</a>
     */
    public <T> ResponseEntity<T> getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsForResponseEntity(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options"
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

        return apiClient.invokeAPIForResponseEntity("58ad38942d769eff7785ed63", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63</a>
     */
    public <T> T getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions(Long vendorItemPackageId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsForResponseEntity(vendorItemPackageId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63</a>
     */
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDto getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions(Long vendorItemPackageId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<OptionTreeWrapperDtoOfOptionAdvertisedTourDto> localVarReturnType = new ParameterizedTypeReference<OptionTreeWrapperDtoOfOptionAdvertisedTourDto>() {};
        return this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions(vendorItemPackageId, localVarReturnType, customHeader);
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed63</a>
     */
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDto getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions(Long vendorItemPackageId) throws ApiException {
        return this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptions(vendorItemPackageId, null);
    }
    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options/{vendorItemId}/{findDepth}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param findDepth findDepth (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68</a>
     */
    public <T> ResponseEntity<T> getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepthForResponseEntity(Long vendorItemPackageId, Long vendorItemId, Integer findDepth, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth");
        }
        
        // verify the required parameter 'vendorItemId' is set
        if (vendorItemId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemId' when calling getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth");
        }
        
        // verify the required parameter 'findDepth' is set
        if (findDepth == null) {
            throw new ApiException(400, "Missing the required parameter 'findDepth' when calling getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options/{vendorItemId}/{findDepth}"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString())
            .replaceAll("\\{" + "vendorItemId" + "\\}", vendorItemId.toString())
            .replaceAll("\\{" + "findDepth" + "\\}", findDepth.toString());

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

        return apiClient.invokeAPIForResponseEntity("58ad38942d769eff7785ed68", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options/{vendorItemId}/{findDepth}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param findDepth findDepth (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68</a>
     */
    public <T> T getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth(Long vendorItemPackageId, Long vendorItemId, Integer findDepth, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepthForResponseEntity(vendorItemPackageId, vendorItemId, findDepth, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options/{vendorItemId}/{findDepth}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param vendorItemId vendorItemId (required)
     * @param findDepth findDepth (required)
     * @param customHeader customHeaderMap (nullable)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68</a>
     */
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDto getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth(Long vendorItemPackageId, Long vendorItemId, Integer findDepth, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<OptionTreeWrapperDtoOfOptionAdvertisedTourDto> localVarReturnType = new ParameterizedTypeReference<OptionTreeWrapperDtoOfOptionAdvertisedTourDto>() {};
        return this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth(vendorItemPackageId, vendorItemId, findDepth, localVarReturnType, customHeader);
    }

    /**
     * Summary : getTreeAdvertisedTourDtos
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/advertised_tour_options/{vendorItemId}/{findDepth}
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @param vendorItemId vendorItemId(required)
     * @param findDepth findDepth(required)
     * @return OptionTreeWrapperDtoOfOptionAdvertisedTourDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68">http://api-forge.coupang.net/details?specId=58ad38942d769eff7785ed68</a>
     */
    public OptionTreeWrapperDtoOfOptionAdvertisedTourDto getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth(Long vendorItemPackageId, Long vendorItemId, Integer findDepth) throws ApiException {
        return this.getApiV1CouponDdpVendorItemPackageIdAdvertisedTourOptionsVendorItemIdFindDepth(vendorItemPackageId, vendorItemId, findDepth, null);
    }
    /**
     * Summary : getRangeOptions
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/rangeOptions/{rangeVendorItemIds}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param rangeVendorItemIds rangeVendorItemIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0">http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0</a>
     */
    public <T> ResponseEntity<T> getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIdsForResponseEntity(Long vendorItemPackageId, String rangeVendorItemIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorItemPackageId' is set
        if (vendorItemPackageId == null) {
            throw new ApiException(400, "Missing the required parameter 'vendorItemPackageId' when calling getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds");
        }
        
        // verify the required parameter 'rangeVendorItemIds' is set
        if (rangeVendorItemIds == null) {
            throw new ApiException(400, "Missing the required parameter 'rangeVendorItemIds' when calling getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/coupon/ddp/{vendorItemPackageId}/rangeOptions/{rangeVendorItemIds}"
            .replaceAll("\\{" + "vendorItemPackageId" + "\\}", vendorItemPackageId.toString())
            .replaceAll("\\{" + "rangeVendorItemIds" + "\\}", rangeVendorItemIds.toString());

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

        return apiClient.invokeAPIForResponseEntity("58462469186af774f880bbf0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getRangeOptions
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/rangeOptions/{rangeVendorItemIds}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param rangeVendorItemIds rangeVendorItemIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionRangeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0">http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0</a>
     */
    public <T> T getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds(Long vendorItemPackageId, String rangeVendorItemIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIdsForResponseEntity(vendorItemPackageId, rangeVendorItemIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getRangeOptions
     * Notes : 
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/rangeOptions/{rangeVendorItemIds}
     * @param vendorItemPackageId vendorItemPackageId (required)
     * @param rangeVendorItemIds rangeVendorItemIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionRangeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0">http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0</a>
     */
    public List<OptionRangeDto> getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds(Long vendorItemPackageId, String rangeVendorItemIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<OptionRangeDto>> localVarReturnType = new ParameterizedTypeReference<List<OptionRangeDto>>() {};
        return this.getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds(vendorItemPackageId, rangeVendorItemIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : getRangeOptions
     * API : product_api GET /api/v1/coupon/ddp/{vendorItemPackageId}/rangeOptions/{rangeVendorItemIds}
     * Notes : 
     * @param vendorItemPackageId vendorItemPackageId(required)
     * @param rangeVendorItemIds rangeVendorItemIds(required)
     * @return List<OptionRangeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0">http://api-forge.coupang.net/details?specId=58462469186af774f880bbf0</a>
     */
    public List<OptionRangeDto> getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds(Long vendorItemPackageId, String rangeVendorItemIds) throws ApiException {
        return this.getApiV1CouponDdpVendorItemPackageIdRangeOptionsRangeVendorItemIds(vendorItemPackageId, rangeVendorItemIds, null);
    }
    /**
     * Summary : fetchSoldOutVendorItemPackageIds
     * Notes : 
     * API : product_api GET /api/v1/coupon/todaybooking/soldout/vipids
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e198158587231490454916">http://api-forge.coupang.net/details?specId=58e198158587231490454916</a>
     */
    public <T> ResponseEntity<T> getApiV1CouponTodaybookingSoldoutVipidsForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/coupon/todaybooking/soldout/vipids";

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

        return apiClient.invokeAPIForResponseEntity("58e198158587231490454916", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : fetchSoldOutVendorItemPackageIds
     * Notes : 
     * API : product_api GET /api/v1/coupon/todaybooking/soldout/vipids
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e198158587231490454916">http://api-forge.coupang.net/details?specId=58e198158587231490454916</a>
     */
    public <T> T getApiV1CouponTodaybookingSoldoutVipids(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CouponTodaybookingSoldoutVipidsForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : fetchSoldOutVendorItemPackageIds
     * Notes : 
     * API : product_api GET /api/v1/coupon/todaybooking/soldout/vipids
     * @param customHeader customHeaderMap (nullable)
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e198158587231490454916">http://api-forge.coupang.net/details?specId=58e198158587231490454916</a>
     */
    public List<String> getApiV1CouponTodaybookingSoldoutVipids(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<String>> localVarReturnType = new ParameterizedTypeReference<List<String>>() {};
        return this.getApiV1CouponTodaybookingSoldoutVipids(localVarReturnType, customHeader);
    }

    /**
     * Summary : fetchSoldOutVendorItemPackageIds
     * API : product_api GET /api/v1/coupon/todaybooking/soldout/vipids
     * Notes : 
     * @return List<String>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58e198158587231490454916">http://api-forge.coupang.net/details?specId=58e198158587231490454916</a>
     */
    public List<String> getApiV1CouponTodaybookingSoldoutVipids() throws ApiException {
        return this.getApiV1CouponTodaybookingSoldoutVipids(null);
    }
}
