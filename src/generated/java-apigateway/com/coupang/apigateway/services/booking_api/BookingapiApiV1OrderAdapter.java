package com.coupang.apigateway.services.booking_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.booking_api.model.BookingCancelableForTdpRequestDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto;

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
public class BookingapiApiV1OrderAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BookingapiApiV1OrderAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("booking_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : TDP 에서 방 취소 가능여부를 실시간으로 벤더에 확인한다
     * Notes : 
     * API : booking_api POST /api/v1/order/rooms/cancelpolicy/realtime
     * @param requestDto requestDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297">http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297</a>
     */
    public <T> ResponseEntity<T> postApiV1OrderRoomsCancelpolicyRealtimeForResponseEntity(BookingCancelableForTdpRequestDto requestDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = requestDto;
        
        // verify the required parameter 'requestDto' is set
        if (requestDto == null) {
            throw new ApiException(400, "Missing the required parameter 'requestDto' when calling postApiV1OrderRoomsCancelpolicyRealtime");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/order/rooms/cancelpolicy/realtime";

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

        return apiClient.invokeAPIForResponseEntity("57bff330e6115bcc2df0b297", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : TDP 에서 방 취소 가능여부를 실시간으로 벤더에 확인한다
     * Notes : 
     * API : booking_api POST /api/v1/order/rooms/cancelpolicy/realtime
     * @param requestDto requestDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297">http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297</a>
     */
    public <T> T postApiV1OrderRoomsCancelpolicyRealtime(BookingCancelableForTdpRequestDto requestDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1OrderRoomsCancelpolicyRealtimeForResponseEntity(requestDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : TDP 에서 방 취소 가능여부를 실시간으로 벤더에 확인한다
     * Notes : 
     * API : booking_api POST /api/v1/order/rooms/cancelpolicy/realtime
     * @param requestDto requestDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297">http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297</a>
     */
    public BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto postApiV1OrderRoomsCancelpolicyRealtime(BookingCancelableForTdpRequestDto requestDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto>() {};
        return this.postApiV1OrderRoomsCancelpolicyRealtime(requestDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : TDP 에서 방 취소 가능여부를 실시간으로 벤더에 확인한다
     * API : booking_api POST /api/v1/order/rooms/cancelpolicy/realtime
     * Notes : 
     * @param requestDto requestDto(required)
     * @return BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297">http://api-forge.coupang.net/details?specId=57bff330e6115bcc2df0b297</a>
     */
    public BookingAdapterResultOfListOfBookingCancelableForTdpResponseDto postApiV1OrderRoomsCancelpolicyRealtime(BookingCancelableForTdpRequestDto requestDto) throws ApiException {
        return this.postApiV1OrderRoomsCancelpolicyRealtime(requestDto, null);
    }
}
