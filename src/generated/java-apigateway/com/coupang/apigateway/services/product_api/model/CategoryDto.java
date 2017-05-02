package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CategoryDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CategoryDto   {
  
  private Boolean valid = null;
  private Boolean risky = null;
  private CategoryDto parentCategory = null;
  private String name = null;
  private Boolean exceptFreeDelivery = null;
  private String divisionType = null;
  private Integer depth = null;
  private Long categoryId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("risky")
  @com.fasterxml.jackson.annotation.JsonProperty("risky")
  public Boolean getRisky() {
    return risky;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRisky() {
    return risky == null ? false : risky;
  }
  
  /**
   **/
  public void setRisky(Boolean risky) {
    this.risky = risky;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parentCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("parentCategory")
  public CategoryDto getParentCategory() {
    return parentCategory;
  }
  
  /**
   **/
  public void setParentCategory(CategoryDto parentCategory) {
    this.parentCategory = parentCategory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exceptFreeDelivery")
  @com.fasterxml.jackson.annotation.JsonProperty("exceptFreeDelivery")
  public Boolean getExceptFreeDelivery() {
    return exceptFreeDelivery;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExceptFreeDelivery() {
    return exceptFreeDelivery == null ? false : exceptFreeDelivery;
  }
  
  /**
   **/
  public void setExceptFreeDelivery(Boolean exceptFreeDelivery) {
    this.exceptFreeDelivery = exceptFreeDelivery;
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
  @org.codehaus.jackson.annotate.JsonProperty("depth")
  @com.fasterxml.jackson.annotation.JsonProperty("depth")
  public Integer getDepth() {
    return depth;
  }
  
  /**
   **/
  public void setDepth(Integer depth) {
    this.depth = depth;
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
    CategoryDto categoryDto = (CategoryDto) o;
    return Objects.equals(this.valid, categoryDto.valid) &&
        Objects.equals(this.risky, categoryDto.risky) &&
        Objects.equals(this.parentCategory, categoryDto.parentCategory) &&
        Objects.equals(this.name, categoryDto.name) &&
        Objects.equals(this.exceptFreeDelivery, categoryDto.exceptFreeDelivery) &&
        Objects.equals(this.divisionType, categoryDto.divisionType) &&
        Objects.equals(this.depth, categoryDto.depth) &&
        Objects.equals(this.categoryId, categoryDto.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, risky, parentCategory, name, exceptFreeDelivery, divisionType, depth, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exceptFreeDelivery: ").append(toIndentedString(exceptFreeDelivery)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

  public static CategoryDtoBuilder builder() {
    return new CategoryDtoBuilder();
  }

  public static class CategoryDtoBuilder {

    private Boolean valid = null;
    private Boolean risky = null;
    private CategoryDto parentCategory = null;
    private String name = null;
    private Boolean exceptFreeDelivery = null;
    private String divisionType = null;
    private Integer depth = null;
    private Long categoryId = null;
    

    CategoryDtoBuilder() {
    }

    /**
     **/
    public CategoryDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder risky(Boolean risky) {
      this.risky = risky;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder parentCategory(CategoryDto parentCategory) {
      this.parentCategory = parentCategory;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder exceptFreeDelivery(Boolean exceptFreeDelivery) {
      this.exceptFreeDelivery = exceptFreeDelivery;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder depth(Integer depth) {
      this.depth = depth;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    public CategoryDto build() {
      CategoryDto categoryDto = new CategoryDto();
      categoryDto.setValid(this.valid);
      categoryDto.setRisky(this.risky);
      categoryDto.setParentCategory(this.parentCategory);
      categoryDto.setName(this.name);
      categoryDto.setExceptFreeDelivery(this.exceptFreeDelivery);
      categoryDto.setDivisionType(this.divisionType);
      categoryDto.setDepth(this.depth);
      categoryDto.setCategoryId(this.categoryId);
      return categoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CategoryDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
      sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    exceptFreeDelivery: ").append(toIndentedString(exceptFreeDelivery)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

