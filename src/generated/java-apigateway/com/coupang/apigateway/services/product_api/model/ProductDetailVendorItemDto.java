package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CultureDto;
import com.coupang.apigateway.services.product_api.model.GoodsDto;
import com.coupang.apigateway.services.product_api.model.ItemAttributeDto;
import com.coupang.apigateway.services.product_api.model.LocalDto;
import com.coupang.apigateway.services.product_api.model.ProductDetailNoticeContentDto;
import com.coupang.apigateway.services.product_api.model.TravelDto;
import com.coupang.apigateway.services.product_api.model.VendorItemCertificationAdapterDto;
import com.coupang.apigateway.services.product_api.model.VendorItemContentDto;
import com.coupang.apigateway.services.product_api.model.VendorItemDescriptionDto;
import com.coupang.apigateway.services.product_api.model.VendorItemImageDto;
import com.coupang.apigateway.services.product_api.model.VendorItemPackagePolicyDto;
import com.coupang.apigateway.services.product_api.model.VendorItemPolicyDto;
import com.coupang.apigateway.services.product_api.model.VendorItemSkuDto;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class ProductDetailVendorItemDto   {
  
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
  private Integer remainQuantity = null;


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
  private ProductDetailNoticeContentDto noticeContentDto = null;
  private String notice = null;
  private Boolean newMemberOnly = null;
  private Date modifiedAt = null;
  private String modelNo = null;
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
  private String itemName = null;
  private Long itemId = null;
  private List<ItemAttributeDto> itemAttributeDtos = new ArrayList<ItemAttributeDto>();
  private Integer inventory = null;
  private VendorItemImageDto imageDto = null;
  private GoodsDto goodsDto = null;
  private Boolean giftCard = null;
  private java.math.BigDecimal freeShipOverAmount = null;
  private Boolean extraInfoUsed = null;
  private String externalCode = null;
  private String dropStatus = null;
  private String divisionType = null;
  private List<String> displayChannels = new ArrayList<String>();
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private List<VendorItemDescriptionDto> descriptionDtos = new ArrayList<VendorItemDescriptionDto>();
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
  private List<VendorItemContentDto> contentDtos = new ArrayList<VendorItemContentDto>();
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
  @org.codehaus.jackson.annotate.JsonProperty("remainQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("remainQuantity")
  public Integer getRemainQuantity() {
    return remainQuantity;
  }
  
  /**
   **/
  public void setRemainQuantity(Integer remainQuantity) {
    this.remainQuantity = remainQuantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("noticeContentDto")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeContentDto")
  public ProductDetailNoticeContentDto getNoticeContentDto() {
    return noticeContentDto;
  }
  
  /**
   **/
  public void setNoticeContentDto(ProductDetailNoticeContentDto noticeContentDto) {
    this.noticeContentDto = noticeContentDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("modelNo")
  @com.fasterxml.jackson.annotation.JsonProperty("modelNo")
  public String getModelNo() {
    return modelNo;
  }
  
  /**
   **/
  public void setModelNo(String modelNo) {
    this.modelNo = modelNo;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }
  
  /**
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemAttributeDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("itemAttributeDtos")
  public List<ItemAttributeDto> getItemAttributeDtos() {
    return itemAttributeDtos;
  }
  
  /**
   **/
  public void setItemAttributeDtos(List<ItemAttributeDto> itemAttributeDtos) {
    this.itemAttributeDtos = itemAttributeDtos;
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
  @org.codehaus.jackson.annotate.JsonProperty("imageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("imageDto")
  public VendorItemImageDto getImageDto() {
    return imageDto;
  }
  
  /**
   **/
  public void setImageDto(VendorItemImageDto imageDto) {
    this.imageDto = imageDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("descriptionDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("descriptionDtos")
  public List<VendorItemDescriptionDto> getDescriptionDtos() {
    return descriptionDtos;
  }
  
  /**
   **/
  public void setDescriptionDtos(List<VendorItemDescriptionDto> descriptionDtos) {
    this.descriptionDtos = descriptionDtos;
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
  @org.codehaus.jackson.annotate.JsonProperty("contentDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("contentDtos")
  public List<VendorItemContentDto> getContentDtos() {
    return contentDtos;
  }
  
  /**
   **/
  public void setContentDtos(List<VendorItemContentDto> contentDtos) {
    this.contentDtos = contentDtos;
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
    ProductDetailVendorItemDto productDetailVendorItemDto = (ProductDetailVendorItemDto) o;
    return Objects.equals(this.vendorItemSkuDtos, productDetailVendorItemDto.vendorItemSkuDtos) &&
        Objects.equals(this.vendorItemProperties, productDetailVendorItemDto.vendorItemProperties) &&
        Objects.equals(this.vendorItemPolicyDto, productDetailVendorItemDto.vendorItemPolicyDto) &&
        Objects.equals(this.vendorItemPackgeNames, productDetailVendorItemDto.vendorItemPackgeNames) &&
        Objects.equals(this.vendorItemPackages, productDetailVendorItemDto.vendorItemPackages) &&
        Objects.equals(this.vendorItemPackageTypes, productDetailVendorItemDto.vendorItemPackageTypes) &&
        Objects.equals(this.vendorItemPackageTypeMap, productDetailVendorItemDto.vendorItemPackageTypeMap) &&
        Objects.equals(this.vendorItemPackagePolicyDto, productDetailVendorItemDto.vendorItemPackagePolicyDto) &&
        Objects.equals(this.vendorItemPackageIds, productDetailVendorItemDto.vendorItemPackageIds) &&
        Objects.equals(this.vendorItemPackageId, productDetailVendorItemDto.vendorItemPackageId) &&
        Objects.equals(this.vendorItemName, productDetailVendorItemDto.vendorItemName) &&
        Objects.equals(this.vendorItemImageDto, productDetailVendorItemDto.vendorItemImageDto) &&
        Objects.equals(this.vendorItemId, productDetailVendorItemDto.vendorItemId) &&
        Objects.equals(this.vendorItemDescriptionLegacyType, productDetailVendorItemDto.vendorItemDescriptionLegacyType) &&
        Objects.equals(this.vendorItemDescriptionDtos, productDetailVendorItemDto.vendorItemDescriptionDtos) &&
        Objects.equals(this.vendorItemCertifications, productDetailVendorItemDto.vendorItemCertifications) &&
        Objects.equals(this.vendorId, productDetailVendorItemDto.vendorId) &&
        Objects.equals(this.valid, productDetailVendorItemDto.valid) &&
        Objects.equals(this.useStartDate, productDetailVendorItemDto.useStartDate) &&
        Objects.equals(this.useEndDate, productDetailVendorItemDto.useEndDate) &&
        Objects.equals(this.usableVolume, productDetailVendorItemDto.usableVolume) &&
        Objects.equals(this.travelDto, productDetailVendorItemDto.travelDto) &&
        Objects.equals(this.teamCode, productDetailVendorItemDto.teamCode) &&
        Objects.equals(this.taxType, productDetailVendorItemDto.taxType) &&
        Objects.equals(this.subTitle, productDetailVendorItemDto.subTitle) &&
        Objects.equals(this.soldOut, productDetailVendorItemDto.soldOut) &&
        Objects.equals(this.soldCount, productDetailVendorItemDto.soldCount) &&
        Objects.equals(this.skuIds, productDetailVendorItemDto.skuIds) &&
        Objects.equals(this.saleStartedAt, productDetailVendorItemDto.saleStartedAt) &&
        Objects.equals(this.salePriceType, productDetailVendorItemDto.salePriceType) &&
        Objects.equals(this.salePrice, productDetailVendorItemDto.salePrice) &&
        Objects.equals(this.salePeriodType, productDetailVendorItemDto.salePeriodType) &&
        Objects.equals(this.saleEndedAt, productDetailVendorItemDto.saleEndedAt) &&
        Objects.equals(this.roleCode, productDetailVendorItemDto.roleCode) &&
        Objects.equals(this.representativeDisplayCategoryCode, productDetailVendorItemDto.representativeDisplayCategoryCode) &&
        Objects.equals(this.remainQuantity, productDetailVendorItemDto.remainQuantity) &&
        Objects.equals(this.productServicePlatformType, productDetailVendorItemDto.productServicePlatformType) &&
        Objects.equals(this.productName, productDetailVendorItemDto.productName) &&
        Objects.equals(this.productId, productDetailVendorItemDto.productId) &&
        Objects.equals(this.primeType, productDetailVendorItemDto.primeType) &&
        Objects.equals(this.paymentForVendor, productDetailVendorItemDto.paymentForVendor) &&
        Objects.equals(this.packageMaximumBuyForPersons, productDetailVendorItemDto.packageMaximumBuyForPersons) &&
        Objects.equals(this.originalPrice, productDetailVendorItemDto.originalPrice) &&
        Objects.equals(this.optionMustBought, productDetailVendorItemDto.optionMustBought) &&
        Objects.equals(this.noticeContentDto, productDetailVendorItemDto.noticeContentDto) &&
        Objects.equals(this.notice, productDetailVendorItemDto.notice) &&
        Objects.equals(this.newMemberOnly, productDetailVendorItemDto.newMemberOnly) &&
        Objects.equals(this.modifiedAt, productDetailVendorItemDto.modifiedAt) &&
        Objects.equals(this.modelNo, productDetailVendorItemDto.modelNo) &&
        Objects.equals(this.mixPackYn, productDetailVendorItemDto.mixPackYn) &&
        Objects.equals(this.messageForExtraInfo, productDetailVendorItemDto.messageForExtraInfo) &&
        Objects.equals(this.mdId, productDetailVendorItemDto.mdId) &&
        Objects.equals(this.maximumBuyForPersonPeriod, productDetailVendorItemDto.maximumBuyForPersonPeriod) &&
        Objects.equals(this.maximumBuyForPerson, productDetailVendorItemDto.maximumBuyForPerson) &&
        Objects.equals(this.maximumBuyCount, productDetailVendorItemDto.maximumBuyCount) &&
        Objects.equals(this.maxMixPackCnt, productDetailVendorItemDto.maxMixPackCnt) &&
        Objects.equals(this.managementCategoryCode, productDetailVendorItemDto.managementCategoryCode) &&
        Objects.equals(this.localDto, productDetailVendorItemDto.localDto) &&
        Objects.equals(this.labelForExtraInfo, productDetailVendorItemDto.labelForExtraInfo) &&
        Objects.equals(this.itemName, productDetailVendorItemDto.itemName) &&
        Objects.equals(this.itemId, productDetailVendorItemDto.itemId) &&
        Objects.equals(this.itemAttributeDtos, productDetailVendorItemDto.itemAttributeDtos) &&
        Objects.equals(this.inventory, productDetailVendorItemDto.inventory) &&
        Objects.equals(this.imageDto, productDetailVendorItemDto.imageDto) &&
        Objects.equals(this.goodsDto, productDetailVendorItemDto.goodsDto) &&
        Objects.equals(this.giftCard, productDetailVendorItemDto.giftCard) &&
        Objects.equals(this.freeShipOverAmount, productDetailVendorItemDto.freeShipOverAmount) &&
        Objects.equals(this.extraInfoUsed, productDetailVendorItemDto.extraInfoUsed) &&
        Objects.equals(this.externalCode, productDetailVendorItemDto.externalCode) &&
        Objects.equals(this.dropStatus, productDetailVendorItemDto.dropStatus) &&
        Objects.equals(this.divisionType, productDetailVendorItemDto.divisionType) &&
        Objects.equals(this.displayChannels, productDetailVendorItemDto.displayChannels) &&
        Objects.equals(this.displayCategoryCodes, productDetailVendorItemDto.displayCategoryCodes) &&
        Objects.equals(this.descriptionDtos, productDetailVendorItemDto.descriptionDtos) &&
        Objects.equals(this.deliveryCharge, productDetailVendorItemDto.deliveryCharge) &&
        Objects.equals(this.cultureDto, productDetailVendorItemDto.cultureDto) &&
        Objects.equals(this.createdAt, productDetailVendorItemDto.createdAt) &&
        Objects.equals(this.couponUseType, productDetailVendorItemDto.couponUseType) &&
        Objects.equals(this.contentDtos, productDetailVendorItemDto.contentDtos) &&
        Objects.equals(this.autoFinishedAt, productDetailVendorItemDto.autoFinishedAt) &&
        Objects.equals(this.autoFinished, productDetailVendorItemDto.autoFinished) &&
        Objects.equals(this.autoCancelType, productDetailVendorItemDto.autoCancelType) &&
        Objects.equals(this.almostSoldout, productDetailVendorItemDto.almostSoldout) &&
        Objects.equals(this.adultOnly, productDetailVendorItemDto.adultOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemSkuDtos, vendorItemProperties, vendorItemPolicyDto, vendorItemPackgeNames, vendorItemPackages, vendorItemPackageTypes, vendorItemPackageTypeMap, vendorItemPackagePolicyDto, vendorItemPackageIds, vendorItemPackageId, vendorItemName, vendorItemImageDto, vendorItemId, vendorItemDescriptionLegacyType, vendorItemDescriptionDtos, vendorItemCertifications, vendorId, valid, useStartDate, useEndDate, usableVolume, travelDto, teamCode, taxType, subTitle, soldOut, soldCount, skuIds, saleStartedAt, salePriceType, salePrice, salePeriodType, saleEndedAt, roleCode, representativeDisplayCategoryCode, remainQuantity, productServicePlatformType, productName, productId, primeType, paymentForVendor, packageMaximumBuyForPersons, originalPrice, optionMustBought, noticeContentDto, notice, newMemberOnly, modifiedAt, modelNo, mixPackYn, messageForExtraInfo, mdId, maximumBuyForPersonPeriod, maximumBuyForPerson, maximumBuyCount, maxMixPackCnt, managementCategoryCode, localDto, labelForExtraInfo, itemName, itemId, itemAttributeDtos, inventory, imageDto, goodsDto, giftCard, freeShipOverAmount, extraInfoUsed, externalCode, dropStatus, divisionType, displayChannels, displayCategoryCodes, descriptionDtos, deliveryCharge, cultureDto, createdAt, couponUseType, contentDtos, autoFinishedAt, autoFinished, autoCancelType, almostSoldout, adultOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailVendorItemDto {\n");
    
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
    sb.append("    remainQuantity: ").append(toIndentedString(remainQuantity)).append("\n");
    sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
    sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
    sb.append("    packageMaximumBuyForPersons: ").append(toIndentedString(packageMaximumBuyForPersons)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
    sb.append("    noticeContentDto: ").append(toIndentedString(noticeContentDto)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modelNo: ").append(toIndentedString(modelNo)).append("\n");
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
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemAttributeDtos: ").append(toIndentedString(itemAttributeDtos)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    imageDto: ").append(toIndentedString(imageDto)).append("\n");
    sb.append("    goodsDto: ").append(toIndentedString(goodsDto)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
    sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
    sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    dropStatus: ").append(toIndentedString(dropStatus)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayChannels: ").append(toIndentedString(displayChannels)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    descriptionDtos: ").append(toIndentedString(descriptionDtos)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    cultureDto: ").append(toIndentedString(cultureDto)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
    sb.append("    contentDtos: ").append(toIndentedString(contentDtos)).append("\n");
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

  public static ProductDetailVendorItemDtoBuilder builder() {
    return new ProductDetailVendorItemDtoBuilder();
  }

  public static class ProductDetailVendorItemDtoBuilder {

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
    private Integer remainQuantity = null;
    private ProductServicePlatformTypeEnum productServicePlatformType = null;
    private String productName = null;
    private Long productId = null;
    private String primeType = null;
    private java.math.BigDecimal paymentForVendor = null;
    private Map<Long, Integer> packageMaximumBuyForPersons = new HashMap<Long, Integer>();
    private java.math.BigDecimal originalPrice = null;
    private Boolean optionMustBought = null;
    private ProductDetailNoticeContentDto noticeContentDto = null;
    private String notice = null;
    private Boolean newMemberOnly = null;
    private Date modifiedAt = null;
    private String modelNo = null;
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
    private String itemName = null;
    private Long itemId = null;
    private List<ItemAttributeDto> itemAttributeDtos = new ArrayList<ItemAttributeDto>();
    private Integer inventory = null;
    private VendorItemImageDto imageDto = null;
    private GoodsDto goodsDto = null;
    private Boolean giftCard = null;
    private java.math.BigDecimal freeShipOverAmount = null;
    private Boolean extraInfoUsed = null;
    private String externalCode = null;
    private String dropStatus = null;
    private String divisionType = null;
    private List<String> displayChannels = new ArrayList<String>();
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private List<VendorItemDescriptionDto> descriptionDtos = new ArrayList<VendorItemDescriptionDto>();
    private java.math.BigDecimal deliveryCharge = null;
    private CultureDto cultureDto = null;
    private Date createdAt = null;
    private CouponUseTypeEnum couponUseType = null;
    private List<VendorItemContentDto> contentDtos = new ArrayList<VendorItemContentDto>();
    private Date autoFinishedAt = null;
    private Boolean autoFinished = null;
    private String autoCancelType = null;
    private Boolean almostSoldout = null;
    private Boolean adultOnly = null;
    

    ProductDetailVendorItemDtoBuilder() {
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemSkuDtos(List<VendorItemSkuDto> vendorItemSkuDtos) {
      this.vendorItemSkuDtos = vendorItemSkuDtos;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemProperties(Object vendorItemProperties) {
      this.vendorItemProperties = vendorItemProperties;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPolicyDto(VendorItemPolicyDto vendorItemPolicyDto) {
      this.vendorItemPolicyDto = vendorItemPolicyDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackgeNames(Map<Long, String> vendorItemPackgeNames) {
      this.vendorItemPackgeNames = vendorItemPackgeNames;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackages(List<Long> vendorItemPackages) {
      this.vendorItemPackages = vendorItemPackages;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackageTypes(List<String> vendorItemPackageTypes) {
      this.vendorItemPackageTypes = vendorItemPackageTypes;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackageTypeMap(Map<Long, String> vendorItemPackageTypeMap) {
      this.vendorItemPackageTypeMap = vendorItemPackageTypeMap;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackagePolicyDto(Map<Long, VendorItemPackagePolicyDto> vendorItemPackagePolicyDto) {
      this.vendorItemPackagePolicyDto = vendorItemPackagePolicyDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackageIds(List<Long> vendorItemPackageIds) {
      this.vendorItemPackageIds = vendorItemPackageIds;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemName(String vendorItemName) {
      this.vendorItemName = vendorItemName;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemImageDto(VendorItemImageDto vendorItemImageDto) {
      this.vendorItemImageDto = vendorItemImageDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemDescriptionLegacyType(String vendorItemDescriptionLegacyType) {
      this.vendorItemDescriptionLegacyType = vendorItemDescriptionLegacyType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemDescriptionDtos(List<VendorItemDescriptionDto> vendorItemDescriptionDtos) {
      this.vendorItemDescriptionDtos = vendorItemDescriptionDtos;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorItemCertifications(List<VendorItemCertificationAdapterDto> vendorItemCertifications) {
      this.vendorItemCertifications = vendorItemCertifications;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder usableVolume(Long usableVolume) {
      this.usableVolume = usableVolume;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder travelDto(TravelDto travelDto) {
      this.travelDto = travelDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder teamCode(String teamCode) {
      this.teamCode = teamCode;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder taxType(String taxType) {
      this.taxType = taxType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder subTitle(String subTitle) {
      this.subTitle = subTitle;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder skuIds(List<Long> skuIds) {
      this.skuIds = skuIds;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder saleStartedAt(Date saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder salePriceType(String salePriceType) {
      this.salePriceType = salePriceType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder salePrice(java.math.BigDecimal salePrice) {
      this.salePrice = salePrice;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder salePeriodType(String salePeriodType) {
      this.salePeriodType = salePeriodType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder saleEndedAt(Date saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder roleCode(Integer roleCode) {
      this.roleCode = roleCode;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder representativeDisplayCategoryCode(Long representativeDisplayCategoryCode) {
      this.representativeDisplayCategoryCode = representativeDisplayCategoryCode;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder remainQuantity(Integer remainQuantity) {
      this.remainQuantity = remainQuantity;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder productServicePlatformType(ProductServicePlatformTypeEnum productServicePlatformType) {
      this.productServicePlatformType = productServicePlatformType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder primeType(String primeType) {
      this.primeType = primeType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder paymentForVendor(java.math.BigDecimal paymentForVendor) {
      this.paymentForVendor = paymentForVendor;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder packageMaximumBuyForPersons(Map<Long, Integer> packageMaximumBuyForPersons) {
      this.packageMaximumBuyForPersons = packageMaximumBuyForPersons;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder originalPrice(java.math.BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder optionMustBought(Boolean optionMustBought) {
      this.optionMustBought = optionMustBought;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder noticeContentDto(ProductDetailNoticeContentDto noticeContentDto) {
      this.noticeContentDto = noticeContentDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder notice(String notice) {
      this.notice = notice;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder newMemberOnly(Boolean newMemberOnly) {
      this.newMemberOnly = newMemberOnly;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder modelNo(String modelNo) {
      this.modelNo = modelNo;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder mixPackYn(String mixPackYn) {
      this.mixPackYn = mixPackYn;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder messageForExtraInfo(String messageForExtraInfo) {
      this.messageForExtraInfo = messageForExtraInfo;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder mdId(String mdId) {
      this.mdId = mdId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder maximumBuyForPersonPeriod(Integer maximumBuyForPersonPeriod) {
      this.maximumBuyForPersonPeriod = maximumBuyForPersonPeriod;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder maximumBuyForPerson(Integer maximumBuyForPerson) {
      this.maximumBuyForPerson = maximumBuyForPerson;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder maxMixPackCnt(Integer maxMixPackCnt) {
      this.maxMixPackCnt = maxMixPackCnt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder managementCategoryCode(Long managementCategoryCode) {
      this.managementCategoryCode = managementCategoryCode;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder localDto(LocalDto localDto) {
      this.localDto = localDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder labelForExtraInfo(String labelForExtraInfo) {
      this.labelForExtraInfo = labelForExtraInfo;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder itemAttributeDtos(List<ItemAttributeDto> itemAttributeDtos) {
      this.itemAttributeDtos = itemAttributeDtos;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder inventory(Integer inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder imageDto(VendorItemImageDto imageDto) {
      this.imageDto = imageDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder goodsDto(GoodsDto goodsDto) {
      this.goodsDto = goodsDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder freeShipOverAmount(java.math.BigDecimal freeShipOverAmount) {
      this.freeShipOverAmount = freeShipOverAmount;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder extraInfoUsed(Boolean extraInfoUsed) {
      this.extraInfoUsed = extraInfoUsed;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder externalCode(String externalCode) {
      this.externalCode = externalCode;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder dropStatus(String dropStatus) {
      this.dropStatus = dropStatus;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder displayChannels(List<String> displayChannels) {
      this.displayChannels = displayChannels;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder descriptionDtos(List<VendorItemDescriptionDto> descriptionDtos) {
      this.descriptionDtos = descriptionDtos;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder deliveryCharge(java.math.BigDecimal deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder cultureDto(CultureDto cultureDto) {
      this.cultureDto = cultureDto;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder couponUseType(CouponUseTypeEnum couponUseType) {
      this.couponUseType = couponUseType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder contentDtos(List<VendorItemContentDto> contentDtos) {
      this.contentDtos = contentDtos;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder autoFinishedAt(Date autoFinishedAt) {
      this.autoFinishedAt = autoFinishedAt;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder autoFinished(Boolean autoFinished) {
      this.autoFinished = autoFinished;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder autoCancelType(String autoCancelType) {
      this.autoCancelType = autoCancelType;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder almostSoldout(Boolean almostSoldout) {
      this.almostSoldout = almostSoldout;
      return this;
    }

    /**
     **/
    public ProductDetailVendorItemDtoBuilder adultOnly(Boolean adultOnly) {
      this.adultOnly = adultOnly;
      return this;
    }


    public ProductDetailVendorItemDto build() {
      ProductDetailVendorItemDto productDetailVendorItemDto = new ProductDetailVendorItemDto();
      productDetailVendorItemDto.setVendorItemSkuDtos(this.vendorItemSkuDtos);
      productDetailVendorItemDto.setVendorItemProperties(this.vendorItemProperties);
      productDetailVendorItemDto.setVendorItemPolicyDto(this.vendorItemPolicyDto);
      productDetailVendorItemDto.setVendorItemPackgeNames(this.vendorItemPackgeNames);
      productDetailVendorItemDto.setVendorItemPackages(this.vendorItemPackages);
      productDetailVendorItemDto.setVendorItemPackageTypes(this.vendorItemPackageTypes);
      productDetailVendorItemDto.setVendorItemPackageTypeMap(this.vendorItemPackageTypeMap);
      productDetailVendorItemDto.setVendorItemPackagePolicyDto(this.vendorItemPackagePolicyDto);
      productDetailVendorItemDto.setVendorItemPackageIds(this.vendorItemPackageIds);
      productDetailVendorItemDto.setVendorItemPackageId(this.vendorItemPackageId);
      productDetailVendorItemDto.setVendorItemName(this.vendorItemName);
      productDetailVendorItemDto.setVendorItemImageDto(this.vendorItemImageDto);
      productDetailVendorItemDto.setVendorItemId(this.vendorItemId);
      productDetailVendorItemDto.setVendorItemDescriptionLegacyType(this.vendorItemDescriptionLegacyType);
      productDetailVendorItemDto.setVendorItemDescriptionDtos(this.vendorItemDescriptionDtos);
      productDetailVendorItemDto.setVendorItemCertifications(this.vendorItemCertifications);
      productDetailVendorItemDto.setVendorId(this.vendorId);
      productDetailVendorItemDto.setValid(this.valid);
      productDetailVendorItemDto.setUseStartDate(this.useStartDate);
      productDetailVendorItemDto.setUseEndDate(this.useEndDate);
      productDetailVendorItemDto.setUsableVolume(this.usableVolume);
      productDetailVendorItemDto.setTravelDto(this.travelDto);
      productDetailVendorItemDto.setTeamCode(this.teamCode);
      productDetailVendorItemDto.setTaxType(this.taxType);
      productDetailVendorItemDto.setSubTitle(this.subTitle);
      productDetailVendorItemDto.setSoldOut(this.soldOut);
      productDetailVendorItemDto.setSoldCount(this.soldCount);
      productDetailVendorItemDto.setSkuIds(this.skuIds);
      productDetailVendorItemDto.setSaleStartedAt(this.saleStartedAt);
      productDetailVendorItemDto.setSalePriceType(this.salePriceType);
      productDetailVendorItemDto.setSalePrice(this.salePrice);
      productDetailVendorItemDto.setSalePeriodType(this.salePeriodType);
      productDetailVendorItemDto.setSaleEndedAt(this.saleEndedAt);
      productDetailVendorItemDto.setRoleCode(this.roleCode);
      productDetailVendorItemDto.setRepresentativeDisplayCategoryCode(this.representativeDisplayCategoryCode);
      productDetailVendorItemDto.setRemainQuantity(this.remainQuantity);
      productDetailVendorItemDto.setProductServicePlatformType(this.productServicePlatformType);
      productDetailVendorItemDto.setProductName(this.productName);
      productDetailVendorItemDto.setProductId(this.productId);
      productDetailVendorItemDto.setPrimeType(this.primeType);
      productDetailVendorItemDto.setPaymentForVendor(this.paymentForVendor);
      productDetailVendorItemDto.setPackageMaximumBuyForPersons(this.packageMaximumBuyForPersons);
      productDetailVendorItemDto.setOriginalPrice(this.originalPrice);
      productDetailVendorItemDto.setOptionMustBought(this.optionMustBought);
      productDetailVendorItemDto.setNoticeContentDto(this.noticeContentDto);
      productDetailVendorItemDto.setNotice(this.notice);
      productDetailVendorItemDto.setNewMemberOnly(this.newMemberOnly);
      productDetailVendorItemDto.setModifiedAt(this.modifiedAt);
      productDetailVendorItemDto.setModelNo(this.modelNo);
      productDetailVendorItemDto.setMixPackYn(this.mixPackYn);
      productDetailVendorItemDto.setMessageForExtraInfo(this.messageForExtraInfo);
      productDetailVendorItemDto.setMdId(this.mdId);
      productDetailVendorItemDto.setMaximumBuyForPersonPeriod(this.maximumBuyForPersonPeriod);
      productDetailVendorItemDto.setMaximumBuyForPerson(this.maximumBuyForPerson);
      productDetailVendorItemDto.setMaximumBuyCount(this.maximumBuyCount);
      productDetailVendorItemDto.setMaxMixPackCnt(this.maxMixPackCnt);
      productDetailVendorItemDto.setManagementCategoryCode(this.managementCategoryCode);
      productDetailVendorItemDto.setLocalDto(this.localDto);
      productDetailVendorItemDto.setLabelForExtraInfo(this.labelForExtraInfo);
      productDetailVendorItemDto.setItemName(this.itemName);
      productDetailVendorItemDto.setItemId(this.itemId);
      productDetailVendorItemDto.setItemAttributeDtos(this.itemAttributeDtos);
      productDetailVendorItemDto.setInventory(this.inventory);
      productDetailVendorItemDto.setImageDto(this.imageDto);
      productDetailVendorItemDto.setGoodsDto(this.goodsDto);
      productDetailVendorItemDto.setGiftCard(this.giftCard);
      productDetailVendorItemDto.setFreeShipOverAmount(this.freeShipOverAmount);
      productDetailVendorItemDto.setExtraInfoUsed(this.extraInfoUsed);
      productDetailVendorItemDto.setExternalCode(this.externalCode);
      productDetailVendorItemDto.setDropStatus(this.dropStatus);
      productDetailVendorItemDto.setDivisionType(this.divisionType);
      productDetailVendorItemDto.setDisplayChannels(this.displayChannels);
      productDetailVendorItemDto.setDisplayCategoryCodes(this.displayCategoryCodes);
      productDetailVendorItemDto.setDescriptionDtos(this.descriptionDtos);
      productDetailVendorItemDto.setDeliveryCharge(this.deliveryCharge);
      productDetailVendorItemDto.setCultureDto(this.cultureDto);
      productDetailVendorItemDto.setCreatedAt(this.createdAt);
      productDetailVendorItemDto.setCouponUseType(this.couponUseType);
      productDetailVendorItemDto.setContentDtos(this.contentDtos);
      productDetailVendorItemDto.setAutoFinishedAt(this.autoFinishedAt);
      productDetailVendorItemDto.setAutoFinished(this.autoFinished);
      productDetailVendorItemDto.setAutoCancelType(this.autoCancelType);
      productDetailVendorItemDto.setAlmostSoldout(this.almostSoldout);
      productDetailVendorItemDto.setAdultOnly(this.adultOnly);
      return productDetailVendorItemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductDetailVendorItemDtoBuilder {\n");
      
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
      sb.append("    remainQuantity: ").append(toIndentedString(remainQuantity)).append("\n");
      sb.append("    productServicePlatformType: ").append(toIndentedString(productServicePlatformType)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    primeType: ").append(toIndentedString(primeType)).append("\n");
      sb.append("    paymentForVendor: ").append(toIndentedString(paymentForVendor)).append("\n");
      sb.append("    packageMaximumBuyForPersons: ").append(toIndentedString(packageMaximumBuyForPersons)).append("\n");
      sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
      sb.append("    optionMustBought: ").append(toIndentedString(optionMustBought)).append("\n");
      sb.append("    noticeContentDto: ").append(toIndentedString(noticeContentDto)).append("\n");
      sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
      sb.append("    newMemberOnly: ").append(toIndentedString(newMemberOnly)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    modelNo: ").append(toIndentedString(modelNo)).append("\n");
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
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    itemAttributeDtos: ").append(toIndentedString(itemAttributeDtos)).append("\n");
      sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
      sb.append("    imageDto: ").append(toIndentedString(imageDto)).append("\n");
      sb.append("    goodsDto: ").append(toIndentedString(goodsDto)).append("\n");
      sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
      sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
      sb.append("    extraInfoUsed: ").append(toIndentedString(extraInfoUsed)).append("\n");
      sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
      sb.append("    dropStatus: ").append(toIndentedString(dropStatus)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayChannels: ").append(toIndentedString(displayChannels)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    descriptionDtos: ").append(toIndentedString(descriptionDtos)).append("\n");
      sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
      sb.append("    cultureDto: ").append(toIndentedString(cultureDto)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
      sb.append("    contentDtos: ").append(toIndentedString(contentDtos)).append("\n");
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

