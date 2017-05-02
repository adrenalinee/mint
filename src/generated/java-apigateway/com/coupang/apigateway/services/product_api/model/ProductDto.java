package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.ProductAttributeTypeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class ProductDto   {
  
  private Boolean valid = null;
  private Integer unitPriceBasis = null;
  private List<String> tag = new ArrayList<String>();
  private Long representAttributeTypeId = null;
  private Long quantityAttributeTypeId = null;
  private Long productId = null;
  private List<ProductAttributeTypeDto> productAttributeTypes = new ArrayList<ProductAttributeTypeDto>();
  private String name = null;
  private String manufacture = null;
  private Boolean expose = null;
  private String divisionType = null;
  private List<Long> displayCategoryCodes = new ArrayList<Long>();
  private String description = null;
  private String cleansing = null;
  private Long categoryId = null;
  private Boolean bundled = null;
  private String brand = null;
  private String baseUnit = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("unitPriceBasis")
  @com.fasterxml.jackson.annotation.JsonProperty("unitPriceBasis")
  public Integer getUnitPriceBasis() {
    return unitPriceBasis;
  }
  
  /**
   **/
  public void setUnitPriceBasis(Integer unitPriceBasis) {
    this.unitPriceBasis = unitPriceBasis;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("tag")
  @com.fasterxml.jackson.annotation.JsonProperty("tag")
  public List<String> getTag() {
    return tag;
  }
  
  /**
   **/
  public void setTag(List<String> tag) {
    this.tag = tag;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representAttributeTypeId")
  @com.fasterxml.jackson.annotation.JsonProperty("representAttributeTypeId")
  public Long getRepresentAttributeTypeId() {
    return representAttributeTypeId;
  }
  
  /**
   **/
  public void setRepresentAttributeTypeId(Long representAttributeTypeId) {
    this.representAttributeTypeId = representAttributeTypeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("quantityAttributeTypeId")
  @com.fasterxml.jackson.annotation.JsonProperty("quantityAttributeTypeId")
  public Long getQuantityAttributeTypeId() {
    return quantityAttributeTypeId;
  }
  
  /**
   **/
  public void setQuantityAttributeTypeId(Long quantityAttributeTypeId) {
    this.quantityAttributeTypeId = quantityAttributeTypeId;
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
  @org.codehaus.jackson.annotate.JsonProperty("productAttributeTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("productAttributeTypes")
  public List<ProductAttributeTypeDto> getProductAttributeTypes() {
    return productAttributeTypes;
  }
  
  /**
   **/
  public void setProductAttributeTypes(List<ProductAttributeTypeDto> productAttributeTypes) {
    this.productAttributeTypes = productAttributeTypes;
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
  @org.codehaus.jackson.annotate.JsonProperty("manufacture")
  @com.fasterxml.jackson.annotation.JsonProperty("manufacture")
  public String getManufacture() {
    return manufacture;
  }
  
  /**
   **/
  public void setManufacture(String manufacture) {
    this.manufacture = manufacture;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayCategoryCodes")
  @com.fasterxml.jackson.annotation.JsonProperty("displayCategoryCodes")
  public List<Long> getDisplayCategoryCodes() {
    return displayCategoryCodes;
  }
  
  /**
   **/
  public void setDisplayCategoryCodes(List<Long> displayCategoryCodes) {
    this.displayCategoryCodes = displayCategoryCodes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cleansing")
  @com.fasterxml.jackson.annotation.JsonProperty("cleansing")
  public String getCleansing() {
    return cleansing;
  }
  
  /**
   **/
  public void setCleansing(String cleansing) {
    this.cleansing = cleansing;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bundled")
  @com.fasterxml.jackson.annotation.JsonProperty("bundled")
  public Boolean getBundled() {
    return bundled;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBundled() {
    return bundled == null ? false : bundled;
  }
  
  /**
   **/
  public void setBundled(Boolean bundled) {
    this.bundled = bundled;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("brand")
  @com.fasterxml.jackson.annotation.JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  
  /**
   **/
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("baseUnit")
  @com.fasterxml.jackson.annotation.JsonProperty("baseUnit")
  public String getBaseUnit() {
    return baseUnit;
  }
  
  /**
   **/
  public void setBaseUnit(String baseUnit) {
    this.baseUnit = baseUnit;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDto productDto = (ProductDto) o;
    return Objects.equals(this.valid, productDto.valid) &&
        Objects.equals(this.unitPriceBasis, productDto.unitPriceBasis) &&
        Objects.equals(this.tag, productDto.tag) &&
        Objects.equals(this.representAttributeTypeId, productDto.representAttributeTypeId) &&
        Objects.equals(this.quantityAttributeTypeId, productDto.quantityAttributeTypeId) &&
        Objects.equals(this.productId, productDto.productId) &&
        Objects.equals(this.productAttributeTypes, productDto.productAttributeTypes) &&
        Objects.equals(this.name, productDto.name) &&
        Objects.equals(this.manufacture, productDto.manufacture) &&
        Objects.equals(this.expose, productDto.expose) &&
        Objects.equals(this.divisionType, productDto.divisionType) &&
        Objects.equals(this.displayCategoryCodes, productDto.displayCategoryCodes) &&
        Objects.equals(this.description, productDto.description) &&
        Objects.equals(this.cleansing, productDto.cleansing) &&
        Objects.equals(this.categoryId, productDto.categoryId) &&
        Objects.equals(this.bundled, productDto.bundled) &&
        Objects.equals(this.brand, productDto.brand) &&
        Objects.equals(this.baseUnit, productDto.baseUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, unitPriceBasis, tag, representAttributeTypeId, quantityAttributeTypeId, productId, productAttributeTypes, name, manufacture, expose, divisionType, displayCategoryCodes, description, cleansing, categoryId, bundled, brand, baseUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    representAttributeTypeId: ").append(toIndentedString(representAttributeTypeId)).append("\n");
    sb.append("    quantityAttributeTypeId: ").append(toIndentedString(quantityAttributeTypeId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productAttributeTypes: ").append(toIndentedString(productAttributeTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
    sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cleansing: ").append(toIndentedString(cleansing)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    baseUnit: ").append(toIndentedString(baseUnit)).append("\n");
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

  public static ProductDtoBuilder builder() {
    return new ProductDtoBuilder();
  }

  public static class ProductDtoBuilder {

    private Boolean valid = null;
    private Integer unitPriceBasis = null;
    private List<String> tag = new ArrayList<String>();
    private Long representAttributeTypeId = null;
    private Long quantityAttributeTypeId = null;
    private Long productId = null;
    private List<ProductAttributeTypeDto> productAttributeTypes = new ArrayList<ProductAttributeTypeDto>();
    private String name = null;
    private String manufacture = null;
    private Boolean expose = null;
    private String divisionType = null;
    private List<Long> displayCategoryCodes = new ArrayList<Long>();
    private String description = null;
    private String cleansing = null;
    private Long categoryId = null;
    private Boolean bundled = null;
    private String brand = null;
    private String baseUnit = null;
    

    ProductDtoBuilder() {
    }

    /**
     **/
    public ProductDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder unitPriceBasis(Integer unitPriceBasis) {
      this.unitPriceBasis = unitPriceBasis;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder tag(List<String> tag) {
      this.tag = tag;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder representAttributeTypeId(Long representAttributeTypeId) {
      this.representAttributeTypeId = representAttributeTypeId;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder quantityAttributeTypeId(Long quantityAttributeTypeId) {
      this.quantityAttributeTypeId = quantityAttributeTypeId;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder productAttributeTypes(List<ProductAttributeTypeDto> productAttributeTypes) {
      this.productAttributeTypes = productAttributeTypes;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder manufacture(String manufacture) {
      this.manufacture = manufacture;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder expose(Boolean expose) {
      this.expose = expose;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder divisionType(String divisionType) {
      this.divisionType = divisionType;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder displayCategoryCodes(List<Long> displayCategoryCodes) {
      this.displayCategoryCodes = displayCategoryCodes;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder cleansing(String cleansing) {
      this.cleansing = cleansing;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder bundled(Boolean bundled) {
      this.bundled = bundled;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder brand(String brand) {
      this.brand = brand;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder baseUnit(String baseUnit) {
      this.baseUnit = baseUnit;
      return this;
    }


    public ProductDto build() {
      ProductDto productDto = new ProductDto();
      productDto.setValid(this.valid);
      productDto.setUnitPriceBasis(this.unitPriceBasis);
      productDto.setTag(this.tag);
      productDto.setRepresentAttributeTypeId(this.representAttributeTypeId);
      productDto.setQuantityAttributeTypeId(this.quantityAttributeTypeId);
      productDto.setProductId(this.productId);
      productDto.setProductAttributeTypes(this.productAttributeTypes);
      productDto.setName(this.name);
      productDto.setManufacture(this.manufacture);
      productDto.setExpose(this.expose);
      productDto.setDivisionType(this.divisionType);
      productDto.setDisplayCategoryCodes(this.displayCategoryCodes);
      productDto.setDescription(this.description);
      productDto.setCleansing(this.cleansing);
      productDto.setCategoryId(this.categoryId);
      productDto.setBundled(this.bundled);
      productDto.setBrand(this.brand);
      productDto.setBaseUnit(this.baseUnit);
      return productDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    unitPriceBasis: ").append(toIndentedString(unitPriceBasis)).append("\n");
      sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
      sb.append("    representAttributeTypeId: ").append(toIndentedString(representAttributeTypeId)).append("\n");
      sb.append("    quantityAttributeTypeId: ").append(toIndentedString(quantityAttributeTypeId)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    productAttributeTypes: ").append(toIndentedString(productAttributeTypes)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    manufacture: ").append(toIndentedString(manufacture)).append("\n");
      sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
      sb.append("    divisionType: ").append(toIndentedString(divisionType)).append("\n");
      sb.append("    displayCategoryCodes: ").append(toIndentedString(displayCategoryCodes)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    cleansing: ").append(toIndentedString(cleansing)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
      sb.append("    bundled: ").append(toIndentedString(bundled)).append("\n");
      sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
      sb.append("    baseUnit: ").append(toIndentedString(baseUnit)).append("\n");
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

