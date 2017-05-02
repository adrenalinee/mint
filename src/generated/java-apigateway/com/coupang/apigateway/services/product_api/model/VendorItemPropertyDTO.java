package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPropertyDTO   {
  
  private Long vendorItemId = null;
  private String propertyValue = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("propertyValue")
  @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
  public String getPropertyValue() {
    return propertyValue;
  }
  
  /**
   **/
  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPropertyDTO vendorItemPropertyDTO = (VendorItemPropertyDTO) o;
    return Objects.equals(this.vendorItemId, vendorItemPropertyDTO.vendorItemId) &&
        Objects.equals(this.propertyValue, vendorItemPropertyDTO.propertyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, propertyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPropertyDTO {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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

  public static VendorItemPropertyDTOBuilder builder() {
    return new VendorItemPropertyDTOBuilder();
  }

  public static class VendorItemPropertyDTOBuilder {

    private Long vendorItemId = null;
    private String propertyValue = null;
    

    VendorItemPropertyDTOBuilder() {
    }

    /**
     **/
    public VendorItemPropertyDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemPropertyDTOBuilder propertyValue(String propertyValue) {
      this.propertyValue = propertyValue;
      return this;
    }


    public VendorItemPropertyDTO build() {
      VendorItemPropertyDTO vendorItemPropertyDTO = new VendorItemPropertyDTO();
      vendorItemPropertyDTO.setVendorItemId(this.vendorItemId);
      vendorItemPropertyDTO.setPropertyValue(this.propertyValue);
      return vendorItemPropertyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPropertyDTOBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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

