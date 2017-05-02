package com.coupang.apigateway.services.display;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.display.model.DisplayAttributeTypeDto;
import com.coupang.apigateway.services.display.model.DisplayAttributeTypeExceptionDto;

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
public class DisplayApiV1AttributetypefilterAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DisplayApiV1AttributetypefilterAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("display");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getattributetypefilters
     * @param attributeTypeIds attributeTypeIds (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d</a>
     */
    public <T> ResponseEntity<T> getApiV1AttributetypefilterGetattributetypefiltersForResponseEntity(List<Long> attributeTypeIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/attributetypefilter/getattributetypefilters";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attributeTypeIds", attributeTypeIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58d4725f3d43f67907456e5d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getattributetypefilters
     * @param attributeTypeIds attributeTypeIds (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d</a>
     */
    public <T> T getApiV1AttributetypefilterGetattributetypefilters(List<Long> attributeTypeIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttributetypefilterGetattributetypefiltersForResponseEntity(attributeTypeIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getattributetypefilters
     * @param attributeTypeIds attributeTypeIds (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d</a>
     */
    public Map<Long, DisplayAttributeTypeDto> getApiV1AttributetypefilterGetattributetypefilters(List<Long> attributeTypeIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, DisplayAttributeTypeDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, DisplayAttributeTypeDto>>() {};
        return this.getApiV1AttributetypefilterGetattributetypefilters(attributeTypeIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * API : display GET /api/v1/attributetypefilter/getattributetypefilters
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * @param attributeTypeIds attributeTypeIds(optional)
     * @return Map<Long, DisplayAttributeTypeDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e5d</a>
     */
    public Map<Long, DisplayAttributeTypeDto> getApiV1AttributetypefilterGetattributetypefilters(List<Long> attributeTypeIds) throws ApiException {
        return this.getApiV1AttributetypefilterGetattributetypefilters(attributeTypeIds, null);
    }
    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62</a>
     */
    public <T> ResponseEntity<T> getApiV1AttributetypefilterGetkeywordexceptionsKeywordForResponseEntity(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException(400, "Missing the required parameter 'keyword' when calling getApiV1AttributetypefilterGetkeywordexceptionsKeyword");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/attributetypefilter/getkeywordexceptions/{keyword}"
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

        return apiClient.invokeAPIForResponseEntity("58d4725f3d43f67907456e62", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAttributeTypeExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62</a>
     */
    public <T> T getApiV1AttributetypefilterGetkeywordexceptionsKeyword(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AttributetypefilterGetkeywordexceptionsKeywordForResponseEntity(keyword, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * API : display GET /api/v1/attributetypefilter/getkeywordexceptions/{keyword}
     * @param keyword keyword (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAttributeTypeExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62</a>
     */
    public DisplayAttributeTypeExceptionDto getApiV1AttributetypefilterGetkeywordexceptionsKeyword(String keyword, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAttributeTypeExceptionDto> localVarReturnType = new ParameterizedTypeReference<DisplayAttributeTypeExceptionDto>() {};
        return this.getApiV1AttributetypefilterGetkeywordexceptionsKeyword(keyword, localVarReturnType, customHeader);
    }

    /**
     * Summary : badgeImageOs와 badgeImageDomain를 통해서 badge 정보를 리턴
     * API : display GET /api/v1/attributetypefilter/getkeywordexceptions/{keyword}
     * Notes : 데이터가 없을경우 emptyMap 리턴
     * @param keyword keyword(required)
     * @return DisplayAttributeTypeExceptionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62">http://api-forge.coupang.net/details?specId=58d4725f3d43f67907456e62</a>
     */
    public DisplayAttributeTypeExceptionDto getApiV1AttributetypefilterGetkeywordexceptionsKeyword(String keyword) throws ApiException {
        return this.getApiV1AttributetypefilterGetkeywordexceptionsKeyword(keyword, null);
    }
}
