package com.coupang.apigateway.services.member_api;

import com.coupang.apigateway.services.member_api.MemberapiV1AuthsessionAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1DeliverydetailsAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1MobileappinfoAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1NotificationagreementAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1MembersAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1ZipcodesAdapter;
import com.coupang.apigateway.services.member_api.MemberapiV1DeliverydetailAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayMemberapi {

  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1AuthsessionAdapter memberapiV1AuthsessionAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1DeliverydetailsAdapter memberapiV1DeliverydetailsAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1MobileappinfoAdapter memberapiV1MobileappinfoAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1NotificationagreementAdapter memberapiV1NotificationagreementAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1MembersAdapter memberapiV1MembersAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1ZipcodesAdapter memberapiV1ZipcodesAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private MemberapiV1DeliverydetailAdapter memberapiV1DeliverydetailAdapter;
  

  
  public MemberapiV1AuthsessionAdapter memberapiV1AuthsessionAdapter() {
    return this.memberapiV1AuthsessionAdapter;
  }
  
  public MemberapiV1DeliverydetailsAdapter memberapiV1DeliverydetailsAdapter() {
    return this.memberapiV1DeliverydetailsAdapter;
  }
  
  public MemberapiV1MobileappinfoAdapter memberapiV1MobileappinfoAdapter() {
    return this.memberapiV1MobileappinfoAdapter;
  }
  
  public MemberapiV1NotificationagreementAdapter memberapiV1NotificationagreementAdapter() {
    return this.memberapiV1NotificationagreementAdapter;
  }
  
  public MemberapiV1MembersAdapter memberapiV1MembersAdapter() {
    return this.memberapiV1MembersAdapter;
  }
  
  public MemberapiV1ZipcodesAdapter memberapiV1ZipcodesAdapter() {
    return this.memberapiV1ZipcodesAdapter;
  }
  
  public MemberapiV1DeliverydetailAdapter memberapiV1DeliverydetailAdapter() {
    return this.memberapiV1DeliverydetailAdapter;
  }
  
}
