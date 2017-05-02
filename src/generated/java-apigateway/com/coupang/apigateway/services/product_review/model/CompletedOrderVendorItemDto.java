package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class CompletedOrderVendorItemDto   {
  
  private Long vendorItemId = null;
  private Long reviewCategoryId = null;
  private String productName = null;
  private Long productId = null;
  private Date orderAt = null;
  private String itemName = null;
  private String itemImagePath = null;
  private Long itemId = null;
  private String itemDisplayName = null;
  private Long completedOrderVendorItemId = null;
  private Long categoryId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewCategoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCategoryId")
  public Long getReviewCategoryId() {
    return reviewCategoryId;
  }
  
  /**
   **/
  public void setReviewCategoryId(Long reviewCategoryId) {
    this.reviewCategoryId = reviewCategoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productName")
  @com.fasterxml.jackson.annotation.JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  
  /**
   **/
  public void setProductName(String productName) {
    this.productName = productName;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("orderAt")
  @com.fasterxml.jackson.annotation.JsonProperty("orderAt")
  public Date getOrderAt() {
    return orderAt;
  }
  
  /**
   **/
  public void setOrderAt(Date orderAt) {
    this.orderAt = orderAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }
  
  /**
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImagePath")
  public String getItemImagePath() {
    return itemImagePath;
  }
  
  /**
   **/
  public void setItemImagePath(String itemImagePath) {
    this.itemImagePath = itemImagePath;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemDisplayName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemDisplayName")
  public String getItemDisplayName() {
    return itemDisplayName;
  }
  
  /**
   **/
  public void setItemDisplayName(String itemDisplayName) {
    this.itemDisplayName = itemDisplayName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("completedOrderVendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("completedOrderVendorItemId")
  public Long getCompletedOrderVendorItemId() {
    return completedOrderVendorItemId;
  }
  
  /**
   **/
  public void setCompletedOrderVendorItemId(Long completedOrderVendorItemId) {
    this.completedOrderVendorItemId = completedOrderVendorItemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletedOrderVendorItemDto completedOrderVendorItemDto = (CompletedOrderVendorItemDto) o;
    return Objects.equals(this.vendorItemId, completedOrderVendorItemDto.vendorItemId) &&
        Objects.equals(this.reviewCategoryId, completedOrderVendorItemDto.reviewCategoryId) &&
        Objects.equals(this.productName, completedOrderVendorItemDto.productName) &&
        Objects.equals(this.productId, completedOrderVendorItemDto.productId) &&
        Objects.equals(this.orderAt, completedOrderVendorItemDto.orderAt) &&
        Objects.equals(this.itemName, completedOrderVendorItemDto.itemName) &&
        Objects.equals(this.itemImagePath, completedOrderVendorItemDto.itemImagePath) &&
        Objects.equals(this.itemId, completedOrderVendorItemDto.itemId) &&
        Objects.equals(this.itemDisplayName, completedOrderVendorItemDto.itemDisplayName) &&
        Objects.equals(this.completedOrderVendorItemId, completedOrderVendorItemDto.completedOrderVendorItemId) &&
        Objects.equals(this.categoryId, completedOrderVendorItemDto.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, reviewCategoryId, productName, productId, orderAt, itemName, itemImagePath, itemId, itemDisplayName, completedOrderVendorItemId, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedOrderVendorItemDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    orderAt: ").append(toIndentedString(orderAt)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemDisplayName: ").append(toIndentedString(itemDisplayName)).append("\n");
    sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

  public static CompletedOrderVendorItemDtoBuilder builder() {
    return new CompletedOrderVendorItemDtoBuilder();
  }

  public static class CompletedOrderVendorItemDtoBuilder {

    private Long vendorItemId = null;
    private Long reviewCategoryId = null;
    private String productName = null;
    private Long productId = null;
    private Date orderAt = null;
    private String itemName = null;
    private String itemImagePath = null;
    private Long itemId = null;
    private String itemDisplayName = null;
    private Long completedOrderVendorItemId = null;
    private Long categoryId = null;
    

    CompletedOrderVendorItemDtoBuilder() {
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder reviewCategoryId(Long reviewCategoryId) {
      this.reviewCategoryId = reviewCategoryId;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder orderAt(Date orderAt) {
      this.orderAt = orderAt;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder itemDisplayName(String itemDisplayName) {
      this.itemDisplayName = itemDisplayName;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder completedOrderVendorItemId(Long completedOrderVendorItemId) {
      this.completedOrderVendorItemId = completedOrderVendorItemId;
      return this;
    }

    /**
     **/
    public CompletedOrderVendorItemDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    public CompletedOrderVendorItemDto build() {
      CompletedOrderVendorItemDto completedOrderVendorItemDto = new CompletedOrderVendorItemDto();
      completedOrderVendorItemDto.setVendorItemId(this.vendorItemId);
      completedOrderVendorItemDto.setReviewCategoryId(this.reviewCategoryId);
      completedOrderVendorItemDto.setProductName(this.productName);
      completedOrderVendorItemDto.setProductId(this.productId);
      completedOrderVendorItemDto.setOrderAt(this.orderAt);
      completedOrderVendorItemDto.setItemName(this.itemName);
      completedOrderVendorItemDto.setItemImagePath(this.itemImagePath);
      completedOrderVendorItemDto.setItemId(this.itemId);
      completedOrderVendorItemDto.setItemDisplayName(this.itemDisplayName);
      completedOrderVendorItemDto.setCompletedOrderVendorItemId(this.completedOrderVendorItemId);
      completedOrderVendorItemDto.setCategoryId(this.categoryId);
      return completedOrderVendorItemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CompletedOrderVendorItemDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    orderAt: ").append(toIndentedString(orderAt)).append("\n");
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    itemDisplayName: ").append(toIndentedString(itemDisplayName)).append("\n");
      sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

