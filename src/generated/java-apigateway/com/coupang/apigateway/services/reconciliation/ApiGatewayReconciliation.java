package com.coupang.apigateway.services.reconciliation;

import com.coupang.apigateway.services.reconciliation.ReconciliationApiPublicAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.914+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayReconciliation {

  
  @org.springframework.beans.factory.annotation.Autowired
  private ReconciliationApiPublicAdapter reconciliationApiPublicAdapter;
  

  
  public ReconciliationApiPublicAdapter reconciliationApiPublicAdapter() {
    return this.reconciliationApiPublicAdapter;
  }
  
}
