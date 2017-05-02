package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerStatusDto   {
  
  private Long productId = null;
  private Boolean ordered = null;
  private Long orderId = null;
  private Boolean couponIssuedAlready = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordered")
  @com.fasterxml.jackson.annotation.JsonProperty("ordered")
  public Boolean getOrdered() {
    return ordered;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOrdered() {
    return ordered == null ? false : ordered;
  }
  
  /**
   **/
  public void setOrdered(Boolean ordered) {
    this.ordered = ordered;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderId")
  @com.fasterxml.jackson.annotation.JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  
  /**
   **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("couponIssuedAlready")
  @com.fasterxml.jackson.annotation.JsonProperty("couponIssuedAlready")
  public Boolean getCouponIssuedAlready() {
    return couponIssuedAlready;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCouponIssuedAlready() {
    return couponIssuedAlready == null ? false : couponIssuedAlready;
  }
  
  /**
   **/
  public void setCouponIssuedAlready(Boolean couponIssuedAlready) {
    this.couponIssuedAlready = couponIssuedAlready;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerStatusDto adventurerStatusDto = (AdventurerStatusDto) o;
    return Objects.equals(this.productId, adventurerStatusDto.productId) &&
        Objects.equals(this.ordered, adventurerStatusDto.ordered) &&
        Objects.equals(this.orderId, adventurerStatusDto.orderId) &&
        Objects.equals(this.couponIssuedAlready, adventurerStatusDto.couponIssuedAlready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, ordered, orderId, couponIssuedAlready);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerStatusDto {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    ordered: ").append(toIndentedString(ordered)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    couponIssuedAlready: ").append(toIndentedString(couponIssuedAlready)).append("\n");
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

  public static AdventurerStatusDtoBuilder builder() {
    return new AdventurerStatusDtoBuilder();
  }

  public static class AdventurerStatusDtoBuilder {

    private Long productId = null;
    private Boolean ordered = null;
    private Long orderId = null;
    private Boolean couponIssuedAlready = null;
    

    AdventurerStatusDtoBuilder() {
    }

    /**
     **/
    public AdventurerStatusDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public AdventurerStatusDtoBuilder ordered(Boolean ordered) {
      this.ordered = ordered;
      return this;
    }

    /**
     **/
    public AdventurerStatusDtoBuilder orderId(Long orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     **/
    public AdventurerStatusDtoBuilder couponIssuedAlready(Boolean couponIssuedAlready) {
      this.couponIssuedAlready = couponIssuedAlready;
      return this;
    }


    public AdventurerStatusDto build() {
      AdventurerStatusDto adventurerStatusDto = new AdventurerStatusDto();
      adventurerStatusDto.setProductId(this.productId);
      adventurerStatusDto.setOrdered(this.ordered);
      adventurerStatusDto.setOrderId(this.orderId);
      adventurerStatusDto.setCouponIssuedAlready(this.couponIssuedAlready);
      return adventurerStatusDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerStatusDtoBuilder {\n");
      
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    ordered: ").append(toIndentedString(ordered)).append("\n");
      sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
      sb.append("    couponIssuedAlready: ").append(toIndentedString(couponIssuedAlready)).append("\n");
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

