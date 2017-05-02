package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CultureDto   {
  
  private Date useStartDate = null;
  private Date useEndDate = null;


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
  private java.math.BigDecimal autoRefundRate = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("autoRefundRate")
  @com.fasterxml.jackson.annotation.JsonProperty("autoRefundRate")
  public java.math.BigDecimal getAutoRefundRate() {
    return autoRefundRate;
  }
  
  /**
   **/
  public void setAutoRefundRate(java.math.BigDecimal autoRefundRate) {
    this.autoRefundRate = autoRefundRate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CultureDto cultureDto = (CultureDto) o;
    return Objects.equals(this.useStartDate, cultureDto.useStartDate) &&
        Objects.equals(this.useEndDate, cultureDto.useEndDate) &&
        Objects.equals(this.couponUseType, cultureDto.couponUseType) &&
        Objects.equals(this.autoRefundRate, cultureDto.autoRefundRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useStartDate, useEndDate, couponUseType, autoRefundRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CultureDto {\n");
    
    sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
    sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
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

  public static CultureDtoBuilder builder() {
    return new CultureDtoBuilder();
  }

  public static class CultureDtoBuilder {

    private Date useStartDate = null;
    private Date useEndDate = null;
    private CouponUseTypeEnum couponUseType = null;
    private java.math.BigDecimal autoRefundRate = null;
    

    CultureDtoBuilder() {
    }

    /**
     **/
    public CultureDtoBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public CultureDtoBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public CultureDtoBuilder couponUseType(CouponUseTypeEnum couponUseType) {
      this.couponUseType = couponUseType;
      return this;
    }

    /**
     **/
    public CultureDtoBuilder autoRefundRate(java.math.BigDecimal autoRefundRate) {
      this.autoRefundRate = autoRefundRate;
      return this;
    }


    public CultureDto build() {
      CultureDto cultureDto = new CultureDto();
      cultureDto.setUseStartDate(this.useStartDate);
      cultureDto.setUseEndDate(this.useEndDate);
      cultureDto.setCouponUseType(this.couponUseType);
      cultureDto.setAutoRefundRate(this.autoRefundRate);
      return cultureDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CultureDtoBuilder {\n");
      
      sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
      sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
      sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
      sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
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

