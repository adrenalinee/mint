package com.coupang.apigateway.services.mapi;

import com.coupang.apigateway.services.mapi.MapiV3DeviceAdapter;
import com.coupang.apigateway.services.mapi.MapiApiBannerAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayMapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private MapiV3DeviceAdapter mapiV3DeviceAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MapiApiBannerAdapter mapiApiBannerAdapter;
  

  
  public MapiV3DeviceAdapter mapiV3DeviceAdapter() {
    return this.mapiV3DeviceAdapter;
  }
  
  public MapiApiBannerAdapter mapiApiBannerAdapter() {
    return this.mapiApiBannerAdapter;
  }
  
}
