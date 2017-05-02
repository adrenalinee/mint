package com.coupang.apigateway.services.buybox;

import com.coupang.apigateway.services.buybox.BuyboxApiV2WinnersAdapter;
import com.coupang.apigateway.services.buybox.BuyboxApiV2PromotionAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.784+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayBuybox {

  
  @org.springframework.beans.factory.annotation.Autowired
  private BuyboxApiV2WinnersAdapter buyboxApiV2WinnersAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BuyboxApiV2PromotionAdapter buyboxApiV2PromotionAdapter;
  

  
  public BuyboxApiV2WinnersAdapter buyboxApiV2WinnersAdapter() {
    return this.buyboxApiV2WinnersAdapter;
  }
  
  public BuyboxApiV2PromotionAdapter buyboxApiV2PromotionAdapter() {
    return this.buyboxApiV2PromotionAdapter;
  }
  
}
