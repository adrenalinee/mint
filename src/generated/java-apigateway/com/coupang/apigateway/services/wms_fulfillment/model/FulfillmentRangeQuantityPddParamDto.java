package com.coupang.apigateway.services.wms_fulfillment.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.020+09:00")
public class FulfillmentRangeQuantityPddParamDto   {
  
  private String zipCode = null;
  private Long vendorItemId = null;
  private Integer toQuantity = null;
  private String targetDate = null;
  private Long memberSrl = null;
  private Integer fromQuantity = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("toQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("toQuantity")
  public Integer getToQuantity() {
    return toQuantity;
  }
  
  /**
   **/
  public void setToQuantity(Integer toQuantity) {
    this.toQuantity = toQuantity;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fromQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("fromQuantity")
  public Integer getFromQuantity() {
    return fromQuantity;
  }
  
  /**
   **/
  public void setFromQuantity(Integer fromQuantity) {
    this.fromQuantity = fromQuantity;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto = (FulfillmentRangeQuantityPddParamDto) o;
    return Objects.equals(this.zipCode, fulfillmentRangeQuantityPddParamDto.zipCode) &&
        Objects.equals(this.vendorItemId, fulfillmentRangeQuantityPddParamDto.vendorItemId) &&
        Objects.equals(this.toQuantity, fulfillmentRangeQuantityPddParamDto.toQuantity) &&
        Objects.equals(this.targetDate, fulfillmentRangeQuantityPddParamDto.targetDate) &&
        Objects.equals(this.memberSrl, fulfillmentRangeQuantityPddParamDto.memberSrl) &&
        Objects.equals(this.fromQuantity, fulfillmentRangeQuantityPddParamDto.fromQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, vendorItemId, toQuantity, targetDate, memberSrl, fromQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentRangeQuantityPddParamDto {\n");
    
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    toQuantity: ").append(toIndentedString(toQuantity)).append("\n");
    sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
    sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
    sb.append("    fromQuantity: ").append(toIndentedString(fromQuantity)).append("\n");
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

  public static FulfillmentRangeQuantityPddParamDtoBuilder builder() {
    return new FulfillmentRangeQuantityPddParamDtoBuilder();
  }

  public static class FulfillmentRangeQuantityPddParamDtoBuilder {

    private String zipCode = null;
    private Long vendorItemId = null;
    private Integer toQuantity = null;
    private String targetDate = null;
    private Long memberSrl = null;
    private Integer fromQuantity = null;
    

    FulfillmentRangeQuantityPddParamDtoBuilder() {
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder toQuantity(Integer toQuantity) {
      this.toQuantity = toQuantity;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder targetDate(String targetDate) {
      this.targetDate = targetDate;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder memberSrl(Long memberSrl) {
      this.memberSrl = memberSrl;
      return this;
    }

    /**
     **/
    public FulfillmentRangeQuantityPddParamDtoBuilder fromQuantity(Integer fromQuantity) {
      this.fromQuantity = fromQuantity;
      return this;
    }


    public FulfillmentRangeQuantityPddParamDto build() {
      FulfillmentRangeQuantityPddParamDto fulfillmentRangeQuantityPddParamDto = new FulfillmentRangeQuantityPddParamDto();
      fulfillmentRangeQuantityPddParamDto.setZipCode(this.zipCode);
      fulfillmentRangeQuantityPddParamDto.setVendorItemId(this.vendorItemId);
      fulfillmentRangeQuantityPddParamDto.setToQuantity(this.toQuantity);
      fulfillmentRangeQuantityPddParamDto.setTargetDate(this.targetDate);
      fulfillmentRangeQuantityPddParamDto.setMemberSrl(this.memberSrl);
      fulfillmentRangeQuantityPddParamDto.setFromQuantity(this.fromQuantity);
      return fulfillmentRangeQuantityPddParamDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FulfillmentRangeQuantityPddParamDtoBuilder {\n");
      
      sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    toQuantity: ").append(toIndentedString(toQuantity)).append("\n");
      sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
      sb.append("    memberSrl: ").append(toIndentedString(memberSrl)).append("\n");
      sb.append("    fromQuantity: ").append(toIndentedString(fromQuantity)).append("\n");
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

