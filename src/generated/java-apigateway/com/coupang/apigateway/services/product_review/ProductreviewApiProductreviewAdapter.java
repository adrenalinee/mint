package com.coupang.apigateway.services.product_review;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.product_review.model.BlockMemberDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
@org.springframework.stereotype.Component
public class ProductreviewApiProductreviewAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ProductreviewApiProductreviewAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("product_review");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/productreview/v1/blockmember/memberId/{memberId}
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886">http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886</a>
     */
    public <T> ResponseEntity<T> getApiProductreviewV1BlockmemberMemberIdMemberIdForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiProductreviewV1BlockmemberMemberIdMemberId");
        }
        
        // create path and map variables
        String localVarPath = "/api/productreview/v1/blockmember/memberId/{memberId}"
            .replaceAll("\\{" + "memberId" + "\\}", memberId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57bea9f86fd89ecc6b801886", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/productreview/v1/blockmember/memberId/{memberId}
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BlockMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886">http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886</a>
     */
    public <T> T getApiProductreviewV1BlockmemberMemberIdMemberId(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiProductreviewV1BlockmemberMemberIdMemberIdForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : get
     * Notes : 
     * API : product_review GET /api/productreview/v1/blockmember/memberId/{memberId}
     * @param memberId memberId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BlockMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886">http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886</a>
     */
    public BlockMemberDto getApiProductreviewV1BlockmemberMemberIdMemberId(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BlockMemberDto> localVarReturnType = new ParameterizedTypeReference<BlockMemberDto>() {};
        return this.getApiProductreviewV1BlockmemberMemberIdMemberId(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : get
     * API : product_review GET /api/productreview/v1/blockmember/memberId/{memberId}
     * Notes : 
     * @param memberId memberId(required)
     * @return BlockMemberDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886">http://api-forge.coupang.net/details?specId=57bea9f86fd89ecc6b801886</a>
     */
    public BlockMemberDto getApiProductreviewV1BlockmemberMemberIdMemberId(String memberId) throws ApiException {
        return this.getApiProductreviewV1BlockmemberMemberIdMemberId(memberId, null);
    }
}
