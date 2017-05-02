package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemPriceDto   {
  
  private Date startedAt = null;
  private String priceTypeComment = null;
  private String priceType = null;
  private java.math.BigDecimal price = null;
  private Long itemPriceId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
  public Date getStartedAt() {
    return startedAt;
  }
  
  /**
   **/
  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priceTypeComment")
  @com.fasterxml.jackson.annotation.JsonProperty("priceTypeComment")
  public String getPriceTypeComment() {
    return priceTypeComment;
  }
  
  /**
   **/
  public void setPriceTypeComment(String priceTypeComment) {
    this.priceTypeComment = priceTypeComment;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("priceType")
  @com.fasterxml.jackson.annotation.JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }
  
  /**
   **/
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("price")
  @com.fasterxml.jackson.annotation.JsonProperty("price")
  public java.math.BigDecimal getPrice() {
    return price;
  }
  
  /**
   **/
  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemPriceId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemPriceId")
  public Long getItemPriceId() {
    return itemPriceId;
  }
  
  /**
   **/
  public void setItemPriceId(Long itemPriceId) {
    this.itemPriceId = itemPriceId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPriceDto itemPriceDto = (ItemPriceDto) o;
    return Objects.equals(this.startedAt, itemPriceDto.startedAt) &&
        Objects.equals(this.priceTypeComment, itemPriceDto.priceTypeComment) &&
        Objects.equals(this.priceType, itemPriceDto.priceType) &&
        Objects.equals(this.price, itemPriceDto.price) &&
        Objects.equals(this.itemPriceId, itemPriceDto.itemPriceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, priceTypeComment, priceType, price, itemPriceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPriceDto {\n");
    
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    priceTypeComment: ").append(toIndentedString(priceTypeComment)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    itemPriceId: ").append(toIndentedString(itemPriceId)).append("\n");
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

  public static ItemPriceDtoBuilder builder() {
    return new ItemPriceDtoBuilder();
  }

  public static class ItemPriceDtoBuilder {

    private Date startedAt = null;
    private String priceTypeComment = null;
    private String priceType = null;
    private java.math.BigDecimal price = null;
    private Long itemPriceId = null;
    

    ItemPriceDtoBuilder() {
    }

    /**
     **/
    public ItemPriceDtoBuilder startedAt(Date startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     **/
    public ItemPriceDtoBuilder priceTypeComment(String priceTypeComment) {
      this.priceTypeComment = priceTypeComment;
      return this;
    }

    /**
     **/
    public ItemPriceDtoBuilder priceType(String priceType) {
      this.priceType = priceType;
      return this;
    }

    /**
     **/
    public ItemPriceDtoBuilder price(java.math.BigDecimal price) {
      this.price = price;
      return this;
    }

    /**
     **/
    public ItemPriceDtoBuilder itemPriceId(Long itemPriceId) {
      this.itemPriceId = itemPriceId;
      return this;
    }


    public ItemPriceDto build() {
      ItemPriceDto itemPriceDto = new ItemPriceDto();
      itemPriceDto.setStartedAt(this.startedAt);
      itemPriceDto.setPriceTypeComment(this.priceTypeComment);
      itemPriceDto.setPriceType(this.priceType);
      itemPriceDto.setPrice(this.price);
      itemPriceDto.setItemPriceId(this.itemPriceId);
      return itemPriceDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemPriceDtoBuilder {\n");
      
      sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
      sb.append("    priceTypeComment: ").append(toIndentedString(priceTypeComment)).append("\n");
      sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
      sb.append("    price: ").append(toIndentedString(price)).append("\n");
      sb.append("    itemPriceId: ").append(toIndentedString(itemPriceId)).append("\n");
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

