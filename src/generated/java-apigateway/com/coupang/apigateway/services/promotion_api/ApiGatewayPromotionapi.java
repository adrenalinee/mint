package com.coupang.apigateway.services.promotion_api;

import com.coupang.apigateway.services.promotion_api.PromotionapiApiDownloadpromotionAdapter;
import com.coupang.apigateway.services.promotion_api.PromotionapiApiDownloadcouponAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayPromotionapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private PromotionapiApiDownloadpromotionAdapter promotionapiApiDownloadpromotionAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private PromotionapiApiDownloadcouponAdapter promotionapiApiDownloadcouponAdapter;
  

  
  public PromotionapiApiDownloadpromotionAdapter promotionapiApiDownloadpromotionAdapter() {
    return this.promotionapiApiDownloadpromotionAdapter;
  }
  
  public PromotionapiApiDownloadcouponAdapter promotionapiApiDownloadcouponAdapter() {
    return this.promotionapiApiDownloadcouponAdapter;
  }
  
}
