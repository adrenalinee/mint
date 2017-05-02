package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemSubscribeDto   {
  
  private Long vendorItemId = null;
  private java.math.BigDecimal subscriptionDiscountRate = null;
  private Boolean subscribable = null;
  private String propertyValue = null;
  private List<Integer> deliveryPeriods = new ArrayList<Integer>();
  private String deliveryPeriodUnit = null;
  private Integer buyableQuantityPerPerson = null;
  private java.math.BigDecimal additionalSubscriptionDiscountRate = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("subscriptionDiscountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("subscriptionDiscountRate")
  public java.math.BigDecimal getSubscriptionDiscountRate() {
    return subscriptionDiscountRate;
  }
  
  /**
   **/
  public void setSubscriptionDiscountRate(java.math.BigDecimal subscriptionDiscountRate) {
    this.subscriptionDiscountRate = subscriptionDiscountRate;
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
  @org.codehaus.jackson.annotate.JsonProperty("propertyValue")
  @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
  public String getPropertyValue() {
    return propertyValue;
  }
  
  /**
   **/
  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
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
  @org.codehaus.jackson.annotate.JsonProperty("buyableQuantityPerPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("buyableQuantityPerPerson")
  public Integer getBuyableQuantityPerPerson() {
    return buyableQuantityPerPerson;
  }
  
  /**
   **/
  public void setBuyableQuantityPerPerson(Integer buyableQuantityPerPerson) {
    this.buyableQuantityPerPerson = buyableQuantityPerPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("additionalSubscriptionDiscountRate")
  @com.fasterxml.jackson.annotation.JsonProperty("additionalSubscriptionDiscountRate")
  public java.math.BigDecimal getAdditionalSubscriptionDiscountRate() {
    return additionalSubscriptionDiscountRate;
  }
  
  /**
   **/
  public void setAdditionalSubscriptionDiscountRate(java.math.BigDecimal additionalSubscriptionDiscountRate) {
    this.additionalSubscriptionDiscountRate = additionalSubscriptionDiscountRate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemSubscribeDto vendorItemSubscribeDto = (VendorItemSubscribeDto) o;
    return Objects.equals(this.vendorItemId, vendorItemSubscribeDto.vendorItemId) &&
        Objects.equals(this.subscriptionDiscountRate, vendorItemSubscribeDto.subscriptionDiscountRate) &&
        Objects.equals(this.subscribable, vendorItemSubscribeDto.subscribable) &&
        Objects.equals(this.propertyValue, vendorItemSubscribeDto.propertyValue) &&
        Objects.equals(this.deliveryPeriods, vendorItemSubscribeDto.deliveryPeriods) &&
        Objects.equals(this.deliveryPeriodUnit, vendorItemSubscribeDto.deliveryPeriodUnit) &&
        Objects.equals(this.buyableQuantityPerPerson, vendorItemSubscribeDto.buyableQuantityPerPerson) &&
        Objects.equals(this.additionalSubscriptionDiscountRate, vendorItemSubscribeDto.additionalSubscriptionDiscountRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, subscriptionDiscountRate, subscribable, propertyValue, deliveryPeriods, deliveryPeriodUnit, buyableQuantityPerPerson, additionalSubscriptionDiscountRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemSubscribeDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    subscriptionDiscountRate: ").append(toIndentedString(subscriptionDiscountRate)).append("\n");
    sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
    sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
    sb.append("    buyableQuantityPerPerson: ").append(toIndentedString(buyableQuantityPerPerson)).append("\n");
    sb.append("    additionalSubscriptionDiscountRate: ").append(toIndentedString(additionalSubscriptionDiscountRate)).append("\n");
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

  public static VendorItemSubscribeDtoBuilder builder() {
    return new VendorItemSubscribeDtoBuilder();
  }

  public static class VendorItemSubscribeDtoBuilder {

    private Long vendorItemId = null;
    private java.math.BigDecimal subscriptionDiscountRate = null;
    private Boolean subscribable = null;
    private String propertyValue = null;
    private List<Integer> deliveryPeriods = new ArrayList<Integer>();
    private String deliveryPeriodUnit = null;
    private Integer buyableQuantityPerPerson = null;
    private java.math.BigDecimal additionalSubscriptionDiscountRate = null;
    

    VendorItemSubscribeDtoBuilder() {
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder subscriptionDiscountRate(java.math.BigDecimal subscriptionDiscountRate) {
      this.subscriptionDiscountRate = subscriptionDiscountRate;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder subscribable(Boolean subscribable) {
      this.subscribable = subscribable;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder propertyValue(String propertyValue) {
      this.propertyValue = propertyValue;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder deliveryPeriods(List<Integer> deliveryPeriods) {
      this.deliveryPeriods = deliveryPeriods;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder deliveryPeriodUnit(String deliveryPeriodUnit) {
      this.deliveryPeriodUnit = deliveryPeriodUnit;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder buyableQuantityPerPerson(Integer buyableQuantityPerPerson) {
      this.buyableQuantityPerPerson = buyableQuantityPerPerson;
      return this;
    }

    /**
     **/
    public VendorItemSubscribeDtoBuilder additionalSubscriptionDiscountRate(java.math.BigDecimal additionalSubscriptionDiscountRate) {
      this.additionalSubscriptionDiscountRate = additionalSubscriptionDiscountRate;
      return this;
    }


    public VendorItemSubscribeDto build() {
      VendorItemSubscribeDto vendorItemSubscribeDto = new VendorItemSubscribeDto();
      vendorItemSubscribeDto.setVendorItemId(this.vendorItemId);
      vendorItemSubscribeDto.setSubscriptionDiscountRate(this.subscriptionDiscountRate);
      vendorItemSubscribeDto.setSubscribable(this.subscribable);
      vendorItemSubscribeDto.setPropertyValue(this.propertyValue);
      vendorItemSubscribeDto.setDeliveryPeriods(this.deliveryPeriods);
      vendorItemSubscribeDto.setDeliveryPeriodUnit(this.deliveryPeriodUnit);
      vendorItemSubscribeDto.setBuyableQuantityPerPerson(this.buyableQuantityPerPerson);
      vendorItemSubscribeDto.setAdditionalSubscriptionDiscountRate(this.additionalSubscriptionDiscountRate);
      return vendorItemSubscribeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemSubscribeDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    subscriptionDiscountRate: ").append(toIndentedString(subscriptionDiscountRate)).append("\n");
      sb.append("    subscribable: ").append(toIndentedString(subscribable)).append("\n");
      sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
      sb.append("    deliveryPeriods: ").append(toIndentedString(deliveryPeriods)).append("\n");
      sb.append("    deliveryPeriodUnit: ").append(toIndentedString(deliveryPeriodUnit)).append("\n");
      sb.append("    buyableQuantityPerPerson: ").append(toIndentedString(buyableQuantityPerPerson)).append("\n");
      sb.append("    additionalSubscriptionDiscountRate: ").append(toIndentedString(additionalSubscriptionDiscountRate)).append("\n");
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

