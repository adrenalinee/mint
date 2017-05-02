package com.coupang.apigateway.services.catalog_compat_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.107+09:00")
public class ItemAttributeDto   {
  
  private java.math.BigDecimal unitConversionValue = null;
  private String unit = null;
  private Long itemAttributeId = null;
  private Long attributeValueWeight = null;
  private String attributeValueName = null;
  private Long attributeValueId = null;
  private String attributeValueDivisionType = null;
  private String attributeValueDescription = null;
  private String attributeTypeUnitGroup = null;
  private String attributeTypeName = null;
  private Long attributeTypeId = null;
  private String attributeTypeDivisionType = null;
  private String attributeTypeDescription = null;
  private String attributeTypeDataType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unitConversionValue")
  @com.fasterxml.jackson.annotation.JsonProperty("unitConversionValue")
  public java.math.BigDecimal getUnitConversionValue() {
    return unitConversionValue;
  }
  
  /**
   **/
  public void setUnitConversionValue(java.math.BigDecimal unitConversionValue) {
    this.unitConversionValue = unitConversionValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("unit")
  @com.fasterxml.jackson.annotation.JsonProperty("unit")
  public String getUnit() {
    return unit;
  }
  
  /**
   **/
  public void setUnit(String unit) {
    this.unit = unit;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemAttributeId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemAttributeId")
  public Long getItemAttributeId() {
    return itemAttributeId;
  }
  
  /**
   **/
  public void setItemAttributeId(Long itemAttributeId) {
    this.itemAttributeId = itemAttributeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValueWeight")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValueWeight")
  public Long getAttributeValueWeight() {
    return attributeValueWeight;
  }
  
  /**
   **/
  public void setAttributeValueWeight(Long attributeValueWeight) {
    this.attributeValueWeight = attributeValueWeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValueName")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValueName")
  public String getAttributeValueName() {
    return attributeValueName;
  }
  
  /**
   **/
  public void setAttributeValueName(String attributeValueName) {
    this.attributeValueName = attributeValueName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValueId")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValueId")
  public Long getAttributeValueId() {
    return attributeValueId;
  }
  
  /**
   **/
  public void setAttributeValueId(Long attributeValueId) {
    this.attributeValueId = attributeValueId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValueDivisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValueDivisionType")
  public String getAttributeValueDivisionType() {
    return attributeValueDivisionType;
  }
  
  /**
   **/
  public void setAttributeValueDivisionType(String attributeValueDivisionType) {
    this.attributeValueDivisionType = attributeValueDivisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeValueDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeValueDescription")
  public String getAttributeValueDescription() {
    return attributeValueDescription;
  }
  
  /**
   **/
  public void setAttributeValueDescription(String attributeValueDescription) {
    this.attributeValueDescription = attributeValueDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeUnitGroup")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeUnitGroup")
  public String getAttributeTypeUnitGroup() {
    return attributeTypeUnitGroup;
  }
  
  /**
   **/
  public void setAttributeTypeUnitGroup(String attributeTypeUnitGroup) {
    this.attributeTypeUnitGroup = attributeTypeUnitGroup;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeName")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeName")
  public String getAttributeTypeName() {
    return attributeTypeName;
  }
  
  /**
   **/
  public void setAttributeTypeName(String attributeTypeName) {
    this.attributeTypeName = attributeTypeName;
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
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeDivisionType")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeDivisionType")
  public String getAttributeTypeDivisionType() {
    return attributeTypeDivisionType;
  }
  
  /**
   **/
  public void setAttributeTypeDivisionType(String attributeTypeDivisionType) {
    this.attributeTypeDivisionType = attributeTypeDivisionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeDescription")
  public String getAttributeTypeDescription() {
    return attributeTypeDescription;
  }
  
  /**
   **/
  public void setAttributeTypeDescription(String attributeTypeDescription) {
    this.attributeTypeDescription = attributeTypeDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeTypeDataType")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeTypeDataType")
  public String getAttributeTypeDataType() {
    return attributeTypeDataType;
  }
  
  /**
   **/
  public void setAttributeTypeDataType(String attributeTypeDataType) {
    this.attributeTypeDataType = attributeTypeDataType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAttributeDto itemAttributeDto = (ItemAttributeDto) o;
    return Objects.equals(this.unitConversionValue, itemAttributeDto.unitConversionValue) &&
        Objects.equals(this.unit, itemAttributeDto.unit) &&
        Objects.equals(this.itemAttributeId, itemAttributeDto.itemAttributeId) &&
        Objects.equals(this.attributeValueWeight, itemAttributeDto.attributeValueWeight) &&
        Objects.equals(this.attributeValueName, itemAttributeDto.attributeValueName) &&
        Objects.equals(this.attributeValueId, itemAttributeDto.attributeValueId) &&
        Objects.equals(this.attributeValueDivisionType, itemAttributeDto.attributeValueDivisionType) &&
        Objects.equals(this.attributeValueDescription, itemAttributeDto.attributeValueDescription) &&
        Objects.equals(this.attributeTypeUnitGroup, itemAttributeDto.attributeTypeUnitGroup) &&
        Objects.equals(this.attributeTypeName, itemAttributeDto.attributeTypeName) &&
        Objects.equals(this.attributeTypeId, itemAttributeDto.attributeTypeId) &&
        Objects.equals(this.attributeTypeDivisionType, itemAttributeDto.attributeTypeDivisionType) &&
        Objects.equals(this.attributeTypeDescription, itemAttributeDto.attributeTypeDescription) &&
        Objects.equals(this.attributeTypeDataType, itemAttributeDto.attributeTypeDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitConversionValue, unit, itemAttributeId, attributeValueWeight, attributeValueName, attributeValueId, attributeValueDivisionType, attributeValueDescription, attributeTypeUnitGroup, attributeTypeName, attributeTypeId, attributeTypeDivisionType, attributeTypeDescription, attributeTypeDataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributeDto {\n");
    
    sb.append("    unitConversionValue: ").append(toIndentedString(unitConversionValue)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    itemAttributeId: ").append(toIndentedString(itemAttributeId)).append("\n");
    sb.append("    attributeValueWeight: ").append(toIndentedString(attributeValueWeight)).append("\n");
    sb.append("    attributeValueName: ").append(toIndentedString(attributeValueName)).append("\n");
    sb.append("    attributeValueId: ").append(toIndentedString(attributeValueId)).append("\n");
    sb.append("    attributeValueDivisionType: ").append(toIndentedString(attributeValueDivisionType)).append("\n");
    sb.append("    attributeValueDescription: ").append(toIndentedString(attributeValueDescription)).append("\n");
    sb.append("    attributeTypeUnitGroup: ").append(toIndentedString(attributeTypeUnitGroup)).append("\n");
    sb.append("    attributeTypeName: ").append(toIndentedString(attributeTypeName)).append("\n");
    sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
    sb.append("    attributeTypeDivisionType: ").append(toIndentedString(attributeTypeDivisionType)).append("\n");
    sb.append("    attributeTypeDescription: ").append(toIndentedString(attributeTypeDescription)).append("\n");
    sb.append("    attributeTypeDataType: ").append(toIndentedString(attributeTypeDataType)).append("\n");
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

  public static ItemAttributeDtoBuilder builder() {
    return new ItemAttributeDtoBuilder();
  }

  public static class ItemAttributeDtoBuilder {

    private java.math.BigDecimal unitConversionValue = null;
    private String unit = null;
    private Long itemAttributeId = null;
    private Long attributeValueWeight = null;
    private String attributeValueName = null;
    private Long attributeValueId = null;
    private String attributeValueDivisionType = null;
    private String attributeValueDescription = null;
    private String attributeTypeUnitGroup = null;
    private String attributeTypeName = null;
    private Long attributeTypeId = null;
    private String attributeTypeDivisionType = null;
    private String attributeTypeDescription = null;
    private String attributeTypeDataType = null;
    

    ItemAttributeDtoBuilder() {
    }

    /**
     **/
    public ItemAttributeDtoBuilder unitConversionValue(java.math.BigDecimal unitConversionValue) {
      this.unitConversionValue = unitConversionValue;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder unit(String unit) {
      this.unit = unit;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder itemAttributeId(Long itemAttributeId) {
      this.itemAttributeId = itemAttributeId;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeValueWeight(Long attributeValueWeight) {
      this.attributeValueWeight = attributeValueWeight;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeValueName(String attributeValueName) {
      this.attributeValueName = attributeValueName;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeValueId(Long attributeValueId) {
      this.attributeValueId = attributeValueId;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeValueDivisionType(String attributeValueDivisionType) {
      this.attributeValueDivisionType = attributeValueDivisionType;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeValueDescription(String attributeValueDescription) {
      this.attributeValueDescription = attributeValueDescription;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeUnitGroup(String attributeTypeUnitGroup) {
      this.attributeTypeUnitGroup = attributeTypeUnitGroup;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeName(String attributeTypeName) {
      this.attributeTypeName = attributeTypeName;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeId(Long attributeTypeId) {
      this.attributeTypeId = attributeTypeId;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeDivisionType(String attributeTypeDivisionType) {
      this.attributeTypeDivisionType = attributeTypeDivisionType;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeDescription(String attributeTypeDescription) {
      this.attributeTypeDescription = attributeTypeDescription;
      return this;
    }

    /**
     **/
    public ItemAttributeDtoBuilder attributeTypeDataType(String attributeTypeDataType) {
      this.attributeTypeDataType = attributeTypeDataType;
      return this;
    }


    public ItemAttributeDto build() {
      ItemAttributeDto itemAttributeDto = new ItemAttributeDto();
      itemAttributeDto.setUnitConversionValue(this.unitConversionValue);
      itemAttributeDto.setUnit(this.unit);
      itemAttributeDto.setItemAttributeId(this.itemAttributeId);
      itemAttributeDto.setAttributeValueWeight(this.attributeValueWeight);
      itemAttributeDto.setAttributeValueName(this.attributeValueName);
      itemAttributeDto.setAttributeValueId(this.attributeValueId);
      itemAttributeDto.setAttributeValueDivisionType(this.attributeValueDivisionType);
      itemAttributeDto.setAttributeValueDescription(this.attributeValueDescription);
      itemAttributeDto.setAttributeTypeUnitGroup(this.attributeTypeUnitGroup);
      itemAttributeDto.setAttributeTypeName(this.attributeTypeName);
      itemAttributeDto.setAttributeTypeId(this.attributeTypeId);
      itemAttributeDto.setAttributeTypeDivisionType(this.attributeTypeDivisionType);
      itemAttributeDto.setAttributeTypeDescription(this.attributeTypeDescription);
      itemAttributeDto.setAttributeTypeDataType(this.attributeTypeDataType);
      return itemAttributeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ItemAttributeDtoBuilder {\n");
      
      sb.append("    unitConversionValue: ").append(toIndentedString(unitConversionValue)).append("\n");
      sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
      sb.append("    itemAttributeId: ").append(toIndentedString(itemAttributeId)).append("\n");
      sb.append("    attributeValueWeight: ").append(toIndentedString(attributeValueWeight)).append("\n");
      sb.append("    attributeValueName: ").append(toIndentedString(attributeValueName)).append("\n");
      sb.append("    attributeValueId: ").append(toIndentedString(attributeValueId)).append("\n");
      sb.append("    attributeValueDivisionType: ").append(toIndentedString(attributeValueDivisionType)).append("\n");
      sb.append("    attributeValueDescription: ").append(toIndentedString(attributeValueDescription)).append("\n");
      sb.append("    attributeTypeUnitGroup: ").append(toIndentedString(attributeTypeUnitGroup)).append("\n");
      sb.append("    attributeTypeName: ").append(toIndentedString(attributeTypeName)).append("\n");
      sb.append("    attributeTypeId: ").append(toIndentedString(attributeTypeId)).append("\n");
      sb.append("    attributeTypeDivisionType: ").append(toIndentedString(attributeTypeDivisionType)).append("\n");
      sb.append("    attributeTypeDescription: ").append(toIndentedString(attributeTypeDescription)).append("\n");
      sb.append("    attributeTypeDataType: ").append(toIndentedString(attributeTypeDataType)).append("\n");
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

