package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class ItemBundleDto   {
  
  private Date startedAt = null;
  private Integer quantity = null;
  private java.math.BigDecimal price = null;
  private Long parentItemId = null;
  private Long itemId = null;
  private Long itemBundleId = null;
  private Boolean criterion = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  
  /**
   **/
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("parentItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("parentItemId")
  public Long getParentItemId() {
    return parentItemId;
  }
  
  /**
   **/
  public void setParentItemId(Long parentItemId) {
    this.parentItemId = parentItemId;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemBundleId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemBundleId")
  public Long getItemBundleId() {
    return itemBundleId;
  }
  
  /**
   **/
  public void setItemBundleId(Long itemBundleId) {
    this.itemBundleId = itemBundleId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("criterion")
  @com.fasterxml.jackson.annotation.JsonProperty("criterion")
  public Boolean getCriterion() {
    return criterion;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCriterion() {
    return criterion == null ? false : criterion;
  }
  
  /**
   **/
  public void setCriterion(Boolean criterion) {
    this.criterion = criterion;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBundleDto itemBundleDto = (ItemBundleDto) o;
    return Objects.equals(this.startedAt, itemBundleDto.startedAt) &&
        Objects.equals(this.quantity, itemBundleDto.quantity) &&
        Objects.equals(this.price, itemBundleDto.price) &&
        Objects.equals(this.parentItemId, itemBundleDto.parentItemId) &&
        Objects.equals(this.itemId, itemBundleDto.itemId) &&
        Objects.equals(this.itemBundleId, itemBundleDto.itemBundleId) &&
        Objects.equals(this.criterion, itemBundleDto.criterion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt, quantity, price, parentItemId, itemId, itemBundleId, criterion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBundleDto {\n");
    
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemBundleId: ").append(toIndentedString(itemBundleId)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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

  public static ItemBundleDtoBuilder builder() {
    return new ItemBundleDtoBuilder();
  }

  public static class ItemBundleDtoBuilder {

    private Date startedAt = null;
    private Integer quantity = null;
    private java.math.BigDecimal price = null;
    private Long parentItemId = null;
    private Long itemId = null;
    private Long itemBundleId = null;
    private Boolean criterion = null;
    

    ItemBundleDtoBuilder() {
    }

    /**
     **/
    public ItemBundleDtoBuilder startedAt(Date startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder price(java.math.BigDecimal price) {
      this.price = price;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder parentItemId(Long parentItemId) {
      this.parentItemId = parentItemId;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder itemBundleId(Long itemBundleId) {
      this.itemBundleId = itemBundleId;
      return this;
    }

    /**
     **/
    public ItemBundleDtoBuilder criterion(Boolean criterion) {
      this.criterion = criterion;
      return this;
    }


    public ItemBundleDto build() {
      ItemBundleDto itemBundleDto = new ItemBundleDto();
      itemBundleDto.setStartedAt(this.startedAt);
      itemBundleDto.setQuantity(this.quantity);
      itemBundleDto.setPrice(this.price);
      itemBundleDto.setParentItemId(this.parentItemId);
      itemBundleDto.setItemId(this.itemId);
      itemBundleDto.setItemBundleId(this.itemBundleId);
      itemBundleDto.setCriterion(this.criterion);
      return itemBundleDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemBundleDtoBuilder {\n");
      
      sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    price: ").append(toIndentedString(price)).append("\n");
      sb.append("    parentItemId: ").append(toIndentedString(parentItemId)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    itemBundleId: ").append(toIndentedString(itemBundleId)).append("\n");
      sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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

