package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.GoodsPropertyDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class GoodsDto   {
  
  private Boolean webCancelEnabled = null;
  private String returnZipCode = null;
  private Boolean returnChargeVendor = null;
  private String returnChargeName = null;
  private Boolean returnChargeCoupang = null;
  private java.math.BigDecimal returnCharge = null;
  private String returnCenterCode = null;
  private String returnAddressDetail = null;
  private String returnAddress = null;
  private Integer reorderPeriod = null;
  private Boolean remoteAreaDeliverable = null;
  private Boolean parallelImported = null;
  private Boolean overseasPurchased = null;
  private Integer outboundShippingTime = null;
  private Long outboundShippingPlaceId = null;
  private Boolean logisticsType = null;
  private Boolean importedByAgency = null;
  private String importAgencyName = null;
  private Map<String, GoodsPropertyDto> goodsProperties = new HashMap<String, GoodsPropertyDto>();
  private java.math.BigDecimal freeShipOverAmount = null;
  private String exchangeType = null;
  private String deliveryType = null;
  private String deliveryMethod = null;
  private String deliveryCompanyCode = null;
  private String deliveryChargeType = null;
  private java.math.BigDecimal deliveryChargeOnReturn = null;
  private java.math.BigDecimal deliveryCharge = null;
  private String deliverCode = null;
  private java.math.BigDecimal coupangFreeShippingFee = null;
  private Boolean coupangFreeShippingApplicable = null;
  private String companyContactNumber = null;
  private Boolean batchShipment = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("webCancelEnabled")
  @com.fasterxml.jackson.annotation.JsonProperty("webCancelEnabled")
  public Boolean getWebCancelEnabled() {
    return webCancelEnabled;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isWebCancelEnabled() {
    return webCancelEnabled == null ? false : webCancelEnabled;
  }
  
  /**
   **/
  public void setWebCancelEnabled(Boolean webCancelEnabled) {
    this.webCancelEnabled = webCancelEnabled;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnZipCode")
  @com.fasterxml.jackson.annotation.JsonProperty("returnZipCode")
  public String getReturnZipCode() {
    return returnZipCode;
  }
  
  /**
   **/
  public void setReturnZipCode(String returnZipCode) {
    this.returnZipCode = returnZipCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnChargeVendor")
  @com.fasterxml.jackson.annotation.JsonProperty("returnChargeVendor")
  public Boolean getReturnChargeVendor() {
    return returnChargeVendor;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnChargeVendor() {
    return returnChargeVendor == null ? false : returnChargeVendor;
  }
  
  /**
   **/
  public void setReturnChargeVendor(Boolean returnChargeVendor) {
    this.returnChargeVendor = returnChargeVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnChargeName")
  @com.fasterxml.jackson.annotation.JsonProperty("returnChargeName")
  public String getReturnChargeName() {
    return returnChargeName;
  }
  
  /**
   **/
  public void setReturnChargeName(String returnChargeName) {
    this.returnChargeName = returnChargeName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnChargeCoupang")
  @com.fasterxml.jackson.annotation.JsonProperty("returnChargeCoupang")
  public Boolean getReturnChargeCoupang() {
    return returnChargeCoupang;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnChargeCoupang() {
    return returnChargeCoupang == null ? false : returnChargeCoupang;
  }
  
  /**
   **/
  public void setReturnChargeCoupang(Boolean returnChargeCoupang) {
    this.returnChargeCoupang = returnChargeCoupang;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnCharge")
  @com.fasterxml.jackson.annotation.JsonProperty("returnCharge")
  public java.math.BigDecimal getReturnCharge() {
    return returnCharge;
  }
  
  /**
   **/
  public void setReturnCharge(java.math.BigDecimal returnCharge) {
    this.returnCharge = returnCharge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnCenterCode")
  @com.fasterxml.jackson.annotation.JsonProperty("returnCenterCode")
  public String getReturnCenterCode() {
    return returnCenterCode;
  }
  
  /**
   **/
  public void setReturnCenterCode(String returnCenterCode) {
    this.returnCenterCode = returnCenterCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnAddressDetail")
  @com.fasterxml.jackson.annotation.JsonProperty("returnAddressDetail")
  public String getReturnAddressDetail() {
    return returnAddressDetail;
  }
  
  /**
   **/
  public void setReturnAddressDetail(String returnAddressDetail) {
    this.returnAddressDetail = returnAddressDetail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("returnAddress")
  @com.fasterxml.jackson.annotation.JsonProperty("returnAddress")
  public String getReturnAddress() {
    return returnAddress;
  }
  
  /**
   **/
  public void setReturnAddress(String returnAddress) {
    this.returnAddress = returnAddress;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reorderPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("reorderPeriod")
  public Integer getReorderPeriod() {
    return reorderPeriod;
  }
  
  /**
   **/
  public void setReorderPeriod(Integer reorderPeriod) {
    this.reorderPeriod = reorderPeriod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("remoteAreaDeliverable")
  @com.fasterxml.jackson.annotation.JsonProperty("remoteAreaDeliverable")
  public Boolean getRemoteAreaDeliverable() {
    return remoteAreaDeliverable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRemoteAreaDeliverable() {
    return remoteAreaDeliverable == null ? false : remoteAreaDeliverable;
  }
  
  /**
   **/
  public void setRemoteAreaDeliverable(Boolean remoteAreaDeliverable) {
    this.remoteAreaDeliverable = remoteAreaDeliverable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parallelImported")
  @com.fasterxml.jackson.annotation.JsonProperty("parallelImported")
  public Boolean getParallelImported() {
    return parallelImported;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isParallelImported() {
    return parallelImported == null ? false : parallelImported;
  }
  
  /**
   **/
  public void setParallelImported(Boolean parallelImported) {
    this.parallelImported = parallelImported;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overseasPurchased")
  @com.fasterxml.jackson.annotation.JsonProperty("overseasPurchased")
  public Boolean getOverseasPurchased() {
    return overseasPurchased;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOverseasPurchased() {
    return overseasPurchased == null ? false : overseasPurchased;
  }
  
  /**
   **/
  public void setOverseasPurchased(Boolean overseasPurchased) {
    this.overseasPurchased = overseasPurchased;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("outboundShippingTime")
  @com.fasterxml.jackson.annotation.JsonProperty("outboundShippingTime")
  public Integer getOutboundShippingTime() {
    return outboundShippingTime;
  }
  
  /**
   **/
  public void setOutboundShippingTime(Integer outboundShippingTime) {
    this.outboundShippingTime = outboundShippingTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("outboundShippingPlaceId")
  @com.fasterxml.jackson.annotation.JsonProperty("outboundShippingPlaceId")
  public Long getOutboundShippingPlaceId() {
    return outboundShippingPlaceId;
  }
  
  /**
   **/
  public void setOutboundShippingPlaceId(Long outboundShippingPlaceId) {
    this.outboundShippingPlaceId = outboundShippingPlaceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("logisticsType")
  @com.fasterxml.jackson.annotation.JsonProperty("logisticsType")
  public Boolean getLogisticsType() {
    return logisticsType;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogisticsType() {
    return logisticsType == null ? false : logisticsType;
  }
  
  /**
   **/
  public void setLogisticsType(Boolean logisticsType) {
    this.logisticsType = logisticsType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("importedByAgency")
  @com.fasterxml.jackson.annotation.JsonProperty("importedByAgency")
  public Boolean getImportedByAgency() {
    return importedByAgency;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isImportedByAgency() {
    return importedByAgency == null ? false : importedByAgency;
  }
  
  /**
   **/
  public void setImportedByAgency(Boolean importedByAgency) {
    this.importedByAgency = importedByAgency;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("importAgencyName")
  @com.fasterxml.jackson.annotation.JsonProperty("importAgencyName")
  public String getImportAgencyName() {
    return importAgencyName;
  }
  
  /**
   **/
  public void setImportAgencyName(String importAgencyName) {
    this.importAgencyName = importAgencyName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("goodsProperties")
  @com.fasterxml.jackson.annotation.JsonProperty("goodsProperties")
  public Map<String, GoodsPropertyDto> getGoodsProperties() {
    return goodsProperties;
  }
  
  /**
   **/
  public void setGoodsProperties(Map<String, GoodsPropertyDto> goodsProperties) {
    this.goodsProperties = goodsProperties;
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
  @org.codehaus.jackson.annotate.JsonProperty("exchangeType")
  @com.fasterxml.jackson.annotation.JsonProperty("exchangeType")
  public String getExchangeType() {
    return exchangeType;
  }
  
  /**
   **/
  public void setExchangeType(String exchangeType) {
    this.exchangeType = exchangeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryType")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryType")
  public String getDeliveryType() {
    return deliveryType;
  }
  
  /**
   **/
  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryMethod")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryMethod")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }
  
  /**
   **/
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryCompanyCode")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryCompanyCode")
  public String getDeliveryCompanyCode() {
    return deliveryCompanyCode;
  }
  
  /**
   **/
  public void setDeliveryCompanyCode(String deliveryCompanyCode) {
    this.deliveryCompanyCode = deliveryCompanyCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryChargeType")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryChargeType")
  public String getDeliveryChargeType() {
    return deliveryChargeType;
  }
  
  /**
   **/
  public void setDeliveryChargeType(String deliveryChargeType) {
    this.deliveryChargeType = deliveryChargeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryChargeOnReturn")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryChargeOnReturn")
  public java.math.BigDecimal getDeliveryChargeOnReturn() {
    return deliveryChargeOnReturn;
  }
  
  /**
   **/
  public void setDeliveryChargeOnReturn(java.math.BigDecimal deliveryChargeOnReturn) {
    this.deliveryChargeOnReturn = deliveryChargeOnReturn;
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
  @org.codehaus.jackson.annotate.JsonProperty("deliverCode")
  @com.fasterxml.jackson.annotation.JsonProperty("deliverCode")
  public String getDeliverCode() {
    return deliverCode;
  }
  
  /**
   **/
  public void setDeliverCode(String deliverCode) {
    this.deliverCode = deliverCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangFreeShippingFee")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangFreeShippingFee")
  public java.math.BigDecimal getCoupangFreeShippingFee() {
    return coupangFreeShippingFee;
  }
  
  /**
   **/
  public void setCoupangFreeShippingFee(java.math.BigDecimal coupangFreeShippingFee) {
    this.coupangFreeShippingFee = coupangFreeShippingFee;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangFreeShippingApplicable")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangFreeShippingApplicable")
  public Boolean getCoupangFreeShippingApplicable() {
    return coupangFreeShippingApplicable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCoupangFreeShippingApplicable() {
    return coupangFreeShippingApplicable == null ? false : coupangFreeShippingApplicable;
  }
  
  /**
   **/
  public void setCoupangFreeShippingApplicable(Boolean coupangFreeShippingApplicable) {
    this.coupangFreeShippingApplicable = coupangFreeShippingApplicable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("companyContactNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("companyContactNumber")
  public String getCompanyContactNumber() {
    return companyContactNumber;
  }
  
  /**
   **/
  public void setCompanyContactNumber(String companyContactNumber) {
    this.companyContactNumber = companyContactNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("batchShipment")
  @com.fasterxml.jackson.annotation.JsonProperty("batchShipment")
  public Boolean getBatchShipment() {
    return batchShipment;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBatchShipment() {
    return batchShipment == null ? false : batchShipment;
  }
  
  /**
   **/
  public void setBatchShipment(Boolean batchShipment) {
    this.batchShipment = batchShipment;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsDto goodsDto = (GoodsDto) o;
    return Objects.equals(this.webCancelEnabled, goodsDto.webCancelEnabled) &&
        Objects.equals(this.returnZipCode, goodsDto.returnZipCode) &&
        Objects.equals(this.returnChargeVendor, goodsDto.returnChargeVendor) &&
        Objects.equals(this.returnChargeName, goodsDto.returnChargeName) &&
        Objects.equals(this.returnChargeCoupang, goodsDto.returnChargeCoupang) &&
        Objects.equals(this.returnCharge, goodsDto.returnCharge) &&
        Objects.equals(this.returnCenterCode, goodsDto.returnCenterCode) &&
        Objects.equals(this.returnAddressDetail, goodsDto.returnAddressDetail) &&
        Objects.equals(this.returnAddress, goodsDto.returnAddress) &&
        Objects.equals(this.reorderPeriod, goodsDto.reorderPeriod) &&
        Objects.equals(this.remoteAreaDeliverable, goodsDto.remoteAreaDeliverable) &&
        Objects.equals(this.parallelImported, goodsDto.parallelImported) &&
        Objects.equals(this.overseasPurchased, goodsDto.overseasPurchased) &&
        Objects.equals(this.outboundShippingTime, goodsDto.outboundShippingTime) &&
        Objects.equals(this.outboundShippingPlaceId, goodsDto.outboundShippingPlaceId) &&
        Objects.equals(this.logisticsType, goodsDto.logisticsType) &&
        Objects.equals(this.importedByAgency, goodsDto.importedByAgency) &&
        Objects.equals(this.importAgencyName, goodsDto.importAgencyName) &&
        Objects.equals(this.goodsProperties, goodsDto.goodsProperties) &&
        Objects.equals(this.freeShipOverAmount, goodsDto.freeShipOverAmount) &&
        Objects.equals(this.exchangeType, goodsDto.exchangeType) &&
        Objects.equals(this.deliveryType, goodsDto.deliveryType) &&
        Objects.equals(this.deliveryMethod, goodsDto.deliveryMethod) &&
        Objects.equals(this.deliveryCompanyCode, goodsDto.deliveryCompanyCode) &&
        Objects.equals(this.deliveryChargeType, goodsDto.deliveryChargeType) &&
        Objects.equals(this.deliveryChargeOnReturn, goodsDto.deliveryChargeOnReturn) &&
        Objects.equals(this.deliveryCharge, goodsDto.deliveryCharge) &&
        Objects.equals(this.deliverCode, goodsDto.deliverCode) &&
        Objects.equals(this.coupangFreeShippingFee, goodsDto.coupangFreeShippingFee) &&
        Objects.equals(this.coupangFreeShippingApplicable, goodsDto.coupangFreeShippingApplicable) &&
        Objects.equals(this.companyContactNumber, goodsDto.companyContactNumber) &&
        Objects.equals(this.batchShipment, goodsDto.batchShipment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webCancelEnabled, returnZipCode, returnChargeVendor, returnChargeName, returnChargeCoupang, returnCharge, returnCenterCode, returnAddressDetail, returnAddress, reorderPeriod, remoteAreaDeliverable, parallelImported, overseasPurchased, outboundShippingTime, outboundShippingPlaceId, logisticsType, importedByAgency, importAgencyName, goodsProperties, freeShipOverAmount, exchangeType, deliveryType, deliveryMethod, deliveryCompanyCode, deliveryChargeType, deliveryChargeOnReturn, deliveryCharge, deliverCode, coupangFreeShippingFee, coupangFreeShippingApplicable, companyContactNumber, batchShipment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsDto {\n");
    
    sb.append("    webCancelEnabled: ").append(toIndentedString(webCancelEnabled)).append("\n");
    sb.append("    returnZipCode: ").append(toIndentedString(returnZipCode)).append("\n");
    sb.append("    returnChargeVendor: ").append(toIndentedString(returnChargeVendor)).append("\n");
    sb.append("    returnChargeName: ").append(toIndentedString(returnChargeName)).append("\n");
    sb.append("    returnChargeCoupang: ").append(toIndentedString(returnChargeCoupang)).append("\n");
    sb.append("    returnCharge: ").append(toIndentedString(returnCharge)).append("\n");
    sb.append("    returnCenterCode: ").append(toIndentedString(returnCenterCode)).append("\n");
    sb.append("    returnAddressDetail: ").append(toIndentedString(returnAddressDetail)).append("\n");
    sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
    sb.append("    reorderPeriod: ").append(toIndentedString(reorderPeriod)).append("\n");
    sb.append("    remoteAreaDeliverable: ").append(toIndentedString(remoteAreaDeliverable)).append("\n");
    sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
    sb.append("    overseasPurchased: ").append(toIndentedString(overseasPurchased)).append("\n");
    sb.append("    outboundShippingTime: ").append(toIndentedString(outboundShippingTime)).append("\n");
    sb.append("    outboundShippingPlaceId: ").append(toIndentedString(outboundShippingPlaceId)).append("\n");
    sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
    sb.append("    importedByAgency: ").append(toIndentedString(importedByAgency)).append("\n");
    sb.append("    importAgencyName: ").append(toIndentedString(importAgencyName)).append("\n");
    sb.append("    goodsProperties: ").append(toIndentedString(goodsProperties)).append("\n");
    sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
    sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryCompanyCode: ").append(toIndentedString(deliveryCompanyCode)).append("\n");
    sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
    sb.append("    deliveryChargeOnReturn: ").append(toIndentedString(deliveryChargeOnReturn)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    deliverCode: ").append(toIndentedString(deliverCode)).append("\n");
    sb.append("    coupangFreeShippingFee: ").append(toIndentedString(coupangFreeShippingFee)).append("\n");
    sb.append("    coupangFreeShippingApplicable: ").append(toIndentedString(coupangFreeShippingApplicable)).append("\n");
    sb.append("    companyContactNumber: ").append(toIndentedString(companyContactNumber)).append("\n");
    sb.append("    batchShipment: ").append(toIndentedString(batchShipment)).append("\n");
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

  public static GoodsDtoBuilder builder() {
    return new GoodsDtoBuilder();
  }

  public static class GoodsDtoBuilder {

    private Boolean webCancelEnabled = null;
    private String returnZipCode = null;
    private Boolean returnChargeVendor = null;
    private String returnChargeName = null;
    private Boolean returnChargeCoupang = null;
    private java.math.BigDecimal returnCharge = null;
    private String returnCenterCode = null;
    private String returnAddressDetail = null;
    private String returnAddress = null;
    private Integer reorderPeriod = null;
    private Boolean remoteAreaDeliverable = null;
    private Boolean parallelImported = null;
    private Boolean overseasPurchased = null;
    private Integer outboundShippingTime = null;
    private Long outboundShippingPlaceId = null;
    private Boolean logisticsType = null;
    private Boolean importedByAgency = null;
    private String importAgencyName = null;
    private Map<String, GoodsPropertyDto> goodsProperties = new HashMap<String, GoodsPropertyDto>();
    private java.math.BigDecimal freeShipOverAmount = null;
    private String exchangeType = null;
    private String deliveryType = null;
    private String deliveryMethod = null;
    private String deliveryCompanyCode = null;
    private String deliveryChargeType = null;
    private java.math.BigDecimal deliveryChargeOnReturn = null;
    private java.math.BigDecimal deliveryCharge = null;
    private String deliverCode = null;
    private java.math.BigDecimal coupangFreeShippingFee = null;
    private Boolean coupangFreeShippingApplicable = null;
    private String companyContactNumber = null;
    private Boolean batchShipment = null;
    

    GoodsDtoBuilder() {
    }

    /**
     **/
    public GoodsDtoBuilder webCancelEnabled(Boolean webCancelEnabled) {
      this.webCancelEnabled = webCancelEnabled;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnZipCode(String returnZipCode) {
      this.returnZipCode = returnZipCode;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnChargeVendor(Boolean returnChargeVendor) {
      this.returnChargeVendor = returnChargeVendor;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnChargeName(String returnChargeName) {
      this.returnChargeName = returnChargeName;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnChargeCoupang(Boolean returnChargeCoupang) {
      this.returnChargeCoupang = returnChargeCoupang;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnCharge(java.math.BigDecimal returnCharge) {
      this.returnCharge = returnCharge;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnCenterCode(String returnCenterCode) {
      this.returnCenterCode = returnCenterCode;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnAddressDetail(String returnAddressDetail) {
      this.returnAddressDetail = returnAddressDetail;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder returnAddress(String returnAddress) {
      this.returnAddress = returnAddress;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder reorderPeriod(Integer reorderPeriod) {
      this.reorderPeriod = reorderPeriod;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder remoteAreaDeliverable(Boolean remoteAreaDeliverable) {
      this.remoteAreaDeliverable = remoteAreaDeliverable;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder parallelImported(Boolean parallelImported) {
      this.parallelImported = parallelImported;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder overseasPurchased(Boolean overseasPurchased) {
      this.overseasPurchased = overseasPurchased;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder outboundShippingTime(Integer outboundShippingTime) {
      this.outboundShippingTime = outboundShippingTime;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder outboundShippingPlaceId(Long outboundShippingPlaceId) {
      this.outboundShippingPlaceId = outboundShippingPlaceId;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder logisticsType(Boolean logisticsType) {
      this.logisticsType = logisticsType;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder importedByAgency(Boolean importedByAgency) {
      this.importedByAgency = importedByAgency;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder importAgencyName(String importAgencyName) {
      this.importAgencyName = importAgencyName;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder goodsProperties(Map<String, GoodsPropertyDto> goodsProperties) {
      this.goodsProperties = goodsProperties;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder freeShipOverAmount(java.math.BigDecimal freeShipOverAmount) {
      this.freeShipOverAmount = freeShipOverAmount;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder exchangeType(String exchangeType) {
      this.exchangeType = exchangeType;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryType(String deliveryType) {
      this.deliveryType = deliveryType;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryMethod(String deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryCompanyCode(String deliveryCompanyCode) {
      this.deliveryCompanyCode = deliveryCompanyCode;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryChargeType(String deliveryChargeType) {
      this.deliveryChargeType = deliveryChargeType;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryChargeOnReturn(java.math.BigDecimal deliveryChargeOnReturn) {
      this.deliveryChargeOnReturn = deliveryChargeOnReturn;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliveryCharge(java.math.BigDecimal deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder deliverCode(String deliverCode) {
      this.deliverCode = deliverCode;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder coupangFreeShippingFee(java.math.BigDecimal coupangFreeShippingFee) {
      this.coupangFreeShippingFee = coupangFreeShippingFee;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder coupangFreeShippingApplicable(Boolean coupangFreeShippingApplicable) {
      this.coupangFreeShippingApplicable = coupangFreeShippingApplicable;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder companyContactNumber(String companyContactNumber) {
      this.companyContactNumber = companyContactNumber;
      return this;
    }

    /**
     **/
    public GoodsDtoBuilder batchShipment(Boolean batchShipment) {
      this.batchShipment = batchShipment;
      return this;
    }


    public GoodsDto build() {
      GoodsDto goodsDto = new GoodsDto();
      goodsDto.setWebCancelEnabled(this.webCancelEnabled);
      goodsDto.setReturnZipCode(this.returnZipCode);
      goodsDto.setReturnChargeVendor(this.returnChargeVendor);
      goodsDto.setReturnChargeName(this.returnChargeName);
      goodsDto.setReturnChargeCoupang(this.returnChargeCoupang);
      goodsDto.setReturnCharge(this.returnCharge);
      goodsDto.setReturnCenterCode(this.returnCenterCode);
      goodsDto.setReturnAddressDetail(this.returnAddressDetail);
      goodsDto.setReturnAddress(this.returnAddress);
      goodsDto.setReorderPeriod(this.reorderPeriod);
      goodsDto.setRemoteAreaDeliverable(this.remoteAreaDeliverable);
      goodsDto.setParallelImported(this.parallelImported);
      goodsDto.setOverseasPurchased(this.overseasPurchased);
      goodsDto.setOutboundShippingTime(this.outboundShippingTime);
      goodsDto.setOutboundShippingPlaceId(this.outboundShippingPlaceId);
      goodsDto.setLogisticsType(this.logisticsType);
      goodsDto.setImportedByAgency(this.importedByAgency);
      goodsDto.setImportAgencyName(this.importAgencyName);
      goodsDto.setGoodsProperties(this.goodsProperties);
      goodsDto.setFreeShipOverAmount(this.freeShipOverAmount);
      goodsDto.setExchangeType(this.exchangeType);
      goodsDto.setDeliveryType(this.deliveryType);
      goodsDto.setDeliveryMethod(this.deliveryMethod);
      goodsDto.setDeliveryCompanyCode(this.deliveryCompanyCode);
      goodsDto.setDeliveryChargeType(this.deliveryChargeType);
      goodsDto.setDeliveryChargeOnReturn(this.deliveryChargeOnReturn);
      goodsDto.setDeliveryCharge(this.deliveryCharge);
      goodsDto.setDeliverCode(this.deliverCode);
      goodsDto.setCoupangFreeShippingFee(this.coupangFreeShippingFee);
      goodsDto.setCoupangFreeShippingApplicable(this.coupangFreeShippingApplicable);
      goodsDto.setCompanyContactNumber(this.companyContactNumber);
      goodsDto.setBatchShipment(this.batchShipment);
      return goodsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GoodsDtoBuilder {\n");
      
      sb.append("    webCancelEnabled: ").append(toIndentedString(webCancelEnabled)).append("\n");
      sb.append("    returnZipCode: ").append(toIndentedString(returnZipCode)).append("\n");
      sb.append("    returnChargeVendor: ").append(toIndentedString(returnChargeVendor)).append("\n");
      sb.append("    returnChargeName: ").append(toIndentedString(returnChargeName)).append("\n");
      sb.append("    returnChargeCoupang: ").append(toIndentedString(returnChargeCoupang)).append("\n");
      sb.append("    returnCharge: ").append(toIndentedString(returnCharge)).append("\n");
      sb.append("    returnCenterCode: ").append(toIndentedString(returnCenterCode)).append("\n");
      sb.append("    returnAddressDetail: ").append(toIndentedString(returnAddressDetail)).append("\n");
      sb.append("    returnAddress: ").append(toIndentedString(returnAddress)).append("\n");
      sb.append("    reorderPeriod: ").append(toIndentedString(reorderPeriod)).append("\n");
      sb.append("    remoteAreaDeliverable: ").append(toIndentedString(remoteAreaDeliverable)).append("\n");
      sb.append("    parallelImported: ").append(toIndentedString(parallelImported)).append("\n");
      sb.append("    overseasPurchased: ").append(toIndentedString(overseasPurchased)).append("\n");
      sb.append("    outboundShippingTime: ").append(toIndentedString(outboundShippingTime)).append("\n");
      sb.append("    outboundShippingPlaceId: ").append(toIndentedString(outboundShippingPlaceId)).append("\n");
      sb.append("    logisticsType: ").append(toIndentedString(logisticsType)).append("\n");
      sb.append("    importedByAgency: ").append(toIndentedString(importedByAgency)).append("\n");
      sb.append("    importAgencyName: ").append(toIndentedString(importAgencyName)).append("\n");
      sb.append("    goodsProperties: ").append(toIndentedString(goodsProperties)).append("\n");
      sb.append("    freeShipOverAmount: ").append(toIndentedString(freeShipOverAmount)).append("\n");
      sb.append("    exchangeType: ").append(toIndentedString(exchangeType)).append("\n");
      sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
      sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
      sb.append("    deliveryCompanyCode: ").append(toIndentedString(deliveryCompanyCode)).append("\n");
      sb.append("    deliveryChargeType: ").append(toIndentedString(deliveryChargeType)).append("\n");
      sb.append("    deliveryChargeOnReturn: ").append(toIndentedString(deliveryChargeOnReturn)).append("\n");
      sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
      sb.append("    deliverCode: ").append(toIndentedString(deliverCode)).append("\n");
      sb.append("    coupangFreeShippingFee: ").append(toIndentedString(coupangFreeShippingFee)).append("\n");
      sb.append("    coupangFreeShippingApplicable: ").append(toIndentedString(coupangFreeShippingApplicable)).append("\n");
      sb.append("    companyContactNumber: ").append(toIndentedString(companyContactNumber)).append("\n");
      sb.append("    batchShipment: ").append(toIndentedString(batchShipment)).append("\n");
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

