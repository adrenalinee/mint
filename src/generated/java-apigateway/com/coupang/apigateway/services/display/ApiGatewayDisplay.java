package com.coupang.apigateway.services.display;

import com.coupang.apigateway.services.display.DisplayApiV1CmsAdapter;
import com.coupang.apigateway.services.display.DisplayApiV1AttributetypefilterAdapter;
import com.coupang.apigateway.services.display.DisplayApiV1AttributefilterAdapter;
import com.coupang.apigateway.services.display.DisplayApiV2CmsAdapter;
import com.coupang.apigateway.services.display.DisplayApiV1BadgeimageAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayDisplay {

  
  @org.springframework.beans.factory.annotation.Autowired
  private DisplayApiV1CmsAdapter displayApiV1CmsAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private DisplayApiV1AttributetypefilterAdapter displayApiV1AttributetypefilterAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private DisplayApiV1AttributefilterAdapter displayApiV1AttributefilterAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private DisplayApiV2CmsAdapter displayApiV2CmsAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private DisplayApiV1BadgeimageAdapter displayApiV1BadgeimageAdapter;
  

  
  public DisplayApiV1CmsAdapter displayApiV1CmsAdapter() {
    return this.displayApiV1CmsAdapter;
  }
  
  public DisplayApiV1AttributetypefilterAdapter displayApiV1AttributetypefilterAdapter() {
    return this.displayApiV1AttributetypefilterAdapter;
  }
  
  public DisplayApiV1AttributefilterAdapter displayApiV1AttributefilterAdapter() {
    return this.displayApiV1AttributefilterAdapter;
  }
  
  public DisplayApiV2CmsAdapter displayApiV2CmsAdapter() {
    return this.displayApiV2CmsAdapter;
  }
  
  public DisplayApiV1BadgeimageAdapter displayApiV1BadgeimageAdapter() {
    return this.displayApiV1BadgeimageAdapter;
  }
  
}
