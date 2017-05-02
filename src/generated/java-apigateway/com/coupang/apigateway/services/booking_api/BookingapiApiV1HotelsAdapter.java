package com.coupang.apigateway.services.booking_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfHotelVendorMapperDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
@org.springframework.stereotype.Component
public class BookingapiApiV1HotelsAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BookingapiApiV1HotelsAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("booking_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : findHotelVendorsByProductId
     * Notes : 
     * API : booking_api GET /api/v1/hotels/vendors
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5">http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5</a>
     */
    public <T> ResponseEntity<T> getApiV1HotelsVendorsForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1HotelsVendors");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/hotels/vendors";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff32fe6115bcc2df0b1c5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : findHotelVendorsByProductId
     * Notes : 
     * API : booking_api GET /api/v1/hotels/vendors
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelVendorMapperDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5">http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5</a>
     */
    public <T> T getApiV1HotelsVendors(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1HotelsVendorsForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : findHotelVendorsByProductId
     * Notes : 
     * API : booking_api GET /api/v1/hotels/vendors
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelVendorMapperDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5">http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5</a>
     */
    public BookingAdapterResultOfListOfHotelVendorMapperDto getApiV1HotelsVendors(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfHotelVendorMapperDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfHotelVendorMapperDto>() {};
        return this.getApiV1HotelsVendors(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : findHotelVendorsByProductId
     * API : booking_api GET /api/v1/hotels/vendors
     * Notes : 
     * @param productId productId(required)
     * @return BookingAdapterResultOfListOfHotelVendorMapperDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5">http://api-forge.coupang.net/details?specId=57bff32fe6115bcc2df0b1c5</a>
     */
    public BookingAdapterResultOfListOfHotelVendorMapperDto getApiV1HotelsVendors(Long productId) throws ApiException {
        return this.getApiV1HotelsVendors(productId, null);
    }
}
