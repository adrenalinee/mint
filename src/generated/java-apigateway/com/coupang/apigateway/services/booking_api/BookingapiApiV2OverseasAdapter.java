package com.coupang.apigateway.services.booking_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfHotelSaleDto;
import java.util.Date;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelListPageDto;

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
public class BookingapiApiV2OverseasAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BookingapiApiV2OverseasAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("booking_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v2/overseas/hotels/sales
     * @param productIds productIds (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477</a>
     */
    public <T> ResponseEntity<T> getApiV2OverseasHotelsSalesForResponseEntity(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productIds' is set
        if (productIds == null) {
            throw new ApiException(400, "Missing the required parameter 'productIds' when calling getApiV2OverseasHotelsSales");
        }
        
        // verify the required parameter 'checkInDate' is set
        if (checkInDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkInDate' when calling getApiV2OverseasHotelsSales");
        }
        
        // verify the required parameter 'checkOutDate' is set
        if (checkOutDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkOutDate' when calling getApiV2OverseasHotelsSales");
        }
        
        // verify the required parameter 'adultCount' is set
        if (adultCount == null) {
            throw new ApiException(400, "Missing the required parameter 'adultCount' when calling getApiV2OverseasHotelsSales");
        }
        
        // verify the required parameter 'childrenCount' is set
        if (childrenCount == null) {
            throw new ApiException(400, "Missing the required parameter 'childrenCount' when calling getApiV2OverseasHotelsSales");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/overseas/hotels/sales";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "productIds", productIds));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkInDate", checkInDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkOutDate", checkOutDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adultCount", adultCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "childrenCount", childrenCount));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff333e6115bcc2df0b477", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v2/overseas/hotels/sales
     * @param productIds productIds (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477</a>
     */
    public <T> T getApiV2OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2OverseasHotelsSalesForResponseEntity(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v2/overseas/hotels/sales
     * @param productIds productIds (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477</a>
     */
    public BookingAdapterResultOfListOfHotelSaleDto getApiV2OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfHotelSaleDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfHotelSaleDto>() {};
        return this.getApiV2OverseasHotelsSales(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * API : booking_api GET /api/v2/overseas/hotels/sales
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * @param productIds productIds(required)
     * @param checkInDate (format: date-time) checkInDate(required)
     * @param checkOutDate (format: date-time) checkOutDate(required)
     * @param adultCount adultCount(required)
     * @param childrenCount childrenCount(required)
     * @param baseDateTime baseDateTime(optional)
     * @return BookingAdapterResultOfListOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b477</a>
     */
    public BookingAdapterResultOfListOfHotelSaleDto getApiV2OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime) throws ApiException {
        return this.getApiV2OverseasHotelsSales(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, null);
    }
    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v2/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c</a>
     */
    public <T> ResponseEntity<T> getApiV2OverseasRegionsRegionIdHotelsForResponseEntity(Long regionId, String checkInDate, String checkOutDate, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException(400, "Missing the required parameter 'regionId' when calling getApiV2OverseasRegionsRegionIdHotels");
        }
        
        // verify the required parameter 'checkInDate' is set
        if (checkInDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkInDate' when calling getApiV2OverseasRegionsRegionIdHotels");
        }
        
        // verify the required parameter 'checkOutDate' is set
        if (checkOutDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkOutDate' when calling getApiV2OverseasRegionsRegionIdHotels");
        }
        
        // create path and map variables
        String localVarPath = "/api/v2/overseas/regions/{regionId}/hotels"
            .replaceAll("\\{" + "regionId" + "\\}", regionId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkInDate", checkInDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkOutDate", checkOutDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortType", sortType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNum", pageNum));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff333e6115bcc2df0b47c", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v2/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c</a>
     */
    public <T> T getApiV2OverseasRegionsRegionIdHotels(Long regionId, String checkInDate, String checkOutDate, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV2OverseasRegionsRegionIdHotelsForResponseEntity(regionId, checkInDate, checkOutDate, sortType, filter, baseDateTime, pageNum, pageSize, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v2/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c</a>
     */
    public BookingAdapterResultOfHotelListPageDto getApiV2OverseasRegionsRegionIdHotels(Long regionId, String checkInDate, String checkOutDate, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelListPageDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelListPageDto>() {};
        return this.getApiV2OverseasRegionsRegionIdHotels(regionId, checkInDate, checkOutDate, sortType, filter, baseDateTime, pageNum, pageSize, localVarReturnType, customHeader);
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * API : booking_api GET /api/v2/overseas/regions/{regionId}/hotels
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * @param regionId regionId(required)
     * @param checkInDate (format: date-time) checkInDate(required)
     * @param checkOutDate (format: date-time) checkOutDate(required)
     * @param sortType sortType(optional)
     * @param filter filter(optional)
     * @param baseDateTime baseDateTime(optional)
     * @param pageNum pageNum(optional)
     * @param pageSize pageSize(optional)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c">http://api-forge.coupang.net/details?specId=57bff333e6115bcc2df0b47c</a>
     */
    public BookingAdapterResultOfHotelListPageDto getApiV2OverseasRegionsRegionIdHotels(Long regionId, String checkInDate, String checkOutDate, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize) throws ApiException {
        return this.getApiV2OverseasRegionsRegionIdHotels(regionId, checkInDate, checkOutDate, sortType, filter, baseDateTime, pageNum, pageSize, null);
    }
}
