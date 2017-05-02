package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class BenefitPolicyDTO   {
  


  public enum TypeEnum {
    RATE("RATE"),
    FIXED("FIXED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private Integer roundUpScale = null;
  private Long maxBenefitAmount = null;
  private Double benefitAmount = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("roundUpScale")
  @com.fasterxml.jackson.annotation.JsonProperty("roundUpScale")
  public Integer getRoundUpScale() {
    return roundUpScale;
  }
  
  /**
   **/
  public void setRoundUpScale(Integer roundUpScale) {
    this.roundUpScale = roundUpScale;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxBenefitAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAmount")
  public Long getMaxBenefitAmount() {
    return maxBenefitAmount;
  }
  
  /**
   **/
  public void setMaxBenefitAmount(Long maxBenefitAmount) {
    this.maxBenefitAmount = maxBenefitAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("benefitAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("benefitAmount")
  public Double getBenefitAmount() {
    return benefitAmount;
  }
  
  /**
   **/
  public void setBenefitAmount(Double benefitAmount) {
    this.benefitAmount = benefitAmount;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitPolicyDTO benefitPolicyDTO = (BenefitPolicyDTO) o;
    return Objects.equals(this.type, benefitPolicyDTO.type) &&
        Objects.equals(this.roundUpScale, benefitPolicyDTO.roundUpScale) &&
        Objects.equals(this.maxBenefitAmount, benefitPolicyDTO.maxBenefitAmount) &&
        Objects.equals(this.benefitAmount, benefitPolicyDTO.benefitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, roundUpScale, maxBenefitAmount, benefitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitPolicyDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    roundUpScale: ").append(toIndentedString(roundUpScale)).append("\n");
    sb.append("    maxBenefitAmount: ").append(toIndentedString(maxBenefitAmount)).append("\n");
    sb.append("    benefitAmount: ").append(toIndentedString(benefitAmount)).append("\n");
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

  public static BenefitPolicyDTOBuilder builder() {
    return new BenefitPolicyDTOBuilder();
  }

  public static class BenefitPolicyDTOBuilder {

    private TypeEnum type = null;
    private Integer roundUpScale = null;
    private Long maxBenefitAmount = null;
    private Double benefitAmount = null;
    

    BenefitPolicyDTOBuilder() {
    }

    /**
     **/
    public BenefitPolicyDTOBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public BenefitPolicyDTOBuilder roundUpScale(Integer roundUpScale) {
      this.roundUpScale = roundUpScale;
      return this;
    }

    /**
     **/
    public BenefitPolicyDTOBuilder maxBenefitAmount(Long maxBenefitAmount) {
      this.maxBenefitAmount = maxBenefitAmount;
      return this;
    }

    /**
     **/
    public BenefitPolicyDTOBuilder benefitAmount(Double benefitAmount) {
      this.benefitAmount = benefitAmount;
      return this;
    }


    public BenefitPolicyDTO build() {
      BenefitPolicyDTO benefitPolicyDTO = new BenefitPolicyDTO();
      benefitPolicyDTO.setType(this.type);
      benefitPolicyDTO.setRoundUpScale(this.roundUpScale);
      benefitPolicyDTO.setMaxBenefitAmount(this.maxBenefitAmount);
      benefitPolicyDTO.setBenefitAmount(this.benefitAmount);
      return benefitPolicyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BenefitPolicyDTOBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    roundUpScale: ").append(toIndentedString(roundUpScale)).append("\n");
      sb.append("    maxBenefitAmount: ").append(toIndentedString(maxBenefitAmount)).append("\n");
      sb.append("    benefitAmount: ").append(toIndentedString(benefitAmount)).append("\n");
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

