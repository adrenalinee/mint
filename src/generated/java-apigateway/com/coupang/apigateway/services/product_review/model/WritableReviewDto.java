package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AdventurerGroupDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class WritableReviewDto   {
  
  private Long vendorItemId = null;
  private Long reviewId = null;
  private Integer rating = null;
  private Long productId = null;
  private Long orderId = null;
  private String orderDate = null;
  private String itemName = null;
  private String itemImagePath = null;
  private Long itemId = null;
  private String divisionType = null;
  private Long completedOrderVendorItemId = null;
  private AdventurerGroupDto adventurerGroupDto = null;
  private Boolean adventurer = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewId")
  public Long getReviewId() {
    return reviewId;
  }
  
  /**
   **/
  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rating")
  @com.fasterxml.jackson.annotation.JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  
  /**
   **/
  public void setRating(Integer rating) {
    this.rating = rating;
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
  
  @io.swagger.annotations.ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss", value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderDate")
  @com.fasterxml.jackson.annotation.JsonProperty("orderDate")
  public String getOrderDate() {
    return orderDate;
  }
  
  /**
   **/
  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
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
  @org.codehaus.jackson.annotate.JsonProperty("divisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("divisionType")
  public String getDivisionType() {
    return divisionType;
  }
  
  /**
   **/
  public void setDivisionType(String divisionType) {
    this.divisionType = divisionType;
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
  @org.codehaus.jackson.annotate.JsonProperty("adventurerGroupDto")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerGroupDto")
  public AdventurerGroupDto getAdventurerGroupDto() {
    return adventurerGroupDto;
  }
  
  /**
   **/
  public void setAdventurerGroupDto(AdventurerGroupDto adventurerGroupDto) {
    this.adventurerGroupDto = adventurerGroupDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurer")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurer")
  public Boolean getAdventurer() {
    return adventurer;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdventurer() {
    return adventurer == null ? false : adventurer;
  }
  
  /**
   **/
  public void setAdventurer(Boolean adventurer) {
    this.adventurer = adventurer;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WritableReviewDto writableReviewDto = (WritableReviewDto) o;
    return Objects.equals(this.vendorItemId, writableReviewDto.vendorItemId) &&
        Objects.equals(this.reviewId, writableReviewDto.reviewId) &&
        Objects.equals(this.rating, writableReviewDto.rating) &&
        Objects.equals(this.productId, writableReviewDto.productId) &&
        Objects.equals(this.orderId, writableReviewDto.orderId) &&
        Objects.equals(this.orderDate, writableReviewDto.orderDate) &&
        Objects.equals(this.itemName, writableReviewDto.itemName) &&
        Objects.equals(this.itemImagePath, writableReviewDto.itemImagePath) &&
        Objects.equals(this.itemId, writableReviewDto.itemId) &&
        Objects.equals(this.divisionType, writableReviewDto.divisionType) &&
        Objects.equals(this.completedOrderVendorItemId, writableReviewDto.completedOrderVendorItemId) &&
        Objects.equals(this.adventurerGroupDto, writableReviewDto.adventurerGroupDto) &&
        Objects.equals(this.adventurer, writableReviewDto.adventurer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, reviewId, rating, productId, orderId, orderDate, itemName, itemImagePath, itemId, divisionType, completedOrderVendorItemId, adventurerGroupDto, adventurer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WritableReviewDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
    sb.append("    adventurerGroupDto: ").append(toIndentedString(adventurerGroupDto)).append("\n");
    sb.append("    adventurer: ").append(toIndentedString(adventurer)).append("\n");
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

  public static WritableReviewDtoBuilder builder() {
    return new WritableReviewDtoBuilder();
  }

  public static class WritableReviewDtoBuilder {

    private Long vendorItemId = null;
    private Long reviewId = null;
    private Integer rating = null;
    private Long productId = null;
    private Long orderId = null;
    private String orderDate = null;
    private String itemName = null;
    private String itemImagePath = null;
    private Long itemId = null;
    private String divisionType = null;
    private Long completedOrderVendorItemId = null;
    private AdventurerGroupDto adventurerGroupDto = null;
    private Boolean adventurer = null;
    

    WritableReviewDtoBuilder() {
    }

    /**
     **/
    public WritableReviewDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder orderId(Long orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder orderDate(String orderDate) {
      this.orderDate = orderDate;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder completedOrderVendorItemId(Long completedOrderVendorItemId) {
      this.completedOrderVendorItemId = completedOrderVendorItemId;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder adventurerGroupDto(AdventurerGroupDto adventurerGroupDto) {
      this.adventurerGroupDto = adventurerGroupDto;
      return this;
    }

    /**
     **/
    public WritableReviewDtoBuilder adventurer(Boolean adventurer) {
      this.adventurer = adventurer;
      return this;
    }


    public WritableReviewDto build() {
      WritableReviewDto writableReviewDto = new WritableReviewDto();
      writableReviewDto.setVendorItemId(this.vendorItemId);
      writableReviewDto.setReviewId(this.reviewId);
      writableReviewDto.setRating(this.rating);
      writableReviewDto.setProductId(this.productId);
      writableReviewDto.setOrderId(this.orderId);
      writableReviewDto.setOrderDate(this.orderDate);
      writableReviewDto.setItemName(this.itemName);
      writableReviewDto.setItemImagePath(this.itemImagePath);
      writableReviewDto.setItemId(this.itemId);
      writableReviewDto.setDivisionType(this.divisionType);
      writableReviewDto.setCompletedOrderVendorItemId(this.completedOrderVendorItemId);
      writableReviewDto.setAdventurerGroupDto(this.adventurerGroupDto);
      writableReviewDto.setAdventurer(this.adventurer);
      return writableReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WritableReviewDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
      sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
      sb.append("    adventurerGroupDto: ").append(toIndentedString(adventurerGroupDto)).append("\n");
      sb.append("    adventurer: ").append(toIndentedString(adventurer)).append("\n");
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

