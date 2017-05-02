package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.catalog_compat_api.model.AttributeTypeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ProductAttributeTypeDtoWithCollapsible   {
  
  private Integer weight = null;
  private Boolean targetUnit = null;
  private Long productId = null;
  private Long productAttributeTypeId = null;
  private Boolean mandatory = null;
  private Boolean expose = null;
  private String displayType = null;


  public enum CollapsibleAttributeBelongToEnum {
    CATEGORY("CATEGORY"),
    PRODUCT("PRODUCT");

    private String value;

    CollapsibleAttributeBelongToEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private List<CollapsibleAttributeBelongToEnum> collapsibleAttributeBelongTo = new ArrayList<CollapsibleAttributeBelongToEnum>();
  private Boolean collapsible = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("collapsibleAttributeBelongTo")
  @com.fasterxml.jackson.annotation.JsonProperty("collapsibleAttributeBelongTo")
  public List<CollapsibleAttributeBelongToEnum> getCollapsibleAttributeBelongTo() {
    return collapsibleAttributeBelongTo;
  }
  
  /**
   **/
  public void setCollapsibleAttributeBelongTo(List<CollapsibleAttributeBelongToEnum> collapsibleAttributeBelongTo) {
    this.collapsibleAttributeBelongTo = collapsibleAttributeBelongTo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("collapsible")
  @com.fasterxml.jackson.annotation.JsonProperty("collapsible")
  public Boolean getCollapsible() {
    return collapsible;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCollapsible() {
    return collapsible == null ? false : collapsible;
  }
  
  /**
   **/
  public void setCollapsible(Boolean collapsible) {
    this.collapsible = collapsible;
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
    ProductAttributeTypeDtoWithCollapsible productAttributeTypeDtoWithCollapsible = (ProductAttributeTypeDtoWithCollapsible) o;
    return Objects.equals(this.weight, productAttributeTypeDtoWithCollapsible.weight) &&
        Objects.equals(this.targetUnit, productAttributeTypeDtoWithCollapsible.targetUnit) &&
        Objects.equals(this.productId, productAttributeTypeDtoWithCollapsible.productId) &&
        Objects.equals(this.productAttributeTypeId, productAttributeTypeDtoWithCollapsible.productAttributeTypeId) &&
        Objects.equals(this.mandatory, productAttributeTypeDtoWithCollapsible.mandatory) &&
        Objects.equals(this.expose, productAttributeTypeDtoWithCollapsible.expose) &&
        Objects.equals(this.displayType, productAttributeTypeDtoWithCollapsible.displayType) &&
        Objects.equals(this.collapsibleAttributeBelongTo, productAttributeTypeDtoWithCollapsible.collapsibleAttributeBelongTo) &&
        Objects.equals(this.collapsible, productAttributeTypeDtoWithCollapsible.collapsible) &&
        Objects.equals(this.attributeTypeId, productAttributeTypeDtoWithCollapsible.attributeTypeId) &&
        Objects.equals(this.attributeTypeDto, productAttributeTypeDtoWithCollapsible.attributeTypeDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, targetUnit, productId, productAttributeTypeId, mandatory, expose, displayType, collapsibleAttributeBelongTo, collapsible, attributeTypeId, attributeTypeDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAttributeTypeDtoWithCollapsible {\n");
    
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    targetUnit: ").append(toIndentedString(targetUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productAttributeTypeId: ").append(toIndentedString(productAttributeTypeId)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    collapsibleAttributeBelongTo: ").append(toIndentedString(collapsibleAttributeBelongTo)).append("\n");
    sb.append("    collapsible: ").append(toIndentedString(collapsible)).append("\n");
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

  public static ProductAttributeTypeDtoWithCollapsibleBuilder builder() {
    return new ProductAttributeTypeDtoWithCollapsibleBuilder();
  }

  public static class ProductAttributeTypeDtoWithCollapsibleBuilder {

    private Integer weight = null;
    private Boolean targetUnit = null;
    private Long productId = null;
    private Long productAttributeTypeId = null;
    private Boolean mandatory = null;
    private Boolean expose = null;
    private String displayType = null;
    private List<CollapsibleAttributeBelongToEnum> collapsibleAttributeBelongTo = new ArrayList<CollapsibleAttributeBelongToEnum>();
    private Boolean collapsible = null;
    private Long attributeTypeId = null;
    private AttributeTypeDto attributeTypeDto = null;
    

    ProductAttributeTypeDtoWithCollapsibleBuilder() {
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder weight(Integer weight) {
      this.weight = weight;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder targetUnit(Boolean targetUnit) {
      this.targetUnit = targetUnit;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder productAttributeTypeId(Long productAttributeTypeId) {
      this.productAttributeTypeId = productAttributeTypeId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder mandatory(Boolean mandatory) {
      this.mandatory = mandatory;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder expose(Boolean expose) {
      this.expose = expose;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder displayType(String displayType) {
      this.displayType = displayType;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder collapsibleAttributeBelongTo(List<CollapsibleAttributeBelongToEnum> collapsibleAttributeBelongTo) {
      this.collapsibleAttributeBelongTo = collapsibleAttributeBelongTo;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder collapsible(Boolean collapsible) {
      this.collapsible = collapsible;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder attributeTypeId(Long attributeTypeId) {
      this.attributeTypeId = attributeTypeId;
      return this;
    }

    /**
     **/
    public ProductAttributeTypeDtoWithCollapsibleBuilder attributeTypeDto(AttributeTypeDto attributeTypeDto) {
      this.attributeTypeDto = attributeTypeDto;
      return this;
    }


    public ProductAttributeTypeDtoWithCollapsible build() {
      ProductAttributeTypeDtoWithCollapsible productAttributeTypeDtoWithCollapsible = new ProductAttributeTypeDtoWithCollapsible();
      productAttributeTypeDtoWithCollapsible.setWeight(this.weight);
      productAttributeTypeDtoWithCollapsible.setTargetUnit(this.targetUnit);
      productAttributeTypeDtoWithCollapsible.setProductId(this.productId);
      productAttributeTypeDtoWithCollapsible.setProductAttributeTypeId(this.productAttributeTypeId);
      productAttributeTypeDtoWithCollapsible.setMandatory(this.mandatory);
      productAttributeTypeDtoWithCollapsible.setExpose(this.expose);
      productAttributeTypeDtoWithCollapsible.setDisplayType(this.displayType);
      productAttributeTypeDtoWithCollapsible.setCollapsibleAttributeBelongTo(this.collapsibleAttributeBelongTo);
      productAttributeTypeDtoWithCollapsible.setCollapsible(this.collapsible);
      productAttributeTypeDtoWithCollapsible.setAttributeTypeId(this.attributeTypeId);
      productAttributeTypeDtoWithCollapsible.setAttributeTypeDto(this.attributeTypeDto);
      return productAttributeTypeDtoWithCollapsible;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductAttributeTypeDtoWithCollapsibleBuilder {\n");
      
      sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
      sb.append("    targetUnit: ").append(toIndentedString(targetUnit)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    productAttributeTypeId: ").append(toIndentedString(productAttributeTypeId)).append("\n");
      sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
      sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
      sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
      sb.append("    collapsibleAttributeBelongTo: ").append(toIndentedString(collapsibleAttributeBelongTo)).append("\n");
      sb.append("    collapsible: ").append(toIndentedString(collapsible)).append("\n");
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

