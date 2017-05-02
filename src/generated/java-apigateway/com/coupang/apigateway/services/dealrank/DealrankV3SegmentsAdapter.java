package com.coupang.apigateway.services.dealrank;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.dealrank.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.606+09:00")
@org.springframework.stereotype.Component
public class DealrankV3SegmentsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DealrankV3SegmentsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("dealrank");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 
     * Notes : Get items PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/items/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0</a>
     */
    public <T> ResponseEntity<T> getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserIdForResponseEntity(String categoryId, String userId, String agent, String abtests, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException(400, "Missing the required parameter 'userId' when calling getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId");
        }
        
        // create path and map variables
        String localVarPath = "/v3/segments/plp/sections/items/categories/{categoryId}/users/{userId}"
            .replaceAll("\\{" + "categoryId" + "\\}", categoryId.toString())
            .replaceAll("\\{" + "userId" + "\\}", userId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent", agent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "abtests", abtests));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57f2e5990b3b294253024bf0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 
     * Notes : Get items PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/items/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0</a>
     */
    public <T> T getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserIdForResponseEntity(categoryId, userId, agent, abtests, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 
     * Notes : Get items PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/items/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0</a>
     */
    public InlineResponse2001 getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<InlineResponse2001> localVarReturnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return this.getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId(categoryId, userId, agent, abtests, localVarReturnType, customHeader);
    }

    /**
     * Summary : 
     * API : dealrank GET /v3/segments/plp/sections/items/categories/{categoryId}/users/{userId}
     * Notes : Get items PLP segmentaion info
     * @param categoryId categoryId (external category id)(required)
     * @param userId userId (memberSrl or PCID)(required)
     * @param agent agentId (Android | iOS | WEB | mobile)(optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A)(optional)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf0</a>
     */
    public InlineResponse2001 getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests) throws ApiException {
        return this.getV3SegmentsPlpSectionsItemsCategoriesCategoryIdUsersUserId(categoryId, userId, agent, abtests, null);
    }
    /**
     * Summary : 
     * Notes : Get trending brands PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/trending/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5</a>
     */
    public <T> ResponseEntity<T> getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserIdForResponseEntity(String categoryId, String userId, String agent, String abtests, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException(400, "Missing the required parameter 'userId' when calling getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId");
        }
        
        // create path and map variables
        String localVarPath = "/v3/segments/plp/sections/trending/categories/{categoryId}/users/{userId}"
            .replaceAll("\\{" + "categoryId" + "\\}", categoryId.toString())
            .replaceAll("\\{" + "userId" + "\\}", userId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent", agent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "abtests", abtests));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57f2e5990b3b294253024bf5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 
     * Notes : Get trending brands PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/trending/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5</a>
     */
    public <T> T getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserIdForResponseEntity(categoryId, userId, agent, abtests, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 
     * Notes : Get trending brands PLP segmentaion info
     * API : dealrank GET /v3/segments/plp/sections/trending/categories/{categoryId}/users/{userId}
     * @param categoryId categoryId (external category id) (required)
     * @param userId userId (memberSrl or PCID) (required)
     * @param agent agentId (Android | iOS | WEB | mobile) (optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A) (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5</a>
     */
    public InlineResponse2001 getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<InlineResponse2001> localVarReturnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return this.getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId(categoryId, userId, agent, abtests, localVarReturnType, customHeader);
    }

    /**
     * Summary : 
     * API : dealrank GET /v3/segments/plp/sections/trending/categories/{categoryId}/users/{userId}
     * Notes : Get trending brands PLP segmentaion info
     * @param categoryId categoryId (external category id)(required)
     * @param userId userId (memberSrl or PCID)(required)
     * @param agent agentId (Android | iOS | WEB | mobile)(optional, default to mobile)
     * @param abtests comma delimeted abtest results. (1001_A,1002_B,1003_C,1004_A)(optional)
     * @return InlineResponse2001
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5">http://api-forge.coupang.net/details?specId=57f2e5990b3b294253024bf5</a>
     */
    public InlineResponse2001 getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId(String categoryId, String userId, String agent, String abtests) throws ApiException {
        return this.getV3SegmentsPlpSectionsTrendingCategoriesCategoryIdUsersUserId(categoryId, userId, agent, abtests, null);
    }
}
