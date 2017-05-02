package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class DisplayItem   {
  
  private String webRecommend = null;
  private String webMainTop = null;
  private String unitDescription = null;
  private Integer totalSalesCount = null;
  private String title = null;
  private java.math.BigDecimal subscribeSalePrice = null;
  private java.math.BigDecimal subscribeDiscountRate = null;
  private Boolean subscribable = null;
  private Integer soldoutApproachCount = null;
  private Boolean shownUseDate = null;
  private Boolean shownPremium = null;


  public enum SellingStatusTypeEnum {
    ONSALES("ONSALES"),
    UNLIMITED_SALES("UNLIMITED_SALES"),
    SOLDOUT("SOLDOUT"),
    ALMOST_SOLDOUT("ALMOST_SOLDOUT");

    private String value;

    SellingStatusTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private SellingStatusTypeEnum sellingStatusType = null;
  private Double savingPoint = null;
  private Integer salesPrice = null;
  private Integer salesCount = null;
  private Long representativeDisplayCategoryCode = null;
  private String primeDealType = null;
  private Boolean payOnDelivery = null;
  private Boolean overseasPurchase = null;
  private Integer overAmountFreeshipping = null;
  private String originalPriceType = null;
  private Integer originalPrice = null;
  private String openTime = null;
  private Date onSaleStart = null;
  private Date onSaleEnd = null;
  private Boolean newMemberOnly = null;
  private String mobileWebShow = null;
  private String mobileThumbnail = null;
  private String mobileSquare = null;
  private String mobileSlide = null;
  private String mobileShow = null;
  private String mobilePanorama = null;
  private String mobileDetail = null;
  private Integer minNumberForDisplaySalesCount = null;
  private java.math.BigDecimal lowestOptionPrice = null;
  private Long lowestOptionNumber = null;
  private String logisticsType = null;
  private String isValid = null;
  private String isCoupangShow = null;
  private Boolean isAdult = null;
  private Long id = null;
  private Date forUseStartDate = null;
  private String forUseStart = null;
  private Date forUseEndDate = null;
  private String forUseEnd = null;
  private String forUseDateName = null;


  public enum DivisionTypeEnum {
    GOODS("GOODS"),
    LOCAL("LOCAL"),
    TRAVEL("TRAVEL"),
    CULTURE("CULTURE"),
    VOUCHER("VOUCHER"),
    EBOOK("EBOOK"),
    BOOKING("BOOKING");

    private String value;

    DivisionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private DivisionTypeEnum divisionType = null;
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private String discountType = null;
  private Double discountRate = null;
  private String discountName = null;
  private Boolean directlyUse = null;
  private String descriptionMessage = null;
  private String description = null;
  private Boolean deliveryProduct = null;
  private List<Integer> deliveryPeriods = new ArrayList<Integer>();
  private String deliveryPeriodUnit = null;
  private Integer deliverPrice = null;
  private String criteriaPriceInfo = null;
  private String cornerTagType = null;
  private Boolean conditionalFreeshipping = null;
  private String closeTime = null;
  private Integer bundleDealPrice = null;
  private Integer bundleDealEa = null;
  private String bannerSuggest = null;
  private String bannerList = null;
  private String bannerLeftFloat = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("webRecommend")
  @com.fasterxml.jackson.annotation.JsonProperty("webRecommend")
  public String getWebRecommend() {
    return webRecommend;
  }
  
  /**
   **/
  public void setWebRecommend(String webRecommend) {
    this.webRecommend = webRecommend;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("webMainTop")
  @com.fasterxml.jackson.annotation.JsonProperty("webMainTop")
  public String getWebMainTop() {
    return webMainTop;
  }
  
  /**
   **/
  public void setWebMainTop(String webMainTop) {
    this.webMainTop = webMainTop;
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
  @org.codehaus.jackson.annotate.JsonProperty("totalSalesCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalSalesCount")
  public Integer getTotalSalesCount() {
    return totalSalesCount;
  }
  
  /**
   **/
  public void setTotalSalesCount(Integer totalSalesCount) {
    this.totalSalesCount = totalSalesCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeSalePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeSalePrice")
  public java.math.BigDecimal getSubscribeSalePrice() {
    return subscribeSalePrice;
  }
  
  /**
   **/
  public void setSubscribeSalePrice(java.math.BigDecimal subscribeSalePrice) {
    this.subscribeSalePrice = subscribeSalePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeDiscountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeDiscountRate")
  public java.math.BigDecimal getSubscribeDiscountRate() {
    return subscribeDiscountRate;
  }
  
  /**
   **/
  public void setSubscribeDiscountRate(java.math.BigDecimal subscribeDiscountRate) {
    this.subscribeDiscountRate = subscribeDiscountRate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribable")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribable")
  public Boolean getSubscribable() {
    return subscribable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSubscribable() {
    return subscribable == null ? false : subscribable;
  }
  
  /**
   **/
  public void setSubscribable(Boolean subscribable) {
    this.subscribable = subscribable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldoutApproachCount")
  @com.fasterxml.jackson.annotation.JsonProperty("soldoutApproachCount")
  public Integer getSoldoutApproachCount() {
    return soldoutApproachCount;
  }
  
  /**
   **/
  public void setSoldoutApproachCount(Integer soldoutApproachCount) {
    this.soldoutApproachCount = soldoutApproachCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shownUseDate")
  @com.fasterxml.jackson.annotation.JsonProperty("shownUseDate")
  public Boolean getShownUseDate() {
    return shownUseDate;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShownUseDate() {
    return shownUseDate == null ? false : shownUseDate;
  }
  
  /**
   **/
  public void setShownUseDate(Boolean shownUseDate) {
    this.shownUseDate = shownUseDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shownPremium")
  @com.fasterxml.jackson.annotation.JsonProperty("shownPremium")
  public Boolean getShownPremium() {
    return shownPremium;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isShownPremium() {
    return shownPremium == null ? false : shownPremium;
  }
  
  /**
   **/
  public void setShownPremium(Boolean shownPremium) {
    this.shownPremium = shownPremium;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellingStatusType")
  @com.fasterxml.jackson.annotation.JsonProperty("sellingStatusType")
  public SellingStatusTypeEnum getSellingStatusType() {
    return sellingStatusType;
  }
  
  /**
   **/
  public void setSellingStatusType(SellingStatusTypeEnum sellingStatusType) {
    this.sellingStatusType = sellingStatusType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("savingPoint")
  @com.fasterxml.jackson.annotation.JsonProperty("savingPoint")
  public Double getSavingPoint() {
    return savingPoint;
  }
  
  /**
   **/
  public void setSavingPoint(Double savingPoint) {
    this.savingPoint = savingPoint;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public Integer getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(Integer salesPrice) {
    this.salesPrice = salesPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesCount")
  @com.fasterxml.jackson.annotation.JsonProperty("salesCount")
  public Integer getSalesCount() {
    return salesCount;
  }
  
  /**
   **/
  public void setSalesCount(Integer salesCount) {
    this.salesCount = salesCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representativeDisplayCategoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("representativeDisplayCategoryCode")
  public Long getRepresentativeDisplayCategoryCode() {
    return representativeDisplayCategoryCode;
  }
  
  /**
   **/
  public void setRepresentativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
    this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("primeDealType")
  @com.fasterxml.jackson.annotation.JsonProperty("primeDealType")
  public String getPrimeDealType() {
    return primeDealType;
  }
  
  /**
   **/
  public void setPrimeDealType(String primeDealType) {
    this.primeDealType = primeDealType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("payOnDelivery")
  @com.fasterxml.jackson.annotation.JsonProperty("payOnDelivery")
  public Boolean getPayOnDelivery() {
    return payOnDelivery;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isPayOnDelivery() {
    return payOnDelivery == null ? false : payOnDelivery;
  }
  
  /**
   **/
  public void setPayOnDelivery(Boolean payOnDelivery) {
    this.payOnDelivery = payOnDelivery;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overseasPurchase")
  @com.fasterxml.jackson.annotation.JsonProperty("overseasPurchase")
  public Boolean getOverseasPurchase() {
    return overseasPurchase;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOverseasPurchase() {
    return overseasPurchase == null ? false : overseasPurchase;
  }
  
  /**
   **/
  public void setOverseasPurchase(Boolean overseasPurchase) {
    this.overseasPurchase = overseasPurchase;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overAmountFreeshipping")
  @com.fasterxml.jackson.annotation.JsonProperty("overAmountFreeshipping")
  public Integer getOverAmountFreeshipping() {
    return overAmountFreeshipping;
  }
  
  /**
   **/
  public void setOverAmountFreeshipping(Integer overAmountFreeshipping) {
    this.overAmountFreeshipping = overAmountFreeshipping;
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
  public Integer getOriginalPrice() {
    return originalPrice;
  }
  
  /**
   **/
  public void setOriginalPrice(Integer originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("openTime")
  @com.fasterxml.jackson.annotation.JsonProperty("openTime")
  public String getOpenTime() {
    return openTime;
  }
  
  /**
   **/
  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("onSaleStart")
  @com.fasterxml.jackson.annotation.JsonProperty("onSaleStart")
  public Date getOnSaleStart() {
    return onSaleStart;
  }
  
  /**
   **/
  public void setOnSaleStart(Date onSaleStart) {
    this.onSaleStart = onSaleStart;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("onSaleEnd")
  @com.fasterxml.jackson.annotation.JsonProperty("onSaleEnd")
  public Date getOnSaleEnd() {
    return onSaleEnd;
  }
  
  /**
   **/
  public void setOnSaleEnd(Date onSaleEnd) {
    this.onSaleEnd = onSaleEnd;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("newMemberOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("newMemberOnly")
  public Boolean getNewMemberOnly() {
    return newMemberOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isNewMemberOnly() {
    return newMemberOnly == null ? false : newMemberOnly;
  }
  
  /**
   **/
  public void setNewMemberOnly(Boolean newMemberOnly) {
    this.newMemberOnly = newMemberOnly;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileWebShow")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileWebShow")
  public String getMobileWebShow() {
    return mobileWebShow;
  }
  
  /**
   **/
  public void setMobileWebShow(String mobileWebShow) {
    this.mobileWebShow = mobileWebShow;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileThumbnail")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileThumbnail")
  public String getMobileThumbnail() {
    return mobileThumbnail;
  }
  
  /**
   **/
  public void setMobileThumbnail(String mobileThumbnail) {
    this.mobileThumbnail = mobileThumbnail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileSquare")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileSquare")
  public String getMobileSquare() {
    return mobileSquare;
  }
  
  /**
   **/
  public void setMobileSquare(String mobileSquare) {
    this.mobileSquare = mobileSquare;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileSlide")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileSlide")
  public String getMobileSlide() {
    return mobileSlide;
  }
  
  /**
   **/
  public void setMobileSlide(String mobileSlide) {
    this.mobileSlide = mobileSlide;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileShow")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileShow")
  public String getMobileShow() {
    return mobileShow;
  }
  
  /**
   **/
  public void setMobileShow(String mobileShow) {
    this.mobileShow = mobileShow;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobilePanorama")
  @com.fasterxml.jackson.annotation.JsonProperty("mobilePanorama")
  public String getMobilePanorama() {
    return mobilePanorama;
  }
  
  /**
   **/
  public void setMobilePanorama(String mobilePanorama) {
    this.mobilePanorama = mobilePanorama;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileDetail")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileDetail")
  public String getMobileDetail() {
    return mobileDetail;
  }
  
  /**
   **/
  public void setMobileDetail(String mobileDetail) {
    this.mobileDetail = mobileDetail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minNumberForDisplaySalesCount")
  @com.fasterxml.jackson.annotation.JsonProperty("minNumberForDisplaySalesCount")
  public Integer getMinNumberForDisplaySalesCount() {
    return minNumberForDisplaySalesCount;
  }
  
  /**
   **/
  public void setMinNumberForDisplaySalesCount(Integer minNumberForDisplaySalesCount) {
    this.minNumberForDisplaySalesCount = minNumberForDisplaySalesCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lowestOptionPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("lowestOptionPrice")
  public java.math.BigDecimal getLowestOptionPrice() {
    return lowestOptionPrice;
  }
  
  /**
   **/
  public void setLowestOptionPrice(java.math.BigDecimal lowestOptionPrice) {
    this.lowestOptionPrice = lowestOptionPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lowestOptionNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("lowestOptionNumber")
  public Long getLowestOptionNumber() {
    return lowestOptionNumber;
  }
  
  /**
   **/
  public void setLowestOptionNumber(Long lowestOptionNumber) {
    this.lowestOptionNumber = lowestOptionNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logisticsType")
  @com.fasterxml.jackson.annotation.JsonProperty("logisticsType")
  public String getLogisticsType() {
    return logisticsType;
  }
  
  /**
   **/
  public void setLogisticsType(String logisticsType) {
    this.logisticsType = logisticsType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isValid")
  @com.fasterxml.jackson.annotation.JsonProperty("isValid")
  public String getIsValid() {
    return isValid;
  }
  
  /**
   **/
  public void setIsValid(String isValid) {
    this.isValid = isValid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isCoupangShow")
  @com.fasterxml.jackson.annotation.JsonProperty("isCoupangShow")
  public String getIsCoupangShow() {
    return isCoupangShow;
  }
  
  /**
   **/
  public void setIsCoupangShow(String isCoupangShow) {
    this.isCoupangShow = isCoupangShow;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAdult")
  @com.fasterxml.jackson.annotation.JsonProperty("isAdult")
  public Boolean getIsAdult() {
    return isAdult;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAdult() {
    return isAdult == null ? false : isAdult;
  }
  
  /**
   **/
  public void setIsAdult(Boolean isAdult) {
    this.isAdult = isAdult;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forUseStartDate")
  @com.fasterxml.jackson.annotation.JsonProperty("forUseStartDate")
  public Date getForUseStartDate() {
    return forUseStartDate;
  }
  
  /**
   **/
  public void setForUseStartDate(Date forUseStartDate) {
    this.forUseStartDate = forUseStartDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forUseStart")
  @com.fasterxml.jackson.annotation.JsonProperty("forUseStart")
  public String getForUseStart() {
    return forUseStart;
  }
  
  /**
   **/
  public void setForUseStart(String forUseStart) {
    this.forUseStart = forUseStart;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forUseEndDate")
  @com.fasterxml.jackson.annotation.JsonProperty("forUseEndDate")
  public Date getForUseEndDate() {
    return forUseEndDate;
  }
  
  /**
   **/
  public void setForUseEndDate(Date forUseEndDate) {
    this.forUseEndDate = forUseEndDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forUseEnd")
  @com.fasterxml.jackson.annotation.JsonProperty("forUseEnd")
  public String getForUseEnd() {
    return forUseEnd;
  }
  
  /**
   **/
  public void setForUseEnd(String forUseEnd) {
    this.forUseEnd = forUseEnd;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("forUseDateName")
  @com.fasterxml.jackson.annotation.JsonProperty("forUseDateName")
  public String getForUseDateName() {
    return forUseDateName;
  }
  
  /**
   **/
  public void setForUseDateName(String forUseDateName) {
    this.forUseDateName = forUseDateName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("divisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionType")
  public DivisionTypeEnum getDivisionType() {
    return divisionType;
  }
  
  /**
   **/
  public void setDivisionType(DivisionTypeEnum divisionType) {
    this.divisionType = divisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayCategoryCodes")
  @com.fasterxml.jackson.annotation.JsonProperty("displayCategoryCodes")
  public List<Long> getDisplayCategoryCodes() {
    return displayCategoryCodes;
  }
  
  /**
   **/
  public void setDisplayCategoryCodes(List<Long> displayCategoryCodes) {
    this.displayCategoryCodes = displayCategoryCodes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountType")
  @com.fasterxml.jackson.annotation.JsonProperty("discountType")
  public String getDiscountType() {
    return discountType;
  }
  
  /**
   **/
  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("discountRate")
  public Double getDiscountRate() {
    return discountRate;
  }
  
  /**
   **/
  public void setDiscountRate(Double discountRate) {
    this.discountRate = discountRate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountName")
  @com.fasterxml.jackson.annotation.JsonProperty("discountName")
  public String getDiscountName() {
    return discountName;
  }
  
  /**
   **/
  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("directlyUse")
  @com.fasterxml.jackson.annotation.JsonProperty("directlyUse")
  public Boolean getDirectlyUse() {
    return directlyUse;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDirectlyUse() {
    return directlyUse == null ? false : directlyUse;
  }
  
  /**
   **/
  public void setDirectlyUse(Boolean directlyUse) {
    this.directlyUse = directlyUse;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("descriptionMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("descriptionMessage")
  public String getDescriptionMessage() {
    return descriptionMessage;
  }
  
  /**
   **/
  public void setDescriptionMessage(String descriptionMessage) {
    this.descriptionMessage = descriptionMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryProduct")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryProduct")
  public Boolean getDeliveryProduct() {
    return deliveryProduct;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDeliveryProduct() {
    return deliveryProduct == null ? false : deliveryProduct;
  }
  
  /**
   **/
  public void setDeliveryProduct(Boolean deliveryProduct) {
    this.deliveryProduct = deliveryProduct;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPeriods")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPeriods")
  public List<Integer> getDeliveryPeriods() {
    return deliveryPeriods;
  }
  
  /**
   **/
  public void setDeliveryPeriods(List<Integer> deliveryPeriods) {
    this.deliveryPeriods = deliveryPeriods;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPeriodUnit")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPeriodUnit")
  public String getDeliveryPeriodUnit() {
    return deliveryPeriodUnit;
  }
  
  /**
   **/
  public void setDeliveryPeriodUnit(String deliveryPeriodUnit) {
    this.deliveryPeriodUnit = deliveryPeriodUnit;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliverPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("deliverPrice")
  public Integer getDeliverPrice() {
    return deliverPrice;
  }
  
  /**
   **/
  public void setDeliverPrice(Integer deliverPrice) {
    this.deliverPrice = deliverPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("criteriaPriceInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("criteriaPriceInfo")
  public String getCriteriaPriceInfo() {
    return criteriaPriceInfo;
  }
  
  /**
   **/
  public void setCriteriaPriceInfo(String criteriaPriceInfo) {
    this.criteriaPriceInfo = criteriaPriceInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cornerTagType")
  @com.fasterxml.jackson.annotation.JsonProperty("cornerTagType")
  public String getCornerTagType() {
    return cornerTagType;
  }
  
  /**
   **/
  public void setCornerTagType(String cornerTagType) {
    this.cornerTagType = cornerTagType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("conditionalFreeshipping")
  @com.fasterxml.jackson.annotation.JsonProperty("conditionalFreeshipping")
  public Boolean getConditionalFreeshipping() {
    return conditionalFreeshipping;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isConditionalFreeshipping() {
    return conditionalFreeshipping == null ? false : conditionalFreeshipping;
  }
  
  /**
   **/
  public void setConditionalFreeshipping(Boolean conditionalFreeshipping) {
    this.conditionalFreeshipping = conditionalFreeshipping;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("closeTime")
  @com.fasterxml.jackson.annotation.JsonProperty("closeTime")
  public String getCloseTime() {
    return closeTime;
  }
  
  /**
   **/
  public void setCloseTime(String closeTime) {
    this.closeTime = closeTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundleDealPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("bundleDealPrice")
  public Integer getBundleDealPrice() {
    return bundleDealPrice;
  }
  
  /**
   **/
  public void setBundleDealPrice(Integer bundleDealPrice) {
    this.bundleDealPrice = bundleDealPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundleDealEa")
  @com.fasterxml.jackson.annotation.JsonProperty("bundleDealEa")
  public Integer getBundleDealEa() {
    return bundleDealEa;
  }
  
  /**
   **/
  public void setBundleDealEa(Integer bundleDealEa) {
    this.bundleDealEa = bundleDealEa;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerSuggest")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerSuggest")
  public String getBannerSuggest() {
    return bannerSuggest;
  }
  
  /**
   **/
  public void setBannerSuggest(String bannerSuggest) {
    this.bannerSuggest = bannerSuggest;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerList")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerList")
  public String getBannerList() {
    return bannerList;
  }
  
  /**
   **/
  public void setBannerList(String bannerList) {
    this.bannerList = bannerList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerLeftFloat")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerLeftFloat")
  public String getBannerLeftFloat() {
    return bannerLeftFloat;
  }
  
  /**
   **/
  public void setBannerLeftFloat(String bannerLeftFloat) {
    this.bannerLeftFloat = bannerLeftFloat;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayItem displayItem = (DisplayItem) o;
    return Objects.equals(this.webRecommend, displayItem.webRecommend) &&
        Objects.equals(this.webMainTop, displayItem.webMainTop) &&
        Objects.equals(this.unitDescription, displayItem.unitDescription) &&
        Objects.equals(this.totalSalesCount, displayItem.totalSalesCount) &&
        Objects.equals(this.title, displayItem.title) &&
        Objects.equals(this.subscribeSalePrice, displayItem.subscribeSalePrice) &&
        Objects.equals(this.subscribeDiscountRate, displayItem.subscribeDiscountRate) &&
        Objects.equals(this.subscribable, displayItem.subscribable) &&
        Objects.equals(this.soldoutApproachCount, displayItem.soldoutApproachCount) &&
        Objects.equals(this.shownUseDate, displayItem.shownUseDate) &&
        Objects.equals(this.shownPremium, displayItem.shownPremium) &&
        Objects.equals(this.sellingStatusType, displayItem.sellingStatusType) &&
        Objects.equals(this.savingPoint, displayItem.savingPoint) &&
        Objects.equals(this.salesPrice, displayItem.salesPrice) &&
        Objects.equals(this.salesCount, displayItem.salesCount) &&
        Objects.equals(this.representativeDisplayCategoryCode, displayItem.representativeDisplayCategoryCode) &&
        Objects.equals(this.primeDealType, displayItem.primeDealType) &&
        Objects.equals(this.payOnDelivery, displayItem.payOnDelivery) &&
        Objects.equals(this.overseasPurchase, displayItem.overseasPurchase) &&
        Objects.equals(this.overAmountFreeshipping, displayItem.overAmountFreeshipping) &&
        Objects.equals(this.originalPriceType, displayItem.originalPriceType) &&
        Objects.equals(this.originalPrice, displayItem.originalPrice) &&
        Objects.equals(this.openTime, displayItem.openTime) &&
        Objects.equals(this.onSaleStart, displayItem.onSaleStart) &&
        Objects.equals(this.onSaleEnd, displayItem.onSaleEnd) &&
        Objects.equals(this.newMemberOnly, displayItem.newMemberOnly) &&
        Objects.equals(this.mobileWebShow, displayItem.mobileWebShow) &&
        Objects.equals(this.mobileThumbnail, displayItem.mobileThumbnail) &&
        Objects.equals(this.mobileSquare, displayItem.mobileSquare) &&
        Objects.equals(this.mobileSlide, displayItem.mobileSlide) &&
        Objects.equals(this.mobileShow, displayItem.mobileShow) &&
        Objects.equals(this.mobilePanorama, displayItem.mobilePanorama) &&
        Objects.equals(this.mobileDetail, displayItem.mobileDetail) &&
        Objects.equals(this.minNumberForDisplaySalesCount, displayItem.minNumberForDisplaySalesCount) &&
        Objects.equals(this.lowestOptionPrice, displayItem.lowestOptionPrice) &&
        Objects.equals(this.lowestOptionNumber, displayItem.lowestOptionNumber) &&
        Objects.equals(this.logisticsType, displayItem.logisticsType) &&
        Objects.equals(this.isValid, displayItem.isValid) &&
        Objects.equals(this.isCoupangShow, displayItem.isCoupangShow) &&
        Objects.equals(this.isAdult, displayItem.isAdult) &&
        Objects.equals(this.id, displayItem.id) &&
        Objects.equals(this.forUseStartDate, displayItem.forUseStartDate) &&
        Objects.equals(this.forUseStart, displayItem.forUseStart) &&
        Objects.equals(this.forUseEndDate, displayItem.forUseEndDate) &&
        Objects.equals(this.forUseEnd, displayItem.forUseEnd) &&
        Objects.equals(this.forUseDateName, displayItem.forUseDateName) &&
        Objects.equals(this.divisionType, displayItem.divisionType) &&
        Objects.equals(this.displayCategoryCodes, displayItem.displayCategoryCodes) &&
        Objects.equals(this.discountType, displayItem.discountType) &&
        Objects.equals(this.discountRate, displayItem.discountRate) &&
        Objects.equals(this.discountName, displayItem.discountName) &&
        Objects.equals(this.directlyUse, displayItem.directlyUse) &&
        Objects.equals(this.descriptionMessage, displayItem.descriptionMessage) &&
        Objects.equals(this.description, displayItem.description) &&
        Objects.equals(this.deliveryProduct, displayItem.deliveryProduct) &&
        Objects.equals(this.deliveryPeriods, displayItem.deliveryPeriods) &&
        Objects.equals(this.deliveryPeriodUnit, displayItem.deliveryPeriodUnit) &&
        Objects.equals(this.deliverPrice, displayItem.deliverPrice) &&
        Objects.equals(this.criteriaPriceInfo, displayItem.criteriaPriceInfo) &&
        Objects.equals(this.cornerTagType, displayItem.cornerTagType) &&
        Objects.equals(this.conditionalFreeshipping, displayItem.conditionalFreeshipping) &&
        Objects.equals(this.closeTime, displayItem.closeTime) &&
        Objects.equals(this.bundleDealPrice, displayItem.bundleDealPrice) &&
        Objects.equals(this.bundleDealEa, displayItem.bundleDealEa) &&
        Objects.equals(this.bannerSuggest, displayItem.bannerSuggest) &&
        Objects.equals(this.bannerList, displayItem.bannerList) &&
        Objects.equals(this.bannerLeftFloat, displayItem.bannerLeftFloat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webRecommend, webMainTop, unitDescription, totalSalesCount, title, subscribeSalePrice, subscribeDiscountRate, subscribable, soldoutApproachCount, shownUseDate, shownPremium, sellingStatusType, savingPoint, salesPrice, salesCount, representativeDisplayCategoryCode, primeDealType, payOnDelivery, overseasPurchase, overAmountFreeshipping, originalPriceType, originalPrice, openTime, onSaleStart, onSaleEnd, newMemberOnly, mobileWebShow, mobileThumbnail, mobileSquare, mobileSlide, mobileShow, mobilePanorama, mobileDetail, minNumberForDisplaySalesCount, lowestOptionPrice, lowestOptionNumber, logisticsType, isValid, isCoupangShow, isAdult, id, forUseStartDate, forUseStart, forUseEndDate, forUseEnd, forUseDateName, divisionType, displayCategoryCodes, discountType, discountRate, discountName, directlyUse, descriptionMessage, description, deliveryProduct, deliveryPeriods, deliveryPeriodUnit, deliverPrice, criteriaPriceInfo, cornerTagType, conditionalFreeshipping, closeTime, bundleDealPrice, bundleDealEa, bannerSuggest, bannerList, bannerLeftFloat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayItem {\n");
    
    sb.append("    webRecommend: ").append(toIndentedString(webRecommend)).append("\n");
    sb.append("    webMainTop: ").append(toIndentedString(webMainTop)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    totalSalesCount: ").append(toIndentedString(totalSalesCount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
    sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
    sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
    sb.append("    soldoutApproachCount: ").append(toIndentedString(soldoutApproachCount)).append("\n");
    sb.append("    shownUseDate: ").append(toIndentedString(shownUseDate)).append("\n");
    sb.append("    shownPremium: ").append(toIndentedString(shownPremium)).append("\n");
    sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
    sb.append("    savingPoint: ").append(toIndentedString(savingPoint)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
    sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
    sb.append("    primeDealType: ").append(toIndentedString(primeDealType)).append("\n");
    sb.append("    payOnDelivery: ").append(toIndentedString(payOnDelivery)).append("\n");
    sb.append("    overseasPurchase: ").append(toIndentedString(overseasPurchase)).append("\n");
    sb.append("    overAmountFreeshipping: ").append(toIndentedString(overAmountFreeshipping)).append("\n");
    sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
    sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
    sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
    sb.append("    mobileWebShow: ").append(toIndentedString(mobileWebShow)).append("\n");
    sb.append("    mobileThumbnail: ").append(toIndentedString(mobileThumbnail)).append("\n");
    sb.append("    mobileSquare: ").append(toIndentedString(mobileSquare)).append("\n");
    sb.append("    mobileSlide: ").append(toIndentedString(mobileSlide)).append("\n");
    sb.append("    mobileShow: ").append(toIndentedString(mobileShow)).append("\n");
    sb.append("    mobilePanorama: ").append(toIndentedString(mobilePanorama)).append("\n");
    sb.append("    mobileDetail: ").append(toIndentedString(mobileDetail)).append("\n");
    sb.append("    minNumberForDisplaySalesCount: ").append(toIndentedString(minNumberForDisplaySalesCount)).append("\n");
    sb.append("    lowestOptionPrice: ").append(toIndentedString(lowestOptionPrice)).append("\n");
    sb.append("    lowestOptionNumber: ").append(toIndentedString(lowestOptionNumber)).append("\n");
    sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    isCoupangShow: ").append(toIndentedString(isCoupangShow)).append("\n");
    sb.append("    isAdult: ").append(toIndentedString(isAdult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    forUseStartDate: ").append(toIndentedString(forUseStartDate)).append("\n");
    sb.append("    forUseStart: ").append(toIndentedString(forUseStart)).append("\n");
    sb.append("    forUseEndDate: ").append(toIndentedString(forUseEndDate)).append("\n");
    sb.append("    forUseEnd: ").append(toIndentedString(forUseEnd)).append("\n");
    sb.append("    forUseDateName: ").append(toIndentedString(forUseDateName)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
    sb.append("    directlyUse: ").append(toIndentedString(directlyUse)).append("\n");
    sb.append("    descriptionMessage: ").append(toIndentedString(descriptionMessage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deliveryProduct: ").append(toIndentedString(deliveryProduct)).append("\n");
    sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
    sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
    sb.append("    deliverPrice: ").append(toIndentedString(deliverPrice)).append("\n");
    sb.append("    criteriaPriceInfo: ").append(toIndentedString(criteriaPriceInfo)).append("\n");
    sb.append("    cornerTagType: ").append(toIndentedString(cornerTagType)).append("\n");
    sb.append("    conditionalFreeshipping: ").append(toIndentedString(conditionalFreeshipping)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    bundleDealPrice: ").append(toIndentedString(bundleDealPrice)).append("\n");
    sb.append("    bundleDealEa: ").append(toIndentedString(bundleDealEa)).append("\n");
    sb.append("    bannerSuggest: ").append(toIndentedString(bannerSuggest)).append("\n");
    sb.append("    bannerList: ").append(toIndentedString(bannerList)).append("\n");
    sb.append("    bannerLeftFloat: ").append(toIndentedString(bannerLeftFloat)).append("\n");
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

  public static DisplayItemBuilder builder() {
    return new DisplayItemBuilder();
  }

  public static class DisplayItemBuilder {

    private String webRecommend = null;
    private String webMainTop = null;
    private String unitDescription = null;
    private Integer totalSalesCount = null;
    private String title = null;
    private java.math.BigDecimal subscribeSalePrice = null;
    private java.math.BigDecimal subscribeDiscountRate = null;
    private Boolean subscribable = null;
    private Integer soldoutApproachCount = null;
    private Boolean shownUseDate = null;
    private Boolean shownPremium = null;
    private SellingStatusTypeEnum sellingStatusType = null;
    private Double savingPoint = null;
    private Integer salesPrice = null;
    private Integer salesCount = null;
    private Long representativeDisplayCategoryCode = null;
    private String primeDealType = null;
    private Boolean payOnDelivery = null;
    private Boolean overseasPurchase = null;
    private Integer overAmountFreeshipping = null;
    private String originalPriceType = null;
    private Integer originalPrice = null;
    private String openTime = null;
    private Date onSaleStart = null;
    private Date onSaleEnd = null;
    private Boolean newMemberOnly = null;
    private String mobileWebShow = null;
    private String mobileThumbnail = null;
    private String mobileSquare = null;
    private String mobileSlide = null;
    private String mobileShow = null;
    private String mobilePanorama = null;
    private String mobileDetail = null;
    private Integer minNumberForDisplaySalesCount = null;
    private java.math.BigDecimal lowestOptionPrice = null;
    private Long lowestOptionNumber = null;
    private String logisticsType = null;
    private String isValid = null;
    private String isCoupangShow = null;
    private Boolean isAdult = null;
    private Long id = null;
    private Date forUseStartDate = null;
    private String forUseStart = null;
    private Date forUseEndDate = null;
    private String forUseEnd = null;
    private String forUseDateName = null;
    private DivisionTypeEnum divisionType = null;
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private String discountType = null;
    private Double discountRate = null;
    private String discountName = null;
    private Boolean directlyUse = null;
    private String descriptionMessage = null;
    private String description = null;
    private Boolean deliveryProduct = null;
    private List<Integer> deliveryPeriods = new ArrayList<Integer>();
    private String deliveryPeriodUnit = null;
    private Integer deliverPrice = null;
    private String criteriaPriceInfo = null;
    private String cornerTagType = null;
    private Boolean conditionalFreeshipping = null;
    private String closeTime = null;
    private Integer bundleDealPrice = null;
    private Integer bundleDealEa = null;
    private String bannerSuggest = null;
    private String bannerList = null;
    private String bannerLeftFloat = null;
    

    DisplayItemBuilder() {
    }

    /**
     **/
    public DisplayItemBuilder webRecommend(String webRecommend) {
      this.webRecommend = webRecommend;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder webMainTop(String webMainTop) {
      this.webMainTop = webMainTop;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder unitDescription(String unitDescription) {
      this.unitDescription = unitDescription;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder totalSalesCount(Integer totalSalesCount) {
      this.totalSalesCount = totalSalesCount;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder subscribeSalePrice(java.math.BigDecimal subscribeSalePrice) {
      this.subscribeSalePrice = subscribeSalePrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder subscribeDiscountRate(java.math.BigDecimal subscribeDiscountRate) {
      this.subscribeDiscountRate = subscribeDiscountRate;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder subscribable(Boolean subscribable) {
      this.subscribable = subscribable;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder soldoutApproachCount(Integer soldoutApproachCount) {
      this.soldoutApproachCount = soldoutApproachCount;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder shownUseDate(Boolean shownUseDate) {
      this.shownUseDate = shownUseDate;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder shownPremium(Boolean shownPremium) {
      this.shownPremium = shownPremium;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder sellingStatusType(SellingStatusTypeEnum sellingStatusType) {
      this.sellingStatusType = sellingStatusType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder savingPoint(Double savingPoint) {
      this.savingPoint = savingPoint;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder salesPrice(Integer salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder salesCount(Integer salesCount) {
      this.salesCount = salesCount;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder representativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
      this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder primeDealType(String primeDealType) {
      this.primeDealType = primeDealType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder payOnDelivery(Boolean payOnDelivery) {
      this.payOnDelivery = payOnDelivery;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder overseasPurchase(Boolean overseasPurchase) {
      this.overseasPurchase = overseasPurchase;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder overAmountFreeshipping(Integer overAmountFreeshipping) {
      this.overAmountFreeshipping = overAmountFreeshipping;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder originalPriceType(String originalPriceType) {
      this.originalPriceType = originalPriceType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder originalPrice(Integer originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder openTime(String openTime) {
      this.openTime = openTime;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder onSaleStart(Date onSaleStart) {
      this.onSaleStart = onSaleStart;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder onSaleEnd(Date onSaleEnd) {
      this.onSaleEnd = onSaleEnd;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder newMemberOnly(Boolean newMemberOnly) {
      this.newMemberOnly = newMemberOnly;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileWebShow(String mobileWebShow) {
      this.mobileWebShow = mobileWebShow;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileThumbnail(String mobileThumbnail) {
      this.mobileThumbnail = mobileThumbnail;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileSquare(String mobileSquare) {
      this.mobileSquare = mobileSquare;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileSlide(String mobileSlide) {
      this.mobileSlide = mobileSlide;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileShow(String mobileShow) {
      this.mobileShow = mobileShow;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobilePanorama(String mobilePanorama) {
      this.mobilePanorama = mobilePanorama;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder mobileDetail(String mobileDetail) {
      this.mobileDetail = mobileDetail;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder minNumberForDisplaySalesCount(Integer minNumberForDisplaySalesCount) {
      this.minNumberForDisplaySalesCount = minNumberForDisplaySalesCount;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder lowestOptionPrice(java.math.BigDecimal lowestOptionPrice) {
      this.lowestOptionPrice = lowestOptionPrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder lowestOptionNumber(Long lowestOptionNumber) {
      this.lowestOptionNumber = lowestOptionNumber;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder logisticsType(String logisticsType) {
      this.logisticsType = logisticsType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder isValid(String isValid) {
      this.isValid = isValid;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder isCoupangShow(String isCoupangShow) {
      this.isCoupangShow = isCoupangShow;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder isAdult(Boolean isAdult) {
      this.isAdult = isAdult;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder forUseStartDate(Date forUseStartDate) {
      this.forUseStartDate = forUseStartDate;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder forUseStart(String forUseStart) {
      this.forUseStart = forUseStart;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder forUseEndDate(Date forUseEndDate) {
      this.forUseEndDate = forUseEndDate;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder forUseEnd(String forUseEnd) {
      this.forUseEnd = forUseEnd;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder forUseDateName(String forUseDateName) {
      this.forUseDateName = forUseDateName;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder divisionType(DivisionTypeEnum divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder discountType(String discountType) {
      this.discountType = discountType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder discountRate(Double discountRate) {
      this.discountRate = discountRate;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder discountName(String discountName) {
      this.discountName = discountName;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder directlyUse(Boolean directlyUse) {
      this.directlyUse = directlyUse;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder descriptionMessage(String descriptionMessage) {
      this.descriptionMessage = descriptionMessage;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder deliveryProduct(Boolean deliveryProduct) {
      this.deliveryProduct = deliveryProduct;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder deliveryPeriods(List<Integer> deliveryPeriods) {
      this.deliveryPeriods = deliveryPeriods;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder deliveryPeriodUnit(String deliveryPeriodUnit) {
      this.deliveryPeriodUnit = deliveryPeriodUnit;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder deliverPrice(Integer deliverPrice) {
      this.deliverPrice = deliverPrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder criteriaPriceInfo(String criteriaPriceInfo) {
      this.criteriaPriceInfo = criteriaPriceInfo;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder cornerTagType(String cornerTagType) {
      this.cornerTagType = cornerTagType;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder conditionalFreeshipping(Boolean conditionalFreeshipping) {
      this.conditionalFreeshipping = conditionalFreeshipping;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder closeTime(String closeTime) {
      this.closeTime = closeTime;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder bundleDealPrice(Integer bundleDealPrice) {
      this.bundleDealPrice = bundleDealPrice;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder bundleDealEa(Integer bundleDealEa) {
      this.bundleDealEa = bundleDealEa;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder bannerSuggest(String bannerSuggest) {
      this.bannerSuggest = bannerSuggest;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder bannerList(String bannerList) {
      this.bannerList = bannerList;
      return this;
    }

    /**
     **/
    public DisplayItemBuilder bannerLeftFloat(String bannerLeftFloat) {
      this.bannerLeftFloat = bannerLeftFloat;
      return this;
    }


    public DisplayItem build() {
      DisplayItem displayItem = new DisplayItem();
      displayItem.setWebRecommend(this.webRecommend);
      displayItem.setWebMainTop(this.webMainTop);
      displayItem.setUnitDescription(this.unitDescription);
      displayItem.setTotalSalesCount(this.totalSalesCount);
      displayItem.setTitle(this.title);
      displayItem.setSubscribeSalePrice(this.subscribeSalePrice);
      displayItem.setSubscribeDiscountRate(this.subscribeDiscountRate);
      displayItem.setSubscribable(this.subscribable);
      displayItem.setSoldoutApproachCount(this.soldoutApproachCount);
      displayItem.setShownUseDate(this.shownUseDate);
      displayItem.setShownPremium(this.shownPremium);
      displayItem.setSellingStatusType(this.sellingStatusType);
      displayItem.setSavingPoint(this.savingPoint);
      displayItem.setSalesPrice(this.salesPrice);
      displayItem.setSalesCount(this.salesCount);
      displayItem.setRepresentativeDisplayCategoryCode(this.representativeDisplayCategoryCode);
      displayItem.setPrimeDealType(this.primeDealType);
      displayItem.setPayOnDelivery(this.payOnDelivery);
      displayItem.setOverseasPurchase(this.overseasPurchase);
      displayItem.setOverAmountFreeshipping(this.overAmountFreeshipping);
      displayItem.setOriginalPriceType(this.originalPriceType);
      displayItem.setOriginalPrice(this.originalPrice);
      displayItem.setOpenTime(this.openTime);
      displayItem.setOnSaleStart(this.onSaleStart);
      displayItem.setOnSaleEnd(this.onSaleEnd);
      displayItem.setNewMemberOnly(this.newMemberOnly);
      displayItem.setMobileWebShow(this.mobileWebShow);
      displayItem.setMobileThumbnail(this.mobileThumbnail);
      displayItem.setMobileSquare(this.mobileSquare);
      displayItem.setMobileSlide(this.mobileSlide);
      displayItem.setMobileShow(this.mobileShow);
      displayItem.setMobilePanorama(this.mobilePanorama);
      displayItem.setMobileDetail(this.mobileDetail);
      displayItem.setMinNumberForDisplaySalesCount(this.minNumberForDisplaySalesCount);
      displayItem.setLowestOptionPrice(this.lowestOptionPrice);
      displayItem.setLowestOptionNumber(this.lowestOptionNumber);
      displayItem.setLogisticsType(this.logisticsType);
      displayItem.setIsValid(this.isValid);
      displayItem.setIsCoupangShow(this.isCoupangShow);
      displayItem.setIsAdult(this.isAdult);
      displayItem.setId(this.id);
      displayItem.setForUseStartDate(this.forUseStartDate);
      displayItem.setForUseStart(this.forUseStart);
      displayItem.setForUseEndDate(this.forUseEndDate);
      displayItem.setForUseEnd(this.forUseEnd);
      displayItem.setForUseDateName(this.forUseDateName);
      displayItem.setDivisionType(this.divisionType);
      displayItem.setDisplayCategoryCodes(this.displayCategoryCodes);
      displayItem.setDiscountType(this.discountType);
      displayItem.setDiscountRate(this.discountRate);
      displayItem.setDiscountName(this.discountName);
      displayItem.setDirectlyUse(this.directlyUse);
      displayItem.setDescriptionMessage(this.descriptionMessage);
      displayItem.setDescription(this.description);
      displayItem.setDeliveryProduct(this.deliveryProduct);
      displayItem.setDeliveryPeriods(this.deliveryPeriods);
      displayItem.setDeliveryPeriodUnit(this.deliveryPeriodUnit);
      displayItem.setDeliverPrice(this.deliverPrice);
      displayItem.setCriteriaPriceInfo(this.criteriaPriceInfo);
      displayItem.setCornerTagType(this.cornerTagType);
      displayItem.setConditionalFreeshipping(this.conditionalFreeshipping);
      displayItem.setCloseTime(this.closeTime);
      displayItem.setBundleDealPrice(this.bundleDealPrice);
      displayItem.setBundleDealEa(this.bundleDealEa);
      displayItem.setBannerSuggest(this.bannerSuggest);
      displayItem.setBannerList(this.bannerList);
      displayItem.setBannerLeftFloat(this.bannerLeftFloat);
      return displayItem;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayItemBuilder {\n");
      
      sb.append("    webRecommend: ").append(toIndentedString(webRecommend)).append("\n");
      sb.append("    webMainTop: ").append(toIndentedString(webMainTop)).append("\n");
      sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
      sb.append("    totalSalesCount: ").append(toIndentedString(totalSalesCount)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
      sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
      sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
      sb.append("    soldoutApproachCount: ").append(toIndentedString(soldoutApproachCount)).append("\n");
      sb.append("    shownUseDate: ").append(toIndentedString(shownUseDate)).append("\n");
      sb.append("    shownPremium: ").append(toIndentedString(shownPremium)).append("\n");
      sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
      sb.append("    savingPoint: ").append(toIndentedString(savingPoint)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
      sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
      sb.append("    primeDealType: ").append(toIndentedString(primeDealType)).append("\n");
      sb.append("    payOnDelivery: ").append(toIndentedString(payOnDelivery)).append("\n");
      sb.append("    overseasPurchase: ").append(toIndentedString(overseasPurchase)).append("\n");
      sb.append("    overAmountFreeshipping: ").append(toIndentedString(overAmountFreeshipping)).append("\n");
      sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
      sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
      sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
      sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
      sb.append("    mobileWebShow: ").append(toIndentedString(mobileWebShow)).append("\n");
      sb.append("    mobileThumbnail: ").append(toIndentedString(mobileThumbnail)).append("\n");
      sb.append("    mobileSquare: ").append(toIndentedString(mobileSquare)).append("\n");
      sb.append("    mobileSlide: ").append(toIndentedString(mobileSlide)).append("\n");
      sb.append("    mobileShow: ").append(toIndentedString(mobileShow)).append("\n");
      sb.append("    mobilePanorama: ").append(toIndentedString(mobilePanorama)).append("\n");
      sb.append("    mobileDetail: ").append(toIndentedString(mobileDetail)).append("\n");
      sb.append("    minNumberForDisplaySalesCount: ").append(toIndentedString(minNumberForDisplaySalesCount)).append("\n");
      sb.append("    lowestOptionPrice: ").append(toIndentedString(lowestOptionPrice)).append("\n");
      sb.append("    lowestOptionNumber: ").append(toIndentedString(lowestOptionNumber)).append("\n");
      sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
      sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
      sb.append("    isCoupangShow: ").append(toIndentedString(isCoupangShow)).append("\n");
      sb.append("    isAdult: ").append(toIndentedString(isAdult)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    forUseStartDate: ").append(toIndentedString(forUseStartDate)).append("\n");
      sb.append("    forUseStart: ").append(toIndentedString(forUseStart)).append("\n");
      sb.append("    forUseEndDate: ").append(toIndentedString(forUseEndDate)).append("\n");
      sb.append("    forUseEnd: ").append(toIndentedString(forUseEnd)).append("\n");
      sb.append("    forUseDateName: ").append(toIndentedString(forUseDateName)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
      sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
      sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
      sb.append("    directlyUse: ").append(toIndentedString(directlyUse)).append("\n");
      sb.append("    descriptionMessage: ").append(toIndentedString(descriptionMessage)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    deliveryProduct: ").append(toIndentedString(deliveryProduct)).append("\n");
      sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
      sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
      sb.append("    deliverPrice: ").append(toIndentedString(deliverPrice)).append("\n");
      sb.append("    criteriaPriceInfo: ").append(toIndentedString(criteriaPriceInfo)).append("\n");
      sb.append("    cornerTagType: ").append(toIndentedString(cornerTagType)).append("\n");
      sb.append("    conditionalFreeshipping: ").append(toIndentedString(conditionalFreeshipping)).append("\n");
      sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
      sb.append("    bundleDealPrice: ").append(toIndentedString(bundleDealPrice)).append("\n");
      sb.append("    bundleDealEa: ").append(toIndentedString(bundleDealEa)).append("\n");
      sb.append("    bannerSuggest: ").append(toIndentedString(bannerSuggest)).append("\n");
      sb.append("    bannerList: ").append(toIndentedString(bannerList)).append("\n");
      sb.append("    bannerLeftFloat: ").append(toIndentedString(bannerLeftFloat)).append("\n");
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

