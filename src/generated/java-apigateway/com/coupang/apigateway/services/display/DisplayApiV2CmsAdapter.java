package com.coupang.apigateway.services.display;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.display.model.DisplayAdapterResult;
import com.coupang.apigateway.services.display.model.DisplayBrandCollectionRequest;
import com.coupang.apigateway.services.display.model.DisplayAdapterResultOfPageContainerOfDisplayBrandDto;
import com.coupang.apigateway.services.display.model.DisplayBrandListRequest;
import com.coupang.apigateway.services.display.model.DisplayBannerV2Dto;
import com.coupang.apigateway.services.display.model.DisplayBrandDto;
import com.coupang.apigateway.services.display.model.DisplayAdapterResultOfDisplayBrandCodeDto;
import com.coupang.apigateway.services.display.model.DisplayExhibitionPageDto;
import com.coupang.apigateway.services.display.model.DisplayExhibitionWithItemV2Dto;
import com.coupang.apigateway.services.display.model.DisplayItemDto;
import com.coupang.apigateway.services.display.model.DisplayItemListV2Dto;
import com.coupang.apigateway.services.display.model.MobileSectionFilterKeywordDto;
import com.coupang.apigateway.services.display.model.MobileSectionFilterDto;
import com.coupang.apigateway.services.display.model.MobileSectionDto;
import com.coupang.apigateway.services.display.model.SearchAdDto;

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
public class DisplayApiV2CmsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public DisplayApiV2CmsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("display");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/display-brand/code/{codeId}
     * @param codeId codeId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3">http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayBrandCodeCodeIdForResponseEntity(Long codeId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'codeId' is set
        if (codeId == null) {
            throw new ApiException(400, "Missing the required parameter 'codeId' when calling getApiV2CmsDisplayBrandCodeCodeId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/display-brand/code/{codeId}"
            .replaceAll("\\{" + "codeId" + "\\}", codeId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58a6766a2305b46503bcfde3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/display-brand/code/{codeId}
     * @param codeId codeId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3">http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3</a>
     */
    public <T> T getApiV2CmsDisplayBrandCodeCodeId(Long codeId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayBrandCodeCodeIdForResponseEntity(codeId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/display-brand/code/{codeId}
     * @param codeId codeId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3">http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3</a>
     */
    public DisplayAdapterResult getApiV2CmsDisplayBrandCodeCodeId(Long codeId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAdapterResult> localVarReturnType = new ParameterizedTypeReference<DisplayAdapterResult>() {};
        return this.getApiV2CmsDisplayBrandCodeCodeId(codeId, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand code by id
     * API : display GET /api/v2/cms/display-brand/code/{codeId}
     * Notes : 
     * @param codeId codeId(required)
     * @return DisplayAdapterResult
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3">http://api-forge.coupang.net/details?specId=58a6766a2305b46503bcfde3</a>
     */
    public DisplayAdapterResult getApiV2CmsDisplayBrandCodeCodeId(Long codeId) throws ApiException {
        return this.getApiV2CmsDisplayBrandCodeCodeId(codeId, null);
    }
    /**
     * Summary : returns sorted Brand List By initial consonant
     * Notes : when initial consonant range(from, to) is empty default filtering is [ALL(korean)] (가-힣) when [from ~ to] range is [A ~ 힣] it will returns not between A ~ 힣 (numbers, special character, etc)
     * API : display POST /api/v2/cms/display-brand/collection/list
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e">http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e</a>
     */
    public <T> ResponseEntity<T> postApiV2CmsDisplayBrandCollectionListForResponseEntity(DisplayBrandCollectionRequest request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling postApiV2CmsDisplayBrandCollectionList");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/display-brand/collection/list";

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

        return apiClient.invokeAPIForResponseEntity("5886ae467472c990b3e2589e", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns sorted Brand List By initial consonant
     * Notes : when initial consonant range(from, to) is empty default filtering is [ALL(korean)] (가-힣) when [from ~ to] range is [A ~ 힣] it will returns not between A ~ 힣 (numbers, special character, etc)
     * API : display POST /api/v2/cms/display-brand/collection/list
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e">http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e</a>
     */
    public <T> T postApiV2CmsDisplayBrandCollectionList(DisplayBrandCollectionRequest request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2CmsDisplayBrandCollectionListForResponseEntity(request, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns sorted Brand List By initial consonant
     * Notes : when initial consonant range(from, to) is empty default filtering is [ALL(korean)] (가-힣) when [from ~ to] range is [A ~ 힣] it will returns not between A ~ 힣 (numbers, special character, etc)
     * API : display POST /api/v2/cms/display-brand/collection/list
     * @param request request (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e">http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e</a>
     */
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDto postApiV2CmsDisplayBrandCollectionList(DisplayBrandCollectionRequest request, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAdapterResultOfPageContainerOfDisplayBrandDto> localVarReturnType = new ParameterizedTypeReference<DisplayAdapterResultOfPageContainerOfDisplayBrandDto>() {};
        return this.postApiV2CmsDisplayBrandCollectionList(request, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns sorted Brand List By initial consonant
     * API : display POST /api/v2/cms/display-brand/collection/list
     * Notes : when initial consonant range(from, to) is empty default filtering is [ALL(korean)] (가-힣) when [from ~ to] range is [A ~ 힣] it will returns not between A ~ 힣 (numbers, special character, etc)
     * @param request request(required)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e">http://api-forge.coupang.net/details?specId=5886ae467472c990b3e2589e</a>
     */
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDto postApiV2CmsDisplayBrandCollectionList(DisplayBrandCollectionRequest request) throws ApiException {
        return this.postApiV2CmsDisplayBrandCollectionList(request, null);
    }
    /**
     * Summary : returns brands containing requested componentId and attributes sorted by rank
     * Notes : 
     * API : display POST /api/v2/cms/display-brand/rank/list
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309">http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309</a>
     */
    public <T> ResponseEntity<T> postApiV2CmsDisplayBrandRankListForResponseEntity(DisplayBrandListRequest request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = request;
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException(400, "Missing the required parameter 'request' when calling postApiV2CmsDisplayBrandRankList");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/display-brand/rank/list";

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

        return apiClient.invokeAPIForResponseEntity("5887327547d2bf7f45143309", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brands containing requested componentId and attributes sorted by rank
     * Notes : 
     * API : display POST /api/v2/cms/display-brand/rank/list
     * @param request request (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309">http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309</a>
     */
    public <T> T postApiV2CmsDisplayBrandRankList(DisplayBrandListRequest request, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV2CmsDisplayBrandRankListForResponseEntity(request, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brands containing requested componentId and attributes sorted by rank
     * Notes : 
     * API : display POST /api/v2/cms/display-brand/rank/list
     * @param request request (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309">http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309</a>
     */
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDto postApiV2CmsDisplayBrandRankList(DisplayBrandListRequest request, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAdapterResultOfPageContainerOfDisplayBrandDto> localVarReturnType = new ParameterizedTypeReference<DisplayAdapterResultOfPageContainerOfDisplayBrandDto>() {};
        return this.postApiV2CmsDisplayBrandRankList(request, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brands containing requested componentId and attributes sorted by rank
     * API : display POST /api/v2/cms/display-brand/rank/list
     * Notes : 
     * @param request request(required)
     * @return DisplayAdapterResultOfPageContainerOfDisplayBrandDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309">http://api-forge.coupang.net/details?specId=5887327547d2bf7f45143309</a>
     */
    public DisplayAdapterResultOfPageContainerOfDisplayBrandDto postApiV2CmsDisplayBrandRankList(DisplayBrandListRequest request) throws ApiException {
        return this.postApiV2CmsDisplayBrandRankList(request, null);
    }
    /**
     * Summary : assetKey과 AssetValue에 해당하는 배너 List를 리턴한다.
     * Notes : 배너 List를 리턴
     * API : display GET /api/v2/cms/displaybanner/banneridlistbyassetkeyandvalue/{bannerCode}/{assetKey}/{assetValue}
     * @param bannerCode bannerCode (required)
     * @param assetKey assetKey (required)
     * @param assetValue assetValue (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValueForResponseEntity(String bannerCode, String assetKey, String assetValue, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bannerCode' is set
        if (bannerCode == null) {
            throw new ApiException(400, "Missing the required parameter 'bannerCode' when calling getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue");
        }
        
        // verify the required parameter 'assetKey' is set
        if (assetKey == null) {
            throw new ApiException(400, "Missing the required parameter 'assetKey' when calling getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue");
        }
        
        // verify the required parameter 'assetValue' is set
        if (assetValue == null) {
            throw new ApiException(400, "Missing the required parameter 'assetValue' when calling getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displaybanner/banneridlistbyassetkeyandvalue/{bannerCode}/{assetKey}/{assetValue}"
            .replaceAll("\\{" + "bannerCode" + "\\}", bannerCode.toString())
            .replaceAll("\\{" + "assetKey" + "\\}", assetKey.toString())
            .replaceAll("\\{" + "assetValue" + "\\}", assetValue.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee2f", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : assetKey과 AssetValue에 해당하는 배너 List를 리턴한다.
     * Notes : 배너 List를 리턴
     * API : display GET /api/v2/cms/displaybanner/banneridlistbyassetkeyandvalue/{bannerCode}/{assetKey}/{assetValue}
     * @param bannerCode bannerCode (required)
     * @param assetKey assetKey (required)
     * @param assetValue assetValue (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f</a>
     */
    public <T> T getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue(String bannerCode, String assetKey, String assetValue, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValueForResponseEntity(bannerCode, assetKey, assetValue, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : assetKey과 AssetValue에 해당하는 배너 List를 리턴한다.
     * Notes : 배너 List를 리턴
     * API : display GET /api/v2/cms/displaybanner/banneridlistbyassetkeyandvalue/{bannerCode}/{assetKey}/{assetValue}
     * @param bannerCode bannerCode (required)
     * @param assetKey assetKey (required)
     * @param assetValue assetValue (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue(String bannerCode, String assetKey, String assetValue, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBannerV2Dto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBannerV2Dto>>() {};
        return this.getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue(bannerCode, assetKey, assetValue, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : assetKey과 AssetValue에 해당하는 배너 List를 리턴한다.
     * API : display GET /api/v2/cms/displaybanner/banneridlistbyassetkeyandvalue/{bannerCode}/{assetKey}/{assetValue}
     * Notes : 배너 List를 리턴
     * @param bannerCode bannerCode(required)
     * @param assetKey assetKey(required)
     * @param assetValue assetValue(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee2f</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue(String bannerCode, String assetKey, String assetValue, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplaybannerBanneridlistbyassetkeyandvalueBannerCodeAssetKeyAssetValue(bannerCode, assetKey, assetValue, baseDateTime, null);
    }
    /**
     * Summary : bannerId에 맞는 BannerList를 리턴한다.
     * Notes : 날짜에 맞는 배너만 리턴한다
     * API : display GET /api/v2/cms/displaybanner/bybannerids/{bannerIds}
     * @param bannerIds bannerIds (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplaybannerBybanneridsBannerIdsForResponseEntity(String bannerIds, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bannerIds' is set
        if (bannerIds == null) {
            throw new ApiException(400, "Missing the required parameter 'bannerIds' when calling getApiV2CmsDisplaybannerBybanneridsBannerIds");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displaybanner/bybannerids/{bannerIds}"
            .replaceAll("\\{" + "bannerIds" + "\\}", bannerIds.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee34", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : bannerId에 맞는 BannerList를 리턴한다.
     * Notes : 날짜에 맞는 배너만 리턴한다
     * API : display GET /api/v2/cms/displaybanner/bybannerids/{bannerIds}
     * @param bannerIds bannerIds (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34</a>
     */
    public <T> T getApiV2CmsDisplaybannerBybanneridsBannerIds(String bannerIds, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplaybannerBybanneridsBannerIdsForResponseEntity(bannerIds, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : bannerId에 맞는 BannerList를 리턴한다.
     * Notes : 날짜에 맞는 배너만 리턴한다
     * API : display GET /api/v2/cms/displaybanner/bybannerids/{bannerIds}
     * @param bannerIds bannerIds (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBybanneridsBannerIds(String bannerIds, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBannerV2Dto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBannerV2Dto>>() {};
        return this.getApiV2CmsDisplaybannerBybanneridsBannerIds(bannerIds, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : bannerId에 맞는 BannerList를 리턴한다.
     * API : display GET /api/v2/cms/displaybanner/bybannerids/{bannerIds}
     * Notes : 날짜에 맞는 배너만 리턴한다
     * @param bannerIds bannerIds(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee34</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBybanneridsBannerIds(String bannerIds, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplaybannerBybanneridsBannerIds(bannerIds, baseDateTime, null);
    }
    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v2/cms/displaybanner/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplaybannerBannerCodeForResponseEntity(String bannerCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bannerCode' is set
        if (bannerCode == null) {
            throw new ApiException(400, "Missing the required parameter 'bannerCode' when calling getApiV2CmsDisplaybannerBannerCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displaybanner/{bannerCode}"
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

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee48", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v2/cms/displaybanner/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48</a>
     */
    public <T> T getApiV2CmsDisplaybannerBannerCode(String bannerCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplaybannerBannerCodeForResponseEntity(bannerCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * API : display GET /api/v2/cms/displaybanner/{bannerCode}
     * @param bannerCode bannerCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBannerCode(String bannerCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBannerV2Dto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBannerV2Dto>>() {};
        return this.getApiV2CmsDisplaybannerBannerCode(bannerCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : bannerCode를 통해서 배너 이미지와 링크등을 리턴한다
     * API : display GET /api/v2/cms/displaybanner/{bannerCode}
     * Notes : 날짜에 해당하는 날짜그룹에 배너가 존재하지 않을 경우에 empty=false로 리턴
     * @param bannerCode bannerCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayBannerV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee48</a>
     */
    public List<DisplayBannerV2Dto> getApiV2CmsDisplaybannerBannerCode(String bannerCode, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplaybannerBannerCode(bannerCode, baseDateTime, null);
    }
    /**
     * Summary : CMS 에 정의한 우선순서대로 브랜드를 내려준다.
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand
     * @param componentId 내려줄 브랜드리스트가 포함되있는 외부 카테고리 ID. (optional)
     * @param topBrand topBrand (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplaybrandForResponseEntity(Long componentId, Boolean topBrand, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displaybrand";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "componentId", componentId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "topBrand", topBrand));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee4d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : CMS 에 정의한 우선순서대로 브랜드를 내려준다.
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand
     * @param componentId 내려줄 브랜드리스트가 포함되있는 외부 카테고리 ID. (optional)
     * @param topBrand topBrand (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d</a>
     */
    public <T> T getApiV2CmsDisplaybrand(Long componentId, Boolean topBrand, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplaybrandForResponseEntity(componentId, topBrand, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : CMS 에 정의한 우선순서대로 브랜드를 내려준다.
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand
     * @param componentId 내려줄 브랜드리스트가 포함되있는 외부 카테고리 ID. (optional)
     * @param topBrand topBrand (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d</a>
     */
    public List<DisplayBrandDto> getApiV2CmsDisplaybrand(Long componentId, Boolean topBrand, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayBrandDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayBrandDto>>() {};
        return this.getApiV2CmsDisplaybrand(componentId, topBrand, localVarReturnType, customHeader);
    }

    /**
     * Summary : CMS 에 정의한 우선순서대로 브랜드를 내려준다.
     * API : display GET /api/v2/cms/displaybrand
     * Notes : 
     * @param componentId 내려줄 브랜드리스트가 포함되있는 외부 카테고리 ID.(optional)
     * @param topBrand topBrand(optional)
     * @return List<DisplayBrandDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee4d</a>
     */
    public List<DisplayBrandDto> getApiV2CmsDisplaybrand(Long componentId, Boolean topBrand) throws ApiException {
        return this.getApiV2CmsDisplaybrand(componentId, topBrand, null);
    }
    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand/code/{codeId}
     * @param codeId codeId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5">http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplaybrandCodeCodeIdForResponseEntity(Long codeId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'codeId' is set
        if (codeId == null) {
            throw new ApiException(400, "Missing the required parameter 'codeId' when calling getApiV2CmsDisplaybrandCodeCodeId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displaybrand/code/{codeId}"
            .replaceAll("\\{" + "codeId" + "\\}", codeId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58fd99bab15ba6f9736768a5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand/code/{codeId}
     * @param codeId codeId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfDisplayBrandCodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5">http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5</a>
     */
    public <T> T getApiV2CmsDisplaybrandCodeCodeId(Long codeId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplaybrandCodeCodeIdForResponseEntity(codeId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : returns brand code by id
     * Notes : 
     * API : display GET /api/v2/cms/displaybrand/code/{codeId}
     * @param codeId codeId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayAdapterResultOfDisplayBrandCodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5">http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5</a>
     */
    public DisplayAdapterResultOfDisplayBrandCodeDto getApiV2CmsDisplaybrandCodeCodeId(Long codeId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayAdapterResultOfDisplayBrandCodeDto> localVarReturnType = new ParameterizedTypeReference<DisplayAdapterResultOfDisplayBrandCodeDto>() {};
        return this.getApiV2CmsDisplaybrandCodeCodeId(codeId, localVarReturnType, customHeader);
    }

    /**
     * Summary : returns brand code by id
     * API : display GET /api/v2/cms/displaybrand/code/{codeId}
     * Notes : 
     * @param codeId codeId(required)
     * @return DisplayAdapterResultOfDisplayBrandCodeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5">http://api-forge.coupang.net/details?specId=58fd99bab15ba6f9736768a5</a>
     */
    public DisplayAdapterResultOfDisplayBrandCodeDto getApiV2CmsDisplaybrandCodeCodeId(Long codeId) throws ApiException {
        return this.getApiV2CmsDisplaybrandCodeCodeId(codeId, null);
    }
    /**
     * Summary : 기획전 카테고리 정보와 기획전 리스트를 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/all/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305">http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayexhibitionAllTargetDeviceTypeForResponseEntity(String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayexhibitionAllTargetDeviceType");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayexhibition/all/{targetDeviceType}"
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

        return apiClient.invokeAPIForResponseEntity("586c96e29bb58f1ecf50c305", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 기획전 카테고리 정보와 기획전 리스트를 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/all/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305">http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305</a>
     */
    public <T> T getApiV2CmsDisplayexhibitionAllTargetDeviceType(String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayexhibitionAllTargetDeviceTypeForResponseEntity(targetDeviceType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 기획전 카테고리 정보와 기획전 리스트를 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/all/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305">http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305</a>
     */
    public DisplayExhibitionPageDto getApiV2CmsDisplayexhibitionAllTargetDeviceType(String targetDeviceType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayExhibitionPageDto> localVarReturnType = new ParameterizedTypeReference<DisplayExhibitionPageDto>() {};
        return this.getApiV2CmsDisplayexhibitionAllTargetDeviceType(targetDeviceType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 기획전 카테고리 정보와 기획전 리스트를 리턴한다
     * API : display GET /api/v2/cms/displayexhibition/all/{targetDeviceType}
     * Notes : 
     * @param targetDeviceType targetDeviceType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayExhibitionPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305">http://api-forge.coupang.net/details?specId=586c96e29bb58f1ecf50c305</a>
     */
    public DisplayExhibitionPageDto getApiV2CmsDisplayexhibitionAllTargetDeviceType(String targetDeviceType, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayexhibitionAllTargetDeviceType(targetDeviceType, baseDateTime, null);
    }
    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)을 리턴한다.
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detail/{listId}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceTypeForResponseEntity(String targetDeviceType, Long listId, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException(400, "Missing the required parameter 'listId' when calling getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayexhibition/detail/{listId}/{targetDeviceType}"
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString())
            .replaceAll("\\{" + "listId" + "\\}", listId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58c0e283ad677f38cc229430", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)을 리턴한다.
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detail/{listId}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430</a>
     */
    public <T> T getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType(String targetDeviceType, Long listId, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceTypeForResponseEntity(targetDeviceType, listId, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)을 리턴한다.
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detail/{listId}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430</a>
     */
    public DisplayExhibitionWithItemV2Dto getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType(String targetDeviceType, Long listId, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayExhibitionWithItemV2Dto> localVarReturnType = new ParameterizedTypeReference<DisplayExhibitionWithItemV2Dto>() {};
        return this.getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType(targetDeviceType, listId, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)을 리턴한다.
     * API : display GET /api/v2/cms/displayexhibition/detail/{listId}/{targetDeviceType}
     * Notes : 
     * @param targetDeviceType targetDeviceType(required)
     * @param listId listId(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc229430</a>
     */
    public DisplayExhibitionWithItemV2Dto getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType(String targetDeviceType, Long listId, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayexhibitionDetailListIdTargetDeviceType(targetDeviceType, listId, baseDateTime, null);
    }
    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)에서 items를 benefitType로 필터하여 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detailbybenefit/{listId}/{benefitType}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param benefitType benefitType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceTypeForResponseEntity(String targetDeviceType, Long listId, String benefitType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType");
        }
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException(400, "Missing the required parameter 'listId' when calling getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType");
        }
        
        // verify the required parameter 'benefitType' is set
        if (benefitType == null) {
            throw new ApiException(400, "Missing the required parameter 'benefitType' when calling getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayexhibition/detailbybenefit/{listId}/{benefitType}/{targetDeviceType}"
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString())
            .replaceAll("\\{" + "listId" + "\\}", listId.toString())
            .replaceAll("\\{" + "benefitType" + "\\}", benefitType.toString());

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

        return apiClient.invokeAPIForResponseEntity("58c0e283ad677f38cc22942b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)에서 items를 benefitType로 필터하여 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detailbybenefit/{listId}/{benefitType}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param benefitType benefitType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b</a>
     */
    public <T> T getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType(String targetDeviceType, Long listId, String benefitType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceTypeForResponseEntity(targetDeviceType, listId, benefitType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)에서 items를 benefitType로 필터하여 리턴한다
     * Notes : 
     * API : display GET /api/v2/cms/displayexhibition/detailbybenefit/{listId}/{benefitType}/{targetDeviceType}
     * @param targetDeviceType targetDeviceType (required)
     * @param listId listId (required)
     * @param benefitType benefitType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b</a>
     */
    public DisplayExhibitionWithItemV2Dto getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType(String targetDeviceType, Long listId, String benefitType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayExhibitionWithItemV2Dto> localVarReturnType = new ParameterizedTypeReference<DisplayExhibitionWithItemV2Dto>() {};
        return this.getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType(targetDeviceType, listId, benefitType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : listId로 기획전 상세(Items, Banner 등 포함)에서 items를 benefitType로 필터하여 리턴한다
     * API : display GET /api/v2/cms/displayexhibition/detailbybenefit/{listId}/{benefitType}/{targetDeviceType}
     * Notes : 
     * @param targetDeviceType targetDeviceType(required)
     * @param listId listId(required)
     * @param benefitType benefitType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayExhibitionWithItemV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b">http://api-forge.coupang.net/details?specId=58c0e283ad677f38cc22942b</a>
     */
    public DisplayExhibitionWithItemV2Dto getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType(String targetDeviceType, Long listId, String benefitType, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayexhibitionDetailbybenefitListIdBenefitTypeTargetDeviceType(targetDeviceType, listId, benefitType, baseDateTime, null);
    }
    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 딜이 존재하지 않을경우 이전 날짜의 데이터를 리턴한다
     * API : display GET /api/v2/cms/displayitem/itembylistcode/{targetDeviceType}/{itemlistCode}
     * @param itemlistCode itemlistCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(String itemlistCode, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemlistCode' is set
        if (itemlistCode == null) {
            throw new ApiException(400, "Missing the required parameter 'itemlistCode' when calling getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayitem/itembylistcode/{targetDeviceType}/{itemlistCode}"
            .replaceAll("\\{" + "itemlistCode" + "\\}", itemlistCode.toString())
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

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee52", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 딜이 존재하지 않을경우 이전 날짜의 데이터를 리턴한다
     * API : display GET /api/v2/cms/displayitem/itembylistcode/{targetDeviceType}/{itemlistCode}
     * @param itemlistCode itemlistCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52</a>
     */
    public <T> T getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode(String itemlistCode, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(itemlistCode, targetDeviceType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 딜이 존재하지 않을경우 이전 날짜의 데이터를 리턴한다
     * API : display GET /api/v2/cms/displayitem/itembylistcode/{targetDeviceType}/{itemlistCode}
     * @param itemlistCode itemlistCode (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52</a>
     */
    public List<DisplayItemDto> getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode(String itemlistCode, String targetDeviceType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayItemDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayItemDto>>() {};
        return this.getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode(itemlistCode, targetDeviceType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 item목록(상품or배너)과 이미지를 리턴한다
     * API : display GET /api/v2/cms/displayitem/itembylistcode/{targetDeviceType}/{itemlistCode}
     * Notes : 날짜에 해당하는 날짜그룹에 딜이 존재하지 않을경우 이전 날짜의 데이터를 리턴한다
     * @param itemlistCode itemlistCode(required)
     * @param targetDeviceType targetDeviceType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee52</a>
     */
    public List<DisplayItemDto> getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode(String itemlistCode, String targetDeviceType, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayitemItembylistcodeTargetDeviceTypeItemlistCode(itemlistCode, targetDeviceType, baseDateTime, null);
    }
    /**
     * Summary : [Memcache] listId로 itemList에 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : ItemList의 목록을 통해서 listId를 확인할수 있다
     * API : display GET /api/v2/cms/displayitem/itembylistid/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListIdForResponseEntity(Long listId, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException(400, "Missing the required parameter 'listId' when calling getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId");
        }
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayitem/itembylistid/{targetDeviceType}/{listId}"
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

        return apiClient.invokeAPIForResponseEntity("57c3e96b64bd1687d7a2ee5c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : [Memcache] listId로 itemList에 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : ItemList의 목록을 통해서 listId를 확인할수 있다
     * API : display GET /api/v2/cms/displayitem/itembylistid/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c</a>
     */
    public <T> T getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListIdForResponseEntity(listId, targetDeviceType, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : [Memcache] listId로 itemList에 item목록(상품or배너)과 이미지를 리턴한다
     * Notes : ItemList의 목록을 통해서 listId를 확인할수 있다
     * API : display GET /api/v2/cms/displayitem/itembylistid/{targetDeviceType}/{listId}
     * @param listId listId (required)
     * @param targetDeviceType targetDeviceType (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c</a>
     */
    public List<DisplayItemDto> getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayItemDto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayItemDto>>() {};
        return this.getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId(listId, targetDeviceType, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : [Memcache] listId로 itemList에 item목록(상품or배너)과 이미지를 리턴한다
     * API : display GET /api/v2/cms/displayitem/itembylistid/{targetDeviceType}/{listId}
     * Notes : ItemList의 목록을 통해서 listId를 확인할수 있다
     * @param listId listId(required)
     * @param targetDeviceType targetDeviceType(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayItemDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c">http://api-forge.coupang.net/details?specId=57c3e96b64bd1687d7a2ee5c</a>
     */
    public List<DisplayItemDto> getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId(Long listId, String targetDeviceType, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayitemItembylistidTargetDeviceTypeListId(listId, targetDeviceType, baseDateTime, null);
    }
    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함)를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtobylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(String targetDeviceType, String itemlistCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // verify the required parameter 'itemlistCode' is set
        if (itemlistCode == null) {
            throw new ApiException(400, "Missing the required parameter 'itemlistCode' when calling getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayitemlist/dtobylistcode/{targetDeviceType}/{itemlistCode}"
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString())
            .replaceAll("\\{" + "itemlistCode" + "\\}", itemlistCode.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3e96c64bd1687d7a2ee6b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함)를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtobylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayItemListV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b</a>
     */
    public <T> T getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(targetDeviceType, itemlistCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함)를 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtobylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return DisplayItemListV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b</a>
     */
    public DisplayItemListV2Dto getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DisplayItemListV2Dto> localVarReturnType = new ParameterizedTypeReference<DisplayItemListV2Dto>() {};
        return this.getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode(targetDeviceType, itemlistCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함)를 리턴한다
     * API : display GET /api/v2/cms/displayitemlist/dtobylistcode/{targetDeviceType}/{itemlistCode}
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * @param targetDeviceType targetDeviceType(required)
     * @param itemlistCode itemlistCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return DisplayItemListV2Dto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee6b</a>
     */
    public DisplayItemListV2Dto getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayitemlistDtobylistcodeTargetDeviceTypeItemlistCode(targetDeviceType, itemlistCode, baseDateTime, null);
    }
    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함) List로 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtosbylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(String targetDeviceType, String itemlistCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetDeviceType' is set
        if (targetDeviceType == null) {
            throw new ApiException(400, "Missing the required parameter 'targetDeviceType' when calling getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // verify the required parameter 'itemlistCode' is set
        if (itemlistCode == null) {
            throw new ApiException(400, "Missing the required parameter 'itemlistCode' when calling getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/displayitemlist/dtosbylistcode/{targetDeviceType}/{itemlistCode}"
            .replaceAll("\\{" + "targetDeviceType" + "\\}", targetDeviceType.toString())
            .replaceAll("\\{" + "itemlistCode" + "\\}", itemlistCode.toString());

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

        return apiClient.invokeAPIForResponseEntity("57c3e96c64bd1687d7a2ee75", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함) List로 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtosbylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemListV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75</a>
     */
    public <T> T getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCodeForResponseEntity(targetDeviceType, itemlistCode, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함) List로 리턴한다
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * API : display GET /api/v2/cms/displayitemlist/dtosbylistcode/{targetDeviceType}/{itemlistCode}
     * @param targetDeviceType targetDeviceType (required)
     * @param itemlistCode itemlistCode (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<DisplayItemListV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75</a>
     */
    public List<DisplayItemListV2Dto> getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DisplayItemListV2Dto>> localVarReturnType = new ParameterizedTypeReference<List<DisplayItemListV2Dto>>() {};
        return this.getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode(targetDeviceType, itemlistCode, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : [MEMCACHE] itemlistCode를 통해서 DisplayItemListV2Dto(Item포함) List로 리턴한다
     * API : display GET /api/v2/cms/displayitemlist/dtosbylistcode/{targetDeviceType}/{itemlistCode}
     * Notes : 날짜에 해당하는 날짜그룹에 데이터를 리턴한다.
     * @param targetDeviceType targetDeviceType(required)
     * @param itemlistCode itemlistCode(required)
     * @param baseDateTime baseDateTime(optional)
     * @return List<DisplayItemListV2Dto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee75</a>
     */
    public List<DisplayItemListV2Dto> getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode(String targetDeviceType, String itemlistCode, String baseDateTime) throws ApiException {
        return this.getApiV2CmsDisplayitemlistDtosbylistcodeTargetDeviceTypeItemlistCode(targetDeviceType, itemlistCode, baseDateTime, null);
    }
    /**
     * Summary : 모바일 다이나믹 섹션의 필터 keyword를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterKeyword/{sectionId}
     * @param sectionId sectionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsMobileSectionFilterKeywordSectionIdForResponseEntity(Long sectionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sectionId' is set
        if (sectionId == null) {
            throw new ApiException(400, "Missing the required parameter 'sectionId' when calling getApiV2CmsMobileSectionFilterKeywordSectionId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/mobileSection/filterKeyword/{sectionId}"
            .replaceAll("\\{" + "sectionId" + "\\}", sectionId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58f44717a3c67264648c98e2", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터 keyword를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterKeyword/{sectionId}
     * @param sectionId sectionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return MobileSectionFilterKeywordDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2</a>
     */
    public <T> T getApiV2CmsMobileSectionFilterKeywordSectionId(Long sectionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsMobileSectionFilterKeywordSectionIdForResponseEntity(sectionId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터 keyword를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterKeyword/{sectionId}
     * @param sectionId sectionId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return MobileSectionFilterKeywordDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2</a>
     */
    public MobileSectionFilterKeywordDto getApiV2CmsMobileSectionFilterKeywordSectionId(Long sectionId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<MobileSectionFilterKeywordDto> localVarReturnType = new ParameterizedTypeReference<MobileSectionFilterKeywordDto>() {};
        return this.getApiV2CmsMobileSectionFilterKeywordSectionId(sectionId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터 keyword를 가져온다.
     * API : display GET /api/v2/cms/mobileSection/filterKeyword/{sectionId}
     * Notes : 
     * @param sectionId sectionId(required)
     * @return MobileSectionFilterKeywordDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e2</a>
     */
    public MobileSectionFilterKeywordDto getApiV2CmsMobileSectionFilterKeywordSectionId(Long sectionId) throws ApiException {
        return this.getApiV2CmsMobileSectionFilterKeywordSectionId(sectionId, null);
    }
    /**
     * Summary : 모바일 다이나믹 섹션의 필터를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterList/{sectionId}
     * @param sectionId sectionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsMobileSectionFilterListSectionIdForResponseEntity(Long sectionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sectionId' is set
        if (sectionId == null) {
            throw new ApiException(400, "Missing the required parameter 'sectionId' when calling getApiV2CmsMobileSectionFilterListSectionId");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/mobileSection/filterList/{sectionId}"
            .replaceAll("\\{" + "sectionId" + "\\}", sectionId.toString());

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

        return apiClient.invokeAPIForResponseEntity("58f44717a3c67264648c98e7", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterList/{sectionId}
     * @param sectionId sectionId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<MobileSectionFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7</a>
     */
    public <T> T getApiV2CmsMobileSectionFilterListSectionId(Long sectionId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsMobileSectionFilterListSectionIdForResponseEntity(sectionId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터를 가져온다.
     * Notes : 
     * API : display GET /api/v2/cms/mobileSection/filterList/{sectionId}
     * @param sectionId sectionId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<MobileSectionFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7</a>
     */
    public List<MobileSectionFilterDto> getApiV2CmsMobileSectionFilterListSectionId(Long sectionId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<MobileSectionFilterDto>> localVarReturnType = new ParameterizedTypeReference<List<MobileSectionFilterDto>>() {};
        return this.getApiV2CmsMobileSectionFilterListSectionId(sectionId, localVarReturnType, customHeader);
    }

    /**
     * Summary : 모바일 다이나믹 섹션의 필터를 가져온다.
     * API : display GET /api/v2/cms/mobileSection/filterList/{sectionId}
     * Notes : 
     * @param sectionId sectionId(required)
     * @return List<MobileSectionFilterDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7">http://api-forge.coupang.net/details?specId=58f44717a3c67264648c98e7</a>
     */
    public List<MobileSectionFilterDto> getApiV2CmsMobileSectionFilterListSectionId(Long sectionId) throws ApiException {
        return this.getApiV2CmsMobileSectionFilterListSectionId(sectionId, null);
    }
    /**
     * Summary : 모바일 다이나믹 섹션 정보를 가져온다.
     * Notes : 모바일 전용이며 필요에 따라 있을 수도 있고 없을 수도 있다.
     * API : display GET /api/v2/cms/mobileSection/sectionList
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsMobileSectionSectionListForResponseEntity(String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/mobileSection/sectionList";

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

        return apiClient.invokeAPIForResponseEntity("57c3e96c64bd1687d7a2ee98", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 모바일 다이나믹 섹션 정보를 가져온다.
     * Notes : 모바일 전용이며 필요에 따라 있을 수도 있고 없을 수도 있다.
     * API : display GET /api/v2/cms/mobileSection/sectionList
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<MobileSectionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98</a>
     */
    public <T> T getApiV2CmsMobileSectionSectionList(String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsMobileSectionSectionListForResponseEntity(baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 모바일 다이나믹 섹션 정보를 가져온다.
     * Notes : 모바일 전용이며 필요에 따라 있을 수도 있고 없을 수도 있다.
     * API : display GET /api/v2/cms/mobileSection/sectionList
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return List<MobileSectionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98</a>
     */
    public List<MobileSectionDto> getApiV2CmsMobileSectionSectionList(String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<MobileSectionDto>> localVarReturnType = new ParameterizedTypeReference<List<MobileSectionDto>>() {};
        return this.getApiV2CmsMobileSectionSectionList(baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 모바일 다이나믹 섹션 정보를 가져온다.
     * API : display GET /api/v2/cms/mobileSection/sectionList
     * Notes : 모바일 전용이며 필요에 따라 있을 수도 있고 없을 수도 있다.
     * @param baseDateTime baseDateTime(optional)
     * @return List<MobileSectionDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee98</a>
     */
    public List<MobileSectionDto> getApiV2CmsMobileSectionSectionList(String baseDateTime) throws ApiException {
        return this.getApiV2CmsMobileSectionSectionList(baseDateTime, null);
    }
    /**
     * Summary : 검색바 키워드 광고 정보를 가져온다.
     * Notes : baseDateTime (YYYYMMDDHHMMSS) 을 검색키로 가져온다.
     * API : display GET /api/v2/cms/searchbar
     * @param baseDateTime baseDateTime (required)
     * @param type type (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d</a>
     */
    public <T> ResponseEntity<T> getApiV2CmsSearchbarForResponseEntity(String baseDateTime, String type, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'baseDateTime' is set
        if (baseDateTime == null) {
            throw new ApiException(400, "Missing the required parameter 'baseDateTime' when calling getApiV2CmsSearchbar");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(400, "Missing the required parameter 'type' when calling getApiV2CmsSearchbar");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/cms/searchbar";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57c3e96c64bd1687d7a2ee9d", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 검색바 키워드 광고 정보를 가져온다.
     * Notes : baseDateTime (YYYYMMDDHHMMSS) 을 검색키로 가져온다.
     * API : display GET /api/v2/cms/searchbar
     * @param baseDateTime baseDateTime (required)
     * @param type type (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<SearchAdDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d</a>
     */
    public <T> T getApiV2CmsSearchbar(String baseDateTime, String type, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2CmsSearchbarForResponseEntity(baseDateTime, type, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 검색바 키워드 광고 정보를 가져온다.
     * Notes : baseDateTime (YYYYMMDDHHMMSS) 을 검색키로 가져온다.
     * API : display GET /api/v2/cms/searchbar
     * @param baseDateTime baseDateTime (required)
     * @param type type (required)
     * @param customHeader customHeaderMap (nullable)
     * @return List<SearchAdDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d</a>
     */
    public List<SearchAdDto> getApiV2CmsSearchbar(String baseDateTime, String type, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<SearchAdDto>> localVarReturnType = new ParameterizedTypeReference<List<SearchAdDto>>() {};
        return this.getApiV2CmsSearchbar(baseDateTime, type, localVarReturnType, customHeader);
    }

    /**
     * Summary : 검색바 키워드 광고 정보를 가져온다.
     * API : display GET /api/v2/cms/searchbar
     * Notes : baseDateTime (YYYYMMDDHHMMSS) 을 검색키로 가져온다.
     * @param baseDateTime baseDateTime(required)
     * @param type type(required)
     * @return List<SearchAdDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d">http://api-forge.coupang.net/details?specId=57c3e96c64bd1687d7a2ee9d</a>
     */
    public List<SearchAdDto> getApiV2CmsSearchbar(String baseDateTime, String type) throws ApiException {
        return this.getApiV2CmsSearchbar(baseDateTime, type, null);
    }
}
