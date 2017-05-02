package com.coupang.apigateway.services.message;

import com.coupang.apigateway.services.message.MessageApiV1InfraslackAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.171+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayMessage {

  
  @org.springframework.beans.factory.annotation.Autowired
  private MessageApiV1InfraslackAdapter messageApiV1InfraslackAdapter;
  

  
  public MessageApiV1InfraslackAdapter messageApiV1InfraslackAdapter() {
    return this.messageApiV1InfraslackAdapter;
  }
  
}
