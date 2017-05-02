package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class PriceInformationDto   {
  
  private Long vendorItemId = null;
  private Integer unitPriceBasis = null;
  private String unitDescription = null;
  private java.math.BigDecimal salePrice = null;
  private java.math.BigDecimal originPrice = null;
  private Integer itemQuantity = null;
  private java.math.BigDecimal discountRate = null;
  private java.math.BigDecimal convUnitPriceBasis = null;
  private Boolean bundled = null;
  private Integer bundleQuantity = null;
  private java.math.BigDecimal attributeValue4UnitPrice = null;
  private java.math.BigDecimal attributeValue4Quantity = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("salePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salePrice")
  public java.math.BigDecimal getSalePrice() {
    return salePrice;
  }
  
  /**
   **/
  public void setSalePrice(java.math.BigDecimal salePrice) {
    this.salePrice = salePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originPrice")
  public java.math.BigDecimal getOriginPrice() {
    return originPrice;
  }
  
  /**
   **/
  public void setOriginPrice(java.math.BigDecimal originPrice) {
    this.originPrice = originPrice;
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
  @org.codehaus.jackson.annotate.JsonProperty("discountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("discountRate")
  public java.math.BigDecimal getDiscountRate() {
    return discountRate;
  }
  
  /**
   **/
  public void setDiscountRate(java.math.BigDecimal discountRate) {
    this.discountRate = discountRate;
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
    PriceInformationDto priceInformationDto = (PriceInformationDto) o;
    return Objects.equals(this.vendorItemId, priceInformationDto.vendorItemId) &&
        Objects.equals(this.unitPriceBasis, priceInformationDto.unitPriceBasis) &&
        Objects.equals(this.unitDescription, priceInformationDto.unitDescription) &&
        Objects.equals(this.salePrice, priceInformationDto.salePrice) &&
        Objects.equals(this.originPrice, priceInformationDto.originPrice) &&
        Objects.equals(this.itemQuantity, priceInformationDto.itemQuantity) &&
        Objects.equals(this.discountRate, priceInformationDto.discountRate) &&
        Objects.equals(this.convUnitPriceBasis, priceInformationDto.convUnitPriceBasis) &&
        Objects.equals(this.bundled, priceInformationDto.bundled) &&
        Objects.equals(this.bundleQuantity, priceInformationDto.bundleQuantity) &&
        Objects.equals(this.attributeValue4UnitPrice, priceInformationDto.attributeValue4UnitPrice) &&
        Objects.equals(this.attributeValue4Quantity, priceInformationDto.attributeValue4Quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, unitPriceBasis, unitDescription, salePrice, originPrice, itemQuantity, discountRate, convUnitPriceBasis, bundled, bundleQuantity, attributeValue4UnitPrice, attributeValue4Quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInformationDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    originPrice: ").append(toIndentedString(originPrice)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
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

  public static PriceInformationDtoBuilder builder() {
    return new PriceInformationDtoBuilder();
  }

  public static class PriceInformationDtoBuilder {

    private Long vendorItemId = null;
    private Integer unitPriceBasis = null;
    private String unitDescription = null;
    private java.math.BigDecimal salePrice = null;
    private java.math.BigDecimal originPrice = null;
    private Integer itemQuantity = null;
    private java.math.BigDecimal discountRate = null;
    private java.math.BigDecimal convUnitPriceBasis = null;
    private Boolean bundled = null;
    private Integer bundleQuantity = null;
    private java.math.BigDecimal attributeValue4UnitPrice = null;
    private java.math.BigDecimal attributeValue4Quantity = null;
    

    PriceInformationDtoBuilder() {
    }

    /**
     **/
    public PriceInformationDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder unitPriceBasis(Integer unitPriceBasis) {
      this.unitPriceBasis = unitPriceBasis;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder unitDescription(String unitDescription) {
      this.unitDescription = unitDescription;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder salePrice(java.math.BigDecimal salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder originPrice(java.math.BigDecimal originPrice) {
      this.originPrice = originPrice;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder itemQuantity(Integer itemQuantity) {
      this.itemQuantity = itemQuantity;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder discountRate(java.math.BigDecimal discountRate) {
      this.discountRate = discountRate;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder convUnitPriceBasis(java.math.BigDecimal convUnitPriceBasis) {
      this.convUnitPriceBasis = convUnitPriceBasis;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder bundled(Boolean bundled) {
      this.bundled = bundled;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder bundleQuantity(Integer bundleQuantity) {
      this.bundleQuantity = bundleQuantity;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder attributeValue4UnitPrice(java.math.BigDecimal attributeValue4UnitPrice) {
      this.attributeValue4UnitPrice = attributeValue4UnitPrice;
      return this;
    }

    /**
     **/
    public PriceInformationDtoBuilder attributeValue4Quantity(java.math.BigDecimal attributeValue4Quantity) {
      this.attributeValue4Quantity = attributeValue4Quantity;
      return this;
    }


    public PriceInformationDto build() {
      PriceInformationDto priceInformationDto = new PriceInformationDto();
      priceInformationDto.setVendorItemId(this.vendorItemId);
      priceInformationDto.setUnitPriceBasis(this.unitPriceBasis);
      priceInformationDto.setUnitDescription(this.unitDescription);
      priceInformationDto.setSalePrice(this.salePrice);
      priceInformationDto.setOriginPrice(this.originPrice);
      priceInformationDto.setItemQuantity(this.itemQuantity);
      priceInformationDto.setDiscountRate(this.discountRate);
      priceInformationDto.setConvUnitPriceBasis(this.convUnitPriceBasis);
      priceInformationDto.setBundled(this.bundled);
      priceInformationDto.setBundleQuantity(this.bundleQuantity);
      priceInformationDto.setAttributeValue4UnitPrice(this.attributeValue4UnitPrice);
      priceInformationDto.setAttributeValue4Quantity(this.attributeValue4Quantity);
      return priceInformationDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PriceInformationDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
      sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
      sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
      sb.append("    originPrice: ").append(toIndentedString(originPrice)).append("\n");
      sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
      sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
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

