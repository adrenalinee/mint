package com.coupang.apigateway.services.shipment;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.shipment.model.DeliveryDestinationDto;

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
public class ShipmentApiV1DeliveriesAdapter {

    private final ApiClient apiClient;

    @Autowired
    public ShipmentApiV1DeliveriesAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("shipment");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findRecentDeliveryDestination
     * Notes : 
     * API : shipment GET /api/v1/deliveries/members/{memberId}/recent
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921">http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921</a>
     */
    public <T> ResponseEntity<T> getApiV1DeliveriesMembersMemberIdRecentForResponseEntity(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new ApiException(400, "Missing the required parameter 'memberId' when calling getApiV1DeliveriesMembersMemberIdRecent");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/deliveries/members/{memberId}/recent"
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

        return apiClient.invokeAPIForResponseEntity("57ba6c03b4530090ed09f921", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findRecentDeliveryDestination
     * Notes : 
     * API : shipment GET /api/v1/deliveries/members/{memberId}/recent
     * @param memberId memberId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDestinationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921">http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921</a>
     */
    public <T> T getApiV1DeliveriesMembersMemberIdRecent(String memberId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1DeliveriesMembersMemberIdRecentForResponseEntity(memberId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findRecentDeliveryDestination
     * Notes : 
     * API : shipment GET /api/v1/deliveries/members/{memberId}/recent
     * @param memberId memberId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return DeliveryDestinationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921">http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921</a>
     */
    public DeliveryDestinationDto getApiV1DeliveriesMembersMemberIdRecent(String memberId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<DeliveryDestinationDto> localVarReturnType = new ParameterizedTypeReference<DeliveryDestinationDto>() {};
        return this.getApiV1DeliveriesMembersMemberIdRecent(memberId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findRecentDeliveryDestination
     * API : shipment GET /api/v1/deliveries/members/{memberId}/recent
     * Notes : 
     * @param memberId memberId(required)
     * @return DeliveryDestinationDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921">http://api-forge.coupang.net/details?specId=57ba6c03b4530090ed09f921</a>
     */
    public DeliveryDestinationDto getApiV1DeliveriesMembersMemberIdRecent(String memberId) throws ApiException {
        return this.getApiV1DeliveriesMembersMemberIdRecent(memberId, null);
    }
}
