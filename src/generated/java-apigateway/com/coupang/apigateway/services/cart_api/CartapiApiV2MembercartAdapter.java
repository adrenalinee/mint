package com.coupang.apigateway.services.cart_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.cart_api.model.ShoppingCartResponseDTOOfint;

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
public class CartapiApiV2MembercartAdapter {

    private final ApiClient apiClient;

    @Autowired
    public CartapiApiV2MembercartAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("cart_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getMemberCartItemCount
     * Notes : 
     * API : cart_api GET /api/v2/memberCart/{memberSrl}/count
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d</a>
     */
    public <T> ResponseEntity<T> getApiV2MemberCartMemberSrlCountForResponseEntity(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberSrl' is set
        if (memberSrl == null) {
            throw new ApiException(400, "Missing the required parameter 'memberSrl' when calling getApiV2MemberCartMemberSrlCount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/memberCart/{memberSrl}/count"
            .replaceAll("\\{" + "memberSrl" + "\\}", memberSrl.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3d90e5477d4d886fb2d4d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getMemberCartItemCount
     * Notes : 
     * API : cart_api GET /api/v2/memberCart/{memberSrl}/count
     * @param memberSrl memberSrl (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ShoppingCartResponseDTOOfint
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d</a>
     */
    public <T> T getApiV2MemberCartMemberSrlCount(Long memberSrl, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2MemberCartMemberSrlCountForResponseEntity(memberSrl, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getMemberCartItemCount
     * Notes : 
     * API : cart_api GET /api/v2/memberCart/{memberSrl}/count
     * @param memberSrl memberSrl (required)
     * @param customHeader customHeaderMap (nullable)
     * @return ShoppingCartResponseDTOOfint
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d</a>
     */
    public ShoppingCartResponseDTOOfint getApiV2MemberCartMemberSrlCount(Long memberSrl, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<ShoppingCartResponseDTOOfint> localVarReturnType = new ParameterizedTypeReference<ShoppingCartResponseDTOOfint>() {};
        return this.getApiV2MemberCartMemberSrlCount(memberSrl, localVarReturnType, customHeader);
    }

    /**
     * Summary : getMemberCartItemCount
     * API : cart_api GET /api/v2/memberCart/{memberSrl}/count
     * Notes : 
     * @param memberSrl memberSrl(required)
     * @return ShoppingCartResponseDTOOfint
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d">http://api-forge.coupang.net/details?specId=57c3d90e5477d4d886fb2d4d</a>
     */
    public ShoppingCartResponseDTOOfint getApiV2MemberCartMemberSrlCount(Long memberSrl) throws ApiException {
        return this.getApiV2MemberCartMemberSrlCount(memberSrl, null);
    }
}
