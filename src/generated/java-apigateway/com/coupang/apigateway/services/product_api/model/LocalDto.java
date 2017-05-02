package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class LocalDto   {
  
  private String useVendorId = null;
  private String useType = null;
  private Date useStartDate = null;
  private Date useEndDate = null;
  private Boolean useDateShowedInSms = null;
  private Boolean useBarcode = null;
  private Boolean useAlternativeMessage = null;
  private Long usableVolume = null;
  private String paymentVendorId = null;
  private String outOptCode = null;


  public enum OutCouponUsedTypeEnum {
    OUT_COUPON_USE_Y("OUT_COUPON_USE_Y"),
    OUT_COUPON_USE_A("OUT_COUPON_USE_A"),
    OUT_COUPON_USE_N("OUT_COUPON_USE_N");

    private String value;

    OutCouponUsedTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private OutCouponUsedTypeEnum outCouponUsedType = null;
  private String outCouponUseType = null;
  private String noticeMessageInMms = null;
  private Long locationId = null;
  private Boolean isToBeDelivered = null;
  private Boolean hasExternalLink = null;
  private String externalLinkUrl = null;
  private Boolean externalCoupon = null;


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
  private String cancelFrontExpType = null;
  private String btnReSmsShow = null;
  private String btnPrintShow = null;
  private java.math.BigDecimal autoRefundRate = null;
  private String alternativeMessage = null;
  private String airlineOrderType = null;
  private Boolean advertisedTour = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useVendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("useVendorId")
  public String getUseVendorId() {
    return useVendorId;
  }
  
  /**
   **/
  public void setUseVendorId(String useVendorId) {
    this.useVendorId = useVendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useType")
  @com.fasterxml.jackson.annotation.JsonProperty("useType")
  public String getUseType() {
    return useType;
  }
  
  /**
   **/
  public void setUseType(String useType) {
    this.useType = useType;
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
  @org.codehaus.jackson.annotate.JsonProperty("useDateShowedInSms")
  @com.fasterxml.jackson.annotation.JsonProperty("useDateShowedInSms")
  public Boolean getUseDateShowedInSms() {
    return useDateShowedInSms;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUseDateShowedInSms() {
    return useDateShowedInSms == null ? false : useDateShowedInSms;
  }
  
  /**
   **/
  public void setUseDateShowedInSms(Boolean useDateShowedInSms) {
    this.useDateShowedInSms = useDateShowedInSms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useBarcode")
  @com.fasterxml.jackson.annotation.JsonProperty("useBarcode")
  public Boolean getUseBarcode() {
    return useBarcode;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUseBarcode() {
    return useBarcode == null ? false : useBarcode;
  }
  
  /**
   **/
  public void setUseBarcode(Boolean useBarcode) {
    this.useBarcode = useBarcode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useAlternativeMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("useAlternativeMessage")
  public Boolean getUseAlternativeMessage() {
    return useAlternativeMessage;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUseAlternativeMessage() {
    return useAlternativeMessage == null ? false : useAlternativeMessage;
  }
  
  /**
   **/
  public void setUseAlternativeMessage(Boolean useAlternativeMessage) {
    this.useAlternativeMessage = useAlternativeMessage;
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
  @org.codehaus.jackson.annotate.JsonProperty("paymentVendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("paymentVendorId")
  public String getPaymentVendorId() {
    return paymentVendorId;
  }
  
  /**
   **/
  public void setPaymentVendorId(String paymentVendorId) {
    this.paymentVendorId = paymentVendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("outOptCode")
  @com.fasterxml.jackson.annotation.JsonProperty("outOptCode")
  public String getOutOptCode() {
    return outOptCode;
  }
  
  /**
   **/
  public void setOutOptCode(String outOptCode) {
    this.outOptCode = outOptCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("outCouponUsedType")
  @com.fasterxml.jackson.annotation.JsonProperty("outCouponUsedType")
  public OutCouponUsedTypeEnum getOutCouponUsedType() {
    return outCouponUsedType;
  }
  
  /**
   **/
  public void setOutCouponUsedType(OutCouponUsedTypeEnum outCouponUsedType) {
    this.outCouponUsedType = outCouponUsedType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("outCouponUseType")
  @com.fasterxml.jackson.annotation.JsonProperty("outCouponUseType")
  public String getOutCouponUseType() {
    return outCouponUseType;
  }
  
  /**
   **/
  public void setOutCouponUseType(String outCouponUseType) {
    this.outCouponUseType = outCouponUseType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noticeMessageInMms")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeMessageInMms")
  public String getNoticeMessageInMms() {
    return noticeMessageInMms;
  }
  
  /**
   **/
  public void setNoticeMessageInMms(String noticeMessageInMms) {
    this.noticeMessageInMms = noticeMessageInMms;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locationId")
  @com.fasterxml.jackson.annotation.JsonProperty("locationId")
  public Long getLocationId() {
    return locationId;
  }
  
  /**
   **/
  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isToBeDelivered")
  @com.fasterxml.jackson.annotation.JsonProperty("isToBeDelivered")
  public Boolean getIsToBeDelivered() {
    return isToBeDelivered;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsToBeDelivered() {
    return isToBeDelivered == null ? false : isToBeDelivered;
  }
  
  /**
   **/
  public void setIsToBeDelivered(Boolean isToBeDelivered) {
    this.isToBeDelivered = isToBeDelivered;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hasExternalLink")
  @com.fasterxml.jackson.annotation.JsonProperty("hasExternalLink")
  public Boolean getHasExternalLink() {
    return hasExternalLink;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHasExternalLink() {
    return hasExternalLink == null ? false : hasExternalLink;
  }
  
  /**
   **/
  public void setHasExternalLink(Boolean hasExternalLink) {
    this.hasExternalLink = hasExternalLink;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("externalLinkUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("externalLinkUrl")
  public String getExternalLinkUrl() {
    return externalLinkUrl;
  }
  
  /**
   **/
  public void setExternalLinkUrl(String externalLinkUrl) {
    this.externalLinkUrl = externalLinkUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("externalCoupon")
  @com.fasterxml.jackson.annotation.JsonProperty("externalCoupon")
  public Boolean getExternalCoupon() {
    return externalCoupon;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExternalCoupon() {
    return externalCoupon == null ? false : externalCoupon;
  }
  
  /**
   **/
  public void setExternalCoupon(Boolean externalCoupon) {
    this.externalCoupon = externalCoupon;
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
  @org.codehaus.jackson.annotate.JsonProperty("cancelFrontExpType")
  @com.fasterxml.jackson.annotation.JsonProperty("cancelFrontExpType")
  public String getCancelFrontExpType() {
    return cancelFrontExpType;
  }
  
  /**
   **/
  public void setCancelFrontExpType(String cancelFrontExpType) {
    this.cancelFrontExpType = cancelFrontExpType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("btnReSmsShow")
  @com.fasterxml.jackson.annotation.JsonProperty("btnReSmsShow")
  public String getBtnReSmsShow() {
    return btnReSmsShow;
  }
  
  /**
   **/
  public void setBtnReSmsShow(String btnReSmsShow) {
    this.btnReSmsShow = btnReSmsShow;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("btnPrintShow")
  @com.fasterxml.jackson.annotation.JsonProperty("btnPrintShow")
  public String getBtnPrintShow() {
    return btnPrintShow;
  }
  
  /**
   **/
  public void setBtnPrintShow(String btnPrintShow) {
    this.btnPrintShow = btnPrintShow;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("alternativeMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("alternativeMessage")
  public String getAlternativeMessage() {
    return alternativeMessage;
  }
  
  /**
   **/
  public void setAlternativeMessage(String alternativeMessage) {
    this.alternativeMessage = alternativeMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("airlineOrderType")
  @com.fasterxml.jackson.annotation.JsonProperty("airlineOrderType")
  public String getAirlineOrderType() {
    return airlineOrderType;
  }
  
  /**
   **/
  public void setAirlineOrderType(String airlineOrderType) {
    this.airlineOrderType = airlineOrderType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("advertisedTour")
  @com.fasterxml.jackson.annotation.JsonProperty("advertisedTour")
  public Boolean getAdvertisedTour() {
    return advertisedTour;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdvertisedTour() {
    return advertisedTour == null ? false : advertisedTour;
  }
  
  /**
   **/
  public void setAdvertisedTour(Boolean advertisedTour) {
    this.advertisedTour = advertisedTour;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalDto localDto = (LocalDto) o;
    return Objects.equals(this.useVendorId, localDto.useVendorId) &&
        Objects.equals(this.useType, localDto.useType) &&
        Objects.equals(this.useStartDate, localDto.useStartDate) &&
        Objects.equals(this.useEndDate, localDto.useEndDate) &&
        Objects.equals(this.useDateShowedInSms, localDto.useDateShowedInSms) &&
        Objects.equals(this.useBarcode, localDto.useBarcode) &&
        Objects.equals(this.useAlternativeMessage, localDto.useAlternativeMessage) &&
        Objects.equals(this.usableVolume, localDto.usableVolume) &&
        Objects.equals(this.paymentVendorId, localDto.paymentVendorId) &&
        Objects.equals(this.outOptCode, localDto.outOptCode) &&
        Objects.equals(this.outCouponUsedType, localDto.outCouponUsedType) &&
        Objects.equals(this.outCouponUseType, localDto.outCouponUseType) &&
        Objects.equals(this.noticeMessageInMms, localDto.noticeMessageInMms) &&
        Objects.equals(this.locationId, localDto.locationId) &&
        Objects.equals(this.isToBeDelivered, localDto.isToBeDelivered) &&
        Objects.equals(this.hasExternalLink, localDto.hasExternalLink) &&
        Objects.equals(this.externalLinkUrl, localDto.externalLinkUrl) &&
        Objects.equals(this.externalCoupon, localDto.externalCoupon) &&
        Objects.equals(this.couponUseType, localDto.couponUseType) &&
        Objects.equals(this.cancelFrontExpType, localDto.cancelFrontExpType) &&
        Objects.equals(this.btnReSmsShow, localDto.btnReSmsShow) &&
        Objects.equals(this.btnPrintShow, localDto.btnPrintShow) &&
        Objects.equals(this.autoRefundRate, localDto.autoRefundRate) &&
        Objects.equals(this.alternativeMessage, localDto.alternativeMessage) &&
        Objects.equals(this.airlineOrderType, localDto.airlineOrderType) &&
        Objects.equals(this.advertisedTour, localDto.advertisedTour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useVendorId, useType, useStartDate, useEndDate, useDateShowedInSms, useBarcode, useAlternativeMessage, usableVolume, paymentVendorId, outOptCode, outCouponUsedType, outCouponUseType, noticeMessageInMms, locationId, isToBeDelivered, hasExternalLink, externalLinkUrl, externalCoupon, couponUseType, cancelFrontExpType, btnReSmsShow, btnPrintShow, autoRefundRate, alternativeMessage, airlineOrderType, advertisedTour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalDto {\n");
    
    sb.append("    useVendorId: ").append(toIndentedString(useVendorId)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
    sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
    sb.append("    useDateShowedInSms: ").append(toIndentedString(useDateShowedInSms)).append("\n");
    sb.append("    useBarcode: ").append(toIndentedString(useBarcode)).append("\n");
    sb.append("    useAlternativeMessage: ").append(toIndentedString(useAlternativeMessage)).append("\n");
    sb.append("    usableVolume: ").append(toIndentedString(usableVolume)).append("\n");
    sb.append("    paymentVendorId: ").append(toIndentedString(paymentVendorId)).append("\n");
    sb.append("    outOptCode: ").append(toIndentedString(outOptCode)).append("\n");
    sb.append("    outCouponUsedType: ").append(toIndentedString(outCouponUsedType)).append("\n");
    sb.append("    outCouponUseType: ").append(toIndentedString(outCouponUseType)).append("\n");
    sb.append("    noticeMessageInMms: ").append(toIndentedString(noticeMessageInMms)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    isToBeDelivered: ").append(toIndentedString(isToBeDelivered)).append("\n");
    sb.append("    hasExternalLink: ").append(toIndentedString(hasExternalLink)).append("\n");
    sb.append("    externalLinkUrl: ").append(toIndentedString(externalLinkUrl)).append("\n");
    sb.append("    externalCoupon: ").append(toIndentedString(externalCoupon)).append("\n");
    sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
    sb.append("    cancelFrontExpType: ").append(toIndentedString(cancelFrontExpType)).append("\n");
    sb.append("    btnReSmsShow: ").append(toIndentedString(btnReSmsShow)).append("\n");
    sb.append("    btnPrintShow: ").append(toIndentedString(btnPrintShow)).append("\n");
    sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
    sb.append("    alternativeMessage: ").append(toIndentedString(alternativeMessage)).append("\n");
    sb.append("    airlineOrderType: ").append(toIndentedString(airlineOrderType)).append("\n");
    sb.append("    advertisedTour: ").append(toIndentedString(advertisedTour)).append("\n");
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

  public static LocalDtoBuilder builder() {
    return new LocalDtoBuilder();
  }

  public static class LocalDtoBuilder {

    private String useVendorId = null;
    private String useType = null;
    private Date useStartDate = null;
    private Date useEndDate = null;
    private Boolean useDateShowedInSms = null;
    private Boolean useBarcode = null;
    private Boolean useAlternativeMessage = null;
    private Long usableVolume = null;
    private String paymentVendorId = null;
    private String outOptCode = null;
    private OutCouponUsedTypeEnum outCouponUsedType = null;
    private String outCouponUseType = null;
    private String noticeMessageInMms = null;
    private Long locationId = null;
    private Boolean isToBeDelivered = null;
    private Boolean hasExternalLink = null;
    private String externalLinkUrl = null;
    private Boolean externalCoupon = null;
    private CouponUseTypeEnum couponUseType = null;
    private String cancelFrontExpType = null;
    private String btnReSmsShow = null;
    private String btnPrintShow = null;
    private java.math.BigDecimal autoRefundRate = null;
    private String alternativeMessage = null;
    private String airlineOrderType = null;
    private Boolean advertisedTour = null;
    

    LocalDtoBuilder() {
    }

    /**
     **/
    public LocalDtoBuilder useVendorId(String useVendorId) {
      this.useVendorId = useVendorId;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useType(String useType) {
      this.useType = useType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useStartDate(Date useStartDate) {
      this.useStartDate = useStartDate;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useEndDate(Date useEndDate) {
      this.useEndDate = useEndDate;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useDateShowedInSms(Boolean useDateShowedInSms) {
      this.useDateShowedInSms = useDateShowedInSms;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useBarcode(Boolean useBarcode) {
      this.useBarcode = useBarcode;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder useAlternativeMessage(Boolean useAlternativeMessage) {
      this.useAlternativeMessage = useAlternativeMessage;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder usableVolume(Long usableVolume) {
      this.usableVolume = usableVolume;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder paymentVendorId(String paymentVendorId) {
      this.paymentVendorId = paymentVendorId;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder outOptCode(String outOptCode) {
      this.outOptCode = outOptCode;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder outCouponUsedType(OutCouponUsedTypeEnum outCouponUsedType) {
      this.outCouponUsedType = outCouponUsedType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder outCouponUseType(String outCouponUseType) {
      this.outCouponUseType = outCouponUseType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder noticeMessageInMms(String noticeMessageInMms) {
      this.noticeMessageInMms = noticeMessageInMms;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder locationId(Long locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder isToBeDelivered(Boolean isToBeDelivered) {
      this.isToBeDelivered = isToBeDelivered;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder hasExternalLink(Boolean hasExternalLink) {
      this.hasExternalLink = hasExternalLink;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder externalLinkUrl(String externalLinkUrl) {
      this.externalLinkUrl = externalLinkUrl;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder externalCoupon(Boolean externalCoupon) {
      this.externalCoupon = externalCoupon;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder couponUseType(CouponUseTypeEnum couponUseType) {
      this.couponUseType = couponUseType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder cancelFrontExpType(String cancelFrontExpType) {
      this.cancelFrontExpType = cancelFrontExpType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder btnReSmsShow(String btnReSmsShow) {
      this.btnReSmsShow = btnReSmsShow;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder btnPrintShow(String btnPrintShow) {
      this.btnPrintShow = btnPrintShow;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder autoRefundRate(java.math.BigDecimal autoRefundRate) {
      this.autoRefundRate = autoRefundRate;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder alternativeMessage(String alternativeMessage) {
      this.alternativeMessage = alternativeMessage;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder airlineOrderType(String airlineOrderType) {
      this.airlineOrderType = airlineOrderType;
      return this;
    }

    /**
     **/
    public LocalDtoBuilder advertisedTour(Boolean advertisedTour) {
      this.advertisedTour = advertisedTour;
      return this;
    }


    public LocalDto build() {
      LocalDto localDto = new LocalDto();
      localDto.setUseVendorId(this.useVendorId);
      localDto.setUseType(this.useType);
      localDto.setUseStartDate(this.useStartDate);
      localDto.setUseEndDate(this.useEndDate);
      localDto.setUseDateShowedInSms(this.useDateShowedInSms);
      localDto.setUseBarcode(this.useBarcode);
      localDto.setUseAlternativeMessage(this.useAlternativeMessage);
      localDto.setUsableVolume(this.usableVolume);
      localDto.setPaymentVendorId(this.paymentVendorId);
      localDto.setOutOptCode(this.outOptCode);
      localDto.setOutCouponUsedType(this.outCouponUsedType);
      localDto.setOutCouponUseType(this.outCouponUseType);
      localDto.setNoticeMessageInMms(this.noticeMessageInMms);
      localDto.setLocationId(this.locationId);
      localDto.setIsToBeDelivered(this.isToBeDelivered);
      localDto.setHasExternalLink(this.hasExternalLink);
      localDto.setExternalLinkUrl(this.externalLinkUrl);
      localDto.setExternalCoupon(this.externalCoupon);
      localDto.setCouponUseType(this.couponUseType);
      localDto.setCancelFrontExpType(this.cancelFrontExpType);
      localDto.setBtnReSmsShow(this.btnReSmsShow);
      localDto.setBtnPrintShow(this.btnPrintShow);
      localDto.setAutoRefundRate(this.autoRefundRate);
      localDto.setAlternativeMessage(this.alternativeMessage);
      localDto.setAirlineOrderType(this.airlineOrderType);
      localDto.setAdvertisedTour(this.advertisedTour);
      return localDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LocalDtoBuilder {\n");
      
      sb.append("    useVendorId: ").append(toIndentedString(useVendorId)).append("\n");
      sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
      sb.append("    useStartDate: ").append(toIndentedString(useStartDate)).append("\n");
      sb.append("    useEndDate: ").append(toIndentedString(useEndDate)).append("\n");
      sb.append("    useDateShowedInSms: ").append(toIndentedString(useDateShowedInSms)).append("\n");
      sb.append("    useBarcode: ").append(toIndentedString(useBarcode)).append("\n");
      sb.append("    useAlternativeMessage: ").append(toIndentedString(useAlternativeMessage)).append("\n");
      sb.append("    usableVolume: ").append(toIndentedString(usableVolume)).append("\n");
      sb.append("    paymentVendorId: ").append(toIndentedString(paymentVendorId)).append("\n");
      sb.append("    outOptCode: ").append(toIndentedString(outOptCode)).append("\n");
      sb.append("    outCouponUsedType: ").append(toIndentedString(outCouponUsedType)).append("\n");
      sb.append("    outCouponUseType: ").append(toIndentedString(outCouponUseType)).append("\n");
      sb.append("    noticeMessageInMms: ").append(toIndentedString(noticeMessageInMms)).append("\n");
      sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
      sb.append("    isToBeDelivered: ").append(toIndentedString(isToBeDelivered)).append("\n");
      sb.append("    hasExternalLink: ").append(toIndentedString(hasExternalLink)).append("\n");
      sb.append("    externalLinkUrl: ").append(toIndentedString(externalLinkUrl)).append("\n");
      sb.append("    externalCoupon: ").append(toIndentedString(externalCoupon)).append("\n");
      sb.append("    couponUseType: ").append(toIndentedString(couponUseType)).append("\n");
      sb.append("    cancelFrontExpType: ").append(toIndentedString(cancelFrontExpType)).append("\n");
      sb.append("    btnReSmsShow: ").append(toIndentedString(btnReSmsShow)).append("\n");
      sb.append("    btnPrintShow: ").append(toIndentedString(btnPrintShow)).append("\n");
      sb.append("    autoRefundRate: ").append(toIndentedString(autoRefundRate)).append("\n");
      sb.append("    alternativeMessage: ").append(toIndentedString(alternativeMessage)).append("\n");
      sb.append("    airlineOrderType: ").append(toIndentedString(airlineOrderType)).append("\n");
      sb.append("    advertisedTour: ").append(toIndentedString(advertisedTour)).append("\n");
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

