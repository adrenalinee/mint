package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.catalog_compat_api.model.AttributeTypeDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ProductAttributeTypeDto   {
  
  private Integer weight = null;
  private Boolean targetUnit = null;
  private Long productId = null;
  private Long productAttributeTypeId = null;
  private Boolean mandatory = null;
  private Boolean expose = null;
  private String displayType = null;
  private Long attributeTypeId = null;
  private AttributeTypeDto attributeTypeDto = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("weight")
  @com.fasterxml.jackson.annotation.JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  
  /**
   **/
  public void setWeight(Integer weight) {
    this.weight = weight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("targetUnit")
  @com.fasterxml.jackson.annotation.JsonProperty("targetUnit")
  public Boolean getTargetUnit() {
    return targetUnit;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isTargetUnit() {
    return targetUnit == null ? false : targetUnit;
  }
  
  /**
   **/
  public void setTargetUnit(Boolean targetUnit) {
    this.targetUnit = targetUnit;
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
  @org.codehaus.jackson.annotate.JsonProperty("productAttributeTypeId")
  @com.fasterxml.jackson.annotation.JsonProperty("productAttributeTypeId")
  public Long getProductAttributeTypeId() {
    return productAttributeTypeId;
  }
  
  /**
   **/
  public void setProductAttributeTypeId(Long productAttributeTypeId) {
    this.productAttributeTypeId = productAttributeTypeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mandatory")
  @com.fasterxml.jackson.annotation.JsonProperty("mandatory")
  public Boolean getMandatory() {
    return mandatory;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isMandatory() {
    return mandatory == null ? false : mandatory;
  }
  
  /**
   **/
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("expose")
  @com.fasterxml.jackson.annotation.JsonProperty("expose")
  public Boolean getExpose() {
    return expose;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExpose() {
    return expose == null ? false : expose;
  }
  
  /**
   **/
  public void setExpose(Boolean expose) {
    this.expose = expose;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayType")
  @com.fasterxml.jackson.annotation.JsonProperty("displayType")
  public String getDisplayType() {
    return displayType;
  }
  
  /**
   **/
  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeId")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeId")
  public Long getAttributeTypeId() {
    return attributeTypeId;
  }
  
  /**
   **/
  public void setAttributeTypeId(Long attributeTypeId) {
    this.attributeTypeId = attributeTypeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeDto")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeDto")
  public AttributeTypeDto getAttributeTypeDto() {
    return attributeTypeDto;
  }
  
  /**
   **/
  public void setAttributeTypeDto(AttributeTypeDto attributeTypeDto) {
    this.attributeTypeDto = attributeTypeDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAttributeTypeDto productAttributeTypeDto = (ProductAttributeTypeDto) o;
    return Objects.equals(this.weight, productAttributeTypeDto.weight) &&
        Objects.equals(this.targetUnit, productAttributeTypeDto.targetUnit) &&
        Objects.equals(this.productId, productAttributeTypeDto.productId) &&
        Objects.equals(this.productAttributeTypeId, productAttributeTypeDto.productAttributeTypeId) &&
        Objects.equals(this.mandatory, productAttributeTypeDto.mandatory) &&
        Objects.equals(this.expose, productAttributeTypeDto.expose) &&
        Objects.equals(this.displayType, productAttributeTypeDto.displayType) &&
        Objects.equals(this.attributeTypeId, productAttributeTypeDto.attributeTypeId) &&
        Objects.equals(this.attributeTypeDto, productAttributeTypeDto.attributeTypeDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, targetUnit, productId, productAttributeTypeId, mandatory, expose, displayType, attributeTypeId, attributeTypeDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAttributeTypeDto {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    targetUnit: ").append(toIndentedString(targetUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productAttributeTypeId: ").append(toIndentedString(productAttributeTypeId)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
    sb.append("    attributeTypeDto: ").append(toIndentedString(attributeTypeDto)).append("\n");
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

  public static ProductAttributeTypeDtoBuilder builder() {
    return new ProductAttributeTypeDtoBuilder();
  }

  public static class ProductAttributeTypeDtoBuilder {

    private Integer weight = null;
    private Boolean targetUnit = null;
    private Long productId = null;
    private Long productAttributeTypeId = null;
    private Boolean mandatory = null;
    private Boolean expose = null;
    private String displayType = null;
    private Long attributeTypeId = null;
    private AttributeTypeDto attributeTypeDto = null;
    

    ProductAttributeTypeDtoBuilder() {
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder weight(Integer weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder targetUnit(Boolean targetUnit) {
      this.targetUnit = targetUnit;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder productAttributeTypeId(Long productAttributeTypeId) {
      this.productAttributeTypeId = productAttributeTypeId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder mandatory(Boolean mandatory) {
      this.mandatory = mandatory;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder expose(Boolean expose) {
      this.expose = expose;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder displayType(String displayType) {
      this.displayType = displayType;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder attributeTypeId(Long attributeTypeId) {
      this.attributeTypeId = attributeTypeId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoBuilder attributeTypeDto(AttributeTypeDto attributeTypeDto) {
      this.attributeTypeDto = attributeTypeDto;
      return this;
    }


    public ProductAttributeTypeDto build() {
      ProductAttributeTypeDto productAttributeTypeDto = new ProductAttributeTypeDto();
      productAttributeTypeDto.setWeight(this.weight);
      productAttributeTypeDto.setTargetUnit(this.targetUnit);
      productAttributeTypeDto.setProductId(this.productId);
      productAttributeTypeDto.setProductAttributeTypeId(this.productAttributeTypeId);
      productAttributeTypeDto.setMandatory(this.mandatory);
      productAttributeTypeDto.setExpose(this.expose);
      productAttributeTypeDto.setDisplayType(this.displayType);
      productAttributeTypeDto.setAttributeTypeId(this.attributeTypeId);
      productAttributeTypeDto.setAttributeTypeDto(this.attributeTypeDto);
      return productAttributeTypeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductAttributeTypeDtoBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    targetUnit: ").append(toIndentedString(targetUnit)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    productAttributeTypeId: ").append(toIndentedString(productAttributeTypeId)).append("\n");
      sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
      sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
      sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
      sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
      sb.append("    attributeTypeDto: ").append(toIndentedString(attributeTypeDto)).append("\n");
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

