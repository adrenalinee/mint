package com.coupang.apigateway.services.fds_api;

import com.coupang.apigateway.services.fds_api.FdsapiApiFdsAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayFdsapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private FdsapiApiFdsAdapter fdsapiApiFdsAdapter;
  

  
  public FdsapiApiFdsAdapter fdsapiApiFdsAdapter() {
    return this.fdsapiApiFdsAdapter;
  }
  
}
