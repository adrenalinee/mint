package com.coupang.apigateway.services.wms_fulfillment.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
public class FulfillmentRangeQuantityPddItemDto   {
  
  private String standardPromiseDeliveryDate = null;
  private String sellerType = null;
  private Integer quantity = null;
  private String message = null;
  private Boolean isRemoteArea = null;
  private String deliverType = null;
  private String cutOffDate = null;
  private String carrier = null;
  private List<String> availableShippingSpeeds = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("standardPromiseDeliveryDate")
  @com.fasterxml.jackson.annotation.JsonProperty("standardPromiseDeliveryDate")
  public String getStandardPromiseDeliveryDate() {
    return standardPromiseDeliveryDate;
  }
  
  /**
   **/
  public void setStandardPromiseDeliveryDate(String standardPromiseDeliveryDate) {
    this.standardPromiseDeliveryDate = standardPromiseDeliveryDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sellerType")
  @com.fasterxml.jackson.annotation.JsonProperty("sellerType")
  public String getSellerType() {
    return sellerType;
  }
  
  /**
   **/
  public void setSellerType(String sellerType) {
    this.sellerType = sellerType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  
  /**
   **/
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isRemoteArea")
  @com.fasterxml.jackson.annotation.JsonProperty("isRemoteArea")
  public Boolean getIsRemoteArea() {
    return isRemoteArea;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsRemoteArea() {
    return isRemoteArea == null ? false : isRemoteArea;
  }
  
  /**
   **/
  public void setIsRemoteArea(Boolean isRemoteArea) {
    this.isRemoteArea = isRemoteArea;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliverType")
  @com.fasterxml.jackson.annotation.JsonProperty("deliverType")
  public String getDeliverType() {
    return deliverType;
  }
  
  /**
   **/
  public void setDeliverType(String deliverType) {
    this.deliverType = deliverType;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cutOffDate")
  @com.fasterxml.jackson.annotation.JsonProperty("cutOffDate")
  public String getCutOffDate() {
    return cutOffDate;
  }
  
  /**
   **/
  public void setCutOffDate(String cutOffDate) {
    this.cutOffDate = cutOffDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("carrier")
  @com.fasterxml.jackson.annotation.JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  
  /**
   **/
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("availableShippingSpeeds")
  @com.fasterxml.jackson.annotation.JsonProperty("availableShippingSpeeds")
  public List<String> getAvailableShippingSpeeds() {
    return availableShippingSpeeds;
  }
  
  /**
   **/
  public void setAvailableShippingSpeeds(List<String> availableShippingSpeeds) {
    this.availableShippingSpeeds = availableShippingSpeeds;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentRangeQuantityPddItemDto fulfillmentRangeQuantityPddItemDto = (FulfillmentRangeQuantityPddItemDto) o;
    return Objects.equals(this.standardPromiseDeliveryDate, fulfillmentRangeQuantityPddItemDto.standardPromiseDeliveryDate) &&
        Objects.equals(this.sellerType, fulfillmentRangeQuantityPddItemDto.sellerType) &&
        Objects.equals(this.quantity, fulfillmentRangeQuantityPddItemDto.quantity) &&
        Objects.equals(this.message, fulfillmentRangeQuantityPddItemDto.message) &&
        Objects.equals(this.isRemoteArea, fulfillmentRangeQuantityPddItemDto.isRemoteArea) &&
        Objects.equals(this.deliverType, fulfillmentRangeQuantityPddItemDto.deliverType) &&
        Objects.equals(this.cutOffDate, fulfillmentRangeQuantityPddItemDto.cutOffDate) &&
        Objects.equals(this.carrier, fulfillmentRangeQuantityPddItemDto.carrier) &&
        Objects.equals(this.availableShippingSpeeds, fulfillmentRangeQuantityPddItemDto.availableShippingSpeeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardPromiseDeliveryDate, sellerType, quantity, message, isRemoteArea, deliverType, cutOffDate, carrier, availableShippingSpeeds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentRangeQuantityPddItemDto {\n");
    
    sb.append("    standardPromiseDeliveryDate: ").append(toIndentedString(standardPromiseDeliveryDate)).append("\n");
    sb.append("    sellerType: ").append(toIndentedString(sellerType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isRemoteArea: ").append(toIndentedString(isRemoteArea)).append("\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
    sb.append("    cutOffDate: ").append(toIndentedString(cutOffDate)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    availableShippingSpeeds: ").append(toIndentedString(availableShippingSpeeds)).append("\n");
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

  public static FulfillmentRangeQuantityPddItemDtoBuilder builder() {
    return new FulfillmentRangeQuantityPddItemDtoBuilder();
  }

  public static class FulfillmentRangeQuantityPddItemDtoBuilder {

    private String standardPromiseDeliveryDate = null;
    private String sellerType = null;
    private Integer quantity = null;
    private String message = null;
    private Boolean isRemoteArea = null;
    private String deliverType = null;
    private String cutOffDate = null;
    private String carrier = null;
    private List<String> availableShippingSpeeds = new ArrayList<String>();
    

    FulfillmentRangeQuantityPddItemDtoBuilder() {
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder standardPromiseDeliveryDate(String standardPromiseDeliveryDate) {
      this.standardPromiseDeliveryDate = standardPromiseDeliveryDate;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder sellerType(String sellerType) {
      this.sellerType = sellerType;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder isRemoteArea(Boolean isRemoteArea) {
      this.isRemoteArea = isRemoteArea;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder deliverType(String deliverType) {
      this.deliverType = deliverType;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder cutOffDate(String cutOffDate) {
      this.cutOffDate = cutOffDate;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder carrier(String carrier) {
      this.carrier = carrier;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddItemDtoBuilder availableShippingSpeeds(List<String> availableShippingSpeeds) {
      this.availableShippingSpeeds = availableShippingSpeeds;
      return this;
    }


    public FulfillmentRangeQuantityPddItemDto build() {
      FulfillmentRangeQuantityPddItemDto fulfillmentRangeQuantityPddItemDto = new FulfillmentRangeQuantityPddItemDto();
      fulfillmentRangeQuantityPddItemDto.setStandardPromiseDeliveryDate(this.standardPromiseDeliveryDate);
      fulfillmentRangeQuantityPddItemDto.setSellerType(this.sellerType);
      fulfillmentRangeQuantityPddItemDto.setQuantity(this.quantity);
      fulfillmentRangeQuantityPddItemDto.setMessage(this.message);
      fulfillmentRangeQuantityPddItemDto.setIsRemoteArea(this.isRemoteArea);
      fulfillmentRangeQuantityPddItemDto.setDeliverType(this.deliverType);
      fulfillmentRangeQuantityPddItemDto.setCutOffDate(this.cutOffDate);
      fulfillmentRangeQuantityPddItemDto.setCarrier(this.carrier);
      fulfillmentRangeQuantityPddItemDto.setAvailableShippingSpeeds(this.availableShippingSpeeds);
      return fulfillmentRangeQuantityPddItemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FulfillmentRangeQuantityPddItemDtoBuilder {\n");
      
      sb.append("    standardPromiseDeliveryDate: ").append(toIndentedString(standardPromiseDeliveryDate)).append("\n");
      sb.append("    sellerType: ").append(toIndentedString(sellerType)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    isRemoteArea: ").append(toIndentedString(isRemoteArea)).append("\n");
      sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
      sb.append("    cutOffDate: ").append(toIndentedString(cutOffDate)).append("\n");
      sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
      sb.append("    availableShippingSpeeds: ").append(toIndentedString(availableShippingSpeeds)).append("\n");
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

