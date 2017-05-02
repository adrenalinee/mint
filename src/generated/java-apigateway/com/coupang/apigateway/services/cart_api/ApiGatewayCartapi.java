package com.coupang.apigateway.services.cart_api;

import com.coupang.apigateway.services.cart_api.CartapiApiV1MembercartAdapter;
import com.coupang.apigateway.services.cart_api.CartapiApiV2MembercartAdapter;
import com.coupang.apigateway.services.cart_api.CartapiApiV2WishAdapter;
import com.coupang.apigateway.services.cart_api.CartapiApiV1AnonymouscartAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayCartapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private CartapiApiV1MembercartAdapter cartapiApiV1MembercartAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private CartapiApiV2MembercartAdapter cartapiApiV2MembercartAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private CartapiApiV2WishAdapter cartapiApiV2WishAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private CartapiApiV1AnonymouscartAdapter cartapiApiV1AnonymouscartAdapter;
  

  
  public CartapiApiV1MembercartAdapter cartapiApiV1MembercartAdapter() {
    return this.cartapiApiV1MembercartAdapter;
  }
  
  public CartapiApiV2MembercartAdapter cartapiApiV2MembercartAdapter() {
    return this.cartapiApiV2MembercartAdapter;
  }
  
  public CartapiApiV2WishAdapter cartapiApiV2WishAdapter() {
    return this.cartapiApiV2WishAdapter;
  }
  
  public CartapiApiV1AnonymouscartAdapter cartapiApiV1AnonymouscartAdapter() {
    return this.cartapiApiV1AnonymouscartAdapter;
  }
  
}
