package com.coupang.apigateway.services.dealrank;

import com.coupang.apigateway.services.dealrank.DealrankV3RanksAdapter;
import com.coupang.apigateway.services.dealrank.DealrankV3SegmentsAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.606+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayDealrank {

  
  @org.springframework.beans.factory.annotation.Autowired
  private DealrankV3RanksAdapter dealrankV3RanksAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private DealrankV3SegmentsAdapter dealrankV3SegmentsAdapter;
  

  
  public DealrankV3RanksAdapter dealrankV3RanksAdapter() {
    return this.dealrankV3RanksAdapter;
  }
  
  public DealrankV3SegmentsAdapter dealrankV3SegmentsAdapter() {
    return this.dealrankV3SegmentsAdapter;
  }
  
}
