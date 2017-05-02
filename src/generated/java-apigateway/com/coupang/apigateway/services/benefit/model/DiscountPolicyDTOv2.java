package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class DiscountPolicyDTOv2   {
  


  public enum TypeEnum {
    PRICE("PRICE"),
    FIXED_WITH_QUANTITY("FIXED_WITH_QUANTITY"),
    RATE("RATE");

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
  private Long maxDiscountPrice = null;
  private Double discount = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountPolicyDTOv2 discountPolicyDTOv2 = (DiscountPolicyDTOv2) o;
    return Objects.equals(this.type, discountPolicyDTOv2.type) &&
        Objects.equals(this.maxDiscountPrice, discountPolicyDTOv2.maxDiscountPrice) &&
        Objects.equals(this.discount, discountPolicyDTOv2.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, maxDiscountPrice, discount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountPolicyDTOv2 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maxDiscountPrice: ").append(toIndentedString(maxDiscountPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

  public static DiscountPolicyDTOv2Builder builder() {
    return new DiscountPolicyDTOv2Builder();
  }

  public static class DiscountPolicyDTOv2Builder {

    private TypeEnum type = null;
    private Long maxDiscountPrice = null;
    private Double discount = null;
    

    DiscountPolicyDTOv2Builder() {
    }

    /**
     **/
    public DiscountPolicyDTOv2Builder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DiscountPolicyDTOv2Builder maxDiscountPrice(Long maxDiscountPrice) {
      this.maxDiscountPrice = maxDiscountPrice;
      return this;
    }

    /**
     **/
    public DiscountPolicyDTOv2Builder discount(Double discount) {
      this.discount = discount;
      return this;
    }


    public DiscountPolicyDTOv2 build() {
      DiscountPolicyDTOv2 discountPolicyDTOv2 = new DiscountPolicyDTOv2();
      discountPolicyDTOv2.setType(this.type);
      discountPolicyDTOv2.setMaxDiscountPrice(this.maxDiscountPrice);
      discountPolicyDTOv2.setDiscount(this.discount);
      return discountPolicyDTOv2;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiscountPolicyDTOv2Builder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    maxDiscountPrice: ").append(toIndentedString(maxDiscountPrice)).append("\n");
      sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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

