package com.coupang.apigateway.services.fds_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.fds_api.model.PurchaseRequestDTO;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
public class FraudDetectorRequestOfPurchaseRequestDTO   {
  
  private String serviceCode = null;
  private PurchaseRequestDTO data = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("serviceCode")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
  public String getServiceCode() {
    return serviceCode;
  }
  
  /**
   **/
  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("data")
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  public PurchaseRequestDTO getData() {
    return data;
  }
  
  /**
   **/
  public void setData(PurchaseRequestDTO data) {
    this.data = data;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequestOfPurchaseRequestDTO = (FraudDetectorRequestOfPurchaseRequestDTO) o;
    return Objects.equals(this.serviceCode, fraudDetectorRequestOfPurchaseRequestDTO.serviceCode) &&
        Objects.equals(this.data, fraudDetectorRequestOfPurchaseRequestDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceCode, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudDetectorRequestOfPurchaseRequestDTO {\n");
    
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static FraudDetectorRequestOfPurchaseRequestDTOBuilder builder() {
    return new FraudDetectorRequestOfPurchaseRequestDTOBuilder();
  }

  public static class FraudDetectorRequestOfPurchaseRequestDTOBuilder {

    private String serviceCode = null;
    private PurchaseRequestDTO data = null;
    

    FraudDetectorRequestOfPurchaseRequestDTOBuilder() {
    }

    /**
     **/
    public FraudDetectorRequestOfPurchaseRequestDTOBuilder serviceCode(String serviceCode) {
      this.serviceCode = serviceCode;
      return this;
    }

    /**
     **/
    public FraudDetectorRequestOfPurchaseRequestDTOBuilder data(PurchaseRequestDTO data) {
      this.data = data;
      return this;
    }


    public FraudDetectorRequestOfPurchaseRequestDTO build() {
      FraudDetectorRequestOfPurchaseRequestDTO fraudDetectorRequestOfPurchaseRequestDTO = new FraudDetectorRequestOfPurchaseRequestDTO();
      fraudDetectorRequestOfPurchaseRequestDTO.setServiceCode(this.serviceCode);
      fraudDetectorRequestOfPurchaseRequestDTO.setData(this.data);
      return fraudDetectorRequestOfPurchaseRequestDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FraudDetectorRequestOfPurchaseRequestDTOBuilder {\n");
      
      sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
      sb.append("    data: ").append(toIndentedString(data)).append("\n");
      sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
  }
}

