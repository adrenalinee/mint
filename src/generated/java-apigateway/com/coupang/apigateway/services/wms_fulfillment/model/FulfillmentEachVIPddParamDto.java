package com.coupang.apigateway.services.wms_fulfillment.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
public class FulfillmentEachVIPddParamDto   {
  
  private String zipCode = null;
  private List<Long> vendorItemIdList = new ArrayList<Long>();
  private String targetDate = null;
  private Long memberSrl = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemIdList")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemIdList")
  public List<Long> getVendorItemIdList() {
    return vendorItemIdList;
  }
  
  /**
   **/
  public void setVendorItemIdList(List<Long> vendorItemIdList) {
    this.vendorItemIdList = vendorItemIdList;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("targetDate")
  @com.fasterxml.jackson.annotation.JsonProperty("targetDate")
  public String getTargetDate() {
    return targetDate;
  }
  
  /**
   **/
  public void setTargetDate(String targetDate) {
    this.targetDate = targetDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("memberSrl")
  public Long getMemberSrl() {
    return memberSrl;
  }
  
  /**
   **/
  public void setMemberSrl(Long memberSrl) {
    this.memberSrl = memberSrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto = (FulfillmentEachVIPddParamDto) o;
    return Objects.equals(this.zipCode, fulfillmentEachVIPddParamDto.zipCode) &&
        Objects.equals(this.vendorItemIdList, fulfillmentEachVIPddParamDto.vendorItemIdList) &&
        Objects.equals(this.targetDate, fulfillmentEachVIPddParamDto.targetDate) &&
        Objects.equals(this.memberSrl, fulfillmentEachVIPddParamDto.memberSrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, vendorItemIdList, targetDate, memberSrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentEachVIPddParamDto {\n");
    
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    vendorItemIdList: ").append(toIndentedString(vendorItemIdList)).append("\n");
    sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
    sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
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

  public static FulfillmentEachVIPddParamDtoBuilder builder() {
    return new FulfillmentEachVIPddParamDtoBuilder();
  }

  public static class FulfillmentEachVIPddParamDtoBuilder {

    private String zipCode = null;
    private List<Long> vendorItemIdList = new ArrayList<Long>();
    private String targetDate = null;
    private Long memberSrl = null;
    

    FulfillmentEachVIPddParamDtoBuilder() {
    }

    /**
     **/
    public FulfillmentEachVIPddParamDtoBuilder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     **/
    public FulfillmentEachVIPddParamDtoBuilder vendorItemIdList(List<Long> vendorItemIdList) {
      this.vendorItemIdList = vendorItemIdList;
      return this;
    }

    /**
     **/
    public FulfillmentEachVIPddParamDtoBuilder targetDate(String targetDate) {
      this.targetDate = targetDate;
      return this;
    }

    /**
     **/
    public FulfillmentEachVIPddParamDtoBuilder memberSrl(Long memberSrl) {
      this.memberSrl = memberSrl;
      return this;
    }


    public FulfillmentEachVIPddParamDto build() {
      FulfillmentEachVIPddParamDto fulfillmentEachVIPddParamDto = new FulfillmentEachVIPddParamDto();
      fulfillmentEachVIPddParamDto.setZipCode(this.zipCode);
      fulfillmentEachVIPddParamDto.setVendorItemIdList(this.vendorItemIdList);
      fulfillmentEachVIPddParamDto.setTargetDate(this.targetDate);
      fulfillmentEachVIPddParamDto.setMemberSrl(this.memberSrl);
      return fulfillmentEachVIPddParamDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FulfillmentEachVIPddParamDtoBuilder {\n");
      
      sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
      sb.append("    vendorItemIdList: ").append(toIndentedString(vendorItemIdList)).append("\n");
      sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
      sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
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

