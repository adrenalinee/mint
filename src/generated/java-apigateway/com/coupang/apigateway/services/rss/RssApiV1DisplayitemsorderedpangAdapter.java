package com.coupang.apigateway.services.rss;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.rss.model.DisplayItem;

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
public class RssApiV1DisplayitemsorderedpangAdapter {

    private final ApiClient apiClient;

    @Autowired
    public RssApiV1DisplayitemsorderedpangAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("rss");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findByIdsOrdered
     * Notes : 
     * API : rss GET /api/v1/displayitems-ordered.pang
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33</a>
     */
    public <T> ResponseEntity<T> getApiV1DisplayitemsOrderedPangForResponseEntity(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException(400, "Missing the required parameter 'ids' when calling getApiV1DisplayitemsOrderedPang");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/displayitems-ordered.pang";

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

        return apiClient.invokeAPIForResponseEntity("57e34680d35bb43c26949f33", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findByIdsOrdered
     * Notes : 
     * API : rss GET /api/v1/displayitems-ordered.pang
     * @param ids ids (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33</a>
     */
    public <T> T getApiV1DisplayitemsOrderedPang(List<Long> ids, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DisplayitemsOrderedPangForResponseEntity(ids, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findByIdsOrdered
     * Notes : 
     * API : rss GET /api/v1/displayitems-ordered.pang
     * @param ids ids (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33</a>
     */
    public List<DisplayItem> getApiV1DisplayitemsOrderedPang(List<Long> ids, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayItem>> localVarReturnType = new ParameterizedTypeReference<List<DisplayItem>>() {};
        return this.getApiV1DisplayitemsOrderedPang(ids, localVarReturnType, customHeader);
    }

    /**
     * Summary : findByIdsOrdered
     * API : rss GET /api/v1/displayitems-ordered.pang
     * Notes : 
     * @param ids ids(required)
     * @return List<DisplayItem>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33">http://api-forge.coupang.net/details?specId=57e34680d35bb43c26949f33</a>
     */
    public List<DisplayItem> getApiV1DisplayitemsOrderedPang(List<Long> ids) throws ApiException {
        return this.getApiV1DisplayitemsOrderedPang(ids, null);
    }
}
