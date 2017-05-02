package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.VendorItemPropertyDTO;
import com.coupang.apigateway.services.product_api.model.VendorItemSubscribeDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemPropertiesDto   {
  
  private VendorItemSubscribeDto vendorItemSubscribeDto = null;
  private Map<String, VendorItemPropertyDTO> propertyMap = new HashMap<String, VendorItemPropertyDTO>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemSubscribeDto")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemSubscribeDto")
  public VendorItemSubscribeDto getVendorItemSubscribeDto() {
    return vendorItemSubscribeDto;
  }
  
  /**
   **/
  public void setVendorItemSubscribeDto(VendorItemSubscribeDto vendorItemSubscribeDto) {
    this.vendorItemSubscribeDto = vendorItemSubscribeDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("propertyMap")
  @com.fasterxml.jackson.annotation.JsonProperty("propertyMap")
  public Map<String, VendorItemPropertyDTO> getPropertyMap() {
    return propertyMap;
  }
  
  /**
   **/
  public void setPropertyMap(Map<String, VendorItemPropertyDTO> propertyMap) {
    this.propertyMap = propertyMap;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPropertiesDto vendorItemPropertiesDto = (VendorItemPropertiesDto) o;
    return Objects.equals(this.vendorItemSubscribeDto, vendorItemPropertiesDto.vendorItemSubscribeDto) &&
        Objects.equals(this.propertyMap, vendorItemPropertiesDto.propertyMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemSubscribeDto, propertyMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPropertiesDto {\n");
    
    sb.append("    vendorItemSubscribeDto: ").append(toIndentedString(vendorItemSubscribeDto)).append("\n");
    sb.append("    propertyMap: ").append(toIndentedString(propertyMap)).append("\n");
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

  public static VendorItemPropertiesDtoBuilder builder() {
    return new VendorItemPropertiesDtoBuilder();
  }

  public static class VendorItemPropertiesDtoBuilder {

    private VendorItemSubscribeDto vendorItemSubscribeDto = null;
    private Map<String, VendorItemPropertyDTO> propertyMap = new HashMap<String, VendorItemPropertyDTO>();
    

    VendorItemPropertiesDtoBuilder() {
    }

    /**
     **/
    public VendorItemPropertiesDtoBuilder vendorItemSubscribeDto(VendorItemSubscribeDto vendorItemSubscribeDto) {
      this.vendorItemSubscribeDto = vendorItemSubscribeDto;
      return this;
    }

    /**
     **/
    public VendorItemPropertiesDtoBuilder propertyMap(Map<String, VendorItemPropertyDTO> propertyMap) {
      this.propertyMap = propertyMap;
      return this;
    }


    public VendorItemPropertiesDto build() {
      VendorItemPropertiesDto vendorItemPropertiesDto = new VendorItemPropertiesDto();
      vendorItemPropertiesDto.setVendorItemSubscribeDto(this.vendorItemSubscribeDto);
      vendorItemPropertiesDto.setPropertyMap(this.propertyMap);
      return vendorItemPropertiesDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPropertiesDtoBuilder {\n");
      
      sb.append("    vendorItemSubscribeDto: ").append(toIndentedString(vendorItemSubscribeDto)).append("\n");
      sb.append("    propertyMap: ").append(toIndentedString(propertyMap)).append("\n");
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

