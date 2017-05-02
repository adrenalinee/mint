package com.coupang.apigateway.services.buybox.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.784+09:00")
public class PromotionDto   {
  
  private Long vendorItemId = null;
  private String vendorId = null;
  private String reason = null;
  private Long itemId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reason")
  @com.fasterxml.jackson.annotation.JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  
  /**
   **/
  public void setReason(String reason) {
    this.reason = reason;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionDto promotionDto = (PromotionDto) o;
    return Objects.equals(this.vendorItemId, promotionDto.vendorItemId) &&
        Objects.equals(this.vendorId, promotionDto.vendorId) &&
        Objects.equals(this.reason, promotionDto.reason) &&
        Objects.equals(this.itemId, promotionDto.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, vendorId, reason, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

  public static PromotionDtoBuilder builder() {
    return new PromotionDtoBuilder();
  }

  public static class PromotionDtoBuilder {

    private Long vendorItemId = null;
    private String vendorId = null;
    private String reason = null;
    private Long itemId = null;
    

    PromotionDtoBuilder() {
    }

    /**
     **/
    public PromotionDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public PromotionDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public PromotionDtoBuilder reason(String reason) {
      this.reason = reason;
      return this;
    }

    /**
     **/
    public PromotionDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }


    public PromotionDto build() {
      PromotionDto promotionDto = new PromotionDto();
      promotionDto.setVendorItemId(this.vendorItemId);
      promotionDto.setVendorId(this.vendorId);
      promotionDto.setReason(this.reason);
      promotionDto.setItemId(this.itemId);
      return promotionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PromotionDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

