package com.coupang.apigateway.services.abtest_randomizer;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.abtest_randomizer.model.TestDefinitionResponseDTO2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.288+09:00")
@org.springframework.stereotype.Component
public class AbtestrandomizerApiV2TestsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public AbtestrandomizerApiV2TestsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("abtest_randomizer");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : getTestDefinition
     * Notes : 
     * API : abtest_randomizer GET /api/v2/tests
     * @param platform  (required)
     * @param version  (optional)
     * @param userId  (optional)
     * @param statuses  (optional)
     * @param location  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52">http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52</a>
     */
    public <T> ResponseEntity<T> getApiV2TestsForResponseEntity(String platform, String version, String userId, List<String> statuses, String location, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException(400, "Missing the required parameter 'platform' when calling getApiV2Tests");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/tests";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "statuses", statuses));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57d24d2a3ac97f2757145c52", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : getTestDefinition
     * Notes : 
     * API : abtest_randomizer GET /api/v2/tests
     * @param platform  (required)
     * @param version  (optional)
     * @param userId  (optional)
     * @param statuses  (optional)
     * @param location  (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<TestDefinitionResponseDTO2>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52">http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52</a>
     */
    public <T> T getApiV2Tests(String platform, String version, String userId, List<String> statuses, String location, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2TestsForResponseEntity(platform, version, userId, statuses, location, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : getTestDefinition
     * Notes : 
     * API : abtest_randomizer GET /api/v2/tests
     * @param platform  (required)
     * @param version  (optional)
     * @param userId  (optional)
     * @param statuses  (optional)
     * @param location  (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<TestDefinitionResponseDTO2>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52">http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52</a>
     */
    public List<TestDefinitionResponseDTO2> getApiV2Tests(String platform, String version, String userId, List<String> statuses, String location, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<TestDefinitionResponseDTO2>> localVarReturnType = new ParameterizedTypeReference<List<TestDefinitionResponseDTO2>>() {};
        return this.getApiV2Tests(platform, version, userId, statuses, location, localVarReturnType, customHeader);
    }

    /**
     * Summary : getTestDefinition
     * API : abtest_randomizer GET /api/v2/tests
     * Notes : 
     * @param platform (required)
     * @param version (optional)
     * @param userId (optional)
     * @param statuses (optional)
     * @param location (optional)
     * @return List<TestDefinitionResponseDTO2>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52">http://api-forge.coupang.net/details?specId=57d24d2a3ac97f2757145c52</a>
     */
    public List<TestDefinitionResponseDTO2> getApiV2Tests(String platform, String version, String userId, List<String> statuses, String location) throws ApiException {
        return this.getApiV2Tests(platform, version, userId, statuses, location, null);
    }
}
