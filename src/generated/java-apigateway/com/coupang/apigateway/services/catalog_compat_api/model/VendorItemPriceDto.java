package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class VendorItemPriceDto   {
  
  private Long vendorItemPriceId = null;
  private Long vendorItemId = null;
  private String salePriceType = null;
  private Boolean salePriceModifiable = null;
  private java.math.BigDecimal salePrice = null;
  private java.math.BigDecimal saleAgentCommission = null;
  private String originalPriceType = null;
  private java.math.BigDecimal originalPrice = null;
  private Date modifiedAt = null;
  private java.math.BigDecimal epaymentCommission = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPriceId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPriceId")
  public Long getVendorItemPriceId() {
    return vendorItemPriceId;
  }
  
  /**
   **/
  public void setVendorItemPriceId(Long vendorItemPriceId) {
    this.vendorItemPriceId = vendorItemPriceId;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("salePriceType")
  @com.fasterxml.jackson.annotation.JsonProperty("salePriceType")
  public String getSalePriceType() {
    return salePriceType;
  }
  
  /**
   **/
  public void setSalePriceType(String salePriceType) {
    this.salePriceType = salePriceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePriceModifiable")
  @com.fasterxml.jackson.annotation.JsonProperty("salePriceModifiable")
  public Boolean getSalePriceModifiable() {
    return salePriceModifiable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSalePriceModifiable() {
    return salePriceModifiable == null ? false : salePriceModifiable;
  }
  
  /**
   **/
  public void setSalePriceModifiable(Boolean salePriceModifiable) {
    this.salePriceModifiable = salePriceModifiable;
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
  @org.codehaus.jackson.annotate.JsonProperty("saleAgentCommission")
  @com.fasterxml.jackson.annotation.JsonProperty("saleAgentCommission")
  public java.math.BigDecimal getSaleAgentCommission() {
    return saleAgentCommission;
  }
  
  /**
   **/
  public void setSaleAgentCommission(java.math.BigDecimal saleAgentCommission) {
    this.saleAgentCommission = saleAgentCommission;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPriceType")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPriceType")
  public String getOriginalPriceType() {
    return originalPriceType;
  }
  
  /**
   **/
  public void setOriginalPriceType(String originalPriceType) {
    this.originalPriceType = originalPriceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrice")
  public java.math.BigDecimal getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(java.math.BigDecimal originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("epaymentCommission")
  @com.fasterxml.jackson.annotation.JsonProperty("epaymentCommission")
  public java.math.BigDecimal getEpaymentCommission() {
    return epaymentCommission;
  }
  
  /**
   **/
  public void setEpaymentCommission(java.math.BigDecimal epaymentCommission) {
    this.epaymentCommission = epaymentCommission;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPriceDto vendorItemPriceDto = (VendorItemPriceDto) o;
    return Objects.equals(this.vendorItemPriceId, vendorItemPriceDto.vendorItemPriceId) &&
        Objects.equals(this.vendorItemId, vendorItemPriceDto.vendorItemId) &&
        Objects.equals(this.salePriceType, vendorItemPriceDto.salePriceType) &&
        Objects.equals(this.salePriceModifiable, vendorItemPriceDto.salePriceModifiable) &&
        Objects.equals(this.salePrice, vendorItemPriceDto.salePrice) &&
        Objects.equals(this.saleAgentCommission, vendorItemPriceDto.saleAgentCommission) &&
        Objects.equals(this.originalPriceType, vendorItemPriceDto.originalPriceType) &&
        Objects.equals(this.originalPrice, vendorItemPriceDto.originalPrice) &&
        Objects.equals(this.modifiedAt, vendorItemPriceDto.modifiedAt) &&
        Objects.equals(this.epaymentCommission, vendorItemPriceDto.epaymentCommission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPriceId, vendorItemId, salePriceType, salePriceModifiable, salePrice, saleAgentCommission, originalPriceType, originalPrice, modifiedAt, epaymentCommission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPriceDto {\n");
    
    sb.append("    vendorItemPriceId: ").append(toIndentedString(vendorItemPriceId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
    sb.append("    salePriceModifiable: ").append(toIndentedString(salePriceModifiable)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    saleAgentCommission: ").append(toIndentedString(saleAgentCommission)).append("\n");
    sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    epaymentCommission: ").append(toIndentedString(epaymentCommission)).append("\n");
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

  public static VendorItemPriceDtoBuilder builder() {
    return new VendorItemPriceDtoBuilder();
  }

  public static class VendorItemPriceDtoBuilder {

    private Long vendorItemPriceId = null;
    private Long vendorItemId = null;
    private String salePriceType = null;
    private Boolean salePriceModifiable = null;
    private java.math.BigDecimal salePrice = null;
    private java.math.BigDecimal saleAgentCommission = null;
    private String originalPriceType = null;
    private java.math.BigDecimal originalPrice = null;
    private Date modifiedAt = null;
    private java.math.BigDecimal epaymentCommission = null;
    

    VendorItemPriceDtoBuilder() {
    }

    /**
     **/
    public VendorItemPriceDtoBuilder vendorItemPriceId(Long vendorItemPriceId) {
      this.vendorItemPriceId = vendorItemPriceId;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder salePriceType(String salePriceType) {
      this.salePriceType = salePriceType;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder salePriceModifiable(Boolean salePriceModifiable) {
      this.salePriceModifiable = salePriceModifiable;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder salePrice(java.math.BigDecimal salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder saleAgentCommission(java.math.BigDecimal saleAgentCommission) {
      this.saleAgentCommission = saleAgentCommission;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder originalPriceType(String originalPriceType) {
      this.originalPriceType = originalPriceType;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder originalPrice(java.math.BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public VendorItemPriceDtoBuilder epaymentCommission(java.math.BigDecimal epaymentCommission) {
      this.epaymentCommission = epaymentCommission;
      return this;
    }


    public VendorItemPriceDto build() {
      VendorItemPriceDto vendorItemPriceDto = new VendorItemPriceDto();
      vendorItemPriceDto.setVendorItemPriceId(this.vendorItemPriceId);
      vendorItemPriceDto.setVendorItemId(this.vendorItemId);
      vendorItemPriceDto.setSalePriceType(this.salePriceType);
      vendorItemPriceDto.setSalePriceModifiable(this.salePriceModifiable);
      vendorItemPriceDto.setSalePrice(this.salePrice);
      vendorItemPriceDto.setSaleAgentCommission(this.saleAgentCommission);
      vendorItemPriceDto.setOriginalPriceType(this.originalPriceType);
      vendorItemPriceDto.setOriginalPrice(this.originalPrice);
      vendorItemPriceDto.setModifiedAt(this.modifiedAt);
      vendorItemPriceDto.setEpaymentCommission(this.epaymentCommission);
      return vendorItemPriceDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPriceDtoBuilder {\n");
      
      sb.append("    vendorItemPriceId: ").append(toIndentedString(vendorItemPriceId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
      sb.append("    salePriceModifiable: ").append(toIndentedString(salePriceModifiable)).append("\n");
      sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
      sb.append("    saleAgentCommission: ").append(toIndentedString(saleAgentCommission)).append("\n");
      sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    epaymentCommission: ").append(toIndentedString(epaymentCommission)).append("\n");
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

