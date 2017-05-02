package com.coupang.apigateway.services.subscribe_order;

import com.coupang.apigateway.services.subscribe_order.SubscribeorderApiBannerAdapter;
import com.coupang.apigateway.services.subscribe_order.SubscribeorderApiBrandAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.238+09:00")
@org.springframework.stereotype.Component
public class ApiGatewaySubscribeorder {

  
  @org.springframework.beans.factory.annotation.Autowired
  private SubscribeorderApiBannerAdapter subscribeorderApiBannerAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private SubscribeorderApiBrandAdapter subscribeorderApiBrandAdapter;
  

  
  public SubscribeorderApiBannerAdapter subscribeorderApiBannerAdapter() {
    return this.subscribeorderApiBannerAdapter;
  }
  
  public SubscribeorderApiBrandAdapter subscribeorderApiBrandAdapter() {
    return this.subscribeorderApiBrandAdapter;
  }
  
}
