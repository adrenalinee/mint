package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemDescriptionDto   {
  
  private Long vendorItemDescriptionId = null;
  private String value = null;
  private Integer order = null;
  private String name = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemDescriptionId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemDescriptionId")
  public Long getVendorItemDescriptionId() {
    return vendorItemDescriptionId;
  }
  
  /**
   **/
  public void setVendorItemDescriptionId(Long vendorItemDescriptionId) {
    this.vendorItemDescriptionId = vendorItemDescriptionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  public String getValue() {
    return value;
  }
  
  /**
   **/
  public void setValue(String value) {
    this.value = value;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("order")
  @com.fasterxml.jackson.annotation.JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  
  /**
   **/
  public void setOrder(Integer order) {
    this.order = order;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemDescriptionDto vendorItemDescriptionDto = (VendorItemDescriptionDto) o;
    return Objects.equals(this.vendorItemDescriptionId, vendorItemDescriptionDto.vendorItemDescriptionId) &&
        Objects.equals(this.value, vendorItemDescriptionDto.value) &&
        Objects.equals(this.order, vendorItemDescriptionDto.order) &&
        Objects.equals(this.name, vendorItemDescriptionDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemDescriptionId, value, order, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemDescriptionDto {\n");
    
    sb.append("    vendorItemDescriptionId: ").append(toIndentedString(vendorItemDescriptionId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

  public static VendorItemDescriptionDtoBuilder builder() {
    return new VendorItemDescriptionDtoBuilder();
  }

  public static class VendorItemDescriptionDtoBuilder {

    private Long vendorItemDescriptionId = null;
    private String value = null;
    private Integer order = null;
    private String name = null;
    

    VendorItemDescriptionDtoBuilder() {
    }

    /**
     **/
    public VendorItemDescriptionDtoBuilder vendorItemDescriptionId(Long vendorItemDescriptionId) {
      this.vendorItemDescriptionId = vendorItemDescriptionId;
      return this;
    }

    /**
     **/
    public VendorItemDescriptionDtoBuilder value(String value) {
      this.value = value;
      return this;
    }

    /**
     **/
    public VendorItemDescriptionDtoBuilder order(Integer order) {
      this.order = order;
      return this;
    }

    /**
     **/
    public VendorItemDescriptionDtoBuilder name(String name) {
      this.name = name;
      return this;
    }


    public VendorItemDescriptionDto build() {
      VendorItemDescriptionDto vendorItemDescriptionDto = new VendorItemDescriptionDto();
      vendorItemDescriptionDto.setVendorItemDescriptionId(this.vendorItemDescriptionId);
      vendorItemDescriptionDto.setValue(this.value);
      vendorItemDescriptionDto.setOrder(this.order);
      vendorItemDescriptionDto.setName(this.name);
      return vendorItemDescriptionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemDescriptionDtoBuilder {\n");
      
      sb.append("    vendorItemDescriptionId: ").append(toIndentedString(vendorItemDescriptionId)).append("\n");
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

