package com.coupang.apigateway.services.shipment;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.shipment.model.DeliveryCompanyDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.890+09:00")
@org.springframework.stereotype.Component
public class ShipmentApiV1DeliverycompaniesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ShipmentApiV1DeliverycompaniesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("shipment");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 택배사 리스트 반환
     * Notes : 택배사 코드, 외부코드(굿스플로 코드) 등의 정보를 가진 택배사 리스트를 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/all
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3</a>
     */
    public <T> ResponseEntity<T> getApiV1DeliverycompaniesAllForResponseEntity(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/deliverycompanies/all";

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

        return apiClient.invokeAPIForResponseEntity("58c0da4c9e9ab92fcce9f6c3", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 택배사 리스트 반환
     * Notes : 택배사 코드, 외부코드(굿스플로 코드) 등의 정보를 가진 택배사 리스트를 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/all
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return List<DeliveryCompanyDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3</a>
     */
    public <T> T getApiV1DeliverycompaniesAll(ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DeliverycompaniesAllForResponseEntity(responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 택배사 리스트 반환
     * Notes : 택배사 코드, 외부코드(굿스플로 코드) 등의 정보를 가진 택배사 리스트를 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/all
     * @param customHeader customHeaderMap (nullable)
     * @return List<DeliveryCompanyDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3</a>
     */
    public List<DeliveryCompanyDto> getApiV1DeliverycompaniesAll(Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<List<DeliveryCompanyDto>> localVarReturnType = new ParameterizedTypeReference<List<DeliveryCompanyDto>>() {};
        return this.getApiV1DeliverycompaniesAll(localVarReturnType, customHeader);
    }

    /**
     * Summary : 택배사 리스트 반환
     * API : shipment GET /api/v1/deliverycompanies/all
     * Notes : 택배사 코드, 외부코드(굿스플로 코드) 등의 정보를 가진 택배사 리스트를 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * @return List<DeliveryCompanyDto>
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6c3</a>
     */
    public List<DeliveryCompanyDto> getApiV1DeliverycompaniesAll() throws ApiException {
        return this.getApiV1DeliverycompaniesAll(null);
    }
    /**
     * Summary : 내부 택배사 코드에 해당하는 택배사 반환
     * Notes : 쿠팡에서 관리하는 택배사 코드와 일치하는 택배사 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/{internalCode}
     * @param internalCode 쿠팡에서 관리하는 택배사 코드 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd</a>
     */
    public <T> ResponseEntity<T> getApiV1DeliverycompaniesInternalCodeForResponseEntity(String internalCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'internalCode' is set
        if (internalCode == null) {
            throw new ApiException(400, "Missing the required parameter 'internalCode' when calling getApiV1DeliverycompaniesInternalCode");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/deliverycompanies/{internalCode}"
            .replaceAll("\\{" + "internalCode" + "\\}", internalCode.toString());

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

        return apiClient.invokeAPIForResponseEntity("58c0da4c9e9ab92fcce9f6cd", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 내부 택배사 코드에 해당하는 택배사 반환
     * Notes : 쿠팡에서 관리하는 택배사 코드와 일치하는 택배사 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/{internalCode}
     * @param internalCode 쿠팡에서 관리하는 택배사 코드 (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryCompanyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd</a>
     */
    public <T> T getApiV1DeliverycompaniesInternalCode(String internalCode, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DeliverycompaniesInternalCodeForResponseEntity(internalCode, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 내부 택배사 코드에 해당하는 택배사 반환
     * Notes : 쿠팡에서 관리하는 택배사 코드와 일치하는 택배사 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * API : shipment GET /api/v1/deliverycompanies/{internalCode}
     * @param internalCode 쿠팡에서 관리하는 택배사 코드 (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryCompanyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd</a>
     */
    public DeliveryCompanyDto getApiV1DeliverycompaniesInternalCode(String internalCode, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DeliveryCompanyDto> localVarReturnType = new ParameterizedTypeReference<DeliveryCompanyDto>() {};
        return this.getApiV1DeliverycompaniesInternalCode(internalCode, localVarReturnType, customHeader);
    }

    /**
     * Summary : 내부 택배사 코드에 해당하는 택배사 반환
     * API : shipment GET /api/v1/deliverycompanies/{internalCode}
     * Notes : 쿠팡에서 관리하는 택배사 코드와 일치하는 택배사 반환. ( WIKI: https://wiki.coupang.net/pages/viewpage.action?pageId=81134494 )
     * @param internalCode 쿠팡에서 관리하는 택배사 코드(required)
     * @return DeliveryCompanyDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd">http://api-forge.coupang.net/details?specId=58c0da4c9e9ab92fcce9f6cd</a>
     */
    public DeliveryCompanyDto getApiV1DeliverycompaniesInternalCode(String internalCode) throws ApiException {
        return this.getApiV1DeliverycompaniesInternalCode(internalCode, null);
    }
}
