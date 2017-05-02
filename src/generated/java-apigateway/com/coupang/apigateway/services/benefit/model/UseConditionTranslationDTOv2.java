package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class UseConditionTranslationDTOv2   {
  
  private List<String> vendorItemPackageIds = new ArrayList<String>();
  private List<String> vendorItemIds = new ArrayList<String>();
  private List<String> vendorIds = new ArrayList<String>();
  private List<String> productIds = new ArrayList<String>();


  public enum PlatformsEnum {
    WEB("WEB"),
    MOBILE_WEB("MOBILE_WEB"),
    ANDROID("ANDROID"),
    IOS("IOS"),
    ANY("ANY");

    private String value;

    PlatformsEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<PlatformsEnum> platforms = new ArrayList<PlatformsEnum>();


  public enum OrderChannelsEnum {
    CART("CART"),
    MAPLE("MAPLE");

    private String value;

    OrderChannelsEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<OrderChannelsEnum> orderChannels = new ArrayList<OrderChannelsEnum>();
  private Long minItemQuantity = null;
  private Long minDealPrice = null;
  private Long maxPerPublish = null;
  private Long maxPerPerson = null;
  private Long maxPerDaily = null;


  public enum IncludeRoleCodeEnum {
    CURATION("CURATION"),
    MARKET_PLACE("MARKET_PLACE"),
    RETAIL("RETAIL");

    private String value;

    IncludeRoleCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<IncludeRoleCodeEnum> includeRoleCode = new ArrayList<IncludeRoleCodeEnum>();
  private Map<String, String> includeCategories = new HashMap<String, String>();


  public enum ExcludeRoleCodeEnum {
    CURATION("CURATION"),
    MARKET_PLACE("MARKET_PLACE"),
    RETAIL("RETAIL");

    private String value;

    ExcludeRoleCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ExcludeRoleCodeEnum> excludeRoleCode = new ArrayList<ExcludeRoleCodeEnum>();
  private Map<String, String> excludeCategories = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageIds")
  public List<String> getVendorItemPackageIds() {
    return vendorItemPackageIds;
  }
  
  /**
   **/
  public void setVendorItemPackageIds(List<String> vendorItemPackageIds) {
    this.vendorItemPackageIds = vendorItemPackageIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemIds")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemIds")
  public List<String> getVendorItemIds() {
    return vendorItemIds;
  }
  
  /**
   **/
  public void setVendorItemIds(List<String> vendorItemIds) {
    this.vendorItemIds = vendorItemIds;
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
  @org.codehaus.jackson.annotate.JsonProperty("productIds")
  @com.fasterxml.jackson.annotation.JsonProperty("productIds")
  public List<String> getProductIds() {
    return productIds;
  }
  
  /**
   **/
  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("platforms")
  @com.fasterxml.jackson.annotation.JsonProperty("platforms")
  public List<PlatformsEnum> getPlatforms() {
    return platforms;
  }
  
  /**
   **/
  public void setPlatforms(List<PlatformsEnum> platforms) {
    this.platforms = platforms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderChannels")
  @com.fasterxml.jackson.annotation.JsonProperty("orderChannels")
  public List<OrderChannelsEnum> getOrderChannels() {
    return orderChannels;
  }
  
  /**
   **/
  public void setOrderChannels(List<OrderChannelsEnum> orderChannels) {
    this.orderChannels = orderChannels;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minItemQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("minItemQuantity")
  public Long getMinItemQuantity() {
    return minItemQuantity;
  }
  
  /**
   **/
  public void setMinItemQuantity(Long minItemQuantity) {
    this.minItemQuantity = minItemQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minDealPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("minDealPrice")
  public Long getMinDealPrice() {
    return minDealPrice;
  }
  
  /**
   **/
  public void setMinDealPrice(Long minDealPrice) {
    this.minDealPrice = minDealPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerPublish")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerPublish")
  public Long getMaxPerPublish() {
    return maxPerPublish;
  }
  
  /**
   **/
  public void setMaxPerPublish(Long maxPerPublish) {
    this.maxPerPublish = maxPerPublish;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerPerson")
  public Long getMaxPerPerson() {
    return maxPerPerson;
  }
  
  /**
   **/
  public void setMaxPerPerson(Long maxPerPerson) {
    this.maxPerPerson = maxPerPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerDaily")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerDaily")
  public Long getMaxPerDaily() {
    return maxPerDaily;
  }
  
  /**
   **/
  public void setMaxPerDaily(Long maxPerDaily) {
    this.maxPerDaily = maxPerDaily;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("includeRoleCode")
  @com.fasterxml.jackson.annotation.JsonProperty("includeRoleCode")
  public List<IncludeRoleCodeEnum> getIncludeRoleCode() {
    return includeRoleCode;
  }
  
  /**
   **/
  public void setIncludeRoleCode(List<IncludeRoleCodeEnum> includeRoleCode) {
    this.includeRoleCode = includeRoleCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("includeCategories")
  @com.fasterxml.jackson.annotation.JsonProperty("includeCategories")
  public Map<String, String> getIncludeCategories() {
    return includeCategories;
  }
  
  /**
   **/
  public void setIncludeCategories(Map<String, String> includeCategories) {
    this.includeCategories = includeCategories;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("excludeRoleCode")
  @com.fasterxml.jackson.annotation.JsonProperty("excludeRoleCode")
  public List<ExcludeRoleCodeEnum> getExcludeRoleCode() {
    return excludeRoleCode;
  }
  
  /**
   **/
  public void setExcludeRoleCode(List<ExcludeRoleCodeEnum> excludeRoleCode) {
    this.excludeRoleCode = excludeRoleCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("excludeCategories")
  @com.fasterxml.jackson.annotation.JsonProperty("excludeCategories")
  public Map<String, String> getExcludeCategories() {
    return excludeCategories;
  }
  
  /**
   **/
  public void setExcludeCategories(Map<String, String> excludeCategories) {
    this.excludeCategories = excludeCategories;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseConditionTranslationDTOv2 useConditionTranslationDTOv2 = (UseConditionTranslationDTOv2) o;
    return Objects.equals(this.vendorItemPackageIds, useConditionTranslationDTOv2.vendorItemPackageIds) &&
        Objects.equals(this.vendorItemIds, useConditionTranslationDTOv2.vendorItemIds) &&
        Objects.equals(this.vendorIds, useConditionTranslationDTOv2.vendorIds) &&
        Objects.equals(this.productIds, useConditionTranslationDTOv2.productIds) &&
        Objects.equals(this.platforms, useConditionTranslationDTOv2.platforms) &&
        Objects.equals(this.orderChannels, useConditionTranslationDTOv2.orderChannels) &&
        Objects.equals(this.minItemQuantity, useConditionTranslationDTOv2.minItemQuantity) &&
        Objects.equals(this.minDealPrice, useConditionTranslationDTOv2.minDealPrice) &&
        Objects.equals(this.maxPerPublish, useConditionTranslationDTOv2.maxPerPublish) &&
        Objects.equals(this.maxPerPerson, useConditionTranslationDTOv2.maxPerPerson) &&
        Objects.equals(this.maxPerDaily, useConditionTranslationDTOv2.maxPerDaily) &&
        Objects.equals(this.includeRoleCode, useConditionTranslationDTOv2.includeRoleCode) &&
        Objects.equals(this.includeCategories, useConditionTranslationDTOv2.includeCategories) &&
        Objects.equals(this.excludeRoleCode, useConditionTranslationDTOv2.excludeRoleCode) &&
        Objects.equals(this.excludeCategories, useConditionTranslationDTOv2.excludeCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageIds, vendorItemIds, vendorIds, productIds, platforms, orderChannels, minItemQuantity, minDealPrice, maxPerPublish, maxPerPerson, maxPerDaily, includeRoleCode, includeCategories, excludeRoleCode, excludeCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseConditionTranslationDTOv2 {\n");
    
    sb.append("    vendorItemPackageIds: ").append(toIndentedString(vendorItemPackageIds)).append("\n");
    sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
    sb.append("    vendorIds: ").append(toIndentedString(vendorIds)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    orderChannels: ").append(toIndentedString(orderChannels)).append("\n");
    sb.append("    minItemQuantity: ").append(toIndentedString(minItemQuantity)).append("\n");
    sb.append("    minDealPrice: ").append(toIndentedString(minDealPrice)).append("\n");
    sb.append("    maxPerPublish: ").append(toIndentedString(maxPerPublish)).append("\n");
    sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
    sb.append("    maxPerDaily: ").append(toIndentedString(maxPerDaily)).append("\n");
    sb.append("    includeRoleCode: ").append(toIndentedString(includeRoleCode)).append("\n");
    sb.append("    includeCategories: ").append(toIndentedString(includeCategories)).append("\n");
    sb.append("    excludeRoleCode: ").append(toIndentedString(excludeRoleCode)).append("\n");
    sb.append("    excludeCategories: ").append(toIndentedString(excludeCategories)).append("\n");
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

  public static UseConditionTranslationDTOv2Builder builder() {
    return new UseConditionTranslationDTOv2Builder();
  }

  public static class UseConditionTranslationDTOv2Builder {

    private List<String> vendorItemPackageIds = new ArrayList<String>();
    private List<String> vendorItemIds = new ArrayList<String>();
    private List<String> vendorIds = new ArrayList<String>();
    private List<String> productIds = new ArrayList<String>();
    private List<PlatformsEnum> platforms = new ArrayList<PlatformsEnum>();
    private List<OrderChannelsEnum> orderChannels = new ArrayList<OrderChannelsEnum>();
    private Long minItemQuantity = null;
    private Long minDealPrice = null;
    private Long maxPerPublish = null;
    private Long maxPerPerson = null;
    private Long maxPerDaily = null;
    private List<IncludeRoleCodeEnum> includeRoleCode = new ArrayList<IncludeRoleCodeEnum>();
    private Map<String, String> includeCategories = new HashMap<String, String>();
    private List<ExcludeRoleCodeEnum> excludeRoleCode = new ArrayList<ExcludeRoleCodeEnum>();
    private Map<String, String> excludeCategories = new HashMap<String, String>();
    

    UseConditionTranslationDTOv2Builder() {
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder vendorItemPackageIds(List<String> vendorItemPackageIds) {
      this.vendorItemPackageIds = vendorItemPackageIds;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder vendorItemIds(List<String> vendorItemIds) {
      this.vendorItemIds = vendorItemIds;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder vendorIds(List<String> vendorIds) {
      this.vendorIds = vendorIds;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder platforms(List<PlatformsEnum> platforms) {
      this.platforms = platforms;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder orderChannels(List<OrderChannelsEnum> orderChannels) {
      this.orderChannels = orderChannels;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder minItemQuantity(Long minItemQuantity) {
      this.minItemQuantity = minItemQuantity;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder minDealPrice(Long minDealPrice) {
      this.minDealPrice = minDealPrice;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder maxPerPublish(Long maxPerPublish) {
      this.maxPerPublish = maxPerPublish;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder maxPerPerson(Long maxPerPerson) {
      this.maxPerPerson = maxPerPerson;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder maxPerDaily(Long maxPerDaily) {
      this.maxPerDaily = maxPerDaily;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder includeRoleCode(List<IncludeRoleCodeEnum> includeRoleCode) {
      this.includeRoleCode = includeRoleCode;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder includeCategories(Map<String, String> includeCategories) {
      this.includeCategories = includeCategories;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder excludeRoleCode(List<ExcludeRoleCodeEnum> excludeRoleCode) {
      this.excludeRoleCode = excludeRoleCode;
      return this;
    }

    /**
     **/
    public UseConditionTranslationDTOv2Builder excludeCategories(Map<String, String> excludeCategories) {
      this.excludeCategories = excludeCategories;
      return this;
    }


    public UseConditionTranslationDTOv2 build() {
      UseConditionTranslationDTOv2 useConditionTranslationDTOv2 = new UseConditionTranslationDTOv2();
      useConditionTranslationDTOv2.setVendorItemPackageIds(this.vendorItemPackageIds);
      useConditionTranslationDTOv2.setVendorItemIds(this.vendorItemIds);
      useConditionTranslationDTOv2.setVendorIds(this.vendorIds);
      useConditionTranslationDTOv2.setProductIds(this.productIds);
      useConditionTranslationDTOv2.setPlatforms(this.platforms);
      useConditionTranslationDTOv2.setOrderChannels(this.orderChannels);
      useConditionTranslationDTOv2.setMinItemQuantity(this.minItemQuantity);
      useConditionTranslationDTOv2.setMinDealPrice(this.minDealPrice);
      useConditionTranslationDTOv2.setMaxPerPublish(this.maxPerPublish);
      useConditionTranslationDTOv2.setMaxPerPerson(this.maxPerPerson);
      useConditionTranslationDTOv2.setMaxPerDaily(this.maxPerDaily);
      useConditionTranslationDTOv2.setIncludeRoleCode(this.includeRoleCode);
      useConditionTranslationDTOv2.setIncludeCategories(this.includeCategories);
      useConditionTranslationDTOv2.setExcludeRoleCode(this.excludeRoleCode);
      useConditionTranslationDTOv2.setExcludeCategories(this.excludeCategories);
      return useConditionTranslationDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UseConditionTranslationDTOv2Builder {\n");
      
      sb.append("    vendorItemPackageIds: ").append(toIndentedString(vendorItemPackageIds)).append("\n");
      sb.append("    vendorItemIds: ").append(toIndentedString(vendorItemIds)).append("\n");
      sb.append("    vendorIds: ").append(toIndentedString(vendorIds)).append("\n");
      sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
      sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
      sb.append("    orderChannels: ").append(toIndentedString(orderChannels)).append("\n");
      sb.append("    minItemQuantity: ").append(toIndentedString(minItemQuantity)).append("\n");
      sb.append("    minDealPrice: ").append(toIndentedString(minDealPrice)).append("\n");
      sb.append("    maxPerPublish: ").append(toIndentedString(maxPerPublish)).append("\n");
      sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
      sb.append("    maxPerDaily: ").append(toIndentedString(maxPerDaily)).append("\n");
      sb.append("    includeRoleCode: ").append(toIndentedString(includeRoleCode)).append("\n");
      sb.append("    includeCategories: ").append(toIndentedString(includeCategories)).append("\n");
      sb.append("    excludeRoleCode: ").append(toIndentedString(excludeRoleCode)).append("\n");
      sb.append("    excludeCategories: ").append(toIndentedString(excludeCategories)).append("\n");
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

