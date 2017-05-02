package com.coupang.apigateway.services.rss.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
public class VendorItemPackageInfoDto   {
  
  private String vendorItemPackageType = null;
  private Long vendorItemPackageId = null;
  private Integer productCount = null;
  private Boolean isVitamin = null;
  private Integer goodbyeDualwriteType = null;
  private Long coupangSrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageType")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageType")
  public String getVendorItemPackageType() {
    return vendorItemPackageType;
  }
  
  /**
   **/
  public void setVendorItemPackageType(String vendorItemPackageType) {
    this.vendorItemPackageType = vendorItemPackageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageId")
  public Long getVendorItemPackageId() {
    return vendorItemPackageId;
  }
  
  /**
   **/
  public void setVendorItemPackageId(Long vendorItemPackageId) {
    this.vendorItemPackageId = vendorItemPackageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productCount")
  @com.fasterxml.jackson.annotation.JsonProperty("productCount")
  public Integer getProductCount() {
    return productCount;
  }
  
  /**
   **/
  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isVitamin")
  @com.fasterxml.jackson.annotation.JsonProperty("isVitamin")
  public Boolean getIsVitamin() {
    return isVitamin;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsVitamin() {
    return isVitamin == null ? false : isVitamin;
  }
  
  /**
   **/
  public void setIsVitamin(Boolean isVitamin) {
    this.isVitamin = isVitamin;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("goodbyeDualwriteType")
  @com.fasterxml.jackson.annotation.JsonProperty("goodbyeDualwriteType")
  public Integer getGoodbyeDualwriteType() {
    return goodbyeDualwriteType;
  }
  
  /**
   **/
  public void setGoodbyeDualwriteType(Integer goodbyeDualwriteType) {
    this.goodbyeDualwriteType = goodbyeDualwriteType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSrl")
  public Long getCoupangSrl() {
    return coupangSrl;
  }
  
  /**
   **/
  public void setCoupangSrl(Long coupangSrl) {
    this.coupangSrl = coupangSrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPackageInfoDto vendorItemPackageInfoDto = (VendorItemPackageInfoDto) o;
    return Objects.equals(this.vendorItemPackageType, vendorItemPackageInfoDto.vendorItemPackageType) &&
        Objects.equals(this.vendorItemPackageId, vendorItemPackageInfoDto.vendorItemPackageId) &&
        Objects.equals(this.productCount, vendorItemPackageInfoDto.productCount) &&
        Objects.equals(this.isVitamin, vendorItemPackageInfoDto.isVitamin) &&
        Objects.equals(this.goodbyeDualwriteType, vendorItemPackageInfoDto.goodbyeDualwriteType) &&
        Objects.equals(this.coupangSrl, vendorItemPackageInfoDto.coupangSrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageType, vendorItemPackageId, productCount, isVitamin, goodbyeDualwriteType, coupangSrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackageInfoDto {\n");
    
    sb.append("    vendorItemPackageType: ").append(toIndentedString(vendorItemPackageType)).append("\n");
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    isVitamin: ").append(toIndentedString(isVitamin)).append("\n");
    sb.append("    goodbyeDualwriteType: ").append(toIndentedString(goodbyeDualwriteType)).append("\n");
    sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

  public static VendorItemPackageInfoDtoBuilder builder() {
    return new VendorItemPackageInfoDtoBuilder();
  }

  public static class VendorItemPackageInfoDtoBuilder {

    private String vendorItemPackageType = null;
    private Long vendorItemPackageId = null;
    private Integer productCount = null;
    private Boolean isVitamin = null;
    private Integer goodbyeDualwriteType = null;
    private Long coupangSrl = null;
    

    VendorItemPackageInfoDtoBuilder() {
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder vendorItemPackageType(String vendorItemPackageType) {
      this.vendorItemPackageType = vendorItemPackageType;
      return this;
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder productCount(Integer productCount) {
      this.productCount = productCount;
      return this;
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder isVitamin(Boolean isVitamin) {
      this.isVitamin = isVitamin;
      return this;
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder goodbyeDualwriteType(Integer goodbyeDualwriteType) {
      this.goodbyeDualwriteType = goodbyeDualwriteType;
      return this;
    }

    /**
     **/
    public VendorItemPackageInfoDtoBuilder coupangSrl(Long coupangSrl) {
      this.coupangSrl = coupangSrl;
      return this;
    }


    public VendorItemPackageInfoDto build() {
      VendorItemPackageInfoDto vendorItemPackageInfoDto = new VendorItemPackageInfoDto();
      vendorItemPackageInfoDto.setVendorItemPackageType(this.vendorItemPackageType);
      vendorItemPackageInfoDto.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemPackageInfoDto.setProductCount(this.productCount);
      vendorItemPackageInfoDto.setIsVitamin(this.isVitamin);
      vendorItemPackageInfoDto.setGoodbyeDualwriteType(this.goodbyeDualwriteType);
      vendorItemPackageInfoDto.setCoupangSrl(this.coupangSrl);
      return vendorItemPackageInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackageInfoDtoBuilder {\n");
      
      sb.append("    vendorItemPackageType: ").append(toIndentedString(vendorItemPackageType)).append("\n");
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
      sb.append("    isVitamin: ").append(toIndentedString(isVitamin)).append("\n");
      sb.append("    goodbyeDualwriteType: ").append(toIndentedString(goodbyeDualwriteType)).append("\n");
      sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

