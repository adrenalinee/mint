package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class SearchProduct   {
  
  private Long winnerVendorItemId = null;
  private Integer winnerVendorItemCount = null;
  private String winnerVendorId = null;
  private List<String> vendorIds = new ArrayList<String>();
  private List<String> unitPriceInfo = new ArrayList<String>();


  public enum TypeEnum {
    DEAL("DEAL"),
    OPTION("OPTION"),
    PRODUCT("PRODUCT"),
    VENDOR_ITEM("VENDOR_ITEM"),
    VENDOR_ITEM_PACKAGE("VENDOR_ITEM_PACKAGE"),
    FACET("FACET"),
    _("*");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private Long subscribeVendorItemId = null;
  private Long subscribePrice = null;
  private Double subscribeDiscountRate = null;
  private Boolean subscribeDelivery = null;
  private Date startTime = null;
  private String sellingStatusType = null;
  private String sectionContent = null;
  private Long salesPrice = null;
  private Long salesCount = null;
  private Boolean rocketDelivery = null;
  private Long ratingCount = null;
  private Double ratingAverage = null;
  private String productTitle = null;
  private Long productId = null;
  private String packageType = null;
  private Long originPrice = null;
  private String orgPriceType = null;
  private Long minPrice = null;
  private Long maxPrice = null;
  private List<String> linkcodes = new ArrayList<String>();
  private List<Long> leafComponentIds = new ArrayList<Long>();
  private List<String> latLng = new ArrayList<String>();
  private Integer itemsCount = null;
  private Long itemProductId = null;
  private Long itemId = null;
  private Boolean isWinnerItemProduct = null;
  private String isTemporarilySoldOut = null;
  private String isSoldOut = null;
  private Boolean isDirectUse = null;
  private Boolean isAdult = null;
  private List<Long> internalCategoryIds = new ArrayList<Long>();
  private List<String> internalCategoryCodes = new ArrayList<String>();
  private String imageSquare = null;
  private String imagePanorama = null;
  private String imageMainPath = null;
  private String image = null;
  private String firstAttrTypeName = null;
  private Date endTime = null;


  public enum DeliveryChargeTypeEnum {
    FREE("FREE"),
    ROCKET("ROCKET"),
    COUPANG_GLOBAL("COUPANG_GLOBAL"),
    FREE_DELIVERY_OVER_5000("FREE_DELIVERY_OVER_5000"),
    FREE_DELIVERY_OVER_9800("FREE_DELIVERY_OVER_9800"),
    SUBSCRIBABLE("SUBSCRIBABLE"),
    CONDITIONAL_FREE("CONDITIONAL_FREE"),
    NOT_FREE("NOT_FREE"),
    CHARGE_RECEIVED("CHARGE_RECEIVED"),
    _("*");

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

  private List<DeliveryChargeTypeEnum> deliveryChargeType = new ArrayList<DeliveryChargeTypeEnum>();
  private List<Long> componentIds = new ArrayList<Long>();
  private List<String> brand = new ArrayList<String>();
  private String alternativeTitle = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("winnerVendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("winnerVendorItemId")
  public Long getWinnerVendorItemId() {
    return winnerVendorItemId;
  }
  
  /**
   **/
  public void setWinnerVendorItemId(Long winnerVendorItemId) {
    this.winnerVendorItemId = winnerVendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("winnerVendorItemCount")
  @com.fasterxml.jackson.annotation.JsonProperty("winnerVendorItemCount")
  public Integer getWinnerVendorItemCount() {
    return winnerVendorItemCount;
  }
  
  /**
   **/
  public void setWinnerVendorItemCount(Integer winnerVendorItemCount) {
    this.winnerVendorItemCount = winnerVendorItemCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("winnerVendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("winnerVendorId")
  public String getWinnerVendorId() {
    return winnerVendorId;
  }
  
  /**
   **/
  public void setWinnerVendorId(String winnerVendorId) {
    this.winnerVendorId = winnerVendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorIds")
  public List<String> getVendorIds() {
    return vendorIds;
  }
  
  /**
   **/
  public void setVendorIds(List<String> vendorIds) {
    this.vendorIds = vendorIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitPriceInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPriceInfo")
  public List<String> getUnitPriceInfo() {
    return unitPriceInfo;
  }
  
  /**
   **/
  public void setUnitPriceInfo(List<String> unitPriceInfo) {
    this.unitPriceInfo = unitPriceInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeVendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeVendorItemId")
  public Long getSubscribeVendorItemId() {
    return subscribeVendorItemId;
  }
  
  /**
   **/
  public void setSubscribeVendorItemId(Long subscribeVendorItemId) {
    this.subscribeVendorItemId = subscribeVendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribePrice")
  public Long getSubscribePrice() {
    return subscribePrice;
  }
  
  /**
   **/
  public void setSubscribePrice(Long subscribePrice) {
    this.subscribePrice = subscribePrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeDiscountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeDiscountRate")
  public Double getSubscribeDiscountRate() {
    return subscribeDiscountRate;
  }
  
  /**
   **/
  public void setSubscribeDiscountRate(Double subscribeDiscountRate) {
    this.subscribeDiscountRate = subscribeDiscountRate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscribeDelivery")
  @com.fasterxml.jackson.annotation.JsonProperty("subscribeDelivery")
  public Boolean getSubscribeDelivery() {
    return subscribeDelivery;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSubscribeDelivery() {
    return subscribeDelivery == null ? false : subscribeDelivery;
  }
  
  /**
   **/
  public void setSubscribeDelivery(Boolean subscribeDelivery) {
    this.subscribeDelivery = subscribeDelivery;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startTime")
  @com.fasterxml.jackson.annotation.JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  
  /**
   **/
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellingStatusType")
  @com.fasterxml.jackson.annotation.JsonProperty("sellingStatusType")
  public String getSellingStatusType() {
    return sellingStatusType;
  }
  
  /**
   **/
  public void setSellingStatusType(String sellingStatusType) {
    this.sellingStatusType = sellingStatusType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sectionContent")
  @com.fasterxml.jackson.annotation.JsonProperty("sectionContent")
  public String getSectionContent() {
    return sectionContent;
  }
  
  /**
   **/
  public void setSectionContent(String sectionContent) {
    this.sectionContent = sectionContent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public Long getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(Long salesPrice) {
    this.salesPrice = salesPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesCount")
  @com.fasterxml.jackson.annotation.JsonProperty("salesCount")
  public Long getSalesCount() {
    return salesCount;
  }
  
  /**
   **/
  public void setSalesCount(Long salesCount) {
    this.salesCount = salesCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rocketDelivery")
  @com.fasterxml.jackson.annotation.JsonProperty("rocketDelivery")
  public Boolean getRocketDelivery() {
    return rocketDelivery;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRocketDelivery() {
    return rocketDelivery == null ? false : rocketDelivery;
  }
  
  /**
   **/
  public void setRocketDelivery(Boolean rocketDelivery) {
    this.rocketDelivery = rocketDelivery;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingCount")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingCount")
  public Long getRatingCount() {
    return ratingCount;
  }
  
  /**
   **/
  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingAverage")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAverage")
  public Double getRatingAverage() {
    return ratingAverage;
  }
  
  /**
   **/
  public void setRatingAverage(Double ratingAverage) {
    this.ratingAverage = ratingAverage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("productTitle")
  public String getProductTitle() {
    return productTitle;
  }
  
  /**
   **/
  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
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
  @org.codehaus.jackson.annotate.JsonProperty("packageType")
  @com.fasterxml.jackson.annotation.JsonProperty("packageType")
  public String getPackageType() {
    return packageType;
  }
  
  /**
   **/
  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("originPrice")
  public Long getOriginPrice() {
    return originPrice;
  }
  
  /**
   **/
  public void setOriginPrice(Long originPrice) {
    this.originPrice = originPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orgPriceType")
  @com.fasterxml.jackson.annotation.JsonProperty("orgPriceType")
  public String getOrgPriceType() {
    return orgPriceType;
  }
  
  /**
   **/
  public void setOrgPriceType(String orgPriceType) {
    this.orgPriceType = orgPriceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("minPrice")
  public Long getMinPrice() {
    return minPrice;
  }
  
  /**
   **/
  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPrice")
  public Long getMaxPrice() {
    return maxPrice;
  }
  
  /**
   **/
  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkcodes")
  @com.fasterxml.jackson.annotation.JsonProperty("linkcodes")
  public List<String> getLinkcodes() {
    return linkcodes;
  }
  
  /**
   **/
  public void setLinkcodes(List<String> linkcodes) {
    this.linkcodes = linkcodes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("leafComponentIds")
  @com.fasterxml.jackson.annotation.JsonProperty("leafComponentIds")
  public List<Long> getLeafComponentIds() {
    return leafComponentIds;
  }
  
  /**
   **/
  public void setLeafComponentIds(List<Long> leafComponentIds) {
    this.leafComponentIds = leafComponentIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("latLng")
  @com.fasterxml.jackson.annotation.JsonProperty("latLng")
  public List<String> getLatLng() {
    return latLng;
  }
  
  /**
   **/
  public void setLatLng(List<String> latLng) {
    this.latLng = latLng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemsCount")
  @com.fasterxml.jackson.annotation.JsonProperty("itemsCount")
  public Integer getItemsCount() {
    return itemsCount;
  }
  
  /**
   **/
  public void setItemsCount(Integer itemsCount) {
    this.itemsCount = itemsCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemProductId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemProductId")
  public Long getItemProductId() {
    return itemProductId;
  }
  
  /**
   **/
  public void setItemProductId(Long itemProductId) {
    this.itemProductId = itemProductId;
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
  @org.codehaus.jackson.annotate.JsonProperty("isWinnerItemProduct")
  @com.fasterxml.jackson.annotation.JsonProperty("isWinnerItemProduct")
  public Boolean getIsWinnerItemProduct() {
    return isWinnerItemProduct;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsWinnerItemProduct() {
    return isWinnerItemProduct == null ? false : isWinnerItemProduct;
  }
  
  /**
   **/
  public void setIsWinnerItemProduct(Boolean isWinnerItemProduct) {
    this.isWinnerItemProduct = isWinnerItemProduct;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isTemporarilySoldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("isTemporarilySoldOut")
  public String getIsTemporarilySoldOut() {
    return isTemporarilySoldOut;
  }
  
  /**
   **/
  public void setIsTemporarilySoldOut(String isTemporarilySoldOut) {
    this.isTemporarilySoldOut = isTemporarilySoldOut;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isSoldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("isSoldOut")
  public String getIsSoldOut() {
    return isSoldOut;
  }
  
  /**
   **/
  public void setIsSoldOut(String isSoldOut) {
    this.isSoldOut = isSoldOut;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isDirectUse")
  @com.fasterxml.jackson.annotation.JsonProperty("isDirectUse")
  public Boolean getIsDirectUse() {
    return isDirectUse;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsDirectUse() {
    return isDirectUse == null ? false : isDirectUse;
  }
  
  /**
   **/
  public void setIsDirectUse(Boolean isDirectUse) {
    this.isDirectUse = isDirectUse;
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
  @org.codehaus.jackson.annotate.JsonProperty("internalCategoryIds")
  @com.fasterxml.jackson.annotation.JsonProperty("internalCategoryIds")
  public List<Long> getInternalCategoryIds() {
    return internalCategoryIds;
  }
  
  /**
   **/
  public void setInternalCategoryIds(List<Long> internalCategoryIds) {
    this.internalCategoryIds = internalCategoryIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("internalCategoryCodes")
  @com.fasterxml.jackson.annotation.JsonProperty("internalCategoryCodes")
  public List<String> getInternalCategoryCodes() {
    return internalCategoryCodes;
  }
  
  /**
   **/
  public void setInternalCategoryCodes(List<String> internalCategoryCodes) {
    this.internalCategoryCodes = internalCategoryCodes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageSquare")
  @com.fasterxml.jackson.annotation.JsonProperty("imageSquare")
  public String getImageSquare() {
    return imageSquare;
  }
  
  /**
   **/
  public void setImageSquare(String imageSquare) {
    this.imageSquare = imageSquare;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imagePanorama")
  @com.fasterxml.jackson.annotation.JsonProperty("imagePanorama")
  public String getImagePanorama() {
    return imagePanorama;
  }
  
  /**
   **/
  public void setImagePanorama(String imagePanorama) {
    this.imagePanorama = imagePanorama;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageMainPath")
  @com.fasterxml.jackson.annotation.JsonProperty("imageMainPath")
  public String getImageMainPath() {
    return imageMainPath;
  }
  
  /**
   **/
  public void setImageMainPath(String imageMainPath) {
    this.imageMainPath = imageMainPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("image")
  @com.fasterxml.jackson.annotation.JsonProperty("image")
  public String getImage() {
    return image;
  }
  
  /**
   **/
  public void setImage(String image) {
    this.image = image;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("firstAttrTypeName")
  @com.fasterxml.jackson.annotation.JsonProperty("firstAttrTypeName")
  public String getFirstAttrTypeName() {
    return firstAttrTypeName;
  }
  
  /**
   **/
  public void setFirstAttrTypeName(String firstAttrTypeName) {
    this.firstAttrTypeName = firstAttrTypeName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("endTime")
  @com.fasterxml.jackson.annotation.JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  
  /**
   **/
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryChargeType")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryChargeType")
  public List<DeliveryChargeTypeEnum> getDeliveryChargeType() {
    return deliveryChargeType;
  }
  
  /**
   **/
  public void setDeliveryChargeType(List<DeliveryChargeTypeEnum> deliveryChargeType) {
    this.deliveryChargeType = deliveryChargeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("componentIds")
  @com.fasterxml.jackson.annotation.JsonProperty("componentIds")
  public List<Long> getComponentIds() {
    return componentIds;
  }
  
  /**
   **/
  public void setComponentIds(List<Long> componentIds) {
    this.componentIds = componentIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brand")
  @com.fasterxml.jackson.annotation.JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }
  
  /**
   **/
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("alternativeTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("alternativeTitle")
  public String getAlternativeTitle() {
    return alternativeTitle;
  }
  
  /**
   **/
  public void setAlternativeTitle(String alternativeTitle) {
    this.alternativeTitle = alternativeTitle;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchProduct searchProduct = (SearchProduct) o;
    return Objects.equals(this.winnerVendorItemId, searchProduct.winnerVendorItemId) &&
        Objects.equals(this.winnerVendorItemCount, searchProduct.winnerVendorItemCount) &&
        Objects.equals(this.winnerVendorId, searchProduct.winnerVendorId) &&
        Objects.equals(this.vendorIds, searchProduct.vendorIds) &&
        Objects.equals(this.unitPriceInfo, searchProduct.unitPriceInfo) &&
        Objects.equals(this.type, searchProduct.type) &&
        Objects.equals(this.subscribeVendorItemId, searchProduct.subscribeVendorItemId) &&
        Objects.equals(this.subscribePrice, searchProduct.subscribePrice) &&
        Objects.equals(this.subscribeDiscountRate, searchProduct.subscribeDiscountRate) &&
        Objects.equals(this.subscribeDelivery, searchProduct.subscribeDelivery) &&
        Objects.equals(this.startTime, searchProduct.startTime) &&
        Objects.equals(this.sellingStatusType, searchProduct.sellingStatusType) &&
        Objects.equals(this.sectionContent, searchProduct.sectionContent) &&
        Objects.equals(this.salesPrice, searchProduct.salesPrice) &&
        Objects.equals(this.salesCount, searchProduct.salesCount) &&
        Objects.equals(this.rocketDelivery, searchProduct.rocketDelivery) &&
        Objects.equals(this.ratingCount, searchProduct.ratingCount) &&
        Objects.equals(this.ratingAverage, searchProduct.ratingAverage) &&
        Objects.equals(this.productTitle, searchProduct.productTitle) &&
        Objects.equals(this.productId, searchProduct.productId) &&
        Objects.equals(this.packageType, searchProduct.packageType) &&
        Objects.equals(this.originPrice, searchProduct.originPrice) &&
        Objects.equals(this.orgPriceType, searchProduct.orgPriceType) &&
        Objects.equals(this.minPrice, searchProduct.minPrice) &&
        Objects.equals(this.maxPrice, searchProduct.maxPrice) &&
        Objects.equals(this.linkcodes, searchProduct.linkcodes) &&
        Objects.equals(this.leafComponentIds, searchProduct.leafComponentIds) &&
        Objects.equals(this.latLng, searchProduct.latLng) &&
        Objects.equals(this.itemsCount, searchProduct.itemsCount) &&
        Objects.equals(this.itemProductId, searchProduct.itemProductId) &&
        Objects.equals(this.itemId, searchProduct.itemId) &&
        Objects.equals(this.isWinnerItemProduct, searchProduct.isWinnerItemProduct) &&
        Objects.equals(this.isTemporarilySoldOut, searchProduct.isTemporarilySoldOut) &&
        Objects.equals(this.isSoldOut, searchProduct.isSoldOut) &&
        Objects.equals(this.isDirectUse, searchProduct.isDirectUse) &&
        Objects.equals(this.isAdult, searchProduct.isAdult) &&
        Objects.equals(this.internalCategoryIds, searchProduct.internalCategoryIds) &&
        Objects.equals(this.internalCategoryCodes, searchProduct.internalCategoryCodes) &&
        Objects.equals(this.imageSquare, searchProduct.imageSquare) &&
        Objects.equals(this.imagePanorama, searchProduct.imagePanorama) &&
        Objects.equals(this.imageMainPath, searchProduct.imageMainPath) &&
        Objects.equals(this.image, searchProduct.image) &&
        Objects.equals(this.firstAttrTypeName, searchProduct.firstAttrTypeName) &&
        Objects.equals(this.endTime, searchProduct.endTime) &&
        Objects.equals(this.deliveryChargeType, searchProduct.deliveryChargeType) &&
        Objects.equals(this.componentIds, searchProduct.componentIds) &&
        Objects.equals(this.brand, searchProduct.brand) &&
        Objects.equals(this.alternativeTitle, searchProduct.alternativeTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winnerVendorItemId, winnerVendorItemCount, winnerVendorId, vendorIds, unitPriceInfo, type, subscribeVendorItemId, subscribePrice, subscribeDiscountRate, subscribeDelivery, startTime, sellingStatusType, sectionContent, salesPrice, salesCount, rocketDelivery, ratingCount, ratingAverage, productTitle, productId, packageType, originPrice, orgPriceType, minPrice, maxPrice, linkcodes, leafComponentIds, latLng, itemsCount, itemProductId, itemId, isWinnerItemProduct, isTemporarilySoldOut, isSoldOut, isDirectUse, isAdult, internalCategoryIds, internalCategoryCodes, imageSquare, imagePanorama, imageMainPath, image, firstAttrTypeName, endTime, deliveryChargeType, componentIds, brand, alternativeTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchProduct {\n");
    
    sb.append("    winnerVendorItemId: ").append(toIndentedString(winnerVendorItemId)).append("\n");
    sb.append("    winnerVendorItemCount: ").append(toIndentedString(winnerVendorItemCount)).append("\n");
    sb.append("    winnerVendorId: ").append(toIndentedString(winnerVendorId)).append("\n");
    sb.append("    vendorIds: ").append(toIndentedString(vendorIds)).append("\n");
    sb.append("    unitPriceInfo: ").append(toIndentedString(unitPriceInfo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subscribeVendorItemId: ").append(toIndentedString(subscribeVendorItemId)).append("\n");
    sb.append("    subscribePrice: ").append(toIndentedString(subscribePrice)).append("\n");
    sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
    sb.append("    subscribeDelivery: ").append(toIndentedString(subscribeDelivery)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
    sb.append("    sectionContent: ").append(toIndentedString(sectionContent)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
    sb.append("    rocketDelivery: ").append(toIndentedString(rocketDelivery)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    originPrice: ").append(toIndentedString(originPrice)).append("\n");
    sb.append("    orgPriceType: ").append(toIndentedString(orgPriceType)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    linkcodes: ").append(toIndentedString(linkcodes)).append("\n");
    sb.append("    leafComponentIds: ").append(toIndentedString(leafComponentIds)).append("\n");
    sb.append("    latLng: ").append(toIndentedString(latLng)).append("\n");
    sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
    sb.append("    itemProductId: ").append(toIndentedString(itemProductId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    isWinnerItemProduct: ").append(toIndentedString(isWinnerItemProduct)).append("\n");
    sb.append("    isTemporarilySoldOut: ").append(toIndentedString(isTemporarilySoldOut)).append("\n");
    sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
    sb.append("    isDirectUse: ").append(toIndentedString(isDirectUse)).append("\n");
    sb.append("    isAdult: ").append(toIndentedString(isAdult)).append("\n");
    sb.append("    internalCategoryIds: ").append(toIndentedString(internalCategoryIds)).append("\n");
    sb.append("    internalCategoryCodes: ").append(toIndentedString(internalCategoryCodes)).append("\n");
    sb.append("    imageSquare: ").append(toIndentedString(imageSquare)).append("\n");
    sb.append("    imagePanorama: ").append(toIndentedString(imagePanorama)).append("\n");
    sb.append("    imageMainPath: ").append(toIndentedString(imageMainPath)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    firstAttrTypeName: ").append(toIndentedString(firstAttrTypeName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
    sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    alternativeTitle: ").append(toIndentedString(alternativeTitle)).append("\n");
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

  public static SearchProductBuilder builder() {
    return new SearchProductBuilder();
  }

  public static class SearchProductBuilder {

    private Long winnerVendorItemId = null;
    private Integer winnerVendorItemCount = null;
    private String winnerVendorId = null;
    private List<String> vendorIds = new ArrayList<String>();
    private List<String> unitPriceInfo = new ArrayList<String>();
    private TypeEnum type = null;
    private Long subscribeVendorItemId = null;
    private Long subscribePrice = null;
    private Double subscribeDiscountRate = null;
    private Boolean subscribeDelivery = null;
    private Date startTime = null;
    private String sellingStatusType = null;
    private String sectionContent = null;
    private Long salesPrice = null;
    private Long salesCount = null;
    private Boolean rocketDelivery = null;
    private Long ratingCount = null;
    private Double ratingAverage = null;
    private String productTitle = null;
    private Long productId = null;
    private String packageType = null;
    private Long originPrice = null;
    private String orgPriceType = null;
    private Long minPrice = null;
    private Long maxPrice = null;
    private List<String> linkcodes = new ArrayList<String>();
    private List<Long> leafComponentIds = new ArrayList<Long>();
    private List<String> latLng = new ArrayList<String>();
    private Integer itemsCount = null;
    private Long itemProductId = null;
    private Long itemId = null;
    private Boolean isWinnerItemProduct = null;
    private String isTemporarilySoldOut = null;
    private String isSoldOut = null;
    private Boolean isDirectUse = null;
    private Boolean isAdult = null;
    private List<Long> internalCategoryIds = new ArrayList<Long>();
    private List<String> internalCategoryCodes = new ArrayList<String>();
    private String imageSquare = null;
    private String imagePanorama = null;
    private String imageMainPath = null;
    private String image = null;
    private String firstAttrTypeName = null;
    private Date endTime = null;
    private List<DeliveryChargeTypeEnum> deliveryChargeType = new ArrayList<DeliveryChargeTypeEnum>();
    private List<Long> componentIds = new ArrayList<Long>();
    private List<String> brand = new ArrayList<String>();
    private String alternativeTitle = null;
    

    SearchProductBuilder() {
    }

    /**
     **/
    public SearchProductBuilder winnerVendorItemId(Long winnerVendorItemId) {
      this.winnerVendorItemId = winnerVendorItemId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder winnerVendorItemCount(Integer winnerVendorItemCount) {
      this.winnerVendorItemCount = winnerVendorItemCount;
      return this;
    }

    /**
     **/
    public SearchProductBuilder winnerVendorId(String winnerVendorId) {
      this.winnerVendorId = winnerVendorId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder vendorIds(List<String> vendorIds) {
      this.vendorIds = vendorIds;
      return this;
    }

    /**
     **/
    public SearchProductBuilder unitPriceInfo(List<String> unitPriceInfo) {
      this.unitPriceInfo = unitPriceInfo;
      return this;
    }

    /**
     **/
    public SearchProductBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public SearchProductBuilder subscribeVendorItemId(Long subscribeVendorItemId) {
      this.subscribeVendorItemId = subscribeVendorItemId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder subscribePrice(Long subscribePrice) {
      this.subscribePrice = subscribePrice;
      return this;
    }

    /**
     **/
    public SearchProductBuilder subscribeDiscountRate(Double subscribeDiscountRate) {
      this.subscribeDiscountRate = subscribeDiscountRate;
      return this;
    }

    /**
     **/
    public SearchProductBuilder subscribeDelivery(Boolean subscribeDelivery) {
      this.subscribeDelivery = subscribeDelivery;
      return this;
    }

    /**
     **/
    public SearchProductBuilder startTime(Date startTime) {
      this.startTime = startTime;
      return this;
    }

    /**
     **/
    public SearchProductBuilder sellingStatusType(String sellingStatusType) {
      this.sellingStatusType = sellingStatusType;
      return this;
    }

    /**
     **/
    public SearchProductBuilder sectionContent(String sectionContent) {
      this.sectionContent = sectionContent;
      return this;
    }

    /**
     **/
    public SearchProductBuilder salesPrice(Long salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public SearchProductBuilder salesCount(Long salesCount) {
      this.salesCount = salesCount;
      return this;
    }

    /**
     **/
    public SearchProductBuilder rocketDelivery(Boolean rocketDelivery) {
      this.rocketDelivery = rocketDelivery;
      return this;
    }

    /**
     **/
    public SearchProductBuilder ratingCount(Long ratingCount) {
      this.ratingCount = ratingCount;
      return this;
    }

    /**
     **/
    public SearchProductBuilder ratingAverage(Double ratingAverage) {
      this.ratingAverage = ratingAverage;
      return this;
    }

    /**
     **/
    public SearchProductBuilder productTitle(String productTitle) {
      this.productTitle = productTitle;
      return this;
    }

    /**
     **/
    public SearchProductBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder packageType(String packageType) {
      this.packageType = packageType;
      return this;
    }

    /**
     **/
    public SearchProductBuilder originPrice(Long originPrice) {
      this.originPrice = originPrice;
      return this;
    }

    /**
     **/
    public SearchProductBuilder orgPriceType(String orgPriceType) {
      this.orgPriceType = orgPriceType;
      return this;
    }

    /**
     **/
    public SearchProductBuilder minPrice(Long minPrice) {
      this.minPrice = minPrice;
      return this;
    }

    /**
     **/
    public SearchProductBuilder maxPrice(Long maxPrice) {
      this.maxPrice = maxPrice;
      return this;
    }

    /**
     **/
    public SearchProductBuilder linkcodes(List<String> linkcodes) {
      this.linkcodes = linkcodes;
      return this;
    }

    /**
     **/
    public SearchProductBuilder leafComponentIds(List<Long> leafComponentIds) {
      this.leafComponentIds = leafComponentIds;
      return this;
    }

    /**
     **/
    public SearchProductBuilder latLng(List<String> latLng) {
      this.latLng = latLng;
      return this;
    }

    /**
     **/
    public SearchProductBuilder itemsCount(Integer itemsCount) {
      this.itemsCount = itemsCount;
      return this;
    }

    /**
     **/
    public SearchProductBuilder itemProductId(Long itemProductId) {
      this.itemProductId = itemProductId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public SearchProductBuilder isWinnerItemProduct(Boolean isWinnerItemProduct) {
      this.isWinnerItemProduct = isWinnerItemProduct;
      return this;
    }

    /**
     **/
    public SearchProductBuilder isTemporarilySoldOut(String isTemporarilySoldOut) {
      this.isTemporarilySoldOut = isTemporarilySoldOut;
      return this;
    }

    /**
     **/
    public SearchProductBuilder isSoldOut(String isSoldOut) {
      this.isSoldOut = isSoldOut;
      return this;
    }

    /**
     **/
    public SearchProductBuilder isDirectUse(Boolean isDirectUse) {
      this.isDirectUse = isDirectUse;
      return this;
    }

    /**
     **/
    public SearchProductBuilder isAdult(Boolean isAdult) {
      this.isAdult = isAdult;
      return this;
    }

    /**
     **/
    public SearchProductBuilder internalCategoryIds(List<Long> internalCategoryIds) {
      this.internalCategoryIds = internalCategoryIds;
      return this;
    }

    /**
     **/
    public SearchProductBuilder internalCategoryCodes(List<String> internalCategoryCodes) {
      this.internalCategoryCodes = internalCategoryCodes;
      return this;
    }

    /**
     **/
    public SearchProductBuilder imageSquare(String imageSquare) {
      this.imageSquare = imageSquare;
      return this;
    }

    /**
     **/
    public SearchProductBuilder imagePanorama(String imagePanorama) {
      this.imagePanorama = imagePanorama;
      return this;
    }

    /**
     **/
    public SearchProductBuilder imageMainPath(String imageMainPath) {
      this.imageMainPath = imageMainPath;
      return this;
    }

    /**
     **/
    public SearchProductBuilder image(String image) {
      this.image = image;
      return this;
    }

    /**
     **/
    public SearchProductBuilder firstAttrTypeName(String firstAttrTypeName) {
      this.firstAttrTypeName = firstAttrTypeName;
      return this;
    }

    /**
     **/
    public SearchProductBuilder endTime(Date endTime) {
      this.endTime = endTime;
      return this;
    }

    /**
     **/
    public SearchProductBuilder deliveryChargeType(List<DeliveryChargeTypeEnum> deliveryChargeType) {
      this.deliveryChargeType = deliveryChargeType;
      return this;
    }

    /**
     **/
    public SearchProductBuilder componentIds(List<Long> componentIds) {
      this.componentIds = componentIds;
      return this;
    }

    /**
     **/
    public SearchProductBuilder brand(List<String> brand) {
      this.brand = brand;
      return this;
    }

    /**
     **/
    public SearchProductBuilder alternativeTitle(String alternativeTitle) {
      this.alternativeTitle = alternativeTitle;
      return this;
    }


    public SearchProduct build() {
      SearchProduct searchProduct = new SearchProduct();
      searchProduct.setWinnerVendorItemId(this.winnerVendorItemId);
      searchProduct.setWinnerVendorItemCount(this.winnerVendorItemCount);
      searchProduct.setWinnerVendorId(this.winnerVendorId);
      searchProduct.setVendorIds(this.vendorIds);
      searchProduct.setUnitPriceInfo(this.unitPriceInfo);
      searchProduct.setType(this.type);
      searchProduct.setSubscribeVendorItemId(this.subscribeVendorItemId);
      searchProduct.setSubscribePrice(this.subscribePrice);
      searchProduct.setSubscribeDiscountRate(this.subscribeDiscountRate);
      searchProduct.setSubscribeDelivery(this.subscribeDelivery);
      searchProduct.setStartTime(this.startTime);
      searchProduct.setSellingStatusType(this.sellingStatusType);
      searchProduct.setSectionContent(this.sectionContent);
      searchProduct.setSalesPrice(this.salesPrice);
      searchProduct.setSalesCount(this.salesCount);
      searchProduct.setRocketDelivery(this.rocketDelivery);
      searchProduct.setRatingCount(this.ratingCount);
      searchProduct.setRatingAverage(this.ratingAverage);
      searchProduct.setProductTitle(this.productTitle);
      searchProduct.setProductId(this.productId);
      searchProduct.setPackageType(this.packageType);
      searchProduct.setOriginPrice(this.originPrice);
      searchProduct.setOrgPriceType(this.orgPriceType);
      searchProduct.setMinPrice(this.minPrice);
      searchProduct.setMaxPrice(this.maxPrice);
      searchProduct.setLinkcodes(this.linkcodes);
      searchProduct.setLeafComponentIds(this.leafComponentIds);
      searchProduct.setLatLng(this.latLng);
      searchProduct.setItemsCount(this.itemsCount);
      searchProduct.setItemProductId(this.itemProductId);
      searchProduct.setItemId(this.itemId);
      searchProduct.setIsWinnerItemProduct(this.isWinnerItemProduct);
      searchProduct.setIsTemporarilySoldOut(this.isTemporarilySoldOut);
      searchProduct.setIsSoldOut(this.isSoldOut);
      searchProduct.setIsDirectUse(this.isDirectUse);
      searchProduct.setIsAdult(this.isAdult);
      searchProduct.setInternalCategoryIds(this.internalCategoryIds);
      searchProduct.setInternalCategoryCodes(this.internalCategoryCodes);
      searchProduct.setImageSquare(this.imageSquare);
      searchProduct.setImagePanorama(this.imagePanorama);
      searchProduct.setImageMainPath(this.imageMainPath);
      searchProduct.setImage(this.image);
      searchProduct.setFirstAttrTypeName(this.firstAttrTypeName);
      searchProduct.setEndTime(this.endTime);
      searchProduct.setDeliveryChargeType(this.deliveryChargeType);
      searchProduct.setComponentIds(this.componentIds);
      searchProduct.setBrand(this.brand);
      searchProduct.setAlternativeTitle(this.alternativeTitle);
      return searchProduct;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SearchProductBuilder {\n");
      
      sb.append("    winnerVendorItemId: ").append(toIndentedString(winnerVendorItemId)).append("\n");
      sb.append("    winnerVendorItemCount: ").append(toIndentedString(winnerVendorItemCount)).append("\n");
      sb.append("    winnerVendorId: ").append(toIndentedString(winnerVendorId)).append("\n");
      sb.append("    vendorIds: ").append(toIndentedString(vendorIds)).append("\n");
      sb.append("    unitPriceInfo: ").append(toIndentedString(unitPriceInfo)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    subscribeVendorItemId: ").append(toIndentedString(subscribeVendorItemId)).append("\n");
      sb.append("    subscribePrice: ").append(toIndentedString(subscribePrice)).append("\n");
      sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
      sb.append("    subscribeDelivery: ").append(toIndentedString(subscribeDelivery)).append("\n");
      sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
      sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
      sb.append("    sectionContent: ").append(toIndentedString(sectionContent)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    salesCount: ").append(toIndentedString(salesCount)).append("\n");
      sb.append("    rocketDelivery: ").append(toIndentedString(rocketDelivery)).append("\n");
      sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
      sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
      sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
      sb.append("    originPrice: ").append(toIndentedString(originPrice)).append("\n");
      sb.append("    orgPriceType: ").append(toIndentedString(orgPriceType)).append("\n");
      sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
      sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
      sb.append("    linkcodes: ").append(toIndentedString(linkcodes)).append("\n");
      sb.append("    leafComponentIds: ").append(toIndentedString(leafComponentIds)).append("\n");
      sb.append("    latLng: ").append(toIndentedString(latLng)).append("\n");
      sb.append("    itemsCount: ").append(toIndentedString(itemsCount)).append("\n");
      sb.append("    itemProductId: ").append(toIndentedString(itemProductId)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    isWinnerItemProduct: ").append(toIndentedString(isWinnerItemProduct)).append("\n");
      sb.append("    isTemporarilySoldOut: ").append(toIndentedString(isTemporarilySoldOut)).append("\n");
      sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
      sb.append("    isDirectUse: ").append(toIndentedString(isDirectUse)).append("\n");
      sb.append("    isAdult: ").append(toIndentedString(isAdult)).append("\n");
      sb.append("    internalCategoryIds: ").append(toIndentedString(internalCategoryIds)).append("\n");
      sb.append("    internalCategoryCodes: ").append(toIndentedString(internalCategoryCodes)).append("\n");
      sb.append("    imageSquare: ").append(toIndentedString(imageSquare)).append("\n");
      sb.append("    imagePanorama: ").append(toIndentedString(imagePanorama)).append("\n");
      sb.append("    imageMainPath: ").append(toIndentedString(imageMainPath)).append("\n");
      sb.append("    image: ").append(toIndentedString(image)).append("\n");
      sb.append("    firstAttrTypeName: ").append(toIndentedString(firstAttrTypeName)).append("\n");
      sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
      sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
      sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
      sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
      sb.append("    alternativeTitle: ").append(toIndentedString(alternativeTitle)).append("\n");
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

