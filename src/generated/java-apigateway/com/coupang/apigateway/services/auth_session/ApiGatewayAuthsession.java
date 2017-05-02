package com.coupang.apigateway.services.auth_session;

import com.coupang.apigateway.services.auth_session.AuthsessionApiV1CookiesAdapter;
import com.coupang.apigateway.services.auth_session.AuthsessionApiV1SessionAdapter;
import com.coupang.apigateway.services.auth_session.AuthsessionApiV1AuthenticateAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayAuthsession {

  
  @org.springframework.beans.factory.annotation.Autowired
  private AuthsessionApiV1CookiesAdapter authsessionApiV1CookiesAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private AuthsessionApiV1SessionAdapter authsessionApiV1SessionAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private AuthsessionApiV1AuthenticateAdapter authsessionApiV1AuthenticateAdapter;
  

  
  public AuthsessionApiV1CookiesAdapter authsessionApiV1CookiesAdapter() {
    return this.authsessionApiV1CookiesAdapter;
  }
  
  public AuthsessionApiV1SessionAdapter authsessionApiV1SessionAdapter() {
    return this.authsessionApiV1SessionAdapter;
  }
  
  public AuthsessionApiV1AuthenticateAdapter authsessionApiV1AuthenticateAdapter() {
    return this.authsessionApiV1AuthenticateAdapter;
  }
  
}
