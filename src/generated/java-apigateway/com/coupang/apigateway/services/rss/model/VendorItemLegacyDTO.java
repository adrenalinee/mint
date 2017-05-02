package com.coupang.apigateway.services.rss.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
public class VendorItemLegacyDTO   {
  
  private Long vendorItemPackageId = null;
  private String vendorItemName = null;
  private Long vendorItemId = null;
  private String vendorId = null;
  private Boolean valid = null;
  private Long useableVolume = null;
  private Date useStartDate = null;
  private Date useEndDate = null;
  private String teamCode = null;
  private String subTitle = null;
  private Integer soldCount = null;
  private Date saleStartedAt = null;
  private Double salePrice = null;
  private String salePeriodType = null;
  private Date saleEndedAt = null;


  public enum ProductServicePlatformTypeEnum {
    VITAMIN("VITAMIN"),
    COUPANG_LEGACY("COUPANG_LEGACY");

    private String value;

    ProductServicePlatformTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ProductServicePlatformTypeEnum productServicePlatformType = null;
  private Long productId = null;
  private String primeType = null;
  private Double paymentForVendor = null;
  private Double originalPrice = null;
  private String notice = null;
  private String mixPackYn = null;
  private String mdId = null;
  private Integer maximumBuyCount = null;
  private Integer maxMixPackCnt = null;
  private Long itemId = null;
  private Integer inventory = null;
  private String externalCode = null;


  public enum CouponUseTypeEnum {
    NORMAL("NORMAL"),
    NUMBER("NUMBER"),
    DEDUCTION("DEDUCTION");

    private String value;

    CouponUseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private CouponUseTypeEnum couponUseType = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemName")
  public String getVendorItemName() {
    return vendorItemName;
  }
  
  /**
   **/
  public void setVendorItemName(String vendorItemName) {
    this.vendorItemName = vendorItemName;
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useableVolume")
  @com.fasterxml.jackson.annotation.JsonProperty("useableVolume")
  public Long getUseableVolume() {
    return useableVolume;
  }
  
  /**
   **/
  public void setUseableVolume(Long useableVolume) {
    this.useableVolume = useableVolume;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useStartDate")
  @com.fasterxml.jackson.annotation.JsonProperty("useStartDate")
  public Date getUseStartDate() {
    return useStartDate;
  }
  
  /**
   **/
  public void setUseStartDate(Date useStartDate) {
    this.useStartDate = useStartDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useEndDate")
  @com.fasterxml.jackson.annotation.JsonProperty("useEndDate")
  public Date getUseEndDate() {
    return useEndDate;
  }
  
  /**
   **/
  public void setUseEndDate(Date useEndDate) {
    this.useEndDate = useEndDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("teamCode")
  @com.fasterxml.jackson.annotation.JsonProperty("teamCode")
  public String getTeamCode() {
    return teamCode;
  }
  
  /**
   **/
  public void setTeamCode(String teamCode) {
    this.teamCode = teamCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("subTitle")
  public String getSubTitle() {
    return subTitle;
  }
  
  /**
   **/
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldCount")
  @com.fasterxml.jackson.annotation.JsonProperty("soldCount")
  public Integer getSoldCount() {
    return soldCount;
  }
  
  /**
   **/
  public void setSoldCount(Integer soldCount) {
    this.soldCount = soldCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("saleStartedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("saleStartedAt")
  public Date getSaleStartedAt() {
    return saleStartedAt;
  }
  
  /**
   **/
  public void setSaleStartedAt(Date saleStartedAt) {
    this.saleStartedAt = saleStartedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salePrice")
  public Double getSalePrice() {
    return salePrice;
  }
  
  /**
   **/
  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salePeriodType")
  @com.fasterxml.jackson.annotation.JsonProperty("salePeriodType")
  public String getSalePeriodType() {
    return salePeriodType;
  }
  
  /**
   **/
  public void setSalePeriodType(String salePeriodType) {
    this.salePeriodType = salePeriodType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("saleEndedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("saleEndedAt")
  public Date getSaleEndedAt() {
    return saleEndedAt;
  }
  
  /**
   **/
  public void setSaleEndedAt(Date saleEndedAt) {
    this.saleEndedAt = saleEndedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productServicePlatformType")
  @com.fasterxml.jackson.annotation.JsonProperty("productServicePlatformType")
  public ProductServicePlatformTypeEnum getProductServicePlatformType() {
    return productServicePlatformType;
  }
  
  /**
   **/
  public void setProductServicePlatformType(ProductServicePlatformTypeEnum productServicePlatformType) {
    this.productServicePlatformType = productServicePlatformType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("primeType")
  @com.fasterxml.jackson.annotation.JsonProperty("primeType")
  public String getPrimeType() {
    return primeType;
  }
  
  /**
   **/
  public void setPrimeType(String primeType) {
    this.primeType = primeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("paymentForVendor")
  @com.fasterxml.jackson.annotation.JsonProperty("paymentForVendor")
  public Double getPaymentForVendor() {
    return paymentForVendor;
  }
  
  /**
   **/
  public void setPaymentForVendor(Double paymentForVendor) {
    this.paymentForVendor = paymentForVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originalPrice")
  public Double getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("notice")
  @com.fasterxml.jackson.annotation.JsonProperty("notice")
  public String getNotice() {
    return notice;
  }
  
  /**
   **/
  public void setNotice(String notice) {
    this.notice = notice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mixPackYn")
  @com.fasterxml.jackson.annotation.JsonProperty("mixPackYn")
  public String getMixPackYn() {
    return mixPackYn;
  }
  
  /**
   **/
  public void setMixPackYn(String mixPackYn) {
    this.mixPackYn = mixPackYn;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mdId")
  @com.fasterxml.jackson.annotation.JsonProperty("mdId")
  public String getMdId() {
    return mdId;
  }
  
  /**
   **/
  public void setMdId(String mdId) {
    this.mdId = mdId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyCount")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyCount")
  public Integer getMaximumBuyCount() {
    return maximumBuyCount;
  }
  
  /**
   **/
  public void setMaximumBuyCount(Integer maximumBuyCount) {
    this.maximumBuyCount = maximumBuyCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxMixPackCnt")
  @com.fasterxml.jackson.annotation.JsonProperty("maxMixPackCnt")
  public Integer getMaxMixPackCnt() {
    return maxMixPackCnt;
  }
  
  /**
   **/
  public void setMaxMixPackCnt(Integer maxMixPackCnt) {
    this.maxMixPackCnt = maxMixPackCnt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("inventory")
  @com.fasterxml.jackson.annotation.JsonProperty("inventory")
  public Integer getInventory() {
    return inventory;
  }
  
  /**
   **/
  public void setInventory(Integer inventory) {
    this.inventory = inventory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("externalCode")
  @com.fasterxml.jackson.annotation.JsonProperty("externalCode")
  public String getExternalCode() {
    return externalCode;
  }
  
  /**
   **/
  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("couponUseType")
  @com.fasterxml.jackson.annotation.JsonProperty("couponUseType")
  public CouponUseTypeEnum getCouponUseType() {
    return couponUseType;
  }
  
  /**
   **/
  public void setCouponUseType(CouponUseTypeEnum couponUseType) {
    this.couponUseType = couponUseType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemLegacyDTO vendorItemLegacyDTO = (VendorItemLegacyDTO) o;
    return Objects.equals(this.vendorItemPackageId, vendorItemLegacyDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemName, vendorItemLegacyDTO.vendorItemName) &&
        Objects.equals(this.vendorItemId, vendorItemLegacyDTO.vendorItemId) &&
        Objects.equals(this.vendorId, vendorItemLegacyDTO.vendorId) &&
        Objects.equals(this.valid, vendorItemLegacyDTO.valid) &&
        Objects.equals(this.useableVolume, vendorItemLegacyDTO.useableVolume) &&
        Objects.equals(this.useStartDate, vendorItemLegacyDTO.useStartDate) &&
        Objects.equals(this.useEndDate, vendorItemLegacyDTO.useEndDate) &&
        Objects.equals(this.teamCode, vendorItemLegacyDTO.teamCode) &&
        Objects.equals(this.subTitle, vendorItemLegacyDTO.subTitle) &&
        Objects.equals(this.soldCount, vendorItemLegacyDTO.soldCount) &&
        Objects.equals(this.saleStartedAt, vendorItemLegacyDTO.saleStartedAt) &&
        Objects.equals(this.salePrice, vendorItemLegacyDTO.salePrice) &&
        Objects.equals(this.salePeriodType, vendorItemLegacyDTO.salePeriodType) &&
        Objects.equals(this.saleEndedAt, vendorItemLegacyDTO.saleEndedAt) &&
        Objects.equals(this.productServicePlatformType, vendorItemLegacyDTO.productServicePlatformType) &&
        Objects.equals(this.productId, vendorItemLegacyDTO.productId) &&
        Objects.equals(this.primeType, vendorItemLegacyDTO.primeType) &&
        Objects.equals(this.paymentForVendor, vendorItemLegacyDTO.paymentForVendor) &&
        Objects.equals(this.originalPrice, vendorItemLegacyDTO.originalPrice) &&
        Objects.equals(this.notice, vendorItemLegacyDTO.notice) &&
        Objects.equals(this.mixPackYn, vendorItemLegacyDTO.mixPackYn) &&
        Objects.equals(this.mdId, vendorItemLegacyDTO.mdId) &&
        Objects.equals(this.maximumBuyCount, vendorItemLegacyDTO.maximumBuyCount) &&
        Objects.equals(this.maxMixPackCnt, vendorItemLegacyDTO.maxMixPackCnt) &&
        Objects.equals(this.itemId, vendorItemLegacyDTO.itemId) &&
        Objects.equals(this.inventory, vendorItemLegacyDTO.inventory) &&
        Objects.equals(this.externalCode, vendorItemLegacyDTO.externalCode) &&
        Objects.equals(this.couponUseType, vendorItemLegacyDTO.couponUseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageId, vendorItemName, vendorItemId, vendorId, valid, useableVolume, useStartDate, useEndDate, teamCode, subTitle, soldCount, saleStartedAt, salePrice, salePeriodType, saleEndedAt, productServicePlatformType, productId, primeType, paymentForVendor, originalPrice, notice, mixPackYn, mdId, maximumBuyCount, maxMixPackCnt, itemId, inventory, externalCode, couponUseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemLegacyDTO {\n");
    
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    useableVolume: ").append(toIndentedString(useableVolume)).append("\n");
    sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
    sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
    sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
    sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    mixPackYn: ").append(toIndentedString(mixPackYn)).append("\n");
    sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
    sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
    sb.append("    maxMixPackCnt: ").append(toIndentedString(maxMixPackCnt)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
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

  public static VendorItemLegacyDTOBuilder builder() {
    return new VendorItemLegacyDTOBuilder();
  }

  public static class VendorItemLegacyDTOBuilder {

    private Long vendorItemPackageId = null;
    private String vendorItemName = null;
    private Long vendorItemId = null;
    private String vendorId = null;
    private Boolean valid = null;
    private Long useableVolume = null;
    private Date useStartDate = null;
    private Date useEndDate = null;
    private String teamCode = null;
    private String subTitle = null;
    private Integer soldCount = null;
    private Date saleStartedAt = null;
    private Double salePrice = null;
    private String salePeriodType = null;
    private Date saleEndedAt = null;
    private ProductServicePlatformTypeEnum productServicePlatformType = null;
    private Long productId = null;
    private String primeType = null;
    private Double paymentForVendor = null;
    private Double originalPrice = null;
    private String notice = null;
    private String mixPackYn = null;
    private String mdId = null;
    private Integer maximumBuyCount = null;
    private Integer maxMixPackCnt = null;
    private Long itemId = null;
    private Integer inventory = null;
    private String externalCode = null;
    private CouponUseTypeEnum couponUseType = null;
    

    VendorItemLegacyDTOBuilder() {
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder vendorItemName(String vendorItemName) {
      this.vendorItemName = vendorItemName;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder useableVolume(Long useableVolume) {
      this.useableVolume = useableVolume;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder teamCode(String teamCode) {
      this.teamCode = teamCode;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder subTitle(String subTitle) {
      this.subTitle = subTitle;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder saleStartedAt(Date saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder salePrice(Double salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder saleEndedAt(Date saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder productServicePlatformType(ProductServicePlatformTypeEnum productServicePlatformType) {
      this.productServicePlatformType = productServicePlatformType;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder primeType(String primeType) {
      this.primeType = primeType;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder paymentForVendor(Double paymentForVendor) {
      this.paymentForVendor = paymentForVendor;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder originalPrice(Double originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder notice(String notice) {
      this.notice = notice;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder mixPackYn(String mixPackYn) {
      this.mixPackYn = mixPackYn;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder mdId(String mdId) {
      this.mdId = mdId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder maxMixPackCnt(Integer maxMixPackCnt) {
      this.maxMixPackCnt = maxMixPackCnt;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder inventory(Integer inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder externalCode(String externalCode) {
      this.externalCode = externalCode;
      return this;
    }

    /**
     **/
    public VendorItemLegacyDTOBuilder couponUseType(CouponUseTypeEnum couponUseType) {
      this.couponUseType = couponUseType;
      return this;
    }


    public VendorItemLegacyDTO build() {
      VendorItemLegacyDTO vendorItemLegacyDTO = new VendorItemLegacyDTO();
      vendorItemLegacyDTO.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemLegacyDTO.setVendorItemName(this.vendorItemName);
      vendorItemLegacyDTO.setVendorItemId(this.vendorItemId);
      vendorItemLegacyDTO.setVendorId(this.vendorId);
      vendorItemLegacyDTO.setValid(this.valid);
      vendorItemLegacyDTO.setUseableVolume(this.useableVolume);
      vendorItemLegacyDTO.setUseStartDate(this.useStartDate);
      vendorItemLegacyDTO.setUseEndDate(this.useEndDate);
      vendorItemLegacyDTO.setTeamCode(this.teamCode);
      vendorItemLegacyDTO.setSubTitle(this.subTitle);
      vendorItemLegacyDTO.setSoldCount(this.soldCount);
      vendorItemLegacyDTO.setSaleStartedAt(this.saleStartedAt);
      vendorItemLegacyDTO.setSalePrice(this.salePrice);
      vendorItemLegacyDTO.setSalePeriodType(this.salePeriodType);
      vendorItemLegacyDTO.setSaleEndedAt(this.saleEndedAt);
      vendorItemLegacyDTO.setProductServicePlatformType(this.productServicePlatformType);
      vendorItemLegacyDTO.setProductId(this.productId);
      vendorItemLegacyDTO.setPrimeType(this.primeType);
      vendorItemLegacyDTO.setPaymentForVendor(this.paymentForVendor);
      vendorItemLegacyDTO.setOriginalPrice(this.originalPrice);
      vendorItemLegacyDTO.setNotice(this.notice);
      vendorItemLegacyDTO.setMixPackYn(this.mixPackYn);
      vendorItemLegacyDTO.setMdId(this.mdId);
      vendorItemLegacyDTO.setMaximumBuyCount(this.maximumBuyCount);
      vendorItemLegacyDTO.setMaxMixPackCnt(this.maxMixPackCnt);
      vendorItemLegacyDTO.setItemId(this.itemId);
      vendorItemLegacyDTO.setInventory(this.inventory);
      vendorItemLegacyDTO.setExternalCode(this.externalCode);
      vendorItemLegacyDTO.setCouponUseType(this.couponUseType);
      return vendorItemLegacyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemLegacyDTOBuilder {\n");
      
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    useableVolume: ").append(toIndentedString(useableVolume)).append("\n");
      sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
      sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
      sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
      sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
      sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
      sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
      sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
      sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
      sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
      sb.append("    mixPackYn: ").append(toIndentedString(mixPackYn)).append("\n");
      sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
      sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
      sb.append("    maxMixPackCnt: ").append(toIndentedString(maxMixPackCnt)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
      sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
      sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
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

