package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.DisplayDetailDto;
import com.coupang.apigateway.services.rss.model.OptionDimensionViewDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
@org.springframework.stereotype.Component
public class RssApiV1DisplaydetailAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssApiV1DisplaydetailAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findDeal
     * Notes : 
     * API : rss GET /api/v1/displaydetail/deal.pang
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailDealPangForResponseEntity(Long coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrl' is set
        if (coupangSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrl' when calling getApiV1DisplaydetailDealPang");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/deal.pang";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "coupangSrl", coupangSrl));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34680d35bb43c26949ef2", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findDeal
     * Notes : 
     * API : rss GET /api/v1/displaydetail/deal.pang
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2</a>
     */
    public <T> T getApiV1DisplaydetailDealPang(Long coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailDealPangForResponseEntity(coupangSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findDeal
     * Notes : 
     * API : rss GET /api/v1/displaydetail/deal.pang
     * @param coupangSrl coupangSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2</a>
     */
    public DisplayDetailDto getApiV1DisplaydetailDealPang(Long coupangSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayDetailDto> localVarReturnType = new ParameterizedTypeReference<DisplayDetailDto>() {};
        return this.getApiV1DisplaydetailDealPang(coupangSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : findDeal
     * API : rss GET /api/v1/displaydetail/deal.pang
     * Notes : 
     * @param coupangSrl coupangSrl(required)
     * @return DisplayDetailDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef2</a>
     */
    public DisplayDetailDto getApiV1DisplaydetailDealPang(Long coupangSrl) throws ApiException {
        return this.getApiV1DisplaydetailDealPang(coupangSrl, null);
    }
    /**
     * Summary : findOption
     * Notes : 
     * API : rss GET /api/v1/displaydetail/option.pang
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailOptionPangForResponseEntity(String coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrl' is set
        if (coupangSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrl' when calling getApiV1DisplaydetailOptionPang");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/option.pang";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "coupangSrl", coupangSrl));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34680d35bb43c26949ef7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findOption
     * Notes : 
     * API : rss GET /api/v1/displaydetail/option.pang
     * @param coupangSrl coupangSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7</a>
     */
    public <T> T getApiV1DisplaydetailOptionPang(String coupangSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailOptionPangForResponseEntity(coupangSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findOption
     * Notes : 
     * API : rss GET /api/v1/displaydetail/option.pang
     * @param coupangSrl coupangSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailOptionPang(String coupangSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<OptionDimensionViewDto>> localVarReturnType = new ParameterizedTypeReference<List<OptionDimensionViewDto>>() {};
        return this.getApiV1DisplaydetailOptionPang(coupangSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : findOption
     * API : rss GET /api/v1/displaydetail/option.pang
     * Notes : 
     * @param coupangSrl coupangSrl(required)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949ef7</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailOptionPang(String coupangSrl) throws ApiException {
        return this.getApiV1DisplaydetailOptionPang(coupangSrl, null);
    }
    /**
     * Summary : findOptionDimension
     * Notes : 
     * API : rss GET /api/v1/displaydetail/optiondimension.pang
     * @param coupangSrl coupangSrl (required)
     * @param optionSrl optionSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplaydetailOptiondimensionPangForResponseEntity(String coupangSrl, String optionSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'coupangSrl' is set
        if (coupangSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'coupangSrl' when calling getApiV1DisplaydetailOptiondimensionPang");
        }
        
        // verify the required parameter 'optionSrl' is set
        if (optionSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'optionSrl' when calling getApiV1DisplaydetailOptiondimensionPang");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displaydetail/optiondimension.pang";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "coupangSrl", coupangSrl));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "optionSrl", optionSrl));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57e34680d35bb43c26949f01", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findOptionDimension
     * Notes : 
     * API : rss GET /api/v1/displaydetail/optiondimension.pang
     * @param coupangSrl coupangSrl (required)
     * @param optionSrl optionSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01</a>
     */
    public <T> T getApiV1DisplaydetailOptiondimensionPang(String coupangSrl, String optionSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplaydetailOptiondimensionPangForResponseEntity(coupangSrl, optionSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findOptionDimension
     * Notes : 
     * API : rss GET /api/v1/displaydetail/optiondimension.pang
     * @param coupangSrl coupangSrl (required)
     * @param optionSrl optionSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailOptiondimensionPang(String coupangSrl, String optionSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<OptionDimensionViewDto>> localVarReturnType = new ParameterizedTypeReference<List<OptionDimensionViewDto>>() {};
        return this.getApiV1DisplaydetailOptiondimensionPang(coupangSrl, optionSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : findOptionDimension
     * API : rss GET /api/v1/displaydetail/optiondimension.pang
     * Notes : 
     * @param coupangSrl coupangSrl(required)
     * @param optionSrl optionSrl(required)
     * @return List<OptionDimensionViewDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f01</a>
     */
    public List<OptionDimensionViewDto> getApiV1DisplaydetailOptiondimensionPang(String coupangSrl, String optionSrl) throws ApiException {
        return this.getApiV1DisplaydetailOptiondimensionPang(coupangSrl, optionSrl, null);
    }
}
