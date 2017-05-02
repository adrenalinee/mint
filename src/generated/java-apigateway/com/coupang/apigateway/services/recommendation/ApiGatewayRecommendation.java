package com.coupang.apigateway.services.recommendation;

import com.coupang.apigateway.services.recommendation.RecommendationApiV4CategoryAdapter;
import com.coupang.apigateway.services.recommendation.RecommendationApiV4ProductAdapter;
import com.coupang.apigateway.services.recommendation.RecommendationApiV4MemberAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayRecommendation {

  
  @org.springframework.beans.factory.annotation.Autowired
  private RecommendationApiV4CategoryAdapter recommendationApiV4CategoryAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RecommendationApiV4ProductAdapter recommendationApiV4ProductAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private RecommendationApiV4MemberAdapter recommendationApiV4MemberAdapter;
  

  
  public RecommendationApiV4CategoryAdapter recommendationApiV4CategoryAdapter() {
    return this.recommendationApiV4CategoryAdapter;
  }
  
  public RecommendationApiV4ProductAdapter recommendationApiV4ProductAdapter() {
    return this.recommendationApiV4ProductAdapter;
  }
  
  public RecommendationApiV4MemberAdapter recommendationApiV4MemberAdapter() {
    return this.recommendationApiV4MemberAdapter;
  }
  
}
