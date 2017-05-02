package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CultureDto;
import com.coupang.apigateway.services.product_api.model.GoodsDto;
import com.coupang.apigateway.services.product_api.model.LocalDto;
import com.coupang.apigateway.services.product_api.model.TravelDto;
import com.coupang.apigateway.services.product_api.model.VendorItemCertificationAdapterDto;
import com.coupang.apigateway.services.product_api.model.VendorItemDescriptionDto;
import com.coupang.apigateway.services.product_api.model.VendorItemImageDto;
import com.coupang.apigateway.services.product_api.model.VendorItemPackagePolicyDto;
import com.coupang.apigateway.services.product_api.model.VendorItemPolicyDto;
import com.coupang.apigateway.services.product_api.model.VendorItemSkuDto;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemDTO   {
  
  private List<VendorItemSkuDto> vendorItemSkuDtos = new ArrayList<VendorItemSkuDto>();
  private Object vendorItemProperties = null;
  private VendorItemPolicyDto vendorItemPolicyDto = null;
  private Map<Long, String> vendorItemPackgeNames = new HashMap<Long, String>();
  private List<Long> vendorItemPackages = new ArrayList<Long>();
  private List<String> vendorItemPackageTypes = new ArrayList<String>();
  private Map<Long, String> vendorItemPackageTypeMap = new HashMap<Long, String>();
  private Map<Long, VendorItemPackagePolicyDto> vendorItemPackagePolicyDto = new HashMap<Long, VendorItemPackagePolicyDto>();
  private List<Long> vendorItemPackageIds = new ArrayList<Long>();
  private Long vendorItemPackageId = null;
  private String vendorItemName = null;
  private VendorItemImageDto vendorItemImageDto = null;
  private Long vendorItemId = null;
  private String vendorItemDescriptionLegacyType = null;
  private List<VendorItemDescriptionDto> vendorItemDescriptionDtos = new ArrayList<VendorItemDescriptionDto>();
  private List<VendorItemCertificationAdapterDto> vendorItemCertifications = new ArrayList<VendorItemCertificationAdapterDto>();
  private String vendorId = null;
  private Boolean valid = null;
  private Date useStartDate = null;
  private Date useEndDate = null;
  private Long usableVolume = null;
  private TravelDto travelDto = null;
  private String teamCode = null;
  private String taxType = null;
  private String subTitle = null;
  private Boolean soldOut = null;
  private Integer soldCount = null;
  private List<Long> skuIds = new ArrayList<Long>();
  private Date saleStartedAt = null;
  private String salePriceType = null;
  private java.math.BigDecimal salePrice = null;
  private String salePeriodType = null;
  private Date saleEndedAt = null;
  private Integer roleCode = null;
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
  private String productName = null;
  private Long productId = null;
  private String primeType = null;
  private java.math.BigDecimal paymentForVendor = null;
  private Map<Long, Integer> packageMaximumBuyForPersons = new HashMap<Long, Integer>();
  private java.math.BigDecimal originalPrice = null;
  private Boolean optionMustBought = null;
  private String notice = null;
  private Boolean newMemberOnly = null;
  private Date modifiedAt = null;
  private String mixPackYn = null;
  private String messageForExtraInfo = null;
  private String mdId = null;
  private Integer maximumBuyForPersonPeriod = null;
  private Integer maximumBuyForPerson = null;
  private Integer maximumBuyCount = null;
  private Integer maxMixPackCnt = null;
  private Long managementCategoryCode = null;
  private LocalDto localDto = null;
  private String labelForExtraInfo = null;
  private Long itemId = null;
  private Integer inventory = null;
  private GoodsDto goodsDto = null;
  private Boolean giftCard = null;
  private java.math.BigDecimal freeShipOverAmount = null;
  private Boolean extraInfoUsed = null;
  private String externalCode = null;
  private String dropStatus = null;
  private String divisionType = null;
  private List<String> displayChannels = new ArrayList<String>();
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private java.math.BigDecimal deliveryCharge = null;
  private CultureDto cultureDto = null;
  private Date createdAt = null;


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
  private Date autoFinishedAt = null;
  private Boolean autoFinished = null;
  private String autoCancelType = null;
  private Boolean almostSoldout = null;
  private Boolean adultOnly = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemSkuDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemSkuDtos")
  public List<VendorItemSkuDto> getVendorItemSkuDtos() {
    return vendorItemSkuDtos;
  }
  
  /**
   **/
  public void setVendorItemSkuDtos(List<VendorItemSkuDto> vendorItemSkuDtos) {
    this.vendorItemSkuDtos = vendorItemSkuDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemProperties")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemProperties")
  public Object getVendorItemProperties() {
    return vendorItemProperties;
  }
  
  /**
   **/
  public void setVendorItemProperties(Object vendorItemProperties) {
    this.vendorItemProperties = vendorItemProperties;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPolicyDto")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPolicyDto")
  public VendorItemPolicyDto getVendorItemPolicyDto() {
    return vendorItemPolicyDto;
  }
  
  /**
   **/
  public void setVendorItemPolicyDto(VendorItemPolicyDto vendorItemPolicyDto) {
    this.vendorItemPolicyDto = vendorItemPolicyDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackgeNames")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackgeNames")
  public Map<Long, String> getVendorItemPackgeNames() {
    return vendorItemPackgeNames;
  }
  
  /**
   **/
  public void setVendorItemPackgeNames(Map<Long, String> vendorItemPackgeNames) {
    this.vendorItemPackgeNames = vendorItemPackgeNames;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackages")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackages")
  public List<Long> getVendorItemPackages() {
    return vendorItemPackages;
  }
  
  /**
   **/
  public void setVendorItemPackages(List<Long> vendorItemPackages) {
    this.vendorItemPackages = vendorItemPackages;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageTypes")
  public List<String> getVendorItemPackageTypes() {
    return vendorItemPackageTypes;
  }
  
  /**
   **/
  public void setVendorItemPackageTypes(List<String> vendorItemPackageTypes) {
    this.vendorItemPackageTypes = vendorItemPackageTypes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageTypeMap")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageTypeMap")
  public Map<Long, String> getVendorItemPackageTypeMap() {
    return vendorItemPackageTypeMap;
  }
  
  /**
   **/
  public void setVendorItemPackageTypeMap(Map<Long, String> vendorItemPackageTypeMap) {
    this.vendorItemPackageTypeMap = vendorItemPackageTypeMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackagePolicyDto")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackagePolicyDto")
  public Map<Long, VendorItemPackagePolicyDto> getVendorItemPackagePolicyDto() {
    return vendorItemPackagePolicyDto;
  }
  
  /**
   **/
  public void setVendorItemPackagePolicyDto(Map<Long, VendorItemPackagePolicyDto> vendorItemPackagePolicyDto) {
    this.vendorItemPackagePolicyDto = vendorItemPackagePolicyDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageIds")
  public List<Long> getVendorItemPackageIds() {
    return vendorItemPackageIds;
  }
  
  /**
   **/
  public void setVendorItemPackageIds(List<Long> vendorItemPackageIds) {
    this.vendorItemPackageIds = vendorItemPackageIds;
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemImageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemImageDto")
  public VendorItemImageDto getVendorItemImageDto() {
    return vendorItemImageDto;
  }
  
  /**
   **/
  public void setVendorItemImageDto(VendorItemImageDto vendorItemImageDto) {
    this.vendorItemImageDto = vendorItemImageDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemDescriptionLegacyType")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemDescriptionLegacyType")
  public String getVendorItemDescriptionLegacyType() {
    return vendorItemDescriptionLegacyType;
  }
  
  /**
   **/
  public void setVendorItemDescriptionLegacyType(String vendorItemDescriptionLegacyType) {
    this.vendorItemDescriptionLegacyType = vendorItemDescriptionLegacyType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemDescriptionDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemDescriptionDtos")
  public List<VendorItemDescriptionDto> getVendorItemDescriptionDtos() {
    return vendorItemDescriptionDtos;
  }
  
  /**
   **/
  public void setVendorItemDescriptionDtos(List<VendorItemDescriptionDto> vendorItemDescriptionDtos) {
    this.vendorItemDescriptionDtos = vendorItemDescriptionDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemCertifications")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemCertifications")
  public List<VendorItemCertificationAdapterDto> getVendorItemCertifications() {
    return vendorItemCertifications;
  }
  
  /**
   **/
  public void setVendorItemCertifications(List<VendorItemCertificationAdapterDto> vendorItemCertifications) {
    this.vendorItemCertifications = vendorItemCertifications;
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
  @org.codehaus.jackson.annotate.JsonProperty("usableVolume")
  @com.fasterxml.jackson.annotation.JsonProperty("usableVolume")
  public Long getUsableVolume() {
    return usableVolume;
  }
  
  /**
   **/
  public void setUsableVolume(Long usableVolume) {
    this.usableVolume = usableVolume;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("travelDto")
  @com.fasterxml.jackson.annotation.JsonProperty("travelDto")
  public TravelDto getTravelDto() {
    return travelDto;
  }
  
  /**
   **/
  public void setTravelDto(TravelDto travelDto) {
    this.travelDto = travelDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("taxType")
  @com.fasterxml.jackson.annotation.JsonProperty("taxType")
  public String getTaxType() {
    return taxType;
  }
  
  /**
   **/
  public void setTaxType(String taxType) {
    this.taxType = taxType;
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
  @org.codehaus.jackson.annotate.JsonProperty("soldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("soldOut")
  public Boolean getSoldOut() {
    return soldOut;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSoldOut() {
    return soldOut == null ? false : soldOut;
  }
  
  /**
   **/
  public void setSoldOut(Boolean soldOut) {
    this.soldOut = soldOut;
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
  @org.codehaus.jackson.annotate.JsonProperty("skuIds")
  @com.fasterxml.jackson.annotation.JsonProperty("skuIds")
  public List<Long> getSkuIds() {
    return skuIds;
  }
  
  /**
   **/
  public void setSkuIds(List<Long> skuIds) {
    this.skuIds = skuIds;
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
  @org.codehaus.jackson.annotate.JsonProperty("productName")
  @com.fasterxml.jackson.annotation.JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  
  /**
   **/
  public void setProductName(String productName) {
    this.productName = productName;
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
  public java.math.BigDecimal getPaymentForVendor() {
    return paymentForVendor;
  }
  
  /**
   **/
  public void setPaymentForVendor(java.math.BigDecimal paymentForVendor) {
    this.paymentForVendor = paymentForVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("packageMaximumBuyForPersons")
  @com.fasterxml.jackson.annotation.JsonProperty("packageMaximumBuyForPersons")
  public Map<Long, Integer> getPackageMaximumBuyForPersons() {
    return packageMaximumBuyForPersons;
  }
  
  /**
   **/
  public void setPackageMaximumBuyForPersons(Map<Long, Integer> packageMaximumBuyForPersons) {
    this.packageMaximumBuyForPersons = packageMaximumBuyForPersons;
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
  @org.codehaus.jackson.annotate.JsonProperty("optionMustBought")
  @com.fasterxml.jackson.annotation.JsonProperty("optionMustBought")
  public Boolean getOptionMustBought() {
    return optionMustBought;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOptionMustBought() {
    return optionMustBought == null ? false : optionMustBought;
  }
  
  /**
   **/
  public void setOptionMustBought(Boolean optionMustBought) {
    this.optionMustBought = optionMustBought;
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
  @org.codehaus.jackson.annotate.JsonProperty("messageForExtraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("messageForExtraInfo")
  public String getMessageForExtraInfo() {
    return messageForExtraInfo;
  }
  
  /**
   **/
  public void setMessageForExtraInfo(String messageForExtraInfo) {
    this.messageForExtraInfo = messageForExtraInfo;
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
  @org.codehaus.jackson.annotate.JsonProperty("managementCategoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("managementCategoryCode")
  public Long getManagementCategoryCode() {
    return managementCategoryCode;
  }
  
  /**
   **/
  public void setManagementCategoryCode(Long managementCategoryCode) {
    this.managementCategoryCode = managementCategoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("localDto")
  @com.fasterxml.jackson.annotation.JsonProperty("localDto")
  public LocalDto getLocalDto() {
    return localDto;
  }
  
  /**
   **/
  public void setLocalDto(LocalDto localDto) {
    this.localDto = localDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("labelForExtraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("labelForExtraInfo")
  public String getLabelForExtraInfo() {
    return labelForExtraInfo;
  }
  
  /**
   **/
  public void setLabelForExtraInfo(String labelForExtraInfo) {
    this.labelForExtraInfo = labelForExtraInfo;
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
  @org.codehaus.jackson.annotate.JsonProperty("goodsDto")
  @com.fasterxml.jackson.annotation.JsonProperty("goodsDto")
  public GoodsDto getGoodsDto() {
    return goodsDto;
  }
  
  /**
   **/
  public void setGoodsDto(GoodsDto goodsDto) {
    this.goodsDto = goodsDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("giftCard")
  @com.fasterxml.jackson.annotation.JsonProperty("giftCard")
  public Boolean getGiftCard() {
    return giftCard;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isGiftCard() {
    return giftCard == null ? false : giftCard;
  }
  
  /**
   **/
  public void setGiftCard(Boolean giftCard) {
    this.giftCard = giftCard;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("freeShipOverAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("freeShipOverAmount")
  public java.math.BigDecimal getFreeShipOverAmount() {
    return freeShipOverAmount;
  }
  
  /**
   **/
  public void setFreeShipOverAmount(java.math.BigDecimal freeShipOverAmount) {
    this.freeShipOverAmount = freeShipOverAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfoUsed")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfoUsed")
  public Boolean getExtraInfoUsed() {
    return extraInfoUsed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExtraInfoUsed() {
    return extraInfoUsed == null ? false : extraInfoUsed;
  }
  
  /**
   **/
  public void setExtraInfoUsed(Boolean extraInfoUsed) {
    this.extraInfoUsed = extraInfoUsed;
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
  @org.codehaus.jackson.annotate.JsonProperty("dropStatus")
  @com.fasterxml.jackson.annotation.JsonProperty("dropStatus")
  public String getDropStatus() {
    return dropStatus;
  }
  
  /**
   **/
  public void setDropStatus(String dropStatus) {
    this.dropStatus = dropStatus;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayChannels")
  @com.fasterxml.jackson.annotation.JsonProperty("displayChannels")
  public List<String> getDisplayChannels() {
    return displayChannels;
  }
  
  /**
   **/
  public void setDisplayChannels(List<String> displayChannels) {
    this.displayChannels = displayChannels;
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
  @org.codehaus.jackson.annotate.JsonProperty("deliveryCharge")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryCharge")
  public java.math.BigDecimal getDeliveryCharge() {
    return deliveryCharge;
  }
  
  /**
   **/
  public void setDeliveryCharge(java.math.BigDecimal deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cultureDto")
  @com.fasterxml.jackson.annotation.JsonProperty("cultureDto")
  public CultureDto getCultureDto() {
    return cultureDto;
  }
  
  /**
   **/
  public void setCultureDto(CultureDto cultureDto) {
    this.cultureDto = cultureDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoFinishedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("autoFinishedAt")
  public Date getAutoFinishedAt() {
    return autoFinishedAt;
  }
  
  /**
   **/
  public void setAutoFinishedAt(Date autoFinishedAt) {
    this.autoFinishedAt = autoFinishedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoFinished")
  @com.fasterxml.jackson.annotation.JsonProperty("autoFinished")
  public Boolean getAutoFinished() {
    return autoFinished;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAutoFinished() {
    return autoFinished == null ? false : autoFinished;
  }
  
  /**
   **/
  public void setAutoFinished(Boolean autoFinished) {
    this.autoFinished = autoFinished;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoCancelType")
  @com.fasterxml.jackson.annotation.JsonProperty("autoCancelType")
  public String getAutoCancelType() {
    return autoCancelType;
  }
  
  /**
   **/
  public void setAutoCancelType(String autoCancelType) {
    this.autoCancelType = autoCancelType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("almostSoldout")
  @com.fasterxml.jackson.annotation.JsonProperty("almostSoldout")
  public Boolean getAlmostSoldout() {
    return almostSoldout;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAlmostSoldout() {
    return almostSoldout == null ? false : almostSoldout;
  }
  
  /**
   **/
  public void setAlmostSoldout(Boolean almostSoldout) {
    this.almostSoldout = almostSoldout;
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
    VendorItemDTO vendorItemDTO = (VendorItemDTO) o;
    return Objects.equals(this.vendorItemSkuDtos, vendorItemDTO.vendorItemSkuDtos) &&
        Objects.equals(this.vendorItemProperties, vendorItemDTO.vendorItemProperties) &&
        Objects.equals(this.vendorItemPolicyDto, vendorItemDTO.vendorItemPolicyDto) &&
        Objects.equals(this.vendorItemPackgeNames, vendorItemDTO.vendorItemPackgeNames) &&
        Objects.equals(this.vendorItemPackages, vendorItemDTO.vendorItemPackages) &&
        Objects.equals(this.vendorItemPackageTypes, vendorItemDTO.vendorItemPackageTypes) &&
        Objects.equals(this.vendorItemPackageTypeMap, vendorItemDTO.vendorItemPackageTypeMap) &&
        Objects.equals(this.vendorItemPackagePolicyDto, vendorItemDTO.vendorItemPackagePolicyDto) &&
        Objects.equals(this.vendorItemPackageIds, vendorItemDTO.vendorItemPackageIds) &&
        Objects.equals(this.vendorItemPackageId, vendorItemDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemName, vendorItemDTO.vendorItemName) &&
        Objects.equals(this.vendorItemImageDto, vendorItemDTO.vendorItemImageDto) &&
        Objects.equals(this.vendorItemId, vendorItemDTO.vendorItemId) &&
        Objects.equals(this.vendorItemDescriptionLegacyType, vendorItemDTO.vendorItemDescriptionLegacyType) &&
        Objects.equals(this.vendorItemDescriptionDtos, vendorItemDTO.vendorItemDescriptionDtos) &&
        Objects.equals(this.vendorItemCertifications, vendorItemDTO.vendorItemCertifications) &&
        Objects.equals(this.vendorId, vendorItemDTO.vendorId) &&
        Objects.equals(this.valid, vendorItemDTO.valid) &&
        Objects.equals(this.useStartDate, vendorItemDTO.useStartDate) &&
        Objects.equals(this.useEndDate, vendorItemDTO.useEndDate) &&
        Objects.equals(this.usableVolume, vendorItemDTO.usableVolume) &&
        Objects.equals(this.travelDto, vendorItemDTO.travelDto) &&
        Objects.equals(this.teamCode, vendorItemDTO.teamCode) &&
        Objects.equals(this.taxType, vendorItemDTO.taxType) &&
        Objects.equals(this.subTitle, vendorItemDTO.subTitle) &&
        Objects.equals(this.soldOut, vendorItemDTO.soldOut) &&
        Objects.equals(this.soldCount, vendorItemDTO.soldCount) &&
        Objects.equals(this.skuIds, vendorItemDTO.skuIds) &&
        Objects.equals(this.saleStartedAt, vendorItemDTO.saleStartedAt) &&
        Objects.equals(this.salePriceType, vendorItemDTO.salePriceType) &&
        Objects.equals(this.salePrice, vendorItemDTO.salePrice) &&
        Objects.equals(this.salePeriodType, vendorItemDTO.salePeriodType) &&
        Objects.equals(this.saleEndedAt, vendorItemDTO.saleEndedAt) &&
        Objects.equals(this.roleCode, vendorItemDTO.roleCode) &&
        Objects.equals(this.representativeDisplayCategoryCode, vendorItemDTO.representativeDisplayCategoryCode) &&
        Objects.equals(this.productServicePlatformType, vendorItemDTO.productServicePlatformType) &&
        Objects.equals(this.productName, vendorItemDTO.productName) &&
        Objects.equals(this.productId, vendorItemDTO.productId) &&
        Objects.equals(this.primeType, vendorItemDTO.primeType) &&
        Objects.equals(this.paymentForVendor, vendorItemDTO.paymentForVendor) &&
        Objects.equals(this.packageMaximumBuyForPersons, vendorItemDTO.packageMaximumBuyForPersons) &&
        Objects.equals(this.originalPrice, vendorItemDTO.originalPrice) &&
        Objects.equals(this.optionMustBought, vendorItemDTO.optionMustBought) &&
        Objects.equals(this.notice, vendorItemDTO.notice) &&
        Objects.equals(this.newMemberOnly, vendorItemDTO.newMemberOnly) &&
        Objects.equals(this.modifiedAt, vendorItemDTO.modifiedAt) &&
        Objects.equals(this.mixPackYn, vendorItemDTO.mixPackYn) &&
        Objects.equals(this.messageForExtraInfo, vendorItemDTO.messageForExtraInfo) &&
        Objects.equals(this.mdId, vendorItemDTO.mdId) &&
        Objects.equals(this.maximumBuyForPersonPeriod, vendorItemDTO.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, vendorItemDTO.maximumBuyForPerson) &&
        Objects.equals(this.maximumBuyCount, vendorItemDTO.maximumBuyCount) &&
        Objects.equals(this.maxMixPackCnt, vendorItemDTO.maxMixPackCnt) &&
        Objects.equals(this.managementCategoryCode, vendorItemDTO.managementCategoryCode) &&
        Objects.equals(this.localDto, vendorItemDTO.localDto) &&
        Objects.equals(this.labelForExtraInfo, vendorItemDTO.labelForExtraInfo) &&
        Objects.equals(this.itemId, vendorItemDTO.itemId) &&
        Objects.equals(this.inventory, vendorItemDTO.inventory) &&
        Objects.equals(this.goodsDto, vendorItemDTO.goodsDto) &&
        Objects.equals(this.giftCard, vendorItemDTO.giftCard) &&
        Objects.equals(this.freeShipOverAmount, vendorItemDTO.freeShipOverAmount) &&
        Objects.equals(this.extraInfoUsed, vendorItemDTO.extraInfoUsed) &&
        Objects.equals(this.externalCode, vendorItemDTO.externalCode) &&
        Objects.equals(this.dropStatus, vendorItemDTO.dropStatus) &&
        Objects.equals(this.divisionType, vendorItemDTO.divisionType) &&
        Objects.equals(this.displayChannels, vendorItemDTO.displayChannels) &&
        Objects.equals(this.displayCategoryCodes, vendorItemDTO.displayCategoryCodes) &&
        Objects.equals(this.deliveryCharge, vendorItemDTO.deliveryCharge) &&
        Objects.equals(this.cultureDto, vendorItemDTO.cultureDto) &&
        Objects.equals(this.createdAt, vendorItemDTO.createdAt) &&
        Objects.equals(this.couponUseType, vendorItemDTO.couponUseType) &&
        Objects.equals(this.autoFinishedAt, vendorItemDTO.autoFinishedAt) &&
        Objects.equals(this.autoFinished, vendorItemDTO.autoFinished) &&
        Objects.equals(this.autoCancelType, vendorItemDTO.autoCancelType) &&
        Objects.equals(this.almostSoldout, vendorItemDTO.almostSoldout) &&
        Objects.equals(this.adultOnly, vendorItemDTO.adultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemSkuDtos, vendorItemProperties, vendorItemPolicyDto, vendorItemPackgeNames, vendorItemPackages, vendorItemPackageTypes, vendorItemPackageTypeMap, vendorItemPackagePolicyDto, vendorItemPackageIds, vendorItemPackageId, vendorItemName, vendorItemImageDto, vendorItemId, vendorItemDescriptionLegacyType, vendorItemDescriptionDtos, vendorItemCertifications, vendorId, valid, useStartDate, useEndDate, usableVolume, travelDto, teamCode, taxType, subTitle, soldOut, soldCount, skuIds, saleStartedAt, salePriceType, salePrice, salePeriodType, saleEndedAt, roleCode, representativeDisplayCategoryCode, productServicePlatformType, productName, productId, primeType, paymentForVendor, packageMaximumBuyForPersons, originalPrice, optionMustBought, notice, newMemberOnly, modifiedAt, mixPackYn, messageForExtraInfo, mdId, maximumBuyForPersonPeriod, maximumBuyForPerson, maximumBuyCount, maxMixPackCnt, managementCategoryCode, localDto, labelForExtraInfo, itemId, inventory, goodsDto, giftCard, freeShipOverAmount, extraInfoUsed, externalCode, dropStatus, divisionType, displayChannels, displayCategoryCodes, deliveryCharge, cultureDto, createdAt, couponUseType, autoFinishedAt, autoFinished, autoCancelType, almostSoldout, adultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemDTO {\n");
    
    sb.append("    vendorItemSkuDtos: ").append(toIndentedString(vendorItemSkuDtos)).append("\n");
    sb.append("    vendorItemProperties: ").append(toIndentedString(vendorItemProperties)).append("\n");
    sb.append("    vendorItemPolicyDto: ").append(toIndentedString(vendorItemPolicyDto)).append("\n");
    sb.append("    vendorItemPackgeNames: ").append(toIndentedString(vendorItemPackgeNames)).append("\n");
    sb.append("    vendorItemPackages: ").append(toIndentedString(vendorItemPackages)).append("\n");
    sb.append("    vendorItemPackageTypes: ").append(toIndentedString(vendorItemPackageTypes)).append("\n");
    sb.append("    vendorItemPackageTypeMap: ").append(toIndentedString(vendorItemPackageTypeMap)).append("\n");
    sb.append("    vendorItemPackagePolicyDto: ").append(toIndentedString(vendorItemPackagePolicyDto)).append("\n");
    sb.append("    vendorItemPackageIds: ").append(toIndentedString(vendorItemPackageIds)).append("\n");
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
    sb.append("    vendorItemImageDto: ").append(toIndentedString(vendorItemImageDto)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorItemDescriptionLegacyType: ").append(toIndentedString(vendorItemDescriptionLegacyType)).append("\n");
    sb.append("    vendorItemDescriptionDtos: ").append(toIndentedString(vendorItemDescriptionDtos)).append("\n");
    sb.append("    vendorItemCertifications: ").append(toIndentedString(vendorItemCertifications)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    usableVolume: ").append(toIndentedString(usableVolume)).append("\n");
    sb.append("    travelDto: ").append(toIndentedString(travelDto)).append("\n");
    sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
    sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
    sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
    sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
    sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
    sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
    sb.append("    packageMaximumBuyForPersons: ").append(toIndentedString(packageMaximumBuyForPersons)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    mixPackYn: ").append(toIndentedString(mixPackYn)).append("\n");
    sb.append("    messageForExtraInfo: ").append(toIndentedString(messageForExtraInfo)).append("\n");
    sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
    sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
    sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
    sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
    sb.append("    maxMixPackCnt: ").append(toIndentedString(maxMixPackCnt)).append("\n");
    sb.append("    managementCategoryCode: ").append(toIndentedString(managementCategoryCode)).append("\n");
    sb.append("    localDto: ").append(toIndentedString(localDto)).append("\n");
    sb.append("    labelForExtraInfo: ").append(toIndentedString(labelForExtraInfo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    goodsDto: ").append(toIndentedString(goodsDto)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
    sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
    sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    dropStatus: ").append(toIndentedString(dropStatus)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayChannels: ").append(toIndentedString(displayChannels)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    cultureDto: ").append(toIndentedString(cultureDto)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
    sb.append("    autoFinishedAt: ").append(toIndentedString(autoFinishedAt)).append("\n");
    sb.append("    autoFinished: ").append(toIndentedString(autoFinished)).append("\n");
    sb.append("    autoCancelType: ").append(toIndentedString(autoCancelType)).append("\n");
    sb.append("    almostSoldout: ").append(toIndentedString(almostSoldout)).append("\n");
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

  public static VendorItemDTOBuilder builder() {
    return new VendorItemDTOBuilder();
  }

  public static class VendorItemDTOBuilder {

    private List<VendorItemSkuDto> vendorItemSkuDtos = new ArrayList<VendorItemSkuDto>();
    private Object vendorItemProperties = null;
    private VendorItemPolicyDto vendorItemPolicyDto = null;
    private Map<Long, String> vendorItemPackgeNames = new HashMap<Long, String>();
    private List<Long> vendorItemPackages = new ArrayList<Long>();
    private List<String> vendorItemPackageTypes = new ArrayList<String>();
    private Map<Long, String> vendorItemPackageTypeMap = new HashMap<Long, String>();
    private Map<Long, VendorItemPackagePolicyDto> vendorItemPackagePolicyDto = new HashMap<Long, VendorItemPackagePolicyDto>();
    private List<Long> vendorItemPackageIds = new ArrayList<Long>();
    private Long vendorItemPackageId = null;
    private String vendorItemName = null;
    private VendorItemImageDto vendorItemImageDto = null;
    private Long vendorItemId = null;
    private String vendorItemDescriptionLegacyType = null;
    private List<VendorItemDescriptionDto> vendorItemDescriptionDtos = new ArrayList<VendorItemDescriptionDto>();
    private List<VendorItemCertificationAdapterDto> vendorItemCertifications = new ArrayList<VendorItemCertificationAdapterDto>();
    private String vendorId = null;
    private Boolean valid = null;
    private Date useStartDate = null;
    private Date useEndDate = null;
    private Long usableVolume = null;
    private TravelDto travelDto = null;
    private String teamCode = null;
    private String taxType = null;
    private String subTitle = null;
    private Boolean soldOut = null;
    private Integer soldCount = null;
    private List<Long> skuIds = new ArrayList<Long>();
    private Date saleStartedAt = null;
    private String salePriceType = null;
    private java.math.BigDecimal salePrice = null;
    private String salePeriodType = null;
    private Date saleEndedAt = null;
    private Integer roleCode = null;
    private Long representativeDisplayCategoryCode = null;
    private ProductServicePlatformTypeEnum productServicePlatformType = null;
    private String productName = null;
    private Long productId = null;
    private String primeType = null;
    private java.math.BigDecimal paymentForVendor = null;
    private Map<Long, Integer> packageMaximumBuyForPersons = new HashMap<Long, Integer>();
    private java.math.BigDecimal originalPrice = null;
    private Boolean optionMustBought = null;
    private String notice = null;
    private Boolean newMemberOnly = null;
    private Date modifiedAt = null;
    private String mixPackYn = null;
    private String messageForExtraInfo = null;
    private String mdId = null;
    private Integer maximumBuyForPersonPeriod = null;
    private Integer maximumBuyForPerson = null;
    private Integer maximumBuyCount = null;
    private Integer maxMixPackCnt = null;
    private Long managementCategoryCode = null;
    private LocalDto localDto = null;
    private String labelForExtraInfo = null;
    private Long itemId = null;
    private Integer inventory = null;
    private GoodsDto goodsDto = null;
    private Boolean giftCard = null;
    private java.math.BigDecimal freeShipOverAmount = null;
    private Boolean extraInfoUsed = null;
    private String externalCode = null;
    private String dropStatus = null;
    private String divisionType = null;
    private List<String> displayChannels = new ArrayList<String>();
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private java.math.BigDecimal deliveryCharge = null;
    private CultureDto cultureDto = null;
    private Date createdAt = null;
    private CouponUseTypeEnum couponUseType = null;
    private Date autoFinishedAt = null;
    private Boolean autoFinished = null;
    private String autoCancelType = null;
    private Boolean almostSoldout = null;
    private Boolean adultOnly = null;
    

    VendorItemDTOBuilder() {
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemSkuDtos(List<VendorItemSkuDto> vendorItemSkuDtos) {
      this.vendorItemSkuDtos = vendorItemSkuDtos;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemProperties(Object vendorItemProperties) {
      this.vendorItemProperties = vendorItemProperties;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPolicyDto(VendorItemPolicyDto vendorItemPolicyDto) {
      this.vendorItemPolicyDto = vendorItemPolicyDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackgeNames(Map<Long, String> vendorItemPackgeNames) {
      this.vendorItemPackgeNames = vendorItemPackgeNames;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackages(List<Long> vendorItemPackages) {
      this.vendorItemPackages = vendorItemPackages;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackageTypes(List<String> vendorItemPackageTypes) {
      this.vendorItemPackageTypes = vendorItemPackageTypes;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackageTypeMap(Map<Long, String> vendorItemPackageTypeMap) {
      this.vendorItemPackageTypeMap = vendorItemPackageTypeMap;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackagePolicyDto(Map<Long, VendorItemPackagePolicyDto> vendorItemPackagePolicyDto) {
      this.vendorItemPackagePolicyDto = vendorItemPackagePolicyDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackageIds(List<Long> vendorItemPackageIds) {
      this.vendorItemPackageIds = vendorItemPackageIds;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemName(String vendorItemName) {
      this.vendorItemName = vendorItemName;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemImageDto(VendorItemImageDto vendorItemImageDto) {
      this.vendorItemImageDto = vendorItemImageDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemDescriptionLegacyType(String vendorItemDescriptionLegacyType) {
      this.vendorItemDescriptionLegacyType = vendorItemDescriptionLegacyType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemDescriptionDtos(List<VendorItemDescriptionDto> vendorItemDescriptionDtos) {
      this.vendorItemDescriptionDtos = vendorItemDescriptionDtos;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorItemCertifications(List<VendorItemCertificationAdapterDto> vendorItemCertifications) {
      this.vendorItemCertifications = vendorItemCertifications;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder usableVolume(Long usableVolume) {
      this.usableVolume = usableVolume;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder travelDto(TravelDto travelDto) {
      this.travelDto = travelDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder teamCode(String teamCode) {
      this.teamCode = teamCode;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder taxType(String taxType) {
      this.taxType = taxType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder subTitle(String subTitle) {
      this.subTitle = subTitle;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder skuIds(List<Long> skuIds) {
      this.skuIds = skuIds;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder saleStartedAt(Date saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder salePriceType(String salePriceType) {
      this.salePriceType = salePriceType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder salePrice(java.math.BigDecimal salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder saleEndedAt(Date saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder roleCode(Integer roleCode) {
      this.roleCode = roleCode;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder representativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
      this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder productServicePlatformType(ProductServicePlatformTypeEnum productServicePlatformType) {
      this.productServicePlatformType = productServicePlatformType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder primeType(String primeType) {
      this.primeType = primeType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder paymentForVendor(java.math.BigDecimal paymentForVendor) {
      this.paymentForVendor = paymentForVendor;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder packageMaximumBuyForPersons(Map<Long, Integer> packageMaximumBuyForPersons) {
      this.packageMaximumBuyForPersons = packageMaximumBuyForPersons;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder originalPrice(java.math.BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder optionMustBought(Boolean optionMustBought) {
      this.optionMustBought = optionMustBought;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder notice(String notice) {
      this.notice = notice;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder newMemberOnly(Boolean newMemberOnly) {
      this.newMemberOnly = newMemberOnly;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder mixPackYn(String mixPackYn) {
      this.mixPackYn = mixPackYn;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder messageForExtraInfo(String messageForExtraInfo) {
      this.messageForExtraInfo = messageForExtraInfo;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder mdId(String mdId) {
      this.mdId = mdId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder maxMixPackCnt(Integer maxMixPackCnt) {
      this.maxMixPackCnt = maxMixPackCnt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder managementCategoryCode(Long managementCategoryCode) {
      this.managementCategoryCode = managementCategoryCode;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder localDto(LocalDto localDto) {
      this.localDto = localDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder labelForExtraInfo(String labelForExtraInfo) {
      this.labelForExtraInfo = labelForExtraInfo;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder inventory(Integer inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder goodsDto(GoodsDto goodsDto) {
      this.goodsDto = goodsDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder freeShipOverAmount(java.math.BigDecimal freeShipOverAmount) {
      this.freeShipOverAmount = freeShipOverAmount;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder extraInfoUsed(Boolean extraInfoUsed) {
      this.extraInfoUsed = extraInfoUsed;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder externalCode(String externalCode) {
      this.externalCode = externalCode;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder dropStatus(String dropStatus) {
      this.dropStatus = dropStatus;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder displayChannels(List<String> displayChannels) {
      this.displayChannels = displayChannels;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder deliveryCharge(java.math.BigDecimal deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder cultureDto(CultureDto cultureDto) {
      this.cultureDto = cultureDto;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder couponUseType(CouponUseTypeEnum couponUseType) {
      this.couponUseType = couponUseType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder autoFinishedAt(Date autoFinishedAt) {
      this.autoFinishedAt = autoFinishedAt;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder autoFinished(Boolean autoFinished) {
      this.autoFinished = autoFinished;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder autoCancelType(String autoCancelType) {
      this.autoCancelType = autoCancelType;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder almostSoldout(Boolean almostSoldout) {
      this.almostSoldout = almostSoldout;
      return this;
    }

    /**
     **/
    public VendorItemDTOBuilder adultOnly(Boolean adultOnly) {
      this.adultOnly = adultOnly;
      return this;
    }


    public VendorItemDTO build() {
      VendorItemDTO vendorItemDTO = new VendorItemDTO();
      vendorItemDTO.setVendorItemSkuDtos(this.vendorItemSkuDtos);
      vendorItemDTO.setVendorItemProperties(this.vendorItemProperties);
      vendorItemDTO.setVendorItemPolicyDto(this.vendorItemPolicyDto);
      vendorItemDTO.setVendorItemPackgeNames(this.vendorItemPackgeNames);
      vendorItemDTO.setVendorItemPackages(this.vendorItemPackages);
      vendorItemDTO.setVendorItemPackageTypes(this.vendorItemPackageTypes);
      vendorItemDTO.setVendorItemPackageTypeMap(this.vendorItemPackageTypeMap);
      vendorItemDTO.setVendorItemPackagePolicyDto(this.vendorItemPackagePolicyDto);
      vendorItemDTO.setVendorItemPackageIds(this.vendorItemPackageIds);
      vendorItemDTO.setVendorItemPackageId(this.vendorItemPackageId);
      vendorItemDTO.setVendorItemName(this.vendorItemName);
      vendorItemDTO.setVendorItemImageDto(this.vendorItemImageDto);
      vendorItemDTO.setVendorItemId(this.vendorItemId);
      vendorItemDTO.setVendorItemDescriptionLegacyType(this.vendorItemDescriptionLegacyType);
      vendorItemDTO.setVendorItemDescriptionDtos(this.vendorItemDescriptionDtos);
      vendorItemDTO.setVendorItemCertifications(this.vendorItemCertifications);
      vendorItemDTO.setVendorId(this.vendorId);
      vendorItemDTO.setValid(this.valid);
      vendorItemDTO.setUseStartDate(this.useStartDate);
      vendorItemDTO.setUseEndDate(this.useEndDate);
      vendorItemDTO.setUsableVolume(this.usableVolume);
      vendorItemDTO.setTravelDto(this.travelDto);
      vendorItemDTO.setTeamCode(this.teamCode);
      vendorItemDTO.setTaxType(this.taxType);
      vendorItemDTO.setSubTitle(this.subTitle);
      vendorItemDTO.setSoldOut(this.soldOut);
      vendorItemDTO.setSoldCount(this.soldCount);
      vendorItemDTO.setSkuIds(this.skuIds);
      vendorItemDTO.setSaleStartedAt(this.saleStartedAt);
      vendorItemDTO.setSalePriceType(this.salePriceType);
      vendorItemDTO.setSalePrice(this.salePrice);
      vendorItemDTO.setSalePeriodType(this.salePeriodType);
      vendorItemDTO.setSaleEndedAt(this.saleEndedAt);
      vendorItemDTO.setRoleCode(this.roleCode);
      vendorItemDTO.setRepresentativeDisplayCategoryCode(this.representativeDisplayCategoryCode);
      vendorItemDTO.setProductServicePlatformType(this.productServicePlatformType);
      vendorItemDTO.setProductName(this.productName);
      vendorItemDTO.setProductId(this.productId);
      vendorItemDTO.setPrimeType(this.primeType);
      vendorItemDTO.setPaymentForVendor(this.paymentForVendor);
      vendorItemDTO.setPackageMaximumBuyForPersons(this.packageMaximumBuyForPersons);
      vendorItemDTO.setOriginalPrice(this.originalPrice);
      vendorItemDTO.setOptionMustBought(this.optionMustBought);
      vendorItemDTO.setNotice(this.notice);
      vendorItemDTO.setNewMemberOnly(this.newMemberOnly);
      vendorItemDTO.setModifiedAt(this.modifiedAt);
      vendorItemDTO.setMixPackYn(this.mixPackYn);
      vendorItemDTO.setMessageForExtraInfo(this.messageForExtraInfo);
      vendorItemDTO.setMdId(this.mdId);
      vendorItemDTO.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      vendorItemDTO.setMaximumBuyForPerson(this.maximumBuyForPerson);
      vendorItemDTO.setMaximumBuyCount(this.maximumBuyCount);
      vendorItemDTO.setMaxMixPackCnt(this.maxMixPackCnt);
      vendorItemDTO.setManagementCategoryCode(this.managementCategoryCode);
      vendorItemDTO.setLocalDto(this.localDto);
      vendorItemDTO.setLabelForExtraInfo(this.labelForExtraInfo);
      vendorItemDTO.setItemId(this.itemId);
      vendorItemDTO.setInventory(this.inventory);
      vendorItemDTO.setGoodsDto(this.goodsDto);
      vendorItemDTO.setGiftCard(this.giftCard);
      vendorItemDTO.setFreeShipOverAmount(this.freeShipOverAmount);
      vendorItemDTO.setExtraInfoUsed(this.extraInfoUsed);
      vendorItemDTO.setExternalCode(this.externalCode);
      vendorItemDTO.setDropStatus(this.dropStatus);
      vendorItemDTO.setDivisionType(this.divisionType);
      vendorItemDTO.setDisplayChannels(this.displayChannels);
      vendorItemDTO.setDisplayCategoryCodes(this.displayCategoryCodes);
      vendorItemDTO.setDeliveryCharge(this.deliveryCharge);
      vendorItemDTO.setCultureDto(this.cultureDto);
      vendorItemDTO.setCreatedAt(this.createdAt);
      vendorItemDTO.setCouponUseType(this.couponUseType);
      vendorItemDTO.setAutoFinishedAt(this.autoFinishedAt);
      vendorItemDTO.setAutoFinished(this.autoFinished);
      vendorItemDTO.setAutoCancelType(this.autoCancelType);
      vendorItemDTO.setAlmostSoldout(this.almostSoldout);
      vendorItemDTO.setAdultOnly(this.adultOnly);
      return vendorItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemDTOBuilder {\n");
      
      sb.append("    vendorItemSkuDtos: ").append(toIndentedString(vendorItemSkuDtos)).append("\n");
      sb.append("    vendorItemProperties: ").append(toIndentedString(vendorItemProperties)).append("\n");
      sb.append("    vendorItemPolicyDto: ").append(toIndentedString(vendorItemPolicyDto)).append("\n");
      sb.append("    vendorItemPackgeNames: ").append(toIndentedString(vendorItemPackgeNames)).append("\n");
      sb.append("    vendorItemPackages: ").append(toIndentedString(vendorItemPackages)).append("\n");
      sb.append("    vendorItemPackageTypes: ").append(toIndentedString(vendorItemPackageTypes)).append("\n");
      sb.append("    vendorItemPackageTypeMap: ").append(toIndentedString(vendorItemPackageTypeMap)).append("\n");
      sb.append("    vendorItemPackagePolicyDto: ").append(toIndentedString(vendorItemPackagePolicyDto)).append("\n");
      sb.append("    vendorItemPackageIds: ").append(toIndentedString(vendorItemPackageIds)).append("\n");
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
      sb.append("    vendorItemImageDto: ").append(toIndentedString(vendorItemImageDto)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorItemDescriptionLegacyType: ").append(toIndentedString(vendorItemDescriptionLegacyType)).append("\n");
      sb.append("    vendorItemDescriptionDtos: ").append(toIndentedString(vendorItemDescriptionDtos)).append("\n");
      sb.append("    vendorItemCertifications: ").append(toIndentedString(vendorItemCertifications)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
      sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
      sb.append("    usableVolume: ").append(toIndentedString(usableVolume)).append("\n");
      sb.append("    travelDto: ").append(toIndentedString(travelDto)).append("\n");
      sb.append("    teamCode: ").append(toIndentedString(teamCode)).append("\n");
      sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
      sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
      sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    skuIds: ").append(toIndentedString(skuIds)).append("\n");
      sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
      sb.append("    salePriceType: ").append(toIndentedString(salePriceType)).append("\n");
      sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
      sb.append("    salePeriodType: ").append(toIndentedString(salePeriodType)).append("\n");
      sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
      sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
      sb.append("    representativeDisplayCategoryCode: ").append(toIndentedString(representativeDisplayCategoryCode)).append("\n");
      sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
      sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
      sb.append("    packageMaximumBuyForPersons: ").append(toIndentedString(packageMaximumBuyForPersons)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
      sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
      sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    mixPackYn: ").append(toIndentedString(mixPackYn)).append("\n");
      sb.append("    messageForExtraInfo: ").append(toIndentedString(messageForExtraInfo)).append("\n");
      sb.append("    mdId: ").append(toIndentedString(mdId)).append("\n");
      sb.append("    maximumBuyForPersonPeriod: ").append(toIndentedString(maximumBuyForPersonPeriod)).append("\n");
      sb.append("    maximumBuyForPerson: ").append(toIndentedString(maximumBuyForPerson)).append("\n");
      sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
      sb.append("    maxMixPackCnt: ").append(toIndentedString(maxMixPackCnt)).append("\n");
      sb.append("    managementCategoryCode: ").append(toIndentedString(managementCategoryCode)).append("\n");
      sb.append("    localDto: ").append(toIndentedString(localDto)).append("\n");
      sb.append("    labelForExtraInfo: ").append(toIndentedString(labelForExtraInfo)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
      sb.append("    goodsDto: ").append(toIndentedString(goodsDto)).append("\n");
      sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
      sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
      sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
      sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
      sb.append("    dropStatus: ").append(toIndentedString(dropStatus)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayChannels: ").append(toIndentedString(displayChannels)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
      sb.append("    cultureDto: ").append(toIndentedString(cultureDto)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
      sb.append("    autoFinishedAt: ").append(toIndentedString(autoFinishedAt)).append("\n");
      sb.append("    autoFinished: ").append(toIndentedString(autoFinished)).append("\n");
      sb.append("    autoCancelType: ").append(toIndentedString(autoCancelType)).append("\n");
      sb.append("    almostSoldout: ").append(toIndentedString(almostSoldout)).append("\n");
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

