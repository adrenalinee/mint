package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class UnitPriceRawData   {
  
  private Long vendorItemId = null;
  private String unitPriceRaw2 = null;
  private String unitPriceRaw1 = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemId")
  public Long getVendorItemId() {
    return vendorItemId;
  }
  
  /**
   **/
  public void setVendorItemId(Long vendorItemId) {
    this.vendorItemId = vendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPriceRaw2")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPriceRaw2")
  public String getUnitPriceRaw2() {
    return unitPriceRaw2;
  }
  
  /**
   **/
  public void setUnitPriceRaw2(String unitPriceRaw2) {
    this.unitPriceRaw2 = unitPriceRaw2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPriceRaw1")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPriceRaw1")
  public String getUnitPriceRaw1() {
    return unitPriceRaw1;
  }
  
  /**
   **/
  public void setUnitPriceRaw1(String unitPriceRaw1) {
    this.unitPriceRaw1 = unitPriceRaw1;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitPriceRawData unitPriceRawData = (UnitPriceRawData) o;
    return Objects.equals(this.vendorItemId, unitPriceRawData.vendorItemId) &&
        Objects.equals(this.unitPriceRaw2, unitPriceRawData.unitPriceRaw2) &&
        Objects.equals(this.unitPriceRaw1, unitPriceRawData.unitPriceRaw1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, unitPriceRaw2, unitPriceRaw1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitPriceRawData {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    unitPriceRaw2: ").append(toIndentedString(unitPriceRaw2)).append("\n");
    sb.append("    unitPriceRaw1: ").append(toIndentedString(unitPriceRaw1)).append("\n");
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

  public static UnitPriceRawDataBuilder builder() {
    return new UnitPriceRawDataBuilder();
  }

  public static class UnitPriceRawDataBuilder {

    private Long vendorItemId = null;
    private String unitPriceRaw2 = null;
    private String unitPriceRaw1 = null;
    

    UnitPriceRawDataBuilder() {
    }

    /**
     **/
    public UnitPriceRawDataBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public UnitPriceRawDataBuilder unitPriceRaw2(String unitPriceRaw2) {
      this.unitPriceRaw2 = unitPriceRaw2;
      return this;
    }

    /**
     **/
    public UnitPriceRawDataBuilder unitPriceRaw1(String unitPriceRaw1) {
      this.unitPriceRaw1 = unitPriceRaw1;
      return this;
    }


    public UnitPriceRawData build() {
      UnitPriceRawData unitPriceRawData = new UnitPriceRawData();
      unitPriceRawData.setVendorItemId(this.vendorItemId);
      unitPriceRawData.setUnitPriceRaw2(this.unitPriceRaw2);
      unitPriceRawData.setUnitPriceRaw1(this.unitPriceRaw1);
      return unitPriceRawData;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UnitPriceRawDataBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    unitPriceRaw2: ").append(toIndentedString(unitPriceRaw2)).append("\n");
      sb.append("    unitPriceRaw1: ").append(toIndentedString(unitPriceRaw1)).append("\n");
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

