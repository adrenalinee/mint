package com.coupang.apigateway.services.display;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.display.model.DisplayItemCategoryDto;
import com.coupang.apigateway.services.display.model.DisplayComponentDto;
import com.coupang.apigateway.services.display.model.DisplayComponentNodeDto;
import com.coupang.apigateway.services.display.model.DisplayComponentActiveBundleDto;
import java.util.*;
import com.coupang.apigateway.services.display.model.DisplayBrandDto;
import com.coupang.apigateway.services.display.model.DisplayDocumentWithPreDto;
import com.coupang.apigateway.services.display.model.DisplayExhibitionDto;
import com.coupang.apigateway.services.display.model.FlexibleBannerDto;
import com.coupang.apigateway.services.display.model.DisplayModulesDto;
import com.coupang.apigateway.services.display.model.DisplayAdapterResultOfDisplayModulesDto;

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
public class DisplayApiV1CmsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DisplayApiV1CmsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("display");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 내부카테고리IDs로 카테고리 정로를 가져온다
     * Notes : 내부카테고리IDs로 카테고리 정로를 가져온다
     * API : display GET /api/v1/cms/categories/bycategorycode
     * @param displayItemCategoryCode displayItemCategoryCode (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsCategoriesBycategorycodeForResponseEntity(List<Long> displayItemCategoryCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'displayItemCategoryCode' is set
        if (displayItemCategoryCode == null) {
            throw new ApiException(400, "Missing the required parameter 'displayItemCategoryCode' when calling getApiV1CmsCategoriesBycategorycode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/categories/bycategorycode";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "displayItemCategoryCode", displayItemCategoryCode));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96a64bd1687d7a2ed4e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 내부카테고리IDs로 카테고리 정로를 가져온다
     * Notes : 내부카테고리IDs로 카테고리 정로를 가져온다
     * API : display GET /api/v1/cms/categories/bycategorycode
     * @param displayItemCategoryCode displayItemCategoryCode (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemCategoryDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e</a>
     */
    public <T> T getApiV1CmsCategoriesBycategorycode(List<Long> displayItemCategoryCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsCategoriesBycategorycodeForResponseEntity(displayItemCategoryCode, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 내부카테고리IDs로 카테고리 정로를 가져온다
     * Notes : 내부카테고리IDs로 카테고리 정로를 가져온다
     * API : display GET /api/v1/cms/categories/bycategorycode
     * @param displayItemCategoryCode displayItemCategoryCode (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemCategoryDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e</a>
     */
    public List<DisplayItemCategoryDto> getApiV1CmsCategoriesBycategorycode(List<Long> displayItemCategoryCode, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayItemCategoryDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayItemCategoryDto>>() {};
        return this.getApiV1CmsCategoriesBycategorycode(displayItemCategoryCode, localVarReturnType, customHeader);
    }

    /**
     * Summary : 내부카테고리IDs로 카테고리 정로를 가져온다
     * API : display GET /api/v1/cms/categories/bycategorycode
     * Notes : 내부카테고리IDs로 카테고리 정로를 가져온다
     * @param displayItemCategoryCode displayItemCategoryCode(required)
     * @return List<DisplayItemCategoryDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed4e</a>
     */
    public List<DisplayItemCategoryDto> getApiV1CmsCategoriesBycategorycode(List<Long> displayItemCategoryCode) throws ApiException {
        return this.getApiV1CmsCategoriesBycategorycode(displayItemCategoryCode, null);
    }
    /**
     * Summary : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * Notes : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * API : display GET /api/v1/cms/componentMap
     * @param componentIds componentIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsComponentMapForResponseEntity(List<Long> componentIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'componentIds' is set
        if (componentIds == null) {
            throw new ApiException(400, "Missing the required parameter 'componentIds' when calling getApiV1CmsComponentMap");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/componentMap";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "componentIds", componentIds));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16a9", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * Notes : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * API : display GET /api/v1/cms/componentMap
     * @param componentIds componentIds (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9</a>
     */
    public <T> T getApiV1CmsComponentMap(List<Long> componentIds, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsComponentMapForResponseEntity(componentIds, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * Notes : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * API : display GET /api/v1/cms/componentMap
     * @param componentIds componentIds (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Long, DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9</a>
     */
    public Map<Long, DisplayComponentDto> getApiV1CmsComponentMap(List<Long> componentIds, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Long, DisplayComponentDto>> localVarReturnType = new ParameterizedTypeReference<Map<Long, DisplayComponentDto>>() {};
        return this.getApiV1CmsComponentMap(componentIds, localVarReturnType, customHeader);
    }

    /**
     * Summary : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * API : display GET /api/v1/cms/componentMap
     * Notes : componentId 리스트를 기준으로 해당 컴포넌트 정보를 가져온다
     * @param componentIds componentIds(required)
     * @return Map<Long, DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16a9</a>
     */
    public Map<Long, DisplayComponentDto> getApiV1CmsComponentMap(List<Long> componentIds) throws ApiException {
        return this.getApiV1CmsComponentMap(componentIds, null);
    }
    /**
     * Summary : 특정 번들의 트리구성정보를 가져온다
     * Notes : 특정 번들의 트리구성정보를 가져온다
     * API : display GET /api/v1/cms/components/bundles/{bundleId}
     * @param bundleId 번들 ID &lt;br/&gt;coupang-web: 1, &lt;br/&gt;mobile-api: 2, &lt;br/&gt;mobile-web:3 (required)
     * @param includeNonExpose includeNonExpose (optional, default to false)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsComponentsBundlesBundleIdForResponseEntity(Long bundleId, Boolean includeNonExpose, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bundleId' is set
        if (bundleId == null) {
            throw new ApiException(400, "Missing the required parameter 'bundleId' when calling getApiV1CmsComponentsBundlesBundleId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/components/bundles/{bundleId}"
            .replaceAll("\\{" + "bundleId" + "\\}", bundleId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeNonExpose", includeNonExpose));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16ae", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 특정 번들의 트리구성정보를 가져온다
     * Notes : 특정 번들의 트리구성정보를 가져온다
     * API : display GET /api/v1/cms/components/bundles/{bundleId}
     * @param bundleId 번들 ID &lt;br/&gt;coupang-web: 1, &lt;br/&gt;mobile-api: 2, &lt;br/&gt;mobile-web:3 (required)
     * @param includeNonExpose includeNonExpose (optional, default to false)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayComponentNodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae</a>
     */
    public <T> T getApiV1CmsComponentsBundlesBundleId(Long bundleId, Boolean includeNonExpose, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsComponentsBundlesBundleIdForResponseEntity(bundleId, includeNonExpose, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 특정 번들의 트리구성정보를 가져온다
     * Notes : 특정 번들의 트리구성정보를 가져온다
     * API : display GET /api/v1/cms/components/bundles/{bundleId}
     * @param bundleId 번들 ID &lt;br/&gt;coupang-web: 1, &lt;br/&gt;mobile-api: 2, &lt;br/&gt;mobile-web:3 (required)
     * @param includeNonExpose includeNonExpose (optional, default to false)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayComponentNodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae</a>
     */
    public DisplayComponentNodeDto getApiV1CmsComponentsBundlesBundleId(Long bundleId, Boolean includeNonExpose, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayComponentNodeDto> localVarReturnType = new ParameterizedTypeReference<DisplayComponentNodeDto>() {};
        return this.getApiV1CmsComponentsBundlesBundleId(bundleId, includeNonExpose, localVarReturnType, customHeader);
    }

    /**
     * Summary : 특정 번들의 트리구성정보를 가져온다
     * API : display GET /api/v1/cms/components/bundles/{bundleId}
     * Notes : 특정 번들의 트리구성정보를 가져온다
     * @param bundleId 번들 ID &lt;br/&gt;coupang-web: 1, &lt;br/&gt;mobile-api: 2, &lt;br/&gt;mobile-web:3(required)
     * @param includeNonExpose includeNonExpose(optional, default to false)
     * @return DisplayComponentNodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16ae</a>
     */
    public DisplayComponentNodeDto getApiV1CmsComponentsBundlesBundleId(Long bundleId, Boolean includeNonExpose) throws ApiException {
        return this.getApiV1CmsComponentsBundlesBundleId(bundleId, includeNonExpose, null);
    }
    /**
     * Summary : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * Notes : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * API : display GET /api/v1/cms/components/bundlesbybundlekey/{bundleKey}
     * @param bundleKey 번들 KEY &lt;br/&gt;PC_WEB, &lt;br/&gt;MOBILE_WEB, &lt;br/&gt;MOBILE_APP_A, &lt;br/&gt;MOBILE_APP_B (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsComponentsBundlesbybundlekeyBundleKeyForResponseEntity(String bundleKey, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bundleKey' is set
        if (bundleKey == null) {
            throw new ApiException(400, "Missing the required parameter 'bundleKey' when calling getApiV1CmsComponentsBundlesbybundlekeyBundleKey");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/components/bundlesbybundlekey/{bundleKey}"
            .replaceAll("\\{" + "bundleKey" + "\\}", bundleKey.toString());

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

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16b3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * Notes : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * API : display GET /api/v1/cms/components/bundlesbybundlekey/{bundleKey}
     * @param bundleKey 번들 KEY &lt;br/&gt;PC_WEB, &lt;br/&gt;MOBILE_WEB, &lt;br/&gt;MOBILE_APP_A, &lt;br/&gt;MOBILE_APP_B (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentActiveBundleDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3</a>
     */
    public <T> T getApiV1CmsComponentsBundlesbybundlekeyBundleKey(String bundleKey, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsComponentsBundlesbybundlekeyBundleKeyForResponseEntity(bundleKey, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * Notes : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * API : display GET /api/v1/cms/components/bundlesbybundlekey/{bundleKey}
     * @param bundleKey 번들 KEY &lt;br/&gt;PC_WEB, &lt;br/&gt;MOBILE_WEB, &lt;br/&gt;MOBILE_APP_A, &lt;br/&gt;MOBILE_APP_B (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentActiveBundleDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3</a>
     */
    public List<DisplayComponentActiveBundleDto> getApiV1CmsComponentsBundlesbybundlekeyBundleKey(String bundleKey, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayComponentActiveBundleDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayComponentActiveBundleDto>>() {};
        return this.getApiV1CmsComponentsBundlesbybundlekeyBundleKey(bundleKey, localVarReturnType, customHeader);
    }

    /**
     * Summary : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * API : display GET /api/v1/cms/components/bundlesbybundlekey/{bundleKey}
     * Notes : bundleKey값으로 번들의 트리구성정보를 가져온다.
     * @param bundleKey 번들 KEY &lt;br/&gt;PC_WEB, &lt;br/&gt;MOBILE_WEB, &lt;br/&gt;MOBILE_APP_A, &lt;br/&gt;MOBILE_APP_B(required)
     * @return List<DisplayComponentActiveBundleDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16b3</a>
     */
    public List<DisplayComponentActiveBundleDto> getApiV1CmsComponentsBundlesbybundlekeyBundleKey(String bundleKey) throws ApiException {
        return this.getApiV1CmsComponentsBundlesbybundlekeyBundleKey(bundleKey, null);
    }
    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategorycode
     * @param bundleId bundleId (required)
     * @param categoryCode categoryCode (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsComponentsByitemcategorycodeForResponseEntity(Long bundleId, Long categoryCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bundleId' is set
        if (bundleId == null) {
            throw new ApiException(400, "Missing the required parameter 'bundleId' when calling getApiV1CmsComponentsByitemcategorycode");
        }
        
        // verify the required parameter 'categoryCode' is set
        if (categoryCode == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryCode' when calling getApiV1CmsComponentsByitemcategorycode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/components/byitemcategorycode";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleId", bundleId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryCode", categoryCode));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96a64bd1687d7a2ed8a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategorycode
     * @param bundleId bundleId (required)
     * @param categoryCode categoryCode (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a</a>
     */
    public <T> T getApiV1CmsComponentsByitemcategorycode(Long bundleId, Long categoryCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsComponentsByitemcategorycodeForResponseEntity(bundleId, categoryCode, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategorycode
     * @param bundleId bundleId (required)
     * @param categoryCode categoryCode (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a</a>
     */
    public List<DisplayComponentDto> getApiV1CmsComponentsByitemcategorycode(Long bundleId, Long categoryCode, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayComponentDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayComponentDto>>() {};
        return this.getApiV1CmsComponentsByitemcategorycode(bundleId, categoryCode, localVarReturnType, customHeader);
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * API : display GET /api/v1/cms/components/byitemcategorycode
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * @param bundleId bundleId(required)
     * @param categoryCode categoryCode(required)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8a</a>
     */
    public List<DisplayComponentDto> getApiV1CmsComponentsByitemcategorycode(Long bundleId, Long categoryCode) throws ApiException {
        return this.getApiV1CmsComponentsByitemcategorycode(bundleId, categoryCode, null);
    }
    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategoryid
     * @param bundleId bundleId (required)
     * @param categoryId categoryId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsComponentsByitemcategoryidForResponseEntity(Long bundleId, Long categoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bundleId' is set
        if (bundleId == null) {
            throw new ApiException(400, "Missing the required parameter 'bundleId' when calling getApiV1CmsComponentsByitemcategoryid");
        }
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getApiV1CmsComponentsByitemcategoryid");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/components/byitemcategoryid";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bundleId", bundleId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96a64bd1687d7a2ed8f", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategoryid
     * @param bundleId bundleId (required)
     * @param categoryId categoryId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f</a>
     */
    public <T> T getApiV1CmsComponentsByitemcategoryid(Long bundleId, Long categoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsComponentsByitemcategoryidForResponseEntity(bundleId, categoryId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * API : display GET /api/v1/cms/components/byitemcategoryid
     * @param bundleId bundleId (required)
     * @param categoryId categoryId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f</a>
     */
    public List<DisplayComponentDto> getApiV1CmsComponentsByitemcategoryid(Long bundleId, Long categoryId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayComponentDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayComponentDto>>() {};
        return this.getApiV1CmsComponentsByitemcategoryid(bundleId, categoryId, localVarReturnType, customHeader);
    }

    /**
     * Summary : componentId 기준으로 자식노드들을 가져온다.
     * API : display GET /api/v1/cms/components/byitemcategoryid
     * Notes : componentId 기준으로 자식들을 가져온다. Image URL이 존재할경우 높은 우선순위를 가짐. 홀수번째 Image 는 제거됨
     * @param bundleId bundleId(required)
     * @param categoryId categoryId(required)
     * @return List<DisplayComponentDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f">http://api-forge.coupang.net/details?specId=57c3e96a64bd1687d7a2ed8f</a>
     */
    public List<DisplayComponentDto> getApiV1CmsComponentsByitemcategoryid(Long bundleId, Long categoryId) throws ApiException {
        return this.getApiV1CmsComponentsByitemcategoryid(bundleId, categoryId, null);
    }
    /**
     * Summary : assetKey에 해당하는 AssetValue List를 리턴한다.
     * Notes : List로 assetValue만 리턴
     * API : display GET /api/v1/cms/displaybanner/searchbannerkeywordlist/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCodeForResponseEntity(String bannerCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bannerCode' is set
        if (bannerCode == null) {
            throw new ApiException(400, "Missing the required parameter 'bannerCode' when calling getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybanner/searchbannerkeywordlist/{bannerCode}"
            .replaceAll("\\{" + "bannerCode" + "\\}", bannerCode.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2edcb", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : assetKey에 해당하는 AssetValue List를 리턴한다.
     * Notes : List로 assetValue만 리턴
     * API : display GET /api/v1/cms/displaybanner/searchbannerkeywordlist/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, List<Long>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb</a>
     */
    public <T> T getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode(String bannerCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCodeForResponseEntity(bannerCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : assetKey에 해당하는 AssetValue List를 리턴한다.
     * Notes : List로 assetValue만 리턴
     * API : display GET /api/v1/cms/displaybanner/searchbannerkeywordlist/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<String, List<Long>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb</a>
     */
    public Map<String, List<Long>> getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode(String bannerCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<String, List<Long>>> localVarReturnType = new ParameterizedTypeReference<Map<String, List<Long>>>() {};
        return this.getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode(bannerCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : assetKey에 해당하는 AssetValue List를 리턴한다.
     * API : display GET /api/v1/cms/displaybanner/searchbannerkeywordlist/{bannerCode}
     * Notes : List로 assetValue만 리턴
     * @param bannerCode bannerCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return Map<String, List<Long>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2edcb</a>
     */
    public Map<String, List<Long>> getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode(String bannerCode, String baseDateTime) throws ApiException {
        return this.getApiV1CmsDisplaybannerSearchbannerkeywordlistBannerCode(bannerCode, baseDateTime, null);
    }
    /**
     * Summary : brand 코드가 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand
     * @param brandCode Brand code to search (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandForResponseEntity(String brandCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandCode' is set
        if (brandCode == null) {
            throw new ApiException(400, "Missing the required parameter 'brandCode' when calling getApiV1CmsDisplaybrand");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandCode", brandCode));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16d6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : brand 코드가 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand
     * @param brandCode Brand code to search (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6</a>
     */
    public <T> T getApiV1CmsDisplaybrand(String brandCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandForResponseEntity(brandCode, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : brand 코드가 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand
     * @param brandCode Brand code to search (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrand(String brandCode, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBrandDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBrandDto>>() {};
        return this.getApiV1CmsDisplaybrand(brandCode, localVarReturnType, customHeader);
    }

    /**
     * Summary : brand 코드가 일치하는 브랜드 정보 리턴.
     * API : display GET /api/v1/cms/displaybrand
     * Notes : 
     * @param brandCode Brand code to search(required)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16d6</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrand(String brandCode) throws ApiException {
        return this.getApiV1CmsDisplaybrand(brandCode, null);
    }
    /**
     * Summary : 모든 브랜드 정보를 가져온다. 모든 브랜드 정보를 가져오기 때문에 성능에 문제가 있을 수 있어서, 사용하는 측에서 캐시를 적용해야 한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandAllForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/all";

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

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16db", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모든 브랜드 정보를 가져온다. 모든 브랜드 정보를 가져오기 때문에 성능에 문제가 있을 수 있어서, 사용하는 측에서 캐시를 적용해야 한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db</a>
     */
    public <T> T getApiV1CmsDisplaybrandAll(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandAllForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모든 브랜드 정보를 가져온다. 모든 브랜드 정보를 가져오기 때문에 성능에 문제가 있을 수 있어서, 사용하는 측에서 캐시를 적용해야 한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandAll(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBrandDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBrandDto>>() {};
        return this.getApiV1CmsDisplaybrandAll(localVarReturnType, customHeader);
    }

    /**
     * Summary : 모든 브랜드 정보를 가져온다. 모든 브랜드 정보를 가져오기 때문에 성능에 문제가 있을 수 있어서, 사용하는 측에서 캐시를 적용해야 한다.
     * API : display GET /api/v1/cms/displaybrand/all
     * Notes : 
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16db</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandAll() throws ApiException {
        return this.getApiV1CmsDisplaybrandAll(null);
    }
    /**
     * Summary : 파라미터로 전달된 수정날짜 이후에 변경된 모든 브랜드 정보를 가져온다. 최대 한달을 기준으로 이후에 수정된 브랜드들만 조회한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all/aftermodifiedat
     * @param modifiedAt modified at (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710">http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandAllAftermodifiedatForResponseEntity(String modifiedAt, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modifiedAt' is set
        if (modifiedAt == null) {
            throw new ApiException(400, "Missing the required parameter 'modifiedAt' when calling getApiV1CmsDisplaybrandAllAftermodifiedat");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/all/aftermodifiedat";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "modifiedAt", modifiedAt));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58588b0fff778651ae620710", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 파라미터로 전달된 수정날짜 이후에 변경된 모든 브랜드 정보를 가져온다. 최대 한달을 기준으로 이후에 수정된 브랜드들만 조회한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all/aftermodifiedat
     * @param modifiedAt modified at (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710">http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710</a>
     */
    public <T> T getApiV1CmsDisplaybrandAllAftermodifiedat(String modifiedAt, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandAllAftermodifiedatForResponseEntity(modifiedAt, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 파라미터로 전달된 수정날짜 이후에 변경된 모든 브랜드 정보를 가져온다. 최대 한달을 기준으로 이후에 수정된 브랜드들만 조회한다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/all/aftermodifiedat
     * @param modifiedAt modified at (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710">http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandAllAftermodifiedat(String modifiedAt, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBrandDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBrandDto>>() {};
        return this.getApiV1CmsDisplaybrandAllAftermodifiedat(modifiedAt, localVarReturnType, customHeader);
    }

    /**
     * Summary : 파라미터로 전달된 수정날짜 이후에 변경된 모든 브랜드 정보를 가져온다. 최대 한달을 기준으로 이후에 수정된 브랜드들만 조회한다.
     * API : display GET /api/v1/cms/displaybrand/all/aftermodifiedat
     * Notes : 
     * @param modifiedAt modified at(required)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710">http://api-forge.coupang.net/details?specId=58588b0fff778651ae620710</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandAllAftermodifiedat(String modifiedAt) throws ApiException {
        return this.getApiV1CmsDisplaybrandAllAftermodifiedat(modifiedAt, null);
    }
    /**
     * Summary : componentId로 필터링해 브랜드 정보를 가져온다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/bycomponent/{componentId}
     * @param componentId 내려줄 브랜드리스트가 포함되있는 전시 카테고리 ID. (required)
     * @param offset 페이징 시작점. 없으면 전체를 내려줌. (optional)
     * @param limit 가져올 객체 수. 없으면 전체를 내려줌 (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269">http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandBycomponentComponentIdForResponseEntity(Long componentId, Integer offset, Integer limit, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new ApiException(400, "Missing the required parameter 'componentId' when calling getApiV1CmsDisplaybrandBycomponentComponentId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/bycomponent/{componentId}"
            .replaceAll("\\{" + "componentId" + "\\}", componentId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58a43855d52df5b0d5d85269", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : componentId로 필터링해 브랜드 정보를 가져온다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/bycomponent/{componentId}
     * @param componentId 내려줄 브랜드리스트가 포함되있는 전시 카테고리 ID. (required)
     * @param offset 페이징 시작점. 없으면 전체를 내려줌. (optional)
     * @param limit 가져올 객체 수. 없으면 전체를 내려줌 (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269">http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269</a>
     */
    public <T> T getApiV1CmsDisplaybrandBycomponentComponentId(Long componentId, Integer offset, Integer limit, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandBycomponentComponentIdForResponseEntity(componentId, offset, limit, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : componentId로 필터링해 브랜드 정보를 가져온다.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/bycomponent/{componentId}
     * @param componentId 내려줄 브랜드리스트가 포함되있는 전시 카테고리 ID. (required)
     * @param offset 페이징 시작점. 없으면 전체를 내려줌. (optional)
     * @param limit 가져올 객체 수. 없으면 전체를 내려줌 (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269">http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandBycomponentComponentId(Long componentId, Integer offset, Integer limit, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBrandDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBrandDto>>() {};
        return this.getApiV1CmsDisplaybrandBycomponentComponentId(componentId, offset, limit, localVarReturnType, customHeader);
    }

    /**
     * Summary : componentId로 필터링해 브랜드 정보를 가져온다.
     * API : display GET /api/v1/cms/displaybrand/bycomponent/{componentId}
     * Notes : 
     * @param componentId 내려줄 브랜드리스트가 포함되있는 전시 카테고리 ID.(required)
     * @param offset 페이징 시작점. 없으면 전체를 내려줌.(optional)
     * @param limit 가져올 객체 수. 없으면 전체를 내려줌(optional)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269">http://api-forge.coupang.net/details?specId=58a43855d52df5b0d5d85269</a>
     */
    public List<DisplayBrandDto> getApiV1CmsDisplaybrandBycomponentComponentId(Long componentId, Integer offset, Integer limit) throws ApiException {
        return this.getApiV1CmsDisplaybrandBycomponentComponentId(componentId, offset, limit, null);
    }
    /**
     * Summary : 해당 브랜드가 internal category 에서 노출되어야 하는지 확인한다
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/internalcategory
     * @param brandName Brand name (required)
     * @param internalCategoryId Internal category id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d">http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandInternalcategoryForResponseEntity(String brandName, String internalCategoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandName' is set
        if (brandName == null) {
            throw new ApiException(400, "Missing the required parameter 'brandName' when calling getApiV1CmsDisplaybrandInternalcategory");
        }
        
        // verify the required parameter 'internalCategoryId' is set
        if (internalCategoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'internalCategoryId' when calling getApiV1CmsDisplaybrandInternalcategory");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/internalcategory";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "internalCategoryId", internalCategoryId));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5833adc2e1e0a7c88d88171d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해당 브랜드가 internal category 에서 노출되어야 하는지 확인한다
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/internalcategory
     * @param brandName Brand name (required)
     * @param internalCategoryId Internal category id (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d">http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d</a>
     */
    public <T> T getApiV1CmsDisplaybrandInternalcategory(String brandName, String internalCategoryId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandInternalcategoryForResponseEntity(brandName, internalCategoryId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해당 브랜드가 internal category 에서 노출되어야 하는지 확인한다
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/internalcategory
     * @param brandName Brand name (required)
     * @param internalCategoryId Internal category id (required)
     * @param customHeader customHeaderMap (nullable)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d">http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d</a>
     */
    public Boolean getApiV1CmsDisplaybrandInternalcategory(String brandName, String internalCategoryId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<Boolean>() {};
        return this.getApiV1CmsDisplaybrandInternalcategory(brandName, internalCategoryId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해당 브랜드가 internal category 에서 노출되어야 하는지 확인한다
     * API : display GET /api/v1/cms/displaybrand/internalcategory
     * Notes : 
     * @param brandName Brand name(required)
     * @param internalCategoryId Internal category id(required)
     * @return Boolean
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d">http://api-forge.coupang.net/details?specId=5833adc2e1e0a7c88d88171d</a>
     */
    public Boolean getApiV1CmsDisplaybrandInternalcategory(String brandName, String internalCategoryId) throws ApiException {
        return this.getApiV1CmsDisplaybrandInternalcategory(brandName, internalCategoryId, null);
    }
    /**
     * Summary : brand 이름이 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/names
     * @param brandName Brand name to search (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5">http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandNamesForResponseEntity(String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/names";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brandName", brandName));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("584a0612b4c3af4c1e09dfe5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : brand 이름이 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/names
     * @param brandName Brand name to search (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5">http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5</a>
     */
    public <T> T getApiV1CmsDisplaybrandNames(String brandName, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandNamesForResponseEntity(brandName, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : brand 이름이 일치하는 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/names
     * @param brandName Brand name to search (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5">http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5</a>
     */
    public DisplayBrandDto getApiV1CmsDisplaybrandNames(String brandName, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayBrandDto> localVarReturnType = new ParameterizedTypeReference<DisplayBrandDto>() {};
        return this.getApiV1CmsDisplaybrandNames(brandName, localVarReturnType, customHeader);
    }

    /**
     * Summary : brand 이름이 일치하는 브랜드 정보 리턴.
     * API : display GET /api/v1/cms/displaybrand/names
     * Notes : 
     * @param brandName Brand name to search(optional)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5">http://api-forge.coupang.net/details?specId=584a0612b4c3af4c1e09dfe5</a>
     */
    public DisplayBrandDto getApiV1CmsDisplaybrandNames(String brandName) throws ApiException {
        return this.getApiV1CmsDisplaybrandNames(brandName, null);
    }
    /**
     * Summary : ID와 일치하는 하나의 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/{brandId}
     * @param brandId 가져올 브랜드 ID (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaybrandBrandIdForResponseEntity(Long brandId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new ApiException(400, "Missing the required parameter 'brandId' when calling getApiV1CmsDisplaybrandBrandId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaybrand/{brandId}"
            .replaceAll("\\{" + "brandId" + "\\}", brandId.toString());

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

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16e5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : ID와 일치하는 하나의 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/{brandId}
     * @param brandId 가져올 브랜드 ID (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5</a>
     */
    public <T> T getApiV1CmsDisplaybrandBrandId(Long brandId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaybrandBrandIdForResponseEntity(brandId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : ID와 일치하는 하나의 브랜드 정보 리턴.
     * Notes : 
     * API : display GET /api/v1/cms/displaybrand/{brandId}
     * @param brandId 가져올 브랜드 ID (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5</a>
     */
    public DisplayBrandDto getApiV1CmsDisplaybrandBrandId(Long brandId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayBrandDto> localVarReturnType = new ParameterizedTypeReference<DisplayBrandDto>() {};
        return this.getApiV1CmsDisplaybrandBrandId(brandId, localVarReturnType, customHeader);
    }

    /**
     * Summary : ID와 일치하는 하나의 브랜드 정보 리턴.
     * API : display GET /api/v1/cms/displaybrand/{brandId}
     * Notes : 
     * @param brandId 가져올 브랜드 ID(required)
     * @return DisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16e5</a>
     */
    public DisplayBrandDto getApiV1CmsDisplaybrandBrandId(Long brandId) throws ApiException {
        return this.getApiV1CmsDisplaybrandBrandId(brandId, null);
    }
    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v1/cms/displaydocument/lastwithprev/{documentCode}
     * @param documentCode documentCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplaydocumentLastwithprevDocumentCodeForResponseEntity(String documentCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'documentCode' is set
        if (documentCode == null) {
            throw new ApiException(400, "Missing the required parameter 'documentCode' when calling getApiV1CmsDisplaydocumentLastwithprevDocumentCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displaydocument/lastwithprev/{documentCode}"
            .replaceAll("\\{" + "documentCode" + "\\}", documentCode.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ede4", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v1/cms/displaydocument/lastwithprev/{documentCode}
     * @param documentCode documentCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDocumentWithPreDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4</a>
     */
    public <T> T getApiV1CmsDisplaydocumentLastwithprevDocumentCode(String documentCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplaydocumentLastwithprevDocumentCodeForResponseEntity(documentCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v1/cms/displaydocument/lastwithprev/{documentCode}
     * @param documentCode documentCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayDocumentWithPreDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4</a>
     */
    public DisplayDocumentWithPreDto getApiV1CmsDisplaydocumentLastwithprevDocumentCode(String documentCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayDocumentWithPreDto> localVarReturnType = new ParameterizedTypeReference<DisplayDocumentWithPreDto>() {};
        return this.getApiV1CmsDisplaydocumentLastwithprevDocumentCode(documentCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * API : display GET /api/v1/cms/displaydocument/lastwithprev/{documentCode}
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * @param documentCode documentCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayDocumentWithPreDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ede4</a>
     */
    public DisplayDocumentWithPreDto getApiV1CmsDisplaydocumentLastwithprevDocumentCode(String documentCode, String baseDateTime) throws ApiException {
        return this.getApiV1CmsDisplaydocumentLastwithprevDocumentCode(documentCode, baseDateTime, null);
    }
    /**
     * Summary : exhibitionCode로 기획전 목록을 리턴한다.
     * Notes : 
     * API : display GET /api/v1/cms/displayexhibition/list/{exhibitionCode}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param exhibitionCode exhibitionCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceTypeForResponseEntity(String targetDeviceType, String exhibitionCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType");
        }
        
        // verify the required parameter 'exhibitionCode' is set
        if (exhibitionCode == null) {
            throw new ApiException(400, "Missing the required parameter 'exhibitionCode' when calling getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/displayexhibition/list/{exhibitionCode}/{targetDeviceType}"
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString())
            .replaceAll("\\{" + "exhibitionCode" + "\\}", exhibitionCode.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("5810747a4982e9a7c61e16f3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : exhibitionCode로 기획전 목록을 리턴한다.
     * Notes : 
     * API : display GET /api/v1/cms/displayexhibition/list/{exhibitionCode}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param exhibitionCode exhibitionCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3</a>
     */
    public <T> T getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType(String targetDeviceType, String exhibitionCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceTypeForResponseEntity(targetDeviceType, exhibitionCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : exhibitionCode로 기획전 목록을 리턴한다.
     * Notes : 
     * API : display GET /api/v1/cms/displayexhibition/list/{exhibitionCode}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param exhibitionCode exhibitionCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3</a>
     */
    public DisplayExhibitionDto getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType(String targetDeviceType, String exhibitionCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayExhibitionDto> localVarReturnType = new ParameterizedTypeReference<DisplayExhibitionDto>() {};
        return this.getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType(targetDeviceType, exhibitionCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : exhibitionCode로 기획전 목록을 리턴한다.
     * API : display GET /api/v1/cms/displayexhibition/list/{exhibitionCode}/{targetDeviceType}
     * Notes : 
     * @param targetDeviceType targetDeviceType(required)
     * @param exhibitionCode exhibitionCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayExhibitionDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3">http://api-forge.coupang.net/details?specId=5810747a4982e9a7c61e16f3</a>
     */
    public DisplayExhibitionDto getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType(String targetDeviceType, String exhibitionCode, String baseDateTime) throws ApiException {
        return this.getApiV1CmsDisplayexhibitionListExhibitionCodeTargetDeviceType(targetDeviceType, exhibitionCode, baseDateTime, null);
    }
    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodes/{targetDeviceType}/{sectionCode}
     * @param sectionCode sectionCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCodeForResponseEntity(String sectionCode, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sectionCode' is set
        if (sectionCode == null) {
            throw new ApiException(400, "Missing the required parameter 'sectionCode' when calling getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode");
        }
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/flexiblebanner/bannerCodes/{targetDeviceType}/{sectionCode}"
            .replaceAll("\\{" + "sectionCode" + "\\}", sectionCode.toString())
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee16", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodes/{targetDeviceType}/{sectionCode}
     * @param sectionCode sectionCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16</a>
     */
    public <T> T getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode(String sectionCode, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCodeForResponseEntity(sectionCode, targetDeviceType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodes/{targetDeviceType}/{sectionCode}
     * @param sectionCode sectionCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16</a>
     */
    public Map<Integer, List<FlexibleBannerDto>> getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode(String sectionCode, String targetDeviceType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Integer, List<FlexibleBannerDto>>> localVarReturnType = new ParameterizedTypeReference<Map<Integer, List<FlexibleBannerDto>>>() {};
        return this.getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode(sectionCode, targetDeviceType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodes/{targetDeviceType}/{sectionCode}
     * Notes : 쿠팡 광고 정보를 가져온다.
     * @param sectionCode sectionCode(required)
     * @param targetDeviceType targetDeviceType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee16</a>
     */
    public Map<Integer, List<FlexibleBannerDto>> getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode(String sectionCode, String targetDeviceType, String baseDateTime) throws ApiException {
        return this.getApiV1CmsFlexiblebannerBannerCodesTargetDeviceTypeSectionCode(sectionCode, targetDeviceType, baseDateTime, null);
    }
    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodesByDynamicSection/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListIdForResponseEntity(Long listId, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException(400, "Missing the required parameter 'listId' when calling getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId");
        }
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/flexiblebanner/bannerCodesByDynamicSection/{targetDeviceType}/{listId}"
            .replaceAll("\\{" + "listId" + "\\}", listId.toString())
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee1b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodesByDynamicSection/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b</a>
     */
    public <T> T getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListIdForResponseEntity(listId, targetDeviceType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * Notes : 쿠팡 광고 정보를 가져온다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodesByDynamicSection/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b</a>
     */
    public Map<Integer, List<FlexibleBannerDto>> getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<Map<Integer, List<FlexibleBannerDto>>> localVarReturnType = new ParameterizedTypeReference<Map<Integer, List<FlexibleBannerDto>>>() {};
        return this.getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId(listId, targetDeviceType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 모바일 Home Contents를 순서데로 리턴한다.
     * API : display GET /api/v1/cms/flexiblebanner/bannerCodesByDynamicSection/{targetDeviceType}/{listId}
     * Notes : 쿠팡 광고 정보를 가져온다.
     * @param listId listId(required)
     * @param targetDeviceType targetDeviceType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return Map<Integer, List<FlexibleBannerDto>>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee1b</a>
     */
    public Map<Integer, List<FlexibleBannerDto>> getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime) throws ApiException {
        return this.getApiV1CmsFlexiblebannerBannerCodesByDynamicSectionTargetDeviceTypeListId(listId, targetDeviceType, baseDateTime, null);
    }
    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/module-names
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c">http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsModuleRegistryPagesNameModuleNamesForResponseEntity(String name, String osType, String version, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(400, "Missing the required parameter 'name' when calling getApiV1CmsModuleRegistryPagesNameModuleNames");
        }
        
        // verify the required parameter 'osType' is set
        if (osType == null) {
            throw new ApiException(400, "Missing the required parameter 'osType' when calling getApiV1CmsModuleRegistryPagesNameModuleNames");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getApiV1CmsModuleRegistryPagesNameModuleNames");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/module-registry/pages/{name}/module-names"
            .replaceAll("\\{" + "name" + "\\}", name.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "osType", osType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58dc848d1f6a12cbbc27391c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/module-names
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c">http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c</a>
     */
    public <T> T getApiV1CmsModuleRegistryPagesNameModuleNames(String name, String osType, String version, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsModuleRegistryPagesNameModuleNamesForResponseEntity(name, osType, version, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/module-names
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c">http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c</a>
     */
    public DisplayModulesDto getApiV1CmsModuleRegistryPagesNameModuleNames(String name, String osType, String version, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayModulesDto> localVarReturnType = new ParameterizedTypeReference<DisplayModulesDto>() {};
        return this.getApiV1CmsModuleRegistryPagesNameModuleNames(name, osType, version, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * API : display GET /api/v1/cms/module-registry/pages/{name}/module-names
     * Notes : 
     * @param name name(required)
     * @param osType osType(required)
     * @param version version(required)
     * @return DisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c">http://api-forge.coupang.net/details?specId=58dc848d1f6a12cbbc27391c</a>
     */
    public DisplayModulesDto getApiV1CmsModuleRegistryPagesNameModuleNames(String name, String osType, String version) throws ApiException {
        return this.getApiV1CmsModuleRegistryPagesNameModuleNames(name, osType, version, null);
    }
    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/modules
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0">http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0</a>
     */
    public <T> ResponseEntity<T> getApiV1CmsModuleRegistryPagesNameModulesForResponseEntity(String name, String osType, String version, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(400, "Missing the required parameter 'name' when calling getApiV1CmsModuleRegistryPagesNameModules");
        }
        
        // verify the required parameter 'osType' is set
        if (osType == null) {
            throw new ApiException(400, "Missing the required parameter 'osType' when calling getApiV1CmsModuleRegistryPagesNameModules");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException(400, "Missing the required parameter 'version' when calling getApiV1CmsModuleRegistryPagesNameModules");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/cms/module-registry/pages/{name}/modules"
            .replaceAll("\\{" + "name" + "\\}", name.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "osType", osType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("58cfc2ee72c46e45296192e0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/modules
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfDisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0">http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0</a>
     */
    public <T> T getApiV1CmsModuleRegistryPagesNameModules(String name, String osType, String version, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1CmsModuleRegistryPagesNameModulesForResponseEntity(name, osType, version, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * Notes : 
     * API : display GET /api/v1/cms/module-registry/pages/{name}/modules
     * @param name name (required)
     * @param osType osType (required)
     * @param version version (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfDisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0">http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0</a>
     */
    public DisplayAdapterResultOfDisplayModulesDto getApiV1CmsModuleRegistryPagesNameModules(String name, String osType, String version, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAdapterResultOfDisplayModulesDto> localVarReturnType = new ParameterizedTypeReference<DisplayAdapterResultOfDisplayModulesDto>() {};
        return this.getApiV1CmsModuleRegistryPagesNameModules(name, osType, version, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns sorted Module List By pageName, osType, version
     * API : display GET /api/v1/cms/module-registry/pages/{name}/modules
     * Notes : 
     * @param name name(required)
     * @param osType osType(required)
     * @param version version(required)
     * @return DisplayAdapterResultOfDisplayModulesDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0">http://api-forge.coupang.net/details?specId=58cfc2ee72c46e45296192e0</a>
     */
    public DisplayAdapterResultOfDisplayModulesDto getApiV1CmsModuleRegistryPagesNameModules(String name, String osType, String version) throws ApiException {
        return this.getApiV1CmsModuleRegistryPagesNameModules(name, osType, version, null);
    }
}
