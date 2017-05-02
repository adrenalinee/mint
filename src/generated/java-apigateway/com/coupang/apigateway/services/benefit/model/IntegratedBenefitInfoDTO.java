package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import com.coupang.apigateway.services.benefit.model.BenefitInfoDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class IntegratedBenefitInfoDTO   {
  
  private Long rewardCashAmount = null;
  private Long discountAmount = null;
  private List<BenefitInfoDTO> benefitInfoDTOs = new ArrayList<BenefitInfoDTO>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rewardCashAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("rewardCashAmount")
  public Long getRewardCashAmount() {
    return rewardCashAmount;
  }
  
  /**
   **/
  public void setRewardCashAmount(Long rewardCashAmount) {
    this.rewardCashAmount = rewardCashAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountAmount")
  @com.fasterxml.jackson.annotation.JsonProperty("discountAmount")
  public Long getDiscountAmount() {
    return discountAmount;
  }
  
  /**
   **/
  public void setDiscountAmount(Long discountAmount) {
    this.discountAmount = discountAmount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("benefitInfoDTOs")
  @com.fasterxml.jackson.annotation.JsonProperty("benefitInfoDTOs")
  public List<BenefitInfoDTO> getBenefitInfoDTOs() {
    return benefitInfoDTOs;
  }
  
  /**
   **/
  public void setBenefitInfoDTOs(List<BenefitInfoDTO> benefitInfoDTOs) {
    this.benefitInfoDTOs = benefitInfoDTOs;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegratedBenefitInfoDTO integratedBenefitInfoDTO = (IntegratedBenefitInfoDTO) o;
    return Objects.equals(this.rewardCashAmount, integratedBenefitInfoDTO.rewardCashAmount) &&
        Objects.equals(this.discountAmount, integratedBenefitInfoDTO.discountAmount) &&
        Objects.equals(this.benefitInfoDTOs, integratedBenefitInfoDTO.benefitInfoDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardCashAmount, discountAmount, benefitInfoDTOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegratedBenefitInfoDTO {\n");
    
    sb.append("    rewardCashAmount: ").append(toIndentedString(rewardCashAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    benefitInfoDTOs: ").append(toIndentedString(benefitInfoDTOs)).append("\n");
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

  public static IntegratedBenefitInfoDTOBuilder builder() {
    return new IntegratedBenefitInfoDTOBuilder();
  }

  public static class IntegratedBenefitInfoDTOBuilder {

    private Long rewardCashAmount = null;
    private Long discountAmount = null;
    private List<BenefitInfoDTO> benefitInfoDTOs = new ArrayList<BenefitInfoDTO>();
    

    IntegratedBenefitInfoDTOBuilder() {
    }

    /**
     **/
    public IntegratedBenefitInfoDTOBuilder rewardCashAmount(Long rewardCashAmount) {
      this.rewardCashAmount = rewardCashAmount;
      return this;
    }

    /**
     **/
    public IntegratedBenefitInfoDTOBuilder discountAmount(Long discountAmount) {
      this.discountAmount = discountAmount;
      return this;
    }

    /**
     **/
    public IntegratedBenefitInfoDTOBuilder benefitInfoDTOs(List<BenefitInfoDTO> benefitInfoDTOs) {
      this.benefitInfoDTOs = benefitInfoDTOs;
      return this;
    }


    public IntegratedBenefitInfoDTO build() {
      IntegratedBenefitInfoDTO integratedBenefitInfoDTO = new IntegratedBenefitInfoDTO();
      integratedBenefitInfoDTO.setRewardCashAmount(this.rewardCashAmount);
      integratedBenefitInfoDTO.setDiscountAmount(this.discountAmount);
      integratedBenefitInfoDTO.setBenefitInfoDTOs(this.benefitInfoDTOs);
      return integratedBenefitInfoDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IntegratedBenefitInfoDTOBuilder {\n");
      
      sb.append("    rewardCashAmount: ").append(toIndentedString(rewardCashAmount)).append("\n");
      sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
      sb.append("    benefitInfoDTOs: ").append(toIndentedString(benefitInfoDTOs)).append("\n");
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

