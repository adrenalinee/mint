package com.coupang.apigateway.services.rss.model;

import java.util.Objects;
import com.coupang.apigateway.services.rss.model.VendorItemLegacyDTO;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.307+09:00")
public class VendorItemPackageLegacyDTO   {
  
  private Boolean webCancelEnabled = null;
  private String vendorItemPackageName = null;
  private Long vendorItemPackageId = null;
  private List<VendorItemLegacyDTO> vendorItemDTOs = new ArrayList<VendorItemLegacyDTO>();
  private String vendorId = null;
  private Boolean valid = null;
  private Date useStartAt = null;
  private Date useEndAt = null;
  private String useCondition = null;
  private Boolean unuseCouponRefunded = null;
  private String teamCode = null;
  private Integer soldCount = null;


  public enum ServiceCategoryCodeEnum {
    FOODANDBEVERAGE("FOODANDBEVERAGE"),
    BEAUTY("BEAUTY"),
    CULTURE("CULTURE"),
    TRAVEL("TRAVEL"),
    DELIVERY("DELIVERY"),
    EDUCATION("EDUCATION"),
    LEISURE("LEISURE"),
    FASHION("FASHION"),
    LODGING("LODGING"),
    SPORTS("SPORTS"),
    BABY("BABY"),
    LIVING("LIVING"),
    ONLINE("ONLINE");

    private String value;

    ServiceCategoryCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ServiceCategoryCodeEnum serviceCategoryCode = null;
  private Double salesPrice = null;
  private Date saleStartedAt = null;
  private String salePeriodType = null;
  private Date saleEndedAt = null;
  private Integer roleCode = null;
  private Boolean returnChargeVendor = null;
  private Boolean returnChargeCoupang = null;
  private Double returnCharge = null;
  private String representativeImage = null;
  private String primeType = null;
  private String phoneNumberForReturn = null;
  private Boolean parallelImported = null;
  private Boolean overseasPurchased = null;
  private Double originalPrice = null;
  private Boolean optionAutoFinish = null;
  private Integer minimumBuyTotal = null;
  private String mdId = null;
  private Integer maximumBuyTotal = null;
  private Integer maximumBuyForPersonPeriod = null;
  private Integer maximumBuyForPerson = null;
  private Boolean logisticsType = null;
  private Boolean importedByAgency = null;
  private String importAgencyName = null;
  private Double freeShipOverAmount = null;


  public enum ExchangeTypeEnum {
    NOTALLOW("NOTALLOW"),
    PRE("PRE"),
    AFTER("AFTER"),
    EXCHANGE("EXCHANGE"),
    VENDORDIRECT("VENDORDIRECT");

    private String value;

    ExchangeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ExchangeTypeEnum exchangeType = null;


  public enum EnableCancelPeriodCodeEnum {
    BE("BE"),
    A7("A7");

    private String value;

    EnableCancelPeriodCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private EnableCancelPeriodCodeEnum enableCancelPeriodCode = null;


  public enum DivisionTypeEnum {
    GOODS("GOODS"),
    LOCAL("LOCAL"),
    TRAVEL("TRAVEL"),
    CULTURE("CULTURE");

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


  public enum DeliveryMethodEnum {
    SEQUENCIAL("SEQUENCIAL"),
    VENDOR_DIRECT("VENDOR_DIRECT"),
    MAKE_ORDER("MAKE_ORDER"),
    INSTRUCTURE("INSTRUCTURE"),
    AGENT_BUY("AGENT_BUY"),
    COLD_FRESH("COLD_FRESH"),
    MAKE_ORDER_DIRECT("MAKE_ORDER_DIRECT");

    private String value;

    DeliveryMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private DeliveryMethodEnum deliveryMethod = null;


  public enum DeliveryChargeTypeEnum {
    FREE("FREE"),
    FREE_DELIVERY_OVER_9800("FREE_DELIVERY_OVER_9800"),
    CONDITIONAL_FREE("CONDITIONAL_FREE"),
    CHARGE_RECEIVED("CHARGE_RECEIVED");

    private String value;

    DeliveryChargeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private DeliveryChargeTypeEnum deliveryChargeType = null;
  private Double deliveryChargeOnReturn = null;
  private Double deliveryCharge = null;
  private Double coupangFreeShippingFee = null;
  private Boolean coupangFreeShippingApplicable = null;
  private Boolean batchShipment = null;
  private Integer autoRefundRate = null;


  public enum AutoCancelTypeEnum {
    AUTO_CANCEL("AUTO_CANCEL"),
    APPROVAL_CANCEL("APPROVAL_CANCEL"),
    AUTO_APPROVAL_CANCEL("AUTO_APPROVAL_CANCEL");

    private String value;

    AutoCancelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private AutoCancelTypeEnum autoCancelType = null;
  private Boolean adultOnly = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("webCancelEnabled")
  @com.fasterxml.jackson.annotation.JsonProperty("webCancelEnabled")
  public Boolean getWebCancelEnabled() {
    return webCancelEnabled;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isWebCancelEnabled() {
    return webCancelEnabled == null ? false : webCancelEnabled;
  }
  
  /**
   **/
  public void setWebCancelEnabled(Boolean webCancelEnabled) {
    this.webCancelEnabled = webCancelEnabled;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageName")
  public String getVendorItemPackageName() {
    return vendorItemPackageName;
  }
  
  /**
   **/
  public void setVendorItemPackageName(String vendorItemPackageName) {
    this.vendorItemPackageName = vendorItemPackageName;
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemDTOs")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemDTOs")
  public List<VendorItemLegacyDTO> getVendorItemDTOs() {
    return vendorItemDTOs;
  }
  
  /**
   **/
  public void setVendorItemDTOs(List<VendorItemLegacyDTO> vendorItemDTOs) {
    this.vendorItemDTOs = vendorItemDTOs;
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
  @org.codehaus.jackson.annotate.JsonProperty("useStartAt")
  @com.fasterxml.jackson.annotation.JsonProperty("useStartAt")
  public Date getUseStartAt() {
    return useStartAt;
  }
  
  /**
   **/
  public void setUseStartAt(Date useStartAt) {
    this.useStartAt = useStartAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useEndAt")
  @com.fasterxml.jackson.annotation.JsonProperty("useEndAt")
  public Date getUseEndAt() {
    return useEndAt;
  }
  
  /**
   **/
  public void setUseEndAt(Date useEndAt) {
    this.useEndAt = useEndAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("unuseCouponRefunded")
  @com.fasterxml.jackson.annotation.JsonProperty("unuseCouponRefunded")
  public Boolean getUnuseCouponRefunded() {
    return unuseCouponRefunded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUnuseCouponRefunded() {
    return unuseCouponRefunded == null ? false : unuseCouponRefunded;
  }
  
  /**
   **/
  public void setUnuseCouponRefunded(Boolean unuseCouponRefunded) {
    this.unuseCouponRefunded = unuseCouponRefunded;
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
  @org.codehaus.jackson.annotate.JsonProperty("serviceCategoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceCategoryCode")
  public ServiceCategoryCodeEnum getServiceCategoryCode() {
    return serviceCategoryCode;
  }
  
  /**
   **/
  public void setServiceCategoryCode(ServiceCategoryCodeEnum serviceCategoryCode) {
    this.serviceCategoryCode = serviceCategoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public Double getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(Double salesPrice) {
    this.salesPrice = salesPrice;
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
  @org.codehaus.jackson.annotate.JsonProperty("roleCode")
  @com.fasterxml.jackson.annotation.JsonProperty("roleCode")
  public Integer getRoleCode() {
    return roleCode;
  }
  
  /**
   **/
  public void setRoleCode(Integer roleCode) {
    this.roleCode = roleCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnChargeVendor")
  @com.fasterxml.jackson.annotation.JsonProperty("returnChargeVendor")
  public Boolean getReturnChargeVendor() {
    return returnChargeVendor;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnChargeVendor() {
    return returnChargeVendor == null ? false : returnChargeVendor;
  }
  
  /**
   **/
  public void setReturnChargeVendor(Boolean returnChargeVendor) {
    this.returnChargeVendor = returnChargeVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnChargeCoupang")
  @com.fasterxml.jackson.annotation.JsonProperty("returnChargeCoupang")
  public Boolean getReturnChargeCoupang() {
    return returnChargeCoupang;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnChargeCoupang() {
    return returnChargeCoupang == null ? false : returnChargeCoupang;
  }
  
  /**
   **/
  public void setReturnChargeCoupang(Boolean returnChargeCoupang) {
    this.returnChargeCoupang = returnChargeCoupang;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnCharge")
  @com.fasterxml.jackson.annotation.JsonProperty("returnCharge")
  public Double getReturnCharge() {
    return returnCharge;
  }
  
  /**
   **/
  public void setReturnCharge(Double returnCharge) {
    this.returnCharge = returnCharge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representativeImage")
  @com.fasterxml.jackson.annotation.JsonProperty("representativeImage")
  public String getRepresentativeImage() {
    return representativeImage;
  }
  
  /**
   **/
  public void setRepresentativeImage(String representativeImage) {
    this.representativeImage = representativeImage;
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
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumberForReturn")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumberForReturn")
  public String getPhoneNumberForReturn() {
    return phoneNumberForReturn;
  }
  
  /**
   **/
  public void setPhoneNumberForReturn(String phoneNumberForReturn) {
    this.phoneNumberForReturn = phoneNumberForReturn;
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
  @org.codehaus.jackson.annotate.JsonProperty("overseasPurchased")
  @com.fasterxml.jackson.annotation.JsonProperty("overseasPurchased")
  public Boolean getOverseasPurchased() {
    return overseasPurchased;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOverseasPurchased() {
    return overseasPurchased == null ? false : overseasPurchased;
  }
  
  /**
   **/
  public void setOverseasPurchased(Boolean overseasPurchased) {
    this.overseasPurchased = overseasPurchased;
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
  @org.codehaus.jackson.annotate.JsonProperty("optionAutoFinish")
  @com.fasterxml.jackson.annotation.JsonProperty("optionAutoFinish")
  public Boolean getOptionAutoFinish() {
    return optionAutoFinish;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOptionAutoFinish() {
    return optionAutoFinish == null ? false : optionAutoFinish;
  }
  
  /**
   **/
  public void setOptionAutoFinish(Boolean optionAutoFinish) {
    this.optionAutoFinish = optionAutoFinish;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minimumBuyTotal")
  @com.fasterxml.jackson.annotation.JsonProperty("minimumBuyTotal")
  public Integer getMinimumBuyTotal() {
    return minimumBuyTotal;
  }
  
  /**
   **/
  public void setMinimumBuyTotal(Integer minimumBuyTotal) {
    this.minimumBuyTotal = minimumBuyTotal;
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
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyTotal")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyTotal")
  public Integer getMaximumBuyTotal() {
    return maximumBuyTotal;
  }
  
  /**
   **/
  public void setMaximumBuyTotal(Integer maximumBuyTotal) {
    this.maximumBuyTotal = maximumBuyTotal;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPersonPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPersonPeriod")
  public Integer getMaximumBuyForPersonPeriod() {
    return maximumBuyForPersonPeriod;
  }
  
  /**
   **/
  public void setMaximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
    this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyForPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyForPerson")
  public Integer getMaximumBuyForPerson() {
    return maximumBuyForPerson;
  }
  
  /**
   **/
  public void setMaximumBuyForPerson(Integer maximumBuyForPerson) {
    this.maximumBuyForPerson = maximumBuyForPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logisticsType")
  @com.fasterxml.jackson.annotation.JsonProperty("logisticsType")
  public Boolean getLogisticsType() {
    return logisticsType;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogisticsType() {
    return logisticsType == null ? false : logisticsType;
  }
  
  /**
   **/
  public void setLogisticsType(Boolean logisticsType) {
    this.logisticsType = logisticsType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("importedByAgency")
  @com.fasterxml.jackson.annotation.JsonProperty("importedByAgency")
  public Boolean getImportedByAgency() {
    return importedByAgency;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isImportedByAgency() {
    return importedByAgency == null ? false : importedByAgency;
  }
  
  /**
   **/
  public void setImportedByAgency(Boolean importedByAgency) {
    this.importedByAgency = importedByAgency;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("importAgencyName")
  @com.fasterxml.jackson.annotation.JsonProperty("importAgencyName")
  public String getImportAgencyName() {
    return importAgencyName;
  }
  
  /**
   **/
  public void setImportAgencyName(String importAgencyName) {
    this.importAgencyName = importAgencyName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("freeShipOverAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("freeShipOverAmount")
  public Double getFreeShipOverAmount() {
    return freeShipOverAmount;
  }
  
  /**
   **/
  public void setFreeShipOverAmount(Double freeShipOverAmount) {
    this.freeShipOverAmount = freeShipOverAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exchangeType")
  @com.fasterxml.jackson.annotation.JsonProperty("exchangeType")
  public ExchangeTypeEnum getExchangeType() {
    return exchangeType;
  }
  
  /**
   **/
  public void setExchangeType(ExchangeTypeEnum exchangeType) {
    this.exchangeType = exchangeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("enableCancelPeriodCode")
  @com.fasterxml.jackson.annotation.JsonProperty("enableCancelPeriodCode")
  public EnableCancelPeriodCodeEnum getEnableCancelPeriodCode() {
    return enableCancelPeriodCode;
  }
  
  /**
   **/
  public void setEnableCancelPeriodCode(EnableCancelPeriodCodeEnum enableCancelPeriodCode) {
    this.enableCancelPeriodCode = enableCancelPeriodCode;
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
  @org.codehaus.jackson.annotate.JsonProperty("deliveryMethod")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryMethod")
  public DeliveryMethodEnum getDeliveryMethod() {
    return deliveryMethod;
  }
  
  /**
   **/
  public void setDeliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryChargeType")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryChargeType")
  public DeliveryChargeTypeEnum getDeliveryChargeType() {
    return deliveryChargeType;
  }
  
  /**
   **/
  public void setDeliveryChargeType(DeliveryChargeTypeEnum deliveryChargeType) {
    this.deliveryChargeType = deliveryChargeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryChargeOnReturn")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryChargeOnReturn")
  public Double getDeliveryChargeOnReturn() {
    return deliveryChargeOnReturn;
  }
  
  /**
   **/
  public void setDeliveryChargeOnReturn(Double deliveryChargeOnReturn) {
    this.deliveryChargeOnReturn = deliveryChargeOnReturn;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryCharge")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryCharge")
  public Double getDeliveryCharge() {
    return deliveryCharge;
  }
  
  /**
   **/
  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangFreeShippingFee")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangFreeShippingFee")
  public Double getCoupangFreeShippingFee() {
    return coupangFreeShippingFee;
  }
  
  /**
   **/
  public void setCoupangFreeShippingFee(Double coupangFreeShippingFee) {
    this.coupangFreeShippingFee = coupangFreeShippingFee;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangFreeShippingApplicable")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangFreeShippingApplicable")
  public Boolean getCoupangFreeShippingApplicable() {
    return coupangFreeShippingApplicable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCoupangFreeShippingApplicable() {
    return coupangFreeShippingApplicable == null ? false : coupangFreeShippingApplicable;
  }
  
  /**
   **/
  public void setCoupangFreeShippingApplicable(Boolean coupangFreeShippingApplicable) {
    this.coupangFreeShippingApplicable = coupangFreeShippingApplicable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("batchShipment")
  @com.fasterxml.jackson.annotation.JsonProperty("batchShipment")
  public Boolean getBatchShipment() {
    return batchShipment;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBatchShipment() {
    return batchShipment == null ? false : batchShipment;
  }
  
  /**
   **/
  public void setBatchShipment(Boolean batchShipment) {
    this.batchShipment = batchShipment;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoRefundRate")
  @com.fasterxml.jackson.annotation.JsonProperty("autoRefundRate")
  public Integer getAutoRefundRate() {
    return autoRefundRate;
  }
  
  /**
   **/
  public void setAutoRefundRate(Integer autoRefundRate) {
    this.autoRefundRate = autoRefundRate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoCancelType")
  @com.fasterxml.jackson.annotation.JsonProperty("autoCancelType")
  public AutoCancelTypeEnum getAutoCancelType() {
    return autoCancelType;
  }
  
  /**
   **/
  public void setAutoCancelType(AutoCancelTypeEnum autoCancelType) {
    this.autoCancelType = autoCancelType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adultOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("adultOnly")
  public Boolean getAdultOnly() {
    return adultOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultOnly() {
    return adultOnly == null ? false : adultOnly;
  }
  
  /**
   **/
  public void setAdultOnly(Boolean adultOnly) {
    this.adultOnly = adultOnly;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemPackageLegacyDTO vendorItemPackageLegacyDTO = (VendorItemPackageLegacyDTO) o;
    return Objects.equals(this.webCancelEnabled, vendorItemPackageLegacyDTO.webCancelEnabled) &&
        Objects.equals(this.vendorItemPackageName, vendorItemPackageLegacyDTO.vendorItemPackageName) &&
        Objects.equals(this.vendorItemPackageId, vendorItemPackageLegacyDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemDTOs, vendorItemPackageLegacyDTO.vendorItemDTOs) &&
        Objects.equals(this.vendorId, vendorItemPackageLegacyDTO.vendorId) &&
        Objects.equals(this.valid, vendorItemPackageLegacyDTO.valid) &&
        Objects.equals(this.useStartAt, vendorItemPackageLegacyDTO.useStartAt) &&
        Objects.equals(this.useEndAt, vendorItemPackageLegacyDTO.useEndAt) &&
        Objects.equals(this.useCondition, vendorItemPackageLegacyDTO.useCondition) &&
        Objects.equals(this.unuseCouponRefunded, vendorItemPackageLegacyDTO.unuseCouponRefunded) &&
        Objects.equals(this.teamCode, vendorItemPackageLegacyDTO.teamCode) &&
        Objects.equals(this.soldCount, vendorItemPackageLegacyDTO.soldCount) &&
        Objects.equals(this.serviceCategoryCode, vendorItemPackageLegacyDTO.serviceCategoryCode) &&
        Objects.equals(this.salesPrice, vendorItemPackageLegacyDTO.salesPrice) &&
        Objects.equals(this.saleStartedAt, vendorItemPackageLegacyDTO.saleStartedAt) &&
        Objects.equals(this.salePeriodType, vendorItemPackageLegacyDTO.salePeriodType) &&
        Objects.equals(this.saleEndedAt, vendorItemPackageLegacyDTO.saleEndedAt) &&
        Objects.equals(this.roleCode, vendorItemPackageLegacyDTO.roleCode) &&
        Objects.equals(this.returnChargeVendor, vendorItemPackageLegacyDTO.returnChargeVendor) &&
        Objects.equals(this.returnChargeCoupang, vendorItemPackageLegacyDTO.returnChargeCoupang) &&
        Objects.equals(this.returnCharge, vendorItemPackageLegacyDTO.returnCharge) &&
        Objects.equals(this.representativeImage, vendorItemPackageLegacyDTO.representativeImage) &&
        Objects.equals(this.primeType, vendorItemPackageLegacyDTO.primeType) &&
        Objects.equals(this.phoneNumberForReturn, vendorItemPackageLegacyDTO.phoneNumberForReturn) &&
        Objects.equals(this.parallelImported, vendorItemPackageLegacyDTO.parallelImported) &&
        Objects.equals(this.overseasPurchased, vendorItemPackageLegacyDTO.overseasPurchased) &&
        Objects.equals(this.originalPrice, vendorItemPackageLegacyDTO.originalPrice) &&
        Objects.equals(this.optionAutoFinish, vendorItemPackageLegacyDTO.optionAutoFinish) &&
        Objects.equals(this.minimumBuyTotal, vendorItemPackageLegacyDTO.minimumBuyTotal) &&
        Objects.equals(this.mdId, vendorItemPackageLegacyDTO.mdId) &&
        Objects.equals(this.maximumBuyTotal, vendorItemPackageLegacyDTO.maximumBuyTotal) &&
        Objects.equals(this.maximumBuyForPersonPeriod, vendorItemPackageLegacyDTO.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, vendorItemPackageLegacyDTO.maximumBuyForPerson) &&
        Objects.equals(this.logisticsType, vendorItemPackageLegacyDTO.logisticsType) &&
        Objects.equals(this.importedByAgency, vendorItemPackageLegacyDTO.importedByAgency) &&
        Objects.equals(this.importAgencyName, vendorItemPackageLegacyDTO.importAgencyName) &&
        Objects.equals(this.freeShipOverAmount, vendorItemPackageLegacyDTO.freeShipOverAmount) &&
        Objects.equals(this.exchangeType, vendorItemPackageLegacyDTO.exchangeType) &&
        Objects.equals(this.enableCancelPeriodCode, vendorItemPackageLegacyDTO.enableCancelPeriodCode) &&
        Objects.equals(this.divisionType, vendorItemPackageLegacyDTO.divisionType) &&
        Objects.equals(this.displayCategoryCodes, vendorItemPackageLegacyDTO.displayCategoryCodes) &&
        Objects.equals(this.deliveryMethod, vendorItemPackageLegacyDTO.deliveryMethod) &&
        Objects.equals(this.deliveryChargeType, vendorItemPackageLegacyDTO.deliveryChargeType) &&
        Objects.equals(this.deliveryChargeOnReturn, vendorItemPackageLegacyDTO.deliveryChargeOnReturn) &&
        Objects.equals(this.deliveryCharge, vendorItemPackageLegacyDTO.deliveryCharge) &&
        Objects.equals(this.coupangFreeShippingFee, vendorItemPackageLegacyDTO.coupangFreeShippingFee) &&
        Objects.equals(this.coupangFreeShippingApplicable, vendorItemPackageLegacyDTO.coupangFreeShippingApplicable) &&
        Objects.equals(this.batchShipment, vendorItemPackageLegacyDTO.batchShipment) &&
        Objects.equals(this.autoRefundRate, vendorItemPackageLegacyDTO.autoRefundRate) &&
        Objects.equals(this.autoCancelType, vendorItemPackageLegacyDTO.autoCancelType) &&
        Objects.equals(this.adultOnly, vendorItemPackageLegacyDTO.adultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webCancelEnabled, vendorItemPackageName, vendorItemPackageId, vendorItemDTOs, vendorId, valid, useStartAt, useEndAt, useCondition, unuseCouponRefunded, teamCode, soldCount, serviceCategoryCode, salesPrice, saleStartedAt, salePeriodType, saleEndedAt, roleCode, returnChargeVendor, returnChargeCoupang, returnCharge, representativeImage, primeType, phoneNumberForReturn, parallelImported, overseasPurchased, originalPrice, optionAutoFinish, minimumBuyTotal, mdId, maximumBuyTotal, maximumBuyForPersonPeriod, maximumBuyForPerson, logisticsType, importedByAgency, importAgencyName, freeShipOverAmount, exchangeType, enableCancelPeriodCode, divisionType, displayCategoryCodes, deliveryMethod, deliveryChargeType, deliveryChargeOnReturn, deliveryCharge, coupangFreeShippingFee, coupangFreeShippingApplicable, batchShipment, autoRefundRate, autoCancelType, adultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemPackageLegacyDTO {\n");
    
    sb.append("    webCancelEnabled: ").append(toIndentedString(webCancelEnabled)).append("\n");
    sb.append("    vendorItemPackageName: ").append(toIndentedString(vendorItemPackageName)).append("\n");
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemDTOs: ").append(toIndentedString(vendorItemDTOs)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    useStartAt: ").append(toIndentedString(useStartAt)).append("\n");
    sb.append("    useEndAt: ").append(toIndentedString(useEndAt)).append("\n");
    sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
    sb.append("    unuseCouponRefunded: ").append(toIndentedString(unuseCouponRefunded)).append("\n");
    sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    serviceCategoryCode: ").append(toIndentedString(serviceCategoryCode)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
    sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
    sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    returnChargeVendor: ").append(toIndentedString(returnChargeVendor)).append("\n");
    sb.append("    returnChargeCoupang: ").append(toIndentedString(returnChargeCoupang)).append("\n");
    sb.append("    returnCharge: ").append(toIndentedString(returnCharge)).append("\n");
    sb.append("    representativeImage: ").append(toIndentedString(representativeImage)).append("\n");
    sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
    sb.append("    phoneNumberForReturn: ").append(toIndentedString(phoneNumberForReturn)).append("\n");
    sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
    sb.append("    overseasPurchased: ").append(toIndentedString(overseasPurchased)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    optionAutoFinish: ").append(toIndentedString(optionAutoFinish)).append("\n");
    sb.append("    minimumBuyTotal: ").append(toIndentedString(minimumBuyTotal)).append("\n");
    sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
    sb.append("    maximumBuyTotal: ").append(toIndentedString(maximumBuyTotal)).append("\n");
    sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
    sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
    sb.append("    importedByAgency: ").append(toIndentedString(importedByAgency)).append("\n");
    sb.append("    importAgencyName: ").append(toIndentedString(importAgencyName)).append("\n");
    sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
    sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
    sb.append("    enableCancelPeriodCode: ").append(toIndentedString(enableCancelPeriodCode)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
    sb.append("    deliveryChargeOnReturn: ").append(toIndentedString(deliveryChargeOnReturn)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    coupangFreeShippingFee: ").append(toIndentedString(coupangFreeShippingFee)).append("\n");
    sb.append("    coupangFreeShippingApplicable: ").append(toIndentedString(coupangFreeShippingApplicable)).append("\n");
    sb.append("    batchShipment: ").append(toIndentedString(batchShipment)).append("\n");
    sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
    sb.append("    autoCancelType: ").append(toIndentedString(autoCancelType)).append("\n");
    sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

  public static VendorItemPackageLegacyDTOBuilder builder() {
    return new VendorItemPackageLegacyDTOBuilder();
  }

  public static class VendorItemPackageLegacyDTOBuilder {

    private Boolean webCancelEnabled = null;
    private String vendorItemPackageName = null;
    private Long vendorItemPackageId = null;
    private List<VendorItemLegacyDTO> vendorItemDTOs = new ArrayList<VendorItemLegacyDTO>();
    private String vendorId = null;
    private Boolean valid = null;
    private Date useStartAt = null;
    private Date useEndAt = null;
    private String useCondition = null;
    private Boolean unuseCouponRefunded = null;
    private String teamCode = null;
    private Integer soldCount = null;
    private ServiceCategoryCodeEnum serviceCategoryCode = null;
    private Double salesPrice = null;
    private Date saleStartedAt = null;
    private String salePeriodType = null;
    private Date saleEndedAt = null;
    private Integer roleCode = null;
    private Boolean returnChargeVendor = null;
    private Boolean returnChargeCoupang = null;
    private Double returnCharge = null;
    private String representativeImage = null;
    private String primeType = null;
    private String phoneNumberForReturn = null;
    private Boolean parallelImported = null;
    private Boolean overseasPurchased = null;
    private Double originalPrice = null;
    private Boolean optionAutoFinish = null;
    private Integer minimumBuyTotal = null;
    private String mdId = null;
    private Integer maximumBuyTotal = null;
    private Integer maximumBuyForPersonPeriod = null;
    private Integer maximumBuyForPerson = null;
    private Boolean logisticsType = null;
    private Boolean importedByAgency = null;
    private String importAgencyName = null;
    private Double freeShipOverAmount = null;
    private ExchangeTypeEnum exchangeType = null;
    private EnableCancelPeriodCodeEnum enableCancelPeriodCode = null;
    private DivisionTypeEnum divisionType = null;
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private DeliveryMethodEnum deliveryMethod = null;
    private DeliveryChargeTypeEnum deliveryChargeType = null;
    private Double deliveryChargeOnReturn = null;
    private Double deliveryCharge = null;
    private Double coupangFreeShippingFee = null;
    private Boolean coupangFreeShippingApplicable = null;
    private Boolean batchShipment = null;
    private Integer autoRefundRate = null;
    private AutoCancelTypeEnum autoCancelType = null;
    private Boolean adultOnly = null;
    

    VendorItemPackageLegacyDTOBuilder() {
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder webCancelEnabled(Boolean webCancelEnabled) {
      this.webCancelEnabled = webCancelEnabled;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder vendorItemPackageName(String vendorItemPackageName) {
      this.vendorItemPackageName = vendorItemPackageName;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder vendorItemDTOs(List<VendorItemLegacyDTO> vendorItemDTOs) {
      this.vendorItemDTOs = vendorItemDTOs;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder useStartAt(Date useStartAt) {
      this.useStartAt = useStartAt;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder useEndAt(Date useEndAt) {
      this.useEndAt = useEndAt;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder useCondition(String useCondition) {
      this.useCondition = useCondition;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder unuseCouponRefunded(Boolean unuseCouponRefunded) {
      this.unuseCouponRefunded = unuseCouponRefunded;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder teamCode(String teamCode) {
      this.teamCode = teamCode;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder serviceCategoryCode(ServiceCategoryCodeEnum serviceCategoryCode) {
      this.serviceCategoryCode = serviceCategoryCode;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder salesPrice(Double salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder saleStartedAt(Date saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder saleEndedAt(Date saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder roleCode(Integer roleCode) {
      this.roleCode = roleCode;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder returnChargeVendor(Boolean returnChargeVendor) {
      this.returnChargeVendor = returnChargeVendor;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder returnChargeCoupang(Boolean returnChargeCoupang) {
      this.returnChargeCoupang = returnChargeCoupang;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder returnCharge(Double returnCharge) {
      this.returnCharge = returnCharge;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder representativeImage(String representativeImage) {
      this.representativeImage = representativeImage;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder primeType(String primeType) {
      this.primeType = primeType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder phoneNumberForReturn(String phoneNumberForReturn) {
      this.phoneNumberForReturn = phoneNumberForReturn;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder parallelImported(Boolean parallelImported) {
      this.parallelImported = parallelImported;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder overseasPurchased(Boolean overseasPurchased) {
      this.overseasPurchased = overseasPurchased;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder originalPrice(Double originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder optionAutoFinish(Boolean optionAutoFinish) {
      this.optionAutoFinish = optionAutoFinish;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder minimumBuyTotal(Integer minimumBuyTotal) {
      this.minimumBuyTotal = minimumBuyTotal;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder mdId(String mdId) {
      this.mdId = mdId;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder maximumBuyTotal(Integer maximumBuyTotal) {
      this.maximumBuyTotal = maximumBuyTotal;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder logisticsType(Boolean logisticsType) {
      this.logisticsType = logisticsType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder importedByAgency(Boolean importedByAgency) {
      this.importedByAgency = importedByAgency;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder importAgencyName(String importAgencyName) {
      this.importAgencyName = importAgencyName;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder freeShipOverAmount(Double freeShipOverAmount) {
      this.freeShipOverAmount = freeShipOverAmount;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder exchangeType(ExchangeTypeEnum exchangeType) {
      this.exchangeType = exchangeType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder enableCancelPeriodCode(EnableCancelPeriodCodeEnum enableCancelPeriodCode) {
      this.enableCancelPeriodCode = enableCancelPeriodCode;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder divisionType(DivisionTypeEnum divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder deliveryMethod(DeliveryMethodEnum deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder deliveryChargeType(DeliveryChargeTypeEnum deliveryChargeType) {
      this.deliveryChargeType = deliveryChargeType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder deliveryChargeOnReturn(Double deliveryChargeOnReturn) {
      this.deliveryChargeOnReturn = deliveryChargeOnReturn;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder deliveryCharge(Double deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder coupangFreeShippingFee(Double coupangFreeShippingFee) {
      this.coupangFreeShippingFee = coupangFreeShippingFee;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder coupangFreeShippingApplicable(Boolean coupangFreeShippingApplicable) {
      this.coupangFreeShippingApplicable = coupangFreeShippingApplicable;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder batchShipment(Boolean batchShipment) {
      this.batchShipment = batchShipment;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder autoRefundRate(Integer autoRefundRate) {
      this.autoRefundRate = autoRefundRate;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder autoCancelType(AutoCancelTypeEnum autoCancelType) {
      this.autoCancelType = autoCancelType;
      return this;
    }

    /**
     **/
    public VendorItemPackageLegacyDTOBuilder adultOnly(Boolean adultOnly) {
      this.adultOnly = adultOnly;
      return this;
    }


    public VendorItemPackageLegacyDTO build() {
      VendorItemPackageLegacyDTO vendorItemPackageLegacyDTO = new VendorItemPackageLegacyDTO();
      vendorItemPackageLegacyDTO.setWebCancelEnabled(this.webCancelEnabled);
      vendorItemPackageLegacyDTO.setVendorItemPackageName(this.vendorItemPackageName);
      vendorItemPackageLegacyDTO.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemPackageLegacyDTO.setVendorItemDTOs(this.vendorItemDTOs);
      vendorItemPackageLegacyDTO.setVendorId(this.vendorId);
      vendorItemPackageLegacyDTO.setValid(this.valid);
      vendorItemPackageLegacyDTO.setUseStartAt(this.useStartAt);
      vendorItemPackageLegacyDTO.setUseEndAt(this.useEndAt);
      vendorItemPackageLegacyDTO.setUseCondition(this.useCondition);
      vendorItemPackageLegacyDTO.setUnuseCouponRefunded(this.unuseCouponRefunded);
      vendorItemPackageLegacyDTO.setTeamCode(this.teamCode);
      vendorItemPackageLegacyDTO.setSoldCount(this.soldCount);
      vendorItemPackageLegacyDTO.setServiceCategoryCode(this.serviceCategoryCode);
      vendorItemPackageLegacyDTO.setSalesPrice(this.salesPrice);
      vendorItemPackageLegacyDTO.setSaleStartedAt(this.saleStartedAt);
      vendorItemPackageLegacyDTO.setSalePeriodType(this.salePeriodType);
      vendorItemPackageLegacyDTO.setSaleEndedAt(this.saleEndedAt);
      vendorItemPackageLegacyDTO.setRoleCode(this.roleCode);
      vendorItemPackageLegacyDTO.setReturnChargeVendor(this.returnChargeVendor);
      vendorItemPackageLegacyDTO.setReturnChargeCoupang(this.returnChargeCoupang);
      vendorItemPackageLegacyDTO.setReturnCharge(this.returnCharge);
      vendorItemPackageLegacyDTO.setRepresentativeImage(this.representativeImage);
      vendorItemPackageLegacyDTO.setPrimeType(this.primeType);
      vendorItemPackageLegacyDTO.setPhoneNumberForReturn(this.phoneNumberForReturn);
      vendorItemPackageLegacyDTO.setParallelImported(this.parallelImported);
      vendorItemPackageLegacyDTO.setOverseasPurchased(this.overseasPurchased);
      vendorItemPackageLegacyDTO.setOriginalPrice(this.originalPrice);
      vendorItemPackageLegacyDTO.setOptionAutoFinish(this.optionAutoFinish);
      vendorItemPackageLegacyDTO.setMinimumBuyTotal(this.minimumBuyTotal);
      vendorItemPackageLegacyDTO.setMdId(this.mdId);
      vendorItemPackageLegacyDTO.setMaximumBuyTotal(this.maximumBuyTotal);
      vendorItemPackageLegacyDTO.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      vendorItemPackageLegacyDTO.setMaximumBuyForPerson(this.maximumBuyForPerson);
      vendorItemPackageLegacyDTO.setLogisticsType(this.logisticsType);
      vendorItemPackageLegacyDTO.setImportedByAgency(this.importedByAgency);
      vendorItemPackageLegacyDTO.setImportAgencyName(this.importAgencyName);
      vendorItemPackageLegacyDTO.setFreeShipOverAmount(this.freeShipOverAmount);
      vendorItemPackageLegacyDTO.setExchangeType(this.exchangeType);
      vendorItemPackageLegacyDTO.setEnableCancelPeriodCode(this.enableCancelPeriodCode);
      vendorItemPackageLegacyDTO.setDivisionType(this.divisionType);
      vendorItemPackageLegacyDTO.setDisplayCategoryCodes(this.displayCategoryCodes);
      vendorItemPackageLegacyDTO.setDeliveryMethod(this.deliveryMethod);
      vendorItemPackageLegacyDTO.setDeliveryChargeType(this.deliveryChargeType);
      vendorItemPackageLegacyDTO.setDeliveryChargeOnReturn(this.deliveryChargeOnReturn);
      vendorItemPackageLegacyDTO.setDeliveryCharge(this.deliveryCharge);
      vendorItemPackageLegacyDTO.setCoupangFreeShippingFee(this.coupangFreeShippingFee);
      vendorItemPackageLegacyDTO.setCoupangFreeShippingApplicable(this.coupangFreeShippingApplicable);
      vendorItemPackageLegacyDTO.setBatchShipment(this.batchShipment);
      vendorItemPackageLegacyDTO.setAutoRefundRate(this.autoRefundRate);
      vendorItemPackageLegacyDTO.setAutoCancelType(this.autoCancelType);
      vendorItemPackageLegacyDTO.setAdultOnly(this.adultOnly);
      return vendorItemPackageLegacyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemPackageLegacyDTOBuilder {\n");
      
      sb.append("    webCancelEnabled: ").append(toIndentedString(webCancelEnabled)).append("\n");
      sb.append("    vendorItemPackageName: ").append(toIndentedString(vendorItemPackageName)).append("\n");
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemDTOs: ").append(toIndentedString(vendorItemDTOs)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    useStartAt: ").append(toIndentedString(useStartAt)).append("\n");
      sb.append("    useEndAt: ").append(toIndentedString(useEndAt)).append("\n");
      sb.append("    useCondition: ").append(toIndentedString(useCondition)).append("\n");
      sb.append("    unuseCouponRefunded: ").append(toIndentedString(unuseCouponRefunded)).append("\n");
      sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    serviceCategoryCode: ").append(toIndentedString(serviceCategoryCode)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
      sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
      sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
      sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
      sb.append("    returnChargeVendor: ").append(toIndentedString(returnChargeVendor)).append("\n");
      sb.append("    returnChargeCoupang: ").append(toIndentedString(returnChargeCoupang)).append("\n");
      sb.append("    returnCharge: ").append(toIndentedString(returnCharge)).append("\n");
      sb.append("    representativeImage: ").append(toIndentedString(representativeImage)).append("\n");
      sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
      sb.append("    phoneNumberForReturn: ").append(toIndentedString(phoneNumberForReturn)).append("\n");
      sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
      sb.append("    overseasPurchased: ").append(toIndentedString(overseasPurchased)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    optionAutoFinish: ").append(toIndentedString(optionAutoFinish)).append("\n");
      sb.append("    minimumBuyTotal: ").append(toIndentedString(minimumBuyTotal)).append("\n");
      sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
      sb.append("    maximumBuyTotal: ").append(toIndentedString(maximumBuyTotal)).append("\n");
      sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
      sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
      sb.append("    importedByAgency: ").append(toIndentedString(importedByAgency)).append("\n");
      sb.append("    importAgencyName: ").append(toIndentedString(importAgencyName)).append("\n");
      sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
      sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
      sb.append("    enableCancelPeriodCode: ").append(toIndentedString(enableCancelPeriodCode)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
      sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
      sb.append("    deliveryChargeOnReturn: ").append(toIndentedString(deliveryChargeOnReturn)).append("\n");
      sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
      sb.append("    coupangFreeShippingFee: ").append(toIndentedString(coupangFreeShippingFee)).append("\n");
      sb.append("    coupangFreeShippingApplicable: ").append(toIndentedString(coupangFreeShippingApplicable)).append("\n");
      sb.append("    batchShipment: ").append(toIndentedString(batchShipment)).append("\n");
      sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
      sb.append("    autoCancelType: ").append(toIndentedString(autoCancelType)).append("\n");
      sb.append("    adultOnly: ").append(toIndentedString(adultOnly)).append("\n");
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

