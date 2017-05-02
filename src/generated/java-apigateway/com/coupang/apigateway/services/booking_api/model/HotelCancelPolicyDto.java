package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelCancelPolicyDto   {
  
  private String description = null;
  private Date deadDate = null;
  private String currency = null;
  private java.math.BigDecimal cancellationFee = null;
  private Boolean cancelable = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("deadDate")
  @com.fasterxml.jackson.annotation.JsonProperty("deadDate")
  public Date getDeadDate() {
    return deadDate;
  }
  
  /**
   **/
  public void setDeadDate(Date deadDate) {
    this.deadDate = deadDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currency")
  @com.fasterxml.jackson.annotation.JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  
  /**
   **/
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cancellationFee")
  @com.fasterxml.jackson.annotation.JsonProperty("cancellationFee")
  public java.math.BigDecimal getCancellationFee() {
    return cancellationFee;
  }
  
  /**
   **/
  public void setCancellationFee(java.math.BigDecimal cancellationFee) {
    this.cancellationFee = cancellationFee;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cancelable")
  @com.fasterxml.jackson.annotation.JsonProperty("cancelable")
  public Boolean getCancelable() {
    return cancelable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCancelable() {
    return cancelable == null ? false : cancelable;
  }
  
  /**
   **/
  public void setCancelable(Boolean cancelable) {
    this.cancelable = cancelable;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelCancelPolicyDto hotelCancelPolicyDto = (HotelCancelPolicyDto) o;
    return Objects.equals(this.description, hotelCancelPolicyDto.description) &&
        Objects.equals(this.deadDate, hotelCancelPolicyDto.deadDate) &&
        Objects.equals(this.currency, hotelCancelPolicyDto.currency) &&
        Objects.equals(this.cancellationFee, hotelCancelPolicyDto.cancellationFee) &&
        Objects.equals(this.cancelable, hotelCancelPolicyDto.cancelable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, deadDate, currency, cancellationFee, cancelable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCancelPolicyDto {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deadDate: ").append(toIndentedString(deadDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    cancelable: ").append(toIndentedString(cancelable)).append("\n");
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

  public static HotelCancelPolicyDtoBuilder builder() {
    return new HotelCancelPolicyDtoBuilder();
  }

  public static class HotelCancelPolicyDtoBuilder {

    private String description = null;
    private Date deadDate = null;
    private String currency = null;
    private java.math.BigDecimal cancellationFee = null;
    private Boolean cancelable = null;
    

    HotelCancelPolicyDtoBuilder() {
    }

    /**
     **/
    public HotelCancelPolicyDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public HotelCancelPolicyDtoBuilder deadDate(Date deadDate) {
      this.deadDate = deadDate;
      return this;
    }

    /**
     **/
    public HotelCancelPolicyDtoBuilder currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     **/
    public HotelCancelPolicyDtoBuilder cancellationFee(java.math.BigDecimal cancellationFee) {
      this.cancellationFee = cancellationFee;
      return this;
    }

    /**
     **/
    public HotelCancelPolicyDtoBuilder cancelable(Boolean cancelable) {
      this.cancelable = cancelable;
      return this;
    }


    public HotelCancelPolicyDto build() {
      HotelCancelPolicyDto hotelCancelPolicyDto = new HotelCancelPolicyDto();
      hotelCancelPolicyDto.setDescription(this.description);
      hotelCancelPolicyDto.setDeadDate(this.deadDate);
      hotelCancelPolicyDto.setCurrency(this.currency);
      hotelCancelPolicyDto.setCancellationFee(this.cancellationFee);
      hotelCancelPolicyDto.setCancelable(this.cancelable);
      return hotelCancelPolicyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelCancelPolicyDtoBuilder {\n");
      
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    deadDate: ").append(toIndentedString(deadDate)).append("\n");
      sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
      sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
      sb.append("    cancelable: ").append(toIndentedString(cancelable)).append("\n");
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

