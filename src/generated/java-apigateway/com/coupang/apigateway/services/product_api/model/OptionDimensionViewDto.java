package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class OptionDimensionViewDto   {
  
  private Boolean valid = null;
  private Integer subscriptionBuyableQuantity = null;
  private java.math.BigDecimal subscribeSalePrice = null;
  private java.math.BigDecimal subscribeDiscountRate = null;
  private Boolean subscribable = null;
  private Integer stockQuantity = null;
  private Boolean soldOut = null;


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
  private Long salesPrice = null;
  private Date saleStartedAt = null;
  private Date saleEndedAt = null;
  private Long productId = null;
  private String name = null;
  private List<Integer> deliveryPeriods = new ArrayList<Integer>();
  private String deliveryPeriodUnit = null;
  private Integer buyableQuantity = null;
  private Boolean almostSoldOut = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("subscriptionBuyableQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("subscriptionBuyableQuantity")
  public Integer getSubscriptionBuyableQuantity() {
    return subscriptionBuyableQuantity;
  }
  
  /**
   **/
  public void setSubscriptionBuyableQuantity(Integer subscriptionBuyableQuantity) {
    this.subscriptionBuyableQuantity = subscriptionBuyableQuantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("stockQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("stockQuantity")
  public Integer getStockQuantity() {
    return stockQuantity;
  }
  
  /**
   **/
  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
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
  @org.codehaus.jackson.annotate.JsonProperty("buyableQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("buyableQuantity")
  public Integer getBuyableQuantity() {
    return buyableQuantity;
  }
  
  /**
   **/
  public void setBuyableQuantity(Integer buyableQuantity) {
    this.buyableQuantity = buyableQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("almostSoldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("almostSoldOut")
  public Boolean getAlmostSoldOut() {
    return almostSoldOut;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAlmostSoldOut() {
    return almostSoldOut == null ? false : almostSoldOut;
  }
  
  /**
   **/
  public void setAlmostSoldOut(Boolean almostSoldOut) {
    this.almostSoldOut = almostSoldOut;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionDimensionViewDto optionDimensionViewDto = (OptionDimensionViewDto) o;
    return Objects.equals(this.valid, optionDimensionViewDto.valid) &&
        Objects.equals(this.subscriptionBuyableQuantity, optionDimensionViewDto.subscriptionBuyableQuantity) &&
        Objects.equals(this.subscribeSalePrice, optionDimensionViewDto.subscribeSalePrice) &&
        Objects.equals(this.subscribeDiscountRate, optionDimensionViewDto.subscribeDiscountRate) &&
        Objects.equals(this.subscribable, optionDimensionViewDto.subscribable) &&
        Objects.equals(this.stockQuantity, optionDimensionViewDto.stockQuantity) &&
        Objects.equals(this.soldOut, optionDimensionViewDto.soldOut) &&
        Objects.equals(this.sellingStatusType, optionDimensionViewDto.sellingStatusType) &&
        Objects.equals(this.salesPrice, optionDimensionViewDto.salesPrice) &&
        Objects.equals(this.saleStartedAt, optionDimensionViewDto.saleStartedAt) &&
        Objects.equals(this.saleEndedAt, optionDimensionViewDto.saleEndedAt) &&
        Objects.equals(this.productId, optionDimensionViewDto.productId) &&
        Objects.equals(this.name, optionDimensionViewDto.name) &&
        Objects.equals(this.deliveryPeriods, optionDimensionViewDto.deliveryPeriods) &&
        Objects.equals(this.deliveryPeriodUnit, optionDimensionViewDto.deliveryPeriodUnit) &&
        Objects.equals(this.buyableQuantity, optionDimensionViewDto.buyableQuantity) &&
        Objects.equals(this.almostSoldOut, optionDimensionViewDto.almostSoldOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, subscriptionBuyableQuantity, subscribeSalePrice, subscribeDiscountRate, subscribable, stockQuantity, soldOut, sellingStatusType, salesPrice, saleStartedAt, saleEndedAt, productId, name, deliveryPeriods, deliveryPeriodUnit, buyableQuantity, almostSoldOut);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionDimensionViewDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    subscriptionBuyableQuantity: ").append(toIndentedString(subscriptionBuyableQuantity)).append("\n");
    sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
    sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
    sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
    sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
    sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
    sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
    sb.append("    buyableQuantity: ").append(toIndentedString(buyableQuantity)).append("\n");
    sb.append("    almostSoldOut: ").append(toIndentedString(almostSoldOut)).append("\n");
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

  public static OptionDimensionViewDtoBuilder builder() {
    return new OptionDimensionViewDtoBuilder();
  }

  public static class OptionDimensionViewDtoBuilder {

    private Boolean valid = null;
    private Integer subscriptionBuyableQuantity = null;
    private java.math.BigDecimal subscribeSalePrice = null;
    private java.math.BigDecimal subscribeDiscountRate = null;
    private Boolean subscribable = null;
    private Integer stockQuantity = null;
    private Boolean soldOut = null;
    private SellingStatusTypeEnum sellingStatusType = null;
    private Long salesPrice = null;
    private Date saleStartedAt = null;
    private Date saleEndedAt = null;
    private Long productId = null;
    private String name = null;
    private List<Integer> deliveryPeriods = new ArrayList<Integer>();
    private String deliveryPeriodUnit = null;
    private Integer buyableQuantity = null;
    private Boolean almostSoldOut = null;
    

    OptionDimensionViewDtoBuilder() {
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder subscriptionBuyableQuantity(Integer subscriptionBuyableQuantity) {
      this.subscriptionBuyableQuantity = subscriptionBuyableQuantity;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder subscribeSalePrice(java.math.BigDecimal subscribeSalePrice) {
      this.subscribeSalePrice = subscribeSalePrice;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder subscribeDiscountRate(java.math.BigDecimal subscribeDiscountRate) {
      this.subscribeDiscountRate = subscribeDiscountRate;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder subscribable(Boolean subscribable) {
      this.subscribable = subscribable;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder stockQuantity(Integer stockQuantity) {
      this.stockQuantity = stockQuantity;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder sellingStatusType(SellingStatusTypeEnum sellingStatusType) {
      this.sellingStatusType = sellingStatusType;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder salesPrice(Long salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder saleStartedAt(Date saleStartedAt) {
      this.saleStartedAt = saleStartedAt;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder saleEndedAt(Date saleEndedAt) {
      this.saleEndedAt = saleEndedAt;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder deliveryPeriods(List<Integer> deliveryPeriods) {
      this.deliveryPeriods = deliveryPeriods;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder deliveryPeriodUnit(String deliveryPeriodUnit) {
      this.deliveryPeriodUnit = deliveryPeriodUnit;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder buyableQuantity(Integer buyableQuantity) {
      this.buyableQuantity = buyableQuantity;
      return this;
    }

    /**
     **/
    public OptionDimensionViewDtoBuilder almostSoldOut(Boolean almostSoldOut) {
      this.almostSoldOut = almostSoldOut;
      return this;
    }


    public OptionDimensionViewDto build() {
      OptionDimensionViewDto optionDimensionViewDto = new OptionDimensionViewDto();
      optionDimensionViewDto.setValid(this.valid);
      optionDimensionViewDto.setSubscriptionBuyableQuantity(this.subscriptionBuyableQuantity);
      optionDimensionViewDto.setSubscribeSalePrice(this.subscribeSalePrice);
      optionDimensionViewDto.setSubscribeDiscountRate(this.subscribeDiscountRate);
      optionDimensionViewDto.setSubscribable(this.subscribable);
      optionDimensionViewDto.setStockQuantity(this.stockQuantity);
      optionDimensionViewDto.setSoldOut(this.soldOut);
      optionDimensionViewDto.setSellingStatusType(this.sellingStatusType);
      optionDimensionViewDto.setSalesPrice(this.salesPrice);
      optionDimensionViewDto.setSaleStartedAt(this.saleStartedAt);
      optionDimensionViewDto.setSaleEndedAt(this.saleEndedAt);
      optionDimensionViewDto.setProductId(this.productId);
      optionDimensionViewDto.setName(this.name);
      optionDimensionViewDto.setDeliveryPeriods(this.deliveryPeriods);
      optionDimensionViewDto.setDeliveryPeriodUnit(this.deliveryPeriodUnit);
      optionDimensionViewDto.setBuyableQuantity(this.buyableQuantity);
      optionDimensionViewDto.setAlmostSoldOut(this.almostSoldOut);
      return optionDimensionViewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OptionDimensionViewDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    subscriptionBuyableQuantity: ").append(toIndentedString(subscriptionBuyableQuantity)).append("\n");
      sb.append("    subscribeSalePrice: ").append(toIndentedString(subscribeSalePrice)).append("\n");
      sb.append("    subscribeDiscountRate: ").append(toIndentedString(subscribeDiscountRate)).append("\n");
      sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
      sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
      sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
      sb.append("    sellingStatusType: ").append(toIndentedString(sellingStatusType)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    saleStartedAt: ").append(toIndentedString(saleStartedAt)).append("\n");
      sb.append("    saleEndedAt: ").append(toIndentedString(saleEndedAt)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
      sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
      sb.append("    buyableQuantity: ").append(toIndentedString(buyableQuantity)).append("\n");
      sb.append("    almostSoldOut: ").append(toIndentedString(almostSoldOut)).append("\n");
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

