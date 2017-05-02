package com.coupang.apigateway.services.shipment.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.890+09:00")
public class DeliveryDestinationDto   {
  
  private String zipCode = null;
  private Long shipmentBoxId = null;
  private String phone = null;
  private Long orderId = null;
  private String name = null;
  private String modifiedBy = null;
  private String mobile = null;
  private String message = null;
  private String locale = null;
  private Date createdAt = null;
  private String addressDetail = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipCode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  
  /**
   **/
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shipmentBoxId")
  @com.fasterxml.jackson.annotation.JsonProperty("shipmentBoxId")
  public Long getShipmentBoxId() {
    return shipmentBoxId;
  }
  
  /**
   **/
  public void setShipmentBoxId(Long shipmentBoxId) {
    this.shipmentBoxId = shipmentBoxId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phone")
  @com.fasterxml.jackson.annotation.JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  
  /**
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderId")
  @com.fasterxml.jackson.annotation.JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  
  /**
   **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
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
  @org.codehaus.jackson.annotate.JsonProperty("modifiedBy")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  
  /**
   **/
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobile")
  @com.fasterxml.jackson.annotation.JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }
  
  /**
   **/
  public void setMobile(String mobile) {
    this.mobile = mobile;
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
  @org.codehaus.jackson.annotate.JsonProperty("locale")
  @com.fasterxml.jackson.annotation.JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  
  /**
   **/
  public void setLocale(String locale) {
    this.locale = locale;
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
  @org.codehaus.jackson.annotate.JsonProperty("addressDetail")
  @com.fasterxml.jackson.annotation.JsonProperty("addressDetail")
  public String getAddressDetail() {
    return addressDetail;
  }
  
  /**
   **/
  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public String getAddress() {
    return address;
  }
  
  /**
   **/
  public void setAddress(String address) {
    this.address = address;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDestinationDto deliveryDestinationDto = (DeliveryDestinationDto) o;
    return Objects.equals(this.zipCode, deliveryDestinationDto.zipCode) &&
        Objects.equals(this.shipmentBoxId, deliveryDestinationDto.shipmentBoxId) &&
        Objects.equals(this.phone, deliveryDestinationDto.phone) &&
        Objects.equals(this.orderId, deliveryDestinationDto.orderId) &&
        Objects.equals(this.name, deliveryDestinationDto.name) &&
        Objects.equals(this.modifiedBy, deliveryDestinationDto.modifiedBy) &&
        Objects.equals(this.mobile, deliveryDestinationDto.mobile) &&
        Objects.equals(this.message, deliveryDestinationDto.message) &&
        Objects.equals(this.locale, deliveryDestinationDto.locale) &&
        Objects.equals(this.createdAt, deliveryDestinationDto.createdAt) &&
        Objects.equals(this.addressDetail, deliveryDestinationDto.addressDetail) &&
        Objects.equals(this.address, deliveryDestinationDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, shipmentBoxId, phone, orderId, name, modifiedBy, mobile, message, locale, createdAt, addressDetail, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDestinationDto {\n");
    
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    shipmentBoxId: ").append(toIndentedString(shipmentBoxId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    addressDetail: ").append(toIndentedString(addressDetail)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

  public static DeliveryDestinationDtoBuilder builder() {
    return new DeliveryDestinationDtoBuilder();
  }

  public static class DeliveryDestinationDtoBuilder {

    private String zipCode = null;
    private Long shipmentBoxId = null;
    private String phone = null;
    private Long orderId = null;
    private String name = null;
    private String modifiedBy = null;
    private String mobile = null;
    private String message = null;
    private String locale = null;
    private Date createdAt = null;
    private String addressDetail = null;
    private String address = null;
    

    DeliveryDestinationDtoBuilder() {
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder shipmentBoxId(Long shipmentBoxId) {
      this.shipmentBoxId = shipmentBoxId;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder orderId(Long orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder modifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder mobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder addressDetail(String addressDetail) {
      this.addressDetail = addressDetail;
      return this;
    }

    /**
     **/
    public DeliveryDestinationDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public DeliveryDestinationDto build() {
      DeliveryDestinationDto deliveryDestinationDto = new DeliveryDestinationDto();
      deliveryDestinationDto.setZipCode(this.zipCode);
      deliveryDestinationDto.setShipmentBoxId(this.shipmentBoxId);
      deliveryDestinationDto.setPhone(this.phone);
      deliveryDestinationDto.setOrderId(this.orderId);
      deliveryDestinationDto.setName(this.name);
      deliveryDestinationDto.setModifiedBy(this.modifiedBy);
      deliveryDestinationDto.setMobile(this.mobile);
      deliveryDestinationDto.setMessage(this.message);
      deliveryDestinationDto.setLocale(this.locale);
      deliveryDestinationDto.setCreatedAt(this.createdAt);
      deliveryDestinationDto.setAddressDetail(this.addressDetail);
      deliveryDestinationDto.setAddress(this.address);
      return deliveryDestinationDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryDestinationDtoBuilder {\n");
      
      sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
      sb.append("    shipmentBoxId: ").append(toIndentedString(shipmentBoxId)).append("\n");
      sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
      sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
      sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    addressDetail: ").append(toIndentedString(addressDetail)).append("\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

