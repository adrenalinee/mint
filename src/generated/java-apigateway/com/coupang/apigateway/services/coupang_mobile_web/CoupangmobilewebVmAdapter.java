package com.coupang.apigateway.services.coupang_mobile_web;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.coupang_mobile_web.model.DetailPageLinkRequestDto;
import com.coupang.apigateway.services.coupang_mobile_web.model.DetailPageLinkDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.807+09:00")
@org.springframework.stereotype.Component
public class CoupangmobilewebVmAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CoupangmobilewebVmAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("coupang_mobile_web");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getLinks
     * Notes : 
     * API : coupang_mobile_web POST /vm/api/v1/detail-page-links
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08">http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08</a>
     */
    public <T> ResponseEntity<T> postVmApiV1DetailPageLinksForResponseEntity(DetailPageLinkRequestDto request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling postVmApiV1DetailPageLinks");
        }
        
        // create path and map variables
        String localVarPath = "/vm/api/v1/detail-page-links";

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

        return apiClient.invokeAPIForResponseEntity("586f35f891bc7acc21384f08", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getLinks
     * Notes : 
     * API : coupang_mobile_web POST /vm/api/v1/detail-page-links
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DetailPageLinkDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08">http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08</a>
     */
    public <T> T postVmApiV1DetailPageLinks(DetailPageLinkRequestDto request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postVmApiV1DetailPageLinksForResponseEntity(request, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getLinks
     * Notes : 
     * API : coupang_mobile_web POST /vm/api/v1/detail-page-links
     * @param request request (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DetailPageLinkDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08">http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08</a>
     */
    public List<DetailPageLinkDto> postVmApiV1DetailPageLinks(DetailPageLinkRequestDto request, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DetailPageLinkDto>> localVarReturnType = new ParameterizedTypeReference<List<DetailPageLinkDto>>() {};
        return this.postVmApiV1DetailPageLinks(request, localVarReturnType, customHeader);
    }

    /**
     * Summary : getLinks
     * API : coupang_mobile_web POST /vm/api/v1/detail-page-links
     * Notes : 
     * @param request request(required)
     * @return List<DetailPageLinkDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08">http://api-forge.coupang.net/details?specId=586f35f891bc7acc21384f08</a>
     */
    public List<DetailPageLinkDto> postVmApiV1DetailPageLinks(DetailPageLinkRequestDto request) throws ApiException {
        return this.postVmApiV1DetailPageLinks(request, null);
    }
}
