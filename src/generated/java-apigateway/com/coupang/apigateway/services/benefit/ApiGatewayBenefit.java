package com.coupang.apigateway.services.benefit;

import com.coupang.apigateway.services.benefit.BenefitApiV2BenefitsummaryAdapter;
import com.coupang.apigateway.services.benefit.BenefitApiDiscountcouponAdapter;
import com.coupang.apigateway.services.benefit.BenefitApiV2CalculatedbenefitsummaryAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayBenefit {

  
  @org.springframework.beans.factory.annotation.Autowired
  private BenefitApiV2BenefitsummaryAdapter benefitApiV2BenefitsummaryAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BenefitApiDiscountcouponAdapter benefitApiDiscountcouponAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private BenefitApiV2CalculatedbenefitsummaryAdapter benefitApiV2CalculatedbenefitsummaryAdapter;
  

  
  public BenefitApiV2BenefitsummaryAdapter benefitApiV2BenefitsummaryAdapter() {
    return this.benefitApiV2BenefitsummaryAdapter;
  }
  
  public BenefitApiDiscountcouponAdapter benefitApiDiscountcouponAdapter() {
    return this.benefitApiDiscountcouponAdapter;
  }
  
  public BenefitApiV2CalculatedbenefitsummaryAdapter benefitApiV2CalculatedbenefitsummaryAdapter() {
    return this.benefitApiV2CalculatedbenefitsummaryAdapter;
  }
  
}
