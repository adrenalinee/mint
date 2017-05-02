package com.coupang.apigateway.services.display;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.display.model.DisplayAttributeFilterDto;
import com.coupang.apigateway.services.display.model.DisplayAttributeFilterExceptionDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
@org.springframework.stereotype.Component
public class DisplayApiV1AttributefilterAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DisplayApiV1AttributefilterAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("display");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : search id 기준으로 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributefilter/getfilters
     * @param filterKeys filterKeys (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c2">http://api-forge.coupang.net/details?specId=58f725a628086759639398c2</a>
     */
    public <T> ResponseEntity<T> getApiV1AttributefilterGetfiltersForResponseEntity(List<String> filterKeys, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/attributefilter/getfilters";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filterKeys", filterKeys));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58f725a628086759639398c2", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : search id 기준으로 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributefilter/getfilters
     * @param filterKeys filterKeys (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, DisplayAttributeFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c2">http://api-forge.coupang.net/details?specId=58f725a628086759639398c2</a>
     */
    public <T> T getApiV1AttributefilterGetfilters(List<String> filterKeys, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttributefilterGetfiltersForResponseEntity(filterKeys, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : search id 기준으로 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributefilter/getfilters
     * @param filterKeys filterKeys (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, DisplayAttributeFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c2">http://api-forge.coupang.net/details?specId=58f725a628086759639398c2</a>
     */
    public Map<String, DisplayAttributeFilterDto> getApiV1AttributefilterGetfilters(List<String> filterKeys, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, DisplayAttributeFilterDto>> localVarReturnType = new ParameterizedTypeReference<Map<String, DisplayAttributeFilterDto>>() {};
        return this.getApiV1AttributefilterGetfilters(filterKeys, localVarReturnType, customHeader);
    }

    /**
     * Summary : search id 기준으로 리턴
     * API : display GET /api/v1/attributefilter/getfilters
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * @param filterKeys filterKeys(optional)
     * @return Map<String, DisplayAttributeFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c2">http://api-forge.coupang.net/details?specId=58f725a628086759639398c2</a>
     */
    public Map<String, DisplayAttributeFilterDto> getApiV1AttributefilterGetfilters(List<String> filterKeys) throws ApiException {
        return this.getApiV1AttributefilterGetfilters(filterKeys, null);
    }
    /**
     * Summary : 키워드에 따른 예외적 filter 목록 리턴
     * Notes : 데이터가 없을경우 null 리턴
     * API : display GET /api/v1/attributefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c7">http://api-forge.coupang.net/details?specId=58f725a628086759639398c7</a>
     */
    public <T> ResponseEntity<T> getApiV1AttributefilterGetkeywordexceptionsKeywordForResponseEntity(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException(400, "Missing the required parameter 'keyword' when calling getApiV1AttributefilterGetkeywordexceptionsKeyword");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/attributefilter/getkeywordexceptions/{keyword}"
            .replaceAll("\\{" + "keyword" + "\\}", keyword.toString());

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

        return apiClient.invokeAPIForResponseEntity("58f725a628086759639398c7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 키워드에 따른 예외적 filter 목록 리턴
     * Notes : 데이터가 없을경우 null 리턴
     * API : display GET /api/v1/attributefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAttributeFilterExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c7">http://api-forge.coupang.net/details?specId=58f725a628086759639398c7</a>
     */
    public <T> T getApiV1AttributefilterGetkeywordexceptionsKeyword(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttributefilterGetkeywordexceptionsKeywordForResponseEntity(keyword, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 키워드에 따른 예외적 filter 목록 리턴
     * Notes : 데이터가 없을경우 null 리턴
     * API : display GET /api/v1/attributefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAttributeFilterExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c7">http://api-forge.coupang.net/details?specId=58f725a628086759639398c7</a>
     */
    public DisplayAttributeFilterExceptionDto getApiV1AttributefilterGetkeywordexceptionsKeyword(String keyword, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAttributeFilterExceptionDto> localVarReturnType = new ParameterizedTypeReference<DisplayAttributeFilterExceptionDto>() {};
        return this.getApiV1AttributefilterGetkeywordexceptionsKeyword(keyword, localVarReturnType, customHeader);
    }

    /**
     * Summary : 키워드에 따른 예외적 filter 목록 리턴
     * API : display GET /api/v1/attributefilter/getkeywordexceptions/{keyword}
     * Notes : 데이터가 없을경우 null 리턴
     * @param keyword keyword(required)
     * @return DisplayAttributeFilterExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f725a628086759639398c7">http://api-forge.coupang.net/details?specId=58f725a628086759639398c7</a>
     */
    public DisplayAttributeFilterExceptionDto getApiV1AttributefilterGetkeywordexceptionsKeyword(String keyword) throws ApiException {
        return this.getApiV1AttributefilterGetkeywordexceptionsKeyword(keyword, null);
    }
}
