package com.coupang.apigateway.services.vendor.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.860+09:00")
public class VendorDto   {
  
  private String vendorName = null;
  private String vendorId = null;
  private Boolean usable = null;
  private Integer shippingCapacity = null;
  private String repZip = null;
  private String repPhoneNum = null;
  private String repPersonName = null;
  private String repMobileNum = null;
  private String repHompageURL = null;
  private String repEmail = null;
  private String repAddr2 = null;
  private String repAddr1 = null;
  private String parentVendorId = null;
  private Boolean overseasVendor = null;
  private Boolean overseasAgent = null;
  private String modifiedBy = null;
  private Date modifiedAt = null;
  private Double lng = null;
  private Double lat = null;
  private Date holidayStart = null;
  private Date holidayEnd = null;
  private Boolean globalVendor = null;
  private String ecommerceReportNumber = null;
  private String deliveryTime2 = null;
  private String deliveryTime1 = null;
  private String csStartTime = null;
  private String csStartDay = null;
  private String csEndTime = null;
  private String csEndDay = null;
  private String createdBy = null;
  private Date createdAt = null;
  private String corporationNumber = null;
  private Boolean closureConfirmed = null;
  private Boolean checkedPG = null;
  private String businessNumber = null;
  private String businessKind = null;
  private String businessCategory = null;
  private Boolean blackListed = null;
  private String blackListDesc = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  /**
   **/
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("usable")
  @com.fasterxml.jackson.annotation.JsonProperty("usable")
  public Boolean getUsable() {
    return usable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUsable() {
    return usable == null ? false : usable;
  }
  
  /**
   **/
  public void setUsable(Boolean usable) {
    this.usable = usable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("shippingCapacity")
  @com.fasterxml.jackson.annotation.JsonProperty("shippingCapacity")
  public Integer getShippingCapacity() {
    return shippingCapacity;
  }
  
  /**
   **/
  public void setShippingCapacity(Integer shippingCapacity) {
    this.shippingCapacity = shippingCapacity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repZip")
  @com.fasterxml.jackson.annotation.JsonProperty("repZip")
  public String getRepZip() {
    return repZip;
  }
  
  /**
   **/
  public void setRepZip(String repZip) {
    this.repZip = repZip;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repPhoneNum")
  @com.fasterxml.jackson.annotation.JsonProperty("repPhoneNum")
  public String getRepPhoneNum() {
    return repPhoneNum;
  }
  
  /**
   **/
  public void setRepPhoneNum(String repPhoneNum) {
    this.repPhoneNum = repPhoneNum;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repPersonName")
  @com.fasterxml.jackson.annotation.JsonProperty("repPersonName")
  public String getRepPersonName() {
    return repPersonName;
  }
  
  /**
   **/
  public void setRepPersonName(String repPersonName) {
    this.repPersonName = repPersonName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repMobileNum")
  @com.fasterxml.jackson.annotation.JsonProperty("repMobileNum")
  public String getRepMobileNum() {
    return repMobileNum;
  }
  
  /**
   **/
  public void setRepMobileNum(String repMobileNum) {
    this.repMobileNum = repMobileNum;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repHompageURL")
  @com.fasterxml.jackson.annotation.JsonProperty("repHompageURL")
  public String getRepHompageURL() {
    return repHompageURL;
  }
  
  /**
   **/
  public void setRepHompageURL(String repHompageURL) {
    this.repHompageURL = repHompageURL;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repEmail")
  @com.fasterxml.jackson.annotation.JsonProperty("repEmail")
  public String getRepEmail() {
    return repEmail;
  }
  
  /**
   **/
  public void setRepEmail(String repEmail) {
    this.repEmail = repEmail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repAddr2")
  @com.fasterxml.jackson.annotation.JsonProperty("repAddr2")
  public String getRepAddr2() {
    return repAddr2;
  }
  
  /**
   **/
  public void setRepAddr2(String repAddr2) {
    this.repAddr2 = repAddr2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("repAddr1")
  @com.fasterxml.jackson.annotation.JsonProperty("repAddr1")
  public String getRepAddr1() {
    return repAddr1;
  }
  
  /**
   **/
  public void setRepAddr1(String repAddr1) {
    this.repAddr1 = repAddr1;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parentVendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("parentVendorId")
  public String getParentVendorId() {
    return parentVendorId;
  }
  
  /**
   **/
  public void setParentVendorId(String parentVendorId) {
    this.parentVendorId = parentVendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overseasVendor")
  @com.fasterxml.jackson.annotation.JsonProperty("overseasVendor")
  public Boolean getOverseasVendor() {
    return overseasVendor;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOverseasVendor() {
    return overseasVendor == null ? false : overseasVendor;
  }
  
  /**
   **/
  public void setOverseasVendor(Boolean overseasVendor) {
    this.overseasVendor = overseasVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("overseasAgent")
  @com.fasterxml.jackson.annotation.JsonProperty("overseasAgent")
  public Boolean getOverseasAgent() {
    return overseasAgent;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOverseasAgent() {
    return overseasAgent == null ? false : overseasAgent;
  }
  
  /**
   **/
  public void setOverseasAgent(Boolean overseasAgent) {
    this.overseasAgent = overseasAgent;
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
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public Double getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(Double lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public Double getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(Double lat) {
    this.lat = lat;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("holidayStart")
  @com.fasterxml.jackson.annotation.JsonProperty("holidayStart")
  public Date getHolidayStart() {
    return holidayStart;
  }
  
  /**
   **/
  public void setHolidayStart(Date holidayStart) {
    this.holidayStart = holidayStart;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("holidayEnd")
  @com.fasterxml.jackson.annotation.JsonProperty("holidayEnd")
  public Date getHolidayEnd() {
    return holidayEnd;
  }
  
  /**
   **/
  public void setHolidayEnd(Date holidayEnd) {
    this.holidayEnd = holidayEnd;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("globalVendor")
  @com.fasterxml.jackson.annotation.JsonProperty("globalVendor")
  public Boolean getGlobalVendor() {
    return globalVendor;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isGlobalVendor() {
    return globalVendor == null ? false : globalVendor;
  }
  
  /**
   **/
  public void setGlobalVendor(Boolean globalVendor) {
    this.globalVendor = globalVendor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ecommerceReportNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("ecommerceReportNumber")
  public String getEcommerceReportNumber() {
    return ecommerceReportNumber;
  }
  
  /**
   **/
  public void setEcommerceReportNumber(String ecommerceReportNumber) {
    this.ecommerceReportNumber = ecommerceReportNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryTime2")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryTime2")
  public String getDeliveryTime2() {
    return deliveryTime2;
  }
  
  /**
   **/
  public void setDeliveryTime2(String deliveryTime2) {
    this.deliveryTime2 = deliveryTime2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryTime1")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryTime1")
  public String getDeliveryTime1() {
    return deliveryTime1;
  }
  
  /**
   **/
  public void setDeliveryTime1(String deliveryTime1) {
    this.deliveryTime1 = deliveryTime1;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("csStartTime")
  @com.fasterxml.jackson.annotation.JsonProperty("csStartTime")
  public String getCsStartTime() {
    return csStartTime;
  }
  
  /**
   **/
  public void setCsStartTime(String csStartTime) {
    this.csStartTime = csStartTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("csStartDay")
  @com.fasterxml.jackson.annotation.JsonProperty("csStartDay")
  public String getCsStartDay() {
    return csStartDay;
  }
  
  /**
   **/
  public void setCsStartDay(String csStartDay) {
    this.csStartDay = csStartDay;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("csEndTime")
  @com.fasterxml.jackson.annotation.JsonProperty("csEndTime")
  public String getCsEndTime() {
    return csEndTime;
  }
  
  /**
   **/
  public void setCsEndTime(String csEndTime) {
    this.csEndTime = csEndTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("csEndDay")
  @com.fasterxml.jackson.annotation.JsonProperty("csEndDay")
  public String getCsEndDay() {
    return csEndDay;
  }
  
  /**
   **/
  public void setCsEndDay(String csEndDay) {
    this.csEndDay = csEndDay;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdBy")
  @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  
  /**
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  @org.codehaus.jackson.annotate.JsonProperty("corporationNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("corporationNumber")
  public String getCorporationNumber() {
    return corporationNumber;
  }
  
  /**
   **/
  public void setCorporationNumber(String corporationNumber) {
    this.corporationNumber = corporationNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("closureConfirmed")
  @com.fasterxml.jackson.annotation.JsonProperty("closureConfirmed")
  public Boolean getClosureConfirmed() {
    return closureConfirmed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isClosureConfirmed() {
    return closureConfirmed == null ? false : closureConfirmed;
  }
  
  /**
   **/
  public void setClosureConfirmed(Boolean closureConfirmed) {
    this.closureConfirmed = closureConfirmed;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checkedPG")
  @com.fasterxml.jackson.annotation.JsonProperty("checkedPG")
  public Boolean getCheckedPG() {
    return checkedPG;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCheckedPG() {
    return checkedPG == null ? false : checkedPG;
  }
  
  /**
   **/
  public void setCheckedPG(Boolean checkedPG) {
    this.checkedPG = checkedPG;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("businessNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("businessNumber")
  public String getBusinessNumber() {
    return businessNumber;
  }
  
  /**
   **/
  public void setBusinessNumber(String businessNumber) {
    this.businessNumber = businessNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("businessKind")
  @com.fasterxml.jackson.annotation.JsonProperty("businessKind")
  public String getBusinessKind() {
    return businessKind;
  }
  
  /**
   **/
  public void setBusinessKind(String businessKind) {
    this.businessKind = businessKind;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("businessCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("businessCategory")
  public String getBusinessCategory() {
    return businessCategory;
  }
  
  /**
   **/
  public void setBusinessCategory(String businessCategory) {
    this.businessCategory = businessCategory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blackListed")
  @com.fasterxml.jackson.annotation.JsonProperty("blackListed")
  public Boolean getBlackListed() {
    return blackListed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBlackListed() {
    return blackListed == null ? false : blackListed;
  }
  
  /**
   **/
  public void setBlackListed(Boolean blackListed) {
    this.blackListed = blackListed;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blackListDesc")
  @com.fasterxml.jackson.annotation.JsonProperty("blackListDesc")
  public String getBlackListDesc() {
    return blackListDesc;
  }
  
  /**
   **/
  public void setBlackListDesc(String blackListDesc) {
    this.blackListDesc = blackListDesc;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorDto vendorDto = (VendorDto) o;
    return Objects.equals(this.vendorName, vendorDto.vendorName) &&
        Objects.equals(this.vendorId, vendorDto.vendorId) &&
        Objects.equals(this.usable, vendorDto.usable) &&
        Objects.equals(this.shippingCapacity, vendorDto.shippingCapacity) &&
        Objects.equals(this.repZip, vendorDto.repZip) &&
        Objects.equals(this.repPhoneNum, vendorDto.repPhoneNum) &&
        Objects.equals(this.repPersonName, vendorDto.repPersonName) &&
        Objects.equals(this.repMobileNum, vendorDto.repMobileNum) &&
        Objects.equals(this.repHompageURL, vendorDto.repHompageURL) &&
        Objects.equals(this.repEmail, vendorDto.repEmail) &&
        Objects.equals(this.repAddr2, vendorDto.repAddr2) &&
        Objects.equals(this.repAddr1, vendorDto.repAddr1) &&
        Objects.equals(this.parentVendorId, vendorDto.parentVendorId) &&
        Objects.equals(this.overseasVendor, vendorDto.overseasVendor) &&
        Objects.equals(this.overseasAgent, vendorDto.overseasAgent) &&
        Objects.equals(this.modifiedBy, vendorDto.modifiedBy) &&
        Objects.equals(this.modifiedAt, vendorDto.modifiedAt) &&
        Objects.equals(this.lng, vendorDto.lng) &&
        Objects.equals(this.lat, vendorDto.lat) &&
        Objects.equals(this.holidayStart, vendorDto.holidayStart) &&
        Objects.equals(this.holidayEnd, vendorDto.holidayEnd) &&
        Objects.equals(this.globalVendor, vendorDto.globalVendor) &&
        Objects.equals(this.ecommerceReportNumber, vendorDto.ecommerceReportNumber) &&
        Objects.equals(this.deliveryTime2, vendorDto.deliveryTime2) &&
        Objects.equals(this.deliveryTime1, vendorDto.deliveryTime1) &&
        Objects.equals(this.csStartTime, vendorDto.csStartTime) &&
        Objects.equals(this.csStartDay, vendorDto.csStartDay) &&
        Objects.equals(this.csEndTime, vendorDto.csEndTime) &&
        Objects.equals(this.csEndDay, vendorDto.csEndDay) &&
        Objects.equals(this.createdBy, vendorDto.createdBy) &&
        Objects.equals(this.createdAt, vendorDto.createdAt) &&
        Objects.equals(this.corporationNumber, vendorDto.corporationNumber) &&
        Objects.equals(this.closureConfirmed, vendorDto.closureConfirmed) &&
        Objects.equals(this.checkedPG, vendorDto.checkedPG) &&
        Objects.equals(this.businessNumber, vendorDto.businessNumber) &&
        Objects.equals(this.businessKind, vendorDto.businessKind) &&
        Objects.equals(this.businessCategory, vendorDto.businessCategory) &&
        Objects.equals(this.blackListed, vendorDto.blackListed) &&
        Objects.equals(this.blackListDesc, vendorDto.blackListDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName, vendorId, usable, shippingCapacity, repZip, repPhoneNum, repPersonName, repMobileNum, repHompageURL, repEmail, repAddr2, repAddr1, parentVendorId, overseasVendor, overseasAgent, modifiedBy, modifiedAt, lng, lat, holidayStart, holidayEnd, globalVendor, ecommerceReportNumber, deliveryTime2, deliveryTime1, csStartTime, csStartDay, csEndTime, csEndDay, createdBy, createdAt, corporationNumber, closureConfirmed, checkedPG, businessNumber, businessKind, businessCategory, blackListed, blackListDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorDto {\n");
    
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    usable: ").append(toIndentedString(usable)).append("\n");
    sb.append("    shippingCapacity: ").append(toIndentedString(shippingCapacity)).append("\n");
    sb.append("    repZip: ").append(toIndentedString(repZip)).append("\n");
    sb.append("    repPhoneNum: ").append(toIndentedString(repPhoneNum)).append("\n");
    sb.append("    repPersonName: ").append(toIndentedString(repPersonName)).append("\n");
    sb.append("    repMobileNum: ").append(toIndentedString(repMobileNum)).append("\n");
    sb.append("    repHompageURL: ").append(toIndentedString(repHompageURL)).append("\n");
    sb.append("    repEmail: ").append(toIndentedString(repEmail)).append("\n");
    sb.append("    repAddr2: ").append(toIndentedString(repAddr2)).append("\n");
    sb.append("    repAddr1: ").append(toIndentedString(repAddr1)).append("\n");
    sb.append("    parentVendorId: ").append(toIndentedString(parentVendorId)).append("\n");
    sb.append("    overseasVendor: ").append(toIndentedString(overseasVendor)).append("\n");
    sb.append("    overseasAgent: ").append(toIndentedString(overseasAgent)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    holidayStart: ").append(toIndentedString(holidayStart)).append("\n");
    sb.append("    holidayEnd: ").append(toIndentedString(holidayEnd)).append("\n");
    sb.append("    globalVendor: ").append(toIndentedString(globalVendor)).append("\n");
    sb.append("    ecommerceReportNumber: ").append(toIndentedString(ecommerceReportNumber)).append("\n");
    sb.append("    deliveryTime2: ").append(toIndentedString(deliveryTime2)).append("\n");
    sb.append("    deliveryTime1: ").append(toIndentedString(deliveryTime1)).append("\n");
    sb.append("    csStartTime: ").append(toIndentedString(csStartTime)).append("\n");
    sb.append("    csStartDay: ").append(toIndentedString(csStartDay)).append("\n");
    sb.append("    csEndTime: ").append(toIndentedString(csEndTime)).append("\n");
    sb.append("    csEndDay: ").append(toIndentedString(csEndDay)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    corporationNumber: ").append(toIndentedString(corporationNumber)).append("\n");
    sb.append("    closureConfirmed: ").append(toIndentedString(closureConfirmed)).append("\n");
    sb.append("    checkedPG: ").append(toIndentedString(checkedPG)).append("\n");
    sb.append("    businessNumber: ").append(toIndentedString(businessNumber)).append("\n");
    sb.append("    businessKind: ").append(toIndentedString(businessKind)).append("\n");
    sb.append("    businessCategory: ").append(toIndentedString(businessCategory)).append("\n");
    sb.append("    blackListed: ").append(toIndentedString(blackListed)).append("\n");
    sb.append("    blackListDesc: ").append(toIndentedString(blackListDesc)).append("\n");
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

  public static VendorDtoBuilder builder() {
    return new VendorDtoBuilder();
  }

  public static class VendorDtoBuilder {

    private String vendorName = null;
    private String vendorId = null;
    private Boolean usable = null;
    private Integer shippingCapacity = null;
    private String repZip = null;
    private String repPhoneNum = null;
    private String repPersonName = null;
    private String repMobileNum = null;
    private String repHompageURL = null;
    private String repEmail = null;
    private String repAddr2 = null;
    private String repAddr1 = null;
    private String parentVendorId = null;
    private Boolean overseasVendor = null;
    private Boolean overseasAgent = null;
    private String modifiedBy = null;
    private Date modifiedAt = null;
    private Double lng = null;
    private Double lat = null;
    private Date holidayStart = null;
    private Date holidayEnd = null;
    private Boolean globalVendor = null;
    private String ecommerceReportNumber = null;
    private String deliveryTime2 = null;
    private String deliveryTime1 = null;
    private String csStartTime = null;
    private String csStartDay = null;
    private String csEndTime = null;
    private String csEndDay = null;
    private String createdBy = null;
    private Date createdAt = null;
    private String corporationNumber = null;
    private Boolean closureConfirmed = null;
    private Boolean checkedPG = null;
    private String businessNumber = null;
    private String businessKind = null;
    private String businessCategory = null;
    private Boolean blackListed = null;
    private String blackListDesc = null;
    

    VendorDtoBuilder() {
    }

    /**
     **/
    public VendorDtoBuilder vendorName(String vendorName) {
      this.vendorName = vendorName;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder usable(Boolean usable) {
      this.usable = usable;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder shippingCapacity(Integer shippingCapacity) {
      this.shippingCapacity = shippingCapacity;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repZip(String repZip) {
      this.repZip = repZip;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repPhoneNum(String repPhoneNum) {
      this.repPhoneNum = repPhoneNum;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repPersonName(String repPersonName) {
      this.repPersonName = repPersonName;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repMobileNum(String repMobileNum) {
      this.repMobileNum = repMobileNum;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repHompageURL(String repHompageURL) {
      this.repHompageURL = repHompageURL;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repEmail(String repEmail) {
      this.repEmail = repEmail;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repAddr2(String repAddr2) {
      this.repAddr2 = repAddr2;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder repAddr1(String repAddr1) {
      this.repAddr1 = repAddr1;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder parentVendorId(String parentVendorId) {
      this.parentVendorId = parentVendorId;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder overseasVendor(Boolean overseasVendor) {
      this.overseasVendor = overseasVendor;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder overseasAgent(Boolean overseasAgent) {
      this.overseasAgent = overseasAgent;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder modifiedBy(String modifiedBy) {
      this.modifiedBy = modifiedBy;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder lng(Double lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder lat(Double lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder holidayStart(Date holidayStart) {
      this.holidayStart = holidayStart;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder holidayEnd(Date holidayEnd) {
      this.holidayEnd = holidayEnd;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder globalVendor(Boolean globalVendor) {
      this.globalVendor = globalVendor;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder ecommerceReportNumber(String ecommerceReportNumber) {
      this.ecommerceReportNumber = ecommerceReportNumber;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder deliveryTime2(String deliveryTime2) {
      this.deliveryTime2 = deliveryTime2;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder deliveryTime1(String deliveryTime1) {
      this.deliveryTime1 = deliveryTime1;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder csStartTime(String csStartTime) {
      this.csStartTime = csStartTime;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder csStartDay(String csStartDay) {
      this.csStartDay = csStartDay;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder csEndTime(String csEndTime) {
      this.csEndTime = csEndTime;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder csEndDay(String csEndDay) {
      this.csEndDay = csEndDay;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder corporationNumber(String corporationNumber) {
      this.corporationNumber = corporationNumber;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder closureConfirmed(Boolean closureConfirmed) {
      this.closureConfirmed = closureConfirmed;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder checkedPG(Boolean checkedPG) {
      this.checkedPG = checkedPG;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder businessNumber(String businessNumber) {
      this.businessNumber = businessNumber;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder businessKind(String businessKind) {
      this.businessKind = businessKind;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder businessCategory(String businessCategory) {
      this.businessCategory = businessCategory;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder blackListed(Boolean blackListed) {
      this.blackListed = blackListed;
      return this;
    }

    /**
     **/
    public VendorDtoBuilder blackListDesc(String blackListDesc) {
      this.blackListDesc = blackListDesc;
      return this;
    }


    public VendorDto build() {
      VendorDto vendorDto = new VendorDto();
      vendorDto.setVendorName(this.vendorName);
      vendorDto.setVendorId(this.vendorId);
      vendorDto.setUsable(this.usable);
      vendorDto.setShippingCapacity(this.shippingCapacity);
      vendorDto.setRepZip(this.repZip);
      vendorDto.setRepPhoneNum(this.repPhoneNum);
      vendorDto.setRepPersonName(this.repPersonName);
      vendorDto.setRepMobileNum(this.repMobileNum);
      vendorDto.setRepHompageURL(this.repHompageURL);
      vendorDto.setRepEmail(this.repEmail);
      vendorDto.setRepAddr2(this.repAddr2);
      vendorDto.setRepAddr1(this.repAddr1);
      vendorDto.setParentVendorId(this.parentVendorId);
      vendorDto.setOverseasVendor(this.overseasVendor);
      vendorDto.setOverseasAgent(this.overseasAgent);
      vendorDto.setModifiedBy(this.modifiedBy);
      vendorDto.setModifiedAt(this.modifiedAt);
      vendorDto.setLng(this.lng);
      vendorDto.setLat(this.lat);
      vendorDto.setHolidayStart(this.holidayStart);
      vendorDto.setHolidayEnd(this.holidayEnd);
      vendorDto.setGlobalVendor(this.globalVendor);
      vendorDto.setEcommerceReportNumber(this.ecommerceReportNumber);
      vendorDto.setDeliveryTime2(this.deliveryTime2);
      vendorDto.setDeliveryTime1(this.deliveryTime1);
      vendorDto.setCsStartTime(this.csStartTime);
      vendorDto.setCsStartDay(this.csStartDay);
      vendorDto.setCsEndTime(this.csEndTime);
      vendorDto.setCsEndDay(this.csEndDay);
      vendorDto.setCreatedBy(this.createdBy);
      vendorDto.setCreatedAt(this.createdAt);
      vendorDto.setCorporationNumber(this.corporationNumber);
      vendorDto.setClosureConfirmed(this.closureConfirmed);
      vendorDto.setCheckedPG(this.checkedPG);
      vendorDto.setBusinessNumber(this.businessNumber);
      vendorDto.setBusinessKind(this.businessKind);
      vendorDto.setBusinessCategory(this.businessCategory);
      vendorDto.setBlackListed(this.blackListed);
      vendorDto.setBlackListDesc(this.blackListDesc);
      return vendorDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorDtoBuilder {\n");
      
      sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    usable: ").append(toIndentedString(usable)).append("\n");
      sb.append("    shippingCapacity: ").append(toIndentedString(shippingCapacity)).append("\n");
      sb.append("    repZip: ").append(toIndentedString(repZip)).append("\n");
      sb.append("    repPhoneNum: ").append(toIndentedString(repPhoneNum)).append("\n");
      sb.append("    repPersonName: ").append(toIndentedString(repPersonName)).append("\n");
      sb.append("    repMobileNum: ").append(toIndentedString(repMobileNum)).append("\n");
      sb.append("    repHompageURL: ").append(toIndentedString(repHompageURL)).append("\n");
      sb.append("    repEmail: ").append(toIndentedString(repEmail)).append("\n");
      sb.append("    repAddr2: ").append(toIndentedString(repAddr2)).append("\n");
      sb.append("    repAddr1: ").append(toIndentedString(repAddr1)).append("\n");
      sb.append("    parentVendorId: ").append(toIndentedString(parentVendorId)).append("\n");
      sb.append("    overseasVendor: ").append(toIndentedString(overseasVendor)).append("\n");
      sb.append("    overseasAgent: ").append(toIndentedString(overseasAgent)).append("\n");
      sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    holidayStart: ").append(toIndentedString(holidayStart)).append("\n");
      sb.append("    holidayEnd: ").append(toIndentedString(holidayEnd)).append("\n");
      sb.append("    globalVendor: ").append(toIndentedString(globalVendor)).append("\n");
      sb.append("    ecommerceReportNumber: ").append(toIndentedString(ecommerceReportNumber)).append("\n");
      sb.append("    deliveryTime2: ").append(toIndentedString(deliveryTime2)).append("\n");
      sb.append("    deliveryTime1: ").append(toIndentedString(deliveryTime1)).append("\n");
      sb.append("    csStartTime: ").append(toIndentedString(csStartTime)).append("\n");
      sb.append("    csStartDay: ").append(toIndentedString(csStartDay)).append("\n");
      sb.append("    csEndTime: ").append(toIndentedString(csEndTime)).append("\n");
      sb.append("    csEndDay: ").append(toIndentedString(csEndDay)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    corporationNumber: ").append(toIndentedString(corporationNumber)).append("\n");
      sb.append("    closureConfirmed: ").append(toIndentedString(closureConfirmed)).append("\n");
      sb.append("    checkedPG: ").append(toIndentedString(checkedPG)).append("\n");
      sb.append("    businessNumber: ").append(toIndentedString(businessNumber)).append("\n");
      sb.append("    businessKind: ").append(toIndentedString(businessKind)).append("\n");
      sb.append("    businessCategory: ").append(toIndentedString(businessCategory)).append("\n");
      sb.append("    blackListed: ").append(toIndentedString(blackListed)).append("\n");
      sb.append("    blackListDesc: ").append(toIndentedString(blackListDesc)).append("\n");
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

