package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class DiscountSourcePolicyDTO   {
  
  private String title = null;
  private Long maxDiscountPrice = null;
  private String manageCode = null;
  private String discountType = null;
  private Double discount = null;
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxDiscountPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("maxDiscountPrice")
  public Long getMaxDiscountPrice() {
    return maxDiscountPrice;
  }
  
  /**
   **/
  public void setMaxDiscountPrice(Long maxDiscountPrice) {
    this.maxDiscountPrice = maxDiscountPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("manageCode")
  @com.fasterxml.jackson.annotation.JsonProperty("manageCode")
  public String getManageCode() {
    return manageCode;
  }
  
  /**
   **/
  public void setManageCode(String manageCode) {
    this.manageCode = manageCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discountType")
  @com.fasterxml.jackson.annotation.JsonProperty("discountType")
  public String getDiscountType() {
    return discountType;
  }
  
  /**
   **/
  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("discount")
  @com.fasterxml.jackson.annotation.JsonProperty("discount")
  public Double getDiscount() {
    return discount;
  }
  
  /**
   **/
  public void setDiscount(Double discount) {
    this.discount = discount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountSourcePolicyDTO discountSourcePolicyDTO = (DiscountSourcePolicyDTO) o;
    return Objects.equals(this.title, discountSourcePolicyDTO.title) &&
        Objects.equals(this.maxDiscountPrice, discountSourcePolicyDTO.maxDiscountPrice) &&
        Objects.equals(this.manageCode, discountSourcePolicyDTO.manageCode) &&
        Objects.equals(this.discountType, discountSourcePolicyDTO.discountType) &&
        Objects.equals(this.discount, discountSourcePolicyDTO.discount) &&
        Objects.equals(this.description, discountSourcePolicyDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, maxDiscountPrice, manageCode, discountType, discount, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountSourcePolicyDTO {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    maxDiscountPrice: ").append(toIndentedString(maxDiscountPrice)).append("\n");
    sb.append("    manageCode: ").append(toIndentedString(manageCode)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static DiscountSourcePolicyDTOBuilder builder() {
    return new DiscountSourcePolicyDTOBuilder();
  }

  public static class DiscountSourcePolicyDTOBuilder {

    private String title = null;
    private Long maxDiscountPrice = null;
    private String manageCode = null;
    private String discountType = null;
    private Double discount = null;
    private String description = null;
    

    DiscountSourcePolicyDTOBuilder() {
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder maxDiscountPrice(Long maxDiscountPrice) {
      this.maxDiscountPrice = maxDiscountPrice;
      return this;
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder manageCode(String manageCode) {
      this.manageCode = manageCode;
      return this;
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder discountType(String discountType) {
      this.discountType = discountType;
      return this;
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder discount(Double discount) {
      this.discount = discount;
      return this;
    }

    /**
     **/
    public DiscountSourcePolicyDTOBuilder description(String description) {
      this.description = description;
      return this;
    }


    public DiscountSourcePolicyDTO build() {
      DiscountSourcePolicyDTO discountSourcePolicyDTO = new DiscountSourcePolicyDTO();
      discountSourcePolicyDTO.setTitle(this.title);
      discountSourcePolicyDTO.setMaxDiscountPrice(this.maxDiscountPrice);
      discountSourcePolicyDTO.setManageCode(this.manageCode);
      discountSourcePolicyDTO.setDiscountType(this.discountType);
      discountSourcePolicyDTO.setDiscount(this.discount);
      discountSourcePolicyDTO.setDescription(this.description);
      return discountSourcePolicyDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiscountSourcePolicyDTOBuilder {\n");
      
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    maxDiscountPrice: ").append(toIndentedString(maxDiscountPrice)).append("\n");
      sb.append("    manageCode: ").append(toIndentedString(manageCode)).append("\n");
      sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
      sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

