package com.coupang.apigateway.services.search_features;

import com.coupang.apigateway.services.search_features.SearchfeaturesApiHotkeywordAdapter;
import com.coupang.apigateway.services.search_features.SearchfeaturesApiRelatedkeywordAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.210+09:00")
@org.springframework.stereotype.Component
public class ApiGatewaySearchfeatures {

  
  @org.springframework.beans.factory.annotation.Autowired
  private SearchfeaturesApiHotkeywordAdapter searchfeaturesApiHotkeywordAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private SearchfeaturesApiRelatedkeywordAdapter searchfeaturesApiRelatedkeywordAdapter;
  

  
  public SearchfeaturesApiHotkeywordAdapter searchfeaturesApiHotkeywordAdapter() {
    return this.searchfeaturesApiHotkeywordAdapter;
  }
  
  public SearchfeaturesApiRelatedkeywordAdapter searchfeaturesApiRelatedkeywordAdapter() {
    return this.searchfeaturesApiRelatedkeywordAdapter;
  }
  
}
