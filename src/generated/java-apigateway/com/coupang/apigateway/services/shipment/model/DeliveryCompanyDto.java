package com.coupang.apigateway.services.shipment.model;

import java.util.Objects;



/**
 * 택배사 모델
 **/

@io.swagger.annotations.ApiModel(description = "택배사 모델")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.890+09:00")
public class DeliveryCompanyDto   {
  
  private String trackingUrl = null;
  private Boolean returnable = null;
  private Boolean returnInvoiceNumberRequired = null;
  private String repName = null;
  private String internalCode = null;
  private String externalCode = null;
  private String companyName = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "배송추적제공 URL")
  @org.codehaus.jackson.annotate.JsonProperty("trackingUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("trackingUrl")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  
  /**
   * 배송추적제공 URL
   **/
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", value = "회수 지시 가능 여부")
  @org.codehaus.jackson.annotate.JsonProperty("returnable")
  @com.fasterxml.jackson.annotation.JsonProperty("returnable")
  public Boolean getReturnable() {
    return returnable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnable() {
    return returnable == null ? false : returnable;
  }
  
  /**
   * 회수 지시 가능 여부
   **/
  public void setReturnable(Boolean returnable) {
    this.returnable = returnable;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", value = "회수 연동시 송장 번호 필수 여부")
  @org.codehaus.jackson.annotate.JsonProperty("returnInvoiceNumberRequired")
  @com.fasterxml.jackson.annotation.JsonProperty("returnInvoiceNumberRequired")
  public Boolean getReturnInvoiceNumberRequired() {
    return returnInvoiceNumberRequired;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReturnInvoiceNumberRequired() {
    return returnInvoiceNumberRequired == null ? false : returnInvoiceNumberRequired;
  }
  
  /**
   * 회수 연동시 송장 번호 필수 여부
   **/
  public void setReturnInvoiceNumberRequired(Boolean returnInvoiceNumberRequired) {
    this.returnInvoiceNumberRequired = returnInvoiceNumberRequired;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "대표이름(기존 Enum 명)")
  @org.codehaus.jackson.annotate.JsonProperty("repName")
  @com.fasterxml.jackson.annotation.JsonProperty("repName")
  public String getRepName() {
    return repName;
  }
  
  /**
   * 대표이름(기존 Enum 명)
   **/
  public void setRepName(String repName) {
    this.repName = repName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "내부 코드(쿠팡에서 관리하는 택배사 코드)")
  @org.codehaus.jackson.annotate.JsonProperty("internalCode")
  @com.fasterxml.jackson.annotation.JsonProperty("internalCode")
  public String getInternalCode() {
    return internalCode;
  }
  
  /**
   * 내부 코드(쿠팡에서 관리하는 택배사 코드)
   **/
  public void setInternalCode(String internalCode) {
    this.internalCode = internalCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "외부 코드(굿스플로 코드, 그 외 택배사 코드)")
  @org.codehaus.jackson.annotate.JsonProperty("externalCode")
  @com.fasterxml.jackson.annotation.JsonProperty("externalCode")
  public String getExternalCode() {
    return externalCode;
  }
  
  /**
   * 외부 코드(굿스플로 코드, 그 외 택배사 코드)
   **/
  public void setExternalCode(String externalCode) {
    this.externalCode = externalCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "택배사 이름")
  @org.codehaus.jackson.annotate.JsonProperty("companyName")
  @com.fasterxml.jackson.annotation.JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }
  
  /**
   * 택배사 이름
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryCompanyDto deliveryCompanyDto = (DeliveryCompanyDto) o;
    return Objects.equals(this.trackingUrl, deliveryCompanyDto.trackingUrl) &&
        Objects.equals(this.returnable, deliveryCompanyDto.returnable) &&
        Objects.equals(this.returnInvoiceNumberRequired, deliveryCompanyDto.returnInvoiceNumberRequired) &&
        Objects.equals(this.repName, deliveryCompanyDto.repName) &&
        Objects.equals(this.internalCode, deliveryCompanyDto.internalCode) &&
        Objects.equals(this.externalCode, deliveryCompanyDto.externalCode) &&
        Objects.equals(this.companyName, deliveryCompanyDto.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingUrl, returnable, returnInvoiceNumberRequired, repName, internalCode, externalCode, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryCompanyDto {\n");
    
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    returnable: ").append(toIndentedString(returnable)).append("\n");
    sb.append("    returnInvoiceNumberRequired: ").append(toIndentedString(returnInvoiceNumberRequired)).append("\n");
    sb.append("    repName: ").append(toIndentedString(repName)).append("\n");
    sb.append("    internalCode: ").append(toIndentedString(internalCode)).append("\n");
    sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

  public static DeliveryCompanyDtoBuilder builder() {
    return new DeliveryCompanyDtoBuilder();
  }

  public static class DeliveryCompanyDtoBuilder {

    private String trackingUrl = null;
    private Boolean returnable = null;
    private Boolean returnInvoiceNumberRequired = null;
    private String repName = null;
    private String internalCode = null;
    private String externalCode = null;
    private String companyName = null;
    

    DeliveryCompanyDtoBuilder() {
    }

    /**
     * 배송추적제공 URL
     **/
    public DeliveryCompanyDtoBuilder trackingUrl(String trackingUrl) {
      this.trackingUrl = trackingUrl;
      return this;
    }

    /**
     * 회수 지시 가능 여부
     **/
    public DeliveryCompanyDtoBuilder returnable(Boolean returnable) {
      this.returnable = returnable;
      return this;
    }

    /**
     * 회수 연동시 송장 번호 필수 여부
     **/
    public DeliveryCompanyDtoBuilder returnInvoiceNumberRequired(Boolean returnInvoiceNumberRequired) {
      this.returnInvoiceNumberRequired = returnInvoiceNumberRequired;
      return this;
    }

    /**
     * 대표이름(기존 Enum 명)
     **/
    public DeliveryCompanyDtoBuilder repName(String repName) {
      this.repName = repName;
      return this;
    }

    /**
     * 내부 코드(쿠팡에서 관리하는 택배사 코드)
     **/
    public DeliveryCompanyDtoBuilder internalCode(String internalCode) {
      this.internalCode = internalCode;
      return this;
    }

    /**
     * 외부 코드(굿스플로 코드, 그 외 택배사 코드)
     **/
    public DeliveryCompanyDtoBuilder externalCode(String externalCode) {
      this.externalCode = externalCode;
      return this;
    }

    /**
     * 택배사 이름
     **/
    public DeliveryCompanyDtoBuilder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }


    public DeliveryCompanyDto build() {
      DeliveryCompanyDto deliveryCompanyDto = new DeliveryCompanyDto();
      deliveryCompanyDto.setTrackingUrl(this.trackingUrl);
      deliveryCompanyDto.setReturnable(this.returnable);
      deliveryCompanyDto.setReturnInvoiceNumberRequired(this.returnInvoiceNumberRequired);
      deliveryCompanyDto.setRepName(this.repName);
      deliveryCompanyDto.setInternalCode(this.internalCode);
      deliveryCompanyDto.setExternalCode(this.externalCode);
      deliveryCompanyDto.setCompanyName(this.companyName);
      return deliveryCompanyDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryCompanyDtoBuilder {\n");
      
      sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
      sb.append("    returnable: ").append(toIndentedString(returnable)).append("\n");
      sb.append("    returnInvoiceNumberRequired: ").append(toIndentedString(returnInvoiceNumberRequired)).append("\n");
      sb.append("    repName: ").append(toIndentedString(repName)).append("\n");
      sb.append("    internalCode: ").append(toIndentedString(internalCode)).append("\n");
      sb.append("    externalCode: ").append(toIndentedString(externalCode)).append("\n");
      sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

