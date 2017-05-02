package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class UnitPriceDto   {
  
  private Integer unitPriceBasis = null;
  private String unitDescription = null;
  private Integer itemQuantity = null;
  private java.math.BigDecimal convUnitPriceBasis = null;
  private Boolean bundled = null;
  private Integer bundleQuantity = null;
  private java.math.BigDecimal attributeValue4UnitPrice = null;
  private java.math.BigDecimal attributeValue4Quantity = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPriceBasis")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPriceBasis")
  public Integer getUnitPriceBasis() {
    return unitPriceBasis;
  }
  
  /**
   **/
  public void setUnitPriceBasis(Integer unitPriceBasis) {
    this.unitPriceBasis = unitPriceBasis;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("unitDescription")
  public String getUnitDescription() {
    return unitDescription;
  }
  
  /**
   **/
  public void setUnitDescription(String unitDescription) {
    this.unitDescription = unitDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("itemQuantity")
  public Integer getItemQuantity() {
    return itemQuantity;
  }
  
  /**
   **/
  public void setItemQuantity(Integer itemQuantity) {
    this.itemQuantity = itemQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("convUnitPriceBasis")
  @com.fasterxml.jackson.annotation.JsonProperty("convUnitPriceBasis")
  public java.math.BigDecimal getConvUnitPriceBasis() {
    return convUnitPriceBasis;
  }
  
  /**
   **/
  public void setConvUnitPriceBasis(java.math.BigDecimal convUnitPriceBasis) {
    this.convUnitPriceBasis = convUnitPriceBasis;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundled")
  @com.fasterxml.jackson.annotation.JsonProperty("bundled")
  public Boolean getBundled() {
    return bundled;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBundled() {
    return bundled == null ? false : bundled;
  }
  
  /**
   **/
  public void setBundled(Boolean bundled) {
    this.bundled = bundled;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundleQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("bundleQuantity")
  public Integer getBundleQuantity() {
    return bundleQuantity;
  }
  
  /**
   **/
  public void setBundleQuantity(Integer bundleQuantity) {
    this.bundleQuantity = bundleQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValue4UnitPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValue4UnitPrice")
  public java.math.BigDecimal getAttributeValue4UnitPrice() {
    return attributeValue4UnitPrice;
  }
  
  /**
   **/
  public void setAttributeValue4UnitPrice(java.math.BigDecimal attributeValue4UnitPrice) {
    this.attributeValue4UnitPrice = attributeValue4UnitPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValue4Quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValue4Quantity")
  public java.math.BigDecimal getAttributeValue4Quantity() {
    return attributeValue4Quantity;
  }
  
  /**
   **/
  public void setAttributeValue4Quantity(java.math.BigDecimal attributeValue4Quantity) {
    this.attributeValue4Quantity = attributeValue4Quantity;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitPriceDto unitPriceDto = (UnitPriceDto) o;
    return Objects.equals(this.unitPriceBasis, unitPriceDto.unitPriceBasis) &&
        Objects.equals(this.unitDescription, unitPriceDto.unitDescription) &&
        Objects.equals(this.itemQuantity, unitPriceDto.itemQuantity) &&
        Objects.equals(this.convUnitPriceBasis, unitPriceDto.convUnitPriceBasis) &&
        Objects.equals(this.bundled, unitPriceDto.bundled) &&
        Objects.equals(this.bundleQuantity, unitPriceDto.bundleQuantity) &&
        Objects.equals(this.attributeValue4UnitPrice, unitPriceDto.attributeValue4UnitPrice) &&
        Objects.equals(this.attributeValue4Quantity, unitPriceDto.attributeValue4Quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitPriceBasis, unitDescription, itemQuantity, convUnitPriceBasis, bundled, bundleQuantity, attributeValue4UnitPrice, attributeValue4Quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitPriceDto {\n");
    
    sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
    sb.append("    convUnitPriceBasis: ").append(toIndentedString(convUnitPriceBasis)).append("\n");
    sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
    sb.append("    bundleQuantity: ").append(toIndentedString(bundleQuantity)).append("\n");
    sb.append("    attributeValue4UnitPrice: ").append(toIndentedString(attributeValue4UnitPrice)).append("\n");
    sb.append("    attributeValue4Quantity: ").append(toIndentedString(attributeValue4Quantity)).append("\n");
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

  public static UnitPriceDtoBuilder builder() {
    return new UnitPriceDtoBuilder();
  }

  public static class UnitPriceDtoBuilder {

    private Integer unitPriceBasis = null;
    private String unitDescription = null;
    private Integer itemQuantity = null;
    private java.math.BigDecimal convUnitPriceBasis = null;
    private Boolean bundled = null;
    private Integer bundleQuantity = null;
    private java.math.BigDecimal attributeValue4UnitPrice = null;
    private java.math.BigDecimal attributeValue4Quantity = null;
    

    UnitPriceDtoBuilder() {
    }

    /**
     **/
    public UnitPriceDtoBuilder unitPriceBasis(Integer unitPriceBasis) {
      this.unitPriceBasis = unitPriceBasis;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder unitDescription(String unitDescription) {
      this.unitDescription = unitDescription;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder itemQuantity(Integer itemQuantity) {
      this.itemQuantity = itemQuantity;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder convUnitPriceBasis(java.math.BigDecimal convUnitPriceBasis) {
      this.convUnitPriceBasis = convUnitPriceBasis;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder bundled(Boolean bundled) {
      this.bundled = bundled;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder bundleQuantity(Integer bundleQuantity) {
      this.bundleQuantity = bundleQuantity;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder attributeValue4UnitPrice(java.math.BigDecimal attributeValue4UnitPrice) {
      this.attributeValue4UnitPrice = attributeValue4UnitPrice;
      return this;
    }

    /**
     **/
    public UnitPriceDtoBuilder attributeValue4Quantity(java.math.BigDecimal attributeValue4Quantity) {
      this.attributeValue4Quantity = attributeValue4Quantity;
      return this;
    }


    public UnitPriceDto build() {
      UnitPriceDto unitPriceDto = new UnitPriceDto();
      unitPriceDto.setUnitPriceBasis(this.unitPriceBasis);
      unitPriceDto.setUnitDescription(this.unitDescription);
      unitPriceDto.setItemQuantity(this.itemQuantity);
      unitPriceDto.setConvUnitPriceBasis(this.convUnitPriceBasis);
      unitPriceDto.setBundled(this.bundled);
      unitPriceDto.setBundleQuantity(this.bundleQuantity);
      unitPriceDto.setAttributeValue4UnitPrice(this.attributeValue4UnitPrice);
      unitPriceDto.setAttributeValue4Quantity(this.attributeValue4Quantity);
      return unitPriceDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UnitPriceDtoBuilder {\n");
      
      sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
      sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
      sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
      sb.append("    convUnitPriceBasis: ").append(toIndentedString(convUnitPriceBasis)).append("\n");
      sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
      sb.append("    bundleQuantity: ").append(toIndentedString(bundleQuantity)).append("\n");
      sb.append("    attributeValue4UnitPrice: ").append(toIndentedString(attributeValue4UnitPrice)).append("\n");
      sb.append("    attributeValue4Quantity: ").append(toIndentedString(attributeValue4Quantity)).append("\n");
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

