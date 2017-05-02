package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayItemCategoryDto   {
  
  private String usageType = null;
  private String status = null;
  private Long parentId = null;
  private Integer ordering = null;
  private String name = null;
  private Long displayItemCategoryId = null;
  private Long displayItemCategoryCode = null;
  private String categoryPath = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("usageType")
  @com.fasterxml.jackson.annotation.JsonProperty("usageType")
  public String getUsageType() {
    return usageType;
  }
  
  /**
   **/
  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public String getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(String status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("parentId")
  @com.fasterxml.jackson.annotation.JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  
  /**
   **/
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayItemCategoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("displayItemCategoryId")
  public Long getDisplayItemCategoryId() {
    return displayItemCategoryId;
  }
  
  /**
   **/
  public void setDisplayItemCategoryId(Long displayItemCategoryId) {
    this.displayItemCategoryId = displayItemCategoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayItemCategoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("displayItemCategoryCode")
  public Long getDisplayItemCategoryCode() {
    return displayItemCategoryCode;
  }
  
  /**
   **/
  public void setDisplayItemCategoryCode(Long displayItemCategoryCode) {
    this.displayItemCategoryCode = displayItemCategoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryPath")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryPath")
  public String getCategoryPath() {
    return categoryPath;
  }
  
  /**
   **/
  public void setCategoryPath(String categoryPath) {
    this.categoryPath = categoryPath;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayItemCategoryDto displayItemCategoryDto = (DisplayItemCategoryDto) o;
    return Objects.equals(this.usageType, displayItemCategoryDto.usageType) &&
        Objects.equals(this.status, displayItemCategoryDto.status) &&
        Objects.equals(this.parentId, displayItemCategoryDto.parentId) &&
        Objects.equals(this.ordering, displayItemCategoryDto.ordering) &&
        Objects.equals(this.name, displayItemCategoryDto.name) &&
        Objects.equals(this.displayItemCategoryId, displayItemCategoryDto.displayItemCategoryId) &&
        Objects.equals(this.displayItemCategoryCode, displayItemCategoryDto.displayItemCategoryCode) &&
        Objects.equals(this.categoryPath, displayItemCategoryDto.categoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageType, status, parentId, ordering, name, displayItemCategoryId, displayItemCategoryCode, categoryPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayItemCategoryDto {\n");
    
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayItemCategoryId: ").append(toIndentedString(displayItemCategoryId)).append("\n");
    sb.append("    displayItemCategoryCode: ").append(toIndentedString(displayItemCategoryCode)).append("\n");
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
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

  public static DisplayItemCategoryDtoBuilder builder() {
    return new DisplayItemCategoryDtoBuilder();
  }

  public static class DisplayItemCategoryDtoBuilder {

    private String usageType = null;
    private String status = null;
    private Long parentId = null;
    private Integer ordering = null;
    private String name = null;
    private Long displayItemCategoryId = null;
    private Long displayItemCategoryCode = null;
    private String categoryPath = null;
    

    DisplayItemCategoryDtoBuilder() {
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder usageType(String usageType) {
      this.usageType = usageType;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder status(String status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder parentId(Long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder displayItemCategoryId(Long displayItemCategoryId) {
      this.displayItemCategoryId = displayItemCategoryId;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder displayItemCategoryCode(Long displayItemCategoryCode) {
      this.displayItemCategoryCode = displayItemCategoryCode;
      return this;
    }

    /**
     **/
    public DisplayItemCategoryDtoBuilder categoryPath(String categoryPath) {
      this.categoryPath = categoryPath;
      return this;
    }


    public DisplayItemCategoryDto build() {
      DisplayItemCategoryDto displayItemCategoryDto = new DisplayItemCategoryDto();
      displayItemCategoryDto.setUsageType(this.usageType);
      displayItemCategoryDto.setStatus(this.status);
      displayItemCategoryDto.setParentId(this.parentId);
      displayItemCategoryDto.setOrdering(this.ordering);
      displayItemCategoryDto.setName(this.name);
      displayItemCategoryDto.setDisplayItemCategoryId(this.displayItemCategoryId);
      displayItemCategoryDto.setDisplayItemCategoryCode(this.displayItemCategoryCode);
      displayItemCategoryDto.setCategoryPath(this.categoryPath);
      return displayItemCategoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayItemCategoryDtoBuilder {\n");
      
      sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    displayItemCategoryId: ").append(toIndentedString(displayItemCategoryId)).append("\n");
      sb.append("    displayItemCategoryCode: ").append(toIndentedString(displayItemCategoryCode)).append("\n");
      sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
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

