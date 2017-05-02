package com.coupang.apigateway.services.brand_shop;

import com.coupang.apigateway.services.brand_shop.BrandshopApiAppAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayBrandshop {

  
  @org.springframework.beans.factory.annotation.Autowired
  private BrandshopApiAppAdapter brandshopApiAppAdapter;
  

  
  public BrandshopApiAppAdapter brandshopApiAppAdapter() {
    return this.brandshopApiAppAdapter;
  }
  
}
