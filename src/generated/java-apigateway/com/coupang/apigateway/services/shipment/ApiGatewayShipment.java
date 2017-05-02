package com.coupang.apigateway.services.shipment;

import com.coupang.apigateway.services.shipment.ShipmentApiV1DeliveriesAdapter;
import com.coupang.apigateway.services.shipment.ShipmentApiV1DeliverycompaniesAdapter;

@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.890+09:00")
@org.springframework.stereotype.Component
public class ApiGatewayShipment {

  
  @org.springframework.beans.factory.annotation.Autowired
  private ShipmentApiV1DeliveriesAdapter shipmentApiV1DeliveriesAdapter;
  
  @org.springframework.beans.factory.annotation.Autowired
  private ShipmentApiV1DeliverycompaniesAdapter shipmentApiV1DeliverycompaniesAdapter;
  

  
  public ShipmentApiV1DeliveriesAdapter shipmentApiV1DeliveriesAdapter() {
    return this.shipmentApiV1DeliveriesAdapter;
  }
  
  public ShipmentApiV1DeliverycompaniesAdapter shipmentApiV1DeliverycompaniesAdapter() {
    return this.shipmentApiV1DeliverycompaniesAdapter;
  }
  
}
