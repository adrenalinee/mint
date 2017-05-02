package com.coupang.apigateway.services.shared;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.shared.model.PaginatedAddressDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.189+09:00")
@org.springframework.stereotype.Component
public class SharedApiV1AddressAdapter {

    private final ApiClient apiClient;

    @Autowired
    public SharedApiV1AddressAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("shared");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : searchByBaseAreaNumber
     * Notes : 
     * API : shared GET /api/v1/address/solr/search/baseAreaNumber/{baseAreaNumber}/page/{page}/countPerPage/{countPerPage}
     * @param baseAreaNumber baseAreaNumber (required)
     * @param page page (required)
     * @param countPerPage countPerPage (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6">http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6</a>
     */
    public <T> ResponseEntity<T> getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPageForResponseEntity(String baseAreaNumber, Integer page, Integer countPerPage, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'baseAreaNumber' is set
        if (baseAreaNumber == null) {
            throw new ApiException(400, "Missing the required parameter 'baseAreaNumber' when calling getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException(400, "Missing the required parameter 'page' when calling getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage");
        }
        
        // verify the required parameter 'countPerPage' is set
        if (countPerPage == null) {
            throw new ApiException(400, "Missing the required parameter 'countPerPage' when calling getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/address/solr/search/baseAreaNumber/{baseAreaNumber}/page/{page}/countPerPage/{countPerPage}"
            .replaceAll("\\{" + "baseAreaNumber" + "\\}", baseAreaNumber.toString())
            .replaceAll("\\{" + "page" + "\\}", page.toString())
            .replaceAll("\\{" + "countPerPage" + "\\}", countPerPage.toString());

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

        return apiClient.invokeAPIForResponseEntity("578605f9f843918d9ce4b8d6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : searchByBaseAreaNumber
     * Notes : 
     * API : shared GET /api/v1/address/solr/search/baseAreaNumber/{baseAreaNumber}/page/{page}/countPerPage/{countPerPage}
     * @param baseAreaNumber baseAreaNumber (required)
     * @param page page (required)
     * @param countPerPage countPerPage (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return PaginatedAddressDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6">http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6</a>
     */
    public <T> T getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage(String baseAreaNumber, Integer page, Integer countPerPage, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPageForResponseEntity(baseAreaNumber, page, countPerPage, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : searchByBaseAreaNumber
     * Notes : 
     * API : shared GET /api/v1/address/solr/search/baseAreaNumber/{baseAreaNumber}/page/{page}/countPerPage/{countPerPage}
     * @param baseAreaNumber baseAreaNumber (required)
     * @param page page (required)
     * @param countPerPage countPerPage (required)
     * @param customHeader customHeaderMap (nullable)
     * @return PaginatedAddressDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6">http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6</a>
     */
    public PaginatedAddressDto getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage(String baseAreaNumber, Integer page, Integer countPerPage, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<PaginatedAddressDto> localVarReturnType = new ParameterizedTypeReference<PaginatedAddressDto>() {};
        return this.getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage(baseAreaNumber, page, countPerPage, localVarReturnType, customHeader);
    }

    /**
     * Summary : searchByBaseAreaNumber
     * API : shared GET /api/v1/address/solr/search/baseAreaNumber/{baseAreaNumber}/page/{page}/countPerPage/{countPerPage}
     * Notes : 
     * @param baseAreaNumber baseAreaNumber(required)
     * @param page page(required)
     * @param countPerPage countPerPage(required)
     * @return PaginatedAddressDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6">http://api-forge.coupang.net/details?specId=578605f9f843918d9ce4b8d6</a>
     */
    public PaginatedAddressDto getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage(String baseAreaNumber, Integer page, Integer countPerPage) throws ApiException {
        return this.getApiV1AddressSolrSearchBaseAreaNumberBaseAreaNumberPagePageCountPerPageCountPerPage(baseAreaNumber, page, countPerPage, null);
    }
}
