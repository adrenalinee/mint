package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerProductDto   {
  
  private String vendorItemName = null;
  private Long vendorItemId = null;


  public enum ProductSaleRoleTypeEnum {
    PRODUCT("PRODUCT"),
    VENDORITEM("VENDORITEM");

    private String value;

    ProductSaleRoleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ProductSaleRoleTypeEnum productSaleRoleType = null;
  private String productName = null;
  private Long productId = null;
  private Long price = null;
  private String originItemImagePath = null;
  private Integer maxIssueCount = null;
  private String itemImagePath = null;
  private Integer issueCount = null;
  private Boolean issuable = null;
  private Long adventurerProductId = null;
  private Long adventurerId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemName")
  public String getVendorItemName() {
    return vendorItemName;
  }
  
  /**
   **/
  public void setVendorItemName(String vendorItemName) {
    this.vendorItemName = vendorItemName;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("productSaleRoleType")
  @com.fasterxml.jackson.annotation.JsonProperty("productSaleRoleType")
  public ProductSaleRoleTypeEnum getProductSaleRoleType() {
    return productSaleRoleType;
  }
  
  /**
   **/
  public void setProductSaleRoleType(ProductSaleRoleTypeEnum productSaleRoleType) {
    this.productSaleRoleType = productSaleRoleType;
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
  @org.codehaus.jackson.annotate.JsonProperty("price")
  @com.fasterxml.jackson.annotation.JsonProperty("price")
  public Long getPrice() {
    return price;
  }
  
  /**
   **/
  public void setPrice(Long price) {
    this.price = price;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originItemImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("originItemImagePath")
  public String getOriginItemImagePath() {
    return originItemImagePath;
  }
  
  /**
   **/
  public void setOriginItemImagePath(String originItemImagePath) {
    this.originItemImagePath = originItemImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxIssueCount")
  @com.fasterxml.jackson.annotation.JsonProperty("maxIssueCount")
  public Integer getMaxIssueCount() {
    return maxIssueCount;
  }
  
  /**
   **/
  public void setMaxIssueCount(Integer maxIssueCount) {
    this.maxIssueCount = maxIssueCount;
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
  @org.codehaus.jackson.annotate.JsonProperty("issueCount")
  @com.fasterxml.jackson.annotation.JsonProperty("issueCount")
  public Integer getIssueCount() {
    return issueCount;
  }
  
  /**
   **/
  public void setIssueCount(Integer issueCount) {
    this.issueCount = issueCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("issuable")
  @com.fasterxml.jackson.annotation.JsonProperty("issuable")
  public Boolean getIssuable() {
    return issuable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIssuable() {
    return issuable == null ? false : issuable;
  }
  
  /**
   **/
  public void setIssuable(Boolean issuable) {
    this.issuable = issuable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerProductId")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerProductId")
  public Long getAdventurerProductId() {
    return adventurerProductId;
  }
  
  /**
   **/
  public void setAdventurerProductId(Long adventurerProductId) {
    this.adventurerProductId = adventurerProductId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerId")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerId")
  public Long getAdventurerId() {
    return adventurerId;
  }
  
  /**
   **/
  public void setAdventurerId(Long adventurerId) {
    this.adventurerId = adventurerId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdventurerProductDto adventurerProductDto = (AdventurerProductDto) o;
    return Objects.equals(this.vendorItemName, adventurerProductDto.vendorItemName) &&
        Objects.equals(this.vendorItemId, adventurerProductDto.vendorItemId) &&
        Objects.equals(this.productSaleRoleType, adventurerProductDto.productSaleRoleType) &&
        Objects.equals(this.productName, adventurerProductDto.productName) &&
        Objects.equals(this.productId, adventurerProductDto.productId) &&
        Objects.equals(this.price, adventurerProductDto.price) &&
        Objects.equals(this.originItemImagePath, adventurerProductDto.originItemImagePath) &&
        Objects.equals(this.maxIssueCount, adventurerProductDto.maxIssueCount) &&
        Objects.equals(this.itemImagePath, adventurerProductDto.itemImagePath) &&
        Objects.equals(this.issueCount, adventurerProductDto.issueCount) &&
        Objects.equals(this.issuable, adventurerProductDto.issuable) &&
        Objects.equals(this.adventurerProductId, adventurerProductDto.adventurerProductId) &&
        Objects.equals(this.adventurerId, adventurerProductDto.adventurerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemName, vendorItemId, productSaleRoleType, productName, productId, price, originItemImagePath, maxIssueCount, itemImagePath, issueCount, issuable, adventurerProductId, adventurerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerProductDto {\n");
    
    sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    productSaleRoleType: ").append(toIndentedString(productSaleRoleType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    originItemImagePath: ").append(toIndentedString(originItemImagePath)).append("\n");
    sb.append("    maxIssueCount: ").append(toIndentedString(maxIssueCount)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    issuable: ").append(toIndentedString(issuable)).append("\n");
    sb.append("    adventurerProductId: ").append(toIndentedString(adventurerProductId)).append("\n");
    sb.append("    adventurerId: ").append(toIndentedString(adventurerId)).append("\n");
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

  public static AdventurerProductDtoBuilder builder() {
    return new AdventurerProductDtoBuilder();
  }

  public static class AdventurerProductDtoBuilder {

    private String vendorItemName = null;
    private Long vendorItemId = null;
    private ProductSaleRoleTypeEnum productSaleRoleType = null;
    private String productName = null;
    private Long productId = null;
    private Long price = null;
    private String originItemImagePath = null;
    private Integer maxIssueCount = null;
    private String itemImagePath = null;
    private Integer issueCount = null;
    private Boolean issuable = null;
    private Long adventurerProductId = null;
    private Long adventurerId = null;
    

    AdventurerProductDtoBuilder() {
    }

    /**
     **/
    public AdventurerProductDtoBuilder vendorItemName(String vendorItemName) {
      this.vendorItemName = vendorItemName;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder productSaleRoleType(ProductSaleRoleTypeEnum productSaleRoleType) {
      this.productSaleRoleType = productSaleRoleType;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder price(Long price) {
      this.price = price;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder originItemImagePath(String originItemImagePath) {
      this.originItemImagePath = originItemImagePath;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder maxIssueCount(Integer maxIssueCount) {
      this.maxIssueCount = maxIssueCount;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder issueCount(Integer issueCount) {
      this.issueCount = issueCount;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder issuable(Boolean issuable) {
      this.issuable = issuable;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder adventurerProductId(Long adventurerProductId) {
      this.adventurerProductId = adventurerProductId;
      return this;
    }

    /**
     **/
    public AdventurerProductDtoBuilder adventurerId(Long adventurerId) {
      this.adventurerId = adventurerId;
      return this;
    }


    public AdventurerProductDto build() {
      AdventurerProductDto adventurerProductDto = new AdventurerProductDto();
      adventurerProductDto.setVendorItemName(this.vendorItemName);
      adventurerProductDto.setVendorItemId(this.vendorItemId);
      adventurerProductDto.setProductSaleRoleType(this.productSaleRoleType);
      adventurerProductDto.setProductName(this.productName);
      adventurerProductDto.setProductId(this.productId);
      adventurerProductDto.setPrice(this.price);
      adventurerProductDto.setOriginItemImagePath(this.originItemImagePath);
      adventurerProductDto.setMaxIssueCount(this.maxIssueCount);
      adventurerProductDto.setItemImagePath(this.itemImagePath);
      adventurerProductDto.setIssueCount(this.issueCount);
      adventurerProductDto.setIssuable(this.issuable);
      adventurerProductDto.setAdventurerProductId(this.adventurerProductId);
      adventurerProductDto.setAdventurerId(this.adventurerId);
      return adventurerProductDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerProductDtoBuilder {\n");
      
      sb.append("    vendorItemName: ").append(toIndentedString(vendorItemName)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    productSaleRoleType: ").append(toIndentedString(productSaleRoleType)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    price: ").append(toIndentedString(price)).append("\n");
      sb.append("    originItemImagePath: ").append(toIndentedString(originItemImagePath)).append("\n");
      sb.append("    maxIssueCount: ").append(toIndentedString(maxIssueCount)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
      sb.append("    issuable: ").append(toIndentedString(issuable)).append("\n");
      sb.append("    adventurerProductId: ").append(toIndentedString(adventurerProductId)).append("\n");
      sb.append("    adventurerId: ").append(toIndentedString(adventurerId)).append("\n");
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

