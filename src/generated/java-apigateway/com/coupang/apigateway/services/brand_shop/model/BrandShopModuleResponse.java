package com.coupang.apigateway.services.brand_shop.model;

import java.util.Objects;
import com.coupang.apigateway.services.brand_shop.model.BrandShopModuleContainer;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.084+09:00")
public class BrandShopModuleResponse   {
  
  private String rMessage = null;
  private BrandShopModuleContainer rData = null;
  private String rCode = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("rMessage")
  public String getRMessage() {
    return rMessage;
  }
  
  /**
   **/
  public void setRMessage(String rMessage) {
    this.rMessage = rMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rData")
  @com.fasterxml.jackson.annotation.JsonProperty("rData")
  public BrandShopModuleContainer getRData() {
    return rData;
  }
  
  /**
   **/
  public void setRData(BrandShopModuleContainer rData) {
    this.rData = rData;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rCode")
  @com.fasterxml.jackson.annotation.JsonProperty("rCode")
  public String getRCode() {
    return rCode;
  }
  
  /**
   **/
  public void setRCode(String rCode) {
    this.rCode = rCode;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandShopModuleResponse brandShopModuleResponse = (BrandShopModuleResponse) o;
    return Objects.equals(this.rMessage, brandShopModuleResponse.rMessage) &&
        Objects.equals(this.rData, brandShopModuleResponse.rData) &&
        Objects.equals(this.rCode, brandShopModuleResponse.rCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rMessage, rData, rCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandShopModuleResponse {\n");
    
    sb.append("    rMessage: ").append(toIndentedString(rMessage)).append("\n");
    sb.append("    rData: ").append(toIndentedString(rData)).append("\n");
    sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
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

  public static BrandShopModuleResponseBuilder builder() {
    return new BrandShopModuleResponseBuilder();
  }

  public static class BrandShopModuleResponseBuilder {

    private String rMessage = null;
    private BrandShopModuleContainer rData = null;
    private String rCode = null;
    

    BrandShopModuleResponseBuilder() {
    }

    /**
     **/
    public BrandShopModuleResponseBuilder rMessage(String rMessage) {
      this.rMessage = rMessage;
      return this;
    }

    /**
     **/
    public BrandShopModuleResponseBuilder rData(BrandShopModuleContainer rData) {
      this.rData = rData;
      return this;
    }

    /**
     **/
    public BrandShopModuleResponseBuilder rCode(String rCode) {
      this.rCode = rCode;
      return this;
    }


    public BrandShopModuleResponse build() {
      BrandShopModuleResponse brandShopModuleResponse = new BrandShopModuleResponse();
      brandShopModuleResponse.setRMessage(this.rMessage);
      brandShopModuleResponse.setRData(this.rData);
      brandShopModuleResponse.setRCode(this.rCode);
      return brandShopModuleResponse;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BrandShopModuleResponseBuilder {\n");
      
      sb.append("    rMessage: ").append(toIndentedString(rMessage)).append("\n");
      sb.append("    rData: ").append(toIndentedString(rData)).append("\n");
      sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
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

