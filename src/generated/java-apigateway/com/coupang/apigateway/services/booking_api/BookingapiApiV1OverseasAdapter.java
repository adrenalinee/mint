package com.coupang.apigateway.services.booking_api;

import com.coupang.apigateway.pylon.ApiException;
import com.coupang.apigateway.pylon.ApiClient;
import com.coupang.apigateway.pylon.Pair;
import com.coupang.apigateway.pylon.DynamicApiClientFactory;

import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelQuantityDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelNoticeDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelReviewDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfCustomerReviewDto;
import com.coupang.apigateway.services.booking_api.model.HotelRoomSearchDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfHotelRoomInfoDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfListOfHotelSaleDto;
import java.util.Date;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelAutoCompleteDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelDto;
import com.coupang.apigateway.services.booking_api.model.BookingAdapterResultOfHotelSaleDto;
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
public class BookingapiApiV1OverseasAdapter {

    private final ApiClient apiClient;

    @Autowired
    public BookingapiApiV1OverseasAdapter(@Qualifier("apiGatewayApiClientFactory") DynamicApiClientFactory apiClientFactory) {
        this.apiClient = apiClientFactory.getOrCreate("booking_api");
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Summary : countryCode, cityId 속하는 호텔 개수를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/cities/{cityId}/hotels/count
     * @param cityId cityId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasCitiesCityIdHotelsCountForResponseEntity(Long cityId, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cityId' is set
        if (cityId == null) {
            throw new ApiException(400, "Missing the required parameter 'cityId' when calling getApiV1OverseasCitiesCityIdHotelsCount");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/cities/{cityId}/hotels/count"
            .replaceAll("\\{" + "cityId" + "\\}", cityId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b2f6", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : countryCode, cityId 속하는 호텔 개수를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/cities/{cityId}/hotels/count
     * @param cityId cityId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelQuantityDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6</a>
     */
    public <T> T getApiV1OverseasCitiesCityIdHotelsCount(Long cityId, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasCitiesCityIdHotelsCountForResponseEntity(cityId, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : countryCode, cityId 속하는 호텔 개수를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/cities/{cityId}/hotels/count
     * @param cityId cityId (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelQuantityDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6</a>
     */
    public BookingAdapterResultOfHotelQuantityDto getApiV1OverseasCitiesCityIdHotelsCount(Long cityId, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelQuantityDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelQuantityDto>() {};
        return this.getApiV1OverseasCitiesCityIdHotelsCount(cityId, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : countryCode, cityId 속하는 호텔 개수를 조회한다.
     * API : booking_api GET /api/v1/overseas/cities/{cityId}/hotels/count
     * Notes : 
     * @param cityId cityId(required)
     * @param baseDateTime baseDateTime(optional)
     * @return BookingAdapterResultOfHotelQuantityDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b2f6</a>
     */
    public BookingAdapterResultOfHotelQuantityDto getApiV1OverseasCitiesCityIdHotelsCount(Long cityId, String baseDateTime) throws ApiException {
        return this.getApiV1OverseasCitiesCityIdHotelsCount(cityId, baseDateTime, null);
    }
    /**
     * Summary : productId와 체크인날짜로 호텔 공지사항을 실시간으로 업체에 요청하여 조회한다.
     * Notes : 
     * API : booking_api POST /api/v1/overseas/hotels/id/{productId}/notice
     * @param productId productId (required)
     * @param checkIn (format: date-time) checkIn (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341</a>
     */
    public <T> ResponseEntity<T> postApiV1OverseasHotelsIdProductIdNoticeForResponseEntity(Long productId, String checkIn, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = checkIn;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling postApiV1OverseasHotelsIdProductIdNotice");
        }
        
        // verify the required parameter 'checkIn' is set
        if (checkIn == null) {
            throw new ApiException(400, "Missing the required parameter 'checkIn' when calling postApiV1OverseasHotelsIdProductIdNotice");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/id/{productId}/notice"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b341", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : productId와 체크인날짜로 호텔 공지사항을 실시간으로 업체에 요청하여 조회한다.
     * Notes : 
     * API : booking_api POST /api/v1/overseas/hotels/id/{productId}/notice
     * @param productId productId (required)
     * @param checkIn (format: date-time) checkIn (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelNoticeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341</a>
     */
    public <T> T postApiV1OverseasHotelsIdProductIdNotice(Long productId, String checkIn, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1OverseasHotelsIdProductIdNoticeForResponseEntity(productId, checkIn, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : productId와 체크인날짜로 호텔 공지사항을 실시간으로 업체에 요청하여 조회한다.
     * Notes : 
     * API : booking_api POST /api/v1/overseas/hotels/id/{productId}/notice
     * @param productId productId (required)
     * @param checkIn (format: date-time) checkIn (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelNoticeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341</a>
     */
    public BookingAdapterResultOfHotelNoticeDto postApiV1OverseasHotelsIdProductIdNotice(Long productId, String checkIn, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelNoticeDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelNoticeDto>() {};
        return this.postApiV1OverseasHotelsIdProductIdNotice(productId, checkIn, localVarReturnType, customHeader);
    }

    /**
     * Summary : productId와 체크인날짜로 호텔 공지사항을 실시간으로 업체에 요청하여 조회한다.
     * API : booking_api POST /api/v1/overseas/hotels/id/{productId}/notice
     * Notes : 
     * @param productId productId(required)
     * @param checkIn (format: date-time) checkIn(required)
     * @return BookingAdapterResultOfHotelNoticeDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b341</a>
     */
    public BookingAdapterResultOfHotelNoticeDto postApiV1OverseasHotelsIdProductIdNotice(Long productId, String checkIn) throws ApiException {
        return this.postApiV1OverseasHotelsIdProductIdNotice(productId, checkIn, null);
    }
    /**
     * Summary : 해외 호텔 고객 리뷰 목록 + 총점 정보를 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsReviewsForResponseEntity(Long productId, String filter, String orderBy, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1OverseasHotelsReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/reviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b355", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록 + 총점 정보를 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355</a>
     */
    public <T> T getApiV1OverseasHotelsReviews(Long productId, String filter, String orderBy, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsReviewsForResponseEntity(productId, filter, orderBy, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록 + 총점 정보를 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355</a>
     */
    public BookingAdapterResultOfHotelReviewDto getApiV1OverseasHotelsReviews(Long productId, String filter, String orderBy, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelReviewDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelReviewDto>() {};
        return this.getApiV1OverseasHotelsReviews(productId, filter, orderBy, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록 + 총점 정보를 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/reviews
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * @param productId productId(required)
     * @param filter filter(optional)
     * @param orderBy orderBy(optional)
     * @return BookingAdapterResultOfHotelReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b355</a>
     */
    public BookingAdapterResultOfHotelReviewDto getApiV1OverseasHotelsReviews(Long productId, String filter, String orderBy) throws ApiException {
        return this.getApiV1OverseasHotelsReviews(productId, filter, orderBy, null);
    }
    /**
     * Summary : 해외 호텔 고객 리뷰 목록만 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews/customerReviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsReviewsCustomerReviewsForResponseEntity(Long productId, String filter, String orderBy, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1OverseasHotelsReviewsCustomerReviews");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/reviews/customerReviews";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b35a", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록만 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews/customerReviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfCustomerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a</a>
     */
    public <T> T getApiV1OverseasHotelsReviewsCustomerReviews(Long productId, String filter, String orderBy, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsReviewsCustomerReviewsForResponseEntity(productId, filter, orderBy, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록만 조회한다.
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * API : booking_api GET /api/v1/overseas/hotels/reviews/customerReviews
     * @param productId productId (required)
     * @param filter filter (optional)
     * @param orderBy orderBy (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfCustomerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a</a>
     */
    public BookingAdapterResultOfListOfCustomerReviewDto getApiV1OverseasHotelsReviewsCustomerReviews(Long productId, String filter, String orderBy, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfCustomerReviewDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfCustomerReviewDto>() {};
        return this.getApiV1OverseasHotelsReviewsCustomerReviews(productId, filter, orderBy, localVarReturnType, customHeader);
    }

    /**
     * Summary : 해외 호텔 고객 리뷰 목록만 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/reviews/customerReviews
     * Notes : 호텔패스의 리뷰 API를 호출함.
     * @param productId productId(required)
     * @param filter filter(optional)
     * @param orderBy orderBy(optional)
     * @return BookingAdapterResultOfListOfCustomerReviewDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35a</a>
     */
    public BookingAdapterResultOfListOfCustomerReviewDto getApiV1OverseasHotelsReviewsCustomerReviews(Long productId, String filter, String orderBy) throws ApiException {
        return this.getApiV1OverseasHotelsReviewsCustomerReviews(productId, filter, orderBy, null);
    }
    /**
     * Summary : 예약일 조건에 맞는 호텔의 상세 정보 및 룸 정보를 조회한다.
     * Notes : hotelId 와 룸 타입, 체크인-체크아웃 으로 예약가능한 룸 정보 및 호텔 상세 정보를 조회한다.
     * API : booking_api POST /api/v1/overseas/hotels/room
     * @param hotelRoomSearchDto hotelRoomSearchDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f</a>
     */
    public <T> ResponseEntity<T> postApiV1OverseasHotelsRoomForResponseEntity(HotelRoomSearchDto hotelRoomSearchDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = hotelRoomSearchDto;
        
        // verify the required parameter 'hotelRoomSearchDto' is set
        if (hotelRoomSearchDto == null) {
            throw new ApiException(400, "Missing the required parameter 'hotelRoomSearchDto' when calling postApiV1OverseasHotelsRoom");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/room";

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

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b35f", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 예약일 조건에 맞는 호텔의 상세 정보 및 룸 정보를 조회한다.
     * Notes : hotelId 와 룸 타입, 체크인-체크아웃 으로 예약가능한 룸 정보 및 호텔 상세 정보를 조회한다.
     * API : booking_api POST /api/v1/overseas/hotels/room
     * @param hotelRoomSearchDto hotelRoomSearchDto (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelRoomInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f</a>
     */
    public <T> T postApiV1OverseasHotelsRoom(HotelRoomSearchDto hotelRoomSearchDto, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.postApiV1OverseasHotelsRoomForResponseEntity(hotelRoomSearchDto, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 예약일 조건에 맞는 호텔의 상세 정보 및 룸 정보를 조회한다.
     * Notes : hotelId 와 룸 타입, 체크인-체크아웃 으로 예약가능한 룸 정보 및 호텔 상세 정보를 조회한다.
     * API : booking_api POST /api/v1/overseas/hotels/room
     * @param hotelRoomSearchDto hotelRoomSearchDto (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelRoomInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f</a>
     */
    public BookingAdapterResultOfListOfHotelRoomInfoDto postApiV1OverseasHotelsRoom(HotelRoomSearchDto hotelRoomSearchDto, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfHotelRoomInfoDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfHotelRoomInfoDto>() {};
        return this.postApiV1OverseasHotelsRoom(hotelRoomSearchDto, localVarReturnType, customHeader);
    }

    /**
     * Summary : 예약일 조건에 맞는 호텔의 상세 정보 및 룸 정보를 조회한다.
     * API : booking_api POST /api/v1/overseas/hotels/room
     * Notes : hotelId 와 룸 타입, 체크인-체크아웃 으로 예약가능한 룸 정보 및 호텔 상세 정보를 조회한다.
     * @param hotelRoomSearchDto hotelRoomSearchDto(required)
     * @return BookingAdapterResultOfListOfHotelRoomInfoDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b35f</a>
     */
    public BookingAdapterResultOfListOfHotelRoomInfoDto postApiV1OverseasHotelsRoom(HotelRoomSearchDto hotelRoomSearchDto) throws ApiException {
        return this.postApiV1OverseasHotelsRoom(hotelRoomSearchDto, null);
    }
    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/sales
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
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsSalesForResponseEntity(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productIds' is set
        if (productIds == null) {
            throw new ApiException(400, "Missing the required parameter 'productIds' when calling getApiV1OverseasHotelsSales");
        }
        
        // verify the required parameter 'checkInDate' is set
        if (checkInDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkInDate' when calling getApiV1OverseasHotelsSales");
        }
        
        // verify the required parameter 'checkOutDate' is set
        if (checkOutDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkOutDate' when calling getApiV1OverseasHotelsSales");
        }
        
        // verify the required parameter 'adultCount' is set
        if (adultCount == null) {
            throw new ApiException(400, "Missing the required parameter 'adultCount' when calling getApiV1OverseasHotelsSales");
        }
        
        // verify the required parameter 'childrenCount' is set
        if (childrenCount == null) {
            throw new ApiException(400, "Missing the required parameter 'childrenCount' when calling getApiV1OverseasHotelsSales");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/sales";

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

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b369", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/sales
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
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369</a>
     */
    public <T> T getApiV1OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsSalesForResponseEntity(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/sales
     * @param productIds productIds (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfListOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369</a>
     */
    public BookingAdapterResultOfListOfHotelSaleDto getApiV1OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfListOfHotelSaleDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfListOfHotelSaleDto>() {};
        return this.getApiV1OverseasHotelsSales(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 호텔코드들과 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/sales
     * Notes : 이 메서드는 DB 정보 조회 후 가격이 없는 경우 외부 업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * @param productIds productIds(required)
     * @param checkInDate (format: date-time) checkInDate(required)
     * @param checkOutDate (format: date-time) checkOutDate(required)
     * @param adultCount adultCount(required)
     * @param childrenCount childrenCount(required)
     * @param baseDateTime baseDateTime(optional)
     * @return BookingAdapterResultOfListOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b369</a>
     */
    public BookingAdapterResultOfListOfHotelSaleDto getApiV1OverseasHotelsSales(List<Long> productIds, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime) throws ApiException {
        return this.getApiV1OverseasHotelsSales(productIds, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, null);
    }
    /**
     * Summary : 2글자 이상의 도시/호텔 한글, 영문명으로 키워드 자동 완성 정보를 조회한다.
     * Notes : 한글은 초성 검색을 지원하며 도시, 호텔 정보로 나누어 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/search/autocomplete
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsSearchAutocompleteForResponseEntity(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'keyword' is set
        if (keyword == null) {
            throw new ApiException(400, "Missing the required parameter 'keyword' when calling getApiV1OverseasHotelsSearchAutocomplete");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/search/autocomplete";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b36e", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 2글자 이상의 도시/호텔 한글, 영문명으로 키워드 자동 완성 정보를 조회한다.
     * Notes : 한글은 초성 검색을 지원하며 도시, 호텔 정보로 나누어 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/search/autocomplete
     * @param keyword keyword (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelAutoCompleteDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e</a>
     */
    public <T> T getApiV1OverseasHotelsSearchAutocomplete(String keyword, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsSearchAutocompleteForResponseEntity(keyword, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 2글자 이상의 도시/호텔 한글, 영문명으로 키워드 자동 완성 정보를 조회한다.
     * Notes : 한글은 초성 검색을 지원하며 도시, 호텔 정보로 나누어 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/search/autocomplete
     * @param keyword keyword (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelAutoCompleteDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e</a>
     */
    public BookingAdapterResultOfHotelAutoCompleteDto getApiV1OverseasHotelsSearchAutocomplete(String keyword, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelAutoCompleteDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelAutoCompleteDto>() {};
        return this.getApiV1OverseasHotelsSearchAutocomplete(keyword, localVarReturnType, customHeader);
    }

    /**
     * Summary : 2글자 이상의 도시/호텔 한글, 영문명으로 키워드 자동 완성 정보를 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/search/autocomplete
     * Notes : 한글은 초성 검색을 지원하며 도시, 호텔 정보로 나누어 조회한다.
     * @param keyword keyword(required)
     * @return BookingAdapterResultOfHotelAutoCompleteDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b36e</a>
     */
    public BookingAdapterResultOfHotelAutoCompleteDto getApiV1OverseasHotelsSearchAutocomplete(String keyword) throws ApiException {
        return this.getApiV1OverseasHotelsSearchAutocomplete(keyword, null);
    }
    /**
     * Summary : product id로 호텔 상세 정보를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/detail
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsProductIdDetailForResponseEntity(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1OverseasHotelsProductIdDetail");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/{productId}/detail"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

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

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b39b", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : product id로 호텔 상세 정보를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/detail
     * @param productId productId (required)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b</a>
     */
    public <T> T getApiV1OverseasHotelsProductIdDetail(Long productId, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsProductIdDetailForResponseEntity(productId, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : product id로 호텔 상세 정보를 조회한다.
     * Notes : 
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/detail
     * @param productId productId (required)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b</a>
     */
    public BookingAdapterResultOfHotelDto getApiV1OverseasHotelsProductIdDetail(Long productId, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelDto>() {};
        return this.getApiV1OverseasHotelsProductIdDetail(productId, localVarReturnType, customHeader);
    }

    /**
     * Summary : product id로 호텔 상세 정보를 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/detail
     * Notes : 
     * @param productId productId(required)
     * @return BookingAdapterResultOfHotelDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b39b</a>
     */
    public BookingAdapterResultOfHotelDto getApiV1OverseasHotelsProductIdDetail(Long productId) throws ApiException {
        return this.getApiV1OverseasHotelsProductIdDetail(productId, null);
    }
    /**
     * Summary : 1개의 호텔코드와 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 외부업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/sales
     * @param productId productId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasHotelsProductIdSalesForResponseEntity(Long productId, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new ApiException(400, "Missing the required parameter 'productId' when calling getApiV1OverseasHotelsProductIdSales");
        }
        
        // verify the required parameter 'checkInDate' is set
        if (checkInDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkInDate' when calling getApiV1OverseasHotelsProductIdSales");
        }
        
        // verify the required parameter 'checkOutDate' is set
        if (checkOutDate == null) {
            throw new ApiException(400, "Missing the required parameter 'checkOutDate' when calling getApiV1OverseasHotelsProductIdSales");
        }
        
        // verify the required parameter 'adultCount' is set
        if (adultCount == null) {
            throw new ApiException(400, "Missing the required parameter 'adultCount' when calling getApiV1OverseasHotelsProductIdSales");
        }
        
        // verify the required parameter 'childrenCount' is set
        if (childrenCount == null) {
            throw new ApiException(400, "Missing the required parameter 'childrenCount' when calling getApiV1OverseasHotelsProductIdSales");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/hotels/{productId}/sales"
            .replaceAll("\\{" + "productId" + "\\}", productId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkInDate", checkInDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkOutDate", checkOutDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adultCount", adultCount));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "childrenCount", childrenCount));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff331e6115bcc2df0b3a0", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : 1개의 호텔코드와 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 외부업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/sales
     * @param productId productId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0</a>
     */
    public <T> T getApiV1OverseasHotelsProductIdSales(Long productId, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasHotelsProductIdSalesForResponseEntity(productId, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : 1개의 호텔코드와 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * Notes : 이 메서드는 외부업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/sales
     * @param productId productId (required)
     * @param checkInDate (format: date-time) checkInDate (required)
     * @param checkOutDate (format: date-time) checkOutDate (required)
     * @param adultCount adultCount (required)
     * @param childrenCount childrenCount (required)
     * @param baseDateTime baseDateTime (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0</a>
     */
    public BookingAdapterResultOfHotelSaleDto getApiV1OverseasHotelsProductIdSales(Long productId, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelSaleDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelSaleDto>() {};
        return this.getApiV1OverseasHotelsProductIdSales(productId, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, localVarReturnType, customHeader);
    }

    /**
     * Summary : 1개의 호텔코드와 체크인 날짜, 체크아웃 날짜, 방정보로 호텔예약여부 및 가격, 무료취소가능 여부를 조회한다.
     * API : booking_api GET /api/v1/overseas/hotels/{productId}/sales
     * Notes : 이 메서드는 외부업체측을 조회하여 데이터를 가져오므로 속도가 느릴수 있다.
     * @param productId productId(required)
     * @param checkInDate (format: date-time) checkInDate(required)
     * @param checkOutDate (format: date-time) checkOutDate(required)
     * @param adultCount adultCount(required)
     * @param childrenCount childrenCount(required)
     * @param baseDateTime baseDateTime(optional)
     * @return BookingAdapterResultOfHotelSaleDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0">http://api-forge.coupang.net/details?specId=57bff331e6115bcc2df0b3a0</a>
     */
    public BookingAdapterResultOfHotelSaleDto getApiV1OverseasHotelsProductIdSales(Long productId, String checkInDate, String checkOutDate, String adultCount, String childrenCount, String baseDateTime) throws ApiException {
        return this.getApiV1OverseasHotelsProductIdSales(productId, checkInDate, checkOutDate, adultCount, childrenCount, baseDateTime, null);
    }
    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v1/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return ResponseEntity<T> type of responseTypeRef
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5">http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5</a>
     */
    public <T> ResponseEntity<T> getApiV1OverseasRegionsRegionIdHotelsForResponseEntity(Long regionId, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new ApiException(400, "Missing the required parameter 'regionId' when calling getApiV1OverseasRegionsRegionIdHotels");
        }
        
        // create path and map variables
        String localVarPath = "/api/v1/overseas/regions/{regionId}/hotels"
            .replaceAll("\\{" + "regionId" + "\\}", regionId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (customHeader != null) {
            localVarHeaderParams.putAll(customHeader);
        }
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortType", sortType));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseDateTime", baseDateTime));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNum", pageNum));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        
        final String[] localVarAccepts = {  };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        return apiClient.invokeAPIForResponseEntity("57bff332e6115bcc2df0b3a5", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, responseTypeRef);
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v1/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param responseTypeRef ParameterizedTypeReference<ResponseTypeClass>
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5">http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5</a>
     */
    public <T> T getApiV1OverseasRegionsRegionIdHotels(Long regionId, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, ParameterizedTypeReference<T> responseTypeRef, Map<String, String> customHeader) throws ApiException {
        ResponseEntity<T> localVarResponseEntity = this.getApiV1OverseasRegionsRegionIdHotelsForResponseEntity(regionId, sortType, filter, baseDateTime, pageNum, pageSize, responseTypeRef, customHeader);
        return localVarResponseEntity.getBody();
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * API : booking_api GET /api/v1/overseas/regions/{regionId}/hotels
     * @param regionId regionId (required)
     * @param sortType sortType (optional)
     * @param filter filter (optional)
     * @param baseDateTime baseDateTime (optional)
     * @param pageNum pageNum (optional)
     * @param pageSize pageSize (optional)
     * @param customHeader customHeaderMap (nullable)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5">http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5</a>
     */
    public BookingAdapterResultOfHotelListPageDto getApiV1OverseasRegionsRegionIdHotels(Long regionId, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize, Map<String, String> customHeader) throws ApiException {
        ParameterizedTypeReference<BookingAdapterResultOfHotelListPageDto> localVarReturnType = new ParameterizedTypeReference<BookingAdapterResultOfHotelListPageDto>() {};
        return this.getApiV1OverseasRegionsRegionIdHotels(regionId, sortType, filter, baseDateTime, pageNum, pageSize, localVarReturnType, customHeader);
    }

    /**
     * Summary : regionId에 속한 호텔정보를 조회한다. 정렬 기준 및 필터를 조건으로 걸 수 있다.
     * API : booking_api GET /api/v1/overseas/regions/{regionId}/hotels
     * Notes : 이 메서드는 Booking DB만 조회하며, 외부연동은 하지 않는다.&lt;/br&gt;Filter와 Sort의 프로토콜은 Key:Data 이며 배열일 경우 ,로 구분한다.&lt;/br&gt;Data의 값이 여러개일 경우 |로 구분한다.
     * @param regionId regionId(required)
     * @param sortType sortType(optional)
     * @param filter filter(optional)
     * @param baseDateTime baseDateTime(optional)
     * @param pageNum pageNum(optional)
     * @param pageSize pageSize(optional)
     * @return BookingAdapterResultOfHotelListPageDto
     * @throws ApiException if fails to make API call
     * @see <a href="http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5">http://api-forge.coupang.net/details?specId=57bff332e6115bcc2df0b3a5</a>
     */
    public BookingAdapterResultOfHotelListPageDto getApiV1OverseasRegionsRegionIdHotels(Long regionId, String sortType, String filter, String baseDateTime, Integer pageNum, Integer pageSize) throws ApiException {
        return this.getApiV1OverseasRegionsRegionIdHotels(regionId, sortType, filter, baseDateTime, pageNum, pageSize, null);
    }
}
