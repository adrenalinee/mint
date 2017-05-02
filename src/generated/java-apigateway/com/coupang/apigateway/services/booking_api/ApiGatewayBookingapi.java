package com.coupang.apigateway.services.booking_api;

import com.coupang.apigateway.services.booking_api.BookingapiApiV1OverseasAdapter;
import com.coupang.apigateway.services.booking_api.BookingapiApiV2OverseasAdapter;
import com.coupang.apigateway.services.booking_api.BookingapiApiV1HotelsAdapter;
import com.coupang.apigateway.services.booking_api.BookingapiApiV1OrderAdapter;
import com.coupang.apigateway.services.booking_api.BookingapiApiV3OverseasAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayBookingapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private BookingapiApiV1OverseasAdapter bookingapiApiV1OverseasAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BookingapiApiV2OverseasAdapter bookingapiApiV2OverseasAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BookingapiApiV1HotelsAdapter bookingapiApiV1HotelsAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BookingapiApiV1OrderAdapter bookingapiApiV1OrderAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BookingapiApiV3OverseasAdapter bookingapiApiV3OverseasAdapter;
  

  
  public BookingapiApiV1OverseasAdapter bookingapiApiV1OverseasAdapter() {
    return this.bookingapiApiV1OverseasAdapter;
  }
  
  public BookingapiApiV2OverseasAdapter bookingapiApiV2OverseasAdapter() {
    return this.bookingapiApiV2OverseasAdapter;
  }
  
  public BookingapiApiV1HotelsAdapter bookingapiApiV1HotelsAdapter() {
    return this.bookingapiApiV1HotelsAdapter;
  }
  
  public BookingapiApiV1OrderAdapter bookingapiApiV1OrderAdapter() {
    return this.bookingapiApiV1OrderAdapter;
  }
  
  public BookingapiApiV3OverseasAdapter bookingapiApiV3OverseasAdapter() {
    return this.bookingapiApiV3OverseasAdapter;
  }
  
}
