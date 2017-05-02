package com.coupang.apigateway.services.cart_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.cart_api.model.AnonymousCartItemValidResponse;
import com.coupang.apigateway.services.cart_api.model.AnonymousCartItemValidRequest;

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
public class CartapiApiV1AnonymouscartAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CartapiApiV1AnonymouscartAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("cart_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : validateAnonymousCartItems
     * Notes : 
     * API : cart_api POST /api/v1/anonymouscart/validation/items
     * @param anonymousCartItemValidRequest anonymousCartItemValidRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac</a>
     */
    public <T> ResponseEntity<T> postApiV1AnonymouscartValidationItemsForResponseEntity(AnonymousCartItemValidRequest anonymousCartItemValidRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = anonymousCartItemValidRequest;
        
        // verify the required parameter 'anonymousCartItemValidRequest' is set
        if (anonymousCartItemValidRequest == null) {
            throw new ApiException(400, "Missing the required parameter 'anonymousCartItemValidRequest' when calling postApiV1AnonymouscartValidationItems");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/anonymouscart/validation/items";

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

        return apiClient.invokeAPIForResponseEntity("58297a0498eec318e25431ac", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : validateAnonymousCartItems
     * Notes : 
     * API : cart_api POST /api/v1/anonymouscart/validation/items
     * @param anonymousCartItemValidRequest anonymousCartItemValidRequest (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return AnonymousCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac</a>
     */
    public <T> T postApiV1AnonymouscartValidationItems(AnonymousCartItemValidRequest anonymousCartItemValidRequest, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1AnonymouscartValidationItemsForResponseEntity(anonymousCartItemValidRequest, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : validateAnonymousCartItems
     * Notes : 
     * API : cart_api POST /api/v1/anonymouscart/validation/items
     * @param anonymousCartItemValidRequest anonymousCartItemValidRequest (required)
     * @param customHeader customHeaderMap (nullable)
     * @return AnonymousCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac</a>
     */
    public AnonymousCartItemValidResponse postApiV1AnonymouscartValidationItems(AnonymousCartItemValidRequest anonymousCartItemValidRequest, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<AnonymousCartItemValidResponse> localVarReturnType = new ParameterizedTypeReference<AnonymousCartItemValidResponse>() {};
        return this.postApiV1AnonymouscartValidationItems(anonymousCartItemValidRequest, localVarReturnType, customHeader);
    }

    /**
     * Summary : validateAnonymousCartItems
     * API : cart_api POST /api/v1/anonymouscart/validation/items
     * Notes : 
     * @param anonymousCartItemValidRequest anonymousCartItemValidRequest(required)
     * @return AnonymousCartItemValidResponse
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac">http://api-forge.coupang.net/details?specId=58297a0498eec318e25431ac</a>
     */
    public AnonymousCartItemValidResponse postApiV1AnonymouscartValidationItems(AnonymousCartItemValidRequest anonymousCartItemValidRequest) throws ApiException {
        return this.postApiV1AnonymouscartValidationItems(anonymousCartItemValidRequest, null);
    }
}
