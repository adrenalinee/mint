package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.LegacyTravelDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class DisplayDetailDto   {
  


  public enum ZeroDealTypeEnum {
    EVENT("EVENT"),
    FLAT_PRICE("FLAT_PRICE"),
    PASS("PASS"),
    PRESENT("PRESENT"),
    SALE("SALE"),
    STIPULATION("STIPULATION"),
    SWAP("SWAP");

    private String value;

    ZeroDealTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ZeroDealTypeEnum zeroDealType = null;
  private Boolean zeroDeal = null;
  private List<Long> vendorItemIds = new ArrayList<Long>();
  private Boolean validOption = null;
  private Boolean valid = null;
  private String useCondition = null;
  private String unitDescription = null;
  private LegacyTravelDto travelDto = null;
  private Boolean travel = null;
  private Integer totalSalesCount = null;
  private String title = null;
  private java.math.BigDecimal subscribeSalePrice = null;
  private java.math.BigDecimal subscribeDiscountRate = null;
  private Boolean subscribable = null;
  private Integer soldoutApproachCount = null;
  private Boolean shownUseDate = null;
  private Boolean shownPremium = null;
  private String sharemsg = null;


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
  private Integer salesQuantity = null;
  private Integer salesPrice = null;
  private String salePeriodType = null;
  private Integer roleId = null;
  private Long representativeDisplayCategoryCode = null;


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
  private String productImage = null;


  public enum PictogramsEnum {
    PARKING("PARKING"),
    NO_PARKING("NO_PARKING"),
    DELIVERY("DELIVERY"),
    TAKEOUT("TAKEOUT"),
    RESERVATION("RESERVATION"),
    HOLIDAY("HOLIDAY"),
    WEEKEND("WEEKEND"),
    UNUSED_COUPON_REFUND("UNUSED_COUPON_REFUND"),
    NO_UNUSED_COUPON_REFUND("NO_UNUSED_COUPON_REFUND"),
    PARALLEL_IMPORT("PARALLEL_IMPORT"),
    OVERSEA_PURCHASE("OVERSEA_PURCHASE"),
    FAST_DELIVERY("FAST_DELIVERY"),
    GENERAL_DELIVERY("GENERAL_DELIVERY"),
    COUPANG_DELIVERY("COUPANG_DELIVERY"),
    NEXT_DAY_USABLE("NEXT_DAY_USABLE");

    private String value;

    PictogramsEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<PictogramsEnum> pictograms = new ArrayList<PictogramsEnum>();
  private Boolean payOnDelivery = null;
  private Boolean parallelImported = null;
  private Boolean overseasPurchase = null;
  private Integer overAmountFreeshipping = null;


  public enum OriginalPriceTypeEnum {
    PR_AGENT("PR_AGENT"),
    PR_CATALOG("PR_CATALOG"),
    PR_COMPANY("PR_COMPANY"),
    PR_DEPARTMENT("PR_DEPARTMENT"),
    PR_DISCOUNT("PR_DISCOUNT"),
    PR_HOME("PR_HOME"),
    PR_ONLINE("PR_ONLINE"),
    PR_ONLINE_Y("PR_ONLINE_Y"),
    PR_ONLINE_N("PR_ONLINE_N"),
    PR_SPECIAL("PR_SPECIAL"),
    PR_TOTAL("PR_TOTAL"),
    PR_HOMPAGE("PR_HOMPAGE"),
    PR_RESERVATION("PR_RESERVATION"),
    PR_BOOK("PR_BOOK"),
    PR_MENUPAN("PR_MENUPAN"),
    PR_REPORT("PR_REPORT"),
    PR_TRAVEL("PR_TRAVEL"),
    PR_TAG("PR_TAG"),
    PR_COUPANG("PR_COUPANG"),
    NONE("NONE");

    private String value;

    OriginalPriceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OriginalPriceTypeEnum originalPriceType = null;
  private Integer originalPrice = null;


  public enum OptionTypeEnum {
    NO_OPTION("NO_OPTION"),
    OPTION("OPTION"),
    OPTION_AND_DIMENSION("OPTION_AND_DIMENSION");

    private String value;

    OptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OptionTypeEnum optionType = null;
  private String openTime = null;
  private Date onSaleStart = null;
  private Boolean onSalePeriod = null;
  private Date onSaleEnd = null;
  private Boolean newMemberOnly = null;
  private Boolean mobileWebShow = null;
  private Integer minNumberForDisplaySalesCount = null;
  private Integer maxPerPerson = null;
  private Boolean logistics = null;
  private Long id = null;
  private Date forUseStartDate = null;
  private String forUseStart = null;
  private Date forUseEndDate = null;
  private String forUseEnd = null;
  private String forUseDateName = null;
  private Boolean eventDealButtonDisplay = null;
  private Long documentSrl = null;
  private String divisionType = null;
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private Boolean directlyUse = null;
  private Boolean directOrder = null;
  private String descriptionMessage = null;
  private String description = null;
  private Boolean deliveryProduct = null;
  private Integer deliveryPrice = null;
  private List<Integer> deliveryPeriods = new ArrayList<Integer>();
  private String deliveryPeriodUnit = null;
  private String criteriaPriceInfo = null;
  private Boolean coupangSpecialPrice = null;
  private Boolean coupangShow = null;
  private Boolean conditionalFreeshipping = null;
  private String closeTime = null;


  public enum ButtonTypeEnum {
    BUY("BUY"),
    ENTRY("ENTRY"),
    PARTICIPATE("PARTICIPATE"),
    APPLY("APPLY"),
    CONSULT("CONSULT"),
    GET_COUPON("GET_COUPON");

    private String value;

    ButtonTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ButtonTypeEnum buttonType = null;
  private Integer bundleDealPrice = null;
  private Integer bundleDealEa = null;
  private String bannerType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zeroDealType")
  @com.fasterxml.jackson.annotation.JsonProperty("zeroDealType")
  public ZeroDealTypeEnum getZeroDealType() {
    return zeroDealType;
  }
  
  /**
   **/
  public void setZeroDealType(ZeroDealTypeEnum zeroDealType) {
    this.zeroDealType = zeroDealType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zeroDeal")
  @com.fasterxml.jackson.annotation.JsonProperty("zeroDeal")
  public Boolean getZeroDeal() {
    return zeroDeal;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isZeroDeal() {
    return zeroDeal == null ? false : zeroDeal;
  }
  
  /**
   **/
  public void setZeroDeal(Boolean zeroDeal) {
    this.zeroDeal = zeroDeal;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemIds")
  public List<Long> getVendorItemIds() {
    return vendorItemIds;
  }
  
  /**
   **/
  public void setVendorItemIds(List<Long> vendorItemIds) {
    this.vendorItemIds = vendorItemIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("validOption")
  @com.fasterxml.jackson.annotation.JsonProperty("validOption")
  public Boolean getValidOption() {
    return validOption;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValidOption() {
    return validOption == null ? false : validOption;
  }
  
  /**
   **/
  public void setValidOption(Boolean validOption) {
    this.validOption = validOption;
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
  @org.codehaus.jackson.annotate.JsonProperty("useCondition")
  @com.fasterxml.jackson.annotation.JsonProperty("useCondition")
  public String getUseCondition() {
    return useCondition;
  }
  
  /**
   **/
  public void setUseCondition(String useCondition) {
    this.useCondition = useCondition;
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
  @org.codehaus.jackson.annotate.JsonProperty("travelDto")
  @com.fasterxml.jackson.annotation.JsonProperty("travelDto")
  public LegacyTravelDto getTravelDto() {
    return travelDto;
  }
  
  /**
   **/
  public void setTravelDto(LegacyTravelDto travelDto) {
    this.travelDto = travelDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("travel")
  @com.fasterxml.jackson.annotation.JsonProperty("travel")
  public Boolean getTravel() {
    return travel;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isTravel() {
    return travel == null ? false : travel;
  }
  
  /**
   **/
  public void setTravel(Boolean travel) {
    this.travel = travel;
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
  @org.codehaus.jackson.annotate.JsonProperty("sharemsg")
  @com.fasterxml.jackson.annotation.JsonProperty("sharemsg")
  public String getSharemsg() {
    return sharemsg;
  }
  
  /**
   **/
  public void setSharemsg(String sharemsg) {
    this.sharemsg = sharemsg;
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
  @org.codehaus.jackson.annotate.JsonProperty("salesQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("salesQuantity")
  public Integer getSalesQuantity() {
    return salesQuantity;
  }
  
  /**
   **/
  public void setSalesQuantity(Integer salesQuantity) {
    this.salesQuantity = salesQuantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("roleId")
  @com.fasterxml.jackson.annotation.JsonProperty("roleId")
  public Integer getRoleId() {
    return roleId;
  }
  
  /**
   **/
  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
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
  @org.codehaus.jackson.annotate.JsonProperty("productImage")
  @com.fasterxml.jackson.annotation.JsonProperty("productImage")
  public String getProductImage() {
    return productImage;
  }
  
  /**
   **/
  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pictograms")
  @com.fasterxml.jackson.annotation.JsonProperty("pictograms")
  public List<PictogramsEnum> getPictograms() {
    return pictograms;
  }
  
  /**
   **/
  public void setPictograms(List<PictogramsEnum> pictograms) {
    this.pictograms = pictograms;
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
  @org.codehaus.jackson.annotate.JsonProperty("parallelImported")
  @com.fasterxml.jackson.annotation.JsonProperty("parallelImported")
  public Boolean getParallelImported() {
    return parallelImported;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isParallelImported() {
    return parallelImported == null ? false : parallelImported;
  }
  
  /**
   **/
  public void setParallelImported(Boolean parallelImported) {
    this.parallelImported = parallelImported;
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
  public OriginalPriceTypeEnum getOriginalPriceType() {
    return originalPriceType;
  }
  
  /**
   **/
  public void setOriginalPriceType(OriginalPriceTypeEnum originalPriceType) {
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
  @org.codehaus.jackson.annotate.JsonProperty("optionType")
  @com.fasterxml.jackson.annotation.JsonProperty("optionType")
  public OptionTypeEnum getOptionType() {
    return optionType;
  }
  
  /**
   **/
  public void setOptionType(OptionTypeEnum optionType) {
    this.optionType = optionType;
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
  @org.codehaus.jackson.annotate.JsonProperty("onSalePeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("onSalePeriod")
  public Boolean getOnSalePeriod() {
    return onSalePeriod;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOnSalePeriod() {
    return onSalePeriod == null ? false : onSalePeriod;
  }
  
  /**
   **/
  public void setOnSalePeriod(Boolean onSalePeriod) {
    this.onSalePeriod = onSalePeriod;
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
  public Boolean getMobileWebShow() {
    return mobileWebShow;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isMobileWebShow() {
    return mobileWebShow == null ? false : mobileWebShow;
  }
  
  /**
   **/
  public void setMobileWebShow(Boolean mobileWebShow) {
    this.mobileWebShow = mobileWebShow;
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
  @org.codehaus.jackson.annotate.JsonProperty("maxPerPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerPerson")
  public Integer getMaxPerPerson() {
    return maxPerPerson;
  }
  
  /**
   **/
  public void setMaxPerPerson(Integer maxPerPerson) {
    this.maxPerPerson = maxPerPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logistics")
  @com.fasterxml.jackson.annotation.JsonProperty("logistics")
  public Boolean getLogistics() {
    return logistics;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogistics() {
    return logistics == null ? false : logistics;
  }
  
  /**
   **/
  public void setLogistics(Boolean logistics) {
    this.logistics = logistics;
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
  @org.codehaus.jackson.annotate.JsonProperty("eventDealButtonDisplay")
  @com.fasterxml.jackson.annotation.JsonProperty("eventDealButtonDisplay")
  public Boolean getEventDealButtonDisplay() {
    return eventDealButtonDisplay;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isEventDealButtonDisplay() {
    return eventDealButtonDisplay == null ? false : eventDealButtonDisplay;
  }
  
  /**
   **/
  public void setEventDealButtonDisplay(Boolean eventDealButtonDisplay) {
    this.eventDealButtonDisplay = eventDealButtonDisplay;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("documentSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("documentSrl")
  public Long getDocumentSrl() {
    return documentSrl;
  }
  
  /**
   **/
  public void setDocumentSrl(Long documentSrl) {
    this.documentSrl = documentSrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("divisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionType")
  public String getDivisionType() {
    return divisionType;
  }
  
  /**
   **/
  public void setDivisionType(String divisionType) {
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
  @org.codehaus.jackson.annotate.JsonProperty("directOrder")
  @com.fasterxml.jackson.annotation.JsonProperty("directOrder")
  public Boolean getDirectOrder() {
    return directOrder;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDirectOrder() {
    return directOrder == null ? false : directOrder;
  }
  
  /**
   **/
  public void setDirectOrder(Boolean directOrder) {
    this.directOrder = directOrder;
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
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPrice")
  public Integer getDeliveryPrice() {
    return deliveryPrice;
  }
  
  /**
   **/
  public void setDeliveryPrice(Integer deliveryPrice) {
    this.deliveryPrice = deliveryPrice;
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
  @org.codehaus.jackson.annotate.JsonProperty("coupangSpecialPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSpecialPrice")
  public Boolean getCoupangSpecialPrice() {
    return coupangSpecialPrice;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCoupangSpecialPrice() {
    return coupangSpecialPrice == null ? false : coupangSpecialPrice;
  }
  
  /**
   **/
  public void setCoupangSpecialPrice(Boolean coupangSpecialPrice) {
    this.coupangSpecialPrice = coupangSpecialPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangShow")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangShow")
  public Boolean getCoupangShow() {
    return coupangShow;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCoupangShow() {
    return coupangShow == null ? false : coupangShow;
  }
  
  /**
   **/
  public void setCoupangShow(Boolean coupangShow) {
    this.coupangShow = coupangShow;
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
  @org.codehaus.jackson.annotate.JsonProperty("buttonType")
  @com.fasterxml.jackson.annotation.JsonProperty("buttonType")
  public ButtonTypeEnum getButtonType() {
    return buttonType;
  }
  
  /**
   **/
  public void setButtonType(ButtonTypeEnum buttonType) {
    this.buttonType = buttonType;
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
  @org.codehaus.jackson.annotate.JsonProperty("bannerType")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerType")
  public String getBannerType() {
    return bannerType;
  }
  
  /**
   **/
  public void setBannerType(String bannerType) {
    this.bannerType = bannerType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayDetailDto displayDetailDto = (DisplayDetailDto) o;
    return Objects.equals(this.zeroDealType, displayDetailDto.zeroDealType) &&
        Objects.equals(this.zeroDeal, displayDetailDto.zeroDeal) &&
        Objects.equals(this.vendorItemIds, displayDetailDto.vendorItemIds) &&
        Objects.equals(this.validOption, displayDetailDto.validOption) &&
        Objects.equals(this.valid, displayDetailDto.valid) &&
        Objects.equals(this.useCondition, displayDetailDto.useCondition) &&
        Objects.equals(this.unitDescription, displayDetailDto.unitDescription) &&
        Objects.equals(this.travelDto, displayDetailDto.travelDto) &&
        Objects.equals(this.travel, displayDetailDto.travel) &&
        Objects.equals(this.totalSalesCount, displayDetailDto.totalSalesCount) &&
        Objects.equals(this.title, displayDetailDto.title) &&
        Objects.equals(this.subscribeSalePrice, displayDetailDto.subscribeSalePrice) &&
        Objects.equals(this.subscribeDiscountRate, displayDetailDto.subscribeDiscountRate) &&
        Objects.equals(this.subscribable, displayDetailDto.subscribable) &&
        Objects.equals(this.soldoutApproachCount, displayDetailDto.soldoutApproachCount) &&
        Objects.equals(this.shownUseDate, displayDetailDto.shownUseDate) &&
        Objects.equals(this.shownPremium, displayDetailDto.shownPremium) &&
        Objects.equals(this.sharemsg, displayDetailDto.sharemsg) &&
        Objects.equals(this.sellingStatusType, displayDetailDto.sellingStatusType) &&
        Objects.equals(this.savingPoint, displayDetailDto.savingPoint) &&
        Objects.equals(this.salesQuantity, displayDetailDto.salesQuantity) &&
        Objects.equals(this.salesPrice, displayDetailDto.salesPrice) &&
        Objects.equals(this.salePeriodType, displayDetailDto.salePeriodType) &&
        Objects.equals(this.roleId, displayDetailDto.roleId) &&
        Objects.equals(this.representativeDisplayCategoryCode, displayDetailDto.representativeDisplayCategoryCode) &&
        Objects.equals(this.productServicePlatformType, displayDetailDto.productServicePlatformType) &&
        Objects.equals(this.productImage, displayDetailDto.productImage) &&
        Objects.equals(this.pictograms, displayDetailDto.pictograms) &&
        Objects.equals(this.payOnDelivery, displayDetailDto.payOnDelivery) &&
        Objects.equals(this.parallelImported, displayDetailDto.parallelImported) &&
        Objects.equals(this.overseasPurchase, displayDetailDto.overseasPurchase) &&
        Objects.equals(this.overAmountFreeshipping, displayDetailDto.overAmountFreeshipping) &&
        Objects.equals(this.originalPriceType, displayDetailDto.originalPriceType) &&
        Objects.equals(this.originalPrice, displayDetailDto.originalPrice) &&
        Objects.equals(this.optionType, displayDetailDto.optionType) &&
        Objects.equals(this.openTime, displayDetailDto.openTime) &&
        Objects.equals(this.onSaleStart, displayDetailDto.onSaleStart) &&
        Objects.equals(this.onSalePeriod, displayDetailDto.onSalePeriod) &&
        Objects.equals(this.onSaleEnd, displayDetailDto.onSaleEnd) &&
        Objects.equals(this.newMemberOnly, displayDetailDto.newMemberOnly) &&
        Objects.equals(this.mobileWebShow, displayDetailDto.mobileWebShow) &&
        Objects.equals(this.minNumberForDisplaySalesCount, displayDetailDto.minNumberForDisplaySalesCount) &&
        Objects.equals(this.maxPerPerson, displayDetailDto.maxPerPerson) &&
        Objects.equals(this.logistics, displayDetailDto.logistics) &&
        Objects.equals(this.id, displayDetailDto.id) &&
        Objects.equals(this.forUseStartDate, displayDetailDto.forUseStartDate) &&
        Objects.equals(this.forUseStart, displayDetailDto.forUseStart) &&
        Objects.equals(this.forUseEndDate, displayDetailDto.forUseEndDate) &&
        Objects.equals(this.forUseEnd, displayDetailDto.forUseEnd) &&
        Objects.equals(this.forUseDateName, displayDetailDto.forUseDateName) &&
        Objects.equals(this.eventDealButtonDisplay, displayDetailDto.eventDealButtonDisplay) &&
        Objects.equals(this.documentSrl, displayDetailDto.documentSrl) &&
        Objects.equals(this.divisionType, displayDetailDto.divisionType) &&
        Objects.equals(this.displayCategoryCodes, displayDetailDto.displayCategoryCodes) &&
        Objects.equals(this.directlyUse, displayDetailDto.directlyUse) &&
        Objects.equals(this.directOrder, displayDetailDto.directOrder) &&
        Objects.equals(this.descriptionMessage, displayDetailDto.descriptionMessage) &&
        Objects.equals(this.description, displayDetailDto.description) &&
        Objects.equals(this.deliveryProduct, displayDetailDto.deliveryProduct) &&
        Objects.equals(this.deliveryPrice, displayDetailDto.deliveryPrice) &&
        Objects.equals(this.deliveryPeriods, displayDetailDto.deliveryPeriods) &&
        Objects.equals(this.deliveryPeriodUnit, displayDetailDto.deliveryPeriodUnit) &&
        Objects.equals(this.criteriaPriceInfo, displayDetailDto.criteriaPriceInfo) &&
        Objects.equals(this.coupangSpecialPrice, displayDetailDto.coupangSpecialPrice) &&
        Objects.equals(this.coupangShow, displayDetailDto.coupangShow) &&
        Objects.equals(this.conditionalFreeshipping, displayDetailDto.conditionalFreeshipping) &&
        Objects.equals(this.closeTime, displayDetailDto.closeTime) &&
        Objects.equals(this.buttonType, displayDetailDto.buttonType) &&
        Objects.equals(this.bundleDealPrice, displayDetailDto.bundleDealPrice) &&
        Objects.equals(this.bundleDealEa, displayDetailDto.bundleDealEa) &&
        Objects.equals(this.bannerType, displayDetailDto.bannerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zeroDealType, zeroDeal, vendorItemIds, validOption, valid, useCondition, unitDescription, travelDto, travel, totalSalesCount, title, subscribeSalePrice, subscribeDiscountRate, subscribable, soldoutApproachCount, shownUseDate, shownPremium, sharemsg, sellingStatusType, savingPoint, salesQuantity, salesPrice, salePeriodType, roleId, representativeDisplayCategoryCode, productServicePlatformType, productImage, pictograms, payOnDelivery, parallelImported, overseasPurchase, overAmountFreeshipping, originalPriceType, originalPrice, optionType, openTime, onSaleStart, onSalePeriod, onSaleEnd, newMemberOnly, mobileWebShow, minNumberForDisplaySalesCount, maxPerPerson, logistics, id, forUseStartDate, forUseStart, forUseEndDate, forUseEnd, forUseDateName, eventDealButtonDisplay, documentSrl, divisionType, displayCategoryCodes, directlyUse, directOrder, descriptionMessage, description, deliveryProduct, deliveryPrice, deliveryPeriods, deliveryPeriodUnit, criteriaPriceInfo, coupangSpecialPrice, coupangShow, conditionalFreeshipping, closeTime, buttonType, bundleDealPrice, bundleDealEa, bannerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayDetailDto {\n");
    
    sb.append("    zeroDealType: ").append(toIndentedString(zeroDealType)).append("\n");
    sb.append("    zeroDeal: ").append(toIndentedString(zeroDeal)).append("\n");
    sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
    sb.append("    validOption: ").append(toIndentedString(validOption)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
    sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
    sb.append("    travelDto: ").append(toIndentedString(travelDto)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    totalSalesCount: ").append(toIndentedString(totalSalesCount)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
    sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
    sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
    sb.append("    soldoutApproachCount: ").append(toIndentedString(soldoutApproachCount)).append("\n");
    sb.append("    shownUseDate: ").append(toIndentedString(shownUseDate)).append("\n");
    sb.append("    shownPremium: ").append(toIndentedString(shownPremium)).append("\n");
    sb.append("    sharemsg: ").append(toIndentedString(sharemsg)).append("\n");
    sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
    sb.append("    savingPoint: ").append(toIndentedString(savingPoint)).append("\n");
    sb.append("    salesQuantity: ").append(toIndentedString(salesQuantity)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
    sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    pictograms: ").append(toIndentedString(pictograms)).append("\n");
    sb.append("    payOnDelivery: ").append(toIndentedString(payOnDelivery)).append("\n");
    sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
    sb.append("    overseasPurchase: ").append(toIndentedString(overseasPurchase)).append("\n");
    sb.append("    overAmountFreeshipping: ").append(toIndentedString(overAmountFreeshipping)).append("\n");
    sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
    sb.append("    onSalePeriod: ").append(toIndentedString(onSalePeriod)).append("\n");
    sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
    sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
    sb.append("    mobileWebShow: ").append(toIndentedString(mobileWebShow)).append("\n");
    sb.append("    minNumberForDisplaySalesCount: ").append(toIndentedString(minNumberForDisplaySalesCount)).append("\n");
    sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
    sb.append("    logistics: ").append(toIndentedString(logistics)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    forUseStartDate: ").append(toIndentedString(forUseStartDate)).append("\n");
    sb.append("    forUseStart: ").append(toIndentedString(forUseStart)).append("\n");
    sb.append("    forUseEndDate: ").append(toIndentedString(forUseEndDate)).append("\n");
    sb.append("    forUseEnd: ").append(toIndentedString(forUseEnd)).append("\n");
    sb.append("    forUseDateName: ").append(toIndentedString(forUseDateName)).append("\n");
    sb.append("    eventDealButtonDisplay: ").append(toIndentedString(eventDealButtonDisplay)).append("\n");
    sb.append("    documentSrl: ").append(toIndentedString(documentSrl)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    directlyUse: ").append(toIndentedString(directlyUse)).append("\n");
    sb.append("    directOrder: ").append(toIndentedString(directOrder)).append("\n");
    sb.append("    descriptionMessage: ").append(toIndentedString(descriptionMessage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deliveryProduct: ").append(toIndentedString(deliveryProduct)).append("\n");
    sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
    sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
    sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
    sb.append("    criteriaPriceInfo: ").append(toIndentedString(criteriaPriceInfo)).append("\n");
    sb.append("    coupangSpecialPrice: ").append(toIndentedString(coupangSpecialPrice)).append("\n");
    sb.append("    coupangShow: ").append(toIndentedString(coupangShow)).append("\n");
    sb.append("    conditionalFreeshipping: ").append(toIndentedString(conditionalFreeshipping)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    buttonType: ").append(toIndentedString(buttonType)).append("\n");
    sb.append("    bundleDealPrice: ").append(toIndentedString(bundleDealPrice)).append("\n");
    sb.append("    bundleDealEa: ").append(toIndentedString(bundleDealEa)).append("\n");
    sb.append("    bannerType: ").append(toIndentedString(bannerType)).append("\n");
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

  public static DisplayDetailDtoBuilder builder() {
    return new DisplayDetailDtoBuilder();
  }

  public static class DisplayDetailDtoBuilder {

    private ZeroDealTypeEnum zeroDealType = null;
    private Boolean zeroDeal = null;
    private List<Long> vendorItemIds = new ArrayList<Long>();
    private Boolean validOption = null;
    private Boolean valid = null;
    private String useCondition = null;
    private String unitDescription = null;
    private LegacyTravelDto travelDto = null;
    private Boolean travel = null;
    private Integer totalSalesCount = null;
    private String title = null;
    private java.math.BigDecimal subscribeSalePrice = null;
    private java.math.BigDecimal subscribeDiscountRate = null;
    private Boolean subscribable = null;
    private Integer soldoutApproachCount = null;
    private Boolean shownUseDate = null;
    private Boolean shownPremium = null;
    private String sharemsg = null;
    private SellingStatusTypeEnum sellingStatusType = null;
    private Double savingPoint = null;
    private Integer salesQuantity = null;
    private Integer salesPrice = null;
    private String salePeriodType = null;
    private Integer roleId = null;
    private Long representativeDisplayCategoryCode = null;
    private ProductServicePlatformTypeEnum productServicePlatformType = null;
    private String productImage = null;
    private List<PictogramsEnum> pictograms = new ArrayList<PictogramsEnum>();
    private Boolean payOnDelivery = null;
    private Boolean parallelImported = null;
    private Boolean overseasPurchase = null;
    private Integer overAmountFreeshipping = null;
    private OriginalPriceTypeEnum originalPriceType = null;
    private Integer originalPrice = null;
    private OptionTypeEnum optionType = null;
    private String openTime = null;
    private Date onSaleStart = null;
    private Boolean onSalePeriod = null;
    private Date onSaleEnd = null;
    private Boolean newMemberOnly = null;
    private Boolean mobileWebShow = null;
    private Integer minNumberForDisplaySalesCount = null;
    private Integer maxPerPerson = null;
    private Boolean logistics = null;
    private Long id = null;
    private Date forUseStartDate = null;
    private String forUseStart = null;
    private Date forUseEndDate = null;
    private String forUseEnd = null;
    private String forUseDateName = null;
    private Boolean eventDealButtonDisplay = null;
    private Long documentSrl = null;
    private String divisionType = null;
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private Boolean directlyUse = null;
    private Boolean directOrder = null;
    private String descriptionMessage = null;
    private String description = null;
    private Boolean deliveryProduct = null;
    private Integer deliveryPrice = null;
    private List<Integer> deliveryPeriods = new ArrayList<Integer>();
    private String deliveryPeriodUnit = null;
    private String criteriaPriceInfo = null;
    private Boolean coupangSpecialPrice = null;
    private Boolean coupangShow = null;
    private Boolean conditionalFreeshipping = null;
    private String closeTime = null;
    private ButtonTypeEnum buttonType = null;
    private Integer bundleDealPrice = null;
    private Integer bundleDealEa = null;
    private String bannerType = null;
    

    DisplayDetailDtoBuilder() {
    }

    /**
     **/
    public DisplayDetailDtoBuilder zeroDealType(ZeroDealTypeEnum zeroDealType) {
      this.zeroDealType = zeroDealType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder zeroDeal(Boolean zeroDeal) {
      this.zeroDeal = zeroDeal;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder vendorItemIds(List<Long> vendorItemIds) {
      this.vendorItemIds = vendorItemIds;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder validOption(Boolean validOption) {
      this.validOption = validOption;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder useCondition(String useCondition) {
      this.useCondition = useCondition;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder unitDescription(String unitDescription) {
      this.unitDescription = unitDescription;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder travelDto(LegacyTravelDto travelDto) {
      this.travelDto = travelDto;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder travel(Boolean travel) {
      this.travel = travel;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder totalSalesCount(Integer totalSalesCount) {
      this.totalSalesCount = totalSalesCount;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder subscribeSalePrice(java.math.BigDecimal subscribeSalePrice) {
      this.subscribeSalePrice = subscribeSalePrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder subscribeDiscountRate(java.math.BigDecimal subscribeDiscountRate) {
      this.subscribeDiscountRate = subscribeDiscountRate;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder subscribable(Boolean subscribable) {
      this.subscribable = subscribable;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder soldoutApproachCount(Integer soldoutApproachCount) {
      this.soldoutApproachCount = soldoutApproachCount;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder shownUseDate(Boolean shownUseDate) {
      this.shownUseDate = shownUseDate;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder shownPremium(Boolean shownPremium) {
      this.shownPremium = shownPremium;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder sharemsg(String sharemsg) {
      this.sharemsg = sharemsg;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder sellingStatusType(SellingStatusTypeEnum sellingStatusType) {
      this.sellingStatusType = sellingStatusType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder savingPoint(Double savingPoint) {
      this.savingPoint = savingPoint;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder salesQuantity(Integer salesQuantity) {
      this.salesQuantity = salesQuantity;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder salesPrice(Integer salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder roleId(Integer roleId) {
      this.roleId = roleId;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder representativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
      this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder productServicePlatformType(ProductServicePlatformTypeEnum productServicePlatformType) {
      this.productServicePlatformType = productServicePlatformType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder productImage(String productImage) {
      this.productImage = productImage;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder pictograms(List<PictogramsEnum> pictograms) {
      this.pictograms = pictograms;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder payOnDelivery(Boolean payOnDelivery) {
      this.payOnDelivery = payOnDelivery;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder parallelImported(Boolean parallelImported) {
      this.parallelImported = parallelImported;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder overseasPurchase(Boolean overseasPurchase) {
      this.overseasPurchase = overseasPurchase;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder overAmountFreeshipping(Integer overAmountFreeshipping) {
      this.overAmountFreeshipping = overAmountFreeshipping;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder originalPriceType(OriginalPriceTypeEnum originalPriceType) {
      this.originalPriceType = originalPriceType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder originalPrice(Integer originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder optionType(OptionTypeEnum optionType) {
      this.optionType = optionType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder openTime(String openTime) {
      this.openTime = openTime;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder onSaleStart(Date onSaleStart) {
      this.onSaleStart = onSaleStart;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder onSalePeriod(Boolean onSalePeriod) {
      this.onSalePeriod = onSalePeriod;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder onSaleEnd(Date onSaleEnd) {
      this.onSaleEnd = onSaleEnd;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder newMemberOnly(Boolean newMemberOnly) {
      this.newMemberOnly = newMemberOnly;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder mobileWebShow(Boolean mobileWebShow) {
      this.mobileWebShow = mobileWebShow;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder minNumberForDisplaySalesCount(Integer minNumberForDisplaySalesCount) {
      this.minNumberForDisplaySalesCount = minNumberForDisplaySalesCount;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder maxPerPerson(Integer maxPerPerson) {
      this.maxPerPerson = maxPerPerson;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder logistics(Boolean logistics) {
      this.logistics = logistics;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder forUseStartDate(Date forUseStartDate) {
      this.forUseStartDate = forUseStartDate;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder forUseStart(String forUseStart) {
      this.forUseStart = forUseStart;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder forUseEndDate(Date forUseEndDate) {
      this.forUseEndDate = forUseEndDate;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder forUseEnd(String forUseEnd) {
      this.forUseEnd = forUseEnd;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder forUseDateName(String forUseDateName) {
      this.forUseDateName = forUseDateName;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder eventDealButtonDisplay(Boolean eventDealButtonDisplay) {
      this.eventDealButtonDisplay = eventDealButtonDisplay;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder documentSrl(Long documentSrl) {
      this.documentSrl = documentSrl;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder directlyUse(Boolean directlyUse) {
      this.directlyUse = directlyUse;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder directOrder(Boolean directOrder) {
      this.directOrder = directOrder;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder descriptionMessage(String descriptionMessage) {
      this.descriptionMessage = descriptionMessage;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder deliveryProduct(Boolean deliveryProduct) {
      this.deliveryProduct = deliveryProduct;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder deliveryPrice(Integer deliveryPrice) {
      this.deliveryPrice = deliveryPrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder deliveryPeriods(List<Integer> deliveryPeriods) {
      this.deliveryPeriods = deliveryPeriods;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder deliveryPeriodUnit(String deliveryPeriodUnit) {
      this.deliveryPeriodUnit = deliveryPeriodUnit;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder criteriaPriceInfo(String criteriaPriceInfo) {
      this.criteriaPriceInfo = criteriaPriceInfo;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder coupangSpecialPrice(Boolean coupangSpecialPrice) {
      this.coupangSpecialPrice = coupangSpecialPrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder coupangShow(Boolean coupangShow) {
      this.coupangShow = coupangShow;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder conditionalFreeshipping(Boolean conditionalFreeshipping) {
      this.conditionalFreeshipping = conditionalFreeshipping;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder closeTime(String closeTime) {
      this.closeTime = closeTime;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder buttonType(ButtonTypeEnum buttonType) {
      this.buttonType = buttonType;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder bundleDealPrice(Integer bundleDealPrice) {
      this.bundleDealPrice = bundleDealPrice;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder bundleDealEa(Integer bundleDealEa) {
      this.bundleDealEa = bundleDealEa;
      return this;
    }

    /**
     **/
    public DisplayDetailDtoBuilder bannerType(String bannerType) {
      this.bannerType = bannerType;
      return this;
    }


    public DisplayDetailDto build() {
      DisplayDetailDto displayDetailDto = new DisplayDetailDto();
      displayDetailDto.setZeroDealType(this.zeroDealType);
      displayDetailDto.setZeroDeal(this.zeroDeal);
      displayDetailDto.setVendorItemIds(this.vendorItemIds);
      displayDetailDto.setValidOption(this.validOption);
      displayDetailDto.setValid(this.valid);
      displayDetailDto.setUseCondition(this.useCondition);
      displayDetailDto.setUnitDescription(this.unitDescription);
      displayDetailDto.setTravelDto(this.travelDto);
      displayDetailDto.setTravel(this.travel);
      displayDetailDto.setTotalSalesCount(this.totalSalesCount);
      displayDetailDto.setTitle(this.title);
      displayDetailDto.setSubscribeSalePrice(this.subscribeSalePrice);
      displayDetailDto.setSubscribeDiscountRate(this.subscribeDiscountRate);
      displayDetailDto.setSubscribable(this.subscribable);
      displayDetailDto.setSoldoutApproachCount(this.soldoutApproachCount);
      displayDetailDto.setShownUseDate(this.shownUseDate);
      displayDetailDto.setShownPremium(this.shownPremium);
      displayDetailDto.setSharemsg(this.sharemsg);
      displayDetailDto.setSellingStatusType(this.sellingStatusType);
      displayDetailDto.setSavingPoint(this.savingPoint);
      displayDetailDto.setSalesQuantity(this.salesQuantity);
      displayDetailDto.setSalesPrice(this.salesPrice);
      displayDetailDto.setSalePeriodType(this.salePeriodType);
      displayDetailDto.setRoleId(this.roleId);
      displayDetailDto.setRepresentativeDisplayCategoryCode(this.representativeDisplayCategoryCode);
      displayDetailDto.setProductServicePlatformType(this.productServicePlatformType);
      displayDetailDto.setProductImage(this.productImage);
      displayDetailDto.setPictograms(this.pictograms);
      displayDetailDto.setPayOnDelivery(this.payOnDelivery);
      displayDetailDto.setParallelImported(this.parallelImported);
      displayDetailDto.setOverseasPurchase(this.overseasPurchase);
      displayDetailDto.setOverAmountFreeshipping(this.overAmountFreeshipping);
      displayDetailDto.setOriginalPriceType(this.originalPriceType);
      displayDetailDto.setOriginalPrice(this.originalPrice);
      displayDetailDto.setOptionType(this.optionType);
      displayDetailDto.setOpenTime(this.openTime);
      displayDetailDto.setOnSaleStart(this.onSaleStart);
      displayDetailDto.setOnSalePeriod(this.onSalePeriod);
      displayDetailDto.setOnSaleEnd(this.onSaleEnd);
      displayDetailDto.setNewMemberOnly(this.newMemberOnly);
      displayDetailDto.setMobileWebShow(this.mobileWebShow);
      displayDetailDto.setMinNumberForDisplaySalesCount(this.minNumberForDisplaySalesCount);
      displayDetailDto.setMaxPerPerson(this.maxPerPerson);
      displayDetailDto.setLogistics(this.logistics);
      displayDetailDto.setId(this.id);
      displayDetailDto.setForUseStartDate(this.forUseStartDate);
      displayDetailDto.setForUseStart(this.forUseStart);
      displayDetailDto.setForUseEndDate(this.forUseEndDate);
      displayDetailDto.setForUseEnd(this.forUseEnd);
      displayDetailDto.setForUseDateName(this.forUseDateName);
      displayDetailDto.setEventDealButtonDisplay(this.eventDealButtonDisplay);
      displayDetailDto.setDocumentSrl(this.documentSrl);
      displayDetailDto.setDivisionType(this.divisionType);
      displayDetailDto.setDisplayCategoryCodes(this.displayCategoryCodes);
      displayDetailDto.setDirectlyUse(this.directlyUse);
      displayDetailDto.setDirectOrder(this.directOrder);
      displayDetailDto.setDescriptionMessage(this.descriptionMessage);
      displayDetailDto.setDescription(this.description);
      displayDetailDto.setDeliveryProduct(this.deliveryProduct);
      displayDetailDto.setDeliveryPrice(this.deliveryPrice);
      displayDetailDto.setDeliveryPeriods(this.deliveryPeriods);
      displayDetailDto.setDeliveryPeriodUnit(this.deliveryPeriodUnit);
      displayDetailDto.setCriteriaPriceInfo(this.criteriaPriceInfo);
      displayDetailDto.setCoupangSpecialPrice(this.coupangSpecialPrice);
      displayDetailDto.setCoupangShow(this.coupangShow);
      displayDetailDto.setConditionalFreeshipping(this.conditionalFreeshipping);
      displayDetailDto.setCloseTime(this.closeTime);
      displayDetailDto.setButtonType(this.buttonType);
      displayDetailDto.setBundleDealPrice(this.bundleDealPrice);
      displayDetailDto.setBundleDealEa(this.bundleDealEa);
      displayDetailDto.setBannerType(this.bannerType);
      return displayDetailDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayDetailDtoBuilder {\n");
      
      sb.append("    zeroDealType: ").append(toIndentedString(zeroDealType)).append("\n");
      sb.append("    zeroDeal: ").append(toIndentedString(zeroDeal)).append("\n");
      sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
      sb.append("    validOption: ").append(toIndentedString(validOption)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
      sb.append("    unitDescription: ").append(toIndentedString(unitDescription)).append("\n");
      sb.append("    travelDto: ").append(toIndentedString(travelDto)).append("\n");
      sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
      sb.append("    totalSalesCount: ").append(toIndentedString(totalSalesCount)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
      sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
      sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
      sb.append("    soldoutApproachCount: ").append(toIndentedString(soldoutApproachCount)).append("\n");
      sb.append("    shownUseDate: ").append(toIndentedString(shownUseDate)).append("\n");
      sb.append("    shownPremium: ").append(toIndentedString(shownPremium)).append("\n");
      sb.append("    sharemsg: ").append(toIndentedString(sharemsg)).append("\n");
      sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
      sb.append("    savingPoint: ").append(toIndentedString(savingPoint)).append("\n");
      sb.append("    salesQuantity: ").append(toIndentedString(salesQuantity)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
      sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
      sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
      sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
      sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
      sb.append("    pictograms: ").append(toIndentedString(pictograms)).append("\n");
      sb.append("    payOnDelivery: ").append(toIndentedString(payOnDelivery)).append("\n");
      sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
      sb.append("    overseasPurchase: ").append(toIndentedString(overseasPurchase)).append("\n");
      sb.append("    overAmountFreeshipping: ").append(toIndentedString(overAmountFreeshipping)).append("\n");
      sb.append("    originalPriceType: ").append(toIndentedString(originalPriceType)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
      sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
      sb.append("    onSaleStart: ").append(toIndentedString(onSaleStart)).append("\n");
      sb.append("    onSalePeriod: ").append(toIndentedString(onSalePeriod)).append("\n");
      sb.append("    onSaleEnd: ").append(toIndentedString(onSaleEnd)).append("\n");
      sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
      sb.append("    mobileWebShow: ").append(toIndentedString(mobileWebShow)).append("\n");
      sb.append("    minNumberForDisplaySalesCount: ").append(toIndentedString(minNumberForDisplaySalesCount)).append("\n");
      sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
      sb.append("    logistics: ").append(toIndentedString(logistics)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    forUseStartDate: ").append(toIndentedString(forUseStartDate)).append("\n");
      sb.append("    forUseStart: ").append(toIndentedString(forUseStart)).append("\n");
      sb.append("    forUseEndDate: ").append(toIndentedString(forUseEndDate)).append("\n");
      sb.append("    forUseEnd: ").append(toIndentedString(forUseEnd)).append("\n");
      sb.append("    forUseDateName: ").append(toIndentedString(forUseDateName)).append("\n");
      sb.append("    eventDealButtonDisplay: ").append(toIndentedString(eventDealButtonDisplay)).append("\n");
      sb.append("    documentSrl: ").append(toIndentedString(documentSrl)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    directlyUse: ").append(toIndentedString(directlyUse)).append("\n");
      sb.append("    directOrder: ").append(toIndentedString(directOrder)).append("\n");
      sb.append("    descriptionMessage: ").append(toIndentedString(descriptionMessage)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    deliveryProduct: ").append(toIndentedString(deliveryProduct)).append("\n");
      sb.append("    deliveryPrice: ").append(toIndentedString(deliveryPrice)).append("\n");
      sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
      sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
      sb.append("    criteriaPriceInfo: ").append(toIndentedString(criteriaPriceInfo)).append("\n");
      sb.append("    coupangSpecialPrice: ").append(toIndentedString(coupangSpecialPrice)).append("\n");
      sb.append("    coupangShow: ").append(toIndentedString(coupangShow)).append("\n");
      sb.append("    conditionalFreeshipping: ").append(toIndentedString(conditionalFreeshipping)).append("\n");
      sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
      sb.append("    buttonType: ").append(toIndentedString(buttonType)).append("\n");
      sb.append("    bundleDealPrice: ").append(toIndentedString(bundleDealPrice)).append("\n");
      sb.append("    bundleDealEa: ").append(toIndentedString(bundleDealEa)).append("\n");
      sb.append("    bannerType: ").append(toIndentedString(bannerType)).append("\n");
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

