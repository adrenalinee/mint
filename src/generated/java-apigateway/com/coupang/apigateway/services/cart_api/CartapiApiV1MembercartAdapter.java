package com.coupang.apigateway.services.cart_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.cart_api.model.MemberCartItemValidResponse;
import com.coupang.apigateway.services.cart_api.model.MemberCartItemValidRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
@org.springframework.stereotype.Component
public class CartapiApiV1MembercartAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CartapiApiV1MembercartAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("cart_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : validateMemberCartItems
     * Notes : 
     * API : cart_api POST /api/v1/membercart/validation/items
     * @param memberCartItemValidRequest memberCartItemValidRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1</a>
     */
    public <T> ResponseEntity<T> postApiV1MembercartValidationItemsForResponseEntity(MemberCartItemValidRequest memberCartItemValidRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = memberCartItemValidRequest;
        
        // verify the required parameter 'memberCartItemValidRequest' is set
        if (memberCartItemValidRequest == null) {
            throw new ApiException(400, "Missing the required parameter 'memberCartItemValidRequest' when calling postApiV1MembercartValidationItems");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/membercart/validation/items";

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

        return apiClient.invokeAPIForResponseEntity("58297a0498eec318e25431b1", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : validateMemberCartItems
     * Notes : 
     * API : cart_api POST /api/v1/membercart/validation/items
     * @param memberCartItemValidRequest memberCartItemValidRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MemberCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1</a>
     */
    public <T> T postApiV1MembercartValidationItems(MemberCartItemValidRequest memberCartItemValidRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1MembercartValidationItemsForResponseEntity(memberCartItemValidRequest, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : validateMemberCartItems
     * Notes : 
     * API : cart_api POST /api/v1/membercart/validation/items
     * @param memberCartItemValidRequest memberCartItemValidRequest (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MemberCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1</a>
     */
    public MemberCartItemValidResponse postApiV1MembercartValidationItems(MemberCartItemValidRequest memberCartItemValidRequest, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MemberCartItemValidResponse> localVarReturnType = new ParameterizedTypeReference<MemberCartItemValidResponse>() {};
        return this.postApiV1MembercartValidationItems(memberCartItemValidRequest, localVarReturnType, customHeader);
    }

    /**
     * Summary : validateMemberCartItems
     * API : cart_api POST /api/v1/membercart/validation/items
     * Notes : 
     * @param memberCartItemValidRequest memberCartItemValidRequest(required)
     * @return MemberCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431b1</a>
     */
    public MemberCartItemValidResponse postApiV1MembercartValidationItems(MemberCartItemValidRequest memberCartItemValidRequest) throws ApiException {
        return this.postApiV1MembercartValidationItems(memberCartItemValidRequest, null);
    }
}
