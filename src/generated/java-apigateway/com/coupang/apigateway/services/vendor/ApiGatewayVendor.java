package com.coupang.apigateway.services.vendor;

import com.coupang.apigateway.services.vendor.VendorApiV2VendorsAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.860+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayVendor {

  
  @org.springframework.beans.factory.annotation.Autowired
  private VendorApiV2VendorsAdapter vendorApiV2VendorsAdapter;
  

  
  public VendorApiV2VendorsAdapter vendorApiV2VendorsAdapter() {
    return this.vendorApiV2VendorsAdapter;
  }
  
}
