package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DiscountSourceOptionalPolicyDTO   {
  
  private Integer usableDay = null;
  private Boolean untilMidnight = null;
  private Boolean needVendorAgreement = null;
  private Long minPrice = null;
  private Integer maxPerSource = null;
  private Integer maxPerPerson = null;
  private Integer maxPerDaily = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("usableDay")
  @com.fasterxml.jackson.annotation.JsonProperty("usableDay")
  public Integer getUsableDay() {
    return usableDay;
  }
  
  /**
   **/
  public void setUsableDay(Integer usableDay) {
    this.usableDay = usableDay;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("untilMidnight")
  @com.fasterxml.jackson.annotation.JsonProperty("untilMidnight")
  public Boolean getUntilMidnight() {
    return untilMidnight;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUntilMidnight() {
    return untilMidnight == null ? false : untilMidnight;
  }
  
  /**
   **/
  public void setUntilMidnight(Boolean untilMidnight) {
    this.untilMidnight = untilMidnight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("needVendorAgreement")
  @com.fasterxml.jackson.annotation.JsonProperty("needVendorAgreement")
  public Boolean getNeedVendorAgreement() {
    return needVendorAgreement;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isNeedVendorAgreement() {
    return needVendorAgreement == null ? false : needVendorAgreement;
  }
  
  /**
   **/
  public void setNeedVendorAgreement(Boolean needVendorAgreement) {
    this.needVendorAgreement = needVendorAgreement;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("minPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("minPrice")
  public Long getMinPrice() {
    return minPrice;
  }
  
  /**
   **/
  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerSource")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerSource")
  public Integer getMaxPerSource() {
    return maxPerSource;
  }
  
  /**
   **/
  public void setMaxPerSource(Integer maxPerSource) {
    this.maxPerSource = maxPerSource;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerPerson")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerPerson")
  public Integer getMaxPerPerson() {
    return maxPerPerson;
  }
  
  /**
   **/
  public void setMaxPerPerson(Integer maxPerPerson) {
    this.maxPerPerson = maxPerPerson;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxPerDaily")
  @com.fasterxml.jackson.annotation.JsonProperty("maxPerDaily")
  public Integer getMaxPerDaily() {
    return maxPerDaily;
  }
  
  /**
   **/
  public void setMaxPerDaily(Integer maxPerDaily) {
    this.maxPerDaily = maxPerDaily;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountSourceOptionalPolicyDTO discountSourceOptionalPolicyDTO = (DiscountSourceOptionalPolicyDTO) o;
    return Objects.equals(this.usableDay, discountSourceOptionalPolicyDTO.usableDay) &&
        Objects.equals(this.untilMidnight, discountSourceOptionalPolicyDTO.untilMidnight) &&
        Objects.equals(this.needVendorAgreement, discountSourceOptionalPolicyDTO.needVendorAgreement) &&
        Objects.equals(this.minPrice, discountSourceOptionalPolicyDTO.minPrice) &&
        Objects.equals(this.maxPerSource, discountSourceOptionalPolicyDTO.maxPerSource) &&
        Objects.equals(this.maxPerPerson, discountSourceOptionalPolicyDTO.maxPerPerson) &&
        Objects.equals(this.maxPerDaily, discountSourceOptionalPolicyDTO.maxPerDaily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usableDay, untilMidnight, needVendorAgreement, minPrice, maxPerSource, maxPerPerson, maxPerDaily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountSourceOptionalPolicyDTO {\n");
    
    sb.append("    usableDay: ").append(toIndentedString(usableDay)).append("\n");
    sb.append("    untilMidnight: ").append(toIndentedString(untilMidnight)).append("\n");
    sb.append("    needVendorAgreement: ").append(toIndentedString(needVendorAgreement)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPerSource: ").append(toIndentedString(maxPerSource)).append("\n");
    sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
    sb.append("    maxPerDaily: ").append(toIndentedString(maxPerDaily)).append("\n");
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

  public static DiscountSourceOptionalPolicyDTOBuilder builder() {
    return new DiscountSourceOptionalPolicyDTOBuilder();
  }

  public static class DiscountSourceOptionalPolicyDTOBuilder {

    private Integer usableDay = null;
    private Boolean untilMidnight = null;
    private Boolean needVendorAgreement = null;
    private Long minPrice = null;
    private Integer maxPerSource = null;
    private Integer maxPerPerson = null;
    private Integer maxPerDaily = null;
    

    DiscountSourceOptionalPolicyDTOBuilder() {
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder usableDay(Integer usableDay) {
      this.usableDay = usableDay;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder untilMidnight(Boolean untilMidnight) {
      this.untilMidnight = untilMidnight;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder needVendorAgreement(Boolean needVendorAgreement) {
      this.needVendorAgreement = needVendorAgreement;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder minPrice(Long minPrice) {
      this.minPrice = minPrice;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder maxPerSource(Integer maxPerSource) {
      this.maxPerSource = maxPerSource;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder maxPerPerson(Integer maxPerPerson) {
      this.maxPerPerson = maxPerPerson;
      return this;
    }

    /**
     **/
    public DiscountSourceOptionalPolicyDTOBuilder maxPerDaily(Integer maxPerDaily) {
      this.maxPerDaily = maxPerDaily;
      return this;
    }


    public DiscountSourceOptionalPolicyDTO build() {
      DiscountSourceOptionalPolicyDTO discountSourceOptionalPolicyDTO = new DiscountSourceOptionalPolicyDTO();
      discountSourceOptionalPolicyDTO.setUsableDay(this.usableDay);
      discountSourceOptionalPolicyDTO.setUntilMidnight(this.untilMidnight);
      discountSourceOptionalPolicyDTO.setNeedVendorAgreement(this.needVendorAgreement);
      discountSourceOptionalPolicyDTO.setMinPrice(this.minPrice);
      discountSourceOptionalPolicyDTO.setMaxPerSource(this.maxPerSource);
      discountSourceOptionalPolicyDTO.setMaxPerPerson(this.maxPerPerson);
      discountSourceOptionalPolicyDTO.setMaxPerDaily(this.maxPerDaily);
      return discountSourceOptionalPolicyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiscountSourceOptionalPolicyDTOBuilder {\n");
      
      sb.append("    usableDay: ").append(toIndentedString(usableDay)).append("\n");
      sb.append("    untilMidnight: ").append(toIndentedString(untilMidnight)).append("\n");
      sb.append("    needVendorAgreement: ").append(toIndentedString(needVendorAgreement)).append("\n");
      sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
      sb.append("    maxPerSource: ").append(toIndentedString(maxPerSource)).append("\n");
      sb.append("    maxPerPerson: ").append(toIndentedString(maxPerPerson)).append("\n");
      sb.append("    maxPerDaily: ").append(toIndentedString(maxPerDaily)).append("\n");
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

