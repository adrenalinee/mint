package com.coupang.apigateway.services.shared;

import com.coupang.apigateway.services.shared.SharedApiV1AddressAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.189+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayShared {

  
  @org.springframework.beans.factory.annotation.Autowired
  private SharedApiV1AddressAdapter sharedApiV1AddressAdapter;
  

  
  public SharedApiV1AddressAdapter sharedApiV1AddressAdapter() {
    return this.sharedApiV1AddressAdapter;
  }
  
}
